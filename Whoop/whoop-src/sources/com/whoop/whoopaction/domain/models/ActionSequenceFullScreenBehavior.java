package com.whoop.whoopaction.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "", "", "showLoading", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "loadingTreatment", "showSaving", "showSuccess", "showError", "<init>", "(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "component3", "component4", "component5", "copy", "(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowLoading", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "getLoadingTreatment", "getShowSaving", "getShowSuccess", "getShowError", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActionSequenceFullScreenBehavior {
    private final LoadingTreatment loadingTreatment;
    private final boolean showError;
    private final boolean showLoading;
    private final boolean showSaving;
    private final boolean showSuccess;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActionSequenceFullScreenBehavior$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActionSequenceFullScreenBehavior(int i13, boolean z4, LoadingTreatment loadingTreatment, boolean z13, boolean z14, boolean z15, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, ActionSequenceFullScreenBehavior$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.showLoading = false;
        } else {
            this.showLoading = z4;
        }
        this.loadingTreatment = loadingTreatment;
        if ((i13 & 4) == 0) {
            this.showSaving = false;
        } else {
            this.showSaving = z13;
        }
        if ((i13 & 8) == 0) {
            this.showSuccess = false;
        } else {
            this.showSuccess = z14;
        }
        if ((i13 & 16) == 0) {
            this.showError = true;
        } else {
            this.showError = z15;
        }
    }

    public static /* synthetic */ ActionSequenceFullScreenBehavior copy$default(ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior, boolean z4, LoadingTreatment loadingTreatment, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = actionSequenceFullScreenBehavior.showLoading;
        }
        if ((i13 & 2) != 0) {
            loadingTreatment = actionSequenceFullScreenBehavior.loadingTreatment;
        }
        if ((i13 & 4) != 0) {
            z13 = actionSequenceFullScreenBehavior.showSaving;
        }
        if ((i13 & 8) != 0) {
            z14 = actionSequenceFullScreenBehavior.showSuccess;
        }
        if ((i13 & 16) != 0) {
            z15 = actionSequenceFullScreenBehavior.showError;
        }
        boolean z16 = z15;
        boolean z17 = z13;
        return actionSequenceFullScreenBehavior.copy(z4, loadingTreatment, z17, z14, z16);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(ActionSequenceFullScreenBehavior self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showLoading) {
            output.encodeBooleanElement(serialDesc, 0, self.showLoading);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, LoadingTreatment$$serializer.INSTANCE, self.loadingTreatment);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.showSaving) {
            output.encodeBooleanElement(serialDesc, 2, self.showSaving);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.showSuccess) {
            output.encodeBooleanElement(serialDesc, 3, self.showSuccess);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.showError) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 4, self.showError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoadingTreatment getLoadingTreatment() {
        return this.loadingTreatment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowSaving() {
        return this.showSaving;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    public final ActionSequenceFullScreenBehavior copy(boolean showLoading, LoadingTreatment loadingTreatment, boolean showSaving, boolean showSuccess, boolean showError) {
        return new ActionSequenceFullScreenBehavior(showLoading, loadingTreatment, showSaving, showSuccess, showError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionSequenceFullScreenBehavior)) {
            return false;
        }
        ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior = (ActionSequenceFullScreenBehavior) other;
        return this.showLoading == actionSequenceFullScreenBehavior.showLoading && AbstractC22676k.m65745e(this.loadingTreatment, actionSequenceFullScreenBehavior.loadingTreatment) && this.showSaving == actionSequenceFullScreenBehavior.showSaving && this.showSuccess == actionSequenceFullScreenBehavior.showSuccess && this.showError == actionSequenceFullScreenBehavior.showError;
    }

    public final LoadingTreatment getLoadingTreatment() {
        return this.loadingTreatment;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowSaving() {
        return this.showSaving;
    }

    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showLoading) * 31;
        LoadingTreatment loadingTreatment = this.loadingTreatment;
        return Boolean.hashCode(this.showError) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (loadingTreatment == null ? 0 : loadingTreatment.hashCode())) * 31, 31, this.showSaving), 31, this.showSuccess);
    }

    public String toString() {
        boolean z4 = this.showLoading;
        LoadingTreatment loadingTreatment = this.loadingTreatment;
        boolean z13 = this.showSaving;
        boolean z14 = this.showSuccess;
        boolean z15 = this.showError;
        StringBuilder sb4 = new StringBuilder("ActionSequenceFullScreenBehavior(showLoading=");
        sb4.append(z4);
        sb4.append(", loadingTreatment=");
        sb4.append(loadingTreatment);
        sb4.append(", showSaving=");
        AbstractC38963t7.m124392v(sb4, z13, ", showSuccess=", z14, ", showError=");
        return AbstractC18489d0.m53372m(sb4, z15, ")");
    }

    public ActionSequenceFullScreenBehavior(boolean z4, LoadingTreatment loadingTreatment, boolean z13, boolean z14, boolean z15) {
        this.showLoading = z4;
        this.loadingTreatment = loadingTreatment;
        this.showSaving = z13;
        this.showSuccess = z14;
        this.showError = z15;
    }

    public /* synthetic */ ActionSequenceFullScreenBehavior(boolean z4, LoadingTreatment loadingTreatment, boolean z13, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, loadingTreatment, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? true : z15);
    }
}
