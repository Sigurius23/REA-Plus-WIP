package gv1;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gv1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lgv1/h;", "", "", "isOverrideEnabled", "Lgv1/o;", "lottieSource", "isSheetVisible", "<init>", "(ZLgv1/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lgv1/o;", "()Lgv1/o;", "c", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16234h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isOverrideEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC16241o lottieSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSheetVisible;

    public C16234h(boolean z4, AbstractC16241o abstractC16241o, boolean z13) {
        this.isOverrideEnabled = z4;
        this.lottieSource = abstractC16241o;
        this.isSheetVisible = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC16241o getLottieSource() {
        return this.lottieSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsOverrideEnabled() {
        return this.isOverrideEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSheetVisible() {
        return this.isSheetVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16234h)) {
            return false;
        }
        C16234h c16234h = (C16234h) other;
        return this.isOverrideEnabled == c16234h.isOverrideEnabled && AbstractC22676k.m65745e(this.lottieSource, c16234h.lottieSource) && this.isSheetVisible == c16234h.isSheetVisible;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isOverrideEnabled) * 31;
        AbstractC16241o abstractC16241o = this.lottieSource;
        return Boolean.hashCode(this.isSheetVisible) + ((iHashCode + (abstractC16241o == null ? 0 : abstractC16241o.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.isOverrideEnabled;
        AbstractC16241o abstractC16241o = this.lottieSource;
        boolean z13 = this.isSheetVisible;
        StringBuilder sb4 = new StringBuilder("LottieTesterConfig(isOverrideEnabled=");
        sb4.append(z4);
        sb4.append(", lottieSource=");
        sb4.append(abstractC16241o);
        sb4.append(", isSheetVisible=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C16234h(boolean z4, AbstractC16241o abstractC16241o, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : abstractC16241o, (i13 & 4) != 0 ? false : z13);
    }
}
