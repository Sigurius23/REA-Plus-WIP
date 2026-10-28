package d33;

import bi.C3278p;
import e33.C12658t0;
import e33.C12662v0;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d33.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11631u0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f37564E;

    /* JADX INFO: renamed from: w */
    public int f37565w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37566x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f37567y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f37568z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11631u0(C11602h1 c11602h1, List list, List list2, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f37566x = c11602h1;
        this.f37567y = list;
        this.f37568z = list2;
        this.f37564E = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C11631u0(this.f37566x, this.f37567y, this.f37568z, this.f37564E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11631u0) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f37565w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C11602h1 c11602h1 = this.f37566x;
            C12662v0 c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
            if (c12662v0 != null) {
                C3278p c3278p = c11602h1.f37462x;
                this.f37565w = 1;
                Object objM113953X = AbstractC35902e.m113953X(new C12658t0(c12662v0, this.f37564E, this.f37567y, this.f37568z, c3278p, null), this);
                if (objM113953X != enumC31071a) {
                    objM113953X = c23454a0;
                }
                if (objM113953X == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }
}
