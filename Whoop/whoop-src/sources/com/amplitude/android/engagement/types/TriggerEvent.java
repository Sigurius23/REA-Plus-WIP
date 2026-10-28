package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010#¨\u0006:"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/TriggerEvent;", "", "", "type", "", "nudgeId", "Lcom/amplitude/android/engagement/types/Trigger;", "trigger", "Lcom/amplitude/android/engagement/types/TriggerSource;", "source", "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "overrides", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/amplitude/android/engagement/types/Trigger;", "component4", "()Lcom/amplitude/android/engagement/types/TriggerSource;", "component5", "()Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)Lcom/amplitude/android/engagement/types/TriggerEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getNudgeId", "Lcom/amplitude/android/engagement/types/Trigger;", "getTrigger", "Lcom/amplitude/android/engagement/types/TriggerSource;", "getSource", "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "getOverrides", "Companion", "$serializer", "com/amplitude/android/engagement/types/e2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TriggerEvent {
    public static final int $stable = 8;
    public static final C4883e2 Companion = new C4883e2();
    private final Integer nudgeId;
    private final TriggerEventOverrides overrides;
    private final TriggerSource source;
    private final Trigger trigger;
    private final String type;

    @InterfaceC23457c
    public /* synthetic */ TriggerEvent(int i13, String str, Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i13 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 13, TriggerEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i13 & 2) == 0) {
            this.nudgeId = null;
        } else {
            this.nudgeId = num;
        }
        this.trigger = trigger;
        this.source = triggerSource;
        if ((i13 & 16) == 0) {
            this.overrides = null;
        } else {
            this.overrides = triggerEventOverrides;
        }
    }

    public static /* synthetic */ TriggerEvent copy$default(TriggerEvent triggerEvent, String str, Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = triggerEvent.type;
        }
        if ((i13 & 2) != 0) {
            num = triggerEvent.nudgeId;
        }
        if ((i13 & 4) != 0) {
            trigger = triggerEvent.trigger;
        }
        if ((i13 & 8) != 0) {
            triggerSource = triggerEvent.source;
        }
        if ((i13 & 16) != 0) {
            triggerEventOverrides = triggerEvent.overrides;
        }
        TriggerEventOverrides triggerEventOverrides2 = triggerEventOverrides;
        Trigger trigger2 = trigger;
        return triggerEvent.copy(str, num, trigger2, triggerSource, triggerEventOverrides2);
    }

    public static final /* synthetic */ void write$Self(TriggerEvent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.nudgeId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.nudgeId);
        }
        output.encodeSerializableElement(serialDesc, 2, Trigger$$serializer.INSTANCE, self.trigger);
        output.encodeSerializableElement(serialDesc, 3, TriggerSource$$serializer.INSTANCE, self.source);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.overrides == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, TriggerEventOverrides$$serializer.INSTANCE, self.overrides);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNudgeId() {
        return this.nudgeId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TriggerSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TriggerEventOverrides getOverrides() {
        return this.overrides;
    }

    public final TriggerEvent copy(String type, Integer nudgeId, Trigger trigger, TriggerSource source, TriggerEventOverrides overrides) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(trigger, "trigger");
        AbstractC22676k.m65750j(source, "source");
        return new TriggerEvent(type, nudgeId, trigger, source, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerEvent)) {
            return false;
        }
        TriggerEvent triggerEvent = (TriggerEvent) other;
        return AbstractC22676k.m65745e(this.type, triggerEvent.type) && AbstractC22676k.m65745e(this.nudgeId, triggerEvent.nudgeId) && AbstractC22676k.m65745e(this.trigger, triggerEvent.trigger) && AbstractC22676k.m65745e(this.source, triggerEvent.source) && AbstractC22676k.m65745e(this.overrides, triggerEvent.overrides);
    }

    public final Integer getNudgeId() {
        return this.nudgeId;
    }

    public final TriggerEventOverrides getOverrides() {
        return this.overrides;
    }

    public final TriggerSource getSource() {
        return this.source;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.nudgeId;
        int iHashCode2 = (this.source.hashCode() + ((this.trigger.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        TriggerEventOverrides triggerEventOverrides = this.overrides;
        return iHashCode2 + (triggerEventOverrides != null ? triggerEventOverrides.hashCode() : 0);
    }

    public String toString() {
        return "TriggerEvent(type=" + this.type + ", nudgeId=" + this.nudgeId + ", trigger=" + this.trigger + ", source=" + this.source + ", overrides=" + this.overrides + ')';
    }

    public TriggerEvent(String type, Integer num, Trigger trigger, TriggerSource source, TriggerEventOverrides triggerEventOverrides) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(trigger, "trigger");
        AbstractC22676k.m65750j(source, "source");
        this.type = type;
        this.nudgeId = num;
        this.trigger = trigger;
        this.source = source;
        this.overrides = triggerEventOverrides;
    }

    public /* synthetic */ TriggerEvent(String str, Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : num, trigger, triggerSource, (i13 & 16) != 0 ? null : triggerEventOverrides);
    }
}
