package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ImportPosition implements Serializable {
    private final String above;

    /* JADX INFO: renamed from: at */
    private final Integer f21948at;
    private final String below;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImportPosition(String str, String str2, Integer num) {
        this.above = str;
        this.below = str2;
        this.f21948at = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImportPosition.class != obj.getClass()) {
            return false;
        }
        ImportPosition importPosition = (ImportPosition) obj;
        return Objects.equals(this.above, importPosition.above) && Objects.equals(this.below, importPosition.below) && Objects.equals(this.f21948at, importPosition.f21948at);
    }

    public String getAbove() {
        return this.above;
    }

    public Integer getAt() {
        return this.f21948at;
    }

    public String getBelow() {
        return this.below;
    }

    public int hashCode() {
        return Objects.hash(this.above, this.below, this.f21948at);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[above: ");
        AbstractC3855a.m11838v(this.above, ", below: ", sb4);
        AbstractC3855a.m11838v(this.below, ", at: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.f21948at));
        sb4.append("]");
        return sb4.toString();
    }
}
