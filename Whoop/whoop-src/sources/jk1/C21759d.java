package jk1;

import c51.C4242s;
import ik1.AbstractC18611h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jk1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljk1/d;", "", "Lik1/h;", "healthspanViewState", "", "hasNavigatedToOnboarding", "Lc51/s;", "initialAmoeba", "<init>", "(Lik1/h;ZLc51/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lik1/h;", "b", "()Lik1/h;", "Z", "()Z", "c", "Lc51/s;", "()Lc51/s;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C21759d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18611h healthspanViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasNavigatedToOnboarding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4242s initialAmoeba;

    public C21759d(AbstractC18611h healthspanViewState, boolean z4, C4242s c4242s) {
        AbstractC22676k.m65750j(healthspanViewState, "healthspanViewState");
        this.healthspanViewState = healthspanViewState;
        this.hasNavigatedToOnboarding = z4;
        this.initialAmoeba = c4242s;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasNavigatedToOnboarding() {
        return this.hasNavigatedToOnboarding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC18611h getHealthspanViewState() {
        return this.healthspanViewState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4242s getInitialAmoeba() {
        return this.initialAmoeba;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21759d)) {
            return false;
        }
        C21759d c21759d = (C21759d) other;
        return AbstractC22676k.m65745e(this.healthspanViewState, c21759d.healthspanViewState) && this.hasNavigatedToOnboarding == c21759d.hasNavigatedToOnboarding && AbstractC22676k.m65745e(this.initialAmoeba, c21759d.initialAmoeba);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.healthspanViewState.hashCode() * 31, 31, this.hasNavigatedToOnboarding);
        C4242s c4242s = this.initialAmoeba;
        return iM8289b + (c4242s == null ? 0 : c4242s.hashCode());
    }

    public String toString() {
        return "HealthspanViewStateScanState(healthspanViewState=" + this.healthspanViewState + ", hasNavigatedToOnboarding=" + this.hasNavigatedToOnboarding + ", initialAmoeba=" + this.initialAmoeba + ")";
    }

    public /* synthetic */ C21759d(AbstractC18611h abstractC18611h, boolean z4, C4242s c4242s, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18611h, z4, (i13 & 4) != 0 ? null : c4242s);
    }
}
