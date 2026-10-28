package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;", "", "", "stopShowingIfCompleted", "stopShowingIfDismissed", "", "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;", "cooldownLimits", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getStopShowingIfCompleted", "getStopShowingIfDismissed", "Ljava/util/List;", "getCooldownLimits", "Companion", "$serializer", "com/amplitude/android/engagement/types/u0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NudgeLifecycleConfig {
    public static final int $stable = 8;
    private final List<NudgeCooldownLimit> cooldownLimits;
    private final Boolean stopShowingIfCompleted;
    private final Boolean stopShowingIfDismissed;
    public static final C4938u0 Companion = new C4938u0();
    private static final InterfaceC37138c[] $childSerializers = {null, null, new ArrayListSerializer(NudgeCooldownLimit$$serializer.INSTANCE)};

    public NudgeLifecycleConfig() {
        this((Boolean) null, (Boolean) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NudgeLifecycleConfig copy$default(NudgeLifecycleConfig nudgeLifecycleConfig, Boolean bool, Boolean bool2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = nudgeLifecycleConfig.stopShowingIfCompleted;
        }
        if ((i13 & 2) != 0) {
            bool2 = nudgeLifecycleConfig.stopShowingIfDismissed;
        }
        if ((i13 & 4) != 0) {
            list = nudgeLifecycleConfig.cooldownLimits;
        }
        return nudgeLifecycleConfig.copy(bool, bool2, list);
    }

    public static final /* synthetic */ void write$Self(NudgeLifecycleConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.stopShowingIfCompleted != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.stopShowingIfCompleted);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.stopShowingIfDismissed != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.stopShowingIfDismissed);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.cooldownLimits, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.cooldownLimits);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getStopShowingIfCompleted() {
        return this.stopShowingIfCompleted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getStopShowingIfDismissed() {
        return this.stopShowingIfDismissed;
    }

    public final List<NudgeCooldownLimit> component3() {
        return this.cooldownLimits;
    }

    public final NudgeLifecycleConfig copy(Boolean stopShowingIfCompleted, Boolean stopShowingIfDismissed, List<NudgeCooldownLimit> cooldownLimits) {
        AbstractC22676k.m65750j(cooldownLimits, "cooldownLimits");
        return new NudgeLifecycleConfig(stopShowingIfCompleted, stopShowingIfDismissed, cooldownLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NudgeLifecycleConfig)) {
            return false;
        }
        NudgeLifecycleConfig nudgeLifecycleConfig = (NudgeLifecycleConfig) other;
        return AbstractC22676k.m65745e(this.stopShowingIfCompleted, nudgeLifecycleConfig.stopShowingIfCompleted) && AbstractC22676k.m65745e(this.stopShowingIfDismissed, nudgeLifecycleConfig.stopShowingIfDismissed) && AbstractC22676k.m65745e(this.cooldownLimits, nudgeLifecycleConfig.cooldownLimits);
    }

    public final List<NudgeCooldownLimit> getCooldownLimits() {
        return this.cooldownLimits;
    }

    public final Boolean getStopShowingIfCompleted() {
        return this.stopShowingIfCompleted;
    }

    public final Boolean getStopShowingIfDismissed() {
        return this.stopShowingIfDismissed;
    }

    public int hashCode() {
        Boolean bool = this.stopShowingIfCompleted;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.stopShowingIfDismissed;
        return this.cooldownLimits.hashCode() + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("NudgeLifecycleConfig(stopShowingIfCompleted=");
        sb4.append(this.stopShowingIfCompleted);
        sb4.append(", stopShowingIfDismissed=");
        sb4.append(this.stopShowingIfDismissed);
        sb4.append(", cooldownLimits=");
        return AbstractC17176i.m48506h(sb4, this.cooldownLimits, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ NudgeLifecycleConfig(int i13, Boolean bool, Boolean bool2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.stopShowingIfCompleted = null;
        } else {
            this.stopShowingIfCompleted = bool;
        }
        if ((i13 & 2) == 0) {
            this.stopShowingIfDismissed = null;
        } else {
            this.stopShowingIfDismissed = bool2;
        }
        if ((i13 & 4) == 0) {
            this.cooldownLimits = C25271y.f99162w;
        } else {
            this.cooldownLimits = list;
        }
    }

    public NudgeLifecycleConfig(Boolean bool, Boolean bool2, List<NudgeCooldownLimit> cooldownLimits) {
        AbstractC22676k.m65750j(cooldownLimits, "cooldownLimits");
        this.stopShowingIfCompleted = bool;
        this.stopShowingIfDismissed = bool2;
        this.cooldownLimits = cooldownLimits;
    }

    public /* synthetic */ NudgeLifecycleConfig(Boolean bool, Boolean bool2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
