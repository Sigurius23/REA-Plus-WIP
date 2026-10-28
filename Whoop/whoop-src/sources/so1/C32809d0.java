package so1;

import com.whoop.navigation.C9598e;
import j71.C21395c;
import java.util.List;
import k71.C22246d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.d0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lso1/d0;", "", "Lj71/c;", "graphState", "", "Lk71/d;", "legendList", "Lcom/whoop/navigation/e;", "infoButtonDestination", "<init>", "(Lj71/c;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj71/c;", "()Lj71/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32809d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21395c graphState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22246d> legendList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e infoButtonDestination;

    public C32809d0(C21395c c21395c, List<C22246d> legendList, C9598e c9598e) {
        AbstractC22676k.m65750j(legendList, "legendList");
        this.graphState = c21395c;
        this.legendList = legendList;
        this.infoButtonDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21395c getGraphState() {
        return this.graphState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getInfoButtonDestination() {
        return this.infoButtonDestination;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22246d> m102944c() {
        return this.legendList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32809d0)) {
            return false;
        }
        C32809d0 c32809d0 = (C32809d0) other;
        return AbstractC22676k.m65745e(this.graphState, c32809d0.graphState) && AbstractC22676k.m65745e(this.legendList, c32809d0.legendList) && AbstractC22676k.m65745e(this.infoButtonDestination, c32809d0.infoButtonDestination);
    }

    public int hashCode() {
        C21395c c21395c = this.graphState;
        int iM31983b = AbstractC11895b.m31983b((c21395c == null ? 0 : c21395c.hashCode()) * 31, 31, this.legendList);
        C9598e c9598e = this.infoButtonDestination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        C21395c c21395c = this.graphState;
        List<C22246d> list = this.legendList;
        C9598e c9598e = this.infoButtonDestination;
        StringBuilder sb4 = new StringBuilder("MciTrendsGraphViewState(graphState=");
        sb4.append(c21395c);
        sb4.append(", legendList=");
        sb4.append(list);
        sb4.append(", infoButtonDestination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
