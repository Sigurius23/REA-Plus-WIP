package p040c0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p077d0.C11364j;
import p077d0.EnumC11360i;
import p077d0.InterfaceC11372l;
import p505ts.AbstractC34132o;
import p636y3.C39180l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: c0.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3766o1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f15377w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3763n1 f15378x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f15379y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3772q1 f15380z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3766o1(C3763n1 c3763n1, long j7, C3772q1 c3772q1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f15378x = c3763n1;
        this.f15379y = j7;
        this.f15380z = c3772q1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C3766o1(this.f15378x, this.f15379y, this.f15380z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C3766o1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f15377w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C11344e c11344e = this.f15378x.f15371a;
            C39180l c39180l = new C39180l(this.f15379y);
            InterfaceC11372l interfaceC11372l = this.f15380z.f15396P;
            this.f15377w = 1;
            obj = C11344e.m30547d(c11344e, c39180l, interfaceC11372l, null, this, 12);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        EnumC11360i enumC11360i = ((C11364j) obj).f36424b;
        EnumC11360i enumC11360i2 = EnumC11360i.f36414w;
        return C23454a0.f92919a;
    }
}
