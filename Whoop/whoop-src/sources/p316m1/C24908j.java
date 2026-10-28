package p316m1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p292l1.C23203x4;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: m1.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C24908j extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97561w;

    /* JADX INFO: renamed from: x */
    public int f97562x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23203x4 f97563y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24908j(C23203x4 c23203x4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f97561w = i13;
        this.f97563y = c23203x4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f97561w) {
            case 0:
                return new C24908j(this.f97563y, interfaceC30057d, 0);
            default:
                return new C24908j(this.f97563y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f97561w) {
            case 0:
                break;
        }
        return ((C24908j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f97561w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97562x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f97562x = 1;
                    if (this.f97563y.m67161c(EnumC13840z0.f49374w, this) == enumC31071a) {
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
                int i14 = this.f97562x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    EnumC13840z0 enumC13840z0 = EnumC13840z0.f49375x;
                    this.f97562x = 1;
                    if (this.f97563y.m67161c(enumC13840z0, this) == enumC31071a2) {
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
