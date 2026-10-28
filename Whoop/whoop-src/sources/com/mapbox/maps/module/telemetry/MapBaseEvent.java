package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H&R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;)V", AnalyticsRequestV2.PARAM_CREATED, "", "getCreated", "()Ljava/lang/String;", NotificationCompat.CATEGORY_EVENT, "getEvent", "getEventName", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@SuppressLint({"ParcelCreator"})
public abstract class MapBaseEvent {

    @SerializedName(AnalyticsRequestV2.PARAM_CREATED)
    private final String created;

    @SerializedName(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    public MapBaseEvent(PhoneState phoneState) {
        AbstractC22676k.m65750j(phoneState, "phoneState");
        this.event = getEventName();
        this.created = phoneState.getCreated();
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getEvent() {
        return this.event;
    }

    public abstract String getEventName();
}
