package eu2;

import a81.C0555f;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d30.C11546l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: eu2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aY\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0018\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0012H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "text", "", "enabled", "Ly81/e;", "color", "useAccentColor", "inCtaRow", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "g", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLy81/e;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "EVENT", "Leu2/b;", "ctaState", "Lkotlin/Function1;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Leu2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "leftCta", "rightCta", "e", "(Landroidx/compose/ui/Modifier;Leu2/b;Leu2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13653j {
    /* JADX INFO: renamed from: e */
    public static final <EVENT> void m38493e(Modifier modifier, C13645b<EVENT> leftCta, C13645b<EVENT> rightCta, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(leftCta, "leftCta");
        AbstractC22676k.m65750j(rightCta, "rightCta");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1458780102);
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
            i15 |= c28655q.m87157i(leftCta) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(rightCta) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 4 * f13, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            int i17 = ((i15 >> 3) & 14) | 3072;
            int i18 = i15 >> 6;
            int i19 = i18 & 112;
            m38496h(leftCta, onViewEvent, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, c28655q, i17 | i19, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m38496h(rightCta, onViewEvent, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, c28655q, (i18 & 14) | 3072 | i19, 0);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) modifier3, (Object) leftCta, (Object) rightCta, onViewEvent, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m38494f(Modifier modifier, C13645b c13645b, C13645b c13645b2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38493e(modifier, c13645b, c13645b2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x017f  */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    /* JADX INFO: renamed from: g */
    public static final void m38495g(Modifier modifier, String text, boolean z4, InterfaceC39332e interfaceC39332e, boolean z13, boolean z14, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z15;
        int i16;
        InterfaceC39332e interfaceC39332e2;
        int i17;
        int i18;
        boolean z16;
        int i19;
        int i24;
        int i25;
        boolean z17;
        boolean z18;
        Modifier modifier3;
        boolean z19;
        InterfaceC39332e interfaceC39332e3;
        boolean z24;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        InterfaceC39332e interfaceC39332e4;
        boolean z25;
        Modifier modifierM3396r;
        long jM95624D;
        int i26;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-204892394);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q.m87153g(text) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                z15 = z4;
                i15 |= c28655q.m87155h(z15) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC39332e2 = interfaceC39332e;
                    if (c28655q.m87157i(interfaceC39332e2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        z16 = z13;
                        if (c28655q.m87155h(z16)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87155h(z14)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(onClick)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    if ((i15 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z17)) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i28 != 0) {
                            z19 = true;
                        } else {
                            z19 = z15;
                        }
                        if (i16 != 0) {
                            interfaceC39332e4 = null;
                        } else {
                            interfaceC39332e4 = interfaceC39332e2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i24 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (z25) {
                            modifierM3396r = modifier4;
                        } else {
                            modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                        }
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        if (interfaceC39332e4 != null) {
                            c28655q.m87150e0(666920905);
                            jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                            c28655q.m87173q(false);
                        } else if (z16) {
                            c28655q.m87150e0(666923074);
                            jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(666924704);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                        }
                        int i29 = i15 << 3;
                        AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v, text, z19, jM95624D, null, false, onClick, c28655q, (i29 & 896) | 48 | (i29 & 7168) | (i29 & 29360128), 96);
                        z18 = z25;
                        modifier3 = modifier4;
                        interfaceC39332e3 = interfaceC39332e4;
                    } else {
                        c28655q.m87138X();
                        z18 = z14;
                        modifier3 = modifier2;
                        z19 = z15;
                        interfaceC39332e3 = interfaceC39332e2;
                    }
                    z24 = z16;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
                    }
                }
                i15 |= 24576;
                z16 = z13;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i28 != 0) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    if (i16 != 0) {
                        interfaceC39332e4 = null;
                    } else {
                        interfaceC39332e4 = interfaceC39332e2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (z25) {
                        modifierM3396r = modifier4;
                    } else {
                        modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                    }
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    if (interfaceC39332e4 != null) {
                        c28655q.m87150e0(666920905);
                        jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    } else if (z16) {
                        c28655q.m87150e0(666923074);
                        jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(666924704);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    int i210 = i15 << 3;
                    AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v2, text, z19, jM95624D, null, false, onClick, c28655q, (i210 & 896) | 48 | (i210 & 7168) | (i210 & 29360128), 96);
                    z18 = z25;
                    modifier3 = modifier4;
                    interfaceC39332e3 = interfaceC39332e4;
                } else {
                    c28655q.m87138X();
                    z18 = z14;
                    modifier3 = modifier2;
                    z19 = z15;
                    interfaceC39332e3 = interfaceC39332e2;
                }
                z24 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC39332e2 = interfaceC39332e;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i28 != 0) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    if (i16 != 0) {
                        interfaceC39332e4 = null;
                    } else {
                        interfaceC39332e4 = interfaceC39332e2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (z25) {
                        modifierM3396r = modifier4;
                    } else {
                        modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                    }
                    EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                    if (interfaceC39332e4 != null) {
                        c28655q.m87150e0(666920905);
                        jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    } else if (z16) {
                        c28655q.m87150e0(666923074);
                        jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(666924704);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    int i211 = i15 << 3;
                    AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v3, text, z19, jM95624D, null, false, onClick, c28655q, (i211 & 896) | 48 | (i211 & 7168) | (i211 & 29360128), 96);
                    z18 = z25;
                    modifier3 = modifier4;
                    interfaceC39332e3 = interfaceC39332e4;
                } else {
                    c28655q.m87138X();
                    z18 = z14;
                    modifier3 = modifier2;
                    z19 = z15;
                    interfaceC39332e3 = interfaceC39332e2;
                }
                z24 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
                }
            }
            i15 |= 24576;
            z16 = z13;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i28 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                if (i16 != 0) {
                    interfaceC39332e4 = null;
                } else {
                    interfaceC39332e4 = interfaceC39332e2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (z25) {
                    modifierM3396r = modifier4;
                } else {
                    modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                }
                EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                if (interfaceC39332e4 != null) {
                    c28655q.m87150e0(666920905);
                    jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                } else if (z16) {
                    c28655q.m87150e0(666923074);
                    jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(666924704);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                int i212 = i15 << 3;
                AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v4, text, z19, jM95624D, null, false, onClick, c28655q, (i212 & 896) | 48 | (i212 & 7168) | (i212 & 29360128), 96);
                z18 = z25;
                modifier3 = modifier4;
                interfaceC39332e3 = interfaceC39332e4;
            } else {
                c28655q.m87138X();
                z18 = z14;
                modifier3 = modifier2;
                z19 = z15;
                interfaceC39332e3 = interfaceC39332e2;
            }
            z24 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
            }
        }
        i15 |= 384;
        z15 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC39332e2 = interfaceC39332e;
                if (c28655q.m87157i(interfaceC39332e2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                if ((i15 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i15 & 1, z17)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i28 != 0) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    if (i16 != 0) {
                        interfaceC39332e4 = null;
                    } else {
                        interfaceC39332e4 = interfaceC39332e2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i24 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (z25) {
                        modifierM3396r = modifier4;
                    } else {
                        modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                    }
                    EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                    if (interfaceC39332e4 != null) {
                        c28655q.m87150e0(666920905);
                        jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    } else if (z16) {
                        c28655q.m87150e0(666923074);
                        jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(666924704);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    int i213 = i15 << 3;
                    AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v5, text, z19, jM95624D, null, false, onClick, c28655q, (i213 & 896) | 48 | (i213 & 7168) | (i213 & 29360128), 96);
                    z18 = z25;
                    modifier3 = modifier4;
                    interfaceC39332e3 = interfaceC39332e4;
                } else {
                    c28655q.m87138X();
                    z18 = z14;
                    modifier3 = modifier2;
                    z19 = z15;
                    interfaceC39332e3 = interfaceC39332e2;
                }
                z24 = z16;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
                }
            }
            i15 |= 24576;
            z16 = z13;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i28 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                if (i16 != 0) {
                    interfaceC39332e4 = null;
                } else {
                    interfaceC39332e4 = interfaceC39332e2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (z25) {
                    modifierM3396r = modifier4;
                } else {
                    modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                }
                EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                if (interfaceC39332e4 != null) {
                    c28655q.m87150e0(666920905);
                    jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                } else if (z16) {
                    c28655q.m87150e0(666923074);
                    jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(666924704);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                int i214 = i15 << 3;
                AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v6, text, z19, jM95624D, null, false, onClick, c28655q, (i214 & 896) | 48 | (i214 & 7168) | (i214 & 29360128), 96);
                z18 = z25;
                modifier3 = modifier4;
                interfaceC39332e3 = interfaceC39332e4;
            } else {
                c28655q.m87138X();
                z18 = z14;
                modifier3 = modifier2;
                z19 = z15;
                interfaceC39332e3 = interfaceC39332e2;
            }
            z24 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC39332e2 = interfaceC39332e;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                z16 = z13;
                if (c28655q.m87155h(z16)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            if ((i15 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (c28655q.m87135U(i15 & 1, z17)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i28 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                if (i16 != 0) {
                    interfaceC39332e4 = null;
                } else {
                    interfaceC39332e4 = interfaceC39332e2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i24 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (z25) {
                    modifierM3396r = modifier4;
                } else {
                    modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
                }
                EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                if (interfaceC39332e4 != null) {
                    c28655q.m87150e0(666920905);
                    jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                } else if (z16) {
                    c28655q.m87150e0(666923074);
                    jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(666924704);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                int i215 = i15 << 3;
                AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v7, text, z19, jM95624D, null, false, onClick, c28655q, (i215 & 896) | 48 | (i215 & 7168) | (i215 & 29360128), 96);
                z18 = z25;
                modifier3 = modifier4;
                interfaceC39332e3 = interfaceC39332e4;
            } else {
                c28655q.m87138X();
                z18 = z14;
                modifier3 = modifier2;
                z19 = z15;
                interfaceC39332e3 = interfaceC39332e2;
            }
            z24 = z16;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
            }
        }
        i15 |= 24576;
        z16 = z13;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87155h(z14)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87157i(onClick)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        if ((i15 & 599187) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c28655q.m87135U(i15 & 1, z17)) {
            if (i27 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i28 != 0) {
                z19 = true;
            } else {
                z19 = z15;
            }
            if (i16 != 0) {
                interfaceC39332e4 = null;
            } else {
                interfaceC39332e4 = interfaceC39332e2;
            }
            if (i18 != 0) {
                z16 = true;
            }
            if (i24 != 0) {
                z25 = false;
            } else {
                z25 = z14;
            }
            if (z25) {
                modifierM3396r = modifier4;
            } else {
                modifierM3396r = AbstractC1099a.m3396r(modifier4, 4 * 8, 0.0f, 2);
            }
            EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
            if (interfaceC39332e4 != null) {
                c28655q.m87150e0(666920905);
                jM95624D = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 9) & 14);
                c28655q.m87173q(false);
            } else if (z16) {
                c28655q.m87150e0(666923074);
                jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(666924704);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            int i216 = i15 << 3;
            AbstractC27282u.m82292h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifierM3396r), 0.0f, 2 * 8, 1), enumC27284v8, text, z19, jM95624D, null, false, onClick, c28655q, (i216 & 896) | 48 | (i216 & 7168) | (i216 & 29360128), 96);
            z18 = z25;
            modifier3 = modifier4;
            interfaceC39332e3 = interfaceC39332e4;
        } else {
            c28655q.m87138X();
            z18 = z14;
            modifier3 = modifier2;
            z19 = z15;
            interfaceC39332e3 = interfaceC39332e2;
        }
        z24 = z16;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13652i(modifier3, text, z19, interfaceC39332e3, z24, z18, onClick, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final <EVENT> void m38496h(C13645b<EVENT> ctaState, Function1 onViewEvent, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        boolean zM87157i;
        Object objM87133R;
        AbstractC22676k.m65750j(ctaState, "ctaState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(699994481);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(ctaState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    boolean z16 = i16 == 0 ? z13 : false;
                    String strM21274h = AbstractC8693b.m21274h(ctaState.getText(), c28655q, TextResource.$stable);
                    boolean enabled = ctaState.getEnabled();
                    InterfaceC39332e color = ctaState.getColor();
                    zM87157i = c28655q.m87157i(ctaState) | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C11546l(21, onViewEvent, ctaState);
                        c28655q.m87172p0(objM87133R);
                    }
                    m38495g(modifier2, strM21274h, enabled, color, false, z16, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 6) & 14) | ((i15 << 6) & 458752), 16);
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                }
                modifier3 = modifier2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(ctaState, onViewEvent, modifier3, z15, i13, i14, 6);
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 == 0) {
                }
                String strM21274h2 = AbstractC8693b.m21274h(ctaState.getText(), c28655q, TextResource.$stable);
                boolean enabled2 = ctaState.getEnabled();
                InterfaceC39332e color2 = ctaState.getColor();
                zM87157i = c28655q.m87157i(ctaState) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C11546l(21, onViewEvent, ctaState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11546l(21, onViewEvent, ctaState);
                    c28655q.m87172p0(objM87133R);
                }
                m38495g(modifier2, strM21274h2, enabled2, color2, false, z16, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 6) & 14) | ((i15 << 6) & 458752), 16);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(ctaState, onViewEvent, modifier3, z15, i13, i14, 6);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 == 0) {
                }
                String strM21274h3 = AbstractC8693b.m21274h(ctaState.getText(), c28655q, TextResource.$stable);
                boolean enabled3 = ctaState.getEnabled();
                InterfaceC39332e color3 = ctaState.getColor();
                zM87157i = c28655q.m87157i(ctaState) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C11546l(21, onViewEvent, ctaState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11546l(21, onViewEvent, ctaState);
                    c28655q.m87172p0(objM87133R);
                }
                m38495g(modifier2, strM21274h3, enabled3, color3, false, z16, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 6) & 14) | ((i15 << 6) & 458752), 16);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(ctaState, onViewEvent, modifier3, z15, i13, i14, 6);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i16 == 0) {
            }
            String strM21274h4 = AbstractC8693b.m21274h(ctaState.getText(), c28655q, TextResource.$stable);
            boolean enabled4 = ctaState.getEnabled();
            InterfaceC39332e color4 = ctaState.getColor();
            zM87157i = c28655q.m87157i(ctaState) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C11546l(21, onViewEvent, ctaState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11546l(21, onViewEvent, ctaState);
                c28655q.m87172p0(objM87133R);
            }
            m38495g(modifier2, strM21274h4, enabled4, color4, false, z16, (InterfaceC4339a) objM87133R, c28655q, ((i15 >> 6) & 14) | ((i15 << 6) & 458752), 16);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(ctaState, onViewEvent, modifier3, z15, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m38497i(Modifier modifier, String str, boolean z4, InterfaceC39332e interfaceC39332e, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m38495g(modifier, str, z4, interfaceC39332e, z13, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m38498j(Function1 function1, C13645b c13645b) {
        function1.invoke(c13645b.m38444a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m38499k(C13645b c13645b, Function1 function1, Modifier modifier, boolean z4, int i13, int i14, Composer composer, int i15) {
        m38496h(c13645b, function1, modifier, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
