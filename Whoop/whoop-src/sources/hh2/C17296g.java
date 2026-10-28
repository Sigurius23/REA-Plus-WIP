package hh2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hh2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lhh2/g;", "", "", "isGeneralError", "isLoading", "Lhh2/f;", "stealthModeScreenViewState", "Lhh2/a;", "explainerScreenViewState", "<init>", "(ZZLhh2/f;Lhh2/a;)V", "a", "(ZZLhh2/f;Lhh2/a;)Lhh2/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "e", "c", "Lhh2/f;", "()Lhh2/f;", "Lhh2/a;", "getExplainerScreenViewState", "()Lhh2/a;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17296g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isGeneralError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17295f stealthModeScreenViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC17290a explainerScreenViewState;

    public C17296g(boolean z4, boolean z13, C17295f c17295f, AbstractC17290a abstractC17290a) {
        this.isGeneralError = z4;
        this.isLoading = z13;
        this.stealthModeScreenViewState = c17295f;
        this.explainerScreenViewState = abstractC17290a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17296g m48982b(C17296g c17296g, boolean z4, boolean z13, C17295f c17295f, AbstractC17290a abstractC17290a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c17296g.isGeneralError;
        }
        if ((i13 & 2) != 0) {
            z13 = c17296g.isLoading;
        }
        if ((i13 & 4) != 0) {
            c17295f = c17296g.stealthModeScreenViewState;
        }
        if ((i13 & 8) != 0) {
            abstractC17290a = c17296g.explainerScreenViewState;
        }
        return c17296g.m48983a(z4, z13, c17295f, abstractC17290a);
    }

    /* JADX INFO: renamed from: a */
    public final C17296g m48983a(boolean isGeneralError, boolean isLoading, C17295f stealthModeScreenViewState, AbstractC17290a explainerScreenViewState) {
        return new C17296g(isGeneralError, isLoading, stealthModeScreenViewState, explainerScreenViewState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17295f getStealthModeScreenViewState() {
        return this.stealthModeScreenViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsGeneralError() {
        return this.isGeneralError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17296g)) {
            return false;
        }
        C17296g c17296g = (C17296g) other;
        return this.isGeneralError == c17296g.isGeneralError && this.isLoading == c17296g.isLoading && AbstractC22676k.m65745e(this.stealthModeScreenViewState, c17296g.stealthModeScreenViewState) && AbstractC22676k.m65745e(this.explainerScreenViewState, c17296g.explainerScreenViewState);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isGeneralError) * 31, 31, this.isLoading);
        C17295f c17295f = this.stealthModeScreenViewState;
        return ((iM8289b + (c17295f == null ? 0 : c17295f.hashCode())) * 31) + 0;
    }

    public String toString() {
        boolean z4 = this.isGeneralError;
        boolean z13 = this.isLoading;
        C17295f c17295f = this.stealthModeScreenViewState;
        AbstractC17290a abstractC17290a = this.explainerScreenViewState;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StealthModeViewState(isGeneralError=", ", isLoading=", ", stealthModeScreenViewState=", z4, z13);
        sbM32002u.append(c17295f);
        sbM32002u.append(", explainerScreenViewState=");
        sbM32002u.append(abstractC17290a);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C17296g(boolean z4, boolean z13, C17295f c17295f, AbstractC17290a abstractC17290a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c17295f, (i13 & 8) != 0 ? null : abstractC17290a);
    }
}
