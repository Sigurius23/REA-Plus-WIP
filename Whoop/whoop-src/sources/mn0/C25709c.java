package mn0;

import jn0.C21801d;
import nn0.C26864a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lmn0/c;", "", "", "isLoading", "isError", "Lnn0/a;", "bffData", "Ljn0/d;", "joinChallengeState", "<init>", "(ZZLnn0/a;Ljn0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Lnn0/a;", "()Lnn0/a;", "Ljn0/d;", "()Ljn0/d;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25709c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26864a bffData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21801d joinChallengeState;

    public C25709c(boolean z4, boolean z13, C26864a c26864a, C21801d c21801d) {
        this.isLoading = z4;
        this.isError = z13;
        this.bffData = c26864a;
        this.joinChallengeState = c21801d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26864a getBffData() {
        return this.bffData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C21801d getJoinChallengeState() {
        return this.joinChallengeState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25709c)) {
            return false;
        }
        C25709c c25709c = (C25709c) other;
        return this.isLoading == c25709c.isLoading && this.isError == c25709c.isError && AbstractC22676k.m65745e(this.bffData, c25709c.bffData) && AbstractC22676k.m65745e(this.joinChallengeState, c25709c.joinChallengeState);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C26864a c26864a = this.bffData;
        int iHashCode = (iM8289b + (c26864a == null ? 0 : c26864a.hashCode())) * 31;
        C21801d c21801d = this.joinChallengeState;
        return iHashCode + (c21801d != null ? c21801d.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C26864a c26864a = this.bffData;
        C21801d c21801d = this.joinChallengeState;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ChallengeDetailsViewState(isLoading=", ", isError=", ", bffData=", z4, z13);
        sbM32002u.append(c26864a);
        sbM32002u.append(", joinChallengeState=");
        sbM32002u.append(c21801d);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C25709c(boolean z4, boolean z13, C26864a c26864a, C21801d c21801d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c26864a, (i13 & 8) != 0 ? null : c21801d);
    }
}
