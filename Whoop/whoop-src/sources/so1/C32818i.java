package so1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lso1/i;", "", "Lso1/j;", "editOption", "Lso1/k;", "hideOption", "Lso1/o0;", "unhideOption", "<init>", "(Lso1/j;Lso1/k;Lso1/o0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lso1/j;", "()Lso1/j;", "b", "Lso1/k;", "()Lso1/k;", "c", "Lso1/o0;", "()Lso1/o0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32818i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32820j editOption;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32822k hideOption;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32831o0 unhideOption;

    public C32818i(C32820j c32820j, C32822k c32822k, C32831o0 c32831o0) {
        this.editOption = c32820j;
        this.hideOption = c32822k;
        this.unhideOption = c32831o0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32820j getEditOption() {
        return this.editOption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C32822k getHideOption() {
        return this.hideOption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C32831o0 getUnhideOption() {
        return this.unhideOption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32818i)) {
            return false;
        }
        C32818i c32818i = (C32818i) other;
        return AbstractC22676k.m65745e(this.editOption, c32818i.editOption) && AbstractC22676k.m65745e(this.hideOption, c32818i.hideOption) && AbstractC22676k.m65745e(this.unhideOption, c32818i.unhideOption);
    }

    public int hashCode() {
        C32820j c32820j = this.editOption;
        int iHashCode = (c32820j == null ? 0 : c32820j.hashCode()) * 31;
        C32822k c32822k = this.hideOption;
        int iHashCode2 = (iHashCode + (c32822k == null ? 0 : c32822k.hashCode())) * 31;
        C32831o0 c32831o0 = this.unhideOption;
        return iHashCode2 + (c32831o0 != null ? c32831o0.hashCode() : 0);
    }

    public String toString() {
        return "EditCycleBottomSheetState(editOption=" + this.editOption + ", hideOption=" + this.hideOption + ", unhideOption=" + this.unhideOption + ")";
    }
}
