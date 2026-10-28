package ny0;

import android.annotation.SuppressLint;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import e61.C12762e;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ny0.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lny0/o;", "state", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "initialModifier", "finalModifier", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27242b1 {
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0260 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x026e  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0295  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:93:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ModifierParameter"})
    /* JADX INFO: renamed from: d */
    public static final void m82092d(C27270o state, String contentDescription, Modifier modifier, Modifier modifier2, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier3;
        int i16;
        Modifier modifier4;
        int i17;
        boolean z4;
        Modifier modifier5;
        Modifier modifier6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier7;
        Modifier modifier8;
        final AbstractC27274q type;
        InterfaceC39332e color;
        InterfaceC39332e circleColor;
        boolean enabled;
        final boolean nonFunctional;
        boolean shouldKeepOriginalIconColor;
        float alpha;
        final boolean fill;
        long jMo134584toComposableColorWaAFU9c;
        boolean z13;
        int i18;
        long jM51541c;
        final long jM51541c2;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1M44460m;
        int i19;
        C1119d c1119dM43228a;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87155h;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c1;
        final boolean z16;
        long j7;
        long jMo134584toComposableColorWaAFU9c2;
        int i24;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1706407174);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(contentDescription) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                modifier3 = modifier;
                i15 |= c28655q.m87153g(modifier3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    modifier4 = modifier2;
                    if (c28655q.m87153g(modifier4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier3;
                    }
                    if (i16 != 0) {
                        modifier8 = c2314t;
                    } else {
                        modifier8 = modifier4;
                    }
                    type = state.getType();
                    int resource = state.getResource();
                    color = state.getColor();
                    circleColor = state.getCircleColor();
                    InterfaceC39332e pressedColor = state.getPressedColor();
                    enabled = state.getEnabled();
                    nonFunctional = state.getNonFunctional();
                    shouldKeepOriginalIconColor = state.getShouldKeepOriginalIconColor();
                    alpha = state.getAlpha();
                    fill = state.getFill();
                    jMo134584toComposableColorWaAFU9c = color.mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (enabled && !nonFunctional) {
                        alpha = 0.4f;
                    } else if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                        if (alpha == 1.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                        }
                    }
                    i18 = i15;
                    float f13 = alpha;
                    jM51541c = C17919x.m51541c(f13, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                    if (circleColor != null) {
                        color = circleColor;
                    }
                    jM51541c2 = C17919x.m51541c(f13, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6);
                    if (type.getIsSecondary()) {
                        i19 = 0;
                        c1119dM43228a = null;
                    } else {
                        i19 = 0;
                        c1119dM43228a = AbstractC15210z4.m43228a(0L, 6, false, 0.0f);
                    }
                    if (enabled || nonFunctional) {
                        z14 = i19;
                    } else {
                        z14 = 1;
                    }
                    C18027i c18027i = new C18027i(i19);
                    if ((i18 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C12762e(onClick, 8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierMo3471e = AbstractC1102d.m3419p(type.getTouchArea(), AbstractC1092a.m3360e(modifier7, interfaceC21083i, c1119dM43228a, z14, c18027i, (InterfaceC4339a) objM87133R2, 8)).mo3471e(modifier8);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    Modifier modifier9 = modifier8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                    Modifier modifierM3419p = AbstractC1102d.m3419p(type.getBorderDiameter(), c2314t);
                    zM87155h = c28655q.m87155h(enabled) | c28655q.m87153g(interfaceC28601c1M44460m) | c28655q.m87155h(nonFunctional) | c28655q.m87155h(fill) | c28655q.m87153g(type) | c28655q.m87151f(jM51541c2);
                    objM87133R3 = c28655q.m87133R();
                    if (!zM87155h || objM87133R3 == c28676v0) {
                        interfaceC28601c1 = interfaceC28601c1M44460m;
                        z16 = enabled;
                        objM87133R3 = new Function1() { // from class: ny0.z0
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c1 = interfaceC28601c1M44460m;
                        z16 = enabled;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R3, c28655q, 0);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(resource, c28655q, 6);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(type.getImageSize(), c2314t);
                    if (!m82093e(interfaceC28601c1) && z16 && type.getIsSecondary()) {
                        c28655q.m87150e0(-628134393);
                        jMo134584toComposableColorWaAFU9c2 = pressedColor.mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (shouldKeepOriginalIconColor) {
                            c28655q.m87150e0(-628132065);
                            c28655q.m87173q(false);
                            jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                        } else {
                            c28655q.m87150e0(-628130910);
                            c28655q.m87173q(false);
                            j7 = jM51541c;
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S, contentDescription, modifierM3419p2, j7, c28655q, i18 & 112, 0);
                        c28655q.m87173q(true);
                        modifier6 = modifier9;
                        modifier5 = modifier7;
                    }
                    j7 = jMo134584toComposableColorWaAFU9c2;
                    AbstractC15005f3.m43108b(c27430eM107874S, contentDescription, modifierM3419p2, j7, c28655q, i18 & 112, 0);
                    c28655q.m87173q(true);
                    modifier6 = modifier9;
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27239a1(state, contentDescription, modifier5, modifier6, onClick, i13, i14, 0);
                }
            }
            i15 |= 3072;
            modifier4 = modifier2;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier3;
                }
                if (i16 != 0) {
                    modifier8 = c2314t;
                } else {
                    modifier8 = modifier4;
                }
                type = state.getType();
                int resource2 = state.getResource();
                color = state.getColor();
                circleColor = state.getCircleColor();
                InterfaceC39332e pressedColor2 = state.getPressedColor();
                enabled = state.getEnabled();
                nonFunctional = state.getNonFunctional();
                shouldKeepOriginalIconColor = state.getShouldKeepOriginalIconColor();
                alpha = state.getAlpha();
                fill = state.getFill();
                jMo134584toComposableColorWaAFU9c = color.mo134584toComposableColorWaAFU9c(c28655q, 0);
                if (enabled) {
                    if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                        if (alpha == 1.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                        }
                    }
                } else if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                    if (alpha == 1.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                    }
                }
                i18 = i15;
                float f14 = alpha;
                jM51541c = C17919x.m51541c(f14, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                if (circleColor != null) {
                    color = circleColor;
                }
                jM51541c2 = C17919x.m51541c(f14, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i2, c28655q, 6);
                if (type.getIsSecondary()) {
                    i19 = 0;
                    c1119dM43228a = AbstractC15210z4.m43228a(0L, 6, false, 0.0f);
                } else {
                    i19 = 0;
                    c1119dM43228a = null;
                }
                if (enabled) {
                    z14 = i19;
                } else {
                    z14 = i19;
                }
                C18027i c18027i2 = new C18027i(i19);
                if ((i18 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C12762e(onClick, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12762e(onClick, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e2 = AbstractC1102d.m3419p(type.getTouchArea(), AbstractC1092a.m3360e(modifier7, interfaceC21083i2, c1119dM43228a, z14, c18027i2, (InterfaceC4339a) objM87133R2, 8)).mo3471e(modifier8);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                Modifier modifier10 = modifier8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(type.getBorderDiameter(), c2314t);
                zM87155h = c28655q.m87155h(enabled) | c28655q.m87153g(interfaceC28601c1M44460m) | c28655q.m87155h(nonFunctional) | c28655q.m87155h(fill) | c28655q.m87153g(type) | c28655q.m87151f(jM51541c2);
                objM87133R3 = c28655q.m87133R();
                if (zM87155h) {
                    interfaceC28601c1 = interfaceC28601c1M44460m;
                    z16 = enabled;
                    objM87133R3 = new Function1() { // from class: ny0.z0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c1 = interfaceC28601c1M44460m;
                    z16 = enabled;
                    objM87133R3 = new Function1() { // from class: ny0.z0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R3, c28655q, 0);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(resource2, c28655q, 6);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(type.getImageSize(), c2314t);
                if (!m82093e(interfaceC28601c1)) {
                    if (shouldKeepOriginalIconColor) {
                        c28655q.m87150e0(-628132065);
                        c28655q.m87173q(false);
                        jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                        j7 = jMo134584toComposableColorWaAFU9c2;
                    } else {
                        c28655q.m87150e0(-628130910);
                        c28655q.m87173q(false);
                        j7 = jM51541c;
                    }
                } else if (shouldKeepOriginalIconColor) {
                    c28655q.m87150e0(-628132065);
                    c28655q.m87173q(false);
                    jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                    j7 = jMo134584toComposableColorWaAFU9c2;
                } else {
                    c28655q.m87150e0(-628130910);
                    c28655q.m87173q(false);
                    j7 = jM51541c;
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, contentDescription, modifierM3419p4, j7, c28655q, i18 & 112, 0);
                c28655q.m87173q(true);
                modifier6 = modifier10;
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27239a1(state, contentDescription, modifier5, modifier6, onClick, i13, i14, 0);
            }
        }
        i15 |= 384;
        modifier3 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                modifier4 = modifier2;
                if (c28655q.m87153g(modifier4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier3;
                }
                if (i16 != 0) {
                    modifier8 = c2314t;
                } else {
                    modifier8 = modifier4;
                }
                type = state.getType();
                int resource3 = state.getResource();
                color = state.getColor();
                circleColor = state.getCircleColor();
                InterfaceC39332e pressedColor3 = state.getPressedColor();
                enabled = state.getEnabled();
                nonFunctional = state.getNonFunctional();
                shouldKeepOriginalIconColor = state.getShouldKeepOriginalIconColor();
                alpha = state.getAlpha();
                fill = state.getFill();
                jMo134584toComposableColorWaAFU9c = color.mo134584toComposableColorWaAFU9c(c28655q, 0);
                if (enabled) {
                    if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                        if (alpha == 1.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                        }
                    }
                } else if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                    if (alpha == 1.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                    }
                }
                i18 = i15;
                float f15 = alpha;
                jM51541c = C17919x.m51541c(f15, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                if (circleColor != null) {
                    color = circleColor;
                }
                jM51541c2 = C17919x.m51541c(f15, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i3, c28655q, 6);
                if (type.getIsSecondary()) {
                    i19 = 0;
                    c1119dM43228a = AbstractC15210z4.m43228a(0L, 6, false, 0.0f);
                } else {
                    i19 = 0;
                    c1119dM43228a = null;
                }
                if (enabled) {
                    z14 = i19;
                } else {
                    z14 = i19;
                }
                C18027i c18027i3 = new C18027i(i19);
                if ((i18 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C12762e(onClick, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12762e(onClick, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e3 = AbstractC1102d.m3419p(type.getTouchArea(), AbstractC1092a.m3360e(modifier7, interfaceC21083i3, c1119dM43228a, z14, c18027i3, (InterfaceC4339a) objM87133R2, 8)).mo3471e(modifier8);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                Modifier modifier11 = modifier8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Modifier modifierM3419p5 = AbstractC1102d.m3419p(type.getBorderDiameter(), c2314t);
                zM87155h = c28655q.m87155h(enabled) | c28655q.m87153g(interfaceC28601c1M44460m) | c28655q.m87155h(nonFunctional) | c28655q.m87155h(fill) | c28655q.m87153g(type) | c28655q.m87151f(jM51541c2);
                objM87133R3 = c28655q.m87133R();
                if (zM87155h) {
                    interfaceC28601c1 = interfaceC28601c1M44460m;
                    z16 = enabled;
                    objM87133R3 = new Function1() { // from class: ny0.z0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c1 = interfaceC28601c1M44460m;
                    z16 = enabled;
                    objM87133R3 = new Function1() { // from class: ny0.z0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p5, (Function1) objM87133R3, c28655q, 0);
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(resource3, c28655q, 6);
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(type.getImageSize(), c2314t);
                if (!m82093e(interfaceC28601c1)) {
                    if (shouldKeepOriginalIconColor) {
                        c28655q.m87150e0(-628132065);
                        c28655q.m87173q(false);
                        jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                        j7 = jMo134584toComposableColorWaAFU9c2;
                    } else {
                        c28655q.m87150e0(-628130910);
                        c28655q.m87173q(false);
                        j7 = jM51541c;
                    }
                } else if (shouldKeepOriginalIconColor) {
                    c28655q.m87150e0(-628132065);
                    c28655q.m87173q(false);
                    jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                    j7 = jMo134584toComposableColorWaAFU9c2;
                } else {
                    c28655q.m87150e0(-628130910);
                    c28655q.m87173q(false);
                    j7 = jM51541c;
                }
                AbstractC15005f3.m43108b(c27430eM107874S3, contentDescription, modifierM3419p6, j7, c28655q, i18 & 112, 0);
                c28655q.m87173q(true);
                modifier6 = modifier11;
                modifier5 = modifier7;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27239a1(state, contentDescription, modifier5, modifier6, onClick, i13, i14, 0);
            }
        }
        i15 |= 3072;
        modifier4 = modifier2;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onClick)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier7 = c2314t;
            } else {
                modifier7 = modifier3;
            }
            if (i16 != 0) {
                modifier8 = c2314t;
            } else {
                modifier8 = modifier4;
            }
            type = state.getType();
            int resource4 = state.getResource();
            color = state.getColor();
            circleColor = state.getCircleColor();
            InterfaceC39332e pressedColor4 = state.getPressedColor();
            enabled = state.getEnabled();
            nonFunctional = state.getNonFunctional();
            shouldKeepOriginalIconColor = state.getShouldKeepOriginalIconColor();
            alpha = state.getAlpha();
            fill = state.getFill();
            jMo134584toComposableColorWaAFU9c = color.mo134584toComposableColorWaAFU9c(c28655q, 0);
            if (enabled) {
                if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                    if (alpha == 1.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                    }
                }
            } else if (C17919x.m51543e(jMo134584toComposableColorWaAFU9c) < 1.0f) {
                if (alpha == 1.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    alpha = C17919x.m51543e(jMo134584toComposableColorWaAFU9c);
                }
            }
            i18 = i15;
            float f16 = alpha;
            jM51541c = C17919x.m51541c(f16, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
            if (circleColor != null) {
                color = circleColor;
            }
            jM51541c2 = C17919x.m51541c(f16, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i4, c28655q, 6);
            if (type.getIsSecondary()) {
                i19 = 0;
                c1119dM43228a = AbstractC15210z4.m43228a(0L, 6, false, 0.0f);
            } else {
                i19 = 0;
                c1119dM43228a = null;
            }
            if (enabled) {
                z14 = i19;
            } else {
                z14 = i19;
            }
            C18027i c18027i4 = new C18027i(i19);
            if ((i18 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C12762e(onClick, 8);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12762e(onClick, 8);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierMo3471e4 = AbstractC1102d.m3419p(type.getTouchArea(), AbstractC1092a.m3360e(modifier7, interfaceC21083i4, c1119dM43228a, z14, c18027i4, (InterfaceC4339a) objM87133R2, 8)).mo3471e(modifier8);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            Modifier modifier12 = modifier8;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            Modifier modifierM3419p7 = AbstractC1102d.m3419p(type.getBorderDiameter(), c2314t);
            zM87155h = c28655q.m87155h(enabled) | c28655q.m87153g(interfaceC28601c1M44460m) | c28655q.m87155h(nonFunctional) | c28655q.m87155h(fill) | c28655q.m87153g(type) | c28655q.m87151f(jM51541c2);
            objM87133R3 = c28655q.m87133R();
            if (zM87155h) {
                interfaceC28601c1 = interfaceC28601c1M44460m;
                z16 = enabled;
                objM87133R3 = new Function1() { // from class: ny0.z0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                interfaceC28601c1 = interfaceC28601c1M44460m;
                z16 = enabled;
                objM87133R3 = new Function1() { // from class: ny0.z0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC27242b1.m82095g(z16, nonFunctional, fill, type, jM51541c2, interfaceC28601c1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3419p7, (Function1) objM87133R3, c28655q, 0);
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(resource4, c28655q, 6);
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(type.getImageSize(), c2314t);
            if (!m82093e(interfaceC28601c1)) {
                if (shouldKeepOriginalIconColor) {
                    c28655q.m87150e0(-628132065);
                    c28655q.m87173q(false);
                    jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                    j7 = jMo134584toComposableColorWaAFU9c2;
                } else {
                    c28655q.m87150e0(-628130910);
                    c28655q.m87173q(false);
                    j7 = jM51541c;
                }
            } else if (shouldKeepOriginalIconColor) {
                c28655q.m87150e0(-628132065);
                c28655q.m87173q(false);
                jMo134584toComposableColorWaAFU9c2 = C17919x.f69637n;
                j7 = jMo134584toComposableColorWaAFU9c2;
            } else {
                c28655q.m87150e0(-628130910);
                c28655q.m87173q(false);
                j7 = jM51541c;
            }
            AbstractC15005f3.m43108b(c27430eM107874S4, contentDescription, modifierM3419p8, j7, c28655q, i18 & 112, 0);
            c28655q.m87173q(true);
            modifier6 = modifier12;
            modifier5 = modifier7;
        } else {
            c28655q.m87138X();
            modifier5 = modifier3;
            modifier6 = modifier4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27239a1(state, contentDescription, modifier5, modifier6, onClick, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m82093e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82094f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82095g(boolean z4, boolean z13, boolean z14, AbstractC27274q abstractC27274q, long j7, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63379M(Canvas, j7, 0.0f, 0L, 0.0f, ((z4 && m82093e(interfaceC28670t2)) || z13 || z14) ? C22134h.f85857a : new C22135i(abstractC27274q.getBorderWidth(), 0.0f, 0, 0, null, 30), 110);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82096h(C27270o c27270o, String str, Modifier modifier, Modifier modifier2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82092d(c27270o, str, modifier, modifier2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
