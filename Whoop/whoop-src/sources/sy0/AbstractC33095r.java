package sy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import ih0.AbstractC18489d0;
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
import p026b2.InterfaceC2301g;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sy0.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lsy0/k;", "whoopCheckboxType", "", "initialToggle", "isEnabled", "", "spacerSize", "Li2/x;", "textColor", "Landroidx/compose/ui/Modifier;", "modifier", "Ll0/k1;", "paddingValues", "Lb2/g;", "verticalAlignment", "checkedColor", "rowModifier", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "c", "(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33095r {
    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x0209  */
    /* JADX WARN: Code duplicated, block: B:166:0x0227  */
    /* JADX WARN: Code duplicated, block: B:167:0x0229  */
    /* JADX WARN: Code duplicated, block: B:170:0x0234  */
    /* JADX WARN: Code duplicated, block: B:171:0x0236  */
    /* JADX WARN: Code duplicated, block: B:174:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x028c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0290  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:187:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:188:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m104854c(final TextResource text, final AbstractC33088k whoopCheckboxType, boolean z4, boolean z13, int i13, final long j7, Modifier modifier, InterfaceC22973k1 interfaceC22973k1, InterfaceC2301g interfaceC2301g, long j13, Modifier modifier2, final Function1 onToggle, Composer composer, final int i14, final int i15, final int i16) {
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        int i19;
        int i24;
        int i25;
        int i26;
        Modifier modifier3;
        int i27;
        int i28;
        InterfaceC22973k1 c22976l1;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z16;
        final int i44;
        final InterfaceC22973k1 interfaceC22973k2;
        C28655q c28655q;
        final boolean z17;
        final boolean z18;
        final Modifier modifier4;
        final InterfaceC2301g interfaceC2301g2;
        final long j14;
        final Modifier modifier5;
        C28677v1 c28677v1M87180u;
        int i45;
        C2314t c2314t;
        int i46;
        InterfaceC2301g interfaceC2301g3;
        long jM125430y;
        int i47;
        boolean z19;
        InterfaceC2301g interfaceC2301g4;
        Modifier modifier6;
        Modifier modifier7;
        Modifier modifier8;
        int i48;
        Object objM87133R;
        C28676v0 c28676v0;
        int i49;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R2;
        boolean z27;
        int i54;
        boolean z28;
        int i55;
        int iHashCode;
        C0213j c0213j;
        Modifier modifier9;
        C0209i c0209i;
        Modifier modifier10;
        int i56;
        boolean z29;
        C2314t c2314t2;
        boolean z34;
        int i57;
        int i58;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(whoopCheckboxType, "whoopCheckboxType");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1308133265);
        if ((i14 & 6) == 0) {
            i17 = (c28655q2.m87153g(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= (i14 & 64) == 0 ? c28655q2.m87153g(whoopCheckboxType) : c28655q2.m87157i(whoopCheckboxType) ? 32 : 16;
        }
        int i59 = i16 & 4;
        if (i59 == 0) {
            if ((i14 & 384) == 0) {
                z14 = z4;
                i17 |= c28655q2.m87155h(z14) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (c28655q2.m87149e(i13)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i17 |= i25;
                    }
                    if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87151f(j7)) {
                            i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i17 |= i58;
                    }
                    i26 = i16 & 64;
                    if (i26 != 0) {
                        i17 |= 1572864;
                        modifier3 = modifier;
                    } else {
                        modifier3 = modifier;
                        if ((i14 & 1572864) == 0) {
                            if (c28655q2.m87153g(modifier3)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i17 |= i27;
                        }
                    }
                    i28 = i16 & 128;
                    if (i28 != 0) {
                        i17 |= 12582912;
                        c22976l1 = interfaceC22973k1;
                    } else {
                        c22976l1 = interfaceC22973k1;
                        if ((i14 & 12582912) == 0) {
                            if (c28655q2.m87153g(c22976l1)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i17 |= i29;
                        }
                    }
                    i34 = i17;
                    i35 = i16 & 256;
                    if (i35 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (c28655q2.m87153g(interfaceC2301g)) {
                                i36 = 67108864;
                            } else {
                                i36 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i34 |= i36;
                        }
                        if ((i14 & 805306368) != 0) {
                            i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                        }
                        i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (c28655q2.m87153g(modifier2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        if ((i15 & 48) == 0) {
                            if (c28655q2.m87157i(onToggle)) {
                                i57 = 32;
                            } else {
                                i57 = 16;
                            }
                            i38 |= i57;
                        }
                        if ((i34 & 306783379) == 306783378 || (i38 & 19) != 18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q2.m87135U(i34 & 1, z16)) {
                            c28655q2.m87140Z();
                            i45 = i14 & 1;
                            c2314t = C2314t.f9131w;
                            if (i45 != 0 || c28655q2.m87118C()) {
                                if (i59 != 0) {
                                    z14 = false;
                                }
                                if (i18 != 0) {
                                    z15 = true;
                                }
                                if (i24 != 0) {
                                    i46 = 3;
                                } else {
                                    i46 = i13;
                                }
                                if (i26 != 0) {
                                    modifier3 = c2314t;
                                }
                                if (i28 != 0) {
                                    float f13 = 1 * 8;
                                    c22976l1 = new C22976l1(f13, f13, f13, f13);
                                }
                                if (i35 != 0) {
                                    interfaceC2301g3 = C2299e.f9108K;
                                } else {
                                    interfaceC2301g3 = interfaceC2301g;
                                }
                                if ((i16 & 512) != 0) {
                                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                    i34 &= -1879048193;
                                } else {
                                    jM125430y = j13;
                                }
                                Modifier modifier11 = modifier3;
                                i47 = i46;
                                z19 = z14;
                                interfaceC2301g4 = interfaceC2301g3;
                                modifier6 = modifier11;
                                if (i37 != 0) {
                                    modifier7 = c2314t;
                                    modifier8 = modifier7;
                                } else {
                                    modifier7 = modifier2;
                                    modifier8 = c2314t;
                                }
                                i48 = i34;
                            } else {
                                c28655q2.m87138X();
                                if ((i16 & 512) != 0) {
                                    i34 &= -1879048193;
                                }
                                jM125430y = j13;
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                                z19 = z14;
                                modifier6 = modifier3;
                                i48 = i34;
                                i47 = i13;
                                interfaceC2301g4 = interfaceC2301g;
                            }
                            c28655q2.m87175r();
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q2);
                            }
                            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                            Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                            C18027i c18027i = new C18027i(1);
                            i49 = i38 & 112;
                            if (i49 == 32) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            boolean z35 = z24;
                            if ((i48 & 896) == 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = z35 | z25;
                            objM87133R2 = c28655q2.m87133R();
                            if (z26 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C3675b(onToggle, z19, 9);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            z27 = z15;
                            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44112a, interfaceC21083i, null, z27, c18027i, (InterfaceC4339a) objM87133R2, 8);
                            i54 = i48 >> 18;
                            z28 = z19;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                            i55 = i48;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
                            InterfaceC0221l.f734a.getClass();
                            InterfaceC22973k1 interfaceC22973k3 = c22976l1;
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            modifier9 = modifier6;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            if (whoopCheckboxType instanceof AbstractC33088k.i) {
                                c28655q2.m87150e0(950645072);
                                int i64 = i55 >> 6;
                                int i65 = (i64 & 57344) | (i64 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                                z34 = z28;
                                z29 = z27;
                                long j15 = jM125430y;
                                i56 = i55;
                                AbstractC33087j.m104822d(z34, null, z29, j15, modifier9, c28655q2, i65, 0);
                                modifier10 = modifier9;
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                                c2314t2 = modifier8;
                                j14 = j15;
                            } else {
                                modifier10 = modifier9;
                                i56 = i55;
                                Modifier modifier12 = modifier8;
                                long j16 = jM125430y;
                                z29 = z27;
                                c28655q2.m87150e0(-594521467);
                                C38072d c38072d = C38072d.f163053a;
                                j14 = j16;
                                c2314t2 = modifier12;
                                AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j16, c38072d.m121949b(c28655q2, 6).getBrandWhite(), c38072d.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                                z34 = z28;
                                c28655q2.m87173q(false);
                            }
                            AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                            c28655q = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                            c28655q2.m87173q(true);
                            z17 = z34;
                            z18 = z29;
                            interfaceC22973k2 = interfaceC22973k3;
                            interfaceC2301g2 = interfaceC2301g4;
                            modifier4 = modifier10;
                            i44 = i47;
                            modifier5 = modifier7;
                        } else {
                            c28655q2.m87138X();
                            i44 = i13;
                            interfaceC22973k2 = c22976l1;
                            c28655q = c28655q2;
                            z17 = z14;
                            z18 = z15;
                            modifier4 = modifier3;
                            interfaceC2301g2 = interfaceC2301g;
                            j14 = j13;
                            modifier5 = modifier2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i34 |= 100663296;
                    if ((i14 & 805306368) != 0) {
                        i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                    }
                    i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (c28655q2.m87157i(onToggle)) {
                            i57 = 32;
                        } else {
                            i57 = 16;
                        }
                        i38 |= i57;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z16)) {
                        c28655q2.m87140Z();
                        i45 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i45 != 0) {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f14 = 1 * 8;
                                c22976l1 = new C22976l1(f14, f14, f14, f14);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier13 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier13;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        } else {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f15 = 1 * 8;
                                c22976l1 = new C22976l1(f15, f15, f15, f15);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier14 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier14;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        }
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                        Modifier modifierM44112a2 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                        C18027i c18027i2 = new C18027i(1);
                        i49 = i38 & 112;
                        if (i49 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z36 = z24;
                        if ((i48 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z36 | z25;
                        objM87133R2 = c28655q2.m87133R();
                        if (z26) {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z27 = z15;
                        Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM44112a2, interfaceC21083i2, null, z27, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                        i54 = i48 >> 18;
                        z28 = z19;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                        i55 = i48;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3360e2);
                        InterfaceC0221l.f734a.getClass();
                        InterfaceC22973k1 interfaceC22973k4 = c22976l1;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        modifier9 = modifier6;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        if (whoopCheckboxType instanceof AbstractC33088k.i) {
                            c28655q2.m87150e0(950645072);
                            int i66 = i55 >> 6;
                            int i67 = (i66 & 57344) | (i66 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                            z34 = z28;
                            z29 = z27;
                            long j17 = jM125430y;
                            i56 = i55;
                            AbstractC33087j.m104822d(z34, null, z29, j17, modifier9, c28655q2, i67, 0);
                            modifier10 = modifier9;
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                            c2314t2 = modifier8;
                            j14 = j17;
                        } else {
                            modifier10 = modifier9;
                            i56 = i55;
                            Modifier modifier15 = modifier8;
                            long j18 = jM125430y;
                            z29 = z27;
                            c28655q2.m87150e0(-594521467);
                            C38072d c38072d2 = C38072d.f163053a;
                            j14 = j18;
                            c2314t2 = modifier15;
                            AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j18, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), c38072d2.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                            z34 = z28;
                            c28655q2.m87173q(false);
                        }
                        AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                        c28655q2.m87173q(true);
                        z17 = z34;
                        z18 = z29;
                        interfaceC22973k2 = interfaceC22973k4;
                        interfaceC2301g2 = interfaceC2301g4;
                        modifier4 = modifier10;
                        i44 = i47;
                        modifier5 = modifier7;
                    } else {
                        c28655q2.m87138X();
                        i44 = i13;
                        interfaceC22973k2 = c22976l1;
                        c28655q = c28655q2;
                        z17 = z14;
                        z18 = z15;
                        modifier4 = modifier3;
                        interfaceC2301g2 = interfaceC2301g;
                        j14 = j13;
                        modifier5 = modifier2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 24576;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87151f(j7)) {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i58;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier3)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    i17 |= 12582912;
                    c22976l1 = interfaceC22973k1;
                } else {
                    c22976l1 = interfaceC22973k1;
                    if ((i14 & 12582912) == 0) {
                        if (c28655q2.m87153g(c22976l1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                }
                i34 = i17;
                i35 = i16 & 256;
                if (i35 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q2.m87153g(interfaceC2301g)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i34 |= i36;
                    }
                    if ((i14 & 805306368) != 0) {
                        i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                    }
                    i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (c28655q2.m87157i(onToggle)) {
                            i57 = 32;
                        } else {
                            i57 = 16;
                        }
                        i38 |= i57;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z16)) {
                        c28655q2.m87140Z();
                        i45 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i45 != 0) {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f16 = 1 * 8;
                                c22976l1 = new C22976l1(f16, f16, f16, f16);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier16 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier16;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        } else {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f17 = 1 * 8;
                                c22976l1 = new C22976l1(f17, f17, f17, f17);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier17 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier17;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        }
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                        Modifier modifierM44112a3 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                        C18027i c18027i3 = new C18027i(1);
                        i49 = i38 & 112;
                        if (i49 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z37 = z24;
                        if ((i48 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z37 | z25;
                        objM87133R2 = c28655q2.m87133R();
                        if (z26) {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z27 = z15;
                        Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM44112a3, interfaceC21083i3, null, z27, c18027i3, (InterfaceC4339a) objM87133R2, 8);
                        i54 = i48 >> 18;
                        z28 = z19;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                        i55 = i48;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3360e3);
                        InterfaceC0221l.f734a.getClass();
                        InterfaceC22973k1 interfaceC22973k5 = c22976l1;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        modifier9 = modifier6;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        if (whoopCheckboxType instanceof AbstractC33088k.i) {
                            c28655q2.m87150e0(950645072);
                            int i68 = i55 >> 6;
                            int i69 = (i68 & 57344) | (i68 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                            z34 = z28;
                            z29 = z27;
                            long j19 = jM125430y;
                            i56 = i55;
                            AbstractC33087j.m104822d(z34, null, z29, j19, modifier9, c28655q2, i69, 0);
                            modifier10 = modifier9;
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                            c2314t2 = modifier8;
                            j14 = j19;
                        } else {
                            modifier10 = modifier9;
                            i56 = i55;
                            Modifier modifier18 = modifier8;
                            long j110 = jM125430y;
                            z29 = z27;
                            c28655q2.m87150e0(-594521467);
                            C38072d c38072d3 = C38072d.f163053a;
                            j14 = j110;
                            c2314t2 = modifier18;
                            AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j110, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), c38072d3.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                            z34 = z28;
                            c28655q2.m87173q(false);
                        }
                        AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                        c28655q2.m87173q(true);
                        z17 = z34;
                        z18 = z29;
                        interfaceC22973k2 = interfaceC22973k5;
                        interfaceC2301g2 = interfaceC2301g4;
                        modifier4 = modifier10;
                        i44 = i47;
                        modifier5 = modifier7;
                    } else {
                        c28655q2.m87138X();
                        i44 = i13;
                        interfaceC22973k2 = c22976l1;
                        c28655q = c28655q2;
                        z17 = z14;
                        z18 = z15;
                        modifier4 = modifier3;
                        interfaceC2301g2 = interfaceC2301g;
                        j14 = j13;
                        modifier5 = modifier2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i34 |= 100663296;
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f18 = 1 * 8;
                            c22976l1 = new C22976l1(f18, f18, f18, f18);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier19 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier19;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f19 = 1 * 8;
                            c22976l1 = new C22976l1(f19, f19, f19, f19);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier110 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier110;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a4 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i4 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z38 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z38 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM44112a4, interfaceC21083i4, null, z27, c18027i4, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3360e4);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k6 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i610 = i55 >> 6;
                        int i611 = (i610 & 57344) | (i610 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j111 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j111, modifier9, c28655q2, i611, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j111;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier111 = modifier8;
                        long j112 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d4 = C38072d.f163053a;
                        j14 = j112;
                        c2314t2 = modifier111;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j112, c38072d4.m121949b(c28655q2, 6).getBrandWhite(), c38072d4.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k6;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 3072;
            z15 = z13;
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i25;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87151f(j7)) {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i58;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier3)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    i17 |= 12582912;
                    c22976l1 = interfaceC22973k1;
                } else {
                    c22976l1 = interfaceC22973k1;
                    if ((i14 & 12582912) == 0) {
                        if (c28655q2.m87153g(c22976l1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                }
                i34 = i17;
                i35 = i16 & 256;
                if (i35 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q2.m87153g(interfaceC2301g)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i34 |= i36;
                    }
                    if ((i14 & 805306368) != 0) {
                        i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                    }
                    i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (c28655q2.m87157i(onToggle)) {
                            i57 = 32;
                        } else {
                            i57 = 16;
                        }
                        i38 |= i57;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z16)) {
                        c28655q2.m87140Z();
                        i45 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i45 != 0) {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f110 = 1 * 8;
                                c22976l1 = new C22976l1(f110, f110, f110, f110);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier112 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier112;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        } else {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f111 = 1 * 8;
                                c22976l1 = new C22976l1(f111, f111, f111, f111);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier113 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier113;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        }
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
                        Modifier modifierM44112a5 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                        C18027i c18027i5 = new C18027i(1);
                        i49 = i38 & 112;
                        if (i49 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z39 = z24;
                        if ((i48 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z39 | z25;
                        objM87133R2 = c28655q2.m87133R();
                        if (z26) {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z27 = z15;
                        Modifier modifierM3360e5 = AbstractC1092a.m3360e(modifierM44112a5, interfaceC21083i5, null, z27, c18027i5, (InterfaceC4339a) objM87133R2, 8);
                        i54 = i48 >> 18;
                        z28 = z19;
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                        i55 = i48;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3360e5);
                        InterfaceC0221l.f734a.getClass();
                        InterfaceC22973k1 interfaceC22973k7 = c22976l1;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        modifier9 = modifier6;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                        if (whoopCheckboxType instanceof AbstractC33088k.i) {
                            c28655q2.m87150e0(950645072);
                            int i612 = i55 >> 6;
                            int i613 = (i612 & 57344) | (i612 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                            z34 = z28;
                            z29 = z27;
                            long j113 = jM125430y;
                            i56 = i55;
                            AbstractC33087j.m104822d(z34, null, z29, j113, modifier9, c28655q2, i613, 0);
                            modifier10 = modifier9;
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                            c2314t2 = modifier8;
                            j14 = j113;
                        } else {
                            modifier10 = modifier9;
                            i56 = i55;
                            Modifier modifier114 = modifier8;
                            long j114 = jM125430y;
                            z29 = z27;
                            c28655q2.m87150e0(-594521467);
                            C38072d c38072d5 = C38072d.f163053a;
                            j14 = j114;
                            c2314t2 = modifier114;
                            AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j114, c38072d5.m121949b(c28655q2, 6).getBrandWhite(), c38072d5.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                            z34 = z28;
                            c28655q2.m87173q(false);
                        }
                        AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                        c28655q2.m87173q(true);
                        z17 = z34;
                        z18 = z29;
                        interfaceC22973k2 = interfaceC22973k7;
                        interfaceC2301g2 = interfaceC2301g4;
                        modifier4 = modifier10;
                        i44 = i47;
                        modifier5 = modifier7;
                    } else {
                        c28655q2.m87138X();
                        i44 = i13;
                        interfaceC22973k2 = c22976l1;
                        c28655q = c28655q2;
                        z17 = z14;
                        z18 = z15;
                        modifier4 = modifier3;
                        interfaceC2301g2 = interfaceC2301g;
                        j14 = j13;
                        modifier5 = modifier2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i34 |= 100663296;
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f112 = 1 * 8;
                            c22976l1 = new C22976l1(f112, f112, f112, f112);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier115 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier115;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f113 = 1 * 8;
                            c22976l1 = new C22976l1(f113, f113, f113, f113);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier116 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier116;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a6 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i6 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z310 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z310 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e6 = AbstractC1092a.m3360e(modifierM44112a6, interfaceC21083i6, null, z27, c18027i6, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3360e6);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k8 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i614 = i55 >> 6;
                        int i615 = (i614 & 57344) | (i614 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j115 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j115, modifier9, c28655q2, i615, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j115;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier117 = modifier8;
                        long j116 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d6 = C38072d.f163053a;
                        j14 = j116;
                        c2314t2 = modifier117;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j116, c38072d6.m121949b(c28655q2, 6).getBrandWhite(), c38072d6.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k8;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 24576;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i58;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                modifier3 = modifier;
            } else {
                modifier3 = modifier;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier3)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                i17 |= 12582912;
                c22976l1 = interfaceC22973k1;
            } else {
                c22976l1 = interfaceC22973k1;
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87153g(c22976l1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
            }
            i34 = i17;
            i35 = i16 & 256;
            if (i35 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87153g(interfaceC2301g)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i34 |= i36;
                }
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f114 = 1 * 8;
                            c22976l1 = new C22976l1(f114, f114, f114, f114);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier118 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier118;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f115 = 1 * 8;
                            c22976l1 = new C22976l1(f115, f115, f115, f115);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier119 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier119;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a7 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i7 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z311 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z311 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e7 = AbstractC1092a.m3360e(modifierM44112a7, interfaceC21083i7, null, z27, c18027i7, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3360e7);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k9 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i616 = i55 >> 6;
                        int i617 = (i616 & 57344) | (i616 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j117 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j117, modifier9, c28655q2, i617, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j117;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier1110 = modifier8;
                        long j118 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d7 = C38072d.f163053a;
                        j14 = j118;
                        c2314t2 = modifier1110;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j118, c38072d7.m121949b(c28655q2, 6).getBrandWhite(), c38072d7.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k9;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i34 |= 100663296;
            if ((i14 & 805306368) != 0) {
                i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
            }
            i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87153g(modifier2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            if ((i15 & 48) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i57 = 32;
                } else {
                    i57 = 16;
                }
                i38 |= i57;
            }
            if ((i34 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z16)) {
                c28655q2.m87140Z();
                i45 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f116 = 1 * 8;
                        c22976l1 = new C22976l1(f116, f116, f116, f116);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier1111 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier1111;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                } else {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f117 = 1 * 8;
                        c22976l1 = new C22976l1(f117, f117, f117, f117);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier1112 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier1112;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R;
                Modifier modifierM44112a8 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                C18027i c18027i8 = new C18027i(1);
                i49 = i38 & 112;
                if (i49 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z312 = z24;
                if ((i48 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z312 | z25;
                objM87133R2 = c28655q2.m87133R();
                if (z26) {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                z27 = z15;
                Modifier modifierM3360e8 = AbstractC1092a.m3360e(modifierM44112a8, interfaceC21083i8, null, z27, c18027i8, (InterfaceC4339a) objM87133R2, 8);
                i54 = i48 >> 18;
                z28 = z19;
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                i55 = i48;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3360e8);
                InterfaceC0221l.f734a.getClass();
                InterfaceC22973k1 interfaceC22973k10 = c22976l1;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                modifier9 = modifier6;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                if (whoopCheckboxType instanceof AbstractC33088k.i) {
                    c28655q2.m87150e0(950645072);
                    int i618 = i55 >> 6;
                    int i619 = (i618 & 57344) | (i618 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                    z34 = z28;
                    z29 = z27;
                    long j119 = jM125430y;
                    i56 = i55;
                    AbstractC33087j.m104822d(z34, null, z29, j119, modifier9, c28655q2, i619, 0);
                    modifier10 = modifier9;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    c2314t2 = modifier8;
                    j14 = j119;
                } else {
                    modifier10 = modifier9;
                    i56 = i55;
                    Modifier modifier1113 = modifier8;
                    long j1110 = jM125430y;
                    z29 = z27;
                    c28655q2.m87150e0(-594521467);
                    C38072d c38072d8 = C38072d.f163053a;
                    j14 = j1110;
                    c2314t2 = modifier1113;
                    AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j1110, c38072d8.m121949b(c28655q2, 6).getBrandWhite(), c38072d8.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                    z34 = z28;
                    c28655q2.m87173q(false);
                }
                AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                c28655q2.m87173q(true);
                z17 = z34;
                z18 = z29;
                interfaceC22973k2 = interfaceC22973k10;
                interfaceC2301g2 = interfaceC2301g4;
                modifier4 = modifier10;
                i44 = i47;
                modifier5 = modifier7;
            } else {
                c28655q2.m87138X();
                i44 = i13;
                interfaceC22973k2 = c22976l1;
                c28655q = c28655q2;
                z17 = z14;
                z18 = z15;
                modifier4 = modifier3;
                interfaceC2301g2 = interfaceC2301g;
                j14 = j13;
                modifier5 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 384;
        z14 = z4;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z13;
                if (c28655q2.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i17 |= i19;
            }
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87149e(i13)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i17 |= i25;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87151f(j7)) {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i17 |= i58;
                }
                i26 = i16 & 64;
                if (i26 != 0) {
                    i17 |= 1572864;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier3)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 128;
                if (i28 != 0) {
                    i17 |= 12582912;
                    c22976l1 = interfaceC22973k1;
                } else {
                    c22976l1 = interfaceC22973k1;
                    if ((i14 & 12582912) == 0) {
                        if (c28655q2.m87153g(c22976l1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                }
                i34 = i17;
                i35 = i16 & 256;
                if (i35 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q2.m87153g(interfaceC2301g)) {
                            i36 = 67108864;
                        } else {
                            i36 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i34 |= i36;
                    }
                    if ((i14 & 805306368) != 0) {
                        i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                    }
                    i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (c28655q2.m87157i(onToggle)) {
                            i57 = 32;
                        } else {
                            i57 = 16;
                        }
                        i38 |= i57;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z16)) {
                        c28655q2.m87140Z();
                        i45 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i45 != 0) {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f118 = 1 * 8;
                                c22976l1 = new C22976l1(f118, f118, f118, f118);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier1114 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier1114;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        } else {
                            if (i59 != 0) {
                                z14 = false;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if (i24 != 0) {
                                i46 = 3;
                            } else {
                                i46 = i13;
                            }
                            if (i26 != 0) {
                                modifier3 = c2314t;
                            }
                            if (i28 != 0) {
                                float f119 = 1 * 8;
                                c22976l1 = new C22976l1(f119, f119, f119, f119);
                            }
                            if (i35 != 0) {
                                interfaceC2301g3 = C2299e.f9108K;
                            } else {
                                interfaceC2301g3 = interfaceC2301g;
                            }
                            if ((i16 & 512) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                                i34 &= -1879048193;
                            } else {
                                jM125430y = j13;
                            }
                            Modifier modifier1115 = modifier3;
                            i47 = i46;
                            z19 = z14;
                            interfaceC2301g4 = interfaceC2301g3;
                            modifier6 = modifier1115;
                            if (i37 != 0) {
                                modifier7 = c2314t;
                                modifier8 = modifier7;
                            } else {
                                modifier7 = modifier2;
                                modifier8 = c2314t;
                            }
                            i48 = i34;
                        }
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i9 = (InterfaceC21083i) objM87133R;
                        Modifier modifierM44112a9 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                        C18027i c18027i9 = new C18027i(1);
                        i49 = i38 & 112;
                        if (i49 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z313 = z24;
                        if ((i48 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z313 | z25;
                        objM87133R2 = c28655q2.m87133R();
                        if (z26) {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C3675b(onToggle, z19, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z27 = z15;
                        Modifier modifierM3360e9 = AbstractC1092a.m3360e(modifierM44112a9, interfaceC21083i9, null, z27, c18027i9, (InterfaceC4339a) objM87133R2, 8);
                        i54 = i48 >> 18;
                        z28 = z19;
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                        i55 = i48;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3360e9);
                        InterfaceC0221l.f734a.getClass();
                        InterfaceC22973k1 interfaceC22973k11 = c22976l1;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        modifier9 = modifier6;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                        if (whoopCheckboxType instanceof AbstractC33088k.i) {
                            c28655q2.m87150e0(950645072);
                            int i6110 = i55 >> 6;
                            int i6111 = (i6110 & 57344) | (i6110 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                            z34 = z28;
                            z29 = z27;
                            long j1111 = jM125430y;
                            i56 = i55;
                            AbstractC33087j.m104822d(z34, null, z29, j1111, modifier9, c28655q2, i6111, 0);
                            modifier10 = modifier9;
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                            c2314t2 = modifier8;
                            j14 = j1111;
                        } else {
                            modifier10 = modifier9;
                            i56 = i55;
                            Modifier modifier1116 = modifier8;
                            long j1112 = jM125430y;
                            z29 = z27;
                            c28655q2.m87150e0(-594521467);
                            C38072d c38072d9 = C38072d.f163053a;
                            j14 = j1112;
                            c2314t2 = modifier1116;
                            AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j1112, c38072d9.m121949b(c28655q2, 6).getBrandWhite(), c38072d9.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                            z34 = z28;
                            c28655q2.m87173q(false);
                        }
                        AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                        c28655q = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                        c28655q2.m87173q(true);
                        z17 = z34;
                        z18 = z29;
                        interfaceC22973k2 = interfaceC22973k11;
                        interfaceC2301g2 = interfaceC2301g4;
                        modifier4 = modifier10;
                        i44 = i47;
                        modifier5 = modifier7;
                    } else {
                        c28655q2.m87138X();
                        i44 = i13;
                        interfaceC22973k2 = c22976l1;
                        c28655q = c28655q2;
                        z17 = z14;
                        z18 = z15;
                        modifier4 = modifier3;
                        interfaceC2301g2 = interfaceC2301g;
                        j14 = j13;
                        modifier5 = modifier2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i34 |= 100663296;
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1110 = 1 * 8;
                            c22976l1 = new C22976l1(f1110, f1110, f1110, f1110);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier1117 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier1117;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1111 = 1 * 8;
                            c22976l1 = new C22976l1(f1111, f1111, f1111, f1111);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier1118 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier1118;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i10 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a10 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i10 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z314 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z314 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e10 = AbstractC1092a.m3360e(modifierM44112a10, interfaceC21083i10, null, z27, c18027i10, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3360e10);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k12 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i6112 = i55 >> 6;
                        int i6113 = (i6112 & 57344) | (i6112 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j1113 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j1113, modifier9, c28655q2, i6113, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j1113;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier1119 = modifier8;
                        long j1114 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d10 = C38072d.f163053a;
                        j14 = j1114;
                        c2314t2 = modifier1119;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j1114, c38072d10.m121949b(c28655q2, 6).getBrandWhite(), c38072d10.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k12;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 24576;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i58;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                modifier3 = modifier;
            } else {
                modifier3 = modifier;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier3)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                i17 |= 12582912;
                c22976l1 = interfaceC22973k1;
            } else {
                c22976l1 = interfaceC22973k1;
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87153g(c22976l1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
            }
            i34 = i17;
            i35 = i16 & 256;
            if (i35 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87153g(interfaceC2301g)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i34 |= i36;
                }
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1112 = 1 * 8;
                            c22976l1 = new C22976l1(f1112, f1112, f1112, f1112);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier11110 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier11110;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1113 = 1 * 8;
                            c22976l1 = new C22976l1(f1113, f1113, f1113, f1113);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier11111 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier11111;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i11 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a11 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i11 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z315 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z315 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e11 = AbstractC1092a.m3360e(modifierM44112a11, interfaceC21083i11, null, z27, c18027i11, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3360e11);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k13 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i6114 = i55 >> 6;
                        int i6115 = (i6114 & 57344) | (i6114 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j1115 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j1115, modifier9, c28655q2, i6115, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j1115;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier11112 = modifier8;
                        long j1116 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d11 = C38072d.f163053a;
                        j14 = j1116;
                        c2314t2 = modifier11112;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j1116, c38072d11.m121949b(c28655q2, 6).getBrandWhite(), c38072d11.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k13;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i34 |= 100663296;
            if ((i14 & 805306368) != 0) {
                i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
            }
            i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87153g(modifier2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            if ((i15 & 48) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i57 = 32;
                } else {
                    i57 = 16;
                }
                i38 |= i57;
            }
            if ((i34 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z16)) {
                c28655q2.m87140Z();
                i45 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f1114 = 1 * 8;
                        c22976l1 = new C22976l1(f1114, f1114, f1114, f1114);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier11113 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier11113;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                } else {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f1115 = 1 * 8;
                        c22976l1 = new C22976l1(f1115, f1115, f1115, f1115);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier11114 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier11114;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i12 = (InterfaceC21083i) objM87133R;
                Modifier modifierM44112a12 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                C18027i c18027i12 = new C18027i(1);
                i49 = i38 & 112;
                if (i49 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z316 = z24;
                if ((i48 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z316 | z25;
                objM87133R2 = c28655q2.m87133R();
                if (z26) {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                z27 = z15;
                Modifier modifierM3360e12 = AbstractC1092a.m3360e(modifierM44112a12, interfaceC21083i12, null, z27, c18027i12, (InterfaceC4339a) objM87133R2, 8);
                i54 = i48 >> 18;
                z28 = z19;
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                i55 = i48;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3360e12);
                InterfaceC0221l.f734a.getClass();
                InterfaceC22973k1 interfaceC22973k14 = c22976l1;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                modifier9 = modifier6;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                if (whoopCheckboxType instanceof AbstractC33088k.i) {
                    c28655q2.m87150e0(950645072);
                    int i6116 = i55 >> 6;
                    int i6117 = (i6116 & 57344) | (i6116 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                    z34 = z28;
                    z29 = z27;
                    long j1117 = jM125430y;
                    i56 = i55;
                    AbstractC33087j.m104822d(z34, null, z29, j1117, modifier9, c28655q2, i6117, 0);
                    modifier10 = modifier9;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    c2314t2 = modifier8;
                    j14 = j1117;
                } else {
                    modifier10 = modifier9;
                    i56 = i55;
                    Modifier modifier11115 = modifier8;
                    long j1118 = jM125430y;
                    z29 = z27;
                    c28655q2.m87150e0(-594521467);
                    C38072d c38072d12 = C38072d.f163053a;
                    j14 = j1118;
                    c2314t2 = modifier11115;
                    AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j1118, c38072d12.m121949b(c28655q2, 6).getBrandWhite(), c38072d12.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                    z34 = z28;
                    c28655q2.m87173q(false);
                }
                AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                c28655q2.m87173q(true);
                z17 = z34;
                z18 = z29;
                interfaceC22973k2 = interfaceC22973k14;
                interfaceC2301g2 = interfaceC2301g4;
                modifier4 = modifier10;
                i44 = i47;
                modifier5 = modifier7;
            } else {
                c28655q2.m87138X();
                i44 = i13;
                interfaceC22973k2 = c22976l1;
                c28655q = c28655q2;
                z17 = z14;
                z18 = z15;
                modifier4 = modifier3;
                interfaceC2301g2 = interfaceC2301g;
                j14 = j13;
                modifier5 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 3072;
        z15 = z13;
        i24 = i16 & 16;
        if (i24 != 0) {
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87149e(i13)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i25;
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i58;
            }
            i26 = i16 & 64;
            if (i26 != 0) {
                i17 |= 1572864;
                modifier3 = modifier;
            } else {
                modifier3 = modifier;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier3)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 128;
            if (i28 != 0) {
                i17 |= 12582912;
                c22976l1 = interfaceC22973k1;
            } else {
                c22976l1 = interfaceC22973k1;
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87153g(c22976l1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
            }
            i34 = i17;
            i35 = i16 & 256;
            if (i35 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87153g(interfaceC2301g)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i34 |= i36;
                }
                if ((i14 & 805306368) != 0) {
                    i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
                }
                i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (c28655q2.m87157i(onToggle)) {
                        i57 = 32;
                    } else {
                        i57 = 16;
                    }
                    i38 |= i57;
                }
                if ((i34 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z16)) {
                    c28655q2.m87140Z();
                    i45 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1116 = 1 * 8;
                            c22976l1 = new C22976l1(f1116, f1116, f1116, f1116);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier11116 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier11116;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    } else {
                        if (i59 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if (i24 != 0) {
                            i46 = 3;
                        } else {
                            i46 = i13;
                        }
                        if (i26 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i28 != 0) {
                            float f1117 = 1 * 8;
                            c22976l1 = new C22976l1(f1117, f1117, f1117, f1117);
                        }
                        if (i35 != 0) {
                            interfaceC2301g3 = C2299e.f9108K;
                        } else {
                            interfaceC2301g3 = interfaceC2301g;
                        }
                        if ((i16 & 512) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            i34 &= -1879048193;
                        } else {
                            jM125430y = j13;
                        }
                        Modifier modifier11117 = modifier3;
                        i47 = i46;
                        z19 = z14;
                        interfaceC2301g4 = interfaceC2301g3;
                        modifier6 = modifier11117;
                        if (i37 != 0) {
                            modifier7 = c2314t;
                            modifier8 = modifier7;
                        } else {
                            modifier7 = modifier2;
                            modifier8 = c2314t;
                        }
                        i48 = i34;
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i13 = (InterfaceC21083i) objM87133R;
                    Modifier modifierM44112a13 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                    C18027i c18027i13 = new C18027i(1);
                    i49 = i38 & 112;
                    if (i49 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z317 = z24;
                    if ((i48 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z317 | z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (z26) {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3675b(onToggle, z19, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z27 = z15;
                    Modifier modifierM3360e13 = AbstractC1092a.m3360e(modifierM44112a13, interfaceC21083i13, null, z27, c18027i13, (InterfaceC4339a) objM87133R2, 8);
                    i54 = i48 >> 18;
                    z28 = z19;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                    i55 = i48;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3360e13);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC22973k1 interfaceC22973k15 = c22976l1;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    modifier9 = modifier6;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                    if (whoopCheckboxType instanceof AbstractC33088k.i) {
                        c28655q2.m87150e0(950645072);
                        int i6118 = i55 >> 6;
                        int i6119 = (i6118 & 57344) | (i6118 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                        z34 = z28;
                        z29 = z27;
                        long j1119 = jM125430y;
                        i56 = i55;
                        AbstractC33087j.m104822d(z34, null, z29, j1119, modifier9, c28655q2, i6119, 0);
                        modifier10 = modifier9;
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        c2314t2 = modifier8;
                        j14 = j1119;
                    } else {
                        modifier10 = modifier9;
                        i56 = i55;
                        Modifier modifier11118 = modifier8;
                        long j11110 = jM125430y;
                        z29 = z27;
                        c28655q2.m87150e0(-594521467);
                        C38072d c38072d13 = C38072d.f163053a;
                        j14 = j11110;
                        c2314t2 = modifier11118;
                        AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j11110, c38072d13.m121949b(c28655q2, 6).getBrandWhite(), c38072d13.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                        z34 = z28;
                        c28655q2.m87173q(false);
                    }
                    AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                    c28655q2.m87173q(true);
                    z17 = z34;
                    z18 = z29;
                    interfaceC22973k2 = interfaceC22973k15;
                    interfaceC2301g2 = interfaceC2301g4;
                    modifier4 = modifier10;
                    i44 = i47;
                    modifier5 = modifier7;
                } else {
                    c28655q2.m87138X();
                    i44 = i13;
                    interfaceC22973k2 = c22976l1;
                    c28655q = c28655q2;
                    z17 = z14;
                    z18 = z15;
                    modifier4 = modifier3;
                    interfaceC2301g2 = interfaceC2301g;
                    j14 = j13;
                    modifier5 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i34 |= 100663296;
            if ((i14 & 805306368) != 0) {
                i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
            }
            i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87153g(modifier2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            if ((i15 & 48) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i57 = 32;
                } else {
                    i57 = 16;
                }
                i38 |= i57;
            }
            if ((i34 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z16)) {
                c28655q2.m87140Z();
                i45 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f1118 = 1 * 8;
                        c22976l1 = new C22976l1(f1118, f1118, f1118, f1118);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier11119 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier11119;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                } else {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f1119 = 1 * 8;
                        c22976l1 = new C22976l1(f1119, f1119, f1119, f1119);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier111110 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier111110;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i14 = (InterfaceC21083i) objM87133R;
                Modifier modifierM44112a14 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                C18027i c18027i14 = new C18027i(1);
                i49 = i38 & 112;
                if (i49 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z318 = z24;
                if ((i48 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z318 | z25;
                objM87133R2 = c28655q2.m87133R();
                if (z26) {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                z27 = z15;
                Modifier modifierM3360e14 = AbstractC1092a.m3360e(modifierM44112a14, interfaceC21083i14, null, z27, c18027i14, (InterfaceC4339a) objM87133R2, 8);
                i54 = i48 >> 18;
                z28 = z19;
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                i55 = i48;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3360e14);
                InterfaceC0221l.f734a.getClass();
                InterfaceC22973k1 interfaceC22973k16 = c22976l1;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                modifier9 = modifier6;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a14);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                if (whoopCheckboxType instanceof AbstractC33088k.i) {
                    c28655q2.m87150e0(950645072);
                    int i61110 = i55 >> 6;
                    int i61111 = (i61110 & 57344) | (i61110 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                    z34 = z28;
                    z29 = z27;
                    long j11111 = jM125430y;
                    i56 = i55;
                    AbstractC33087j.m104822d(z34, null, z29, j11111, modifier9, c28655q2, i61111, 0);
                    modifier10 = modifier9;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    c2314t2 = modifier8;
                    j14 = j11111;
                } else {
                    modifier10 = modifier9;
                    i56 = i55;
                    Modifier modifier111111 = modifier8;
                    long j11112 = jM125430y;
                    z29 = z27;
                    c28655q2.m87150e0(-594521467);
                    C38072d c38072d14 = C38072d.f163053a;
                    j14 = j11112;
                    c2314t2 = modifier111111;
                    AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j11112, c38072d14.m121949b(c28655q2, 6).getBrandWhite(), c38072d14.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                    z34 = z28;
                    c28655q2.m87173q(false);
                }
                AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                c28655q2.m87173q(true);
                z17 = z34;
                z18 = z29;
                interfaceC22973k2 = interfaceC22973k16;
                interfaceC2301g2 = interfaceC2301g4;
                modifier4 = modifier10;
                i44 = i47;
                modifier5 = modifier7;
            } else {
                c28655q2.m87138X();
                i44 = i13;
                interfaceC22973k2 = c22976l1;
                c28655q = c28655q2;
                z17 = z14;
                z18 = z15;
                modifier4 = modifier3;
                interfaceC2301g2 = interfaceC2301g;
                j14 = j13;
                modifier5 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 24576;
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87151f(j7)) {
                i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i58 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i17 |= i58;
        }
        i26 = i16 & 64;
        if (i26 != 0) {
            i17 |= 1572864;
            modifier3 = modifier;
        } else {
            modifier3 = modifier;
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87153g(modifier3)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i17 |= i27;
            }
        }
        i28 = i16 & 128;
        if (i28 != 0) {
            i17 |= 12582912;
            c22976l1 = interfaceC22973k1;
        } else {
            c22976l1 = interfaceC22973k1;
            if ((i14 & 12582912) == 0) {
                if (c28655q2.m87153g(c22976l1)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
        }
        i34 = i17;
        i35 = i16 & 256;
        if (i35 != 0) {
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87153g(interfaceC2301g)) {
                    i36 = 67108864;
                } else {
                    i36 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i34 |= i36;
            }
            if ((i14 & 805306368) != 0) {
                i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
            }
            i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87153g(modifier2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            if ((i15 & 48) == 0) {
                if (c28655q2.m87157i(onToggle)) {
                    i57 = 32;
                } else {
                    i57 = 16;
                }
                i38 |= i57;
            }
            if ((i34 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z16)) {
                c28655q2.m87140Z();
                i45 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f11110 = 1 * 8;
                        c22976l1 = new C22976l1(f11110, f11110, f11110, f11110);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier111112 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier111112;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                } else {
                    if (i59 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        i46 = 3;
                    } else {
                        i46 = i13;
                    }
                    if (i26 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i28 != 0) {
                        float f11111 = 1 * 8;
                        c22976l1 = new C22976l1(f11111, f11111, f11111, f11111);
                    }
                    if (i35 != 0) {
                        interfaceC2301g3 = C2299e.f9108K;
                    } else {
                        interfaceC2301g3 = interfaceC2301g;
                    }
                    if ((i16 & 512) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        i34 &= -1879048193;
                    } else {
                        jM125430y = j13;
                    }
                    Modifier modifier111113 = modifier3;
                    i47 = i46;
                    z19 = z14;
                    interfaceC2301g4 = interfaceC2301g3;
                    modifier6 = modifier111113;
                    if (i37 != 0) {
                        modifier7 = c2314t;
                        modifier8 = modifier7;
                    } else {
                        modifier7 = modifier2;
                        modifier8 = c2314t;
                    }
                    i48 = i34;
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i15 = (InterfaceC21083i) objM87133R;
                Modifier modifierM44112a15 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
                C18027i c18027i15 = new C18027i(1);
                i49 = i38 & 112;
                if (i49 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z319 = z24;
                if ((i48 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z319 | z25;
                objM87133R2 = c28655q2.m87133R();
                if (z26) {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3675b(onToggle, z19, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                z27 = z15;
                Modifier modifierM3360e15 = AbstractC1092a.m3360e(modifierM44112a15, interfaceC21083i15, null, z27, c18027i15, (InterfaceC4339a) objM87133R2, 8);
                i54 = i48 >> 18;
                z28 = z19;
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
                i55 = i48;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3360e15);
                InterfaceC0221l.f734a.getClass();
                InterfaceC22973k1 interfaceC22973k17 = c22976l1;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                modifier9 = modifier6;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                if (whoopCheckboxType instanceof AbstractC33088k.i) {
                    c28655q2.m87150e0(950645072);
                    int i61112 = i55 >> 6;
                    int i61113 = (i61112 & 57344) | (i61112 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                    z34 = z28;
                    z29 = z27;
                    long j11113 = jM125430y;
                    i56 = i55;
                    AbstractC33087j.m104822d(z34, null, z29, j11113, modifier9, c28655q2, i61113, 0);
                    modifier10 = modifier9;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    c2314t2 = modifier8;
                    j14 = j11113;
                } else {
                    modifier10 = modifier9;
                    i56 = i55;
                    Modifier modifier111114 = modifier8;
                    long j11114 = jM125430y;
                    z29 = z27;
                    c28655q2.m87150e0(-594521467);
                    C38072d c38072d15 = C38072d.f163053a;
                    j14 = j11114;
                    c2314t2 = modifier111114;
                    AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j11114, c38072d15.m121949b(c28655q2, 6).getBrandWhite(), c38072d15.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                    z34 = z28;
                    c28655q2.m87173q(false);
                }
                AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
                c28655q2.m87173q(true);
                z17 = z34;
                z18 = z29;
                interfaceC22973k2 = interfaceC22973k17;
                interfaceC2301g2 = interfaceC2301g4;
                modifier4 = modifier10;
                i44 = i47;
                modifier5 = modifier7;
            } else {
                c28655q2.m87138X();
                i44 = i13;
                interfaceC22973k2 = c22976l1;
                c28655q = c28655q2;
                z17 = z14;
                z18 = z15;
                modifier4 = modifier3;
                interfaceC2301g2 = interfaceC2301g;
                j14 = j13;
                modifier5 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i34 |= 100663296;
        if ((i14 & 805306368) != 0) {
            i34 |= ((i16 & 512) == 0 || !c28655q2.m87151f(j13)) ? 268435456 : 536870912;
        }
        i37 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i37 != 0) {
            i38 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (c28655q2.m87153g(modifier2)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i38 = i15 | i39;
        } else {
            i38 = i15;
        }
        if ((i15 & 48) == 0) {
            if (c28655q2.m87157i(onToggle)) {
                i57 = 32;
            } else {
                i57 = 16;
            }
            i38 |= i57;
        }
        if ((i34 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q2.m87135U(i34 & 1, z16)) {
            c28655q2.m87140Z();
            i45 = i14 & 1;
            c2314t = C2314t.f9131w;
            if (i45 != 0) {
                if (i59 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if (i24 != 0) {
                    i46 = 3;
                } else {
                    i46 = i13;
                }
                if (i26 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    float f11112 = 1 * 8;
                    c22976l1 = new C22976l1(f11112, f11112, f11112, f11112);
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9108K;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if ((i16 & 512) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i34 &= -1879048193;
                } else {
                    jM125430y = j13;
                }
                Modifier modifier111115 = modifier3;
                i47 = i46;
                z19 = z14;
                interfaceC2301g4 = interfaceC2301g3;
                modifier6 = modifier111115;
                if (i37 != 0) {
                    modifier7 = c2314t;
                    modifier8 = modifier7;
                } else {
                    modifier7 = modifier2;
                    modifier8 = c2314t;
                }
                i48 = i34;
            } else {
                if (i59 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if (i24 != 0) {
                    i46 = 3;
                } else {
                    i46 = i13;
                }
                if (i26 != 0) {
                    modifier3 = c2314t;
                }
                if (i28 != 0) {
                    float f11113 = 1 * 8;
                    c22976l1 = new C22976l1(f11113, f11113, f11113, f11113);
                }
                if (i35 != 0) {
                    interfaceC2301g3 = C2299e.f9108K;
                } else {
                    interfaceC2301g3 = interfaceC2301g;
                }
                if ((i16 & 512) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    i34 &= -1879048193;
                } else {
                    jM125430y = j13;
                }
                Modifier modifier111116 = modifier3;
                i47 = i46;
                z19 = z14;
                interfaceC2301g4 = interfaceC2301g3;
                modifier6 = modifier111116;
                if (i37 != 0) {
                    modifier7 = c2314t;
                    modifier8 = modifier7;
                } else {
                    modifier7 = modifier2;
                    modifier8 = c2314t;
                }
                i48 = i34;
            }
            c28655q2.m87175r();
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i16 = (InterfaceC21083i) objM87133R;
            Modifier modifierM44112a16 = AbstractC15680h.m44112a(AbstractC1099a.m3393o(c22976l1, modifier7), z15);
            C18027i c18027i16 = new C18027i(1);
            i49 = i38 & 112;
            if (i49 == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z3110 = z24;
            if ((i48 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z3110 | z25;
            objM87133R2 = c28655q2.m87133R();
            if (z26) {
                objM87133R2 = new C3675b(onToggle, z19, 9);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3675b(onToggle, z19, 9);
                c28655q2.m87172p0(objM87133R2);
            }
            z27 = z15;
            Modifier modifierM3360e16 = AbstractC1092a.m3360e(modifierM44112a16, interfaceC21083i16, null, z27, c18027i16, (InterfaceC4339a) objM87133R2, 8);
            i54 = i48 >> 18;
            z28 = z19;
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, interfaceC2301g4, c28655q2, ((i54 & 896) >> 3) & 112);
            i55 = i48;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3360e16);
            InterfaceC0221l.f734a.getClass();
            InterfaceC22973k1 interfaceC22973k18 = c22976l1;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            modifier9 = modifier6;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a16);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
            if (whoopCheckboxType instanceof AbstractC33088k.i) {
                c28655q2.m87150e0(950645072);
                int i61114 = i55 >> 6;
                int i61115 = (i61114 & 57344) | (i61114 & 14) | 48 | ((i55 >> 3) & 896) | (i54 & 7168);
                z34 = z28;
                z29 = z27;
                long j11115 = jM125430y;
                i56 = i55;
                AbstractC33087j.m104822d(z34, null, z29, j11115, modifier9, c28655q2, i61115, 0);
                modifier10 = modifier9;
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
                c2314t2 = modifier8;
                j14 = j11115;
            } else {
                modifier10 = modifier9;
                i56 = i55;
                Modifier modifier111117 = modifier8;
                long j11116 = jM125430y;
                z29 = z27;
                c28655q2.m87150e0(-594521467);
                C38072d c38072d16 = C38072d.f163053a;
                j14 = j11116;
                c2314t2 = modifier111117;
                AbstractC14959b1.m43082a(z28, onToggle, modifier10, z29, AbstractC12240d.m34081r(j11116, c38072d16.m121949b(c28655q2, 6).getBrandWhite(), c38072d16.m121949b(c28655q2, 6).getBrandBlack(), 0L, c28655q2, (i56 >> 27) & 14, 24), c28655q2, ((i56 >> 6) & 14) | i49 | ((i56 >> 12) & 896) | (i56 & 7168), 16);
                z34 = z28;
                c28655q2.m87173q(false);
            }
            AbstractC18489d0.m53380u(i47, 4, c2314t2, c28655q2);
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q2, i56 & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, (i56 >> 9) & 896, 0, 196602);
            c28655q2.m87173q(true);
            z17 = z34;
            z18 = z29;
            interfaceC22973k2 = interfaceC22973k18;
            interfaceC2301g2 = interfaceC2301g4;
            modifier4 = modifier10;
            i44 = i47;
            modifier5 = modifier7;
        } else {
            c28655q2.m87138X();
            i44 = i13;
            interfaceC22973k2 = c22976l1;
            c28655q = c28655q2;
            z17 = z14;
            z18 = z15;
            modifier4 = modifier3;
            interfaceC2301g2 = interfaceC2301g;
            j14 = j13;
            modifier5 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sy0.q
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33095r.m104856e(text, whoopCheckboxType, z17, z18, i44, j7, modifier4, interfaceC22973k2, interfaceC2301g2, j14, modifier5, onToggle, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104855d(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104856e(TextResource textResource, AbstractC33088k abstractC33088k, boolean z4, boolean z13, int i13, long j7, Modifier modifier, InterfaceC22973k1 interfaceC22973k1, InterfaceC2301g interfaceC2301g, long j13, Modifier modifier2, Function1 function1, int i14, int i15, int i16, Composer composer, int i17) {
        m104854c(textResource, abstractC33088k, z4, z13, i13, j7, modifier, interfaceC22973k1, interfaceC2301g, j13, modifier2, function1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }
}
