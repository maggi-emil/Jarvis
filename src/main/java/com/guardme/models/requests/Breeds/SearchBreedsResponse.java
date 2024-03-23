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

public class SearchBreedsResponse {

	@JsonProperty("suppressed_tail")
	private int suppressedTail;

	@JsonProperty("wikipedia_url")
	private String wikipediaUrl;

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("description")
	private String description;

	@JsonProperty("experimental")
	private int experimental;

	@JsonProperty("life_span")
	private String lifeSpan;

	@JsonProperty("cfa_url")
	private String cfaUrl;

	@JsonProperty("rare")
	private int rare;

	@JsonProperty("country_codes")
	private String countryCodes;

	@JsonProperty("lap")
	private int lap;

	@JsonProperty("id")
	private String id;

	@JsonProperty("short_legs")
	private int shortLegs;

	@JsonProperty("shedding_level")
	private int sheddingLevel;

	@JsonProperty("image")
	private Image image;

	@JsonProperty("dog_friendly")
	private int dogFriendly;

	@JsonProperty("natural")
	private int natural;

	@JsonProperty("rex")
	private int rex;

	@JsonProperty("health_issues")
	private int healthIssues;

	@JsonProperty("hairless")
	private int hairless;

	@JsonProperty("weight")
	private Weight weight;

	@JsonProperty("alt_names")
	private String altNames;

	@JsonProperty("adaptability")
	private int adaptability;

	@JsonProperty("vocalisation")
	private int vocalisation;

	@JsonProperty("intelligence")
	private int intelligence;

	@JsonProperty("social_needs")
	private int socialNeeds;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("child_friendly")
	private int childFriendly;

	@JsonProperty("vcahospitals_url")
	private String vcahospitalsUrl;

	@JsonProperty("temperament")
	private String temperament;

	@JsonProperty("name")
	private String name;

	@JsonProperty("vetstreet_url")
	private String vetstreetUrl;

	@JsonProperty("grooming")
	private int grooming;

	@JsonProperty("hypoallergenic")
	private int hypoallergenic;

	@JsonProperty("indoor")
	private int indoor;

	@JsonProperty("energy_level")
	private int energyLevel;

	@JsonProperty("stranger_friendly")
	private int strangerFriendly;

	@JsonProperty("reference_image_id")
	private String referenceImageId;

	@JsonProperty("affection_level")
	private int affectionLevel;

	@JsonProperty("cat_friendly")
	private int catFriendly;

	@JsonProperty("bidability")
	private int bidability;

}