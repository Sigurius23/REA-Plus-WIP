package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class GlyphsRasterizationOptions implements Serializable {
    private final String fontFamily;
    private final GlyphsRasterizationMode rasterizationMode;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private String fontFamily;
        private GlyphsRasterizationMode rasterizationMode;

        public GlyphsRasterizationOptions build() {
            if (this.rasterizationMode != null) {
                return new GlyphsRasterizationOptions(this.rasterizationMode, this.fontFamily);
            }
            throw new NullPointerException("rasterizationMode shouldn't be null");
        }

        public Builder fontFamily(String str) {
            this.fontFamily = str;
            return this;
        }

        public Builder rasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.rasterizationMode = glyphsRasterizationMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GlyphsRasterizationOptions.class != obj.getClass()) {
            return false;
        }
        GlyphsRasterizationOptions glyphsRasterizationOptions = (GlyphsRasterizationOptions) obj;
        return Objects.equals(this.rasterizationMode, glyphsRasterizationOptions.rasterizationMode) && Objects.equals(this.fontFamily, glyphsRasterizationOptions.fontFamily);
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public GlyphsRasterizationMode getRasterizationMode() {
        return this.rasterizationMode;
    }

    public int hashCode() {
        return Objects.hash(this.rasterizationMode, this.fontFamily);
    }

    public Builder toBuilder() {
        return new Builder().rasterizationMode(this.rasterizationMode).fontFamily(this.fontFamily);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[rasterizationMode: ");
        sb4.append(RecordUtils.fieldToString(this.rasterizationMode));
        sb4.append(", fontFamily: ");
        return AbstractC3855a.m11826j(this.fontFamily, "]", sb4);
    }

    private GlyphsRasterizationOptions(GlyphsRasterizationMode glyphsRasterizationMode, String str) {
        this.rasterizationMode = glyphsRasterizationMode;
        this.fontFamily = str;
    }
}
