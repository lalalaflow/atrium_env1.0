package com.sfzen.atrium.aml.mapper.common;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;


public interface SampleMapper {
	
	public String getWorkArea(@Param("code") String code);
	
	public ArrayList<String> getWorkAreas();

}
