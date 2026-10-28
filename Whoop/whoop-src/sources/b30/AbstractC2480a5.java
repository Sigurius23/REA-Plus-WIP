package b30;

import a31.C0343e;
import am0.C0998b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.EnumC11663h;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C21061j;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15106p0;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39108l;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import se.AbstractC32410a;
import se.AbstractC32416g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.a5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2480a5 {

    /* JADX INFO: renamed from: a */
    public static final long f9658a = AbstractC17918w0.m51517e(2566914048L);

    /* JADX INFO: renamed from: b */
    public static final long f9659b;

    /* JADX INFO: renamed from: c */
    public static final long f9660c;

    /* JADX INFO: renamed from: d */
    public static final long f9661d;

    /* JADX INFO: renamed from: e */
    public static final float f9662e;

    static {
        int i13 = C17919x.f69638o;
        f9659b = C17919x.f69629f;
        f9660c = AbstractC17918w0.m51517e(4293256682L);
        f9661d = AbstractC17918w0.m51517e(4283585106L);
        f9662e = 12;
    }

    /* JADX INFO: renamed from: a */
    public static final void m7449a(String str, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13) {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1366455638);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            boolean zM31087p = AbstractC11673r.m31087p(((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43087b());
            long j7 = zM31087p ? f9660c : f9661d;
            long j13 = zM31087p ? f9658a : f9659b;
            int iOrdinal = ((EnumC11663h) c28655q.m87161k(AbstractC11673r.f37715g)).ordinal();
            if (iOrdinal == 0) {
                i15 = R.drawable.stripe_ic_edit_symbol;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = R.drawable.stripe_ic_edit_outlined_symbol;
            }
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(i15, c28655q, 0), str, AbstractC1136a.m3599a(AbstractC1092a.m3361f(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(20, modifier), AbstractC33253j.f138651a), j7, AbstractC17918w0.f69621a), false, null, interfaceC4339a, 7), "modify_badge"), null, new C39108l(0.9f), 0.0f, new C17903p(j13, 5), c28655q, ((i14 << 3) & 112) | 24576, 40);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(str, interfaceC4339a, (Object) modifier, i13, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7450b(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-472339459);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87155h(z13) ? 32 : 16) | (c28655q.m87157i(interfaceC4339a) ? 256 : 128) | (c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2314t c2314t = C2314t.f9131w;
            if (z13) {
                c28655q.m87150e0(6331196);
                c28655q.m87150e0(2078418089);
                boolean z14 = (i14 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0343e(interfaceC4339a, 4);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                m7449a(str, (InterfaceC4339a) objM87133R, AbstractC1094c.m3366a(AbstractC1099a.m3391m(c2314t, -14, 1), true, null), c28655q, ((i14 >> 9) & 14) | 384);
                c28655q.m87173q(false);
            } else if (z4) {
                c28655q.m87150e0(6597486);
                AbstractC32416g.m101150g(AbstractC1099a.m3391m(c2314t, -18, 58), c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(6698391);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2635u4(z4, z13, interfaceC4339a, str, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7451c(Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1151648376);
        int i15 = (c28655q.m87155h(z4) ? 4 : 2) | i14 | (c28655q.m87149e(i13) ? 32 : 16) | (c28655q.m87153g(null) ? 256 : 128) | 3072;
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            z13 = z4;
        } else {
            C2314t c2314t = C2314t.f9131w;
            z13 = z4;
            AbstractC32410a.m101046p(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(AbstractC1102d.m3411h(64, c2314t), 6, 0.0f, 2)), null, z13, 0L, null, AbstractC37817c.m121344e(-1156966771, c28655q, new C2642v4(i13, 0)), c28655q, ((i15 << 6) & 896) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
            modifier = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(i13, i14, modifier, z13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01da  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0200  */
    /* JADX WARN: Code duplicated, block: B:162:0x0203  */
    /* JADX WARN: Code duplicated, block: B:164:0x0207  */
    /* JADX WARN: Code duplicated, block: B:166:0x020c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0228  */
    /* JADX WARN: Code duplicated, block: B:170:0x022b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0276  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m7452d(final Modifier modifier, final float f13, final boolean z4, final boolean z13, final boolean z14, final boolean z15, boolean z16, final int i13, Integer num, boolean z17, final String str, final String description, InterfaceC4339a interfaceC4339a, String str2, final InterfaceC4339a onItemSelectedListener, Composer composer, final int i14, final int i15, final int i16) {
        int i17;
        boolean z18;
        boolean z19;
        boolean z24;
        int i18;
        int i19;
        int i24;
        Integer num2;
        boolean z25;
        InterfaceC4339a interfaceC4339a2;
        String str3;
        Integer num3;
        boolean z26;
        float f14;
        C28655q c28655q;
        final boolean z27;
        final Integer num4;
        final boolean z28;
        final InterfaceC4339a interfaceC4339a3;
        final String str4;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(onItemSelectedListener, "onItemSelectedListener");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1381105515);
        if ((i14 & 6) == 0) {
            i17 = (c28655q2.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i25 = i14 & 3072;
        int i26 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i25 == 0) {
            z18 = z13;
            i17 |= c28655q2.m87155h(z18) ? 2048 : 1024;
        } else {
            z18 = z13;
        }
        int i27 = i14 & 24576;
        int i28 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i27 == 0) {
            z19 = z14;
            i17 |= c28655q2.m87155h(z19) ? 16384 : 8192;
        } else {
            z19 = z14;
        }
        int i29 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i29 == 0) {
            i17 |= c28655q2.m87155h(z15) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            z24 = z16;
            i17 |= ((i16 & 64) == 0 && c28655q2.m87155h(z24)) ? 1048576 : 524288;
        } else {
            z24 = z16;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= c28655q2.m87149e(i13) ? 8388608 : 4194304;
        }
        if ((i16 & 256) != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            i17 |= c28655q2.m87153g(null) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i35 = i16 & 512;
        if (i35 != 0) {
            i17 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            i17 |= c28655q2.m87153g(num) ? 536870912 : 268435456;
        }
        int i36 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i36 != 0) {
            i18 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i18 = i15 | (c28655q2.m87155h(z17) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q2.m87153g(description) ? 256 : 128;
        }
        int i37 = i18;
        int i38 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i38 != 0) {
            i19 = i37 | 3072;
        } else {
            int i39 = i37;
            if ((i15 & 3072) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i26 = 2048;
                }
                i39 |= i26;
            }
            i19 = i39;
        }
        int i44 = i16 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i44 == 0) {
            i24 = i19;
            if ((i15 & 24576) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i28 = 16384;
                }
                i24 |= i28;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(onItemSelectedListener)) {
                    i34 = 131072;
                }
                i24 |= i34;
            }
            if ((i17 & 306783379) != 306783378 && (i24 & 74899) == 74898 && c28655q2.m87121F()) {
                c28655q2.m87138X();
                num4 = num;
                z28 = z17;
                interfaceC4339a3 = interfaceC4339a;
                str4 = str2;
                c28655q = c28655q2;
                z27 = z24;
            } else {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                    if ((i16 & 64) != 0) {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (i36 != 0) {
                        z25 = true;
                    } else {
                        z25 = z17;
                    }
                    if (i38 != 0) {
                        interfaceC4339a2 = null;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    num3 = num2;
                    z26 = z25;
                } else {
                    c28655q2.m87138X();
                    num3 = num;
                    z26 = z17;
                    interfaceC4339a2 = interfaceC4339a;
                    str3 = str2;
                }
                c28655q2.m87175r();
                Modifier modifierM3418o = AbstractC1102d.m3418o(f13, AbstractC1099a.m3398t(modifier, 0.0f, f9662e, 0.0f, 0.0f, 13));
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.6f;
                }
                String str5 = str3;
                InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                boolean z29 = z24;
                c28655q = c28655q2;
                AbstractC15106p0.m43169a(390, c28655q, AbstractC34132o.m107879c(f14, modifierM3418o), AbstractC37817c.m121344e(396151053, c28655q2, new C2649w4(z4, z18, interfaceC4339a4, str5, 0)), AbstractC37817c.m121344e(427788175, c28655q, new C2670z4(str, z4, z29, onItemSelectedListener, i13, description, num3, z15, z26, z19)));
                z27 = z29;
                num4 = num3;
                z28 = z26;
                interfaceC4339a3 = interfaceC4339a4;
                str4 = str5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b30.t4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i15);
                        AbstractC2480a5.m7452d(modifier, f13, z4, z13, z14, z15, z27, i13, num4, z28, str, description, interfaceC4339a3, str4, onItemSelectedListener, (Composer) obj, iM87244L, iM87244L2, i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i24 = i19 | 24576;
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(onItemSelectedListener)) {
                i34 = 131072;
            }
            i24 |= i34;
        }
        if ((i17 & 306783379) != 306783378) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if ((i16 & 64) != 0) {
                    z24 = z15;
                }
                if (i35 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (i36 != 0) {
                    z25 = true;
                } else {
                    z25 = z17;
                }
                if (i38 != 0) {
                    interfaceC4339a2 = null;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                num3 = num2;
                z26 = z25;
            } else {
                if ((i16 & 64) != 0) {
                    z24 = z15;
                }
                if (i35 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (i36 != 0) {
                    z25 = true;
                } else {
                    z25 = z17;
                }
                if (i38 != 0) {
                    interfaceC4339a2 = null;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                num3 = num2;
                z26 = z25;
            }
            c28655q2.m87175r();
            Modifier modifierM3418o2 = AbstractC1102d.m3418o(f13, AbstractC1099a.m3398t(modifier, 0.0f, f9662e, 0.0f, 0.0f, 13));
            if (z15) {
                f14 = 1.0f;
            } else {
                f14 = 0.6f;
            }
            String str6 = str3;
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
            boolean z210 = z24;
            c28655q = c28655q2;
            AbstractC15106p0.m43169a(390, c28655q, AbstractC34132o.m107879c(f14, modifierM3418o2), AbstractC37817c.m121344e(396151053, c28655q2, new C2649w4(z4, z18, interfaceC4339a5, str6, 0)), AbstractC37817c.m121344e(427788175, c28655q, new C2670z4(str, z4, z210, onItemSelectedListener, i13, description, num3, z15, z26, z19)));
            z27 = z210;
            num4 = num3;
            z28 = z26;
            interfaceC4339a3 = interfaceC4339a5;
            str4 = str6;
        } else {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if ((i16 & 64) != 0) {
                    z24 = z15;
                }
                if (i35 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (i36 != 0) {
                    z25 = true;
                } else {
                    z25 = z17;
                }
                if (i38 != 0) {
                    interfaceC4339a2 = null;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                num3 = num2;
                z26 = z25;
            } else {
                if ((i16 & 64) != 0) {
                    z24 = z15;
                }
                if (i35 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (i36 != 0) {
                    z25 = true;
                } else {
                    z25 = z17;
                }
                if (i38 != 0) {
                    interfaceC4339a2 = null;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                num3 = num2;
                z26 = z25;
            }
            c28655q2.m87175r();
            Modifier modifierM3418o3 = AbstractC1102d.m3418o(f13, AbstractC1099a.m3398t(modifier, 0.0f, f9662e, 0.0f, 0.0f, 13));
            if (z15) {
                f14 = 1.0f;
            } else {
                f14 = 0.6f;
            }
            String str7 = str3;
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
            boolean z211 = z24;
            c28655q = c28655q2;
            AbstractC15106p0.m43169a(390, c28655q, AbstractC34132o.m107879c(f14, modifierM3418o3), AbstractC37817c.m121344e(396151053, c28655q2, new C2649w4(z4, z18, interfaceC4339a6, str7, 0)), AbstractC37817c.m121344e(427788175, c28655q, new C2670z4(str, z4, z211, onItemSelectedListener, i13, description, num3, z15, z26, z19)));
            z27 = z211;
            num4 = num3;
            z28 = z26;
            interfaceC4339a3 = interfaceC4339a6;
            str4 = str7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b30.t4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i15);
                    AbstractC2480a5.m7452d(modifier, f13, z4, z13, z14, z15, z27, i13, num4, z28, str, description, interfaceC4339a3, str4, onItemSelectedListener, (Composer) obj, iM87244L, iM87244L2, i16);
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
