package de.apkgrabber.model.APKMirror;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class AppExistsResponseDeveloper
{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("link")
    @Expose
    private String link;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getName(
    ) {
        return name;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setName(
        String name
    ) {
        this.name = name;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getLink(
    ) {
        return link;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setLink(
        String link
    ) {
        this.link = link;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
