package p292l1;

import c93.InterfaceC4352n;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11337c0;
import p316m1.C24893b0;
import p316m1.C24900f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.v3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23190v3 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23196w3 f91742E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f91743F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC11337c0 f91744G;

    /* JADX INFO: renamed from: w */
    public int f91745w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ C24900f f91746x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ C24893b0 f91747y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ EnumC23202x3 f91748z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23190v3(C23196w3 c23196w3, float f13, InterfaceC11337c0 interfaceC11337c0, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f91742E = c23196w3;
        this.f91743F = f13;
        this.f91744G = interfaceC11337c0;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f13 = this.f91743F;
        InterfaceC11337c0 interfaceC11337c0 = this.f91744G;
        C23190v3 c23190v3 = new C23190v3(this.f91742E, f13, interfaceC11337c0, (InterfaceC30057d) obj4);
        c23190v3.f91746x = (C24900f) obj;
        c23190v3.f91747y = (C24893b0) obj2;
        c23190v3.f91748z = (EnumC23202x3) obj3;
        return c23190v3.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f91745w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C24900f c24900f = this.f91746x;
            float fM72993d = this.f91747y.m72993d(this.f91748z);
            if (!Float.isNaN(fM72993d)) {
                C22663d0 c22663d0 = new C22663d0();
                C23196w3 c23196w3 = this.f91742E;
                float fM87022x = Float.isNaN(c23196w3.f91787e.f97550j.m87022x()) ? 0.0f : c23196w3.f91787e.f97550j.m87022x();
                c22663d0.f89331w = fM87022x;
                C23184u3 c23184u3 = new C23184u3(c24900f, c22663d0, 0);
                this.f91746x = null;
                this.f91747y = null;
                this.f91745w = 1;
                if (AbstractC11348f.m30555c(fM87022x, fM72993d, this.f91743F, this.f91744G, c23184u3, this) == enumC31071a) {
                    return enumC31071a;
                }
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
