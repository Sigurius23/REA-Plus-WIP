package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d71.C11757c;
import gb1.AbstractC15679g;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.InterfaceC22973k1;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.z1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a¥\u0001\u0010\u001f\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\tH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010$\u001a\u00020\u0019H\u0001¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lhy0/c2;", "viewState", "Ll83/a0;", "c", "(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "text", "", "includeBackground", "Lhy0/b2;", "trendTypeState", "isPressed", "Lgz0/m0;", "icon", "Ly3/f;", "radius", "Lhy0/s0;", "removeSideRadius", "withIcon", "iconSize", "Ll0/k1;", "backgroundPaddingValues", "showBorder", "Lv63/c;", "overflow", "", "maxLines", "Lb91/a;", "textStyle", "", "maxFontScaling", "e", "(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V", "Lhy0/a2;", "g", "(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;", "iconResource", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17808z1 {

    /* JADX INFO: renamed from: hy0.z1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69260a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f69261b;

        static {
            int[] iArr = new int[EnumC17786s0.values().length];
            try {
                iArr[EnumC17786s0.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17786s0.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17786s0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69260a = iArr;
            int[] iArr2 = new int[EnumC17727b2.values().length];
            try {
                iArr2[EnumC17727b2.ALERT_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC17727b2.COMPLETED_BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC17727b2.CONCERN_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC17727b2.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC17727b2.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC17727b2.NEGATIVE_GREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC17727b2.NEGATIVE_WITH_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC17727b2.NEGATIVE_YELLOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC17727b2.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC17727b2.NEUTRAL_CONCERN.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC17727b2.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC17727b2.NO_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC17727b2.NO_ICON_BLUE.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC17727b2.NO_ICON_GREEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC17727b2.NO_ICON_NEUTRAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC17727b2.NO_ICON_YELLOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC17727b2.DASHED_NEUTRAL.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE_BLUE.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE_GREEN.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE_RANGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE_WITH_COLOR.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EnumC17727b2.POSITIVE_YELLOW.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EnumC17727b2.SUFFICIENT_BLUE.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EnumC17727b2.SUFFICIENT_BLUE_DOT.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            f69261b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m51175c(C17731c2 viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1877238279);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            m51177e(viewState.getText(), viewState.getIncludeBackground(), viewState.getTrendTypeState(), viewState.getIsPressed(), viewState.getIcon(), viewState.getRadius(), viewState.getRemoveSideRadius(), viewState.getWithIcon(), viewState.getIconSize(), viewState.getBackgroundPaddingValues(), viewState.getShowBorder(), viewState.getOverflow(), viewState.getMaxLines(), null, viewState.getMaxFontScaling(), c28655q, 0, 0, DfuBaseService.ERROR_REMOTE_MASK);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(viewState, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m51176d(C17731c2 c17731c2, int i13, Composer composer, int i14) {
        m51175c(c17731c2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x0235  */
    /* JADX WARN: Code duplicated, block: B:180:0x0239  */
    /* JADX WARN: Code duplicated, block: B:181:0x023c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0240  */
    /* JADX WARN: Code duplicated, block: B:185:0x0247  */
    /* JADX WARN: Code duplicated, block: B:186:0x024a  */
    /* JADX WARN: Code duplicated, block: B:188:0x024e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0250  */
    /* JADX WARN: Code duplicated, block: B:191:0x0254  */
    /* JADX WARN: Code duplicated, block: B:192:0x025b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0261  */
    /* JADX WARN: Code duplicated, block: B:196:0x0274  */
    /* JADX WARN: Code duplicated, block: B:198:0x027a  */
    /* JADX WARN: Code duplicated, block: B:199:0x027c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0280  */
    /* JADX WARN: Code duplicated, block: B:202:0x0282  */
    /* JADX WARN: Code duplicated, block: B:204:0x0286  */
    /* JADX WARN: Code duplicated, block: B:205:0x028a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0290  */
    /* JADX WARN: Code duplicated, block: B:209:0x029d  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:219:0x02df  */
    /* JADX WARN: Code duplicated, block: B:221:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:222:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:229:0x0309 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x030b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0316  */
    /* JADX WARN: Code duplicated, block: B:233:0x031b  */
    /* JADX WARN: Code duplicated, block: B:236:0x032a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0346  */
    /* JADX WARN: Code duplicated, block: B:240:0x034d  */
    /* JADX WARN: Code duplicated, block: B:247:0x038c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0390  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:258:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:260:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:261:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:263:0x0416  */
    /* JADX WARN: Code duplicated, block: B:265:0x0424  */
    /* JADX WARN: Code duplicated, block: B:266:0x042e  */
    /* JADX WARN: Code duplicated, block: B:268:0x044d  */
    /* JADX WARN: Code duplicated, block: B:269:0x045a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0482  */
    /* JADX WARN: Code duplicated, block: B:277:0x048a A[PHI: r12
      0x048a: PHI (r12v34 boolean) = (r12v31 boolean), (r12v35 boolean) binds: [B:284:0x049b, B:276:0x0489] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:278:0x048c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x048e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0495  */
    /* JADX WARN: Code duplicated, block: B:283:0x0499  */
    /* JADX WARN: Code duplicated, block: B:285:0x049d  */
    /* JADX WARN: Code duplicated, block: B:288:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:290:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:292:0x04db  */
    /* JADX WARN: Code duplicated, block: B:293:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:295:0x0545  */
    /* JADX WARN: Code duplicated, block: B:297:0x056c  */
    /* JADX WARN: Code duplicated, block: B:300:0x058d  */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX INFO: renamed from: e */
    public static final void m51177e(final TextResource textResource, final boolean z4, final EnumC17727b2 trendTypeState, boolean z13, EnumC16313m0 enumC16313m0, float f13, EnumC17786s0 enumC17786s0, boolean z14, float f14, InterfaceC22973k1 interfaceC22973k1, boolean z15, int i13, int i14, C2886a c2886a, Float f15, Composer composer, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        int i26;
        float f16;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        boolean z16;
        final boolean z17;
        final EnumC16313m0 enumC16313m1;
        final boolean z18;
        final float f17;
        final InterfaceC22973k1 interfaceC22973k2;
        final boolean z19;
        final int i64;
        final int i65;
        final Float f18;
        C28655q c28655q;
        final float f19;
        final EnumC17786s0 enumC17786s1;
        final C2886a c2886a2;
        C28677v1 c28677v1M87180u;
        boolean z24;
        EnumC16313m0 enumC16313m2;
        EnumC17786s0 enumC17786s2;
        boolean z25;
        float f24;
        InterfaceC22973k1 c22976l1;
        boolean z26;
        int i66;
        int i67;
        C2886a n13;
        boolean z27;
        Float f25;
        int i68;
        InterfaceC22973k1 interfaceC22973k3;
        EnumC16313m0 enumC16313m3;
        float f26;
        C17723a2 c17723a2M51179g;
        int i69;
        C33252i c33252iM105491g;
        C33252i c33252iM105489e;
        C2306l c2306l;
        boolean z28;
        C2314t c2314t;
        long backgroundColor;
        C33252i c33252i;
        C2314t c2314t2;
        C2306l c2306l2;
        Modifier modifierM44455h;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        boolean z29;
        C28655q c28655q3;
        boolean z34;
        boolean z35;
        long textColor;
        Integer iconResource;
        long iconColor;
        boolean z36;
        boolean z37;
        long iconColor2;
        boolean zM87157i;
        AbstractC22676k.m65750j(trendTypeState, "trendTypeState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(971948180);
        if ((i15 & 6) == 0) {
            i18 = (c28655q4.m87153g(textResource) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q4.m87155h(z4) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q4.m87149e(trendTypeState.ordinal()) ? 256 : 128;
        }
        int i74 = i17 & 8;
        int i75 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i74 == 0) {
            if ((i15 & 3072) == 0) {
                i18 |= c28655q4.m87155h(z13) ? 2048 : 1024;
            }
            i19 = i17 & 16;
            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            if (i19 != 0) {
                i18 |= 24576;
            } else if ((i15 & 24576) == 0) {
                if (enumC16313m0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16313m0.ordinal();
                }
                if (c28655q4.m87149e(iOrdinal)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i18 |= i25;
            }
            i26 = i17 & 32;
            if (i26 != 0) {
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f16 = f13;
            } else {
                f16 = f13;
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87147d(f16)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i27;
                }
            }
            i28 = i17 & 64;
            if (i28 != 0) {
                i18 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (c28655q4.m87149e(enumC17786s0 != null ? enumC17786s0.ordinal() : -1)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i18 |= i29;
            }
            i34 = i17 & 128;
            if (i34 != 0) {
                i18 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (c28655q4.m87155h(z14)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i18 |= i35;
            }
            i36 = i17 & 256;
            if (i36 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q4.m87147d(f14)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i37;
            }
            i38 = i17 & 512;
            if (i38 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q4.m87153g(interfaceC22973k1)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i18 |= i39;
                }
                i44 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i44 != 0) {
                    i45 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (c28655q4.m87155h(z15)) {
                        i46 = 4;
                    } else {
                        i46 = 2;
                    }
                    i45 = i16 | i46;
                } else {
                    i45 = i16;
                }
                i47 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i47 != 0) {
                    i45 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (c28655q4.m87149e(i13)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i45 |= i48;
                }
                i49 = i45;
                i54 = i17 & 4096;
                if (i54 != 0) {
                    i55 = i49;
                    if ((i16 & 384) == 0) {
                        if (c28655q4.m87149e(i14)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) == 0) {
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                            if ((i16 & 4096) == 0) {
                                zM87157i = c28655q4.m87153g(c2886a);
                            } else {
                                zM87157i = c28655q4.m87157i(c2886a);
                            }
                            if (zM87157i) {
                                i75 = 2048;
                            }
                        }
                        i55 |= i75;
                    }
                    i57 = i55;
                    i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i58 != 0) {
                        i59 = i58;
                        if ((i16 & 24576) == 0) {
                            if (!c28655q4.m87153g(f15)) {
                                i24 = 8192;
                            }
                            i57 |= i24;
                        }
                        if ((i18 & 306783379) == 306783378 || (i57 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q4.m87135U(i18 & 1, z16)) {
                            c28655q4.m87140Z();
                            if ((i15 & 1) != 0 || c28655q4.m87118C()) {
                                if (i74 != 0) {
                                    z24 = false;
                                } else {
                                    z24 = z13;
                                }
                                if (i19 != 0) {
                                    enumC16313m2 = null;
                                } else {
                                    enumC16313m2 = enumC16313m0;
                                }
                                if (i26 != 0) {
                                    f16 = 4 * 1;
                                }
                                if (i28 != 0) {
                                    enumC17786s2 = EnumC17786s0.NONE;
                                } else {
                                    enumC17786s2 = enumC17786s0;
                                }
                                if (i34 != 0) {
                                    z25 = true;
                                } else {
                                    z25 = z14;
                                }
                                if (i36 != 0) {
                                    f24 = 2 * 4;
                                } else {
                                    f24 = f14;
                                }
                                float f27 = f24;
                                if (i38 != 0) {
                                    float f28 = 8;
                                    float f29 = ((float) 0.5d) * f28;
                                    float f34 = ((float) 0.25d) * f28;
                                    c22976l1 = new C22976l1(f29, f34, f29, f34);
                                } else {
                                    c22976l1 = interfaceC22973k1;
                                }
                                if (i44 != 0) {
                                    z26 = false;
                                } else {
                                    z26 = z15;
                                }
                                if (i47 != 0) {
                                    i66 = 1;
                                } else {
                                    i66 = i13;
                                }
                                if (i54 != 0) {
                                    i67 = Integer.MAX_VALUE;
                                } else {
                                    i67 = i14;
                                }
                                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                    i57 &= -7169;
                                } else {
                                    n13 = c2886a;
                                }
                                z27 = z25;
                                if (i59 != 0) {
                                    f25 = null;
                                } else {
                                    f25 = f15;
                                }
                                i68 = i57;
                                interfaceC22973k3 = c22976l1;
                                enumC16313m3 = enumC16313m2;
                                f26 = f27;
                            } else {
                                c28655q4.m87138X();
                                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                    i57 &= -7169;
                                }
                                z24 = z13;
                                enumC17786s2 = enumC17786s0;
                                z27 = z14;
                                f26 = f14;
                                interfaceC22973k3 = interfaceC22973k1;
                                z26 = z15;
                                i66 = i13;
                                i67 = i14;
                                n13 = c2886a;
                                f25 = f15;
                                i68 = i57;
                                f16 = f16;
                                enumC16313m3 = enumC16313m0;
                            }
                            c28655q4.m87175r();
                            c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                            i69 = a.f69260a[enumC17786s2.ordinal()];
                            if (i69 != 1) {
                                if (i69 != 2) {
                                    c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                                } else {
                                    if (i69 == 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c33252iM105489e = AbstractC33253j.m105489e(f16);
                                }
                                C22961h c22961h = AbstractC22977m.f90654e;
                                c2306l = C2299e.f9108K;
                                z28 = z24;
                                c2314t = C2314t.f9131w;
                                Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                                if (z4) {
                                    backgroundColor = C17919x.f69636m;
                                } else if (z28) {
                                    backgroundColor = c17723a2M51179g.getPressedColor();
                                } else {
                                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                                }
                                c33252i = c33252iM105489e;
                                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, backgroundColor, AbstractC17918w0.f69621a);
                                if (c17723a2M51179g.getShowDashedBorder()) {
                                    c2306l2 = c2306l;
                                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                    c2314t2 = c2314t;
                                } else {
                                    c2314t2 = c2314t;
                                    c2306l2 = c2306l;
                                    if (!z26 || c17723a2M51179g.getShowBorder()) {
                                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                    } else {
                                        modifierM44455h = c2314t2;
                                    }
                                    Modifier modifierM3393o = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c.mo3471e(modifierM44455h));
                                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l2, c28655q4, 54);
                                    iHashCode = Long.hashCode(c28655q4.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3393o);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q4.m87158i0();
                                    if (c28655q4.f115903S) {
                                        c28655q4.m87163l(c0213j);
                                    } else {
                                        c28655q4.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a);
                                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                                    c0209i = C0217k.f732j;
                                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                                    if (z27) {
                                        c28655q4.m87150e0(755321030);
                                        if (enumC16313m3 != null) {
                                            C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                            String strM51180h = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                            Modifier modifierMo3471e = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q4.m87150e0(1686948354);
                                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                            } else {
                                                c28655q4.m87150e0(1686949185);
                                                c28655q4.m87173q(false);
                                                iconColor2 = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM53378s, strM51180h, modifierMo3471e, iconColor2, c28655q4, 0, 0);
                                            c28655q2 = c28655q4;
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2 = c28655q4;
                                            c28655q2.m87150e0(755923019);
                                            iconResource = c17723a2M51179g.getIconResource();
                                            if (iconResource == null) {
                                                c28655q2.m87150e0(755923018);
                                                c28655q2.m87173q(false);
                                            } else {
                                                c28655q2.m87150e0(755923019);
                                                int iIntValue = iconResource.intValue();
                                                C27430e c27430eM107874S = AbstractC34132o.m107874S(iIntValue, c28655q2, 6);
                                                String strM51180h2 = m51180h(iIntValue, c28655q2, 0);
                                                Modifier modifierMo3471e2 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                                if (z28) {
                                                    c28655q2.m87150e0(2129901195);
                                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                                } else {
                                                    c28655q2.m87150e0(2129902026);
                                                    c28655q2.m87173q(false);
                                                    iconColor = c17723a2M51179g.getIconColor();
                                                }
                                                AbstractC15005f3.m43108b(c27430eM107874S, strM51180h2, modifierMo3471e2, iconColor, c28655q2, 0, 0);
                                                c28655q2.m87173q(false);
                                            }
                                            c28655q2.m87173q(false);
                                        }
                                        if (enumC16313m3 == null || c17723a2M51179g.getIconResource() != null) {
                                            if (textResource != null) {
                                                z29 = true;
                                                z36 = AbstractC8693b.m21270d(textResource);
                                                if (z36) {
                                                    c28655q2.m87150e0(756591162);
                                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                    z37 = false;
                                                    c28655q2.m87173q(false);
                                                }
                                                c28655q2.m87173q(z37);
                                            } else {
                                                z29 = true;
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            }
                                            c28655q2.m87173q(z37);
                                        } else {
                                            z29 = true;
                                        }
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                        c28655q2.m87173q(z37);
                                    } else {
                                        c28655q2 = c28655q4;
                                        z29 = true;
                                        c28655q2.m87150e0(756739466);
                                        c28655q2.m87173q(false);
                                    }
                                    if (textResource != null) {
                                        c28655q2.m87150e0(756791236);
                                        String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                        if (z28) {
                                            c28655q2.m87150e0(1686984191);
                                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                            z35 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z35 = false;
                                            c28655q2.m87150e0(1686984929);
                                            c28655q2.m87173q(false);
                                            textColor = c17723a2M51179g.getTextColor();
                                        }
                                        int i76 = i68 << 9;
                                        f19 = f16;
                                        C28655q c28655q5 = c28655q2;
                                        z34 = z29;
                                        AbstractC30795n.m94707h(strM21274h, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q5, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i76) | (i76 & 29360128), 55290);
                                        c28655q3 = c28655q5;
                                        c28655q3.m87173q(z35);
                                    } else {
                                        c28655q3 = c28655q2;
                                        f19 = f16;
                                        z34 = z29;
                                        c28655q3.m87150e0(757114442);
                                        c28655q3.m87173q(false);
                                    }
                                    c28655q3.m87173q(z34);
                                    z17 = z28;
                                    interfaceC22973k2 = interfaceC22973k3;
                                    enumC16313m1 = enumC16313m3;
                                    f17 = f26;
                                    c28655q = c28655q3;
                                    i64 = i66;
                                    i65 = i67;
                                    c2886a2 = n13;
                                    f18 = f25;
                                    enumC17786s1 = enumC17786s2;
                                    z18 = z27;
                                    z19 = z26;
                                }
                                Modifier modifierM3393o2 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3393o2);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a2);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s2 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h3 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e3 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s2, strM51180h3, modifierMo3471e3, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue2 = iconResource.intValue();
                                            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(iIntValue2, c28655q2, 6);
                                            String strM51180h4 = m51180h(iIntValue2, c28655q2, 0);
                                            Modifier modifierMo3471e4 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S2, strM51180h4, modifierMo3471e4, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i77 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q6 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h2, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q6, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i77) | (i77 & 29360128), 55290);
                                    c28655q3 = c28655q6;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            } else {
                                c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                            }
                            c33252iM105489e = c33252iM105491g;
                            C22961h c22961h2 = AbstractC22977m.f90654e;
                            c2306l = C2299e.f9108K;
                            z28 = z24;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM118994r2 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                            if (z4) {
                                backgroundColor = C17919x.f69636m;
                            } else if (z28) {
                                backgroundColor = c17723a2M51179g.getPressedColor();
                            } else {
                                backgroundColor = c17723a2M51179g.getBackgroundColor();
                            }
                            c33252i = c33252iM105489e;
                            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, backgroundColor, AbstractC17918w0.f69621a);
                            if (c17723a2M51179g.getShowDashedBorder()) {
                                c2306l2 = c2306l;
                                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                c2314t2 = c2314t;
                            } else {
                                c2314t2 = c2314t;
                                c2306l2 = c2306l;
                                if (z26) {
                                }
                                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                Modifier modifierM3393o3 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c2.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3393o3);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a3);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s3 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h5 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e5 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s3, strM51180h5, modifierMo3471e5, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue3 = iconResource.intValue();
                                            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(iIntValue3, c28655q2, 6);
                                            String strM51180h6 = m51180h(iIntValue3, c28655q2, 0);
                                            Modifier modifierMo3471e6 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S3, strM51180h6, modifierMo3471e6, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i78 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q7 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h3, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q7, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i78) | (i78 & 29360128), 55290);
                                    c28655q3 = c28655q7;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            }
                            Modifier modifierM3393o4 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c2.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3393o4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s4 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h7 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e7 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s4, strM51180h7, modifierMo3471e7, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue4 = iconResource.intValue();
                                        C27430e c27430eM107874S4 = AbstractC34132o.m107874S(iIntValue4, c28655q2, 6);
                                        String strM51180h8 = m51180h(iIntValue4, c28655q2, 0);
                                        Modifier modifierMo3471e8 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S4, strM51180h8, modifierMo3471e8, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h4 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i79 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q8 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h4, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q8, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i79) | (i79 & 29360128), 55290);
                                c28655q3 = c28655q8;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        } else {
                            c28655q4.m87138X();
                            z17 = z13;
                            enumC16313m1 = enumC16313m0;
                            z18 = z14;
                            f17 = f14;
                            interfaceC22973k2 = interfaceC22973k1;
                            z19 = z15;
                            i64 = i13;
                            i65 = i14;
                            f18 = f15;
                            c28655q = c28655q4;
                            f19 = f16;
                            enumC17786s1 = enumC17786s0;
                            c2886a2 = c2886a;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue5 = ((Integer) obj2).intValue();
                                    return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue5);
                                }
                            };
                        }
                    }
                    i57 |= 24576;
                    i59 = i58;
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q4.m87135U(i18 & 1, z16)) {
                        c28655q4.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f210 = f24;
                            if (i38 != 0) {
                                float f211 = 8;
                                float f212 = ((float) 0.5d) * f211;
                                float f35 = ((float) 0.25d) * f211;
                                c22976l1 = new C22976l1(f212, f35, f212, f35);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f210;
                        } else {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f213 = f24;
                            if (i38 != 0) {
                                float f214 = 8;
                                float f215 = ((float) 0.5d) * f214;
                                float f36 = ((float) 0.25d) * f214;
                                c22976l1 = new C22976l1(f215, f36, f215, f36);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f213;
                        }
                        c28655q4.m87175r();
                        c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                        i69 = a.f69260a[enumC17786s2.ordinal()];
                        if (i69 != 1) {
                            if (i69 != 2) {
                                c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                            } else {
                                if (i69 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c33252iM105489e = AbstractC33253j.m105489e(f16);
                            }
                            C22961h c22961h3 = AbstractC22977m.f90654e;
                            c2306l = C2299e.f9108K;
                            z28 = z24;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM118994r3 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                            if (z4) {
                                backgroundColor = C17919x.f69636m;
                            } else if (z28) {
                                backgroundColor = c17723a2M51179g.getPressedColor();
                            } else {
                                backgroundColor = c17723a2M51179g.getBackgroundColor();
                            }
                            c33252i = c33252iM105489e;
                            Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM118994r3, backgroundColor, AbstractC17918w0.f69621a);
                            if (c17723a2M51179g.getShowDashedBorder()) {
                                c2306l2 = c2306l;
                                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                c2314t2 = c2314t;
                            } else {
                                c2314t2 = c2314t;
                                c2306l2 = c2306l;
                                if (z26) {
                                }
                                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                Modifier modifierM3393o5 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c3.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22961h3, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3393o5);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a5);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m5);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N5);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s5 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h9 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e9 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s5, strM51180h9, modifierMo3471e9, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue5 = iconResource.intValue();
                                            C27430e c27430eM107874S5 = AbstractC34132o.m107874S(iIntValue5, c28655q2, 6);
                                            String strM51180h10 = m51180h(iIntValue5, c28655q2, 0);
                                            Modifier modifierMo3471e10 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S5, strM51180h10, modifierMo3471e10, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h5 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i710 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q9 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h5, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q9, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i710) | (i710 & 29360128), 55290);
                                    c28655q3 = c28655q9;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            }
                            Modifier modifierM3393o6 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c3.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22961h3, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3393o6);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a6);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m6);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N6);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s6 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h11 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e11 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s6, strM51180h11, modifierMo3471e11, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue6 = iconResource.intValue();
                                        C27430e c27430eM107874S6 = AbstractC34132o.m107874S(iIntValue6, c28655q2, 6);
                                        String strM51180h12 = m51180h(iIntValue6, c28655q2, 0);
                                        Modifier modifierMo3471e12 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S6, strM51180h12, modifierMo3471e12, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h6 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i711 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q10 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h6, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q10, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711) | (i711 & 29360128), 55290);
                                c28655q3 = c28655q10;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        } else {
                            c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                        }
                        c33252iM105489e = c33252iM105491g;
                        C22961h c22961h4 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r4 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM118994r4, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o7 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c4.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22961h4, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3393o7);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a7);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s7 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h13 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e13 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s7, strM51180h13, modifierMo3471e13, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue7 = iconResource.intValue();
                                        C27430e c27430eM107874S7 = AbstractC34132o.m107874S(iIntValue7, c28655q2, 6);
                                        String strM51180h14 = m51180h(iIntValue7, c28655q2, 0);
                                        Modifier modifierMo3471e14 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S7, strM51180h14, modifierMo3471e14, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h7 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i712 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q11 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h7, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i712) | (i712 & 29360128), 55290);
                                c28655q3 = c28655q11;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o8 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c4.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22961h4, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3393o8);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N8);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s8 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h15 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e15 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s8, strM51180h15, modifierMo3471e15, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue8 = iconResource.intValue();
                                    C27430e c27430eM107874S8 = AbstractC34132o.m107874S(iIntValue8, c28655q2, 6);
                                    String strM51180h16 = m51180h(iIntValue8, c28655q2, 0);
                                    Modifier modifierMo3471e16 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S8, strM51180h16, modifierMo3471e16, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h8 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i713 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q12 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h8, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q12, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i713) | (i713 & 29360128), 55290);
                            c28655q3 = c28655q12;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c28655q4.m87138X();
                        z17 = z13;
                        enumC16313m1 = enumC16313m0;
                        z18 = z14;
                        f17 = f14;
                        interfaceC22973k2 = interfaceC22973k1;
                        z19 = z15;
                        i64 = i13;
                        i65 = i14;
                        f18 = f15;
                        c28655q = c28655q4;
                        f19 = f16;
                        enumC17786s1 = enumC17786s0;
                        c2886a2 = c2886a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue9 = ((Integer) obj2).intValue();
                                return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue9);
                            }
                        };
                    }
                }
                i55 = i49 | 384;
                if ((i16 & 3072) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i16 & 4096) == 0) {
                            zM87157i = c28655q4.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q4.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i75 = 2048;
                        }
                    }
                    i55 |= i75;
                }
                i57 = i55;
                i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i58 != 0) {
                    i59 = i58;
                    if ((i16 & 24576) == 0) {
                        if (!c28655q4.m87153g(f15)) {
                            i24 = 8192;
                        }
                        i57 |= i24;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q4.m87135U(i18 & 1, z16)) {
                        c28655q4.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f216 = f24;
                            if (i38 != 0) {
                                float f217 = 8;
                                float f218 = ((float) 0.5d) * f217;
                                float f37 = ((float) 0.25d) * f217;
                                c22976l1 = new C22976l1(f218, f37, f218, f37);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f216;
                        } else {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f219 = f24;
                            if (i38 != 0) {
                                float f2110 = 8;
                                float f2111 = ((float) 0.5d) * f2110;
                                float f38 = ((float) 0.25d) * f2110;
                                c22976l1 = new C22976l1(f2111, f38, f2111, f38);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f219;
                        }
                        c28655q4.m87175r();
                        c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                        i69 = a.f69260a[enumC17786s2.ordinal()];
                        if (i69 != 1) {
                            if (i69 != 2) {
                                c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                            } else {
                                if (i69 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c33252iM105489e = AbstractC33253j.m105489e(f16);
                            }
                            C22961h c22961h5 = AbstractC22977m.f90654e;
                            c2306l = C2299e.f9108K;
                            z28 = z24;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM118994r5 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                            if (z4) {
                                backgroundColor = C17919x.f69636m;
                            } else if (z28) {
                                backgroundColor = c17723a2M51179g.getPressedColor();
                            } else {
                                backgroundColor = c17723a2M51179g.getBackgroundColor();
                            }
                            c33252i = c33252iM105489e;
                            Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM118994r5, backgroundColor, AbstractC17918w0.f69621a);
                            if (c17723a2M51179g.getShowDashedBorder()) {
                                c2306l2 = c2306l;
                                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                c2314t2 = c2314t;
                            } else {
                                c2314t2 = c2314t;
                                c2306l2 = c2306l;
                                if (z26) {
                                }
                                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                Modifier modifierM3393o9 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c5.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22961h5, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3393o9);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a9);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m9);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N9);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s9 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h17 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e17 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s9, strM51180h17, modifierMo3471e17, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue9 = iconResource.intValue();
                                            C27430e c27430eM107874S9 = AbstractC34132o.m107874S(iIntValue9, c28655q2, 6);
                                            String strM51180h18 = m51180h(iIntValue9, c28655q2, 0);
                                            Modifier modifierMo3471e18 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S9, strM51180h18, modifierMo3471e18, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h9 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i714 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q13 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h9, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q13, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i714) | (i714 & 29360128), 55290);
                                    c28655q3 = c28655q13;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            }
                            Modifier modifierM3393o10 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c5.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22961h5, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3393o10);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a10);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m10);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N10);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s10 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h19 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e19 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s10, strM51180h19, modifierMo3471e19, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue10 = iconResource.intValue();
                                        C27430e c27430eM107874S10 = AbstractC34132o.m107874S(iIntValue10, c28655q2, 6);
                                        String strM51180h110 = m51180h(iIntValue10, c28655q2, 0);
                                        Modifier modifierMo3471e110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S10, strM51180h110, modifierMo3471e110, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h10 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i715 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q14 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h10, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q14, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i715) | (i715 & 29360128), 55290);
                                c28655q3 = c28655q14;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        } else {
                            c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                        }
                        c33252iM105489e = c33252iM105491g;
                        C22961h c22961h6 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r6 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c6 = AbstractC1092a.m3358c(modifierM118994r6, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o11 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c6.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22961h6, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s11 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s11, strM51180h111, modifierMo3471e111, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue11 = iconResource.intValue();
                                        C27430e c27430eM107874S11 = AbstractC34132o.m107874S(iIntValue11, c28655q2, 6);
                                        String strM51180h112 = m51180h(iIntValue11, c28655q2, 0);
                                        Modifier modifierMo3471e112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S11, strM51180h112, modifierMo3471e112, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h11 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i716 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q15 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h11, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q15, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i716) | (i716 & 29360128), 55290);
                                c28655q3 = c28655q15;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o12 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c6.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22961h6, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3393o12);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a12);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m12);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N12);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s12 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s12, strM51180h113, modifierMo3471e113, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue12 = iconResource.intValue();
                                    C27430e c27430eM107874S12 = AbstractC34132o.m107874S(iIntValue12, c28655q2, 6);
                                    String strM51180h114 = m51180h(iIntValue12, c28655q2, 0);
                                    Modifier modifierMo3471e114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S12, strM51180h114, modifierMo3471e114, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h12 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i717 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q16 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h12, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q16, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i717) | (i717 & 29360128), 55290);
                            c28655q3 = c28655q16;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c28655q4.m87138X();
                        z17 = z13;
                        enumC16313m1 = enumC16313m0;
                        z18 = z14;
                        f17 = f14;
                        interfaceC22973k2 = interfaceC22973k1;
                        z19 = z15;
                        i64 = i13;
                        i65 = i14;
                        f18 = f15;
                        c28655q = c28655q4;
                        f19 = f16;
                        enumC17786s1 = enumC17786s0;
                        c2886a2 = c2886a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue13 = ((Integer) obj2).intValue();
                                return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue13);
                            }
                        };
                    }
                }
                i57 |= 24576;
                i59 = i58;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f2112 = f24;
                        if (i38 != 0) {
                            float f2113 = 8;
                            float f2114 = ((float) 0.5d) * f2113;
                            float f39 = ((float) 0.25d) * f2113;
                            c22976l1 = new C22976l1(f2114, f39, f2114, f39);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f2112;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f2115 = f24;
                        if (i38 != 0) {
                            float f2116 = 8;
                            float f2117 = ((float) 0.5d) * f2116;
                            float f310 = ((float) 0.25d) * f2116;
                            c22976l1 = new C22976l1(f2117, f310, f2117, f310);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f2115;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h7 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r7 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c7 = AbstractC1092a.m3358c(modifierM118994r7, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o13 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c7.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22961h7, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM3393o13);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a13);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m13);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N13);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s13 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s13, strM51180h115, modifierMo3471e115, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue13 = iconResource.intValue();
                                        C27430e c27430eM107874S13 = AbstractC34132o.m107874S(iIntValue13, c28655q2, 6);
                                        String strM51180h116 = m51180h(iIntValue13, c28655q2, 0);
                                        Modifier modifierMo3471e116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S13, strM51180h116, modifierMo3471e116, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h13 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i718 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q17 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h13, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q17, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i718) | (i718 & 29360128), 55290);
                                c28655q3 = c28655q17;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o14 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c7.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22961h7, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3393o14);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m14);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N14);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s14 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s14, strM51180h117, modifierMo3471e117, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue14 = iconResource.intValue();
                                    C27430e c27430eM107874S14 = AbstractC34132o.m107874S(iIntValue14, c28655q2, 6);
                                    String strM51180h118 = m51180h(iIntValue14, c28655q2, 0);
                                    Modifier modifierMo3471e118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S14, strM51180h118, modifierMo3471e118, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h14 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i719 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q18 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h14, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q18, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i719) | (i719 & 29360128), 55290);
                            c28655q3 = c28655q18;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h8 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r8 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c8 = AbstractC1092a.m3358c(modifierM118994r8, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o15 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c8.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22961h8, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierM3393o15);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a15);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m15);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N15);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s15 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s15, strM51180h119, modifierMo3471e119, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue15 = iconResource.intValue();
                                    C27430e c27430eM107874S15 = AbstractC34132o.m107874S(iIntValue15, c28655q2, 6);
                                    String strM51180h1110 = m51180h(iIntValue15, c28655q2, 0);
                                    Modifier modifierMo3471e1110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S15, strM51180h1110, modifierMo3471e1110, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h15 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7110 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q19 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h15, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q19, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7110) | (i7110 & 29360128), 55290);
                            c28655q3 = c28655q19;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o16 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c8.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22961h8, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3393o16);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a16);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N16);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s16 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h1111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e1111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s16, strM51180h1111, modifierMo3471e1111, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue16 = iconResource.intValue();
                                C27430e c27430eM107874S16 = AbstractC34132o.m107874S(iIntValue16, c28655q2, 6);
                                String strM51180h1112 = m51180h(iIntValue16, c28655q2, 0);
                                Modifier modifierMo3471e1112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S16, strM51180h1112, modifierMo3471e1112, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h16 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7111 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q110 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h16, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q110, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111) | (i7111 & 29360128), 55290);
                        c28655q3 = c28655q110;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue17 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue17);
                        }
                    };
                }
            }
            i18 |= 805306368;
            i44 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i44 != 0) {
                i45 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q4.m87155h(z15)) {
                    i46 = 4;
                } else {
                    i46 = 2;
                }
                i45 = i16 | i46;
            } else {
                i45 = i16;
            }
            i47 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i47 != 0) {
                i45 |= 48;
            } else if ((i16 & 48) != 0) {
                if (c28655q4.m87149e(i13)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i45 |= i48;
            }
            i49 = i45;
            i54 = i17 & 4096;
            if (i54 != 0) {
                i55 = i49;
                if ((i16 & 384) == 0) {
                    if (c28655q4.m87149e(i14)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i16 & 4096) == 0) {
                            zM87157i = c28655q4.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q4.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i75 = 2048;
                        }
                    }
                    i55 |= i75;
                }
                i57 = i55;
                i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i58 != 0) {
                    i59 = i58;
                    if ((i16 & 24576) == 0) {
                        if (!c28655q4.m87153g(f15)) {
                            i24 = 8192;
                        }
                        i57 |= i24;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q4.m87135U(i18 & 1, z16)) {
                        c28655q4.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f2118 = f24;
                            if (i38 != 0) {
                                float f2119 = 8;
                                float f21110 = ((float) 0.5d) * f2119;
                                float f311 = ((float) 0.25d) * f2119;
                                c22976l1 = new C22976l1(f21110, f311, f21110, f311);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f2118;
                        } else {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f21111 = f24;
                            if (i38 != 0) {
                                float f21112 = 8;
                                float f21113 = ((float) 0.5d) * f21112;
                                float f312 = ((float) 0.25d) * f21112;
                                c22976l1 = new C22976l1(f21113, f312, f21113, f312);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f21111;
                        }
                        c28655q4.m87175r();
                        c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                        i69 = a.f69260a[enumC17786s2.ordinal()];
                        if (i69 != 1) {
                            if (i69 != 2) {
                                c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                            } else {
                                if (i69 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c33252iM105489e = AbstractC33253j.m105489e(f16);
                            }
                            C22961h c22961h9 = AbstractC22977m.f90654e;
                            c2306l = C2299e.f9108K;
                            z28 = z24;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM118994r9 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                            if (z4) {
                                backgroundColor = C17919x.f69636m;
                            } else if (z28) {
                                backgroundColor = c17723a2M51179g.getPressedColor();
                            } else {
                                backgroundColor = c17723a2M51179g.getBackgroundColor();
                            }
                            c33252i = c33252iM105489e;
                            Modifier modifierM3358c9 = AbstractC1092a.m3358c(modifierM118994r9, backgroundColor, AbstractC17918w0.f69621a);
                            if (c17723a2M51179g.getShowDashedBorder()) {
                                c2306l2 = c2306l;
                                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                c2314t2 = c2314t;
                            } else {
                                c2314t2 = c2314t;
                                c2306l2 = c2306l;
                                if (z26) {
                                }
                                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                Modifier modifierM3393o17 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c9.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(c22961h9, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, modifierM3393o17);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a17);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m17);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N17);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s17 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h1113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e1113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s17, strM51180h1113, modifierMo3471e1113, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue17 = iconResource.intValue();
                                            C27430e c27430eM107874S17 = AbstractC34132o.m107874S(iIntValue17, c28655q2, 6);
                                            String strM51180h1114 = m51180h(iIntValue17, c28655q2, 0);
                                            Modifier modifierMo3471e1114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S17, strM51180h1114, modifierMo3471e1114, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h17 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i7112 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q111 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h17, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7112) | (i7112 & 29360128), 55290);
                                    c28655q3 = c28655q111;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            }
                            Modifier modifierM3393o18 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c9.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(c22961h9, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, modifierM3393o18);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a18);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m18);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N18);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s18 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h1115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e1115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s18, strM51180h1115, modifierMo3471e1115, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue18 = iconResource.intValue();
                                        C27430e c27430eM107874S18 = AbstractC34132o.m107874S(iIntValue18, c28655q2, 6);
                                        String strM51180h1116 = m51180h(iIntValue18, c28655q2, 0);
                                        Modifier modifierMo3471e1116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S18, strM51180h1116, modifierMo3471e1116, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h18 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i7113 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q112 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h18, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q112, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7113) | (i7113 & 29360128), 55290);
                                c28655q3 = c28655q112;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        } else {
                            c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                        }
                        c33252iM105489e = c33252iM105491g;
                        C22961h c22961h10 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r10 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c10 = AbstractC1092a.m3358c(modifierM118994r10, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o19 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c10.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(c22961h10, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM3393o19);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a19);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m19);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N19);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s19 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h1117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e1117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s19, strM51180h1117, modifierMo3471e1117, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue19 = iconResource.intValue();
                                        C27430e c27430eM107874S19 = AbstractC34132o.m107874S(iIntValue19, c28655q2, 6);
                                        String strM51180h1118 = m51180h(iIntValue19, c28655q2, 0);
                                        Modifier modifierMo3471e1118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S19, strM51180h1118, modifierMo3471e1118, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h19 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i7114 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q113 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h19, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q113, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7114) | (i7114 & 29360128), 55290);
                                c28655q3 = c28655q113;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o110 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c10.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(c22961h10, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, modifierM3393o110);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a110);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m110);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N110);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s110 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h1119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e1119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s110, strM51180h1119, modifierMo3471e1119, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue110 = iconResource.intValue();
                                    C27430e c27430eM107874S110 = AbstractC34132o.m107874S(iIntValue110, c28655q2, 6);
                                    String strM51180h11110 = m51180h(iIntValue110, c28655q2, 0);
                                    Modifier modifierMo3471e11110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S110, strM51180h11110, modifierMo3471e11110, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h110 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7115 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q114 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h110, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q114, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7115) | (i7115 & 29360128), 55290);
                            c28655q3 = c28655q114;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c28655q4.m87138X();
                        z17 = z13;
                        enumC16313m1 = enumC16313m0;
                        z18 = z14;
                        f17 = f14;
                        interfaceC22973k2 = interfaceC22973k1;
                        z19 = z15;
                        i64 = i13;
                        i65 = i14;
                        f18 = f15;
                        c28655q = c28655q4;
                        f19 = f16;
                        enumC17786s1 = enumC17786s0;
                        c2886a2 = c2886a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue111 = ((Integer) obj2).intValue();
                                return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue111);
                            }
                        };
                    }
                }
                i57 |= 24576;
                i59 = i58;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f21114 = f24;
                        if (i38 != 0) {
                            float f21115 = 8;
                            float f21116 = ((float) 0.5d) * f21115;
                            float f313 = ((float) 0.25d) * f21115;
                            c22976l1 = new C22976l1(f21116, f313, f21116, f313);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f21114;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f21117 = f24;
                        if (i38 != 0) {
                            float f21118 = 8;
                            float f21119 = ((float) 0.5d) * f21118;
                            float f314 = ((float) 0.25d) * f21118;
                            c22976l1 = new C22976l1(f21119, f314, f21119, f314);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f21117;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h11 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r11 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c11 = AbstractC1092a.m3358c(modifierM118994r11, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o111 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c11.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(c22961h11, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s111 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h11111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e11111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s111, strM51180h11111, modifierMo3471e11111, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue111 = iconResource.intValue();
                                        C27430e c27430eM107874S111 = AbstractC34132o.m107874S(iIntValue111, c28655q2, 6);
                                        String strM51180h11112 = m51180h(iIntValue111, c28655q2, 0);
                                        Modifier modifierMo3471e11112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S111, strM51180h11112, modifierMo3471e11112, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h111 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i7116 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q115 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h111, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q115, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7116) | (i7116 & 29360128), 55290);
                                c28655q3 = c28655q115;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o112 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c11.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(c22961h11, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q4, modifierM3393o112);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a112);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m112);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N112);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s112 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s112, strM51180h11113, modifierMo3471e11113, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue112 = iconResource.intValue();
                                    C27430e c27430eM107874S112 = AbstractC34132o.m107874S(iIntValue112, c28655q2, 6);
                                    String strM51180h11114 = m51180h(iIntValue112, c28655q2, 0);
                                    Modifier modifierMo3471e11114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S112, strM51180h11114, modifierMo3471e11114, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h112 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7117 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q116 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h112, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q116, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7117) | (i7117 & 29360128), 55290);
                            c28655q3 = c28655q116;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h12 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r12 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c12 = AbstractC1092a.m3358c(modifierM118994r12, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o113 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c12.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(c22961h12, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q4.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a113);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m113);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N113);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s113 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s113, strM51180h11115, modifierMo3471e11115, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue113 = iconResource.intValue();
                                    C27430e c27430eM107874S113 = AbstractC34132o.m107874S(iIntValue113, c28655q2, 6);
                                    String strM51180h11116 = m51180h(iIntValue113, c28655q2, 0);
                                    Modifier modifierMo3471e11116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S113, strM51180h11116, modifierMo3471e11116, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h113 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7118 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q117 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h113, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q117, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7118) | (i7118 & 29360128), 55290);
                            c28655q3 = c28655q117;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o114 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c12.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(c22961h12, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierM3393o114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a114);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m114);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N114);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s114 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h11117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e11117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s114, strM51180h11117, modifierMo3471e11117, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue114 = iconResource.intValue();
                                C27430e c27430eM107874S114 = AbstractC34132o.m107874S(iIntValue114, c28655q2, 6);
                                String strM51180h11118 = m51180h(iIntValue114, c28655q2, 0);
                                Modifier modifierMo3471e11118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S114, strM51180h11118, modifierMo3471e11118, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h114 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7119 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q118 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h114, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q118, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7119) | (i7119 & 29360128), 55290);
                        c28655q3 = c28655q118;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue115 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue115);
                        }
                    };
                }
            }
            i55 = i49 | 384;
            if ((i16 & 3072) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i16 & 4096) == 0) {
                        zM87157i = c28655q4.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q4.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i75 = 2048;
                    }
                }
                i55 |= i75;
            }
            i57 = i55;
            i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i58 != 0) {
                i59 = i58;
                if ((i16 & 24576) == 0) {
                    if (!c28655q4.m87153g(f15)) {
                        i24 = 8192;
                    }
                    i57 |= i24;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f211110 = f24;
                        if (i38 != 0) {
                            float f211111 = 8;
                            float f211112 = ((float) 0.5d) * f211111;
                            float f315 = ((float) 0.25d) * f211111;
                            c22976l1 = new C22976l1(f211112, f315, f211112, f315);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f211110;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f211113 = f24;
                        if (i38 != 0) {
                            float f211114 = 8;
                            float f211115 = ((float) 0.5d) * f211114;
                            float f316 = ((float) 0.25d) * f211114;
                            c22976l1 = new C22976l1(f211115, f316, f211115, f316);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f211113;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h13 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r13 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c13 = AbstractC1092a.m3358c(modifierM118994r13, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o115 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c13.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(c22961h13, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifierM3393o115);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a115);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m115);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N115);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s115 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h11119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e11119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s115, strM51180h11119, modifierMo3471e11119, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue115 = iconResource.intValue();
                                        C27430e c27430eM107874S115 = AbstractC34132o.m107874S(iIntValue115, c28655q2, 6);
                                        String strM51180h111110 = m51180h(iIntValue115, c28655q2, 0);
                                        Modifier modifierMo3471e111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S115, strM51180h111110, modifierMo3471e111110, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h115 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i71110 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q119 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h115, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q119, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71110) | (i71110 & 29360128), 55290);
                                c28655q3 = c28655q119;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o116 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c13.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(c22961h13, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q4, modifierM3393o116);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a116);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m116);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N116);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s116 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s116, strM51180h111111, modifierMo3471e111111, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue116 = iconResource.intValue();
                                    C27430e c27430eM107874S116 = AbstractC34132o.m107874S(iIntValue116, c28655q2, 6);
                                    String strM51180h111112 = m51180h(iIntValue116, c28655q2, 0);
                                    Modifier modifierMo3471e111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S116, strM51180h111112, modifierMo3471e111112, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h116 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i71111 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q1110 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h116, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1110, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111) | (i71111 & 29360128), 55290);
                            c28655q3 = c28655q1110;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h14 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r14 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c14 = AbstractC1092a.m3358c(modifierM118994r14, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o117 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c14.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(c22961h14, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q4, modifierM3393o117);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a117);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m117);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N117);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s117 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s117, strM51180h111113, modifierMo3471e111113, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue117 = iconResource.intValue();
                                    C27430e c27430eM107874S117 = AbstractC34132o.m107874S(iIntValue117, c28655q2, 6);
                                    String strM51180h111114 = m51180h(iIntValue117, c28655q2, 0);
                                    Modifier modifierMo3471e111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S117, strM51180h111114, modifierMo3471e111114, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h117 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i71112 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q1111 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h117, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71112) | (i71112 & 29360128), 55290);
                            c28655q3 = c28655q1111;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o118 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c14.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(c22961h14, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q4, modifierM3393o118);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a118);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m118);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N118);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s118 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s118, strM51180h111115, modifierMo3471e111115, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue118 = iconResource.intValue();
                                C27430e c27430eM107874S118 = AbstractC34132o.m107874S(iIntValue118, c28655q2, 6);
                                String strM51180h111116 = m51180h(iIntValue118, c28655q2, 0);
                                Modifier modifierMo3471e111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S118, strM51180h111116, modifierMo3471e111116, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h118 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71113 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1112 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h118, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1112, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71113) | (i71113 & 29360128), 55290);
                        c28655q3 = c28655q1112;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue119 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue119);
                        }
                    };
                }
            }
            i57 |= 24576;
            i59 = i58;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z16)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f211116 = f24;
                    if (i38 != 0) {
                        float f211117 = 8;
                        float f211118 = ((float) 0.5d) * f211117;
                        float f317 = ((float) 0.25d) * f211117;
                        c22976l1 = new C22976l1(f211118, f317, f211118, f317);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f211116;
                } else {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f211119 = f24;
                    if (i38 != 0) {
                        float f2111110 = 8;
                        float f2111111 = ((float) 0.5d) * f2111110;
                        float f318 = ((float) 0.25d) * f2111110;
                        c22976l1 = new C22976l1(f2111111, f318, f2111111, f318);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f211119;
                }
                c28655q4.m87175r();
                c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                i69 = a.f69260a[enumC17786s2.ordinal()];
                if (i69 != 1) {
                    if (i69 != 2) {
                        c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                    } else {
                        if (i69 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c33252iM105489e = AbstractC33253j.m105489e(f16);
                    }
                    C22961h c22961h15 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r15 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c15 = AbstractC1092a.m3358c(modifierM118994r15, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o119 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c15.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(c22961h15, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierM3393o119);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a119);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m119);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N119);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s119 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s119, strM51180h111117, modifierMo3471e111117, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue119 = iconResource.intValue();
                                    C27430e c27430eM107874S119 = AbstractC34132o.m107874S(iIntValue119, c28655q2, 6);
                                    String strM51180h111118 = m51180h(iIntValue119, c28655q2, 0);
                                    Modifier modifierMo3471e111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S119, strM51180h111118, modifierMo3471e111118, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h119 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i71114 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q1113 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h119, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1113, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71114) | (i71114 & 29360128), 55290);
                            c28655q3 = c28655q1113;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o1110 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c15.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(c22961h15, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1110);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1110);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1110);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s1110 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s1110, strM51180h111119, modifierMo3471e111119, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue1110 = iconResource.intValue();
                                C27430e c27430eM107874S1110 = AbstractC34132o.m107874S(iIntValue1110, c28655q2, 6);
                                String strM51180h1111110 = m51180h(iIntValue1110, c28655q2, 0);
                                Modifier modifierMo3471e1111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S1110, strM51180h1111110, modifierMo3471e1111110, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h1110 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71115 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1114 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h1110, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1114, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71115) | (i71115 & 29360128), 55290);
                        c28655q3 = c28655q1114;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                }
                c33252iM105489e = c33252iM105491g;
                C22961h c22961h16 = AbstractC22977m.f90654e;
                c2306l = C2299e.f9108K;
                z28 = z24;
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r16 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                if (z4) {
                    backgroundColor = C17919x.f69636m;
                } else if (z28) {
                    backgroundColor = c17723a2M51179g.getPressedColor();
                } else {
                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                }
                c33252i = c33252iM105489e;
                Modifier modifierM3358c16 = AbstractC1092a.m3358c(modifierM118994r16, backgroundColor, AbstractC17918w0.f69621a);
                if (c17723a2M51179g.getShowDashedBorder()) {
                    c2306l2 = c2306l;
                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    if (z26) {
                    }
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                    Modifier modifierM3393o1111 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c16.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(c22961h16, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s1111 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h1111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e1111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s1111, strM51180h1111111, modifierMo3471e1111111, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue1111 = iconResource.intValue();
                                C27430e c27430eM107874S1111 = AbstractC34132o.m107874S(iIntValue1111, c28655q2, 6);
                                String strM51180h1111112 = m51180h(iIntValue1111, c28655q2, 0);
                                Modifier modifierMo3471e1111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S1111, strM51180h1111112, modifierMo3471e1111112, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h1111 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71116 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1115 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h1111, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1115, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71116) | (i71116 & 29360128), 55290);
                        c28655q3 = c28655q1115;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                }
                Modifier modifierM3393o1112 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c16.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(c22961h16, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q4.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1112);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1112);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1112);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s1112 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h1111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e1111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s1112, strM51180h1111113, modifierMo3471e1111113, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue1112 = iconResource.intValue();
                            C27430e c27430eM107874S1112 = AbstractC34132o.m107874S(iIntValue1112, c28655q2, 6);
                            String strM51180h1111114 = m51180h(iIntValue1112, c28655q2, 0);
                            Modifier modifierMo3471e1111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S1112, strM51180h1111114, modifierMo3471e1111114, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h1112 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i71117 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q1116 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h1112, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1116, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71117) | (i71117 & 29360128), 55290);
                    c28655q3 = c28655q1116;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            } else {
                c28655q4.m87138X();
                z17 = z13;
                enumC16313m1 = enumC16313m0;
                z18 = z14;
                f17 = f14;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z15;
                i64 = i13;
                i65 = i14;
                f18 = f15;
                c28655q = c28655q4;
                f19 = f16;
                enumC17786s1 = enumC17786s0;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue1113 = ((Integer) obj2).intValue();
                        return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue1113);
                    }
                };
            }
        }
        i18 |= 3072;
        i19 = i17 & 16;
        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i19 != 0) {
            i18 |= 24576;
        } else if ((i15 & 24576) == 0) {
            if (enumC16313m0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16313m0.ordinal();
            }
            if (c28655q4.m87149e(iOrdinal)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i18 |= i25;
        }
        i26 = i17 & 32;
        if (i26 != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f16 = f13;
        } else {
            f16 = f13;
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87147d(f16)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i27;
            }
        }
        i28 = i17 & 64;
        if (i28 != 0) {
            i18 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (c28655q4.m87149e(enumC17786s0 != null ? enumC17786s0.ordinal() : -1)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i18 |= i29;
        }
        i34 = i17 & 128;
        if (i34 != 0) {
            i18 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (c28655q4.m87155h(z14)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i18 |= i35;
        }
        i36 = i17 & 256;
        if (i36 != 0) {
            i18 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q4.m87147d(f14)) {
                i37 = 67108864;
            } else {
                i37 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i18 |= i37;
        }
        i38 = i17 & 512;
        if (i38 != 0) {
            if ((i15 & 805306368) == 0) {
                if (c28655q4.m87153g(interfaceC22973k1)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i18 |= i39;
            }
            i44 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i44 != 0) {
                i45 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q4.m87155h(z15)) {
                    i46 = 4;
                } else {
                    i46 = 2;
                }
                i45 = i16 | i46;
            } else {
                i45 = i16;
            }
            i47 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i47 != 0) {
                i45 |= 48;
            } else if ((i16 & 48) != 0) {
                if (c28655q4.m87149e(i13)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i45 |= i48;
            }
            i49 = i45;
            i54 = i17 & 4096;
            if (i54 != 0) {
                i55 = i49;
                if ((i16 & 384) == 0) {
                    if (c28655q4.m87149e(i14)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) == 0) {
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        if ((i16 & 4096) == 0) {
                            zM87157i = c28655q4.m87153g(c2886a);
                        } else {
                            zM87157i = c28655q4.m87157i(c2886a);
                        }
                        if (zM87157i) {
                            i75 = 2048;
                        }
                    }
                    i55 |= i75;
                }
                i57 = i55;
                i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i58 != 0) {
                    i59 = i58;
                    if ((i16 & 24576) == 0) {
                        if (!c28655q4.m87153g(f15)) {
                            i24 = 8192;
                        }
                        i57 |= i24;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q4.m87135U(i18 & 1, z16)) {
                        c28655q4.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f2111112 = f24;
                            if (i38 != 0) {
                                float f2111113 = 8;
                                float f2111114 = ((float) 0.5d) * f2111113;
                                float f319 = ((float) 0.25d) * f2111113;
                                c22976l1 = new C22976l1(f2111114, f319, f2111114, f319);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f2111112;
                        } else {
                            if (i74 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i19 != 0) {
                                enumC16313m2 = null;
                            } else {
                                enumC16313m2 = enumC16313m0;
                            }
                            if (i26 != 0) {
                                f16 = 4 * 1;
                            }
                            if (i28 != 0) {
                                enumC17786s2 = EnumC17786s0.NONE;
                            } else {
                                enumC17786s2 = enumC17786s0;
                            }
                            if (i34 != 0) {
                                z25 = true;
                            } else {
                                z25 = z14;
                            }
                            if (i36 != 0) {
                                f24 = 2 * 4;
                            } else {
                                f24 = f14;
                            }
                            float f2111115 = f24;
                            if (i38 != 0) {
                                float f2111116 = 8;
                                float f2111117 = ((float) 0.5d) * f2111116;
                                float f3110 = ((float) 0.25d) * f2111116;
                                c22976l1 = new C22976l1(f2111117, f3110, f2111117, f3110);
                            } else {
                                c22976l1 = interfaceC22973k1;
                            }
                            if (i44 != 0) {
                                z26 = false;
                            } else {
                                z26 = z15;
                            }
                            if (i47 != 0) {
                                i66 = 1;
                            } else {
                                i66 = i13;
                            }
                            if (i54 != 0) {
                                i67 = Integer.MAX_VALUE;
                            } else {
                                i67 = i14;
                            }
                            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                                i57 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            z27 = z25;
                            if (i59 != 0) {
                                f25 = null;
                            } else {
                                f25 = f15;
                            }
                            i68 = i57;
                            interfaceC22973k3 = c22976l1;
                            enumC16313m3 = enumC16313m2;
                            f26 = f2111115;
                        }
                        c28655q4.m87175r();
                        c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                        i69 = a.f69260a[enumC17786s2.ordinal()];
                        if (i69 != 1) {
                            if (i69 != 2) {
                                c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                            } else {
                                if (i69 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c33252iM105489e = AbstractC33253j.m105489e(f16);
                            }
                            C22961h c22961h17 = AbstractC22977m.f90654e;
                            c2306l = C2299e.f9108K;
                            z28 = z24;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM118994r17 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                            if (z4) {
                                backgroundColor = C17919x.f69636m;
                            } else if (z28) {
                                backgroundColor = c17723a2M51179g.getPressedColor();
                            } else {
                                backgroundColor = c17723a2M51179g.getBackgroundColor();
                            }
                            c33252i = c33252iM105489e;
                            Modifier modifierM3358c17 = AbstractC1092a.m3358c(modifierM118994r17, backgroundColor, AbstractC17918w0.f69621a);
                            if (c17723a2M51179g.getShowDashedBorder()) {
                                c2306l2 = c2306l;
                                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                                c2314t2 = c2314t;
                            } else {
                                c2314t2 = c2314t;
                                c2306l2 = c2306l;
                                if (z26) {
                                }
                                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                                Modifier modifierM3393o1113 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c17.mo3471e(modifierM44455h));
                                C22994r1 c22994r1M66759a1113 = AbstractC22988p1.m66759a(c22961h17, c2306l2, c28655q4, 54);
                                iHashCode = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q4.m87165m();
                                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1113);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(c0213j);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1113);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1113);
                                c0209i = C0217k.f732j;
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1113);
                                if (z27) {
                                    c28655q4.m87150e0(755321030);
                                    if (enumC16313m3 != null) {
                                        C27430e c27430eM53378s1113 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                        String strM51180h1111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                        Modifier modifierMo3471e1111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q4.m87150e0(1686948354);
                                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                        } else {
                                            c28655q4.m87150e0(1686949185);
                                            c28655q4.m87173q(false);
                                            iconColor2 = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM53378s1113, strM51180h1111115, modifierMo3471e1111115, iconColor2, c28655q4, 0, 0);
                                        c28655q2 = c28655q4;
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2 = c28655q4;
                                        c28655q2.m87150e0(755923019);
                                        iconResource = c17723a2M51179g.getIconResource();
                                        if (iconResource == null) {
                                            c28655q2.m87150e0(755923018);
                                            c28655q2.m87173q(false);
                                        } else {
                                            c28655q2.m87150e0(755923019);
                                            int iIntValue1113 = iconResource.intValue();
                                            C27430e c27430eM107874S1113 = AbstractC34132o.m107874S(iIntValue1113, c28655q2, 6);
                                            String strM51180h1111116 = m51180h(iIntValue1113, c28655q2, 0);
                                            Modifier modifierMo3471e1111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                            if (z28) {
                                                c28655q2.m87150e0(2129901195);
                                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                            } else {
                                                c28655q2.m87150e0(2129902026);
                                                c28655q2.m87173q(false);
                                                iconColor = c17723a2M51179g.getIconColor();
                                            }
                                            AbstractC15005f3.m43108b(c27430eM107874S1113, strM51180h1111116, modifierMo3471e1111116, iconColor, c28655q2, 0, 0);
                                            c28655q2.m87173q(false);
                                        }
                                        c28655q2.m87173q(false);
                                    }
                                    if (enumC16313m3 == null) {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        if (textResource != null) {
                                            z29 = true;
                                            if (AbstractC8693b.m21270d(textResource)) {
                                            }
                                            if (z36) {
                                                c28655q2.m87150e0(756591162);
                                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                                z37 = false;
                                                c28655q2.m87173q(false);
                                            } else {
                                                z37 = false;
                                                c28655q2.m87150e0(756729546);
                                                c28655q2.m87173q(false);
                                            }
                                        } else {
                                            z29 = true;
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    }
                                    c28655q2.m87173q(z37);
                                } else {
                                    c28655q2 = c28655q4;
                                    z29 = true;
                                    c28655q2.m87150e0(756739466);
                                    c28655q2.m87173q(false);
                                }
                                if (textResource != null) {
                                    c28655q2.m87150e0(756791236);
                                    String strM21274h1113 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                    if (z28) {
                                        c28655q2.m87150e0(1686984191);
                                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                        z35 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z35 = false;
                                        c28655q2.m87150e0(1686984929);
                                        c28655q2.m87173q(false);
                                        textColor = c17723a2M51179g.getTextColor();
                                    }
                                    int i71118 = i68 << 9;
                                    f19 = f16;
                                    C28655q c28655q1117 = c28655q2;
                                    z34 = z29;
                                    AbstractC30795n.m94707h(strM21274h1113, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1117, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71118) | (i71118 & 29360128), 55290);
                                    c28655q3 = c28655q1117;
                                    c28655q3.m87173q(z35);
                                } else {
                                    c28655q3 = c28655q2;
                                    f19 = f16;
                                    z34 = z29;
                                    c28655q3.m87150e0(757114442);
                                    c28655q3.m87173q(false);
                                }
                                c28655q3.m87173q(z34);
                                z17 = z28;
                                interfaceC22973k2 = interfaceC22973k3;
                                enumC16313m1 = enumC16313m3;
                                f17 = f26;
                                c28655q = c28655q3;
                                i64 = i66;
                                i65 = i67;
                                c2886a2 = n13;
                                f18 = f25;
                                enumC17786s1 = enumC17786s2;
                                z18 = z27;
                                z19 = z26;
                            }
                            Modifier modifierM3393o1114 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c17.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a1114 = AbstractC22988p1.m66759a(c22961h17, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q4.m87165m();
                            Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1114);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1114);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1114);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1114);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s1114 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h1111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e1111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s1114, strM51180h1111117, modifierMo3471e1111117, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue1114 = iconResource.intValue();
                                        C27430e c27430eM107874S1114 = AbstractC34132o.m107874S(iIntValue1114, c28655q2, 6);
                                        String strM51180h1111118 = m51180h(iIntValue1114, c28655q2, 0);
                                        Modifier modifierMo3471e1111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S1114, strM51180h1111118, modifierMo3471e1111118, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h1114 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i71119 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q1118 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h1114, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1118, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71119) | (i71119 & 29360128), 55290);
                                c28655q3 = c28655q1118;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        } else {
                            c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                        }
                        c33252iM105489e = c33252iM105491g;
                        C22961h c22961h18 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r18 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c18 = AbstractC1092a.m3358c(modifierM118994r18, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o1115 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c18.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a1115 = AbstractC22988p1.m66759a(c22961h18, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q4.m87165m();
                            Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1115);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1115);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1115);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1115);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s1115 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h1111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e1111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s1115, strM51180h1111119, modifierMo3471e1111119, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue1115 = iconResource.intValue();
                                        C27430e c27430eM107874S1115 = AbstractC34132o.m107874S(iIntValue1115, c28655q2, 6);
                                        String strM51180h11111110 = m51180h(iIntValue1115, c28655q2, 0);
                                        Modifier modifierMo3471e11111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S1115, strM51180h11111110, modifierMo3471e11111110, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h1115 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i711110 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q1119 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h1115, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1119, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711110) | (i711110 & 29360128), 55290);
                                c28655q3 = c28655q1119;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o1116 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c18.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a1116 = AbstractC22988p1.m66759a(c22961h18, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q4.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1116);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1116);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1116);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1116);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s1116 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s1116, strM51180h11111111, modifierMo3471e11111111, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue1116 = iconResource.intValue();
                                    C27430e c27430eM107874S1116 = AbstractC34132o.m107874S(iIntValue1116, c28655q2, 6);
                                    String strM51180h11111112 = m51180h(iIntValue1116, c28655q2, 0);
                                    Modifier modifierMo3471e11111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S1116, strM51180h11111112, modifierMo3471e11111112, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h1116 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i711111 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11110 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h1116, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11110, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711111) | (i711111 & 29360128), 55290);
                            c28655q3 = c28655q11110;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c28655q4.m87138X();
                        z17 = z13;
                        enumC16313m1 = enumC16313m0;
                        z18 = z14;
                        f17 = f14;
                        interfaceC22973k2 = interfaceC22973k1;
                        z19 = z15;
                        i64 = i13;
                        i65 = i14;
                        f18 = f15;
                        c28655q = c28655q4;
                        f19 = f16;
                        enumC17786s1 = enumC17786s0;
                        c2886a2 = c2886a;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue1117 = ((Integer) obj2).intValue();
                                return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue1117);
                            }
                        };
                    }
                }
                i57 |= 24576;
                i59 = i58;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f2111118 = f24;
                        if (i38 != 0) {
                            float f2111119 = 8;
                            float f21111110 = ((float) 0.5d) * f2111119;
                            float f3111 = ((float) 0.25d) * f2111119;
                            c22976l1 = new C22976l1(f21111110, f3111, f21111110, f3111);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f2111118;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f21111111 = f24;
                        if (i38 != 0) {
                            float f21111112 = 8;
                            float f21111113 = ((float) 0.5d) * f21111112;
                            float f3112 = ((float) 0.25d) * f21111112;
                            c22976l1 = new C22976l1(f21111113, f3112, f21111113, f3112);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f21111111;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h19 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r19 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c19 = AbstractC1092a.m3358c(modifierM118994r19, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o1117 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c19.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a1117 = AbstractC22988p1.m66759a(c22961h19, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q4.m87165m();
                            Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1117);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1117);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1117);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1117);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s1117 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h11111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e11111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s1117, strM51180h11111113, modifierMo3471e11111113, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue1117 = iconResource.intValue();
                                        C27430e c27430eM107874S1117 = AbstractC34132o.m107874S(iIntValue1117, c28655q2, 6);
                                        String strM51180h11111114 = m51180h(iIntValue1117, c28655q2, 0);
                                        Modifier modifierMo3471e11111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S1117, strM51180h11111114, modifierMo3471e11111114, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h1117 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i711112 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q11111 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h1117, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11111, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711112) | (i711112 & 29360128), 55290);
                                c28655q3 = c28655q11111;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o1118 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c19.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a1118 = AbstractC22988p1.m66759a(c22961h19, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q4.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1118);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1118);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1118);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1118);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s1118 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s1118, strM51180h11111115, modifierMo3471e11111115, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue1118 = iconResource.intValue();
                                    C27430e c27430eM107874S1118 = AbstractC34132o.m107874S(iIntValue1118, c28655q2, 6);
                                    String strM51180h11111116 = m51180h(iIntValue1118, c28655q2, 0);
                                    Modifier modifierMo3471e11111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S1118, strM51180h11111116, modifierMo3471e11111116, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h1118 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i711113 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11112 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h1118, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11112, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711113) | (i711113 & 29360128), 55290);
                            c28655q3 = c28655q11112;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h110 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r110 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c110 = AbstractC1092a.m3358c(modifierM118994r110, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o1119 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c110.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a1119 = AbstractC22988p1.m66759a(c22961h110, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q4.m87165m();
                        Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1119);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1119);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1119);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1119);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s1119 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s1119, strM51180h11111117, modifierMo3471e11111117, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue1119 = iconResource.intValue();
                                    C27430e c27430eM107874S1119 = AbstractC34132o.m107874S(iIntValue1119, c28655q2, 6);
                                    String strM51180h11111118 = m51180h(iIntValue1119, c28655q2, 0);
                                    Modifier modifierMo3471e11111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S1119, strM51180h11111118, modifierMo3471e11111118, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h1119 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i711114 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11113 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h1119, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11113, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711114) | (i711114 & 29360128), 55290);
                            c28655q3 = c28655q11113;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o11110 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c110.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a11110 = AbstractC22988p1.m66759a(c22961h110, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q4.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11110);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11110);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11110);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s11110 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h11111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e11111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s11110, strM51180h11111119, modifierMo3471e11111119, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue11110 = iconResource.intValue();
                                C27430e c27430eM107874S11110 = AbstractC34132o.m107874S(iIntValue11110, c28655q2, 6);
                                String strM51180h111111110 = m51180h(iIntValue11110, c28655q2, 0);
                                Modifier modifierMo3471e111111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S11110, strM51180h111111110, modifierMo3471e111111110, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h11110 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i711115 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q11114 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h11110, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11114, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711115) | (i711115 & 29360128), 55290);
                        c28655q3 = c28655q11114;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue11111 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue11111);
                        }
                    };
                }
            }
            i55 = i49 | 384;
            if ((i16 & 3072) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i16 & 4096) == 0) {
                        zM87157i = c28655q4.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q4.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i75 = 2048;
                    }
                }
                i55 |= i75;
            }
            i57 = i55;
            i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i58 != 0) {
                i59 = i58;
                if ((i16 & 24576) == 0) {
                    if (!c28655q4.m87153g(f15)) {
                        i24 = 8192;
                    }
                    i57 |= i24;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f21111114 = f24;
                        if (i38 != 0) {
                            float f21111115 = 8;
                            float f21111116 = ((float) 0.5d) * f21111115;
                            float f3113 = ((float) 0.25d) * f21111115;
                            c22976l1 = new C22976l1(f21111116, f3113, f21111116, f3113);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f21111114;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f21111117 = f24;
                        if (i38 != 0) {
                            float f21111118 = 8;
                            float f21111119 = ((float) 0.5d) * f21111118;
                            float f3114 = ((float) 0.25d) * f21111118;
                            c22976l1 = new C22976l1(f21111119, f3114, f21111119, f3114);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f21111117;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h111 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r111 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c111 = AbstractC1092a.m3358c(modifierM118994r111, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o11111 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c111.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a11111 = AbstractC22988p1.m66759a(c22961h111, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q4.m87165m();
                            Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11111);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11111);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11111);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11111);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s11111 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h111111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e111111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s11111, strM51180h111111111, modifierMo3471e111111111, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue11111 = iconResource.intValue();
                                        C27430e c27430eM107874S11111 = AbstractC34132o.m107874S(iIntValue11111, c28655q2, 6);
                                        String strM51180h111111112 = m51180h(iIntValue11111, c28655q2, 0);
                                        Modifier modifierMo3471e111111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S11111, strM51180h111111112, modifierMo3471e111111112, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h11111 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i711116 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q11115 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h11111, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11115, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711116) | (i711116 & 29360128), 55290);
                                c28655q3 = c28655q11115;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o11112 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c111.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a11112 = AbstractC22988p1.m66759a(c22961h111, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q4.m87165m();
                        Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11112);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11112);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11112);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11112);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s11112 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s11112, strM51180h111111113, modifierMo3471e111111113, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue11112 = iconResource.intValue();
                                    C27430e c27430eM107874S11112 = AbstractC34132o.m107874S(iIntValue11112, c28655q2, 6);
                                    String strM51180h111111114 = m51180h(iIntValue11112, c28655q2, 0);
                                    Modifier modifierMo3471e111111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S11112, strM51180h111111114, modifierMo3471e111111114, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h11112 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i711117 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11116 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h11112, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11116, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711117) | (i711117 & 29360128), 55290);
                            c28655q3 = c28655q11116;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h112 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r112 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c112 = AbstractC1092a.m3358c(modifierM118994r112, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o11113 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c112.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a11113 = AbstractC22988p1.m66759a(c22961h112, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q4.m87165m();
                        Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11113);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11113);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11113);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s11113 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s11113, strM51180h111111115, modifierMo3471e111111115, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue11113 = iconResource.intValue();
                                    C27430e c27430eM107874S11113 = AbstractC34132o.m107874S(iIntValue11113, c28655q2, 6);
                                    String strM51180h111111116 = m51180h(iIntValue11113, c28655q2, 0);
                                    Modifier modifierMo3471e111111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S11113, strM51180h111111116, modifierMo3471e111111116, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h11113 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i711118 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11117 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h11113, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11117, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711118) | (i711118 & 29360128), 55290);
                            c28655q3 = c28655q11117;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o11114 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c112.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a11114 = AbstractC22988p1.m66759a(c22961h112, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q4.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11114);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11114);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11114);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s11114 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h111111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e111111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s11114, strM51180h111111117, modifierMo3471e111111117, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue11114 = iconResource.intValue();
                                C27430e c27430eM107874S11114 = AbstractC34132o.m107874S(iIntValue11114, c28655q2, 6);
                                String strM51180h111111118 = m51180h(iIntValue11114, c28655q2, 0);
                                Modifier modifierMo3471e111111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S11114, strM51180h111111118, modifierMo3471e111111118, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h11114 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i711119 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q11118 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h11114, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11118, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i711119) | (i711119 & 29360128), 55290);
                        c28655q3 = c28655q11118;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue11115 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue11115);
                        }
                    };
                }
            }
            i57 |= 24576;
            i59 = i58;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z16)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f211111110 = f24;
                    if (i38 != 0) {
                        float f211111111 = 8;
                        float f211111112 = ((float) 0.5d) * f211111111;
                        float f3115 = ((float) 0.25d) * f211111111;
                        c22976l1 = new C22976l1(f211111112, f3115, f211111112, f3115);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f211111110;
                } else {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f211111113 = f24;
                    if (i38 != 0) {
                        float f211111114 = 8;
                        float f211111115 = ((float) 0.5d) * f211111114;
                        float f3116 = ((float) 0.25d) * f211111114;
                        c22976l1 = new C22976l1(f211111115, f3116, f211111115, f3116);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f211111113;
                }
                c28655q4.m87175r();
                c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                i69 = a.f69260a[enumC17786s2.ordinal()];
                if (i69 != 1) {
                    if (i69 != 2) {
                        c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                    } else {
                        if (i69 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c33252iM105489e = AbstractC33253j.m105489e(f16);
                    }
                    C22961h c22961h113 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r113 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c113 = AbstractC1092a.m3358c(modifierM118994r113, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o11115 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c113.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a11115 = AbstractC22988p1.m66759a(c22961h113, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q4.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11115);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11115);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11115);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11115);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s11115 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s11115, strM51180h111111119, modifierMo3471e111111119, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue11115 = iconResource.intValue();
                                    C27430e c27430eM107874S11115 = AbstractC34132o.m107874S(iIntValue11115, c28655q2, 6);
                                    String strM51180h1111111110 = m51180h(iIntValue11115, c28655q2, 0);
                                    Modifier modifierMo3471e1111111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S11115, strM51180h1111111110, modifierMo3471e1111111110, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h11115 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7111110 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q11119 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h11115, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q11119, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111110) | (i7111110 & 29360128), 55290);
                            c28655q3 = c28655q11119;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o11116 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c113.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a11116 = AbstractC22988p1.m66759a(c22961h113, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q4.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11116);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11116);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11116);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11116);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s11116 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h1111111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e1111111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s11116, strM51180h1111111111, modifierMo3471e1111111111, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue11116 = iconResource.intValue();
                                C27430e c27430eM107874S11116 = AbstractC34132o.m107874S(iIntValue11116, c28655q2, 6);
                                String strM51180h1111111112 = m51180h(iIntValue11116, c28655q2, 0);
                                Modifier modifierMo3471e1111111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S11116, strM51180h1111111112, modifierMo3471e1111111112, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h11116 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7111111 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q111110 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h11116, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111110, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111111) | (i7111111 & 29360128), 55290);
                        c28655q3 = c28655q111110;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                }
                c33252iM105489e = c33252iM105491g;
                C22961h c22961h114 = AbstractC22977m.f90654e;
                c2306l = C2299e.f9108K;
                z28 = z24;
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r114 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                if (z4) {
                    backgroundColor = C17919x.f69636m;
                } else if (z28) {
                    backgroundColor = c17723a2M51179g.getPressedColor();
                } else {
                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                }
                c33252i = c33252iM105489e;
                Modifier modifierM3358c114 = AbstractC1092a.m3358c(modifierM118994r114, backgroundColor, AbstractC17918w0.f69621a);
                if (c17723a2M51179g.getShowDashedBorder()) {
                    c2306l2 = c2306l;
                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    if (z26) {
                    }
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                    Modifier modifierM3393o11117 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c114.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a11117 = AbstractC22988p1.m66759a(c22961h114, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q4.m87165m();
                    Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11117);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11117);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11117);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11117);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s11117 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h1111111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e1111111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s11117, strM51180h1111111113, modifierMo3471e1111111113, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue11117 = iconResource.intValue();
                                C27430e c27430eM107874S11117 = AbstractC34132o.m107874S(iIntValue11117, c28655q2, 6);
                                String strM51180h1111111114 = m51180h(iIntValue11117, c28655q2, 0);
                                Modifier modifierMo3471e1111111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S11117, strM51180h1111111114, modifierMo3471e1111111114, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h11117 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7111112 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q111111 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h11117, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111111, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111112) | (i7111112 & 29360128), 55290);
                        c28655q3 = c28655q111111;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                }
                Modifier modifierM3393o11118 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c114.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a11118 = AbstractC22988p1.m66759a(c22961h114, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q4.m87165m();
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11118);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11118);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11118);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11118);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s11118 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h1111111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e1111111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s11118, strM51180h1111111115, modifierMo3471e1111111115, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue11118 = iconResource.intValue();
                            C27430e c27430eM107874S11118 = AbstractC34132o.m107874S(iIntValue11118, c28655q2, 6);
                            String strM51180h1111111116 = m51180h(iIntValue11118, c28655q2, 0);
                            Modifier modifierMo3471e1111111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S11118, strM51180h1111111116, modifierMo3471e1111111116, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h11118 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i7111113 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q111112 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h11118, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111112, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111113) | (i7111113 & 29360128), 55290);
                    c28655q3 = c28655q111112;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            } else {
                c28655q4.m87138X();
                z17 = z13;
                enumC16313m1 = enumC16313m0;
                z18 = z14;
                f17 = f14;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z15;
                i64 = i13;
                i65 = i14;
                f18 = f15;
                c28655q = c28655q4;
                f19 = f16;
                enumC17786s1 = enumC17786s0;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue11119 = ((Integer) obj2).intValue();
                        return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue11119);
                    }
                };
            }
        }
        i18 |= 805306368;
        i44 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i44 != 0) {
            i45 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (c28655q4.m87155h(z15)) {
                i46 = 4;
            } else {
                i46 = 2;
            }
            i45 = i16 | i46;
        } else {
            i45 = i16;
        }
        i47 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i47 != 0) {
            i45 |= 48;
        } else if ((i16 & 48) != 0) {
            if (c28655q4.m87149e(i13)) {
                i48 = 32;
            } else {
                i48 = 16;
            }
            i45 |= i48;
        }
        i49 = i45;
        i54 = i17 & 4096;
        if (i54 != 0) {
            i55 = i49;
            if ((i16 & 384) == 0) {
                if (c28655q4.m87149e(i14)) {
                    i56 = 256;
                } else {
                    i56 = 128;
                }
                i55 |= i56;
            }
            if ((i16 & 3072) == 0) {
                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                    if ((i16 & 4096) == 0) {
                        zM87157i = c28655q4.m87153g(c2886a);
                    } else {
                        zM87157i = c28655q4.m87157i(c2886a);
                    }
                    if (zM87157i) {
                        i75 = 2048;
                    }
                }
                i55 |= i75;
            }
            i57 = i55;
            i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i58 != 0) {
                i59 = i58;
                if ((i16 & 24576) == 0) {
                    if (!c28655q4.m87153g(f15)) {
                        i24 = 8192;
                    }
                    i57 |= i24;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q4.m87135U(i18 & 1, z16)) {
                    c28655q4.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f211111116 = f24;
                        if (i38 != 0) {
                            float f211111117 = 8;
                            float f211111118 = ((float) 0.5d) * f211111117;
                            float f3117 = ((float) 0.25d) * f211111117;
                            c22976l1 = new C22976l1(f211111118, f3117, f211111118, f3117);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f211111116;
                    } else {
                        if (i74 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i19 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i26 != 0) {
                            f16 = 4 * 1;
                        }
                        if (i28 != 0) {
                            enumC17786s2 = EnumC17786s0.NONE;
                        } else {
                            enumC17786s2 = enumC17786s0;
                        }
                        if (i34 != 0) {
                            z25 = true;
                        } else {
                            z25 = z14;
                        }
                        if (i36 != 0) {
                            f24 = 2 * 4;
                        } else {
                            f24 = f14;
                        }
                        float f211111119 = f24;
                        if (i38 != 0) {
                            float f2111111110 = 8;
                            float f2111111111 = ((float) 0.5d) * f2111111110;
                            float f3118 = ((float) 0.25d) * f2111111110;
                            c22976l1 = new C22976l1(f2111111111, f3118, f2111111111, f3118);
                        } else {
                            c22976l1 = interfaceC22973k1;
                        }
                        if (i44 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i47 != 0) {
                            i66 = 1;
                        } else {
                            i66 = i13;
                        }
                        if (i54 != 0) {
                            i67 = Integer.MAX_VALUE;
                        } else {
                            i67 = i14;
                        }
                        if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                            i57 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        z27 = z25;
                        if (i59 != 0) {
                            f25 = null;
                        } else {
                            f25 = f15;
                        }
                        i68 = i57;
                        interfaceC22973k3 = c22976l1;
                        enumC16313m3 = enumC16313m2;
                        f26 = f211111119;
                    }
                    c28655q4.m87175r();
                    c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                    i69 = a.f69260a[enumC17786s2.ordinal()];
                    if (i69 != 1) {
                        if (i69 != 2) {
                            c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                        } else {
                            if (i69 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33252iM105489e = AbstractC33253j.m105489e(f16);
                        }
                        C22961h c22961h115 = AbstractC22977m.f90654e;
                        c2306l = C2299e.f9108K;
                        z28 = z24;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM118994r115 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                        if (z4) {
                            backgroundColor = C17919x.f69636m;
                        } else if (z28) {
                            backgroundColor = c17723a2M51179g.getPressedColor();
                        } else {
                            backgroundColor = c17723a2M51179g.getBackgroundColor();
                        }
                        c33252i = c33252iM105489e;
                        Modifier modifierM3358c115 = AbstractC1092a.m3358c(modifierM118994r115, backgroundColor, AbstractC17918w0.f69621a);
                        if (c17723a2M51179g.getShowDashedBorder()) {
                            c2306l2 = c2306l;
                            modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                            c2314t2 = c2314t;
                        } else {
                            c2314t2 = c2314t;
                            c2306l2 = c2306l;
                            if (z26) {
                            }
                            modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                            Modifier modifierM3393o11119 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c115.mo3471e(modifierM44455h));
                            C22994r1 c22994r1M66759a11119 = AbstractC22988p1.m66759a(c22961h115, c2306l2, c28655q4, 54);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q4.m87165m();
                            Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q4, modifierM3393o11119);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a11119);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11119);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11119);
                            if (z27) {
                                c28655q4.m87150e0(755321030);
                                if (enumC16313m3 != null) {
                                    C27430e c27430eM53378s11119 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                    String strM51180h1111111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                    Modifier modifierMo3471e1111111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q4.m87150e0(1686948354);
                                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                    } else {
                                        c28655q4.m87150e0(1686949185);
                                        c28655q4.m87173q(false);
                                        iconColor2 = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM53378s11119, strM51180h1111111117, modifierMo3471e1111111117, iconColor2, c28655q4, 0, 0);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2 = c28655q4;
                                    c28655q2.m87150e0(755923019);
                                    iconResource = c17723a2M51179g.getIconResource();
                                    if (iconResource == null) {
                                        c28655q2.m87150e0(755923018);
                                        c28655q2.m87173q(false);
                                    } else {
                                        c28655q2.m87150e0(755923019);
                                        int iIntValue11119 = iconResource.intValue();
                                        C27430e c27430eM107874S11119 = AbstractC34132o.m107874S(iIntValue11119, c28655q2, 6);
                                        String strM51180h1111111118 = m51180h(iIntValue11119, c28655q2, 0);
                                        Modifier modifierMo3471e1111111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                        if (z28) {
                                            c28655q2.m87150e0(2129901195);
                                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                        } else {
                                            c28655q2.m87150e0(2129902026);
                                            c28655q2.m87173q(false);
                                            iconColor = c17723a2M51179g.getIconColor();
                                        }
                                        AbstractC15005f3.m43108b(c27430eM107874S11119, strM51180h1111111118, modifierMo3471e1111111118, iconColor, c28655q2, 0, 0);
                                        c28655q2.m87173q(false);
                                    }
                                    c28655q2.m87173q(false);
                                }
                                if (enumC16313m3 == null) {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    if (textResource != null) {
                                        z29 = true;
                                        if (AbstractC8693b.m21270d(textResource)) {
                                        }
                                        if (z36) {
                                            c28655q2.m87150e0(756591162);
                                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                            z37 = false;
                                            c28655q2.m87173q(false);
                                        } else {
                                            z37 = false;
                                            c28655q2.m87150e0(756729546);
                                            c28655q2.m87173q(false);
                                        }
                                    } else {
                                        z29 = true;
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                }
                                c28655q2.m87173q(z37);
                            } else {
                                c28655q2 = c28655q4;
                                z29 = true;
                                c28655q2.m87150e0(756739466);
                                c28655q2.m87173q(false);
                            }
                            if (textResource != null) {
                                c28655q2.m87150e0(756791236);
                                String strM21274h11119 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                                if (z28) {
                                    c28655q2.m87150e0(1686984191);
                                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                    z35 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z35 = false;
                                    c28655q2.m87150e0(1686984929);
                                    c28655q2.m87173q(false);
                                    textColor = c17723a2M51179g.getTextColor();
                                }
                                int i7111114 = i68 << 9;
                                f19 = f16;
                                C28655q c28655q111113 = c28655q2;
                                z34 = z29;
                                AbstractC30795n.m94707h(strM21274h11119, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111113, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111114) | (i7111114 & 29360128), 55290);
                                c28655q3 = c28655q111113;
                                c28655q3.m87173q(z35);
                            } else {
                                c28655q3 = c28655q2;
                                f19 = f16;
                                z34 = z29;
                                c28655q3.m87150e0(757114442);
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z34);
                            z17 = z28;
                            interfaceC22973k2 = interfaceC22973k3;
                            enumC16313m1 = enumC16313m3;
                            f17 = f26;
                            c28655q = c28655q3;
                            i64 = i66;
                            i65 = i67;
                            c2886a2 = n13;
                            f18 = f25;
                            enumC17786s1 = enumC17786s2;
                            z18 = z27;
                            z19 = z26;
                        }
                        Modifier modifierM3393o111110 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c115.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a111110 = AbstractC22988p1.m66759a(c22961h115, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q4.m87165m();
                        Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111110);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111110);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111110);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111110);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s111110 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h1111111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e1111111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s111110, strM51180h1111111119, modifierMo3471e1111111119, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue111110 = iconResource.intValue();
                                    C27430e c27430eM107874S111110 = AbstractC34132o.m107874S(iIntValue111110, c28655q2, 6);
                                    String strM51180h11111111110 = m51180h(iIntValue111110, c28655q2, 0);
                                    Modifier modifierMo3471e11111111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S111110, strM51180h11111111110, modifierMo3471e11111111110, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h111110 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7111115 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q111114 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h111110, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111114, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111115) | (i7111115 & 29360128), 55290);
                            c28655q3 = c28655q111114;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    } else {
                        c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                    }
                    c33252iM105489e = c33252iM105491g;
                    C22961h c22961h116 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r116 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c116 = AbstractC1092a.m3358c(modifierM118994r116, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o111111 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c116.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a111111 = AbstractC22988p1.m66759a(c22961h116, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q4.m87165m();
                        Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111111);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111111);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111111);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111111);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s111111 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11111111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11111111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s111111, strM51180h11111111111, modifierMo3471e11111111111, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue111111 = iconResource.intValue();
                                    C27430e c27430eM107874S111111 = AbstractC34132o.m107874S(iIntValue111111, c28655q2, 6);
                                    String strM51180h11111111112 = m51180h(iIntValue111111, c28655q2, 0);
                                    Modifier modifierMo3471e11111111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S111111, strM51180h11111111112, modifierMo3471e11111111112, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h111111 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7111116 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q111115 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h111111, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111115, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111116) | (i7111116 & 29360128), 55290);
                            c28655q3 = c28655q111115;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o111112 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c116.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a111112 = AbstractC22988p1.m66759a(c22961h116, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q4.m87165m();
                    Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111112);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111112);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111112);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111112);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s111112 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h11111111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e11111111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s111112, strM51180h11111111113, modifierMo3471e11111111113, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue111112 = iconResource.intValue();
                                C27430e c27430eM107874S111112 = AbstractC34132o.m107874S(iIntValue111112, c28655q2, 6);
                                String strM51180h11111111114 = m51180h(iIntValue111112, c28655q2, 0);
                                Modifier modifierMo3471e11111111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S111112, strM51180h11111111114, modifierMo3471e11111111114, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h111112 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7111117 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q111116 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h111112, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111116, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111117) | (i7111117 & 29360128), 55290);
                        c28655q3 = c28655q111116;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c28655q4.m87138X();
                    z17 = z13;
                    enumC16313m1 = enumC16313m0;
                    z18 = z14;
                    f17 = f14;
                    interfaceC22973k2 = interfaceC22973k1;
                    z19 = z15;
                    i64 = i13;
                    i65 = i14;
                    f18 = f15;
                    c28655q = c28655q4;
                    f19 = f16;
                    enumC17786s1 = enumC17786s0;
                    c2886a2 = c2886a;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue111113 = ((Integer) obj2).intValue();
                            return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue111113);
                        }
                    };
                }
            }
            i57 |= 24576;
            i59 = i58;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z16)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f2111111112 = f24;
                    if (i38 != 0) {
                        float f2111111113 = 8;
                        float f2111111114 = ((float) 0.5d) * f2111111113;
                        float f3119 = ((float) 0.25d) * f2111111113;
                        c22976l1 = new C22976l1(f2111111114, f3119, f2111111114, f3119);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f2111111112;
                } else {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f2111111115 = f24;
                    if (i38 != 0) {
                        float f2111111116 = 8;
                        float f2111111117 = ((float) 0.5d) * f2111111116;
                        float f31110 = ((float) 0.25d) * f2111111116;
                        c22976l1 = new C22976l1(f2111111117, f31110, f2111111117, f31110);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f2111111115;
                }
                c28655q4.m87175r();
                c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                i69 = a.f69260a[enumC17786s2.ordinal()];
                if (i69 != 1) {
                    if (i69 != 2) {
                        c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                    } else {
                        if (i69 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c33252iM105489e = AbstractC33253j.m105489e(f16);
                    }
                    C22961h c22961h117 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r117 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c117 = AbstractC1092a.m3358c(modifierM118994r117, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o111113 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c117.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a111113 = AbstractC22988p1.m66759a(c22961h117, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q4.m87165m();
                        Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111113);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111113);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111113);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s111113 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h11111111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e11111111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s111113, strM51180h11111111115, modifierMo3471e11111111115, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue111113 = iconResource.intValue();
                                    C27430e c27430eM107874S111113 = AbstractC34132o.m107874S(iIntValue111113, c28655q2, 6);
                                    String strM51180h11111111116 = m51180h(iIntValue111113, c28655q2, 0);
                                    Modifier modifierMo3471e11111111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S111113, strM51180h11111111116, modifierMo3471e11111111116, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h111113 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i7111118 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q111117 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h111113, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111117, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111118) | (i7111118 & 29360128), 55290);
                            c28655q3 = c28655q111117;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o111114 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c117.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a111114 = AbstractC22988p1.m66759a(c22961h117, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q4.m87165m();
                    Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111114);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111114);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111114);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s111114 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h11111111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e11111111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s111114, strM51180h11111111117, modifierMo3471e11111111117, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue111114 = iconResource.intValue();
                                C27430e c27430eM107874S111114 = AbstractC34132o.m107874S(iIntValue111114, c28655q2, 6);
                                String strM51180h11111111118 = m51180h(iIntValue111114, c28655q2, 0);
                                Modifier modifierMo3471e11111111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S111114, strM51180h11111111118, modifierMo3471e11111111118, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h111114 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i7111119 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q111118 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h111114, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111118, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i7111119) | (i7111119 & 29360128), 55290);
                        c28655q3 = c28655q111118;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                }
                c33252iM105489e = c33252iM105491g;
                C22961h c22961h118 = AbstractC22977m.f90654e;
                c2306l = C2299e.f9108K;
                z28 = z24;
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r118 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                if (z4) {
                    backgroundColor = C17919x.f69636m;
                } else if (z28) {
                    backgroundColor = c17723a2M51179g.getPressedColor();
                } else {
                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                }
                c33252i = c33252iM105489e;
                Modifier modifierM3358c118 = AbstractC1092a.m3358c(modifierM118994r118, backgroundColor, AbstractC17918w0.f69621a);
                if (c17723a2M51179g.getShowDashedBorder()) {
                    c2306l2 = c2306l;
                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    if (z26) {
                    }
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                    Modifier modifierM3393o111115 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c118.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a111115 = AbstractC22988p1.m66759a(c22961h118, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q4.m87165m();
                    Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111115);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111115);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111115);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111115);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s111115 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h11111111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e11111111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s111115, strM51180h11111111119, modifierMo3471e11111111119, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue111115 = iconResource.intValue();
                                C27430e c27430eM107874S111115 = AbstractC34132o.m107874S(iIntValue111115, c28655q2, 6);
                                String strM51180h111111111110 = m51180h(iIntValue111115, c28655q2, 0);
                                Modifier modifierMo3471e111111111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S111115, strM51180h111111111110, modifierMo3471e111111111110, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h111115 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71111110 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q111119 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h111115, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q111119, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111110) | (i71111110 & 29360128), 55290);
                        c28655q3 = c28655q111119;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                }
                Modifier modifierM3393o111116 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c118.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a111116 = AbstractC22988p1.m66759a(c22961h118, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q4.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111116);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111116);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111116);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111116);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s111116 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h111111111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e111111111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s111116, strM51180h111111111111, modifierMo3471e111111111111, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue111116 = iconResource.intValue();
                            C27430e c27430eM107874S111116 = AbstractC34132o.m107874S(iIntValue111116, c28655q2, 6);
                            String strM51180h111111111112 = m51180h(iIntValue111116, c28655q2, 0);
                            Modifier modifierMo3471e111111111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S111116, strM51180h111111111112, modifierMo3471e111111111112, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h111116 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i71111111 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q1111110 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h111116, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111110, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111111) | (i71111111 & 29360128), 55290);
                    c28655q3 = c28655q1111110;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            } else {
                c28655q4.m87138X();
                z17 = z13;
                enumC16313m1 = enumC16313m0;
                z18 = z14;
                f17 = f14;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z15;
                i64 = i13;
                i65 = i14;
                f18 = f15;
                c28655q = c28655q4;
                f19 = f16;
                enumC17786s1 = enumC17786s0;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue111117 = ((Integer) obj2).intValue();
                        return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue111117);
                    }
                };
            }
        }
        i55 = i49 | 384;
        if ((i16 & 3072) == 0) {
            if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                if ((i16 & 4096) == 0) {
                    zM87157i = c28655q4.m87153g(c2886a);
                } else {
                    zM87157i = c28655q4.m87157i(c2886a);
                }
                if (zM87157i) {
                    i75 = 2048;
                }
            }
            i55 |= i75;
        }
        i57 = i55;
        i58 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i58 != 0) {
            i59 = i58;
            if ((i16 & 24576) == 0) {
                if (!c28655q4.m87153g(f15)) {
                    i24 = 8192;
                }
                i57 |= i24;
            }
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q4.m87135U(i18 & 1, z16)) {
                c28655q4.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f2111111118 = f24;
                    if (i38 != 0) {
                        float f2111111119 = 8;
                        float f21111111110 = ((float) 0.5d) * f2111111119;
                        float f31111 = ((float) 0.25d) * f2111111119;
                        c22976l1 = new C22976l1(f21111111110, f31111, f21111111110, f31111);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f2111111118;
                } else {
                    if (i74 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i19 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i26 != 0) {
                        f16 = 4 * 1;
                    }
                    if (i28 != 0) {
                        enumC17786s2 = EnumC17786s0.NONE;
                    } else {
                        enumC17786s2 = enumC17786s0;
                    }
                    if (i34 != 0) {
                        z25 = true;
                    } else {
                        z25 = z14;
                    }
                    if (i36 != 0) {
                        f24 = 2 * 4;
                    } else {
                        f24 = f14;
                    }
                    float f21111111111 = f24;
                    if (i38 != 0) {
                        float f21111111112 = 8;
                        float f21111111113 = ((float) 0.5d) * f21111111112;
                        float f31112 = ((float) 0.25d) * f21111111112;
                        c22976l1 = new C22976l1(f21111111113, f31112, f21111111113, f31112);
                    } else {
                        c22976l1 = interfaceC22973k1;
                    }
                    if (i44 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i47 != 0) {
                        i66 = 1;
                    } else {
                        i66 = i13;
                    }
                    if (i54 != 0) {
                        i67 = Integer.MAX_VALUE;
                    } else {
                        i67 = i14;
                    }
                    if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                        i57 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    z27 = z25;
                    if (i59 != 0) {
                        f25 = null;
                    } else {
                        f25 = f15;
                    }
                    i68 = i57;
                    interfaceC22973k3 = c22976l1;
                    enumC16313m3 = enumC16313m2;
                    f26 = f21111111111;
                }
                c28655q4.m87175r();
                c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
                i69 = a.f69260a[enumC17786s2.ordinal()];
                if (i69 != 1) {
                    if (i69 != 2) {
                        c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                    } else {
                        if (i69 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c33252iM105489e = AbstractC33253j.m105489e(f16);
                    }
                    C22961h c22961h119 = AbstractC22977m.f90654e;
                    c2306l = C2299e.f9108K;
                    z28 = z24;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118994r119 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                    if (z4) {
                        backgroundColor = C17919x.f69636m;
                    } else if (z28) {
                        backgroundColor = c17723a2M51179g.getPressedColor();
                    } else {
                        backgroundColor = c17723a2M51179g.getBackgroundColor();
                    }
                    c33252i = c33252iM105489e;
                    Modifier modifierM3358c119 = AbstractC1092a.m3358c(modifierM118994r119, backgroundColor, AbstractC17918w0.f69621a);
                    if (c17723a2M51179g.getShowDashedBorder()) {
                        c2306l2 = c2306l;
                        modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                        c2314t2 = c2314t;
                    } else {
                        c2314t2 = c2314t;
                        c2306l2 = c2306l;
                        if (z26) {
                        }
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                        Modifier modifierM3393o111117 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c119.mo3471e(modifierM44455h));
                        C22994r1 c22994r1M66759a111117 = AbstractC22988p1.m66759a(c22961h119, c2306l2, c28655q4, 54);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q4.m87165m();
                        Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111117);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111117);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111117);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111117);
                        if (z27) {
                            c28655q4.m87150e0(755321030);
                            if (enumC16313m3 != null) {
                                C27430e c27430eM53378s111117 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                                String strM51180h111111111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                                Modifier modifierMo3471e111111111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q4.m87150e0(1686948354);
                                    iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                                } else {
                                    c28655q4.m87150e0(1686949185);
                                    c28655q4.m87173q(false);
                                    iconColor2 = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM53378s111117, strM51180h111111111113, modifierMo3471e111111111113, iconColor2, c28655q4, 0, 0);
                                c28655q2 = c28655q4;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2 = c28655q4;
                                c28655q2.m87150e0(755923019);
                                iconResource = c17723a2M51179g.getIconResource();
                                if (iconResource == null) {
                                    c28655q2.m87150e0(755923018);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(755923019);
                                    int iIntValue111117 = iconResource.intValue();
                                    C27430e c27430eM107874S111117 = AbstractC34132o.m107874S(iIntValue111117, c28655q2, 6);
                                    String strM51180h111111111114 = m51180h(iIntValue111117, c28655q2, 0);
                                    Modifier modifierMo3471e111111111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                    if (z28) {
                                        c28655q2.m87150e0(2129901195);
                                        iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                    } else {
                                        c28655q2.m87150e0(2129902026);
                                        c28655q2.m87173q(false);
                                        iconColor = c17723a2M51179g.getIconColor();
                                    }
                                    AbstractC15005f3.m43108b(c27430eM107874S111117, strM51180h111111111114, modifierMo3471e111111111114, iconColor, c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            }
                            if (enumC16313m3 == null) {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                if (textResource != null) {
                                    z29 = true;
                                    if (AbstractC8693b.m21270d(textResource)) {
                                    }
                                    if (z36) {
                                        c28655q2.m87150e0(756591162);
                                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                        z37 = false;
                                        c28655q2.m87173q(false);
                                    } else {
                                        z37 = false;
                                        c28655q2.m87150e0(756729546);
                                        c28655q2.m87173q(false);
                                    }
                                } else {
                                    z29 = true;
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(z37);
                        } else {
                            c28655q2 = c28655q4;
                            z29 = true;
                            c28655q2.m87150e0(756739466);
                            c28655q2.m87173q(false);
                        }
                        if (textResource != null) {
                            c28655q2.m87150e0(756791236);
                            String strM21274h111117 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                            if (z28) {
                                c28655q2.m87150e0(1686984191);
                                textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                                z35 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z35 = false;
                                c28655q2.m87150e0(1686984929);
                                c28655q2.m87173q(false);
                                textColor = c17723a2M51179g.getTextColor();
                            }
                            int i71111112 = i68 << 9;
                            f19 = f16;
                            C28655q c28655q1111111 = c28655q2;
                            z34 = z29;
                            AbstractC30795n.m94707h(strM21274h111117, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111111, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111112) | (i71111112 & 29360128), 55290);
                            c28655q3 = c28655q1111111;
                            c28655q3.m87173q(z35);
                        } else {
                            c28655q3 = c28655q2;
                            f19 = f16;
                            z34 = z29;
                            c28655q3.m87150e0(757114442);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z34);
                        z17 = z28;
                        interfaceC22973k2 = interfaceC22973k3;
                        enumC16313m1 = enumC16313m3;
                        f17 = f26;
                        c28655q = c28655q3;
                        i64 = i66;
                        i65 = i67;
                        c2886a2 = n13;
                        f18 = f25;
                        enumC17786s1 = enumC17786s2;
                        z18 = z27;
                        z19 = z26;
                    }
                    Modifier modifierM3393o111118 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c119.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a111118 = AbstractC22988p1.m66759a(c22961h119, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q4.m87165m();
                    Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111118);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111118);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111118);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111118);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s111118 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h111111111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e111111111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s111118, strM51180h111111111115, modifierMo3471e111111111115, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue111118 = iconResource.intValue();
                                C27430e c27430eM107874S111118 = AbstractC34132o.m107874S(iIntValue111118, c28655q2, 6);
                                String strM51180h111111111116 = m51180h(iIntValue111118, c28655q2, 0);
                                Modifier modifierMo3471e111111111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S111118, strM51180h111111111116, modifierMo3471e111111111116, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h111118 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71111113 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1111112 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h111118, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111112, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111113) | (i71111113 & 29360128), 55290);
                        c28655q3 = c28655q1111112;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                } else {
                    c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
                }
                c33252iM105489e = c33252iM105491g;
                C22961h c22961h1110 = AbstractC22977m.f90654e;
                c2306l = C2299e.f9108K;
                z28 = z24;
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r1110 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                if (z4) {
                    backgroundColor = C17919x.f69636m;
                } else if (z28) {
                    backgroundColor = c17723a2M51179g.getPressedColor();
                } else {
                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                }
                c33252i = c33252iM105489e;
                Modifier modifierM3358c1110 = AbstractC1092a.m3358c(modifierM118994r1110, backgroundColor, AbstractC17918w0.f69621a);
                if (c17723a2M51179g.getShowDashedBorder()) {
                    c2306l2 = c2306l;
                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    if (z26) {
                    }
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                    Modifier modifierM3393o111119 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1110.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a111119 = AbstractC22988p1.m66759a(c22961h1110, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q4.m87165m();
                    Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q4, modifierM3393o111119);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a111119);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111119);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111119);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s111119 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h111111111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e111111111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s111119, strM51180h111111111117, modifierMo3471e111111111117, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue111119 = iconResource.intValue();
                                C27430e c27430eM107874S111119 = AbstractC34132o.m107874S(iIntValue111119, c28655q2, 6);
                                String strM51180h111111111118 = m51180h(iIntValue111119, c28655q2, 0);
                                Modifier modifierMo3471e111111111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S111119, strM51180h111111111118, modifierMo3471e111111111118, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h111119 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71111114 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1111113 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h111119, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111113, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111114) | (i71111114 & 29360128), 55290);
                        c28655q3 = c28655q1111113;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                }
                Modifier modifierM3393o1111110 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1110.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a1111110 = AbstractC22988p1.m66759a(c22961h1110, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q4.m87165m();
                Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111110);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111110);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111110);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111110);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s1111110 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h111111111119 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e111111111119 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s1111110, strM51180h111111111119, modifierMo3471e111111111119, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue1111110 = iconResource.intValue();
                            C27430e c27430eM107874S1111110 = AbstractC34132o.m107874S(iIntValue1111110, c28655q2, 6);
                            String strM51180h1111111111110 = m51180h(iIntValue1111110, c28655q2, 0);
                            Modifier modifierMo3471e1111111111110 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S1111110, strM51180h1111111111110, modifierMo3471e1111111111110, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h1111110 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i71111115 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q1111114 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h1111110, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111114, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111115) | (i71111115 & 29360128), 55290);
                    c28655q3 = c28655q1111114;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            } else {
                c28655q4.m87138X();
                z17 = z13;
                enumC16313m1 = enumC16313m0;
                z18 = z14;
                f17 = f14;
                interfaceC22973k2 = interfaceC22973k1;
                z19 = z15;
                i64 = i13;
                i65 = i14;
                f18 = f15;
                c28655q = c28655q4;
                f19 = f16;
                enumC17786s1 = enumC17786s0;
                c2886a2 = c2886a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue1111111 = ((Integer) obj2).intValue();
                        return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue1111111);
                    }
                };
            }
        }
        i57 |= 24576;
        i59 = i58;
        if ((i18 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q4.m87135U(i18 & 1, z16)) {
            c28655q4.m87140Z();
            if ((i15 & 1) != 0) {
                if (i74 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i19 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i26 != 0) {
                    f16 = 4 * 1;
                }
                if (i28 != 0) {
                    enumC17786s2 = EnumC17786s0.NONE;
                } else {
                    enumC17786s2 = enumC17786s0;
                }
                if (i34 != 0) {
                    z25 = true;
                } else {
                    z25 = z14;
                }
                if (i36 != 0) {
                    f24 = 2 * 4;
                } else {
                    f24 = f14;
                }
                float f21111111114 = f24;
                if (i38 != 0) {
                    float f21111111115 = 8;
                    float f21111111116 = ((float) 0.5d) * f21111111115;
                    float f31113 = ((float) 0.25d) * f21111111115;
                    c22976l1 = new C22976l1(f21111111116, f31113, f21111111116, f31113);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                if (i44 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i47 != 0) {
                    i66 = 1;
                } else {
                    i66 = i13;
                }
                if (i54 != 0) {
                    i67 = Integer.MAX_VALUE;
                } else {
                    i67 = i14;
                }
                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                    i57 &= -7169;
                } else {
                    n13 = c2886a;
                }
                z27 = z25;
                if (i59 != 0) {
                    f25 = null;
                } else {
                    f25 = f15;
                }
                i68 = i57;
                interfaceC22973k3 = c22976l1;
                enumC16313m3 = enumC16313m2;
                f26 = f21111111114;
            } else {
                if (i74 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i19 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i26 != 0) {
                    f16 = 4 * 1;
                }
                if (i28 != 0) {
                    enumC17786s2 = EnumC17786s0.NONE;
                } else {
                    enumC17786s2 = enumC17786s0;
                }
                if (i34 != 0) {
                    z25 = true;
                } else {
                    z25 = z14;
                }
                if (i36 != 0) {
                    f24 = 2 * 4;
                } else {
                    f24 = f14;
                }
                float f21111111117 = f24;
                if (i38 != 0) {
                    float f21111111118 = 8;
                    float f21111111119 = ((float) 0.5d) * f21111111118;
                    float f31114 = ((float) 0.25d) * f21111111118;
                    c22976l1 = new C22976l1(f21111111119, f31114, f21111111119, f31114);
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                if (i44 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i47 != 0) {
                    i66 = 1;
                } else {
                    i66 = i13;
                }
                if (i54 != 0) {
                    i67 = Integer.MAX_VALUE;
                } else {
                    i67 = i14;
                }
                if ((i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q4, 6).getN9();
                    i57 &= -7169;
                } else {
                    n13 = c2886a;
                }
                z27 = z25;
                if (i59 != 0) {
                    f25 = null;
                } else {
                    f25 = f15;
                }
                i68 = i57;
                interfaceC22973k3 = c22976l1;
                enumC16313m3 = enumC16313m2;
                f26 = f21111111117;
            }
            c28655q4.m87175r();
            c17723a2M51179g = m51179g(trendTypeState, c28655q4, (i18 >> 6) & 14);
            i69 = a.f69260a[enumC17786s2.ordinal()];
            if (i69 != 1) {
                if (i69 != 2) {
                    c33252iM105491g = AbstractC33253j.m105491g(f16, 0.0f, 0.0f, f16, 6);
                } else {
                    if (i69 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c33252iM105489e = AbstractC33253j.m105489e(f16);
                }
                C22961h c22961h1111 = AbstractC22977m.f90654e;
                c2306l = C2299e.f9108K;
                z28 = z24;
                c2314t = C2314t.f9131w;
                Modifier modifierM118994r1111 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                if (z4) {
                    backgroundColor = C17919x.f69636m;
                } else if (z28) {
                    backgroundColor = c17723a2M51179g.getPressedColor();
                } else {
                    backgroundColor = c17723a2M51179g.getBackgroundColor();
                }
                c33252i = c33252iM105489e;
                Modifier modifierM3358c1111 = AbstractC1092a.m3358c(modifierM118994r1111, backgroundColor, AbstractC17918w0.f69621a);
                if (c17723a2M51179g.getShowDashedBorder()) {
                    c2306l2 = c2306l;
                    modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    if (z26) {
                    }
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                    Modifier modifierM3393o1111111 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1111.mo3471e(modifierM44455h));
                    C22994r1 c22994r1M66759a1111111 = AbstractC22988p1.m66759a(c22961h1111, c2306l2, c28655q4, 54);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q4.m87165m();
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111111);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111111);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111111);
                    if (z27) {
                        c28655q4.m87150e0(755321030);
                        if (enumC16313m3 != null) {
                            C27430e c27430eM53378s1111111 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                            String strM51180h1111111111111 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                            Modifier modifierMo3471e1111111111111 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q4.m87150e0(1686948354);
                                iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                            } else {
                                c28655q4.m87150e0(1686949185);
                                c28655q4.m87173q(false);
                                iconColor2 = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM53378s1111111, strM51180h1111111111111, modifierMo3471e1111111111111, iconColor2, c28655q4, 0, 0);
                            c28655q2 = c28655q4;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2 = c28655q4;
                            c28655q2.m87150e0(755923019);
                            iconResource = c17723a2M51179g.getIconResource();
                            if (iconResource == null) {
                                c28655q2.m87150e0(755923018);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(755923019);
                                int iIntValue1111111 = iconResource.intValue();
                                C27430e c27430eM107874S1111111 = AbstractC34132o.m107874S(iIntValue1111111, c28655q2, 6);
                                String strM51180h1111111111112 = m51180h(iIntValue1111111, c28655q2, 0);
                                Modifier modifierMo3471e1111111111112 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                                if (z28) {
                                    c28655q2.m87150e0(2129901195);
                                    iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                                } else {
                                    c28655q2.m87150e0(2129902026);
                                    c28655q2.m87173q(false);
                                    iconColor = c17723a2M51179g.getIconColor();
                                }
                                AbstractC15005f3.m43108b(c27430eM107874S1111111, strM51180h1111111111112, modifierMo3471e1111111111112, iconColor, c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        }
                        if (enumC16313m3 == null) {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            if (textResource != null) {
                                z29 = true;
                                if (AbstractC8693b.m21270d(textResource)) {
                                }
                                if (z36) {
                                    c28655q2.m87150e0(756591162);
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                    z37 = false;
                                    c28655q2.m87173q(false);
                                } else {
                                    z37 = false;
                                    c28655q2.m87150e0(756729546);
                                    c28655q2.m87173q(false);
                                }
                            } else {
                                z29 = true;
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(z37);
                    } else {
                        c28655q2 = c28655q4;
                        z29 = true;
                        c28655q2.m87150e0(756739466);
                        c28655q2.m87173q(false);
                    }
                    if (textResource != null) {
                        c28655q2.m87150e0(756791236);
                        String strM21274h1111111 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                        if (z28) {
                            c28655q2.m87150e0(1686984191);
                            textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                            z35 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z35 = false;
                            c28655q2.m87150e0(1686984929);
                            c28655q2.m87173q(false);
                            textColor = c17723a2M51179g.getTextColor();
                        }
                        int i71111116 = i68 << 9;
                        f19 = f16;
                        C28655q c28655q1111115 = c28655q2;
                        z34 = z29;
                        AbstractC30795n.m94707h(strM21274h1111111, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111115, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111116) | (i71111116 & 29360128), 55290);
                        c28655q3 = c28655q1111115;
                        c28655q3.m87173q(z35);
                    } else {
                        c28655q3 = c28655q2;
                        f19 = f16;
                        z34 = z29;
                        c28655q3.m87150e0(757114442);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    z17 = z28;
                    interfaceC22973k2 = interfaceC22973k3;
                    enumC16313m1 = enumC16313m3;
                    f17 = f26;
                    c28655q = c28655q3;
                    i64 = i66;
                    i65 = i67;
                    c2886a2 = n13;
                    f18 = f25;
                    enumC17786s1 = enumC17786s2;
                    z18 = z27;
                    z19 = z26;
                }
                Modifier modifierM3393o1111112 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1111.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a1111112 = AbstractC22988p1.m66759a(c22961h1111, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q4.m87165m();
                Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111112);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111112);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111112);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s1111112 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h1111111111113 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e1111111111113 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s1111112, strM51180h1111111111113, modifierMo3471e1111111111113, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue1111112 = iconResource.intValue();
                            C27430e c27430eM107874S1111112 = AbstractC34132o.m107874S(iIntValue1111112, c28655q2, 6);
                            String strM51180h1111111111114 = m51180h(iIntValue1111112, c28655q2, 0);
                            Modifier modifierMo3471e1111111111114 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S1111112, strM51180h1111111111114, modifierMo3471e1111111111114, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h1111112 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i71111117 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q1111116 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h1111112, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111116, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111117) | (i71111117 & 29360128), 55290);
                    c28655q3 = c28655q1111116;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            } else {
                c33252iM105491g = AbstractC33253j.m105491g(0.0f, f16, f16, 0.0f, 9);
            }
            c33252iM105489e = c33252iM105491g;
            C22961h c22961h1112 = AbstractC22977m.f90654e;
            c2306l = C2299e.f9108K;
            z28 = z24;
            c2314t = C2314t.f9131w;
            Modifier modifierM118994r1112 = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
            if (z4) {
                backgroundColor = C17919x.f69636m;
            } else if (z28) {
                backgroundColor = c17723a2M51179g.getPressedColor();
            } else {
                backgroundColor = c17723a2M51179g.getBackgroundColor();
            }
            c33252i = c33252iM105489e;
            Modifier modifierM3358c1112 = AbstractC1092a.m3358c(modifierM118994r1112, backgroundColor, AbstractC17918w0.f69621a);
            if (c17723a2M51179g.getShowDashedBorder()) {
                c2306l2 = c2306l;
                modifierM44455h = AbstractC15679g.m44107d(c2314t, 1, c17723a2M51179g.getBorderColor(), c33252i, 4, 2);
                c2314t2 = c2314t;
            } else {
                c2314t2 = c2314t;
                c2306l2 = c2306l;
                if (z26) {
                }
                modifierM44455h = AbstractC15751g.m44455h(c2314t2, 1, c17723a2M51179g.getBorderColor(), c33252i);
                Modifier modifierM3393o1111113 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1112.mo3471e(modifierM44455h));
                C22994r1 c22994r1M66759a1111113 = AbstractC22988p1.m66759a(c22961h1112, c2306l2, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q4.m87165m();
                Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111113);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111113);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111113);
                if (z27) {
                    c28655q4.m87150e0(755321030);
                    if (enumC16313m3 != null) {
                        C27430e c27430eM53378s1111113 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                        String strM51180h1111111111115 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                        Modifier modifierMo3471e1111111111115 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q4.m87150e0(1686948354);
                            iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                        } else {
                            c28655q4.m87150e0(1686949185);
                            c28655q4.m87173q(false);
                            iconColor2 = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s1111113, strM51180h1111111111115, modifierMo3471e1111111111115, iconColor2, c28655q4, 0, 0);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(755923019);
                        iconResource = c17723a2M51179g.getIconResource();
                        if (iconResource == null) {
                            c28655q2.m87150e0(755923018);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(755923019);
                            int iIntValue1111113 = iconResource.intValue();
                            C27430e c27430eM107874S1111113 = AbstractC34132o.m107874S(iIntValue1111113, c28655q2, 6);
                            String strM51180h1111111111116 = m51180h(iIntValue1111113, c28655q2, 0);
                            Modifier modifierMo3471e1111111111116 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                            if (z28) {
                                c28655q2.m87150e0(2129901195);
                                iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                            } else {
                                c28655q2.m87150e0(2129902026);
                                c28655q2.m87173q(false);
                                iconColor = c17723a2M51179g.getIconColor();
                            }
                            AbstractC15005f3.m43108b(c27430eM107874S1111113, strM51180h1111111111116, modifierMo3471e1111111111116, iconColor, c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    }
                    if (enumC16313m3 == null) {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        if (textResource != null) {
                            z29 = true;
                            if (AbstractC8693b.m21270d(textResource)) {
                            }
                            if (z36) {
                                c28655q2.m87150e0(756591162);
                                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                                z37 = false;
                                c28655q2.m87173q(false);
                            } else {
                                z37 = false;
                                c28655q2.m87150e0(756729546);
                                c28655q2.m87173q(false);
                            }
                        } else {
                            z29 = true;
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z37);
                } else {
                    c28655q2 = c28655q4;
                    z29 = true;
                    c28655q2.m87150e0(756739466);
                    c28655q2.m87173q(false);
                }
                if (textResource != null) {
                    c28655q2.m87150e0(756791236);
                    String strM21274h1111113 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                    if (z28) {
                        c28655q2.m87150e0(1686984191);
                        textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                        z35 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z35 = false;
                        c28655q2.m87150e0(1686984929);
                        c28655q2.m87173q(false);
                        textColor = c17723a2M51179g.getTextColor();
                    }
                    int i71111118 = i68 << 9;
                    f19 = f16;
                    C28655q c28655q1111117 = c28655q2;
                    z34 = z29;
                    AbstractC30795n.m94707h(strM21274h1111113, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111117, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111118) | (i71111118 & 29360128), 55290);
                    c28655q3 = c28655q1111117;
                    c28655q3.m87173q(z35);
                } else {
                    c28655q3 = c28655q2;
                    f19 = f16;
                    z34 = z29;
                    c28655q3.m87150e0(757114442);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                z17 = z28;
                interfaceC22973k2 = interfaceC22973k3;
                enumC16313m1 = enumC16313m3;
                f17 = f26;
                c28655q = c28655q3;
                i64 = i66;
                i65 = i67;
                c2886a2 = n13;
                f18 = f25;
                enumC17786s1 = enumC17786s2;
                z18 = z27;
                z19 = z26;
            }
            Modifier modifierM3393o1111114 = AbstractC1099a.m3393o(interfaceC22973k3, modifierM3358c1112.mo3471e(modifierM44455h));
            C22994r1 c22994r1M66759a1111114 = AbstractC22988p1.m66759a(c22961h1112, c2306l2, c28655q4, 54);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q4.m87165m();
            Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q4, modifierM3393o1111114);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a1111114);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111114);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111114);
            if (z27) {
                c28655q4.m87150e0(755321030);
                if (enumC16313m3 != null) {
                    C27430e c27430eM53378s1111114 = AbstractC18489d0.m53378s(c28655q4, 755324223, enumC16313m3, c28655q4, 6);
                    String strM51180h1111111111117 = m51180h(enumC16313m3.toWhoopIcon(), c28655q4, 0);
                    Modifier modifierMo3471e1111111111117 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                    if (z28) {
                        c28655q4.m87150e0(1686948354);
                        iconColor2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q4, 6, false);
                    } else {
                        c28655q4.m87150e0(1686949185);
                        c28655q4.m87173q(false);
                        iconColor2 = c17723a2M51179g.getIconColor();
                    }
                    AbstractC15005f3.m43108b(c27430eM53378s1111114, strM51180h1111111111117, modifierMo3471e1111111111117, iconColor2, c28655q4, 0, 0);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(755923019);
                    iconResource = c17723a2M51179g.getIconResource();
                    if (iconResource == null) {
                        c28655q2.m87150e0(755923018);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(755923019);
                        int iIntValue1111114 = iconResource.intValue();
                        C27430e c27430eM107874S1111114 = AbstractC34132o.m107874S(iIntValue1111114, c28655q2, 6);
                        String strM51180h1111111111118 = m51180h(iIntValue1111114, c28655q2, 0);
                        Modifier modifierMo3471e1111111111118 = AbstractC1102d.m3415l(f26, c2314t2).mo3471e(new VerticalAlignElement(c2306l2));
                        if (z28) {
                            c28655q2.m87150e0(2129901195);
                            iconColor = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
                        } else {
                            c28655q2.m87150e0(2129902026);
                            c28655q2.m87173q(false);
                            iconColor = c17723a2M51179g.getIconColor();
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S1111114, strM51180h1111111111118, modifierMo3471e1111111111118, iconColor, c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                }
                if (enumC16313m3 == null) {
                    if (textResource != null) {
                        z29 = true;
                        if (AbstractC8693b.m21270d(textResource)) {
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        z29 = true;
                    }
                    if (z36) {
                        c28655q2.m87150e0(756591162);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                        z37 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z37 = false;
                        c28655q2.m87150e0(756729546);
                        c28655q2.m87173q(false);
                    }
                } else {
                    if (textResource != null) {
                        z29 = true;
                        if (AbstractC8693b.m21270d(textResource)) {
                        }
                        if (z36) {
                            c28655q2.m87150e0(756591162);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                            z37 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z37 = false;
                            c28655q2.m87150e0(756729546);
                            c28655q2.m87173q(false);
                        }
                    } else {
                        z29 = true;
                    }
                    if (z36) {
                        c28655q2.m87150e0(756591162);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3418o((float) 4.5d, c2314t2));
                        z37 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z37 = false;
                        c28655q2.m87150e0(756729546);
                        c28655q2.m87173q(false);
                    }
                }
                c28655q2.m87173q(z37);
            } else {
                c28655q2 = c28655q4;
                z29 = true;
                c28655q2.m87150e0(756739466);
                c28655q2.m87173q(false);
            }
            if (textResource != null) {
                c28655q2.m87150e0(756791236);
                String strM21274h1111114 = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
                if (z28) {
                    c28655q2.m87150e0(1686984191);
                    textColor = C38072d.f163053a.m121949b(c28655q2, 6).getBlack70();
                    z35 = false;
                    c28655q2.m87173q(false);
                } else {
                    z35 = false;
                    c28655q2.m87150e0(1686984929);
                    c28655q2.m87173q(false);
                    textColor = c17723a2M51179g.getTextColor();
                }
                int i71111119 = i68 << 9;
                f19 = f16;
                C28655q c28655q1111118 = c28655q2;
                z34 = z29;
                AbstractC30795n.m94707h(strM21274h1111114, null, textColor, 0L, null, null, null, 0L, null, null, 0L, i66, false, i67, 0, null, n13, f25, c28655q1111118, 0, (i68 & 112) | ((i68 << 3) & 7168) | (3670016 & i71111119) | (i71111119 & 29360128), 55290);
                c28655q3 = c28655q1111118;
                c28655q3.m87173q(z35);
            } else {
                c28655q3 = c28655q2;
                f19 = f16;
                z34 = z29;
                c28655q3.m87150e0(757114442);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(z34);
            z17 = z28;
            interfaceC22973k2 = interfaceC22973k3;
            enumC16313m1 = enumC16313m3;
            f17 = f26;
            c28655q = c28655q3;
            i64 = i66;
            i65 = i67;
            c2886a2 = n13;
            f18 = f25;
            enumC17786s1 = enumC17786s2;
            z18 = z27;
            z19 = z26;
        } else {
            c28655q4.m87138X();
            z17 = z13;
            enumC16313m1 = enumC16313m0;
            z18 = z14;
            f17 = f14;
            interfaceC22973k2 = interfaceC22973k1;
            z19 = z15;
            i64 = i13;
            i65 = i14;
            f18 = f15;
            c28655q = c28655q4;
            f19 = f16;
            enumC17786s1 = enumC17786s0;
            c2886a2 = c2886a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.y1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue1111115 = ((Integer) obj2).intValue();
                    return AbstractC17808z1.m51178f(textResource, z4, trendTypeState, z17, enumC16313m1, f19, enumC17786s1, z18, f17, interfaceC22973k2, z19, i64, i65, c2886a2, f18, i15, i16, i17, (Composer) obj, iIntValue1111115);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m51178f(TextResource textResource, boolean z4, EnumC17727b2 enumC17727b2, boolean z13, EnumC16313m0 enumC16313m0, float f13, EnumC17786s0 enumC17786s0, boolean z14, float f14, InterfaceC22973k1 interfaceC22973k1, boolean z15, int i13, int i14, C2886a c2886a, Float f15, int i15, int i16, int i17, Composer composer, int i18) {
        m51177e(textResource, z4, enumC17727b2, z13, enumC16313m0, f13, enumC17786s0, z14, f14, interfaceC22973k1, z15, i13, i14, c2886a, f15, composer, AbstractC28683x.m87244L(i15 | 1), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final C17723a2 m51179g(EnumC17727b2 enumC17727b2, Composer composer, int i13) {
        AbstractC22676k.m65750j(enumC17727b2, "<this>");
        switch (a.f69261b[enumC17727b2.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(-128211555);
                C17723a2 c17723a2M50732a = C17723a2.INSTANCE.m50732a(c28655q, 6);
                c28655q.m87173q(false);
                return c17723a2M50732a;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-128209472);
                C17723a2 c17723a2M50733b = C17723a2.INSTANCE.m50733b(c28655q2, 6);
                c28655q2.m87173q(false);
                return c17723a2M50733b;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(-128207329);
                C17723a2 c17723a2M50734c = C17723a2.INSTANCE.m50734c(c28655q3, 6);
                c28655q3.m87173q(false);
                return c17723a2M50734c;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(-128205513);
                C17723a2 c17723a2M50736e = C17723a2.INSTANCE.m50736e(c28655q4, 6);
                c28655q4.m87173q(false);
                return c17723a2M50736e;
            case 5:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(-128203813);
                C17723a2 c17723a2M50738g = C17723a2.INSTANCE.m50738g(c28655q5, 6);
                c28655q5.m87173q(false);
                return c17723a2M50738g;
            case 6:
                C28655q c28655q6 = (C28655q) composer;
                c28655q6.m87150e0(-128201792);
                C17723a2 c17723a2M50737f = C17723a2.INSTANCE.m50737f(c28655q6, 6);
                c28655q6.m87173q(false);
                return c17723a2M50737f;
            case 7:
                C28655q c28655q7 = (C28655q) composer;
                c28655q7.m87150e0(-128199452);
                C17723a2 c17723a2M50739h = C17723a2.INSTANCE.m50739h(c28655q7, 6);
                c28655q7.m87173q(false);
                return c17723a2M50739h;
            case 8:
                C28655q c28655q8 = (C28655q) composer;
                c28655q8.m87150e0(-128197119);
                C17723a2 c17723a2M50740i = C17723a2.INSTANCE.m50740i(c28655q8, 6);
                c28655q8.m87173q(false);
                return c17723a2M50740i;
            case 9:
                C28655q c28655q9 = (C28655q) composer;
                c28655q9.m87150e0(-128195142);
                C17723a2 c17723a2M50742k = C17723a2.INSTANCE.m50742k(c28655q9, 6);
                c28655q9.m87173q(false);
                return c17723a2M50742k;
            case 10:
                C28655q c28655q10 = (C28655q) composer;
                c28655q10.m87150e0(-128193119);
                C17723a2 c17723a2M50741j = C17723a2.INSTANCE.m50741j(c28655q10, 6);
                c28655q10.m87173q(false);
                return c17723a2M50741j;
            case 11:
                C28655q c28655q11 = (C28655q) composer;
                c28655q11.m87150e0(-128191241);
                C17723a2 c17723a2M50748q = C17723a2.INSTANCE.m50748q(c28655q11, 6);
                c28655q11.m87173q(false);
                return c17723a2M50748q;
            case 12:
                C28655q c28655q12 = (C28655q) composer;
                c28655q12.m87150e0(-128189509);
                C17723a2 c17723a2M50743l = C17723a2.INSTANCE.m50743l(c28655q12, 6);
                c28655q12.m87173q(false);
                return c17723a2M50743l;
            case 13:
                C28655q c28655q13 = (C28655q) composer;
                c28655q13.m87150e0(-128187555);
                C17723a2 c17723a2M50744m = C17723a2.INSTANCE.m50744m(c28655q13, 6);
                c28655q13.m87173q(false);
                return c17723a2M50744m;
            case 14:
                C28655q c28655q14 = (C28655q) composer;
                c28655q14.m87150e0(-128185506);
                C17723a2 c17723a2M50745n = C17723a2.INSTANCE.m50745n(c28655q14, 6);
                c28655q14.m87173q(false);
                return c17723a2M50745n;
            case 15:
                C28655q c28655q15 = (C28655q) composer;
                c28655q15.m87150e0(-128183360);
                C17723a2 c17723a2M50746o = C17723a2.INSTANCE.m50746o(c28655q15, 6);
                c28655q15.m87173q(false);
                return c17723a2M50746o;
            case 16:
                C28655q c28655q16 = (C28655q) composer;
                c28655q16.m87150e0(-128181190);
                C17723a2 c17723a2M50747p = C17723a2.INSTANCE.m50747p(c28655q16, 6);
                c28655q16.m87173q(false);
                return c17723a2M50747p;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C28655q c28655q17 = (C28655q) composer;
                c28655q17.m87150e0(-128179200);
                C17723a2 c17723a2M50735d = C17723a2.INSTANCE.m50735d(c28655q17, 6);
                c28655q17.m87173q(false);
                return c17723a2M50735d;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C28655q c28655q18 = (C28655q) composer;
                c28655q18.m87150e0(-128177221);
                C17723a2 c17723a2M50751t = C17723a2.INSTANCE.m50751t(c28655q18, 6);
                c28655q18.m87173q(false);
                return c17723a2M50751t;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C28655q c28655q19 = (C28655q) composer;
                c28655q19.m87150e0(-128175237);
                C17723a2 c17723a2M50754w = C17723a2.INSTANCE.m50754w(c28655q19, 6);
                c28655q19.m87173q(false);
                return c17723a2M50754w;
            case 20:
                C28655q c28655q20 = (C28655q) composer;
                c28655q20.m87150e0(-128173216);
                C17723a2 c17723a2M50749r = C17723a2.INSTANCE.m50749r(c28655q20, 6);
                c28655q20.m87173q(false);
                return c17723a2M50749r;
            case 21:
                C28655q c28655q21 = (C28655q) composer;
                c28655q21.m87150e0(-128171040);
                C17723a2 c17723a2M50750s = C17723a2.INSTANCE.m50750s(c28655q21, 6);
                c28655q21.m87173q(false);
                return c17723a2M50750s;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C28655q c28655q22 = (C28655q) composer;
                c28655q22.m87150e0(-128168700);
                C17723a2 c17723a2M50752u = C17723a2.INSTANCE.m50752u(c28655q22, 6);
                c28655q22.m87173q(false);
                return c17723a2M50752u;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C28655q c28655q23 = (C28655q) composer;
                c28655q23.m87150e0(-128166367);
                C17723a2 c17723a2M50753v = C17723a2.INSTANCE.m50753v(c28655q23, 6);
                c28655q23.m87173q(false);
                return c17723a2M50753v;
            case 24:
                C28655q c28655q24 = (C28655q) composer;
                c28655q24.m87150e0(-128164127);
                C17723a2 c17723a2M50756y = C17723a2.INSTANCE.m50756y(c28655q24, 6);
                c28655q24.m87173q(false);
                return c17723a2M50756y;
            case 25:
                C28655q c28655q25 = (C28655q) composer;
                c28655q25.m87150e0(-128161756);
                C17723a2 c17723a2M50755x = C17723a2.INSTANCE.m50755x(c28655q25, 6);
                c28655q25.m87173q(false);
                return c17723a2M50755x;
            default:
                throw AbstractC11895b.m32003v(-128211788, (C28655q) composer, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m51180h(int i13, Composer composer, int i14) {
        if (i13 == AbstractC16272a.f62163t4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(875524615);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62236F2);
            c28655q.m87173q(false);
            return strM92103Y;
        }
        if (i13 == AbstractC16272a.f62157s4) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(875528553);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62232E2);
            c28655q2.m87173q(false);
            return strM92103Y2;
        }
        if (i13 != AbstractC16272a.f62091h4) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1371772793);
            c28655q3.m87173q(false);
            return null;
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(875532355);
        String strM92103Y3 = AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62228D2);
        c28655q4.m87173q(false);
        return strM92103Y3;
    }
}
