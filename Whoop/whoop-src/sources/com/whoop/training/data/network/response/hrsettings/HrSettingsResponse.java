package com.whoop.training.data.network.response.hrsettings;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import df2.C12000a;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010 R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "", "", "screenTitle", "Lcom/whoop/training/data/network/response/hrsettings/Introduction;", "introduction", "", "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "heartRateEntryRow", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "defaultHrZones", "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "manualHeartRateZonesForm", "<init>", "(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$training_release", "(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/training/data/network/response/hrsettings/Introduction;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "copy", "(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenTitle", "Lcom/whoop/training/data/network/response/hrsettings/Introduction;", "getIntroduction", "Ljava/util/List;", "getHeartRateEntryRow", "getDefaultHrZones", "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;", "getManualHeartRateZonesForm", "Companion", "$serializer", "a", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HrSettingsResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("default_hr_zones")
    private final List<ZoneRow> defaultHrZones;

    @SerializedName("heart_rate_entry_row")
    private final List<HeartRateEntryRow> heartRateEntryRow;

    @SerializedName("introduction")
    private final Introduction introduction;

    @SerializedName("manual_heart_rate_zones_form")
    private final ManualHeartRateZonesForm manualHeartRateZonesForm;

    @SerializedName("screen_title")
    private final String screenTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.training.data.network.response.hrsettings.HrSettingsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "serializer", "()Lwc3/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HrSettingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C12000a(17)), AbstractC30060g.m92087G(enumC23463i, new C12000a(18)), null};
    }

    public /* synthetic */ HrSettingsResponse(int i13, String str, Introduction introduction, List list, List list2, ManualHeartRateZonesForm manualHeartRateZonesForm, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HrSettingsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.screenTitle = str;
        this.introduction = introduction;
        this.heartRateEntryRow = list;
        this.defaultHrZones = list2;
        this.manualHeartRateZonesForm = manualHeartRateZonesForm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HeartRateEntryRow$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ZoneRow$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HrSettingsResponse copy$default(HrSettingsResponse hrSettingsResponse, String str, Introduction introduction, List list, List list2, ManualHeartRateZonesForm manualHeartRateZonesForm, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hrSettingsResponse.screenTitle;
        }
        if ((i13 & 2) != 0) {
            introduction = hrSettingsResponse.introduction;
        }
        if ((i13 & 4) != 0) {
            list = hrSettingsResponse.heartRateEntryRow;
        }
        if ((i13 & 8) != 0) {
            list2 = hrSettingsResponse.defaultHrZones;
        }
        if ((i13 & 16) != 0) {
            manualHeartRateZonesForm = hrSettingsResponse.manualHeartRateZonesForm;
        }
        ManualHeartRateZonesForm manualHeartRateZonesForm2 = manualHeartRateZonesForm;
        List list3 = list;
        return hrSettingsResponse.copy(str, introduction, list3, list2, manualHeartRateZonesForm2);
    }

    public static final /* synthetic */ void write$Self$training_release(HrSettingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.screenTitle);
        output.encodeSerializableElement(serialDesc, 1, Introduction$$serializer.INSTANCE, self.introduction);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.heartRateEntryRow);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.defaultHrZones);
        output.encodeSerializableElement(serialDesc, 4, ManualHeartRateZonesForm$$serializer.INSTANCE, self.manualHeartRateZonesForm);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Introduction getIntroduction() {
        return this.introduction;
    }

    public final List<HeartRateEntryRow> component3() {
        return this.heartRateEntryRow;
    }

    public final List<ZoneRow> component4() {
        return this.defaultHrZones;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ManualHeartRateZonesForm getManualHeartRateZonesForm() {
        return this.manualHeartRateZonesForm;
    }

    public final HrSettingsResponse copy(String screenTitle, Introduction introduction, List<HeartRateEntryRow> heartRateEntryRow, List<ZoneRow> defaultHrZones, ManualHeartRateZonesForm manualHeartRateZonesForm) {
        AbstractC22676k.m65750j(screenTitle, "screenTitle");
        AbstractC22676k.m65750j(introduction, "introduction");
        AbstractC22676k.m65750j(heartRateEntryRow, "heartRateEntryRow");
        AbstractC22676k.m65750j(defaultHrZones, "defaultHrZones");
        AbstractC22676k.m65750j(manualHeartRateZonesForm, "manualHeartRateZonesForm");
        return new HrSettingsResponse(screenTitle, introduction, heartRateEntryRow, defaultHrZones, manualHeartRateZonesForm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrSettingsResponse)) {
            return false;
        }
        HrSettingsResponse hrSettingsResponse = (HrSettingsResponse) other;
        return AbstractC22676k.m65745e(this.screenTitle, hrSettingsResponse.screenTitle) && AbstractC22676k.m65745e(this.introduction, hrSettingsResponse.introduction) && AbstractC22676k.m65745e(this.heartRateEntryRow, hrSettingsResponse.heartRateEntryRow) && AbstractC22676k.m65745e(this.defaultHrZones, hrSettingsResponse.defaultHrZones) && AbstractC22676k.m65745e(this.manualHeartRateZonesForm, hrSettingsResponse.manualHeartRateZonesForm);
    }

    public final List<ZoneRow> getDefaultHrZones() {
        return this.defaultHrZones;
    }

    public final List<HeartRateEntryRow> getHeartRateEntryRow() {
        return this.heartRateEntryRow;
    }

    public final Introduction getIntroduction() {
        return this.introduction;
    }

    public final ManualHeartRateZonesForm getManualHeartRateZonesForm() {
        return this.manualHeartRateZonesForm;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public int hashCode() {
        return this.manualHeartRateZonesForm.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.introduction.hashCode() + (this.screenTitle.hashCode() * 31)) * 31, 31, this.heartRateEntryRow), 31, this.defaultHrZones);
    }

    public String toString() {
        String str = this.screenTitle;
        Introduction introduction = this.introduction;
        List<HeartRateEntryRow> list = this.heartRateEntryRow;
        List<ZoneRow> list2 = this.defaultHrZones;
        ManualHeartRateZonesForm manualHeartRateZonesForm = this.manualHeartRateZonesForm;
        StringBuilder sb4 = new StringBuilder("HrSettingsResponse(screenTitle=");
        sb4.append(str);
        sb4.append(", introduction=");
        sb4.append(introduction);
        sb4.append(", heartRateEntryRow=");
        AbstractC21702c.m61148s(sb4, list, ", defaultHrZones=", list2, ", manualHeartRateZonesForm=");
        sb4.append(manualHeartRateZonesForm);
        sb4.append(")");
        return sb4.toString();
    }

    public HrSettingsResponse(String screenTitle, Introduction introduction, List<HeartRateEntryRow> heartRateEntryRow, List<ZoneRow> defaultHrZones, ManualHeartRateZonesForm manualHeartRateZonesForm) {
        AbstractC22676k.m65750j(screenTitle, "screenTitle");
        AbstractC22676k.m65750j(introduction, "introduction");
        AbstractC22676k.m65750j(heartRateEntryRow, "heartRateEntryRow");
        AbstractC22676k.m65750j(defaultHrZones, "defaultHrZones");
        AbstractC22676k.m65750j(manualHeartRateZonesForm, "manualHeartRateZonesForm");
        this.screenTitle = screenTitle;
        this.introduction = introduction;
        this.heartRateEntryRow = heartRateEntryRow;
        this.defaultHrZones = defaultHrZones;
        this.manualHeartRateZonesForm = manualHeartRateZonesForm;
    }
}
