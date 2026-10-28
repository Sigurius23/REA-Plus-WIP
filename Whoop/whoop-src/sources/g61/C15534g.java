package g61;

import c13.AbstractC3855a;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g61.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lg61/g;", "", "", "left", "right", "", "Lg61/e;", "planeButtons", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15534g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer right;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C15532e> planeButtons;

    public C15534g(Integer num, Integer num2, List<C15532e> list) {
        this.left = num;
        this.right = num2;
        this.planeButtons = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: b */
    public final List<C15532e> m43734b() {
        return this.planeButtons;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getRight() {
        return this.right;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15534g)) {
            return false;
        }
        C15534g c15534g = (C15534g) other;
        return AbstractC22676k.m65745e(this.left, c15534g.left) && AbstractC22676k.m65745e(this.right, c15534g.right) && AbstractC22676k.m65745e(this.planeButtons, c15534g.planeButtons);
    }

    public int hashCode() {
        Integer num = this.left;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.right;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<C15532e> list = this.planeButtons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.left;
        Integer num2 = this.right;
        return AbstractC3855a.m11829m(AbstractC36095b.m114684l("GraphPlaneButtonState(left=", num, ", right=", num2, ", planeButtons="), this.planeButtons, ")");
    }
}
