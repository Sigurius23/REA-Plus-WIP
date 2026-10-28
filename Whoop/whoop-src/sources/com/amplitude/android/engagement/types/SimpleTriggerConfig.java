package com.amplitude.android.engagement.types;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00061"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;", "", "Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;", "type", "", "Lkotlinx/serialization/json/JsonElement;", "conditions", "data", "<init>", "(Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;", "component2", "()Ljava/util/List;", "component3", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;", "getType", "Ljava/util/List;", "getConditions", "Lkotlinx/serialization/json/JsonElement;", "getData", "Companion", "$serializer", "com/amplitude/android/engagement/types/d1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SimpleTriggerConfig {
    public static final int $stable = 8;
    private final List<List<JsonElement>> conditions;
    private final JsonElement data;
    private final SimpleNudgeTriggerType type;
    public static final C4878d1 Companion = new C4878d1();
    private static final InterfaceC37138c[] $childSerializers = {SimpleNudgeTriggerType.Companion.serializer(), new ArrayListSerializer(new ArrayListSerializer(C0771n.f2806a)), null};

    @InterfaceC23457c
    public /* synthetic */ SimpleTriggerConfig(int i13, SimpleNudgeTriggerType simpleNudgeTriggerType, List list, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SimpleTriggerConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.type = simpleNudgeTriggerType;
        if ((i13 & 2) == 0) {
            this.conditions = C25271y.f99162w;
        } else {
            this.conditions = list;
        }
        if ((i13 & 4) == 0) {
            this.data = null;
        } else {
            this.data = jsonElement;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleTriggerConfig copy$default(SimpleTriggerConfig simpleTriggerConfig, SimpleNudgeTriggerType simpleNudgeTriggerType, List list, JsonElement jsonElement, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            simpleNudgeTriggerType = simpleTriggerConfig.type;
        }
        if ((i13 & 2) != 0) {
            list = simpleTriggerConfig.conditions;
        }
        if ((i13 & 4) != 0) {
            jsonElement = simpleTriggerConfig.data;
        }
        return simpleTriggerConfig.copy(simpleNudgeTriggerType, list, jsonElement);
    }

    public static final /* synthetic */ void write$Self(SimpleTriggerConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.conditions, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.conditions);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.data == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, C0771n.f2806a, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SimpleNudgeTriggerType getType() {
        return this.type;
    }

    public final List<List<JsonElement>> component2() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getData() {
        return this.data;
    }

    public final SimpleTriggerConfig copy(SimpleNudgeTriggerType type, List<? extends List<? extends JsonElement>> conditions, JsonElement data) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(conditions, "conditions");
        return new SimpleTriggerConfig(type, conditions, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleTriggerConfig)) {
            return false;
        }
        SimpleTriggerConfig simpleTriggerConfig = (SimpleTriggerConfig) other;
        return this.type == simpleTriggerConfig.type && AbstractC22676k.m65745e(this.conditions, simpleTriggerConfig.conditions) && AbstractC22676k.m65745e(this.data, simpleTriggerConfig.data);
    }

    public final List<List<JsonElement>> getConditions() {
        return this.conditions;
    }

    public final JsonElement getData() {
        return this.data;
    }

    public final SimpleNudgeTriggerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.type.hashCode() * 31, 31, this.conditions);
        JsonElement jsonElement = this.data;
        return iM31983b + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    public String toString() {
        return "SimpleTriggerConfig(type=" + this.type + ", conditions=" + this.conditions + ", data=" + this.data + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTriggerConfig(SimpleNudgeTriggerType type, List<? extends List<? extends JsonElement>> conditions, JsonElement jsonElement) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(conditions, "conditions");
        this.type = type;
        this.conditions = conditions;
        this.data = jsonElement;
    }

    public /* synthetic */ SimpleTriggerConfig(SimpleNudgeTriggerType simpleNudgeTriggerType, List list, JsonElement jsonElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleNudgeTriggerType, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : jsonElement);
    }
}
