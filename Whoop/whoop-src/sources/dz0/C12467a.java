package dz0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Ldz0/a;", "", "", "lastTouch", "positionOfX", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "()Ljava/lang/Float;", "c", "(Ljava/lang/Float;)V", "b", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12467a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Float lastTouch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Float positionOfX;

    public C12467a(Float f13, Float f14) {
        this.lastTouch = f13;
        this.positionOfX = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getLastTouch() {
        return this.lastTouch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getPositionOfX() {
        return this.positionOfX;
    }

    /* JADX INFO: renamed from: c */
    public final void m35097c(Float f13) {
        this.lastTouch = f13;
    }

    /* JADX INFO: renamed from: d */
    public final void m35098d(Float f13) {
        this.positionOfX = f13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12467a)) {
            return false;
        }
        C12467a c12467a = (C12467a) other;
        return AbstractC22676k.m65745e(this.lastTouch, c12467a.lastTouch) && AbstractC22676k.m65745e(this.positionOfX, c12467a.positionOfX);
    }

    public int hashCode() {
        Float f13 = this.lastTouch;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.positionOfX;
        return iHashCode + (f14 != null ? f14.hashCode() : 0);
    }

    public String toString() {
        return "InternalScrubberState(lastTouch=" + this.lastTouch + ", positionOfX=" + this.positionOfX + ")";
    }

    public /* synthetic */ C12467a(Float f13, Float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : f14);
    }
}
