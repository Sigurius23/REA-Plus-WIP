package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiStateKey;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "key", "", "(Ljava/lang/String;)V", "Companion", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StandardPoiStateKey extends FeatureStateKey<StandardPoiState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StandardPoiStateKey HIDE = new StandardPoiStateKey("hide");

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiStateKey$Companion;", "", "()V", "HIDE", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiStateKey;", "getHIDE", "()Lcom/mapbox/maps/interactions/standard/generated/StandardPoiStateKey;", "create", "key", "", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @MapboxDelicateApi
        public final StandardPoiStateKey create(String key) {
            AbstractC22676k.m65750j(key, "key");
            return new StandardPoiStateKey(key, null);
        }

        public final StandardPoiStateKey getHIDE() {
            return StandardPoiStateKey.HIDE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StandardPoiStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private StandardPoiStateKey(String str) {
        super(str);
    }
}
