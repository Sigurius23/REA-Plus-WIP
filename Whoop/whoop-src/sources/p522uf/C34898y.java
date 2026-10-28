package p522uf;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p460rg.InterfaceC31373h;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: uf.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C34898y extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C34894u f146970E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4351m f146971F;

    /* JADX INFO: renamed from: G */
    public int f146972G;

    /* JADX INFO: renamed from: w */
    public int f146973w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f146974x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC31373h f146975y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C34892s f146976z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34898y(InterfaceC31373h interfaceC31373h, InterfaceC30057d interfaceC30057d, C34892s c34892s, C34894u c34894u, InterfaceC4351m interfaceC4351m) {
        super(2, interfaceC30057d);
        this.f146975y = interfaceC31373h;
        this.f146976z = c34892s;
        this.f146970E = c34894u;
        this.f146971F = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C34898y c34898y = new C34898y(this.f146975y, interfaceC30057d, this.f146976z, this.f146970E, this.f146971F);
        c34898y.f146974x = obj;
        return c34898y;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C34898y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f146973w;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f146974x = null;
            i13 = 0;
            this.f146972G = 0;
            this.f146973w = 1;
            obj = this.f146976z.mo2061a(this.f146970E, this);
            if (obj != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        i13 = this.f146972G;
        AbstractC34132o.m107864I(obj);
        this.f146974x = null;
        this.f146972G = i13;
        this.f146973w = 2;
        Object objInvoke = this.f146971F.invoke(obj, this);
        return objInvoke == enumC31071a ? enumC31071a : objInvoke;
    }
}
