package p077d0;

import bc3.InterfaceC2994c0;
import com.whoop.home.view.HomeFragment;
import fm1.C14597a;
import fm1.C14600d;
import fm1.EnumC14603g;
import il1.AbstractC18642s;
import l83.C23454a0;
import ld1.AbstractC23864c;
import p390p1.C28633k1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p446r1.C30849c;
import p710im1.AbstractC18677j0;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22667f0;
import p741vn1.C36213q;
import st0.EnumC32978v;
import um1.AbstractC35086d;
import vk0.C36077c;
import vk0.InterfaceC36075a;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11328a implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36287E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36288w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36289x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36290y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36291z;

    public /* synthetic */ C11328a(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f36288w = i13;
        this.f36289x = obj;
        this.f36290y = obj2;
        this.f36291z = obj3;
        this.f36287E = obj4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36288w) {
            case 0:
                C11344e c11344e = (C11344e) this.f36289x;
                C11376m c11376m = (C11376m) this.f36290y;
                Function1 function1 = (Function1) this.f36291z;
                C22659b0 c22659b0 = (C22659b0) this.f36287E;
                C11368k c11368k = (C11368k) obj;
                C11376m c11376m2 = c11344e.f36343c;
                AbstractC11348f.m30575w(c11368k, c11376m2);
                C28633k1 c28633k1 = c11368k.f36440e;
                Object objM30545a = C11344e.m30545a(c11344e, c28633k1.getValue());
                if (!AbstractC22676k.m65745e(objM30545a, c28633k1.getValue())) {
                    c11376m2.f36471x.setValue(objM30545a);
                    c11376m.f36471x.setValue(objM30545a);
                    if (function1 != null) {
                        function1.invoke(c11344e);
                    }
                    c11368k.m30599a();
                    c22659b0.f89329w = true;
                } else if (function1 != null) {
                    function1.invoke(c11344e);
                }
                return C23454a0.f92919a;
            case 1:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f36289x;
                C11373l0 c11373l0 = (C11373l0) this.f36290y;
                C22663d0 c22663d0 = (C22663d0) this.f36291z;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f36287E;
                long jLongValue = ((Long) obj).longValue();
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) interfaceC28601c1.getValue();
                long jLongValue2 = interfaceC28670t2 != null ? ((Number) interfaceC28670t2.getValue()).longValue() : jLongValue;
                long j7 = c11373l0.f36455c;
                C30849c c30849c = c11373l0.f36453a;
                if (j7 == Long.MIN_VALUE || c22663d0.f89331w != AbstractC11348f.m30568p(interfaceC2994c0.getCoroutineContext())) {
                    c11373l0.f36455c = jLongValue;
                    Object[] objArr = c30849c.f127227w;
                    int i13 = c30849c.f127229y;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((C11365j0) objArr[i14]).f36427G = true;
                    }
                    c22663d0.f89331w = AbstractC11348f.m30568p(interfaceC2994c0.getCoroutineContext());
                }
                float f13 = c22663d0.f89331w;
                if (f13 == 0.0f) {
                    Object[] objArr2 = c30849c.f127227w;
                    int i15 = c30849c.f127229y;
                    for (int i16 = 0; i16 < i15; i16++) {
                        C11365j0 c11365j0 = (C11365j0) objArr2[i16];
                        c11365j0.f36433z.setValue(c11365j0.f36425E.f36522c);
                        c11365j0.f36427G = true;
                    }
                } else {
                    long j13 = (long) ((jLongValue2 - c11373l0.f36455c) / f13);
                    Object[] objArr3 = c30849c.f127227w;
                    int i17 = c30849c.f127229y;
                    boolean z4 = true;
                    for (int i18 = 0; i18 < i17; i18++) {
                        C11365j0 c11365j1 = (C11365j0) objArr3[i18];
                        if (!c11365j1.f36426F) {
                            c11365j1.f36429I.f36454b.setValue(Boolean.FALSE);
                            if (c11365j1.f36427G) {
                                c11365j1.f36427G = false;
                                c11365j1.f36428H = j13;
                            }
                            long j14 = j13 - c11365j1.f36428H;
                            c11365j1.f36433z.setValue(c11365j1.f36425E.mo30596f(j14));
                            c11365j1.f36426F = c11365j1.f36425E.m30593c(j14);
                        }
                        if (!c11365j1.f36426F) {
                            z4 = false;
                        }
                    }
                    c11373l0.f36456d.setValue(Boolean.valueOf(!z4));
                }
                return C23454a0.f92919a;
            case 2:
                return HomeFragment.m21785U1((HomeFragment) this.f36289x, (EnumC14603g) this.f36290y, (InterfaceC28670t2) this.f36291z, (InterfaceC2994c0) this.f36287E, (AbstractC18642s) obj);
            case 3:
                return AbstractC18677j0.m54227n((Function1) this.f36291z, (C18665d0) this.f36289x, (C14597a) this.f36290y, (C14600d) this.f36287E, obj);
            case 4:
                return AbstractC35086d.m110969y((AbstractC23864c) this.f36289x, (C36213q) this.f36290y, (InterfaceC28601c1) this.f36291z, (InterfaceC28601c1) this.f36287E, obj);
            default:
                return C36077c.m114582h((C36077c) this.f36289x, (InterfaceC36075a) this.f36290y, (EnumC32978v) this.f36291z, (C22667f0) this.f36287E, (Throwable) obj);
        }
    }

    public /* synthetic */ C11328a(Function1 function1, C18665d0 c18665d0, C14597a c14597a, C14600d c14600d) {
        this.f36288w = 3;
        this.f36291z = function1;
        this.f36289x = c18665d0;
        this.f36290y = c14597a;
        this.f36287E = c14600d;
    }
}
