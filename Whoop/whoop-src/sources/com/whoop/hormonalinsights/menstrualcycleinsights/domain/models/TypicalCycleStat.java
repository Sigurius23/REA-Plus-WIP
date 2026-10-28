package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleStat;", "", "", "titleDisplay", "valueDisplay", "variance", "units", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleStat;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleStat;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getValueDisplay", "getVariance", "getUnits", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TypicalCycleStat {
    private final String titleDisplay;
    private final ImpactModel trend;
    private final String units;
    private final String valueDisplay;
    private final String variance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ImpactModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleStat$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleStat;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TypicalCycleStat$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypicalCycleStat(int i13, String str, String str2, String str3, String str4, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, TypicalCycleStat$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.valueDisplay = str2;
        this.variance = str3;
        this.units = str4;
        this.trend = impactModel;
    }

    public static /* synthetic */ TypicalCycleStat copy$default(TypicalCycleStat typicalCycleStat, String str, String str2, String str3, String str4, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = typicalCycleStat.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = typicalCycleStat.valueDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = typicalCycleStat.variance;
        }
        if ((i13 & 8) != 0) {
            str4 = typicalCycleStat.units;
        }
        if ((i13 & 16) != 0) {
            impactModel = typicalCycleStat.trend;
        }
        ImpactModel impactModel2 = impactModel;
        String str5 = str3;
        return typicalCycleStat.copy(str, str2, str5, str4, impactModel2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(TypicalCycleStat self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.valueDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.variance);
        output.encodeStringElement(serialDesc, 3, self.units);
        output.encodeNullableSerializableElement(serialDesc, 4, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVariance() {
        return this.variance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final TypicalCycleStat copy(String titleDisplay, String valueDisplay, String variance, String units, ImpactModel trend) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(units, "units");
        return new TypicalCycleStat(titleDisplay, valueDisplay, variance, units, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypicalCycleStat)) {
            return false;
        }
        TypicalCycleStat typicalCycleStat = (TypicalCycleStat) other;
        return AbstractC22676k.m65745e(this.titleDisplay, typicalCycleStat.titleDisplay) && AbstractC22676k.m65745e(this.valueDisplay, typicalCycleStat.valueDisplay) && AbstractC22676k.m65745e(this.variance, typicalCycleStat.variance) && AbstractC22676k.m65745e(this.units, typicalCycleStat.units) && AbstractC22676k.m65745e(this.trend, typicalCycleStat.trend);
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final String getUnits() {
        return this.units;
    }

    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    public final String getVariance() {
        return this.variance;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.valueDisplay);
        String str = this.variance;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.units);
        ImpactModel impactModel = this.trend;
        return iM30450d2 + (impactModel != null ? impactModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.valueDisplay;
        String str3 = this.variance;
        String str4 = this.units;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TypicalCycleStat(titleDisplay=", str, ", valueDisplay=", str2, ", variance=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", units=", str4, ", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TypicalCycleStat(String titleDisplay, String valueDisplay, String str, String units, ImpactModel impactModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(units, "units");
        this.titleDisplay = titleDisplay;
        this.valueDisplay = valueDisplay;
        this.variance = str;
        this.units = units;
        this.trend = impactModel;
    }
}
