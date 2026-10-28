package n42;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n42.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ln42/h;", "", "", "isGeneralError", "isLoading", "Ln42/g;", "screenViewState", "<init>", "(ZZLn42/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "Ln42/g;", "()Ln42/g;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26284h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isGeneralError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26283g screenViewState;

    public C26284h(boolean z4, boolean z13, C26283g c26283g) {
        this.isGeneralError = z4;
        this.isLoading = z13;
        this.screenViewState = c26283g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26283g getScreenViewState() {
        return this.screenViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsGeneralError() {
        return this.isGeneralError;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26284h)) {
            return false;
        }
        C26284h c26284h = (C26284h) other;
        return this.isGeneralError == c26284h.isGeneralError && this.isLoading == c26284h.isLoading && AbstractC22676k.m65745e(this.screenViewState, c26284h.screenViewState);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isGeneralError) * 31, 31, this.isLoading);
        C26283g c26283g = this.screenViewState;
        return iM8289b + (c26283g == null ? 0 : c26283g.hashCode());
    }

    public String toString() {
        boolean z4 = this.isGeneralError;
        boolean z13 = this.isLoading;
        C26283g c26283g = this.screenViewState;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PrivacyConsentViewState(isGeneralError=", ", isLoading=", ", screenViewState=", z4, z13);
        sbM32002u.append(c26283g);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C26284h(boolean z4, boolean z13, C26283g c26283g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c26283g);
    }
}
