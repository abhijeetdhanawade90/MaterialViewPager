package com.github.florent37.materialviewpager.header;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

/**
 * Created by florentchampigny on 10/06/15.
 */
public class HeaderDesign {
    protected int color;
    protected int colorRes;
    protected String imageUrl;
    protected Drawable drawable;

    private HeaderDesign() {
    }

    public static HeaderDesign fromColorAndUrl(@ColorInt int color, String imageUrl) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.color = color;
        headerDesign.imageUrl = imageUrl;
        return headerDesign;
    }

    public static HeaderDesign fromColorResAndUrl(@ColorRes int colorRes, String imageUrl) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.colorRes = colorRes;
        headerDesign.imageUrl = imageUrl;
        return headerDesign;
    }

    public static HeaderDesign fromColorAndDrawable(@ColorInt int color, Drawable drawable) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.drawable = drawable;
        headerDesign.color = color;
        return headerDesign;
    }

    public static HeaderDesign fromColorResAndDrawable(@ColorRes int colorRes, Drawable drawable) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.colorRes = colorRes;
        headerDesign.drawable = drawable;
        return headerDesign;
    }
    
     public static HeaderDesign fromColorAndIconUrl(@ColorInt int color, String headerIconUrl, String imageUrl, boolean isInitializing) {
        HeaderDesign headerDesign = new HeaderDesign();
        headerDesign.headerColor = color;
        headerDesign.headerIconUrl = headerIconUrl;
        headerDesign.imageUrl = imageUrl;
        headerDesign.isInitializing = isInitializing;
        return headerDesign;
     }

    public int getHeaderColor() {
        return headerColor;
    }

    public String getHeaderIconUrl() {
        return headerIconUrl;
    }

    public boolean isInitializing() {
        return isInitializing;
    }

    public int getColor() {
        return color;
    }

    public int getColorRes() {
        return colorRes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Drawable getDrawable() {
        return drawable;
    }
}
