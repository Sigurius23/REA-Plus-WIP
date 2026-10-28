package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import java.util.HashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "hide", "", "getHide$annotations", "()V", "getHide", "()Ljava/lang/Boolean;", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "Builder", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class StandardPoiState extends FeatureState {
    private final Value internalState;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", "build", "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiState;", "hide", "", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Builder extends FeatureState.Builder {
        public final Builder hide(boolean hide) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(hide);
            AbstractC22676k.m65749i(valueValueOf, "valueOf(hide)");
            rawStateMap.put("hide", valueValueOf);
            return this;
        }

        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardPoiState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardPoiState. Is this intended?");
            }
            return new StandardPoiState(new Value(getRawStateMap()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPoiState(Value internalState) {
        super(internalState);
        AbstractC22676k.m65750j(internalState, "internalState");
        this.internalState = internalState;
    }

    public static /* synthetic */ void getHide$annotations() {
    }

    public final Boolean getHide() {
        Object contents = getInternalState().getContents();
        AbstractC22676k.m65748h(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get("hide");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }
}
