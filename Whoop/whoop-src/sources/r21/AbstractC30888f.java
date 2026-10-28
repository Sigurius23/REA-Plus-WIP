package r21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.C23108i;
import p315m0.AbstractC24868a;
import p341nh.C26714h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import p730qt2.C30617w;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qv1.C30654e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: r21.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "content", "Lr21/a;", "style", "Lkd1/o;", "icon", "", "hasCloseButton", "imageSource", "supportText", "Lkotlin/Function0;", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30888f {
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x0176  */
    /* JADX WARN: Code duplicated, block: B:113:0x0196  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x020a  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b A[PHI: r11 r13 r14
      0x011b: PHI (r11v10 boolean) = (r11v5 boolean), (r11v3 boolean) binds: [B:102:0x012f, B:92:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v8 kd1.o) = (r13v4 kd1.o), (r13v3 kd1.o) binds: [B:102:0x012f, B:92:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r14v14 com.whoop.design.util.TextResource) = (r14v9 com.whoop.design.util.TextResource), (r14v7 com.whoop.design.util.TextResource) binds: [B:102:0x012f, B:92:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX INFO: renamed from: f */
    public static final void m94953f(Modifier modifier, final TextResource title, final TextResource content, final EnumC30883a style, final AbstractC22403o abstractC22403o, boolean z4, AbstractC22403o abstractC22403o2, TextResource textResource, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        AbstractC22403o abstractC22403o3;
        int i17;
        TextResource textResourceM21267a;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        boolean z14;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        boolean z15;
        AbstractC22403o abstractC22403o4;
        TextResource textResource2;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3356a;
        Object objM87133R;
        AbstractC22403o abstractC22403o5;
        final TextResource textResource3;
        final InterfaceC4339a interfaceC4339a4;
        EnumC39333f iconColor;
        C17919x c17919xM31989h;
        C33252i c33252iM64090c;
        InterfaceC21430b backgroundGradient;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(style, "style");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1585607547);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(content) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(style.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(abstractC22403o) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i24 = i14 & 32;
        if (i24 == 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    abstractC22403o3 = abstractC22403o2;
                    if (c28655q2.m87153g(abstractC22403o3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                if ((12582912 & i13) == 0) {
                    if ((i14 & 128) == 0) {
                        textResourceM21267a = textResource;
                        int i25 = c28655q2.m87153g(textResourceM21267a) ? 8388608 : 4194304;
                        i15 |= i25;
                    } else {
                        textResourceM21267a = textResource;
                    }
                    i15 |= i25;
                } else {
                    textResourceM21267a = textResource;
                }
                i18 = i14 & 256;
                if (i18 != 0) {
                    i15 |= 100663296;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i19 = 67108864;
                        } else {
                            i19 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i19;
                    }
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    modifierM3356a = null;
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        if (i24 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            abstractC22403o3 = null;
                        }
                        if ((i14 & 128) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C30654e(4);
                                c28655q2.m87172p0(objM87133R);
                            }
                            abstractC22403o5 = abstractC22403o3;
                            textResource3 = textResourceM21267a;
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        }
                        final boolean z16 = z13;
                        c28655q2.m87175r();
                        final long jMo134584toComposableColorWaAFU9c = style.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        final long jMo134584toComposableColorWaAFU9c2 = style.getContentColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        long jMo134584toComposableColorWaAFU9c3 = style.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                        iconColor = style.getIconColor();
                        if (iconColor == null) {
                            c28655q2.m87150e0(-783547223);
                            c28655q2.m87173q(false);
                            c17919xM31989h = null;
                        } else {
                            c28655q2.m87150e0(944555608);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                        }
                        c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                        backgroundGradient = style.getBackgroundGradient();
                        if (backgroundGradient == null) {
                            c28655q2.m87150e0(-783411629);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-783411628);
                            modifierM3356a = AbstractC1092a.m3356a(style.getBackgroundGradientAlpha(), C2314t.f9131w, backgroundGradient.mo60316a(c28655q2, 0), c33252iM64090c);
                            c28655q2.m87173q(false);
                        }
                        final AbstractC22403o abstractC22403o6 = abstractC22403o5;
                        final C17919x c17919x = c17919xM31989h;
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: r21.e
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC30888f.m94955h(style, content, jMo134584toComposableColorWaAFU9c2, abstractC22403o6, textResource3, abstractC22403o, title, jMo134584toComposableColorWaAFU9c, z16, interfaceC4339a4, c17919x, (Composer) obj, iIntValue);
                            }
                        };
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                        textResourceM21267a = textResource3;
                        AbstractC12889b.m36263b(AbstractC15676d.m44103f(modifier, modifierM3356a), c33252iM64090c, jMo134584toComposableColorWaAFU9c3, null, 0 * 4, AbstractC37817c.m121344e(2101438466, c28655q, interfaceC4351m), c28655q, 1769472, 24);
                        abstractC22403o4 = abstractC22403o6;
                        z15 = z16;
                        interfaceC4339a3 = interfaceC4339a5;
                    } else {
                        c28655q2.m87138X();
                    }
                    textResource3 = textResourceM21267a;
                    interfaceC4339a4 = interfaceC4339a2;
                    abstractC22403o5 = abstractC22403o3;
                    final boolean z17 = z13;
                    c28655q2.m87175r();
                    final long jMo134584toComposableColorWaAFU9c4 = style.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    final long jMo134584toComposableColorWaAFU9c5 = style.getContentColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    long jMo134584toComposableColorWaAFU9c6 = style.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    iconColor = style.getIconColor();
                    if (iconColor == null) {
                        c28655q2.m87150e0(-783547223);
                        c28655q2.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        c28655q2.m87150e0(944555608);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                    }
                    c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                    backgroundGradient = style.getBackgroundGradient();
                    if (backgroundGradient == null) {
                        c28655q2.m87150e0(-783411629);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-783411628);
                        modifierM3356a = AbstractC1092a.m3356a(style.getBackgroundGradientAlpha(), C2314t.f9131w, backgroundGradient.mo60316a(c28655q2, 0), c33252iM64090c);
                        c28655q2.m87173q(false);
                    }
                    final AbstractC22403o abstractC22403o7 = abstractC22403o5;
                    final C17919x c17919x2 = c17919xM31989h;
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: r21.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC30888f.m94955h(style, content, jMo134584toComposableColorWaAFU9c5, abstractC22403o7, textResource3, abstractC22403o, title, jMo134584toComposableColorWaAFU9c4, z17, interfaceC4339a4, c17919x2, (Composer) obj, iIntValue);
                        }
                    };
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                    textResourceM21267a = textResource3;
                    AbstractC12889b.m36263b(AbstractC15676d.m44103f(modifier, modifierM3356a), c33252iM64090c, jMo134584toComposableColorWaAFU9c6, null, 0 * 4, AbstractC37817c.m121344e(2101438466, c28655q, interfaceC4351m2), c28655q, 1769472, 24);
                    abstractC22403o4 = abstractC22403o7;
                    z15 = z17;
                    interfaceC4339a3 = interfaceC4339a6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z13;
                    abstractC22403o4 = abstractC22403o3;
                }
                textResource2 = textResourceM21267a;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(modifier, title, content, style, abstractC22403o, z15, abstractC22403o4, textResource2, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 1572864;
            abstractC22403o3 = abstractC22403o2;
            if ((12582912 & i13) == 0) {
                if ((i14 & 128) == 0) {
                    textResourceM21267a = textResource;
                    if (c28655q2.m87153g(textResourceM21267a)) {
                    }
                    i15 |= i25;
                } else {
                    textResourceM21267a = textResource;
                }
                i15 |= i25;
            } else {
                textResourceM21267a = textResource;
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = 67108864;
                    } else {
                        i19 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                modifierM3356a = null;
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        abstractC22403o3 = null;
                    }
                    if ((i14 & 128) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C30654e(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        abstractC22403o5 = abstractC22403o3;
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = interfaceC4339a2;
                        abstractC22403o5 = abstractC22403o3;
                    }
                } else {
                    if (i24 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        abstractC22403o3 = null;
                    }
                    if ((i14 & 128) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C30654e(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        abstractC22403o5 = abstractC22403o3;
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = interfaceC4339a2;
                        abstractC22403o5 = abstractC22403o3;
                    }
                }
                final boolean z18 = z13;
                c28655q2.m87175r();
                final long jMo134584toComposableColorWaAFU9c7 = style.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                final long jMo134584toComposableColorWaAFU9c8 = style.getContentColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c9 = style.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                iconColor = style.getIconColor();
                if (iconColor == null) {
                    c28655q2.m87150e0(-783547223);
                    c28655q2.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q2.m87150e0(944555608);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                }
                c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                backgroundGradient = style.getBackgroundGradient();
                if (backgroundGradient == null) {
                    c28655q2.m87150e0(-783411629);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-783411628);
                    modifierM3356a = AbstractC1092a.m3356a(style.getBackgroundGradientAlpha(), C2314t.f9131w, backgroundGradient.mo60316a(c28655q2, 0), c33252iM64090c);
                    c28655q2.m87173q(false);
                }
                final AbstractC22403o abstractC22403o8 = abstractC22403o5;
                final C17919x c17919x3 = c17919xM31989h;
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: r21.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC30888f.m94955h(style, content, jMo134584toComposableColorWaAFU9c8, abstractC22403o8, textResource3, abstractC22403o, title, jMo134584toComposableColorWaAFU9c7, z18, interfaceC4339a4, c17919x3, (Composer) obj, iIntValue);
                    }
                };
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                textResourceM21267a = textResource3;
                AbstractC12889b.m36263b(AbstractC15676d.m44103f(modifier, modifierM3356a), c33252iM64090c, jMo134584toComposableColorWaAFU9c9, null, 0 * 4, AbstractC37817c.m121344e(2101438466, c28655q, interfaceC4351m3), c28655q, 1769472, 24);
                abstractC22403o4 = abstractC22403o8;
                z15 = z18;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
                abstractC22403o4 = abstractC22403o3;
            }
            textResource2 = textResourceM21267a;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(modifier, title, content, style, abstractC22403o, z15, abstractC22403o4, textResource2, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                abstractC22403o3 = abstractC22403o2;
                if (c28655q2.m87153g(abstractC22403o3)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            if ((12582912 & i13) == 0) {
                if ((i14 & 128) == 0) {
                    textResourceM21267a = textResource;
                    if (c28655q2.m87153g(textResourceM21267a)) {
                    }
                    i15 |= i25;
                } else {
                    textResourceM21267a = textResource;
                }
                i15 |= i25;
            } else {
                textResourceM21267a = textResource;
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = 67108864;
                    } else {
                        i19 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                modifierM3356a = null;
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        abstractC22403o3 = null;
                    }
                    if ((i14 & 128) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C30654e(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        abstractC22403o5 = abstractC22403o3;
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = interfaceC4339a2;
                        abstractC22403o5 = abstractC22403o3;
                    }
                } else {
                    if (i24 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        abstractC22403o3 = null;
                    }
                    if ((i14 & 128) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C30654e(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        abstractC22403o5 = abstractC22403o3;
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        textResource3 = textResourceM21267a;
                        interfaceC4339a4 = interfaceC4339a2;
                        abstractC22403o5 = abstractC22403o3;
                    }
                }
                final boolean z19 = z13;
                c28655q2.m87175r();
                final long jMo134584toComposableColorWaAFU9c10 = style.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                final long jMo134584toComposableColorWaAFU9c11 = style.getContentColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                long jMo134584toComposableColorWaAFU9c12 = style.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                iconColor = style.getIconColor();
                if (iconColor == null) {
                    c28655q2.m87150e0(-783547223);
                    c28655q2.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q2.m87150e0(944555608);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
                }
                c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                backgroundGradient = style.getBackgroundGradient();
                if (backgroundGradient == null) {
                    c28655q2.m87150e0(-783411629);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-783411628);
                    modifierM3356a = AbstractC1092a.m3356a(style.getBackgroundGradientAlpha(), C2314t.f9131w, backgroundGradient.mo60316a(c28655q2, 0), c33252iM64090c);
                    c28655q2.m87173q(false);
                }
                final AbstractC22403o abstractC22403o9 = abstractC22403o5;
                final C17919x c17919x4 = c17919xM31989h;
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: r21.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC30888f.m94955h(style, content, jMo134584toComposableColorWaAFU9c11, abstractC22403o9, textResource3, abstractC22403o, title, jMo134584toComposableColorWaAFU9c10, z19, interfaceC4339a4, c17919x4, (Composer) obj, iIntValue);
                    }
                };
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                textResourceM21267a = textResource3;
                AbstractC12889b.m36263b(AbstractC15676d.m44103f(modifier, modifierM3356a), c33252iM64090c, jMo134584toComposableColorWaAFU9c12, null, 0 * 4, AbstractC37817c.m121344e(2101438466, c28655q, interfaceC4351m4), c28655q, 1769472, 24);
                abstractC22403o4 = abstractC22403o9;
                z15 = z19;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z13;
                abstractC22403o4 = abstractC22403o3;
            }
            textResource2 = textResourceM21267a;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(modifier, title, content, style, abstractC22403o, z15, abstractC22403o4, textResource2, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 1572864;
        abstractC22403o3 = abstractC22403o2;
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) == 0) {
                textResourceM21267a = textResource;
                if (c28655q2.m87153g(textResourceM21267a)) {
                }
                i15 |= i25;
            } else {
                textResourceM21267a = textResource;
            }
            i15 |= i25;
        } else {
            textResourceM21267a = textResource;
        }
        i18 = i14 & 256;
        if (i18 != 0) {
            i15 |= 100663296;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c28655q2.m87140Z();
            modifierM3356a = null;
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    abstractC22403o3 = null;
                }
                if ((i14 & 128) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30654e(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    abstractC22403o5 = abstractC22403o3;
                    textResource3 = textResourceM21267a;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    textResource3 = textResourceM21267a;
                    interfaceC4339a4 = interfaceC4339a2;
                    abstractC22403o5 = abstractC22403o3;
                }
            } else {
                if (i24 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    abstractC22403o3 = null;
                }
                if ((i14 & 128) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30654e(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    abstractC22403o5 = abstractC22403o3;
                    textResource3 = textResourceM21267a;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    textResource3 = textResourceM21267a;
                    interfaceC4339a4 = interfaceC4339a2;
                    abstractC22403o5 = abstractC22403o3;
                }
            }
            final boolean z110 = z13;
            c28655q2.m87175r();
            final long jMo134584toComposableColorWaAFU9c13 = style.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            final long jMo134584toComposableColorWaAFU9c14 = style.getContentColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            long jMo134584toComposableColorWaAFU9c15 = style.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            iconColor = style.getIconColor();
            if (iconColor == null) {
                c28655q2.m87150e0(-783547223);
                c28655q2.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q2.m87150e0(944555608);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            backgroundGradient = style.getBackgroundGradient();
            if (backgroundGradient == null) {
                c28655q2.m87150e0(-783411629);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-783411628);
                modifierM3356a = AbstractC1092a.m3356a(style.getBackgroundGradientAlpha(), C2314t.f9131w, backgroundGradient.mo60316a(c28655q2, 0), c33252iM64090c);
                c28655q2.m87173q(false);
            }
            final AbstractC22403o abstractC22403o10 = abstractC22403o5;
            final C17919x c17919x5 = c17919xM31989h;
            c28655q = c28655q2;
            InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: r21.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC30888f.m94955h(style, content, jMo134584toComposableColorWaAFU9c14, abstractC22403o10, textResource3, abstractC22403o, title, jMo134584toComposableColorWaAFU9c13, z110, interfaceC4339a4, c17919x5, (Composer) obj, iIntValue);
                }
            };
            InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
            textResourceM21267a = textResource3;
            AbstractC12889b.m36263b(AbstractC15676d.m44103f(modifier, modifierM3356a), c33252iM64090c, jMo134584toComposableColorWaAFU9c15, null, 0 * 4, AbstractC37817c.m121344e(2101438466, c28655q, interfaceC4351m5), c28655q, 1769472, 24);
            abstractC22403o4 = abstractC22403o10;
            z15 = z110;
            interfaceC4339a3 = interfaceC4339a9;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            z15 = z13;
            abstractC22403o4 = abstractC22403o3;
        }
        textResource2 = textResourceM21267a;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(modifier, title, content, style, abstractC22403o, z15, abstractC22403o4, textResource2, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m94954g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
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
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m94955h(EnumC30883a enumC30883a, TextResource textResource, long j7, AbstractC22403o abstractC22403o, TextResource textResource2, AbstractC22403o abstractC22403o2, TextResource textResource3, long j13, boolean z4, InterfaceC4339a interfaceC4339a, C17919x c17919x, Composer composer, int i13) {
        C2314t c2314t;
        ?? r10;
        C28655q c28655q;
        C2886a c2886aM8420a;
        boolean z13;
        C28655q c28655q2;
        boolean z14;
        Object obj;
        ?? r14;
        C28655q c28655q3;
        C28655q c28655q4;
        C28655q c28655q5;
        C28655q c28655q6 = (C28655q) composer;
        if (c28655q6.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC30883a enumC30883a2 = EnumC30883a.JUMPSTART;
            float f13 = (enumC30883a == enumC30883a2 ? 1 : 2) * 8;
            float f14 = 2;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t2, 8 * f14, f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q6, 0);
            int iHashCode = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(c0213j);
            } else {
                c28655q6.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q6, 48);
            int iHashCode2 = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q6, c2314t2);
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(c0213j);
            } else {
                c28655q6.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q6, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N2);
            if (abstractC22403o2 == null) {
                c28655q6.m87150e0(2146803648);
                c28655q6.m87173q(false);
                r10 = 0;
                c2314t = c2314t2;
                c28655q = c28655q6;
            } else {
                c28655q6.m87150e0(2146803649);
                float f15 = 4;
                c2314t = c2314t2;
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(abstractC22403o2, null, null, c28655q6, 0, 3), "", AbstractC1102d.m3419p(6 * f15, c2314t2), c17919x != null ? c17919x.f69639a : j13, c28655q6, 432, 0);
                C28655q c28655q7 = c28655q6;
                r10 = 0;
                AbstractC31061c.m95650z(f14, f15, c2314t, c28655q7, false);
                c28655q = c28655q7;
            }
            String strM21274h = AbstractC8693b.m21274h(textResource3, c28655q, r10);
            C36775k c36775k = new C36775k(1);
            if (enumC30883a == enumC30883a2) {
                c28655q.m87150e0(2147401298);
                c2886aM8420a = C38072d.f163053a.m121952e(c28655q, 6).getB2();
                c28655q.m87173q(r10);
            } else {
                c28655q.m87150e0(2147478674);
                c2886aM8420a = C38072d.f163053a.m121952e(c28655q, 6).getB1();
                c28655q.m87173q(r10);
            }
            C28655q c28655q8 = c28655q;
            AbstractC30795n.m94707h(strM21274h, null, j13, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q8, 0, 0, 196090);
            C28655q c28655q9 = c28655q8;
            Object obj2 = C28635l.f115821a;
            if (z4) {
                c28655q9.m87150e0(-2147348998);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q9, new LayoutWeightElement(1.0f, true));
                C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, false, false, false, 0.5f, false, 764, null);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q9, AbstractC16277f.f62253K);
                boolean zM87153g = c28655q9.m87153g(interfaceC4339a);
                Object objM87133R = c28655q9.m87133R();
                Object obj3 = objM87133R;
                if (zM87153g || objM87133R == obj2) {
                    Object c28329e = new C28329e(interfaceC4339a, 20);
                    c28655q9.m87172p0(c28329e);
                    obj3 = c28329e;
                }
                AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) obj3, c28655q9, 0, 12);
                z13 = false;
                c28655q9.m87173q(false);
            } else {
                z13 = false;
                c28655q9.m87150e0(-2146856966);
                c28655q9.m87173q(false);
            }
            c28655q9.m87173q(true);
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q9.m87150e0(65554645);
                float f16 = 4;
                AbstractC18489d0.m53380u(f16, f16, c2314t, c28655q9);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q9, z13 ? 1 : 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q9, 6).getB1(), null, c28655q9, 0, 0, 196602);
                z14 = false;
                c28655q5.m87173q(false);
            } else {
                c28655q9.m87150e0(65801622);
                c28655q9.m87173q(z13);
            }
            if (abstractC22403o == null) {
                z14 = z13;
                c28655q2 = c28655q9;
                c28655q2.m87150e0(65838139);
                c28655q2.m87173q(z14);
            } else {
                z14 = z13;
                c28655q2 = c28655q9;
                c28655q2.m87150e0(65838140);
                float f17 = 4;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f17 * f17, 0.0f, 0.0f, 13);
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == obj2) {
                    c28655q5 = c28655q9;
                    c28655q2 = c28655q5;
                    obj = objM87133R2;
                    Object c30617w = new C30617w(16);
                    c28655q2.m87172p0(c30617w);
                    obj = c30617w;
                }
                c28655q5 = c28655q9;
                c28655q2 = c28655q5;
                obj = objM87133R2;
                C28655q c28655q10 = c28655q2;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, (Function1) obj, c28655q2, 384, 1), null, modifierM3398t, null, C39102j.f168200b, 0.0f, null, c28655q10, 25008, 104);
                C28655q c28655q11 = c28655q10;
                r14 = 0;
                c28655q11.m87173q(false);
                c28655q3 = c28655q11;
            }
            if (textResource2 == null) {
                c28655q5 = c28655q9;
                c28655q2 = c28655q5;
                r14 = z14;
                c28655q3 = c28655q2;
                c28655q3.m87150e0(66177031);
                c28655q3.m87173q(r14);
                c28655q4 = c28655q3;
            } else {
                c28655q5 = c28655q9;
                c28655q2 = c28655q5;
                r14 = z14;
                c28655q3 = c28655q2;
                c28655q3.m87150e0(66177032);
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q3, r14);
                float f18 = 4;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f18 * f18, 0.0f, 0.0f, 13);
                C38072d c38072d = C38072d.f163053a;
                C28655q c28655q12 = c28655q3;
                AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB3(), null, c28655q12, 48, 0, 196088);
                C28655q c28655q13 = c28655q12;
                c28655q13.m87173q(false);
                c28655q4 = c28655q13;
            }
            c28655q4.m87173q(true);
        } else {
            c28655q6.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m94956i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m94957j(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75121e(C26714h.f106216c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m94958k(Modifier modifier, TextResource textResource, TextResource textResource2, EnumC30883a enumC30883a, AbstractC22403o abstractC22403o, boolean z4, AbstractC22403o abstractC22403o2, TextResource textResource3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m94953f(modifier, textResource, textResource2, enumC30883a, abstractC22403o, z4, abstractC22403o2, textResource3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
