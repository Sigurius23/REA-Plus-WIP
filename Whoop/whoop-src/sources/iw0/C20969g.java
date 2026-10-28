package iw0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;
import y01.C39020c;

/* JADX INFO: renamed from: iw0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liw0/g;", "Lm91/u;", "", "Lsz0/q;", "horizontalStatList", "Ly01/c;", "strainComparisonBar", "<init>", "(Ljava/util/List;Ly01/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ly01/c;", "()Ly01/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20969g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C33210q> horizontalStatList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39020c strainComparisonBar;

    public C20969g(List<C33210q> horizontalStatList, C39020c c39020c) {
        AbstractC22676k.m65750j(horizontalStatList, "horizontalStatList");
        this.horizontalStatList = horizontalStatList;
        this.strainComparisonBar = c39020c;
    }

    /* JADX INFO: renamed from: a */
    public final List<C33210q> m58292a() {
        return this.horizontalStatList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39020c getStrainComparisonBar() {
        return this.strainComparisonBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20969g)) {
            return false;
        }
        C20969g c20969g = (C20969g) other;
        return AbstractC22676k.m65745e(this.horizontalStatList, c20969g.horizontalStatList) && AbstractC22676k.m65745e(this.strainComparisonBar, c20969g.strainComparisonBar);
    }

    public int hashCode() {
        int iHashCode = this.horizontalStatList.hashCode() * 31;
        C39020c c39020c = this.strainComparisonBar;
        return iHashCode + (c39020c == null ? 0 : c39020c.hashCode());
    }

    public String toString() {
        return "DetailsHorizontalStatWithBreakdownState(horizontalStatList=" + this.horizontalStatList + ", strainComparisonBar=" + this.strainComparisonBar + ")";
    }
}
