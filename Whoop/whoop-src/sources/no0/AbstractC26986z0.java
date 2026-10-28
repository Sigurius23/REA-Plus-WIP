package no0;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ej1.C13256s;
import hy0.AbstractC17755i2;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import lo0.C24595n0;
import lo0.C24597o0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: no0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\u0004*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Llo0/n0;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Llo0/n0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Llo0/o0;", "step", "g", "(Llo0/o0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "", "Li2/x;", "gradientColors", "i", "(Lk2/e;Ljava/util/List;)V", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26986z0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: d */
    public static final void m80924d(C24595n0 viewState, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        boolean z4;
        int i15;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        List listM118959K;
        boolean zM87153g;
        Object objM87133R;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int i17;
        C24597o0 c24597o0;
        Modifier modifier4;
        C24597o0 c24597o1;
        Modifier modifier5;
        boolean z14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(187821303);
        int i18 = 4;
        char c3 = 2;
        int i19 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i19 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            z4 = false;
            i15 = 1;
            if ((i19 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i19 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                listM118959K = AbstractC37056f.m118959K(new C17919x(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery10()), new C17919x(C17919x.f69636m));
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                zM87153g = c28655q.m87153g(listM118959K);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13256s(listM118959K, 3);
                    c28655q.m87172p0(objM87133R);
                }
                float f14 = 8;
                f13 = 0.0f;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1125a.m3478a(modifierM3409f, (Function1) objM87133R), 2 * f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f14, 7);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(-401169376);
                i16 = 0;
                for (Object obj : viewState.m71827a()) {
                    i17 = i16 + 1;
                    if (i16 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c24597o0 = (C24597o0) obj;
                    if (i16 > 0) {
                        c28655q.m87150e0(324514111);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, i15 * i18, i15);
                        modifier4 = modifier3;
                        c24597o1 = c24597o0;
                        modifier5 = null;
                        z14 = z4;
                        AbstractC17755i2.m50938j(modifierM3396r, null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                    } else {
                        modifier4 = modifier3;
                        c24597o1 = c24597o0;
                        modifier5 = null;
                        z14 = z4;
                        c28655q.m87150e0(1470062433);
                    }
                    c28655q.m87173q(z14);
                    m80927g(c24597o1, modifier5, c28655q, TextResource.$stable, 2);
                    i15 = 1;
                    i18 = 4;
                    z4 = z14;
                    c3 = 2;
                    i16 = i17;
                    c2314t = c2314t;
                    modifier3 = modifier4;
                    f13 = f13;
                }
                c28655q.m87173q(z4);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(viewState, i13, modifier3, i14, 0);
            }
        }
        i19 |= 48;
        modifier2 = modifier;
        z4 = false;
        i15 = 1;
        if ((i19 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i19 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            listM118959K = AbstractC37056f.m118959K(new C17919x(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery10()), new C17919x(C17919x.f69636m));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            zM87153g = c28655q.m87153g(listM118959K);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C13256s(listM118959K, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C13256s(listM118959K, 3);
                c28655q.m87172p0(objM87133R);
            }
            float f15 = 8;
            f13 = 0.0f;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1125a.m3478a(modifierM3409f2, (Function1) objM87133R), 2 * f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f15, 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(-401169376);
            i16 = 0;
            while (r16.hasNext()) {
                i17 = i16 + 1;
                if (i16 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                c24597o0 = (C24597o0) obj;
                if (i16 > 0) {
                    c28655q.m87150e0(324514111);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f13, i15 * i18, i15);
                    modifier4 = modifier3;
                    c24597o1 = c24597o0;
                    modifier5 = null;
                    z14 = z4;
                    AbstractC17755i2.m50938j(modifierM3396r2, null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                } else {
                    modifier4 = modifier3;
                    c24597o1 = c24597o0;
                    modifier5 = null;
                    z14 = z4;
                    c28655q.m87150e0(1470062433);
                }
                c28655q.m87173q(z14);
                m80927g(c24597o1, modifier5, c28655q, TextResource.$stable, 2);
                i15 = 1;
                i18 = 4;
                z4 = z14;
                c3 = 2;
                i16 = i17;
                c2314t = c2314t;
                modifier3 = modifier4;
                f13 = f13;
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, modifier3, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m80925e(List list, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        m80929i(drawBehind, list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m80926f(C24595n0 c24595n0, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m80924d(c24595n0, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private static final void m80927g(C24597o0 c24597o0, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-179390089);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c24597o0) : c28655q.m87157i(c24597o0) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 2 * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, f13, 1);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c24597o0.getIcon().toWhoopIcon(), c28655q, 6);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(6 * 4, c2314t), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 432, 0);
                String strM21274h = AbstractC8693b.m21274h(c24597o0.getText(), c28655q, TextResource.$stable);
                C2886a b6 = c38072d.m121952e(c28655q, i17).getB1();
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(c24597o0, i13, modifier3, i14, 1);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 2 * 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, f14, 1);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c24597o0.getIcon().toWhoopIcon(), c28655q, 6);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(6 * 4, c2314t), c38072d2.m121949b(c28655q, i18).getBrandWhite(), c28655q, 432, 0);
            String strM21274h2 = AbstractC8693b.m21274h(c24597o0.getText(), c28655q, TextResource.$stable);
            C2886a b8 = c38072d2.m121952e(c28655q, i18).getB1();
            long brandWhite2 = c38072d2.m121949b(c28655q, i18).getBrandWhite();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f, true), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(c24597o0, i13, modifier3, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m80928h(C24597o0 c24597o0, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m80927g(c24597o0, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m80929i(InterfaceC22131e interfaceC22131e, List<C17919x> list) {
        float fMo743q0 = interfaceC22131e.mo743q0(12);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L));
        C17909s c17909s = AbstractC17911t.f69612b;
        InterfaceC22131e.m63376J0(interfaceC22131e, C17909s.m51493k(c17909s, list, 0.0f, 0.0f, 14), 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), 0.0f, null, 246);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        Path path = c17891jM51478a.f69587a;
        c17891jM51478a.m51462i(0.0f, fMo743q0);
        float f13 = 2 * fMo743q0;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(0.0f, 0.0f, f13, f13);
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        c17891jM51478a.m51461h(fIntBitsToFloat - fMo743q0, 0.0f);
        float f14 = fIntBitsToFloat - f13;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF3 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF3);
        rectF3.set(f14, 0.0f, fIntBitsToFloat, f13);
        RectF rectF4 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF4);
        path.arcTo(rectF4, 270.0f, 90.0f, false);
        c17891jM51478a.m51461h(fIntBitsToFloat, fIntBitsToFloat2 - fMo743q0);
        float f15 = fIntBitsToFloat2 - f13;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF5 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF5);
        rectF5.set(f14, f15, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF6 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF6);
        path.arcTo(rectF6, 0.0f, 90.0f, false);
        c17891jM51478a.m51461h(fMo743q0, fIntBitsToFloat2);
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF7 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF7);
        rectF7.set(0.0f, f15, f13, fIntBitsToFloat2);
        RectF rectF8 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF8);
        path.arcTo(rectF8, 90.0f, 90.0f, false);
        c17891jM51478a.m51459f();
        InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, C17909s.m51493k(c17909s, list, 0.0f, 0.0f, 14), 0.0f, new C22135i(interfaceC22131e.mo743q0(1), 0.0f, 0, 0, null, 30), 52);
    }
}
