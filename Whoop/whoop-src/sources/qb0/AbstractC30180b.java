package qb0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fy1.AbstractC14874j;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import java.util.Iterator;
import l83.C23454a0;
import ny0.AbstractC27292z;
import ob0.AbstractC27789a;
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
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p62.C28947h;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pb0.AbstractC29052c;
import pb0.AbstractC29053d;
import pb0.C29051b;
import q11.C29793c;
import q63.AbstractC30007c;
import q80.C30034f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import sy0.AbstractC33090m;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: qb0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lpb0/d;", "viewState", "Lkotlin/Function1;", "Lob0/a;", "Ll83/a0;", "onNavigationEvent", "Lpb0/c;", "onViewEvent", "q", "(Lpb0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lpb0/d$a;", "j", "(Lpb0/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30180b {
    /* JADX WARN: Code duplicated, block: B:102:0x036d  */
    /* JADX WARN: Code duplicated, block: B:104:0x037b  */
    /* JADX WARN: Code duplicated, block: B:107:0x039f  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:119:0x03db  */
    /* JADX WARN: Code duplicated, block: B:124:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:128:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:132:0x0525  */
    /* JADX WARN: Code duplicated, block: B:135:0x0530  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0239  */
    /* JADX WARN: Code duplicated, block: B:87:0x023d  */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258  */
    /* JADX WARN: Code duplicated, block: B:96:0x030f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0356  */
    /* JADX WARN: Code duplicated, block: B:99:0x035a  */
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
    /* JADX INFO: renamed from: j */
    private static final void m92383j(AbstractC29053d.a aVar, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        float f14;
        float f15;
        boolean z13;
        Object objM87133R;
        int i18;
        C28676v0 c28676v1;
        Function1 function9;
        int iHashCode2;
        C0209i c0209i2;
        int iHashCode3;
        float f16;
        C28655q c28655q;
        char c3;
        float f17;
        Iterator it;
        C28655q c28655q2;
        boolean z14;
        Object objM87133R2;
        C29051b c29051b;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i3;
        C38072d c38072d;
        int i19;
        long jM73366B;
        int i24;
        boolean z15;
        boolean zM87153g;
        Object objM87133R3;
        C28676v0 c28676v2;
        Function1 function10;
        Object objM87133R4;
        Object objM87133R5;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-2061570447);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q3.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q3.m87157i(function4)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30034f(8);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30034f(9);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    Function1 function11 = function8;
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM114675c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
                    C0209i c0209i5 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N);
                    f13 = 2;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f15, c28655q3, c2314t, 1.0f);
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(aVar.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C28947h(function7, 21);
                        c28655q3.m87172p0(objM87133R);
                    }
                    i18 = i15;
                    c28676v1 = c28676v0;
                    function9 = function11;
                    Function1 function12 = function7;
                    AbstractC6719b.m20143d(modifierM91835e, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    float f18 = 1;
                    float f19 = f18 * f14;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 3 * f14, 0.0f, 2), 0.0f, f19, 0.0f, 5 * f14, 5);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S && AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i2 = c0209i;
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N2);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM44085i = AbstractC15674c.m44085i(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC38963t7.m124374d(1.0f, 1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, null, 3, null);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM44085i);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N3);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f19, c2314t));
                    String strM88311i = aVar.getTitle();
                    C38072d c38072d2 = C38072d.f163053a;
                    int i26 = C38072d.f163054b;
                    C2886a c2886aM8417O = c38072d2.m121952e(c28655q3, i26).getT2();
                    long jM125430y = c38072d2.m121949b(c28655q3, i26).getBrandWhite();
                    int i27 = C2886a.f11498d << 18;
                    f16 = 0.0f;
                    AbstractC30795n.m94707h(strM88311i, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q3, 0, i27, 196602);
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f15, c2314t));
                    AbstractC30795n.m94707h(aVar.getDescription(), null, c38072d2.m121949b(c28655q3, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i26).getB1(), null, c28655q3, 0, i27, 196602);
                    c28655q = c28655q3;
                    c3 = 6;
                    f17 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(6 * f17, c2314t));
                    c28655q.m87150e0(-2127224153);
                    it = aVar.m88308f().iterator();
                    while (it.hasNext()) {
                        c29051b = (C29051b) it.next();
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, c2314t), ((float) (-2.5d)) * f14, f16, 2), 0.0f, 0.0f, 0.0f, f15, 7);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
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
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        String strM88300c = c29051b.getText();
                        c38072d = C38072d.f163053a;
                        i19 = C38072d.f163054b;
                        C2886a c2886aM8420a = c38072d.m121952e(c28655q, i19).getB1();
                        boolean zM88301d = c29051b.getIsChecked();
                        float f24 = f13 * f17;
                        if (c29051b.getIsChecked()) {
                            jM73366B = AbstractC25012a.m73366B(c28655q, 78817909, c38072d, c28655q, i19);
                            c28655q.m87173q(false);
                        } else {
                            long jM73370c = AbstractC25012a.m73370c(c28655q, 78818994, c38072d, c28655q, i19);
                            c28655q.m87173q(false);
                            jM73366B = jM73370c;
                        }
                        i24 = i18;
                        if ((i24 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87153g = z15 | c28655q.m87153g(c29051b);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g) {
                            c28676v2 = c28676v1;
                        } else {
                            c28676v2 = c28676v1;
                            if (objM87133R3 == c28676v2) {
                                function10 = function9;
                            }
                            c28676v1 = c28676v2;
                            C28655q c28655q4 = c28655q;
                            AbstractC33090m.m104836d(null, strM88300c, c2886aM8420a, zM88301d, true, f24, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q4, (C2886a.f11498d << 6) | 221184, 0, 8065);
                            c28655q = c28655q4;
                            c28655q.m87173q(true);
                            it = it;
                            i18 = i24;
                            function9 = function10;
                            f17 = f17;
                            c3 = c3;
                            f16 = 0.0f;
                        }
                        function10 = function9;
                        objM87133R3 = new C29793c(3, function10, c29051b);
                        c28655q.m87172p0(objM87133R3);
                        c28676v1 = c28676v2;
                        C28655q c28655q5 = c28655q;
                        AbstractC33090m.m104836d(null, strM88300c, c2886aM8420a, zM88301d, true, f24, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q5, (C2886a.f11498d << 6) | 221184, 0, 8065);
                        c28655q = c28655q5;
                        c28655q.m87173q(true);
                        it = it;
                        i18 = i24;
                        function9 = function10;
                        f17 = f17;
                        c3 = c3;
                        f16 = 0.0f;
                    }
                    function6 = function9;
                    C28676v0 c28676v3 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30007c.m91835e(c2314t, f18 * f17, c28655q, c2314t, 1.0f), 0.0f, f19, 1);
                    String strM88307e = aVar.getButtonLabel();
                    C38072d c38072d3 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h(strM88307e, modifierM3396r, c38072d3.m121949b(c28655q, i28).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i28).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getButton().getText());
                    boolean zM88312j = aVar.getIsButtonEnabled();
                    if ((i18 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z14 || objM87133R2 == c28676v3) {
                        objM87133R2 = new C28947h(function6, 22);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82343j(modifierM3398t3, zM88312j, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function5 = function12;
                } else {
                    c28655q3.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30179a(aVar, function5, function6, i13, i14, 0);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30034f(8);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30034f(9);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                Function1 function13 = function8;
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM114675c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a4);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N5);
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f15, c28655q3, c2314t, 1.0f);
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(aVar.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q3.m87133R();
                if (z13) {
                    objM87133R = new C28947h(function7, 21);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28947h(function7, 21);
                    c28655q3.m87172p0(objM87133R);
                }
                i18 = i15;
                c28676v1 = c28676v0;
                function9 = function13;
                Function1 function14 = function7;
                AbstractC6719b.m20143d(modifierM91835e2, aVar3, null, (InterfaceC4339a) objM87133R, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f110 = 1;
                float f111 = f110 * f14;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 3 * f14, 0.0f, 2), 0.0f, f111, 0.0f, 5 * f14, 5);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m6);
                if (c28655q3.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N6);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM44085i2 = AbstractC15674c.m44085i(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC38963t7.m124374d(1.0f, 1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, null, 3, null);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM44085i2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m7);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N7);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f111, c2314t));
                String strM88311i2 = aVar.getTitle();
                C38072d c38072d4 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a c2886aM8417O2 = c38072d4.m121952e(c28655q3, i29).getT2();
                long jM125430y2 = c38072d4.m121949b(c28655q3, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                f16 = 0.0f;
                AbstractC30795n.m94707h(strM88311i2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q3, 0, i210, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f15, c2314t));
                AbstractC30795n.m94707h(aVar.getDescription(), null, c38072d4.m121949b(c28655q3, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q3, i29).getB1(), null, c28655q3, 0, i210, 196602);
                c28655q = c28655q3;
                c3 = 6;
                f17 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(6 * f17, c2314t));
                c28655q.m87150e0(-2127224153);
                it = aVar.m88308f().iterator();
                while (it.hasNext()) {
                    c29051b = (C29051b) it.next();
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, c2314t), ((float) (-2.5d)) * f14, f16, 2), 0.0f, 0.0f, 0.0f, f15, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    String strM88300c2 = c29051b.getText();
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, i19).getB1();
                    boolean zM88301d2 = c29051b.getIsChecked();
                    float f25 = f13 * f17;
                    if (c29051b.getIsChecked()) {
                        jM73366B = AbstractC25012a.m73366B(c28655q, 78817909, c38072d, c28655q, i19);
                        c28655q.m87173q(false);
                    } else {
                        long jM73370c2 = AbstractC25012a.m73370c(c28655q, 78818994, c38072d, c28655q, i19);
                        c28655q.m87173q(false);
                        jM73366B = jM73370c2;
                    }
                    i24 = i18;
                    if ((i24 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87153g = z15 | c28655q.m87153g(c29051b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c28676v2 = c28676v1;
                        if (objM87133R3 == c28676v2) {
                            function10 = function9;
                        }
                        c28676v1 = c28676v2;
                        C28655q c28655q6 = c28655q;
                        AbstractC33090m.m104836d(null, strM88300c2, c2886aM8420a2, zM88301d2, true, f25, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q6, (C2886a.f11498d << 6) | 221184, 0, 8065);
                        c28655q = c28655q6;
                        c28655q.m87173q(true);
                        it = it;
                        i18 = i24;
                        function9 = function10;
                        f17 = f17;
                        c3 = c3;
                        f16 = 0.0f;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function10 = function9;
                    objM87133R3 = new C29793c(3, function10, c29051b);
                    c28655q.m87172p0(objM87133R3);
                    c28676v1 = c28676v2;
                    C28655q c28655q7 = c28655q;
                    AbstractC33090m.m104836d(null, strM88300c2, c2886aM8420a2, zM88301d2, true, f25, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q7, (C2886a.f11498d << 6) | 221184, 0, 8065);
                    c28655q = c28655q7;
                    c28655q.m87173q(true);
                    it = it;
                    i18 = i24;
                    function9 = function10;
                    f17 = f17;
                    c3 = c3;
                    f16 = 0.0f;
                }
                function6 = function9;
                C28676v0 c28676v4 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC30007c.m91835e(c2314t, f110 * f17, c28655q, c2314t, 1.0f), 0.0f, f111, 1);
                String strM88307e2 = aVar.getButtonLabel();
                C38072d c38072d5 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM88307e2, modifierM3396r2, c38072d5.m121949b(c28655q, i211).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i211).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(aVar.getButton().getText());
                boolean zM88312j2 = aVar.getIsButtonEnabled();
                if ((i18 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C28947h(function6, 22);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28947h(function6, 22);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3398t6, zM88312j2, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function5 = function14;
            } else {
                c28655q3.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(aVar, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q3.m87157i(function4)) {
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
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30034f(8);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30034f(9);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM114675c3 = AbstractC36095b.m114675c(c2314t, 1.0f);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                Function1 function15 = function8;
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM114675c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m9);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N9);
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t, f15, c28655q3, c2314t, 1.0f);
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(aVar.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q3.m87133R();
                if (z13) {
                    objM87133R = new C28947h(function7, 21);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28947h(function7, 21);
                    c28655q3.m87172p0(objM87133R);
                }
                i18 = i15;
                c28676v1 = c28676v0;
                function9 = function15;
                Function1 function16 = function7;
                AbstractC6719b.m20143d(modifierM91835e3, aVar4, null, (InterfaceC4339a) objM87133R, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f112 = 1;
                float f113 = f112 * f14;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 3 * f14, 0.0f, 2), 0.0f, f113, 0.0f, 5 * f14, 5);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3398t7);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m10);
                if (c28655q3.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N10);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM44085i3 = AbstractC15674c.m44085i(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC38963t7.m124374d(1.0f, 1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, null, 3, null);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, modifierM44085i3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m11);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N11);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f113, c2314t));
                String strM88311i3 = aVar.getTitle();
                C38072d c38072d6 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                C2886a c2886aM8417O3 = c38072d6.m121952e(c28655q3, i212).getT2();
                long jM125430y3 = c38072d6.m121949b(c28655q3, i212).getBrandWhite();
                int i213 = C2886a.f11498d << 18;
                f16 = 0.0f;
                AbstractC30795n.m94707h(strM88311i3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q3, 0, i213, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f15, c2314t));
                AbstractC30795n.m94707h(aVar.getDescription(), null, c38072d6.m121949b(c28655q3, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q3, i212).getB1(), null, c28655q3, 0, i213, 196602);
                c28655q = c28655q3;
                c3 = 6;
                f17 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(6 * f17, c2314t));
                c28655q.m87150e0(-2127224153);
                it = aVar.m88308f().iterator();
                while (it.hasNext()) {
                    c29051b = (C29051b) it.next();
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, c2314t), ((float) (-2.5d)) * f14, f16, 2), 0.0f, 0.0f, 0.0f, f15, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    String strM88300c3 = c29051b.getText();
                    c38072d = C38072d.f163053a;
                    i19 = C38072d.f163054b;
                    C2886a c2886aM8420a3 = c38072d.m121952e(c28655q, i19).getB1();
                    boolean zM88301d3 = c29051b.getIsChecked();
                    float f26 = f13 * f17;
                    if (c29051b.getIsChecked()) {
                        jM73366B = AbstractC25012a.m73366B(c28655q, 78817909, c38072d, c28655q, i19);
                        c28655q.m87173q(false);
                    } else {
                        long jM73370c3 = AbstractC25012a.m73370c(c28655q, 78818994, c38072d, c28655q, i19);
                        c28655q.m87173q(false);
                        jM73366B = jM73370c3;
                    }
                    i24 = i18;
                    if ((i24 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87153g = z15 | c28655q.m87153g(c29051b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c28676v2 = c28676v1;
                        if (objM87133R3 == c28676v2) {
                            function10 = function9;
                        }
                        c28676v1 = c28676v2;
                        C28655q c28655q8 = c28655q;
                        AbstractC33090m.m104836d(null, strM88300c3, c2886aM8420a3, zM88301d3, true, f26, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q8, (C2886a.f11498d << 6) | 221184, 0, 8065);
                        c28655q = c28655q8;
                        c28655q.m87173q(true);
                        it = it;
                        i18 = i24;
                        function9 = function10;
                        f17 = f17;
                        c3 = c3;
                        f16 = 0.0f;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function10 = function9;
                    objM87133R3 = new C29793c(3, function10, c29051b);
                    c28655q.m87172p0(objM87133R3);
                    c28676v1 = c28676v2;
                    C28655q c28655q9 = c28655q;
                    AbstractC33090m.m104836d(null, strM88300c3, c2886aM8420a3, zM88301d3, true, f26, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q9, (C2886a.f11498d << 6) | 221184, 0, 8065);
                    c28655q = c28655q9;
                    c28655q.m87173q(true);
                    it = it;
                    i18 = i24;
                    function9 = function10;
                    f17 = f17;
                    c3 = c3;
                    f16 = 0.0f;
                }
                function6 = function9;
                C28676v0 c28676v5 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC30007c.m91835e(c2314t, f112 * f17, c28655q, c2314t, 1.0f), 0.0f, f113, 1);
                String strM88307e3 = aVar.getButtonLabel();
                C38072d c38072d7 = C38072d.f163053a;
                int i214 = C38072d.f163054b;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM88307e3, modifierM3396r3, c38072d7.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i214).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f15, 0.0f, 0.0f, 13);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(aVar.getButton().getText());
                boolean zM88312j3 = aVar.getIsButtonEnabled();
                if ((i18 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C28947h(function6, 22);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28947h(function6, 22);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC27292z.m82343j(modifierM3398t9, zM88312j3, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function5 = function16;
            } else {
                c28655q3.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(aVar, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30034f(8);
                    c28655q3.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30034f(9);
                    c28655q3.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM114675c4 = AbstractC36095b.m114675c(c2314t, 1.0f);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
            Function1 function17 = function8;
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM114675c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i13 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a10);
            C0209i c0209i14 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m13);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i15 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N13);
            f13 = 2;
            f14 = 8;
            f15 = f13 * f14;
            Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t, f15, c28655q3, c2314t, 1.0f);
            AbstractC6721d.a aVar5 = new AbstractC6721d.a(AbstractC8693b.m21278l(aVar.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q3.m87133R();
            if (z13) {
                objM87133R = new C28947h(function7, 21);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = new C28947h(function7, 21);
                c28655q3.m87172p0(objM87133R);
            }
            i18 = i15;
            c28676v1 = c28676v0;
            function9 = function17;
            Function1 function18 = function7;
            AbstractC6719b.m20143d(modifierM91835e4, aVar5, null, (InterfaceC4339a) objM87133R, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f114 = 1;
            float f115 = f114 * f14;
            Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 3 * f14, 0.0f, 2), 0.0f, f115, 0.0f, 5 * f14, 5);
            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, modifierM3398t10);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a11);
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m14);
            if (c28655q3.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM44085i4 = AbstractC15674c.m44085i(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC38963t7.m124374d(1.0f, 1.0f, true), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, null, 3, null);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM44085i4);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m15);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N15);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f115, c2314t));
            String strM88311i4 = aVar.getTitle();
            C38072d c38072d8 = C38072d.f163053a;
            int i215 = C38072d.f163054b;
            C2886a c2886aM8417O4 = c38072d8.m121952e(c28655q3, i215).getT2();
            long jM125430y4 = c38072d8.m121949b(c28655q3, i215).getBrandWhite();
            int i216 = C2886a.f11498d << 18;
            f16 = 0.0f;
            AbstractC30795n.m94707h(strM88311i4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q3, 0, i216, 196602);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f15, c2314t));
            AbstractC30795n.m94707h(aVar.getDescription(), null, c38072d8.m121949b(c28655q3, i215).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q3, i215).getB1(), null, c28655q3, 0, i216, 196602);
            c28655q = c28655q3;
            c3 = 6;
            f17 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(6 * f17, c2314t));
            c28655q.m87150e0(-2127224153);
            it = aVar.m88308f().iterator();
            while (it.hasNext()) {
                c29051b = (C29051b) it.next();
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, c2314t), ((float) (-2.5d)) * f14, f16, 2), 0.0f, 0.0f, 0.0f, f15, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t11);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                String strM88300c4 = c29051b.getText();
                c38072d = C38072d.f163053a;
                i19 = C38072d.f163054b;
                C2886a c2886aM8420a4 = c38072d.m121952e(c28655q, i19).getB1();
                boolean zM88301d4 = c29051b.getIsChecked();
                float f27 = f13 * f17;
                if (c29051b.getIsChecked()) {
                    jM73366B = AbstractC25012a.m73366B(c28655q, 78817909, c38072d, c28655q, i19);
                    c28655q.m87173q(false);
                } else {
                    long jM73370c4 = AbstractC25012a.m73370c(c28655q, 78818994, c38072d, c28655q, i19);
                    c28655q.m87173q(false);
                    jM73366B = jM73370c4;
                }
                i24 = i18;
                if ((i24 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87153g = z15 | c28655q.m87153g(c29051b);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    c28676v2 = c28676v1;
                    if (objM87133R3 == c28676v2) {
                        function10 = function9;
                    }
                    c28676v1 = c28676v2;
                    C28655q c28655q10 = c28655q;
                    AbstractC33090m.m104836d(null, strM88300c4, c2886aM8420a4, zM88301d4, true, f27, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q10, (C2886a.f11498d << 6) | 221184, 0, 8065);
                    c28655q = c28655q10;
                    c28655q.m87173q(true);
                    it = it;
                    i18 = i24;
                    function9 = function10;
                    f17 = f17;
                    c3 = c3;
                    f16 = 0.0f;
                } else {
                    c28676v2 = c28676v1;
                }
                function10 = function9;
                objM87133R3 = new C29793c(3, function10, c29051b);
                c28655q.m87172p0(objM87133R3);
                c28676v1 = c28676v2;
                C28655q c28655q11 = c28655q;
                AbstractC33090m.m104836d(null, strM88300c4, c2886aM8420a4, zM88301d4, true, f27, jM73366B, 0L, null, false, null, false, 0L, (Function1) objM87133R3, c28655q11, (C2886a.f11498d << 6) | 221184, 0, 8065);
                c28655q = c28655q11;
                c28655q.m87173q(true);
                it = it;
                i18 = i24;
                function9 = function10;
                f17 = f17;
                c3 = c3;
                f16 = 0.0f;
            }
            function6 = function9;
            C28676v0 c28676v6 = c28676v1;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC30007c.m91835e(c2314t, f114 * f17, c28655q, c2314t, 1.0f), 0.0f, f115, 1);
            String strM88307e4 = aVar.getButtonLabel();
            C38072d c38072d9 = C38072d.f163053a;
            int i217 = C38072d.f163054b;
            c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM88307e4, modifierM3396r4, c38072d9.m121949b(c28655q, i217).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q, i217).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 0.0f, f15, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(aVar.getButton().getText());
            boolean zM88312j4 = aVar.getIsButtonEnabled();
            if ((i18 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C28947h(function6, 22);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C28947h(function6, 22);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC27292z.m82343j(modifierM3398t12, zM88312j4, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
            c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            function5 = function18;
        } else {
            c28655q3.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(aVar, function5, function6, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m92384k(AbstractC27789a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m92385l(AbstractC29052c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m92386m(Function1 function1) {
        function1.invoke(AbstractC27789a.a.f112040a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m92387n(Function1 function1, C29051b c29051b, boolean z4) {
        function1.invoke(new AbstractC29052c.b(c29051b.getText(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m92388o(Function1 function1) {
        function1.invoke(AbstractC29052c.a.f117557a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m92389p(AbstractC29053d.a aVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m92383j(aVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m92390q(AbstractC29053d viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        Function1 function4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1188310039);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C30034f(6);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30034f(7);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            function4 = function2;
            AbstractC14874j.m42904c(viewState, "advanced_labs_consent_screen", c28655q, (i15 & 14) | 48);
            if (!(viewState instanceof AbstractC29053d.a)) {
                throw AbstractC11895b.m32003v(-495344000, c28655q, false);
            }
            c28655q.m87150e0(1824856558);
            function3 = function1;
            m92383j((AbstractC29053d.a) viewState, function3, function4, c28655q, i15 & 1022, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
            function3 = function1;
            function4 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(viewState, function3, function4, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m92391r(AbstractC27789a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m92392s(AbstractC29052c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m92393t(AbstractC29053d abstractC29053d, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m92390q(abstractC29053d, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
