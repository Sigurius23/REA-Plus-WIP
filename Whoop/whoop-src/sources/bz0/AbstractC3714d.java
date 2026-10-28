package bz0;

import a11.C0130h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import g61.EnumC15533f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21372f;
import j61.EnumC21375i;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bz0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0004\u0010\u0002\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\r"}, m65681d2 = {"Ll83/a0;", "d", "(Landroidx/compose/runtime/Composer;I)V", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "", "a", "Ljava/util/List;", "positionsInParent", "Ly81/e;", "b", "colors", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3714d {

    /* JADX INFO: renamed from: a */
    private static final List<Float> f15172a = AbstractC37056f.m118959K(Float.valueOf(0.0f), Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));

    /* JADX INFO: renamed from: b */
    private static final List<InterfaceC39332e> f15173b = AbstractC37056f.m118959K(Function1.m125323a(a.f15174w), Function1.m125323a(b.f15175w), Function1.m125323a(c.f15176w), Function1.m125323a(d.f15177w), Function1.m125323a(e.f15178w));

    /* JADX INFO: renamed from: bz0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f15174w = new a();

        /* JADX INFO: renamed from: a */
        public final long m11541a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11541a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bz0.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f15175w = new b();

        /* JADX INFO: renamed from: a */
        public final long m11542a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandPrimary();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11542a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bz0.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f15176w = new c();

        /* JADX INFO: renamed from: a */
        public final long m11543a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentOnboardingAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11543a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bz0.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f15177w = new d();

        /* JADX INFO: renamed from: a */
        public final long m11544a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11544a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bz0.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f15178w = new e();

        /* JADX INFO: renamed from: a */
        public final long m11545a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11545a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m11535d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-874357478);
        boolean z4 = true;
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            char c3 = 0;
            int i14 = 6;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(400, c2314t)), C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3406c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-735807099);
            Iterator it = AbstractC37056f.m118959K("10%", "30%", "50%", "70%", "90%").iterator();
            while (it.hasNext()) {
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h((String) it.next(), AbstractC1099a.m3394p(2 * 8, c2314t), C38072d.f163053a.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q2, 48, 0, 262136);
                c28655q = c28655q2;
                i14 = i14;
                c2314t = c2314t;
                z4 = true;
                c3 = 0;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3406c2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            m11537f(c28655q, 0);
            m11539h(c28655q, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11536e(int i13, Composer composer, int i14) {
        m11535d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m11537f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1874447147);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            int i14 = 0;
            for (Object obj : f15172a) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC3712b.m11530b(null, new C21372f(((Number) obj).floatValue(), f15173b.get(i14), EnumC15533f.X_AXIS, null, i14 % 2 == 0 ? " Label" : null, i14 % 4 == 0 ? EnumC21375i.SAGE_HIGH : EnumC21375i.DEFAULT, null, 72, null), c28655q, 0, 1);
                i14 = i15;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11538g(int i13, Composer composer, int i14) {
        m11537f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m11539h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(362849789);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            int i14 = 0;
            for (Object obj : f15172a) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC3712b.m11530b(null, new C21372f(((Number) obj).floatValue(), f15173b.get(i14), EnumC15533f.Y_AXIS, null, null, null, null, 120, null), c28655q, 0, 1);
                i14 = i15;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m11540i(int i13, Composer composer, int i14) {
        m11539h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
