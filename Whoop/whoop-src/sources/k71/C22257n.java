package k71;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y11.C39059l;

/* JADX INFO: renamed from: k71.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lk71/n;", "Lm91/u;", "Lk71/o;", "horizontalBarHeader", "", "Ly11/l;", "horizontalBarGraphTileStates", "<init>", "(Lk71/o;Ljava/util/List;)V", "a", "(Lk71/o;Ljava/util/List;)Lk71/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk71/o;", "e", "()Lk71/o;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22257n implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f86792c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22258o horizontalBarHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C39059l> horizontalBarGraphTileStates;

    public C22257n(C22258o c22258o, List<C39059l> horizontalBarGraphTileStates) {
        AbstractC22676k.m65750j(horizontalBarGraphTileStates, "horizontalBarGraphTileStates");
        this.horizontalBarHeader = c22258o;
        this.horizontalBarGraphTileStates = horizontalBarGraphTileStates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22257n m63917b(C22257n c22257n, C22258o c22258o, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c22258o = c22257n.horizontalBarHeader;
        }
        if ((i13 & 2) != 0) {
            list = c22257n.horizontalBarGraphTileStates;
        }
        return c22257n.m63918a(c22258o, list);
    }

    /* JADX INFO: renamed from: a */
    public final C22257n m63918a(C22258o horizontalBarHeader, List<C39059l> horizontalBarGraphTileStates) {
        AbstractC22676k.m65750j(horizontalBarGraphTileStates, "horizontalBarGraphTileStates");
        return new C22257n(horizontalBarHeader, horizontalBarGraphTileStates);
    }

    /* JADX INFO: renamed from: c */
    public final List<C39059l> m63919c() {
        return this.horizontalBarGraphTileStates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C22258o getHorizontalBarHeader() {
        return this.horizontalBarHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22257n)) {
            return false;
        }
        C22257n c22257n = (C22257n) other;
        return AbstractC22676k.m65745e(this.horizontalBarHeader, c22257n.horizontalBarHeader) && AbstractC22676k.m65745e(this.horizontalBarGraphTileStates, c22257n.horizontalBarGraphTileStates);
    }

    public int hashCode() {
        C22258o c22258o = this.horizontalBarHeader;
        return this.horizontalBarGraphTileStates.hashCode() + ((c22258o == null ? 0 : c22258o.hashCode()) * 31);
    }

    public String toString() {
        return "HeartRateBarGraphContainerState(horizontalBarHeader=" + this.horizontalBarHeader + ", horizontalBarGraphTileStates=" + this.horizontalBarGraphTileStates + ")";
    }
}
