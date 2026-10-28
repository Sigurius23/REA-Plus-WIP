package jp2;

import am2.C1019g0;
import am2.C1040r;
import am2.C1042s;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j11.C21214q;
import java.util.List;
import java.util.Locale;
import jp1.C21852d;
import jp1.C21864p;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p042c2.C3856a;
import p042c2.C3867l;
import p042c2.C3868m;
import p042c2.InterfaceC3863h;
import p133f1.C13921a0;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: jp2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aq\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ljp2/o;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "v", "(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "textValue", "Lq3/n;", "keyboardType", "Lq3/k;", "imeAction", "displayLabel", "Lg2/i;", "focusManager", "onTextValueChange", "o", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isNodePositioned", "isFocused", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21883n {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m62053A(InterfaceC3863h interfaceC3863h, C3867l c3867l, Function1 function1, C21884o c21884o, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC15250v focusState) {
        AbstractC22676k.m65750j(focusState, "focusState");
        boolean zM62062J = m62062J(interfaceC28601c1);
        EnumC15251w enumC15251w = (EnumC15251w) focusState;
        m62086x(interfaceC28601c1, enumC15251w.m43354b());
        if (enumC15251w.m43354b() && m62060H(interfaceC28601c2)) {
            if (interfaceC3863h != null) {
                ((C3856a) interfaceC3863h).m11843a(c3867l);
            }
        } else if (!enumC15251w.m43354b()) {
            if (interfaceC3863h != null) {
                C3856a c3856a = (C3856a) interfaceC3863h;
                c3856a.f15780c.notifyViewExited(c3856a.f15778a, c3867l.m11853b());
            }
            if (zM62062J) {
                function1.invoke(new AbstractC21878i.b(c21884o.getFieldId(), m62058F(interfaceC28601c3), c21884o.getPattern(), str, c21884o.getMinLength()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m62054B(Function1 function1, C21884o c21884o, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC15250v focusState) {
        AbstractC22676k.m65750j(focusState, "focusState");
        boolean zM62062J = m62062J(interfaceC28601c1);
        EnumC15251w enumC15251w = (EnumC15251w) focusState;
        m62086x(interfaceC28601c1, enumC15251w.m43354b());
        if (zM62062J && !enumC15251w.m43354b()) {
            function1.invoke(new AbstractC21878i.b(c21884o.getFieldId(), m62058F(interfaceC28601c2), c21884o.getPattern(), str, c21884o.getMinLength()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m62055C(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m62059G(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m62056D(Function1 function1, C21884o c21884o) {
        function1.invoke(new AbstractC21878i.a(c21884o.getSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m62057E(Modifier modifier, C21884o c21884o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62084v(modifier, c21884o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final String m62058F(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m62059G(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: H */
    private static final boolean m62060H(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    private static final void m62061I(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: J */
    private static final boolean m62062J(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0303  */
    /* JADX WARN: Code duplicated, block: B:144:0x0312  */
    /* JADX WARN: Code duplicated, block: B:150:0x031f  */
    /* JADX WARN: Code duplicated, block: B:153:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x032d  */
    /* JADX WARN: Code duplicated, block: B:157:0x034d  */
    /* JADX WARN: Code duplicated, block: B:158:0x035b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0371  */
    /* JADX WARN: Code duplicated, block: B:163:0x037d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0380  */
    /* JADX WARN: Code duplicated, block: B:167:0x039a  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:177:0x042c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0439  */
    /* JADX WARN: Code duplicated, block: B:186:0x0447  */
    /* JADX WARN: Code duplicated, block: B:189:0x044f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0451  */
    /* JADX WARN: Code duplicated, block: B:193:0x045b  */
    /* JADX WARN: Code duplicated, block: B:194:0x045d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0467  */
    /* JADX WARN: Code duplicated, block: B:198:0x0469  */
    /* JADX WARN: Code duplicated, block: B:201:0x0472 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0474  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private static final void m62077o(Modifier modifier, final String str, final C21884o c21884o, final int i13, final int i14, final String str2, InterfaceC15237i interfaceC15237i, final Function1 function1, final Function1 function2, Composer composer, final int i15, final int i16) {
        int i17;
        String str3;
        C28655q c28655q;
        final Modifier modifier2;
        long jM125385c1;
        boolean z4;
        Modifier modifierM44455h;
        C37816b c37816b;
        final C21884o c21884o2;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C28676v0 c28676v0;
        final int i18;
        int i19;
        int i24;
        Object objM87133R2;
        TextResource textResourceM62094g;
        int i25;
        TextResource textResourceM21278l;
        int i26;
        boolean z14;
        long jM73366B;
        long jM125416r;
        boolean z15;
        Object objM87133R3;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R4;
        int i27;
        final InterfaceC15237i interfaceC15237i2 = interfaceC15237i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(237639411);
        int i28 = i16 & 1;
        if (i28 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (c28655q2.m87153g(modifier) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            str3 = str;
            i17 |= c28655q2.m87153g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i15 & 384) == 0) {
            i17 |= (i15 & 512) == 0 ? c28655q2.m87153g(c21884o) : c28655q2.m87157i(c21884o) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q2.m87149e(i14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= c28655q2.m87153g(str2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i15) == 0) {
            i17 |= c28655q2.m87157i(interfaceC15237i2) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= c28655q2.m87157i(function1) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= c28655q2.m87157i(function2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q2.m87135U(i17 & 1, (i17 & 38347923) != 38347922)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i28 != 0 ? c2314t : modifier;
            boolean z25 = (AbstractC39414r.m125890i0(str3) || c21884o.getErrorMessage() != null || c21884o.getIsReadOnly()) ? false : true;
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
            if (c21884o.getIsReadOnly()) {
                c28655q2.m87150e0(738225402);
                jM125385c1 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(738226394);
                jM125385c1 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite70();
                c28655q2.m87173q(false);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier3);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier4 = modifier3;
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            TextResource textResourceM62093f = c21884o.getDisplayLabel();
            int i29 = TextResource.$stable;
            String upperCase = AbstractC8693b.m21274h(textResourceM62093f, c28655q2, i29).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f14 = 2 * f13;
            float f15 = 1;
            float f16 = f15 * f13;
            Modifier modifierM3393o = AbstractC1099a.m3393o(new C22976l1(f16, f14, f16, f14), modifierM3409f);
            C38072d c38072d = C38072d.f163053a;
            int i34 = C38072d.f163054b;
            C2886a c2886aM8432m = c38072d.m121952e(c28655q2, i34).getFormLabel();
            int i35 = C2886a.f11498d;
            int i36 = i17;
            AbstractC30795n.m94707h(upperCase, modifierM3393o, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m, null, c28655q2, 0, i35 << 18, 196600);
            if (z25) {
                c28655q2.m87150e0(1764148892);
                modifierM44455h = AbstractC15751g.m44455h(c2314t, f15, c38072d.m121949b(c28655q2, i34).getWhite30(), c33252iM105489e);
                z4 = false;
                c28655q2.m87173q(false);
            } else {
                z4 = false;
                c28655q2.m87150e0(1764337713);
                c28655q2.m87173q(false);
                modifierM44455h = c2314t;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z4);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM44455h);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(str);
            C2886a c2886aM8432m2 = c38072d.m121952e(c28655q2, i34).getFormLabel();
            TextResource textResourceM62100m = c21884o.getPlaceholder();
            if (textResourceM62100m == null) {
                c28655q2.m87150e0(-1369133782);
                c28655q2.m87173q(false);
                c37816b = null;
            } else {
                c28655q2.m87150e0(-1369133781);
                C37816b c37816bM121344e = AbstractC37817c.m121344e(1569069585, c28655q2, new C21882m(textResourceM62100m, 0));
                c28655q2.m87173q(false);
                c37816b = c37816bM121344e;
            }
            boolean zM62103p = c21884o.getIsReadOnly();
            int i37 = i36 & 896;
            if (i37 != 256) {
                if ((i36 & 512) != 0) {
                    c21884o2 = c21884o;
                    if (c28655q2.m87157i(c21884o2)) {
                    }
                    interfaceC15237i2 = interfaceC15237i;
                    zM87157i = c28655q2.m87157i(interfaceC15237i2) | z13;
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (!zM87157i || objM87133R == c28676v0) {
                        i18 = 1;
                        objM87133R = new Function1() { // from class: jp2.j
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i18) {
                                    case 0:
                                        return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                    default:
                                        return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        i18 = 1;
                    }
                    Function1 function3 = (Function1) objM87133R;
                    if (i37 != 256 || ((i36 & 512) != 0 && c28655q2.m87157i(c21884o2))) {
                        i19 = i18;
                    } else {
                        i19 = 0;
                    }
                    i24 = (c28655q2.m87157i(interfaceC15237i2) ? 1 : 0) | i19;
                    objM87133R2 = c28655q2.m87133R();
                    if (i24 == 0 || objM87133R2 == c28676v0) {
                        final int i38 = 0;
                        objM87133R2 = new Function1() { // from class: jp2.j
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i38) {
                                    case 0:
                                        return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                    default:
                                        return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    C34348q0 c34348q0 = new C34348q0(function3, (Function1) objM87133R2, null, null, 58);
                    textResourceM62094g = c21884o2.getErrorMessage();
                    if (textResourceM62094g == null) {
                        c28655q2.m87150e0(-1368316343);
                        c28655q2.m87173q(false);
                        textResourceM21278l = null;
                        i25 = i29;
                    } else {
                        c28655q2.m87150e0(-1368316342);
                        i25 = i29;
                        textResourceM21278l = AbstractC8693b.m21278l(AbstractC8693b.m21274h(textResourceM62094g, c28655q2, i25));
                        c28655q2.m87173q(false);
                    }
                    if (textResourceM21278l == null) {
                        textResourceM21278l = AbstractC8693b.m21267a();
                    }
                    TextResource textResource = textResourceM21278l;
                    if (c21884o2.getErrorMessage() != null) {
                        i26 = i18;
                    } else {
                        i26 = 0;
                    }
                    long jM125392f = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend();
                    C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i34).getB1();
                    C15043i8 c15043i8 = C15043i8.f56313a;
                    if (c21884o2.getIsReadOnly()) {
                        jM73366B = AbstractC31061c.m95627c(c28655q2, 925705430, c38072d, c28655q2, i34);
                        z14 = false;
                    } else {
                        z14 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q2, 925706425, c38072d, c28655q2, i34);
                    }
                    c28655q2.m87173q(z14);
                    if (c21884o2.getErrorMessage() != null) {
                        c28655q2.m87150e0(925709764);
                        jM125416r = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend15();
                    } else {
                        c28655q2.m87150e0(925711190);
                        jM125416r = c38072d.m121949b(c28655q2, i34).getBlack30();
                    }
                    c28655q2.m87173q(z14);
                    z15 = z14;
                    C15197y1 c15197y1M43130h = C15043i8.m43130h(jM73366B, 0L, jM125416r, c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getWhite50(), c38072d.m121949b(c28655q2, i34).getWhite10(), 0L, c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C21864p(5);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    if (i37 != 256 || ((i36 & 512) != 0 && c28655q2.m87157i(c21884o2))) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    if ((29360128 & i36) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    boolean z26 = z17 | z16;
                    if ((458752 & i36) == 131072) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    boolean z27 = z26 | z18;
                    if ((234881024 & i36) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    z24 = z27 | z19;
                    objM87133R4 = c28655q2.m87133R();
                    if (!z24 || objM87133R4 == c28676v0) {
                        i27 = i36;
                        C1042s c1042s = new C1042s((Object) c21884o, (Object) function1, (Object) str2, (Object) function2, 28);
                        c28655q2.m87172p0(c1042s);
                        objM87133R4 = c1042s;
                    } else {
                        i27 = i36;
                    }
                    AbstractC30792k.m94678l(modifierM3409f2, textResourceM21278l2, c2886aM8420a, null, c2886aM8432m2, null, c37816b, null, textResource, i26, false, null, jM125392f, false, i13, 0, i14, false, null, false, false, 0, zM62103p, null, null, c33252iM105489e, c15197y1M43130h, null, null, c34348q0, interfaceC4339a, (Function1) objM87133R4, c28655q2, (i25 << 3) | 3078 | (i35 << 6) | (i35 << 12) | (i25 << 24), ((i27 << 3) & 57344) | (3670016 & (i27 << 6)), 0, 6, 431926432, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier2 = modifier4;
                } else {
                    c21884o2 = c21884o;
                }
                z13 = false;
                interfaceC15237i2 = interfaceC15237i;
                zM87157i = c28655q2.m87157i(interfaceC15237i2) | z13;
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87157i) {
                    i18 = 1;
                    objM87133R = new Function1() { // from class: jp2.j
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                default:
                                    return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    i18 = 1;
                    objM87133R = new Function1() { // from class: jp2.j
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                default:
                                    return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                Function1 function4 = (Function1) objM87133R;
                if (i37 != 256) {
                    i19 = i18;
                } else {
                    i19 = i18;
                }
                i24 = (c28655q2.m87157i(interfaceC15237i2) ? 1 : 0) | i19;
                objM87133R2 = c28655q2.m87133R();
                if (i24 == 0) {
                    final int i39 = 0;
                    objM87133R2 = new Function1() { // from class: jp2.j
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i39) {
                                case 0:
                                    return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                default:
                                    return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i310 = 0;
                    objM87133R2 = new Function1() { // from class: jp2.j
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i310) {
                                case 0:
                                    return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                                default:
                                    return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                C34348q0 c34348q1 = new C34348q0(function4, (Function1) objM87133R2, null, null, 58);
                textResourceM62094g = c21884o2.getErrorMessage();
                if (textResourceM62094g == null) {
                    c28655q2.m87150e0(-1368316343);
                    c28655q2.m87173q(false);
                    textResourceM21278l = null;
                    i25 = i29;
                } else {
                    c28655q2.m87150e0(-1368316342);
                    i25 = i29;
                    textResourceM21278l = AbstractC8693b.m21278l(AbstractC8693b.m21274h(textResourceM62094g, c28655q2, i25));
                    c28655q2.m87173q(false);
                }
                if (textResourceM21278l == null) {
                    textResourceM21278l = AbstractC8693b.m21267a();
                }
                TextResource textResource2 = textResourceM21278l;
                if (c21884o2.getErrorMessage() != null) {
                    i26 = i18;
                } else {
                    i26 = 0;
                }
                long jM125392f2 = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend();
                C2886a c2886aM8420a2 = c38072d.m121952e(c28655q2, i34).getB1();
                C15043i8 c15043i9 = C15043i8.f56313a;
                if (c21884o2.getIsReadOnly()) {
                    jM73366B = AbstractC31061c.m95627c(c28655q2, 925705430, c38072d, c28655q2, i34);
                    z14 = false;
                } else {
                    z14 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q2, 925706425, c38072d, c28655q2, i34);
                }
                c28655q2.m87173q(z14);
                if (c21884o2.getErrorMessage() != null) {
                    c28655q2.m87150e0(925709764);
                    jM125416r = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend15();
                } else {
                    c28655q2.m87150e0(925711190);
                    jM125416r = c38072d.m121949b(c28655q2, i34).getBlack30();
                }
                c28655q2.m87173q(z14);
                z15 = z14;
                C15197y1 c15197y1M43130h2 = C15043i8.m43130h(jM73366B, 0L, jM125416r, c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getWhite50(), c38072d.m121949b(c28655q2, i34).getWhite10(), 0L, c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C21864p(5);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                if (i37 != 256) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((29360128 & i36) == 8388608) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                boolean z28 = z17 | z16;
                if ((458752 & i36) == 131072) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                boolean z29 = z28 | z18;
                if ((234881024 & i36) == 67108864) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                z24 = z29 | z19;
                objM87133R4 = c28655q2.m87133R();
                if (z24) {
                    i27 = i36;
                    C1042s c1042s2 = new C1042s((Object) c21884o, (Object) function1, (Object) str2, (Object) function2, 28);
                    c28655q2.m87172p0(c1042s2);
                    objM87133R4 = c1042s2;
                } else {
                    i27 = i36;
                    C1042s c1042s3 = new C1042s((Object) c21884o, (Object) function1, (Object) str2, (Object) function2, 28);
                    c28655q2.m87172p0(c1042s3);
                    objM87133R4 = c1042s3;
                }
                AbstractC30792k.m94678l(modifierM3409f2, textResourceM21278l2, c2886aM8420a2, null, c2886aM8432m2, null, c37816b, null, textResource2, i26, false, null, jM125392f2, false, i13, 0, i14, false, null, false, false, 0, zM62103p, null, null, c33252iM105489e, c15197y1M43130h2, null, null, c34348q1, interfaceC4339a2, (Function1) objM87133R4, c28655q2, (i25 << 3) | 3078 | (i35 << 6) | (i35 << 12) | (i25 << 24), ((i27 << 3) & 57344) | (3670016 & (i27 << 6)), 0, 6, 431926432, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier4;
            } else {
                c21884o2 = c21884o;
            }
            z13 = true;
            interfaceC15237i2 = interfaceC15237i;
            zM87157i = c28655q2.m87157i(interfaceC15237i2) | z13;
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87157i) {
                i18 = 1;
                objM87133R = new Function1() { // from class: jp2.j
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            default:
                                return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            } else {
                i18 = 1;
                objM87133R = new Function1() { // from class: jp2.j
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            default:
                                return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function5 = (Function1) objM87133R;
            if (i37 != 256) {
                i19 = i18;
            } else {
                i19 = i18;
            }
            i24 = (c28655q2.m87157i(interfaceC15237i2) ? 1 : 0) | i19;
            objM87133R2 = c28655q2.m87133R();
            if (i24 == 0) {
                final int i311 = 0;
                objM87133R2 = new Function1() { // from class: jp2.j
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i311) {
                            case 0:
                                return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            default:
                                return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            } else {
                final int i312 = 0;
                objM87133R2 = new Function1() { // from class: jp2.j
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i312) {
                            case 0:
                                return AbstractC21883n.m62080r(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                            default:
                                return AbstractC21883n.m62079q(c21884o2, interfaceC15237i2, (InterfaceC34345p0) obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            C34348q0 c34348q2 = new C34348q0(function5, (Function1) objM87133R2, null, null, 58);
            textResourceM62094g = c21884o2.getErrorMessage();
            if (textResourceM62094g == null) {
                c28655q2.m87150e0(-1368316343);
                c28655q2.m87173q(false);
                textResourceM21278l = null;
                i25 = i29;
            } else {
                c28655q2.m87150e0(-1368316342);
                i25 = i29;
                textResourceM21278l = AbstractC8693b.m21278l(AbstractC8693b.m21274h(textResourceM62094g, c28655q2, i25));
                c28655q2.m87173q(false);
            }
            if (textResourceM21278l == null) {
                textResourceM21278l = AbstractC8693b.m21267a();
            }
            TextResource textResource3 = textResourceM21278l;
            if (c21884o2.getErrorMessage() != null) {
                i26 = i18;
            } else {
                i26 = 0;
            }
            long jM125392f3 = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend();
            C2886a c2886aM8420a3 = c38072d.m121952e(c28655q2, i34).getB1();
            C15043i8 c15043i10 = C15043i8.f56313a;
            if (c21884o2.getIsReadOnly()) {
                jM73366B = AbstractC31061c.m95627c(c28655q2, 925705430, c38072d, c28655q2, i34);
                z14 = false;
            } else {
                z14 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q2, 925706425, c38072d, c28655q2, i34);
            }
            c28655q2.m87173q(z14);
            if (c21884o2.getErrorMessage() != null) {
                c28655q2.m87150e0(925709764);
                jM125416r = c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend15();
            } else {
                c28655q2.m87150e0(925711190);
                jM125416r = c38072d.m121949b(c28655q2, i34).getBlack30();
            }
            c28655q2.m87173q(z14);
            z15 = z14;
            C15197y1 c15197y1M43130h3 = C15043i8.m43130h(jM73366B, 0L, jM125416r, c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getBrandWhite(), c38072d.m121949b(c28655q2, i34).getWhite50(), c38072d.m121949b(c28655q2, i34).getWhite10(), 0L, c38072d.m121949b(c28655q2, i34).getAccentNegativeTrend(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C21864p(5);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            if (i37 != 256) {
                z16 = true;
            } else {
                z16 = true;
            }
            if ((29360128 & i36) == 8388608) {
                z17 = true;
            } else {
                z17 = z15;
            }
            boolean z210 = z17 | z16;
            if ((458752 & i36) == 131072) {
                z18 = true;
            } else {
                z18 = z15;
            }
            boolean z211 = z210 | z18;
            if ((234881024 & i36) == 67108864) {
                z19 = true;
            } else {
                z19 = z15;
            }
            z24 = z211 | z19;
            objM87133R4 = c28655q2.m87133R();
            if (z24) {
                i27 = i36;
                C1042s c1042s4 = new C1042s((Object) c21884o, (Object) function1, (Object) str2, (Object) function2, 28);
                c28655q2.m87172p0(c1042s4);
                objM87133R4 = c1042s4;
            } else {
                i27 = i36;
                C1042s c1042s5 = new C1042s((Object) c21884o, (Object) function1, (Object) str2, (Object) function2, 28);
                c28655q2.m87172p0(c1042s5);
                objM87133R4 = c1042s5;
            }
            AbstractC30792k.m94678l(modifierM3409f2, textResourceM21278l2, c2886aM8420a3, null, c2886aM8432m2, null, c37816b, null, textResource3, i26, false, null, jM125392f3, false, i13, 0, i14, false, null, false, false, 0, zM62103p, null, null, c33252iM105489e, c15197y1M43130h3, null, null, c34348q2, interfaceC4339a3, (Function1) objM87133R4, c28655q2, (i25 << 3) | 3078 | (i35 << 6) | (i35 << 12) | (i25 << 24), ((i27 << 3) & 57344) | (3670016 & (i27 << 6)), 0, 6, 431926432, 0);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jp2.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC21883n.m62083u(modifier2, str, c21884o, i13, i14, str2, interfaceC15237i2, function1, function2, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m62078p(TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m62079q(C21884o c21884o, InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        if (c21884o.getIsLastTextField()) {
            ((C15240l) interfaceC15237i).m43339b(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62080r(C21884o c21884o, InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        if (!c21884o.getIsLastTextField()) {
            ((C15240l) interfaceC15237i).m43345h(1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m62081s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62082t(C21884o c21884o, Function1 function1, String str, Function1 function2, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        if (c21884o.getMaxLength() != null && newText.length() > c21884o.getMaxLength().intValue()) {
            newText = AbstractC39414r.m125866L0(c21884o.getMaxLength().intValue(), newText);
        }
        String str2 = newText;
        function1.invoke(new AbstractC21878i.c(c21884o.getFieldId(), str2, c21884o.getMaxLength(), c21884o.getMinLength(), c21884o.getPattern(), str));
        function2.invoke(str2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62083u(Modifier modifier, String str, C21884o c21884o, int i13, int i14, String str2, InterfaceC15237i interfaceC15237i, Function1 function1, Function1 function2, int i15, int i16, Composer composer, int i17) {
        m62077o(modifier, str, c21884o, i13, i14, str2, interfaceC15237i, function1, function2, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f  */
    /* JADX WARN: Code duplicated, block: B:107:0x026c  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0280  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x032e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0332  */
    /* JADX WARN: Code duplicated, block: B:142:0x0353  */
    /* JADX WARN: Code duplicated, block: B:146:0x036c  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x0403  */
    /* JADX WARN: Code duplicated, block: B:174:0x040d  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0201  */
    /* JADX WARN: Code duplicated, block: B:93:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:97:0x0255  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX INFO: renamed from: v */
    public static final void m62084v(Modifier modifier, C21884o c21884o, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        TextResource textResourceM62092e;
        String strM21274h;
        int i17;
        String strM21274h2;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i18;
        boolean zM125921F;
        InterfaceC3863h interfaceC3863h;
        C3868m c3868m;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g3;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        String str;
        int i19;
        boolean z13;
        InterfaceC28601c1 interfaceC28601c4;
        C3867l c3867l;
        Modifier modifierM3409f;
        boolean z14;
        boolean z15;
        boolean zM87153g4;
        Object objM87133R4;
        Modifier modifierM3484c;
        boolean z16;
        float f13;
        boolean zM87157i;
        Object objM87133R5;
        boolean z17;
        boolean z18;
        boolean zM87153g5;
        Object c1019g0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g6;
        Object objM87133R6;
        boolean zM87153g7;
        Object objM87133R7;
        C3868m c3868m2;
        Object objM87133R8;
        C21884o viewState = c21884o;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-246993717);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C21875f(1);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                textResourceM62092e = viewState.getCurrentText();
                if (textResourceM62092e == null) {
                    c28655q.m87150e0(-910644962);
                    c28655q.m87173q(false);
                    strM21274h = null;
                } else {
                    c28655q.m87150e0(-910644961);
                    strM21274h = AbstractC8693b.m21274h(textResourceM62092e, c28655q, TextResource.$stable);
                    c28655q.m87173q(false);
                }
                TextResource textResourceM62093f = viewState.getDisplayLabel();
                i17 = TextResource.$stable;
                strM21274h2 = AbstractC8693b.m21274h(textResourceM62093f, c28655q, i17);
                zM87153g = c28655q.m87153g(viewState.getFieldId()) | c28655q.m87153g(strM21274h);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    if (strM21274h == null) {
                        strM21274h = "";
                    }
                    objM87133R = AbstractC28683x.m87272z(strM21274h);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                int iM62096i = viewState.getKeyboardType();
                if (viewState.getIsLastTextField()) {
                    i18 = 7;
                } else {
                    i18 = 6;
                }
                zM125921F = AbstractC39421y.m125921F(viewState.getFieldId(), "country", true);
                interfaceC3863h = (InterfaceC3863h) c28655q.m87161k(AbstractC2453v1.f9563b);
                c3868m = (C3868m) c28655q.m87161k(AbstractC2453v1.f9564c);
                zM87153g2 = c28655q.m87153g(viewState.getFieldId());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                zM87153g3 = c28655q.m87153g(viewState.getFieldId());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                if (viewState.getIsReadOnly()) {
                    str = strM21274h2;
                    i19 = i17;
                    c2314t = c2314t;
                    z13 = false;
                    interfaceC28601c4 = interfaceC28601c1;
                    interfaceC3863h = interfaceC3863h;
                    c28655q.m87150e0(-908636285);
                    c28655q.m87173q(false);
                    c3867l = null;
                } else {
                    c28655q.m87150e0(-909728787);
                    zM87153g7 = c28655q.m87153g(viewState.getFieldId());
                    objM87133R7 = c28655q.m87133R();
                    if (!zM87153g7 || objM87133R7 == c28676v0) {
                        List listM118960L = AbstractC37056f.m118960L(viewState.getAutoFillType());
                        Function1 function5 = function4;
                        str = strM21274h2;
                        interfaceC28601c4 = interfaceC28601c1;
                        c3868m2 = c3868m;
                        i19 = i17;
                        C1042s c1042s = new C1042s(viewState, function5, str, interfaceC28601c4, 29);
                        viewState = viewState;
                        function4 = function5;
                        objM87133R7 = new C3867l(listM118960L, c1042s);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        c3868m2 = c3868m;
                        str = strM21274h2;
                        i19 = i17;
                        interfaceC28601c4 = interfaceC28601c1;
                    }
                    c3867l = (C3867l) objM87133R7;
                    c3868m2.f15804a.put(Integer.valueOf(c3867l.m11853b()), c3867l);
                    z13 = false;
                    c28655q.m87173q(false);
                }
                if (zM125921F || !viewState.getIsReadOnly()) {
                    c28655q.m87150e0(-908355952);
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    if (c3867l != null) {
                        c28655q.m87150e0(1531583997);
                        zM87157i = c28655q.m87157i(c3867l) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC3863h);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i || objM87133R5 == c28676v0) {
                            objM87133R5 = new C21881l((Object) c3867l, (Object) interfaceC3863h, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3409f, (Function1) objM87133R5);
                        boolean zM87153g8 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(interfaceC3863h) | c28655q.m87157i(c3867l);
                        if ((i16 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z19 = zM87153g8 | z17;
                        if ((i16 & 112) != 32 || ((i16 & 64) != 0 && c28655q.m87157i(viewState))) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87153g5 = z19 | z18 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                        Object objM87133R9 = c28655q.m87133R();
                        if (!zM87153g5 || objM87133R9 == c28676v0) {
                            String str2 = str;
                            Function1 function6 = function4;
                            InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c4;
                            c1019g0 = new C1019g0(interfaceC3863h, c3867l, function6, viewState, str2, interfaceC28601c3, interfaceC28601c2, interfaceC28601c5);
                            function4 = function6;
                            str = str2;
                            interfaceC28601c4 = interfaceC28601c5;
                            c28655q.m87172p0(c1019g0);
                        } else {
                            c1019g0 = objM87133R9;
                        }
                        modifierM3484c = AbstractC1126a.m3484c(modifierM3500d, (Function1) c1019g0);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        modifier3 = modifier3;
                        c28676v0 = c28676v0;
                        c2314t = c2314t;
                        c28655q.m87150e0(1533332087);
                        boolean zM87153g9 = c28655q.m87153g(interfaceC28601c3);
                        if ((i16 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z24 = zM87153g9 | z14;
                        if ((i16 & 112) != 32 || ((i16 & 64) != 0 && c28655q.m87157i(viewState))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87153g4 = z24 | z15 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g4 || objM87133R4 == c28676v0) {
                            InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c4;
                            C1040r c1040r = new C1040r(function4, viewState, str, interfaceC28601c3, interfaceC28601c6);
                            interfaceC28601c4 = interfaceC28601c6;
                            c28655q.m87172p0(c1040r);
                            objM87133R4 = c1040r;
                        }
                        modifierM3484c = AbstractC1126a.m3484c(modifierM3409f, (Function1) objM87133R4);
                        z16 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                    f13 = 1.0f;
                } else {
                    c28655q.m87150e0(-908540743);
                    c28655q.m87173q(z13);
                    modifierM3484c = AbstractC1102d.m3409f(1.0f, modifier3);
                    modifier3 = modifier3;
                    f13 = 1.0f;
                    c2314t = c2314t;
                    z16 = false;
                    c28676v0 = c28676v0;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, modifier3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z16);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                Function1 function7 = function4;
                String strM62058F = m62058F(interfaceC28601c4);
                zM87153g6 = c28655q.m87153g(interfaceC28601c4);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g6 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C13921a0(28, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                }
                C28676v0 c28676v1 = c28676v0;
                viewState = c21884o;
                Modifier modifier4 = modifier3;
                m62077o(modifierM3484c, strM62058F, viewState, iM62096i, i18, str, interfaceC15237i, function7, (Function1) objM87133R6, c28655q, (i19 << 6) | ((i16 << 3) & 896) | ((i16 << 15) & 29360128), 0);
                if (zM125921F || !viewState.getIsReadOnly()) {
                    c28655q.m87150e0(1413085201);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1412819004);
                    Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
                    boolean z25 = ((i16 & 112) == 32 || ((i16 & 64) != 0 && c28655q.m87157i(viewState))) | ((i16 & 896) == 256);
                    Object objM87133R10 = c28655q.m87133R();
                    if (z25 || objM87133R10 == c28676v1) {
                        objM87133R10 = new C21214q(8, function7, viewState);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3362g(modifierMo3401b, false, null, null, (InterfaceC4339a) objM87133R10, 15), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function7;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(modifier2, viewState, function3, i13, i14, 3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C21875f(1);
                    c28655q.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            } else {
                function4 = function2;
            }
            textResourceM62092e = viewState.getCurrentText();
            if (textResourceM62092e == null) {
                c28655q.m87150e0(-910644962);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(-910644961);
                strM21274h = AbstractC8693b.m21274h(textResourceM62092e, c28655q, TextResource.$stable);
                c28655q.m87173q(false);
            }
            TextResource textResourceM62093f2 = viewState.getDisplayLabel();
            i17 = TextResource.$stable;
            strM21274h2 = AbstractC8693b.m21274h(textResourceM62093f2, c28655q, i17);
            zM87153g = c28655q.m87153g(viewState.getFieldId()) | c28655q.m87153g(strM21274h);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                if (strM21274h == null) {
                    strM21274h = "";
                }
                objM87133R = AbstractC28683x.m87272z(strM21274h);
                c28655q.m87172p0(objM87133R);
            } else {
                if (strM21274h == null) {
                    strM21274h = "";
                }
                objM87133R = AbstractC28683x.m87272z(strM21274h);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC15237i interfaceC15237i2 = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            int iM62096i2 = viewState.getKeyboardType();
            if (viewState.getIsLastTextField()) {
                i18 = 7;
            } else {
                i18 = 6;
            }
            zM125921F = AbstractC39421y.m125921F(viewState.getFieldId(), "country", true);
            interfaceC3863h = (InterfaceC3863h) c28655q.m87161k(AbstractC2453v1.f9563b);
            c3868m = (C3868m) c28655q.m87161k(AbstractC2453v1.f9564c);
            zM87153g2 = c28655q.m87153g(viewState.getFieldId());
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            zM87153g3 = c28655q.m87153g(viewState.getFieldId());
            objM87133R3 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            if (viewState.getIsReadOnly()) {
                c28655q.m87150e0(-909728787);
                zM87153g7 = c28655q.m87153g(viewState.getFieldId());
                objM87133R7 = c28655q.m87133R();
                if (zM87153g7) {
                    List listM118960L2 = AbstractC37056f.m118960L(viewState.getAutoFillType());
                    Function1 function8 = function4;
                    str = strM21274h2;
                    interfaceC28601c4 = interfaceC28601c1;
                    c3868m2 = c3868m;
                    i19 = i17;
                    C1042s c1042s2 = new C1042s(viewState, function8, str, interfaceC28601c4, 29);
                    viewState = viewState;
                    function4 = function8;
                    objM87133R7 = new C3867l(listM118960L2, c1042s2);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    List listM118960L3 = AbstractC37056f.m118960L(viewState.getAutoFillType());
                    Function1 function9 = function4;
                    str = strM21274h2;
                    interfaceC28601c4 = interfaceC28601c1;
                    c3868m2 = c3868m;
                    i19 = i17;
                    C1042s c1042s3 = new C1042s(viewState, function9, str, interfaceC28601c4, 29);
                    viewState = viewState;
                    function4 = function9;
                    objM87133R7 = new C3867l(listM118960L3, c1042s3);
                    c28655q.m87172p0(objM87133R7);
                }
                c3867l = (C3867l) objM87133R7;
                c3868m2.f15804a.put(Integer.valueOf(c3867l.m11853b()), c3867l);
                z13 = false;
                c28655q.m87173q(false);
            } else {
                str = strM21274h2;
                i19 = i17;
                c2314t = c2314t;
                z13 = false;
                interfaceC28601c4 = interfaceC28601c1;
                interfaceC3863h = interfaceC3863h;
                c28655q.m87150e0(-908636285);
                c28655q.m87173q(false);
                c3867l = null;
            }
            if (zM125921F) {
                c28655q.m87150e0(-908355952);
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                if (c3867l != null) {
                    c28655q.m87150e0(1531583997);
                    zM87157i = c28655q.m87157i(c3867l) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC3863h);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new C21881l((Object) c3867l, (Object) interfaceC3863h, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21881l((Object) c3867l, (Object) interfaceC3863h, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierM3409f, (Function1) objM87133R5);
                    boolean zM87153g10 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(interfaceC3863h) | c28655q.m87157i(c3867l);
                    if ((i16 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z110 = zM87153g10 | z17;
                    if ((i16 & 112) != 32) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    zM87153g5 = z110 | z18 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                    Object objM87133R11 = c28655q.m87133R();
                    if (zM87153g5) {
                        String str3 = str;
                        Function1 function10 = function4;
                        InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c4;
                        c1019g0 = new C1019g0(interfaceC3863h, c3867l, function10, viewState, str3, interfaceC28601c3, interfaceC28601c2, interfaceC28601c7);
                        function4 = function10;
                        str = str3;
                        interfaceC28601c4 = interfaceC28601c7;
                        c28655q.m87172p0(c1019g0);
                    } else {
                        String str4 = str;
                        Function1 function11 = function4;
                        InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c4;
                        c1019g0 = new C1019g0(interfaceC3863h, c3867l, function11, viewState, str4, interfaceC28601c3, interfaceC28601c2, interfaceC28601c8);
                        function4 = function11;
                        str = str4;
                        interfaceC28601c4 = interfaceC28601c8;
                        c28655q.m87172p0(c1019g0);
                    }
                    modifierM3484c = AbstractC1126a.m3484c(modifierM3500d2, (Function1) c1019g0);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    modifier3 = modifier3;
                    c28676v0 = c28676v0;
                    c2314t = c2314t;
                    c28655q.m87150e0(1533332087);
                    boolean zM87153g11 = c28655q.m87153g(interfaceC28601c3);
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z26 = zM87153g11 | z14;
                    if ((i16 & 112) != 32) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zM87153g4 = z26 | z15 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g4) {
                        InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c4;
                        C1040r c1040r2 = new C1040r(function4, viewState, str, interfaceC28601c3, interfaceC28601c9);
                        interfaceC28601c4 = interfaceC28601c9;
                        c28655q.m87172p0(c1040r2);
                        objM87133R4 = c1040r2;
                    } else {
                        InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c4;
                        C1040r c1040r3 = new C1040r(function4, viewState, str, interfaceC28601c3, interfaceC28601c10);
                        interfaceC28601c4 = interfaceC28601c10;
                        c28655q.m87172p0(c1040r3);
                        objM87133R4 = c1040r3;
                    }
                    modifierM3484c = AbstractC1126a.m3484c(modifierM3409f, (Function1) objM87133R4);
                    z16 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
                f13 = 1.0f;
            } else {
                c28655q.m87150e0(-908355952);
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                if (c3867l != null) {
                    c28655q.m87150e0(1531583997);
                    zM87157i = c28655q.m87157i(c3867l) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC3863h);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new C21881l((Object) c3867l, (Object) interfaceC3863h, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21881l((Object) c3867l, (Object) interfaceC3863h, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifierM3500d3 = AbstractC1131a.m3500d(modifierM3409f, (Function1) objM87133R5);
                    boolean zM87153g12 = c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(interfaceC3863h) | c28655q.m87157i(c3867l);
                    if ((i16 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z111 = zM87153g12 | z17;
                    if ((i16 & 112) != 32) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    zM87153g5 = z111 | z18 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                    Object objM87133R12 = c28655q.m87133R();
                    if (zM87153g5) {
                        String str5 = str;
                        Function1 function12 = function4;
                        InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c4;
                        c1019g0 = new C1019g0(interfaceC3863h, c3867l, function12, viewState, str5, interfaceC28601c3, interfaceC28601c2, interfaceC28601c11);
                        function4 = function12;
                        str = str5;
                        interfaceC28601c4 = interfaceC28601c11;
                        c28655q.m87172p0(c1019g0);
                    } else {
                        String str6 = str;
                        Function1 function13 = function4;
                        InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c4;
                        c1019g0 = new C1019g0(interfaceC3863h, c3867l, function13, viewState, str6, interfaceC28601c3, interfaceC28601c2, interfaceC28601c12);
                        function4 = function13;
                        str = str6;
                        interfaceC28601c4 = interfaceC28601c12;
                        c28655q.m87172p0(c1019g0);
                    }
                    modifierM3484c = AbstractC1126a.m3484c(modifierM3500d3, (Function1) c1019g0);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    modifier3 = modifier3;
                    c28676v0 = c28676v0;
                    c2314t = c2314t;
                    c28655q.m87150e0(1533332087);
                    boolean zM87153g13 = c28655q.m87153g(interfaceC28601c3);
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z27 = zM87153g13 | z14;
                    if ((i16 & 112) != 32) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zM87153g4 = z27 | z15 | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(str);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g4) {
                        InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c4;
                        C1040r c1040r4 = new C1040r(function4, viewState, str, interfaceC28601c3, interfaceC28601c13);
                        interfaceC28601c4 = interfaceC28601c13;
                        c28655q.m87172p0(c1040r4);
                        objM87133R4 = c1040r4;
                    } else {
                        InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c4;
                        C1040r c1040r5 = new C1040r(function4, viewState, str, interfaceC28601c3, interfaceC28601c14);
                        interfaceC28601c4 = interfaceC28601c14;
                        c28655q.m87172p0(c1040r5);
                        objM87133R4 = c1040r5;
                    }
                    modifierM3484c = AbstractC1126a.m3484c(modifierM3409f, (Function1) objM87133R4);
                    z16 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
                f13 = 1.0f;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(f13, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z16);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            Function1 function14 = function4;
            String strM62058F2 = m62058F(interfaceC28601c4);
            zM87153g6 = c28655q.m87153g(interfaceC28601c4);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g6) {
                objM87133R6 = new C13921a0(28, interfaceC28601c4);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C13921a0(28, interfaceC28601c4);
                c28655q.m87172p0(objM87133R6);
            }
            C28676v0 c28676v2 = c28676v0;
            viewState = c21884o;
            Modifier modifier5 = modifier3;
            m62077o(modifierM3484c, strM62058F2, viewState, iM62096i2, i18, str, interfaceC15237i2, function14, (Function1) objM87133R6, c28655q, (i19 << 6) | ((i16 << 3) & 896) | ((i16 << 15) & 29360128), 0);
            if (zM125921F) {
                c28655q.m87150e0(1413085201);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1413085201);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function14;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, viewState, function3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m62085w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m62086x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m62087y(C21884o c21884o, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1, String filledValue) {
        AbstractC22676k.m65750j(filledValue, "filledValue");
        if (c21884o.getMaxLength() != null && filledValue.length() > c21884o.getMaxLength().intValue()) {
            filledValue = AbstractC39414r.m125866L0(c21884o.getMaxLength().intValue(), filledValue);
        }
        String str2 = filledValue;
        m62059G(interfaceC28601c1, str2);
        function1.invoke(new AbstractC21878i.c(c21884o.getFieldId(), str2, c21884o.getMaxLength(), c21884o.getMinLength(), c21884o.getPattern(), str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m62088z(C3867l c3867l, InterfaceC3863h interfaceC3863h, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        c3867l.f15801b = AbstractC39125q1.m124660f(coordinates);
        m62061I(interfaceC28601c1, true);
        if (m62062J(interfaceC28601c2) && interfaceC3863h != null) {
            ((C3856a) interfaceC3863h).m11843a(c3867l);
        }
        return C23454a0.f92919a;
    }
}
