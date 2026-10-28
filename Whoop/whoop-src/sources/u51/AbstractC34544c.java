package u51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.design.atomic.organism.dynamicinformationalimagecard.DynamicInformationalImageCardLayoutState;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d41.C11678d;
import gy0.AbstractC16277f;
import hy0.AbstractC17746g1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p510u0.C34350r;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import t01.C33259e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lu51/d;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Lu51/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "q", "(Lu51/d;Landroidx/compose/runtime/Composer;I)V", "k", "Lkd1/o;", "icon", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34544c {
    /* JADX INFO: renamed from: h */
    private static final void m109164h(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1305259788);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        } else {
            if (abstractC22403o == null) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11678d(abstractC22403o, i13, 9);
                    return;
                }
                return;
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * 4, C2314t.f9131w);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3419p, null, null, 0.0f, null, c28655q, 432, 120);
            c28655q = c28655q;
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            c28677v1M87180u2.f115982d = new C11678d(abstractC22403o2, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m109165i(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m109164h(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m109166j(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m109164h(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
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
    /* JADX INFO: renamed from: k */
    private static final void m109167k(C34545d c34545d, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        float f13;
        C2314t c2314t;
        ?? r10;
        int i15;
        C28655q c28655q2;
        C28655q c28655q3;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-70381024);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q4.m87153g(c34545d) : c28655q4.m87157i(c34545d) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q4.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 2;
            float f15 = 8;
            float f16 = f14 * f15;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f16, AbstractC1102d.m3407d(1.0f, c2314t2));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), C2299e.f9108K, c28655q4, 54);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
            m109164h(c34545d.getIcon(), c28655q4, 0);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15 * 0.25f), C2299e.f9110M, c28655q4, 6);
            int iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
            TextResource textResourceM109181h = c34545d.getTitle();
            if (textResourceM109181h == null) {
                c28655q4.m87150e0(-199289037);
                c28655q4.m87173q(false);
                r10 = 0;
                c2314t = c2314t2;
                f13 = f14;
                i15 = 6;
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(-199289036);
                String strM21274h = AbstractC8693b.m21274h(textResourceM109181h, c28655q4, 0);
                C38072d c38072d = C38072d.f163053a;
                f13 = f14;
                c2314t = c2314t2;
                r10 = 0;
                i15 = 6;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, C28780r.f116541H, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getB1(), null, c28655q4, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 196570);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            TextResource textResourceM109176b = c34545d.getDescription();
            if (textResourceM109176b == null) {
                c28655q2.m87150e0(-198949494);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-198949493);
                String upperCase = AbstractC8693b.m21274h(textResourceM109176b, c28655q2, r10).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q6 = c28655q2;
                AbstractC30795n.m94707h(upperCase, null, c38072d2.m121949b(c28655q2, i15).getWhite70(), 0L, null, C28780r.f116541H, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i15).getB2(), null, c28655q6, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 196570);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(r10);
                c28655q3 = c28655q7;
            }
            c28655q3.m87173q(true);
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * 4, c2314t);
            C38072d c38072d3 = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q3, i15), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62352m1), modifierM3419p, c38072d3.m121949b(c28655q3, i15).getBrandWhite(), c28655q3, 384, 0);
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34543b(c34545d, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m109168l(C34545d c34545d, int i13, Composer composer, int i14) {
        m109167k(c34545d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0237  */
    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
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
    /* JADX INFO: renamed from: m */
    public static final void m109169m(C34545d viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Object obj;
        boolean z13;
        C9598e c9598eM109177c;
        boolean z14;
        boolean zM87157i;
        Object objM87133R;
        Modifier modifierM3362g;
        float f13;
        int i18;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        AbstractC22403o abstractC22403oM109175a;
        float f14;
        C2314t c2314t2;
        ?? r10;
        C28655q c28655q2;
        C17894k0 c17894k0M51483a;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1239728733);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(viewState) : c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q3.m87157i(function2)) {
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
                if (c28655q3.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier2 = c2314t;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C34350r(27);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function2;
                    }
                    if (viewState.getLayoutState() == DynamicInformationalImageCardLayoutState.EXPANDED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c9598eM109177c = viewState.getDestination();
                    if (c9598eM109177c == null) {
                        c28655q3.m87150e0(-334598420);
                        c28655q3.m87173q(false);
                        modifierM3362g = null;
                    } else {
                        c28655q3.m87150e0(-334598419);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = z14 | c28655q3.m87157i(c9598eM109177c);
                        objM87133R = c28655q3.m87133R();
                        if (zM87157i || objM87133R == obj) {
                            objM87133R = new C4789l(function3, c9598eM109177c, 9);
                            c28655q3.m87172p0(objM87133R);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        c28655q3.m87173q(false);
                    }
                    if (modifierM3362g == null) {
                        modifierM3362g = c2314t;
                    }
                    f13 = 1.0f;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                    if (z13) {
                        i18 = 54;
                    } else {
                        i18 = 30;
                    }
                    Modifier modifierMo3471e = AbstractC37056f.m118994r(AbstractC1102d.m3411h(i18 * 4, modifierM3409f), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM3362g);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                    abstractC22403oM109175a = viewState.getBackgroundImage();
                    if (abstractC22403oM109175a == null) {
                        c28655q3.m87150e0(205104886);
                        c28655q3.m87173q(false);
                        r10 = 0;
                        c2314t2 = c2314t;
                        c28655q2 = c28655q3;
                    } else {
                        c28655q3.m87150e0(205104887);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (z13) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.7f;
                        }
                        Modifier modifierM107879c = AbstractC34132o.m107879c(f14, modifierM3407d);
                        c2314t2 = c2314t;
                        r10 = 0;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM109175a, null, null, c28655q3, 0, 3), null, modifierM107879c, null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                        C28655q c28655q4 = c28655q3;
                        c28655q4.m87173q(false);
                        f13 = 1.0f;
                        c28655q2 = c28655q4;
                    }
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(f13, c2314t2);
                    if (z13) {
                        c28655q2.m87150e0(205589882);
                        c17894k0M51483a = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                        c28655q2.m87173q(r10);
                    } else {
                        c28655q2.m87150e0(205721880);
                        c17894k0M51483a = C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                        c28655q2.m87173q(r10);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3407d2, c17894k0M51483a, null, 0.0f, 6), c28655q2, r10);
                    if (z13) {
                        c28655q2.m87150e0(205899975);
                        m109173q(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                        c28655q2.m87173q(r10);
                    } else {
                        c28655q2.m87150e0(205955558);
                        m109167k(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                        c28655q2.m87173q(r10);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                } else {
                    c28655q3.m87138X();
                    function3 = function2;
                    c28655q = c28655q3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33259e(i13, i14, 12, modifier2, function3, (InterfaceC25312u) viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C34350r(27);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (viewState.getLayoutState() == DynamicInformationalImageCardLayoutState.EXPANDED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c9598eM109177c = viewState.getDestination();
                if (c9598eM109177c == null) {
                    c28655q3.m87150e0(-334598420);
                    c28655q3.m87173q(false);
                    modifierM3362g = null;
                } else {
                    c28655q3.m87150e0(-334598419);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q3.m87157i(c9598eM109177c);
                    objM87133R = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R = new C4789l(function3, c9598eM109177c, 9);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C4789l(function3, c9598eM109177c, 9);
                        c28655q3.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q3.m87173q(false);
                }
                if (modifierM3362g == null) {
                    modifierM3362g = c2314t;
                }
                f13 = 1.0f;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                if (z13) {
                    i18 = 54;
                } else {
                    i18 = 30;
                }
                Modifier modifierMo3471e2 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(i18 * 4, modifierM3409f2), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM3362g);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                abstractC22403oM109175a = viewState.getBackgroundImage();
                if (abstractC22403oM109175a == null) {
                    c28655q3.m87150e0(205104886);
                    c28655q3.m87173q(false);
                    r10 = 0;
                    c2314t2 = c2314t;
                    c28655q2 = c28655q3;
                } else {
                    c28655q3.m87150e0(205104887);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (z13) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.7f;
                    }
                    Modifier modifierM107879c2 = AbstractC34132o.m107879c(f14, modifierM3407d3);
                    c2314t2 = c2314t;
                    r10 = 0;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM109175a, null, null, c28655q3, 0, 3), null, modifierM107879c2, null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                    C28655q c28655q5 = c28655q3;
                    c28655q5.m87173q(false);
                    f13 = 1.0f;
                    c28655q2 = c28655q5;
                }
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(f13, c2314t2);
                if (z13) {
                    c28655q2.m87150e0(205589882);
                    c17894k0M51483a = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                    c28655q2.m87173q(r10);
                } else {
                    c28655q2.m87150e0(205721880);
                    c17894k0M51483a = C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                    c28655q2.m87173q(r10);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3407d4, c17894k0M51483a, null, 0.0f, 6), c28655q2, r10);
                if (z13) {
                    c28655q2.m87150e0(205899975);
                    m109173q(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                    c28655q2.m87173q(r10);
                } else {
                    c28655q2.m87150e0(205955558);
                    m109167k(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                    c28655q2.m87173q(r10);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function3 = function2;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 12, modifier2, function3, (InterfaceC25312u) viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q3.m87157i(function2)) {
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
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C34350r(27);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (viewState.getLayoutState() == DynamicInformationalImageCardLayoutState.EXPANDED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c9598eM109177c = viewState.getDestination();
                if (c9598eM109177c == null) {
                    c28655q3.m87150e0(-334598420);
                    c28655q3.m87173q(false);
                    modifierM3362g = null;
                } else {
                    c28655q3.m87150e0(-334598419);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q3.m87157i(c9598eM109177c);
                    objM87133R = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R = new C4789l(function3, c9598eM109177c, 9);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C4789l(function3, c9598eM109177c, 9);
                        c28655q3.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q3.m87173q(false);
                }
                if (modifierM3362g == null) {
                    modifierM3362g = c2314t;
                }
                f13 = 1.0f;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                if (z13) {
                    i18 = 54;
                } else {
                    i18 = 30;
                }
                Modifier modifierMo3471e3 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(i18 * 4, modifierM3409f3), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM3362g);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                abstractC22403oM109175a = viewState.getBackgroundImage();
                if (abstractC22403oM109175a == null) {
                    c28655q3.m87150e0(205104886);
                    c28655q3.m87173q(false);
                    r10 = 0;
                    c2314t2 = c2314t;
                    c28655q2 = c28655q3;
                } else {
                    c28655q3.m87150e0(205104887);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (z13) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.7f;
                    }
                    Modifier modifierM107879c3 = AbstractC34132o.m107879c(f14, modifierM3407d5);
                    c2314t2 = c2314t;
                    r10 = 0;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM109175a, null, null, c28655q3, 0, 3), null, modifierM107879c3, null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                    C28655q c28655q6 = c28655q3;
                    c28655q6.m87173q(false);
                    f13 = 1.0f;
                    c28655q2 = c28655q6;
                }
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(f13, c2314t2);
                if (z13) {
                    c28655q2.m87150e0(205589882);
                    c17894k0M51483a = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                    c28655q2.m87173q(r10);
                } else {
                    c28655q2.m87150e0(205721880);
                    c17894k0M51483a = C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                    c28655q2.m87173q(r10);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3407d6, c17894k0M51483a, null, 0.0f, 6), c28655q2, r10);
                if (z13) {
                    c28655q2.m87150e0(205899975);
                    m109173q(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                    c28655q2.m87173q(r10);
                } else {
                    c28655q2.m87150e0(205955558);
                    m109167k(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                    c28655q2.m87173q(r10);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                function3 = function2;
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 12, modifier2, function3, (InterfaceC25312u) viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            obj = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C34350r(27);
                    c28655q3.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            if (viewState.getLayoutState() == DynamicInformationalImageCardLayoutState.EXPANDED) {
                z13 = true;
            } else {
                z13 = false;
            }
            c9598eM109177c = viewState.getDestination();
            if (c9598eM109177c == null) {
                c28655q3.m87150e0(-334598420);
                c28655q3.m87173q(false);
                modifierM3362g = null;
            } else {
                c28655q3.m87150e0(-334598419);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q3.m87157i(c9598eM109177c);
                objM87133R = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R = new C4789l(function3, c9598eM109177c, 9);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4789l(function3, c9598eM109177c, 9);
                    c28655q3.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q3.m87173q(false);
            }
            if (modifierM3362g == null) {
                modifierM3362g = c2314t;
            }
            f13 = 1.0f;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            if (z13) {
                i18 = 54;
            } else {
                i18 = 30;
            }
            Modifier modifierMo3471e4 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(i18 * 4, modifierM3409f4), AbstractC33253j.m105489e(3 * 4)).mo3471e(modifierM3362g);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
            abstractC22403oM109175a = viewState.getBackgroundImage();
            if (abstractC22403oM109175a == null) {
                c28655q3.m87150e0(205104886);
                c28655q3.m87173q(false);
                r10 = 0;
                c2314t2 = c2314t;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(205104887);
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (z13) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.7f;
                }
                Modifier modifierM107879c4 = AbstractC34132o.m107879c(f14, modifierM3407d7);
                c2314t2 = c2314t;
                r10 = 0;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM109175a, null, null, c28655q3, 0, 3), null, modifierM107879c4, null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                C28655q c28655q7 = c28655q3;
                c28655q7.m87173q(false);
                f13 = 1.0f;
                c28655q2 = c28655q7;
            }
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(f13, c2314t2);
            if (z13) {
                c28655q2.m87150e0(205589882);
                c17894k0M51483a = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                c28655q2.m87173q(r10);
            } else {
                c28655q2.m87150e0(205721880);
                c17894k0M51483a = C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, 6).getBrandBlack())), 0.0f, 0.0f, 14);
                c28655q2.m87173q(r10);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3407d8, c17894k0M51483a, null, 0.0f, 6), c28655q2, r10);
            if (z13) {
                c28655q2.m87150e0(205899975);
                m109173q(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                c28655q2.m87173q(r10);
            } else {
                c28655q2.m87150e0(205955558);
                m109167k(viewState, c28655q2, (i15 & 14) | C9598e.f28134d);
                c28655q2.m87173q(r10);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            function3 = function2;
            c28655q = c28655q3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(i13, i14, 12, modifier2, function3, (InterfaceC25312u) viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m109170n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m109171o(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m109172p(C34545d c34545d, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109169m(c34545d, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r24v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r24v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r4v9, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v16, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
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
    /* JADX INFO: renamed from: q */
    private static final void m109173q(C34545d c34545d, Composer composer, int i13) {
        int i14;
        ?? r10;
        C2305k c2305k;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        ?? r14;
        ?? r15;
        C2314t c2314t;
        ?? r16;
        C2314t c2314t2;
        ?? r17;
        ?? r18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1463361762);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c34545d) : c28655q.m87157i(c34545d) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 1.0f;
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            TextResource textResourceM109180g = c34545d.getTagTitle();
            if (textResourceM109180g == null) {
                c28655q.m87150e0(-1758282802);
                c28655q.m87173q(false);
                c0209i = c0209i8;
                c2314t = c2314t3;
                r14 = 0;
                c0209i4 = c0209i6;
                c2305k = c2305k2;
                c0209i3 = c0209i7;
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                r15 = 1;
                r16 = c28655q;
            } else {
                c28655q.m87150e0(-1758282801);
                Modifier modifierM3394p = AbstractC1099a.m3394p(8 * 1.0f, AbstractC1102d.m3409f(1.0f, c2314t3));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N2);
                C38072d c38072d = C38072d.f163053a;
                c2305k = c2305k2;
                c0213j = c0213j2;
                c0209i = c0209i8;
                c0209i2 = c0209i5;
                c0209i3 = c0209i7;
                c0209i4 = c0209i6;
                r14 = 0;
                r15 = 1;
                AbstractC17746g1.m50874j(textResourceM109180g, c38072d.m121949b(c28655q, 6).getBrandWhite(), null, c38072d.m121949b(c28655q, 6).getBrandBlack(), null, false, null, null, 0.0f, null, AbstractC33253j.m105489e(2 * 4), 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, 0, 0, 0, 8387572);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
                c2314t = c2314t3;
                f13 = 1.0f;
                r16 = c28655q2;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(f13, c2314t);
            if ((((double) f13) > 0.0d ? r15 : r14) == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, r15, f13);
            float f14 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM31988g, 1.5f * f14, 2.0f * f14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(((float) r15) * f14, C2299e.f9109L), c2305k, r16, 54);
            int iHashCode3 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r16.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r16, modifierM3395q);
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(r16, c0209i4, interfaceC28653p1M87165m3);
            if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(r16, c0209i, modifierM118962N3);
            m109164h(c34545d.getIcon(), r16, r14);
            TextResource textResourceM109181h = c34545d.getTitle();
            if (textResourceM109181h == null) {
                r16.m87150e0(1882187571);
                r16.m87173q(r14);
                c2314t2 = c2314t;
                r17 = r16;
            } else {
                r16.m87150e0(1882187572);
                String strM21274h = AbstractC8693b.m21274h(textResourceM109181h, r16, r14);
                ?? r19 = C38072d.f163053a;
                ?? r24 = r16;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM21274h, null, r19.m121949b(r16, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r19.m121952e(r16, 6).getT4(), null, r24, 0, 0, 196602);
                ?? r25 = r24;
                r25.m87173q(r14);
                r17 = r25;
            }
            TextResource textResourceM109176b = c34545d.getDescription();
            if (textResourceM109176b == null) {
                r17.m87150e0(1882443445);
                r17.m87173q(r14);
                r18 = r17;
            } else {
                r17.m87150e0(1882443446);
                Modifier modifierM107879c = AbstractC34132o.m107879c(0.7f, c2314t2);
                String upperCase = AbstractC8693b.m21274h(textResourceM109176b, r17, r14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                ?? r26 = C38072d.f163053a;
                ?? r27 = r17;
                AbstractC30795n.m94707h(upperCase, modifierM107879c, r26.m121949b(r17, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r26.m121952e(r17, 6).getH5(), null, r27, 48, 0, 196600);
                ?? r28 = r27;
                r28.m87173q(r14);
                r18 = r28;
            }
            r18.m87173q(true);
            r18.m87173q(true);
            r10 = r18;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34543b(c34545d, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m109174r(C34545d c34545d, int i13, Composer composer, int i14) {
        m109173q(c34545d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
