/**
 * Copyright © 2018 RSKT. All rights reserved. 
 */
package com.rskt.spring.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class:LoginController.java<br>
 *
 * Class Summary：<br>
 * 
 * Class Feature:<br>
 *
 * @Author SHIJIELI
 * @CreateDate 2018-09-29
 *
 */
@RestController
public class LoginController {

	@RequestMapping("/login")
	public String hello() {
	    return "Hello World";
	}
}
