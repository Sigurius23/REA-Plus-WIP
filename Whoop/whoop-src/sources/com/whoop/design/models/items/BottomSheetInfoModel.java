package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/BottomSheetInfoModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "bottomSheetTitle", "impactTitle", "description", "metricsTagTitle", "", "metricTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BottomSheetInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/BottomSheetInfoModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBottomSheetTitle", "getImpactTitle", "getDescription", "getMetricsTagTitle", "Ljava/util/List;", "getMetricTags", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomSheetInfoModel implements DesignSystemModel {
    private final String bottomSheetTitle;
    private final String description;
    private final String impactTitle;
    private final List<String> metricTags;
    private final String metricsTagTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(17))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BottomSheetInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BottomSheetInfoModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomSheetInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BottomSheetInfoModel(int i13, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, BottomSheetInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.bottomSheetTitle = str;
        this.impactTitle = str2;
        this.description = str3;
        this.metricsTagTitle = str4;
        this.metricTags = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomSheetInfoModel copy$default(BottomSheetInfoModel bottomSheetInfoModel, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomSheetInfoModel.bottomSheetTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = bottomSheetInfoModel.impactTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = bottomSheetInfoModel.description;
        }
        if ((i13 & 8) != 0) {
            str4 = bottomSheetInfoModel.metricsTagTitle;
        }
        if ((i13 & 16) != 0) {
            list = bottomSheetInfoModel.metricTags;
        }
        List list2 = list;
        String str5 = str3;
        return bottomSheetInfoModel.copy(str, str2, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BottomSheetInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.bottomSheetTitle);
        output.encodeStringElement(serialDesc, 1, self.impactTitle);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.metricsTagTitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.metricTags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImpactTitle() {
        return this.impactTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMetricsTagTitle() {
        return this.metricsTagTitle;
    }

    public final List<String> component5() {
        return this.metricTags;
    }

    public final BottomSheetInfoModel copy(String bottomSheetTitle, String impactTitle, String description, String metricsTagTitle, List<String> metricTags) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(impactTitle, "impactTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(metricsTagTitle, "metricsTagTitle");
        AbstractC22676k.m65750j(metricTags, "metricTags");
        return new BottomSheetInfoModel(bottomSheetTitle, impactTitle, description, metricsTagTitle, metricTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetInfoModel)) {
            return false;
        }
        BottomSheetInfoModel bottomSheetInfoModel = (BottomSheetInfoModel) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, bottomSheetInfoModel.bottomSheetTitle) && AbstractC22676k.m65745e(this.impactTitle, bottomSheetInfoModel.impactTitle) && AbstractC22676k.m65745e(this.description, bottomSheetInfoModel.description) && AbstractC22676k.m65745e(this.metricsTagTitle, bottomSheetInfoModel.metricsTagTitle) && AbstractC22676k.m65745e(this.metricTags, bottomSheetInfoModel.metricTags);
    }

    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImpactTitle() {
        return this.impactTitle;
    }

    public final List<String> getMetricTags() {
        return this.metricTags;
    }

    public final String getMetricsTagTitle() {
        return this.metricsTagTitle;
    }

    public int hashCode() {
        return this.metricTags.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.bottomSheetTitle.hashCode() * 31, 31, this.impactTitle), 31, this.description), 31, this.metricsTagTitle);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        String str2 = this.impactTitle;
        String str3 = this.description;
        String str4 = this.metricsTagTitle;
        List<String> list = this.metricTags;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BottomSheetInfoModel(bottomSheetTitle=", str, ", impactTitle=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", metricsTagTitle=", str4, ", metricTags=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public BottomSheetInfoModel(String bottomSheetTitle, String impactTitle, String description, String metricsTagTitle, List<String> metricTags) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(impactTitle, "impactTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(metricsTagTitle, "metricsTagTitle");
        AbstractC22676k.m65750j(metricTags, "metricTags");
        this.bottomSheetTitle = bottomSheetTitle;
        this.impactTitle = impactTitle;
        this.description = description;
        this.metricsTagTitle = metricsTagTitle;
        this.metricTags = metricTags;
    }
}
