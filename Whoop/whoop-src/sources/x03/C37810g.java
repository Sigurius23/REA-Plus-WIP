package x03;

import l83.C23454a0;
import p077d0.C11368k;
import p180h0.InterfaceC16413k2;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22663d0;
import v20.C35567g;

/* JADX INFO: renamed from: x03.g */
/* JADX INFO: loaded from: classes11.dex */
public final class C37810g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f161935E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f161936F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22663d0 f161937w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC16413k2 f161938x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22663d0 f161939y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37812i f161940z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37810g(C22663d0 c22663d0, InterfaceC16413k2 interfaceC16413k2, C22663d0 c22663d1, C37812i c37812i, boolean z4, int i13) {
        super(1);
        this.f161937w = c22663d0;
        this.f161938x = interfaceC16413k2;
        this.f161939y = c22663d1;
        this.f161940z = c37812i;
        this.f161935E = z4;
        this.f161936F = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C11368k animateDecay = (C11368k) obj;
        AbstractC22676k.m65750j(animateDecay, "$this$animateDecay");
        C28633k1 c28633k1 = animateDecay.f36444i;
        C28633k1 c28633k2 = animateDecay.f36440e;
        float fFloatValue = ((Number) c28633k2.getValue()).floatValue();
        C22663d0 c22663d0 = this.f161937w;
        float f13 = fFloatValue - c22663d0.f89331w;
        float fMo29373a = this.f161938x.mo29373a(f13);
        c22663d0.f89331w = ((Number) c28633k2.getValue()).floatValue();
        this.f161939y.f89331w = ((Number) animateDecay.m30600b()).floatValue();
        if (Math.abs(f13 - fMo29373a) > 0.5f) {
            animateDecay.m30599a();
        }
        C37812i c37812i = this.f161940z;
        C37806c c37806cM121322e = c37812i.f161946a.m121322e();
        if (c37806cM121322e == null) {
            animateDecay.m30599a();
        } else {
            boolean zBooleanValue = ((Boolean) c28633k1.getValue()).booleanValue();
            int i13 = this.f161936F;
            if (zBooleanValue && this.f161935E) {
                if (((Number) animateDecay.m30600b()).floatValue() > 0.0f && c37806cM121322e.m121323a() == i13 - 1) {
                    animateDecay.m30599a();
                } else if (((Number) animateDecay.m30600b()).floatValue() < 0.0f && c37806cM121322e.m121323a() == i13) {
                    animateDecay.m30599a();
                }
            }
            if (((Boolean) c28633k1.getValue()).booleanValue()) {
                if (C37812i.m121324b(c37812i, animateDecay, c37806cM121322e, i13, new C35567g(1, this.f161938x, InterfaceC16413k2.class, "scrollBy", "scrollBy(F)F", 0, 10))) {
                    animateDecay.m30599a();
                }
            }
        }
        return C23454a0.f92919a;
    }
}
