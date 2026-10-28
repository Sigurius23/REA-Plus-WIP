package j11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import j02.C21179y0;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27244c0;
import ny0.AbstractC27265l0;
import ny0.AbstractC27275q0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.InterfaceC15156u0;
import p180h0.C16416l0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: j11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008b\u0001\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "", "useSolidButtons", "Lg1/u0;", "primaryButtonColors", "Lf0/t;", "primaryButtonBorder", "secondaryButtonBorder", "Lkotlin/Function0;", "Ll83/a0;", "onApproveRequest", "onDismissRequest", "onSecondaryActionClicked", "d", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21204g {
    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0203  */
    /* JADX WARN: Code duplicated, block: B:151:0x0209  */
    /* JADX WARN: Code duplicated, block: B:153:0x0215  */
    /* JADX WARN: Code duplicated, block: B:156:0x021b  */
    /* JADX WARN: Code duplicated, block: B:158:0x022e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0271  */
    /* JADX WARN: Code duplicated, block: B:162:0x0275  */
    /* JADX WARN: Code duplicated, block: B:165:0x0288  */
    /* JADX WARN: Code duplicated, block: B:167:0x0296  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x036d  */
    /* JADX WARN: Code duplicated, block: B:179:0x037d  */
    /* JADX WARN: Code duplicated, block: B:181:0x038d  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:192:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:198:0x042c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0443  */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX INFO: renamed from: d */
    public static final void m59456d(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, boolean z4, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, C13825t c13825t2, InterfaceC4339a onApproveRequest, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        TextResource textResource3;
        int i15;
        TextResource textResource4;
        int i16;
        boolean z13;
        int i17;
        InterfaceC15156u0 interfaceC15156u1;
        int i18;
        C13825t c13825t3;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z14;
        TextResource textResource5;
        TextResource textResource6;
        C28655q c28655q;
        C13825t c13825t4;
        boolean z15;
        InterfaceC15156u0 interfaceC15156u2;
        C13825t c13825t5;
        InterfaceC4339a interfaceC4339a3;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC39332e interfaceC39332e2;
        C28677v1 c28677v1M87180u;
        int i27;
        C28676v0 c28676v0;
        InterfaceC39332e interfaceC39332e3;
        boolean z16;
        C28655q c28655q2;
        InterfaceC15156u0 interfaceC15156u0M43196a;
        C13825t c13825tM48880a;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        int i28;
        boolean z17;
        TextResource textResource7;
        InterfaceC15156u0 interfaceC15156u3;
        C13825t c13825t6;
        Object objM87133R;
        float f13;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C28676v0 c28676v1;
        C0209i c0209i;
        C28655q c28655q3;
        int i29;
        C2314t c2314t2;
        boolean z18;
        TextResource textResource8;
        float f14;
        C2314t c2314t3;
        int i34;
        C13825t c13825t7;
        InterfaceC4339a interfaceC4339a8;
        boolean z19;
        Object objM87133R2;
        int i35;
        int i36;
        int i37;
        AbstractC22676k.m65750j(onApproveRequest, "onApproveRequest");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1606410211);
        int i38 = i14 & 1;
        if (i38 != 0) {
            i15 = i13 | 6;
            textResource3 = textResource;
        } else if ((i13 & 6) == 0) {
            textResource3 = textResource;
            i15 = (c28655q4.m87153g(textResource3) ? 4 : 2) | i13;
        } else {
            textResource3 = textResource;
            i15 = i13;
        }
        int i39 = i14 & 2;
        if (i39 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q4.m87153g(interfaceC39332e) : c28655q4.m87157i(interfaceC39332e) ? 32 : 16;
        }
        int i44 = i14 & 4;
        if (i44 == 0) {
            if ((i13 & 384) == 0) {
                textResource4 = textResource2;
                i15 |= c28655q4.m87153g(textResource4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q4.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) == 0) {
                        interfaceC15156u1 = interfaceC15156u0;
                        if (c28655q4.m87153g(interfaceC15156u1)) {
                            i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i15 |= i37;
                    } else {
                        interfaceC15156u1 = interfaceC15156u0;
                    }
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    i15 |= i37;
                } else {
                    interfaceC15156u1 = interfaceC15156u0;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    c13825t3 = c13825t;
                } else {
                    c13825t3 = c13825t;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87153g(c13825t3)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                }
                if ((i13 & 1572864) != 0) {
                    if ((i14 & 64) == 0 || !c28655q4.m87153g(c13825t2)) {
                        i36 = 524288;
                    } else {
                        i36 = 1048576;
                    }
                    i15 |= i36;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(onApproveRequest)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i15 |= 100663296;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a)) {
                            i26 = 67108864;
                        } else {
                            i26 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i26;
                    }
                }
                if ((i13 & 805306368) != 0) {
                    i15 |= ((i14 & 512) == 0 || !c28655q4.m87157i(interfaceC4339a2)) ? 268435456 : 536870912;
                }
                if ((i15 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    c28655q4.m87140Z();
                    i27 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0 || c28655q4.m87118C()) {
                        if (i38 != 0) {
                            textResource3 = null;
                        }
                        if (i39 != 0) {
                            interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                        } else {
                            interfaceC39332e3 = interfaceC39332e;
                        }
                        if (i44 != 0) {
                            textResource4 = null;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i14 & 16) != 0) {
                            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                            C38072d c38072d = C38072d.f163053a;
                            interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q4, 6).getBrandWhite(), c38072d.m121949b(c28655q4, 6).getBrandBlack(), c38072d.m121949b(c28655q4, 6).getWhite10(), c38072d.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            i15 &= -57345;
                        } else {
                            c28655q2 = c28655q4;
                            interfaceC15156u0M43196a = interfaceC15156u1;
                        }
                        if (i18 != 0) {
                            c13825t3 = null;
                        }
                        textResource3 = textResource3;
                        if ((i14 & 64) != 0) {
                            c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                            i15 &= -3670017;
                        } else {
                            c13825tM48880a = c13825t2;
                        }
                        if (i25 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C21179y0(3);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a5 = interfaceC4339a;
                        }
                        if ((i14 & 512) != 0) {
                            i15 &= -1879048193;
                            interfaceC4339a6 = interfaceC4339a5;
                            interfaceC4339a7 = interfaceC4339a6;
                        } else {
                            interfaceC4339a6 = interfaceC4339a2;
                            interfaceC4339a7 = interfaceC4339a5;
                        }
                        i28 = i15;
                        interfaceC39332e = interfaceC39332e3;
                        z17 = z16;
                        textResource7 = textResource4;
                        interfaceC15156u3 = interfaceC15156u0M43196a;
                        c13825t6 = c13825t3;
                    } else {
                        c28655q4.m87138X();
                        if ((i14 & 16) != 0) {
                            i15 &= -57345;
                        }
                        if ((i14 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        if ((i14 & 512) != 0) {
                            i15 &= -1879048193;
                        }
                        interfaceC39332e = interfaceC39332e;
                        c13825tM48880a = c13825t2;
                        interfaceC4339a7 = interfaceC4339a;
                        interfaceC4339a6 = interfaceC4339a2;
                        i28 = i15;
                        c13825t6 = c13825t3;
                        z17 = z13;
                        interfaceC15156u3 = interfaceC15156u1;
                        textResource7 = textResource4;
                        c28655q2 = c28655q4;
                    }
                    c28655q2.m87175r();
                    f13 = 8;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * f13, 0.0f, 2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    c28676v1 = c28676v0;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    if (textResource3 == null) {
                        c28655q2.m87150e0(632948215);
                        c28655q2.m87173q(false);
                        z18 = false;
                        textResource8 = textResource3;
                        interfaceC15156u3 = interfaceC15156u3;
                        c13825t6 = c13825t6;
                        c2314t2 = c2314t;
                        interfaceC39332e = interfaceC39332e;
                        c28655q3 = c28655q2;
                        textResource7 = textResource7;
                        c28676v1 = c28676v1;
                        i29 = 2;
                        f14 = f13;
                    } else {
                        c28655q2.m87150e0(632948216);
                        if (z17) {
                            c28655q2.m87150e0(-110058909);
                            C28655q c28655q5 = c28655q2;
                            AbstractC27244c0.m82098b(null, false, null, textResource3, interfaceC15156u3, c13825t6, onApproveRequest, c28655q5, (i28 & 516096) | ((i28 >> 3) & 3670016), 7);
                            c28655q3 = c28655q5;
                            c28655q3.m87173q(false);
                            i29 = 2;
                            textResource8 = textResource3;
                            z18 = false;
                            c2314t2 = c2314t;
                            f14 = f13;
                        } else {
                            TextResource textResource9 = textResource3;
                            c28655q3 = c28655q2;
                            c28655q3.m87150e0(-109788961);
                            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "dialog primary button");
                            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                            String upperCase = AbstractC8693b.m21274h(textResource9, c28655q3, 0).toUpperCase(Locale.ROOT);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            i29 = 2;
                            c2314t2 = c2314t;
                            z18 = false;
                            textResource8 = textResource9;
                            f14 = f13;
                            AbstractC27282u.m82292h(modifierM44101d, enumC27284v, upperCase, false, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, (i28 >> 3) & 14), null, false, onApproveRequest, c28655q3, (i28 & 29360128) | 48, 104);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z18);
                    }
                    if (textResource7 == null) {
                        c28655q3.m87150e0(633740699);
                        c28655q3.m87173q(z18);
                        c13825t7 = c13825tM48880a;
                        interfaceC4339a8 = interfaceC4339a6;
                    } else {
                        c28655q3.m87150e0(633740700);
                        c2314t3 = c2314t2;
                        AbstractC18489d0.m53380u(i29, f14, c2314t3, c28655q3);
                        i34 = 9;
                        if (z17) {
                            c28655q3.m87150e0(1936994619);
                            c13825t7 = c13825tM48880a;
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a6;
                            AbstractC27275q0.m82278b(null, false, textResource7, null, c13825t7, null, interfaceC4339a9, c28655q3, ((i28 >> 6) & 57344) | ((i28 >> 9) & 3670016), 43);
                            interfaceC4339a8 = interfaceC4339a9;
                            c28655q3.m87173q(z18);
                        } else {
                            c13825t7 = c13825tM48880a;
                            interfaceC4339a8 = interfaceC4339a6;
                            c28655q3.m87150e0(1937228452);
                            Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t3, "dialog secondary button");
                            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                            z19 = ((((i28 & 1879048192) ^ 805306368) > 536870912 || !c28655q3.m87153g(interfaceC4339a8)) && (i28 & 805306368) != 536870912) ? z18 : true;
                            objM87133R2 = c28655q3.m87133R();
                            if (z19 || objM87133R2 == c28676v1) {
                                objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                                c28655q3.m87172p0(objM87133R2);
                            }
                            AbstractC27265l0.m82217i(modifierM44101d2, enumC27269n0, textResource7, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q3, 48, 0, 4088);
                            c28655q3.m87173q(z18);
                        }
                        c28655q3.m87173q(z18);
                    }
                    c28655q3.m87173q(true);
                    interfaceC4339a4 = interfaceC4339a8;
                    c13825t5 = c13825t7;
                    c28655q = c28655q3;
                    textResource6 = textResource7;
                    z15 = z17;
                    interfaceC4339a3 = interfaceC4339a7;
                    interfaceC15156u2 = interfaceC15156u3;
                    c13825t4 = c13825t6;
                    textResource5 = textResource8;
                } else {
                    c28655q4.m87138X();
                    textResource5 = textResource3;
                    textResource6 = textResource4;
                    c28655q = c28655q4;
                    c13825t4 = c13825t3;
                    z15 = z13;
                    interfaceC15156u2 = interfaceC15156u1;
                    c13825t5 = c13825t2;
                    interfaceC4339a3 = interfaceC4339a;
                    interfaceC4339a4 = interfaceC4339a2;
                }
                interfaceC39332e2 = interfaceC39332e;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21203f(textResource5, interfaceC39332e2, textResource6, z15, interfaceC15156u2, c13825t4, c13825t5, onApproveRequest, interfaceC4339a3, interfaceC4339a4, i13, i14);
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    interfaceC15156u1 = interfaceC15156u0;
                    if (c28655q4.m87153g(interfaceC15156u1)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i37;
                } else {
                    interfaceC15156u1 = interfaceC15156u0;
                }
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i37;
            } else {
                interfaceC15156u1 = interfaceC15156u0;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                c13825t3 = c13825t;
            } else {
                c13825t3 = c13825t;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87153g(c13825t3)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            if ((i13 & 1572864) != 0) {
                if ((i14 & 64) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i15 |= i36;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(onApproveRequest)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i26;
                }
            }
            if ((i13 & 805306368) != 0) {
                i15 |= ((i14 & 512) == 0 || !c28655q4.m87157i(interfaceC4339a2)) ? 268435456 : 536870912;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i27 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i38 != 0) {
                        textResource3 = null;
                    }
                    if (i39 != 0) {
                        interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    if (i44 != 0) {
                        textResource4 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i14 & 16) != 0) {
                        C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                        C38072d c38072d2 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q4, 6).getBrandWhite(), c38072d2.m121949b(c28655q4, 6).getBrandBlack(), c38072d2.m121949b(c28655q4, 6).getWhite10(), c38072d2.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        i15 &= -57345;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if (i18 != 0) {
                        c13825t3 = null;
                    }
                    textResource3 = textResource3;
                    if ((i14 & 64) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                        i15 &= -3670017;
                    } else {
                        c13825tM48880a = c13825t2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C21179y0(3);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if ((i14 & 512) != 0) {
                        i15 &= -1879048193;
                        interfaceC4339a6 = interfaceC4339a5;
                        interfaceC4339a7 = interfaceC4339a6;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                        interfaceC4339a7 = interfaceC4339a5;
                    }
                    i28 = i15;
                    interfaceC39332e = interfaceC39332e3;
                    z17 = z16;
                    textResource7 = textResource4;
                    interfaceC15156u3 = interfaceC15156u0M43196a;
                    c13825t6 = c13825t3;
                } else {
                    if (i38 != 0) {
                        textResource3 = null;
                    }
                    if (i39 != 0) {
                        interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    if (i44 != 0) {
                        textResource4 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i14 & 16) != 0) {
                        C22976l1 c22976l3 = AbstractC15166v0.f56891a;
                        C38072d c38072d3 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d3.m121949b(c28655q4, 6).getBrandWhite(), c38072d3.m121949b(c28655q4, 6).getBrandBlack(), c38072d3.m121949b(c28655q4, 6).getWhite10(), c38072d3.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        i15 &= -57345;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if (i18 != 0) {
                        c13825t3 = null;
                    }
                    textResource3 = textResource3;
                    if ((i14 & 64) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                        i15 &= -3670017;
                    } else {
                        c13825tM48880a = c13825t2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C21179y0(3);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if ((i14 & 512) != 0) {
                        i15 &= -1879048193;
                        interfaceC4339a6 = interfaceC4339a5;
                        interfaceC4339a7 = interfaceC4339a6;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                        interfaceC4339a7 = interfaceC4339a5;
                    }
                    i28 = i15;
                    interfaceC39332e = interfaceC39332e3;
                    z17 = z16;
                    textResource7 = textResource4;
                    interfaceC15156u3 = interfaceC15156u0M43196a;
                    c13825t6 = c13825t3;
                }
                c28655q2.m87175r();
                f13 = 8;
                c2314t = C2314t.f9131w;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                c28676v1 = c28676v0;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                if (textResource3 == null) {
                    c28655q2.m87150e0(632948215);
                    c28655q2.m87173q(false);
                    z18 = false;
                    textResource8 = textResource3;
                    interfaceC15156u3 = interfaceC15156u3;
                    c13825t6 = c13825t6;
                    c2314t2 = c2314t;
                    interfaceC39332e = interfaceC39332e;
                    c28655q3 = c28655q2;
                    textResource7 = textResource7;
                    c28676v1 = c28676v1;
                    i29 = 2;
                    f14 = f13;
                } else {
                    c28655q2.m87150e0(632948216);
                    if (z17) {
                        c28655q2.m87150e0(-110058909);
                        C28655q c28655q6 = c28655q2;
                        AbstractC27244c0.m82098b(null, false, null, textResource3, interfaceC15156u3, c13825t6, onApproveRequest, c28655q6, (i28 & 516096) | ((i28 >> 3) & 3670016), 7);
                        c28655q3 = c28655q6;
                        c28655q3.m87173q(false);
                        i29 = 2;
                        textResource8 = textResource3;
                        z18 = false;
                        c2314t2 = c2314t;
                        f14 = f13;
                    } else {
                        TextResource textResource10 = textResource3;
                        c28655q3 = c28655q2;
                        c28655q3.m87150e0(-109788961);
                        Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "dialog primary button");
                        EnumC27284v enumC27284v2 = EnumC27284v.TextMedium;
                        String upperCase2 = AbstractC8693b.m21274h(textResource10, c28655q3, 0).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        i29 = 2;
                        c2314t2 = c2314t;
                        z18 = false;
                        textResource8 = textResource10;
                        f14 = f13;
                        AbstractC27282u.m82292h(modifierM44101d3, enumC27284v2, upperCase2, false, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, (i28 >> 3) & 14), null, false, onApproveRequest, c28655q3, (i28 & 29360128) | 48, 104);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z18);
                }
                if (textResource7 == null) {
                    c28655q3.m87150e0(633740699);
                    c28655q3.m87173q(z18);
                    c13825t7 = c13825tM48880a;
                    interfaceC4339a8 = interfaceC4339a6;
                } else {
                    c28655q3.m87150e0(633740700);
                    c2314t3 = c2314t2;
                    AbstractC18489d0.m53380u(i29, f14, c2314t3, c28655q3);
                    i34 = 9;
                    if (z17) {
                        c28655q3.m87150e0(1936994619);
                        c13825t7 = c13825tM48880a;
                        InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
                        AbstractC27275q0.m82278b(null, false, textResource7, null, c13825t7, null, interfaceC4339a10, c28655q3, ((i28 >> 6) & 57344) | ((i28 >> 9) & 3670016), 43);
                        interfaceC4339a8 = interfaceC4339a10;
                        c28655q3.m87173q(z18);
                    } else {
                        c13825t7 = c13825tM48880a;
                        interfaceC4339a8 = interfaceC4339a6;
                        c28655q3.m87150e0(1937228452);
                        Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t3, "dialog secondary button");
                        EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                        if (((i28 & 1879048192) ^ 805306368) > 536870912) {
                        }
                        objM87133R2 = c28655q3.m87133R();
                        if (z19) {
                            objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                            c28655q3.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        AbstractC27265l0.m82217i(modifierM44101d4, enumC27269n1, textResource7, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q3, 48, 0, 4088);
                        c28655q3.m87173q(z18);
                    }
                    c28655q3.m87173q(z18);
                }
                c28655q3.m87173q(true);
                interfaceC4339a4 = interfaceC4339a8;
                c13825t5 = c13825t7;
                c28655q = c28655q3;
                textResource6 = textResource7;
                z15 = z17;
                interfaceC4339a3 = interfaceC4339a7;
                interfaceC15156u2 = interfaceC15156u3;
                c13825t4 = c13825t6;
                textResource5 = textResource8;
            } else {
                c28655q4.m87138X();
                textResource5 = textResource3;
                textResource6 = textResource4;
                c28655q = c28655q4;
                c13825t4 = c13825t3;
                z15 = z13;
                interfaceC15156u2 = interfaceC15156u1;
                c13825t5 = c13825t2;
                interfaceC4339a3 = interfaceC4339a;
                interfaceC4339a4 = interfaceC4339a2;
            }
            interfaceC39332e2 = interfaceC39332e;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(textResource5, interfaceC39332e2, textResource6, z15, interfaceC15156u2, c13825t4, c13825t5, onApproveRequest, interfaceC4339a3, interfaceC4339a4, i13, i14);
            }
        }
        i15 |= 384;
        textResource4 = textResource2;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q4.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    interfaceC15156u1 = interfaceC15156u0;
                    if (c28655q4.m87153g(interfaceC15156u1)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i37;
                } else {
                    interfaceC15156u1 = interfaceC15156u0;
                }
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i37;
            } else {
                interfaceC15156u1 = interfaceC15156u0;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                c13825t3 = c13825t;
            } else {
                c13825t3 = c13825t;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87153g(c13825t3)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            if ((i13 & 1572864) != 0) {
                if ((i14 & 64) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i15 |= i36;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(onApproveRequest)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i13 & 100663296) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a)) {
                        i26 = 67108864;
                    } else {
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i26;
                }
            }
            if ((i13 & 805306368) != 0) {
                i15 |= ((i14 & 512) == 0 || !c28655q4.m87157i(interfaceC4339a2)) ? 268435456 : 536870912;
            }
            if ((i15 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                c28655q4.m87140Z();
                i27 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i38 != 0) {
                        textResource3 = null;
                    }
                    if (i39 != 0) {
                        interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    if (i44 != 0) {
                        textResource4 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i14 & 16) != 0) {
                        C22976l1 c22976l4 = AbstractC15166v0.f56891a;
                        C38072d c38072d4 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d4.m121949b(c28655q4, 6).getBrandWhite(), c38072d4.m121949b(c28655q4, 6).getBrandBlack(), c38072d4.m121949b(c28655q4, 6).getWhite10(), c38072d4.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        i15 &= -57345;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if (i18 != 0) {
                        c13825t3 = null;
                    }
                    textResource3 = textResource3;
                    if ((i14 & 64) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                        i15 &= -3670017;
                    } else {
                        c13825tM48880a = c13825t2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C21179y0(3);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if ((i14 & 512) != 0) {
                        i15 &= -1879048193;
                        interfaceC4339a6 = interfaceC4339a5;
                        interfaceC4339a7 = interfaceC4339a6;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                        interfaceC4339a7 = interfaceC4339a5;
                    }
                    i28 = i15;
                    interfaceC39332e = interfaceC39332e3;
                    z17 = z16;
                    textResource7 = textResource4;
                    interfaceC15156u3 = interfaceC15156u0M43196a;
                    c13825t6 = c13825t3;
                } else {
                    if (i38 != 0) {
                        textResource3 = null;
                    }
                    if (i39 != 0) {
                        interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                    } else {
                        interfaceC39332e3 = interfaceC39332e;
                    }
                    if (i44 != 0) {
                        textResource4 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i14 & 16) != 0) {
                        C22976l1 c22976l5 = AbstractC15166v0.f56891a;
                        C38072d c38072d5 = C38072d.f163053a;
                        interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d5.m121949b(c28655q4, 6).getBrandWhite(), c38072d5.m121949b(c28655q4, 6).getBrandBlack(), c38072d5.m121949b(c28655q4, 6).getWhite10(), c38072d5.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        i15 &= -57345;
                    } else {
                        c28655q2 = c28655q4;
                        interfaceC15156u0M43196a = interfaceC15156u1;
                    }
                    if (i18 != 0) {
                        c13825t3 = null;
                    }
                    textResource3 = textResource3;
                    if ((i14 & 64) != 0) {
                        c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                        i15 &= -3670017;
                    } else {
                        c13825tM48880a = c13825t2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C21179y0(3);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a5 = interfaceC4339a;
                    }
                    if ((i14 & 512) != 0) {
                        i15 &= -1879048193;
                        interfaceC4339a6 = interfaceC4339a5;
                        interfaceC4339a7 = interfaceC4339a6;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                        interfaceC4339a7 = interfaceC4339a5;
                    }
                    i28 = i15;
                    interfaceC39332e = interfaceC39332e3;
                    z17 = z16;
                    textResource7 = textResource4;
                    interfaceC15156u3 = interfaceC15156u0M43196a;
                    c13825t6 = c13825t3;
                }
                c28655q2.m87175r();
                f13 = 8;
                c2314t = C2314t.f9131w;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * f13, 0.0f, 2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                c28676v1 = c28676v0;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                if (textResource3 == null) {
                    c28655q2.m87150e0(632948215);
                    c28655q2.m87173q(false);
                    z18 = false;
                    textResource8 = textResource3;
                    interfaceC15156u3 = interfaceC15156u3;
                    c13825t6 = c13825t6;
                    c2314t2 = c2314t;
                    interfaceC39332e = interfaceC39332e;
                    c28655q3 = c28655q2;
                    textResource7 = textResource7;
                    c28676v1 = c28676v1;
                    i29 = 2;
                    f14 = f13;
                } else {
                    c28655q2.m87150e0(632948216);
                    if (z17) {
                        c28655q2.m87150e0(-110058909);
                        C28655q c28655q7 = c28655q2;
                        AbstractC27244c0.m82098b(null, false, null, textResource3, interfaceC15156u3, c13825t6, onApproveRequest, c28655q7, (i28 & 516096) | ((i28 >> 3) & 3670016), 7);
                        c28655q3 = c28655q7;
                        c28655q3.m87173q(false);
                        i29 = 2;
                        textResource8 = textResource3;
                        z18 = false;
                        c2314t2 = c2314t;
                        f14 = f13;
                    } else {
                        TextResource textResource11 = textResource3;
                        c28655q3 = c28655q2;
                        c28655q3.m87150e0(-109788961);
                        Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "dialog primary button");
                        EnumC27284v enumC27284v3 = EnumC27284v.TextMedium;
                        String upperCase3 = AbstractC8693b.m21274h(textResource11, c28655q3, 0).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                        i29 = 2;
                        c2314t2 = c2314t;
                        z18 = false;
                        textResource8 = textResource11;
                        f14 = f13;
                        AbstractC27282u.m82292h(modifierM44101d5, enumC27284v3, upperCase3, false, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, (i28 >> 3) & 14), null, false, onApproveRequest, c28655q3, (i28 & 29360128) | 48, 104);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z18);
                }
                if (textResource7 == null) {
                    c28655q3.m87150e0(633740699);
                    c28655q3.m87173q(z18);
                    c13825t7 = c13825tM48880a;
                    interfaceC4339a8 = interfaceC4339a6;
                } else {
                    c28655q3.m87150e0(633740700);
                    c2314t3 = c2314t2;
                    AbstractC18489d0.m53380u(i29, f14, c2314t3, c28655q3);
                    i34 = 9;
                    if (z17) {
                        c28655q3.m87150e0(1936994619);
                        c13825t7 = c13825tM48880a;
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                        AbstractC27275q0.m82278b(null, false, textResource7, null, c13825t7, null, interfaceC4339a11, c28655q3, ((i28 >> 6) & 57344) | ((i28 >> 9) & 3670016), 43);
                        interfaceC4339a8 = interfaceC4339a11;
                        c28655q3.m87173q(z18);
                    } else {
                        c13825t7 = c13825tM48880a;
                        interfaceC4339a8 = interfaceC4339a6;
                        c28655q3.m87150e0(1937228452);
                        Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t3, "dialog secondary button");
                        EnumC27269n0 enumC27269n2 = EnumC27269n0.TextSmall;
                        if (((i28 & 1879048192) ^ 805306368) > 536870912) {
                        }
                        objM87133R2 = c28655q3.m87133R();
                        if (z19) {
                            objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                            c28655q3.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        AbstractC27265l0.m82217i(modifierM44101d6, enumC27269n2, textResource7, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q3, 48, 0, 4088);
                        c28655q3.m87173q(z18);
                    }
                    c28655q3.m87173q(z18);
                }
                c28655q3.m87173q(true);
                interfaceC4339a4 = interfaceC4339a8;
                c13825t5 = c13825t7;
                c28655q = c28655q3;
                textResource6 = textResource7;
                z15 = z17;
                interfaceC4339a3 = interfaceC4339a7;
                interfaceC15156u2 = interfaceC15156u3;
                c13825t4 = c13825t6;
                textResource5 = textResource8;
            } else {
                c28655q4.m87138X();
                textResource5 = textResource3;
                textResource6 = textResource4;
                c28655q = c28655q4;
                c13825t4 = c13825t3;
                z15 = z13;
                interfaceC15156u2 = interfaceC15156u1;
                c13825t5 = c13825t2;
                interfaceC4339a3 = interfaceC4339a;
                interfaceC4339a4 = interfaceC4339a2;
            }
            interfaceC39332e2 = interfaceC39332e;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21203f(textResource5, interfaceC39332e2, textResource6, z15, interfaceC15156u2, c13825t4, c13825t5, onApproveRequest, interfaceC4339a3, interfaceC4339a4, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                interfaceC15156u1 = interfaceC15156u0;
                if (c28655q4.m87153g(interfaceC15156u1)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i37;
            } else {
                interfaceC15156u1 = interfaceC15156u0;
            }
            i37 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i37;
        } else {
            interfaceC15156u1 = interfaceC15156u0;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c13825t3 = c13825t;
        } else {
            c13825t3 = c13825t;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87153g(c13825t3)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
        }
        if ((i13 & 1572864) != 0) {
            if ((i14 & 64) == 0) {
                i36 = 524288;
            } else {
                i36 = 524288;
            }
            i15 |= i36;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q4.m87157i(onApproveRequest)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i15 |= i35;
        }
        i24 = i14 & 256;
        if (i24 != 0) {
            i15 |= 100663296;
            i25 = i24;
        } else {
            i25 = i24;
            if ((i13 & 100663296) == 0) {
                if (c28655q4.m87157i(interfaceC4339a)) {
                    i26 = 67108864;
                } else {
                    i26 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i26;
            }
        }
        if ((i13 & 805306368) != 0) {
            i15 |= ((i14 & 512) == 0 || !c28655q4.m87157i(interfaceC4339a2)) ? 268435456 : 536870912;
        }
        if ((i15 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z14)) {
            c28655q4.m87140Z();
            i27 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                if (i38 != 0) {
                    textResource3 = null;
                }
                if (i39 != 0) {
                    interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                if (i44 != 0) {
                    textResource4 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i14 & 16) != 0) {
                    C22976l1 c22976l6 = AbstractC15166v0.f56891a;
                    C38072d c38072d6 = C38072d.f163053a;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d6.m121949b(c28655q4, 6).getBrandWhite(), c38072d6.m121949b(c28655q4, 6).getBrandBlack(), c38072d6.m121949b(c28655q4, 6).getWhite10(), c38072d6.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                    c28655q2 = c28655q4;
                    i15 &= -57345;
                } else {
                    c28655q2 = c28655q4;
                    interfaceC15156u0M43196a = interfaceC15156u1;
                }
                if (i18 != 0) {
                    c13825t3 = null;
                }
                textResource3 = textResource3;
                if ((i14 & 64) != 0) {
                    c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                    i15 &= -3670017;
                } else {
                    c13825tM48880a = c13825t2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C21179y0(3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a5 = interfaceC4339a;
                }
                if ((i14 & 512) != 0) {
                    i15 &= -1879048193;
                    interfaceC4339a6 = interfaceC4339a5;
                    interfaceC4339a7 = interfaceC4339a6;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                    interfaceC4339a7 = interfaceC4339a5;
                }
                i28 = i15;
                interfaceC39332e = interfaceC39332e3;
                z17 = z16;
                textResource7 = textResource4;
                interfaceC15156u3 = interfaceC15156u0M43196a;
                c13825t6 = c13825t3;
            } else {
                if (i38 != 0) {
                    textResource3 = null;
                }
                if (i39 != 0) {
                    interfaceC39332e3 = EnumC39333f.BRAND_WHITE;
                } else {
                    interfaceC39332e3 = interfaceC39332e;
                }
                if (i44 != 0) {
                    textResource4 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i14 & 16) != 0) {
                    C22976l1 c22976l7 = AbstractC15166v0.f56891a;
                    C38072d c38072d7 = C38072d.f163053a;
                    interfaceC15156u0M43196a = AbstractC15166v0.m43196a(c38072d7.m121949b(c28655q4, 6).getBrandWhite(), c38072d7.m121949b(c28655q4, 6).getBrandBlack(), c38072d7.m121949b(c28655q4, 6).getWhite10(), c38072d7.m121949b(c28655q4, 6).getWhite20(), c28655q4, 0, 0);
                    c28655q2 = c28655q4;
                    i15 &= -57345;
                } else {
                    c28655q2 = c28655q4;
                    interfaceC15156u0M43196a = interfaceC15156u1;
                }
                if (i18 != 0) {
                    c13825t3 = null;
                }
                textResource3 = textResource3;
                if ((i14 & 64) != 0) {
                    c13825tM48880a = AbstractC17269i.m48880a(((float) 0.5d) * 4, C38072d.f163053a.m121949b(c28655q2, 6).getWhite20());
                    i15 &= -3670017;
                } else {
                    c13825tM48880a = c13825t2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C21179y0(3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a5 = interfaceC4339a;
                }
                if ((i14 & 512) != 0) {
                    i15 &= -1879048193;
                    interfaceC4339a6 = interfaceC4339a5;
                    interfaceC4339a7 = interfaceC4339a6;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                    interfaceC4339a7 = interfaceC4339a5;
                }
                i28 = i15;
                interfaceC39332e = interfaceC39332e3;
                z17 = z16;
                textResource7 = textResource4;
                interfaceC15156u3 = interfaceC15156u0M43196a;
                c13825t6 = c13825t3;
            }
            c28655q2.m87175r();
            f13 = 8;
            c2314t = C2314t.f9131w;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            c28676v1 = c28676v0;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            if (textResource3 == null) {
                c28655q2.m87150e0(632948215);
                c28655q2.m87173q(false);
                z18 = false;
                textResource8 = textResource3;
                interfaceC15156u3 = interfaceC15156u3;
                c13825t6 = c13825t6;
                c2314t2 = c2314t;
                interfaceC39332e = interfaceC39332e;
                c28655q3 = c28655q2;
                textResource7 = textResource7;
                c28676v1 = c28676v1;
                i29 = 2;
                f14 = f13;
            } else {
                c28655q2.m87150e0(632948216);
                if (z17) {
                    c28655q2.m87150e0(-110058909);
                    C28655q c28655q8 = c28655q2;
                    AbstractC27244c0.m82098b(null, false, null, textResource3, interfaceC15156u3, c13825t6, onApproveRequest, c28655q8, (i28 & 516096) | ((i28 >> 3) & 3670016), 7);
                    c28655q3 = c28655q8;
                    c28655q3.m87173q(false);
                    i29 = 2;
                    textResource8 = textResource3;
                    z18 = false;
                    c2314t2 = c2314t;
                    f14 = f13;
                } else {
                    TextResource textResource12 = textResource3;
                    c28655q3 = c28655q2;
                    c28655q3.m87150e0(-109788961);
                    Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "dialog primary button");
                    EnumC27284v enumC27284v4 = EnumC27284v.TextMedium;
                    String upperCase4 = AbstractC8693b.m21274h(textResource12, c28655q3, 0).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                    i29 = 2;
                    c2314t2 = c2314t;
                    z18 = false;
                    textResource8 = textResource12;
                    f14 = f13;
                    AbstractC27282u.m82292h(modifierM44101d7, enumC27284v4, upperCase4, false, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, (i28 >> 3) & 14), null, false, onApproveRequest, c28655q3, (i28 & 29360128) | 48, 104);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z18);
            }
            if (textResource7 == null) {
                c28655q3.m87150e0(633740699);
                c28655q3.m87173q(z18);
                c13825t7 = c13825tM48880a;
                interfaceC4339a8 = interfaceC4339a6;
            } else {
                c28655q3.m87150e0(633740700);
                c2314t3 = c2314t2;
                AbstractC18489d0.m53380u(i29, f14, c2314t3, c28655q3);
                i34 = 9;
                if (z17) {
                    c28655q3.m87150e0(1936994619);
                    c13825t7 = c13825tM48880a;
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a6;
                    AbstractC27275q0.m82278b(null, false, textResource7, null, c13825t7, null, interfaceC4339a12, c28655q3, ((i28 >> 6) & 57344) | ((i28 >> 9) & 3670016), 43);
                    interfaceC4339a8 = interfaceC4339a12;
                    c28655q3.m87173q(z18);
                } else {
                    c13825t7 = c13825tM48880a;
                    interfaceC4339a8 = interfaceC4339a6;
                    c28655q3.m87150e0(1937228452);
                    Modifier modifierM44101d8 = AbstractC15676d.m44101d(c2314t3, "dialog secondary button");
                    EnumC27269n0 enumC27269n3 = EnumC27269n0.TextSmall;
                    if (((i28 & 1879048192) ^ 805306368) > 536870912) {
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z19) {
                        objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16416l0(interfaceC4339a8, i34);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(modifierM44101d8, enumC27269n3, textResource7, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q3, 48, 0, 4088);
                    c28655q3.m87173q(z18);
                }
                c28655q3.m87173q(z18);
            }
            c28655q3.m87173q(true);
            interfaceC4339a4 = interfaceC4339a8;
            c13825t5 = c13825t7;
            c28655q = c28655q3;
            textResource6 = textResource7;
            z15 = z17;
            interfaceC4339a3 = interfaceC4339a7;
            interfaceC15156u2 = interfaceC15156u3;
            c13825t4 = c13825t6;
            textResource5 = textResource8;
        } else {
            c28655q4.m87138X();
            textResource5 = textResource3;
            textResource6 = textResource4;
            c28655q = c28655q4;
            c13825t4 = c13825t3;
            z15 = z13;
            interfaceC15156u2 = interfaceC15156u1;
            c13825t5 = c13825t2;
            interfaceC4339a3 = interfaceC4339a;
            interfaceC4339a4 = interfaceC4339a2;
        }
        interfaceC39332e2 = interfaceC39332e;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21203f(textResource5, interfaceC39332e2, textResource6, z15, interfaceC15156u2, c13825t4, c13825t5, onApproveRequest, interfaceC4339a3, interfaceC4339a4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m59457e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m59458f(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m59459g(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, boolean z4, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, C13825t c13825t2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, Composer composer, int i15) {
        m59456d(textResource, interfaceC39332e, textResource2, z4, interfaceC15156u0, c13825t, c13825t2, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
