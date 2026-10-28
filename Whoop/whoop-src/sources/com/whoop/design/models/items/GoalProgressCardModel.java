package com.whoop.design.models.items;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jn\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bB\u0010\u0017R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010\"¨\u0006H"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalProgressCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "progressDisplay", "sevenDayVow", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/ProgressBreakdownModel;", "progressBreakdown", "Lcom/whoop/design/models/items/CheckmarkStyle;", "checkmarkStyle", "ctaText", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "circularProgressIndicator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/e;", "component5", "()Lcom/whoop/design/models/items/ProgressBreakdownModel;", "component6", "()Lcom/whoop/design/models/items/CheckmarkStyle;", "component7", "component8", "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ProgressBreakdownModel;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lcom/whoop/design/models/items/GoalProgressCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GoalProgressCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getProgressDisplay", "getSevenDayVow", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/ProgressBreakdownModel;", "getProgressBreakdown", "Lcom/whoop/design/models/items/CheckmarkStyle;", "getCheckmarkStyle", "getCtaText", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "getCircularProgressIndicator", "getCircularProgressIndicator$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalProgressCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CheckmarkStyle checkmarkStyle;
    private final CircularProgressIndicator circularProgressIndicator;
    private final String ctaText;
    private final C9598e destination;
    private final ProgressBreakdownModel progressBreakdown;
    private final String progressDisplay;
    private final String sevenDayVow;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalProgressCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GoalProgressCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalProgressCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36958e(2)), null, AbstractC30060g.m92087G(enumC23463i, new C36958e(3)), null, AbstractC30060g.m92087G(enumC23463i, new C36958e(4))};
    }

    public /* synthetic */ GoalProgressCardModel(int i13, String str, String str2, String str3, C9598e c9598e, ProgressBreakdownModel progressBreakdownModel, CheckmarkStyle checkmarkStyle, String str4, CircularProgressIndicator circularProgressIndicator, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, GoalProgressCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.progressDisplay = str2;
        this.sevenDayVow = str3;
        this.destination = c9598e;
        this.progressBreakdown = progressBreakdownModel;
        this.checkmarkStyle = checkmarkStyle;
        this.ctaText = str4;
        if ((i13 & 128) == 0) {
            this.circularProgressIndicator = null;
        } else {
            this.circularProgressIndicator = circularProgressIndicator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CheckmarkStyle", CheckmarkStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CircularProgressIndicator.class), AbstractC38195a.m122336d(CircularProgressIndicator$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ GoalProgressCardModel copy$default(GoalProgressCardModel goalProgressCardModel, String str, String str2, String str3, C9598e c9598e, ProgressBreakdownModel progressBreakdownModel, CheckmarkStyle checkmarkStyle, String str4, CircularProgressIndicator circularProgressIndicator, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = goalProgressCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = goalProgressCardModel.progressDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = goalProgressCardModel.sevenDayVow;
        }
        if ((i13 & 8) != 0) {
            c9598e = goalProgressCardModel.destination;
        }
        if ((i13 & 16) != 0) {
            progressBreakdownModel = goalProgressCardModel.progressBreakdown;
        }
        if ((i13 & 32) != 0) {
            checkmarkStyle = goalProgressCardModel.checkmarkStyle;
        }
        if ((i13 & 64) != 0) {
            str4 = goalProgressCardModel.ctaText;
        }
        if ((i13 & 128) != 0) {
            circularProgressIndicator = goalProgressCardModel.circularProgressIndicator;
        }
        String str5 = str4;
        CircularProgressIndicator circularProgressIndicator2 = circularProgressIndicator;
        ProgressBreakdownModel progressBreakdownModel2 = progressBreakdownModel;
        CheckmarkStyle checkmarkStyle2 = checkmarkStyle;
        return goalProgressCardModel.copy(str, str2, str3, c9598e, progressBreakdownModel2, checkmarkStyle2, str5, circularProgressIndicator2);
    }

    public static /* synthetic */ void getCircularProgressIndicator$annotations() {
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GoalProgressCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.progressDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.sevenDayVow);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 4, ProgressBreakdownModel$$serializer.INSTANCE, self.progressBreakdown);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.checkmarkStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.ctaText);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.circularProgressIndicator == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.circularProgressIndicator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSevenDayVow() {
        return this.sevenDayVow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProgressBreakdownModel getProgressBreakdown() {
        return this.progressBreakdown;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final GoalProgressCardModel copy(String title, String progressDisplay, String sevenDayVow, C9598e destination, ProgressBreakdownModel progressBreakdown, CheckmarkStyle checkmarkStyle, String ctaText, CircularProgressIndicator circularProgressIndicator) {
        AbstractC22676k.m65750j(title, "title");
        return new GoalProgressCardModel(title, progressDisplay, sevenDayVow, destination, progressBreakdown, checkmarkStyle, ctaText, circularProgressIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalProgressCardModel)) {
            return false;
        }
        GoalProgressCardModel goalProgressCardModel = (GoalProgressCardModel) other;
        return AbstractC22676k.m65745e(this.title, goalProgressCardModel.title) && AbstractC22676k.m65745e(this.progressDisplay, goalProgressCardModel.progressDisplay) && AbstractC22676k.m65745e(this.sevenDayVow, goalProgressCardModel.sevenDayVow) && AbstractC22676k.m65745e(this.destination, goalProgressCardModel.destination) && AbstractC22676k.m65745e(this.progressBreakdown, goalProgressCardModel.progressBreakdown) && this.checkmarkStyle == goalProgressCardModel.checkmarkStyle && AbstractC22676k.m65745e(this.ctaText, goalProgressCardModel.ctaText) && AbstractC22676k.m65745e(this.circularProgressIndicator, goalProgressCardModel.circularProgressIndicator);
    }

    public final CheckmarkStyle getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final ProgressBreakdownModel getProgressBreakdown() {
        return this.progressBreakdown;
    }

    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    public final String getSevenDayVow() {
        return this.sevenDayVow;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.progressDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sevenDayVow;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        ProgressBreakdownModel progressBreakdownModel = this.progressBreakdown;
        int iHashCode5 = (iHashCode4 + (progressBreakdownModel == null ? 0 : progressBreakdownModel.hashCode())) * 31;
        CheckmarkStyle checkmarkStyle = this.checkmarkStyle;
        int iHashCode6 = (iHashCode5 + (checkmarkStyle == null ? 0 : checkmarkStyle.hashCode())) * 31;
        String str3 = this.ctaText;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        return iHashCode7 + (circularProgressIndicator != null ? circularProgressIndicator.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.progressDisplay;
        String str3 = this.sevenDayVow;
        C9598e c9598e = this.destination;
        ProgressBreakdownModel progressBreakdownModel = this.progressBreakdown;
        CheckmarkStyle checkmarkStyle = this.checkmarkStyle;
        String str4 = this.ctaText;
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GoalProgressCardModel(title=", str, ", progressDisplay=", str2, ", sevenDayVow=");
        AbstractC30007c.m91827B(sbM32001t, str3, ", destination=", c9598e, ", progressBreakdown=");
        sbM32001t.append(progressBreakdownModel);
        sbM32001t.append(", checkmarkStyle=");
        sbM32001t.append(checkmarkStyle);
        sbM32001t.append(", ctaText=");
        sbM32001t.append(str4);
        sbM32001t.append(", circularProgressIndicator=");
        sbM32001t.append(circularProgressIndicator);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GoalProgressCardModel(String title, String str, String str2, C9598e c9598e, ProgressBreakdownModel progressBreakdownModel, CheckmarkStyle checkmarkStyle, String str3, CircularProgressIndicator circularProgressIndicator) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.progressDisplay = str;
        this.sevenDayVow = str2;
        this.destination = c9598e;
        this.progressBreakdown = progressBreakdownModel;
        this.checkmarkStyle = checkmarkStyle;
        this.ctaText = str3;
        this.circularProgressIndicator = circularProgressIndicator;
    }

    public /* synthetic */ GoalProgressCardModel(String str, String str2, String str3, C9598e c9598e, ProgressBreakdownModel progressBreakdownModel, CheckmarkStyle checkmarkStyle, String str4, CircularProgressIndicator circularProgressIndicator, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, c9598e, progressBreakdownModel, checkmarkStyle, str4, (i13 & 128) != 0 ? null : circularProgressIndicator);
    }
}
