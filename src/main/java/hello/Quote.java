package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//  annotated with @JsonIgnoreProperties from the Jackson JSON processing library to indicate that any properties not bound in this type should be ignored.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	// In order to directly bind data to custom types, you need to specify the variable name exact same as the key in the JSON Document returned from the API. In case the variable name and key in JSON doc are not matching, you need to use @JsonProperty annotation to specify the exact key of JSON document.
	private String type;
	private Value value;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote{" + "type='" + '\'' + ", value="
				+ value + '}';
	}
	
}
