package i40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.C15197y1;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.C22976l1;
import p390p1.C28655q;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i40.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C18074h implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f70263E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f70264F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC29873g0 f70265G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f70266H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC21083i f70267I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC17869a1 f70268J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C15197y1 f70269K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C22976l1 f70270L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C29891y f70271w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f70272x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f70273y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f70274z;

    public C18074h(C29891y c29891y, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, boolean z13, InterfaceC29873g0 interfaceC29873g0, boolean z14, InterfaceC21083i interfaceC21083i, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1, C22976l1 c22976l1) {
        this.f70271w = c29891y;
        this.f70272x = z4;
        this.f70273y = interfaceC4351m;
        this.f70274z = interfaceC4351m2;
        this.f70263E = interfaceC4351m3;
        this.f70264F = z13;
        this.f70265G = interfaceC29873g0;
        this.f70266H = z14;
        this.f70267I = interfaceC21083i;
        this.f70268J = interfaceC17869a1;
        this.f70269K = c15197y1;
        this.f70270L = c22976l1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC4351m innerTextField = (InterfaceC4351m) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(innerTextField, "innerTextField");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87157i(innerTextField) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC36259c.m115701n(this.f70271w.f122125a.f92135x, innerTextField, this.f70272x, this.f70273y, this.f70274z, null, this.f70263E, this.f70264F, this.f70265G, this.f70266H, this.f70267I, this.f70268J, this.f70269K, this.f70270L, composer, (iIntValue << 3) & 112);
            }
        } else {
            AbstractC36259c.m115701n(this.f70271w.f122125a.f92135x, innerTextField, this.f70272x, this.f70273y, this.f70274z, null, this.f70263E, this.f70264F, this.f70265G, this.f70266H, this.f70267I, this.f70268J, this.f70269K, this.f70270L, composer, (iIntValue << 3) & 112);
        }
        return C23454a0.f92919a;
    }
}
