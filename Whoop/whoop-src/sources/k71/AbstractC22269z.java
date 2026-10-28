package k71;

import a71.C0520a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b11.C2275b;
import b91.C2886a;
import bf0.C3195g;
import bp0.C3526n;
import bp0.C3527o;
import c41.C4004c5;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import j71.C21395c;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import ji0.C21714b;
import jp2.C21875f;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.C23471q;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: k71.z */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aÁ\u0001\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001aQ\u0010%\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\b\b\u0002\u0010$\u001a\u00020\u0013H\u0003¢\u0006\u0004\b%\u0010&\u001a³\u0001\u0010)\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017H\u0001¢\u0006\u0004\b)\u0010*\u001aI\u0010+\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u0013H\u0003¢\u0006\u0004\b-\u0010.\u001aK\u0010/\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017H\u0003¢\u0006\u0004\b/\u00100\u001a\u001f\u00101\u001a\u00020\u00192\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0003¢\u0006\u0004\b1\u00102¨\u00066²\u0006\u000e\u00103\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly81/e;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "title", "label", "labelColor", "score", "Ly71/g;", "icon", "Lkd1/l;", "ctaType", "", "graphAspectRatio", "Lm91/u;", "graphItem", "body", "lastUpdatedText", "", "isCompact", "", "subItems", "Lkotlin/Function1;", "", "Ll83/a0;", "onClick", "Ld61/a;", "onScrubEvent", "K", "(Landroidx/compose/ui/Modifier;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "La71/a;", "details", "Ll83/q;", "b0", "(La71/a;)Ll83/q;", "iaEnabled", "u", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;FLm91/u;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "Ly3/m;", "annotationLayoutDirection", "A", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Ly3/m;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "x", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly3/m;Landroidx/compose/runtime/Composer;I)V", "Z", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "F", "(Lm91/u;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "X", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "cardScore", "cardLabel", "cardLabelColor", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22269z {

    /* JADX INFO: renamed from: k71.z$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f86897w = new a();

        /* JADX INFO: renamed from: a */
        public final long m63986a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63986a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: k71.z$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f86898w = new b();

        /* JADX INFO: renamed from: a */
        public final long m63987a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63987a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:135:0x01da  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:150:0x0209  */
    /* JADX WARN: Code duplicated, block: B:153:0x023c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:159:0x0261  */
    /* JADX WARN: Code duplicated, block: B:162:0x026b  */
    /* JADX WARN: Code duplicated, block: B:163:0x026d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0276  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:170:0x031d  */
    /* JADX WARN: Code duplicated, block: B:171:0x031f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x0329  */
    /* JADX WARN: Code duplicated, block: B:178:0x0331  */
    /* JADX WARN: Code duplicated, block: B:181:0x0336  */
    /* JADX WARN: Code duplicated, block: B:185:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x034d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0356  */
    /* JADX WARN: Code duplicated, block: B:193:0x037b  */
    /* JADX WARN: Code duplicated, block: B:194:0x03da  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:198:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:200:0x040f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0420  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    public static final void m63932A(final TextResource title, TextResource body, final TextResource lastUpdatedText, final TextResource label, final InterfaceC39332e labelColor, final TextResource score, final C39274g c39274g, final EnumC22400l enumC22400l, final float f13, final InterfaceC25312u graphItem, EnumC39181m enumC39181m, boolean z4, List<? extends InterfaceC25312u> list, Function1 function1, final Function1 onScrubEvent, Composer composer, final int i13, final int i14, final int i15) throws XmlPullParserException, IOException {
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z13;
        C28655q c28655q;
        final TextResource textResource;
        final EnumC39181m enumC39181m2;
        final boolean z14;
        final Function1 function2;
        C28677v1 c28677v1M87180u;
        EnumC39181m enumC39181m3;
        boolean z15;
        C28676v0 c28676v0;
        Function1 function3;
        int iHashCode;
        C2314t c2314t;
        boolean z16;
        C0213j c0213j;
        int i25;
        C0209i c0209i;
        boolean z17;
        int i26;
        boolean z18;
        int i27;
        int i28;
        boolean z19;
        EnumC39181m enumC39181m4;
        C2314t c2314t2;
        int i29;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R;
        C28676v0 c28676v1;
        boolean z27;
        Object objM87133R2;
        int i34;
        int i35;
        boolean z28;
        float f14;
        Object objM87133R3;
        final List<? extends InterfaceC25312u> list2 = list;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(lastUpdatedText, "lastUpdatedText");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(score, "score");
        AbstractC22676k.m65750j(graphItem, "graphItem");
        AbstractC22676k.m65750j(onScrubEvent, "onScrubEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(891853760);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(title) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(body) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87153g(lastUpdatedText) ? 256 : 128;
        }
        int i36 = i13 & 3072;
        int i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i36 == 0) {
            i16 |= c28655q2.m87153g(label) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i38 = i13 & 24576;
        int i39 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i38 == 0) {
            i16 |= (i13 & 32768) == 0 ? c28655q2.m87153g(labelColor) : c28655q2.m87157i(labelColor) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q2.m87153g(score) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q2.m87153g(c39274g) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q2.m87149e(enumC22400l == null ? -1 : enumC22400l.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q2.m87147d(f13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= (i13 & 1073741824) == 0 ? c28655q2.m87153g(graphItem) : c28655q2.m87157i(graphItem) ? 536870912 : 268435456;
        }
        int i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i44 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (c28655q2.m87149e(enumC39181m != null ? enumC39181m.ordinal() : -1) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i45 = i17;
        int i46 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i46 != 0) {
            i18 = i45 | 48;
        } else if ((i14 & 48) == 0) {
            i18 = i45 | (c28655q2.m87155h(z4) ? 32 : 16);
        } else {
            i18 = i45;
        }
        if ((i14 & 384) == 0) {
            i18 |= c28655q2.m87157i(list2) ? 256 : 128;
        }
        int i47 = i18;
        int i48 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i48 == 0) {
            i19 = i47;
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i19 |= i37;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87157i(onScrubEvent)) {
                    i39 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i19 |= i39;
            }
            i24 = i19;
            if ((i16 & 306783379) == 306783378 || (i24 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                if (i44 != 0) {
                    enumC39181m3 = EnumC39181m.f168423w;
                } else {
                    enumC39181m3 = enumC39181m;
                }
                if (i46 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                c28676v0 = C28635l.f115821a;
                if (i48 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C21714b(20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                function2 = function3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                z16 = z15;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                i25 = i16;
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
                if (enumC22400l != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i26 = i24;
                    z18 = z16;
                    i27 = i25;
                    i28 = 4;
                    c28655q2.m87150e0(666277653);
                    z19 = false;
                    EnumC39181m enumC39181m5 = enumC39181m3;
                    m63983x(title, lastUpdatedText, c39274g, label, labelColor, score, enumC39181m5, c28655q2, (i27 & 14) | ((i27 >> 3) & 112) | ((i27 >> 12) & 896) | (i27 & 7168) | (i27 & 57344) | (458752 & i27) | ((i26 << 18) & 3670016));
                    c28655q = c28655q2;
                    enumC39181m4 = enumC39181m5;
                    c2314t2 = c2314t;
                    AbstractC31061c.m95650z(1, 4, c2314t2, c28655q, false);
                    i29 = 5;
                } else {
                    c28655q2.m87150e0(666073270);
                    AbstractC18489d0.m53380u(2, 8, c2314t, c28655q2);
                    int i49 = i25 >> 6;
                    i26 = i24;
                    i27 = i25;
                    i28 = 4;
                    m63957Z(title, label, labelColor, score, z16, c28655q2, (i25 & 14) | (i49 & 112) | (i49 & 896) | (i49 & 7168) | ((i24 << 9) & 57344), 0);
                    z18 = z16;
                    c28655q = c28655q2;
                    AbstractC31061c.m95650z(5, 4, c2314t, c28655q, false);
                    c2314t2 = c2314t;
                    i29 = 5;
                    enumC39181m4 = enumC39181m3;
                    z19 = false;
                }
                AbstractC18489d0.m53380u(i29, i28, c2314t2, c28655q);
                if ((i26 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = z19;
                }
                if ((29360128 & i27) == 8388608) {
                    z25 = true;
                } else {
                    z25 = z19;
                }
                z26 = z24 | z25;
                objM87133R = c28655q.m87133R();
                if (z26) {
                    c28676v1 = r58;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                    }
                    Function1 function4 = (Function1) objM87133R;
                    if ((i26 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = z19;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z27 || objM87133R2 == c28676v1) {
                        objM87133R2 = new C2275b(onScrubEvent, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m63937F(graphItem, f13, function4, (Function1) objM87133R2, c28655q, ((i27 >> 27) & 14) | ((i27 >> 21) & 112), 0);
                    if (AbstractC8693b.m21270d(body)) {
                        c28655q.m87150e0(666934264);
                        textResource = body;
                        String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i27 >> 3) & 14);
                        C38072d c38072d = C38072d.f163053a;
                        i34 = 2;
                        i35 = 8;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2), c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 0, 196600);
                        c28655q.m87173q(z19);
                    } else {
                        textResource = body;
                        i34 = 2;
                        i35 = 8;
                        c28655q.m87150e0(667220952);
                        c28655q.m87173q(z19);
                    }
                    if (AbstractC8693b.m21270d(textResource)) {
                        f14 = i34 * i35;
                        z28 = true;
                    } else {
                        z28 = true;
                        f14 = 1 * i35;
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                    list2 = list;
                    m63955X(list2, c28655q, (i26 >> 6) & 14);
                    c28655q.m87173q(z28);
                    enumC39181m2 = enumC39181m4;
                    z14 = z18;
                }
                objM87133R = new C3526n(function2, enumC22400l, 21);
                c28655q.m87172p0(objM87133R);
                Function1 function5 = (Function1) objM87133R;
                if ((i26 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = z19;
                }
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C2275b(onScrubEvent, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2275b(onScrubEvent, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                m63937F(graphItem, f13, function5, (Function1) objM87133R2, c28655q, ((i27 >> 27) & 14) | ((i27 >> 21) & 112), 0);
                if (AbstractC8693b.m21270d(body)) {
                    c28655q.m87150e0(666934264);
                    textResource = body;
                    String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, (i27 >> 3) & 14);
                    C38072d c38072d2 = C38072d.f163053a;
                    i34 = 2;
                    i35 = 8;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2), c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(z19);
                } else {
                    textResource = body;
                    i34 = 2;
                    i35 = 8;
                    c28655q.m87150e0(667220952);
                    c28655q.m87173q(z19);
                }
                if (AbstractC8693b.m21270d(textResource)) {
                    f14 = i34 * i35;
                    z28 = true;
                } else {
                    z28 = true;
                    f14 = 1 * i35;
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                list2 = list;
                m63955X(list2, c28655q, (i26 >> 6) & 14);
                c28655q.m87173q(z28);
                enumC39181m2 = enumC39181m4;
                z14 = z18;
            } else {
                c28655q = c28655q2;
                textResource = body;
                c28655q.m87138X();
                enumC39181m2 = enumC39181m;
                z14 = z4;
                function2 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.r
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22269z.m63936E(title, textResource, lastUpdatedText, label, labelColor, score, c39274g, enumC22400l, f13, graphItem, enumC39181m2, z14, list2, function2, onScrubEvent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i19 = i47 | 3072;
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87157i(onScrubEvent)) {
                i39 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i19 |= i39;
        }
        i24 = i19;
        if ((i16 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            if (i44 != 0) {
                enumC39181m3 = EnumC39181m.f168423w;
            } else {
                enumC39181m3 = enumC39181m;
            }
            if (i46 != 0) {
                z15 = false;
            } else {
                z15 = z4;
            }
            c28676v0 = C28635l.f115821a;
            if (i48 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C21714b(20);
                    c28655q2.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            function2 = function3;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            z16 = z15;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            i25 = i16;
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
            if (enumC22400l != null) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                c28655q2.m87150e0(666073270);
                AbstractC18489d0.m53380u(2, 8, c2314t, c28655q2);
                int i410 = i25 >> 6;
                i26 = i24;
                i27 = i25;
                i28 = 4;
                m63957Z(title, label, labelColor, score, z16, c28655q2, (i25 & 14) | (i410 & 112) | (i410 & 896) | (i410 & 7168) | ((i24 << 9) & 57344), 0);
                z18 = z16;
                c28655q = c28655q2;
                AbstractC31061c.m95650z(5, 4, c2314t, c28655q, false);
                c2314t2 = c2314t;
                i29 = 5;
                enumC39181m4 = enumC39181m3;
                z19 = false;
            } else {
                i26 = i24;
                z18 = z16;
                i27 = i25;
                i28 = 4;
                c28655q2.m87150e0(666277653);
                z19 = false;
                EnumC39181m enumC39181m6 = enumC39181m3;
                m63983x(title, lastUpdatedText, c39274g, label, labelColor, score, enumC39181m6, c28655q2, (i27 & 14) | ((i27 >> 3) & 112) | ((i27 >> 12) & 896) | (i27 & 7168) | (i27 & 57344) | (458752 & i27) | ((i26 << 18) & 3670016));
                c28655q = c28655q2;
                enumC39181m4 = enumC39181m6;
                c2314t2 = c2314t;
                AbstractC31061c.m95650z(1, 4, c2314t2, c28655q, false);
                i29 = 5;
            }
            AbstractC18489d0.m53380u(i29, i28, c2314t2, c28655q);
            if ((i26 & 7168) == 2048) {
                z24 = true;
            } else {
                z24 = z19;
            }
            if ((29360128 & i27) == 8388608) {
                z25 = true;
            } else {
                z25 = z19;
            }
            z26 = z24 | z25;
            objM87133R = c28655q.m87133R();
            if (z26) {
                c28676v1 = c28676v0;
                if (objM87133R == c28676v1) {
                }
                Function1 function6 = (Function1) objM87133R;
                if ((i26 & 57344) == 16384) {
                    z27 = true;
                } else {
                    z27 = z19;
                }
                objM87133R2 = c28655q.m87133R();
                if (z27) {
                    objM87133R2 = new C2275b(onScrubEvent, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2275b(onScrubEvent, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                m63937F(graphItem, f13, function6, (Function1) objM87133R2, c28655q, ((i27 >> 27) & 14) | ((i27 >> 21) & 112), 0);
                if (AbstractC8693b.m21270d(body)) {
                    c28655q.m87150e0(666934264);
                    textResource = body;
                    String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q, (i27 >> 3) & 14);
                    C38072d c38072d3 = C38072d.f163053a;
                    i34 = 2;
                    i35 = 8;
                    AbstractC30795n.m94707h(strM21274h3, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2), c38072d3.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(z19);
                } else {
                    textResource = body;
                    i34 = 2;
                    i35 = 8;
                    c28655q.m87150e0(667220952);
                    c28655q.m87173q(z19);
                }
                if (AbstractC8693b.m21270d(textResource)) {
                    f14 = i34 * i35;
                    z28 = true;
                } else {
                    z28 = true;
                    f14 = 1 * i35;
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
                list2 = list;
                m63955X(list2, c28655q, (i26 >> 6) & 14);
                c28655q.m87173q(z28);
                enumC39181m2 = enumC39181m4;
                z14 = z18;
            } else {
                c28676v1 = r58;
            }
            objM87133R = new C3526n(function2, enumC22400l, 21);
            c28655q.m87172p0(objM87133R);
            Function1 function7 = (Function1) objM87133R;
            if ((i26 & 57344) == 16384) {
                z27 = true;
            } else {
                z27 = z19;
            }
            objM87133R2 = c28655q.m87133R();
            if (z27) {
                objM87133R2 = new C2275b(onScrubEvent, 10);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2275b(onScrubEvent, 10);
                c28655q.m87172p0(objM87133R2);
            }
            m63937F(graphItem, f13, function7, (Function1) objM87133R2, c28655q, ((i27 >> 27) & 14) | ((i27 >> 21) & 112), 0);
            if (AbstractC8693b.m21270d(body)) {
                c28655q.m87150e0(666934264);
                textResource = body;
                String strM21274h4 = AbstractC8693b.m21274h(textResource, c28655q, (i27 >> 3) & 14);
                C38072d c38072d4 = C38072d.f163053a;
                i34 = 2;
                i35 = 8;
                AbstractC30795n.m94707h(strM21274h4, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2), c38072d4.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(z19);
            } else {
                textResource = body;
                i34 = 2;
                i35 = 8;
                c28655q.m87150e0(667220952);
                c28655q.m87173q(z19);
            }
            if (AbstractC8693b.m21270d(textResource)) {
                f14 = i34 * i35;
                z28 = true;
            } else {
                z28 = true;
                f14 = 1 * i35;
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t2));
            list2 = list;
            m63955X(list2, c28655q, (i26 >> 6) & 14);
            c28655q.m87173q(z28);
            enumC39181m2 = enumC39181m4;
            z14 = z18;
        } else {
            c28655q = c28655q2;
            textResource = body;
            c28655q.m87138X();
            enumC39181m2 = enumC39181m;
            z14 = z4;
            function2 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.r
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22269z.m63936E(title, textResource, lastUpdatedText, label, labelColor, score, c39274g, enumC22400l, f13, graphItem, enumC39181m2, z14, list2, function2, onScrubEvent, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m63933B(Object obj) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m63934C(Function1 function1, EnumC22400l enumC22400l, Object obj) {
        function1.invoke(enumC22400l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m63935D(Function1 function1, InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m63936E(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, C39274g c39274g, EnumC22400l enumC22400l, float f13, InterfaceC25312u interfaceC25312u, EnumC39181m enumC39181m, boolean z4, List list, Function1 function1, Function1 function2, int i13, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m63932A(textResource, textResource2, textResource3, textResource4, interfaceC39332e, textResource5, c39274g, enumC22400l, f13, interfaceC25312u, enumC39181m, z4, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m63937F(final InterfaceC25312u interfaceC25312u, final float f13, Function1 function1, final Function1 function2, Composer composer, final int i13, final int i14) {
        int i15;
        Function1 function3;
        boolean z4;
        final Function1 function4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(367321814);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC25312u) : c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function3;
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, f13), 8 * 1.0f, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                C4004c5 c4004c5 = new C4004c5(4);
                z13 = (i15 & 896) == 256;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C2275b(function5, 11);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, null, c4004c5, (Function1) objM87133R, c28655q, i15 & 14, 2);
                c28655q.m87173q(true);
                function4 = function5;
            } else {
                c28655q.m87138X();
                function4 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.s
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22269z.m63941J(interfaceC25312u, f13, function4, function2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        function3 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(18);
                    c28655q.m87172p0(objM87133R2);
                }
                function5 = (Function1) objM87133R2;
            } else {
                function5 = function3;
            }
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, f13), 8 * 1.0f, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
            C4004c5 c4004c6 = new C4004c5(4);
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C2275b(function5, 11);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2275b(function5, 11);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, c4004c6, (Function1) objM87133R, c28655q, i15 & 14, 2);
            c28655q.m87173q(true);
            function4 = function5;
        } else {
            c28655q.m87138X();
            function4 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.s
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22269z.m63941J(interfaceC25312u, f13, function4, function2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m63938G(Object obj) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Modifier m63939H(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-196733332);
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3407d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m63940I(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m63941J(InterfaceC25312u interfaceC25312u, float f13, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m63937F(interfaceC25312u, f13, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: int
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
    /* JADX WARN: Failed to set immutable type for var: r51v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r51v0 ??, new type: int
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v6 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: K */
    public static final void m63942K(androidx.compose.p018ui.Modifier r33, p745y81.InterfaceC39332e r34, com.whoop.design.util.TextResource r35, com.whoop.design.util.TextResource r36, p745y81.InterfaceC39332e r37, com.whoop.design.util.TextResource r38, y71.C39274g r39, kd1.EnumC22400l r40, float r41, p720m91.InterfaceC25312u r42, com.whoop.design.util.TextResource r43, com.whoop.design.util.TextResource r44, boolean r45, java.util.List<? extends p720m91.InterfaceC25312u> r46, p715kotlin.jvm.functions.Function1 r47, p715kotlin.jvm.functions.Function1 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k71.AbstractC22269z.m63942K(androidx.compose.ui.Modifier, y81.e, com.whoop.design.util.TextResource, com.whoop.design.util.TextResource, y81.e, com.whoop.design.util.TextResource, y71.g, kd1.l, float, m91.u, com.whoop.design.util.TextResource, com.whoop.design.util.TextResource, boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m63943L(Object obj) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final InterfaceC39332e m63944M(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC39332e) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: N */
    private static final void m63945N(InterfaceC28601c1 interfaceC28601c1, InterfaceC39332e interfaceC39332e) {
        interfaceC28601c1.setValue(interfaceC39332e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m63946O(Function1 function1, EnumC22400l enumC22400l) {
        function1.invoke(enumC22400l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m63947P(boolean z4, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, float f13, InterfaceC25312u interfaceC25312u, List list, boolean z13, TextResource textResource3, TextResource textResource4, TextResource textResource5, C39274g c39274g, EnumC22400l enumC22400l, EnumC39181m enumC39181m, Function1 function1, C21395c c21395c, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, String str, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(1407910876);
            m63980u(textResource, interfaceC39332e, textResource2, f13, interfaceC25312u, list, z13, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1408273359);
            TextResource textResourceM63953V = m63953V(interfaceC28601c1);
            InterfaceC39332e interfaceC39332eM63944M = m63944M(interfaceC28601c2);
            TextResource textResourceM63951T = m63951T(interfaceC28601c3);
            boolean zM87157i = c28655q.m87157i(c21395c) | c28655q.m87153g(textResource2) | c28655q.m87153g(textResource) | c28655q.m87157i(interfaceC39332e) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C22267x c22267x = new C22267x(c21395c, str, textResource2, textResource, interfaceC39332e, function2, interfaceC28601c3, interfaceC28601c1, interfaceC28601c2, 0);
                c28655q.m87172p0(c22267x);
                objM87133R = c22267x;
            }
            m63932A(textResource3, textResource4, textResource5, textResourceM63953V, interfaceC39332eM63944M, textResourceM63951T, c39274g, enumC22400l, f13, interfaceC25312u, enumC39181m, z13, list, function1, (Function1) objM87133R, c28655q, 0, 0, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m63948Q(C21395c c21395c, String str, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        if (c21395c != null) {
            if ((it instanceof InterfaceC11732a.c) || (it instanceof InterfaceC11732a.a)) {
                AbstractC11258s abstractC11258s = it.mo31360b().get(str);
                if (abstractC11258s != null) {
                    C23471q c23471qM63961b0 = m63961b0((C0520a) AbstractC25265s.m74102I0(0, abstractC11258s.mo30408a()));
                    TextResource textResource3 = (TextResource) c23471qM63961b0.f92947w;
                    TextResource textResource4 = (TextResource) c23471qM63961b0.f92948x;
                    InterfaceC39332e interfaceC39332e2 = (InterfaceC39332e) c23471qM63961b0.f92949y;
                    m63952U(interfaceC28601c1, textResource3);
                    m63954W(interfaceC28601c2, textResource4);
                    m63945N(interfaceC28601c3, interfaceC39332e2);
                }
            } else {
                if (!it.equals(InterfaceC11732a.b.f37977a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m63952U(interfaceC28601c1, textResource);
                m63954W(interfaceC28601c2, textResource2);
                m63945N(interfaceC28601c3, interfaceC39332e);
            }
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m63949R(Modifier modifier, InterfaceC39332e interfaceC39332e, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e2, TextResource textResource3, C39274g c39274g, EnumC22400l enumC22400l, float f13, InterfaceC25312u interfaceC25312u, TextResource textResource4, TextResource textResource5, boolean z4, List list, Function1 function1, Function1 function2, int i13, int i14, int i15, Composer composer, int i16) {
        m63942K(modifier, interfaceC39332e, textResource, textResource2, interfaceC39332e2, textResource3, c39274g, enumC22400l, f13, interfaceC25312u, textResource4, textResource5, z4, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m63950S(InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final TextResource m63951T(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: U */
    private static final void m63952U(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: renamed from: V */
    private static final TextResource m63953V(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: W */
    private static final void m63954W(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: renamed from: X */
    private static final void m63955X(List<? extends InterfaceC25312u> list, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(408217767);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (list == null) {
            c28655q.m87150e0(-2131811670);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-2131811669);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, f13, 0.0f, 10);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-595091763);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q, 0, 14);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(list, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m63956Y(List list, int i13, Composer composer, int i14) {
        m63955X(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x0254  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Z */
    private static final void m63957Z(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        InterfaceC39332e interfaceC39332e2;
        TextResource textResource4;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        C2886a c2886a;
        int iHashCode2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1833994859);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(textResource3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i15 & 14);
                c38072d = C38072d.f163053a;
                long brandWhite = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                if (z16) {
                    c28655q2.m87150e0(-1176650446);
                    C2886a sh4 = c38072d.m121952e(c28655q2, 6).getSh4();
                    c28655q2.m87173q(false);
                    c2886a = sh4;
                } else {
                    c28655q2.m87150e0(-1176649455);
                    C2886a h7 = c38072d.m121952e(c28655q2, 6).getH4();
                    c28655q2.m87173q(false);
                    c2886a = h7;
                }
                int i17 = i15;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q2, 0, 0, 196602);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, (i17 >> 9) & 14), null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196602);
                textResource4 = textResource2;
                interfaceC39332e2 = interfaceC39332e;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q2, (i17 >> 3) & 14), null, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i17 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z15 = z16;
            } else {
                c28655q = c28655q2;
                interfaceC39332e2 = interfaceC39332e;
                textResource4 = textResource2;
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(textResource, textResource4, interfaceC39332e2, textResource3, z15, i13, i14, 20);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, i15 & 14);
            c38072d = C38072d.f163053a;
            long brandWhite2 = c38072d.m121949b(c28655q2, 6).getBrandWhite();
            if (z16) {
                c28655q2.m87150e0(-1176650446);
                C2886a sh5 = c38072d.m121952e(c28655q2, 6).getSh4();
                c28655q2.m87173q(false);
                c2886a = sh5;
            } else {
                c28655q2.m87150e0(-1176649455);
                C2886a h13 = c38072d.m121952e(c28655q2, 6).getH4();
                c28655q2.m87173q(false);
                c2886a = h13;
            }
            int i18 = i15;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q2, 0, 0, 196602);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, (i18 >> 9) & 14), null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 0, 0, 196602);
            textResource4 = textResource2;
            interfaceC39332e2 = interfaceC39332e;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z15 = z16;
        } else {
            c28655q = c28655q2;
            interfaceC39332e2 = interfaceC39332e;
            textResource4 = textResource2;
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(textResource, textResource4, interfaceC39332e2, textResource3, z15, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m63959a0(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, boolean z4, int i13, int i14, Composer composer, int i15) {
        m63957Z(textResource, textResource2, interfaceC39332e, textResource3, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private static final C23471q m63961b0(C0520a c0520a) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        if (c0520a == null || (textResourceM21267a = c0520a.getPrimaryContextualDisplay()) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        if (c0520a == null || (textResourceM21267a2 = c0520a.getValueDisplay()) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        return new C23471q(textResourceM21267a2, textResourceM21267a, p745y81.Function1.m125323a(b.f86898w));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:109:0x027b  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0151  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b0  */
    /* JADX INFO: renamed from: u */
    private static final void m63980u(final TextResource textResource, InterfaceC39332e interfaceC39332e, final TextResource textResource2, final float f13, final InterfaceC25312u interfaceC25312u, final List<? extends InterfaceC25312u> list, boolean z4, Composer composer, final int i13, final int i14) {
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        InterfaceC39332e interfaceC39332e2;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int iHashCode3;
        boolean z17;
        C2886a h7;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1564461309);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(interfaceC25312u) : c28655q.m87157i(interfaceC25312u) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(list) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i17 = i14 & 64;
        if (i17 == 0) {
            if ((1572864 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 1048576 : 524288;
            }
            i16 = i15;
            if ((i16 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                if (i17 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
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
                float f14 = 8;
                float f15 = 2 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
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
                C2306l c2306l = C2299e.f9109L;
                float f16 = 1;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(4 * f16);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i16 & 14);
                interfaceC39332e2 = interfaceC39332e;
                long jMo134584toComposableColorWaAFU9c = interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 3) & 14);
                if (z16) {
                    c28655q.m87150e0(-1648666234);
                    h7 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                    z17 = false;
                } else {
                    z17 = false;
                    c28655q.m87150e0(-1648665243);
                    h7 = C38072d.f163053a.m121952e(c28655q, 6).getH4();
                }
                c28655q.m87173q(z17);
                AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, 0, 196602);
                int i18 = i16 >> 6;
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, i18 & 14);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                float f17 = f16 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(21);
                    c28655q.m87172p0(objM87133R);
                }
                m63937F(interfaceC25312u, f13, null, (Function1) objM87133R, c28655q, (i18 & 112) | ((i16 >> 12) & 14) | 3072, 4);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                m63955X(list, c28655q, (i16 >> 15) & 14);
                c28655q.m87173q(true);
                z15 = z16;
            } else {
                interfaceC39332e2 = interfaceC39332e;
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final InterfaceC39332e interfaceC39332e3 = interfaceC39332e2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.y
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22269z.m63982w(textResource, interfaceC39332e3, textResource2, f13, interfaceC25312u, list, z15, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 1572864;
        z13 = z4;
        i16 = i15;
        if ((i16 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            if (i17 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
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
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            float f18 = 8;
            float f19 = 2 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19, c2314t2));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9103F, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            C2306l c2306l2 = C2299e.f9109L;
            float f110 = 1;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(4 * f110);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f19, 0.0f, 11);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q, i16 & 14);
            interfaceC39332e2 = interfaceC39332e;
            long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e2.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 3) & 14);
            if (z16) {
                c28655q.m87150e0(-1648666234);
                h7 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                z17 = false;
            } else {
                z17 = false;
                c28655q.m87150e0(-1648665243);
                h7 = C38072d.f163053a.m121952e(c28655q, 6).getH4();
            }
            c28655q.m87173q(z17);
            AbstractC30795n.m94707h(strM21274h3, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, 0, 196602);
            int i19 = i16 >> 6;
            String strM21274h4 = AbstractC8693b.m21274h(textResource2, c28655q, i19 & 14);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h4, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            float f111 = f110 * f18;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t2));
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C21875f(21);
                c28655q.m87172p0(objM87133R);
            }
            m63937F(interfaceC25312u, f13, null, (Function1) objM87133R, c28655q, (i19 & 112) | ((i16 >> 12) & 14) | 3072, 4);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t2));
            m63955X(list, c28655q, (i16 >> 15) & 14);
            c28655q.m87173q(true);
            z15 = z16;
        } else {
            interfaceC39332e2 = interfaceC39332e;
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final InterfaceC39332e interfaceC39332e4 = interfaceC39332e2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.y
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22269z.m63982w(textResource, interfaceC39332e4, textResource2, f13, interfaceC25312u, list, z15, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m63981v(InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m63982w(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, float f13, InterfaceC25312u interfaceC25312u, List list, boolean z4, int i13, int i14, Composer composer, int i15) {
        m63980u(textResource, interfaceC39332e, textResource2, f13, interfaceC25312u, list, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m63983x(final TextResource textResource, final TextResource textResource2, final C39274g c39274g, final TextResource textResource3, final InterfaceC39332e interfaceC39332e, final TextResource textResource4, EnumC39181m enumC39181m, Composer composer, final int i13) throws XmlPullParserException, IOException {
        int i14;
        EnumC39181m enumC39181m2;
        float f13;
        boolean z4;
        boolean z13;
        C2886a h7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1660237930);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c39274g) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(textResource3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(textResource4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87149e(enumC39181m.ordinal()) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean z14 = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA);
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, 0.0f, 10);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int i15 = i14;
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            final boolean z15 = z14;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 2.75d) * f14, 0.0f, f15, 5);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f14, c2305k), C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (c39274g == null) {
                c28655q.m87150e0(703013078);
                c28655q.m87173q(false);
                z4 = false;
                z13 = true;
            } else {
                c28655q.m87150e0(703013079);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c39274g.getIcon(), c28655q, 6);
                long white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                if (z15) {
                    float f16 = 4;
                    f13 = f16 * f16;
                } else {
                    f13 = 5 * 4;
                }
                z4 = false;
                z13 = true;
                AbstractC15005f3.m43108b(c27430eM107874S, "", AbstractC1102d.m3419p(f13, c2314t), white50, c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i15 & 14);
            if (!(((double) 1.0f) > 0.0d ? z13 : z4)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z13);
            C38072d c38072d = C38072d.f163053a;
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            if (z15) {
                c28655q.m87150e0(1962357491);
                h7 = c38072d.m121952e(c28655q, 6).getSh4();
            } else {
                c28655q.m87150e0(1962358482);
                h7 = c38072d.m121952e(c28655q, 6).getH4();
            }
            c28655q.m87173q(z4);
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            if (z15) {
                c28655q.m87150e0(704068691);
                if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_IA_CARET)) {
                    c28655q.m87150e0(704159955);
                    float f17 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(f17 * f17, c2314t), "right caret"), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(704545874);
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(703688972);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(5 * 4, c2314t), "right caret"), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z13);
            enumC39181m2 = enumC39181m;
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(enumC39181m2), AbstractC37817c.m121344e(-317254668, c28655q, new InterfaceC4351m() { // from class: k71.t
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22269z.m63984y(textResource2, z15, textResource3, interfaceC39332e, textResource4, (Composer) obj, iIntValue);
                }
            }), c28655q, 56);
            c28655q.m87173q(z13);
        } else {
            enumC39181m2 = enumC39181m;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final EnumC39181m enumC39181m3 = enumC39181m2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: k71.u
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22269z.m63985z(textResource, textResource2, c39274g, textResource3, interfaceC39332e, textResource4, enumC39181m3, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m63984y(TextResource textResource, boolean z4, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, Composer composer, int i13) {
        long jM53358D;
        C2886a b6;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(C2299e.f9108K);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
            if (z4) {
                c28655q.m87150e0(1755136311);
                jM53358D = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1755137303);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            }
            if (z4) {
                c28655q.m87150e0(1755139730);
                b6 = C38072d.f163053a.m121952e(c28655q, 6).getB2();
            } else {
                c28655q.m87150e0(1755140690);
                b6 = C38072d.f163053a.m121952e(c28655q, 6).getB4();
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM21274h, verticalAlignElement, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, 0, 196600);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, 0);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 48, 0, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m63985z(TextResource textResource, TextResource textResource2, C39274g c39274g, TextResource textResource3, InterfaceC39332e interfaceC39332e, TextResource textResource4, EnumC39181m enumC39181m, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m63983x(textResource, textResource2, c39274g, textResource3, interfaceC39332e, textResource4, enumC39181m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
