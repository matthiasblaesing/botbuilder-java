/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of Activities that conforms to the Transcript schema.
 */
public class Transcript {
    /**
     * List of members in this conversation.
     */
    @JsonProperty(value = "activities")
    private List<Activity> activities;

    /**
     * Gets collection of Activities that conforms to the Transcript schema.
     *
     * @return the activities value
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Sets collection of Activities that conforms to the Transcript schema.
     *
     * @param activities the activities value to set
     * @return the Transcript object itself.
     */
    public Transcript withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }
}