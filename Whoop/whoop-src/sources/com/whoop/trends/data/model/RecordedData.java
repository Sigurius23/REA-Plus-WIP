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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010#R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010%¨\u0006B"}, m65681d2 = {"Lcom/whoop/trends/data/model/RecordedData;", "", "", "navigationBarTitle", "title", "subtitle", "Lcom/whoop/trends/data/model/AddManualMeasurementButton;", "addManualMeasurement", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "manualMeasurementUpdates", "Lcom/whoop/trends/data/model/Sections;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/RecordedData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/trends/data/model/AddManualMeasurementButton;", "component5", "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "component6", "()Lcom/whoop/trends/data/model/Sections;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)Lcom/whoop/trends/data/model/RecordedData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationBarTitle", "getNavigationBarTitle$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/whoop/trends/data/model/AddManualMeasurementButton;", "getAddManualMeasurement", "getAddManualMeasurement$annotations", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "getManualMeasurementUpdates", "getManualMeasurementUpdates$annotations", "Lcom/whoop/trends/data/model/Sections;", "getSections", "getSections$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecordedData {

    @SerializedName("add_manual_measurement")
    private final AddManualMeasurementButton addManualMeasurement;

    @SerializedName("manual_measurement_updates")
    private final ManualMeasurementSheet manualMeasurementUpdates;

    @SerializedName("navigation_bar_title")
    private final String navigationBarTitle;

    @SerializedName("sections")
    private final Sections sections;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/RecordedData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/RecordedData;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecordedData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecordedData(int i13, String str, String str2, String str3, AddManualMeasurementButton addManualMeasurementButton, ManualMeasurementSheet manualMeasurementSheet, Sections sections, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, RecordedData$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarTitle = str;
        this.title = str2;
        this.subtitle = str3;
        this.addManualMeasurement = addManualMeasurementButton;
        this.manualMeasurementUpdates = manualMeasurementSheet;
        this.sections = sections;
    }

    public static /* synthetic */ RecordedData copy$default(RecordedData recordedData, String str, String str2, String str3, AddManualMeasurementButton addManualMeasurementButton, ManualMeasurementSheet manualMeasurementSheet, Sections sections, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recordedData.navigationBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = recordedData.title;
        }
        if ((i13 & 4) != 0) {
            str3 = recordedData.subtitle;
        }
        if ((i13 & 8) != 0) {
            addManualMeasurementButton = recordedData.addManualMeasurement;
        }
        if ((i13 & 16) != 0) {
            manualMeasurementSheet = recordedData.manualMeasurementUpdates;
        }
        if ((i13 & 32) != 0) {
            sections = recordedData.sections;
        }
        ManualMeasurementSheet manualMeasurementSheet2 = manualMeasurementSheet;
        Sections sections2 = sections;
        return recordedData.copy(str, str2, str3, addManualMeasurementButton, manualMeasurementSheet2, sections2);
    }

    @InterfaceC37143h("add_manual_measurement")
    public static /* synthetic */ void getAddManualMeasurement$annotations() {
    }

    @InterfaceC37143h("manual_measurement_updates")
    public static /* synthetic */ void getManualMeasurementUpdates$annotations() {
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

    public static final /* synthetic */ void write$Self$trends_release(RecordedData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.navigationBarTitle);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, AddManualMeasurementButton$$serializer.INSTANCE, self.addManualMeasurement);
        output.encodeNullableSerializableElement(serialDesc, 4, ManualMeasurementSheet$$serializer.INSTANCE, self.manualMeasurementUpdates);
        output.encodeSerializableElement(serialDesc, 5, Sections$$serializer.INSTANCE, self.sections);
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
    public final AddManualMeasurementButton getAddManualMeasurement() {
        return this.addManualMeasurement;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ManualMeasurementSheet getManualMeasurementUpdates() {
        return this.manualMeasurementUpdates;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Sections getSections() {
        return this.sections;
    }

    public final RecordedData copy(String navigationBarTitle, String title, String subtitle, AddManualMeasurementButton addManualMeasurement, ManualMeasurementSheet manualMeasurementUpdates, Sections sections) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(addManualMeasurement, "addManualMeasurement");
        AbstractC22676k.m65750j(sections, "sections");
        return new RecordedData(navigationBarTitle, title, subtitle, addManualMeasurement, manualMeasurementUpdates, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordedData)) {
            return false;
        }
        RecordedData recordedData = (RecordedData) other;
        return AbstractC22676k.m65745e(this.navigationBarTitle, recordedData.navigationBarTitle) && AbstractC22676k.m65745e(this.title, recordedData.title) && AbstractC22676k.m65745e(this.subtitle, recordedData.subtitle) && AbstractC22676k.m65745e(this.addManualMeasurement, recordedData.addManualMeasurement) && AbstractC22676k.m65745e(this.manualMeasurementUpdates, recordedData.manualMeasurementUpdates) && AbstractC22676k.m65745e(this.sections, recordedData.sections);
    }

    public final AddManualMeasurementButton getAddManualMeasurement() {
        return this.addManualMeasurement;
    }

    public final ManualMeasurementSheet getManualMeasurementUpdates() {
        return this.manualMeasurementUpdates;
    }

    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    public final Sections getSections() {
        return this.sections;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.addManualMeasurement.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBarTitle.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementUpdates;
        return this.sections.hashCode() + ((iHashCode + (manualMeasurementSheet == null ? 0 : manualMeasurementSheet.hashCode())) * 31);
    }

    public String toString() {
        String str = this.navigationBarTitle;
        String str2 = this.title;
        String str3 = this.subtitle;
        AddManualMeasurementButton addManualMeasurementButton = this.addManualMeasurement;
        ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementUpdates;
        Sections sections = this.sections;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecordedData(navigationBarTitle=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", addManualMeasurement=");
        sbM32001t.append(addManualMeasurementButton);
        sbM32001t.append(", manualMeasurementUpdates=");
        sbM32001t.append(manualMeasurementSheet);
        sbM32001t.append(", sections=");
        sbM32001t.append(sections);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public RecordedData(String navigationBarTitle, String title, String subtitle, AddManualMeasurementButton addManualMeasurement, ManualMeasurementSheet manualMeasurementSheet, Sections sections) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(addManualMeasurement, "addManualMeasurement");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarTitle = navigationBarTitle;
        this.title = title;
        this.subtitle = subtitle;
        this.addManualMeasurement = addManualMeasurement;
        this.manualMeasurementUpdates = manualMeasurementSheet;
        this.sections = sections;
    }
}
