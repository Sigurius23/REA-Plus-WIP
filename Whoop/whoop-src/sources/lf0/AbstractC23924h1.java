package lf0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c41.C4159z0;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import ih1.C18522f;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jp1.C21851c;
import js2.C21930h;
import jt1.C21937b;
import k91.C22303b;
import kd1.AbstractC22403o;
import kd1.C22411w;
import l83.C23454a0;
import m83.AbstractC25265s;
import ma0.AbstractC25370d;
import ny0.AbstractC27265l0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: lf0.h1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/i1;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Llf0/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lk91/b;", "shape", "s", "(Landroidx/compose/ui/Modifier;Lk91/b;)Landroidx/compose/ui/Modifier;", "k", "(Llf0/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "", "iconRotation", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23924h1 {
    /* JADX INFO: renamed from: i */
    public static final void m70375i(Modifier modifier, C23928i1 state, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-238859596);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("al-test-history-v2")) {
                c28655q.m87150e0(894971143);
                m70377k(state, onViewEvent, AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7), c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(895155655);
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, m70385s(AbstractC1102d.m3409f(1.0f, modifier4), C22411w.f87680a.m64535a().m64091d()));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                m70377k(state, onViewEvent, null, c28655q, (i15 >> 3) & 126, 4);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23920g1(modifier3, state, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m70376j(Modifier modifier, C23928i1 c23928i1, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m70375i(modifier, c23928i1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0378  */
    /* JADX WARN: Code duplicated, block: B:103:0x0386  */
    /* JADX WARN: Code duplicated, block: B:106:0x0394  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0412  */
    /* JADX WARN: Code duplicated, block: B:112:0x0415  */
    /* JADX WARN: Code duplicated, block: B:114:0x044a  */
    /* JADX WARN: Code duplicated, block: B:117:0x045a  */
    /* JADX WARN: Code duplicated, block: B:127:0x050b  */
    /* JADX WARN: Code duplicated, block: B:129:0x051b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0525  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:76:0x0230  */
    /* JADX WARN: Code duplicated, block: B:79:0x0235  */
    /* JADX WARN: Code duplicated, block: B:84:0x028e A[LOOP:0: B:82:0x0288->B:84:0x028e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0309  */
    /* JADX WARN: Code duplicated, block: B:90:0x0316  */
    /* JADX WARN: Code duplicated, block: B:93:0x0329  */
    /* JADX WARN: Code duplicated, block: B:94:0x032e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0361  */
    /* JADX WARN: Code duplicated, block: B:98:0x0365  */
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
    private static final void m70377k(C23928i1 c23928i1, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean zIsFeatureEnabled;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int iHashCode2;
        String title;
        boolean z13;
        C2886a c2886aM8414L;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        C28676v0 c28676v1;
        boolean z15;
        Iterator it;
        C28676v0 c28676v2;
        boolean z16;
        boolean z17;
        boolean z18;
        List<C23908d1> listM70420c;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        float f15;
        float f16;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        String expandText;
        int i17;
        Float fValueOf = Float.valueOf(1.5f);
        C2306l c2306l = C2299e.f9108K;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1890903035);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c23928i1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("al-test-history-v2");
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m70378l(interfaceC28601c1)) {
                    f13 = 180.0f;
                } else {
                    f13 = 0.0f;
                }
                Modifier modifier4 = modifier2;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "icon_rotation", null, c28655q, 3120, 20);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                f14 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f14), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i3 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
                i16 = i15;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                title = c23928i1.getTitle();
                if (!zIsFeatureEnabled) {
                    title = title.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(title, "toUpperCase(...)");
                }
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-630756509);
                    c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
                    z13 = false;
                } else {
                    z13 = false;
                    c28655q.m87150e0(-630755548);
                    c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
                }
                c28655q.m87173q(z13);
                AbstractC30795n.m94707h(title, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, fValueOf, c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
                TextResource text = c23928i1.getSecondaryButton().getText();
                C39274g c39274g = new C39274g(EnumC16313m0.ARROW_FORWARD.toWhoopIcon(), null, 2, null);
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = c28655q.m87157i(c23928i1) | z14;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                    }
                    AbstractC27265l0.m82217i(null, null, text, null, c39274g, false, null, null, false, false, fValueOf, null, (Function1) objM87133R2, c28655q, (TextResource.$stable << 6) | 100663296 | (C39274g.f168929c << 12), 6, 2795);
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87150e0(-766940840);
                    it = AbstractC25265s.m74156w1(c23928i1.m70422f(), 3).iterator();
                    while (it.hasNext()) {
                        AbstractC23904c1.m70266c(null, (C23908d1) it.next(), function1, c28655q, ((C9598e.f28134d | AbstractC22403o.f87638a) << 3) | ((i16 << 3) & 896), 1);
                        c28676v1 = c28676v1;
                        z15 = z15;
                    }
                    c28676v2 = c28676v1;
                    c28655q.m87173q(false);
                    z16 = z15;
                    AbstractC1090b.m3350e(C23016z.f90757a, m70378l(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1981219731, c28655q, new C18522f(18, c23928i1, function1)), c28655q, 1572870, 30);
                    c28655q = c28655q;
                    if (c23928i1.getExpandText() != null) {
                        c28655q.m87150e0(1995282879);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v2) {
                            interfaceC28601c2 = interfaceC28601c1;
                            objM87133R3 = new C21937b(12, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f3, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        f15 = (z16 ? 1.0f : 0.0f) * f14;
                        if (zIsFeatureEnabled) {
                            z17 = false;
                            f16 = 0;
                        } else {
                            z17 = false;
                            f16 = f15;
                        }
                        Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3362g, 0.0f, f15, 0.0f, f16, 5);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        if (m70378l(interfaceC28601c2)) {
                            c28655q.m87150e0(-175863478);
                            expandText = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99449r);
                            c28655q.m87173q(z17);
                        } else {
                            c28655q.m87150e0(-175776740);
                            c28655q.m87173q(z17);
                            expandText = c23928i1.getExpandText();
                        }
                        String str = expandText;
                        C38072d c38072d = C38072d.f163053a;
                        int i19 = C38072d.f163054b;
                        AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6);
                        if (m70378l(interfaceC28601c2)) {
                            i17 = AbstractC16277f.f62278S;
                        } else {
                            i17 = AbstractC16277f.f62363p0;
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S, AbstractC30060g.m92103Y(c28655q, i17), AbstractC1772c1.m5375L(m70380n(interfaceC28670t2M30588b), AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t)), c38072d.m121949b(c28655q, i19).getBrandWhite(), c28655q, 0, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(z16);
                        c28655q.m87173q(z17);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(1996480285);
                        c28655q.m87173q(false);
                    }
                    if (c23928i1.getSecondaryTitle() != null || (listM70420c = c23928i1.m70420c()) == null || listM70420c.isEmpty()) {
                        z18 = z16 ? 1 : 0;
                        c28655q.m87150e0(1997095325);
                        c28655q.m87173q(z17);
                    } else {
                        c28655q.m87150e0(1996629240);
                        AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f14, 0.0f, 0.0f, 13));
                        String upperCase = c23928i1.getSecondaryTitle().toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C38072d c38072d2 = C38072d.f163053a;
                        int i24 = C38072d.f163054b;
                        AbstractC30795n.m94707h(upperCase, null, c38072d2.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        Iterator<T> it3 = c23928i1.m70420c().iterator();
                        while (it3.hasNext()) {
                            AbstractC23904c1.m70266c(null, (C23908d1) it3.next(), function1, c28655q, ((C9598e.f28134d | AbstractC22403o.f87638a) << 3) | ((i16 << 3) & 896), 1);
                            z16 = z16 ? 1 : 0;
                        }
                        z18 = z16;
                        c28655q.m87173q(z17);
                    }
                    c28655q.m87173q(z18);
                    modifier3 = modifier4;
                }
                objM87133R2 = new C21851c(23, function1, c23928i1);
                c28655q.m87172p0(objM87133R2);
                AbstractC27265l0.m82217i(null, null, text, null, c39274g, false, null, null, false, false, fValueOf, null, (Function1) objM87133R2, c28655q, (TextResource.$stable << 6) | 100663296 | (C39274g.f168929c << 12), 6, 2795);
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87150e0(-766940840);
                it = AbstractC25265s.m74156w1(c23928i1.m70422f(), 3).iterator();
                while (it.hasNext()) {
                    AbstractC23904c1.m70266c(null, (C23908d1) it.next(), function1, c28655q, ((C9598e.f28134d | AbstractC22403o.f87638a) << 3) | ((i16 << 3) & 896), 1);
                    c28676v1 = c28676v1;
                    z15 = z15;
                }
                c28676v2 = c28676v1;
                c28655q.m87173q(false);
                z16 = z15;
                AbstractC1090b.m3350e(C23016z.f90757a, m70378l(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1981219731, c28655q, new C18522f(18, c23928i1, function1)), c28655q, 1572870, 30);
                c28655q = c28655q;
                if (c23928i1.getExpandText() != null) {
                    c28655q.m87150e0(1995282879);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v2) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21937b(12, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f4, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    f15 = (z16 ? 1.0f : 0.0f) * f14;
                    if (zIsFeatureEnabled) {
                        z17 = false;
                        f16 = 0;
                    } else {
                        z17 = false;
                        f16 = f15;
                    }
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3362g2, 0.0f, f15, 0.0f, f16, 5);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    if (m70378l(interfaceC28601c2)) {
                        c28655q.m87150e0(-175863478);
                        expandText = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99449r);
                        c28655q.m87173q(z17);
                    } else {
                        c28655q.m87150e0(-175776740);
                        c28655q.m87173q(z17);
                        expandText = c23928i1.getExpandText();
                    }
                    String str2 = expandText;
                    C38072d c38072d3 = C38072d.f163053a;
                    int i110 = C38072d.f163054b;
                    AbstractC30795n.m94707h(str2, null, c38072d3.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i110).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6);
                    if (m70378l(interfaceC28601c2)) {
                        i17 = AbstractC16277f.f62278S;
                    } else {
                        i17 = AbstractC16277f.f62363p0;
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S2, AbstractC30060g.m92103Y(c28655q, i17), AbstractC1772c1.m5375L(m70380n(interfaceC28670t2M30588b), AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t)), c38072d3.m121949b(c28655q, i110).getBrandWhite(), c28655q, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(z16);
                    c28655q.m87173q(z17);
                } else {
                    z17 = false;
                    c28655q.m87150e0(1996480285);
                    c28655q.m87173q(false);
                }
                if (c23928i1.getSecondaryTitle() != null) {
                    z18 = z16 ? 1 : 0;
                    c28655q.m87150e0(1997095325);
                    c28655q.m87173q(z17);
                } else {
                    z18 = z16 ? 1 : 0;
                    c28655q.m87150e0(1997095325);
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(z18);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23920g1(c23928i1, function1, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("al-test-history-v2");
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m70378l(interfaceC28601c1)) {
                f13 = 180.0f;
            } else {
                f13 = 0.0f;
            }
            Modifier modifier5 = modifier2;
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), "icon_rotation", null, c28655q, 3120, 20);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier5);
            f14 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f14), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            i16 = i15;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
            title = c23928i1.getTitle();
            if (!zIsFeatureEnabled) {
                title = title.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(title, "toUpperCase(...)");
            }
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-630756509);
                c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT3();
                z13 = false;
            } else {
                z13 = false;
                c28655q.m87150e0(-630755548);
                c2886aM8414L = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
            }
            c28655q.m87173q(z13);
            AbstractC30795n.m94707h(title, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, fValueOf, c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
            TextResource text2 = c23928i1.getSecondaryButton().getText();
            C39274g c39274g2 = new C39274g(EnumC16313m0.ARROW_FORWARD.toWhoopIcon(), null, 2, null);
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = c28655q.m87157i(c23928i1) | z14;
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                }
                AbstractC27265l0.m82217i(null, null, text2, null, c39274g2, false, null, null, false, false, fValueOf, null, (Function1) objM87133R2, c28655q, (TextResource.$stable << 6) | 100663296 | (C39274g.f168929c << 12), 6, 2795);
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87150e0(-766940840);
                it = AbstractC25265s.m74156w1(c23928i1.m70422f(), 3).iterator();
                while (it.hasNext()) {
                    AbstractC23904c1.m70266c(null, (C23908d1) it.next(), function1, c28655q, ((C9598e.f28134d | AbstractC22403o.f87638a) << 3) | ((i16 << 3) & 896), 1);
                    c28676v1 = c28676v1;
                    z15 = z15;
                }
                c28676v2 = c28676v1;
                c28655q.m87173q(false);
                z16 = z15;
                AbstractC1090b.m3350e(C23016z.f90757a, m70378l(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1981219731, c28655q, new C18522f(18, c23928i1, function1)), c28655q, 1572870, 30);
                c28655q = c28655q;
                if (c23928i1.getExpandText() != null) {
                    c28655q.m87150e0(1995282879);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v2) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R3 = new C21937b(12, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3409f7, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    f15 = (z16 ? 1.0f : 0.0f) * f14;
                    if (zIsFeatureEnabled) {
                        z17 = false;
                        f16 = 0;
                    } else {
                        z17 = false;
                        f16 = f15;
                    }
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(modifierM3362g3, 0.0f, f15, 0.0f, f16, 5);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    if (m70378l(interfaceC28601c2)) {
                        c28655q.m87150e0(-175863478);
                        expandText = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99449r);
                        c28655q.m87173q(z17);
                    } else {
                        c28655q.m87150e0(-175776740);
                        c28655q.m87173q(z17);
                        expandText = c23928i1.getExpandText();
                    }
                    String str3 = expandText;
                    C38072d c38072d4 = C38072d.f163053a;
                    int i111 = C38072d.f163054b;
                    AbstractC30795n.m94707h(str3, null, c38072d4.m121949b(c28655q, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i111).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                    C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6);
                    if (m70378l(interfaceC28601c2)) {
                        i17 = AbstractC16277f.f62278S;
                    } else {
                        i17 = AbstractC16277f.f62363p0;
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S3, AbstractC30060g.m92103Y(c28655q, i17), AbstractC1772c1.m5375L(m70380n(interfaceC28670t2M30588b), AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t)), c38072d4.m121949b(c28655q, i111).getBrandWhite(), c28655q, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(z16);
                    c28655q.m87173q(z17);
                } else {
                    z17 = false;
                    c28655q.m87150e0(1996480285);
                    c28655q.m87173q(false);
                }
                if (c23928i1.getSecondaryTitle() != null) {
                    z18 = z16 ? 1 : 0;
                    c28655q.m87150e0(1997095325);
                    c28655q.m87173q(z17);
                } else {
                    z18 = z16 ? 1 : 0;
                    c28655q.m87150e0(1997095325);
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(z18);
                modifier3 = modifier5;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R2 = new C21851c(23, function1, c23928i1);
            c28655q.m87172p0(objM87133R2);
            AbstractC27265l0.m82217i(null, null, text2, null, c39274g2, false, null, null, false, false, fValueOf, null, (Function1) objM87133R2, c28655q, (TextResource.$stable << 6) | 100663296 | (C39274g.f168929c << 12), 6, 2795);
            z15 = true;
            c28655q.m87173q(true);
            c28655q.m87150e0(-766940840);
            it = AbstractC25265s.m74156w1(c23928i1.m70422f(), 3).iterator();
            while (it.hasNext()) {
                AbstractC23904c1.m70266c(null, (C23908d1) it.next(), function1, c28655q, ((C9598e.f28134d | AbstractC22403o.f87638a) << 3) | ((i16 << 3) & 896), 1);
                c28676v1 = c28676v1;
                z15 = z15;
            }
            c28676v2 = c28676v1;
            c28655q.m87173q(false);
            z16 = z15;
            AbstractC1090b.m3350e(C23016z.f90757a, m70378l(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1981219731, c28655q, new C18522f(18, c23928i1, function1)), c28655q, 1572870, 30);
            c28655q = c28655q;
            if (c23928i1.getExpandText() != null) {
                c28655q.m87150e0(1995282879);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v2) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C21937b(12, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3409f8, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                f15 = (z16 ? 1.0f : 0.0f) * f14;
                if (zIsFeatureEnabled) {
                    z17 = false;
                    f16 = 0;
                } else {
                    z17 = false;
                    f16 = f15;
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3362g4, 0.0f, f15, 0.0f, f16, 5);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                if (m70378l(interfaceC28601c2)) {
                    c28655q.m87150e0(-175863478);
                    expandText = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99449r);
                    c28655q.m87173q(z17);
                } else {
                    c28655q.m87150e0(-175776740);
                    c28655q.m87173q(z17);
                    expandText = c23928i1.getExpandText();
                }
                String str4 = expandText;
                C38072d c38072d5 = C38072d.f163053a;
                int i112 = C38072d.f163054b;
                AbstractC30795n.m94707h(str4, null, c38072d5.m121949b(c28655q, i112).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i112).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d5.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6);
                if (m70378l(interfaceC28601c2)) {
                    i17 = AbstractC16277f.f62278S;
                } else {
                    i17 = AbstractC16277f.f62363p0;
                }
                AbstractC15005f3.m43108b(c27430eM107874S4, AbstractC30060g.m92103Y(c28655q, i17), AbstractC1772c1.m5375L(m70380n(interfaceC28670t2M30588b), AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t)), c38072d5.m121949b(c28655q, i112).getBrandWhite(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(z16);
                c28655q.m87173q(z17);
            } else {
                z17 = false;
                c28655q.m87150e0(1996480285);
                c28655q.m87173q(false);
            }
            if (c23928i1.getSecondaryTitle() != null) {
                z18 = z16 ? 1 : 0;
                c28655q.m87150e0(1997095325);
                c28655q.m87173q(z17);
            } else {
                z18 = z16 ? 1 : 0;
                c28655q.m87150e0(1997095325);
                c28655q.m87173q(z17);
            }
            c28655q.m87173q(z18);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23920g1(c23928i1, function1, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m70378l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m70379m(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: n */
    private static final float m70380n(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70381o(Function1 function1, C23928i1 c23928i1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c23928i1.getSecondaryButton().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70382p(C23928i1 c23928i1, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, composer, 6);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, C2314t.f9131w);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        c28655q.m87150e0(1922178290);
        Iterator it = AbstractC25265s.m74161z0(c23928i1.m70422f(), 3).iterator();
        while (it.hasNext()) {
            AbstractC23904c1.m70266c(null, (C23908d1) it.next(), function1, composer, (C9598e.f28134d | AbstractC22403o.f87638a) << 3, 1);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70383q(InterfaceC28601c1 interfaceC28601c1) {
        m70379m(interfaceC28601c1, !m70378l(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70384r(C23928i1 c23928i1, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m70377k(c23928i1, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final Modifier m70385s(Modifier modifier, C22303b c22303b) {
        return AbstractC1125a.m3479b(AbstractC1127a.m3486a(AbstractC1092a.m3358c(modifier, C17919x.f69637n, c22303b), new C4159z0(c22303b, 2)), new C4159z0(c22303b, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70386t(C22303b c22303b, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51554e(true);
        c17920x0.m51563t(c22303b);
        c17920x0.m51555f(2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C14018g m70387u(C22303b c22303b, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)) * 0.7f;
        C17909s c17909s = AbstractC17911t.f69612b;
        long j7 = C17919x.f69629f;
        return drawWithCache.m39910a(new C21930h(c22303b, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, j7)), new C17919x(C17919x.m51541c(0.08f, j7)), new C17919x(C17919x.m51541c(0.02f, j7)), new C17919x(C17919x.m51541c(0.0f, j7))), 0.0f, fIntBitsToFloat, 8), C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.25f, j7)), new C17919x(C17919x.m51541c(0.15f, j7)), new C17919x(C17919x.m51541c(0.05f, j7)), new C17919x(C17919x.m51541c(0.0f, j7))), 0.0f, fIntBitsToFloat, 8), 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70388v(C22303b c22303b, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        InterfaceC22131e.m63378L(onDrawWithContent, c22303b.getPath(), abstractC17911t, 0.0f, null, 60);
        C0238p0 c0238p0 = (C0238p0) onDrawWithContent;
        c0238p0.m728a();
        InterfaceC22131e.m63378L(onDrawWithContent, c22303b.getPath(), abstractC17911t2, 0.0f, new C22135i(c0238p0.mo743q0(1), 0.0f, 0, 0, null, 30), 52);
        return C23454a0.f92919a;
    }
}
