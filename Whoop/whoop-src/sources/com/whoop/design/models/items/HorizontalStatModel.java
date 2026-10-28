package com.whoop.design.models.items;

import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalStatModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "statMainValueDisplay", "statTitleDisplay", "statTitleSuffixDisplay", "statComparisonDisplay", "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "statTrendType", "statIconDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalStatModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Ljava/lang/String;)Lcom/whoop/design/models/items/HorizontalStatModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatMainValueDisplay", "getStatTitleDisplay", "getStatTitleSuffixDisplay", "getStatComparisonDisplay", "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "getStatTrendType", "getStatIconDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalStatModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String statComparisonDisplay;
    private final String statIconDisplay;
    private final String statMainValueDisplay;
    private final String statTitleDisplay;
    private final String statTitleSuffixDisplay;
    private final TrendTypeEnum statTrendType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(4)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalStatModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalStatModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalStatModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HorizontalStatModel() {
        this((String) null, (String) null, (String) null, (String) null, (TrendTypeEnum) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeEnum", TrendTypeEnum.values());
    }

    public static /* synthetic */ HorizontalStatModel copy$default(HorizontalStatModel horizontalStatModel, String str, String str2, String str3, String str4, TrendTypeEnum trendTypeEnum, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalStatModel.statMainValueDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalStatModel.statTitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = horizontalStatModel.statTitleSuffixDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = horizontalStatModel.statComparisonDisplay;
        }
        if ((i13 & 16) != 0) {
            trendTypeEnum = horizontalStatModel.statTrendType;
        }
        if ((i13 & 32) != 0) {
            str5 = horizontalStatModel.statIconDisplay;
        }
        TrendTypeEnum trendTypeEnum2 = trendTypeEnum;
        String str6 = str5;
        return horizontalStatModel.copy(str, str2, str3, str4, trendTypeEnum2, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalStatModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.statMainValueDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.statMainValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.statTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 1, self.statTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.statTitleSuffixDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.statTitleSuffixDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.statComparisonDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.statComparisonDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.statTrendType != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.statTrendType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.statIconDisplay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.statIconDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatMainValueDisplay() {
        return this.statMainValueDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatTitleDisplay() {
        return this.statTitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatTitleSuffixDisplay() {
        return this.statTitleSuffixDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatComparisonDisplay() {
        return this.statComparisonDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TrendTypeEnum getStatTrendType() {
        return this.statTrendType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatIconDisplay() {
        return this.statIconDisplay;
    }

    public final HorizontalStatModel copy(String statMainValueDisplay, String statTitleDisplay, String statTitleSuffixDisplay, String statComparisonDisplay, TrendTypeEnum statTrendType, String statIconDisplay) {
        AbstractC22676k.m65750j(statMainValueDisplay, "statMainValueDisplay");
        AbstractC22676k.m65750j(statTitleDisplay, "statTitleDisplay");
        return new HorizontalStatModel(statMainValueDisplay, statTitleDisplay, statTitleSuffixDisplay, statComparisonDisplay, statTrendType, statIconDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalStatModel)) {
            return false;
        }
        HorizontalStatModel horizontalStatModel = (HorizontalStatModel) other;
        return AbstractC22676k.m65745e(this.statMainValueDisplay, horizontalStatModel.statMainValueDisplay) && AbstractC22676k.m65745e(this.statTitleDisplay, horizontalStatModel.statTitleDisplay) && AbstractC22676k.m65745e(this.statTitleSuffixDisplay, horizontalStatModel.statTitleSuffixDisplay) && AbstractC22676k.m65745e(this.statComparisonDisplay, horizontalStatModel.statComparisonDisplay) && this.statTrendType == horizontalStatModel.statTrendType && AbstractC22676k.m65745e(this.statIconDisplay, horizontalStatModel.statIconDisplay);
    }

    public final String getStatComparisonDisplay() {
        return this.statComparisonDisplay;
    }

    public final String getStatIconDisplay() {
        return this.statIconDisplay;
    }

    public final String getStatMainValueDisplay() {
        return this.statMainValueDisplay;
    }

    public final String getStatTitleDisplay() {
        return this.statTitleDisplay;
    }

    public final String getStatTitleSuffixDisplay() {
        return this.statTitleSuffixDisplay;
    }

    public final TrendTypeEnum getStatTrendType() {
        return this.statTrendType;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.statMainValueDisplay.hashCode() * 31, 31, this.statTitleDisplay);
        String str = this.statTitleSuffixDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statComparisonDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrendTypeEnum trendTypeEnum = this.statTrendType;
        int iHashCode3 = (iHashCode2 + (trendTypeEnum == null ? 0 : trendTypeEnum.hashCode())) * 31;
        String str3 = this.statIconDisplay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.statMainValueDisplay;
        String str2 = this.statTitleDisplay;
        String str3 = this.statTitleSuffixDisplay;
        String str4 = this.statComparisonDisplay;
        TrendTypeEnum trendTypeEnum = this.statTrendType;
        String str5 = this.statIconDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalStatModel(statMainValueDisplay=", str, ", statTitleDisplay=", str2, ", statTitleSuffixDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", statComparisonDisplay=", str4, ", statTrendType=");
        sbM32001t.append(trendTypeEnum);
        sbM32001t.append(", statIconDisplay=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ HorizontalStatModel(int i13, String str, String str2, String str3, String str4, TrendTypeEnum trendTypeEnum, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.statMainValueDisplay = "";
        } else {
            this.statMainValueDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.statTitleDisplay = "";
        } else {
            this.statTitleDisplay = str2;
        }
        if ((i13 & 4) == 0) {
            this.statTitleSuffixDisplay = null;
        } else {
            this.statTitleSuffixDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.statComparisonDisplay = null;
        } else {
            this.statComparisonDisplay = str4;
        }
        if ((i13 & 16) == 0) {
            this.statTrendType = null;
        } else {
            this.statTrendType = trendTypeEnum;
        }
        if ((i13 & 32) == 0) {
            this.statIconDisplay = null;
        } else {
            this.statIconDisplay = str5;
        }
    }

    public HorizontalStatModel(String statMainValueDisplay, String statTitleDisplay, String str, String str2, TrendTypeEnum trendTypeEnum, String str3) {
        AbstractC22676k.m65750j(statMainValueDisplay, "statMainValueDisplay");
        AbstractC22676k.m65750j(statTitleDisplay, "statTitleDisplay");
        this.statMainValueDisplay = statMainValueDisplay;
        this.statTitleDisplay = statTitleDisplay;
        this.statTitleSuffixDisplay = str;
        this.statComparisonDisplay = str2;
        this.statTrendType = trendTypeEnum;
        this.statIconDisplay = str3;
    }

    public /* synthetic */ HorizontalStatModel(String str, String str2, String str3, String str4, TrendTypeEnum trendTypeEnum, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : trendTypeEnum, (i13 & 32) != 0 ? null : str5);
    }
}
