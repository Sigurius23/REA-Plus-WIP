package p027b3;

import android.view.Choreographer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.C23468n;
import p180h0.InterfaceC16413k2;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38915o4;

/* JADX INFO: renamed from: b3.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2471z0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2471z0(int i13) {
        super(2, null);
        this.f9624w = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9624w) {
            case 0:
                return new C2471z0(2, 0, interfaceC30057d);
            case 1:
                return new C2471z0(2, 1, interfaceC30057d);
            case 2:
                return new C2471z0(2, 2, interfaceC30057d);
            case 3:
                return new C2471z0(2, 3, interfaceC30057d);
            default:
                return new C2471z0(2, 4, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9624w) {
            case 0:
                return ((C2471z0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                C2471z0 c2471z0 = (C2471z0) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c2471z0.invokeSuspend(c23454a0);
                return c23454a0;
            case 2:
                return ((C2471z0) create((C38915o4) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                C2471z0 c2471z1 = (C2471z0) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c2471z1.invokeSuspend(c23454a1);
                return c23454a1;
            default:
                C2471z0 c2471z2 = (C2471z0) create((Throwable) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c2471z2.invokeSuspend(c23454a2);
                return c23454a2;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f9624w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Choreographer.getInstance();
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return new C23468n(AbstractC34132o.m107888l(new IllegalStateException("Unexpected attempt to update default from CustomerSheet.")));
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2471z0(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f9624w = i14;
    }
}
