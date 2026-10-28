package j53;

import androidx.room.C1844y;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j53.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21352j extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81673w;

    /* JADX INFO: renamed from: x */
    public int f81674x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21355m f81675y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21352j(C21355m c21355m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f81673w = i13;
        this.f81675y = c21355m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f81673w) {
            case 0:
                return new C21352j(this.f81675y, interfaceC30057d, 0);
            default:
                return new C21352j(this.f81675y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f81673w) {
            case 0:
                return ((C21352j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C21352j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f81673w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f81674x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21355m c21355m = this.f81675y;
                    C1844y c1844yM36605o = AbstractC13091v.m36605o(c21355m.f81687b, c21355m.f81688c, c21355m.f81690e, c21355m.f81691f, new C21350h(5, null));
                    C21351i c21351i = new C21351i(c21355m, 0);
                    this.f81674x = 1;
                    if (c1844yM36605o.collect(c21351i, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f81674x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C21355m c21355m2 = this.f81675y;
                C13096w1 c13096w1 = c21355m2.f81686a.f139301o;
                C21351i c21351i2 = new C21351i(c21355m2, 1);
                this.f81674x = 1;
                c13096w1.getClass();
                C13096w1.m36617k(c13096w1, c21351i2, this);
                return enumC31071a2;
        }
    }
}
