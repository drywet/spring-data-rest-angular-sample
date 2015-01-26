package com.programmingfree.springservice;

import com.programmingfree.springservice.data.entities.Category;
import com.programmingfree.springservice.data.entities.Subcategory;
import com.programmingfree.springservice.data.entities.Video;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class MegaConfig extends RepositoryRestMvcConfiguration {

    /*@Override protected void configureJacksonObjectMapper(ObjectMapper objectMapper) {
        objectMapper.registerModule(new SimpleModule("Subcategory"){
            @Override public void setupModule(SetupContext context) {
                *//*context.addAbstractTypeResolver(
                        new SimpleAbstractTypeResolver().addMapping(Category.class, Category.class)
                );*//*
                *//*this.addSerializer(HalResource.class, new HalResourceSerializer());
                this.addDeserializer(HalResource.class, new HalResourceDeserializer());
                context.addSerializers();*//*
                SimpleSerializers serializers = new SimpleSerializers();
                SimpleDeserializers deserializers = new SimpleDeserializers();

                serializers.addSerializer(HalResource.class, new HalResourceSerializer());
                deserializers.addDeserializer(HalResource.class, new HalResourceDeserializer());

                context.addSerializers(serializers);
                context.addDeserializers(deserializers);
            }
        });
    }*/

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(Subcategory.class);
        config.exposeIdsFor(Video.class);
        //config.js
        //config.setDefaultMediaType(MediaType.APPLICATION_JSON);
    }


}
