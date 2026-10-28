package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010!¨\u0006;"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementRecord;", "", "", "navigationBarTitle", "title", "subtitle", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "addManualMeasurement", "Lcom/whoop/trends/data/model/MeasurementSections;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/MeasurementRecord;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/trends/data/model/TrendMenuItemModel;", "component5", "()Lcom/whoop/trends/data/model/MeasurementSections;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)Lcom/whoop/trends/data/model/MeasurementRecord;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarTitle", "getNavigationBarTitle$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "getAddManualMeasurement", "getAddManualMeasurement$annotations", "Lcom/whoop/trends/data/model/MeasurementSections;", "getSections", "getSections$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementRecord {

    @SerializedName("add_manual_measurement")
    private final TrendMenuItemModel addManualMeasurement;

    @SerializedName("navigation_bar_title")
    private final String navigationBarTitle;

    @SerializedName("sections")
    private final MeasurementSections sections;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementRecord$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/MeasurementRecord;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementRecord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MeasurementRecord(int i13, String str, String str2, String str3, TrendMenuItemModel trendMenuItemModel, MeasurementSections measurementSections, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MeasurementRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarTitle = str;
        this.title = str2;
        this.subtitle = str3;
        this.addManualMeasurement = trendMenuItemModel;
        this.sections = measurementSections;
    }

    public static /* synthetic */ MeasurementRecord copy$default(MeasurementRecord measurementRecord, String str, String str2, String str3, TrendMenuItemModel trendMenuItemModel, MeasurementSections measurementSections, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementRecord.navigationBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = measurementRecord.title;
        }
        if ((i13 & 4) != 0) {
            str3 = measurementRecord.subtitle;
        }
        if ((i13 & 8) != 0) {
            trendMenuItemModel = measurementRecord.addManualMeasurement;
        }
        if ((i13 & 16) != 0) {
            measurementSections = measurementRecord.sections;
        }
        MeasurementSections measurementSections2 = measurementSections;
        String str4 = str3;
        return measurementRecord.copy(str, str2, str4, trendMenuItemModel, measurementSections2);
    }

    @InterfaceC37143h("add_manual_measurement")
    public static /* synthetic */ void getAddManualMeasurement$annotations() {
    }

    @InterfaceC37143h("navigation_bar_title")
    public static /* synthetic */ void getNavigationBarTitle$annotations() {
    }

    @InterfaceC37143h("sections")
    public static /* synthetic */ void getSections$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(MeasurementRecord self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.navigationBarTitle);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, TrendMenuItemModel$$serializer.INSTANCE, self.addManualMeasurement);
        output.encodeSerializableElement(serialDesc, 4, MeasurementSections$$serializer.INSTANCE, self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrendMenuItemModel getAddManualMeasurement() {
        return this.addManualMeasurement;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MeasurementSections getSections() {
        return this.sections;
    }

    public final MeasurementRecord copy(String navigationBarTitle, String title, String subtitle, TrendMenuItemModel addManualMeasurement, MeasurementSections sections) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(addManualMeasurement, "addManualMeasurement");
        AbstractC22676k.m65750j(sections, "sections");
        return new MeasurementRecord(navigationBarTitle, title, subtitle, addManualMeasurement, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementRecord)) {
            return false;
        }
        MeasurementRecord measurementRecord = (MeasurementRecord) other;
        return AbstractC22676k.m65745e(this.navigationBarTitle, measurementRecord.navigationBarTitle) && AbstractC22676k.m65745e(this.title, measurementRecord.title) && AbstractC22676k.m65745e(this.subtitle, measurementRecord.subtitle) && AbstractC22676k.m65745e(this.addManualMeasurement, measurementRecord.addManualMeasurement) && AbstractC22676k.m65745e(this.sections, measurementRecord.sections);
    }

    public final TrendMenuItemModel getAddManualMeasurement() {
        return this.addManualMeasurement;
    }

    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    public final MeasurementSections getSections() {
        return this.sections;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sections.hashCode() + ((this.addManualMeasurement.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBarTitle.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31);
    }

    public String toString() {
        String str = this.navigationBarTitle;
        String str2 = this.title;
        String str3 = this.subtitle;
        TrendMenuItemModel trendMenuItemModel = this.addManualMeasurement;
        MeasurementSections measurementSections = this.sections;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementRecord(navigationBarTitle=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", addManualMeasurement=");
        sbM32001t.append(trendMenuItemModel);
        sbM32001t.append(", sections=");
        sbM32001t.append(measurementSections);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MeasurementRecord(String navigationBarTitle, String title, String subtitle, TrendMenuItemModel addManualMeasurement, MeasurementSections sections) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(addManualMeasurement, "addManualMeasurement");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarTitle = navigationBarTitle;
        this.title = title;
        this.subtitle = subtitle;
        this.addManualMeasurement = addManualMeasurement;
        this.sections = sections;
    }
}
