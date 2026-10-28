package com.whoop.design.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.core.details.network.model.C6451a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001fR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010!R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010!¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/BreakDownBarModel;", "", "", "title", "subTitle", "", "numberOfGridColumns", "", "Lcom/whoop/design/models/BarModel;", "bars", "Lcom/whoop/design/models/ConfigurableBarModel;", "configurableBars", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/BreakDownBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/BreakDownBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubTitle", "getSubTitle$annotations", "Ljava/lang/Integer;", "getNumberOfGridColumns", "getNumberOfGridColumns$annotations", "Ljava/util/List;", "getBars", "getBars$annotations", "getConfigurableBars", "getConfigurableBars$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BreakDownBarModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("bars")
    private final List<BarModel> bars;

    @SerializedName("configurable_bars")
    private final List<ConfigurableBarModel> configurableBars;

    @SerializedName("number_of_grid_columns")
    private final Integer numberOfGridColumns;

    @SerializedName("sub_title_display")
    private final String subTitle;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/BreakDownBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/BreakDownBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BreakDownBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(25)), AbstractC30060g.m92087G(enumC23463i, new C6451a(26))};
    }

    public /* synthetic */ BreakDownBarModel(int i13, String str, String str2, Integer num, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, BreakDownBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subTitle = str2;
        this.numberOfGridColumns = num;
        this.bars = list;
        this.configurableBars = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BarModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ConfigurableBarModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BreakDownBarModel copy$default(BreakDownBarModel breakDownBarModel, String str, String str2, Integer num, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = breakDownBarModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = breakDownBarModel.subTitle;
        }
        if ((i13 & 4) != 0) {
            num = breakDownBarModel.numberOfGridColumns;
        }
        if ((i13 & 8) != 0) {
            list = breakDownBarModel.bars;
        }
        if ((i13 & 16) != 0) {
            list2 = breakDownBarModel.configurableBars;
        }
        List list3 = list2;
        Integer num2 = num;
        return breakDownBarModel.copy(str, str2, num2, list, list3);
    }

    @InterfaceC37143h("bars")
    public static /* synthetic */ void getBars$annotations() {
    }

    @InterfaceC37143h("configurable_bars")
    public static /* synthetic */ void getConfigurableBars$annotations() {
    }

    @InterfaceC37143h("number_of_grid_columns")
    public static /* synthetic */ void getNumberOfGridColumns$annotations() {
    }

    @InterfaceC37143h("sub_title_display")
    public static /* synthetic */ void getSubTitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(BreakDownBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subTitle);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.numberOfGridColumns);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bars);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.configurableBars);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNumberOfGridColumns() {
        return this.numberOfGridColumns;
    }

    public final List<BarModel> component4() {
        return this.bars;
    }

    public final List<ConfigurableBarModel> component5() {
        return this.configurableBars;
    }

    public final BreakDownBarModel copy(String title, String subTitle, Integer numberOfGridColumns, List<BarModel> bars, List<ConfigurableBarModel> configurableBars) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(configurableBars, "configurableBars");
        return new BreakDownBarModel(title, subTitle, numberOfGridColumns, bars, configurableBars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakDownBarModel)) {
            return false;
        }
        BreakDownBarModel breakDownBarModel = (BreakDownBarModel) other;
        return AbstractC22676k.m65745e(this.title, breakDownBarModel.title) && AbstractC22676k.m65745e(this.subTitle, breakDownBarModel.subTitle) && AbstractC22676k.m65745e(this.numberOfGridColumns, breakDownBarModel.numberOfGridColumns) && AbstractC22676k.m65745e(this.bars, breakDownBarModel.bars) && AbstractC22676k.m65745e(this.configurableBars, breakDownBarModel.configurableBars);
    }

    public final List<BarModel> getBars() {
        return this.bars;
    }

    public final List<ConfigurableBarModel> getConfigurableBars() {
        return this.configurableBars;
    }

    public final Integer getNumberOfGridColumns() {
        return this.numberOfGridColumns;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.numberOfGridColumns;
        return this.configurableBars.hashCode() + AbstractC11895b.m31983b((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.bars);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        Integer num = this.numberOfGridColumns;
        List<BarModel> list = this.bars;
        List<ConfigurableBarModel> list2 = this.configurableBars;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BreakDownBarModel(title=", str, ", subTitle=", str2, ", numberOfGridColumns=");
        sbM32001t.append(num);
        sbM32001t.append(", bars=");
        sbM32001t.append(list);
        sbM32001t.append(", configurableBars=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }

    public BreakDownBarModel(String title, String str, Integer num, List<BarModel> bars, List<ConfigurableBarModel> configurableBars) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(configurableBars, "configurableBars");
        this.title = title;
        this.subTitle = str;
        this.numberOfGridColumns = num;
        this.bars = bars;
        this.configurableBars = configurableBars;
    }
}
