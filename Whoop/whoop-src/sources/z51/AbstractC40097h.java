package z51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import oy0.AbstractC28472a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import wy0.EnumC37693d;
import x81.C38072d;
import xy0.AbstractC38699b;
import y71.C39272e;
import yk2.C39609i;
import yz1.C39913g;

/* JADX INFO: renamed from: z51.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aã\u0001\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00162\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0099\u0001\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0099\u0001\u0010!\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b!\u0010 \u001a\u0099\u0001\u0010\"\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u008b\u0001\u0010&\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\tH\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010*\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016H\u0003¢\u0006\u0004\b*\u0010+\"\u001a\u00101\u001a\u00020,8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u00105\"\u001a\u00109\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u00105\"\u001a\u0010<\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u00105\"\u001a\u0010?\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010\u001d\u001a\u0004\b>\u00105¨\u0006@"}, m65681d2 = {"", "showOptimalStrain", "showStrainWeeklyPlanGoal", "hasSleepPerformance", "", "optimalStrainPercent", "Ll83/k;", "optimalStrainRange", "recoveryPercent", "Lcom/whoop/design/util/TextResource;", "recoveryPercentText", "Lz51/k;", "recoveryType", "sleepPercentText", "strainScorePercent", "strainScoreText", "strainWeeklyPlanGoalPercent", "strainWeeklyPlanGoalText", "displayGaugeOnly", "Lkotlin/Function0;", "Ll83/a0;", "onGaugeClicked", "Lkotlin/Function1;", "", "onShareIconClicked", "bonusTrendText", "Lz51/a;", "firstCustomGaugeEntryViewState", "secondCustomGaugeEntryViewState", "F", "(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;Landroidx/compose/runtime/Composer;III)V", "t", "(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "q", "(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "C", "(Landroidx/compose/ui/Modifier;ZZFLl83/k;FLz51/k;FFLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V", "z", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "K", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "a", "Ljava/lang/String;", "P", "()Ljava/lang/String;", "GAUGE_TEST_TAG", "Ly3/f;", "b", "N", "()F", "GAUGE_SIZE", "c", "R", "STRAIN_GAUGE_RADIUS", "d", "Q", "RECOVERY_GAUGE_RADIUS", "e", "O", "GAUGE_STROKE_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40097h {

    /* JADX INFO: renamed from: a */
    private static final String f173080a = "Gauge Test Tag";

    /* JADX INFO: renamed from: b */
    private static final float f173081b = 144;

    /* JADX INFO: renamed from: c */
    private static final float f173082c = 56;

    /* JADX INFO: renamed from: d */
    private static final float f173083d = 43;

    /* JADX INFO: renamed from: e */
    private static final float f173084e = (float) 6.5d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m128551A(InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63379M(Canvas, C17919x.f69629f, 0.0f, 0L, 0.0f, null, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m128552B(TextResource textResource, int i13, Composer composer, int i14) {
        m128594z(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x0184  */
    /* JADX WARN: Code duplicated, block: B:135:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:152:0x0220  */
    /* JADX WARN: Code duplicated, block: B:153:0x0222  */
    /* JADX WARN: Code duplicated, block: B:156:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x022b  */
    /* JADX WARN: Code duplicated, block: B:160:0x026b  */
    /* JADX WARN: Code duplicated, block: B:161:0x026f  */
    /* JADX WARN: Code duplicated, block: B:164:0x027c  */
    /* JADX WARN: Code duplicated, block: B:166:0x028a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:193:0x040a  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX INFO: renamed from: C */
    private static final void m128553C(Modifier modifier, boolean z4, boolean z13, float f13, C23465k c23465k, final float f14, final EnumC40100k enumC40100k, final float f15, final float f16, final TextResource textResource, final boolean z14, final InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        boolean z15;
        int i17;
        int i18;
        C23465k c23465k2;
        int i19;
        int i24;
        boolean z16;
        final boolean z17;
        final float f17;
        final boolean z18;
        final Modifier modifier3;
        final C23465k c23465k3;
        C28677v1 c28677v1M87180u;
        int i25;
        C2314t c2314t;
        boolean z19;
        float f18;
        int i26;
        C23465k c23465k4;
        float f19;
        Object objM87133R;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f24;
        boolean z24;
        Object objM87133R2;
        int iHashCode2;
        float f25;
        EnumC37693d enumC37693d;
        boolean z25;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        Float fValueOf = Float.valueOf(0.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1129410179);
        int i38 = i15 & 1;
        if (i38 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        int i39 = i15 & 2;
        if (i39 != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i44 = i15 & 4;
        if (i44 == 0) {
            if ((i13 & 384) == 0) {
                z15 = z13;
                i16 |= c28655q.m87155h(z15) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87147d(f13)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i18;
                }
                if ((i13 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        c23465k2 = c23465k;
                        if (c28655q.m87153g(c23465k2)) {
                            i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i16 |= i37;
                    } else {
                        c23465k2 = c23465k;
                    }
                    i37 = DfuBaseService.ERROR_REMOTE_MASK;
                    i16 |= i37;
                } else {
                    c23465k2 = c23465k;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87147d(f14)) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i36;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87149e(enumC40100k.ordinal())) {
                        i35 = 1048576;
                    } else {
                        i35 = 524288;
                    }
                    i16 |= i35;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87147d(f15)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i16 |= i34;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87147d(f16)) {
                        i29 = 67108864;
                    } else {
                        i29 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i29;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(textResource)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i16 |= i28;
                }
                if ((i14 & 6) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i19 = i14 | i27;
                } else {
                    i19 = i14;
                }
                if ((i14 & 48) == 0) {
                    i19 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
                }
                i24 = i19;
                if ((i16 & 306783379) == 306783378 || (i24 & 19) != 18) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28655q.m87140Z();
                    i25 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i25 != 0 || c28655q.m87118C()) {
                        if (i38 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i39 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i44 != 0) {
                            z15 = false;
                        }
                        if (i17 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f13;
                        }
                        if ((i15 & 16) != 0) {
                            c23465k4 = new C23465k(fValueOf, fValueOf);
                            i26 = i16 & (-57345);
                        } else {
                            i26 = i16;
                            c23465k4 = c23465k2;
                        }
                        f19 = f18;
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        z19 = z4;
                        f19 = f13;
                        z15 = z15;
                        modifier2 = modifier2;
                        i26 = i16;
                        c23465k4 = c23465k2;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
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
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    f24 = f173081b;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f24, c2314t);
                    InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                    if ((i24 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z24 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C39272e(interfaceC4339a, 13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierMo3471e = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM3419p, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R2, 28), f173080a).mo3471e(modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    c28655q.m87158i0();
                    Modifier modifier4 = modifier2;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (!z15 || z19) {
                        c28655q.m87150e0(1010029124);
                        float f26 = f173082c;
                        if (z15) {
                            f25 = f16;
                        } else {
                            f25 = f19;
                        }
                        AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                        if (z15) {
                            enumC37693d = EnumC37693d.ROUND;
                        } else {
                            enumC37693d = EnumC37693d.ARC;
                        }
                        AbstractC37692c.m121117c(null, f26, f25, abstractC18247aM52577o, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                        AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                        z25 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1010833481);
                        z25 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(5 * 4, c2314t);
                    C38072d c38072d = C38072d.f163053a;
                    C23465k c23465k5 = c23465k4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoop(), c28655q, 6), null, modifierM3419p2, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    float f27 = f173083d;
                    AbstractC18247a abstractC18247aM52577o2 = AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10());
                    float f28 = f173084e;
                    AbstractC37692c.m121117c(null, f27, 1.0f, abstractC18247aM52577o2, f28, false, 0.0f, 0, null, c28655q, 25008, 481);
                    AbstractC37692c.m121117c(null, f27, f14, AbstractC18249c.m52577o(AbstractC40093d.m128548t(enumC40100k, c28655q, (i26 >> 18) & 14)), f28, false, 0.0f, 0, null, c28655q, ((i26 >> 9) & 896) | 24624, 481);
                    float f29 = f173082c;
                    AbstractC37692c.m121117c(null, f29, 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10()), f28, false, 0.0f, 0, null, c28655q, 25008, 481);
                    AbstractC37692c.m121117c(null, f29, f15, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f28, false, 0.0f, 0, null, c28655q, ((i26 >> 15) & 896) | 24624, 481);
                    c28655q.m87173q(true);
                    if (z14 && z15 && f16 > f15) {
                        c28655q.m87150e0(1340666962);
                        m128594z(textResource, c28655q, (i26 >> 27) & 14);
                        c28655q.m87173q(z25);
                    } else {
                        c28655q.m87150e0(1340725583);
                        c28655q.m87173q(z25);
                    }
                    c28655q.m87173q(true);
                    c23465k3 = c23465k5;
                    z17 = z19;
                    z18 = z15;
                    f17 = f19;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    z17 = z4;
                    f17 = f13;
                    z18 = z15;
                    modifier3 = modifier2;
                    c23465k3 = c23465k2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40097h.m128555E(modifier3, z17, z18, f17, c23465k3, f14, enumC40100k, f15, f16, textResource, z14, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            if ((i13 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q.m87153g(c23465k2)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i37;
                } else {
                    c23465k2 = c23465k;
                }
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i37;
            } else {
                c23465k2 = c23465k;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87147d(f14)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i36;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87149e(enumC40100k.ordinal())) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i16 |= i35;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87147d(f15)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i16 |= i34;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87147d(f16)) {
                    i29 = 67108864;
                } else {
                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i29;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(textResource)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i16 |= i28;
            }
            if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i19 = i14 | i27;
            } else {
                i19 = i14;
            }
            if ((i14 & 48) == 0) {
                i19 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
            }
            i24 = i19;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                i25 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i39 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i44 != 0) {
                        z15 = false;
                    }
                    if (i17 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f13;
                    }
                    if ((i15 & 16) != 0) {
                        c23465k4 = new C23465k(fValueOf, fValueOf);
                        i26 = i16 & (-57345);
                    } else {
                        i26 = i16;
                        c23465k4 = c23465k2;
                    }
                    f19 = f18;
                } else {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i39 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i44 != 0) {
                        z15 = false;
                    }
                    if (i17 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f13;
                    }
                    if ((i15 & 16) != 0) {
                        c23465k4 = new C23465k(fValueOf, fValueOf);
                        i26 = i16 & (-57345);
                    } else {
                        i26 = i16;
                        c23465k4 = c23465k2;
                    }
                    f19 = f18;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
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
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                f24 = f173081b;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f24, c2314t);
                InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                if ((i24 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z24) {
                    objM87133R2 = new C39272e(interfaceC4339a, 13);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a, 13);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e2 = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM3419p3, interfaceC21083i2, interfaceC13832v1, false, null, (InterfaceC4339a) objM87133R2, 28), f173080a).mo3471e(modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                c28655q.m87158i0();
                Modifier modifier5 = modifier2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                if (z15) {
                    c28655q.m87150e0(1010029124);
                    float f210 = f173082c;
                    if (z15) {
                        f25 = f16;
                    } else {
                        f25 = f19;
                    }
                    AbstractC18247a abstractC18247aM52577o3 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    if (z15) {
                        enumC37693d = EnumC37693d.ROUND;
                    } else {
                        enumC37693d = EnumC37693d.ARC;
                    }
                    AbstractC37692c.m121117c(null, f210, f25, abstractC18247aM52577o3, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                    AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                    z25 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1010029124);
                    float f211 = f173082c;
                    if (z15) {
                        f25 = f16;
                    } else {
                        f25 = f19;
                    }
                    AbstractC18247a abstractC18247aM52577o4 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    if (z15) {
                        enumC37693d = EnumC37693d.ROUND;
                    } else {
                        enumC37693d = EnumC37693d.ARC;
                    }
                    AbstractC37692c.m121117c(null, f211, f25, abstractC18247aM52577o4, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                    AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                    z25 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(5 * 4, c2314t);
                C38072d c38072d2 = C38072d.f163053a;
                C23465k c23465k6 = c23465k4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getLogo().getWhoop(), c28655q, 6), null, modifierM3419p4, c38072d2.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                float f212 = f173083d;
                AbstractC18247a abstractC18247aM52577o5 = AbstractC18249c.m52577o(c38072d2.m121949b(c28655q, 6).getWhite10());
                float f213 = f173084e;
                AbstractC37692c.m121117c(null, f212, 1.0f, abstractC18247aM52577o5, f213, false, 0.0f, 0, null, c28655q, 25008, 481);
                AbstractC37692c.m121117c(null, f212, f14, AbstractC18249c.m52577o(AbstractC40093d.m128548t(enumC40100k, c28655q, (i26 >> 18) & 14)), f213, false, 0.0f, 0, null, c28655q, ((i26 >> 9) & 896) | 24624, 481);
                float f214 = f173082c;
                AbstractC37692c.m121117c(null, f214, 1.0f, AbstractC18249c.m52577o(c38072d2.m121949b(c28655q, 6).getWhite10()), f213, false, 0.0f, 0, null, c28655q, 25008, 481);
                AbstractC37692c.m121117c(null, f214, f15, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f213, false, 0.0f, 0, null, c28655q, ((i26 >> 15) & 896) | 24624, 481);
                c28655q.m87173q(true);
                if (z14) {
                    c28655q.m87150e0(1340725583);
                    c28655q.m87173q(z25);
                } else {
                    c28655q.m87150e0(1340725583);
                    c28655q.m87173q(z25);
                }
                c28655q.m87173q(true);
                c23465k3 = c23465k6;
                z17 = z19;
                z18 = z15;
                f17 = f19;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                z17 = z4;
                f17 = f13;
                z18 = z15;
                modifier3 = modifier2;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40097h.m128555E(modifier3, z17, z18, f17, c23465k3, f14, enumC40100k, f15, f16, textResource, z14, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        z15 = z13;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87147d(f13)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            if ((i13 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q.m87153g(c23465k2)) {
                        i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i37;
                } else {
                    c23465k2 = c23465k;
                }
                i37 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i37;
            } else {
                c23465k2 = c23465k;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87147d(f14)) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i36;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87149e(enumC40100k.ordinal())) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i16 |= i35;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87147d(f15)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i16 |= i34;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87147d(f16)) {
                    i29 = 67108864;
                } else {
                    i29 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i29;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(textResource)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i16 |= i28;
            }
            if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i19 = i14 | i27;
            } else {
                i19 = i14;
            }
            if ((i14 & 48) == 0) {
                i19 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
            }
            i24 = i19;
            if ((i16 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28655q.m87140Z();
                i25 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i39 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i44 != 0) {
                        z15 = false;
                    }
                    if (i17 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f13;
                    }
                    if ((i15 & 16) != 0) {
                        c23465k4 = new C23465k(fValueOf, fValueOf);
                        i26 = i16 & (-57345);
                    } else {
                        i26 = i16;
                        c23465k4 = c23465k2;
                    }
                    f19 = f18;
                } else {
                    if (i38 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i39 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i44 != 0) {
                        z15 = false;
                    }
                    if (i17 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f13;
                    }
                    if ((i15 & 16) != 0) {
                        c23465k4 = new C23465k(fValueOf, fValueOf);
                        i26 = i16 & (-57345);
                    } else {
                        i26 = i16;
                        c23465k4 = c23465k2;
                    }
                    f19 = f18;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
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
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                f24 = f173081b;
                Modifier modifierM3419p5 = AbstractC1102d.m3419p(f24, c2314t);
                InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                if ((i24 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z24) {
                    objM87133R2 = new C39272e(interfaceC4339a, 13);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a, 13);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e3 = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM3419p5, interfaceC21083i3, interfaceC13832v2, false, null, (InterfaceC4339a) objM87133R2, 28), f173080a).mo3471e(modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                c28655q.m87158i0();
                Modifier modifier6 = modifier2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                if (z15) {
                    c28655q.m87150e0(1010029124);
                    float f215 = f173082c;
                    if (z15) {
                        f25 = f16;
                    } else {
                        f25 = f19;
                    }
                    AbstractC18247a abstractC18247aM52577o6 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    if (z15) {
                        enumC37693d = EnumC37693d.ROUND;
                    } else {
                        enumC37693d = EnumC37693d.ARC;
                    }
                    AbstractC37692c.m121117c(null, f215, f25, abstractC18247aM52577o6, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                    AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                    z25 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1010029124);
                    float f216 = f173082c;
                    if (z15) {
                        f25 = f16;
                    } else {
                        f25 = f19;
                    }
                    AbstractC18247a abstractC18247aM52577o7 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                    if (z15) {
                        enumC37693d = EnumC37693d.ROUND;
                    } else {
                        enumC37693d = EnumC37693d.ARC;
                    }
                    AbstractC37692c.m121117c(null, f216, f25, abstractC18247aM52577o7, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                    AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                    z25 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3419p6 = AbstractC1102d.m3419p(5 * 4, c2314t);
                C38072d c38072d3 = C38072d.f163053a;
                C23465k c23465k7 = c23465k4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getLogo().getWhoop(), c28655q, 6), null, modifierM3419p6, c38072d3.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                float f217 = f173083d;
                AbstractC18247a abstractC18247aM52577o8 = AbstractC18249c.m52577o(c38072d3.m121949b(c28655q, 6).getWhite10());
                float f218 = f173084e;
                AbstractC37692c.m121117c(null, f217, 1.0f, abstractC18247aM52577o8, f218, false, 0.0f, 0, null, c28655q, 25008, 481);
                AbstractC37692c.m121117c(null, f217, f14, AbstractC18249c.m52577o(AbstractC40093d.m128548t(enumC40100k, c28655q, (i26 >> 18) & 14)), f218, false, 0.0f, 0, null, c28655q, ((i26 >> 9) & 896) | 24624, 481);
                float f219 = f173082c;
                AbstractC37692c.m121117c(null, f219, 1.0f, AbstractC18249c.m52577o(c38072d3.m121949b(c28655q, 6).getWhite10()), f218, false, 0.0f, 0, null, c28655q, 25008, 481);
                AbstractC37692c.m121117c(null, f219, f15, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f218, false, 0.0f, 0, null, c28655q, ((i26 >> 15) & 896) | 24624, 481);
                c28655q.m87173q(true);
                if (z14) {
                    c28655q.m87150e0(1340725583);
                    c28655q.m87173q(z25);
                } else {
                    c28655q.m87150e0(1340725583);
                    c28655q.m87173q(z25);
                }
                c28655q.m87173q(true);
                c23465k3 = c23465k7;
                z17 = z19;
                z18 = z15;
                f17 = f19;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                z17 = z4;
                f17 = f13;
                z18 = z15;
                modifier3 = modifier2;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40097h.m128555E(modifier3, z17, z18, f17, c23465k3, f14, enumC40100k, f15, f16, textResource, z14, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        if ((i13 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                c23465k2 = c23465k;
                if (c28655q.m87153g(c23465k2)) {
                    i37 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i37;
            } else {
                c23465k2 = c23465k;
            }
            i37 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i37;
        } else {
            c23465k2 = c23465k;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87147d(f14)) {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i36;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87149e(enumC40100k.ordinal())) {
                i35 = 1048576;
            } else {
                i35 = 524288;
            }
            i16 |= i35;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87147d(f15)) {
                i34 = 8388608;
            } else {
                i34 = 4194304;
            }
            i16 |= i34;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q.m87147d(f16)) {
                i29 = 67108864;
            } else {
                i29 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i29;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87153g(textResource)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i16 |= i28;
        }
        if ((i14 & 6) == 0) {
            if (c28655q.m87155h(z14)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i19 = i14 | i27;
        } else {
            i19 = i14;
        }
        if ((i14 & 48) == 0) {
            i19 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        i24 = i19;
        if ((i16 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q.m87135U(i16 & 1, z16)) {
            c28655q.m87140Z();
            i25 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                if (i38 != 0) {
                    modifier2 = c2314t;
                }
                if (i39 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if (i44 != 0) {
                    z15 = false;
                }
                if (i17 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f13;
                }
                if ((i15 & 16) != 0) {
                    c23465k4 = new C23465k(fValueOf, fValueOf);
                    i26 = i16 & (-57345);
                } else {
                    i26 = i16;
                    c23465k4 = c23465k2;
                }
                f19 = f18;
            } else {
                if (i38 != 0) {
                    modifier2 = c2314t;
                }
                if (i39 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if (i44 != 0) {
                    z15 = false;
                }
                if (i17 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f13;
                }
                if ((i15 & 16) != 0) {
                    c23465k4 = new C23465k(fValueOf, fValueOf);
                    i26 = i16 & (-57345);
                } else {
                    i26 = i16;
                    c23465k4 = c23465k2;
                }
                f19 = f18;
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            f24 = f173081b;
            Modifier modifierM3419p7 = AbstractC1102d.m3419p(f24, c2314t);
            InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
            if ((i24 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z24) {
                objM87133R2 = new C39272e(interfaceC4339a, 13);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39272e(interfaceC4339a, 13);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierMo3471e4 = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM3419p7, interfaceC21083i4, interfaceC13832v3, false, null, (InterfaceC4339a) objM87133R2, 28), f173080a).mo3471e(modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            c28655q.m87158i0();
            Modifier modifier7 = modifier2;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            if (z15) {
                c28655q.m87150e0(1010029124);
                float f2110 = f173082c;
                if (z15) {
                    f25 = f16;
                } else {
                    f25 = f19;
                }
                AbstractC18247a abstractC18247aM52577o9 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                if (z15) {
                    enumC37693d = EnumC37693d.ROUND;
                } else {
                    enumC37693d = EnumC37693d.ARC;
                }
                AbstractC37692c.m121117c(null, f2110, f25, abstractC18247aM52577o9, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                z25 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1010029124);
                float f2111 = f173082c;
                if (z15) {
                    f25 = f16;
                } else {
                    f25 = f19;
                }
                AbstractC18247a abstractC18247aM52577o10 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
                if (z15) {
                    enumC37693d = EnumC37693d.ROUND;
                } else {
                    enumC37693d = EnumC37693d.ARC;
                }
                AbstractC37692c.m121117c(null, f2111, f25, abstractC18247aM52577o10, f173084e, true, 0.0f, 0, enumC37693d, c28655q, 221232, 193);
                AbstractC38699b.m124109c(f24 / 2, ((Number) c23465k4.f92937w).floatValue(), ((Number) c23465k4.f92938x).floatValue(), c28655q, 6);
                z25 = false;
                c28655q.m87173q(false);
            }
            Modifier modifierM3419p8 = AbstractC1102d.m3419p(5 * 4, c2314t);
            C38072d c38072d4 = C38072d.f163053a;
            C23465k c23465k8 = c23465k4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getLogo().getWhoop(), c28655q, 6), null, modifierM3419p8, c38072d4.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            float f2112 = f173083d;
            AbstractC18247a abstractC18247aM52577o11 = AbstractC18249c.m52577o(c38072d4.m121949b(c28655q, 6).getWhite10());
            float f2113 = f173084e;
            AbstractC37692c.m121117c(null, f2112, 1.0f, abstractC18247aM52577o11, f2113, false, 0.0f, 0, null, c28655q, 25008, 481);
            AbstractC37692c.m121117c(null, f2112, f14, AbstractC18249c.m52577o(AbstractC40093d.m128548t(enumC40100k, c28655q, (i26 >> 18) & 14)), f2113, false, 0.0f, 0, null, c28655q, ((i26 >> 9) & 896) | 24624, 481);
            float f2114 = f173082c;
            AbstractC37692c.m121117c(null, f2114, 1.0f, AbstractC18249c.m52577o(c38072d4.m121949b(c28655q, 6).getWhite10()), f2113, false, 0.0f, 0, null, c28655q, 25008, 481);
            AbstractC37692c.m121117c(null, f2114, f15, AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f2113, false, 0.0f, 0, null, c28655q, ((i26 >> 15) & 896) | 24624, 481);
            c28655q.m87173q(true);
            if (z14) {
                c28655q.m87150e0(1340725583);
                c28655q.m87173q(z25);
            } else {
                c28655q.m87150e0(1340725583);
                c28655q.m87173q(z25);
            }
            c28655q.m87173q(true);
            c23465k3 = c23465k8;
            z17 = z19;
            z18 = z15;
            f17 = f19;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            z17 = z4;
            f17 = f13;
            z18 = z15;
            modifier3 = modifier2;
            c23465k3 = c23465k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z51.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40097h.m128555E(modifier3, z17, z18, f17, c23465k3, f14, enumC40100k, f15, f16, textResource, z14, interfaceC4339a, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m128554D(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m128555E(Modifier modifier, boolean z4, boolean z13, float f13, C23465k c23465k, float f14, EnumC40100k enumC40100k, float f15, float f16, TextResource textResource, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m128553C(modifier, z4, z13, f13, c23465k, f14, enumC40100k, f15, f16, textResource, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v30 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v42 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v50 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v56 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r32v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r32v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r32v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r32v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r33v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r33v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r39v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r39v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r39v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r39v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r39v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r39v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: F */
    public static final void m128556F(boolean r37, boolean r38, boolean r39, float r40, l83.C23465k r41, float r42, com.whoop.design.util.TextResource r43, z51.EnumC40100k r44, com.whoop.design.util.TextResource r45, float r46, com.whoop.design.util.TextResource r47, float r48, com.whoop.design.util.TextResource r49, boolean r50, c93.InterfaceC4339a r51, p715kotlin.jvm.functions.Function1 r52, com.whoop.design.util.TextResource r53, z51.C40090a r54, z51.C40090a r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z51.AbstractC40097h.m128556F(boolean, boolean, boolean, float, l83.k, float, com.whoop.design.util.TextResource, z51.k, com.whoop.design.util.TextResource, float, com.whoop.design.util.TextResource, float, com.whoop.design.util.TextResource, boolean, c93.a, kotlin.jvm.functions.Function1, com.whoop.design.util.TextResource, z51.a, z51.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m128557G(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m128558H(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m128559I(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m128560J(boolean z4, boolean z13, boolean z14, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, TextResource textResource2, float f15, TextResource textResource3, float f16, TextResource textResource4, boolean z15, InterfaceC4339a interfaceC4339a, Function1 function1, TextResource textResource5, C40090a c40090a, C40090a c40090a2, int i13, int i14, int i15, Composer composer, int i16) {
        m128556F(z4, z13, z14, f13, c23465k, f14, textResource, enumC40100k, textResource2, f15, textResource3, f16, textResource4, z15, interfaceC4339a, function1, textResource5, c40090a, c40090a2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m128561K(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(236095395);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 3 * 4, 0.0f, 0.0f, 13);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39609i(function1, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28472a.m86382c(null, false, (InterfaceC4339a) objM87133R, c28655q, 0, 3);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m128562L(Function1 function1) {
        function1.invoke(EnumC40105p.SHARE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m128563M(Function1 function1, int i13, Composer composer, int i14) {
        m128561K(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final float m128564N() {
        return f173081b;
    }

    /* JADX INFO: renamed from: O */
    public static final float m128565O() {
        return f173084e;
    }

    /* JADX INFO: renamed from: P */
    public static final String m128566P() {
        return f173080a;
    }

    /* JADX INFO: renamed from: Q */
    public static final float m128567Q() {
        return f173083d;
    }

    /* JADX INFO: renamed from: R */
    public static final float m128568R() {
        return f173082c;
    }

    /* JADX INFO: renamed from: q */
    private static final void m128585q(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, TextResource textResource2, float f15, TextResource textResource3, TextResource textResource4, float f16, TextResource textResource5, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        float f17;
        int i16;
        EnumC40100k enumC40100k2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(418562589);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q2.m87153g(c23465k) ? 2048 : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            f17 = f14;
            i15 |= c28655q2.m87147d(f17) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        } else {
            f17 = f14;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q2.m87149e(enumC40100k.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q2.m87147d(f15) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q2.m87153g(textResource3) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87153g(textResource4) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87147d(f16) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(textResource5) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87155h(z14)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i16 |= i24;
        }
        int i25 = i16;
        int i26 = i15;
        if (c28655q2.m87135U(i26 & 1, ((i15 & 306783379) == 306783378 && (i25 & 9363) == 9362) ? false : true)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            boolean z15 = (i25 & 57344) == 16384;
            Object objM87133R = c28655q2.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39272e(interfaceC4339a, 16);
                c28655q2.m87172p0(objM87133R);
            }
            int i27 = i25 << 21;
            m128553C(null, z4, z13, f13, c23465k, f17, enumC40100k, f15, f16, textResource5, z14, (InterfaceC4339a) objM87133R, c28655q2, ((i26 << 3) & 524272) | (i26 & 3670016) | ((i26 >> 3) & 29360128) | (234881024 & i27) | (i27 & 1879048192), (i25 >> 9) & 14, 1);
            c28655q = c28655q2;
            if (z14) {
                enumC40100k2 = enumC40100k;
                c28655q.m87150e0(1879437793);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1879045705);
                float f18 = 4;
                float f19 = 3 * f18;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t));
                int i28 = i26 >> 21;
                enumC40100k2 = enumC40100k;
                AbstractC40093d.m128539k(enumC40100k2, textResource, textResource3, c28655q, ((i26 >> 18) & 14) | ((i26 >> 12) & 112) | (i28 & 896));
                float f24 = 6 * f18;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f24, c2314t));
                AbstractC40093d.m128545q(c28655q, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f24, c2314t));
                AbstractC40093d.m128541m(textResource2, textResource4, c28655q, ((i25 << 3) & 112) | (i28 & 14));
                AbstractC25012a.m73389v(c2314t, f19, c28655q, false);
            }
            c28655q.m87173q(true);
        } else {
            enumC40100k2 = enumC40100k;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40094e(z4, z13, f13, c23465k, f14, textResource, enumC40100k2, textResource2, f15, textResource3, textResource4, f16, textResource5, z14, interfaceC4339a, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m128586r(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m128587s(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, TextResource textResource2, float f15, TextResource textResource3, TextResource textResource4, float f16, TextResource textResource5, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m128585q(z4, z13, f13, c23465k, f14, textResource, enumC40100k, textResource2, f15, textResource3, textResource4, f16, textResource5, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m128588t(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, float f15, TextResource textResource2, float f16, TextResource textResource3, C40090a c40090a, C40090a c40090a2, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        C2314t c2314t;
        boolean z15;
        boolean z16;
        boolean z17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1078783728);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q.m87153g(c23465k) ? 2048 : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            i15 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q.m87153g(textResource) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q.m87149e(enumC40100k.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87147d(f15) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q.m87147d(f16) ? 536870912 : 268435456;
        }
        int i25 = i15;
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q.m87153g(textResource3) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(c40090a) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(c40090a2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87155h(z14)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i16 |= i24;
        }
        int i26 = i16;
        if (c28655q.m87135U(i25 & 1, ((i25 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            float f17 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * f17, modifierM3409f);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            if (z14) {
                c2314t = c2314t2;
                z15 = false;
                z16 = true;
                c28655q.m87150e0(-83487218);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-83886994);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC40093d.m128537i(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), enumC40100k, textResource, c40090a.getDisplayValue(), c40090a.getTitle(), c28655q, ((i25 >> 15) & 112) | ((i25 >> 9) & 896), 0);
                c28655q = c28655q;
                z16 = true;
                c2314t = c2314t2;
                z15 = false;
                AbstractC31061c.m95650z(1, f17, c2314t, c28655q, false);
            }
            boolean z18 = (57344 & i26) == 16384 ? z16 : z15;
            Object objM87133R = c28655q.m87133R();
            if (z18 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39272e(interfaceC4339a, 12);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t3 = c2314t;
            C28655q c28655q2 = c28655q;
            m128553C(null, z4, z13, f13, c23465k, f14, enumC40100k, f15, f16, textResource3, z14, (InterfaceC4339a) objM87133R, c28655q2, ((i25 << 3) & 524272) | (i25 & 3670016) | (i25 & 29360128) | (234881024 & (i25 >> 3)) | ((i26 << 27) & 1879048192), (i26 >> 9) & 14, 1);
            c28655q = c28655q2;
            if (z14) {
                z17 = true;
                c28655q.m87150e0(-82545810);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-82850447);
                z17 = true;
                AbstractC18489d0.m53380u(1, f17, c2314t3, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC40093d.m128543o(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), textResource2, c40090a2.getDisplayValue(), c40090a2.getTitle(), c28655q, (i25 >> 21) & 112, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z17);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40094e(z4, z13, f13, c23465k, f14, textResource, enumC40100k, f15, textResource2, f16, textResource3, c40090a, c40090a2, z14, interfaceC4339a, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m128589u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m128590v(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, float f15, TextResource textResource2, float f16, TextResource textResource3, C40090a c40090a, C40090a c40090a2, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m128588t(z4, z13, f13, c23465k, f14, textResource, enumC40100k, f15, textResource2, f16, textResource3, c40090a, c40090a2, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m128591w(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, float f15, TextResource textResource2, float f16, TextResource textResource3, C40090a c40090a, C40090a c40090a2, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        C2314t c2314t;
        boolean z15;
        char c3;
        float f17;
        boolean z16;
        boolean z17;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-949012416);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q.m87153g(c23465k) ? 2048 : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            i15 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q.m87153g(textResource) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q.m87149e(enumC40100k.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87147d(f15) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q.m87147d(f16) ? 536870912 : 268435456;
        }
        int i25 = i15;
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q.m87153g(textResource3) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(c40090a) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(c40090a2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87155h(z14)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i16 |= i24;
        }
        int i26 = i16;
        if (c28655q.m87135U(i25 & 1, ((i25 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            float f18 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * f18, modifierM3409f);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f19 = 4;
            float f24 = f19 * f18;
            C23000t1 c23000t1 = C23000t1.f90727a;
            if (z14) {
                c2314t = c2314t2;
                z15 = false;
                c3 = 2;
                f17 = f19;
                z16 = true;
                c28655q.m87150e0(275276646);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(274080201);
                c2314t = c2314t2;
                f17 = f19;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c23000t1.mo66772c(c23000t1.mo66771a(c2314t, c2306l), true, 1.0f), 0.0f, f24, 0.0f, 0.0f, 13);
                C2305k c2305k = C2299e.f9112O;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                int i27 = (i25 >> 18) & 14;
                z16 = true;
                z15 = false;
                AbstractC40093d.m128535g(null, textResource, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62223C1)), AbstractC40093d.m128548t(enumC40100k, c28655q, i27), AbstractC40093d.m128548t(enumC40100k, c28655q, i27), 6, c2305k, null, true, false, c28655q, ((i25 >> 12) & 112) | 102236160, 641);
                c3 = 2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f17, c2314t));
                AbstractC40093d.m128535g(null, c40090a.getDisplayValue(), c40090a.getTitle(), 0L, 0L, 6, c2305k, null, false, true, c28655q, 806879232, 409);
                c28655q.m87173q(true);
                AbstractC31061c.m95650z(1, f18, c2314t, c28655q, false);
            }
            boolean z18 = (i26 & 57344) == 16384 ? z16 : z15;
            Object objM87133R = c28655q.m87133R();
            if (z18 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39272e(interfaceC4339a, 17);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t3 = c2314t;
            m128553C(null, z4, z13, f13, c23465k, f14, enumC40100k, f15, f16, textResource3, z14, (InterfaceC4339a) objM87133R, c28655q, ((i25 << 3) & 524272) | (i25 & 3670016) | (i25 & 29360128) | ((i25 >> 3) & 234881024) | ((i26 << 27) & 1879048192), (i26 >> 9) & 14, 1);
            if (z14) {
                z17 = true;
                c28655q.m87150e0(276841030);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(275932885);
                AbstractC18489d0.m53380u(1, f18, c2314t3, c28655q);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c23000t1.mo66772c(c23000t1.mo66771a(c2314t3, c2306l), true, 1.0f), 0.0f, f24, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                int i28 = (i25 >> 24) & 14;
                AbstractC40093d.m128535g(null, textResource2, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62231E1)), AbstractC40093d.m128550v(textResource2, c28655q, i28), AbstractC40093d.m128550v(textResource2, c28655q, i28), 0, null, null, false, false, c28655q, (i25 >> 21) & 112, 993);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f17, c2314t3));
                z17 = true;
                AbstractC40093d.m128535g(null, c40090a2.getDisplayValue(), c40090a2.getTitle(), 0L, 0L, 0, null, null, false, true, c28655q, 805306368, 505);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z17);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40094e(z4, z13, f13, c23465k, f14, textResource, enumC40100k, f15, textResource2, f16, textResource3, c40090a, c40090a2, z14, interfaceC4339a, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m128592x(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m128593y(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, float f15, TextResource textResource2, float f16, TextResource textResource3, C40090a c40090a, C40090a c40090a2, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m128591w(z4, z13, f13, c23465k, f14, textResource, enumC40100k, f15, textResource2, f16, textResource3, c40090a, c40090a2, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m128594z(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1439182515);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (AbstractC8693b.m21270d(textResource)) {
            c28655q.m87150e0(-1972093770);
            float f13 = 1 * 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(5, c2314t);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C39913g(15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 54);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14 & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1971669969);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 17);
        }
    }
}
