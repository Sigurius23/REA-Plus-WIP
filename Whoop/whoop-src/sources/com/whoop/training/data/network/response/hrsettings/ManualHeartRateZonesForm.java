package com.whoop.training.data.network.response.hrsettings;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import df2.C12000a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(Jf\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010!R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010!R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010!R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b9\u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010(¨\u0006?"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "", "", "toggleValue", "", "title", "subtitle", "zoneColumnTitle", "zoneMinColumnTitle", "zoneMaxColumnTitle", "units", "", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "zoneRows", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$training_release", "(Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getToggleValue", "Ljava/lang/String;", "getTitle", "getSubtitle", "getZoneColumnTitle", "getZoneMinColumnTitle", "getZoneMaxColumnTitle", "getUnits", "Ljava/util/List;", "getZoneRows", "Companion", "$serializer", "a", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualHeartRateZonesForm {

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("toggle_value")
    private final boolean toggleValue;

    @SerializedName("units")
    private final String units;

    @SerializedName("zone_column_title")
    private final String zoneColumnTitle;

    @SerializedName("zone_max_column_title")
    private final String zoneMaxColumnTitle;

    @SerializedName("zone_min_column_title")
    private final String zoneMinColumnTitle;

    @SerializedName("zone_rows")
    private final List<ZoneRow> zoneRows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12000a(20))};

    /* JADX INFO: renamed from: com.whoop.training.data.network.response.hrsettings.ManualHeartRateZonesForm$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "serializer", "()Lwc3/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ManualHeartRateZonesForm$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ManualHeartRateZonesForm(int i13, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, ManualHeartRateZonesForm$$serializer.INSTANCE.getDescriptor());
        }
        this.toggleValue = z4;
        this.title = str;
        this.subtitle = str2;
        this.zoneColumnTitle = str3;
        this.zoneMinColumnTitle = str4;
        this.zoneMaxColumnTitle = str5;
        this.units = str6;
        this.zoneRows = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ZoneRow$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualHeartRateZonesForm copy$default(ManualHeartRateZonesForm manualHeartRateZonesForm, boolean z4, String str, String str2, String str3, String str4, String str5, String str6, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = manualHeartRateZonesForm.toggleValue;
        }
        if ((i13 & 2) != 0) {
            str = manualHeartRateZonesForm.title;
        }
        if ((i13 & 4) != 0) {
            str2 = manualHeartRateZonesForm.subtitle;
        }
        if ((i13 & 8) != 0) {
            str3 = manualHeartRateZonesForm.zoneColumnTitle;
        }
        if ((i13 & 16) != 0) {
            str4 = manualHeartRateZonesForm.zoneMinColumnTitle;
        }
        if ((i13 & 32) != 0) {
            str5 = manualHeartRateZonesForm.zoneMaxColumnTitle;
        }
        if ((i13 & 64) != 0) {
            str6 = manualHeartRateZonesForm.units;
        }
        if ((i13 & 128) != 0) {
            list = manualHeartRateZonesForm.zoneRows;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        return manualHeartRateZonesForm.copy(z4, str, str2, str3, str8, str9, str7, list2);
    }

    public static final /* synthetic */ void write$Self$training_release(ManualHeartRateZonesForm self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.toggleValue);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.zoneColumnTitle);
        output.encodeStringElement(serialDesc, 4, self.zoneMinColumnTitle);
        output.encodeStringElement(serialDesc, 5, self.zoneMaxColumnTitle);
        output.encodeStringElement(serialDesc, 6, self.units);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.zoneRows);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getToggleValue() {
        return this.toggleValue;
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
    public final String getZoneColumnTitle() {
        return this.zoneColumnTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getZoneMinColumnTitle() {
        return this.zoneMinColumnTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getZoneMaxColumnTitle() {
        return this.zoneMaxColumnTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    public final List<ZoneRow> component8() {
        return this.zoneRows;
    }

    public final ManualHeartRateZonesForm copy(boolean toggleValue, String title, String subtitle, String zoneColumnTitle, String zoneMinColumnTitle, String zoneMaxColumnTitle, String units, List<ZoneRow> zoneRows) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(zoneColumnTitle, "zoneColumnTitle");
        AbstractC22676k.m65750j(zoneMinColumnTitle, "zoneMinColumnTitle");
        AbstractC22676k.m65750j(zoneMaxColumnTitle, "zoneMaxColumnTitle");
        AbstractC22676k.m65750j(units, "units");
        AbstractC22676k.m65750j(zoneRows, "zoneRows");
        return new ManualHeartRateZonesForm(toggleValue, title, subtitle, zoneColumnTitle, zoneMinColumnTitle, zoneMaxColumnTitle, units, zoneRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualHeartRateZonesForm)) {
            return false;
        }
        ManualHeartRateZonesForm manualHeartRateZonesForm = (ManualHeartRateZonesForm) other;
        return this.toggleValue == manualHeartRateZonesForm.toggleValue && AbstractC22676k.m65745e(this.title, manualHeartRateZonesForm.title) && AbstractC22676k.m65745e(this.subtitle, manualHeartRateZonesForm.subtitle) && AbstractC22676k.m65745e(this.zoneColumnTitle, manualHeartRateZonesForm.zoneColumnTitle) && AbstractC22676k.m65745e(this.zoneMinColumnTitle, manualHeartRateZonesForm.zoneMinColumnTitle) && AbstractC22676k.m65745e(this.zoneMaxColumnTitle, manualHeartRateZonesForm.zoneMaxColumnTitle) && AbstractC22676k.m65745e(this.units, manualHeartRateZonesForm.units) && AbstractC22676k.m65745e(this.zoneRows, manualHeartRateZonesForm.zoneRows);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getToggleValue() {
        return this.toggleValue;
    }

    public final String getUnits() {
        return this.units;
    }

    public final String getZoneColumnTitle() {
        return this.zoneColumnTitle;
    }

    public final String getZoneMaxColumnTitle() {
        return this.zoneMaxColumnTitle;
    }

    public final String getZoneMinColumnTitle() {
        return this.zoneMinColumnTitle;
    }

    public final List<ZoneRow> getZoneRows() {
        return this.zoneRows;
    }

    public int hashCode() {
        return this.zoneRows.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.toggleValue) * 31, 31, this.title), 31, this.subtitle), 31, this.zoneColumnTitle), 31, this.zoneMinColumnTitle), 31, this.zoneMaxColumnTitle), 31, this.units);
    }

    public String toString() {
        boolean z4 = this.toggleValue;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.zoneColumnTitle;
        String str4 = this.zoneMinColumnTitle;
        String str5 = this.zoneMaxColumnTitle;
        String str6 = this.units;
        List<ZoneRow> list = this.zoneRows;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("ManualHeartRateZonesForm(toggleValue=", ", title=", str, ", subtitle=", z4);
        AbstractC11266d.m30444B(sbM38567n, str2, ", zoneColumnTitle=", str3, ", zoneMinColumnTitle=");
        AbstractC11266d.m30444B(sbM38567n, str4, ", zoneMaxColumnTitle=", str5, ", units=");
        return AbstractC30007c.m91840j(str6, ", zoneRows=", ")", sbM38567n, list);
    }

    public ManualHeartRateZonesForm(boolean z4, String title, String subtitle, String zoneColumnTitle, String zoneMinColumnTitle, String zoneMaxColumnTitle, String units, List<ZoneRow> zoneRows) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(zoneColumnTitle, "zoneColumnTitle");
        AbstractC22676k.m65750j(zoneMinColumnTitle, "zoneMinColumnTitle");
        AbstractC22676k.m65750j(zoneMaxColumnTitle, "zoneMaxColumnTitle");
        AbstractC22676k.m65750j(units, "units");
        AbstractC22676k.m65750j(zoneRows, "zoneRows");
        this.toggleValue = z4;
        this.title = title;
        this.subtitle = subtitle;
        this.zoneColumnTitle = zoneColumnTitle;
        this.zoneMinColumnTitle = zoneMinColumnTitle;
        this.zoneMaxColumnTitle = zoneMaxColumnTitle;
        this.units = units;
        this.zoneRows = zoneRows;
    }
}
