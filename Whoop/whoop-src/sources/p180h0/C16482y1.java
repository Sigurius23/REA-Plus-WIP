package p180h0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ev2.C13693b;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p401pj.C29279m;
import p505ts.AbstractC34132o;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16482y1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63342w;

    /* JADX INFO: renamed from: x */
    public int f63343x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63344y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16482y1(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f63342w = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63342w) {
            case 0:
                C16482y1 c16482y1 = new C16482y1(2, 0, interfaceC30057d);
                c16482y1.f63344y = obj;
                return c16482y1;
            default:
                C16482y1 c16482y2 = new C16482y1(2, 1, interfaceC30057d);
                c16482y2.f63344y = obj;
                return c16482y2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63342w) {
            case 0:
                return ((C16482y1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16482y1) create((InterfaceC34476v) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2994c0 interfaceC2994c0;
        switch (this.f63342w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63343x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC2994c0 = (InterfaceC2994c0) this.f63344y;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) this.f63344y;
                    AbstractC34132o.m107864I(obj);
                }
                while (AbstractC3006f0.m8730x(interfaceC2994c0.getCoroutineContext())) {
                    C13693b c13693b = new C13693b(13);
                    this.f63344y = interfaceC2994c0;
                    this.f63343x = 1;
                    if (AbstractC28683x.m87268v(getContext()).mo7286k(c13693b, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f63343x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f63344y;
                    this.f63343x = 1;
                    if (AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, C29279m.f118488w, this, 7) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
