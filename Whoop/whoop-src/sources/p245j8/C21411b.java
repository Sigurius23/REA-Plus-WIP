package p245j8;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p390p1.InterfaceC28661r1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C21411b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82089w;

    /* JADX INFO: renamed from: x */
    public int f82090x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13058l f82091y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28661r1 f82092z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21411b(InterfaceC13058l interfaceC13058l, InterfaceC28661r1 interfaceC28661r1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f82089w = i13;
        this.f82091y = interfaceC13058l;
        this.f82092z = interfaceC28661r1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f82089w) {
            case 0:
                return new C21411b(this.f82091y, this.f82092z, interfaceC30057d, 0);
            default:
                return new C21411b(this.f82091y, this.f82092z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f82089w) {
            case 0:
                break;
        }
        return ((C21411b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f82089w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f82090x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21410a c21410a = new C21410a(this.f82092z, 1);
                    this.f82090x = 1;
                    if (this.f82091y.collect(c21410a, this) == enumC31071a) {
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
                int i14 = this.f82090x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21410a c21410a2 = new C21410a(this.f82092z, 2);
                    this.f82090x = 1;
                    if (this.f82091y.collect(c21410a2, this) == enumC31071a2) {
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
