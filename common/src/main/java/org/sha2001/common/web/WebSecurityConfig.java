package org.sha2001.common.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	private AuthenticationSuccessHandler successHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/", "/home")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
			.successHandler(successHandler)
				.loginPage("/login").permitAll().and()
				.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login").permitAll();
	}


	@Autowired
	public void configAuthentification(AuthenticationManagerBuilder auth) throws Exception {
		
		StringBuilder roleQuery = new StringBuilder();
		roleQuery.append("SELECT "); 
		roleQuery.append("common.role.role, common.userinfo.active, common.userinfo.password, common.userinfo.username "); 
		roleQuery.append("FROM common.role "); 
		roleQuery.append("INNER JOIN common.userrole ON common.role.id = common.userrole.roleid "); 
		roleQuery.append("INNER JOIN common.userinfo ON common.userrole.userid = common.userinfo.id ");
		roleQuery.append(" WHERE common.userinfo.username = ?");
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select username, password, active from common.userinfo where username = ?")
			.authoritiesByUsernameQuery(roleQuery.toString());
	}
}
