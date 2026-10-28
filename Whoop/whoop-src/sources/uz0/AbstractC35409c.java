package uz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import tu1.C34190c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: uz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lkd1/o;", "imageSource", "", "activityStrain", "activityTitle", "Li2/t;", "backgroundBrush", "Ll83/a0;", "b", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35409c {
    /* JADX INFO: renamed from: b */
    public static final void m112326b(AbstractC22403o imageSource, String str, String activityTitle, AbstractC17911t backgroundBrush, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        float f13;
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        AbstractC22676k.m65750j(backgroundBrush, "backgroundBrush");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-936633965);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(imageSource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(activityTitle) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(backgroundBrush) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f14 = 4;
            float f15 = 8;
            float f16 = ((float) 1.5d) * f15;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3357b(AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(2 * f14)), backgroundBrush, null, 0.0f, 6), f16, f16);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(imageSource, null, null, c28655q, i15 & 14, 3);
            String strConcat = activityTitle.concat(" icon");
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, strConcat, AbstractC1102d.m3419p(f14 * 4.5f, c2314t2), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 384, 0);
            if (str != null) {
                c28655q.m87150e0(-498513150);
                AbstractC38963t7.m124386p(1, f15, c2314t2, c28655q);
                c2314t = c2314t2;
                f13 = f15;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, (i15 >> 3) & 14, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c2314t = c2314t2;
                f13 = f15;
                c28655q.m87150e0(-498246953);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC38963t7.m124386p(1, f13, c2314t, c28655q);
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            C2886a sh4 = c38072d.m121952e(c28655q, 6).getSh4();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(activityTitle, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q2, (i15 >> 6) & 14, 0, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(imageSource, str, activityTitle, backgroundBrush, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m112327c(AbstractC22403o abstractC22403o, String str, String str2, AbstractC17911t abstractC17911t, int i13, Composer composer, int i14) {
        m112326b(abstractC22403o, str, str2, abstractC17911t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
