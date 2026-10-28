package p078d1;

import j93.AbstractC21478l0;
import java.util.List;
import p209i3.InterfaceC18044z;
import p294l3.C23254g;
import p294l3.C23283u0;
import p390p1.C28633k1;
import p412q3.C29860a;
import p412q3.C29867d0;
import p412q3.C29875i;
import p412q3.C29876j;
import p412q3.C29891y;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.C34362v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: d1.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11451d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36732w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11452e f36733x;

    public /* synthetic */ C11451d(C11452e c11452e, int i13) {
        this.f36732w = i13;
        this.f36733x = c11452e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f36732w;
        boolean z4 = false;
        C11452e c11452e = this.f36733x;
        switch (i13) {
            case 0:
                C28633k1 c28633k1 = c11452e.f36736S.f144326t;
                Boolean bool = Boolean.TRUE;
                c28633k1.setValue(bool);
                c11452e.f36736S.f144325s.setValue(bool);
                C11452e.m30729a1(c11452e.f36736S, ((C23254g) obj).f92135x, c11452e.f36737T, c11452e.f36738U);
                return bool;
            case 1:
                List list = (List) obj;
                if (c11452e.f36736S.m108662d() != null) {
                    C34346p1 c34346p1M108662d = c11452e.f36736S.m108662d();
                    AbstractC22676k.m65747g(c34346p1M108662d);
                    list.add(c34346p1M108662d.f144282a);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 2:
                C11452e.m30729a1(c11452e.f36736S, ((C23254g) obj).f92135x, c11452e.f36737T, c11452e.f36738U);
                return Boolean.TRUE;
            default:
                C23254g c23254g = (C23254g) obj;
                if (!c11452e.f36737T && c11452e.f36738U) {
                    C29867d0 c29867d0 = c11452e.f36736S.f144311e;
                    if (c29867d0 != null) {
                        List listM118959K = AbstractC37056f.m118959K(new C29876j(), new C29860a(c23254g, 1));
                        C34354s0 c34354s0 = c11452e.f36736S;
                        C29875i c29875i = c34354s0.f144310d;
                        C34362v c34362v = c34354s0.f144328v;
                        C29891y c29891yM91496b = c29875i.m91496b(listM118959K);
                        c29867d0.m91495a(null, c29891yM91496b);
                        c34362v.invoke(c29891yM91496b);
                    } else {
                        C29891y c29891y = c11452e.f36735R;
                        String str = c29891y.f122125a.f92135x;
                        long j7 = c29891y.f122126b;
                        int i14 = C23283u0.f92252c;
                        String string = AbstractC39414r.m125902u0(str, (int) (j7 >> 32), (int) (j7 & 4294967295L), c23254g).toString();
                        int length = c23254g.f92135x.length() + ((int) (c11452e.f36735R.f122126b >> 32));
                        c11452e.f36736S.f144328v.invoke(new C29891y(4, string, AbstractC21478l0.m60431f(length, length)));
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }

    public /* synthetic */ C11451d(C11452e c11452e, InterfaceC18044z interfaceC18044z) {
        this.f36732w = 3;
        this.f36733x = c11452e;
    }
}
