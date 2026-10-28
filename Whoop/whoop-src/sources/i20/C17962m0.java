package i20;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.RunnableC1319m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p164g2.C15247s;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: i20.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17962m0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69772w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15247s f69773x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17962m0(C15247s c15247s, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f69772w = i13;
        this.f69773x = c15247s;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f69772w) {
            case 0:
                return new C17962m0(this.f69773x, interfaceC30057d, 0);
            default:
                return new C17962m0(this.f69773x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f69772w) {
            case 0:
                C17962m0 c17962m0 = (C17962m0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c17962m0.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C17962m0 c17962m1 = (C17962m0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c17962m1.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f69772w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C15247s c15247s = this.f69773x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                new Handler(Looper.getMainLooper()).post(new RunnableC1319m(c15247s, 26));
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c15247s.m43352b();
                break;
        }
        return c23454a0;
    }
}
