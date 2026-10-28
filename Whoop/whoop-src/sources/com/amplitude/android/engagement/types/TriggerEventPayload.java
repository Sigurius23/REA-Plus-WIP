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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108¨\u0006<"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/TriggerEventPayload;", "", "", "nudgeId", "Lcom/amplitude/android/engagement/types/Trigger;", "trigger", "Lcom/amplitude/android/engagement/types/TriggerSource;", "source", "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "overrides", "<init>", "(Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/TriggerEventPayload;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/amplitude/android/engagement/types/Trigger;", "component3", "()Lcom/amplitude/android/engagement/types/TriggerSource;", "component4", "()Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "copy", "(Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)Lcom/amplitude/android/engagement/types/TriggerEventPayload;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getNudgeId", "setNudgeId", "(Ljava/lang/Integer;)V", "Lcom/amplitude/android/engagement/types/Trigger;", "getTrigger", "setTrigger", "(Lcom/amplitude/android/engagement/types/Trigger;)V", "Lcom/amplitude/android/engagement/types/TriggerSource;", "getSource", "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;", "getOverrides", "setOverrides", "(Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V", "Companion", "$serializer", "com/amplitude/android/engagement/types/g2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TriggerEventPayload {
    public static final int $stable = 8;
    public static final C4891g2 Companion = new C4891g2();
    private Integer nudgeId;
    private TriggerEventOverrides overrides;
    private final TriggerSource source;
    private Trigger trigger;

    @InterfaceC23457c
    public /* synthetic */ TriggerEventPayload(int i13, Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i13 & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4, TriggerEventPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.nudgeId = null;
        } else {
            this.nudgeId = num;
        }
        if ((i13 & 2) == 0) {
            this.trigger = null;
        } else {
            this.trigger = trigger;
        }
        this.source = triggerSource;
        if ((i13 & 8) == 0) {
            this.overrides = null;
        } else {
            this.overrides = triggerEventOverrides;
        }
    }

    public static /* synthetic */ TriggerEventPayload copy$default(TriggerEventPayload triggerEventPayload, Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = triggerEventPayload.nudgeId;
        }
        if ((i13 & 2) != 0) {
            trigger = triggerEventPayload.trigger;
        }
        if ((i13 & 4) != 0) {
            triggerSource = triggerEventPayload.source;
        }
        if ((i13 & 8) != 0) {
            triggerEventOverrides = triggerEventPayload.overrides;
        }
        return triggerEventPayload.copy(num, trigger, triggerSource, triggerEventOverrides);
    }

    public static final /* synthetic */ void write$Self(TriggerEventPayload self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.nudgeId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.nudgeId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.trigger != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Trigger$$serializer.INSTANCE, self.trigger);
        }
        output.encodeSerializableElement(serialDesc, 2, TriggerSource$$serializer.INSTANCE, self.source);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.overrides == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, TriggerEventOverrides$$serializer.INSTANCE, self.overrides);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNudgeId() {
        return this.nudgeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TriggerSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TriggerEventOverrides getOverrides() {
        return this.overrides;
    }

    public final TriggerEventPayload copy(Integer nudgeId, Trigger trigger, TriggerSource source, TriggerEventOverrides overrides) {
        AbstractC22676k.m65750j(source, "source");
        return new TriggerEventPayload(nudgeId, trigger, source, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerEventPayload)) {
            return false;
        }
        TriggerEventPayload triggerEventPayload = (TriggerEventPayload) other;
        return AbstractC22676k.m65745e(this.nudgeId, triggerEventPayload.nudgeId) && AbstractC22676k.m65745e(this.trigger, triggerEventPayload.trigger) && AbstractC22676k.m65745e(this.source, triggerEventPayload.source) && AbstractC22676k.m65745e(this.overrides, triggerEventPayload.overrides);
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

    public int hashCode() {
        Integer num = this.nudgeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Trigger trigger = this.trigger;
        int iHashCode2 = (this.source.hashCode() + ((iHashCode + (trigger == null ? 0 : trigger.hashCode())) * 31)) * 31;
        TriggerEventOverrides triggerEventOverrides = this.overrides;
        return iHashCode2 + (triggerEventOverrides != null ? triggerEventOverrides.hashCode() : 0);
    }

    public final void setNudgeId(Integer num) {
        this.nudgeId = num;
    }

    public final void setOverrides(TriggerEventOverrides triggerEventOverrides) {
        this.overrides = triggerEventOverrides;
    }

    public final void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public String toString() {
        return "TriggerEventPayload(nudgeId=" + this.nudgeId + ", trigger=" + this.trigger + ", source=" + this.source + ", overrides=" + this.overrides + ')';
    }

    public TriggerEventPayload(Integer num, Trigger trigger, TriggerSource source, TriggerEventOverrides triggerEventOverrides) {
        AbstractC22676k.m65750j(source, "source");
        this.nudgeId = num;
        this.trigger = trigger;
        this.source = source;
        this.overrides = triggerEventOverrides;
    }

    public /* synthetic */ TriggerEventPayload(Integer num, Trigger trigger, TriggerSource triggerSource, TriggerEventOverrides triggerEventOverrides, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : trigger, triggerSource, (i13 & 8) != 0 ? null : triggerEventOverrides);
    }
}
