package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.runtime.Composer;
import j93.InterfaceC21467g;
import p026b2.C2314t;
import p133f1.C13977s1;
import p133f1.C13992x1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q00.C29718h0;

/* JADX INFO: renamed from: u0.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34325i1 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f144131E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC29884r f144132F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C34358t1 f144133G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f144134H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f144135I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C34354s0 f144136w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13977s1 f144137x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29891y f144138y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f144139z;

    public C34325i1(C34354s0 c34354s0, C13977s1 c13977s1, C29891y c29891y, boolean z4, boolean z13, InterfaceC29884r interfaceC29884r, C34358t1 c34358t1, Function1 function1, int i13) {
        this.f144136w = c34354s0;
        this.f144137x = c13977s1;
        this.f144138y = c29891y;
        this.f144139z = z4;
        this.f144131E = z13;
        this.f144132F = interfaceC29884r;
        this.f144133G = c34358t1;
        this.f144134H = function1;
        this.f144135I = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C28655q c28655q = (C28655q) ((Composer) obj2);
        c28655q.m87150e0(851809892);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C13992x1();
            c28655q.m87172p0(objM87133R);
        }
        C13992x1 c13992x1 = (C13992x1) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C34309d0();
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = this.f144134H;
        int i13 = this.f144135I;
        C34322h1 c34322h1 = new C34322h1(this.f144136w, this.f144137x, this.f144138y, this.f144139z, this.f144131E, c13992x1, this.f144132F, this.f144133G, (C34309d0) objM87133R2, function1, i13);
        boolean zM87157i = c28655q.m87157i(c34322h1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            C29718h0 c29718h0 = new C29718h0(1, c34322h1, C34322h1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 27);
            c28655q.m87172p0(c29718h0);
            objM87133R3 = c29718h0;
        }
        Modifier modifierM3493a = AbstractC1128a.m3493a(C2314t.f9131w, (Function1) ((InterfaceC21467g) objM87133R3));
        c28655q.m87173q(false);
        return modifierM3493a;
    }
}
