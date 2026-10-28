package ds1;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ds1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lds1/k;", "", "", "isLoading", "Lds1/j;", "isError", "isSaving", "isJournalSaved", "isIntraday", "Lds1/e;", "isSuccess", "<init>", "(ZLds1/j;ZZZLds1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lds1/j;", "()Lds1/j;", "c", "e", "f", "Lds1/e;", "()Lds1/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12341k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12340j isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSaving;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isJournalSaved;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isIntraday;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C12335e isSuccess;

    public C12341k(boolean z4, C12340j c12340j, boolean z13, boolean z14, boolean z15, C12335e isSuccess) {
        AbstractC22676k.m65750j(isSuccess, "isSuccess");
        this.isLoading = z4;
        this.isError = c12340j;
        this.isSaving = z13;
        this.isJournalSaved = z14;
        this.isIntraday = z15;
        this.isSuccess = isSuccess;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C12340j getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsIntraday() {
        return this.isIntraday;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsJournalSaved() {
        return this.isJournalSaved;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12341k)) {
            return false;
        }
        C12341k c12341k = (C12341k) other;
        return this.isLoading == c12341k.isLoading && AbstractC22676k.m65745e(this.isError, c12341k.isError) && this.isSaving == c12341k.isSaving && this.isJournalSaved == c12341k.isJournalSaved && this.isIntraday == c12341k.isIntraday && AbstractC22676k.m65745e(this.isSuccess, c12341k.isSuccess);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C12335e getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        C12340j c12340j = this.isError;
        return this.isSuccess.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (c12340j == null ? 0 : c12340j.hashCode())) * 31, 31, this.isSaving), 31, this.isJournalSaved), 31, this.isIntraday);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        C12340j c12340j = this.isError;
        boolean z13 = this.isSaving;
        boolean z14 = this.isJournalSaved;
        boolean z15 = this.isIntraday;
        C12335e c12335e = this.isSuccess;
        StringBuilder sb4 = new StringBuilder("JournalViewState(isLoading=");
        sb4.append(z4);
        sb4.append(", isError=");
        sb4.append(c12340j);
        sb4.append(", isSaving=");
        AbstractC38963t7.m124392v(sb4, z13, ", isJournalSaved=", z14, ", isIntraday=");
        sb4.append(z15);
        sb4.append(", isSuccess=");
        sb4.append(c12335e);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C12341k(boolean z4, C12340j c12340j, boolean z13, boolean z14, boolean z15, C12335e c12335e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : c12340j, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) == 0 ? z15 : false, (i13 & 32) != 0 ? new C12335e(null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, false, null, null, null, null, 4194303, null) : c12335e);
    }
}
