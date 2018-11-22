package com.yc.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Configuration
public class JacksonConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    	FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    	FastJsonConfig fastJsonConfig = new FastJsonConfig();
    	fastJsonConfig.setSerializerFeatures(SerializerFeature.QuoteFieldNames,
    			SerializerFeature.WriteEnumUsingToString,
    			SerializerFeature.WriteMapNullValue,
    			SerializerFeature.WriteDateUseDateFormat,
    			SerializerFeature.DisableCircularReferenceDetect);
    	fastJsonConfig.setSerializeFilters((ValueFilter) (o, s, source) -> {
    		if (source == null) {
    			return "";
    		}
    		if (source instanceof Date) {
    			return ((Date) source).getTime();
    		}
    		return source;
    	});
    	//处理中文乱码问题
    	List<MediaType> fastMediaTypes = new ArrayList<>();
    	fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    	fastConverter.setSupportedMediaTypes(fastMediaTypes);
    	fastConverter.setFastJsonConfig(fastJsonConfig);
    	converters.add(fastConverter);
    }
    
    @SuppressWarnings("deprecation")
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/img/**").addResourceLocations("file:D:/file/");
		super.addResourceHandlers(registry);
	 }
}