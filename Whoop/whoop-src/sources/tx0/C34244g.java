package tx0;

import gv1.AbstractC16241o;
import i51.AbstractC18111h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tx0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ltx0/g;", "", "", "isOverrideEnabled", "isSelectLottieSheetVisible", "Lgv1/o;", "lottieSource", "Li51/h;", "celebrationMediaSource", "<init>", "(ZZLgv1/o;Li51/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "d", "Lgv1/o;", "()Lgv1/o;", "Li51/h;", "()Li51/h;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34244g {

    /* JADX INFO: renamed from: e */
    public static final int f143633e = AbstractC18111h.f70326a | AbstractC16241o.f61698a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isOverrideEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelectLottieSheetVisible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC16241o lottieSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC18111h celebrationMediaSource;

    public C34244g(boolean z4, boolean z13, AbstractC16241o abstractC16241o, AbstractC18111h abstractC18111h) {
        this.isOverrideEnabled = z4;
        this.isSelectLottieSheetVisible = z13;
        this.lottieSource = abstractC16241o;
        this.celebrationMediaSource = abstractC18111h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18111h getCelebrationMediaSource() {
        return this.celebrationMediaSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC16241o getLottieSource() {
        return this.lottieSource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsOverrideEnabled() {
        return this.isOverrideEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSelectLottieSheetVisible() {
        return this.isSelectLottieSheetVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34244g)) {
            return false;
        }
        C34244g c34244g = (C34244g) other;
        return this.isOverrideEnabled == c34244g.isOverrideEnabled && this.isSelectLottieSheetVisible == c34244g.isSelectLottieSheetVisible && AbstractC22676k.m65745e(this.lottieSource, c34244g.lottieSource) && AbstractC22676k.m65745e(this.celebrationMediaSource, c34244g.celebrationMediaSource);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isOverrideEnabled) * 31, 31, this.isSelectLottieSheetVisible);
        AbstractC16241o abstractC16241o = this.lottieSource;
        int iHashCode = (iM8289b + (abstractC16241o == null ? 0 : abstractC16241o.hashCode())) * 31;
        AbstractC18111h abstractC18111h = this.celebrationMediaSource;
        return iHashCode + (abstractC18111h != null ? abstractC18111h.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isOverrideEnabled;
        boolean z13 = this.isSelectLottieSheetVisible;
        AbstractC16241o abstractC16241o = this.lottieSource;
        AbstractC18111h abstractC18111h = this.celebrationMediaSource;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("LottieTesterViewState(isOverrideEnabled=", ", isSelectLottieSheetVisible=", ", lottieSource=", z4, z13);
        sbM32002u.append(abstractC16241o);
        sbM32002u.append(", celebrationMediaSource=");
        sbM32002u.append(abstractC18111h);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C34244g(boolean z4, boolean z13, AbstractC16241o abstractC16241o, AbstractC18111h abstractC18111h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : abstractC16241o, (i13 & 8) != 0 ? null : abstractC18111h);
    }
}
