package p239j1;

import l83.C23454a0;
import p077d0.AbstractC11348f;
import p505ts.AbstractC34132o;
import p708hb2.C17098f;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C21193k extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public int f80753w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21194l f80754x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f80755y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21193k(C21194l c21194l, float f13, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f80754x = c21194l;
        this.f80755y = f13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C21193k(this.f80754x, this.f80755y, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C21193k) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f80753w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C21194l c21194l = this.f80754x;
            float fM87022x = c21194l.f80760e.m87022x();
            C17098f c17098f = new C17098f(c21194l, 17);
            this.f80753w = 1;
            if (AbstractC11348f.m30557e(fM87022x, this.f80755y, null, c17098f, this, 12) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
