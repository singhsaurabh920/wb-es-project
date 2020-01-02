package org.worldbuild.es.controller.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RootController<T> {
	
	@RequestMapping("/save")
	public  abstract  T create(T t, HttpServletRequest requ, HttpServletResponse resp);
	
	@RequestMapping("/update")
	public  abstract  T update(T t, HttpServletRequest req,  HttpServletResponse resp);
	
	@RequestMapping("/detail/list")
	public  abstract  List<T> detailList( HttpServletRequest requ, HttpServletResponse resp);

}
