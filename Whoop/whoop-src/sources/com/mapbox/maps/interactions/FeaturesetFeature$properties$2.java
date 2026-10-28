package com.mapbox.maps.interactions;

import c93.InterfaceC4339a;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class FeaturesetFeature$properties$2 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ FeaturesetFeature<FS> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturesetFeature$properties$2(FeaturesetFeature<FS> featuresetFeature) {
        super(0);
        this.this$0 = featuresetFeature;
    }

    @Override // c93.InterfaceC4339a
    public final JSONObject invoke() {
        JsonObject jsonObjectProperties = this.this$0.getOriginalFeature().properties();
        return jsonObjectProperties != null ? new JSONObject(jsonObjectProperties.toString()) : new JSONObject();
    }
}
