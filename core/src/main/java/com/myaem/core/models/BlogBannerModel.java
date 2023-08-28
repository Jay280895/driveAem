package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogBannerModel {
    @ValueMapValue
    private String bannerAltName;

    @ValueMapValue
    private String bannerImage;

    @ValueMapValue
    private Boolean isBannerShow;

    public String getBannerAltName() {
        return bannerAltName;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public Boolean getBannerShow() {
        return isBannerShow;
    }
}
