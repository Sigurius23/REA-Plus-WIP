package sr1;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sw0.C33050g;

/* JADX INFO: renamed from: sr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lsr1/b;", "", "", "isLoading", "isError", "", "performFuzzySearch", "Lsw0/g;", "bottomSheet", "<init>", "(ZZLjava/lang/String;Lsw0/g;)V", "a", "(ZZLjava/lang/String;Lsw0/g;)Lsr1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "e", "c", "Ljava/lang/String;", "d", "Lsw0/g;", "()Lsw0/g;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32910b {

    /* JADX INFO: renamed from: e */
    public static final int f137137e = C33050g.f137810m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String performFuzzySearch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33050g bottomSheet;

    public C32910b(boolean z4, boolean z13, String str, C33050g c33050g) {
        this.isLoading = z4;
        this.isError = z13;
        this.performFuzzySearch = str;
        this.bottomSheet = c33050g;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32910b m103306b(C32910b c32910b, boolean z4, boolean z13, String str, C33050g c33050g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c32910b.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c32910b.isError;
        }
        if ((i13 & 4) != 0) {
            str = c32910b.performFuzzySearch;
        }
        if ((i13 & 8) != 0) {
            c33050g = c32910b.bottomSheet;
        }
        return c32910b.m103307a(z4, z13, str, c33050g);
    }

    /* JADX INFO: renamed from: a */
    public final C32910b m103307a(boolean isLoading, boolean isError, String performFuzzySearch, C33050g bottomSheet) {
        return new C32910b(isLoading, isError, performFuzzySearch, bottomSheet);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33050g getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPerformFuzzySearch() {
        return this.performFuzzySearch;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32910b)) {
            return false;
        }
        C32910b c32910b = (C32910b) other;
        return this.isLoading == c32910b.isLoading && this.isError == c32910b.isError && AbstractC22676k.m65745e(this.performFuzzySearch, c32910b.performFuzzySearch) && AbstractC22676k.m65745e(this.bottomSheet, c32910b.bottomSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        String str = this.performFuzzySearch;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        C33050g c33050g = this.bottomSheet;
        return iHashCode + (c33050g != null ? c33050g.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        String str = this.performFuzzySearch;
        C33050g c33050g = this.bottomSheet;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CustomizeJournalDomainState(isLoading=", ", isError=", ", performFuzzySearch=", z4, z13);
        sbM32002u.append(str);
        sbM32002u.append(", bottomSheet=");
        sbM32002u.append(c33050g);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C32910b(boolean z4, boolean z13, String str, C33050g c33050g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : c33050g);
    }
}
