package com.whoop.healthspan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJH\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "", "", "valueDisplay", "valueUnitDisplay", "", "valueRangePercentage", "style", "expandedValueLabelDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValueDisplay", "getValueUnitDisplay", "D", "getValueRangePercentage", "getStyle", "getExpandedValueLabelDisplay", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContributorRangeValue {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String expandedValueLabelDisplay;
    private final String style;
    private final String valueDisplay;
    private final double valueRangePercentage;
    private final String valueUnitDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContributorRangeValue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContributorRangeValue(int i13, String str, String str2, double d3, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ContributorRangeValue$$serializer.INSTANCE.getDescriptor());
        }
        this.valueDisplay = str;
        this.valueUnitDisplay = str2;
        this.valueRangePercentage = d3;
        this.style = str3;
        this.expandedValueLabelDisplay = str4;
    }

    public static /* synthetic */ ContributorRangeValue copy$default(ContributorRangeValue contributorRangeValue, String str, String str2, double d3, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contributorRangeValue.valueDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = contributorRangeValue.valueUnitDisplay;
        }
        if ((i13 & 4) != 0) {
            d3 = contributorRangeValue.valueRangePercentage;
        }
        if ((i13 & 8) != 0) {
            str3 = contributorRangeValue.style;
        }
        if ((i13 & 16) != 0) {
            str4 = contributorRangeValue.expandedValueLabelDisplay;
        }
        double d14 = d3;
        return contributorRangeValue.copy(str, str2, d14, str3, str4);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(ContributorRangeValue self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.valueDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.valueUnitDisplay);
        output.encodeDoubleElement(serialDesc, 2, self.valueRangePercentage);
        output.encodeStringElement(serialDesc, 3, self.style);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.expandedValueLabelDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueUnitDisplay() {
        return this.valueUnitDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getValueRangePercentage() {
        return this.valueRangePercentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpandedValueLabelDisplay() {
        return this.expandedValueLabelDisplay;
    }

    public final ContributorRangeValue copy(String valueDisplay, String valueUnitDisplay, double valueRangePercentage, String style, String expandedValueLabelDisplay) {
        AbstractC22676k.m65750j(style, "style");
        return new ContributorRangeValue(valueDisplay, valueUnitDisplay, valueRangePercentage, style, expandedValueLabelDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributorRangeValue)) {
            return false;
        }
        ContributorRangeValue contributorRangeValue = (ContributorRangeValue) other;
        return AbstractC22676k.m65745e(this.valueDisplay, contributorRangeValue.valueDisplay) && AbstractC22676k.m65745e(this.valueUnitDisplay, contributorRangeValue.valueUnitDisplay) && Double.compare(this.valueRangePercentage, contributorRangeValue.valueRangePercentage) == 0 && AbstractC22676k.m65745e(this.style, contributorRangeValue.style) && AbstractC22676k.m65745e(this.expandedValueLabelDisplay, contributorRangeValue.expandedValueLabelDisplay);
    }

    public final String getExpandedValueLabelDisplay() {
        return this.expandedValueLabelDisplay;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    public final double getValueRangePercentage() {
        return this.valueRangePercentage;
    }

    public final String getValueUnitDisplay() {
        return this.valueUnitDisplay;
    }

    public int hashCode() {
        String str = this.valueDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueUnitDisplay;
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.valueRangePercentage), 31, this.style);
        String str3 = this.expandedValueLabelDisplay;
        return iM30450d + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.valueDisplay;
        String str2 = this.valueUnitDisplay;
        double d3 = this.valueRangePercentage;
        String str3 = this.style;
        String str4 = this.expandedValueLabelDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContributorRangeValue(valueDisplay=", str, ", valueUnitDisplay=", str2, ", valueRangePercentage=");
        sbM32001t.append(d3);
        sbM32001t.append(", style=");
        sbM32001t.append(str3);
        return AbstractC2875y.m8304q(sbM32001t, ", expandedValueLabelDisplay=", str4, ")");
    }

    public ContributorRangeValue(String str, String str2, double d3, String style, String str3) {
        AbstractC22676k.m65750j(style, "style");
        this.valueDisplay = str;
        this.valueUnitDisplay = str2;
        this.valueRangePercentage = d3;
        this.style = style;
        this.expandedValueLabelDisplay = str3;
    }
}
