package p163g1;

import androidx.compose.runtime.Composer;
import b30.C2621s4;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p292l1.C23089e4;
import p292l1.C23177t2;
import p390p1.C28655q;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.h4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15028h4 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21083i f56243E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f56244F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4351m f56245G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4351m f56246H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC4351m f56247I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC17869a1 f56248J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f56249K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f56250L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56251w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f56252x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f56253y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC29873g0 f56254z;

    public C15028h4(String str, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, boolean z14, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1) {
        this.f56249K = str;
        this.f56252x = z4;
        this.f56253y = z13;
        this.f56254z = interfaceC29873g0;
        this.f56243E = interfaceC21083i;
        this.f56244F = z14;
        this.f56245G = interfaceC4351m;
        this.f56246H = interfaceC4351m2;
        this.f56247I = interfaceC4351m3;
        this.f56248J = interfaceC17869a1;
        this.f56250L = c15197y1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56251w) {
            case 0:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87157i(interfaceC4351m) ? 4 : 2;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i13 = iIntValue;
                    C15043i8 c15043i8 = C15043i8.f56313a;
                    String str = (String) this.f56249K;
                    C15197y1 c15197y1 = (C15197y1) this.f56250L;
                    boolean z4 = this.f56252x;
                    boolean z13 = this.f56244F;
                    InterfaceC21083i interfaceC21083i = this.f56243E;
                    InterfaceC17869a1 interfaceC17869a1 = this.f56248J;
                    c15043i8.m43132b(str, interfaceC4351m, z4, this.f56253y, this.f56254z, interfaceC21083i, z13, this.f56245G, this.f56246H, null, this.f56247I, interfaceC17869a1, c15197y1, null, AbstractC37817c.m121344e(-1118701585, c28655q, new C2621s4(z4, z13, interfaceC21083i, c15197y1, interfaceC17869a1, 1)), c28655q, (i13 << 3) & 112, DfuBaseService.ERROR_REMOTE_MASK);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87157i(interfaceC4351m2) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i14 = iIntValue2;
                    C23177t2 c23177t2 = C23177t2.f91688a;
                    String str2 = ((C29891y) this.f56249K).f122125a.f92135x;
                    C23089e4 c23089e4 = (C23089e4) this.f56250L;
                    InterfaceC17869a1 interfaceC17869a2 = this.f56248J;
                    boolean z14 = this.f56252x;
                    boolean z15 = this.f56244F;
                    InterfaceC21083i interfaceC21083i2 = this.f56243E;
                    c23177t2.m67141b(str2, interfaceC4351m2, z14, this.f56253y, this.f56254z, interfaceC21083i2, z15, this.f56245G, this.f56246H, this.f56247I, c23089e4, null, AbstractC37817c.m121344e(1409265477, c28655q2, new C2621s4(z14, z15, interfaceC21083i2, c23089e4, interfaceC17869a2, 2)), c28655q2, (i14 << 3) & 112);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C15028h4(C29891y c29891y, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, boolean z14, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1) {
        this.f56249K = c29891y;
        this.f56252x = z4;
        this.f56253y = z13;
        this.f56254z = interfaceC29873g0;
        this.f56243E = interfaceC21083i;
        this.f56244F = z14;
        this.f56245G = interfaceC4351m;
        this.f56246H = interfaceC4351m2;
        this.f56247I = interfaceC4351m3;
        this.f56250L = c23089e4;
        this.f56248J = interfaceC17869a1;
    }
}
