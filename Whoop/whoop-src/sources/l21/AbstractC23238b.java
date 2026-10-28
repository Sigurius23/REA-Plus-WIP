package l21;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gf1.C15786e;
import hy0.C17736e;
import i91.AbstractC18249c;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import j21.C21245d;
import java.util.Iterator;
import java.util.Locale;
import kx1.C22881b;
import l11.AbstractC23221c;
import l11.C23223e;
import l83.C23454a0;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import w71.AbstractC36882f0;
import w71.AbstractC36907z;
import w71.C36906y;
import w71.EnumC36872a0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Ll21/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Ll21/c;", "getPreviewJournalEntryWidgetViewState", "()Ll21/c;", "previewJournalEntryWidgetViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23238b {

    /* JADX INFO: renamed from: a */
    private static final C23239c f92088a = new C23239c("ginger-shot-preview", "Ginger Shot", AbstractC37056f.m118959K(new C36906y(0, null, "Did you have a ginger shot?", null, false, false, new AbstractC36882f0.i(null), null, null, null, 954, null), new C17736e(null, null, null, 7, null), new C36906y(1, null, "How many shots?", null, false, false, new AbstractC36882f0.d(1, 1, 10), null, null, null, 954, null), new C36906y(2, null, "What time?", null, false, false, new AbstractC36882f0.g(AbstractC8693b.m21278l(DateTime.now().withTimeAtStartOfDay().plusHours(8).toString(DefaultDateFormatter.TIME_FORMAT_12H)), DateTime.now().withTimeAtStartOfDay().getMillis(), DateTime.now().withTimeAtStartOfDay().plusHours(23).plusMinutes(30).getMillis(), DateTime.now().withTimeAtStartOfDay().plusHours(8).getMillis()), null, null, null, 954, null)), C23223e.m67193b(AbstractC23221c.m67166A(), null, "ADD TO JOURNAL", null, null, null, null, null, null, false, null, null, null, 4093, null), false, null, null, 112, null);

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m67275e(C23239c viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-256411124);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C22881b(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    float f13 = 1;
                    float f14 = 3 * 4;
                    float f15 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f15, AbstractC18249c.m52567e(AbstractC15751g.m44456i(f13, AbstractC1102d.m3409f(1.0f, modifier3), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f14)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f14), null, 4, null));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f15), C2299e.f9110M, c28655q2, 6);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    String upperCase = viewState.getTitle().toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    C38072d c38072d = C38072d.f163053a;
                    C2886a c2886aM8429j = c38072d.m121952e(c28655q2, 6).getBtM();
                    long brandWhite = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                    function3 = function4;
                    AbstractC30795n.m94707h(upperCase, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j, null, c28655q2, 0, 0, 196602);
                    c28655q = c28655q2;
                    AbstractC28683x.m87247a(AbstractC36907z.m118523f().mo86977a(EnumC36872a0.COMPACT), AbstractC37817c.m121344e(-1163865534, c28655q, new C21245d(9, viewState, function3)), c28655q, 56);
                    c28655q.m87173q(true);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23237a(viewState, modifier3, function3, i13, i14);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22881b(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f16 = 1;
                float f17 = 3 * 4;
                float f18 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f18, AbstractC18249c.m52567e(AbstractC15751g.m44456i(f16, AbstractC1102d.m3409f(1.0f, modifier3), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f17)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f17), null, 4, null));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16 * f18), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                String upperCase2 = viewState.getTitle().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                C38072d c38072d2 = C38072d.f163053a;
                C2886a c2886aM8429j2 = c38072d2.m121952e(c28655q2, 6).getBtM();
                long brandWhite2 = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
                function3 = function4;
                AbstractC30795n.m94707h(upperCase2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j2, null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                AbstractC28683x.m87247a(AbstractC36907z.m118523f().mo86977a(EnumC36872a0.COMPACT), AbstractC37817c.m121344e(-1163865534, c28655q, new C21245d(9, viewState, function3)), c28655q, 56);
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23237a(viewState, modifier3, function3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22881b(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f19 = 1;
                float f110 = 3 * 4;
                float f111 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f111, AbstractC18249c.m52567e(AbstractC15751g.m44456i(f19, AbstractC1102d.m3409f(1.0f, modifier3), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f110)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f110), null, 4, null));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19 * f111), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                String upperCase3 = viewState.getTitle().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                C38072d c38072d3 = C38072d.f163053a;
                C2886a c2886aM8429j3 = c38072d3.m121952e(c28655q2, 6).getBtM();
                long brandWhite3 = c38072d3.m121949b(c28655q2, 6).getBrandWhite();
                function3 = function4;
                AbstractC30795n.m94707h(upperCase3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j3, null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                AbstractC28683x.m87247a(AbstractC36907z.m118523f().mo86977a(EnumC36872a0.COMPACT), AbstractC37817c.m121344e(-1163865534, c28655q, new C21245d(9, viewState, function3)), c28655q, 56);
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23237a(viewState, modifier3, function3, i13, i14);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C22881b(20);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            float f112 = 1;
            float f113 = 3 * 4;
            float f114 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f114, AbstractC18249c.m52567e(AbstractC15751g.m44456i(f112, AbstractC1102d.m3409f(1.0f, modifier3), AbstractC15673b0.m44002P(), AbstractC33253j.m105489e(f113)), AbstractC18249c.m52570h(AbstractC15673b0.m44002P()), AbstractC33253j.m105489e(f113), null, 4, null));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f112 * f114), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            String upperCase4 = viewState.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
            C38072d c38072d4 = C38072d.f163053a;
            C2886a c2886aM8429j4 = c38072d4.m121952e(c28655q2, 6).getBtM();
            long brandWhite4 = c38072d4.m121949b(c28655q2, 6).getBrandWhite();
            function3 = function4;
            AbstractC30795n.m94707h(upperCase4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j4, null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            AbstractC28683x.m87247a(AbstractC36907z.m118523f().mo86977a(EnumC36872a0.COMPACT), AbstractC37817c.m121344e(-1163865534, c28655q, new C21245d(9, viewState, function3)), c28655q, 56);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23237a(viewState, modifier3, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m67276f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m67277g(C23239c c23239c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87150e0(-1783279915);
            Iterator<T> it = c23239c.m67283e().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, new C15786e(21), function1, c28655q, 0, 2);
            }
            c28655q.m87173q(false);
            InterfaceC25312u button = c23239c.getButton();
            if (button == null) {
                c28655q.m87150e0(553255751);
            } else {
                c28655q.m87150e0(553255752);
                AbstractC25303l.m74291r(button, null, null, function1, c28655q, 0, 6);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m67278h(InterfaceC25312u state, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1772923692);
        boolean z4 = state instanceof C36906y;
        Modifier modifierM3398t = C2314t.f9131w;
        if (z4) {
            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 1 * 8, 0.0f, 0.0f, 0.0f, 14);
        }
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m67279i(C23239c c23239c, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m67275e(c23239c, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
