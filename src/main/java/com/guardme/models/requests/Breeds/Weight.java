package com.guardme.models.requests.Breeds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Weight{

	@JsonProperty("metric")
	private String metric;

	@JsonProperty("imperial")
	private String imperial;


}