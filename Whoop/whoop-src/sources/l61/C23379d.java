package l61;

import java.util.List;
import k61.C22228a;
import k61.C22230c;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l61.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ll61/d;", "", "", "Ll61/c;", "points", "Lk61/a;", "fillState", "Lk61/c;", "strokeState", "<init>", "(Ljava/util/List;Lk61/a;Lk61/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lk61/a;", "()Lk61/a;", "c", "Lk61/c;", "()Lk61/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23379d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C23378c> points;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22228a fillState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22230c strokeState;

    public C23379d(List<C23378c> points, C22228a c22228a, C22230c c22230c) {
        AbstractC22676k.m65750j(points, "points");
        this.points = points;
        this.fillState = c22228a;
        this.strokeState = c22230c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22228a getFillState() {
        return this.fillState;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23378c> m67671b() {
        return this.points;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22230c getStrokeState() {
        return this.strokeState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23379d)) {
            return false;
        }
        C23379d c23379d = (C23379d) other;
        return AbstractC22676k.m65745e(this.points, c23379d.points) && AbstractC22676k.m65745e(this.fillState, c23379d.fillState) && AbstractC22676k.m65745e(this.strokeState, c23379d.strokeState);
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        C22228a c22228a = this.fillState;
        int iHashCode2 = (iHashCode + (c22228a == null ? 0 : c22228a.hashCode())) * 31;
        C22230c c22230c = this.strokeState;
        return iHashCode2 + (c22230c != null ? c22230c.hashCode() : 0);
    }

    public String toString() {
        return "BandPlotSegmentState(points=" + this.points + ", fillState=" + this.fillState + ", strokeState=" + this.strokeState + ")";
    }

    public /* synthetic */ C23379d(List list, C22228a c22228a, C22230c c22230c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? new C22228a(null, null, 3, null) : c22228a, (i13 & 4) != 0 ? new C22230c(0.0f, 0, 0, null, 0L, false, 63, null) : c22230c);
    }
}
