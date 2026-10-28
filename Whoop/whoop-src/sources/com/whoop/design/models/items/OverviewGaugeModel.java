package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019Bµ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00104JÄ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bN\u0010$R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bO\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bR\u0010(R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bS\u0010(R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bT\u0010 R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bU\u0010(R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bV\u0010(R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bW\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bX\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\b[\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b^\u00104¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/OverviewGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "hasSleepPerformance", "", "recoveryLevel", "Lcom/whoop/design/util/TextResource;", "recoveryScoreDisplay", "dayStrainDisplay", "sleepPerformanceDisplay", "", "recoveryScoreGaugeFillPercentage", "dayStrainGaugeFillPercentage", "sleepPerformanceGaugeFillPercentage", "onboarding", "optimalStrainGaugeFillPercentage", "lowerOptimalStrainFillValue", "higherOptimalStrainFillValue", "hrvDisplay", "weeklyPlanGoalStrainGaugeFillPercentage", "weeklyPlanDisplay", "Lcom/whoop/design/models/items/CustomGaugeEntryModel;", "firstCustomGaugeEntry", "secondCustomGaugeEntry", "<init>", "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "component5", "component6", "()F", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Float;", "component15", "component16", "()Lcom/whoop/design/models/items/CustomGaugeEntryModel;", "component17", "copy", "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lcom/whoop/design/models/items/OverviewGaugeModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/OverviewGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "getHasSleepPerformance", "Ljava/lang/String;", "getRecoveryLevel", "Lcom/whoop/design/util/TextResource;", "getRecoveryScoreDisplay", "getDayStrainDisplay", "getSleepPerformanceDisplay", "F", "getRecoveryScoreGaugeFillPercentage", "getDayStrainGaugeFillPercentage", "getSleepPerformanceGaugeFillPercentage", "getOnboarding", "getOptimalStrainGaugeFillPercentage", "getLowerOptimalStrainFillValue", "getHigherOptimalStrainFillValue", "getHrvDisplay", "Ljava/lang/Float;", "getWeeklyPlanGoalStrainGaugeFillPercentage", "getWeeklyPlanDisplay", "Lcom/whoop/design/models/items/CustomGaugeEntryModel;", "getFirstCustomGaugeEntry", "getSecondCustomGaugeEntry", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OverviewGaugeModel implements DesignSystemModel {
    private final TextResource dayStrainDisplay;
    private final float dayStrainGaugeFillPercentage;
    private final CustomGaugeEntryModel firstCustomGaugeEntry;
    private final boolean hasSleepPerformance;
    private final float higherOptimalStrainFillValue;
    private final String hrvDisplay;
    private final float lowerOptimalStrainFillValue;
    private final boolean onboarding;
    private final float optimalStrainGaugeFillPercentage;
    private final String recoveryLevel;
    private final TextResource recoveryScoreDisplay;
    private final float recoveryScoreGaugeFillPercentage;
    private final CustomGaugeEntryModel secondCustomGaugeEntry;
    private final TextResource sleepPerformanceDisplay;
    private final float sleepPerformanceGaugeFillPercentage;
    private final String weeklyPlanDisplay;
    private final Float weeklyPlanGoalStrainGaugeFillPercentage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/OverviewGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OverviewGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OverviewGaugeModel() {
        this(false, (String) null, (TextResource) null, (TextResource) null, (TextResource) null, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, (String) null, (Float) null, (String) null, (CustomGaugeEntryModel) null, (CustomGaugeEntryModel) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OverviewGaugeModel copy$default(OverviewGaugeModel overviewGaugeModel, boolean z4, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, float f13, float f14, float f15, boolean z13, float f16, float f17, float f18, String str2, Float f19, String str3, CustomGaugeEntryModel customGaugeEntryModel, CustomGaugeEntryModel customGaugeEntryModel2, int i13, Object obj) {
        CustomGaugeEntryModel customGaugeEntryModel3;
        CustomGaugeEntryModel customGaugeEntryModel4;
        boolean z14 = (i13 & 1) != 0 ? overviewGaugeModel.hasSleepPerformance : z4;
        String str4 = (i13 & 2) != 0 ? overviewGaugeModel.recoveryLevel : str;
        TextResource textResource4 = (i13 & 4) != 0 ? overviewGaugeModel.recoveryScoreDisplay : textResource;
        TextResource textResource5 = (i13 & 8) != 0 ? overviewGaugeModel.dayStrainDisplay : textResource2;
        TextResource textResource6 = (i13 & 16) != 0 ? overviewGaugeModel.sleepPerformanceDisplay : textResource3;
        float f24 = (i13 & 32) != 0 ? overviewGaugeModel.recoveryScoreGaugeFillPercentage : f13;
        float f25 = (i13 & 64) != 0 ? overviewGaugeModel.dayStrainGaugeFillPercentage : f14;
        float f26 = (i13 & 128) != 0 ? overviewGaugeModel.sleepPerformanceGaugeFillPercentage : f15;
        boolean z15 = (i13 & 256) != 0 ? overviewGaugeModel.onboarding : z13;
        float f27 = (i13 & 512) != 0 ? overviewGaugeModel.optimalStrainGaugeFillPercentage : f16;
        float f28 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? overviewGaugeModel.lowerOptimalStrainFillValue : f17;
        float f29 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? overviewGaugeModel.higherOptimalStrainFillValue : f18;
        String str5 = (i13 & 4096) != 0 ? overviewGaugeModel.hrvDisplay : str2;
        Float f34 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? overviewGaugeModel.weeklyPlanGoalStrainGaugeFillPercentage : f19;
        boolean z16 = z14;
        String str6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? overviewGaugeModel.weeklyPlanDisplay : str3;
        CustomGaugeEntryModel customGaugeEntryModel5 = (i13 & 32768) != 0 ? overviewGaugeModel.firstCustomGaugeEntry : customGaugeEntryModel;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            customGaugeEntryModel4 = customGaugeEntryModel5;
            customGaugeEntryModel3 = overviewGaugeModel.secondCustomGaugeEntry;
        } else {
            customGaugeEntryModel3 = customGaugeEntryModel2;
            customGaugeEntryModel4 = customGaugeEntryModel5;
        }
        return overviewGaugeModel.copy(z16, str4, textResource4, textResource5, textResource6, f24, f25, f26, z15, f27, f28, f29, str5, f34, str6, customGaugeEntryModel4, customGaugeEntryModel3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(OverviewGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.hasSleepPerformance) {
            output.encodeBooleanElement(serialDesc, 0, self.hasSleepPerformance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.recoveryLevel, "HIGH")) {
            output.encodeStringElement(serialDesc, 1, self.recoveryLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.recoveryScoreDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.recoveryScoreDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.dayStrainDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.dayStrainDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.sleepPerformanceDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 4, C25452a.f99689a, self.sleepPerformanceDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Float.compare(self.recoveryScoreGaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 5, self.recoveryScoreGaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Float.compare(self.dayStrainGaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 6, self.dayStrainGaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || Float.compare(self.sleepPerformanceGaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 7, self.sleepPerformanceGaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.onboarding) {
            output.encodeBooleanElement(serialDesc, 8, self.onboarding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || Float.compare(self.optimalStrainGaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 9, self.optimalStrainGaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || Float.compare(self.lowerOptimalStrainFillValue, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 10, self.lowerOptimalStrainFillValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || Float.compare(self.higherOptimalStrainFillValue, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 11, self.higherOptimalStrainFillValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !AbstractC22676k.m65745e(self.hrvDisplay, "")) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.hrvDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !AbstractC22676k.m65745e(self.weeklyPlanGoalStrainGaugeFillPercentage, Float.valueOf(0.0f))) {
            output.encodeNullableSerializableElement(serialDesc, 13, FloatSerializer.INSTANCE, self.weeklyPlanGoalStrainGaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || !AbstractC22676k.m65745e(self.weeklyPlanDisplay, "")) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.weeklyPlanDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.firstCustomGaugeEntry != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, CustomGaugeEntryModel$$serializer.INSTANCE, self.firstCustomGaugeEntry);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.secondCustomGaugeEntry == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, CustomGaugeEntryModel$$serializer.INSTANCE, self.secondCustomGaugeEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasSleepPerformance() {
        return this.hasSleepPerformance;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getOptimalStrainGaugeFillPercentage() {
        return this.optimalStrainGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getLowerOptimalStrainFillValue() {
        return this.lowerOptimalStrainFillValue;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getHigherOptimalStrainFillValue() {
        return this.higherOptimalStrainFillValue;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHrvDisplay() {
        return this.hrvDisplay;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Float getWeeklyPlanGoalStrainGaugeFillPercentage() {
        return this.weeklyPlanGoalStrainGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getWeeklyPlanDisplay() {
        return this.weeklyPlanDisplay;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final CustomGaugeEntryModel getFirstCustomGaugeEntry() {
        return this.firstCustomGaugeEntry;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CustomGaugeEntryModel getSecondCustomGaugeEntry() {
        return this.secondCustomGaugeEntry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getRecoveryScoreDisplay() {
        return this.recoveryScoreDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getDayStrainDisplay() {
        return this.dayStrainDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getSleepPerformanceDisplay() {
        return this.sleepPerformanceDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRecoveryScoreGaugeFillPercentage() {
        return this.recoveryScoreGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getDayStrainGaugeFillPercentage() {
        return this.dayStrainGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getSleepPerformanceGaugeFillPercentage() {
        return this.sleepPerformanceGaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getOnboarding() {
        return this.onboarding;
    }

    public final OverviewGaugeModel copy(boolean hasSleepPerformance, String recoveryLevel, TextResource recoveryScoreDisplay, TextResource dayStrainDisplay, TextResource sleepPerformanceDisplay, float recoveryScoreGaugeFillPercentage, float dayStrainGaugeFillPercentage, float sleepPerformanceGaugeFillPercentage, boolean onboarding, float optimalStrainGaugeFillPercentage, float lowerOptimalStrainFillValue, float higherOptimalStrainFillValue, String hrvDisplay, Float weeklyPlanGoalStrainGaugeFillPercentage, String weeklyPlanDisplay, CustomGaugeEntryModel firstCustomGaugeEntry, CustomGaugeEntryModel secondCustomGaugeEntry) {
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(recoveryScoreDisplay, "recoveryScoreDisplay");
        AbstractC22676k.m65750j(dayStrainDisplay, "dayStrainDisplay");
        AbstractC22676k.m65750j(sleepPerformanceDisplay, "sleepPerformanceDisplay");
        return new OverviewGaugeModel(hasSleepPerformance, recoveryLevel, recoveryScoreDisplay, dayStrainDisplay, sleepPerformanceDisplay, recoveryScoreGaugeFillPercentage, dayStrainGaugeFillPercentage, sleepPerformanceGaugeFillPercentage, onboarding, optimalStrainGaugeFillPercentage, lowerOptimalStrainFillValue, higherOptimalStrainFillValue, hrvDisplay, weeklyPlanGoalStrainGaugeFillPercentage, weeklyPlanDisplay, firstCustomGaugeEntry, secondCustomGaugeEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverviewGaugeModel)) {
            return false;
        }
        OverviewGaugeModel overviewGaugeModel = (OverviewGaugeModel) other;
        return this.hasSleepPerformance == overviewGaugeModel.hasSleepPerformance && AbstractC22676k.m65745e(this.recoveryLevel, overviewGaugeModel.recoveryLevel) && AbstractC22676k.m65745e(this.recoveryScoreDisplay, overviewGaugeModel.recoveryScoreDisplay) && AbstractC22676k.m65745e(this.dayStrainDisplay, overviewGaugeModel.dayStrainDisplay) && AbstractC22676k.m65745e(this.sleepPerformanceDisplay, overviewGaugeModel.sleepPerformanceDisplay) && Float.compare(this.recoveryScoreGaugeFillPercentage, overviewGaugeModel.recoveryScoreGaugeFillPercentage) == 0 && Float.compare(this.dayStrainGaugeFillPercentage, overviewGaugeModel.dayStrainGaugeFillPercentage) == 0 && Float.compare(this.sleepPerformanceGaugeFillPercentage, overviewGaugeModel.sleepPerformanceGaugeFillPercentage) == 0 && this.onboarding == overviewGaugeModel.onboarding && Float.compare(this.optimalStrainGaugeFillPercentage, overviewGaugeModel.optimalStrainGaugeFillPercentage) == 0 && Float.compare(this.lowerOptimalStrainFillValue, overviewGaugeModel.lowerOptimalStrainFillValue) == 0 && Float.compare(this.higherOptimalStrainFillValue, overviewGaugeModel.higherOptimalStrainFillValue) == 0 && AbstractC22676k.m65745e(this.hrvDisplay, overviewGaugeModel.hrvDisplay) && AbstractC22676k.m65745e(this.weeklyPlanGoalStrainGaugeFillPercentage, overviewGaugeModel.weeklyPlanGoalStrainGaugeFillPercentage) && AbstractC22676k.m65745e(this.weeklyPlanDisplay, overviewGaugeModel.weeklyPlanDisplay) && AbstractC22676k.m65745e(this.firstCustomGaugeEntry, overviewGaugeModel.firstCustomGaugeEntry) && AbstractC22676k.m65745e(this.secondCustomGaugeEntry, overviewGaugeModel.secondCustomGaugeEntry);
    }

    public final TextResource getDayStrainDisplay() {
        return this.dayStrainDisplay;
    }

    public final float getDayStrainGaugeFillPercentage() {
        return this.dayStrainGaugeFillPercentage;
    }

    public final CustomGaugeEntryModel getFirstCustomGaugeEntry() {
        return this.firstCustomGaugeEntry;
    }

    public final boolean getHasSleepPerformance() {
        return this.hasSleepPerformance;
    }

    public final float getHigherOptimalStrainFillValue() {
        return this.higherOptimalStrainFillValue;
    }

    public final String getHrvDisplay() {
        return this.hrvDisplay;
    }

    public final float getLowerOptimalStrainFillValue() {
        return this.lowerOptimalStrainFillValue;
    }

    public final boolean getOnboarding() {
        return this.onboarding;
    }

    public final float getOptimalStrainGaugeFillPercentage() {
        return this.optimalStrainGaugeFillPercentage;
    }

    public final String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public final TextResource getRecoveryScoreDisplay() {
        return this.recoveryScoreDisplay;
    }

    public final float getRecoveryScoreGaugeFillPercentage() {
        return this.recoveryScoreGaugeFillPercentage;
    }

    public final CustomGaugeEntryModel getSecondCustomGaugeEntry() {
        return this.secondCustomGaugeEntry;
    }

    public final TextResource getSleepPerformanceDisplay() {
        return this.sleepPerformanceDisplay;
    }

    public final float getSleepPerformanceGaugeFillPercentage() {
        return this.sleepPerformanceGaugeFillPercentage;
    }

    public final String getWeeklyPlanDisplay() {
        return this.weeklyPlanDisplay;
    }

    public final Float getWeeklyPlanGoalStrainGaugeFillPercentage() {
        return this.weeklyPlanGoalStrainGaugeFillPercentage;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.higherOptimalStrainFillValue, AbstractC11266d.m30447a(this.lowerOptimalStrainFillValue, AbstractC11266d.m30447a(this.optimalStrainGaugeFillPercentage, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.sleepPerformanceGaugeFillPercentage, AbstractC11266d.m30447a(this.dayStrainGaugeFillPercentage, AbstractC11266d.m30447a(this.recoveryScoreGaugeFillPercentage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(Boolean.hashCode(this.hasSleepPerformance) * 31, 31, this.recoveryLevel), this.recoveryScoreDisplay, 31), this.dayStrainDisplay, 31), this.sleepPerformanceDisplay, 31), 31), 31), 31), 31, this.onboarding), 31), 31), 31);
        String str = this.hrvDisplay;
        int iHashCode = (iM30447a + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.weeklyPlanGoalStrainGaugeFillPercentage;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str2 = this.weeklyPlanDisplay;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CustomGaugeEntryModel customGaugeEntryModel = this.firstCustomGaugeEntry;
        int iHashCode4 = (iHashCode3 + (customGaugeEntryModel == null ? 0 : customGaugeEntryModel.hashCode())) * 31;
        CustomGaugeEntryModel customGaugeEntryModel2 = this.secondCustomGaugeEntry;
        return iHashCode4 + (customGaugeEntryModel2 != null ? customGaugeEntryModel2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.hasSleepPerformance;
        String str = this.recoveryLevel;
        TextResource textResource = this.recoveryScoreDisplay;
        TextResource textResource2 = this.dayStrainDisplay;
        TextResource textResource3 = this.sleepPerformanceDisplay;
        float f13 = this.recoveryScoreGaugeFillPercentage;
        float f14 = this.dayStrainGaugeFillPercentage;
        float f15 = this.sleepPerformanceGaugeFillPercentage;
        boolean z13 = this.onboarding;
        float f16 = this.optimalStrainGaugeFillPercentage;
        float f17 = this.lowerOptimalStrainFillValue;
        float f18 = this.higherOptimalStrainFillValue;
        String str2 = this.hrvDisplay;
        Float f19 = this.weeklyPlanGoalStrainGaugeFillPercentage;
        String str3 = this.weeklyPlanDisplay;
        CustomGaugeEntryModel customGaugeEntryModel = this.firstCustomGaugeEntry;
        CustomGaugeEntryModel customGaugeEntryModel2 = this.secondCustomGaugeEntry;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("OverviewGaugeModel(hasSleepPerformance=", ", recoveryLevel=", str, ", recoveryScoreDisplay=", z4);
        AbstractC30007c.m91855y(sbM38567n, textResource, ", dayStrainDisplay=", textResource2, ", sleepPerformanceDisplay=");
        sbM38567n.append(textResource3);
        sbM38567n.append(", recoveryScoreGaugeFillPercentage=");
        sbM38567n.append(f13);
        sbM38567n.append(", dayStrainGaugeFillPercentage=");
        AbstractC30802r.m94772u(sbM38567n, f14, ", sleepPerformanceGaugeFillPercentage=", f15, ", onboarding=");
        sbM38567n.append(z13);
        sbM38567n.append(", optimalStrainGaugeFillPercentage=");
        sbM38567n.append(f16);
        sbM38567n.append(", lowerOptimalStrainFillValue=");
        AbstractC30802r.m94772u(sbM38567n, f17, ", higherOptimalStrainFillValue=", f18, ", hrvDisplay=");
        sbM38567n.append(str2);
        sbM38567n.append(", weeklyPlanGoalStrainGaugeFillPercentage=");
        sbM38567n.append(f19);
        sbM38567n.append(", weeklyPlanDisplay=");
        sbM38567n.append(str3);
        sbM38567n.append(", firstCustomGaugeEntry=");
        sbM38567n.append(customGaugeEntryModel);
        sbM38567n.append(", secondCustomGaugeEntry=");
        sbM38567n.append(customGaugeEntryModel2);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ OverviewGaugeModel(int i13, boolean z4, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, float f13, float f14, float f15, boolean z13, float f16, float f17, float f18, String str2, Float f19, String str3, CustomGaugeEntryModel customGaugeEntryModel, CustomGaugeEntryModel customGaugeEntryModel2, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasSleepPerformance = (i13 & 1) == 0 ? true : z4;
        if ((i13 & 2) == 0) {
            this.recoveryLevel = "HIGH";
        } else {
            this.recoveryLevel = str;
        }
        if ((i13 & 4) == 0) {
            this.recoveryScoreDisplay = AbstractC8693b.m21267a();
        } else {
            this.recoveryScoreDisplay = textResource;
        }
        if ((i13 & 8) == 0) {
            this.dayStrainDisplay = AbstractC8693b.m21267a();
        } else {
            this.dayStrainDisplay = textResource2;
        }
        if ((i13 & 16) == 0) {
            this.sleepPerformanceDisplay = AbstractC8693b.m21267a();
        } else {
            this.sleepPerformanceDisplay = textResource3;
        }
        if ((i13 & 32) == 0) {
            this.recoveryScoreGaugeFillPercentage = 0.0f;
        } else {
            this.recoveryScoreGaugeFillPercentage = f13;
        }
        if ((i13 & 64) == 0) {
            this.dayStrainGaugeFillPercentage = 0.0f;
        } else {
            this.dayStrainGaugeFillPercentage = f14;
        }
        if ((i13 & 128) == 0) {
            this.sleepPerformanceGaugeFillPercentage = 0.0f;
        } else {
            this.sleepPerformanceGaugeFillPercentage = f15;
        }
        if ((i13 & 256) == 0) {
            this.onboarding = false;
        } else {
            this.onboarding = z13;
        }
        if ((i13 & 512) == 0) {
            this.optimalStrainGaugeFillPercentage = 0.0f;
        } else {
            this.optimalStrainGaugeFillPercentage = f16;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.lowerOptimalStrainFillValue = 0.0f;
        } else {
            this.lowerOptimalStrainFillValue = f17;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.higherOptimalStrainFillValue = 0.0f;
        } else {
            this.higherOptimalStrainFillValue = f18;
        }
        if ((i13 & 4096) == 0) {
            this.hrvDisplay = "";
        } else {
            this.hrvDisplay = str2;
        }
        this.weeklyPlanGoalStrainGaugeFillPercentage = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? Float.valueOf(0.0f) : f19;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.weeklyPlanDisplay = "";
        } else {
            this.weeklyPlanDisplay = str3;
        }
        if ((32768 & i13) == 0) {
            this.firstCustomGaugeEntry = null;
        } else {
            this.firstCustomGaugeEntry = customGaugeEntryModel;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
            this.secondCustomGaugeEntry = null;
        } else {
            this.secondCustomGaugeEntry = customGaugeEntryModel2;
        }
    }

    public OverviewGaugeModel(boolean z4, String recoveryLevel, TextResource recoveryScoreDisplay, TextResource dayStrainDisplay, TextResource sleepPerformanceDisplay, float f13, float f14, float f15, boolean z13, float f16, float f17, float f18, String str, Float f19, String str2, CustomGaugeEntryModel customGaugeEntryModel, CustomGaugeEntryModel customGaugeEntryModel2) {
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(recoveryScoreDisplay, "recoveryScoreDisplay");
        AbstractC22676k.m65750j(dayStrainDisplay, "dayStrainDisplay");
        AbstractC22676k.m65750j(sleepPerformanceDisplay, "sleepPerformanceDisplay");
        this.hasSleepPerformance = z4;
        this.recoveryLevel = recoveryLevel;
        this.recoveryScoreDisplay = recoveryScoreDisplay;
        this.dayStrainDisplay = dayStrainDisplay;
        this.sleepPerformanceDisplay = sleepPerformanceDisplay;
        this.recoveryScoreGaugeFillPercentage = f13;
        this.dayStrainGaugeFillPercentage = f14;
        this.sleepPerformanceGaugeFillPercentage = f15;
        this.onboarding = z13;
        this.optimalStrainGaugeFillPercentage = f16;
        this.lowerOptimalStrainFillValue = f17;
        this.higherOptimalStrainFillValue = f18;
        this.hrvDisplay = str;
        this.weeklyPlanGoalStrainGaugeFillPercentage = f19;
        this.weeklyPlanDisplay = str2;
        this.firstCustomGaugeEntry = customGaugeEntryModel;
        this.secondCustomGaugeEntry = customGaugeEntryModel2;
    }

    public /* synthetic */ OverviewGaugeModel(boolean z4, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, float f13, float f14, float f15, boolean z13, float f16, float f17, float f18, String str2, Float f19, String str3, CustomGaugeEntryModel customGaugeEntryModel, CustomGaugeEntryModel customGaugeEntryModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? "HIGH" : str, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? 0.0f : f13, (i13 & 64) != 0 ? 0.0f : f14, (i13 & 128) != 0 ? 0.0f : f15, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? 0.0f : f16, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0.0f : f17, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 0.0f : f18, (i13 & 4096) != 0 ? "" : str2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? Float.valueOf(0.0f) : f19, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? str3 : "", (32768 & i13) != 0 ? null : customGaugeEntryModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : customGaugeEntryModel2);
    }
}
