package i40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.C15197y1;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.C22976l1;
import p390p1.C28655q;
import p412q3.InterfaceC29873g0;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18073g implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f70250E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4351m f70251F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f70252G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC29873g0 f70253H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f70254I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC21083i f70255J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC17869a1 f70256K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C15197y1 f70257L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C22976l1 f70258M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f70259w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f70260x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f70261y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f70262z;

    public C18073g(String str, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, boolean z13, InterfaceC29873g0 interfaceC29873g0, boolean z14, InterfaceC21083i interfaceC21083i, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1, C22976l1 c22976l1) {
        this.f70259w = str;
        this.f70260x = z4;
        this.f70261y = interfaceC4351m;
        this.f70262z = interfaceC4351m2;
        this.f70250E = interfaceC4351m3;
        this.f70251F = interfaceC4351m4;
        this.f70252G = z13;
        this.f70253H = interfaceC29873g0;
        this.f70254I = z14;
        this.f70255J = interfaceC21083i;
        this.f70256K = interfaceC17869a1;
        this.f70257L = c15197y1;
        this.f70258M = c22976l1;
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
                AbstractC36259c.m115701n(this.f70259w, innerTextField, this.f70260x, this.f70261y, this.f70262z, this.f70250E, this.f70251F, this.f70252G, this.f70253H, this.f70254I, this.f70255J, this.f70256K, this.f70257L, this.f70258M, composer, (iIntValue << 3) & 112);
            }
        } else {
            AbstractC36259c.m115701n(this.f70259w, innerTextField, this.f70260x, this.f70261y, this.f70262z, this.f70250E, this.f70251F, this.f70252G, this.f70253H, this.f70254I, this.f70255J, this.f70256K, this.f70257L, this.f70258M, composer, (iIntValue << 3) & 112);
        }
        return C23454a0.f92919a;
    }
}
