package u61;

import i71.C18200d;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lu61/a;", "", "", "Lu61/e;", "points", "Lk61/a;", "fillState", "Lk61/c;", "strokeState", "Li71/d;", "scrollerOffset", "<init>", "(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)V", "a", "(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;)Lu61/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lk61/a;", "c", "()Lk61/a;", "Lk61/c;", "f", "()Lk61/c;", "Li71/d;", "e", "()Li71/d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34552a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C34556e> points;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22228a fillState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22230c strokeState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18200d scrollerOffset;

    public C34552a(List<C34556e> points, C22228a c22228a, C22230c c22230c, C18200d scrollerOffset) {
        AbstractC22676k.m65750j(points, "points");
        AbstractC22676k.m65750j(scrollerOffset, "scrollerOffset");
        this.points = points;
        this.fillState = c22228a;
        this.strokeState = c22230c;
        this.scrollerOffset = scrollerOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34552a m109231b(C34552a c34552a, List list, C22228a c22228a, C22230c c22230c, C18200d c18200d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c34552a.points;
        }
        if ((i13 & 2) != 0) {
            c22228a = c34552a.fillState;
        }
        if ((i13 & 4) != 0) {
            c22230c = c34552a.strokeState;
        }
        if ((i13 & 8) != 0) {
            c18200d = c34552a.scrollerOffset;
        }
        return c34552a.m109232a(list, c22228a, c22230c, c18200d);
    }

    /* JADX INFO: renamed from: a */
    public final C34552a m109232a(List<C34556e> points, C22228a fillState, C22230c strokeState, C18200d scrollerOffset) {
        AbstractC22676k.m65750j(points, "points");
        AbstractC22676k.m65750j(scrollerOffset, "scrollerOffset");
        return new C34552a(points, fillState, strokeState, scrollerOffset);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22228a getFillState() {
        return this.fillState;
    }

    /* JADX INFO: renamed from: d */
    public final List<C34556e> m109234d() {
        return this.points;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18200d getScrollerOffset() {
        return this.scrollerOffset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34552a)) {
            return false;
        }
        C34552a c34552a = (C34552a) other;
        return AbstractC22676k.m65745e(this.points, c34552a.points) && AbstractC22676k.m65745e(this.fillState, c34552a.fillState) && AbstractC22676k.m65745e(this.strokeState, c34552a.strokeState) && AbstractC22676k.m65745e(this.scrollerOffset, c34552a.scrollerOffset);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C22230c getStrokeState() {
        return this.strokeState;
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        C22228a c22228a = this.fillState;
        int iHashCode2 = (iHashCode + (c22228a == null ? 0 : c22228a.hashCode())) * 31;
        C22230c c22230c = this.strokeState;
        return this.scrollerOffset.hashCode() + ((iHashCode2 + (c22230c != null ? c22230c.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "LineGraphSegmentState(points=" + this.points + ", fillState=" + this.fillState + ", strokeState=" + this.strokeState + ", scrollerOffset=" + this.scrollerOffset + ")";
    }

    public /* synthetic */ C34552a(List list, C22228a c22228a, C22230c c22230c, C18200d c18200d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : c22228a, (i13 & 4) != 0 ? null : c22230c, (i13 & 8) != 0 ? new C18200d(0, null, 3, null) : c18200d);
    }
}
