package com.mapbox.maps;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m65681d2 = {"applyDefaultParams", "Lcom/mapbox/maps/MapOptions$Builder;", "context", "Landroid/content/Context;", "pixelRatio", "", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapInitOptionsKt {
    public static final MapOptions.Builder applyDefaultParams(MapOptions.Builder builder, Context context) {
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return applyDefaultParams(builder, context.getResources().getDisplayMetrics().density);
    }

    public static final MapOptions.Builder applyDefaultParams(MapOptions.Builder builder, float f13) {
        AbstractC22676k.m65750j(builder, "<this>");
        builder.glyphsRasterizationOptions(new GlyphsRasterizationOptions.Builder().rasterizationMode(GlyphsRasterizationMode.IDEOGRAPHS_RASTERIZED_LOCALLY).fontFamily(FontUtils.INSTANCE.extractValidFont(null)).build());
        builder.pixelRatio(f13);
        builder.constrainMode(ConstrainMode.HEIGHT_ONLY);
        builder.contextMode(ContextMode.UNIQUE);
        builder.orientation(NorthOrientation.UPWARDS);
        builder.viewportMode(ViewportMode.DEFAULT);
        builder.crossSourceCollisions(Boolean.TRUE);
        return builder;
    }
}
