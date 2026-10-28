package bl2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bl2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lbl2/e;", "", "", "isLoading", "isActivityDetectionEnabled", "isError", "saveComplete", "<init>", "(ZZZZ)V", "a", "(ZZZZ)Lbl2/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3376e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isActivityDetectionEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean saveComplete;

    public C3376e(boolean z4, boolean z13, boolean z14, boolean z15) {
        this.isLoading = z4;
        this.isActivityDetectionEnabled = z13;
        this.isError = z14;
        this.saveComplete = z15;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3376e m9756b(C3376e c3376e, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c3376e.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c3376e.isActivityDetectionEnabled;
        }
        if ((i13 & 4) != 0) {
            z14 = c3376e.isError;
        }
        if ((i13 & 8) != 0) {
            z15 = c3376e.saveComplete;
        }
        return c3376e.m9757a(z4, z13, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C3376e m9757a(boolean isLoading, boolean isActivityDetectionEnabled, boolean isError, boolean saveComplete) {
        return new C3376e(isLoading, isActivityDetectionEnabled, isError, saveComplete);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSaveComplete() {
        return this.saveComplete;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsActivityDetectionEnabled() {
        return this.isActivityDetectionEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3376e)) {
            return false;
        }
        C3376e c3376e = (C3376e) other;
        return this.isLoading == c3376e.isLoading && this.isActivityDetectionEnabled == c3376e.isActivityDetectionEnabled && this.isError == c3376e.isError && this.saveComplete == c3376e.saveComplete;
    }

    public int hashCode() {
        return Boolean.hashCode(this.saveComplete) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isActivityDetectionEnabled), 31, this.isError);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isActivityDetectionEnabled;
        return AbstractC36095b.m114682j(AbstractC11895b.m32002u("ActivityDetectionViewState(isLoading=", ", isActivityDetectionEnabled=", ", isError=", z4, z13), this.isError, ", saveComplete=", this.saveComplete, ")");
    }

    public /* synthetic */ C3376e(boolean z4, boolean z13, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
