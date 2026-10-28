package com.whoop.core.details.network.model.sleep;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J`\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010 ¨\u0006="}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "", "", "sleepMetricTitleDisplay", "sleepMetricValueDisplay", "sleepMetricComparisonDisplay", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "sleepMetricTrendType", "metricUnitDisplay", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "sleepMetricType", "tooltipDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "isEmpty", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "component5", "component6", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSleepMetricTitleDisplay", "getSleepMetricValueDisplay", "getSleepMetricComparisonDisplay", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "getSleepMetricTrendType", "getMetricUnitDisplay", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "getSleepMetricType", "getTooltipDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepMetricBreakdownModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String metricUnitDisplay;
    private final String sleepMetricComparisonDisplay;
    private final String sleepMetricTitleDisplay;
    private final SleepMetricTrendType sleepMetricTrendType;
    private final SleepMetricTypeModel sleepMetricType;
    private final String sleepMetricValueDisplay;
    private final String tooltipDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepMetricBreakdownModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16065a(25)), null, AbstractC30060g.m92087G(enumC23463i, new C16065a(26)), null};
    }

    public /* synthetic */ SleepMetricBreakdownModel(int i13, String str, String str2, String str3, SleepMetricTrendType sleepMetricTrendType, String str4, SleepMetricTypeModel sleepMetricTypeModel, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SleepMetricBreakdownModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepMetricTitleDisplay = str;
        this.sleepMetricValueDisplay = str2;
        this.sleepMetricComparisonDisplay = str3;
        this.sleepMetricTrendType = sleepMetricTrendType;
        this.metricUnitDisplay = str4;
        this.sleepMetricType = sleepMetricTypeModel;
        this.tooltipDisplay = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SleepMetricTrendType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return SleepMetricTypeModel.INSTANCE.serializer();
    }

    public static /* synthetic */ SleepMetricBreakdownModel copy$default(SleepMetricBreakdownModel sleepMetricBreakdownModel, String str, String str2, String str3, SleepMetricTrendType sleepMetricTrendType, String str4, SleepMetricTypeModel sleepMetricTypeModel, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepMetricBreakdownModel.sleepMetricTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = sleepMetricBreakdownModel.sleepMetricValueDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = sleepMetricBreakdownModel.sleepMetricComparisonDisplay;
        }
        if ((i13 & 8) != 0) {
            sleepMetricTrendType = sleepMetricBreakdownModel.sleepMetricTrendType;
        }
        if ((i13 & 16) != 0) {
            str4 = sleepMetricBreakdownModel.metricUnitDisplay;
        }
        if ((i13 & 32) != 0) {
            sleepMetricTypeModel = sleepMetricBreakdownModel.sleepMetricType;
        }
        if ((i13 & 64) != 0) {
            str5 = sleepMetricBreakdownModel.tooltipDisplay;
        }
        SleepMetricTypeModel sleepMetricTypeModel2 = sleepMetricTypeModel;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        return sleepMetricBreakdownModel.copy(str, str2, str8, sleepMetricTrendType, str7, sleepMetricTypeModel2, str6);
    }

    public static final /* synthetic */ void write$Self$core_details_release(SleepMetricBreakdownModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sleepMetricTitleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.sleepMetricValueDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.sleepMetricComparisonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sleepMetricTrendType);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.metricUnitDisplay);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.sleepMetricType);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.tooltipDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSleepMetricTitleDisplay() {
        return this.sleepMetricTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSleepMetricValueDisplay() {
        return this.sleepMetricValueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSleepMetricComparisonDisplay() {
        return this.sleepMetricComparisonDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SleepMetricTrendType getSleepMetricTrendType() {
        return this.sleepMetricTrendType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMetricUnitDisplay() {
        return this.metricUnitDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SleepMetricTypeModel getSleepMetricType() {
        return this.sleepMetricType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTooltipDisplay() {
        return this.tooltipDisplay;
    }

    public final SleepMetricBreakdownModel copy(String sleepMetricTitleDisplay, String sleepMetricValueDisplay, String sleepMetricComparisonDisplay, SleepMetricTrendType sleepMetricTrendType, String metricUnitDisplay, SleepMetricTypeModel sleepMetricType, String tooltipDisplay) {
        AbstractC22676k.m65750j(sleepMetricTitleDisplay, "sleepMetricTitleDisplay");
        AbstractC22676k.m65750j(sleepMetricType, "sleepMetricType");
        return new SleepMetricBreakdownModel(sleepMetricTitleDisplay, sleepMetricValueDisplay, sleepMetricComparisonDisplay, sleepMetricTrendType, metricUnitDisplay, sleepMetricType, tooltipDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepMetricBreakdownModel)) {
            return false;
        }
        SleepMetricBreakdownModel sleepMetricBreakdownModel = (SleepMetricBreakdownModel) other;
        return AbstractC22676k.m65745e(this.sleepMetricTitleDisplay, sleepMetricBreakdownModel.sleepMetricTitleDisplay) && AbstractC22676k.m65745e(this.sleepMetricValueDisplay, sleepMetricBreakdownModel.sleepMetricValueDisplay) && AbstractC22676k.m65745e(this.sleepMetricComparisonDisplay, sleepMetricBreakdownModel.sleepMetricComparisonDisplay) && this.sleepMetricTrendType == sleepMetricBreakdownModel.sleepMetricTrendType && AbstractC22676k.m65745e(this.metricUnitDisplay, sleepMetricBreakdownModel.metricUnitDisplay) && this.sleepMetricType == sleepMetricBreakdownModel.sleepMetricType && AbstractC22676k.m65745e(this.tooltipDisplay, sleepMetricBreakdownModel.tooltipDisplay);
    }

    public final String getMetricUnitDisplay() {
        return this.metricUnitDisplay;
    }

    public final String getSleepMetricComparisonDisplay() {
        return this.sleepMetricComparisonDisplay;
    }

    public final String getSleepMetricTitleDisplay() {
        return this.sleepMetricTitleDisplay;
    }

    public final SleepMetricTrendType getSleepMetricTrendType() {
        return this.sleepMetricTrendType;
    }

    public final SleepMetricTypeModel getSleepMetricType() {
        return this.sleepMetricType;
    }

    public final String getSleepMetricValueDisplay() {
        return this.sleepMetricValueDisplay;
    }

    public final String getTooltipDisplay() {
        return this.tooltipDisplay;
    }

    public int hashCode() {
        int iHashCode = this.sleepMetricTitleDisplay.hashCode() * 31;
        String str = this.sleepMetricValueDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sleepMetricComparisonDisplay;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SleepMetricTrendType sleepMetricTrendType = this.sleepMetricTrendType;
        int iHashCode4 = (iHashCode3 + (sleepMetricTrendType == null ? 0 : sleepMetricTrendType.hashCode())) * 31;
        String str3 = this.metricUnitDisplay;
        int iHashCode5 = (this.sleepMetricType.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.tooltipDisplay;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.sleepMetricComparisonDisplay == null && this.sleepMetricValueDisplay == null;
    }

    public String toString() {
        String str = this.sleepMetricTitleDisplay;
        String str2 = this.sleepMetricValueDisplay;
        String str3 = this.sleepMetricComparisonDisplay;
        SleepMetricTrendType sleepMetricTrendType = this.sleepMetricTrendType;
        String str4 = this.metricUnitDisplay;
        SleepMetricTypeModel sleepMetricTypeModel = this.sleepMetricType;
        String str5 = this.tooltipDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepMetricBreakdownModel(sleepMetricTitleDisplay=", str, ", sleepMetricValueDisplay=", str2, ", sleepMetricComparisonDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", sleepMetricTrendType=");
        sbM32001t.append(sleepMetricTrendType);
        sbM32001t.append(", metricUnitDisplay=");
        sbM32001t.append(str4);
        sbM32001t.append(", sleepMetricType=");
        sbM32001t.append(sleepMetricTypeModel);
        sbM32001t.append(", tooltipDisplay=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public SleepMetricBreakdownModel(String sleepMetricTitleDisplay, String str, String str2, SleepMetricTrendType sleepMetricTrendType, String str3, SleepMetricTypeModel sleepMetricType, String str4) {
        AbstractC22676k.m65750j(sleepMetricTitleDisplay, "sleepMetricTitleDisplay");
        AbstractC22676k.m65750j(sleepMetricType, "sleepMetricType");
        this.sleepMetricTitleDisplay = sleepMetricTitleDisplay;
        this.sleepMetricValueDisplay = str;
        this.sleepMetricComparisonDisplay = str2;
        this.sleepMetricTrendType = sleepMetricTrendType;
        this.metricUnitDisplay = str3;
        this.sleepMetricType = sleepMetricType;
        this.tooltipDisplay = str4;
    }
}
