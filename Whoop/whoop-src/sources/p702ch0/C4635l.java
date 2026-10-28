package p702ch0;

import bc3.InterfaceC2994c0;
import dp0.InterfaceC12251g;
import p163g1.C15199y3;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import zg0.AbstractC40624g;

/* JADX INFO: renamed from: ch0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4635l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18728w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4656v0 f18729x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18730y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18731z;

    public /* synthetic */ C4635l(C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, Object obj, int i13) {
        this.f18728w = i13;
        this.f18729x = c4656v0;
        this.f18730y = interfaceC2994c0;
        this.f18731z = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18728w) {
            case 0:
                return AbstractC4639n.m14470I((InterfaceC28601c1) this.f18730y, this.f18729x, (String) this.f18731z, (C28624i0) obj);
            case 1:
                return AbstractC4610c1.m14359r(this.f18729x, (InterfaceC2994c0) this.f18730y, (InterfaceC12251g) this.f18731z, (C28624i0) obj);
            default:
                return AbstractC4610c1.m14332C(this.f18729x, (InterfaceC2994c0) this.f18730y, (C15199y3) this.f18731z, (AbstractC40624g) obj);
        }
    }

    public /* synthetic */ C4635l(InterfaceC28601c1 interfaceC28601c1, C4656v0 c4656v0, String str) {
        this.f18728w = 0;
        this.f18730y = interfaceC28601c1;
        this.f18729x = c4656v0;
        this.f18731z = str;
    }
}
