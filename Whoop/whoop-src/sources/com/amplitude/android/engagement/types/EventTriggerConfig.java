package com.amplitude.android.engagement.types;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\t\u0010\nBE\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/EventTriggerConfig;", "", "", "type", "Lcom/amplitude/android/engagement/types/EventData;", "data", "", "Lkotlinx/serialization/json/JsonElement;", "conditions", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/EventData;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/EventData;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/EventTriggerConfig;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/EventData;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/EventData;Ljava/util/List;)Lcom/amplitude/android/engagement/types/EventTriggerConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lcom/amplitude/android/engagement/types/EventData;", "getData", "Ljava/util/List;", "getConditions", "Companion", "$serializer", "com/amplitude/android/engagement/types/x", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EventTriggerConfig {
    public static final int $stable = 8;
    private final List<List<JsonElement>> conditions;
    private final EventData data;
    private final String type;
    public static final C4946x Companion = new C4946x();
    private static final InterfaceC37138c[] $childSerializers = {null, null, new ArrayListSerializer(new ArrayListSerializer(C0771n.f2806a))};

    @InterfaceC23457c
    public /* synthetic */ EventTriggerConfig(int i13, String str, EventData eventData, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, EventTriggerConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i13 & 1) == 0 ? "analytics_event" : str;
        this.data = eventData;
        if ((i13 & 4) == 0) {
            this.conditions = C25271y.f99162w;
        } else {
            this.conditions = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTriggerConfig copy$default(EventTriggerConfig eventTriggerConfig, String str, EventData eventData, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = eventTriggerConfig.type;
        }
        if ((i13 & 2) != 0) {
            eventData = eventTriggerConfig.data;
        }
        if ((i13 & 4) != 0) {
            list = eventTriggerConfig.conditions;
        }
        return eventTriggerConfig.copy(str, eventData, list);
    }

    public static final /* synthetic */ void write$Self(EventTriggerConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.type, "analytics_event")) {
            output.encodeStringElement(serialDesc, 0, self.type);
        }
        output.encodeSerializableElement(serialDesc, 1, EventData$$serializer.INSTANCE, self.data);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.conditions, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.conditions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventData getData() {
        return this.data;
    }

    public final List<List<JsonElement>> component3() {
        return this.conditions;
    }

    public final EventTriggerConfig copy(String type, EventData data, List<? extends List<? extends JsonElement>> conditions) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(conditions, "conditions");
        return new EventTriggerConfig(type, data, conditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTriggerConfig)) {
            return false;
        }
        EventTriggerConfig eventTriggerConfig = (EventTriggerConfig) other;
        return AbstractC22676k.m65745e(this.type, eventTriggerConfig.type) && AbstractC22676k.m65745e(this.data, eventTriggerConfig.data) && AbstractC22676k.m65745e(this.conditions, eventTriggerConfig.conditions);
    }

    public final List<List<JsonElement>> getConditions() {
        return this.conditions;
    }

    public final EventData getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.conditions.hashCode() + ((this.data.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("EventTriggerConfig(type=");
        sb4.append(this.type);
        sb4.append(", data=");
        sb4.append(this.data);
        sb4.append(", conditions=");
        return AbstractC17176i.m48506h(sb4, this.conditions, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventTriggerConfig(String type, EventData data, List<? extends List<? extends JsonElement>> conditions) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(conditions, "conditions");
        this.type = type;
        this.data = data;
        this.conditions = conditions;
    }

    public /* synthetic */ EventTriggerConfig(String str, EventData eventData, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "analytics_event" : str, eventData, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
