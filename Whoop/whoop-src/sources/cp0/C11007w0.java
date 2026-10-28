package cp0;

import c93.InterfaceC4339a;
import p180h0.C16435p;
import p181h2.C16617b;
import p209i3.InterfaceC18044z;
import p390p1.C28624i0;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p636y3.InterfaceC39171c;
import p702ch0.C4656v0;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: cp0.w0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11007w0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34423w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f34424x;

    public /* synthetic */ C11007w0(Object obj, int i13) {
        this.f34423w = i13;
        this.f34424x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34423w) {
            case 0:
                return AbstractC11009x0.a.m29544b((InterfaceC4339a) this.f34424x, (C16617b) obj);
            case 1:
                return Boolean.valueOf(AbstractC10995s.m29363k((C16435p) this.f34424x, ((Float) obj).floatValue()));
            case 2:
                return AbstractC10942a0.m29015u((InterfaceC30468c) this.f34424x, (C28624i0) obj);
            case 3:
                return AbstractC10942a0.m28992B((InterfaceC28670t2) this.f34424x, (C29891y) obj);
            case 4:
                return AbstractC11009x0.m29457V((C4656v0) this.f34424x, (C28624i0) obj);
            case 5:
                return AbstractC11009x0.m29447Q((String) this.f34424x, (InterfaceC18044z) obj);
            case 6:
                return AbstractC11009x0.m29525t0((C10964h1) this.f34424x, (InterfaceC39171c) obj);
            case 7:
                return AbstractC10979m1.m29262n((C10955e1) this.f34424x, (InterfaceC39171c) obj);
            default:
                return AbstractC10979m1.m29274z((C11013z0) this.f34424x, (C28624i0) obj);
        }
    }
}
