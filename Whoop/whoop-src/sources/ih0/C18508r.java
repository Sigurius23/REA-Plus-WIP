package ih0;

import ah0.C0882c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import iy0.C21026a;
import j93.InterfaceC21493z;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l01.C23045q;
import l83.C23454a0;
import nl0.C26804f;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p668z1.C39970s;
import p710im1.C18656a0;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32668r3;
import p734sl0.AbstractC32680u1;
import p734sl0.C32684v1;
import p734sl0.C32695y0;

/* JADX INFO: renamed from: ih0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18508r implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f72116E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f72117F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f72118G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f72119H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72120w = 3;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f72121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f72122y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f72123z;

    public /* synthetic */ C18508r(C26804f c26804f, boolean z4, Function1 function1, Function1 function2, C32695y0 c32695y0, FeatureFlagChecker featureFlagChecker, InterfaceC4351m interfaceC4351m) {
        this.f72116E = c26804f;
        this.f72121x = z4;
        this.f72122y = function1;
        this.f72123z = function2;
        this.f72117F = c32695y0;
        this.f72118G = featureFlagChecker;
        this.f72119H = interfaceC4351m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72120w;
        Object obj2 = this.f72119H;
        Object obj3 = this.f72118G;
        Object obj4 = this.f72117F;
        Object obj5 = this.f72123z;
        Object obj6 = this.f72122y;
        Object obj7 = this.f72116E;
        switch (i13) {
            case 0:
                return AbstractC18491e0.m53387A0(this.f72121x, (Function1) obj6, (C0882c) obj7, (Set) obj4, (Function1) obj5, (InterfaceC28601c1) obj3, (C39970s) obj2, (String) obj);
            case 1:
                C23196w3 c23196w3 = (C23196w3) obj6;
                String str = (String) obj5;
                String str2 = (String) obj7;
                String str3 = (String) obj4;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj3;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj2;
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                if (this.f72121x) {
                    C21026a c21026a = new C21026a(interfaceC4339a, 23);
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    C18030l c18030l = (C18030l) interfaceC18044z;
                    c18030l.m51772e(AbstractC18029k.f69974u, new C18017a(str, c21026a));
                    EnumC23202x3 enumC23202x3M67151c = c23196w3.m67151c();
                    EnumC23202x3 enumC23202x3 = EnumC23202x3.f91822y;
                    if (enumC23202x3M67151c == enumC23202x3) {
                        c18030l.m51772e(AbstractC18029k.f69972s, new C18017a(str2, new C18656a0(c23196w3, interfaceC2994c0, c23196w3, 18)));
                    } else if (c23196w3.f91787e.m73008d().f97517a.containsKey(enumC23202x3)) {
                        c18030l.m51772e(AbstractC18029k.f69973t, new C18017a(str3, new C23045q(1, c23196w3, interfaceC2994c0)));
                    }
                }
                return C23454a0.f92919a;
            case 2:
                return AbstractC32680u1.m102429h((InterfaceC28601c1) obj3, (AtomicReference) obj5, this.f72121x, (Function1) obj6, (C32684v1) obj7, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj2, (InterfaceC26064q) obj);
            default:
                return AbstractC32668r3.m102267q((C26804f) obj7, this.f72121x, (Function1) obj6, (Function1) obj5, (C32695y0) obj4, (FeatureFlagChecker) obj3, (InterfaceC4351m) obj2, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C18508r(InterfaceC28601c1 interfaceC28601c1, AtomicReference atomicReference, boolean z4, Function1 function1, C32684v1 c32684v1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f72118G = interfaceC28601c1;
        this.f72123z = atomicReference;
        this.f72121x = z4;
        this.f72122y = function1;
        this.f72116E = c32684v1;
        this.f72117F = interfaceC28601c2;
        this.f72119H = interfaceC28601c3;
    }

    public /* synthetic */ C18508r(boolean z4, Function1 function1, C0882c c0882c, Set set, Function1 function2, InterfaceC28601c1 interfaceC28601c1, C39970s c39970s) {
        this.f72121x = z4;
        this.f72122y = function1;
        this.f72116E = c0882c;
        this.f72117F = set;
        this.f72123z = function2;
        this.f72118G = interfaceC28601c1;
        this.f72119H = c39970s;
    }

    public /* synthetic */ C18508r(boolean z4, C23196w3 c23196w3, String str, String str2, String str3, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0) {
        this.f72121x = z4;
        this.f72122y = c23196w3;
        this.f72123z = str;
        this.f72116E = str2;
        this.f72117F = str3;
        this.f72118G = interfaceC4339a;
        this.f72119H = interfaceC2994c0;
    }
}
