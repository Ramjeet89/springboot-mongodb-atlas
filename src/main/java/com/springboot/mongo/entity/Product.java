package com.springboot.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "products")
public class Product {

    @Id
    private int id;
    private String appName;
    private Date created;
    private String creatorId;
    private String description;
    private Date endTime;
    private String experimentType;
    private String hypothesisIsCorrect;
    private boolean isPersonalized;
    private boolean isRapidExperiment;
    private String label;
    private String modelName;
    private String modelVersion;
    private Date modified;
    private String payloadType;
    private String results;
    private String rule;
    private double samplePercent;
    private String sourceUrl;
    private Date startTime;
    private String state;
    private Set<String> tags;
    private int userCap;

}
