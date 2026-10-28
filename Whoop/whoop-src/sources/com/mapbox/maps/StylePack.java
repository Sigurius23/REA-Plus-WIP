package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class StylePack implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final long requiredResourceCount;
    private final String styleURI;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePack(String str, GlyphsRasterizationMode glyphsRasterizationMode, long j7, long j13, long j14, Date date, Value value) {
        this.styleURI = str;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.requiredResourceCount = j7;
        this.completedResourceCount = j13;
        this.completedResourceSize = j14;
        this.expires = date;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePack.class != obj.getClass()) {
            return false;
        }
        StylePack stylePack = (StylePack) obj;
        return Objects.equals(this.styleURI, stylePack.styleURI) && Objects.equals(this.glyphsRasterizationMode, stylePack.glyphsRasterizationMode) && this.requiredResourceCount == stylePack.requiredResourceCount && this.completedResourceCount == stylePack.completedResourceCount && this.completedResourceSize == stylePack.completedResourceSize && Objects.equals(this.expires, stylePack.expires) && Objects.equals(this.extraData, stylePack.extraData);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, this.glyphsRasterizationMode, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[styleURI: ");
        AbstractC3855a.m11838v(this.styleURI, ", glyphsRasterizationMode: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb4.append(", requiredResourceCount: ");
        AbstractC3855a.m11836t(this.requiredResourceCount, ", completedResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceCount, ", completedResourceSize: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceSize, ", expires: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.expires));
        sb4.append(", extraData: ");
        sb4.append(RecordUtils.fieldToString(this.extraData));
        sb4.append("]");
        return sb4.toString();
    }
}
