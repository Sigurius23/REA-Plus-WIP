package p180h0;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C16405j extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f63056E;

    /* JADX INFO: renamed from: w */
    public int f63057w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f63058x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16410k f63059y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22663d0 f63060z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16405j(C16410k c16410k, C22663d0 c22663d0, float f13, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f63059y = c16410k;
        this.f63060z = c22663d0;
        this.f63056E = f13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C22663d0 c22663d0 = this.f63060z;
        float f13 = this.f63056E;
        C16405j c16405j = new C16405j(this.f63059y, c22663d0, f13, (InterfaceC30057d) obj3);
        c16405j.f63058x = (InterfaceC16356a) obj;
        return c16405j.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C22663d0 c22663d0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f63057w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC16356a interfaceC16356a = (InterfaceC16356a) this.f63058x;
            C16410k c16410k = this.f63059y;
            C16400i c16400i = new C16400i(0, c16410k, interfaceC16356a);
            InterfaceC16432o1 interfaceC16432o1 = c16410k.f63072c0;
            if (interfaceC16432o1 == null) {
                AbstractC22676k.m65757q("resolvedFlingBehavior");
                throw null;
            }
            C22663d0 c22663d1 = this.f63060z;
            this.f63058x = c22663d1;
            this.f63057w = 1;
            obj = interfaceC16432o1.mo46565a(c16400i, this.f63056E, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
            c22663d0 = c22663d1;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = (C22663d0) this.f63058x;
            AbstractC34132o.m107864I(obj);
        }
        c22663d0.f89331w = ((Number) obj).floatValue();
        return C23454a0.f92919a;
    }
}
