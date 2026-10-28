package hc2;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hc2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lhc2/b;", "", "", "isLoading", "showPauseButton", "showUnpauseButton", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17154b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showPauseButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showUnpauseButton;

    public C17154b(boolean z4, boolean z13, boolean z14) {
        this.isLoading = z4;
        this.showPauseButton = z13;
        this.showUnpauseButton = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowPauseButton() {
        return this.showPauseButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowUnpauseButton() {
        return this.showUnpauseButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17154b)) {
            return false;
        }
        C17154b c17154b = (C17154b) other;
        return this.isLoading == c17154b.isLoading && this.showPauseButton == c17154b.showPauseButton && this.showUnpauseButton == c17154b.showUnpauseButton;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showUnpauseButton) + AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.showPauseButton);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.showPauseButton;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("MembershipPauseInfoViewState(isLoading=", ", showPauseButton=", ", showUnpauseButton=", z4, z13), this.showUnpauseButton, ")");
    }

    public /* synthetic */ C17154b(boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14);
    }
}
