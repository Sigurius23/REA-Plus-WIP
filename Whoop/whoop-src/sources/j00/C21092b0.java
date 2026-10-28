package j00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import p164g2.C15247s;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j00.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C21092b0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15247s f79968E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15247s f79969F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C15247s f79970G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f79971H;

    /* JADX INFO: renamed from: w */
    public int f79972w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC30833a f79973x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC15391m3 f79974y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f79975z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21092b0(InterfaceC30833a interfaceC30833a, InterfaceC15391m3 interfaceC15391m3, boolean z4, C15247s c15247s, C15247s c15247s2, C15247s c15247s3, boolean z13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f79973x = interfaceC30833a;
        this.f79974y = interfaceC15391m3;
        this.f79975z = z4;
        this.f79968E = c15247s;
        this.f79969F = c15247s2;
        this.f79970G = c15247s3;
        this.f79971H = z13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C21092b0(this.f79973x, this.f79974y, this.f79975z, this.f79968E, this.f79969F, this.f79970G, this.f79971H, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C21092b0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C15247s c15247s;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f79972w;
        boolean z4 = true;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f79972w = 1;
            if (((C30835c) this.f79973x).m94839b(null, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC15391m3 interfaceC15391m3 = this.f79974y;
        String strMo43566l = interfaceC15391m3.mo43566l();
        boolean z13 = strMo43566l == null || AbstractC39414r.m125890i0(strMo43566l);
        String strMo43566l2 = interfaceC15391m3.mo43566l();
        if (strMo43566l2 != null && !AbstractC39414r.m125890i0(strMo43566l2)) {
            z4 = false;
        }
        boolean z14 = this.f79975z;
        if (z14 && z13) {
            c15247s = this.f79968E;
        } else if (z14 || !z4) {
            c15247s = this.f79971H ? this.f79970G : null;
        } else {
            c15247s = this.f79969F;
        }
        if (c15247s != null) {
            c15247s.m43352b();
        }
        return C23454a0.f92919a;
    }
}
