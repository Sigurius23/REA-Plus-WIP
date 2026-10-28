package i71;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p181h2.C16620e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i71.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c¨\u0006%"}, m65681d2 = {"Li71/h;", "", "Lh2/b;", "position", "Lh2/e;", "scrollContentSize", "scrollViewSize", "", "zoomScale", "<init>", "(JJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "numerator", "denominator", "f", "(FF)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "getScrollContentSize-NH-jbRc", "d", "F", "e", "()F", "normalized", "normalizedEnd", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18204h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long scrollContentSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long scrollViewSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float zoomScale;

    public /* synthetic */ C18204h(long j7, long j13, long j14, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, j14, f13);
    }

    /* JADX INFO: renamed from: f */
    private final float m52265f(float numerator, float denominator) {
        if (denominator > 0.0f) {
            return numerator / denominator;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final long m52266a() {
        float fM52265f = m52265f(Float.intBitsToFloat((int) (this.position >> 32)), Float.intBitsToFloat((int) (this.scrollContentSize >> 32)));
        return (((long) Float.floatToRawIntBits(m52265f(Float.intBitsToFloat((int) (this.position & 4294967295L)), Float.intBitsToFloat((int) (this.scrollContentSize & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fM52265f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public final long m52267b() {
        float fM52265f = m52265f(Float.intBitsToFloat((int) (this.scrollViewSize >> 32)) + Float.intBitsToFloat((int) (this.position >> 32)), Float.intBitsToFloat((int) (this.scrollContentSize >> 32)));
        return (((long) Float.floatToRawIntBits(m52265f(Float.intBitsToFloat((int) (this.position & 4294967295L)), Float.intBitsToFloat((int) (this.scrollContentSize & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fM52265f) << 32);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getScrollViewSize() {
        return this.scrollViewSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getZoomScale() {
        return this.zoomScale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18204h)) {
            return false;
        }
        C18204h c18204h = (C18204h) other;
        return C16617b.m47187c(this.position, c18204h.position) && C16620e.m47210b(this.scrollContentSize, c18204h.scrollContentSize) && C16620e.m47210b(this.scrollViewSize, c18204h.scrollViewSize) && Float.compare(this.zoomScale, c18204h.zoomScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.zoomScale) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.position) * 31, this.scrollContentSize, 31), this.scrollViewSize, 31);
    }

    public String toString() {
        String strM47194j = C16617b.m47194j(this.position);
        String strM47216h = C16620e.m47216h(this.scrollContentSize);
        String strM47216h2 = C16620e.m47216h(this.scrollViewSize);
        float f13 = this.zoomScale;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GraphScrollPosition(position=", strM47194j, ", scrollContentSize=", strM47216h, ", scrollViewSize=");
        sbM32001t.append(strM47216h2);
        sbM32001t.append(", zoomScale=");
        sbM32001t.append(f13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C18204h(long j7, long j13, long j14, float f13) {
        this.position = j7;
        this.scrollContentSize = j13;
        this.scrollViewSize = j14;
        this.zoomScale = f13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C18204h(long j7, long j13, long j14, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        j7 = (i13 & 1) != 0 ? 0L : j7;
        j13 = (i13 & 2) != 0 ? 0L : j13;
        long j15 = (i13 & 4) == 0 ? j14 : 0L;
        this(j7, j13, j15, (i13 & 8) != 0 ? Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j15 >> 32)) : f13, null);
    }
}
