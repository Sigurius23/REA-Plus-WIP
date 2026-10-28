package nr0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m31.C25002h;
import no1.C26993g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nr0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lnr0/j;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lnr0/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "text", "Lkd1/o;", "avatar", "i", "(Ljava/lang/String;Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "community-highlights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27076i {
    /* JADX WARN: Code duplicated, block: B:102:0x0389  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0348  */
    /* JADX WARN: Code duplicated, block: B:97:0x0353  */
    /* JADX WARN: Code duplicated, block: B:99:0x037e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX INFO: renamed from: e */
    public static final void m81418e(Modifier modifier, C27077j viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object obj;
        Function1 function4;
        float f13;
        GenericInteraction genericInteractionM81432j;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        Modifier modifierM3362g;
        Modifier modifier5;
        Modifier modifier6;
        C2307m c2307m;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        int i16;
        C28655q c28655q2;
        float f14;
        int iHashCode2;
        TextResource textResourceM81433k;
        C17916v0 c17916v0;
        C1100b c1100b;
        ?? r10;
        float f15;
        C28655q c28655q3;
        TextResource textResourceM81425b;
        C28655q c28655q4;
        TextResource textResourceM81431i;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(1562606684);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q5.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q5.m87153g(viewState) : c28655q5.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q5.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                obj = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C26993g(12);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier4), false, 0.76f), c33252iM105489e), viewState.getBorderWidth(), viewState.getBorderColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), c33252iM105489e);
                genericInteractionM81432j = viewState.getInteraction();
                if (genericInteractionM81432j == null) {
                    c28655q5.m87150e0(-1534301989);
                    c28655q5.m87173q(false);
                    modifierM3362g = null;
                } else {
                    c28655q5.m87150e0(-1534301988);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q5.m87157i(genericInteractionM81432j);
                    objM87133R = c28655q5.m87133R();
                    if (zM87157i || objM87133R == obj) {
                        objM87133R = new C11161b(function4, genericInteractionM81432j, 4);
                        c28655q5.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q5.m87173q(false);
                }
                modifier5 = modifierM3362g;
                if (modifier5 == null) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier5;
                }
                Modifier modifierMo3471e = modifierM44455h.mo3471e(modifier6);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a);
                } else {
                    c28655q5.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
                AbstractC22403o abstractC22403oM81424a = viewState.getBackgroundImage();
                i16 = AbstractC22403o.f87638a;
                Function1 function5 = function4;
                Modifier modifier7 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM81424a, null, null, c28655q5, i16, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q5, 25008, 104);
                c28655q2 = c28655q5;
                f14 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 1.25d) * f14, ((float) 1.5d) * f14);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                textResourceM81433k = viewState.getLabel();
                c17916v0 = AbstractC17918w0.f69621a;
                c1100b = C1100b.f4583a;
                if (textResourceM81433k == null) {
                    c28655q2.m87150e0(-70979740);
                    c28655q2.m87173q(false);
                    f15 = f13;
                    r10 = 0;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-70979739);
                    float f16 = f14 * 0.5f;
                    r10 = 0;
                    f15 = f13;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81433k, c28655q2, TextResource.$stable), AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(c1100b.mo3400a(c2314t, c2307m), 1, f13), viewState.getLabelBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c17916v0), f16, f16), viewState.getLabelTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB4(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                    C28655q c28655q6 = c28655q2;
                    c28655q6.m87173q(false);
                    c28655q3 = c28655q6;
                }
                textResourceM81425b = viewState.getBadge();
                if (textResourceM81425b == null) {
                    c28655q3.m87150e0(-70327717);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(-70327716);
                    C28655q c28655q7 = c28655q3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81425b, c28655q3, TextResource.$stable), AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(c1100b.mo3400a(c2314t, C2299e.f9116y), 2, f15), viewState.getBadgeBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, r10), c17916v0), 1 * f14, f14 * 0.5f), viewState.getBadgeTextColor().mo134584toComposableColorWaAFU9c(c28655q3, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q3, C38072d.f163054b).getB3(), null, c28655q7, 0, C2886a.f11498d << 18, 196600);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(r10);
                    c28655q4 = c28655q8;
                }
                textResourceM81431i = viewState.getFooterText();
                if (textResourceM81431i == null) {
                    c28655q4.m87150e0(-69733602);
                    c28655q4.m87173q(r10);
                } else {
                    c28655q4.m87150e0(-69733601);
                    m81422i(AbstractC8693b.m21274h(textResourceM81431i, c28655q4, TextResource.$stable), viewState.getFooterAvatar(), c1100b.mo3400a(c2314t, C2299e.f9104G), c28655q4, i16 << 3, 0);
                    c28655q4.m87173q(r10);
                }
                c28655q4.m87173q(true);
                c28655q4.m87173q(true);
                modifier3 = modifier7;
                function3 = function5;
                c28655q = c28655q4;
            } else {
                c28655q5.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, function3, i13, i14, 22);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q5.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            obj = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C26993g(12);
                    c28655q5.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            f13 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f13);
            Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC37056f.m118994r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier4), false, 0.76f), c33252iM105489e2), viewState.getBorderWidth(), viewState.getBorderColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), c33252iM105489e2);
            genericInteractionM81432j = viewState.getInteraction();
            if (genericInteractionM81432j == null) {
                c28655q5.m87150e0(-1534301989);
                c28655q5.m87173q(false);
                modifierM3362g = null;
            } else {
                c28655q5.m87150e0(-1534301988);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q5.m87157i(genericInteractionM81432j);
                objM87133R = c28655q5.m87133R();
                if (zM87157i) {
                    objM87133R = new C11161b(function4, genericInteractionM81432j, 4);
                    c28655q5.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11161b(function4, genericInteractionM81432j, 4);
                    c28655q5.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q5.m87173q(false);
            }
            modifier5 = modifierM3362g;
            if (modifier5 == null) {
                modifier6 = c2314t;
            } else {
                modifier6 = modifier5;
            }
            Modifier modifierMo3471e2 = modifierM44455h2.mo3471e(modifier6);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i5, interfaceC39127r0M66763d3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q5.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i7, modifierM118962N3);
            AbstractC22403o abstractC22403oM81424a2 = viewState.getBackgroundImage();
            i16 = AbstractC22403o.f87638a;
            Function1 function6 = function4;
            Modifier modifier8 = modifier4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM81424a2, null, null, c28655q5, i16, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q5, 25008, 104);
            c28655q2 = c28655q5;
            f14 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 1.25d) * f14, ((float) 1.5d) * f14);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            textResourceM81433k = viewState.getLabel();
            c17916v0 = AbstractC17918w0.f69621a;
            c1100b = C1100b.f4583a;
            if (textResourceM81433k == null) {
                c28655q2.m87150e0(-70979740);
                c28655q2.m87173q(false);
                f15 = f13;
                r10 = 0;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-70979739);
                float f17 = f14 * 0.5f;
                r10 = 0;
                f15 = f13;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81433k, c28655q2, TextResource.$stable), AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(c1100b.mo3400a(c2314t, c2307m), 1, f13), viewState.getLabelBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c17916v0), f17, f17), viewState.getLabelTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB4(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                C28655q c28655q9 = c28655q2;
                c28655q9.m87173q(false);
                c28655q3 = c28655q9;
            }
            textResourceM81425b = viewState.getBadge();
            if (textResourceM81425b == null) {
                c28655q3.m87150e0(-70327717);
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(-70327716);
                C28655q c28655q10 = c28655q3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81425b, c28655q3, TextResource.$stable), AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(c1100b.mo3400a(c2314t, C2299e.f9116y), 2, f15), viewState.getBadgeBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q3, r10), c17916v0), 1 * f14, f14 * 0.5f), viewState.getBadgeTextColor().mo134584toComposableColorWaAFU9c(c28655q3, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q3, C38072d.f163054b).getB3(), null, c28655q10, 0, C2886a.f11498d << 18, 196600);
                C28655q c28655q11 = c28655q10;
                c28655q11.m87173q(r10);
                c28655q4 = c28655q11;
            }
            textResourceM81431i = viewState.getFooterText();
            if (textResourceM81431i == null) {
                c28655q4.m87150e0(-69733602);
                c28655q4.m87173q(r10);
            } else {
                c28655q4.m87150e0(-69733601);
                m81422i(AbstractC8693b.m21274h(textResourceM81431i, c28655q4, TextResource.$stable), viewState.getFooterAvatar(), c1100b.mo3400a(c2314t, C2299e.f9104G), c28655q4, i16 << 3, 0);
                c28655q4.m87173q(r10);
            }
            c28655q4.m87173q(true);
            c28655q4.m87173q(true);
            modifier3 = modifier8;
            function3 = function6;
            c28655q = c28655q4;
        } else {
            c28655q5.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c28655q = c28655q5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, function3, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m81419f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m81420g(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m81421h(Modifier modifier, C27077j c27077j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m81418e(modifier, c27077j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v3 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v6 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: i */
    private static final void m81422i(java.lang.String r33, kd1.AbstractC22403o r34, androidx.compose.p018ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.AbstractC27076i.m81422i(java.lang.String, kd1.o, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m81423j(String str, AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m81422i(str, abstractC22403o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
