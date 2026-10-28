package ep1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bp1.AbstractC3535b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.C11018e;
import d30.C11546l;
import d30.C11558r;
import d41.C11678d;
import e11.C12582b;
import eo2.C13390j;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;
import zo1.C40925b;

/* JADX INFO: renamed from: ep1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcp1/e;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "Lbp1/b;", "onNavigationEvent", "n", "(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "backgroundImage", "j", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13409d {
    /* JADX INFO: renamed from: j */
    private static final void m37913j(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1525096446);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13406a(5);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C13406a(6);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1099a.m3398t(AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2), 0.0f, 0.0f, 0.0f, 20 * 8, 7), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37914k(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37915l(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.8f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37916m(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m37913j(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x026e  */
    /* JADX WARN: Code duplicated, block: B:113:0x027b  */
    /* JADX WARN: Code duplicated, block: B:117:0x028d  */
    /* JADX WARN: Code duplicated, block: B:120:0x029a  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x0322  */
    /* JADX WARN: Code duplicated, block: B:128:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:129:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:132:0x0427  */
    /* JADX WARN: Code duplicated, block: B:134:0x042f  */
    /* JADX WARN: Code duplicated, block: B:137:0x043f  */
    /* JADX WARN: Code duplicated, block: B:139:0x044d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0473  */
    /* JADX WARN: Code duplicated, block: B:146:0x0479  */
    /* JADX WARN: Code duplicated, block: B:151:0x0486  */
    /* JADX WARN: Code duplicated, block: B:154:0x048c  */
    /* JADX WARN: Code duplicated, block: B:155:0x048e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0496  */
    /* JADX WARN: Code duplicated, block: B:161:0x049b  */
    /* JADX WARN: Code duplicated, block: B:162:0x049e  */
    /* JADX WARN: Code duplicated, block: B:166:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:167:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:170:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:173:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:176:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184  */
    /* JADX WARN: Code duplicated, block: B:84:0x019a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
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
    /* JADX INFO: renamed from: n */
    public static final void m37917n(C11018e c11018e, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        ?? r14;
        int iHashCode2;
        int iM53357C;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        int i24;
        boolean z15;
        boolean z16;
        Object objM87133R;
        C0209i c0209i3;
        Function1 function9;
        C0213j c0213j2;
        C28655q c28655q2;
        C23016z c23016z;
        float f13;
        C2305k c2305k;
        float f14;
        int iHashCode3;
        C0209i c0209i4;
        C23016z c23016z2;
        C2314t c2314t2;
        boolean z17;
        boolean z18;
        C28655q c28655q3;
        C0209i c0209i5;
        C28655q c28655q4;
        float f15;
        int iHashCode4;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        C28676v0 c28676v1;
        Function1 function10;
        boolean z25;
        Object objM87133R3;
        AbstractC22403o abstractC22403oM29579d;
        C28655q c28655q5;
        AbstractC22403o abstractC22403oM29579d2;
        boolean z26;
        Object objM87133R4;
        Object objM87133R5;
        C11018e viewState = c11018e;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(179917806);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q6.m87153g(viewState) : c28655q6.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q6.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q6.m87157i(function4)) {
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
                if (c28655q6.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q6.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13406a(3);
                            c28655q6.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q6.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13406a(4);
                            c28655q6.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM66722k);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q6, c0209i6, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i7, modifierM118962N);
                    if (viewState.getIsFullImage()) {
                        c28655q6.m87150e0(791486773);
                        abstractC22403oM29579d2 = viewState.getImageUrl();
                        if (abstractC22403oM29579d2 == null) {
                            c28655q6.m87150e0(-1233713812);
                            z26 = false;
                        } else {
                            z26 = false;
                            c28655q6.m87150e0(-1233713811);
                            m37913j(abstractC22403oM29579d2, c28655q6, AbstractC22403o.f87638a);
                        }
                        c28655q6.m87173q(z26);
                        c28655q6.m87173q(z26);
                        r14 = z26;
                    } else {
                        r14 = 0;
                        c28655q6.m87150e0(-1233660646);
                        c28655q6.m87173q(false);
                    }
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q6, r14);
                    iHashCode2 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q6, modifierM3407d);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q6, c0209i6, interfaceC28653p1M87165m2);
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i7, modifierM118962N2);
                    TextResource textResourceM29581f = viewState.getNavigationTitle();
                    TextResource textResourceM29580e = viewState.getNavigationSubtitle();
                    if (viewState.getCurrentScreenId() == HormonalScreenId.INITIAL_SCREEN) {
                        iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                    } else {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                    }
                    i18 = i15 & 14;
                    if (i18 != 4 || ((i15 & 8) != 0 && c28655q6.m87157i(viewState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i15;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z27 = z14 | z13;
                    i24 = i19 & 112;
                    if (i24 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z27 | z15;
                    objM87133R = c28655q6.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C11558r(viewState, function8, function7, 7);
                        c28655q6.m87172p0(objM87133R);
                    }
                    int i26 = TextResource.$stable;
                    int i27 = i26 << 3;
                    Function1 function11 = function8;
                    c0209i3 = c0209i6;
                    function9 = function7;
                    c0213j2 = c0213j;
                    AbstractC13424s.m38062e(textResourceM29581f, textResourceM29580e, iM53357C, null, null, (InterfaceC4339a) objM87133R, c28655q6, i26 | i27, 24);
                    c28655q2 = c28655q6;
                    c23016z = C23016z.f90757a;
                    float f16 = 8;
                    f13 = ((float) 2.5d) * f16;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f)), f13, 0.0f, f13, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    c2305k = c2305k2;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 54);
                    f14 = f16;
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    c0209i4 = c0209i7;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    if (c11018e.getIsFullImage()) {
                        c0209i3 = c0209i3;
                        c0209i = c0209i;
                        c0213j2 = c0213j2;
                        c2305k = c2305k;
                        c23016z2 = c23016z;
                        c0209i4 = c0209i4;
                        c2314t2 = c2314t;
                        c0209i2 = c0209i2;
                        f14 = f14;
                        z17 = true;
                        z18 = false;
                        c28655q2.m87150e0(-1478225850);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1478677520);
                        AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.0f));
                        abstractC22403oM29579d = c11018e.getImageUrl();
                        if (abstractC22403oM29579d == null) {
                            c28655q2.m87150e0(-1478581018);
                            c28655q2.m87173q(false);
                            c23016z2 = c23016z;
                            z17 = true;
                            c2314t2 = c2314t;
                            z18 = false;
                            c28655q5 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-1478581017);
                            z18 = false;
                            c2314t2 = c2314t;
                            c23016z2 = c23016z;
                            z17 = true;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM29579d, null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(60 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0.0f, null, c28655q2, 432, 120);
                            C28655q c28655q7 = c28655q2;
                            c28655q7.m87173q(false);
                            c28655q5 = c28655q7;
                        }
                        c28655q5.m87173q(z18);
                        c28655q3 = c28655q5;
                    }
                    AbstractC22953f.m66715b(c28655q3, c23016z2.m66779c(c2314t2, z17, 1.0f));
                    String strM21274h = AbstractC8693b.m21274h(c11018e.getTitleDisplay(), c28655q3, i26);
                    C38072d c38072d = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    C2886a c2886aM8416N = c38072d.m121952e(c28655q3, i28).getT1();
                    long jM125430y = c38072d.m121949b(c28655q3, i28).getBrandWhite();
                    int i29 = C2886a.f11498d << 18;
                    C28655q c28655q8 = c28655q3;
                    c0209i5 = c0209i2;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q8, 0, i29, 196602);
                    float f17 = 4;
                    AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3419p(f17 * f17, c2314t2));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11018e.getDescriptionDisplay(), c28655q8, i26), null, c38072d.m121949b(c28655q8, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q8, i28).getB1(), null, c28655q8, 0, i29, 196602);
                    c28655q4 = c28655q8;
                    c28655q4.m87173q(true);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    if (c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                        f15 = 3 * f14;
                    } else {
                        f15 = f13;
                    }
                    Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3409f, f13, 0.0f, f15, 3 * f14, 2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                    AbstractC18489d0.m53380u(11, f17, c2314t2, c28655q4);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C11016c c11016cM29583h = c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                    TextResource textResourceM29576a = c11018e.getButtonTitle();
                    if (i18 != 4) {
                        viewState = c11018e;
                        boolean z28 = (i19 & 8) == 0 && c28655q4.m87157i(viewState);
                        if (i24 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z19 | z28;
                        objM87133R2 = c28655q4.m87133R();
                        if (z24) {
                            c28676v1 = c28676v0;
                        } else {
                            c28676v1 = c28676v0;
                            if (objM87133R2 == c28676v1) {
                                function10 = function9;
                            }
                            AbstractC13410e.m37926c(c11016cM29583h, textResourceM29576a, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q4, i26 | 384 | i27, 8);
                            AbstractC25012a.m73392y(c28655q4, true, true, true);
                            if (i24 == 32) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            objM87133R3 = c28655q4.m87133R();
                            if (z25 || objM87133R3 == c28676v1) {
                                objM87133R3 = new C13390j(function10, 5);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                            function5 = function10;
                            function6 = function11;
                            c28655q = c28655q4;
                        }
                        function10 = function9;
                        objM87133R2 = new C11546l(17, viewState, function10);
                        c28655q4.m87172p0(objM87133R2);
                        AbstractC13410e.m37926c(c11016cM29583h, textResourceM29576a, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q4, i26 | 384 | i27, 8);
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        if (i24 == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z25) {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                        function5 = function10;
                        function6 = function11;
                        c28655q = c28655q4;
                    } else {
                        viewState = c11018e;
                    }
                    if (i24 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | z28;
                    objM87133R2 = c28655q4.m87133R();
                    if (z24) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function9;
                        }
                        AbstractC13410e.m37926c(c11016cM29583h, textResourceM29576a, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q4, i26 | 384 | i27, 8);
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        if (i24 == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z25) {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                        function5 = function10;
                        function6 = function11;
                        c28655q = c28655q4;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function10 = function9;
                    objM87133R2 = new C11546l(17, viewState, function10);
                    c28655q4.m87172p0(objM87133R2);
                    AbstractC13410e.m37926c(c11016cM29583h, textResourceM29576a, modifierM3409f2, false, (InterfaceC4339a) objM87133R2, c28655q4, i26 | 384 | i27, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function11;
                    c28655q = c28655q4;
                } else {
                    c28655q6.m87138X();
                    function5 = function3;
                    function6 = function4;
                    c28655q = c28655q6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12582b(i13, i14, 15, (Object) viewState, (Object) function6, function5);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q6.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q6.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(3);
                        c28655q6.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q6.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(4);
                        c28655q6.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q6.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q6, modifierM66722k2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d2);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m5);
                c0209i2 = C0217k.f732j;
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i9, modifierM118962N5);
                if (viewState.getIsFullImage()) {
                    c28655q6.m87150e0(791486773);
                    abstractC22403oM29579d2 = viewState.getImageUrl();
                    if (abstractC22403oM29579d2 == null) {
                        c28655q6.m87150e0(-1233713812);
                        z26 = false;
                    } else {
                        z26 = false;
                        c28655q6.m87150e0(-1233713811);
                        m37913j(abstractC22403oM29579d2, c28655q6, AbstractC22403o.f87638a);
                    }
                    c28655q6.m87173q(z26);
                    c28655q6.m87173q(z26);
                    r14 = z26;
                } else {
                    r14 = 0;
                    c28655q6.m87150e0(-1233660646);
                    c28655q6.m87173q(false);
                }
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k3, c28655q6, r14);
                iHashCode2 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q6.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q6, modifierM3407d2);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q6, c0209i8, interfaceC28653p1M87165m6);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i9, modifierM118962N6);
                TextResource textResourceM29581f2 = viewState.getNavigationTitle();
                TextResource textResourceM29580e2 = viewState.getNavigationSubtitle();
                if (viewState.getCurrentScreenId() == HormonalScreenId.INITIAL_SCREEN) {
                    iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                i18 = i15 & 14;
                if (i18 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                i19 = i15;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z29 = z14 | z13;
                i24 = i19 & 112;
                if (i24 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z29 | z15;
                objM87133R = c28655q6.m87133R();
                if (z16) {
                    objM87133R = new C11558r(viewState, function8, function7, 7);
                    c28655q6.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11558r(viewState, function8, function7, 7);
                    c28655q6.m87172p0(objM87133R);
                }
                int i210 = TextResource.$stable;
                int i211 = i210 << 3;
                Function1 function12 = function8;
                c0209i3 = c0209i8;
                function9 = function7;
                c0213j2 = c0213j;
                AbstractC13424s.m38062e(textResourceM29581f2, textResourceM29580e2, iM53357C, null, null, (InterfaceC4339a) objM87133R, c28655q6, i210 | i211, 24);
                c28655q2 = c28655q6;
                c23016z = C23016z.f90757a;
                float f18 = 8;
                f13 = ((float) 2.5d) * f18;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f)), f13, 0.0f, f13, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                c2305k = c2305k3;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q2, 54);
                f14 = f18;
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m7);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                c0209i4 = c0209i9;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N7);
                if (c11018e.getIsFullImage()) {
                    c28655q2.m87150e0(-1478677520);
                    AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.0f));
                    abstractC22403oM29579d = c11018e.getImageUrl();
                    if (abstractC22403oM29579d == null) {
                        c28655q2.m87150e0(-1478581018);
                        c28655q2.m87173q(false);
                        c23016z2 = c23016z;
                        z17 = true;
                        c2314t2 = c2314t;
                        z18 = false;
                        c28655q5 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1478581017);
                        z18 = false;
                        c2314t2 = c2314t;
                        c23016z2 = c23016z;
                        z17 = true;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM29579d, null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(60 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0.0f, null, c28655q2, 432, 120);
                        C28655q c28655q9 = c28655q2;
                        c28655q9.m87173q(false);
                        c28655q5 = c28655q9;
                    }
                    c28655q5.m87173q(z18);
                    c28655q3 = c28655q5;
                } else {
                    c0209i3 = c0209i3;
                    c0209i = c0209i;
                    c0213j2 = c0213j2;
                    c2305k = c2305k;
                    c23016z2 = c23016z;
                    c0209i4 = c0209i4;
                    c2314t2 = c2314t;
                    c0209i2 = c0209i2;
                    f14 = f14;
                    z17 = true;
                    z18 = false;
                    c28655q2.m87150e0(-1478225850);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                AbstractC22953f.m66715b(c28655q3, c23016z2.m66779c(c2314t2, z17, 1.0f));
                String strM21274h2 = AbstractC8693b.m21274h(c11018e.getTitleDisplay(), c28655q3, i210);
                C38072d c38072d2 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                C2886a c2886aM8416N2 = c38072d2.m121952e(c28655q3, i212).getT1();
                long jM125430y2 = c38072d2.m121949b(c28655q3, i212).getBrandWhite();
                int i213 = C2886a.f11498d << 18;
                C28655q c28655q10 = c28655q3;
                c0209i5 = c0209i2;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q10, 0, i213, 196602);
                float f19 = 4;
                AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3419p(f19 * f19, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11018e.getDescriptionDisplay(), c28655q10, i210), null, c38072d2.m121949b(c28655q10, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q10, i212).getB1(), null, c28655q10, 0, i213, 196602);
                c28655q4 = c28655q10;
                c28655q4.m87173q(true);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                    f15 = 3 * f14;
                } else {
                    f15 = f13;
                }
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3409f3, f13, 0.0f, f15, 3 * f14, 2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 0);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m8);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                AbstractC18489d0.m53380u(11, f19, c2314t2, c28655q4);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C11016c c11016cM29583h2 = c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29576a2 = c11018e.getButtonTitle();
                if (i18 != 4) {
                    viewState = c11018e;
                    if ((i19 & 8) == 0) {
                    }
                    if (i24 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | z28;
                    objM87133R2 = c28655q4.m87133R();
                    if (z24) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function9;
                        }
                        AbstractC13410e.m37926c(c11016cM29583h2, textResourceM29576a2, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q4, i210 | 384 | i211, 8);
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        if (i24 == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z25) {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                        function5 = function10;
                        function6 = function12;
                        c28655q = c28655q4;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function10 = function9;
                    objM87133R2 = new C11546l(17, viewState, function10);
                    c28655q4.m87172p0(objM87133R2);
                    AbstractC13410e.m37926c(c11016cM29583h2, textResourceM29576a2, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q4, i210 | 384 | i211, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function12;
                    c28655q = c28655q4;
                } else {
                    viewState = c11018e;
                }
                if (i24 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | z28;
                objM87133R2 = c28655q4.m87133R();
                if (z24) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function9;
                    }
                    AbstractC13410e.m37926c(c11016cM29583h2, textResourceM29576a2, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q4, i210 | 384 | i211, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function12;
                    c28655q = c28655q4;
                } else {
                    c28676v1 = c28676v0;
                }
                function10 = function9;
                objM87133R2 = new C11546l(17, viewState, function10);
                c28655q4.m87172p0(objM87133R2);
                AbstractC13410e.m37926c(c11016cM29583h2, textResourceM29576a2, modifierM3409f4, false, (InterfaceC4339a) objM87133R2, c28655q4, i210 | 384 | i211, 8);
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                if (i24 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z25) {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                function5 = function10;
                function6 = function12;
                c28655q = c28655q4;
            } else {
                c28655q6.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 15, (Object) viewState, (Object) function6, function5);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q6.m87157i(function4)) {
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
            if (c28655q6.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q6.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13406a(3);
                        c28655q6.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q6.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13406a(4);
                        c28655q6.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q6.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q6, modifierM66722k3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d3);
                C0209i c0209i10 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i10, interfaceC28653p1M87165m9);
                c0209i2 = C0217k.f732j;
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
                }
                C0209i c0209i11 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i11, modifierM118962N9);
                if (viewState.getIsFullImage()) {
                    c28655q6.m87150e0(791486773);
                    abstractC22403oM29579d2 = viewState.getImageUrl();
                    if (abstractC22403oM29579d2 == null) {
                        c28655q6.m87150e0(-1233713812);
                        z26 = false;
                    } else {
                        z26 = false;
                        c28655q6.m87150e0(-1233713811);
                        m37913j(abstractC22403oM29579d2, c28655q6, AbstractC22403o.f87638a);
                    }
                    c28655q6.m87173q(z26);
                    c28655q6.m87173q(z26);
                    r14 = z26;
                } else {
                    r14 = 0;
                    c28655q6.m87150e0(-1233660646);
                    c28655q6.m87173q(false);
                }
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k4, c28655q6, r14);
                iHashCode2 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q6.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q6, modifierM3407d3);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q6, c0209i10, interfaceC28653p1M87165m10);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q6, c0209i11, modifierM118962N10);
                TextResource textResourceM29581f3 = viewState.getNavigationTitle();
                TextResource textResourceM29580e3 = viewState.getNavigationSubtitle();
                if (viewState.getCurrentScreenId() == HormonalScreenId.INITIAL_SCREEN) {
                    iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                i18 = i15 & 14;
                if (i18 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                i19 = i15;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z210 = z14 | z13;
                i24 = i19 & 112;
                if (i24 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z210 | z15;
                objM87133R = c28655q6.m87133R();
                if (z16) {
                    objM87133R = new C11558r(viewState, function8, function7, 7);
                    c28655q6.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11558r(viewState, function8, function7, 7);
                    c28655q6.m87172p0(objM87133R);
                }
                int i214 = TextResource.$stable;
                int i215 = i214 << 3;
                Function1 function13 = function8;
                c0209i3 = c0209i10;
                function9 = function7;
                c0213j2 = c0213j;
                AbstractC13424s.m38062e(textResourceM29581f3, textResourceM29580e3, iM53357C, null, null, (InterfaceC4339a) objM87133R, c28655q6, i214 | i215, 24);
                c28655q2 = c28655q6;
                c23016z = C23016z.f90757a;
                float f110 = 8;
                f13 = ((float) 2.5d) * f110;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f)), f13, 0.0f, f13, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                c2305k = c2305k4;
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q2, 54);
                f14 = f110;
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                c0209i4 = c0209i11;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11);
                if (c11018e.getIsFullImage()) {
                    c28655q2.m87150e0(-1478677520);
                    AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.0f));
                    abstractC22403oM29579d = c11018e.getImageUrl();
                    if (abstractC22403oM29579d == null) {
                        c28655q2.m87150e0(-1478581018);
                        c28655q2.m87173q(false);
                        c23016z2 = c23016z;
                        z17 = true;
                        c2314t2 = c2314t;
                        z18 = false;
                        c28655q5 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1478581017);
                        z18 = false;
                        c2314t2 = c2314t;
                        c23016z2 = c23016z;
                        z17 = true;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM29579d, null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(60 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0.0f, null, c28655q2, 432, 120);
                        C28655q c28655q11 = c28655q2;
                        c28655q11.m87173q(false);
                        c28655q5 = c28655q11;
                    }
                    c28655q5.m87173q(z18);
                    c28655q3 = c28655q5;
                } else {
                    c0209i3 = c0209i3;
                    c0209i = c0209i;
                    c0213j2 = c0213j2;
                    c2305k = c2305k;
                    c23016z2 = c23016z;
                    c0209i4 = c0209i4;
                    c2314t2 = c2314t;
                    c0209i2 = c0209i2;
                    f14 = f14;
                    z17 = true;
                    z18 = false;
                    c28655q2.m87150e0(-1478225850);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                AbstractC22953f.m66715b(c28655q3, c23016z2.m66779c(c2314t2, z17, 1.0f));
                String strM21274h3 = AbstractC8693b.m21274h(c11018e.getTitleDisplay(), c28655q3, i214);
                C38072d c38072d3 = C38072d.f163053a;
                int i216 = C38072d.f163054b;
                C2886a c2886aM8416N3 = c38072d3.m121952e(c28655q3, i216).getT1();
                long jM125430y3 = c38072d3.m121949b(c28655q3, i216).getBrandWhite();
                int i217 = C2886a.f11498d << 18;
                C28655q c28655q12 = c28655q3;
                c0209i5 = c0209i2;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N3, null, c28655q12, 0, i217, 196602);
                float f111 = 4;
                AbstractC22953f.m66715b(c28655q12, AbstractC1102d.m3419p(f111 * f111, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11018e.getDescriptionDisplay(), c28655q12, i214), null, c38072d3.m121949b(c28655q12, i216).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q12, i216).getB1(), null, c28655q12, 0, i217, 196602);
                c28655q4 = c28655q12;
                c28655q4.m87173q(true);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                    f15 = 3 * f14;
                } else {
                    f15 = f13;
                }
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(modifierM3409f5, f13, 0.0f, f15, 3 * f14, 2);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q4, 0);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3398t3);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m12);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                AbstractC18489d0.m53380u(11, f111, c2314t2, c28655q4);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C11016c c11016cM29583h3 = c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29576a3 = c11018e.getButtonTitle();
                if (i18 != 4) {
                    viewState = c11018e;
                    if ((i19 & 8) == 0) {
                    }
                    if (i24 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | z28;
                    objM87133R2 = c28655q4.m87133R();
                    if (z24) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            function10 = function9;
                        }
                        AbstractC13410e.m37926c(c11016cM29583h3, textResourceM29576a3, modifierM3409f6, false, (InterfaceC4339a) objM87133R2, c28655q4, i214 | 384 | i215, 8);
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        if (i24 == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q4.m87133R();
                        if (z25) {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13390j(function10, 5);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                        function5 = function10;
                        function6 = function13;
                        c28655q = c28655q4;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    function10 = function9;
                    objM87133R2 = new C11546l(17, viewState, function10);
                    c28655q4.m87172p0(objM87133R2);
                    AbstractC13410e.m37926c(c11016cM29583h3, textResourceM29576a3, modifierM3409f6, false, (InterfaceC4339a) objM87133R2, c28655q4, i214 | 384 | i215, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function13;
                    c28655q = c28655q4;
                } else {
                    viewState = c11018e;
                }
                if (i24 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | z28;
                objM87133R2 = c28655q4.m87133R();
                if (z24) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function9;
                    }
                    AbstractC13410e.m37926c(c11016cM29583h3, textResourceM29576a3, modifierM3409f6, false, (InterfaceC4339a) objM87133R2, c28655q4, i214 | 384 | i215, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function13;
                    c28655q = c28655q4;
                } else {
                    c28676v1 = c28676v0;
                }
                function10 = function9;
                objM87133R2 = new C11546l(17, viewState, function10);
                c28655q4.m87172p0(objM87133R2);
                AbstractC13410e.m37926c(c11016cM29583h3, textResourceM29576a3, modifierM3409f6, false, (InterfaceC4339a) objM87133R2, c28655q4, i214 | 384 | i215, 8);
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                if (i24 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z25) {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                function5 = function10;
                function6 = function13;
                c28655q = c28655q4;
            } else {
                c28655q6.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 15, (Object) viewState, (Object) function6, function5);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q6.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R5 = c28655q6.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13406a(3);
                    c28655q6.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q6.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13406a(4);
                    c28655q6.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q6.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q6, modifierM66722k4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(c0213j);
            } else {
                c28655q6.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q6, c0209i12, interfaceC28653p1M87165m13);
            c0209i2 = C0217k.f732j;
            if (c28655q6.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i2);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q6, c0209i13, modifierM118962N13);
            if (viewState.getIsFullImage()) {
                c28655q6.m87150e0(791486773);
                abstractC22403oM29579d2 = viewState.getImageUrl();
                if (abstractC22403oM29579d2 == null) {
                    c28655q6.m87150e0(-1233713812);
                    z26 = false;
                } else {
                    z26 = false;
                    c28655q6.m87150e0(-1233713811);
                    m37913j(abstractC22403oM29579d2, c28655q6, AbstractC22403o.f87638a);
                }
                c28655q6.m87173q(z26);
                c28655q6.m87173q(z26);
                r14 = z26;
            } else {
                r14 = 0;
                c28655q6.m87150e0(-1233660646);
                c28655q6.m87173q(false);
            }
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k5 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k5, c28655q6, r14);
            iHashCode2 = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q6.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q6, modifierM3407d4);
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(c0213j);
            } else {
                c28655q6.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a10);
            AbstractC28683x.m87239G(c28655q6, c0209i12, interfaceC28653p1M87165m14);
            if (c28655q6.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q6, c0209i13, modifierM118962N14);
            TextResource textResourceM29581f4 = viewState.getNavigationTitle();
            TextResource textResourceM29580e4 = viewState.getNavigationSubtitle();
            if (viewState.getCurrentScreenId() == HormonalScreenId.INITIAL_SCREEN) {
                iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
            } else {
                iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
            }
            i18 = i15 & 14;
            if (i18 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            i19 = i15;
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z211 = z14 | z13;
            i24 = i19 & 112;
            if (i24 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z211 | z15;
            objM87133R = c28655q6.m87133R();
            if (z16) {
                objM87133R = new C11558r(viewState, function8, function7, 7);
                c28655q6.m87172p0(objM87133R);
            } else {
                objM87133R = new C11558r(viewState, function8, function7, 7);
                c28655q6.m87172p0(objM87133R);
            }
            int i218 = TextResource.$stable;
            int i219 = i218 << 3;
            Function1 function14 = function8;
            c0209i3 = c0209i12;
            function9 = function7;
            c0213j2 = c0213j;
            AbstractC13424s.m38062e(textResourceM29581f4, textResourceM29580e4, iM53357C, null, null, (InterfaceC4339a) objM87133R, c28655q6, i218 | i219, 24);
            c28655q2 = c28655q6;
            c23016z = C23016z.f90757a;
            float f112 = 8;
            f13 = ((float) 2.5d) * f112;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f)), f13, 0.0f, f13, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            c2305k = c2305k5;
            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q2, 54);
            f14 = f112;
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a11);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m15);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            c0209i4 = c0209i13;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N15);
            if (c11018e.getIsFullImage()) {
                c28655q2.m87150e0(-1478677520);
                AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.0f));
                abstractC22403oM29579d = c11018e.getImageUrl();
                if (abstractC22403oM29579d == null) {
                    c28655q2.m87150e0(-1478581018);
                    c28655q2.m87173q(false);
                    c23016z2 = c23016z;
                    z17 = true;
                    c2314t2 = c2314t;
                    z18 = false;
                    c28655q5 = c28655q2;
                } else {
                    c28655q2.m87150e0(-1478581017);
                    z18 = false;
                    c2314t2 = c2314t;
                    c23016z2 = c23016z;
                    z17 = true;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM29579d, null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(60 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0.0f, null, c28655q2, 432, 120);
                    C28655q c28655q13 = c28655q2;
                    c28655q13.m87173q(false);
                    c28655q5 = c28655q13;
                }
                c28655q5.m87173q(z18);
                c28655q3 = c28655q5;
            } else {
                c0209i3 = c0209i3;
                c0209i = c0209i;
                c0213j2 = c0213j2;
                c2305k = c2305k;
                c23016z2 = c23016z;
                c0209i4 = c0209i4;
                c2314t2 = c2314t;
                c0209i2 = c0209i2;
                f14 = f14;
                z17 = true;
                z18 = false;
                c28655q2.m87150e0(-1478225850);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            AbstractC22953f.m66715b(c28655q3, c23016z2.m66779c(c2314t2, z17, 1.0f));
            String strM21274h4 = AbstractC8693b.m21274h(c11018e.getTitleDisplay(), c28655q3, i218);
            C38072d c38072d4 = C38072d.f163053a;
            int i2110 = C38072d.f163054b;
            C2886a c2886aM8416N4 = c38072d4.m121952e(c28655q3, i2110).getT1();
            long jM125430y4 = c38072d4.m121949b(c28655q3, i2110).getBrandWhite();
            int i2111 = C2886a.f11498d << 18;
            C28655q c28655q14 = c28655q3;
            c0209i5 = c0209i2;
            AbstractC30795n.m94707h(strM21274h4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N4, null, c28655q14, 0, i2111, 196602);
            float f113 = 4;
            AbstractC22953f.m66715b(c28655q14, AbstractC1102d.m3419p(f113 * f113, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c11018e.getDescriptionDisplay(), c28655q14, i218), null, c38072d4.m121949b(c28655q14, i2110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q14, i2110).getB1(), null, c28655q14, 0, i2111, 196602);
            c28655q4 = c28655q14;
            c28655q4.m87173q(true);
            Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() != null) {
                f15 = 3 * f14;
            } else {
                f15 = f13;
            }
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3409f7, f13, 0.0f, f15, 3 * f14, 2);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q4, 0);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3398t4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m16);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
            AbstractC18489d0.m53380u(11, f113, c2314t2, c28655q4);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C11016c c11016cM29583h4 = c11018e.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM29576a4 = c11018e.getButtonTitle();
            if (i18 != 4) {
                viewState = c11018e;
                if ((i19 & 8) == 0) {
                }
                if (i24 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | z28;
                objM87133R2 = c28655q4.m87133R();
                if (z24) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function10 = function9;
                    }
                    AbstractC13410e.m37926c(c11016cM29583h4, textResourceM29576a4, modifierM3409f8, false, (InterfaceC4339a) objM87133R2, c28655q4, i218 | 384 | i219, 8);
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    if (i24 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R3 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13390j(function10, 5);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                    function5 = function10;
                    function6 = function14;
                    c28655q = c28655q4;
                } else {
                    c28676v1 = c28676v0;
                }
                function10 = function9;
                objM87133R2 = new C11546l(17, viewState, function10);
                c28655q4.m87172p0(objM87133R2);
                AbstractC13410e.m37926c(c11016cM29583h4, textResourceM29576a4, modifierM3409f8, false, (InterfaceC4339a) objM87133R2, c28655q4, i218 | 384 | i219, 8);
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                if (i24 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z25) {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                function5 = function10;
                function6 = function14;
                c28655q = c28655q4;
            } else {
                viewState = c11018e;
            }
            if (i24 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z19 | z28;
            objM87133R2 = c28655q4.m87133R();
            if (z24) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    function10 = function9;
                }
                AbstractC13410e.m37926c(c11016cM29583h4, textResourceM29576a4, modifierM3409f8, false, (InterfaceC4339a) objM87133R2, c28655q4, i218 | 384 | i219, 8);
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                if (i24 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z25) {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13390j(function10, 5);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
                function5 = function10;
                function6 = function14;
                c28655q = c28655q4;
            } else {
                c28676v1 = c28676v0;
            }
            function10 = function9;
            objM87133R2 = new C11546l(17, viewState, function10);
            c28655q4.m87172p0(objM87133R2);
            AbstractC13410e.m37926c(c11016cM29583h4, textResourceM29576a4, modifierM3409f8, false, (InterfaceC4339a) objM87133R2, c28655q4, i218 | 384 | i219, 8);
            AbstractC25012a.m73392y(c28655q4, true, true, true);
            if (i24 == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            objM87133R3 = c28655q4.m87133R();
            if (z25) {
                objM87133R3 = new C13390j(function10, 5);
                c28655q4.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C13390j(function10, 5);
                c28655q4.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q4, 0, 1);
            function5 = function10;
            function6 = function14;
            c28655q = c28655q4;
        } else {
            c28655q6.m87138X();
            function5 = function3;
            function6 = function4;
            c28655q = c28655q6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 15, (Object) viewState, (Object) function6, function5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37918o(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m37919p(AbstractC3535b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m37920q(C11018e c11018e, Function1 function1, Function1 function2) {
        if (c11018e.getCurrentScreenId() == HormonalScreenId.INITIAL_SCREEN) {
            function1.invoke(AbstractC3535b.a.f14171a);
        } else {
            function2.invoke(AbstractC11022i.a.f34542a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m37921r(C11018e c11018e, Function1 function1) {
        if (c11018e.getCurrentScreenId() == HormonalScreenId.NEITHER) {
            function1.invoke(AbstractC11022i.b.f34543a);
        } else {
            function1.invoke(new AbstractC11022i.d(c11018e.getNextId(), new C40925b(null, null, null, null, null, null, null, 127, null)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m37922s(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m37923t(C11018e c11018e, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m37917n(c11018e, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
