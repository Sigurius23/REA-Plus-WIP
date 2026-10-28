package ry0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import b91.C2886a;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.AbstractC15005f3;
import p163g1.C15127r1;
import p208i2.C17903p;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import p727py0.C29616a;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import rx0.C31901f;
import sy0.AbstractC33085h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ry0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lry0/d;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "", "selectionDisabled", "f", "(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V", "isSelected", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31907b {
    /* JADX WARN: Code duplicated, block: B:101:0x0198  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:123:0x022d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0250  */
    /* JADX WARN: Code duplicated, block: B:131:0x025e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0298  */
    /* JADX WARN: Code duplicated, block: B:134:0x029d  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0324  */
    /* JADX WARN: Code duplicated, block: B:155:0x034a  */
    /* JADX WARN: Code duplicated, block: B:156:0x035a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0368  */
    /* JADX WARN: Code duplicated, block: B:163:0x0383  */
    /* JADX WARN: Code duplicated, block: B:165:0x038f  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:189:0x0404  */
    /* JADX WARN: Code duplicated, block: B:194:0x0422  */
    /* JADX WARN: Code duplicated, block: B:197:0x0443  */
    /* JADX WARN: Code duplicated, block: B:199:0x0455  */
    /* JADX WARN: Code duplicated, block: B:202:0x0490  */
    /* JADX WARN: Code duplicated, block: B:204:0x049b  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:208:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:212:0x050a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0521  */
    /* JADX WARN: Code duplicated, block: B:219:0x0565  */
    /* JADX WARN: Code duplicated, block: B:222:0x0587  */
    /* JADX WARN: Code duplicated, block: B:224:0x059b  */
    /* JADX WARN: Code duplicated, block: B:227:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165  */
    /* JADX WARN: Code duplicated, block: B:99:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
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
    /* JADX INFO: renamed from: f */
    public static final void m99196f(Modifier modifier, C31909d state, InterfaceC4339a interfaceC4339a, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean selectionDisabled;
        boolean z13;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier3;
        boolean z14;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        Object obj;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R;
        Object obj2;
        boolean z15;
        boolean zM87155h;
        Object obj3;
        InterfaceC28601c1 interfaceC28601c1;
        C17903p c17903p;
        EnumC31908c selectionStyle;
        C39174f fixedHeightInSizeDp;
        boolean z16;
        boolean zM87153g;
        Object obj4;
        InterfaceC4339a interfaceC4339a4;
        boolean zM87153g2;
        Object obj5;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC39332e interfaceC39332e;
        long jMo134584toComposableColorWaAFU9c;
        EnumC39333f backgroundColor;
        float f13;
        int i17;
        float f14;
        InterfaceC39332e interfaceC39332e2;
        float f15;
        EnumC31908c selectionStyle2;
        int iHashCode;
        InterfaceC4339a interfaceC4339a5;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC4339a interfaceC4339a6;
        C0209i c0209i4;
        C0209i c0209i5;
        Object obj6;
        float f16;
        boolean z17;
        C2314t c2314t2;
        InterfaceC4339a interfaceC4339a7;
        ?? r10;
        long j7;
        EnumC31908c selectionStyle3;
        float fM134480getMinContentHeightD9Ej5fM;
        C39174f c39174f;
        float f17;
        float f18;
        InterfaceC39332e interfaceC39332e3;
        long jMo134584toComposableColorWaAFU9c2;
        EnumC39333f iconColor;
        C28655q c28655q2;
        int iHashCode2;
        C38072d c38072d;
        long jM73366B;
        C28655q c28655q3;
        String subtitle;
        long jM73370c;
        C28655q c28655q4;
        C28655q c28655q5;
        EnumC31908c selectionStyle4;
        C28655q c28655q6;
        InterfaceC4339a interfaceC4339a8;
        boolean zM87153g3;
        Object objM87133R2;
        Object obj7;
        float f19;
        EnumC39333f enumC39333f;
        InterfaceC39332e interfaceC39332e4;
        boolean z18;
        EnumC39333f iconColor2;
        EnumC39333f borderColor;
        int i18;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-853931189);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q7.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q7.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q7.m87157i(interfaceC4339a) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    selectionDisabled = z4;
                    if (c28655q7.m87155h(selectionDisabled)) {
                        i18 = 2048;
                    }
                    i15 |= i18;
                } else {
                    selectionDisabled = z4;
                }
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i18;
            } else {
                selectionDisabled = z4;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z13)) {
                c28655q7.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                obj = C28635l.f115821a;
                if (i16 != 0 || c28655q7.m87118C()) {
                    if (i19 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q7.m87133R();
                        if (objM87133R == obj) {
                            obj2 = objM87133R;
                            Object c31901f = new C31901f(2);
                            c28655q7.m87172p0(c31901f);
                            obj2 = c31901f;
                        }
                        obj2 = objM87133R;
                        interfaceC4339a3 = (InterfaceC4339a) obj2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if ((i14 & 8) != 0) {
                        selectionDisabled = state.getSelectionDisabled();
                        i15 &= -7169;
                    }
                } else {
                    c28655q7.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    interfaceC4339a3 = interfaceC4339a;
                }
                z15 = selectionDisabled;
                c28655q7.m87175r();
                zM87155h = c28655q7.m87155h(state.getSelected()) | c28655q7.m87153g(state.getId());
                Object objM87133R3 = c28655q7.m87133R();
                obj3 = objM87133R3;
                if (zM87155h || objM87133R3 == obj) {
                    Object objM87272z = AbstractC28683x.m87272z(Boolean.valueOf(state.getSelected()));
                    c28655q7.m87172p0(objM87272z);
                    obj3 = objM87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj3;
                c17903p = null;
                if (m99198h(interfaceC28601c1)) {
                    selectionStyle = state.getSelectionStyle();
                } else {
                    selectionStyle = null;
                }
                fixedHeightInSizeDp = state.getFixedHeightInSizeDp();
                if ((i15 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q7.m87155h(z15)) || (i15 & 3072) == 2048) | c28655q7.m87153g(interfaceC28601c1);
                Object objM87133R4 = c28655q7.m87133R();
                obj4 = objM87133R4;
                if (zM87153g || objM87133R4 == obj) {
                    Object c3433d0 = new C3433d0(interfaceC4339a3, z15, interfaceC28601c1, 8);
                    c28655q7.m87172p0(c3433d0);
                    obj4 = c3433d0;
                }
                interfaceC4339a4 = (InterfaceC4339a) obj4;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                boolean z19 = !state.getIsDisabled();
                zM87153g2 = c28655q7.m87153g(interfaceC4339a4);
                Object objM87133R5 = c28655q7.m87133R();
                obj5 = objM87133R5;
                if (zM87153g2 || objM87133R5 == obj) {
                    Object c28329e = new C28329e(interfaceC4339a4, 29);
                    c28655q7.m87172p0(c28329e);
                    obj5 = c28329e;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, z19, null, null, (InterfaceC4339a) obj5, 14);
                interfaceC28601c2 = interfaceC28601c1;
                if (state.getIsDisabled()) {
                    c28655q7.m87150e0(-372027642);
                    jMo134584toComposableColorWaAFU9c = EnumC39333f.WHITE_5.mo134584toComposableColorWaAFU9c(c28655q7, 6);
                    c28655q7.m87173q(false);
                } else {
                    c28655q7.m87150e0(-371940222);
                    if (selectionStyle != null || (backgroundColor = selectionStyle.getBackgroundColor()) == null) {
                        interfaceC39332e = backgroundColor;
                        interfaceC39332e = EnumC39333f.WHITE_10;
                    }
                    interfaceC39332e = backgroundColor;
                    jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q7, 0);
                    c28655q7.m87173q(false);
                }
                f13 = 4;
                float f24 = 3 * f13;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3362g, jMo134584toComposableColorWaAFU9c, AbstractC33253j.m105489e(f24));
                if (m99198h(interfaceC28601c2)) {
                    f14 = (float) 1.5d;
                    i17 = 0;
                } else {
                    i17 = 0;
                    f14 = 0;
                }
                if (selectionStyle != null || (borderColor = selectionStyle.getBorderColor()) == null) {
                    interfaceC39332e2 = borderColor;
                    interfaceC39332e2 = EnumC39333f.TRANSPARENT;
                }
                interfaceC39332e2 = borderColor;
                Modifier modifier4 = modifier2;
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3358c, f14, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q7, i17), AbstractC33253j.m105489e(f24));
                f15 = 8;
                float f25 = 2 * f15;
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM44455h, f25, f25);
                selectionStyle2 = state.getSelectionStyle();
                if (selectionStyle2 == null) {
                    selectionStyle2 = EnumC31908c.DEFAULT;
                }
                Modifier modifierM3405b = AbstractC1102d.m3405b(modifierM3395q, 0.0f, selectionStyle2.getMinContentHeight(), 1);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q7, 54);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3405b);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a5 = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a5);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i6, modifierM118962N);
                if (state.getLeftImage() != null) {
                    c28655q7.m87150e0(1696941158);
                    obj6 = obj;
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(state.getLeftImage(), null, null, c28655q7, 0, 3);
                    Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(6 * f13, AbstractC1136a.m3599a(c2314t, "selectable_cell_left_image")), 1, f13);
                    if (state.getIsDisabled()) {
                        f19 = 0.2f;
                    } else {
                        f19 = 1.0f;
                    }
                    if (selectionStyle != null || (iconColor2 = selectionStyle.getIconColor()) == null) {
                        enumC39333f = iconColor2;
                        enumC39333f = EnumC39333f.WHITE_50;
                    }
                    enumC39333f = iconColor2;
                    if (state.getShouldTintLeftImage() || state.getIsDisabled()) {
                        interfaceC39332e4 = enumC39333f;
                        interfaceC39332e4 = null;
                    }
                    if (interfaceC39332e4 == null) {
                        c28655q7.m87150e0(1697580098);
                        z18 = false;
                        c28655q7.m87173q(false);
                    } else {
                        z18 = false;
                        c28655q7.m87150e0(1697580099);
                        C17903p c17903p2 = new C17903p(interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q7, 0), 5);
                        c28655q7.m87173q(false);
                        c17903p = c17903p2;
                    }
                    c2314t2 = c2314t;
                    interfaceC4339a7 = interfaceC4339a5;
                    interfaceC28601c2 = interfaceC28601c2;
                    interfaceC4339a6 = interfaceC4339a4;
                    f16 = f15;
                    z17 = z15;
                    boolean z24 = z18;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM53364e, null, C39102j.f168199a, f19, c17903p, c28655q7, 24624, 8);
                    C28655q c28655q8 = c28655q7;
                    j7 = 4609434218613702656L;
                    AbstractC18489d0.m53381v((float) 1.5d, f16, c2314t2, c28655q8, z24);
                    r10 = z24;
                    c28655q2 = c28655q8;
                } else {
                    interfaceC4339a6 = interfaceC4339a4;
                    c0209i2 = c0209i2;
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i;
                    obj6 = obj;
                    f16 = f15;
                    z17 = z15;
                    c2314t2 = c2314t;
                    interfaceC4339a7 = interfaceC4339a5;
                    r10 = 0;
                    r10 = 0;
                    j7 = 4609434218613702656L;
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(1697782126);
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(state.getLeftIcon().toWhoopIcon(), c28655q7, 6);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, AbstractC1136a.m3599a(c2314t2, "selectable_cell_left_icon"));
                        if (state.getIsDisabled()) {
                            c28655q7.m87150e0(1698123033);
                            jMo134584toComposableColorWaAFU9c2 = EnumC39333f.WHITE_20.mo134584toComposableColorWaAFU9c(c28655q7, 6);
                            c28655q7.m87173q(false);
                        } else {
                            c28655q7.m87150e0(1698219257);
                            if (selectionStyle != null || (iconColor = selectionStyle.getIconColor()) == null) {
                                interfaceC39332e3 = iconColor;
                                interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                            }
                            interfaceC39332e3 = iconColor;
                            jMo134584toComposableColorWaAFU9c2 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q7, 0);
                            c28655q7.m87173q(false);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jMo134584toComposableColorWaAFU9c2, c28655q7, 432, 0);
                        C28655q c28655q9 = c28655q7;
                        AbstractC18489d0.m53381v((float) 1.5d, f16, c2314t2, c28655q9, false);
                        c28655q2 = c28655q9;
                    } else {
                        c28655q7.m87150e0(1698463475);
                        selectionStyle3 = state.getSelectionStyle();
                        if (selectionStyle3 == null) {
                            selectionStyle3 = EnumC31908c.DEFAULT;
                        }
                        fM134480getMinContentHeightD9Ej5fM = selectionStyle3.getMinContentHeight();
                        c39174f = new C39174f(fM134480getMinContentHeightD9Ej5fM);
                        if (Float.compare(fM134480getMinContentHeightD9Ej5fM, 0) <= 0) {
                            c39174f = null;
                        }
                        if (c39174f != null) {
                            f17 = c39174f.f168413w;
                        } else {
                            f17 = f16 * f13;
                        }
                        if (fixedHeightInSizeDp == null) {
                            c28655q7.m87150e0(1698659084);
                            c28655q7.m87173q(false);
                        } else {
                            c28655q7.m87150e0(1698659085);
                            f18 = fixedHeightInSizeDp.f168413w;
                            if (f18 <= f17) {
                                f17 = f18;
                            }
                            AbstractC30007c.m91851u(c2314t2, f17, c28655q7, false);
                        }
                        c28655q7.m87173q(false);
                        c28655q2 = c28655q7;
                    }
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a7);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                String strM21275i = AbstractC8693b.m21275i(state.getTitle(), c28655q2, r10);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, 6).getB1();
                if (state.getIsDisabled()) {
                    c28655q2.m87150e0(463475596);
                    jM73366B = c38072d.m121949b(c28655q2, 6).getWhite20();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q2, 463476591, c38072d, c28655q2, 6);
                }
                c28655q2.m87173q(r10);
                C28655q c28655q10 = c28655q2;
                AbstractC30795n.m94707h(strM21275i, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q10, 0, 0, 196602);
                c28655q3 = c28655q10;
                subtitle = state.getSubtitle();
                if (subtitle == null) {
                    c28655q3.m87150e0(1482935581);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(1482935582);
                    AbstractC11266d.m30469w((float) 0.5d, f13, c2314t2, c28655q3);
                    String strM21275i2 = AbstractC8693b.m21275i(subtitle, c28655q3, r10);
                    C2886a c2886aM8422c = c38072d.m121952e(c28655q3, 6).getB3();
                    if (state.getIsDisabled()) {
                        c28655q3.m87150e0(-409165554);
                        jM73370c = c38072d.m121949b(c28655q3, 6).getWhite20();
                    } else {
                        jM73370c = AbstractC25012a.m73370c(c28655q3, -409164562, c38072d, c28655q3, 6);
                    }
                    c28655q3.m87173q(r10);
                    AbstractC30795n.m94707h(strM21275i2, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q3, 0, 0, 196602);
                    C28655q c28655q11 = c28655q3;
                    c28655q11.m87173q(r10);
                    c28655q4 = c28655q11;
                }
                c28655q4.m87173q(true);
                if (state.getShowCheckbox()) {
                    c28655q4.m87150e0(1699586977);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3424u(((float) 1.5d) * f16, c2314t2));
                    selectionStyle4 = state.getSelectionStyle();
                    if (selectionStyle4 == null) {
                        selectionStyle4 = EnumC31908c.DEFAULT;
                    }
                    long jMo134584toComposableColorWaAFU9c3 = selectionStyle4.getBorderColor().mo134584toComposableColorWaAFU9c(c28655q4, r10);
                    boolean zM99198h = m99198h(interfaceC28601c2);
                    boolean z25 = !state.getIsDisabled();
                    c28655q6 = c28655q4;
                    C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(jMo134584toComposableColorWaAFU9c3, c38072d.m121949b(c28655q4, 6).getWhite40(), c38072d.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q6, 0, 24);
                    interfaceC4339a8 = interfaceC4339a6;
                    zM87153g3 = c28655q6.m87153g(interfaceC4339a8);
                    objM87133R2 = c28655q6.m87133R();
                    if (zM87153g3 || objM87133R2 == obj6) {
                        obj7 = objM87133R2;
                        Object c29616a = new C29616a(interfaceC4339a8, 19);
                        c28655q6.m87172p0(c29616a);
                        obj7 = c29616a;
                    }
                    obj7 = objM87133R2;
                    AbstractC33085h.m104813c(null, zM99198h, (Function1) obj7, z25, null, c15127r1M34081r, null, 0.0f, 0.0f, c28655q6, 0, 465);
                    C28655q c28655q12 = c28655q6;
                    c28655q12.m87173q(r10);
                    c28655q5 = c28655q12;
                } else {
                    c28655q4.m87150e0(1700188563);
                    c28655q4.m87173q(r10);
                    c28655q5 = c28655q4;
                }
                c28655q5.m87173q(true);
                z14 = z17;
                modifier3 = modifier4;
                interfaceC4339a2 = interfaceC4339a9;
                c28655q = c28655q5;
            } else {
                c28655q7.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                modifier3 = modifier2;
                z14 = selectionDisabled;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier3, state, interfaceC4339a2, z14, i13, i14);
            }
        }
        i15 |= 384;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                selectionDisabled = z4;
                if (c28655q7.m87155h(selectionDisabled)) {
                    i18 = 2048;
                }
                i15 |= i18;
            } else {
                selectionDisabled = z4;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i18;
        } else {
            selectionDisabled = z4;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z13)) {
            c28655q7.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            obj = C28635l.f115821a;
            if (i16 != 0) {
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        obj2 = objM87133R;
                        Object c31901f2 = new C31901f(2);
                        c28655q7.m87172p0(c31901f2);
                        obj2 = c31901f2;
                    }
                    obj2 = objM87133R;
                    interfaceC4339a3 = (InterfaceC4339a) obj2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if ((i14 & 8) != 0) {
                    selectionDisabled = state.getSelectionDisabled();
                    i15 &= -7169;
                }
            } else {
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        obj2 = objM87133R;
                        Object c31901f3 = new C31901f(2);
                        c28655q7.m87172p0(c31901f3);
                        obj2 = c31901f3;
                    }
                    obj2 = objM87133R;
                    interfaceC4339a3 = (InterfaceC4339a) obj2;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if ((i14 & 8) != 0) {
                    selectionDisabled = state.getSelectionDisabled();
                    i15 &= -7169;
                }
            }
            z15 = selectionDisabled;
            c28655q7.m87175r();
            zM87155h = c28655q7.m87155h(state.getSelected()) | c28655q7.m87153g(state.getId());
            Object objM87133R6 = c28655q7.m87133R();
            obj3 = objM87133R6;
            if (zM87155h) {
                Object objM87272z2 = AbstractC28683x.m87272z(Boolean.valueOf(state.getSelected()));
                c28655q7.m87172p0(objM87272z2);
                obj3 = objM87272z2;
            } else {
                Object objM87272z3 = AbstractC28683x.m87272z(Boolean.valueOf(state.getSelected()));
                c28655q7.m87172p0(objM87272z3);
                obj3 = objM87272z3;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj3;
            c17903p = null;
            if (m99198h(interfaceC28601c1)) {
                selectionStyle = state.getSelectionStyle();
            } else {
                selectionStyle = null;
            }
            fixedHeightInSizeDp = state.getFixedHeightInSizeDp();
            if ((i15 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87153g = z16 | ((((i15 & 7168) ^ 3072) <= 2048 && c28655q7.m87155h(z15)) || (i15 & 3072) == 2048) | c28655q7.m87153g(interfaceC28601c1);
            Object objM87133R7 = c28655q7.m87133R();
            obj4 = objM87133R7;
            if (zM87153g) {
                Object c3433d1 = new C3433d0(interfaceC4339a3, z15, interfaceC28601c1, 8);
                c28655q7.m87172p0(c3433d1);
                obj4 = c3433d1;
            } else {
                Object c3433d2 = new C3433d0(interfaceC4339a3, z15, interfaceC28601c1, 8);
                c28655q7.m87172p0(c3433d2);
                obj4 = c3433d2;
            }
            interfaceC4339a4 = (InterfaceC4339a) obj4;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            boolean z110 = !state.getIsDisabled();
            zM87153g2 = c28655q7.m87153g(interfaceC4339a4);
            Object objM87133R8 = c28655q7.m87133R();
            obj5 = objM87133R8;
            if (zM87153g2) {
                Object c28329e2 = new C28329e(interfaceC4339a4, 29);
                c28655q7.m87172p0(c28329e2);
                obj5 = c28329e2;
            } else {
                Object c28329e3 = new C28329e(interfaceC4339a4, 29);
                c28655q7.m87172p0(c28329e3);
                obj5 = c28329e3;
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, z110, null, null, (InterfaceC4339a) obj5, 14);
            interfaceC28601c2 = interfaceC28601c1;
            if (state.getIsDisabled()) {
                c28655q7.m87150e0(-372027642);
                jMo134584toComposableColorWaAFU9c = EnumC39333f.WHITE_5.mo134584toComposableColorWaAFU9c(c28655q7, 6);
                c28655q7.m87173q(false);
            } else {
                c28655q7.m87150e0(-371940222);
                if (selectionStyle != null) {
                    interfaceC39332e = backgroundColor;
                    interfaceC39332e = EnumC39333f.WHITE_10;
                } else {
                    interfaceC39332e = backgroundColor;
                    interfaceC39332e = EnumC39333f.WHITE_10;
                }
                interfaceC39332e = backgroundColor;
                jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q7, 0);
                c28655q7.m87173q(false);
            }
            f13 = 4;
            float f26 = 3 * f13;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3362g2, jMo134584toComposableColorWaAFU9c, AbstractC33253j.m105489e(f26));
            if (m99198h(interfaceC28601c2)) {
                f14 = (float) 1.5d;
                i17 = 0;
            } else {
                i17 = 0;
                f14 = 0;
            }
            if (selectionStyle != null) {
                interfaceC39332e2 = borderColor;
                interfaceC39332e2 = EnumC39333f.TRANSPARENT;
            } else {
                interfaceC39332e2 = borderColor;
                interfaceC39332e2 = EnumC39333f.TRANSPARENT;
            }
            interfaceC39332e2 = borderColor;
            Modifier modifier5 = modifier2;
            Modifier modifierM44455h2 = AbstractC15751g.m44455h(modifierM3358c2, f14, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q7, i17), AbstractC33253j.m105489e(f26));
            f15 = 8;
            float f27 = 2 * f15;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM44455h2, f27, f27);
            selectionStyle2 = state.getSelectionStyle();
            if (selectionStyle2 == null) {
                selectionStyle2 = EnumC31908c.DEFAULT;
            }
            Modifier modifierM3405b2 = AbstractC1102d.m3405b(modifierM3395q2, 0.0f, selectionStyle2.getMinContentHeight(), 1);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q7, 54);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM3405b2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a5 = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a5);
            } else {
                c28655q7.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            InterfaceC4339a interfaceC4339a10 = interfaceC4339a3;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N3);
            if (state.getLeftImage() != null) {
                c28655q7.m87150e0(1696941158);
                obj6 = obj;
                c0209i4 = c0209i3;
                c0209i5 = c0209i;
                AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(state.getLeftImage(), null, null, c28655q7, 0, 3);
                Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(6 * f13, AbstractC1136a.m3599a(c2314t, "selectable_cell_left_image")), 1, f13);
                if (state.getIsDisabled()) {
                    f19 = 0.2f;
                } else {
                    f19 = 1.0f;
                }
                if (selectionStyle != null) {
                    enumC39333f = iconColor2;
                    enumC39333f = EnumC39333f.WHITE_50;
                } else {
                    enumC39333f = iconColor2;
                    enumC39333f = EnumC39333f.WHITE_50;
                }
                enumC39333f = iconColor2;
                if (state.getShouldTintLeftImage()) {
                    interfaceC39332e4 = enumC39333f;
                    interfaceC39332e4 = null;
                } else {
                    interfaceC39332e4 = enumC39333f;
                    interfaceC39332e4 = null;
                }
                if (interfaceC39332e4 == null) {
                    c28655q7.m87150e0(1697580098);
                    z18 = false;
                    c28655q7.m87173q(false);
                } else {
                    z18 = false;
                    c28655q7.m87150e0(1697580099);
                    C17903p c17903p3 = new C17903p(interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q7, 0), 5);
                    c28655q7.m87173q(false);
                    c17903p = c17903p3;
                }
                c2314t2 = c2314t;
                interfaceC4339a7 = interfaceC4339a5;
                interfaceC28601c2 = interfaceC28601c2;
                interfaceC4339a6 = interfaceC4339a4;
                f16 = f15;
                z17 = z15;
                boolean z26 = z18;
                AbstractC29125c.m88522c(abstractC26165aM64500i2, null, modifierM53364e2, null, C39102j.f168199a, f19, c17903p, c28655q7, 24624, 8);
                C28655q c28655q13 = c28655q7;
                j7 = 4609434218613702656L;
                AbstractC18489d0.m53381v((float) 1.5d, f16, c2314t2, c28655q13, z26);
                r10 = z26;
                c28655q2 = c28655q13;
            } else {
                interfaceC4339a6 = interfaceC4339a4;
                c0209i2 = c0209i2;
                c0209i4 = c0209i3;
                c0209i5 = c0209i;
                obj6 = obj;
                f16 = f15;
                z17 = z15;
                c2314t2 = c2314t;
                interfaceC4339a7 = interfaceC4339a5;
                r10 = 0;
                r10 = 0;
                j7 = 4609434218613702656L;
                if (state.getLeftIcon() != null) {
                    c28655q7.m87150e0(1697782126);
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(state.getLeftIcon().toWhoopIcon(), c28655q7, 6);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(5 * f13, AbstractC1136a.m3599a(c2314t2, "selectable_cell_left_icon"));
                    if (state.getIsDisabled()) {
                        c28655q7.m87150e0(1698123033);
                        jMo134584toComposableColorWaAFU9c2 = EnumC39333f.WHITE_20.mo134584toComposableColorWaAFU9c(c28655q7, 6);
                        c28655q7.m87173q(false);
                    } else {
                        c28655q7.m87150e0(1698219257);
                        if (selectionStyle != null) {
                            interfaceC39332e3 = iconColor;
                            interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                        } else {
                            interfaceC39332e3 = iconColor;
                            interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                        }
                        interfaceC39332e3 = iconColor;
                        jMo134584toComposableColorWaAFU9c2 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q7, 0);
                        c28655q7.m87173q(false);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p2, jMo134584toComposableColorWaAFU9c2, c28655q7, 432, 0);
                    C28655q c28655q14 = c28655q7;
                    AbstractC18489d0.m53381v((float) 1.5d, f16, c2314t2, c28655q14, false);
                    c28655q2 = c28655q14;
                } else {
                    c28655q7.m87150e0(1698463475);
                    selectionStyle3 = state.getSelectionStyle();
                    if (selectionStyle3 == null) {
                        selectionStyle3 = EnumC31908c.DEFAULT;
                    }
                    fM134480getMinContentHeightD9Ej5fM = selectionStyle3.getMinContentHeight();
                    c39174f = new C39174f(fM134480getMinContentHeightD9Ej5fM);
                    if (Float.compare(fM134480getMinContentHeightD9Ej5fM, 0) <= 0) {
                        c39174f = null;
                    }
                    if (c39174f != null) {
                        f17 = c39174f.f168413w;
                    } else {
                        f17 = f16 * f13;
                    }
                    if (fixedHeightInSizeDp == null) {
                        c28655q7.m87150e0(1698659084);
                        c28655q7.m87173q(false);
                    } else {
                        c28655q7.m87150e0(1698659085);
                        f18 = fixedHeightInSizeDp.f168413w;
                        if (f18 <= f17) {
                            f17 = f18;
                        }
                        AbstractC30007c.m91851u(c2314t2, f17, c28655q7, false);
                    }
                    c28655q7.m87173q(false);
                    c28655q2 = c28655q7;
                }
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a7);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM21275i3 = AbstractC8693b.m21275i(state.getTitle(), c28655q2, r10);
            c38072d = C38072d.f163053a;
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q2, 6).getB1();
            if (state.getIsDisabled()) {
                c28655q2.m87150e0(463475596);
                jM73366B = c38072d.m121949b(c28655q2, 6).getWhite20();
            } else {
                jM73366B = AbstractC25012a.m73366B(c28655q2, 463476591, c38072d, c28655q2, 6);
            }
            c28655q2.m87173q(r10);
            C28655q c28655q15 = c28655q2;
            AbstractC30795n.m94707h(strM21275i3, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q15, 0, 0, 196602);
            c28655q3 = c28655q15;
            subtitle = state.getSubtitle();
            if (subtitle == null) {
                c28655q3.m87150e0(1482935581);
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(1482935582);
                AbstractC11266d.m30469w((float) 0.5d, f13, c2314t2, c28655q3);
                String strM21275i4 = AbstractC8693b.m21275i(subtitle, c28655q3, r10);
                C2886a c2886aM8422c2 = c38072d.m121952e(c28655q3, 6).getB3();
                if (state.getIsDisabled()) {
                    c28655q3.m87150e0(-409165554);
                    jM73370c = c38072d.m121949b(c28655q3, 6).getWhite20();
                } else {
                    jM73370c = AbstractC25012a.m73370c(c28655q3, -409164562, c38072d, c28655q3, 6);
                }
                c28655q3.m87173q(r10);
                AbstractC30795n.m94707h(strM21275i4, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q3, 0, 0, 196602);
                C28655q c28655q16 = c28655q3;
                c28655q16.m87173q(r10);
                c28655q4 = c28655q16;
            }
            c28655q4.m87173q(true);
            if (state.getShowCheckbox()) {
                c28655q4.m87150e0(1699586977);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3424u(((float) 1.5d) * f16, c2314t2));
                selectionStyle4 = state.getSelectionStyle();
                if (selectionStyle4 == null) {
                    selectionStyle4 = EnumC31908c.DEFAULT;
                }
                long jMo134584toComposableColorWaAFU9c4 = selectionStyle4.getBorderColor().mo134584toComposableColorWaAFU9c(c28655q4, r10);
                boolean zM99198h2 = m99198h(interfaceC28601c2);
                boolean z27 = !state.getIsDisabled();
                c28655q6 = c28655q4;
                C15127r1 c15127r1M34081r2 = AbstractC12240d.m34081r(jMo134584toComposableColorWaAFU9c4, c38072d.m121949b(c28655q4, 6).getWhite40(), c38072d.m121949b(c28655q4, 6).getBrandBlack(), 0L, c28655q6, 0, 24);
                interfaceC4339a8 = interfaceC4339a6;
                zM87153g3 = c28655q6.m87153g(interfaceC4339a8);
                objM87133R2 = c28655q6.m87133R();
                if (zM87153g3) {
                    obj7 = objM87133R2;
                    Object c29616a2 = new C29616a(interfaceC4339a8, 19);
                    c28655q6.m87172p0(c29616a2);
                    obj7 = c29616a2;
                } else {
                    obj7 = objM87133R2;
                    Object c29616a3 = new C29616a(interfaceC4339a8, 19);
                    c28655q6.m87172p0(c29616a3);
                    obj7 = c29616a3;
                }
                obj7 = objM87133R2;
                AbstractC33085h.m104813c(null, zM99198h2, (Function1) obj7, z27, null, c15127r1M34081r2, null, 0.0f, 0.0f, c28655q6, 0, 465);
                C28655q c28655q17 = c28655q6;
                c28655q17.m87173q(r10);
                c28655q5 = c28655q17;
            } else {
                c28655q4.m87150e0(1700188563);
                c28655q4.m87173q(r10);
                c28655q5 = c28655q4;
            }
            c28655q5.m87173q(true);
            z14 = z17;
            modifier3 = modifier5;
            interfaceC4339a2 = interfaceC4339a10;
            c28655q = c28655q5;
        } else {
            c28655q7.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            modifier3 = modifier2;
            z14 = selectionDisabled;
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier3, state, interfaceC4339a2, z14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m99197g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m99198h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    private static final void m99199i(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m99200j(InterfaceC4339a interfaceC4339a, boolean z4, InterfaceC28601c1 interfaceC28601c1) {
        interfaceC4339a.invoke();
        if (!z4) {
            m99199i(interfaceC28601c1, !m99198h(interfaceC28601c1));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99201k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m99202l(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99203m(Modifier modifier, C31909d c31909d, InterfaceC4339a interfaceC4339a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m99196f(modifier, c31909d, interfaceC4339a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
