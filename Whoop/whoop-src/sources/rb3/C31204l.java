package rb3;

import cb3.AbstractC4393e;
import ha3.C17062e;
import hg3.AbstractC17269i;
import java.util.Collection;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23778h0;
import lb3.C23784k0;
import m83.AbstractC25265s;
import mb3.InterfaceC25387d;
import o93.AbstractC27741m;
import o93.C27740l;
import p249jc.C21567b;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31165x0;
import u93.AbstractC34711x0;
import u93.C34709w0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rb3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C31204l implements InterfaceC31197e {

    /* JADX INFO: renamed from: b */
    public static final C31204l f128541b = new C31204l(0);

    /* JADX INFO: renamed from: c */
    public static final C31204l f128542c = new C31204l(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128543a;

    public /* synthetic */ C31204l(int i13) {
        this.f128543a = i13;
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: a */
    public final boolean mo96148a(C17062e c17062e) {
        AbstractC23763c0 abstractC23763c0M69889h;
        switch (this.f128543a) {
            case 0:
                InterfaceC31108b interfaceC31108b = (InterfaceC31107a1) c17062e.mo78676v().get(1);
                C21567b c21567b = C27740l.f111812d;
                AbstractC22676k.m65747g(interfaceC31108b);
                InterfaceC31109b0 interfaceC31109b0M13812j = AbstractC4393e.m13812j(interfaceC31108b);
                c21567b.getClass();
                InterfaceC31117e interfaceC31117eM48865L = AbstractC17269i.m48865L(interfaceC31109b0M13812j, AbstractC27741m.f111834R);
                if (interfaceC31117eM48865L == null) {
                    abstractC23763c0M69889h = null;
                } else {
                    C23784k0.f94165x.getClass();
                    C23784k0 c23784k0 = C23784k0.f94166y;
                    List parameters = interfaceC31117eM48865L.mo60496e().getParameters();
                    AbstractC22676k.m65749i(parameters, "getParameters(...)");
                    Object objM74142p1 = AbstractC25265s.m74142p1(parameters);
                    AbstractC22676k.m65749i(objM74142p1, "single(...)");
                    abstractC23763c0M69889h = AbstractC23791o.m69889h(c23784k0, interfaceC31117eM48865L, AbstractC37056f.m118958J(new C23778h0((InterfaceC31165x0) objM74142p1)));
                }
                if (abstractC23763c0M69889h == null) {
                    return false;
                }
                AbstractC23811y type = ((AbstractC34711x0) interfaceC31108b).getType();
                AbstractC22676k.m65749i(type, "getType(...)");
                return InterfaceC25387d.f99472a.m74525b(abstractC23763c0M69889h, AbstractC23767d1.m69851g(type, false));
            default:
                List listMo78676v = c17062e.mo78676v();
                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                List<InterfaceC31107a1> list = listMo78676v;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (InterfaceC31107a1 interfaceC31107a1 : list) {
                        AbstractC22676k.m65747g(interfaceC31107a1);
                        if (AbstractC4393e.m13803a(interfaceC31107a1) || ((C34709w0) interfaceC31107a1).f146190K != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // rb3.InterfaceC31197e
    /* JADX INFO: renamed from: b */
    public final /* bridge */ String mo96149b(C17062e c17062e) {
        switch (this.f128543a) {
            case 0:
                break;
        }
        return AbstractC35785b.m113385H(this, c17062e);
    }

    @Override // rb3.InterfaceC31197e
    public final String getDescription() {
        switch (this.f128543a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
