package z51;

import am0.C0999c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
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
import p026b2.InterfaceC2300f;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22968j;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v41.C35658c;
import v63.AbstractC35745c;
import v71.C35766g;
import vv2.C36537c;
import w71.C36891k;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: z51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u0018\u001a\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u0018\u001ao\u0010,\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lz51/k;", "recoveryType", "Lcom/whoop/design/util/TextResource;", "recoveryPercentText", "strainScoreText", "Ll83/a0;", "k", "(Lz51/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "q", "(Landroidx/compose/runtime/Composer;I)V", "sleepPercentText", "hrvText", "m", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "keyStatValue", "keyStatText", "i", "(Landroidx/compose/ui/Modifier;Lz51/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "o", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "v", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)J", "type", "t", "(Lz51/k;Landroidx/compose/runtime/Composer;I)J", "u", "text", "s", "statValue", "statLabelText", "statValueColor", "statLabelColor", "Lw3/k;", "textAlign", "Lb2/f;", "horizontalAlignment", "Ll0/j;", "arrangement", "", "showPercentSign", "isCustomKeyStat", "g", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJILb2/f;Ll0/j;ZZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40093d {

    /* JADX INFO: renamed from: z51.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f173024a;

        static {
            int[] iArr = new int[EnumC40100k.values().length];
            try {
                iArr[EnumC40100k.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40100k.CALIBRATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC40100k.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC40100k.MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC40100k.HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f173024a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:126:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x020d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0211  */
    /* JADX WARN: Code duplicated, block: B:157:0x0226  */
    /* JADX WARN: Code duplicated, block: B:159:0x0234  */
    /* JADX WARN: Code duplicated, block: B:162:0x025c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0260  */
    /* JADX WARN: Code duplicated, block: B:166:0x026d  */
    /* JADX WARN: Code duplicated, block: B:168:0x027b  */
    /* JADX WARN: Code duplicated, block: B:171:0x028b  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:176:0x0315  */
    /* JADX WARN: Code duplicated, block: B:178:0x035e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:183:0x03db  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /* JADX INFO: renamed from: g */
    public static final void m128535g(Modifier modifier, final TextResource statValue, final TextResource statLabelText, long j7, long j13, int i13, InterfaceC2300f interfaceC2300f, InterfaceC22968j interfaceC22968j, boolean z4, boolean z13, Composer composer, final int i14, final int i15) {
        int i16;
        long jM125430y;
        long jM125385c1;
        int i17;
        InterfaceC2300f interfaceC2300f2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z14;
        final Modifier modifier2;
        final boolean z15;
        final long j14;
        final long j15;
        final int i28;
        final InterfaceC2300f interfaceC2300f3;
        final InterfaceC22968j interfaceC22968j2;
        final boolean z16;
        C28677v1 c28677v1M87180u;
        int i29;
        C2314t c2314t;
        Modifier modifier3;
        InterfaceC2300f interfaceC2300f4;
        InterfaceC22968j interfaceC22968j3;
        boolean z17;
        int i34;
        long j16;
        InterfaceC22968j interfaceC22968j4;
        boolean z18;
        boolean z19;
        boolean z24;
        int iHashCode;
        C0213j c0213j;
        boolean z25;
        C0209i c0209i;
        int iHashCode2;
        C2886a c2886a;
        int i35;
        int i36;
        int i37;
        int i38;
        AbstractC22676k.m65750j(statValue, "statValue");
        AbstractC22676k.m65750j(statLabelText, "statLabelText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2016227845);
        int i39 = i15 & 1;
        if (i39 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(statValue) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(statLabelText) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                jM125430y = j7;
                if (c28655q.m87151f(jM125430y)) {
                    i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i16 |= i38;
            } else {
                jM125430y = j7;
            }
            i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i16 |= i38;
        } else {
            jM125430y = j7;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                jM125385c1 = j13;
                if (c28655q.m87151f(jM125385c1)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i37;
            } else {
                jM125385c1 = j13;
            }
            i37 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i37;
        } else {
            jM125385c1 = j13;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                i17 = i13;
                if (c28655q.m87149e(i17)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i36;
            } else {
                i17 = i13;
            }
            i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i16 |= i36;
        } else {
            i17 = i13;
        }
        int i44 = i15 & 64;
        if (i44 == 0) {
            if ((1572864 & i14) == 0) {
                interfaceC2300f2 = interfaceC2300f;
                i16 |= c28655q.m87153g(interfaceC2300f2) ? 1048576 : 524288;
            }
            i18 = i15 & 128;
            if (i18 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (c28655q.m87153g(interfaceC22968j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 256;
                if (i24 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87155h(z4)) {
                            i25 = 67108864;
                        } else {
                            i25 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i25;
                    }
                    i26 = i15 & 512;
                    if (i26 != 0) {
                        if ((i14 & 805306368) == 0) {
                            if (c28655q.m87155h(z13)) {
                                i27 = 536870912;
                            } else {
                                i27 = 268435456;
                            }
                            i16 |= i27;
                        }
                        if ((i16 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z14)) {
                            c28655q.m87140Z();
                            i29 = i14 & 1;
                            c2314t = C2314t.f9131w;
                            if (i29 != 0 || c28655q.m87118C()) {
                                if (i39 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if ((i15 & 8) != 0) {
                                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                    i16 &= -7169;
                                }
                                if ((i15 & 16) != 0) {
                                    jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                    i16 &= -57345;
                                }
                                if ((i15 & 32) != 0) {
                                    i16 &= -458753;
                                    i17 = 5;
                                }
                                if (i44 != 0) {
                                    interfaceC2300f4 = C2299e.f9110M;
                                } else {
                                    interfaceC2300f4 = interfaceC2300f2;
                                }
                                if (i18 != 0) {
                                    interfaceC22968j3 = AbstractC22977m.f90654e;
                                } else {
                                    interfaceC22968j3 = interfaceC22968j;
                                }
                                if (i24 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z4;
                                }
                                i34 = i16;
                                if (i26 != 0) {
                                    j16 = jM125430y;
                                    interfaceC22968j4 = interfaceC22968j3;
                                    z18 = z17;
                                    z19 = false;
                                } else {
                                    j16 = jM125430y;
                                    interfaceC22968j4 = interfaceC22968j3;
                                    z18 = z17;
                                }
                                c28655q.m87175r();
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                                InterfaceC22968j interfaceC22968j5 = interfaceC22968j4;
                                z24 = z18;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                                InterfaceC0221l.f734a.getClass();
                                Modifier modifier4 = modifier3;
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                z25 = z19;
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                C0209i c0209i2 = C0217k.f729g;
                                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                                C0209i c0209i3 = C0217k.f728f;
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                                c0209i = C0217k.f732j;
                                long j17 = jM125385c1;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                                InterfaceC2300f interfaceC2300f5 = interfaceC2300f4;
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                                int i45 = i34 >> 3;
                                String strM21274h = AbstractC8693b.m21274h(statValue, c28655q, i45 & 14);
                                if (z25) {
                                    c28655q.m87150e0(2061907917);
                                    c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                                } else {
                                    c28655q.m87150e0(2061908239);
                                    c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                                }
                                c28655q.m87173q(false);
                                i35 = i45 & 896;
                                int i46 = 1879048192 & (i34 << 12);
                                AbstractC30795n.m94707h(strM21274h, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i46, 0, 196090);
                                if (z24) {
                                    c28655q.m87150e0(-505141245);
                                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(-505015881);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(true);
                                int i47 = i34 >> 6;
                                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i47 & 14), null, j17, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i47 & 896) | i46, 3120, 185850);
                                c28655q.m87173q(true);
                                modifier2 = modifier4;
                                z15 = z25;
                                j14 = j16;
                                interfaceC2300f3 = interfaceC2300f5;
                                i28 = i17;
                                j15 = j17;
                                interfaceC22968j2 = interfaceC22968j5;
                                z16 = z24;
                            } else {
                                c28655q.m87138X();
                                if ((i15 & 8) != 0) {
                                    i16 &= -7169;
                                }
                                if ((i15 & 16) != 0) {
                                    i16 &= -57345;
                                }
                                if ((i15 & 32) != 0) {
                                    i16 &= -458753;
                                }
                                modifier3 = modifier;
                                i34 = i16;
                                j16 = jM125430y;
                                interfaceC2300f4 = interfaceC2300f2;
                                interfaceC22968j4 = interfaceC22968j;
                                z18 = z4;
                            }
                            z19 = z13;
                            c28655q.m87175r();
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                            InterfaceC22968j interfaceC22968j6 = interfaceC22968j4;
                            z24 = z18;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
                            InterfaceC0221l.f734a.getClass();
                            Modifier modifier5 = modifier3;
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            z25 = z19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            C0209i c0209i5 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                            C0209i c0209i6 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            long j18 = jM125385c1;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            C0209i c0209i7 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                            InterfaceC2300f interfaceC2300f6 = interfaceC2300f4;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                            int i48 = i34 >> 3;
                            String strM21274h2 = AbstractC8693b.m21274h(statValue, c28655q, i48 & 14);
                            if (z25) {
                                c28655q.m87150e0(2061907917);
                                c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                            } else {
                                c28655q.m87150e0(2061908239);
                                c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                            }
                            c28655q.m87173q(false);
                            i35 = i48 & 896;
                            int i49 = 1879048192 & (i34 << 12);
                            AbstractC30795n.m94707h(strM21274h2, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i49, 0, 196090);
                            if (z24) {
                                c28655q.m87150e0(-505141245);
                                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-505015881);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            int i410 = i34 >> 6;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i410 & 14), null, j18, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i410 & 896) | i49, 3120, 185850);
                            c28655q.m87173q(true);
                            modifier2 = modifier5;
                            z15 = z25;
                            j14 = j16;
                            interfaceC2300f3 = interfaceC2300f6;
                            i28 = i17;
                            j15 = j18;
                            interfaceC22968j2 = interfaceC22968j6;
                            z16 = z24;
                        } else {
                            c28655q.m87138X();
                            modifier2 = modifier;
                            z15 = z13;
                            j14 = jM125430y;
                            j15 = jM125385c1;
                            i28 = i17;
                            interfaceC2300f3 = interfaceC2300f2;
                            interfaceC22968j2 = interfaceC22968j;
                            z16 = z4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        i29 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        }
                        c28655q.m87175r();
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                        InterfaceC22968j interfaceC22968j7 = interfaceC22968j4;
                        z24 = z18;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier6 = modifier3;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z25 = z19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i8 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                        C0209i c0209i9 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        long j19 = jM125385c1;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                        InterfaceC2300f interfaceC2300f7 = interfaceC2300f4;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                        int i411 = i34 >> 3;
                        String strM21274h3 = AbstractC8693b.m21274h(statValue, c28655q, i411 & 14);
                        if (z25) {
                            c28655q.m87150e0(2061907917);
                            c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        } else {
                            c28655q.m87150e0(2061908239);
                            c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        }
                        c28655q.m87173q(false);
                        i35 = i411 & 896;
                        int i412 = 1879048192 & (i34 << 12);
                        AbstractC30795n.m94707h(strM21274h3, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i412, 0, 196090);
                        if (z24) {
                            c28655q.m87150e0(-505141245);
                            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-505015881);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        int i413 = i34 >> 6;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i413 & 14), null, j19, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i413 & 896) | i412, 3120, 185850);
                        c28655q.m87173q(true);
                        modifier2 = modifier6;
                        z15 = z25;
                        j14 = j16;
                        interfaceC2300f3 = interfaceC2300f7;
                        i28 = i17;
                        j15 = j19;
                        interfaceC22968j2 = interfaceC22968j7;
                        z16 = z24;
                    } else {
                        c28655q.m87138X();
                        modifier2 = modifier;
                        z15 = z13;
                        j14 = jM125430y;
                        j15 = jM125385c1;
                        i28 = i17;
                        interfaceC2300f3 = interfaceC2300f2;
                        interfaceC22968j2 = interfaceC22968j;
                        z16 = z4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 100663296;
                i26 = i15 & 512;
                if (i26 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i16 |= i27;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        i29 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        }
                        c28655q.m87175r();
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                        InterfaceC22968j interfaceC22968j8 = interfaceC22968j4;
                        z24 = z18;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier7 = modifier3;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z25 = z19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i11 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
                        C0209i c0209i12 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        long j110 = jM125385c1;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                        InterfaceC2300f interfaceC2300f8 = interfaceC2300f4;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                        int i414 = i34 >> 3;
                        String strM21274h4 = AbstractC8693b.m21274h(statValue, c28655q, i414 & 14);
                        if (z25) {
                            c28655q.m87150e0(2061907917);
                            c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        } else {
                            c28655q.m87150e0(2061908239);
                            c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        }
                        c28655q.m87173q(false);
                        i35 = i414 & 896;
                        int i415 = 1879048192 & (i34 << 12);
                        AbstractC30795n.m94707h(strM21274h4, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i415, 0, 196090);
                        if (z24) {
                            c28655q.m87150e0(-505141245);
                            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-505015881);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        int i416 = i34 >> 6;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i416 & 14), null, j110, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i416 & 896) | i415, 3120, 185850);
                        c28655q.m87173q(true);
                        modifier2 = modifier7;
                        z15 = z25;
                        j14 = j16;
                        interfaceC2300f3 = interfaceC2300f8;
                        i28 = i17;
                        j15 = j110;
                        interfaceC22968j2 = interfaceC22968j8;
                        z16 = z24;
                    } else {
                        c28655q.m87138X();
                        modifier2 = modifier;
                        z15 = z13;
                        j14 = jM125430y;
                        j15 = jM125385c1;
                        i28 = i17;
                        interfaceC2300f3 = interfaceC2300f2;
                        interfaceC22968j2 = interfaceC22968j;
                        z16 = z4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j9 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier8 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    long j111 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f9 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    int i417 = i34 >> 3;
                    String strM21274h5 = AbstractC8693b.m21274h(statValue, c28655q, i417 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i417 & 896;
                    int i418 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h5, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i418, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i419 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i419 & 14), null, j111, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i419 & 896) | i418, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier8;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f9;
                    i28 = i17;
                    j15 = j111;
                    interfaceC22968j2 = interfaceC22968j9;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 12582912;
            i24 = i15 & 256;
            if (i24 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 512;
                if (i26 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i16 |= i27;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        i29 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        }
                        c28655q.m87175r();
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                        InterfaceC22968j interfaceC22968j10 = interfaceC22968j4;
                        z24 = z18;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier9 = modifier3;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z25 = z19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i17 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a6);
                        C0209i c0209i18 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        long j112 = jM125385c1;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i19 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                        InterfaceC2300f interfaceC2300f10 = interfaceC2300f4;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                        int i4110 = i34 >> 3;
                        String strM21274h6 = AbstractC8693b.m21274h(statValue, c28655q, i4110 & 14);
                        if (z25) {
                            c28655q.m87150e0(2061907917);
                            c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        } else {
                            c28655q.m87150e0(2061908239);
                            c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        }
                        c28655q.m87173q(false);
                        i35 = i4110 & 896;
                        int i4111 = 1879048192 & (i34 << 12);
                        AbstractC30795n.m94707h(strM21274h6, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i4111, 0, 196090);
                        if (z24) {
                            c28655q.m87150e0(-505141245);
                            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-505015881);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        int i4112 = i34 >> 6;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i4112 & 14), null, j112, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i4112 & 896) | i4111, 3120, 185850);
                        c28655q.m87173q(true);
                        modifier2 = modifier9;
                        z15 = z25;
                        j14 = j16;
                        interfaceC2300f3 = interfaceC2300f10;
                        i28 = i17;
                        j15 = j112;
                        interfaceC22968j2 = interfaceC22968j10;
                        z16 = z24;
                    } else {
                        c28655q.m87138X();
                        modifier2 = modifier;
                        z15 = z13;
                        j14 = jM125430y;
                        j15 = jM125385c1;
                        i28 = i17;
                        interfaceC2300f3 = interfaceC2300f2;
                        interfaceC22968j2 = interfaceC22968j;
                        z16 = z4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j11 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier10 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a7);
                    C0209i c0209i111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    long j113 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f11 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                    int i4113 = i34 >> 3;
                    String strM21274h7 = AbstractC8693b.m21274h(statValue, c28655q, i4113 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i4113 & 896;
                    int i4114 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h7, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i4114, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i4115 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i4115 & 14), null, j113, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i4115 & 896) | i4114, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier10;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f11;
                    i28 = i17;
                    j15 = j113;
                    interfaceC22968j2 = interfaceC22968j11;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i26 = i15 & 512;
            if (i26 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i16 |= i27;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j12 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier11 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i113 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a8);
                    C0209i c0209i114 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    long j114 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f12 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
                    int i4116 = i34 >> 3;
                    String strM21274h8 = AbstractC8693b.m21274h(statValue, c28655q, i4116 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i4116 & 896;
                    int i4117 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h8, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i4117, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i4118 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i4118 & 14), null, j114, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i4118 & 896) | i4117, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier11;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f12;
                    i28 = i17;
                    j15 = j114;
                    interfaceC22968j2 = interfaceC22968j12;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i29 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                }
                c28655q.m87175r();
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                InterfaceC22968j interfaceC22968j13 = interfaceC22968j4;
                z24 = z18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier12 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z25 = z19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i116, c23010xM66775a9);
                C0209i c0209i117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m17);
                c0209i = C0217k.f732j;
                long j115 = jM125385c1;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i118 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N17);
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                InterfaceC2300f interfaceC2300f13 = interfaceC2300f4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i116, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N18);
                int i4119 = i34 >> 3;
                String strM21274h9 = AbstractC8693b.m21274h(statValue, c28655q, i4119 & 14);
                if (z25) {
                    c28655q.m87150e0(2061907917);
                    c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                } else {
                    c28655q.m87150e0(2061908239);
                    c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                }
                c28655q.m87173q(false);
                i35 = i4119 & 896;
                int i41110 = 1879048192 & (i34 << 12);
                AbstractC30795n.m94707h(strM21274h9, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i41110, 0, 196090);
                if (z24) {
                    c28655q.m87150e0(-505141245);
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-505015881);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int i41111 = i34 >> 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i41111 & 14), null, j115, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i41111 & 896) | i41110, 3120, 185850);
                c28655q.m87173q(true);
                modifier2 = modifier12;
                z15 = z25;
                j14 = j16;
                interfaceC2300f3 = interfaceC2300f13;
                i28 = i17;
                j15 = j115;
                interfaceC22968j2 = interfaceC22968j13;
                z16 = z24;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                z15 = z13;
                j14 = jM125430y;
                j15 = jM125385c1;
                i28 = i17;
                interfaceC2300f3 = interfaceC2300f2;
                interfaceC22968j2 = interfaceC22968j;
                z16 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 1572864;
        interfaceC2300f2 = interfaceC2300f;
        i18 = i15 & 128;
        if (i18 != 0) {
            if ((i14 & 12582912) == 0) {
                if (c28655q.m87153g(interfaceC22968j)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            }
            i24 = i15 & 256;
            if (i24 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87155h(z4)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 512;
                if (i26 != 0) {
                    if ((i14 & 805306368) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i16 |= i27;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z14)) {
                        c28655q.m87140Z();
                        i29 = i14 & 1;
                        c2314t = C2314t.f9131w;
                        if (i29 != 0) {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        } else {
                            if (i39 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i15 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                i16 &= -7169;
                            }
                            if ((i15 & 16) != 0) {
                                jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                                i16 &= -57345;
                            }
                            if ((i15 & 32) != 0) {
                                i16 &= -458753;
                                i17 = 5;
                            }
                            if (i44 != 0) {
                                interfaceC2300f4 = C2299e.f9110M;
                            } else {
                                interfaceC2300f4 = interfaceC2300f2;
                            }
                            if (i18 != 0) {
                                interfaceC22968j3 = AbstractC22977m.f90654e;
                            } else {
                                interfaceC22968j3 = interfaceC22968j;
                            }
                            if (i24 != 0) {
                                z17 = false;
                            } else {
                                z17 = z4;
                            }
                            i34 = i16;
                            if (i26 != 0) {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = false;
                            } else {
                                j16 = jM125430y;
                                interfaceC22968j4 = interfaceC22968j3;
                                z18 = z17;
                                z19 = z13;
                            }
                        }
                        c28655q.m87175r();
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                        InterfaceC22968j interfaceC22968j14 = interfaceC22968j4;
                        z24 = z18;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifier3);
                        InterfaceC0221l.f734a.getClass();
                        Modifier modifier13 = modifier3;
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        z25 = z19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i119 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i119, c23010xM66775a10);
                        C0209i c0209i1110 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC28653p1M87165m19);
                        c0209i = C0217k.f732j;
                        long j116 = jM125385c1;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i1111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N19);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                        InterfaceC2300f interfaceC2300f14 = interfaceC2300f4;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i119, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC28653p1M87165m110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1111, modifierM118962N110);
                        int i41112 = i34 >> 3;
                        String strM21274h10 = AbstractC8693b.m21274h(statValue, c28655q, i41112 & 14);
                        if (z25) {
                            c28655q.m87150e0(2061907917);
                            c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                        } else {
                            c28655q.m87150e0(2061908239);
                            c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                        }
                        c28655q.m87173q(false);
                        i35 = i41112 & 896;
                        int i41113 = 1879048192 & (i34 << 12);
                        AbstractC30795n.m94707h(strM21274h10, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i41113, 0, 196090);
                        if (z24) {
                            c28655q.m87150e0(-505141245);
                            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-505015881);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        int i41114 = i34 >> 6;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i41114 & 14), null, j116, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i41114 & 896) | i41113, 3120, 185850);
                        c28655q.m87173q(true);
                        modifier2 = modifier13;
                        z15 = z25;
                        j14 = j16;
                        interfaceC2300f3 = interfaceC2300f14;
                        i28 = i17;
                        j15 = j116;
                        interfaceC22968j2 = interfaceC22968j14;
                        z16 = z24;
                    } else {
                        c28655q.m87138X();
                        modifier2 = modifier;
                        z15 = z13;
                        j14 = jM125430y;
                        j15 = jM125385c1;
                        i28 = i17;
                        interfaceC2300f3 = interfaceC2300f2;
                        interfaceC22968j2 = interfaceC22968j;
                        z16 = z4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j15 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier14 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, c23010xM66775a11);
                    C0209i c0209i1113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m111);
                    c0209i = C0217k.f732j;
                    long j117 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i1114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N111);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f15 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, modifierM118962N112);
                    int i41115 = i34 >> 3;
                    String strM21274h11 = AbstractC8693b.m21274h(statValue, c28655q, i41115 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i41115 & 896;
                    int i41116 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h11, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i41116, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i41117 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i41117 & 14), null, j117, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i41117 & 896) | i41116, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier14;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f15;
                    i28 = i17;
                    j15 = j117;
                    interfaceC22968j2 = interfaceC22968j15;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            i26 = i15 & 512;
            if (i26 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i16 |= i27;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j16 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier15 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1115 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1115, c23010xM66775a12);
                    C0209i c0209i1116 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m113);
                    c0209i = C0217k.f732j;
                    long j118 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i1117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N113);
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f16 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N114);
                    int i41118 = i34 >> 3;
                    String strM21274h12 = AbstractC8693b.m21274h(statValue, c28655q, i41118 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i41118 & 896;
                    int i41119 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h12, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i41119, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i411110 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i411110 & 14), null, j118, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i411110 & 896) | i41119, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier15;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f16;
                    i28 = i17;
                    j15 = j118;
                    interfaceC22968j2 = interfaceC22968j16;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i29 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                }
                c28655q.m87175r();
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                InterfaceC22968j interfaceC22968j17 = interfaceC22968j4;
                z24 = z18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier16 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z25 = z19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1118, c23010xM66775a13);
                C0209i c0209i1119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m115);
                c0209i = C0217k.f732j;
                long j119 = jM125385c1;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i11110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N115);
                C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                InterfaceC2300f interfaceC2300f17 = interfaceC2300f4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1118, c22994r1M66759a13);
                AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N116);
                int i411111 = i34 >> 3;
                String strM21274h13 = AbstractC8693b.m21274h(statValue, c28655q, i411111 & 14);
                if (z25) {
                    c28655q.m87150e0(2061907917);
                    c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                } else {
                    c28655q.m87150e0(2061908239);
                    c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                }
                c28655q.m87173q(false);
                i35 = i411111 & 896;
                int i411112 = 1879048192 & (i34 << 12);
                AbstractC30795n.m94707h(strM21274h13, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i411112, 0, 196090);
                if (z24) {
                    c28655q.m87150e0(-505141245);
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-505015881);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int i411113 = i34 >> 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i411113 & 14), null, j119, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i411113 & 896) | i411112, 3120, 185850);
                c28655q.m87173q(true);
                modifier2 = modifier16;
                z15 = z25;
                j14 = j16;
                interfaceC2300f3 = interfaceC2300f17;
                i28 = i17;
                j15 = j119;
                interfaceC22968j2 = interfaceC22968j17;
                z16 = z24;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                z15 = z13;
                j14 = jM125430y;
                j15 = jM125385c1;
                i28 = i17;
                interfaceC2300f3 = interfaceC2300f2;
                interfaceC22968j2 = interfaceC22968j;
                z16 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 12582912;
        i24 = i15 & 256;
        if (i24 != 0) {
            if ((i14 & 100663296) == 0) {
                if (c28655q.m87155h(z4)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i25;
            }
            i26 = i15 & 512;
            if (i26 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i16 |= i27;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i29 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    } else {
                        if (i39 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i15 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i16 &= -7169;
                        }
                        if ((i15 & 16) != 0) {
                            jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                            i16 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i16 &= -458753;
                            i17 = 5;
                        }
                        if (i44 != 0) {
                            interfaceC2300f4 = C2299e.f9110M;
                        } else {
                            interfaceC2300f4 = interfaceC2300f2;
                        }
                        if (i18 != 0) {
                            interfaceC22968j3 = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22968j3 = interfaceC22968j;
                        }
                        if (i24 != 0) {
                            z17 = false;
                        } else {
                            z17 = z4;
                        }
                        i34 = i16;
                        if (i26 != 0) {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = false;
                        } else {
                            j16 = jM125430y;
                            interfaceC22968j4 = interfaceC22968j3;
                            z18 = z17;
                            z19 = z13;
                        }
                    }
                    c28655q.m87175r();
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                    InterfaceC22968j interfaceC22968j18 = interfaceC22968j4;
                    z24 = z18;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier17 = modifier3;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    z25 = z19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i11111 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i11111, c23010xM66775a14);
                    C0209i c0209i11112 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC28653p1M87165m117);
                    c0209i = C0217k.f732j;
                    long j1110 = jM125385c1;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i11113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11113, modifierM118962N117);
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                    InterfaceC2300f interfaceC2300f18 = interfaceC2300f4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC28653p1M87165m118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11113, modifierM118962N118);
                    int i411114 = i34 >> 3;
                    String strM21274h14 = AbstractC8693b.m21274h(statValue, c28655q, i411114 & 14);
                    if (z25) {
                        c28655q.m87150e0(2061907917);
                        c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                    } else {
                        c28655q.m87150e0(2061908239);
                        c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    }
                    c28655q.m87173q(false);
                    i35 = i411114 & 896;
                    int i411115 = 1879048192 & (i34 << 12);
                    AbstractC30795n.m94707h(strM21274h14, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i411115, 0, 196090);
                    if (z24) {
                        c28655q.m87150e0(-505141245);
                        AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-505015881);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    int i411116 = i34 >> 6;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i411116 & 14), null, j1110, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i411116 & 896) | i411115, 3120, 185850);
                    c28655q.m87173q(true);
                    modifier2 = modifier17;
                    z15 = z25;
                    j14 = j16;
                    interfaceC2300f3 = interfaceC2300f18;
                    i28 = i17;
                    j15 = j1110;
                    interfaceC22968j2 = interfaceC22968j18;
                    z16 = z24;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    z15 = z13;
                    j14 = jM125430y;
                    j15 = jM125385c1;
                    i28 = i17;
                    interfaceC2300f3 = interfaceC2300f2;
                    interfaceC22968j2 = interfaceC22968j;
                    z16 = z4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 805306368;
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i29 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                }
                c28655q.m87175r();
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                InterfaceC22968j interfaceC22968j19 = interfaceC22968j4;
                z24 = z18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier18 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z25 = z19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11114, c23010xM66775a15);
                C0209i c0209i11115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11115, interfaceC28653p1M87165m119);
                c0209i = C0217k.f732j;
                long j1111 = jM125385c1;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i11116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11116, modifierM118962N119);
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                InterfaceC2300f interfaceC2300f19 = interfaceC2300f4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11114, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q, c0209i11115, interfaceC28653p1M87165m1110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, modifierM118962N1110);
                int i411117 = i34 >> 3;
                String strM21274h15 = AbstractC8693b.m21274h(statValue, c28655q, i411117 & 14);
                if (z25) {
                    c28655q.m87150e0(2061907917);
                    c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                } else {
                    c28655q.m87150e0(2061908239);
                    c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                }
                c28655q.m87173q(false);
                i35 = i411117 & 896;
                int i411118 = 1879048192 & (i34 << 12);
                AbstractC30795n.m94707h(strM21274h15, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i411118, 0, 196090);
                if (z24) {
                    c28655q.m87150e0(-505141245);
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-505015881);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int i411119 = i34 >> 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i411119 & 14), null, j1111, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i411119 & 896) | i411118, 3120, 185850);
                c28655q.m87173q(true);
                modifier2 = modifier18;
                z15 = z25;
                j14 = j16;
                interfaceC2300f3 = interfaceC2300f19;
                i28 = i17;
                j15 = j1111;
                interfaceC22968j2 = interfaceC22968j19;
                z16 = z24;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                z15 = z13;
                j14 = jM125430y;
                j15 = jM125385c1;
                i28 = i17;
                interfaceC2300f3 = interfaceC2300f2;
                interfaceC22968j2 = interfaceC22968j;
                z16 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        i26 = i15 & 512;
        if (i26 != 0) {
            if ((i14 & 805306368) == 0) {
                if (c28655q.m87155h(z13)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i16 |= i27;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i29 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                } else {
                    if (i39 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i15 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i16 &= -7169;
                    }
                    if ((i15 & 16) != 0) {
                        jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        i16 &= -57345;
                    }
                    if ((i15 & 32) != 0) {
                        i16 &= -458753;
                        i17 = 5;
                    }
                    if (i44 != 0) {
                        interfaceC2300f4 = C2299e.f9110M;
                    } else {
                        interfaceC2300f4 = interfaceC2300f2;
                    }
                    if (i18 != 0) {
                        interfaceC22968j3 = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22968j3 = interfaceC22968j;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z4;
                    }
                    i34 = i16;
                    if (i26 != 0) {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = false;
                    } else {
                        j16 = jM125430y;
                        interfaceC22968j4 = interfaceC22968j3;
                        z18 = z17;
                        z19 = z13;
                    }
                }
                c28655q.m87175r();
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
                InterfaceC22968j interfaceC22968j110 = interfaceC22968j4;
                z24 = z18;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier19 = modifier3;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z25 = z19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11117 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11117, c23010xM66775a16);
                C0209i c0209i11118 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11118, interfaceC28653p1M87165m1111);
                c0209i = C0217k.f732j;
                long j1112 = jM125385c1;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i11119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N1111);
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                InterfaceC2300f interfaceC2300f110 = interfaceC2300f4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11117, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, c0209i11118, interfaceC28653p1M87165m1112);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N1112);
                int i4111110 = i34 >> 3;
                String strM21274h16 = AbstractC8693b.m21274h(statValue, c28655q, i4111110 & 14);
                if (z25) {
                    c28655q.m87150e0(2061907917);
                    c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
                } else {
                    c28655q.m87150e0(2061908239);
                    c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                }
                c28655q.m87173q(false);
                i35 = i4111110 & 896;
                int i4111111 = 1879048192 & (i34 << 12);
                AbstractC30795n.m94707h(strM21274h16, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i4111111, 0, 196090);
                if (z24) {
                    c28655q.m87150e0(-505141245);
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-505015881);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                int i4111112 = i34 >> 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i4111112 & 14), null, j1112, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i4111112 & 896) | i4111111, 3120, 185850);
                c28655q.m87173q(true);
                modifier2 = modifier19;
                z15 = z25;
                j14 = j16;
                interfaceC2300f3 = interfaceC2300f110;
                i28 = i17;
                j15 = j1112;
                interfaceC22968j2 = interfaceC22968j110;
                z16 = z24;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                z15 = z13;
                j14 = jM125430y;
                j15 = jM125385c1;
                i28 = i17;
                interfaceC2300f3 = interfaceC2300f2;
                interfaceC22968j2 = interfaceC22968j;
                z16 = z4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 805306368;
        if ((i16 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            i29 = i14 & 1;
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                if (i39 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if ((i15 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i16 &= -7169;
                }
                if ((i15 & 16) != 0) {
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                    i16 &= -57345;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    i17 = 5;
                }
                if (i44 != 0) {
                    interfaceC2300f4 = C2299e.f9110M;
                } else {
                    interfaceC2300f4 = interfaceC2300f2;
                }
                if (i18 != 0) {
                    interfaceC22968j3 = AbstractC22977m.f90654e;
                } else {
                    interfaceC22968j3 = interfaceC22968j;
                }
                if (i24 != 0) {
                    z17 = false;
                } else {
                    z17 = z4;
                }
                i34 = i16;
                if (i26 != 0) {
                    j16 = jM125430y;
                    interfaceC22968j4 = interfaceC22968j3;
                    z18 = z17;
                    z19 = false;
                } else {
                    j16 = jM125430y;
                    interfaceC22968j4 = interfaceC22968j3;
                    z18 = z17;
                    z19 = z13;
                }
            } else {
                if (i39 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if ((i15 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i16 &= -7169;
                }
                if ((i15 & 16) != 0) {
                    jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                    i16 &= -57345;
                }
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                    i17 = 5;
                }
                if (i44 != 0) {
                    interfaceC2300f4 = C2299e.f9110M;
                } else {
                    interfaceC2300f4 = interfaceC2300f2;
                }
                if (i18 != 0) {
                    interfaceC22968j3 = AbstractC22977m.f90654e;
                } else {
                    interfaceC22968j3 = interfaceC22968j;
                }
                if (i24 != 0) {
                    z17 = false;
                } else {
                    z17 = z4;
                }
                i34 = i16;
                if (i26 != 0) {
                    j16 = jM125430y;
                    interfaceC22968j4 = interfaceC22968j3;
                    z18 = z17;
                    z19 = false;
                } else {
                    j16 = jM125430y;
                    interfaceC22968j4 = interfaceC22968j3;
                    z18 = z17;
                    z19 = z13;
                }
            }
            c28655q.m87175r();
            C23010x c23010xM66775a17 = AbstractC23007w.m66775a(interfaceC22968j4, interfaceC2300f4, c28655q, ((((i34 >> 12) & 896) | ((i34 & 14) | ((i34 >> 18) & 112))) >> 3) & 126);
            InterfaceC22968j interfaceC22968j111 = interfaceC22968j4;
            z24 = z18;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
            Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier110 = modifier3;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            z25 = z19;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i111110 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i111110, c23010xM66775a17);
            C0209i c0209i111111 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1113);
            c0209i = C0217k.f732j;
            long j1113 = jM125385c1;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i111112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1113);
            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            InterfaceC2300f interfaceC2300f111 = interfaceC2300f4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
            Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i111110, c22994r1M66759a17);
            AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1114);
            int i4111113 = i34 >> 3;
            String strM21274h17 = AbstractC8693b.m21274h(statValue, c28655q, i4111113 & 14);
            if (z25) {
                c28655q.m87150e0(2061907917);
                c2886a = C38072d.f163053a.m121952e(c28655q, 6).getN7();
            } else {
                c28655q.m87150e0(2061908239);
                c2886a = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
            }
            c28655q.m87173q(false);
            i35 = i4111113 & 896;
            int i4111114 = 1879048192 & (i34 << 12);
            AbstractC30795n.m94707h(strM21274h17, null, j16, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, i35 | i4111114, 0, 196090);
            if (z24) {
                c28655q.m87150e0(-505141245);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62219B1), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN8(), null, c28655q, i35, 0, 196602);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-505015881);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            int i4111115 = i34 >> 6;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(statLabelText, c28655q, i4111115 & 14), null, j1113, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i4111115 & 896) | i4111114, 3120, 185850);
            c28655q.m87173q(true);
            modifier2 = modifier110;
            z15 = z25;
            j14 = j16;
            interfaceC2300f3 = interfaceC2300f111;
            i28 = i17;
            j15 = j1113;
            interfaceC22968j2 = interfaceC22968j111;
            z16 = z24;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            z15 = z13;
            j14 = jM125430y;
            j15 = jM125385c1;
            i28 = i17;
            interfaceC2300f3 = interfaceC2300f2;
            interfaceC22968j2 = interfaceC22968j;
            z16 = z4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40093d.m128536h(modifier2, statValue, statLabelText, j14, j15, i28, interfaceC2300f3, interfaceC22968j2, z16, z15, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128536h(Modifier modifier, TextResource textResource, TextResource textResource2, long j7, long j13, int i13, InterfaceC2300f interfaceC2300f, InterfaceC22968j interfaceC22968j, boolean z4, boolean z13, int i14, int i15, Composer composer, int i16) {
        m128535g(modifier, textResource, textResource2, j7, j13, i13, interfaceC2300f, interfaceC22968j, z4, z13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0358  */
    /* JADX WARN: Code duplicated, block: B:102:0x036d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0272  */
    /* JADX WARN: Code duplicated, block: B:87:0x0287  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0300  */
    /* JADX WARN: Code duplicated, block: B:97:0x0314  */
    /* JADX INFO: renamed from: i */
    public static final void m128537i(Modifier modifier, EnumC40100k recoveryType, TextResource recoveryPercentText, TextResource keyStatValue, TextResource textResource, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        Modifier modifier4;
        int iHashCode;
        boolean z4;
        char c3;
        C2886a c2886aM8405C;
        C38072d c38072d;
        boolean z13;
        C2886a c2886aM8439t;
        boolean z14;
        long jM95627c;
        long jM53358D;
        C2886a c2886aM8405C2;
        boolean z15;
        C2886a c2886aM8439t2;
        TextResource keyStatText = textResource;
        AbstractC22676k.m65750j(recoveryType, "recoveryType");
        AbstractC22676k.m65750j(recoveryPercentText, "recoveryPercentText");
        AbstractC22676k.m65750j(keyStatValue, "keyStatValue");
        AbstractC22676k.m65750j(keyStatText, "keyStatText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-84801006);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87149e(recoveryType.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(recoveryPercentText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(keyStatValue) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(keyStatText) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier5 = i16 != 0 ? c2314t : modifier2;
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            boolean z16 = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier5);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                modifier4 = modifier5;
            } else {
                modifier4 = modifier5;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(recoveryPercentText, c28655q2, (i15 >> 6) & 14);
                if (z16) {
                    c28655q2.m87150e0(-652764336);
                    c3 = 2;
                    c2886aM8405C = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q2, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                    z4 = false;
                } else {
                    z4 = false;
                    c3 = 2;
                    c28655q2.m87150e0(-652761330);
                    c2886aM8405C = C38072d.f163053a.m121952e(c28655q2, 6).getN6();
                }
                c28655q2.m87173q(z4);
                C2886a c2886a = c2886aM8405C;
                int i17 = (i15 >> 3) & 14;
                int i18 = i15;
                AbstractC30795n.m94707h(strM21274h, null, m128548t(recoveryType, c28655q2, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q2, 0, 0, 196602);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62219B1);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM92103Y, null, m128548t(recoveryType, c28655q2, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q2, 0, 0, 196602);
                c28655q2.m87173q(true);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62223C1);
                if (z16) {
                    c28655q2.m87150e0(1235353354);
                    c2886aM8439t = c38072d.m121952e(c28655q2, 6).getH5();
                    z13 = false;
                } else {
                    z13 = false;
                    c28655q2.m87150e0(1235354314);
                    c2886aM8439t = c38072d.m121952e(c28655q2, 6).getH6();
                }
                c28655q2.m87173q(z13);
                AbstractC30795n.m94707h(strM92103Y2, null, m128548t(recoveryType, c28655q2, i17), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q2, 0, 0, 196090);
                AbstractC18489d0.m53380u(2, 4, c2314t, c28655q2);
                if (z16) {
                    jM95627c = AbstractC25012a.m73366B(c28655q2, -358480221, c38072d, c28655q2, 6);
                    jM53358D = c38072d.m121949b(c28655q2, 6).getWhite70();
                    z14 = false;
                    c28655q2.m87173q(false);
                } else {
                    z14 = false;
                    jM95627c = AbstractC31061c.m95627c(c28655q2, -358356314, c38072d, c28655q2, 6);
                    jM53358D = AbstractC18489d0.m53358D(c38072d, c28655q2, 6, false);
                }
                long j7 = jM53358D;
                long j13 = jM95627c;
                String strM21274h2 = AbstractC8693b.m21274h(keyStatValue, c28655q2, (i18 >> 9) & 14);
                if (z16) {
                    c28655q2.m87150e0(1235373514);
                    c2886aM8405C2 = c38072d.m121952e(c28655q2, 6).getN7();
                } else {
                    c28655q2.m87150e0(1235374474);
                    c2886aM8405C2 = c38072d.m121952e(c28655q2, 6).getN6();
                }
                c28655q2.m87173q(z14);
                AbstractC30795n.m94707h(strM21274h2, null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C2, null, c28655q2, 0, 0, 196602);
                keyStatText = textResource;
                String strM21274h3 = AbstractC8693b.m21274h(keyStatText, c28655q2, (i18 >> 12) & 14);
                if (z16) {
                    c28655q2.m87150e0(1235379658);
                    c2886aM8439t2 = c38072d.m121952e(c28655q2, 6).getH5();
                    z15 = false;
                } else {
                    z15 = false;
                    c28655q2.m87150e0(1235380618);
                    c2886aM8439t2 = c38072d.m121952e(c28655q2, 6).getH6();
                }
                c28655q2.m87173q(z15);
                AbstractC30795n.m94707h(strM21274h3, null, j7, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8439t2, null, c28655q2, 0, 0, 196090);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            String strM21274h4 = AbstractC8693b.m21274h(recoveryPercentText, c28655q2, (i15 >> 6) & 14);
            if (z16) {
                c28655q2.m87150e0(-652764336);
                c3 = 2;
                c2886aM8405C = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q2, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
                z4 = false;
            } else {
                z4 = false;
                c3 = 2;
                c28655q2.m87150e0(-652761330);
                c2886aM8405C = C38072d.f163053a.m121952e(c28655q2, 6).getN6();
            }
            c28655q2.m87173q(z4);
            C2886a c2886a2 = c2886aM8405C;
            int i19 = (i15 >> 3) & 14;
            int i110 = i15;
            AbstractC30795n.m94707h(strM21274h4, null, m128548t(recoveryType, c28655q2, i19), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a2, null, c28655q2, 0, 0, 196602);
            String strM92103Y3 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62219B1);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM92103Y3, null, m128548t(recoveryType, c28655q2, i19), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q2, 0, 0, 196602);
            c28655q2.m87173q(true);
            String strM92103Y4 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62223C1);
            if (z16) {
                c28655q2.m87150e0(1235353354);
                c2886aM8439t = c38072d.m121952e(c28655q2, 6).getH5();
                z13 = false;
            } else {
                z13 = false;
                c28655q2.m87150e0(1235354314);
                c2886aM8439t = c38072d.m121952e(c28655q2, 6).getH6();
            }
            c28655q2.m87173q(z13);
            AbstractC30795n.m94707h(strM92103Y4, null, m128548t(recoveryType, c28655q2, i19), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q2, 0, 0, 196090);
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q2);
            if (z16) {
                jM95627c = AbstractC25012a.m73366B(c28655q2, -358480221, c38072d, c28655q2, 6);
                jM53358D = c38072d.m121949b(c28655q2, 6).getWhite70();
                z14 = false;
                c28655q2.m87173q(false);
            } else {
                z14 = false;
                jM95627c = AbstractC31061c.m95627c(c28655q2, -358356314, c38072d, c28655q2, 6);
                jM53358D = AbstractC18489d0.m53358D(c38072d, c28655q2, 6, false);
            }
            long j14 = jM53358D;
            long j15 = jM95627c;
            String strM21274h5 = AbstractC8693b.m21274h(keyStatValue, c28655q2, (i110 >> 9) & 14);
            if (z16) {
                c28655q2.m87150e0(1235373514);
                c2886aM8405C2 = c38072d.m121952e(c28655q2, 6).getN7();
            } else {
                c28655q2.m87150e0(1235374474);
                c2886aM8405C2 = c38072d.m121952e(c28655q2, 6).getN6();
            }
            c28655q2.m87173q(z14);
            AbstractC30795n.m94707h(strM21274h5, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C2, null, c28655q2, 0, 0, 196602);
            keyStatText = textResource;
            String strM21274h6 = AbstractC8693b.m21274h(keyStatText, c28655q2, (i110 >> 12) & 14);
            if (z16) {
                c28655q2.m87150e0(1235379658);
                c2886aM8439t2 = c38072d.m121952e(c28655q2, 6).getH5();
                z15 = false;
            } else {
                z15 = false;
                c28655q2.m87150e0(1235380618);
                c2886aM8439t2 = c38072d.m121952e(c28655q2, 6).getH6();
            }
            c28655q2.m87173q(z15);
            AbstractC30795n.m94707h(strM21274h6, null, j14, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8439t2, null, c28655q2, 0, 0, 196090);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g(modifier3, recoveryType, recoveryPercentText, keyStatValue, keyStatText, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128538j(Modifier modifier, EnumC40100k enumC40100k, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, int i14, Composer composer, int i15) {
        m128537i(modifier, enumC40100k, textResource, textResource2, textResource3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m128539k(EnumC40100k recoveryType, TextResource recoveryPercentText, TextResource strainScoreText, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(recoveryType, "recoveryType");
        AbstractC22676k.m65750j(recoveryPercentText, "recoveryPercentText");
        AbstractC22676k.m65750j(strainScoreText, "strainScoreText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1800449094);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87149e(recoveryType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(recoveryPercentText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(strainScoreText) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(recoveryPercentText, c28655q2, (i14 >> 3) & 14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = i14 & 14;
            AbstractC30795n.m94707h(strM21274h, null, m128548t(recoveryType, c28655q2, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62219B1), null, m128548t(recoveryType, c28655q2, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q2, 0, 0, 196602);
            c28655q2.m87173q(true);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62223C1), null, m128548t(recoveryType, c28655q2, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 0, 196602);
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q2);
            int i16 = (i14 >> 6) & 14;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(strainScoreText, c28655q2, i16), null, m128550v(strainScoreText, c28655q2, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62231E1), null, m128550v(strainScoreText, c28655q2, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(recoveryType, recoveryPercentText, strainScoreText, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128540l(EnumC40100k enumC40100k, TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m128539k(enumC40100k, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m128541m(TextResource sleepPercentText, TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        TextResource hrvText = textResource;
        AbstractC22676k.m65750j(sleepPercentText, "sleepPercentText");
        AbstractC22676k.m65750j(hrvText, "hrvText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1861704305);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(sleepPercentText) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(hrvText) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            int i16 = i15 & 14;
            String strM21274h = AbstractC8693b.m21274h(sleepPercentText, c28655q2, i16);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, m128549u(sleepPercentText, c28655q2, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62219B1), null, m128549u(sleepPercentText, c28655q2, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q2, 0, 0, 196602);
            c28655q2.m87173q(true);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62227D1), null, m128549u(sleepPercentText, c28655q2, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            if (textResource.equals(AbstractC8693b.m21267a())) {
                hrvText = textResource;
                c28655q.m87150e0(51081417);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(50774858);
                AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
                int i17 = (i15 >> 3) & 14;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i17), null, m128547s(textResource, c28655q, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                hrvText = textResource;
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62215A1), null, m128547s(hrvText, c28655q, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(sleepPercentText, hrvText, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128542n(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m128541m(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m128543o(Modifier modifier, TextResource strainScoreText, TextResource keyStatValue, TextResource keyStatText, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C2886a c2886aM8405C;
        boolean z4;
        C2886a c2886aM8439t;
        long jM125382b1;
        long jM53358D;
        boolean z13;
        C2886a c2886aM8405C2;
        boolean z14;
        C2886a c2886aM8439t2;
        AbstractC22676k.m65750j(strainScoreText, "strainScoreText");
        AbstractC22676k.m65750j(keyStatValue, "keyStatValue");
        AbstractC22676k.m65750j(keyStatText, "keyStatText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(33831721);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(strainScoreText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(keyStatValue) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(keyStatText) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            boolean z15 = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i17 = (i15 >> 3) & 14;
            String strM21274h = AbstractC8693b.m21274h(strainScoreText, c28655q2, i17);
            if (z15) {
                c28655q2.m87150e0(1392089239);
                c2886aM8405C = new C2886a(C23285v0.m67364b(C38072d.f163053a.m121952e(c28655q2, 6).getN6().getStyle(), 0L, AbstractC35745c.m113246h(19), null, null, 0L, 0, 0L, null, null, 16777213), null, 2, null);
            } else {
                c28655q2.m87150e0(1392092245);
                c2886aM8405C = C38072d.f163053a.m121952e(c28655q2, 6).getN6();
            }
            c28655q2.m87173q(false);
            C2886a c2886a = c2886aM8405C;
            int i18 = i15;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, null, m128550v(strainScoreText, c28655q2, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q2, 0, 0, 196602);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62231E1);
            if (z15) {
                c28655q2.m87150e0(1392098965);
                c2886aM8439t = C38072d.f163053a.m121952e(c28655q2, 6).getH5();
                z4 = false;
            } else {
                z4 = false;
                c28655q2.m87150e0(1392099925);
                c2886aM8439t = C38072d.f163053a.m121952e(c28655q2, 6).getH6();
            }
            c28655q2.m87173q(z4);
            AbstractC30795n.m94707h(strM92103Y, null, m128550v(strainScoreText, c28655q2, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q2, 0, 0, 196602);
            if (z15) {
                c28655q2.m87150e0(205583096);
                C38072d c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                long jM125385c1 = c38072d.m121949b(c28655q2, 6).getWhite70();
                c28655q2.m87173q(false);
                jM53358D = jM125385c1;
                jM125382b1 = jM125430y;
            } else {
                c28655q2.m87150e0(205707003);
                C38072d c38072d2 = C38072d.f163053a;
                jM125382b1 = c38072d2.m121949b(c28655q2, 6).getWhite50();
                jM53358D = AbstractC18489d0.m53358D(c38072d2, c28655q2, 6, false);
            }
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q2);
            String strM21274h2 = AbstractC8693b.m21274h(keyStatValue, c28655q2, (i18 >> 6) & 14);
            if (z15) {
                c28655q2.m87150e0(1392118069);
                c2886aM8405C2 = C38072d.f163053a.m121952e(c28655q2, 6).getN7();
                z13 = false;
            } else {
                z13 = false;
                c28655q2.m87150e0(1392119029);
                c2886aM8405C2 = C38072d.f163053a.m121952e(c28655q2, 6).getN6();
            }
            c28655q2.m87173q(z13);
            AbstractC30795n.m94707h(strM21274h2, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C2, null, c28655q2, 0, 0, 196602);
            String strM21274h3 = AbstractC8693b.m21274h(keyStatText, c28655q2, (i18 >> 9) & 14);
            if (z15) {
                c28655q2.m87150e0(1392124213);
                c2886aM8439t2 = C38072d.f163053a.m121952e(c28655q2, 6).getH5();
                z14 = false;
            } else {
                z14 = false;
                c28655q2.m87150e0(1392125173);
                c2886aM8439t2 = C38072d.f163053a.m121952e(c28655q2, 6).getH6();
            }
            c28655q2.m87173q(z14);
            AbstractC30795n.m94707h(strM21274h3, null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t2, null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, strainScoreText, keyStatValue, keyStatText, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128544p(Modifier modifier, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, int i14, Composer composer, int i15) {
        m128543o(modifier, textResource, textResource2, textResource3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m128545q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1181337833);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(80, AbstractC1102d.m3424u(1, C2314t.f9131w)), C38072d.f163053a.m121949b(c28655q, 6).getWhite20(), AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m128546r(int i13, Composer composer, int i14) {
        m128545q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final long m128547s(TextResource textResource, Composer composer, int i13) {
        if (AbstractC22676k.m65745e(textResource, AbstractC8693b.m21278l("--"))) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1845403452);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1845440218);
        long jM125393f0 = C38072d.f163053a.m121949b(c28655q2, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        c28655q2.m87173q(false);
        return jM125393f0;
    }

    /* JADX INFO: renamed from: t */
    public static final long m128548t(EnumC40100k type, Composer composer, int i13) {
        AbstractC22676k.m65750j(type, "type");
        int i14 = a.f173024a[type.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-673904983);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-673902711);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, 6, false);
        }
        if (i14 == 3) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-673900683);
            long jM125381b0 = C38072d.f163053a.m121949b(c28655q3, 6).getRecoveryLowRecovery();
            c28655q3.m87173q(false);
            return jM125381b0;
        }
        if (i14 == 4) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(-673898184);
            long jM125384c0 = C38072d.f163053a.m121949b(c28655q4, 6).getRecoveryMediumRecovery();
            c28655q4.m87173q(false);
            return jM125384c0;
        }
        if (i14 != 5) {
            throw AbstractC11895b.m32003v(-673906847, (C28655q) composer, false);
        }
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87150e0(-673895658);
        long jM125375Z = C38072d.f163053a.m121949b(c28655q5, 6).getRecoveryHighRecovery();
        c28655q5.m87173q(false);
        return jM125375Z;
    }

    /* JADX INFO: renamed from: u */
    private static final long m128549u(TextResource textResource, Composer composer, int i13) {
        if (AbstractC22676k.m65745e(textResource, AbstractC8693b.m21278l("--"))) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1430166049);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1430129283);
        long jM125393f0 = C38072d.f163053a.m121949b(c28655q2, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        c28655q2.m87173q(false);
        return jM125393f0;
    }

    /* JADX INFO: renamed from: v */
    public static final long m128550v(TextResource strainScoreText, Composer composer, int i13) {
        AbstractC22676k.m65750j(strainScoreText, "strainScoreText");
        if (strainScoreText.equals(AbstractC8693b.m21278l("--"))) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(476213096);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(476175369);
        long jM125403k0 = C38072d.f163053a.m121949b(c28655q2, 6).getStrain();
        c28655q2.m87173q(false);
        return jM125403k0;
    }
}
