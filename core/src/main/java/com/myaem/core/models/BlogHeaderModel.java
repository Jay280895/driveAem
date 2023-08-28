package com.myaem.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogHeaderModel {

    @ValueMapValue
    private String headerName;

    @ValueMapValue
    private String headerLogoImage;

    @ValueMapValue
    private String menuNameA;

    @ValueMapValue
    private String menuNameB;

    @ValueMapValue
    private String menuLinkA;

    @ValueMapValue
    private String menuLinkB;

    public String getHeaderName() {
        return headerName;
    }

    public String getHeaderLogoImage() {
        return headerLogoImage;
    }

    public String getMenuNameA() {
        return menuNameA;
    }

    public String getMenuNameB() {
        return menuNameB;
    }

    public String getMenuLinkA() {
        return menuLinkA;
    }

    public String getMenuLinkB() {
        return menuLinkB;
    }
}
