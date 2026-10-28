package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p133f1.C13977s1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u0.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C34367x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f144411E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C29891y f144412F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC29884r f144413G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC39171c f144414H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f144415I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C13977s1 f144416w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34354s0 f144417x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f144418y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f144419z;

    public C34367x(C13977s1 c13977s1, C34354s0 c34354s0, boolean z4, boolean z13, Function1 function1, C29891y c29891y, InterfaceC29884r interfaceC29884r, InterfaceC39171c interfaceC39171c, int i13) {
        this.f144416w = c13977s1;
        this.f144417x = c34354s0;
        this.f144418y = z4;
        this.f144419z = z13;
        this.f144411E = function1;
        this.f144412F = c29891y;
        this.f144413G = interfaceC29884r;
        this.f144414H = interfaceC39171c;
        this.f144415I = i13;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean z4;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC39171c interfaceC39171c = this.f144414H;
            int i13 = this.f144415I;
            C34354s0 c34354s0 = this.f144417x;
            C34365w c34365w = new C34365w(c34354s0, this.f144411E, this.f144412F, this.f144413G, interfaceC39171c, i13);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c34365w);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87173q(true);
            EnumC34318g0 enumC34318g0M108659a = c34354s0.m108659a();
            EnumC34318g0 enumC34318g0 = EnumC34318g0.f144086w;
            boolean z13 = this.f144418y;
            if (enumC34318g0M108659a != enumC34318g0 && c34354s0.m108661c() != null) {
                InterfaceC39147y interfaceC39147yM108661c = c34354s0.m108661c();
                AbstractC22676k.m65747g(interfaceC39147yM108661c);
                z4 = interfaceC39147yM108661c.mo3532g() && z13;
            }
            C13977s1 c13977s1 = this.f144416w;
            AbstractC34339n0.m108628f(c13977s1, z4, c28655q, 0);
            if (c34354s0.m108659a() == EnumC34318g0.f144088y && !this.f144419z && z13) {
                c28655q.m87150e0(-714666198);
                AbstractC34339n0.m108629g(c13977s1, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-714589318);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
