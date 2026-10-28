package sr1;

import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sr1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lsr1/d;", "", "", "shouldShowExitConfirmationDialog", "doesUserWantToShowExitConfirmationDialog", "<init>", "(ZZ)V", "a", "(ZZ)Lsr1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "c", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32912d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowExitConfirmationDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean doesUserWantToShowExitConfirmationDialog;

    public C32912d(boolean z4, boolean z13) {
        this.shouldShowExitConfirmationDialog = z4;
        this.doesUserWantToShowExitConfirmationDialog = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32912d m103317b(C32912d c32912d, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c32912d.shouldShowExitConfirmationDialog;
        }
        if ((i13 & 2) != 0) {
            z13 = c32912d.doesUserWantToShowExitConfirmationDialog;
        }
        return c32912d.m103318a(z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C32912d m103318a(boolean shouldShowExitConfirmationDialog, boolean doesUserWantToShowExitConfirmationDialog) {
        return new C32912d(shouldShowExitConfirmationDialog, doesUserWantToShowExitConfirmationDialog);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDoesUserWantToShowExitConfirmationDialog() {
        return this.doesUserWantToShowExitConfirmationDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShouldShowExitConfirmationDialog() {
        return this.shouldShowExitConfirmationDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32912d)) {
            return false;
        }
        C32912d c32912d = (C32912d) other;
        return this.shouldShowExitConfirmationDialog == c32912d.shouldShowExitConfirmationDialog && this.doesUserWantToShowExitConfirmationDialog == c32912d.doesUserWantToShowExitConfirmationDialog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.doesUserWantToShowExitConfirmationDialog) + (Boolean.hashCode(this.shouldShowExitConfirmationDialog) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("ExitConfirmationDialogSubDomainState(shouldShowExitConfirmationDialog=", ", doesUserWantToShowExitConfirmationDialog=", ")", this.shouldShowExitConfirmationDialog, this.doesUserWantToShowExitConfirmationDialog);
    }

    public /* synthetic */ C32912d(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? true : z13);
    }
}
