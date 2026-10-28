package com.whoop.design.models.items.expandablestatisticlist;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010!¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;", "", "", "icon", "activityNameDisplay", "avgStrainDisplay", "activityCountDisplay", "barFillStyle", "", "barFillPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getActivityNameDisplay", "getActivityNameDisplay$annotations", "()V", "getAvgStrainDisplay", "getAvgStrainDisplay$annotations", "getActivityCountDisplay", "getActivityCountDisplay$annotations", "getBarFillStyle", "getBarFillStyle$annotations", "D", "getBarFillPercentage", "getBarFillPercentage$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableStatisticListItemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activityCountDisplay;
    private final String activityNameDisplay;
    private final String avgStrainDisplay;
    private final double barFillPercentage;
    private final String barFillStyle;
    private final String icon;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableStatisticListItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExpandableStatisticListItemModel(int i13, String str, String str2, String str3, String str4, String str5, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ExpandableStatisticListItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.activityNameDisplay = str2;
        this.avgStrainDisplay = str3;
        this.activityCountDisplay = str4;
        this.barFillStyle = str5;
        this.barFillPercentage = d3;
    }

    public static /* synthetic */ ExpandableStatisticListItemModel copy$default(ExpandableStatisticListItemModel expandableStatisticListItemModel, String str, String str2, String str3, String str4, String str5, double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableStatisticListItemModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableStatisticListItemModel.activityNameDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = expandableStatisticListItemModel.avgStrainDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = expandableStatisticListItemModel.activityCountDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = expandableStatisticListItemModel.barFillStyle;
        }
        if ((i13 & 32) != 0) {
            d3 = expandableStatisticListItemModel.barFillPercentage;
        }
        double d14 = d3;
        String str6 = str5;
        String str7 = str3;
        return expandableStatisticListItemModel.copy(str, str2, str7, str4, str6, d14);
    }

    @InterfaceC37143h("activity_count_display")
    public static /* synthetic */ void getActivityCountDisplay$annotations() {
    }

    @InterfaceC37143h("activity_name_display")
    public static /* synthetic */ void getActivityNameDisplay$annotations() {
    }

    @InterfaceC37143h("avg_strain_display")
    public static /* synthetic */ void getAvgStrainDisplay$annotations() {
    }

    @InterfaceC37143h("bar_fill_percentage")
    public static /* synthetic */ void getBarFillPercentage$annotations() {
    }

    @InterfaceC37143h("bar_fill_style")
    public static /* synthetic */ void getBarFillStyle$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableStatisticListItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.activityNameDisplay);
        output.encodeStringElement(serialDesc, 2, self.avgStrainDisplay);
        output.encodeStringElement(serialDesc, 3, self.activityCountDisplay);
        output.encodeStringElement(serialDesc, 4, self.barFillStyle);
        output.encodeDoubleElement(serialDesc, 5, self.barFillPercentage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityNameDisplay() {
        return this.activityNameDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvgStrainDisplay() {
        return this.avgStrainDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActivityCountDisplay() {
        return this.activityCountDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBarFillStyle() {
        return this.barFillStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getBarFillPercentage() {
        return this.barFillPercentage;
    }

    public final ExpandableStatisticListItemModel copy(String icon, String activityNameDisplay, String avgStrainDisplay, String activityCountDisplay, String barFillStyle, double barFillPercentage) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(activityNameDisplay, "activityNameDisplay");
        AbstractC22676k.m65750j(avgStrainDisplay, "avgStrainDisplay");
        AbstractC22676k.m65750j(activityCountDisplay, "activityCountDisplay");
        AbstractC22676k.m65750j(barFillStyle, "barFillStyle");
        return new ExpandableStatisticListItemModel(icon, activityNameDisplay, avgStrainDisplay, activityCountDisplay, barFillStyle, barFillPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableStatisticListItemModel)) {
            return false;
        }
        ExpandableStatisticListItemModel expandableStatisticListItemModel = (ExpandableStatisticListItemModel) other;
        return AbstractC22676k.m65745e(this.icon, expandableStatisticListItemModel.icon) && AbstractC22676k.m65745e(this.activityNameDisplay, expandableStatisticListItemModel.activityNameDisplay) && AbstractC22676k.m65745e(this.avgStrainDisplay, expandableStatisticListItemModel.avgStrainDisplay) && AbstractC22676k.m65745e(this.activityCountDisplay, expandableStatisticListItemModel.activityCountDisplay) && AbstractC22676k.m65745e(this.barFillStyle, expandableStatisticListItemModel.barFillStyle) && Double.compare(this.barFillPercentage, expandableStatisticListItemModel.barFillPercentage) == 0;
    }

    public final String getActivityCountDisplay() {
        return this.activityCountDisplay;
    }

    public final String getActivityNameDisplay() {
        return this.activityNameDisplay;
    }

    public final String getAvgStrainDisplay() {
        return this.avgStrainDisplay;
    }

    public final double getBarFillPercentage() {
        return this.barFillPercentage;
    }

    public final String getBarFillStyle() {
        return this.barFillStyle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return Double.hashCode(this.barFillPercentage) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.activityNameDisplay), 31, this.avgStrainDisplay), 31, this.activityCountDisplay), 31, this.barFillStyle);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.activityNameDisplay;
        String str3 = this.avgStrainDisplay;
        String str4 = this.activityCountDisplay;
        String str5 = this.barFillStyle;
        double d3 = this.barFillPercentage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableStatisticListItemModel(icon=", str, ", activityNameDisplay=", str2, ", avgStrainDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", activityCountDisplay=", str4, ", barFillStyle=");
        sbM32001t.append(str5);
        sbM32001t.append(", barFillPercentage=");
        sbM32001t.append(d3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ExpandableStatisticListItemModel(String icon, String activityNameDisplay, String avgStrainDisplay, String activityCountDisplay, String barFillStyle, double d3) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(activityNameDisplay, "activityNameDisplay");
        AbstractC22676k.m65750j(avgStrainDisplay, "avgStrainDisplay");
        AbstractC22676k.m65750j(activityCountDisplay, "activityCountDisplay");
        AbstractC22676k.m65750j(barFillStyle, "barFillStyle");
        this.icon = icon;
        this.activityNameDisplay = activityNameDisplay;
        this.avgStrainDisplay = avgStrainDisplay;
        this.activityCountDisplay = activityCountDisplay;
        this.barFillStyle = barFillStyle;
        this.barFillPercentage = d3;
    }
}
