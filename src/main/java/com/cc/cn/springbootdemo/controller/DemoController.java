package com.cc.cn.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Model;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author qingyan.guo
 * @version V1.0
 * @date 2018/8/31 11:02
 */
@RestController
@Api(description = "Demo相关接口描述")
public class DemoController {

	@GetMapping("/get")
	@ApiOperation(value = "查", notes = "查")
	public String get() {
		return "成功";
	}

	@PostMapping("/create")
	@ApiOperation(value = "增", notes = "增")
	public String create(@RequestBody Model model) {
		return "成功";
	}

	@PutMapping("/modify")
	@ApiOperation(value = "改", notes = "改")
	public String modify(@RequestBody Model model) {
		return "成功";
	}

	@DeleteMapping("/remove")
	@ApiOperation(value = "删", notes = "根据id删除")
	public String remove(@RequestParam("id") String id) {
		return "成功";
	}

	class model {
		private String id;
		private String username;
		private String password;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
}
