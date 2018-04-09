package org.impactit.rssfeedparser;

/**
 * Created by Bikram Koju on 4/9/18.
 * ImpactIT
 * info@impactit.org
 */
public class RssFeedModel {
    public String title;
    public String link;
    public String description;

    public RssFeedModel(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }

}
