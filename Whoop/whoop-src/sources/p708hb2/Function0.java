package p708hb2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import cp0.C10941a;
import f01.C13849c0;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import hy0.C17736e;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import l11.C23223e;
import l11.InterfaceC23222d;
import l21.AbstractC23238b;
import l21.C23239c;
import l83.C23454a0;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import w71.AbstractC36877d;
import w71.AbstractC36882f0;
import w71.C36906y;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hb2.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\n\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "q", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "f", "(Landroidx/compose/runtime/Composer;I)V", "", "text", "u", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "s", "", "a", "J", "TIME_LOWER", "b", "TIME_UPPER", "c", "TIME_INITIAL", "Ll11/e;", "d", "Ll11/e;", "debugButton", "", "answeredYes", "", "magnitude", "timeValue", "Ll11/d;", "buttonState", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {

    /* JADX INFO: renamed from: a */
    private static final long f65676a = DateTime.now().withTimeAtStartOfDay().getMillis();

    /* JADX INFO: renamed from: b */
    private static final long f65677b = DateTime.now().withTimeAtStartOfDay().plusHours(23).plusMinutes(30).getMillis();

    /* JADX INFO: renamed from: c */
    private static final long f65678c = DateTime.now().withTimeAtStartOfDay().plusHours(8).getMillis();

    /* JADX INFO: renamed from: d */
    private static final C23223e f65679d = new C23223e("ginger-shot-cta", "ADD TO JOURNAL", "ADDED", EnumC16313m0.ADD, EnumC16313m0.CHECKMARK, null, null, null, false, "/journal/custom-behaviors/ginger-shot", null, null, 3552, null);

    /* JADX INFO: renamed from: f */
    private static final void m48267f(Composer composer, int i13) {
        byte b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1485045298);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11895b.m32005x(1, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Long.valueOf(f65678c));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(InterfaceC23222d.e.f91942a);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            boolean z4 = !(m48269h(interfaceC28601c4) instanceof InterfaceC23222d.g);
            b = 0;
            C23239c c23239c = new C23239c("ginger-shot-debug", "Ginger Shot", AbstractC37056f.m118959K(new C36906y(0, null, "Did you have a ginger shot?", null, false, z4, new AbstractC36882f0.i(m48268g(interfaceC28601c1)), null, null, null, 922, null), new C17736e(null, null, null, 7, null), new C36906y(1, null, "How many shots?", null, false, z4, new AbstractC36882f0.d(Integer.valueOf(m48274m(interfaceC28601c2)), 1, 10), null, null, null, 922, null), new C36906y(2, null, "What time?", null, false, z4, new AbstractC36882f0.g(AbstractC8693b.m21278l(new DateTime(m48276o(interfaceC28601c3)).toString(DefaultDateFormatter.TIME_FORMAT_12H)), f65676a, f65677b, m48276o(interfaceC28601c3)), null, null, null, 922, null)), C23223e.m67193b(f65679d, null, null, null, null, null, null, null, m48269h(interfaceC28601c4), false, null, null, null, 3967, null), false, null, null, 112, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                C17093a c17093a = new C17093a(interfaceC28601c1, interfaceC28601c4, interfaceC28601c2, interfaceC28601c3, 0);
                c28655q.m87172p0(c17093a);
                objM87133R5 = c17093a;
            }
            AbstractC23238b.m67275e(c23239c, modifierM3409f2, (Function1) objM87133R5, c28655q, C23239c.f92089h | 432, 0);
            c28655q.m87173q(true);
        } else {
            b = 0;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0(b, i13, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final Boolean m48268g(InterfaceC28601c1 interfaceC28601c1) {
        return (Boolean) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final InterfaceC23222d m48269h(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC23222d) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final void m48270i(InterfaceC28601c1 interfaceC28601c1, InterfaceC23222d interfaceC23222d) {
        interfaceC28601c1.setValue(interfaceC23222d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m48271j(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC36877d.k) {
            AbstractC36877d.k kVar = (AbstractC36877d.k) event;
            m48273l(interfaceC28601c1, kVar.getBoolean());
            m48270i(interfaceC28601c2, kVar.getBoolean() == null ? InterfaceC23222d.e.f91942a : InterfaceC23222d.a.f91938a);
        } else if (event instanceof AbstractC36877d.a) {
            Integer numM118275a = ((AbstractC36877d.a) event).getNumber();
            if (numM118275a != null) {
                m48275n(interfaceC28601c3, numM118275a.intValue());
            }
        } else if (event instanceof AbstractC36877d.i) {
            Long lM118291b = ((AbstractC36877d.i) event).getTime();
            if (lM118291b != null) {
                m48277p(interfaceC28601c4, lM118291b.longValue());
            }
        } else if (event instanceof C23223e) {
            m48270i(interfaceC28601c2, InterfaceC23222d.c.f91940a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m48272k(int i13, Composer composer, int i14) {
        m48267f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m48273l(InterfaceC28601c1 interfaceC28601c1, Boolean bool) {
        interfaceC28601c1.setValue(bool);
    }

    /* JADX INFO: renamed from: m */
    private static final int m48274m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m48275n(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: o */
    private static final long m48276o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).longValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m48277p(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(Long.valueOf(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m48278q(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1594719870);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("Journal-Entry Widget Debug"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q, ((i14 << 9) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f13, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            m48282u("JOURNAL_ENTRY_WIDGET — interactive", c28655q, 6);
            m48280s("Renders the real JournalEntryWidget composable with hardcoded sample state. Tap Yes/No to enable the CTA, tap the stepper to bump the magnitude, drag the time slider. ADD TO JOURNAL fires against a nonexistent path and flips the button to its error treatment — expected, there is no backend here.", c28655q, 0);
            m48267f(c28655q, 0);
            AbstractC25012a.m73388u(10, f13, c2314t, c28655q, true);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 6, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m48279r(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m48278q(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m48280s(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1670382832);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m48281t(String str, int i13, Composer composer, int i14) {
        m48280s(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m48282u(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-902256303);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH2(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m48283v(String str, int i13, Composer composer, int i14) {
        m48282u(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
