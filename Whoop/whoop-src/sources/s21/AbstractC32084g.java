package s21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jz0.C22068a;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ow2.C28444g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15170v4;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q81.C30047e;
import qb0.C30179a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s21.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u001a\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ls21/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "j", "(Ls21/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ls21/h;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "cta", "Ly81/f;", "ctaColorKey", "m", "(Lcom/whoop/design/util/TextResource;Ly81/f;Landroidx/compose/runtime/Composer;I)V", "Ls21/i;", "progressType", "", "filledCount", "totalCount", "Li2/x;", "progressColor", "backgroundColor", "o", "(Ls21/i;IIJJLandroidx/compose/runtime/Composer;II)V", "q", "(IIJJLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32084g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    private static final void m99800h(C32085h c32085h, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r14;
        C17919x c17919xM31989h;
        int i15;
        long jM125370W0;
        long jM125398i;
        C28655q c28655q2;
        boolean z4;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(854099740);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q3.m87157i(c32085h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 3.5d) * f13, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q3, 54);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c32085h.getTitle(), c28655q3, 0);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q3, 6).getB1();
            long jM125430y = c38072d.m121949b(c28655q3, 6).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, false), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 0, 0, 196600);
            InterfaceC25312u interfaceC25312uM99822k = c32085h.getNavigationTag();
            if (interfaceC25312uM99822k == null) {
                c28655q3.m87150e0(976519110);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(976519111);
                AbstractC25303l.m74291r(interfaceC25312uM99822k, null, null, null, c28655q3, 0, 14);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(((float) 0.5d) * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32085h.getSubtitle(), c28655q3, 0), null, c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q3, 0, 0, 196602);
            C28655q c28655q4 = c28655q3;
            if (c32085h.getIsUnlocked()) {
                c28655q4.m87150e0(-1573682937);
                if (AbstractC8693b.m21270d(c32085h.getCta())) {
                    c28655q4.m87150e0(-1573639041);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(1 * f13, c2314t));
                    z4 = false;
                    m99805m(c32085h.getCta(), c32085h.getCtaColor(), c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    z4 = false;
                    c28655q4.m87150e0(-1573426660);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(z4);
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(-1573395629);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(1 * f13, c2314t));
                EnumC32086i enumC32086iM99826o = c32085h.getType();
                int iM99818g = c32085h.getFilledCount();
                int iM99825n = c32085h.getTotalCount();
                EnumC39333f enumC39333fM99813b = c32085h.getColor();
                C17919x c17919xM31989h2 = null;
                if (enumC39333fM99813b == null) {
                    c28655q4.m87150e0(-1573117560);
                    r14 = 0;
                    c28655q4.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    r14 = 0;
                    c28655q4.m87150e0(780538265);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q4, false, enumC39333fM99813b.mo134584toComposableColorWaAFU9c(c28655q4, 0));
                }
                if (c17919xM31989h == null) {
                    c28655q4.m87150e0(780539565);
                    i15 = 6;
                    jM125370W0 = c38072d.m121949b(c28655q4, 6).getWhite10();
                    c28655q4.m87173q(r14);
                } else {
                    i15 = 6;
                    c28655q4.m87150e0(780537767);
                    c28655q4.m87173q(r14);
                    jM125370W0 = c17919xM31989h.f69639a;
                }
                EnumC39333f enumC39333fM99823l = c32085h.getProgressColor();
                if (enumC39333fM99823l == 0) {
                    c28655q4.m87150e0(-1573011416);
                    c28655q4.m87173q(r14);
                } else {
                    c28655q4.m87150e0(780541689);
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q4, r14, enumC39333fM99823l.mo134584toComposableColorWaAFU9c(c28655q4, r14));
                }
                if (c17919xM31989h2 == null) {
                    c28655q4.m87150e0(780543004);
                    jM125398i = c38072d.m121949b(c28655q4, i15).getAccentOnboardingAction();
                    c28655q4.m87173q(r14);
                } else {
                    c28655q4.m87150e0(780540958);
                    c28655q4.m87173q(r14);
                    jM125398i = c17919xM31989h2.f69639a;
                }
                m99807o(enumC32086iM99826o, iM99818g, iM99825n, jM125398i, jM125370W0, c28655q4, 0, 0);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(r14);
                c28655q2 = c28655q5;
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28444g(c32085h, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99801i(C32085h c32085h, int i13, Composer composer, int i14) {
        m99800h(c32085h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x0216  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:80:0x0231  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m99802j(C32085h viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        Modifier modifierM44455h;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-348592105);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(viewState);
                objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C30599e(26, onViewEvent, viewState);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R, 3);
                if (viewState.getIsUnlocked()) {
                    c28655q2.m87150e0(323901983);
                    modifierM44455h = AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10());
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(324111605);
                    float f13 = 4;
                    modifierM44455h = AbstractC15751g.m44455h(c2314t, ((float) 0.375d) * f13, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10(), AbstractC33253j.m105489e(3 * f13));
                    c28655q2.m87173q(false);
                }
                Modifier modifierMo3471e = modifierM5391i.mo3471e(modifierM44455h);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                float f14 = 8;
                float f15 = ((float) 2.5d) * f14;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f15, ((float) 0.5d) * f14);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                c28655q2.m87158i0();
                int i17 = i15;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                float f16 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(18 * f16, c2314t);
                c28655q = c28655q2;
                Modifier modifier5 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, 0, 3), null, modifierM3419p, null, null, 0.0f, null, c28655q, 432, 120);
                m99800h(viewState, c28655q, i17 & 14);
                c28655q.m87173q(true);
                if (!viewState.getIsUnlocked() || viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String() == null) {
                    c28655q.m87150e0(-2035293531);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2035734940);
                    float f17 = ((float) 1.5d) * f14;
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f16 * f16, AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y), 0.0f, f17, f17, 0.0f, 9));
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(c38072d.m121951d().getVarious().getEducation(), c28655q, 0), null, modifierM3419p2, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 48, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(viewState, onViewEvent, modifier3, i13, i14, 25);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q2.m87157i(viewState);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new C30599e(26, onViewEvent, viewState);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C30599e(26, onViewEvent, viewState);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R, 3);
            if (viewState.getIsUnlocked()) {
                c28655q2.m87150e0(323901983);
                modifierM44455h = AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10());
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(324111605);
                float f18 = 4;
                modifierM44455h = AbstractC15751g.m44455h(c2314t, ((float) 0.375d) * f18, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10(), AbstractC33253j.m105489e(3 * f18));
                c28655q2.m87173q(false);
            }
            Modifier modifierMo3471e2 = modifierM5391i2.mo3471e(modifierM44455h);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            float f19 = 8;
            float f110 = ((float) 2.5d) * f19;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f110, ((float) 0.5d) * f19);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f110), C2299e.f9108K, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
            c28655q2.m87158i0();
            int i18 = i15;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            float f111 = 4;
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(18 * f111, c2314t);
            c28655q = c28655q2;
            Modifier modifier6 = modifier4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, 0, 3), null, modifierM3419p3, null, null, 0.0f, null, c28655q, 432, 120);
            m99800h(viewState, c28655q, i18 & 14);
            c28655q.m87173q(true);
            if (viewState.getIsUnlocked()) {
                c28655q.m87150e0(-2035293531);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2035293531);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(viewState, onViewEvent, modifier3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99803k(Function1 function1, C32085h c32085h) {
        Object objM99820i = c32085h.getInteraction();
        if (objM99820i == null && (objM99820i = c32085h.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String()) == null) {
            objM99820i = C32080c.f133040a;
        }
        function1.invoke(objM99820i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m99804l(C32085h c32085h, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m99802j(c32085h, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m99805m(TextResource textResource, EnumC39333f enumC39333f, Composer composer, int i13) {
        int i14;
        C17919x c17919xM31989h;
        long jM125398i;
        long jM125398i2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1591971975);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i15 & 14);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8430k = c38072d.m121952e(c28655q, 6).getBtS();
            C17919x c17919xM31989h2 = null;
            if (enumC39333f == null) {
                c28655q.m87150e0(-1462908701);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(1338282718);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 3) & 14));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(1338284033);
                jM125398i = c38072d.m121949b(c28655q, 6).getAccentOnboardingAction();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1338282359);
                c28655q.m87173q(false);
                jM125398i = c17919xM31989h.f69639a;
            }
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM125398i, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k, null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, c2314t);
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 0);
            if (enumC39333f == null) {
                c28655q.m87150e0(-1462661693);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1338290686);
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 3) & 14));
            }
            C17919x c17919x = c17919xM31989h2;
            if (c17919x == null) {
                c28655q.m87150e0(1338292001);
                jM125398i2 = c38072d.m121949b(c28655q, 6).getAccentOnboardingAction();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1338290327);
                c28655q.m87173q(false);
                jM125398i2 = c17919x.f69639a;
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM3419p, jM125398i2, c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(textResource, enumC39333f, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m99806n(TextResource textResource, EnumC39333f enumC39333f, int i13, Composer composer, int i14) {
        m99805m(textResource, enumC39333f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m99807o(EnumC32086i enumC32086i, int i13, int i14, long j7, long j13, Composer composer, int i15, int i16) {
        int i17;
        long jM125398i;
        long jM125372X0;
        long j14;
        long j15;
        C23454a0 c23454a0;
        int i18;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2031392947);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87149e(enumC32086i == null ? -1 : enumC32086i.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                jM125398i = j7;
                if (c28655q.m87151f(jM125398i)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i17 |= i19;
            } else {
                jM125398i = j7;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i17 |= i19;
        } else {
            jM125398i = j7;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jM125372X0 = j13;
                if (c28655q.m87151f(jM125372X0)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i17 |= i18;
            } else {
                jM125372X0 = j13;
            }
            i18 = DfuBaseService.ERROR_REMOTE_MASK;
            i17 |= i18;
        } else {
            jM125372X0 = j13;
        }
        if (c28655q.m87135U(i17 & 1, (i17 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i15 & 1) == 0 || c28655q.m87118C()) {
                if ((i16 & 8) != 0) {
                    jM125398i = C38072d.f163053a.m121949b(c28655q, 6).getAccentOnboardingAction();
                    i17 &= -7169;
                }
                if ((i16 & 16) != 0) {
                    jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                    i17 &= -57345;
                }
            } else {
                c28655q.m87138X();
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                }
            }
            int i24 = i17;
            c28655q.m87175r();
            if (enumC32086i == null) {
                c28655q.m87150e0(1138353138);
                c28655q.m87173q(false);
                c23454a0 = null;
                j14 = jM125398i;
                j15 = jM125372X0;
            } else {
                c28655q.m87150e0(1138353139);
                if (enumC32086i == EnumC32086i.PROGRESS_BAR) {
                    c28655q.m87150e0(-916516580);
                    float f13 = 4;
                    long j16 = jM125372X0;
                    AbstractC15170v4.m43204d(i13 / i14, (i24 >> 3) & 8064, jM125398i, j16, c28655q, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(1 * f13, C2314t.f9131w)), 3, f13));
                    j14 = jM125398i;
                    j15 = j16;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    j14 = jM125398i;
                    j15 = jM125372X0;
                    c28655q.m87150e0(-916100343);
                    m99809q(i13, i14, j14, j15, c28655q, (i24 >> 3) & 8190, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(-2041465911);
                m99809q(i13, i14, j14, j15, c28655q, (i24 >> 3) & 8190, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2041489161);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            j14 = jM125398i;
            j15 = jM125372X0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22068a(enumC32086i, i13, i14, j14, j15, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m99808p(EnumC32086i enumC32086i, int i13, int i14, long j7, long j13, int i15, int i16, Composer composer, int i17) {
        m99807o(enumC32086i, i13, i14, j7, j13, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m99809q(final int i13, final int i14, long j7, long j13, Composer composer, final int i15, final int i16) {
        int i17;
        long j14;
        final long j15;
        final long j16;
        final long jM125372X0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(932579321);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            if ((i16 & 4) == 0) {
                j14 = j7;
                int i18 = c28655q.m87151f(j14) ? 256 : 128;
                i17 |= i18;
            } else {
                j14 = j7;
            }
            i17 |= i18;
        } else {
            j14 = j7;
        }
        if ((i15 & 3072) == 0) {
            j15 = j13;
            i17 |= ((i16 & 8) == 0 && c28655q.m87151f(j15)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            j15 = j13;
        }
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i15 & 1) == 0 || c28655q.m87118C()) {
                long jM125398i = (i16 & 4) != 0 ? C38072d.f163053a.m121949b(c28655q, 6).getAccentOnboardingAction() : j14;
                if ((i16 & 8) != 0) {
                    j16 = jM125398i;
                    jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                } else {
                    j16 = jM125398i;
                }
                c28655q.m87175r();
                AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(1516225507, c28655q, new Function3() { // from class: s21.e
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC32084g.m99810r(i14, i13, j16, jM125372X0, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3078, 6);
                j15 = jM125372X0;
            } else {
                c28655q.m87138X();
                j16 = j14;
            }
            jM125372X0 = j15;
            c28655q.m87175r();
            AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, AbstractC37817c.m121344e(1516225507, c28655q, new Function3() { // from class: s21.e
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC32084g.m99810r(i14, i13, j16, jM125372X0, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3078, 6);
            j15 = jM125372X0;
        } else {
            c28655q.m87138X();
            j16 = j14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final long j17 = j16;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: s21.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32084g.m99811s(i13, i14, j17, j15, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m99810r(int i13, int i14, long j7, long j13, InterfaceC23004v BoxWithConstraints, Composer composer, int i15) {
        int i16;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i15 & 6) == 0) {
            i16 = i15 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i16 = i15;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f13 = 4;
            float f14 = 1 * f13;
            float fM3403d = (((C1101c) BoxWithConstraints).m3403d() - ((i13 - 1) * f14)) / i13;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1147672462);
            int i17 = 0;
            while (i17 < i13) {
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f14, AbstractC1102d.m3424u(fM3403d, c2314t)), 3, f13), i17 < i14 ? j7 : j13, AbstractC17918w0.f69621a), c28655q, 0);
                i17++;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m99811s(int i13, int i14, long j7, long j13, int i15, int i16, Composer composer, int i17) {
        m99809q(i13, i14, j7, j13, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
