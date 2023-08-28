package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import com.myaem.core.models.pojo.BlogsLists;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogListModel {
    @ChildResource
    private List<BlogsLists> blogListing;

    public List<BlogsLists> getBlogListing() {
        return blogListing;
    }
}
