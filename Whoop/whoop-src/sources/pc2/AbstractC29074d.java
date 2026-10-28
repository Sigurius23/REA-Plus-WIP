package pc2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import no0.C26944e0;
import no0.C26984y0;
import ou1.C28376a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qc2.AbstractC30220b;
import qc2.AbstractC30221c;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: pc2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lpc2/f;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "d", "(Lpc2/f;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29074d {

    /* JADX INFO: renamed from: pc2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f117629w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC30221c abstractC30221c) {
            return null;
        }
    }

    /* JADX INFO: renamed from: pc2.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f117630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f117631x;

        public b(Function1 function1, List list) {
            this.f117630w = function1;
            this.f117631x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m88391a(int i13) {
            return this.f117630w.invoke(this.f117631x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m88391a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pc2.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f117632w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29076f f117633x;

        public c(List list, C29076f c29076f) {
            this.f117632w = list;
            this.f117633x = c29076f;
        }

        /* JADX INFO: renamed from: a */
        public final void m88392a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            C28655q c28655q;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q2 = (C28655q) composer;
            if (!c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q2.m87138X();
                return;
            }
            AbstractC30221c abstractC30221c = (AbstractC30221c) this.f117632w.get(i13);
            c28655q2.m87150e0(1497375385);
            boolean zM65745e = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(this.f117633x.m88399a()), abstractC30221c);
            AbstractC30220b.m92488g(null, abstractC30221c, c28655q2, 0, 1);
            if (zM65745e) {
                c28655q = c28655q2;
                c28655q.m87150e0(1497611790);
            } else {
                c28655q2.m87150e0(-1752807182);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 5 * 4, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                c28655q = c28655q2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m88392a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0193  */
    /* JADX WARN: Code duplicated, block: B:46:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m88386d(C29076f viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1642149881);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C28376a(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t))));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, viewState.getTitle());
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault(...)");
                String upperCase = strM92103Y.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8691e(upperCase), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a3, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                float f13 = 4;
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 3.5d) * f13, 0.0f, 2), 3, f13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM95629e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3394p = AbstractC1099a.m3394p(5 * f13, c2314t);
                zM87157i = c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C26944e0(viewState, 28);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q = c28655q;
                AbstractC22674j.m65717c(modifierM3394p, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 510);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(viewState, i13, interfaceC4339a2, i14, 17);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C28376a(27);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44010T(AbstractC1102d.m3407d(1.0f, c2314t2))));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, viewState.getTitle());
            Locale locale2 = Locale.getDefault();
            AbstractC22676k.m65749i(locale2, "getDefault(...)");
            String upperCase2 = strM92103Y2.toUpperCase(locale2);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8691e(upperCase2), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a3, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
            float f14 = 4;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 3.5d) * f14, 0.0f, 2), 3, f14, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM95629e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(5 * f14, c2314t2);
            zM87157i = c28655q.m87157i(viewState);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C26944e0(viewState, 28);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26944e0(viewState, 28);
                c28655q.m87172p0(objM87133R);
            }
            c28655q = c28655q;
            AbstractC22674j.m65717c(modifierM3394p2, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 510);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, interfaceC4339a2, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m88387e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m88388f(C29076f c29076f, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<AbstractC30221c> listM88399a = c29076f.m88399a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM88399a.size(), null, new b(a.f117629w, listM88399a), new C37816b(new c(listM88399a, c29076f), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m88389g(C29076f c29076f, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m88386d(c29076f, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
