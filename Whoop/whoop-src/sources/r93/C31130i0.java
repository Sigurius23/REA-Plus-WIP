package r93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.AbstractC34677g0;
import va3.C35847e;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: r93.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C31130i0 implements InterfaceC31133j0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128340a;

    public C31130i0(ArrayList arrayList) {
        this.f128340a = arrayList;
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: a */
    public final void mo52690a(C35847e fqName, ArrayList arrayList) {
        AbstractC22676k.m65750j(fqName, "fqName");
        for (Object obj : this.f128340a) {
            if (AbstractC22676k.m65745e(((AbstractC34677g0) ((InterfaceC31124g0) obj)).f146067F, fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: b */
    public final boolean mo52691b(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        ArrayList arrayList = this.f128340a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((AbstractC34677g0) ((InterfaceC31124g0) it.next())).f146067F, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: f */
    public final Collection mo52693f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return AbstractC38176k.m122276E(AbstractC38176k.m122282r(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(this.f128340a), C31156t.f128374y), new C31127h0(fqName, 0)));
    }
}
