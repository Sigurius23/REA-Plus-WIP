package p736sz0;

import java.util.List;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: sz0.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lsz0/h0;", "Lm91/u;", "", "Lsz0/e0;", "items", "Lny0/p0;", "cta", "<init>", "(Ljava/util/List;Lny0/p0;)V", "a", "(Ljava/util/List;Lny0/p0;)Lsz0/h0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lny0/p0;", "c", "()Lny0/p0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33184h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f138370c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C33175e0> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27273p0 cta;

    public C33184h0(List<C33175e0> items, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.cta = c27273p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33184h0 m105155b(C33184h0 c33184h0, List list, C27273p0 c27273p0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c33184h0.items;
        }
        if ((i13 & 2) != 0) {
            c27273p0 = c33184h0.cta;
        }
        return c33184h0.m105156a(list, c27273p0);
    }

    /* JADX INFO: renamed from: a */
    public final C33184h0 m105156a(List<C33175e0> items, C27273p0 cta) {
        AbstractC22676k.m65750j(items, "items");
        return new C33184h0(items, cta);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27273p0 getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: e */
    public final List<C33175e0> m105158e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33184h0)) {
            return false;
        }
        C33184h0 c33184h0 = (C33184h0) other;
        return AbstractC22676k.m65745e(this.items, c33184h0.items) && AbstractC22676k.m65745e(this.cta, c33184h0.cta);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        C27273p0 c27273p0 = this.cta;
        return iHashCode + (c27273p0 == null ? 0 : c27273p0.hashCode());
    }

    public String toString() {
        return "NumberedListViewState(items=" + this.items + ", cta=" + this.cta + ")";
    }
}
