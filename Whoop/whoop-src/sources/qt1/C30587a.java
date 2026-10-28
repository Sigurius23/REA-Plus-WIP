package qt1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qt1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lqt1/a;", "", "", "x", "y", "<init>", "(ILjava/lang/Integer;)V", "a", "()I", "b", "()Ljava/lang/Integer;", "c", "(ILjava/lang/Integer;)Lqt1/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "Ljava/lang/Integer;", "f", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30587a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer y;

    public C30587a(int i13, Integer num) {
        this.x = i13;
        this.y = num;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C30587a m93824d(C30587a c30587a, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c30587a.x;
        }
        if ((i14 & 2) != 0) {
            num = c30587a.y;
        }
        return c30587a.m93827c(i13, num);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: c */
    public final C30587a m93827c(int x3, Integer y13) {
        return new C30587a(x3, y13);
    }

    /* JADX INFO: renamed from: e */
    public final int m93828e() {
        return this.x;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30587a)) {
            return false;
        }
        C30587a c30587a = (C30587a) other;
        return this.x == c30587a.x && AbstractC22676k.m65745e(this.y, c30587a.y);
    }

    /* JADX INFO: renamed from: f */
    public final Integer m93829f() {
        return this.y;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.x) * 31;
        Integer num = this.y;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "LabradorGraphPoint(x=" + this.x + ", y=" + this.y + ")";
    }
}
