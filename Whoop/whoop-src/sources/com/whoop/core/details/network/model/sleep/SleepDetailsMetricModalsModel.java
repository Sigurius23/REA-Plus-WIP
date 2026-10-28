package com.whoop.core.details.network.model.sleep;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\"Jh\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b:\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b;\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b<\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u0010\"¨\u0006@"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "sleepMetricType", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "sleepMetricTrendType", "", "trendTitleDisplay", "trendSubTitleDisplay", "calibrationBodyDisplay", "metricDescriptionDisplay", "individualMetricDisplay", "individualMetricRangeDisplay", "<init>", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "component2", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "getSleepMetricType", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "getSleepMetricTrendType", "getSleepMetricTrendType$annotations", "()V", "Ljava/lang/String;", "getTrendTitleDisplay", "getTrendSubTitleDisplay", "getCalibrationBodyDisplay", "getMetricDescriptionDisplay", "getIndividualMetricDisplay", "getIndividualMetricRangeDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepDetailsMetricModalsModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String calibrationBodyDisplay;
    private final String individualMetricDisplay;
    private final String individualMetricRangeDisplay;
    private final String metricDescriptionDisplay;
    private final SleepMetricTrendType sleepMetricTrendType;
    private final SleepMetricTypeModel sleepMetricType;
    private final String trendSubTitleDisplay;
    private final String trendTitleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepDetailsMetricModalsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C16065a(20)), AbstractC30060g.m92087G(enumC23463i, new C16065a(21)), null, null, null, null, null, null};
    }

    public /* synthetic */ SleepDetailsMetricModalsModel(int i13, SleepMetricTypeModel sleepMetricTypeModel, SleepMetricTrendType sleepMetricTrendType, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, SleepDetailsMetricModalsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepMetricType = sleepMetricTypeModel;
        this.sleepMetricTrendType = sleepMetricTrendType;
        this.trendTitleDisplay = str;
        this.trendSubTitleDisplay = str2;
        this.calibrationBodyDisplay = str3;
        this.metricDescriptionDisplay = str4;
        this.individualMetricDisplay = str5;
        this.individualMetricRangeDisplay = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SleepMetricTypeModel.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return SleepMetricTrendType.INSTANCE.serializer();
    }

    public static /* synthetic */ SleepDetailsMetricModalsModel copy$default(SleepDetailsMetricModalsModel sleepDetailsMetricModalsModel, SleepMetricTypeModel sleepMetricTypeModel, SleepMetricTrendType sleepMetricTrendType, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            sleepMetricTypeModel = sleepDetailsMetricModalsModel.sleepMetricType;
        }
        if ((i13 & 2) != 0) {
            sleepMetricTrendType = sleepDetailsMetricModalsModel.sleepMetricTrendType;
        }
        if ((i13 & 4) != 0) {
            str = sleepDetailsMetricModalsModel.trendTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = sleepDetailsMetricModalsModel.trendSubTitleDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = sleepDetailsMetricModalsModel.calibrationBodyDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = sleepDetailsMetricModalsModel.metricDescriptionDisplay;
        }
        if ((i13 & 64) != 0) {
            str5 = sleepDetailsMetricModalsModel.individualMetricDisplay;
        }
        if ((i13 & 128) != 0) {
            str6 = sleepDetailsMetricModalsModel.individualMetricRangeDisplay;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return sleepDetailsMetricModalsModel.copy(sleepMetricTypeModel, sleepMetricTrendType, str, str2, str9, str10, str7, str8);
    }

    @InterfaceC37143h("trend_type")
    public static /* synthetic */ void getSleepMetricTrendType$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(SleepDetailsMetricModalsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.sleepMetricType);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sleepMetricTrendType);
        output.encodeStringElement(serialDesc, 2, self.trendTitleDisplay);
        output.encodeStringElement(serialDesc, 3, self.trendSubTitleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.calibrationBodyDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.metricDescriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.individualMetricDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.individualMetricRangeDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepMetricTypeModel getSleepMetricType() {
        return this.sleepMetricType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SleepMetricTrendType getSleepMetricTrendType() {
        return this.sleepMetricTrendType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrendTitleDisplay() {
        return this.trendTitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrendSubTitleDisplay() {
        return this.trendSubTitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCalibrationBodyDisplay() {
        return this.calibrationBodyDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMetricDescriptionDisplay() {
        return this.metricDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIndividualMetricDisplay() {
        return this.individualMetricDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIndividualMetricRangeDisplay() {
        return this.individualMetricRangeDisplay;
    }

    public final SleepDetailsMetricModalsModel copy(SleepMetricTypeModel sleepMetricType, SleepMetricTrendType sleepMetricTrendType, String trendTitleDisplay, String trendSubTitleDisplay, String calibrationBodyDisplay, String metricDescriptionDisplay, String individualMetricDisplay, String individualMetricRangeDisplay) {
        AbstractC22676k.m65750j(sleepMetricType, "sleepMetricType");
        AbstractC22676k.m65750j(sleepMetricTrendType, "sleepMetricTrendType");
        AbstractC22676k.m65750j(trendTitleDisplay, "trendTitleDisplay");
        AbstractC22676k.m65750j(trendSubTitleDisplay, "trendSubTitleDisplay");
        return new SleepDetailsMetricModalsModel(sleepMetricType, sleepMetricTrendType, trendTitleDisplay, trendSubTitleDisplay, calibrationBodyDisplay, metricDescriptionDisplay, individualMetricDisplay, individualMetricRangeDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetailsMetricModalsModel)) {
            return false;
        }
        SleepDetailsMetricModalsModel sleepDetailsMetricModalsModel = (SleepDetailsMetricModalsModel) other;
        return this.sleepMetricType == sleepDetailsMetricModalsModel.sleepMetricType && this.sleepMetricTrendType == sleepDetailsMetricModalsModel.sleepMetricTrendType && AbstractC22676k.m65745e(this.trendTitleDisplay, sleepDetailsMetricModalsModel.trendTitleDisplay) && AbstractC22676k.m65745e(this.trendSubTitleDisplay, sleepDetailsMetricModalsModel.trendSubTitleDisplay) && AbstractC22676k.m65745e(this.calibrationBodyDisplay, sleepDetailsMetricModalsModel.calibrationBodyDisplay) && AbstractC22676k.m65745e(this.metricDescriptionDisplay, sleepDetailsMetricModalsModel.metricDescriptionDisplay) && AbstractC22676k.m65745e(this.individualMetricDisplay, sleepDetailsMetricModalsModel.individualMetricDisplay) && AbstractC22676k.m65745e(this.individualMetricRangeDisplay, sleepDetailsMetricModalsModel.individualMetricRangeDisplay);
    }

    public final String getCalibrationBodyDisplay() {
        return this.calibrationBodyDisplay;
    }

    public final String getIndividualMetricDisplay() {
        return this.individualMetricDisplay;
    }

    public final String getIndividualMetricRangeDisplay() {
        return this.individualMetricRangeDisplay;
    }

    public final String getMetricDescriptionDisplay() {
        return this.metricDescriptionDisplay;
    }

    public final SleepMetricTrendType getSleepMetricTrendType() {
        return this.sleepMetricTrendType;
    }

    public final SleepMetricTypeModel getSleepMetricType() {
        return this.sleepMetricType;
    }

    public final String getTrendSubTitleDisplay() {
        return this.trendSubTitleDisplay;
    }

    public final String getTrendTitleDisplay() {
        return this.trendTitleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.sleepMetricTrendType.hashCode() + (this.sleepMetricType.hashCode() * 31)) * 31, 31, this.trendTitleDisplay), 31, this.trendSubTitleDisplay);
        String str = this.calibrationBodyDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricDescriptionDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.individualMetricDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.individualMetricRangeDisplay;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        SleepMetricTypeModel sleepMetricTypeModel = this.sleepMetricType;
        SleepMetricTrendType sleepMetricTrendType = this.sleepMetricTrendType;
        String str = this.trendTitleDisplay;
        String str2 = this.trendSubTitleDisplay;
        String str3 = this.calibrationBodyDisplay;
        String str4 = this.metricDescriptionDisplay;
        String str5 = this.individualMetricDisplay;
        String str6 = this.individualMetricRangeDisplay;
        StringBuilder sb4 = new StringBuilder("SleepDetailsMetricModalsModel(sleepMetricType=");
        sb4.append(sleepMetricTypeModel);
        sb4.append(", sleepMetricTrendType=");
        sb4.append(sleepMetricTrendType);
        sb4.append(", trendTitleDisplay=");
        AbstractC11266d.m30444B(sb4, str, ", trendSubTitleDisplay=", str2, ", calibrationBodyDisplay=");
        AbstractC11266d.m30444B(sb4, str3, ", metricDescriptionDisplay=", str4, ", individualMetricDisplay=");
        return AbstractC11266d.m30464r(sb4, str5, ", individualMetricRangeDisplay=", str6, ")");
    }

    public SleepDetailsMetricModalsModel(SleepMetricTypeModel sleepMetricType, SleepMetricTrendType sleepMetricTrendType, String trendTitleDisplay, String trendSubTitleDisplay, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(sleepMetricType, "sleepMetricType");
        AbstractC22676k.m65750j(sleepMetricTrendType, "sleepMetricTrendType");
        AbstractC22676k.m65750j(trendTitleDisplay, "trendTitleDisplay");
        AbstractC22676k.m65750j(trendSubTitleDisplay, "trendSubTitleDisplay");
        this.sleepMetricType = sleepMetricType;
        this.sleepMetricTrendType = sleepMetricTrendType;
        this.trendTitleDisplay = trendTitleDisplay;
        this.trendSubTitleDisplay = trendSubTitleDisplay;
        this.calibrationBodyDisplay = str;
        this.metricDescriptionDisplay = str2;
        this.individualMetricDisplay = str3;
        this.individualMetricRangeDisplay = str4;
    }
}
