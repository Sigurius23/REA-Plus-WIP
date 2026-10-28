package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;", "", "", "title", "subtitle", "value", "icon", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "", "nextCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component6", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Double;)Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getValue", "getIcon", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "Ljava/lang/Double;", "getNextCount", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MultiSelectOption {
    public static final int $stable = 0;
    private final String icon;
    private final Double nextCount;
    private final HormonalScreenId nextId;
    private final String subtitle;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16065a(2)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MultiSelectOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiSelectOption(int i13, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MultiSelectOption$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.value = str3;
        this.icon = str4;
        this.nextId = hormonalScreenId;
        this.nextCount = d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ MultiSelectOption copy$default(MultiSelectOption multiSelectOption, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, Double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = multiSelectOption.title;
        }
        if ((i13 & 2) != 0) {
            str2 = multiSelectOption.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = multiSelectOption.value;
        }
        if ((i13 & 8) != 0) {
            str4 = multiSelectOption.icon;
        }
        if ((i13 & 16) != 0) {
            hormonalScreenId = multiSelectOption.nextId;
        }
        if ((i13 & 32) != 0) {
            d3 = multiSelectOption.nextCount;
        }
        HormonalScreenId hormonalScreenId2 = hormonalScreenId;
        Double d14 = d3;
        return multiSelectOption.copy(str, str2, str3, str4, hormonalScreenId2, d14);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MultiSelectOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.value);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.nextId);
        output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.nextCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getNextCount() {
        return this.nextCount;
    }

    public final MultiSelectOption copy(String title, String subtitle, String value, String icon, HormonalScreenId nextId, Double nextCount) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        return new MultiSelectOption(title, subtitle, value, icon, nextId, nextCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSelectOption)) {
            return false;
        }
        MultiSelectOption multiSelectOption = (MultiSelectOption) other;
        return AbstractC22676k.m65745e(this.title, multiSelectOption.title) && AbstractC22676k.m65745e(this.subtitle, multiSelectOption.subtitle) && AbstractC22676k.m65745e(this.value, multiSelectOption.value) && AbstractC22676k.m65745e(this.icon, multiSelectOption.icon) && this.nextId == multiSelectOption.nextId && AbstractC22676k.m65745e(this.nextCount, multiSelectOption.nextCount);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Double getNextCount() {
        return this.nextCount;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.value);
        String str2 = this.icon;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode3 = (iHashCode2 + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        Double d3 = this.nextCount;
        return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.value;
        String str4 = this.icon;
        HormonalScreenId hormonalScreenId = this.nextId;
        Double d3 = this.nextCount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MultiSelectOption(title=", str, ", subtitle=", str2, ", value=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", icon=", str4, ", nextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", nextCount=");
        sbM32001t.append(d3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MultiSelectOption(String title, String str, String value, String str2, HormonalScreenId hormonalScreenId, Double d3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        this.title = title;
        this.subtitle = str;
        this.value = value;
        this.icon = str2;
        this.nextId = hormonalScreenId;
        this.nextCount = d3;
    }
}
