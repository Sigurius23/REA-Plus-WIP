package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006$"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/NudgeAction;", "Lcom/amplitude/android/engagement/types/Action;", "", "value", "<init>", "(I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/NudgeAction;Lzc3/c;Lyc3/g;)V", "component1", "()I", "copy", "(I)Lcom/amplitude/android/engagement/types/NudgeAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "Companion", "$serializer", "com/amplitude/android/engagement/types/r0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("nudge")
@InterfaceC37144i
public final /* data */ class NudgeAction extends Action {
    public static final int $stable = 0;
    public static final C4929r0 Companion = new C4929r0();
    private final int value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ NudgeAction(int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, NudgeAction$$serializer.INSTANCE.getDescriptor());
        }
        this.value = i14;
    }

    public static /* synthetic */ NudgeAction copy$default(NudgeAction nudgeAction, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = nudgeAction.value;
        }
        return nudgeAction.copy(i13);
    }

    public static final /* synthetic */ void write$Self(NudgeAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Action.write$Self(self, output, serialDesc);
        output.encodeIntElement(serialDesc, 0, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final NudgeAction copy(int value) {
        return new NudgeAction(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NudgeAction) && this.value == ((NudgeAction) other).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("NudgeAction(value="), this.value, ')');
    }

    public NudgeAction(int i13) {
        super(null);
        this.value = i13;
    }
}
