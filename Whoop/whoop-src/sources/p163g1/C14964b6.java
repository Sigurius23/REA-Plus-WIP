package p163g1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p180h0.InterfaceC16392g1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.b6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14964b6 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f55861E;

    /* JADX INFO: renamed from: w */
    public int f55862w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f55863x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f55864y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f55865z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14964b6(float f13, float f14, float f15, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f55864y = f13;
        this.f55865z = f14;
        this.f55861E = f15;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C14964b6 c14964b6 = new C14964b6(this.f55864y, this.f55865z, this.f55861E, interfaceC30057d);
        c14964b6.f55863x = obj;
        return c14964b6;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C14964b6) create((InterfaceC16392g1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f55862w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC16392g1 interfaceC16392g1 = (InterfaceC16392g1) this.f55863x;
            C22663d0 c22663d0 = new C22663d0();
            float f13 = this.f55864y;
            c22663d0.f89331w = f13;
            C11344e c11344eM30553a = AbstractC11348f.m30553a(f13);
            Float f14 = new Float(this.f55865z);
            C11347e2 c11347e2 = AbstractC15019g6.f56205g;
            Float f15 = new Float(this.f55861E);
            C14953a6 c14953a6 = new C14953a6(interfaceC16392g1, c22663d0, 0);
            this.f55862w = 1;
            if (c11344eM30553a.m30548c(f14, c11347e2, f15, c14953a6, this) == enumC31071a) {
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
