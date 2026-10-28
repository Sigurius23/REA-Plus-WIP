package uu2;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: uu2.y */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, m65681d2 = {"Luu2/y;", "", "Luu2/j0;", "fullScreenModal", "Luu2/o;", "content", "", "navigateBackAfterSuccessfulDelete", "deleteCustomExerciseFailed", "dismissPresentedModal", "<init>", "(Luu2/j0;Luu2/o;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Luu2/j0;", "d", "()Luu2/j0;", "b", "Luu2/o;", "()Luu2/o;", "c", "Z", "e", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35274y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35258j0 fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35264o content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean navigateBackAfterSuccessfulDelete;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean deleteCustomExerciseFailed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean dismissPresentedModal;

    public C35274y(C35258j0 c35258j0, C35264o c35264o, boolean z4, boolean z13, boolean z14) {
        this.fullScreenModal = c35258j0;
        this.content = c35264o;
        this.navigateBackAfterSuccessfulDelete = z4;
        this.deleteCustomExerciseFailed = z13;
        this.dismissPresentedModal = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35264o getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDeleteCustomExerciseFailed() {
        return this.deleteCustomExerciseFailed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissPresentedModal() {
        return this.dismissPresentedModal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C35258j0 getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNavigateBackAfterSuccessfulDelete() {
        return this.navigateBackAfterSuccessfulDelete;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35274y)) {
            return false;
        }
        C35274y c35274y = (C35274y) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c35274y.fullScreenModal) && AbstractC22676k.m65745e(this.content, c35274y.content) && this.navigateBackAfterSuccessfulDelete == c35274y.navigateBackAfterSuccessfulDelete && this.deleteCustomExerciseFailed == c35274y.deleteCustomExerciseFailed && this.dismissPresentedModal == c35274y.dismissPresentedModal;
    }

    public int hashCode() {
        C35258j0 c35258j0 = this.fullScreenModal;
        int iHashCode = (c35258j0 == null ? 0 : c35258j0.hashCode()) * 31;
        C35264o c35264o = this.content;
        return Boolean.hashCode(this.dismissPresentedModal) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (c35264o != null ? c35264o.hashCode() : 0)) * 31, 31, this.navigateBackAfterSuccessfulDelete), 31, this.deleteCustomExerciseFailed);
    }

    public String toString() {
        C35258j0 c35258j0 = this.fullScreenModal;
        C35264o c35264o = this.content;
        boolean z4 = this.navigateBackAfterSuccessfulDelete;
        boolean z13 = this.deleteCustomExerciseFailed;
        boolean z14 = this.dismissPresentedModal;
        StringBuilder sb4 = new StringBuilder("ExerciseDetailsV2ViewState(fullScreenModal=");
        sb4.append(c35258j0);
        sb4.append(", content=");
        sb4.append(c35264o);
        sb4.append(", navigateBackAfterSuccessfulDelete=");
        AbstractC38963t7.m124392v(sb4, z4, ", deleteCustomExerciseFailed=", z13, ", dismissPresentedModal=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C35274y(C35258j0 c35258j0, C35264o c35264o, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C35258j0.INSTANCE.m111746c() : c35258j0, (i13 & 2) != 0 ? null : c35264o, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14);
    }
}
