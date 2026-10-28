package com.mapbox.maps;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m65681d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/MapRecorderOptions$Builder;", "Ll83/a0;", "block", "Lcom/mapbox/maps/MapRecorderOptions;", "mapRecorderOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/MapRecorderOptions;", "Lcom/mapbox/maps/MapPlayerOptions$Builder;", "Lcom/mapbox/maps/MapPlayerOptions;", "mapPlayerOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/MapPlayerOptions;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxMapRecorderKt {
    public static final MapPlayerOptions mapPlayerOptions(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        MapPlayerOptions.Builder builder = new MapPlayerOptions.Builder();
        block.invoke(builder);
        MapPlayerOptions mapPlayerOptions = builder.build();
        AbstractC22676k.m65749i(mapPlayerOptions, "mapPlayerOptions");
        return mapPlayerOptions;
    }

    public static final MapRecorderOptions mapRecorderOptions(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        MapRecorderOptions.Builder builder = new MapRecorderOptions.Builder();
        block.invoke(builder);
        MapRecorderOptions mapRecorderOptionsBuild = builder.build();
        AbstractC22676k.m65749i(mapRecorderOptionsBuild, "Builder().apply(block).build()");
        return mapRecorderOptionsBuild;
    }
}
