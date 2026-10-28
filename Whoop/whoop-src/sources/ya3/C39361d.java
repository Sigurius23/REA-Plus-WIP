package ya3;

import c93.InterfaceC4351m;
import java.util.Collection;
import m83.AbstractC25265s;
import p133f1.C13968p1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import r93.InterfaceC31168z;
import u93.AbstractC34677g0;

/* JADX INFO: renamed from: ya3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C39361d {

    /* JADX INFO: renamed from: a */
    public static final C39361d f169412a = new C39361d();

    /* JADX INFO: renamed from: c */
    public static InterfaceC31155s0 m125516c(InterfaceC31108b interfaceC31108b) {
        while (interfaceC31108b instanceof InterfaceC31111c) {
            InterfaceC31111c interfaceC31111c = (InterfaceC31111c) interfaceC31108b;
            if (interfaceC31111c.getKind() != 2) {
                break;
            }
            Collection collectionMo78673h = interfaceC31111c.mo78673h();
            AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
            interfaceC31108b = (InterfaceC31111c) AbstractC25265s.m74144q1(collectionMo78673h);
            if (interfaceC31108b == null) {
                return null;
            }
        }
        return interfaceC31108b.getSource();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m125517a(InterfaceC31135k interfaceC31135k, InterfaceC31135k interfaceC31135k2, boolean z4) {
        if ((interfaceC31135k instanceof InterfaceC31117e) && (interfaceC31135k2 instanceof InterfaceC31117e)) {
            return AbstractC22676k.m65745e(((InterfaceC31117e) interfaceC31135k).mo60496e(), ((InterfaceC31117e) interfaceC31135k2).mo60496e());
        }
        if ((interfaceC31135k instanceof InterfaceC31165x0) && (interfaceC31135k2 instanceof InterfaceC31165x0)) {
            return m125518b((InterfaceC31165x0) interfaceC31135k, (InterfaceC31165x0) interfaceC31135k2, z4, C39360c.f169410x);
        }
        if (!(interfaceC31135k instanceof InterfaceC31108b) || !(interfaceC31135k2 instanceof InterfaceC31108b)) {
            return ((interfaceC31135k instanceof InterfaceC31124g0) && (interfaceC31135k2 instanceof InterfaceC31124g0)) ? AbstractC22676k.m65745e(((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135k)).f146067F, ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135k2)).f146067F) : AbstractC22676k.m65745e(interfaceC31135k, interfaceC31135k2);
        }
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) interfaceC31135k;
        InterfaceC31108b interfaceC31108b2 = (InterfaceC31108b) interfaceC31135k2;
        if (!interfaceC31108b.equals(interfaceC31108b2)) {
            if (AbstractC22676k.m65745e(interfaceC31108b.getName(), interfaceC31108b2.getName()) && ((!(interfaceC31108b instanceof InterfaceC31168z) || !(interfaceC31108b2 instanceof InterfaceC31168z) || ((InterfaceC31168z) interfaceC31108b).mo60493U() == ((InterfaceC31168z) interfaceC31108b2).mo60493U()) && ((!AbstractC22676k.m65745e(interfaceC31108b.mo60581g(), interfaceC31108b2.mo60581g()) || (z4 && AbstractC22676k.m65745e(m125516c(interfaceC31108b), m125516c(interfaceC31108b2)))) && !AbstractC39363f.m125531m(interfaceC31108b) && !AbstractC39363f.m125531m(interfaceC31108b2)))) {
                InterfaceC31135k interfaceC31135kMo60581g = interfaceC31108b.mo60581g();
                InterfaceC31135k interfaceC31135kMo60581g2 = interfaceC31108b2.mo60581g();
                if (((interfaceC31135kMo60581g instanceof InterfaceC31111c) || (interfaceC31135kMo60581g2 instanceof InterfaceC31111c)) ? false : m125517a(interfaceC31135kMo60581g, interfaceC31135kMo60581g2, z4)) {
                    C39371n c39371n = new C39371n(new C13968p1(interfaceC31108b, interfaceC31108b2, z4));
                    if (c39371n.m125567m(interfaceC31108b, interfaceC31108b2, null, true).m125549b() != 1 || c39371n.m125567m(interfaceC31108b2, interfaceC31108b, null, true).m125549b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m125518b(InterfaceC31165x0 a5, InterfaceC31165x0 b, boolean z4, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        if (a5.equals(b)) {
            return true;
        }
        if (AbstractC22676k.m65745e(a5.mo60581g(), b.mo60581g())) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g = a5.mo60581g();
        InterfaceC31135k interfaceC31135kMo60581g2 = b.mo60581g();
        return (((interfaceC31135kMo60581g instanceof InterfaceC31111c) || (interfaceC31135kMo60581g2 instanceof InterfaceC31111c)) ? ((Boolean) interfaceC4351m.invoke(interfaceC31135kMo60581g, interfaceC31135kMo60581g2)).booleanValue() : m125517a(interfaceC31135kMo60581g, interfaceC31135kMo60581g2, z4)) && a5.getIndex() == b.getIndex();
    }
}
