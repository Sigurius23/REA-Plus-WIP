package com.amplitude.android.engagement.types;

import ad3.C0771n;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/TriggerData;", "", "", NotificationCompat.CATEGORY_EVENT, "", "Lkotlinx/serialization/json/JsonElement;", "properties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/TriggerData;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/amplitude/android/engagement/types/TriggerData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "Ljava/util/Map;", "getProperties", "Companion", "$serializer", "com/amplitude/android/engagement/types/d2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TriggerData {
    public static final int $stable = 8;
    private final String event;
    private final Map<String, JsonElement> properties;
    public static final C4879d2 Companion = new C4879d2();
    private static final InterfaceC37138c[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a)};

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerData() {
        this((String) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TriggerData copy$default(TriggerData triggerData, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = triggerData.event;
        }
        if ((i13 & 2) != 0) {
            map = triggerData.properties;
        }
        return triggerData.copy(str, map);
    }

    public static final /* synthetic */ void write$Self(TriggerData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.event != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.event);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.properties, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.properties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public final Map<String, JsonElement> component2() {
        return this.properties;
    }

    public final TriggerData copy(String event, Map<String, ? extends JsonElement> properties) {
        AbstractC22676k.m65750j(properties, "properties");
        return new TriggerData(event, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerData)) {
            return false;
        }
        TriggerData triggerData = (TriggerData) other;
        return AbstractC22676k.m65745e(this.event, triggerData.event) && AbstractC22676k.m65745e(this.properties, triggerData.properties);
    }

    public final String getEvent() {
        return this.event;
    }

    public final Map<String, JsonElement> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.event;
        return this.properties.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("TriggerData(event=");
        sb4.append(this.event);
        sb4.append(", properties=");
        return AbstractC30802r.m94764m(sb4, this.properties, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ TriggerData(int i13, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.event = (i13 & 1) == 0 ? null : str;
        if ((i13 & 2) == 0) {
            this.properties = C25272z.f99163w;
        } else {
            this.properties = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerData(String str, Map<String, ? extends JsonElement> properties) {
        AbstractC22676k.m65750j(properties, "properties");
        this.event = str;
        this.properties = properties;
    }

    public /* synthetic */ TriggerData(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
