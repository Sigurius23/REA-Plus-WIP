package a43;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a43.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0382d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1318w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0384f f1319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0382d(C0384f c0384f, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1318w = i13;
        this.f1319x = c0384f;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1318w) {
            case 0:
                return new C0382d(this.f1319x, interfaceC30057d, 0);
            default:
                return new C0382d(this.f1319x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f1318w) {
            case 0:
                C0382d c0382d = (C0382d) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c0382d.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C0382d c0382d2 = (C0382d) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c0382d2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f1318w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C0384f c0384f = this.f1319x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c0384f.f1328x.mo4988d(c0384f);
                C2345k c2345k = (C2345k) c0384f.f1329y.getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                String str = c2345k.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "[dispose] unsubscribed", null);
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c0384f.f1328x.mo4986a(c0384f);
                C2345k c2345k2 = (C2345k) c0384f.f1329y.getValue();
                InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                String str2 = c2345k2.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    c2345k2.f9274b.log(enumC2341g2, str2, "[observe] subscribed", null);
                }
                break;
        }
        return c23454a0;
    }
}
