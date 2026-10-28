package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/Trigger;", "", "Lcom/amplitude/android/engagement/types/TriggerType;", "type", "Lcom/amplitude/android/engagement/types/TriggerData;", "data", "<init>", "(Lcom/amplitude/android/engagement/types/TriggerType;Lcom/amplitude/android/engagement/types/TriggerData;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/TriggerType;Lcom/amplitude/android/engagement/types/TriggerData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/Trigger;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/TriggerType;", "component2", "()Lcom/amplitude/android/engagement/types/TriggerData;", "copy", "(Lcom/amplitude/android/engagement/types/TriggerType;Lcom/amplitude/android/engagement/types/TriggerData;)Lcom/amplitude/android/engagement/types/Trigger;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/TriggerType;", "getType", "Lcom/amplitude/android/engagement/types/TriggerData;", "getData", "Companion", "$serializer", "com/amplitude/android/engagement/types/c2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Trigger {
    public static final int $stable = 8;
    private final TriggerData data;
    private final TriggerType type;
    public static final C4875c2 Companion = new C4875c2();
    private static final InterfaceC37138c[] $childSerializers = {TriggerType.Companion.serializer(), null};

    @InterfaceC23457c
    public /* synthetic */ Trigger(int i13, TriggerType triggerType, TriggerData triggerData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, Trigger$$serializer.INSTANCE.getDescriptor());
        }
        this.type = triggerType;
        if ((i13 & 2) == 0) {
            this.data = null;
        } else {
            this.data = triggerData;
        }
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, TriggerType triggerType, TriggerData triggerData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            triggerType = trigger.type;
        }
        if ((i13 & 2) != 0) {
            triggerData = trigger.data;
        }
        return trigger.copy(triggerType, triggerData);
    }

    public static final /* synthetic */ void write$Self(Trigger self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.type);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.data == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, TriggerData$$serializer.INSTANCE, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TriggerType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TriggerData getData() {
        return this.data;
    }

    public final Trigger copy(TriggerType type, TriggerData data) {
        AbstractC22676k.m65750j(type, "type");
        return new Trigger(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) other;
        return this.type == trigger.type && AbstractC22676k.m65745e(this.data, trigger.data);
    }

    public final TriggerData getData() {
        return this.data;
    }

    public final TriggerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        TriggerData triggerData = this.data;
        return iHashCode + (triggerData == null ? 0 : triggerData.hashCode());
    }

    public String toString() {
        return "Trigger(type=" + this.type + ", data=" + this.data + ')';
    }

    public Trigger(TriggerType type, TriggerData triggerData) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.data = triggerData;
    }

    public /* synthetic */ Trigger(TriggerType triggerType, TriggerData triggerData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(triggerType, (i13 & 2) != 0 ? null : triggerData);
    }
}
