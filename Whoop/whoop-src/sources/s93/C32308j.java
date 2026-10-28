package s93;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25270x;
import na3.C26516c;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.C31127h0;
import va3.C35847e;
import xb3.AbstractC38176k;
import xb3.C38170e;

/* JADX INFO: renamed from: s93.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C32308j implements InterfaceC32307i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133685w;

    /* JADX INFO: renamed from: x */
    public final Object f133686x;

    public /* synthetic */ C32308j(List list, int i13) {
        this.f133685w = i13;
        this.f133686x = list;
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: J */
    public final boolean mo52688J(C35847e fqName) {
        switch (this.f133685w) {
            case 0:
                return AbstractC32306h.m100567p(this, fqName);
            case 1:
                AbstractC22676k.m65750j(fqName, "fqName");
                Iterator it = ((Iterable) AbstractC25265s.m74145r0((List) this.f133686x).f99158b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC32307i) it.next()).mo52688J(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return AbstractC32306h.m100567p(this, fqName);
        }
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: T */
    public final InterfaceC32300b mo52689T(C35847e fqName) {
        switch (this.f133685w) {
            case 0:
                return AbstractC32306h.m100565n(this, fqName);
            case 1:
                AbstractC22676k.m65750j(fqName, "fqName");
                return (InterfaceC32300b) AbstractC38176k.m122283s(AbstractC38176k.m122273B(AbstractC25265s.m74145r0((List) this.f133686x), new C31127h0(fqName, 1)));
            default:
                AbstractC22676k.m65750j(fqName, "fqName");
                if (fqName.equals((C35847e) this.f133686x)) {
                    return C26516c.f105425a;
                }
                return null;
        }
    }

    @Override // s93.InterfaceC32307i
    public final boolean isEmpty() {
        switch (this.f133685w) {
            case 0:
                return ((List) this.f133686x).isEmpty();
            case 1:
                List list = (List) this.f133686x;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC32307i) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f133685w) {
            case 0:
                return ((List) this.f133686x).iterator();
            case 1:
                return new C38170e(AbstractC38176k.m122284t(AbstractC25265s.m74145r0((List) this.f133686x), C32311m.f133691w));
            default:
                return C25270x.f99161w;
        }
    }

    public String toString() {
        switch (this.f133685w) {
            case 0:
                return ((List) this.f133686x).toString();
            default:
                return super.toString();
        }
    }

    public C32308j(InterfaceC32307i[] interfaceC32307iArr) {
        this.f133685w = 1;
        this.f133686x = AbstractC25260n.m74049W0(interfaceC32307iArr);
    }

    public C32308j(C35847e fqNameToMatch) {
        this.f133685w = 2;
        AbstractC22676k.m65750j(fqNameToMatch, "fqNameToMatch");
        this.f133686x = fqNameToMatch;
    }
}
