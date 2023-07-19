package com.erabia.aldawaaeprescriptioneasyorder.adapters;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class LocalDateTimeGsonAdapter implements JsonDeserializer<LocalDateTime> {

	@Override
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		String dateAsString = json.getAsString(); 
		return LocalDateTime.parse(dateAsString);
	}

}
