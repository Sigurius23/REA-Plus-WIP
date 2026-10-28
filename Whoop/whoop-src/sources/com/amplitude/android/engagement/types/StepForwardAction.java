package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/StepForwardAction;", "Lcom/amplitude/android/engagement/types/Action;", "", "dummy", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/StepForwardAction;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/StepForwardAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDummy", "Companion", "$serializer", "com/amplitude/android/engagement/types/i1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("step_forward")
@InterfaceC37144i
public final /* data */ class StepForwardAction extends Action {
    public static final int $stable = 0;
    public static final C4898i1 Companion = new C4898i1();
    private final String dummy;

    /* JADX WARN: Multi-variable type inference failed */
    public StepForwardAction() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ StepForwardAction copy$default(StepForwardAction stepForwardAction, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stepForwardAction.dummy;
        }
        return stepForwardAction.copy(str);
    }

    public static final /* synthetic */ void write$Self(StepForwardAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Action.write$Self(self, output, serialDesc);
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && AbstractC22676k.m65745e(self.dummy, "step_forward")) {
            return;
        }
        output.encodeStringElement(serialDesc, 0, self.dummy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDummy() {
        return this.dummy;
    }

    public final StepForwardAction copy(String dummy) {
        AbstractC22676k.m65750j(dummy, "dummy");
        return new StepForwardAction(dummy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StepForwardAction) && AbstractC22676k.m65745e(this.dummy, ((StepForwardAction) other).dummy);
    }

    public final String getDummy() {
        return this.dummy;
    }

    public int hashCode() {
        return this.dummy.hashCode();
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("StepForwardAction(dummy="), this.dummy, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ StepForwardAction(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if ((i13 & 1) == 0) {
            this.dummy = "step_forward";
        } else {
            this.dummy = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepForwardAction(String dummy) {
        super(null);
        AbstractC22676k.m65750j(dummy, "dummy");
        this.dummy = dummy;
    }

    public /* synthetic */ StepForwardAction(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "step_forward" : str);
    }
}
