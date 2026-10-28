package com.whoop.universalcheckout.features;

import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.profileinstaller.ProfileVerifier;
import ar0.C1926a;
import b01.C2194o;
import bm0.C3403f;
import bm2.C3440f1;
import c93.InterfaceC4339a;
import com.whoop.universalcheckout.features.AbstractC10635a;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import cp0.C11010y;
import e93.AbstractC12889b;
import ev2.C13703l;
import gp2.AbstractC16071f;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21177x0;
import kotlin.C2026r;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import np2.InterfaceC27034a;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl0.C29344b;
import pn2.C29381a;
import pp2.AbstractC29452p;
import to2.AbstractC34023a;
import vp2.InterfaceC36274a;
import xo2.InterfaceC38495a;
import xp2.AbstractC38538g;
import zo2.AbstractC40936g;

/* JADX INFO: renamed from: com.whoop.universalcheckout.features.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0018\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Leb/u0;", "navHostController", "Leb/a0;", "navController", "Landroidx/fragment/app/r0;", "activity", "", "source", "dynamicPath", "dynamicPayload", "cartId", "method", "Lj02/x0;", "autoTrigger", "receiptCartId", "Ll83/a0;", "l", "(Leb/u0;Leb/a0;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ARGS", "Leb/s0;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "destination", "Lkotlin/Function1;", "content", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Leb/s0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;Lkotlin/jvm/functions/Function3;)V", "Leb/q;", "Lpn2/a;", "a", "Lkotlin/jvm/functions/Function1;", "noNavArgs", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10635a {

    /* JADX INFO: renamed from: a */
    private static final Function1 f32402a = new C29344b(7);

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x014d  */
    /* JADX WARN: Code duplicated, block: B:106:0x014f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0183  */
    /* JADX WARN: Code duplicated, block: B:126:0x0191  */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01da  */
    /* JADX WARN: Code duplicated, block: B:147:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:158:0x023d  */
    /* JADX WARN: Code duplicated, block: B:161:0x024e  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:97:0x013a  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    /* JADX INFO: renamed from: l */
    public static final void m27551l(C12991u0 navHostController, AbstractC12939a0 navController, AbstractActivityC1340r0 activity, String source, String dynamicPath, String dynamicPayload, String str, String str2, EnumC21177x0 enumC21177x0, String str3, Composer composer, int i13, int i14) {
        int i15;
        String str4;
        int i16;
        String str5;
        int i17;
        int i18;
        int iOrdinal;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z4;
        String str6;
        C28655q c28655q;
        String str7;
        EnumC21177x0 enumC21177x1;
        String str8;
        C28677v1 c28677v1M87180u;
        String str9;
        String str10;
        EnumC21177x0 enumC21177x2;
        String str11;
        int i28;
        boolean z13;
        String str12;
        Object objM87133R;
        String route;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zM87157i;
        Object objM87133R2;
        String str13;
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(dynamicPath, "dynamicPath");
        AbstractC22676k.m65750j(dynamicPayload, "dynamicPayload");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1148255713);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(navHostController) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(activity) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(source) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(dynamicPath) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87153g(dynamicPayload) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i29 = i14 & 64;
        if (i29 == 0) {
            if ((1572864 & i13) == 0) {
                str4 = str;
                i15 |= c28655q2.m87153g(str4) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
                str5 = str2;
            } else {
                str5 = str2;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87153g(str5)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (enumC21177x0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC21177x0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
            i24 = i14 & 512;
            i25 = i15;
            if (i24 != 0) {
                i25 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(str3)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i25 |= i26;
            }
            i27 = i25;
            if ((i27 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                if (i29 != 0) {
                    str9 = null;
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    str10 = null;
                } else {
                    str10 = str5;
                }
                if (i18 != 0) {
                    enumC21177x2 = null;
                } else {
                    enumC21177x2 = enumC21177x0;
                }
                if (i24 != 0) {
                    str11 = null;
                } else {
                    str11 = str3;
                }
                i28 = i27 & 7168;
                if (i28 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                str12 = str11;
                objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C1926a(source, 7);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q2);
                if (str12 != null) {
                    route = "receiptStart";
                } else {
                    route = UniversalCheckoutDestination.C10629a.f32377a.getRoute();
                }
                String str14 = route;
                if ((1879048192 & i27) == 536870912) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i28 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87157i2 = z15 | z14 | c28655q2.m87157i(navController) | c28655q2.m87157i(activity);
                if ((57344 & i27) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z24 = zM87157i2 | z16;
                if ((458752 & i27) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z25 = z24 | z17;
                if ((3670016 & i27) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z26 = z25 | z18;
                if ((29360128 & i27) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z26 | z19 | ((234881024 & i27) == 67108864) | c28655q2.m87157i(navHostController);
                objM87133R2 = c28655q2.m87133R();
                if (!zM87157i || objM87133R2 == c28676v0) {
                    C11010y c11010y = new C11010y(str12, source, navController, activity, dynamicPath, dynamicPayload, str9, str10, enumC21177x2, navHostController, 4);
                    str13 = str12;
                    c28655q2.m87172p0(c11010y);
                    objM87133R2 = c11010y;
                } else {
                    str13 = str12;
                }
                AbstractC17269i.m48886d(navHostController, str14, null, null, null, null, null, null, null, (Function1) objM87133R2, c28655q2, i27 & 14, 1020);
                c28655q = c28655q2;
                str7 = str9;
                str6 = str10;
                enumC21177x1 = enumC21177x2;
                str8 = str13;
            } else {
                c28655q2.m87138X();
                str6 = str5;
                c28655q = c28655q2;
                str7 = str4;
                enumC21177x1 = enumC21177x0;
                str8 = str3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3440f1(navHostController, navController, activity, source, dynamicPath, dynamicPayload, str7, str6, enumC21177x1, str8, i13, i14, 3);
            }
        }
        i15 |= 1572864;
        str4 = str;
        i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            str5 = str2;
        } else {
            str5 = str2;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87153g(str5)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 256;
        if (i18 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (enumC21177x0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC21177x0.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i19;
        }
        i24 = i14 & 512;
        i25 = i15;
        if (i24 != 0) {
            i25 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87153g(str3)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i25 |= i26;
        }
        i27 = i25;
        if ((i27 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i27 & 1, z4)) {
            if (i29 != 0) {
                str9 = null;
            } else {
                str9 = str4;
            }
            if (i16 != 0) {
                str10 = null;
            } else {
                str10 = str5;
            }
            if (i18 != 0) {
                enumC21177x2 = null;
            } else {
                enumC21177x2 = enumC21177x0;
            }
            if (i24 != 0) {
                str11 = null;
            } else {
                str11 = str3;
            }
            i28 = i27 & 7168;
            if (i28 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            str12 = str11;
            objM87133R = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C1926a(source, 7);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C1926a(source, 7);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q2);
            if (str12 != null) {
                route = "receiptStart";
            } else {
                route = UniversalCheckoutDestination.C10629a.f32377a.getRoute();
            }
            String str15 = route;
            if ((1879048192 & i27) == 536870912) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i28 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM87157i3 = z15 | z14 | c28655q2.m87157i(navController) | c28655q2.m87157i(activity);
            if ((57344 & i27) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z27 = zM87157i3 | z16;
            if ((458752 & i27) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z28 = z27 | z17;
            if ((3670016 & i27) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z29 = z28 | z18;
            if ((29360128 & i27) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87157i = z29 | z19 | ((234881024 & i27) == 67108864) | c28655q2.m87157i(navHostController);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                C11010y c11010y2 = new C11010y(str12, source, navController, activity, dynamicPath, dynamicPayload, str9, str10, enumC21177x2, navHostController, 4);
                str13 = str12;
                c28655q2.m87172p0(c11010y2);
                objM87133R2 = c11010y2;
            } else {
                C11010y c11010y3 = new C11010y(str12, source, navController, activity, dynamicPath, dynamicPayload, str9, str10, enumC21177x2, navHostController, 4);
                str13 = str12;
                c28655q2.m87172p0(c11010y3);
                objM87133R2 = c11010y3;
            }
            AbstractC17269i.m48886d(navHostController, str15, null, null, null, null, null, null, null, (Function1) objM87133R2, c28655q2, i27 & 14, 1020);
            c28655q = c28655q2;
            str7 = str9;
            str6 = str10;
            enumC21177x1 = enumC21177x2;
            str8 = str13;
        } else {
            c28655q2.m87138X();
            str6 = str5;
            c28655q = c28655q2;
            str7 = str4;
            enumC21177x1 = enumC21177x0;
            str8 = str3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(navHostController, navController, activity, source, dynamicPath, dynamicPayload, str7, str6, enumC21177x1, str8, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m27552m(String str) {
        C10636b.f32403a.m27566b(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m27553n(String str, final String str2, AbstractC12939a0 abstractC12939a0, final AbstractActivityC1340r0 abstractActivityC1340r0, String str3, String str4, String str5, String str6, EnumC21177x0 enumC21177x0, final C12991u0 c12991u0, C12987s0 NavHost) {
        C12987s0 c12987s0;
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        if (str != null) {
            AbstractC12889b.m36290t(NavHost, "receiptStart", null, null, null, null, null, new C37816b(new C3403f(str2, abstractC12939a0, abstractActivityC1340r0, str, 5), true, -113582689), 254);
            c12987s0 = NavHost;
        } else {
            c12987s0 = NavHost;
        }
        m27562w(c12987s0, UniversalCheckoutDestination.C10629a.f32377a, new C37816b(new C13703l(abstractC12939a0, str3, str4, str2, str5, str6, enumC21177x0, c12991u0, abstractActivityC1340r0, 2), true, -2039974412));
        m27562w(c12987s0, UniversalCheckoutDestination.C10631c.f32382a, new C37816b(new C26949h(str2, abstractC12939a0, abstractActivityC1340r0, 9), true, 1381154324));
        m27562w(c12987s0, UniversalCheckoutDestination.C10630b.f32379a, new C37816b(new C2026r(str2, abstractC12939a0, c12991u0, abstractActivityC1340r0, 18), true, 1227381269));
        final int i13 = 0;
        m27562w(c12987s0, UniversalCheckoutDestination.C10632d.f32385a, new C37816b(new Function3() { // from class: pn2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC10635a.m27558s(str2, c12991u0, abstractActivityC1340r0, (UniversalCheckoutDestination.C10632d.a) obj, (Composer) obj2, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC10635a.m27559t(str2, c12991u0, abstractActivityC1340r0, (UniversalCheckoutDestination.C10633e.a) obj, (Composer) obj2, iIntValue2);
                }
            }
        }, true, 1073608214));
        final int i14 = 1;
        m27562w(c12987s0, UniversalCheckoutDestination.C10633e.f32389a, new C37816b(new Function3() { // from class: pn2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC10635a.m27558s(str2, c12991u0, abstractActivityC1340r0, (UniversalCheckoutDestination.C10632d.a) obj, (Composer) obj2, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC10635a.m27559t(str2, c12991u0, abstractActivityC1340r0, (UniversalCheckoutDestination.C10633e.a) obj, (Composer) obj2, iIntValue2);
                }
            }
        }, true, 919835159));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m27554o(String str, AbstractC12939a0 abstractC12939a0, AbstractActivityC1340r0 abstractActivityC1340r0, String str2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC16071f.m45408h(str, abstractC12939a0, abstractActivityC1340r0, new UniversalCheckoutDestination.C10631c.a(str2), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m27555p(AbstractC12939a0 abstractC12939a0, String str, String str2, String str3, String str4, String str5, EnumC21177x0 enumC21177x0, C12991u0 c12991u0, AbstractActivityC1340r0 abstractActivityC1340r0, C29381a it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(abstractC12939a0.m36393h());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = abstractC12939a0.m36393h();
                c28655q.m87172p0(objM87133R);
            }
            AbstractC34023a.m107600g(str, str2, str3, str4, str5, enumC21177x0, c12991u0, abstractC12939a0, abstractActivityC1340r0, (C12982q) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m27556q(String str, AbstractC12939a0 abstractC12939a0, AbstractActivityC1340r0 abstractActivityC1340r0, UniversalCheckoutDestination.C10631c.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC16071f.m45408h(str, abstractC12939a0, abstractActivityC1340r0, navArgs, c28655q, (i13 << 9) & 7168);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m27557r(String str, AbstractC12939a0 abstractC12939a0, C12991u0 c12991u0, AbstractActivityC1340r0 abstractActivityC1340r0, UniversalCheckoutDestination.C10630b.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC40936g.m132830g(new InterfaceC38495a.d(str), abstractC12939a0, c12991u0, abstractActivityC1340r0, navArgs, c28655q, (i13 << 12) & 57344);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m27558s(String str, C12991u0 c12991u0, AbstractActivityC1340r0 abstractActivityC1340r0, UniversalCheckoutDestination.C10632d.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC29452p.m89913g(new InterfaceC27034a.p(str), c12991u0, abstractActivityC1340r0, navArgs, c28655q, (i13 << 9) & 7168);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m27559t(String str, C12991u0 c12991u0, AbstractActivityC1340r0 abstractActivityC1340r0, UniversalCheckoutDestination.C10633e.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC38538g.m123482f(new InterfaceC36274a.j(str, null), c12991u0, abstractActivityC1340r0, navArgs, c28655q, (i13 << 9) & 7168);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m27560u(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, AbstractActivityC1340r0 abstractActivityC1340r0, String str, String str2, String str3, String str4, String str5, EnumC21177x0 enumC21177x0, String str6, int i13, int i14, Composer composer, int i15) {
        m27551l(c12991u0, abstractC12939a0, abstractActivityC1340r0, str, str2, str3, str4, str5, enumC21177x0, str6, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final <ARGS> void m27562w(C12987s0 c12987s0, UniversalCheckoutDestination<ARGS> universalCheckoutDestination, Function3 function3) {
        AbstractC12889b.m36290t(c12987s0, universalCheckoutDestination.getRoute(), universalCheckoutDestination.getArguments(), null, null, null, null, new C37816b(new C2194o(3, function3, universalCheckoutDestination), true, -1681429190), 252);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m27563x(Function3 function3, UniversalCheckoutDestination universalCheckoutDestination, InterfaceC3764o composable, C12982q navBackStackEntry, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(navBackStackEntry, "navBackStackEntry");
        function3.invoke(universalCheckoutDestination.getNavArgsFactory().invoke(navBackStackEntry), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C29381a m27564y(C12982q it) {
        AbstractC22676k.m65750j(it, "it");
        return C29381a.f119191a;
    }
}
