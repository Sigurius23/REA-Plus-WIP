package com.mapbox.maps.debugoptions;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m65681d2 = {"Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "", "name", "", "(Ljava/lang/String;)V", "getName$maps_sdk_release", "()Ljava/lang/String;", "component1", "component1$maps_sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class MapViewDebugOptions {
    private final String name;
    public static final MapViewDebugOptions TILE_BORDERS = new MapViewDebugOptions("TILE_BORDERS");
    public static final MapViewDebugOptions PARSE_STATUS = new MapViewDebugOptions("PARSE_STATUS");
    public static final MapViewDebugOptions TIMESTAMPS = new MapViewDebugOptions("TIMESTAMPS");
    public static final MapViewDebugOptions COLLISION = new MapViewDebugOptions("COLLISION");
    public static final MapViewDebugOptions OVERDRAW = new MapViewDebugOptions("OVERDRAW");
    public static final MapViewDebugOptions STENCIL_CLIP = new MapViewDebugOptions("STENCIL_CLIP");
    public static final MapViewDebugOptions DEPTH_BUFFER = new MapViewDebugOptions("DEPTH_BUFFER");
    public static final MapViewDebugOptions MODEL_BOUNDS = new MapViewDebugOptions("MODEL_BOUNDS");
    public static final MapViewDebugOptions TERRAIN_WIREFRAME = new MapViewDebugOptions("TERRAIN_WIREFRAME");
    public static final MapViewDebugOptions LAYERS2_DWIREFRAME = new MapViewDebugOptions("LAYERS2_DWIREFRAME");
    public static final MapViewDebugOptions LAYERS3_DWIREFRAME = new MapViewDebugOptions("LAYERS3_DWIREFRAME");
    public static final MapViewDebugOptions LIGHT = new MapViewDebugOptions("LIGHT");
    public static final MapViewDebugOptions CAMERA = new MapViewDebugOptions("CAMERA");
    public static final MapViewDebugOptions PADDING = new MapViewDebugOptions("PADDING");

    public MapViewDebugOptions(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.name = name;
    }

    public static /* synthetic */ MapViewDebugOptions copy$default(MapViewDebugOptions mapViewDebugOptions, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mapViewDebugOptions.name;
        }
        return mapViewDebugOptions.copy(str);
    }

    /* JADX INFO: renamed from: component1$maps_sdk_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final MapViewDebugOptions copy(String name) {
        AbstractC22676k.m65750j(name, "name");
        return new MapViewDebugOptions(name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapViewDebugOptions) && AbstractC22676k.m65745e(this.name, ((MapViewDebugOptions) other).name);
    }

    public final String getName$maps_sdk_release() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("MapViewDebugOptions(name="), this.name, ')');
    }
}
