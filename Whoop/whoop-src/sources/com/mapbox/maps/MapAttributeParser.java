package com.mapbox.maps;

import android.content.res.TypedArray;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/maps/MapAttributeParser;", "", "()V", "CONSTRAIN_MODE_HEIGHT_ONLY", "", "IDEOGRAPHS_RASTERIZED_LOCALLY", "NO_GLYPHS_RASTERIZED_LOCALLY", "parseMapOptions", "Lcom/mapbox/maps/MapOptions;", "attrs", "Landroid/content/res/TypedArray;", "pixelRatio", "", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapAttributeParser {
    private static final int CONSTRAIN_MODE_HEIGHT_ONLY = 1;
    private static final int IDEOGRAPHS_RASTERIZED_LOCALLY = 1;
    public static final MapAttributeParser INSTANCE = new MapAttributeParser();
    private static final int NO_GLYPHS_RASTERIZED_LOCALLY = 0;

    private MapAttributeParser() {
    }

    public static /* synthetic */ MapOptions parseMapOptions$default(MapAttributeParser mapAttributeParser, TypedArray typedArray, float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 1.0f;
        }
        return mapAttributeParser.parseMapOptions(typedArray, f13);
    }

    public final MapOptions parseMapOptions(TypedArray attrs, float pixelRatio) {
        AbstractC22676k.m65750j(attrs, "attrs");
        int i13 = attrs.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapContextMode, 0);
        int i14 = attrs.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapConstrainMode, 1);
        int i15 = attrs.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapOrientation, 0);
        int i16 = attrs.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapGlyphRasterizationMode, 1);
        MapOptions mapOptionsBuild = new MapOptions.Builder().contextMode(ContextMode.values()[i13]).constrainMode(ConstrainMode.values()[i14]).viewportMode(ViewportMode.values()[attrs.getInt(C5489R.styleable.mapbox_MapView_mapbox_mapViewportMode, 0)]).orientation(NorthOrientation.values()[i15]).crossSourceCollisions(Boolean.valueOf(attrs.getBoolean(C5489R.styleable.mapbox_MapView_mapbox_mapCrossSourceCollisionsEnabled, true))).pixelRatio(attrs.getFloat(C5489R.styleable.mapbox_MapView_mapbox_mapPixelRatio, pixelRatio)).glyphsRasterizationOptions(new GlyphsRasterizationOptions.Builder().rasterizationMode(GlyphsRasterizationMode.values()[i16]).fontFamily(i16 != 0 ? FontUtils.INSTANCE.extractValidFont(attrs.getString(C5489R.styleable.mapbox_MapView_mapbox_mapFontFamily)) : null).build()).build();
        AbstractC22676k.m65749i(mapOptionsBuild, "Builder()\n      .context…()\n      )\n      .build()");
        return mapOptionsBuild;
    }
}
