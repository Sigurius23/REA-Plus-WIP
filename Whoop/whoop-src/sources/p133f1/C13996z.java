package p133f1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p11.AbstractC28704e;
import p163g1.AbstractC15142s6;
import p292l1.AbstractC23178t3;
import p389p0.AbstractC28560y;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22674j;
import wo1.AbstractC37453i0;
import y11.AbstractC39058k;

/* JADX INFO: renamed from: f1.z */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13996z implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49943w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f49944x;

    public /* synthetic */ C13996z(C37816b c37816b, int i13) {
        this.f49943w = i13;
        this.f49944x = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f49943w) {
            case 0:
                num.getClass();
                AbstractC13994y0.m39812a(this.f49944x, composer, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 1:
                num.getClass();
                AbstractC22674j.m65721g(this.f49944x, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 2:
                num.getClass();
                AbstractC15142s6.m43190d(this.f49944x, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 3:
                num.getClass();
                AbstractC23178t3.m67142a(this.f49944x, composer, AbstractC28683x.m87244L(55));
                return C23454a0.f92919a;
            case 4:
                num.getClass();
                AbstractC28560y.m86878e(this.f49944x, composer, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 5:
                return AbstractC28704e.m87320q(this.f49944x, composer, num.intValue());
            case 6:
                return AbstractC37453i0.m119957f(this.f49944x, composer, num.intValue());
            default:
                return AbstractC39058k.m124521m(this.f49944x, composer, num.intValue());
        }
    }

    public /* synthetic */ C13996z(C37816b c37816b, int i13, int i14) {
        this.f49943w = i14;
        this.f49944x = c37816b;
    }
}
