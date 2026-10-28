package v41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4150x4;
import c93.InterfaceC4339a;
import gb1.AbstractC15673b0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27274q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22969j0;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32585b0;
import p734sl0.C32587b2;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import v40.C35652d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: v41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a«\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll1/w3;", "sheetState", "Lv41/g;", "bottomSheetTopBarViewState", "Ly81/e;", "scrimColor", "Lkotlin/Function0;", "Ll83/a0;", "onLeftIconClicked", "onRightIconClicked", "onDismissRequest", "Li2/a1;", "sheetShape", "", "showHandle", "Lny0/q;", "gestureIconType", "Li2/t;", "background", "sheetGesturesEnabled", "Lkotlin/Function1;", "Ll0/y;", "sheetContent", "g", "(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35662e {
    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01af  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:168:0x0215  */
    /* JADX WARN: Code duplicated, block: B:170:0x0219  */
    /* JADX WARN: Code duplicated, block: B:171:0x021c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0222  */
    /* JADX WARN: Code duplicated, block: B:176:0x0228  */
    /* JADX WARN: Code duplicated, block: B:178:0x0234  */
    /* JADX WARN: Code duplicated, block: B:180:0x0237  */
    /* JADX WARN: Code duplicated, block: B:182:0x023d  */
    /* JADX WARN: Code duplicated, block: B:185:0x024b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x0260  */
    /* JADX WARN: Code duplicated, block: B:192:0x026d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0271  */
    /* JADX WARN: Code duplicated, block: B:195:0x0274  */
    /* JADX WARN: Code duplicated, block: B:197:0x0278  */
    /* JADX WARN: Code duplicated, block: B:198:0x027b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0281  */
    /* JADX WARN: Code duplicated, block: B:202:0x0288  */
    /* JADX WARN: Code duplicated, block: B:205:0x028f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0293  */
    /* JADX WARN: Code duplicated, block: B:208:0x0325  */
    /* JADX WARN: Code duplicated, block: B:211:0x0342  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX INFO: renamed from: g */
    public static final void m112943g(Modifier modifier, C23196w3 sheetState, C35666g c35666g, InterfaceC39332e interfaceC39332e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC17869a1 interfaceC17869a1, boolean z4, AbstractC27274q abstractC27274q, AbstractC17911t abstractC17911t, boolean z13, Function3 sheetContent, Composer composer, int i13, int i14, int i15) {
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        InterfaceC4339a interfaceC4339a5;
        int i18;
        int i19;
        InterfaceC4339a interfaceC4339a6;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean z14;
        C28655q c28655q;
        C35666g c35666g2;
        InterfaceC39332e interfaceC39332e2;
        InterfaceC17869a1 interfaceC17869a2;
        AbstractC17911t abstractC17911t2;
        boolean z15;
        InterfaceC4339a interfaceC4339a7;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        boolean z16;
        AbstractC27274q abstractC27274q2;
        C28677v1 c28677v1M87180u;
        C35666g c35666g3;
        InterfaceC39332e interfaceC39332e3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a10;
        InterfaceC17869a1 interfaceC17869a1M105491g;
        boolean z17;
        AbstractC27274q abstractC27274q3;
        AbstractC17911t abstractC17911tM44012U;
        int i37;
        InterfaceC39332e interfaceC39332e4;
        boolean z18;
        InterfaceC17869a1 interfaceC17869a3;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        int i38;
        AbstractC22676k.m65750j(sheetState, "sheetState");
        AbstractC22676k.m65750j(sheetContent, "sheetContent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2069716204);
        int i39 = i15 & 1;
        if (i39 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(sheetState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i15 & 4) != 0) {
                i38 = 128;
            } else {
                if ((i13 & 512) == 0 ? c28655q2.m87153g(c35666g) : c28655q2.m87157i(c35666g)) {
                    i38 = 256;
                } else {
                    i38 = 128;
                }
            }
            i16 |= i38;
        }
        int i44 = i15 & 8;
        if (i44 != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i16 |= (i13 & 4096) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i45 = i15 & 16;
        if (i45 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a;
                i16 |= c28655q2.m87157i(interfaceC4339a4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a5 = interfaceC4339a2;
            } else {
                interfaceC4339a5 = interfaceC4339a2;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a5)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                interfaceC4339a6 = interfaceC4339a3;
            } else {
                interfaceC4339a6 = interfaceC4339a3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a6)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
            }
            if ((i13 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q2.m87153g(interfaceC17869a1)) ? 4194304 : 8388608;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    if ((i13 & 805306368) == 0) {
                        if (c28655q2.m87153g(abstractC27274q)) {
                            i28 = 536870912;
                        } else {
                            i28 = 268435456;
                        }
                        i16 |= i28;
                    }
                    if ((i14 & 6) == 0) {
                        i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
                    } else {
                        i29 = i14;
                    }
                    i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    if (i34 != 0) {
                        if ((i14 & 48) == 0) {
                            if (c28655q2.m87155h(z13)) {
                                i35 = 32;
                            } else {
                                i35 = 16;
                            }
                            i29 |= i35;
                        }
                        if ((i14 & 384) == 0) {
                            i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                        }
                        i36 = i29;
                        if ((i16 & 306783379) == 306783378 || (i36 & 147) != 146) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q2.m87135U(i16 & 1, z14)) {
                            c28655q2.m87140Z();
                            if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                                if (i39 != 0) {
                                    modifier3 = C2314t.f9131w;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if ((i15 & 4) != 0) {
                                    c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                    i16 &= -897;
                                } else {
                                    c35666g3 = c35666g;
                                }
                                if (i44 != 0) {
                                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                                } else {
                                    interfaceC39332e3 = interfaceC39332e;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i45 != 0) {
                                    objM87133R3 = c28655q2.m87133R();
                                    if (objM87133R3 == c28676v0) {
                                        objM87133R3 = new C35652d(3);
                                        c28655q2.m87172p0(objM87133R3);
                                    }
                                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                                } else {
                                    interfaceC4339a10 = interfaceC4339a4;
                                }
                                if (i17 != 0) {
                                    objM87133R2 = c28655q2.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = new C35652d(4);
                                        c28655q2.m87172p0(objM87133R2);
                                    }
                                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                                }
                                if (i19 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C35652d(5);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                                }
                                if ((i15 & 128) != 0) {
                                    float f13 = 4;
                                    float f14 = f13 * f13;
                                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
                                    i16 = (-29360129) & i16;
                                } else {
                                    interfaceC17869a1M105491g = interfaceC17869a1;
                                }
                                if (i25 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = z4;
                                }
                                if (i27 != 0) {
                                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                                } else {
                                    abstractC27274q3 = abstractC27274q;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                    i36 &= -15;
                                } else {
                                    abstractC17911tM44012U = abstractC17911t;
                                }
                                InterfaceC39332e interfaceC39332e5 = interfaceC39332e3;
                                i37 = i36;
                                interfaceC39332e4 = interfaceC39332e5;
                                if (i34 != 0) {
                                    interfaceC17869a3 = interfaceC17869a1M105491g;
                                    z18 = true;
                                } else {
                                    z18 = z13;
                                    interfaceC17869a3 = interfaceC17869a1M105491g;
                                }
                            } else {
                                c28655q2.m87138X();
                                if ((i15 & 4) != 0) {
                                    i16 &= -897;
                                }
                                if ((i15 & 128) != 0) {
                                    i16 &= -29360129;
                                }
                                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i36 &= -15;
                                }
                                c35666g3 = c35666g;
                                interfaceC17869a3 = interfaceC17869a1;
                                z17 = z4;
                                abstractC27274q3 = abstractC27274q;
                                z18 = z13;
                                i37 = i36;
                                modifier3 = modifier2;
                                interfaceC4339a10 = interfaceC4339a4;
                                interfaceC39332e4 = interfaceC39332e;
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            c28655q2.m87175r();
                            long j7 = C17919x.f69636m;
                            long jMo134584toComposableColorWaAFU9c = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                            AbstractC17911t abstractC17911t3 = abstractC17911tM44012U;
                            InterfaceC39332e interfaceC39332e6 = interfaceC39332e4;
                            boolean z19 = z17;
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a10;
                            AbstractC27274q abstractC27274q4 = abstractC27274q3;
                            InterfaceC4339a interfaceC4339a12 = interfaceC4339a5;
                            int i46 = i16 << 3;
                            c28655q = c28655q2;
                            InterfaceC4339a interfaceC4339a13 = interfaceC4339a6;
                            AbstractC23141n2.m67119a(interfaceC4339a13, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j7, 0L, 0.0f, jMo134584toComposableColorWaAFU9c, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t3, z19, c35666g3, interfaceC4339a11, interfaceC4339a12, abstractC27274q4, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i46 & 112) | (i46 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                            interfaceC4339a7 = interfaceC4339a13;
                            z15 = z18;
                            interfaceC17869a2 = interfaceC17869a3;
                            interfaceC4339a8 = interfaceC4339a11;
                            interfaceC39332e2 = interfaceC39332e6;
                            interfaceC4339a9 = interfaceC4339a12;
                            z16 = z19;
                            abstractC27274q2 = abstractC27274q4;
                            abstractC17911t2 = abstractC17911t3;
                            c35666g2 = c35666g3;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            c35666g2 = c35666g;
                            interfaceC39332e2 = interfaceC39332e;
                            interfaceC17869a2 = interfaceC17869a1;
                            abstractC17911t2 = abstractC17911t;
                            z15 = z13;
                            interfaceC4339a7 = interfaceC4339a6;
                            modifier3 = modifier2;
                            interfaceC4339a8 = interfaceC4339a4;
                            interfaceC4339a9 = interfaceC4339a5;
                            z16 = z4;
                            abstractC27274q2 = abstractC27274q;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                        }
                    }
                    i29 |= 48;
                    if ((i14 & 384) == 0) {
                        i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                    }
                    i36 = i29;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f15 = 4;
                                float f16 = f15 * f15;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f16, f16, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e7 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e7;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f17 = 4;
                                float f18 = f17 * f17;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f18, f18, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e8 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e8;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        }
                        c28655q2.m87175r();
                        long j13 = C17919x.f69636m;
                        long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                        AbstractC17911t abstractC17911t4 = abstractC17911tM44012U;
                        InterfaceC39332e interfaceC39332e9 = interfaceC39332e4;
                        boolean z110 = z17;
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a10;
                        AbstractC27274q abstractC27274q5 = abstractC27274q3;
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a5;
                        int i47 = i16 << 3;
                        c28655q = c28655q2;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a6;
                        AbstractC23141n2.m67119a(interfaceC4339a16, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j13, 0L, 0.0f, jMo134584toComposableColorWaAFU9c2, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t4, z110, c35666g3, interfaceC4339a14, interfaceC4339a15, abstractC27274q5, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i47 & 112) | (i47 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                        interfaceC4339a7 = interfaceC4339a16;
                        z15 = z18;
                        interfaceC17869a2 = interfaceC17869a3;
                        interfaceC4339a8 = interfaceC4339a14;
                        interfaceC39332e2 = interfaceC39332e9;
                        interfaceC4339a9 = interfaceC4339a15;
                        z16 = z110;
                        abstractC27274q2 = abstractC27274q5;
                        abstractC17911t2 = abstractC17911t4;
                        c35666g2 = c35666g3;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c35666g2 = c35666g;
                        interfaceC39332e2 = interfaceC39332e;
                        interfaceC17869a2 = interfaceC17869a1;
                        abstractC17911t2 = abstractC17911t;
                        z15 = z13;
                        interfaceC4339a7 = interfaceC4339a6;
                        modifier3 = modifier2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        z16 = z4;
                        abstractC27274q2 = abstractC27274q;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                    }
                }
                i16 |= 805306368;
                if ((i14 & 6) == 0) {
                    i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
                } else {
                    i29 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87155h(z13)) {
                            i35 = 32;
                        } else {
                            i35 = 16;
                        }
                        i29 |= i35;
                    }
                    if ((i14 & 384) == 0) {
                        i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                    }
                    i36 = i29;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f19 = 4;
                                float f110 = f19 * f19;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f110, f110, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e10 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e10;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f111 = 4;
                                float f112 = f111 * f111;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f112, f112, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e11 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e11;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        }
                        c28655q2.m87175r();
                        long j14 = C17919x.f69636m;
                        long jMo134584toComposableColorWaAFU9c3 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                        AbstractC17911t abstractC17911t5 = abstractC17911tM44012U;
                        InterfaceC39332e interfaceC39332e12 = interfaceC39332e4;
                        boolean z111 = z17;
                        InterfaceC4339a interfaceC4339a17 = interfaceC4339a10;
                        AbstractC27274q abstractC27274q6 = abstractC27274q3;
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a5;
                        int i48 = i16 << 3;
                        c28655q = c28655q2;
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a6;
                        AbstractC23141n2.m67119a(interfaceC4339a19, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j14, 0L, 0.0f, jMo134584toComposableColorWaAFU9c3, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t5, z111, c35666g3, interfaceC4339a17, interfaceC4339a18, abstractC27274q6, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i48 & 112) | (i48 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                        interfaceC4339a7 = interfaceC4339a19;
                        z15 = z18;
                        interfaceC17869a2 = interfaceC17869a3;
                        interfaceC4339a8 = interfaceC4339a17;
                        interfaceC39332e2 = interfaceC39332e12;
                        interfaceC4339a9 = interfaceC4339a18;
                        z16 = z111;
                        abstractC27274q2 = abstractC27274q6;
                        abstractC17911t2 = abstractC17911t5;
                        c35666g2 = c35666g3;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c35666g2 = c35666g;
                        interfaceC39332e2 = interfaceC39332e;
                        interfaceC17869a2 = interfaceC17869a1;
                        abstractC17911t2 = abstractC17911t;
                        z15 = z13;
                        interfaceC4339a7 = interfaceC4339a6;
                        modifier3 = modifier2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        z16 = z4;
                        abstractC27274q2 = abstractC27274q;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                    }
                }
                i29 |= 48;
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f113 = 4;
                            float f114 = f113 * f113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f114, f114, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e13 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e13;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f115 = 4;
                            float f116 = f115 * f115;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f116, f116, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e14 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e14;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j15 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c4 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t6 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e15 = interfaceC39332e4;
                    boolean z112 = z17;
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q7 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a111 = interfaceC4339a5;
                    int i49 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a112, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j15, 0L, 0.0f, jMo134584toComposableColorWaAFU9c4, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t6, z112, c35666g3, interfaceC4339a110, interfaceC4339a111, abstractC27274q7, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i49 & 112) | (i49 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a112;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a110;
                    interfaceC39332e2 = interfaceC39332e15;
                    interfaceC4339a9 = interfaceC4339a111;
                    z16 = z112;
                    abstractC27274q2 = abstractC27274q7;
                    abstractC17911t2 = abstractC17911t6;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i16 |= 100663296;
            i27 = i15 & 512;
            if (i27 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87153g(abstractC27274q)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i16 |= i28;
                }
                if ((i14 & 6) == 0) {
                    i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
                } else {
                    i29 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87155h(z13)) {
                            i35 = 32;
                        } else {
                            i35 = 16;
                        }
                        i29 |= i35;
                    }
                    if ((i14 & 384) == 0) {
                        i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                    }
                    i36 = i29;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f117 = 4;
                                float f118 = f117 * f117;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f118, f118, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e16 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e16;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f119 = 4;
                                float f1110 = f119 * f119;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1110, f1110, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e17 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e17;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        }
                        c28655q2.m87175r();
                        long j16 = C17919x.f69636m;
                        long jMo134584toComposableColorWaAFU9c5 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                        AbstractC17911t abstractC17911t7 = abstractC17911tM44012U;
                        InterfaceC39332e interfaceC39332e18 = interfaceC39332e4;
                        boolean z113 = z17;
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a10;
                        AbstractC27274q abstractC27274q8 = abstractC27274q3;
                        InterfaceC4339a interfaceC4339a114 = interfaceC4339a5;
                        int i410 = i16 << 3;
                        c28655q = c28655q2;
                        InterfaceC4339a interfaceC4339a115 = interfaceC4339a6;
                        AbstractC23141n2.m67119a(interfaceC4339a115, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j16, 0L, 0.0f, jMo134584toComposableColorWaAFU9c5, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t7, z113, c35666g3, interfaceC4339a113, interfaceC4339a114, abstractC27274q8, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i410 & 112) | (i410 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                        interfaceC4339a7 = interfaceC4339a115;
                        z15 = z18;
                        interfaceC17869a2 = interfaceC17869a3;
                        interfaceC4339a8 = interfaceC4339a113;
                        interfaceC39332e2 = interfaceC39332e18;
                        interfaceC4339a9 = interfaceC4339a114;
                        z16 = z113;
                        abstractC27274q2 = abstractC27274q8;
                        abstractC17911t2 = abstractC17911t7;
                        c35666g2 = c35666g3;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c35666g2 = c35666g;
                        interfaceC39332e2 = interfaceC39332e;
                        interfaceC17869a2 = interfaceC17869a1;
                        abstractC17911t2 = abstractC17911t;
                        z15 = z13;
                        interfaceC4339a7 = interfaceC4339a6;
                        modifier3 = modifier2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        z16 = z4;
                        abstractC27274q2 = abstractC27274q;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                    }
                }
                i29 |= 48;
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f1111 = 4;
                            float f1112 = f1111 * f1111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1112, f1112, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e19 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e19;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f1113 = 4;
                            float f1114 = f1113 * f1113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1114, f1114, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e110 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e110;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j17 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c6 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t8 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e111 = interfaceC39332e4;
                    boolean z114 = z17;
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q9 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a5;
                    int i411 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a118, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j17, 0L, 0.0f, jMo134584toComposableColorWaAFU9c6, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t8, z114, c35666g3, interfaceC4339a116, interfaceC4339a117, abstractC27274q9, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i411 & 112) | (i411 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a118;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a116;
                    interfaceC39332e2 = interfaceC39332e111;
                    interfaceC4339a9 = interfaceC4339a117;
                    z16 = z114;
                    abstractC27274q2 = abstractC27274q9;
                    abstractC17911t2 = abstractC17911t8;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            if ((i14 & 6) == 0) {
                i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
            } else {
                i29 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i29 |= i35;
                }
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f1115 = 4;
                            float f1116 = f1115 * f1115;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1116, f1116, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e112 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e112;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f1117 = 4;
                            float f1118 = f1117 * f1117;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1118, f1118, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e113 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e113;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j18 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c7 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t9 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e114 = interfaceC39332e4;
                    boolean z115 = z17;
                    InterfaceC4339a interfaceC4339a119 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q10 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a1110 = interfaceC4339a5;
                    int i412 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a1111 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a1111, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j18, 0L, 0.0f, jMo134584toComposableColorWaAFU9c7, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t9, z115, c35666g3, interfaceC4339a119, interfaceC4339a1110, abstractC27274q10, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i412 & 112) | (i412 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a1111;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a119;
                    interfaceC39332e2 = interfaceC39332e114;
                    interfaceC4339a9 = interfaceC4339a1110;
                    z16 = z115;
                    abstractC27274q2 = abstractC27274q10;
                    abstractC17911t2 = abstractC17911t9;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i29 |= 48;
            if ((i14 & 384) == 0) {
                i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
            }
            i36 = i29;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f1119 = 4;
                        float f11110 = f1119 * f1119;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11110, f11110, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e115 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e115;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f11111 = 4;
                        float f11112 = f11111 * f11111;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11112, f11112, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e116 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e116;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                }
                c28655q2.m87175r();
                long j19 = C17919x.f69636m;
                long jMo134584toComposableColorWaAFU9c8 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                AbstractC17911t abstractC17911t10 = abstractC17911tM44012U;
                InterfaceC39332e interfaceC39332e117 = interfaceC39332e4;
                boolean z116 = z17;
                InterfaceC4339a interfaceC4339a1112 = interfaceC4339a10;
                AbstractC27274q abstractC27274q11 = abstractC27274q3;
                InterfaceC4339a interfaceC4339a1113 = interfaceC4339a5;
                int i413 = i16 << 3;
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a1114 = interfaceC4339a6;
                AbstractC23141n2.m67119a(interfaceC4339a1114, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j19, 0L, 0.0f, jMo134584toComposableColorWaAFU9c8, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t10, z116, c35666g3, interfaceC4339a1112, interfaceC4339a1113, abstractC27274q11, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i413 & 112) | (i413 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                interfaceC4339a7 = interfaceC4339a1114;
                z15 = z18;
                interfaceC17869a2 = interfaceC17869a3;
                interfaceC4339a8 = interfaceC4339a1112;
                interfaceC39332e2 = interfaceC39332e117;
                interfaceC4339a9 = interfaceC4339a1113;
                z16 = z116;
                abstractC27274q2 = abstractC27274q11;
                abstractC17911t2 = abstractC17911t10;
                c35666g2 = c35666g3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c35666g2 = c35666g;
                interfaceC39332e2 = interfaceC39332e;
                interfaceC17869a2 = interfaceC17869a1;
                abstractC17911t2 = abstractC17911t;
                z15 = z13;
                interfaceC4339a7 = interfaceC4339a6;
                modifier3 = modifier2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                z16 = z4;
                abstractC27274q2 = abstractC27274q;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
            }
        }
        i16 |= 24576;
        interfaceC4339a4 = interfaceC4339a;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a5 = interfaceC4339a2;
        } else {
            interfaceC4339a5 = interfaceC4339a2;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(interfaceC4339a5)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            interfaceC4339a6 = interfaceC4339a3;
        } else {
            interfaceC4339a6 = interfaceC4339a3;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4339a6)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
        }
        if ((i13 & 12582912) != 0) {
            i16 |= ((i15 & 128) == 0 || !c28655q2.m87153g(interfaceC17869a1)) ? 4194304 : 8388608;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87153g(abstractC27274q)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i16 |= i28;
                }
                if ((i14 & 6) == 0) {
                    i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
                } else {
                    i29 = i14;
                }
                i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i34 != 0) {
                    if ((i14 & 48) == 0) {
                        if (c28655q2.m87155h(z13)) {
                            i35 = 32;
                        } else {
                            i35 = 16;
                        }
                        i29 |= i35;
                    }
                    if ((i14 & 384) == 0) {
                        i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                    }
                    i36 = i29;
                    if ((i16 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c28655q2.m87135U(i16 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f11113 = 4;
                                float f11114 = f11113 * f11113;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11114, f11114, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e118 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e118;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = C2314t.f9131w;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i15 & 4) != 0) {
                                c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                                i16 &= -897;
                            } else {
                                c35666g3 = c35666g;
                            }
                            if (i44 != 0) {
                                interfaceC39332e3 = EnumC39333f.BLACK_90;
                            } else {
                                interfaceC39332e3 = interfaceC39332e;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C35652d(3);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i17 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C35652d(4);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i19 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C35652d(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if ((i15 & 128) != 0) {
                                float f11115 = 4;
                                float f11116 = f11115 * f11115;
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11116, f11116, 0.0f, 0.0f, 12);
                                i16 = (-29360129) & i16;
                            } else {
                                interfaceC17869a1M105491g = interfaceC17869a1;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            } else {
                                z17 = z4;
                            }
                            if (i27 != 0) {
                                abstractC27274q3 = AbstractC27274q.c.f109140f;
                            } else {
                                abstractC27274q3 = abstractC27274q;
                            }
                            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC17911tM44012U = AbstractC15673b0.m44012U();
                                i36 &= -15;
                            } else {
                                abstractC17911tM44012U = abstractC17911t;
                            }
                            InterfaceC39332e interfaceC39332e119 = interfaceC39332e3;
                            i37 = i36;
                            interfaceC39332e4 = interfaceC39332e119;
                            if (i34 != 0) {
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                                z18 = true;
                            } else {
                                z18 = z13;
                                interfaceC17869a3 = interfaceC17869a1M105491g;
                            }
                        }
                        c28655q2.m87175r();
                        long j110 = C17919x.f69636m;
                        long jMo134584toComposableColorWaAFU9c9 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                        AbstractC17911t abstractC17911t11 = abstractC17911tM44012U;
                        InterfaceC39332e interfaceC39332e1110 = interfaceC39332e4;
                        boolean z117 = z17;
                        InterfaceC4339a interfaceC4339a1115 = interfaceC4339a10;
                        AbstractC27274q abstractC27274q12 = abstractC27274q3;
                        InterfaceC4339a interfaceC4339a1116 = interfaceC4339a5;
                        int i414 = i16 << 3;
                        c28655q = c28655q2;
                        InterfaceC4339a interfaceC4339a1117 = interfaceC4339a6;
                        AbstractC23141n2.m67119a(interfaceC4339a1117, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j110, 0L, 0.0f, jMo134584toComposableColorWaAFU9c9, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t11, z117, c35666g3, interfaceC4339a1115, interfaceC4339a1116, abstractC27274q12, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i414 & 112) | (i414 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                        interfaceC4339a7 = interfaceC4339a1117;
                        z15 = z18;
                        interfaceC17869a2 = interfaceC17869a3;
                        interfaceC4339a8 = interfaceC4339a1115;
                        interfaceC39332e2 = interfaceC39332e1110;
                        interfaceC4339a9 = interfaceC4339a1116;
                        z16 = z117;
                        abstractC27274q2 = abstractC27274q12;
                        abstractC17911t2 = abstractC17911t11;
                        c35666g2 = c35666g3;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c35666g2 = c35666g;
                        interfaceC39332e2 = interfaceC39332e;
                        interfaceC17869a2 = interfaceC17869a1;
                        abstractC17911t2 = abstractC17911t;
                        z15 = z13;
                        interfaceC4339a7 = interfaceC4339a6;
                        modifier3 = modifier2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        z16 = z4;
                        abstractC27274q2 = abstractC27274q;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                    }
                }
                i29 |= 48;
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f11117 = 4;
                            float f11118 = f11117 * f11117;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11118, f11118, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e1111 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e1111;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f11119 = 4;
                            float f111110 = f11119 * f11119;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111110, f111110, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e1112 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e1112;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j111 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c10 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t12 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e1113 = interfaceC39332e4;
                    boolean z118 = z17;
                    InterfaceC4339a interfaceC4339a1118 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q13 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a1119 = interfaceC4339a5;
                    int i415 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a11110 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a11110, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j111, 0L, 0.0f, jMo134584toComposableColorWaAFU9c10, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t12, z118, c35666g3, interfaceC4339a1118, interfaceC4339a1119, abstractC27274q13, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i415 & 112) | (i415 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a11110;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a1118;
                    interfaceC39332e2 = interfaceC39332e1113;
                    interfaceC4339a9 = interfaceC4339a1119;
                    z16 = z118;
                    abstractC27274q2 = abstractC27274q13;
                    abstractC17911t2 = abstractC17911t12;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i16 |= 805306368;
            if ((i14 & 6) == 0) {
                i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
            } else {
                i29 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i29 |= i35;
                }
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f111111 = 4;
                            float f111112 = f111111 * f111111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111112, f111112, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e1114 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e1114;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f111113 = 4;
                            float f111114 = f111113 * f111113;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111114, f111114, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e1115 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e1115;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j112 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c11 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t13 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e1116 = interfaceC39332e4;
                    boolean z119 = z17;
                    InterfaceC4339a interfaceC4339a11111 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q14 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a11112 = interfaceC4339a5;
                    int i416 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a11113 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a11113, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j112, 0L, 0.0f, jMo134584toComposableColorWaAFU9c11, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t13, z119, c35666g3, interfaceC4339a11111, interfaceC4339a11112, abstractC27274q14, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i416 & 112) | (i416 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a11113;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a11111;
                    interfaceC39332e2 = interfaceC39332e1116;
                    interfaceC4339a9 = interfaceC4339a11112;
                    z16 = z119;
                    abstractC27274q2 = abstractC27274q14;
                    abstractC17911t2 = abstractC17911t13;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i29 |= 48;
            if ((i14 & 384) == 0) {
                i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
            }
            i36 = i29;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f111115 = 4;
                        float f111116 = f111115 * f111115;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111116, f111116, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e1117 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e1117;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f111117 = 4;
                        float f111118 = f111117 * f111117;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f111118, f111118, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e1118 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e1118;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                }
                c28655q2.m87175r();
                long j113 = C17919x.f69636m;
                long jMo134584toComposableColorWaAFU9c12 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                AbstractC17911t abstractC17911t14 = abstractC17911tM44012U;
                InterfaceC39332e interfaceC39332e1119 = interfaceC39332e4;
                boolean z1110 = z17;
                InterfaceC4339a interfaceC4339a11114 = interfaceC4339a10;
                AbstractC27274q abstractC27274q15 = abstractC27274q3;
                InterfaceC4339a interfaceC4339a11115 = interfaceC4339a5;
                int i417 = i16 << 3;
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a11116 = interfaceC4339a6;
                AbstractC23141n2.m67119a(interfaceC4339a11116, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j113, 0L, 0.0f, jMo134584toComposableColorWaAFU9c12, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t14, z1110, c35666g3, interfaceC4339a11114, interfaceC4339a11115, abstractC27274q15, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i417 & 112) | (i417 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                interfaceC4339a7 = interfaceC4339a11116;
                z15 = z18;
                interfaceC17869a2 = interfaceC17869a3;
                interfaceC4339a8 = interfaceC4339a11114;
                interfaceC39332e2 = interfaceC39332e1119;
                interfaceC4339a9 = interfaceC4339a11115;
                z16 = z1110;
                abstractC27274q2 = abstractC27274q15;
                abstractC17911t2 = abstractC17911t14;
                c35666g2 = c35666g3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c35666g2 = c35666g;
                interfaceC39332e2 = interfaceC39332e;
                interfaceC17869a2 = interfaceC17869a1;
                abstractC17911t2 = abstractC17911t;
                z15 = z13;
                interfaceC4339a7 = interfaceC4339a6;
                modifier3 = modifier2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                z16 = z4;
                abstractC27274q2 = abstractC27274q;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
            }
        }
        i16 |= 100663296;
        i27 = i15 & 512;
        if (i27 != 0) {
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(abstractC27274q)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i16 |= i28;
            }
            if ((i14 & 6) == 0) {
                i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
            } else {
                i29 = i14;
            }
            i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i34 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i29 |= i35;
                }
                if ((i14 & 384) == 0) {
                    i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
                }
                i36 = i29;
                if ((i16 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c28655q2.m87135U(i16 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f111119 = 4;
                            float f1111110 = f111119 * f111119;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111110, f1111110, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e11110 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e11110;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i15 & 4) != 0) {
                            c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                            i16 &= -897;
                        } else {
                            c35666g3 = c35666g;
                        }
                        if (i44 != 0) {
                            interfaceC39332e3 = EnumC39333f.BLACK_90;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35652d(3);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i17 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35652d(4);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i19 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35652d(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if ((i15 & 128) != 0) {
                            float f1111111 = 4;
                            float f1111112 = f1111111 * f1111111;
                            interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111112, f1111112, 0.0f, 0.0f, 12);
                            i16 = (-29360129) & i16;
                        } else {
                            interfaceC17869a1M105491g = interfaceC17869a1;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        } else {
                            z17 = z4;
                        }
                        if (i27 != 0) {
                            abstractC27274q3 = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q3 = abstractC27274q;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC17911tM44012U = AbstractC15673b0.m44012U();
                            i36 &= -15;
                        } else {
                            abstractC17911tM44012U = abstractC17911t;
                        }
                        InterfaceC39332e interfaceC39332e11111 = interfaceC39332e3;
                        i37 = i36;
                        interfaceC39332e4 = interfaceC39332e11111;
                        if (i34 != 0) {
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                            z18 = true;
                        } else {
                            z18 = z13;
                            interfaceC17869a3 = interfaceC17869a1M105491g;
                        }
                    }
                    c28655q2.m87175r();
                    long j114 = C17919x.f69636m;
                    long jMo134584toComposableColorWaAFU9c13 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                    AbstractC17911t abstractC17911t15 = abstractC17911tM44012U;
                    InterfaceC39332e interfaceC39332e11112 = interfaceC39332e4;
                    boolean z1111 = z17;
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a10;
                    AbstractC27274q abstractC27274q16 = abstractC27274q3;
                    InterfaceC4339a interfaceC4339a11118 = interfaceC4339a5;
                    int i418 = i16 << 3;
                    c28655q = c28655q2;
                    InterfaceC4339a interfaceC4339a11119 = interfaceC4339a6;
                    AbstractC23141n2.m67119a(interfaceC4339a11119, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j114, 0L, 0.0f, jMo134584toComposableColorWaAFU9c13, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t15, z1111, c35666g3, interfaceC4339a11117, interfaceC4339a11118, abstractC27274q16, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i418 & 112) | (i418 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                    interfaceC4339a7 = interfaceC4339a11119;
                    z15 = z18;
                    interfaceC17869a2 = interfaceC17869a3;
                    interfaceC4339a8 = interfaceC4339a11117;
                    interfaceC39332e2 = interfaceC39332e11112;
                    interfaceC4339a9 = interfaceC4339a11118;
                    z16 = z1111;
                    abstractC27274q2 = abstractC27274q16;
                    abstractC17911t2 = abstractC17911t15;
                    c35666g2 = c35666g3;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c35666g2 = c35666g;
                    interfaceC39332e2 = interfaceC39332e;
                    interfaceC17869a2 = interfaceC17869a1;
                    abstractC17911t2 = abstractC17911t;
                    z15 = z13;
                    interfaceC4339a7 = interfaceC4339a6;
                    modifier3 = modifier2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    z16 = z4;
                    abstractC27274q2 = abstractC27274q;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
                }
            }
            i29 |= 48;
            if ((i14 & 384) == 0) {
                i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
            }
            i36 = i29;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f1111113 = 4;
                        float f1111114 = f1111113 * f1111113;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111114, f1111114, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e11113 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e11113;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f1111115 = 4;
                        float f1111116 = f1111115 * f1111115;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111116, f1111116, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e11114 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e11114;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                }
                c28655q2.m87175r();
                long j115 = C17919x.f69636m;
                long jMo134584toComposableColorWaAFU9c14 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                AbstractC17911t abstractC17911t16 = abstractC17911tM44012U;
                InterfaceC39332e interfaceC39332e11115 = interfaceC39332e4;
                boolean z1112 = z17;
                InterfaceC4339a interfaceC4339a111110 = interfaceC4339a10;
                AbstractC27274q abstractC27274q17 = abstractC27274q3;
                InterfaceC4339a interfaceC4339a111111 = interfaceC4339a5;
                int i419 = i16 << 3;
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a111112 = interfaceC4339a6;
                AbstractC23141n2.m67119a(interfaceC4339a111112, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j115, 0L, 0.0f, jMo134584toComposableColorWaAFU9c14, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t16, z1112, c35666g3, interfaceC4339a111110, interfaceC4339a111111, abstractC27274q17, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i419 & 112) | (i419 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                interfaceC4339a7 = interfaceC4339a111112;
                z15 = z18;
                interfaceC17869a2 = interfaceC17869a3;
                interfaceC4339a8 = interfaceC4339a111110;
                interfaceC39332e2 = interfaceC39332e11115;
                interfaceC4339a9 = interfaceC4339a111111;
                z16 = z1112;
                abstractC27274q2 = abstractC27274q17;
                abstractC17911t2 = abstractC17911t16;
                c35666g2 = c35666g3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c35666g2 = c35666g;
                interfaceC39332e2 = interfaceC39332e;
                interfaceC17869a2 = interfaceC17869a1;
                abstractC17911t2 = abstractC17911t;
                z15 = z13;
                interfaceC4339a7 = interfaceC4339a6;
                modifier3 = modifier2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                z16 = z4;
                abstractC27274q2 = abstractC27274q;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
            }
        }
        i16 |= 805306368;
        if ((i14 & 6) == 0) {
            i29 = i14 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q2.m87153g(abstractC17911t)) ? 2 : 4);
        } else {
            i29 = i14;
        }
        i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i34 != 0) {
            if ((i14 & 48) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i29 |= i35;
            }
            if ((i14 & 384) == 0) {
                i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
            }
            i36 = i29;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f1111117 = 4;
                        float f1111118 = f1111117 * f1111117;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f1111118, f1111118, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e11116 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e11116;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i15 & 4) != 0) {
                        c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                        i16 &= -897;
                    } else {
                        c35666g3 = c35666g;
                    }
                    if (i44 != 0) {
                        interfaceC39332e3 = EnumC39333f.BLACK_90;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35652d(3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i17 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(4);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35652d(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if ((i15 & 128) != 0) {
                        float f1111119 = 4;
                        float f11111110 = f1111119 * f1111119;
                        interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111110, f11111110, 0.0f, 0.0f, 12);
                        i16 = (-29360129) & i16;
                    } else {
                        interfaceC17869a1M105491g = interfaceC17869a1;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    } else {
                        z17 = z4;
                    }
                    if (i27 != 0) {
                        abstractC27274q3 = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q3 = abstractC27274q;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                        i36 &= -15;
                    } else {
                        abstractC17911tM44012U = abstractC17911t;
                    }
                    InterfaceC39332e interfaceC39332e11117 = interfaceC39332e3;
                    i37 = i36;
                    interfaceC39332e4 = interfaceC39332e11117;
                    if (i34 != 0) {
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                        z18 = true;
                    } else {
                        z18 = z13;
                        interfaceC17869a3 = interfaceC17869a1M105491g;
                    }
                }
                c28655q2.m87175r();
                long j116 = C17919x.f69636m;
                long jMo134584toComposableColorWaAFU9c15 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
                AbstractC17911t abstractC17911t17 = abstractC17911tM44012U;
                InterfaceC39332e interfaceC39332e11118 = interfaceC39332e4;
                boolean z1113 = z17;
                InterfaceC4339a interfaceC4339a111113 = interfaceC4339a10;
                AbstractC27274q abstractC27274q18 = abstractC27274q3;
                InterfaceC4339a interfaceC4339a111114 = interfaceC4339a5;
                int i4110 = i16 << 3;
                c28655q = c28655q2;
                InterfaceC4339a interfaceC4339a111115 = interfaceC4339a6;
                AbstractC23141n2.m67119a(interfaceC4339a111115, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j116, 0L, 0.0f, jMo134584toComposableColorWaAFU9c15, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t17, z1113, c35666g3, interfaceC4339a111113, interfaceC4339a111114, abstractC27274q18, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i4110 & 112) | (i4110 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
                interfaceC4339a7 = interfaceC4339a111115;
                z15 = z18;
                interfaceC17869a2 = interfaceC17869a3;
                interfaceC4339a8 = interfaceC4339a111113;
                interfaceC39332e2 = interfaceC39332e11118;
                interfaceC4339a9 = interfaceC4339a111114;
                z16 = z1113;
                abstractC27274q2 = abstractC27274q18;
                abstractC17911t2 = abstractC17911t17;
                c35666g2 = c35666g3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c35666g2 = c35666g;
                interfaceC39332e2 = interfaceC39332e;
                interfaceC17869a2 = interfaceC17869a1;
                abstractC17911t2 = abstractC17911t;
                z15 = z13;
                interfaceC4339a7 = interfaceC4339a6;
                modifier3 = modifier2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                z16 = z4;
                abstractC27274q2 = abstractC27274q;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
            }
        }
        i29 |= 48;
        if ((i14 & 384) == 0) {
            i29 |= c28655q2.m87157i(sheetContent) ? 256 : 128;
        }
        i36 = i29;
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z14)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i39 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i15 & 4) != 0) {
                    c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    i16 &= -897;
                } else {
                    c35666g3 = c35666g;
                }
                if (i44 != 0) {
                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35652d(3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(4);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                }
                if (i19 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35652d(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if ((i15 & 128) != 0) {
                    float f11111111 = 4;
                    float f11111112 = f11111111 * f11111111;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111112, f11111112, 0.0f, 0.0f, 12);
                    i16 = (-29360129) & i16;
                } else {
                    interfaceC17869a1M105491g = interfaceC17869a1;
                }
                if (i25 != 0) {
                    z17 = true;
                } else {
                    z17 = z4;
                }
                if (i27 != 0) {
                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q3 = abstractC27274q;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                    i36 &= -15;
                } else {
                    abstractC17911tM44012U = abstractC17911t;
                }
                InterfaceC39332e interfaceC39332e11119 = interfaceC39332e3;
                i37 = i36;
                interfaceC39332e4 = interfaceC39332e11119;
                if (i34 != 0) {
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    z18 = true;
                } else {
                    z18 = z13;
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                }
            } else {
                if (i39 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i15 & 4) != 0) {
                    c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    i16 &= -897;
                } else {
                    c35666g3 = c35666g;
                }
                if (i44 != 0) {
                    interfaceC39332e3 = EnumC39333f.BLACK_90;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35652d(3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(4);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                }
                if (i19 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35652d(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if ((i15 & 128) != 0) {
                    float f11111113 = 4;
                    float f11111114 = f11111113 * f11111113;
                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f11111114, f11111114, 0.0f, 0.0f, 12);
                    i16 = (-29360129) & i16;
                } else {
                    interfaceC17869a1M105491g = interfaceC17869a1;
                }
                if (i25 != 0) {
                    z17 = true;
                } else {
                    z17 = z4;
                }
                if (i27 != 0) {
                    abstractC27274q3 = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q3 = abstractC27274q;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                    i36 &= -15;
                } else {
                    abstractC17911tM44012U = abstractC17911t;
                }
                InterfaceC39332e interfaceC39332e111110 = interfaceC39332e3;
                i37 = i36;
                interfaceC39332e4 = interfaceC39332e111110;
                if (i34 != 0) {
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                    z18 = true;
                } else {
                    z18 = z13;
                    interfaceC17869a3 = interfaceC17869a1M105491g;
                }
            }
            c28655q2.m87175r();
            long j117 = C17919x.f69636m;
            long jMo134584toComposableColorWaAFU9c16 = interfaceC39332e4.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 9) & 14);
            AbstractC17911t abstractC17911t18 = abstractC17911tM44012U;
            InterfaceC39332e interfaceC39332e111111 = interfaceC39332e4;
            boolean z1114 = z17;
            InterfaceC4339a interfaceC4339a111116 = interfaceC4339a10;
            AbstractC27274q abstractC27274q19 = abstractC27274q3;
            InterfaceC4339a interfaceC4339a111117 = interfaceC4339a5;
            int i4111 = i16 << 3;
            c28655q = c28655q2;
            InterfaceC4339a interfaceC4339a111118 = interfaceC4339a6;
            AbstractC23141n2.m67119a(interfaceC4339a111118, modifier3, sheetState, 0.0f, z18, interfaceC17869a3, j117, 0L, 0.0f, jMo134584toComposableColorWaAFU9c16, null, new C32587b2(24), null, AbstractC37817c.m121344e(-876371722, c28655q2, new C32585b0(abstractC17911t18, z1114, c35666g3, interfaceC4339a111116, interfaceC4339a111117, abstractC27274q19, sheetContent)), c28655q, ((i16 >> 18) & 14) | 1572864 | (i4111 & 112) | (i4111 & 896) | ((i37 << 9) & 57344) | (458752 & (i16 >> 6)), 3078, 4488);
            interfaceC4339a7 = interfaceC4339a111118;
            z15 = z18;
            interfaceC17869a2 = interfaceC17869a3;
            interfaceC4339a8 = interfaceC4339a111116;
            interfaceC39332e2 = interfaceC39332e111111;
            interfaceC4339a9 = interfaceC4339a111117;
            z16 = z1114;
            abstractC27274q2 = abstractC27274q19;
            abstractC17911t2 = abstractC17911t18;
            c35666g2 = c35666g3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c35666g2 = c35666g;
            interfaceC39332e2 = interfaceC39332e;
            interfaceC17869a2 = interfaceC17869a1;
            abstractC17911t2 = abstractC17911t;
            z15 = z13;
            interfaceC4339a7 = interfaceC4339a6;
            modifier3 = modifier2;
            interfaceC4339a8 = interfaceC4339a4;
            interfaceC4339a9 = interfaceC4339a5;
            z16 = z4;
            abstractC27274q2 = abstractC27274q;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4150x4(modifier3, sheetState, c35666g2, interfaceC39332e2, interfaceC4339a8, interfaceC4339a9, interfaceC4339a7, interfaceC17869a2, z16, abstractC27274q2, abstractC17911t2, z15, sheetContent, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112944h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m112945i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m112946j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC22940b2 m112947k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(260353962);
        C22969j0 c22969j0 = new C22969j0(0);
        c28655q.m87173q(false);
        return c22969j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m112948l(AbstractC17911t abstractC17911t, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, Function3 function3, InterfaceC23013y ModalBottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(ModalBottomSheet, "$this$ModalBottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(-379633704);
            float fMo733e0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0((int) (((C2414n2) ((InterfaceC2410m3) c28655q.m87161k(AbstractC2453v1.f9581t))).m7408a() & 4294967295L)) * 0.9f;
            c28655q.m87173q(false);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3357b(C2314t.f9131w, abstractC17911t, null, 0.0f, 6)), 0.0f, fMo733e0, 1)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (z4) {
                c28655q.m87150e0(-1351414604);
                AbstractC35660d.m112881w(c28655q, 0);
            } else {
                c28655q.m87150e0(1055827926);
            }
            c28655q.m87173q(false);
            AbstractC35660d.m112883y(c35666g, interfaceC4339a, interfaceC4339a2, abstractC27274q, c28655q, 0, 0);
            function3.invoke(C23016z.f90757a, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m112949m(Modifier modifier, C23196w3 c23196w3, C35666g c35666g, InterfaceC39332e interfaceC39332e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC17869a1 interfaceC17869a1, boolean z4, AbstractC27274q abstractC27274q, AbstractC17911t abstractC17911t, boolean z13, Function3 function3, int i13, int i14, int i15, Composer composer, int i16) {
        m112943g(modifier, c23196w3, c35666g, interfaceC39332e, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC17869a1, z4, abstractC27274q, abstractC17911t, z13, function3, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
