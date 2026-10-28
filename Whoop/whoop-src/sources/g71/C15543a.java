package g71;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import yy0.C39889c;

/* JADX INFO: renamed from: g71.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lg71/a;", "", "", "Lg71/d;", "zoomBuckets", "<init>", "(Ljava/util/List;)V", "", "zoomLevels", "Lyy0/c;", "a", "(F)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getZoomBuckets", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15543a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C15546d> zoomBuckets;

    public C15543a(List<C15546d> zoomBuckets) {
        AbstractC22676k.m65750j(zoomBuckets, "zoomBuckets");
        this.zoomBuckets = zoomBuckets;
    }

    /* JADX INFO: renamed from: a */
    public final List<C39889c> m43739a(float zoomLevels) {
        List<C15546d> list = this.zoomBuckets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (zoomLevels >= ((C15546d) obj).getZoomThreshold()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, ((C15546d) it.next()).m43748a());
        }
        return arrayList2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C15543a) && AbstractC22676k.m65745e(this.zoomBuckets, ((C15543a) other).zoomBuckets);
    }

    public int hashCode() {
        return this.zoomBuckets.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("AxisZoomer(zoomBuckets=", ")", this.zoomBuckets);
    }
}
