package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Date;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogPageHeadingModel {
    @ValueMapValue
    private String heading;

    @ValueMapValue
    private Date datePicker;

    @ValueMapValue
    private String writerName;

    public String getHeading() {
        return heading;
    }

    public Date getDatePicker() {
        return datePicker;
    }

    public String getWriterName() {
        return writerName;
    }
}
