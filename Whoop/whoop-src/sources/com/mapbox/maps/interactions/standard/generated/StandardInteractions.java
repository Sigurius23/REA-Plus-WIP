package com.mapbox.maps.interactions.standard.generated;

import c93.InterfaceC4351m;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\r\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aQ\u0010\r\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u0011\u001aQ\u0010\u0013\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u000e\u001aQ\u0010\u0013\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001aQ\u0010\u0015\u001a\u00020\f*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u000e\u001aQ\u0010\u0015\u001a\u00020\f*\u00020\u000f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, m65681d2 = {"Lcom/mapbox/maps/ClickInteraction$Companion;", "", "importId", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "Lcom/mapbox/maps/InteractionContext;", "", "onClick", "Lcom/mapbox/maps/MapInteraction;", "standardPoi", "(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/LongClickInteraction$Companion;", "onLongClick", "(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "standardPlaceLabels", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "standardBuildings", "sdk-base_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StandardInteractions {

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardBuildings$1 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55301 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55301(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardBuildingsFeature(featuresetFeatureId, this.$importId, feature, new StandardBuildingsState(state));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardBuildings$2 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55312 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55312(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardBuildingsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardBuildingsFeature(featuresetFeatureId, this.$importId, feature, new StandardBuildingsState(state));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPlaceLabels$1 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55321 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55321(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardPlaceLabelsFeature(featuresetFeatureId, this.$importId, feature, new StandardPlaceLabelsState(state));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPlaceLabels$2 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55332 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55332(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardPlaceLabelsFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardPlaceLabelsFeature(featuresetFeatureId, this.$importId, feature, new StandardPlaceLabelsState(state));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPoi$1 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55341 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55341(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardPoiFeature(featuresetFeatureId, this.$importId, feature, new StandardPoiState(state));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.interactions.standard.generated.StandardInteractions$standardPoi$2 */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55352 extends AbstractC22680m implements Function3 {
        final /* synthetic */ String $importId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55352(String str) {
            super(3);
            this.$importId = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final StandardPoiFeature invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
            AbstractC22676k.m65750j(feature, "feature");
            AbstractC22676k.m65750j(state, "state");
            return new StandardPoiFeature(featuresetFeatureId, this.$importId, feature, new StandardPoiState(state));
        }
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, onClick, 7, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardBuildings(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, onClick, 7, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardPlaceLabels(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, onClick, 7, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardPoi$default(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardPoi(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardBuildings$default(companion, str, (Value) null, (Double) null, onClick, 6, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardBuildings$default(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardBuildings(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, onClick, 6, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardPlaceLabels$default(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardPlaceLabels(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPoi$default(companion, str, (Value) null, (Double) null, onClick, 6, (Object) null);
    }

    public static /* synthetic */ MapInteraction standardPoi$default(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            value = null;
        }
        if ((i13 & 4) != 0) {
            d3 = null;
        }
        return standardPoi(companion, str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardBuildings$default(companion, str, value, (Double) null, onClick, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPlaceLabels$default(companion, str, value, (Double) null, onClick, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return standardPoi$default(companion, str, value, (Double) null, onClick, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardBuildings$default(companion, (String) null, (Value) null, (Double) null, onLongClick, 7, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPlaceLabels$default(companion, (String) null, (Value) null, (Double) null, onLongClick, 7, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPoi$default(companion, (String) null, (Value) null, (Double) null, onLongClick, 7, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardBuildings$default(companion, str, (Value) null, (Double) null, onLongClick, 6, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPlaceLabels$default(companion, str, (Value) null, (Double) null, onLongClick, 6, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPoi$default(companion, str, (Value) null, (Double) null, onLongClick, 6, (Object) null);
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardBuildings$default(companion, str, value, (Double) null, onLongClick, 4, (Object) null);
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPlaceLabels$default(companion, str, value, (Double) null, onLongClick, 4, (Object) null);
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, Value value, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return standardPoi$default(companion, str, value, (Double) null, onLongClick, 4, (Object) null);
    }

    public static final MapInteraction standardBuildings(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return new ClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onClick, new C55301(str));
    }

    public static final MapInteraction standardPlaceLabels(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return new ClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onClick, new C55321(str));
    }

    public static final MapInteraction standardPoi(ClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onClick, "onClick");
        return new ClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onClick, new C55341(str));
    }

    public static final MapInteraction standardBuildings(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return new LongClickInteraction(new FeaturesetDescriptor(StandardBuildings.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onLongClick, new C55312(str));
    }

    public static final MapInteraction standardPlaceLabels(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPlaceLabels.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onLongClick, new C55332(str));
    }

    public static final MapInteraction standardPoi(LongClickInteraction.Companion companion, String str, Value value, Double d3, InterfaceC4351m onLongClick) {
        AbstractC22676k.m65750j(companion, "<this>");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        return new LongClickInteraction(new FeaturesetDescriptor(StandardPoi.FEATURESET_ID, str == null ? TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID : str, null), value, d3, onLongClick, new C55352(str));
    }
}
