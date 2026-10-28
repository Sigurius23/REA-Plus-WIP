package ja3;

import ab3.AbstractC0715g;
import c93.InterfaceC4339a;
import fa3.AbstractC14331x;
import hg3.AbstractC17269i;
import ia3.C18295a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import l83.C23465k;
import m83.AbstractC25247g0;
import ma3.InterfaceC25372a;
import nb3.C26555l;
import nb3.EnumC26554k;
import p037bu.C3632c;
import p249jc.AbstractC21598x;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30081e;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import x93.AbstractC38109c;
import x93.AbstractC38113e;
import x93.C38111d;
import x93.C38122n;

/* JADX INFO: renamed from: ja3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21507e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82489w;

    /* JADX INFO: renamed from: x */
    public final C21509f f82490x;

    public /* synthetic */ C21507e(C21509f c21509f, int i13) {
        this.f82489w = i13;
        this.f82490x = c21509f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.f82489w) {
            case 0:
                return AbstractC38109c.m122089a(AbstractC21598x.m60663S(AbstractC21598x.m60655K(this.f82490x.f82493b.f163219a))).m113773a();
            case 1:
                C21509f c21509f = this.f82490x;
                C35847e c35847eMo43953b = c21509f.mo43953b();
                C38111d c38111d = c21509f.f82493b;
                C41113q c41113q = c21509f.f82492a;
                if (c35847eMo43953b == null) {
                    return C26555l.m78682c(EnumC26554k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c38111d.toString());
                }
                C18295a c18295a = (C18295a) c41113q.f177224x;
                InterfaceC31109b0 interfaceC31109b0 = c18295a.f71237o;
                InterfaceC31117e interfaceC31117eM92214b = C30081e.m92214b(c35847eMo43953b, interfaceC31109b0.mo78661c());
                if (interfaceC31117eM92214b == null) {
                    C38122n c38122n = new C38122n(AbstractC21598x.m60663S(AbstractC21598x.m60655K(c38111d.f163219a)));
                    C3632c c3632c = (C3632c) c18295a.f71233k.f3422w;
                    if (c3632c == null) {
                        AbstractC22676k.m65757q("resolver");
                        throw null;
                    }
                    interfaceC31117eM92214b = c3632c.m11160I(c38122n);
                    if (interfaceC31117eM92214b == null) {
                        interfaceC31117eM92214b = AbstractC17269i.m48868O(interfaceC31109b0, new C35845c(c35847eMo43953b.m113789b(), c35847eMo43953b.f152613a.m113796g()), c18295a.f71226d.m83862c().f65746l);
                    }
                }
                return interfaceC31117eM92214b.mo60594i();
            default:
                C21509f c21509f2 = this.f82490x;
                ArrayList<InterfaceC25372a> arrayListM122096b = c21509f2.f82493b.m122096b();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC25372a interfaceC25372a : arrayListM122096b) {
                    C35850h c35850h = ((AbstractC38113e) interfaceC25372a).f163221a;
                    if (c35850h == null) {
                        c35850h = AbstractC14331x.f52307b;
                    }
                    AbstractC0715g abstractC0715gM60481c = c21509f2.m60481c(interfaceC25372a);
                    C23465k c23465k = abstractC0715gM60481c != null ? new C23465k(c35850h, abstractC0715gM60481c) : null;
                    if (c23465k != null) {
                        arrayList.add(c23465k);
                    }
                }
                return AbstractC25247g0.m74000i0(arrayList);
        }
    }
}
