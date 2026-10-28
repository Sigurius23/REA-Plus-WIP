package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J \u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bD\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bI\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bJ\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bK\u0010\u001cR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010*R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010,¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/items/ScoreGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "scoreDisplay", "scoreDisplaySuffix", "scoreDisplayTitle", "", "scoreTarget", "gaugeFillPercentage", "lowerOptimalPercentage", "higherOptimalPercentage", "progressFillStyle", "", "Lcom/whoop/design/models/LegendStyle;", "barStyles", "Lcom/whoop/design/models/items/DisplayStyle;", "scoreDisplayStyle", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Float;", "component6", "()F", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/design/models/items/DisplayStyle;", "component12", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/DisplayStyle;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ScoreGaugeModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ScoreGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getScoreDisplay", "getScoreDisplaySuffix", "getScoreDisplayTitle", "Ljava/lang/Float;", "getScoreTarget", "F", "getGaugeFillPercentage", "getLowerOptimalPercentage", "getHigherOptimalPercentage", "getProgressFillStyle", "Ljava/util/List;", "getBarStyles", "Lcom/whoop/design/models/items/DisplayStyle;", "getScoreDisplayStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScoreGaugeModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<LegendStyle> barStyles;
    private final C9598e destination;
    private final float gaugeFillPercentage;
    private final Float higherOptimalPercentage;
    private final String id;
    private final Float lowerOptimalPercentage;
    private final String progressFillStyle;
    private final String scoreDisplay;
    private final DisplayStyle scoreDisplayStyle;
    private final String scoreDisplaySuffix;
    private final String scoreDisplayTitle;
    private final Float scoreTarget;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ScoreGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ScoreGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScoreGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(14)), AbstractC30060g.m92087G(enumC23463i, new C36962i(15)), AbstractC30060g.m92087G(enumC23463i, new C36962i(16))};
    }

    public /* synthetic */ ScoreGaugeModel(int i13, String str, String str2, String str3, String str4, Float f13, float f14, Float f15, Float f16, String str5, List list, DisplayStyle displayStyle, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (3071 != (i13 & 3071)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3071, ScoreGaugeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.scoreDisplay = str2;
        this.scoreDisplaySuffix = str3;
        this.scoreDisplayTitle = str4;
        this.scoreTarget = f13;
        this.gaugeFillPercentage = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.progressFillStyle = str5;
        this.barStyles = list;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.scoreDisplayStyle = null;
        } else {
            this.scoreDisplayStyle = displayStyle;
        }
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LegendStyle.INSTANCE.serializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.DisplayStyle", DisplayStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScoreGaugeModel copy$default(ScoreGaugeModel scoreGaugeModel, String str, String str2, String str3, String str4, Float f13, float f14, Float f15, Float f16, String str5, List list, DisplayStyle displayStyle, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = scoreGaugeModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = scoreGaugeModel.scoreDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = scoreGaugeModel.scoreDisplaySuffix;
        }
        if ((i13 & 8) != 0) {
            str4 = scoreGaugeModel.scoreDisplayTitle;
        }
        if ((i13 & 16) != 0) {
            f13 = scoreGaugeModel.scoreTarget;
        }
        if ((i13 & 32) != 0) {
            f14 = scoreGaugeModel.gaugeFillPercentage;
        }
        if ((i13 & 64) != 0) {
            f15 = scoreGaugeModel.lowerOptimalPercentage;
        }
        if ((i13 & 128) != 0) {
            f16 = scoreGaugeModel.higherOptimalPercentage;
        }
        if ((i13 & 256) != 0) {
            str5 = scoreGaugeModel.progressFillStyle;
        }
        if ((i13 & 512) != 0) {
            list = scoreGaugeModel.barStyles;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            displayStyle = scoreGaugeModel.scoreDisplayStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c9598e = scoreGaugeModel.destination;
        }
        DisplayStyle displayStyle2 = displayStyle;
        C9598e c9598e2 = c9598e;
        String str6 = str5;
        List list2 = list;
        Float f17 = f15;
        Float f18 = f16;
        Float f19 = f13;
        float f24 = f14;
        return scoreGaugeModel.copy(str, str2, str3, str4, f19, f24, f17, f18, str6, list2, displayStyle2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ScoreGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.scoreDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.scoreDisplaySuffix);
        output.encodeStringElement(serialDesc, 3, self.scoreDisplayTitle);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, floatSerializer, self.scoreTarget);
        output.encodeFloatElement(serialDesc, 5, self.gaugeFillPercentage);
        output.encodeNullableSerializableElement(serialDesc, 6, floatSerializer, self.lowerOptimalPercentage);
        output.encodeNullableSerializableElement(serialDesc, 7, floatSerializer, self.higherOptimalPercentage);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.progressFillStyle);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.barStyles);
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.scoreDisplayStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.scoreDisplayStyle);
        }
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<LegendStyle> component10() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DisplayStyle getScoreDisplayStyle() {
        return this.scoreDisplayStyle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScoreDisplayTitle() {
        return this.scoreDisplayTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getScoreTarget() {
        return this.scoreTarget;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getLowerOptimalPercentage() {
        return this.lowerOptimalPercentage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getHigherOptimalPercentage() {
        return this.higherOptimalPercentage;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProgressFillStyle() {
        return this.progressFillStyle;
    }

    public final ScoreGaugeModel copy(String id4, String scoreDisplay, String scoreDisplaySuffix, String scoreDisplayTitle, Float scoreTarget, float gaugeFillPercentage, Float lowerOptimalPercentage, Float higherOptimalPercentage, String progressFillStyle, List<? extends LegendStyle> barStyles, DisplayStyle scoreDisplayStyle, C9598e destination) {
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(scoreDisplayTitle, "scoreDisplayTitle");
        return new ScoreGaugeModel(id4, scoreDisplay, scoreDisplaySuffix, scoreDisplayTitle, scoreTarget, gaugeFillPercentage, lowerOptimalPercentage, higherOptimalPercentage, progressFillStyle, barStyles, scoreDisplayStyle, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreGaugeModel)) {
            return false;
        }
        ScoreGaugeModel scoreGaugeModel = (ScoreGaugeModel) other;
        return AbstractC22676k.m65745e(this.id, scoreGaugeModel.id) && AbstractC22676k.m65745e(this.scoreDisplay, scoreGaugeModel.scoreDisplay) && AbstractC22676k.m65745e(this.scoreDisplaySuffix, scoreGaugeModel.scoreDisplaySuffix) && AbstractC22676k.m65745e(this.scoreDisplayTitle, scoreGaugeModel.scoreDisplayTitle) && AbstractC22676k.m65745e(this.scoreTarget, scoreGaugeModel.scoreTarget) && Float.compare(this.gaugeFillPercentage, scoreGaugeModel.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.lowerOptimalPercentage, scoreGaugeModel.lowerOptimalPercentage) && AbstractC22676k.m65745e(this.higherOptimalPercentage, scoreGaugeModel.higherOptimalPercentage) && AbstractC22676k.m65745e(this.progressFillStyle, scoreGaugeModel.progressFillStyle) && AbstractC22676k.m65745e(this.barStyles, scoreGaugeModel.barStyles) && this.scoreDisplayStyle == scoreGaugeModel.scoreDisplayStyle && AbstractC22676k.m65745e(this.destination, scoreGaugeModel.destination);
    }

    public final List<LegendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final Float getHigherOptimalPercentage() {
        return this.higherOptimalPercentage;
    }

    public final String getId() {
        return this.id;
    }

    public final Float getLowerOptimalPercentage() {
        return this.lowerOptimalPercentage;
    }

    public final String getProgressFillStyle() {
        return this.progressFillStyle;
    }

    public final String getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final DisplayStyle getScoreDisplayStyle() {
        return this.scoreDisplayStyle;
    }

    public final String getScoreDisplaySuffix() {
        return this.scoreDisplaySuffix;
    }

    public final String getScoreDisplayTitle() {
        return this.scoreDisplayTitle;
    }

    public final Float getScoreTarget() {
        return this.scoreTarget;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.scoreDisplay);
        String str2 = this.scoreDisplaySuffix;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.scoreDisplayTitle);
        Float f13 = this.scoreTarget;
        int iM30447a = AbstractC11266d.m30447a(this.gaugeFillPercentage, (iM30450d2 + (f13 == null ? 0 : f13.hashCode())) * 31, 31);
        Float f14 = this.lowerOptimalPercentage;
        int iHashCode = (iM30447a + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.higherOptimalPercentage;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        String str3 = this.progressFillStyle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LegendStyle> list = this.barStyles;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayStyle displayStyle = this.scoreDisplayStyle;
        int iHashCode5 = (iHashCode4 + (displayStyle == null ? 0 : displayStyle.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode5 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.scoreDisplay;
        String str3 = this.scoreDisplaySuffix;
        String str4 = this.scoreDisplayTitle;
        Float f13 = this.scoreTarget;
        float f14 = this.gaugeFillPercentage;
        Float f15 = this.lowerOptimalPercentage;
        Float f16 = this.higherOptimalPercentage;
        String str5 = this.progressFillStyle;
        List<LegendStyle> list = this.barStyles;
        DisplayStyle displayStyle = this.scoreDisplayStyle;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScoreGaugeModel(id=", str, ", scoreDisplay=", str2, ", scoreDisplaySuffix=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", scoreDisplayTitle=", str4, ", scoreTarget=");
        sbM32001t.append(f13);
        sbM32001t.append(", gaugeFillPercentage=");
        sbM32001t.append(f14);
        sbM32001t.append(", lowerOptimalPercentage=");
        sbM32001t.append(f15);
        sbM32001t.append(", higherOptimalPercentage=");
        sbM32001t.append(f16);
        sbM32001t.append(", progressFillStyle=");
        AbstractC36095b.m114694v(str5, ", barStyles=", ", scoreDisplayStyle=", sbM32001t, list);
        sbM32001t.append(displayStyle);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScoreGaugeModel(String str, String scoreDisplay, String str2, String scoreDisplayTitle, Float f13, float f14, Float f15, Float f16, String str3, List<? extends LegendStyle> list, DisplayStyle displayStyle, C9598e c9598e) {
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(scoreDisplayTitle, "scoreDisplayTitle");
        this.id = str;
        this.scoreDisplay = scoreDisplay;
        this.scoreDisplaySuffix = str2;
        this.scoreDisplayTitle = scoreDisplayTitle;
        this.scoreTarget = f13;
        this.gaugeFillPercentage = f14;
        this.lowerOptimalPercentage = f15;
        this.higherOptimalPercentage = f16;
        this.progressFillStyle = str3;
        this.barStyles = list;
        this.scoreDisplayStyle = displayStyle;
        this.destination = c9598e;
    }

    public /* synthetic */ ScoreGaugeModel(String str, String str2, String str3, String str4, Float f13, float f14, Float f15, Float f16, String str5, List list, DisplayStyle displayStyle, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, f13, f14, f15, f16, str5, list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : displayStyle, c9598e);
    }
}
