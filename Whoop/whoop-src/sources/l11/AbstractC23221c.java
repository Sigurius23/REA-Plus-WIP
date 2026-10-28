package l11;

import ai1.C0910b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import jp1.C21852d;
import kx1.C22881b;
import l83.C23454a0;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import p005a3.C0238p0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p292l1.C23091f0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.InterfaceC35689r0;
import x81.C38072d;

/* JADX INFO: renamed from: l11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Ll11/e;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Ll11/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "color", "y", "(J)Landroidx/compose/ui/Modifier;", "a", "Ll11/e;", "A", "()Ll11/e;", "previewEndpointButtonViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23221c {

    /* JADX INFO: renamed from: a */
    private static final C23223e f91937a = new C23223e("button-1", "ADD", "ADDED", EnumC16313m0.ADD, EnumC16313m0.CHECKMARK, null, null, null, false, null, null, null, 4064, null);

    /* JADX INFO: renamed from: A */
    public static final C23223e m67166A() {
        return f91937a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:102:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x034d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:108:0x0383  */
    /* JADX WARN: Code duplicated, block: B:110:0x0387  */
    /* JADX WARN: Code duplicated, block: B:112:0x039f  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:123:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:136:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0406  */
    /* JADX WARN: Code duplicated, block: B:139:0x0420  */
    /* JADX WARN: Code duplicated, block: B:141:0x0424  */
    /* JADX WARN: Code duplicated, block: B:144:0x043d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0440  */
    /* JADX WARN: Code duplicated, block: B:148:0x0443  */
    /* JADX WARN: Code duplicated, block: B:151:0x0451  */
    /* JADX WARN: Code duplicated, block: B:154:0x0485  */
    /* JADX WARN: Code duplicated, block: B:157:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:159:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:90:0x024f  */
    /* JADX WARN: Code duplicated, block: B:92:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v1, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r40v2, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r47v5, types: [java.lang.Integer] */
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
    public static final void m67179m(final C23223e viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        C38072d c38072d;
        Function1 function4;
        final int i18;
        C15077m1 c15077m1M43196a;
        C27238a0 c27238a0;
        InterfaceC23222d state;
        Modifier modifier5;
        final Function1 function5;
        Object objM21277k;
        EnumC16313m0 errorIcon;
        Object objM87133R;
        boolean z13;
        EnumC16313m0 errorIcon2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        long accentAction;
        boolean zM87151f;
        Object objM87133R3;
        Object objM87133R4;
        long accentAction2;
        boolean zM87151f2;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        int i19;
        Object objM87133R8;
        int i24;
        int i25;
        Object objM87133R9;
        boolean z17;
        Object objM87133R10;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(932883996);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C22881b(19);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function2 = (Function1) objM87133R10;
                    }
                    C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                    c38072d = C38072d.f163053a;
                    function4 = function2;
                    i18 = 1;
                    c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), c38072d.m121949b(c28655q, 6).getBlack30(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
                    c28655q = c28655q;
                    float f13 = 8;
                    float f14 = 1 * f13;
                    float f15 = ((float) 1.5d) * f13;
                    c27238a0 = new C27238a0(AbstractC8693b.m21278l(""), c15077m1M43196a, null, null, 2 * 4, new C22976l1(f14, f15, f14, f15), viewState.getTextStyle(), null, false, true, 140, null);
                    state = viewState.getState();
                    if (state instanceof InterfaceC23222d.a) {
                        c28655q.m87150e0(-1146615139);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getButtonText());
                        EnumC16313m0 leadingIcon = viewState.getLeadingIcon();
                        C27238a0 c27238a0M82077b = C27238a0.m82077b(c27238a0, textResourceM21278l, null, null, null, 0.0f, null, null, leadingIcon != null ? Integer.valueOf(leadingIcon.toWhoopIcon()) : null, true, false, 638, null);
                        if ((i15 & 896) == 256) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(viewState))) {
                            i18 = 0;
                        }
                        i25 = i24 | i18;
                        objM87133R9 = c28655q.m87133R();
                        if (i25 == 0 || objM87133R9 == c28676v0) {
                            function5 = function4;
                            z17 = false;
                            final boolean z18 = false ? 1 : 0;
                            objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (z18) {
                                        case 0:
                                            return AbstractC23221c.m67181o(function5, viewState);
                                        default:
                                            return AbstractC23221c.m67190x(function5, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            function5 = function4;
                            z17 = false;
                        }
                        Modifier modifier6 = modifier4;
                        AbstractC27292z.m82341h(c27238a0M82077b, modifier6, null, (InterfaceC4339a) objM87133R9, c28655q, i15 & 112, 4);
                        modifier5 = modifier6;
                        c28655q.m87173q(z17);
                    } else {
                        modifier5 = modifier4;
                        function5 = function4;
                        if (state instanceof InterfaceC23222d.e) {
                            c28655q.m87150e0(-1146602106);
                            C27238a0 c27238a0M82077b2 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getButtonText()), null, null, null, 0.0f, null, null, null, false, false, 638, null);
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C23091f0(13);
                                c28655q.m87172p0(objM87133R8);
                            }
                            AbstractC27292z.m82341h(c27238a0M82077b2, modifier5, null, (InterfaceC4339a) objM87133R8, c28655q, (i15 & 112) | 3072, 4);
                            modifier5 = modifier5;
                            c28655q.m87173q(false);
                        } else if (state instanceof InterfaceC23222d.d) {
                            c28655q.m87150e0(-1184583467);
                            TextResource text = c27238a0.getText();
                            int iM113129b = InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b);
                            boolean enabled = c27238a0.getEnabled();
                            InterfaceC22973k1 paddingValues = c27238a0.getPaddingValues();
                            float borderRadius = c27238a0.getBorderRadius();
                            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(iM113129b);
                            objM87133R7 = c28655q.m87133R();
                            i19 = 14;
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C23091f0(i19);
                                c28655q.m87172p0(objM87133R7);
                            }
                            AbstractC27292z.m82343j(modifier5, enabled, false, null, null, dVarM113128a, text, c15077m1M43196a, null, null, borderRadius, paddingValues, null, (InterfaceC4339a) objM87133R7, c28655q, (i15 >> 3) & 14, 3072, 4892);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function5;
                        } else if (state instanceof InterfaceC23222d.g) {
                            c28655q.m87150e0(-1184102285);
                            accentAction2 = c38072d.m121949b(c28655q, 6).getAccentAction();
                            C27238a0 c27238a0M82077b3 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                            Modifier modifierM3488c = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                            zM87151f2 = c28655q.m87151f(accentAction2);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87151f2 || objM87133R5 == c28676v0) {
                                objM87133R5 = new C0910b(accentAction2, 21);
                                c28655q.m87172p0(objM87133R5);
                            }
                            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R5);
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C23091f0(15);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC27292z.m82341h(c27238a0M82077b3, modifier5, modifierM3480c, (InterfaceC4339a) objM87133R6, c28655q, (i15 & 112) | 3072, 0);
                            modifier5 = modifier5;
                            c28655q.m87173q(false);
                        } else if (state instanceof InterfaceC23222d.b) {
                            c28655q.m87150e0(-1183372111);
                            accentAction = c38072d.m121949b(c28655q, 6).getAccentAction();
                            C27238a0 c27238a0M82077b4 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                            Modifier modifierM3488c2 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                            zM87151f = c28655q.m87151f(accentAction);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87151f || objM87133R3 == c28676v0) {
                                objM87133R3 = new C0910b(accentAction, 22);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Modifier modifierM3480c2 = AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R3);
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C23091f0(16);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC27292z.m82341h(c27238a0M82077b4, modifier5, modifierM3480c2, (InterfaceC4339a) objM87133R4, c28655q, (i15 & 112) | 3072, 0);
                            modifier5 = modifier5;
                            c28655q.m87173q(false);
                        } else if (state instanceof InterfaceC23222d.f) {
                            c28655q.m87150e0(-1182634714);
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getErrorText());
                            if (viewState.getErrorText().length() > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM21277k = z13 ? textResourceM21278l2 : null;
                            if (objM21277k == null) {
                                objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62339j0);
                            }
                            ?? r42 = objM21277k;
                            errorIcon2 = viewState.getErrorIcon();
                            if (errorIcon2 == null) {
                                errorIcon2 = EnumC16313m0.UNDO;
                            }
                            C27238a0 c27238a0M82077b5 = C27238a0.m82077b(c27238a0, r42, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon2.toWhoopIcon()), true, false, 638, null);
                            Modifier modifierM67191y = m67191y(c38072d.m121949b(c28655q, 6).getBrandBlack());
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R2 = c28655q.m87133R();
                            if (z16 || objM87133R2 == c28676v0) {
                                objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                return AbstractC23221c.m67181o(function5, viewState);
                                            default:
                                                return AbstractC23221c.m67190x(function5, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27292z.m82341h(c27238a0M82077b5, modifier5, modifierM67191y, (InterfaceC4339a) objM87133R2, c28655q, i15 & 112, 0);
                            modifier5 = modifier5;
                            c28655q.m87173q(false);
                        } else {
                            if (state instanceof InterfaceC23222d.c) {
                                throw AbstractC11895b.m32003v(-1146614022, c28655q, false);
                            }
                            c28655q.m87150e0(-1182009878);
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getErrorText());
                            if (viewState.getErrorText().length() <= 0) {
                                i18 = 0;
                            }
                            objM21277k = i18 != 0 ? textResourceM21278l3 : null;
                            if (objM21277k == null) {
                                objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62335i0);
                            }
                            ?? r44 = objM21277k;
                            errorIcon = viewState.getErrorIcon();
                            if (errorIcon == null) {
                                errorIcon = EnumC16313m0.TINY_ATTENTION;
                            }
                            C27238a0 c27238a0M82077b6 = C27238a0.m82077b(c27238a0, r44, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon.toWhoopIcon()), false, false, 638, null);
                            Modifier modifierM67191y2 = m67191y(c38072d.m121949b(c28655q, 6).getAccentNegativeTrend());
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23091f0(12);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC27292z.m82341h(c27238a0M82077b6, modifier5, modifierM67191y2, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 3072, 0);
                            modifier5 = modifier5;
                            c28655q.m87173q(false);
                        }
                    }
                    modifier3 = modifier5;
                    function3 = function5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21852d(viewState, modifier3, function3, i13, i14, 28);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C22881b(19);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function2 = (Function1) objM87133R10;
                }
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                c38072d = C38072d.f163053a;
                function4 = function2;
                i18 = 1;
                c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), c38072d.m121949b(c28655q, 6).getBlack30(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
                c28655q = c28655q;
                float f16 = 8;
                float f17 = 1 * f16;
                float f18 = ((float) 1.5d) * f16;
                c27238a0 = new C27238a0(AbstractC8693b.m21278l(""), c15077m1M43196a, null, null, 2 * 4, new C22976l1(f17, f18, f17, f18), viewState.getTextStyle(), null, false, true, 140, null);
                state = viewState.getState();
                if (state instanceof InterfaceC23222d.a) {
                    c28655q.m87150e0(-1146615139);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getButtonText());
                    EnumC16313m0 leadingIcon2 = viewState.getLeadingIcon();
                    C27238a0 c27238a0M82077b7 = C27238a0.m82077b(c27238a0, textResourceM21278l4, null, null, null, 0.0f, null, null, leadingIcon2 != null ? Integer.valueOf(leadingIcon2.toWhoopIcon()) : null, true, false, 638, null);
                    if ((i15 & 896) == 256) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    if ((i15 & 14) != 4) {
                        i18 = 0;
                    }
                    i25 = i24 | i18;
                    objM87133R9 = c28655q.m87133R();
                    if (i25 == 0) {
                        function5 = function4;
                        z17 = false;
                        final int z19 = false ? 1 : 0;
                        objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (z19) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        function5 = function4;
                        z17 = false;
                        final int z110 = false ? 1 : 0;
                        objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (z110) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifier7 = modifier4;
                    AbstractC27292z.m82341h(c27238a0M82077b7, modifier7, null, (InterfaceC4339a) objM87133R9, c28655q, i15 & 112, 4);
                    modifier5 = modifier7;
                    c28655q.m87173q(z17);
                } else {
                    modifier5 = modifier4;
                    function5 = function4;
                    if (state instanceof InterfaceC23222d.e) {
                        c28655q.m87150e0(-1146602106);
                        C27238a0 c27238a0M82077b8 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getButtonText()), null, null, null, 0.0f, null, null, null, false, false, 638, null);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C23091f0(13);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b8, modifier5, null, (InterfaceC4339a) objM87133R8, c28655q, (i15 & 112) | 3072, 4);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.d) {
                        c28655q.m87150e0(-1184583467);
                        TextResource text2 = c27238a0.getText();
                        int iM113129b2 = InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b);
                        boolean enabled2 = c27238a0.getEnabled();
                        InterfaceC22973k1 paddingValues2 = c27238a0.getPaddingValues();
                        float borderRadius2 = c27238a0.getBorderRadius();
                        InterfaceC35689r0.d dVarM113128a2 = InterfaceC35689r0.d.m113128a(iM113129b2);
                        objM87133R7 = c28655q.m87133R();
                        i19 = 14;
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C23091f0(i19);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC27292z.m82343j(modifier5, enabled2, false, null, null, dVarM113128a2, text2, c15077m1M43196a, null, null, borderRadius2, paddingValues2, null, (InterfaceC4339a) objM87133R7, c28655q, (i15 >> 3) & 14, 3072, 4892);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function5;
                    } else if (state instanceof InterfaceC23222d.g) {
                        c28655q.m87150e0(-1184102285);
                        accentAction2 = c38072d.m121949b(c28655q, 6).getAccentAction();
                        C27238a0 c27238a0M82077b9 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                        Modifier modifierM3488c3 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                        zM87151f2 = c28655q.m87151f(accentAction2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87151f2) {
                            objM87133R5 = new C0910b(accentAction2, 21);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C0910b(accentAction2, 21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Modifier modifierM3480c3 = AbstractC1125a.m3480c(modifierM3488c3, (Function1) objM87133R5);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C23091f0(15);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b9, modifier5, modifierM3480c3, (InterfaceC4339a) objM87133R6, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.b) {
                        c28655q.m87150e0(-1183372111);
                        accentAction = c38072d.m121949b(c28655q, 6).getAccentAction();
                        C27238a0 c27238a0M82077b10 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                        Modifier modifierM3488c4 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                        zM87151f = c28655q.m87151f(accentAction);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87151f) {
                            objM87133R3 = new C0910b(accentAction, 22);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0910b(accentAction, 22);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3480c4 = AbstractC1125a.m3480c(modifierM3488c4, (Function1) objM87133R3);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C23091f0(16);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b10, modifier5, modifierM3480c4, (InterfaceC4339a) objM87133R4, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.f) {
                        c28655q.m87150e0(-1182634714);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(viewState.getErrorText());
                        if (viewState.getErrorText().length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                        }
                        if (objM21277k == null) {
                            objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62339j0);
                        }
                        ?? r45 = objM21277k;
                        errorIcon2 = viewState.getErrorIcon();
                        if (errorIcon2 == null) {
                            errorIcon2 = EnumC16313m0.UNDO;
                        }
                        C27238a0 c27238a0M82077b11 = C27238a0.m82077b(c27238a0, r45, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon2.toWhoopIcon()), true, false, 638, null);
                        Modifier modifierM67191y3 = m67191y(c38072d.m121949b(c28655q, 6).getBrandBlack());
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 14) != 4) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z16 = z14 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            return AbstractC23221c.m67181o(function5, viewState);
                                        default:
                                            return AbstractC23221c.m67190x(function5, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            return AbstractC23221c.m67181o(function5, viewState);
                                        default:
                                            return AbstractC23221c.m67190x(function5, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b11, modifier5, modifierM67191y3, (InterfaceC4339a) objM87133R2, c28655q, i15 & 112, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else {
                        if (state instanceof InterfaceC23222d.c) {
                            throw AbstractC11895b.m32003v(-1146614022, c28655q, false);
                        }
                        c28655q.m87150e0(-1182009878);
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(viewState.getErrorText());
                        if (viewState.getErrorText().length() <= 0) {
                            i18 = 0;
                        }
                        if (i18 != 0) {
                        }
                        if (objM21277k == null) {
                            objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62335i0);
                        }
                        ?? r46 = objM21277k;
                        errorIcon = viewState.getErrorIcon();
                        if (errorIcon == null) {
                            errorIcon = EnumC16313m0.TINY_ATTENTION;
                        }
                        C27238a0 c27238a0M82077b12 = C27238a0.m82077b(c27238a0, r46, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon.toWhoopIcon()), false, false, 638, null);
                        Modifier modifierM67191y4 = m67191y(c38072d.m121949b(c28655q, 6).getAccentNegativeTrend());
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23091f0(12);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b12, modifier5, modifierM67191y4, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    }
                }
                modifier3 = modifier5;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(viewState, modifier3, function3, i13, i14, 28);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C22881b(19);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function2 = (Function1) objM87133R10;
                }
                C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                c38072d = C38072d.f163053a;
                function4 = function2;
                i18 = 1;
                c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), c38072d.m121949b(c28655q, 6).getBlack30(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
                c28655q = c28655q;
                float f19 = 8;
                float f110 = 1 * f19;
                float f111 = ((float) 1.5d) * f19;
                c27238a0 = new C27238a0(AbstractC8693b.m21278l(""), c15077m1M43196a, null, null, 2 * 4, new C22976l1(f110, f111, f110, f111), viewState.getTextStyle(), null, false, true, 140, null);
                state = viewState.getState();
                if (state instanceof InterfaceC23222d.a) {
                    c28655q.m87150e0(-1146615139);
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l(viewState.getButtonText());
                    EnumC16313m0 leadingIcon3 = viewState.getLeadingIcon();
                    C27238a0 c27238a0M82077b13 = C27238a0.m82077b(c27238a0, textResourceM21278l7, null, null, null, 0.0f, null, null, leadingIcon3 != null ? Integer.valueOf(leadingIcon3.toWhoopIcon()) : null, true, false, 638, null);
                    if ((i15 & 896) == 256) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    if ((i15 & 14) != 4) {
                        i18 = 0;
                    }
                    i25 = i24 | i18;
                    objM87133R9 = c28655q.m87133R();
                    if (i25 == 0) {
                        function5 = function4;
                        z17 = false;
                        final int z111 = false ? 1 : 0;
                        objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (z111) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        function5 = function4;
                        z17 = false;
                        final int z112 = false ? 1 : 0;
                        objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (z112) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    Modifier modifier8 = modifier4;
                    AbstractC27292z.m82341h(c27238a0M82077b13, modifier8, null, (InterfaceC4339a) objM87133R9, c28655q, i15 & 112, 4);
                    modifier5 = modifier8;
                    c28655q.m87173q(z17);
                } else {
                    modifier5 = modifier4;
                    function5 = function4;
                    if (state instanceof InterfaceC23222d.e) {
                        c28655q.m87150e0(-1146602106);
                        C27238a0 c27238a0M82077b14 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getButtonText()), null, null, null, 0.0f, null, null, null, false, false, 638, null);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C23091f0(13);
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b14, modifier5, null, (InterfaceC4339a) objM87133R8, c28655q, (i15 & 112) | 3072, 4);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.d) {
                        c28655q.m87150e0(-1184583467);
                        TextResource text3 = c27238a0.getText();
                        int iM113129b3 = InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b);
                        boolean enabled3 = c27238a0.getEnabled();
                        InterfaceC22973k1 paddingValues3 = c27238a0.getPaddingValues();
                        float borderRadius3 = c27238a0.getBorderRadius();
                        InterfaceC35689r0.d dVarM113128a3 = InterfaceC35689r0.d.m113128a(iM113129b3);
                        objM87133R7 = c28655q.m87133R();
                        i19 = 14;
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C23091f0(i19);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC27292z.m82343j(modifier5, enabled3, false, null, null, dVarM113128a3, text3, c15077m1M43196a, null, null, borderRadius3, paddingValues3, null, (InterfaceC4339a) objM87133R7, c28655q, (i15 >> 3) & 14, 3072, 4892);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function5;
                    } else if (state instanceof InterfaceC23222d.g) {
                        c28655q.m87150e0(-1184102285);
                        accentAction2 = c38072d.m121949b(c28655q, 6).getAccentAction();
                        C27238a0 c27238a0M82077b15 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                        Modifier modifierM3488c5 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                        zM87151f2 = c28655q.m87151f(accentAction2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87151f2) {
                            objM87133R5 = new C0910b(accentAction2, 21);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C0910b(accentAction2, 21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Modifier modifierM3480c5 = AbstractC1125a.m3480c(modifierM3488c5, (Function1) objM87133R5);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C23091f0(15);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b15, modifier5, modifierM3480c5, (InterfaceC4339a) objM87133R6, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.b) {
                        c28655q.m87150e0(-1183372111);
                        accentAction = c38072d.m121949b(c28655q, 6).getAccentAction();
                        C27238a0 c27238a0M82077b16 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                        Modifier modifierM3488c6 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                        zM87151f = c28655q.m87151f(accentAction);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87151f) {
                            objM87133R3 = new C0910b(accentAction, 22);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C0910b(accentAction, 22);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3480c6 = AbstractC1125a.m3480c(modifierM3488c6, (Function1) objM87133R3);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C23091f0(16);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b16, modifier5, modifierM3480c6, (InterfaceC4339a) objM87133R4, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else if (state instanceof InterfaceC23222d.f) {
                        c28655q.m87150e0(-1182634714);
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(viewState.getErrorText());
                        if (viewState.getErrorText().length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                        }
                        if (objM21277k == null) {
                            objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62339j0);
                        }
                        ?? r47 = objM21277k;
                        errorIcon2 = viewState.getErrorIcon();
                        if (errorIcon2 == null) {
                            errorIcon2 = EnumC16313m0.UNDO;
                        }
                        C27238a0 c27238a0M82077b17 = C27238a0.m82077b(c27238a0, r47, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon2.toWhoopIcon()), true, false, 638, null);
                        Modifier modifierM67191y5 = m67191y(c38072d.m121949b(c28655q, 6).getBrandBlack());
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 14) != 4) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        z16 = z14 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            return AbstractC23221c.m67181o(function5, viewState);
                                        default:
                                            return AbstractC23221c.m67190x(function5, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            return AbstractC23221c.m67181o(function5, viewState);
                                        default:
                                            return AbstractC23221c.m67190x(function5, viewState);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b17, modifier5, modifierM67191y5, (InterfaceC4339a) objM87133R2, c28655q, i15 & 112, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    } else {
                        if (state instanceof InterfaceC23222d.c) {
                            throw AbstractC11895b.m32003v(-1146614022, c28655q, false);
                        }
                        c28655q.m87150e0(-1182009878);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(viewState.getErrorText());
                        if (viewState.getErrorText().length() <= 0) {
                            i18 = 0;
                        }
                        if (i18 != 0) {
                        }
                        if (objM21277k == null) {
                            objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62335i0);
                        }
                        ?? r48 = objM21277k;
                        errorIcon = viewState.getErrorIcon();
                        if (errorIcon == null) {
                            errorIcon = EnumC16313m0.TINY_ATTENTION;
                        }
                        C27238a0 c27238a0M82077b18 = C27238a0.m82077b(c27238a0, r48, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon.toWhoopIcon()), false, false, 638, null);
                        Modifier modifierM67191y6 = m67191y(c38072d.m121949b(c28655q, 6).getAccentNegativeTrend());
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23091f0(12);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b18, modifier5, modifierM67191y6, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 3072, 0);
                        modifier5 = modifier5;
                        c28655q.m87173q(false);
                    }
                }
                modifier3 = modifier5;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(viewState, modifier3, function3, i13, i14, 28);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C22881b(19);
                    c28655q.m87172p0(objM87133R10);
                }
                function2 = (Function1) objM87133R10;
            }
            C22976l1 c22976l4 = AbstractC15166v0.f56891a;
            c38072d = C38072d.f163053a;
            function4 = function2;
            i18 = 1;
            c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), c38072d.m121949b(c28655q, 6).getBlack30(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
            c28655q = c28655q;
            float f112 = 8;
            float f113 = 1 * f112;
            float f114 = ((float) 1.5d) * f112;
            c27238a0 = new C27238a0(AbstractC8693b.m21278l(""), c15077m1M43196a, null, null, 2 * 4, new C22976l1(f113, f114, f113, f114), viewState.getTextStyle(), null, false, true, 140, null);
            state = viewState.getState();
            if (state instanceof InterfaceC23222d.a) {
                c28655q.m87150e0(-1146615139);
                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(viewState.getButtonText());
                EnumC16313m0 leadingIcon4 = viewState.getLeadingIcon();
                C27238a0 c27238a0M82077b19 = C27238a0.m82077b(c27238a0, textResourceM21278l10, null, null, null, 0.0f, null, null, leadingIcon4 != null ? Integer.valueOf(leadingIcon4.toWhoopIcon()) : null, true, false, 638, null);
                if ((i15 & 896) == 256) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                if ((i15 & 14) != 4) {
                    i18 = 0;
                }
                i25 = i24 | i18;
                objM87133R9 = c28655q.m87133R();
                if (i25 == 0) {
                    function5 = function4;
                    z17 = false;
                    final int z113 = false ? 1 : 0;
                    objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (z113) {
                                case 0:
                                    return AbstractC23221c.m67181o(function5, viewState);
                                default:
                                    return AbstractC23221c.m67190x(function5, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    function5 = function4;
                    z17 = false;
                    final int z114 = false ? 1 : 0;
                    objM87133R9 = new InterfaceC4339a() { // from class: l11.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (z114) {
                                case 0:
                                    return AbstractC23221c.m67181o(function5, viewState);
                                default:
                                    return AbstractC23221c.m67190x(function5, viewState);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                Modifier modifier9 = modifier4;
                AbstractC27292z.m82341h(c27238a0M82077b19, modifier9, null, (InterfaceC4339a) objM87133R9, c28655q, i15 & 112, 4);
                modifier5 = modifier9;
                c28655q.m87173q(z17);
            } else {
                modifier5 = modifier4;
                function5 = function4;
                if (state instanceof InterfaceC23222d.e) {
                    c28655q.m87150e0(-1146602106);
                    C27238a0 c27238a0M82077b110 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getButtonText()), null, null, null, 0.0f, null, null, null, false, false, 638, null);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C23091f0(13);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b110, modifier5, null, (InterfaceC4339a) objM87133R8, c28655q, (i15 & 112) | 3072, 4);
                    modifier5 = modifier5;
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC23222d.d) {
                    c28655q.m87150e0(-1184583467);
                    TextResource text4 = c27238a0.getText();
                    int iM113129b4 = InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b);
                    boolean enabled4 = c27238a0.getEnabled();
                    InterfaceC22973k1 paddingValues4 = c27238a0.getPaddingValues();
                    float borderRadius4 = c27238a0.getBorderRadius();
                    InterfaceC35689r0.d dVarM113128a4 = InterfaceC35689r0.d.m113128a(iM113129b4);
                    objM87133R7 = c28655q.m87133R();
                    i19 = 14;
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C23091f0(i19);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC27292z.m82343j(modifier5, enabled4, false, null, null, dVarM113128a4, text4, c15077m1M43196a, null, null, borderRadius4, paddingValues4, null, (InterfaceC4339a) objM87133R7, c28655q, (i15 >> 3) & 14, 3072, 4892);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function5;
                } else if (state instanceof InterfaceC23222d.g) {
                    c28655q.m87150e0(-1184102285);
                    accentAction2 = c38072d.m121949b(c28655q, 6).getAccentAction();
                    C27238a0 c27238a0M82077b111 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                    Modifier modifierM3488c7 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                    zM87151f2 = c28655q.m87151f(accentAction2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87151f2) {
                        objM87133R5 = new C0910b(accentAction2, 21);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C0910b(accentAction2, 21);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3480c7 = AbstractC1125a.m3480c(modifierM3488c7, (Function1) objM87133R5);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C23091f0(15);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b111, modifier5, modifierM3480c7, (InterfaceC4339a) objM87133R6, c28655q, (i15 & 112) | 3072, 0);
                    modifier5 = modifier5;
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC23222d.b) {
                    c28655q.m87150e0(-1183372111);
                    accentAction = c38072d.m121949b(c28655q, 6).getAccentAction();
                    C27238a0 c27238a0M82077b112 = C27238a0.m82077b(c27238a0, AbstractC8693b.m21278l(viewState.getSuccessText()), null, null, null, 0.0f, null, null, Integer.valueOf(viewState.getSuccessIcon().toWhoopIcon()), false, false, 894, null);
                    Modifier modifierM3488c8 = AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                    zM87151f = c28655q.m87151f(accentAction);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R3 = new C0910b(accentAction, 22);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C0910b(accentAction, 22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3480c8 = AbstractC1125a.m3480c(modifierM3488c8, (Function1) objM87133R3);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C23091f0(16);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b112, modifier5, modifierM3480c8, (InterfaceC4339a) objM87133R4, c28655q, (i15 & 112) | 3072, 0);
                    modifier5 = modifier5;
                    c28655q.m87173q(false);
                } else if (state instanceof InterfaceC23222d.f) {
                    c28655q.m87150e0(-1182634714);
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l(viewState.getErrorText());
                    if (viewState.getErrorText().length() > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                    }
                    if (objM21277k == null) {
                        objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62339j0);
                    }
                    ?? r49 = objM21277k;
                    errorIcon2 = viewState.getErrorIcon();
                    if (errorIcon2 == null) {
                        errorIcon2 = EnumC16313m0.UNDO;
                    }
                    C27238a0 c27238a0M82077b113 = C27238a0.m82077b(c27238a0, r49, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon2.toWhoopIcon()), true, false, 638, null);
                    Modifier modifierM67191y7 = m67191y(c38072d.m121949b(c28655q, 6).getBrandBlack());
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z14 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new InterfaceC4339a() { // from class: l11.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC23221c.m67181o(function5, viewState);
                                    default:
                                        return AbstractC23221c.m67190x(function5, viewState);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b113, modifier5, modifierM67191y7, (InterfaceC4339a) objM87133R2, c28655q, i15 & 112, 0);
                    modifier5 = modifier5;
                    c28655q.m87173q(false);
                } else {
                    if (state instanceof InterfaceC23222d.c) {
                        throw AbstractC11895b.m32003v(-1146614022, c28655q, false);
                    }
                    c28655q.m87150e0(-1182009878);
                    TextResource textResourceM21278l12 = AbstractC8693b.m21278l(viewState.getErrorText());
                    if (viewState.getErrorText().length() <= 0) {
                        i18 = 0;
                    }
                    if (i18 != 0) {
                    }
                    if (objM21277k == null) {
                        objM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62335i0);
                    }
                    ?? r410 = objM21277k;
                    errorIcon = viewState.getErrorIcon();
                    if (errorIcon == null) {
                        errorIcon = EnumC16313m0.TINY_ATTENTION;
                    }
                    C27238a0 c27238a0M82077b114 = C27238a0.m82077b(c27238a0, r410, null, null, null, 0.0f, null, null, Integer.valueOf(errorIcon.toWhoopIcon()), false, false, 638, null);
                    Modifier modifierM67191y8 = m67191y(c38072d.m121949b(c28655q, 6).getAccentNegativeTrend());
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23091f0(12);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b114, modifier5, modifierM67191y8, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 3072, 0);
                    modifier5 = modifier5;
                    c28655q.m87173q(false);
                }
            }
            modifier3 = modifier5;
            function3 = function5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(viewState, modifier3, function3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m67180n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m67181o(Function1 function1, C23223e c23223e) {
        function1.invoke(c23223e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m67182p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m67183q(C23223e c23223e, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m67179m(c23223e, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m67184r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m67185s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m67186t(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63383i0(drawWithContent, j7, 0L, 0L, 0.0f, null, 5, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m67187u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m67188v(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63383i0(drawWithContent, j7, 0L, 0L, 0.0f, null, 5, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m67189w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m67190x(Function1 function1, C23223e c23223e) {
        function1.invoke(c23223e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final Modifier m67191y(long j7) {
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C0910b(j7, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m67192z(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63383i0(drawWithContent, j7, 0L, 0L, 0.0f, null, 5, 62);
        return C23454a0.f92919a;
    }
}
