package com.mapbox.maps;

import c93.InterfaceC4351m;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeaturesetFeature;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0016*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0016Be\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0012\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/mapbox/maps/LongClickInteraction;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "T", "Lcom/mapbox/maps/MapInteraction;", "Lcom/mapbox/maps/FeaturesetDescriptor;", "featureset", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/InteractionContext;", "", "onLongClick", "Lkotlin/Function3;", "Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/maps/FeaturesetFeatureId;", "featuresetFeatureBuilder", "<init>", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LongClickInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/mapbox/maps/LongClickInteraction$Companion;", "", "<init>", "()V", "", "id", "importId", "Lcom/mapbox/bindgen/Value;", "filter", "", "radius", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onLongClick", "Lcom/mapbox/maps/MapInteraction;", "featureset", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;", "layer", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;", "Lkotlin/Function1;", "Lcom/mapbox/maps/LongClickInteraction;", "", "map", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/LongClickInteraction;", "invoke", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str2 = null;
            }
            if ((i13 & 4) != 0) {
                value = null;
            }
            if ((i13 & 8) != 0) {
                d3 = null;
            }
            return companion.featureset(str, str2, value, d3, interfaceC4351m);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, Double d3, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                value = null;
            }
            if ((i13 & 4) != 0) {
                d3 = null;
            }
            return companion.layer(str, value, d3, interfaceC4351m);
        }

        public final MapInteraction featureset(String id4, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return featureset$default(this, id4, null, null, null, onLongClick, 14, null);
        }

        public final MapInteraction layer(String id4, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return layer$default(this, id4, null, null, onLongClick, 6, null);
        }

        public final LongClickInteraction map(Function1 onLongClick) {
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return new LongClickInteraction(onLongClick, null);
        }

        private Companion() {
        }

        public final MapInteraction featureset(String id4, String str, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return featureset$default(this, id4, str, null, null, onLongClick, 12, null);
        }

        public final MapInteraction layer(String id4, Value value, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return layer$default(this, id4, value, null, onLongClick, 4, null);
        }

        public final MapInteraction featureset(String id4, String str, Value value, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return featureset$default(this, id4, str, value, null, onLongClick, 8, null);
        }

        public final MapInteraction layer(String id4, Value filter, Double radius, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return new LongClickInteraction(new FeaturesetDescriptor(null, null, id4), filter, radius, onLongClick, new LongClickInteraction$Companion$layer$1(id4));
        }

        public final MapInteraction featureset(String id4, String importId, Value filter, Double radius, InterfaceC4351m onLongClick) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(onLongClick, "onLongClick");
            return new LongClickInteraction(new FeaturesetDescriptor(id4, importId, null), filter, radius, onLongClick, new LongClickInteraction$Companion$featureset$1(id4, importId));
        }
    }

    public /* synthetic */ LongClickInteraction(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    public static final MapInteraction featureset(String str, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.featureset(str, interfaceC4351m);
    }

    public static final MapInteraction layer(String str, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.layer(str, interfaceC4351m);
    }

    public static final LongClickInteraction map(Function1 function1) {
        return INSTANCE.map(function1);
    }

    public /* synthetic */ LongClickInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d3, InterfaceC4351m interfaceC4351m, Function3 function3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featuresetDescriptor, (i13 & 2) != 0 ? null : value, (i13 & 4) != 0 ? null : d3, interfaceC4351m, function3);
    }

    public static final MapInteraction featureset(String str, String str2, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.featureset(str, str2, interfaceC4351m);
    }

    public static final MapInteraction layer(String str, Value value, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.layer(str, value, interfaceC4351m);
    }

    public LongClickInteraction(FeaturesetDescriptor featureset, Value value, Double d3, final InterfaceC4351m onLongClick, final Function3 featuresetFeatureBuilder) {
        AbstractC22676k.m65750j(featureset, "featureset");
        AbstractC22676k.m65750j(onLongClick, "onLongClick");
        AbstractC22676k.m65750j(featuresetFeatureBuilder, "featuresetFeatureBuilder");
        this.coreInteraction = new Interaction(featureset, value, InteractionType.LONG_CLICK, new InteractionHandler() { // from class: com.mapbox.maps.LongClickInteraction.1
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Feature feature2;
                AbstractC22676k.m65750j(context, "context");
                if (((feature == null || (feature2 = feature.getFeature()) == null) ? null : feature2.geometry()) == null) {
                    return false;
                }
                InterfaceC4351m interfaceC4351m = onLongClick;
                Function3 function3 = featuresetFeatureBuilder;
                Feature feature3 = feature.getFeature();
                AbstractC22676k.m65749i(feature3, "feature.feature");
                FeaturesetFeatureId featuresetFeatureId = feature.getFeaturesetFeatureId();
                Value state = feature.getState();
                AbstractC22676k.m65749i(state, "feature.state");
                return ((Boolean) interfaceC4351m.invoke(function3.invoke(feature3, featuresetFeatureId, state), context)).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                AbstractC22676k.m65750j(context, "context");
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                AbstractC22676k.m65750j(context, "context");
            }
        }, d3);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.featureset(str, str2, value, interfaceC4351m);
    }

    public static final MapInteraction layer(String str, Value value, Double d3, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.layer(str, value, d3, interfaceC4351m);
    }

    public static final MapInteraction featureset(String str, String str2, Value value, Double d3, InterfaceC4351m interfaceC4351m) {
        return INSTANCE.featureset(str, str2, value, d3, interfaceC4351m);
    }

    private LongClickInteraction(final Function1 function1) {
        this.coreInteraction = new Interaction(null, null, InteractionType.LONG_CLICK, new InteractionHandler() { // from class: com.mapbox.maps.LongClickInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                AbstractC22676k.m65750j(context, "context");
                return ((Boolean) function1.invoke(context)).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                AbstractC22676k.m65750j(context, "context");
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                AbstractC22676k.m65750j(context, "context");
            }
        }, null);
    }
}
