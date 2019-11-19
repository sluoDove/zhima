package com.zyt.zhima.util;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

public class JsonFormatter extends JsonFormatters {

    public static <T> T toObjectByType(String json, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(json, valueTypeRef);
    }

    public static <T> T toObjectByType(byte[] src, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(src, valueTypeRef);
    }

    public static <T> T toObjectByType(File file, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(file, valueTypeRef);
    }

    public static <T> T toObjectByType(InputStream input, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(input, valueTypeRef);
    }

    public static <T> T toObjectByType(Reader reader, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(reader, valueTypeRef);
    }

    public static <T> T toObjectByType(URL url, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(url, valueTypeRef);
    }

    public static <T> T toObjectByType(String json, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(json, valueTypeRef);
    }

    public static <T> T toObjectByType(byte[] src, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(src, valueTypeRef);
    }

    public static <T> T toObjectByType(File file, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(file, valueTypeRef);
    }

    public static <T> T toObjectByType(InputStream input, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(input, valueTypeRef);
    }

    public static <T> T toObjectByType(Reader reader, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(reader, valueTypeRef);
    }

    public static <T> T toObjectByType(URL url, TypeReference<T> valueTypeRef, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(url, valueTypeRef);
    }

    public static <T> T toBean(String json, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(json, clazz);
    }

    public static <T> T toBean(byte[] src, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(src, clazz);
    }

    public static <T> T toBean(File file, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(file, clazz);
    }

    public static <T> T toBean(InputStream input, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(input, clazz);
    }

    public static <T> T toBean(Reader reader, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(reader, clazz);
    }

    public static <T> T toBean(URL url, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(true).readValue(url, clazz);
    }

    public static <T> T toBean(String json, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(json, clazz);
    }

    public static <T> T toBean(byte[] src, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(src, clazz);
    }

    public static <T> T toBean(File file, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(file, clazz);
    }

    public static <T> T toBean(InputStream input, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(input, clazz);
    }

    public static <T> T toBean(Reader reader, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(reader, clazz);
    }

    public static <T> T toBean(URL url, Class<T> clazz, boolean serializeNull) throws JsonParseException, JsonMappingException, IOException {
        return getMapper(serializeNull).readValue(url, clazz);
    }

}
