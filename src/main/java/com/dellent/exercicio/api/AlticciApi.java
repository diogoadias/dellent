package com.dellent.exercicio.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;





public interface AlticciApi {
	@Operation(summary = "Generate a Alticci sequence")
	@ApiResponses(value={
		@ApiResponse(responseCode = "200", description = "Sequence executed")
	})	
	@GetMapping(value = "/alticci/{n}", produces="application/json")
	public List<Integer> alticciSequence(@ApiParam(value = "Insert an integer number to generate a sequence") @PathVariable Integer n);

}
