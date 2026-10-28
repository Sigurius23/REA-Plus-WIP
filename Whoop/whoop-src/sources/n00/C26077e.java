package n00;

import androidx.room.C1778e;
import androidx.room.C1844y;
import b30.C2544i5;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4594o;
import d33.C11636x;
import ec3.AbstractC13091v;
import h20.C16670i0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: n00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26077e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103270w;

    /* JADX INFO: renamed from: x */
    public int f103271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26083k f103272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26077e(C26083k c26083k, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f103270w = i13;
        this.f103272y = c26083k;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f103270w) {
            case 0:
                return new C26077e(this.f103272y, interfaceC30057d, 0);
            case 1:
                return new C26077e(this.f103272y, interfaceC30057d, 1);
            default:
                return new C26077e(this.f103272y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f103270w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C26077e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f103270w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103271x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f103271x = 1;
                    C26083k c26083k = this.f103272y;
                    Object objM36604n = AbstractC13091v.m36604n(AbstractC13091v.m36606p(new C1844y(4, c26083k.f103302M.f57718q, c26083k), new C4594o(c26083k.f103300K.f57718q, 2), c26083k.f103301L.f58057l, new C26082j(4, null)), new C2544i5(c26083k, null, 4), this);
                    if (objM36604n != enumC31071a) {
                        objM36604n = c23454a0;
                    }
                    if (objM36604n == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f103271x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f103271x = 1;
                    C26083k c26083k2 = this.f103272y;
                    InterfaceC30057d interfaceC30057d = null;
                    Object objM36604n2 = AbstractC13091v.m36604n(AbstractC13091v.m36583I(new C11636x(2, 6, interfaceC30057d), c26083k2.f103300K.f57725x), new C16670i0(c26083k2, interfaceC30057d, 29), this);
                    if (objM36604n2 != enumC31071a2) {
                        objM36604n2 = c23454a1;
                    }
                    if (objM36604n2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f103271x;
                C23454a0 c23454a2 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f103271x = 1;
                    C26083k c26083k3 = this.f103272y;
                    Object objM36604n3 = AbstractC13091v.m36604n(c26083k3.f103309z.f166757l, new C1778e(c26083k3, null, 23), this);
                    if (objM36604n3 != enumC31071a3) {
                        objM36604n3 = c23454a2;
                    }
                    if (objM36604n3 == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a2;
        }
    }
}
