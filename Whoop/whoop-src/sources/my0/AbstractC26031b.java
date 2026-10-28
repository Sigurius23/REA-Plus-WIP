package my0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ge3.AbstractC15751g;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: my0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", "Lkd1/o;", "sources", "Ly3/f;", "diameter", "overlap", "Landroidx/compose/ui/Modifier;", "modifier", "borderWidth", "Li2/x;", "borderColor", "Ll83/a0;", "c", "(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26031b {
    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0172  */
    /* JADX WARN: Code duplicated, block: B:106:0x0174  */
    /* JADX WARN: Code duplicated, block: B:109:0x019f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x0204 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0149  */
    /* JADX INFO: renamed from: c */
    public static final void m77439c(List<? extends AbstractC22403o> sources, float f13, float f14, Modifier modifier, float f15, C17919x c17919x, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f16;
        int i16;
        int i17;
        C17919x c17919x2;
        int i18;
        boolean z4;
        boolean z13;
        float f17;
        Modifier modifier3;
        float f18;
        C17919x c17919x3;
        C28677v1 c28677v1M87180u;
        C26030a c26030a;
        C2314t c2314t;
        Modifier modifier4;
        float f19;
        C17919x c17919x4;
        float f24;
        C17919x c17919x5;
        boolean z14;
        float f25;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        int i24;
        float fM118951C;
        C33252i c33252i;
        Modifier modifierM118994r;
        Modifier modifierMo3471e;
        AbstractC22676k.m65750j(sources, "sources");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1250546685);
        int i25 = 2;
        int i26 = (i13 & 6) == 0 ? (c28655q.m87157i(sources) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i26 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i26 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        int i27 = i14 & 8;
        if (i27 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i26 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 = i14 & 16;
            if (i15 != 0) {
                if ((i13 & 24576) == 0) {
                    f16 = f15;
                    if (c28655q.m87147d(f16)) {
                        i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i26 |= i16;
                }
                i17 = i14 & 32;
                if (i17 != 0) {
                    if ((196608 & i13) == 0) {
                        c17919x2 = c17919x;
                        if (c28655q.m87153g(c17919x2)) {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i26 |= i18;
                    }
                    z4 = true;
                    if ((74899 & i26) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i15 != 0) {
                            f19 = (float) 1.5d;
                        } else {
                            f19 = f16;
                        }
                        if (i17 != 0) {
                            c17919x4 = null;
                        } else {
                            c17919x4 = c17919x2;
                        }
                        if (sources.isEmpty()) {
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                return;
                            } else {
                                c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                            }
                        } else {
                            f17 = f13;
                            Modifier modifier5 = modifier4;
                            f24 = f19;
                            c17919x5 = c17919x4;
                            if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            f25 = f17 - f14;
                            Modifier modifierM3424u = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier5);
                            if (z14) {
                                c2307m = C2299e.f9103F;
                            } else {
                                c2307m = C2299e.f9117z;
                            }
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
                            c28655q.m87150e0(1547772419);
                            i19 = 0;
                            for (Object obj : sources) {
                                i24 = i19 + 1;
                                if (i19 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                AbstractC22403o abstractC22403o = (AbstractC22403o) obj;
                                if (z14) {
                                    fM118951C = i19;
                                } else {
                                    fM118951C = AbstractC37056f.m118951C(sources) - i19;
                                }
                                int i28 = i19;
                                float f26 = fM118951C;
                                C28655q c28655q2 = c28655q;
                                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q2, 0, 3);
                                Modifier modifierM3419p = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i28 * f25, 0.0f, i25));
                                c33252i = AbstractC33253j.f138651a;
                                modifierM118994r = AbstractC37056f.m118994r(modifierM3419p, c33252i);
                                if (c17919x5 != null) {
                                    modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                                } else {
                                    modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                                }
                                c28655q = c28655q2;
                                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC2294a.m7154a(f26, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                                z4 = true;
                                i19 = i24;
                                c17919x5 = c17919x5;
                                f24 = f24;
                                i25 = 2;
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(z4);
                            modifier3 = modifier5;
                            c17919x3 = c17919x5;
                            f18 = f24;
                        }
                        c28677v1M87180u.f115982d = c26030a;
                    }
                    f17 = f13;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f18 = f16;
                    c17919x3 = c17919x2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                        c28677v1M87180u.f115982d = c26030a;
                    }
                }
                i26 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                c17919x2 = c17919x;
                z4 = true;
                if ((74899 & i26) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i26 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i15 != 0) {
                        f19 = (float) 1.5d;
                    } else {
                        f19 = f16;
                    }
                    if (i17 != 0) {
                        c17919x4 = null;
                    } else {
                        c17919x4 = c17919x2;
                    }
                    if (sources.isEmpty()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        } else {
                            c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                        }
                    } else {
                        f17 = f13;
                        Modifier modifier6 = modifier4;
                        f24 = f19;
                        c17919x5 = c17919x4;
                        if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        f25 = f17 - f14;
                        Modifier modifierM3424u2 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier6);
                        if (z14) {
                            c2307m = C2299e.f9103F;
                        } else {
                            c2307m = C2299e.f9117z;
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
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
                        c28655q.m87150e0(1547772419);
                        i19 = 0;
                        while (r18.hasNext()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC22403o abstractC22403o2 = (AbstractC22403o) obj;
                            if (z14) {
                                fM118951C = i19;
                            } else {
                                fM118951C = AbstractC37056f.m118951C(sources) - i19;
                            }
                            int i29 = i19;
                            float f27 = fM118951C;
                            C28655q c28655q3 = c28655q;
                            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403o2, null, null, c28655q3, 0, 3);
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i29 * f25, 0.0f, i25));
                            c33252i = AbstractC33253j.f138651a;
                            modifierM118994r = AbstractC37056f.m118994r(modifierM3419p2, c33252i);
                            if (c17919x5 != null) {
                                modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                            } else {
                                modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                            }
                            c28655q = c28655q3;
                            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC2294a.m7154a(f27, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            z4 = true;
                            i19 = i24;
                            c17919x5 = c17919x5;
                            f24 = f24;
                            i25 = 2;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(z4);
                        modifier3 = modifier6;
                        c17919x3 = c17919x5;
                        f18 = f24;
                    }
                    c28677v1M87180u.f115982d = c26030a;
                }
                f17 = f13;
                c28655q.m87138X();
                modifier3 = modifier2;
                f18 = f16;
                c17919x3 = c17919x2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                    c28677v1M87180u.f115982d = c26030a;
                }
            }
            i26 |= 24576;
            f16 = f15;
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    c17919x2 = c17919x;
                    if (c28655q.m87153g(c17919x2)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i26 |= i18;
                }
                z4 = true;
                if ((74899 & i26) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i26 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i15 != 0) {
                        f19 = (float) 1.5d;
                    } else {
                        f19 = f16;
                    }
                    if (i17 != 0) {
                        c17919x4 = null;
                    } else {
                        c17919x4 = c17919x2;
                    }
                    if (sources.isEmpty()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        } else {
                            c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                        }
                    } else {
                        f17 = f13;
                        Modifier modifier7 = modifier4;
                        f24 = f19;
                        c17919x5 = c17919x4;
                        if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        f25 = f17 - f14;
                        Modifier modifierM3424u3 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier7);
                        if (z14) {
                            c2307m = C2299e.f9103F;
                        } else {
                            c2307m = C2299e.f9117z;
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3424u3);
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
                        c28655q.m87150e0(1547772419);
                        i19 = 0;
                        while (r18.hasNext()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC22403o abstractC22403o3 = (AbstractC22403o) obj;
                            if (z14) {
                                fM118951C = i19;
                            } else {
                                fM118951C = AbstractC37056f.m118951C(sources) - i19;
                            }
                            int i210 = i19;
                            float f28 = fM118951C;
                            C28655q c28655q4 = c28655q;
                            AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q4, 0, 3);
                            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i210 * f25, 0.0f, i25));
                            c33252i = AbstractC33253j.f138651a;
                            modifierM118994r = AbstractC37056f.m118994r(modifierM3419p3, c33252i);
                            if (c17919x5 != null) {
                                modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                            } else {
                                modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                            }
                            c28655q = c28655q4;
                            AbstractC29125c.m88522c(abstractC26165aM64500i3, null, AbstractC2294a.m7154a(f28, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            z4 = true;
                            i19 = i24;
                            c17919x5 = c17919x5;
                            f24 = f24;
                            i25 = 2;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(z4);
                        modifier3 = modifier7;
                        c17919x3 = c17919x5;
                        f18 = f24;
                    }
                    c28677v1M87180u.f115982d = c26030a;
                }
                f17 = f13;
                c28655q.m87138X();
                modifier3 = modifier2;
                f18 = f16;
                c17919x3 = c17919x2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                    c28677v1M87180u.f115982d = c26030a;
                }
            }
            i26 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c17919x2 = c17919x;
            z4 = true;
            if ((74899 & i26) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i26 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i15 != 0) {
                    f19 = (float) 1.5d;
                } else {
                    f19 = f16;
                }
                if (i17 != 0) {
                    c17919x4 = null;
                } else {
                    c17919x4 = c17919x2;
                }
                if (sources.isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                    }
                } else {
                    f17 = f13;
                    Modifier modifier8 = modifier4;
                    f24 = f19;
                    c17919x5 = c17919x4;
                    if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    f25 = f17 - f14;
                    Modifier modifierM3424u4 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier8);
                    if (z14) {
                        c2307m = C2299e.f9103F;
                    } else {
                        c2307m = C2299e.f9117z;
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3424u4);
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
                    c28655q.m87150e0(1547772419);
                    i19 = 0;
                    while (r18.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC22403o abstractC22403o4 = (AbstractC22403o) obj;
                        if (z14) {
                            fM118951C = i19;
                        } else {
                            fM118951C = AbstractC37056f.m118951C(sources) - i19;
                        }
                        int i211 = i19;
                        float f29 = fM118951C;
                        C28655q c28655q5 = c28655q;
                        AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(abstractC22403o4, null, null, c28655q5, 0, 3);
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i211 * f25, 0.0f, i25));
                        c33252i = AbstractC33253j.f138651a;
                        modifierM118994r = AbstractC37056f.m118994r(modifierM3419p4, c33252i);
                        if (c17919x5 != null) {
                            modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                        } else {
                            modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                        }
                        c28655q = c28655q5;
                        AbstractC29125c.m88522c(abstractC26165aM64500i4, null, AbstractC2294a.m7154a(f29, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        z4 = true;
                        i19 = i24;
                        c17919x5 = c17919x5;
                        f24 = f24;
                        i25 = 2;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    modifier3 = modifier8;
                    c17919x3 = c17919x5;
                    f18 = f24;
                }
                c28677v1M87180u.f115982d = c26030a;
            }
            f17 = f13;
            c28655q.m87138X();
            modifier3 = modifier2;
            f18 = f16;
            c17919x3 = c17919x2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                c28677v1M87180u.f115982d = c26030a;
            }
        }
        i26 |= 3072;
        modifier2 = modifier;
        i15 = i14 & 16;
        if (i15 != 0) {
            if ((i13 & 24576) == 0) {
                f16 = f15;
                if (c28655q.m87147d(f16)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i26 |= i16;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    c17919x2 = c17919x;
                    if (c28655q.m87153g(c17919x2)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i26 |= i18;
                }
                z4 = true;
                if ((74899 & i26) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i26 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i15 != 0) {
                        f19 = (float) 1.5d;
                    } else {
                        f19 = f16;
                    }
                    if (i17 != 0) {
                        c17919x4 = null;
                    } else {
                        c17919x4 = c17919x2;
                    }
                    if (sources.isEmpty()) {
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        } else {
                            c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                        }
                    } else {
                        f17 = f13;
                        Modifier modifier9 = modifier4;
                        f24 = f19;
                        c17919x5 = c17919x4;
                        if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        f25 = f17 - f14;
                        Modifier modifierM3424u5 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier9);
                        if (z14) {
                            c2307m = C2299e.f9103F;
                        } else {
                            c2307m = C2299e.f9117z;
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3424u5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        c28655q.m87150e0(1547772419);
                        i19 = 0;
                        while (r18.hasNext()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC22403o abstractC22403o5 = (AbstractC22403o) obj;
                            if (z14) {
                                fM118951C = i19;
                            } else {
                                fM118951C = AbstractC37056f.m118951C(sources) - i19;
                            }
                            int i212 = i19;
                            float f210 = fM118951C;
                            C28655q c28655q6 = c28655q;
                            AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(abstractC22403o5, null, null, c28655q6, 0, 3);
                            Modifier modifierM3419p5 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i212 * f25, 0.0f, i25));
                            c33252i = AbstractC33253j.f138651a;
                            modifierM118994r = AbstractC37056f.m118994r(modifierM3419p5, c33252i);
                            if (c17919x5 != null) {
                                modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                            } else {
                                modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                            }
                            c28655q = c28655q6;
                            AbstractC29125c.m88522c(abstractC26165aM64500i5, null, AbstractC2294a.m7154a(f210, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            z4 = true;
                            i19 = i24;
                            c17919x5 = c17919x5;
                            f24 = f24;
                            i25 = 2;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(z4);
                        modifier3 = modifier9;
                        c17919x3 = c17919x5;
                        f18 = f24;
                    }
                    c28677v1M87180u.f115982d = c26030a;
                }
                f17 = f13;
                c28655q.m87138X();
                modifier3 = modifier2;
                f18 = f16;
                c17919x3 = c17919x2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                    c28677v1M87180u.f115982d = c26030a;
                }
            }
            i26 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c17919x2 = c17919x;
            z4 = true;
            if ((74899 & i26) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i26 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i15 != 0) {
                    f19 = (float) 1.5d;
                } else {
                    f19 = f16;
                }
                if (i17 != 0) {
                    c17919x4 = null;
                } else {
                    c17919x4 = c17919x2;
                }
                if (sources.isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                    }
                } else {
                    f17 = f13;
                    Modifier modifier10 = modifier4;
                    f24 = f19;
                    c17919x5 = c17919x4;
                    if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    f25 = f17 - f14;
                    Modifier modifierM3424u6 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier10);
                    if (z14) {
                        c2307m = C2299e.f9103F;
                    } else {
                        c2307m = C2299e.f9117z;
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3424u6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    c28655q.m87150e0(1547772419);
                    i19 = 0;
                    while (r18.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC22403o abstractC22403o6 = (AbstractC22403o) obj;
                        if (z14) {
                            fM118951C = i19;
                        } else {
                            fM118951C = AbstractC37056f.m118951C(sources) - i19;
                        }
                        int i213 = i19;
                        float f211 = fM118951C;
                        C28655q c28655q7 = c28655q;
                        AbstractC26165a abstractC26165aM64500i6 = AbstractC22404p.m64500i(abstractC22403o6, null, null, c28655q7, 0, 3);
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i213 * f25, 0.0f, i25));
                        c33252i = AbstractC33253j.f138651a;
                        modifierM118994r = AbstractC37056f.m118994r(modifierM3419p6, c33252i);
                        if (c17919x5 != null) {
                            modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                        } else {
                            modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                        }
                        c28655q = c28655q7;
                        AbstractC29125c.m88522c(abstractC26165aM64500i6, null, AbstractC2294a.m7154a(f211, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        z4 = true;
                        i19 = i24;
                        c17919x5 = c17919x5;
                        f24 = f24;
                        i25 = 2;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    modifier3 = modifier10;
                    c17919x3 = c17919x5;
                    f18 = f24;
                }
                c28677v1M87180u.f115982d = c26030a;
            }
            f17 = f13;
            c28655q.m87138X();
            modifier3 = modifier2;
            f18 = f16;
            c17919x3 = c17919x2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                c28677v1M87180u.f115982d = c26030a;
            }
        }
        i26 |= 24576;
        f16 = f15;
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                c17919x2 = c17919x;
                if (c28655q.m87153g(c17919x2)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i26 |= i18;
            }
            z4 = true;
            if ((74899 & i26) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i26 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i15 != 0) {
                    f19 = (float) 1.5d;
                } else {
                    f19 = f16;
                }
                if (i17 != 0) {
                    c17919x4 = null;
                } else {
                    c17919x4 = c17919x2;
                }
                if (sources.isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                    }
                } else {
                    f17 = f13;
                    Modifier modifier11 = modifier4;
                    f24 = f19;
                    c17919x5 = c17919x4;
                    if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    f25 = f17 - f14;
                    Modifier modifierM3424u7 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier11);
                    if (z14) {
                        c2307m = C2299e.f9103F;
                    } else {
                        c2307m = C2299e.f9117z;
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3424u7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    c28655q.m87150e0(1547772419);
                    i19 = 0;
                    while (r18.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC22403o abstractC22403o7 = (AbstractC22403o) obj;
                        if (z14) {
                            fM118951C = i19;
                        } else {
                            fM118951C = AbstractC37056f.m118951C(sources) - i19;
                        }
                        int i214 = i19;
                        float f212 = fM118951C;
                        C28655q c28655q8 = c28655q;
                        AbstractC26165a abstractC26165aM64500i7 = AbstractC22404p.m64500i(abstractC22403o7, null, null, c28655q8, 0, 3);
                        Modifier modifierM3419p7 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i214 * f25, 0.0f, i25));
                        c33252i = AbstractC33253j.f138651a;
                        modifierM118994r = AbstractC37056f.m118994r(modifierM3419p7, c33252i);
                        if (c17919x5 != null) {
                            modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                        } else {
                            modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                        }
                        c28655q = c28655q8;
                        AbstractC29125c.m88522c(abstractC26165aM64500i7, null, AbstractC2294a.m7154a(f212, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        z4 = true;
                        i19 = i24;
                        c17919x5 = c17919x5;
                        f24 = f24;
                        i25 = 2;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    modifier3 = modifier11;
                    c17919x3 = c17919x5;
                    f18 = f24;
                }
                c28677v1M87180u.f115982d = c26030a;
            }
            f17 = f13;
            c28655q.m87138X();
            modifier3 = modifier2;
            f18 = f16;
            c17919x3 = c17919x2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
                c28677v1M87180u.f115982d = c26030a;
            }
        }
        i26 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c17919x2 = c17919x;
        z4 = true;
        if ((74899 & i26) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i26 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i15 != 0) {
                f19 = (float) 1.5d;
            } else {
                f19 = f16;
            }
            if (i17 != 0) {
                c17919x4 = null;
            } else {
                c17919x4 = c17919x2;
            }
            if (sources.isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                } else {
                    c26030a = new C26030a(sources, f13, f14, modifier4, f19, c17919x4, i13, i14, 0);
                }
            } else {
                f17 = f13;
                Modifier modifier12 = modifier4;
                f24 = f19;
                c17919x5 = c17919x4;
                if (c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                f25 = f17 - f14;
                Modifier modifierM3424u8 = AbstractC1102d.m3424u(((sources.size() - 1) * f25) + f17, modifier12);
                if (z14) {
                    c2307m = C2299e.f9103F;
                } else {
                    c2307m = C2299e.f9117z;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3424u8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                c28655q.m87150e0(1547772419);
                i19 = 0;
                while (r18.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    AbstractC22403o abstractC22403o8 = (AbstractC22403o) obj;
                    if (z14) {
                        fM118951C = i19;
                    } else {
                        fM118951C = AbstractC37056f.m118951C(sources) - i19;
                    }
                    int i215 = i19;
                    float f213 = fM118951C;
                    C28655q c28655q9 = c28655q;
                    AbstractC26165a abstractC26165aM64500i8 = AbstractC22404p.m64500i(abstractC22403o8, null, null, c28655q9, 0, 3);
                    Modifier modifierM3419p8 = AbstractC1102d.m3419p(f17, AbstractC1099a.m3392n(c2314t, i215 * f25, 0.0f, i25));
                    c33252i = AbstractC33253j.f138651a;
                    modifierM118994r = AbstractC37056f.m118994r(modifierM3419p8, c33252i);
                    if (c17919x5 != null) {
                        modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, f24, c17919x5.f69639a, c33252i));
                    } else {
                        modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                    }
                    c28655q = c28655q9;
                    AbstractC29125c.m88522c(abstractC26165aM64500i8, null, AbstractC2294a.m7154a(f213, modifierMo3471e), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    z4 = true;
                    i19 = i24;
                    c17919x5 = c17919x5;
                    f24 = f24;
                    i25 = 2;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(z4);
                modifier3 = modifier12;
                c17919x3 = c17919x5;
                f18 = f24;
            }
            c28677v1M87180u.f115982d = c26030a;
        }
        f17 = f13;
        c28655q.m87138X();
        modifier3 = modifier2;
        f18 = f16;
        c17919x3 = c17919x2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c26030a = new C26030a(sources, f17, f14, modifier3, f18, c17919x3, i13, i14, 1);
            c28677v1M87180u.f115982d = c26030a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m77440d(List list, float f13, float f14, Modifier modifier, float f15, C17919x c17919x, int i13, int i14, Composer composer, int i15) {
        m77439c(list, f13, f14, modifier, f15, c17919x, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m77441e(List list, float f13, float f14, Modifier modifier, float f15, C17919x c17919x, int i13, int i14, Composer composer, int i15) {
        m77439c(list, f13, f14, modifier, f15, c17919x, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
