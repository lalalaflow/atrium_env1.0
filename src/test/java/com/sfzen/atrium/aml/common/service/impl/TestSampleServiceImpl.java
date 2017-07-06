package com.sfzen.atrium.aml.common.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.sfzen.atrium.aml.common.service.SampleService;
import com.sfzen.atrium.aml.common.service.impl.SampleServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestSampleServiceImpl{

	private SampleService mockSampleService;
	
	@Before
	public void init(){
		setSampleService(mock(SampleServiceImpl.class));
	}
	
	@Test
	public void testReturnString() {
		String statement = "This is Atrium RBA 2.0.";
		
		when(getSampleService().returnString(statement)).thenReturn(statement);
		
		String returned = getSampleService().returnString(statement);
		assertEquals(returned, statement);
	}
	
	@Test
	public void testPrintWorkAreas(){
		
		ArrayList<String> dataAreas = new ArrayList<String>();
		dataAreas.add("은행");
		dataAreas.add("생보");
		dataAreas.add("손보");
		dataAreas.add("외은지점");
		
		
		when(getSampleService().printWorkAreas()).thenReturn(dataAreas);
		
		assertThat(getSampleService().printWorkAreas().size(), is(4));
	}

	public SampleService getSampleService() {
		return mockSampleService;
	}

	public void setSampleService(SampleService sampleService) {
		this.mockSampleService = sampleService;
	}

	
	
}
