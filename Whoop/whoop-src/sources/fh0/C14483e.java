package fh0;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fh0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lfh0/e;", "", "", "isActive", "isLoading", "showError", "<init>", "(ZZZ)V", "a", "(ZZZ)Lfh0/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "e", "c", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14483e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isActive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showError;

    public C14483e(boolean z4, boolean z13, boolean z14) {
        this.isActive = z4;
        this.isLoading = z13;
        this.showError = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14483e m41366b(C14483e c14483e, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c14483e.isActive;
        }
        if ((i13 & 2) != 0) {
            z13 = c14483e.isLoading;
        }
        if ((i13 & 4) != 0) {
            z14 = c14483e.showError;
        }
        return c14483e.m41367a(z4, z13, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C14483e m41367a(boolean isActive, boolean isLoading, boolean showError) {
        return new C14483e(isActive, isLoading, showError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14483e)) {
            return false;
        }
        C14483e c14483e = (C14483e) other;
        return this.isActive == c14483e.isActive && this.isLoading == c14483e.isLoading && this.showError == c14483e.showError;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showError) + AbstractC2875y.m8289b(Boolean.hashCode(this.isActive) * 31, 31, this.isLoading);
    }

    public String toString() {
        boolean z4 = this.isActive;
        boolean z13 = this.isLoading;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("ContextStatusToggleMiniArchViewState(isActive=", ", isLoading=", ", showError=", z4, z13), this.showError, ")");
    }

    public /* synthetic */ C14483e(boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14);
    }
}
