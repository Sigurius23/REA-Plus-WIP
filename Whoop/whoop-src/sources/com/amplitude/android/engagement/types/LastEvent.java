package com.amplitude.android.engagement.types;

import ad3.C0756b0;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/LastEvent;", "", "", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/serialization/json/JsonObject;", "properties", "", "timestamp", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Long;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/LastEvent;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Long;)Lcom/amplitude/android/engagement/types/LastEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "Lkotlinx/serialization/json/JsonObject;", "getProperties", "Ljava/lang/Long;", "getTimestamp", "Companion", "$serializer", "com/amplitude/android/engagement/types/h0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LastEvent {
    public static final int $stable = 8;
    public static final C4893h0 Companion = new C4893h0();
    private final String event;
    private final JsonObject properties;
    private final Long timestamp;

    public LastEvent() {
        this((String) null, (JsonObject) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LastEvent copy$default(LastEvent lastEvent, String str, JsonObject jsonObject, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lastEvent.event;
        }
        if ((i13 & 2) != 0) {
            jsonObject = lastEvent.properties;
        }
        if ((i13 & 4) != 0) {
            l7 = lastEvent.timestamp;
        }
        return lastEvent.copy(str, jsonObject, l7);
    }

    public static final /* synthetic */ void write$Self(LastEvent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.event != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.event);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.properties != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C0756b0.f2760a, self.properties);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.timestamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getProperties() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final LastEvent copy(String event, JsonObject properties, Long timestamp) {
        return new LastEvent(event, properties, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastEvent)) {
            return false;
        }
        LastEvent lastEvent = (LastEvent) other;
        return AbstractC22676k.m65745e(this.event, lastEvent.event) && AbstractC22676k.m65745e(this.properties, lastEvent.properties) && AbstractC22676k.m65745e(this.timestamp, lastEvent.timestamp);
    }

    public final String getEvent() {
        return this.event;
    }

    public final JsonObject getProperties() {
        return this.properties;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.event;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonObject jsonObject = this.properties;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        Long l7 = this.timestamp;
        return iHashCode2 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "LastEvent(event=" + this.event + ", properties=" + this.properties + ", timestamp=" + this.timestamp + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ LastEvent(int i13, String str, JsonObject jsonObject, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.event = null;
        } else {
            this.event = str;
        }
        if ((i13 & 2) == 0) {
            this.properties = null;
        } else {
            this.properties = jsonObject;
        }
        if ((i13 & 4) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l7;
        }
    }

    public LastEvent(String str, JsonObject jsonObject, Long l7) {
        this.event = str;
        this.properties = jsonObject;
        this.timestamp = l7;
    }

    public /* synthetic */ LastEvent(String str, JsonObject jsonObject, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : jsonObject, (i13 & 4) != 0 ? null : l7);
    }
}
