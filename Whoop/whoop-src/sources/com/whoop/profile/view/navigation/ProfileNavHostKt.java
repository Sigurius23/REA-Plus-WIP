package com.whoop.profile.view.navigation;

import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.profileinstaller.ProfileVerifier;
import bm2.C3440f1;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import cu2.C11134n;
import e93.AbstractC12889b;
import gv1.C16232f;
import hg3.AbstractC17269i;
import id2.C18434s;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/profile/navigation/ProfileNavigationRouter;", "navRouter", "Lcom/whoop/profile/navigation/ProfileActionRouter;", "actionRouter", "Leb/u0;", "navHostController", "Ltr2/n;", "logger", "", "startDestination", "Landroidx/fragment/app/r0;", "activity", "source", "", ProfileApiKt.TARGET_USER_ID_PARAM, ProfileApiKt.COMMUNITY_ID_PARAM, "educationType", "Ll83/a0;", "ProfileNavHost", "(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileNavHostKt {
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0190  */
    /* JADX WARN: Code duplicated, block: B:128:0x0193  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x0206  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    public static final void ProfileNavHost(ProfileNavigationRouter navRouter, ProfileActionRouter actionRouter, C12991u0 navHostController, InterfaceC34116n logger, String str, AbstractActivityC1340r0 abstractActivityC1340r0, String str2, Integer num, Integer num2, String str3, Composer composer, int i13, int i14) {
        int i15;
        String str4;
        int i16;
        Integer num3;
        int i17;
        int i18;
        Integer num4;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z4;
        C28655q c28655q;
        String str5;
        String str6;
        String str7;
        Integer num5;
        Integer num6;
        C28677v1 c28677v1M87180u;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM87157i;
        Object c18434s;
        Integer num7;
        String str12;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(logger, "logger");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-195470599);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(actionRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(navHostController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(logger) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= ((i14 & 16) == 0 && c28655q2.m87153g(str)) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(abstractActivityC1340r0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i27 = i14 & 64;
        if (i27 == 0) {
            if ((1572864 & i13) == 0) {
                str4 = str2;
                i15 |= c28655q2.m87153g(str4) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                if ((12582912 & i13) == 0) {
                    num3 = num;
                    if (c28655q2.m87153g(num3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 256;
                if (i18 != 0) {
                    i15 |= 100663296;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87153g(num4)) {
                            i19 = 67108864;
                        } else {
                            i19 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i19;
                    }
                }
                i24 = i15;
                i25 = i14 & 512;
                if (i25 != 0) {
                    i24 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87153g(str3)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        if ((i14 & 16) != 0) {
                            i24 &= -57345;
                            str8 = "PROFILE";
                        } else {
                            str8 = str;
                        }
                        if (i27 != 0) {
                            str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                        } else {
                            str9 = str4;
                        }
                        if (i16 != 0) {
                            num3 = null;
                        }
                        if (i18 != 0) {
                            num4 = null;
                        }
                        str10 = i25 == 0 ? str3 : null;
                        str11 = str8;
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 16) != 0) {
                            i24 &= -57345;
                        }
                        str11 = str;
                        str10 = str3;
                        str9 = str4;
                    }
                    c28655q2.m87175r();
                    boolean zM87157i2 = c28655q2.m87157i(navRouter) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(logger);
                    if ((i24 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = zM87157i2 | z13;
                    if ((i24 & 29360128) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z17 = z16 | z14;
                    if ((i24 & 234881024) == 67108864) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = z17 | z15 | ((i24 & 1879048192) == 536870912) | c28655q2.m87157i(abstractActivityC1340r0) | c28655q2.m87157i(navHostController);
                    Object objM87133R = c28655q2.m87133R();
                    if (!zM87157i || objM87133R == C28635l.f115821a) {
                        num7 = num4;
                        String str13 = str9;
                        c18434s = new C18434s(navRouter, actionRouter, logger, str13, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                        str12 = str13;
                        c28655q2.m87172p0(c18434s);
                    } else {
                        num7 = num4;
                        c18434s = objM87133R;
                        str12 = str9;
                    }
                    c28655q = c28655q2;
                    String str14 = str11;
                    AbstractC17269i.m48888e(navHostController, str14, null, (Function1) c18434s, c28655q, ((i24 >> 6) & 14) | ((i24 >> 9) & 112));
                    str5 = str14;
                    str6 = str10;
                    str7 = str12;
                    num5 = num7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str5 = str;
                    str6 = str3;
                    str7 = str4;
                    num5 = num4;
                }
                num6 = num3;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3440f1(navRouter, actionRouter, navHostController, logger, str5, abstractActivityC1340r0, str7, num6, num5, str6, i13, i14, 7);
                }
            }
            i15 |= 12582912;
            num3 = num;
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87153g(num4)) {
                        i19 = 67108864;
                    } else {
                        i19 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i19;
                }
            }
            i24 = i15;
            i25 = i14 & 512;
            if (i25 != 0) {
                i24 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(str3)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 16) != 0) {
                        i24 &= -57345;
                        str8 = "PROFILE";
                    } else {
                        str8 = str;
                    }
                    if (i27 != 0) {
                        str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        num4 = null;
                    }
                    if (i25 == 0) {
                    }
                    str11 = str8;
                } else {
                    if ((i14 & 16) != 0) {
                        i24 &= -57345;
                        str8 = "PROFILE";
                    } else {
                        str8 = str;
                    }
                    if (i27 != 0) {
                        str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        num4 = null;
                    }
                    if (i25 == 0) {
                    }
                    str11 = str8;
                }
                c28655q2.m87175r();
                boolean zM87157i3 = c28655q2.m87157i(navRouter) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(logger);
                if ((i24 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zM87157i3 | z13;
                if ((i24 & 29360128) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = z18 | z14;
                if ((i24 & 234881024) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z19 | z15 | ((i24 & 1879048192) == 536870912) | c28655q2.m87157i(abstractActivityC1340r0) | c28655q2.m87157i(navHostController);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    num7 = num4;
                    String str15 = str9;
                    c18434s = new C18434s(navRouter, actionRouter, logger, str15, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                    str12 = str15;
                    c28655q2.m87172p0(c18434s);
                } else {
                    num7 = num4;
                    String str16 = str9;
                    c18434s = new C18434s(navRouter, actionRouter, logger, str16, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                    str12 = str16;
                    c28655q2.m87172p0(c18434s);
                }
                c28655q = c28655q2;
                String str17 = str11;
                AbstractC17269i.m48888e(navHostController, str17, null, (Function1) c18434s, c28655q, ((i24 >> 6) & 14) | ((i24 >> 9) & 112));
                str5 = str17;
                str6 = str10;
                str7 = str12;
                num5 = num7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str5 = str;
                str6 = str3;
                str7 = str4;
                num5 = num4;
            }
            num6 = num3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3440f1(navRouter, actionRouter, navHostController, logger, str5, abstractActivityC1340r0, str7, num6, num5, str6, i13, i14, 7);
            }
        }
        i15 |= 1572864;
        str4 = str2;
        i16 = i14 & 128;
        if (i16 != 0) {
            if ((12582912 & i13) == 0) {
                num3 = num;
                if (c28655q2.m87153g(num3)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87153g(num4)) {
                        i19 = 67108864;
                    } else {
                        i19 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i19;
                }
            }
            i24 = i15;
            i25 = i14 & 512;
            if (i25 != 0) {
                i24 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(str3)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 16) != 0) {
                        i24 &= -57345;
                        str8 = "PROFILE";
                    } else {
                        str8 = str;
                    }
                    if (i27 != 0) {
                        str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        num4 = null;
                    }
                    if (i25 == 0) {
                    }
                    str11 = str8;
                } else {
                    if ((i14 & 16) != 0) {
                        i24 &= -57345;
                        str8 = "PROFILE";
                    } else {
                        str8 = str;
                    }
                    if (i27 != 0) {
                        str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str9 = str4;
                    }
                    if (i16 != 0) {
                        num3 = null;
                    }
                    if (i18 != 0) {
                        num4 = null;
                    }
                    if (i25 == 0) {
                    }
                    str11 = str8;
                }
                c28655q2.m87175r();
                boolean zM87157i4 = c28655q2.m87157i(navRouter) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(logger);
                if ((i24 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z110 = zM87157i4 | z13;
                if ((i24 & 29360128) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z111 = z110 | z14;
                if ((i24 & 234881024) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z111 | z15 | ((i24 & 1879048192) == 536870912) | c28655q2.m87157i(abstractActivityC1340r0) | c28655q2.m87157i(navHostController);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    num7 = num4;
                    String str18 = str9;
                    c18434s = new C18434s(navRouter, actionRouter, logger, str18, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                    str12 = str18;
                    c28655q2.m87172p0(c18434s);
                } else {
                    num7 = num4;
                    String str19 = str9;
                    c18434s = new C18434s(navRouter, actionRouter, logger, str19, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                    str12 = str19;
                    c28655q2.m87172p0(c18434s);
                }
                c28655q = c28655q2;
                String str110 = str11;
                AbstractC17269i.m48888e(navHostController, str110, null, (Function1) c18434s, c28655q, ((i24 >> 6) & 14) | ((i24 >> 9) & 112));
                str5 = str110;
                str6 = str10;
                str7 = str12;
                num5 = num7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str5 = str;
                str6 = str3;
                str7 = str4;
                num5 = num4;
            }
            num6 = num3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3440f1(navRouter, actionRouter, navHostController, logger, str5, abstractActivityC1340r0, str7, num6, num5, str6, i13, i14, 7);
            }
        }
        i15 |= 12582912;
        num3 = num;
        i18 = i14 & 256;
        if (i18 != 0) {
            i15 |= 100663296;
            num4 = num2;
        } else {
            num4 = num2;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87153g(num4)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i19;
            }
        }
        i24 = i15;
        i25 = i14 & 512;
        if (i25 != 0) {
            i24 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87153g(str3)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i24 |= i26;
        }
        if ((i24 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 16) != 0) {
                    i24 &= -57345;
                    str8 = "PROFILE";
                } else {
                    str8 = str;
                }
                if (i27 != 0) {
                    str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    num4 = null;
                }
                if (i25 == 0) {
                }
                str11 = str8;
            } else {
                if ((i14 & 16) != 0) {
                    i24 &= -57345;
                    str8 = "PROFILE";
                } else {
                    str8 = str;
                }
                if (i27 != 0) {
                    str9 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                } else {
                    str9 = str4;
                }
                if (i16 != 0) {
                    num3 = null;
                }
                if (i18 != 0) {
                    num4 = null;
                }
                if (i25 == 0) {
                }
                str11 = str8;
            }
            c28655q2.m87175r();
            boolean zM87157i5 = c28655q2.m87157i(navRouter) | c28655q2.m87157i(actionRouter) | c28655q2.m87157i(logger);
            if ((i24 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z112 = zM87157i5 | z13;
            if ((i24 & 29360128) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z113 = z112 | z14;
            if ((i24 & 234881024) == 67108864) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i = z113 | z15 | ((i24 & 1879048192) == 536870912) | c28655q2.m87157i(abstractActivityC1340r0) | c28655q2.m87157i(navHostController);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                num7 = num4;
                String str111 = str9;
                c18434s = new C18434s(navRouter, actionRouter, logger, str111, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                str12 = str111;
                c28655q2.m87172p0(c18434s);
            } else {
                num7 = num4;
                String str112 = str9;
                c18434s = new C18434s(navRouter, actionRouter, logger, str112, num3, num7, str10, abstractActivityC1340r0, navHostController, 4);
                str12 = str112;
                c28655q2.m87172p0(c18434s);
            }
            c28655q = c28655q2;
            String str113 = str11;
            AbstractC17269i.m48888e(navHostController, str113, null, (Function1) c18434s, c28655q, ((i24 >> 6) & 14) | ((i24 >> 9) & 112));
            str5 = str113;
            str6 = str10;
            str7 = str12;
            num5 = num7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str5 = str;
            str6 = str3;
            str7 = str4;
            num5 = num4;
        }
        num6 = num3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(navRouter, actionRouter, navHostController, logger, str5, abstractActivityC1340r0, str7, num6, num5, str6, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileNavHost$lambda$0$0(ProfileNavigationRouter profileNavigationRouter, ProfileActionRouter profileActionRouter, InterfaceC34116n interfaceC34116n, String str, Integer num, Integer num2, String str2, AbstractActivityC1340r0 abstractActivityC1340r0, C12991u0 c12991u0, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "PROFILE", null, new C37816b(new C16232f(profileNavigationRouter, profileActionRouter, interfaceC34116n, str, num, num2, str2, abstractActivityC1340r0, 1), true, -1067116524), 6);
        AbstractC12889b.m36291u(NavHost, "EDIT_PROFILE", null, new C37816b(new C11134n(c12991u0, 2), true, -2113823939), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileNavHost$lambda$0$0$0(ProfileNavigationRouter profileNavigationRouter, ProfileActionRouter profileActionRouter, InterfaceC34116n interfaceC34116n, String str, Integer num, Integer num2, String str2, AbstractActivityC1340r0 abstractActivityC1340r0, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        ProfileScreenKt.ProfileScreen(profileNavigationRouter, profileActionRouter, interfaceC34116n, str, num, num2, str2, abstractActivityC1340r0, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileNavHost$lambda$0$0$1(C12991u0 c12991u0, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        EditProfileScreenKt.EditProfileScreen(c12991u0, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileNavHost$lambda$1(ProfileNavigationRouter profileNavigationRouter, ProfileActionRouter profileActionRouter, C12991u0 c12991u0, InterfaceC34116n interfaceC34116n, String str, AbstractActivityC1340r0 abstractActivityC1340r0, String str2, Integer num, Integer num2, String str3, int i13, int i14, Composer composer, int i15) {
        ProfileNavHost(profileNavigationRouter, profileActionRouter, c12991u0, interfaceC34116n, str, abstractActivityC1340r0, str2, num, num2, str3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
