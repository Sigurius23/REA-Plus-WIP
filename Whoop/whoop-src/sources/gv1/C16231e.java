package gv1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gv1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lgv1/e;", "", "Lgv1/o;", "lottieSource", "", "isSelectLottieSheetVisible", "<init>", "(Lgv1/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgv1/o;", "()Lgv1/o;", "b", "Z", "()Z", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16231e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC16241o lottieSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelectLottieSheetVisible;

    public C16231e(AbstractC16241o abstractC16241o, boolean z4) {
        this.lottieSource = abstractC16241o;
        this.isSelectLottieSheetVisible = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC16241o getLottieSource() {
        return this.lottieSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSelectLottieSheetVisible() {
        return this.isSelectLottieSheetVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16231e)) {
            return false;
        }
        C16231e c16231e = (C16231e) other;
        return AbstractC22676k.m65745e(this.lottieSource, c16231e.lottieSource) && this.isSelectLottieSheetVisible == c16231e.isSelectLottieSheetVisible;
    }

    public int hashCode() {
        AbstractC16241o abstractC16241o = this.lottieSource;
        return Boolean.hashCode(this.isSelectLottieSheetVisible) + ((abstractC16241o == null ? 0 : abstractC16241o.hashCode()) * 31);
    }

    public String toString() {
        return "LocalLottieTesterOverrideState(lottieSource=" + this.lottieSource + ", isSelectLottieSheetVisible=" + this.isSelectLottieSheetVisible + ")";
    }
}
