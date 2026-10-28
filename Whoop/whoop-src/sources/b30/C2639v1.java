package b30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import d40.AbstractC11673r;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import m40.C25046w;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2639v1 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25046w f10297E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f10298F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f10299G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f10300w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10301x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f10302y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f10303z;

    public C2639v1(String str, boolean z4, int i13, String str2, C25046w c25046w, boolean z13, String str3) {
        this.f10300w = str;
        this.f10301x = z4;
        this.f10302y = i13;
        this.f10303z = str2;
        this.f10297E = c25046w;
        this.f10298F = z13;
        this.f10299G = str3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        String str;
        InterfaceC23013y RowButton = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(RowButton, "$this$RowButton");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, composer, 54);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                AbstractC11894a.m31960i(this.f10302y, this.f10303z, this.f10297E, this.f10298F, AbstractC1102d.m3425v(AbstractC1102d.m3411h(AbstractC2573m2.f10008b, c2314t), 0.0f, 36, 1), C2299e.f9117z, composer, 221696);
                c28655q.m87150e0(883394782);
                str = this.f10299G;
                if (str != null) {
                    AbstractC20301a.m56343k(str, null, false, true, composer, 3072, 6);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                C27648a.m83584g(null, this.f10300w, AbstractC11673r.m31082k(composer).f37671d, AbstractC1099a.m3396r(c2314t, 0.0f, 6, 1), this.f10301x, false, composer, 3072, 33);
            }
        } else {
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, composer, 54);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, c2314t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            }
            AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
            AbstractC11894a.m31960i(this.f10302y, this.f10303z, this.f10297E, this.f10298F, AbstractC1102d.m3425v(AbstractC1102d.m3411h(AbstractC2573m2.f10008b, c2314t2), 0.0f, 36, 1), C2299e.f9117z, composer, 221696);
            c28655q.m87150e0(883394782);
            str = this.f10299G;
            if (str != null) {
                AbstractC20301a.m56343k(str, null, false, true, composer, 3072, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            C27648a.m83584g(null, this.f10300w, AbstractC11673r.m31082k(composer).f37671d, AbstractC1099a.m3396r(c2314t2, 0.0f, 6, 1), this.f10301x, false, composer, 3072, 33);
        }
        return C23454a0.f92919a;
    }
}
