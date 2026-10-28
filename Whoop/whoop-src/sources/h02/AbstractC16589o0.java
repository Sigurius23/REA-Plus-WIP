package h02;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b30.C2476a1;
import b91.C2886a;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f02.C13917c;
import fc0.C14361e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h02.o0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/p0;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lh02/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lh02/k;", "item", "f", "(Lh02/k;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isCollapsed", "", "caretRotation", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16589o0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x016a  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private static final void m47074f(C16580k c16580k, Modifier modifier, Composer composer, int i13, int i14) {
        C16580k c16580k2;
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1081835822);
        if ((i13 & 6) == 0) {
            c16580k2 = c16580k;
            i15 = i13 | (c28655q.m87153g(c16580k2) ? 4 : 2);
        } else {
            c16580k2 = c16580k;
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
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c16580k2.getLabel());
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM21278l, c28655q, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8421b = c38072d.m121952e(c28655q, i18).getB2();
                long jM125335F = c38072d.m121949b(c28655q, i18).getGreyL1();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM125335F, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i19, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c16580k.getCost()), c28655q, i17), null, c38072d.m121949b(c28655q, i18).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(c16580k, i13, modifier3, i14, 12);
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
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c16580k2.getLabel());
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM21278l2, c28655q, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8421b2 = c38072d2.m121952e(c28655q, i111).getB2();
            long jM125335F2 = c38072d2.m121949b(c28655q, i111).getGreyL1();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, jM125335F2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b2, null, c28655q, 0, i112, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c16580k.getCost()), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i112, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(c16580k, i13, modifier3, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47075g(C16580k c16580k, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47074f(c16580k, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x023d  */
    /* JADX WARN: Code duplicated, block: B:81:0x024e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public static final void m47076h(Modifier modifier, C16591p0 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        String strM92103Y;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1551548074);
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
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Object[] objArr = new Object[0];
            boolean zM87157i = c28655q.m87157i(state);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C16587n0(state, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m47078j(interfaceC28601c2) ? 0.0f : 180.0f, null, "caret", null, c28655q, 3072, 22);
            float f13 = 2;
            float f14 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier2), f13, f14);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i18).getGreyL6(), AbstractC17918w0.f69621a);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c2) | ((i17 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C3590i(onViewEvent, interfaceC28601c2, 18);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            float f15 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3362g, 2.5f * f15, f13 * f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f15), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC28601c1 = interfaceC28601c2;
            } else {
                interfaceC28601c1 = interfaceC28601c2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                Modifier modifier3 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getTitle()), c28655q, TextResource.$stable);
                C2886a c2886aM8414L = c38072d.m121952e(c28655q, i18).getSh4();
                long jM125426w = c38072d.m121949b(c28655q, i18).getBrandBlack();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), jM125426w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, C2886a.f11498d << 18, 196600);
                Modifier modifierM5375L = AbstractC1772c1.m5375L(m47080l(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f14 * f14, c2314t));
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 0);
                if (m47078j(interfaceC28601c1)) {
                    c28655q.m87150e0(1836096371);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62371r0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1836208529);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62367q0);
                    c28655q.m87173q(false);
                }
                AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, modifierM5375L, c38072d.m121949b(c28655q, i18).getBrandBlack(), c28655q, 0, 0);
                c28655q.m87173q(true);
                AbstractC1090b.m3350e(C23016z.f90757a, !m47078j(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-918592136, c28655q, new C2476a1(state, 18)), c28655q, 1572870, 30);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier3;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            Modifier modifier4 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM21274h2 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getTitle()), c28655q, TextResource.$stable);
            C2886a c2886aM8414L2 = c38072d.m121952e(c28655q, i18).getSh4();
            long jM125426w2 = c38072d.m121949b(c28655q, i18).getBrandBlack();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f, true), jM125426w2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L2, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            Modifier modifierM5375L2 = AbstractC1772c1.m5375L(m47080l(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f14 * f14, c2314t));
            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 0);
            if (m47078j(interfaceC28601c1)) {
                c28655q.m87150e0(1836096371);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62371r0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1836208529);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62367q0);
                c28655q.m87173q(false);
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I2, strM92103Y, modifierM5375L2, c38072d.m121949b(c28655q, i18).getBrandBlack(), c28655q, 0, 0);
            c28655q.m87173q(true);
            AbstractC1090b.m3350e(C23016z.f90757a, !m47078j(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-918592136, c28655q, new C2476a1(state, 18)), c28655q, 1572870, 30);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 23, modifier2, onViewEvent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28601c1 m47077i(C16591p0 c16591p0) {
        return AbstractC28683x.m87272z(Boolean.valueOf(c16591p0.getIsCollapsed()));
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m47078j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m47079k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: l */
    private static final float m47080l(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47081m(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m47079k(interfaceC28601c1, !m47078j(interfaceC28601c1));
        function1.invoke(new C16593q0(!m47078j(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47082n(C16591p0 c16591p0, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
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
        c28655q.m87150e0(-1062706636);
        Iterator<T> it = c16591p0.m47086c().iterator();
        while (it.hasNext()) {
            m47074f((C16580k) it.next(), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13), composer, 48, 0);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47083o(Modifier modifier, C16591p0 c16591p0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47076h(modifier, c16591p0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
