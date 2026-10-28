package p132f0;

import androidx.compose.foundation.AbstractC1095d;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0229n;
import p268k0.AbstractC22086a;
import p390p1.C28596b0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13768a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49118w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC13789h f49119x;

    public /* synthetic */ C13768a(AbstractC13789h abstractC13789h, int i13) {
        this.f49118w = i13;
        this.f49119x = abstractC13789h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC0229n interfaceC0229n;
        switch (this.f49118w) {
            case 0:
                C28596b0 c28596b0 = AbstractC1095d.f4515a;
                AbstractC13789h abstractC13789h = this.f49119x;
                InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) AbstractC0201g.m506f(abstractC13789h, c28596b0);
                if (!(interfaceC13832v0 instanceof InterfaceC13832v0)) {
                    AbstractC22086a.m63158a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + interfaceC13832v0);
                }
                InterfaceC13832v0 interfaceC13832v1 = abstractC13789h.f49204Y;
                InterfaceC13832v0 interfaceC13832v2 = interfaceC13832v0;
                abstractC13789h.f49204Y = interfaceC13832v2;
                if (interfaceC13832v1 != null && !AbstractC22676k.m65745e(interfaceC13832v2, interfaceC13832v1) && ((interfaceC0229n = abstractC13789h.f49206a0) != null || !abstractC13789h.f49212g0)) {
                    if (interfaceC0229n != null) {
                        abstractC13789h.m666Y0(interfaceC0229n);
                    }
                    abstractC13789h.f49206a0 = null;
                    abstractC13789h.m39153f1();
                }
                return C23454a0.f92919a;
            default:
                this.f49119x.f49202W.invoke();
                return Boolean.TRUE;
        }
    }
}
