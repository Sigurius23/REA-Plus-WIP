package com.whoop.labrador.feature.eligibility.domain.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
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
import p717lq2.C24676h;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b2\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b3\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b4\u0010\u001b¨\u00067"}, m65681d2 = {"Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;", "", "", "label", "title", "", "regions", "availabilityAlert", "availabilityIcon", "buttonLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$labrador_release", "(Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getTitle", "Ljava/util/List;", "getRegions", "getRegions$annotations", "()V", "getAvailabilityAlert", "getAvailabilityIcon", "getButtonLabel", "Companion", "$serializer", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SupportedRegionPicker {

    @SerializedName("availability_alert")
    private final String availabilityAlert;

    @SerializedName("availability_icon")
    private final String availabilityIcon;

    @SerializedName("button_label")
    private final String buttonLabel;

    @SerializedName("label")
    private final String label;

    @SerializedName("supported_regions")
    private final List<String> regions;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24676h(23)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;", "serializer", "()Lwc3/c;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SupportedRegionPicker$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SupportedRegionPicker(int i13, String str, String str2, List list, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SupportedRegionPicker$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.title = str2;
        this.regions = list;
        this.availabilityAlert = str3;
        this.availabilityIcon = str4;
        this.buttonLabel = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedRegionPicker copy$default(SupportedRegionPicker supportedRegionPicker, String str, String str2, List list, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = supportedRegionPicker.label;
        }
        if ((i13 & 2) != 0) {
            str2 = supportedRegionPicker.title;
        }
        if ((i13 & 4) != 0) {
            list = supportedRegionPicker.regions;
        }
        if ((i13 & 8) != 0) {
            str3 = supportedRegionPicker.availabilityAlert;
        }
        if ((i13 & 16) != 0) {
            str4 = supportedRegionPicker.availabilityIcon;
        }
        if ((i13 & 32) != 0) {
            str5 = supportedRegionPicker.buttonLabel;
        }
        String str6 = str4;
        String str7 = str5;
        return supportedRegionPicker.copy(str, str2, list, str3, str6, str7);
    }

    @InterfaceC37143h("supported_regions")
    public static /* synthetic */ void getRegions$annotations() {
    }

    public static final /* synthetic */ void write$Self$labrador_release(SupportedRegionPicker self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.regions);
        output.encodeStringElement(serialDesc, 3, self.availabilityAlert);
        output.encodeStringElement(serialDesc, 4, self.availabilityIcon);
        output.encodeStringElement(serialDesc, 5, self.buttonLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component3() {
        return this.regions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvailabilityAlert() {
        return this.availabilityAlert;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvailabilityIcon() {
        return this.availabilityIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final SupportedRegionPicker copy(String label, String title, List<String> regions, String availabilityAlert, String availabilityIcon, String buttonLabel) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(regions, "regions");
        AbstractC22676k.m65750j(availabilityAlert, "availabilityAlert");
        AbstractC22676k.m65750j(availabilityIcon, "availabilityIcon");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        return new SupportedRegionPicker(label, title, regions, availabilityAlert, availabilityIcon, buttonLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedRegionPicker)) {
            return false;
        }
        SupportedRegionPicker supportedRegionPicker = (SupportedRegionPicker) other;
        return AbstractC22676k.m65745e(this.label, supportedRegionPicker.label) && AbstractC22676k.m65745e(this.title, supportedRegionPicker.title) && AbstractC22676k.m65745e(this.regions, supportedRegionPicker.regions) && AbstractC22676k.m65745e(this.availabilityAlert, supportedRegionPicker.availabilityAlert) && AbstractC22676k.m65745e(this.availabilityIcon, supportedRegionPicker.availabilityIcon) && AbstractC22676k.m65745e(this.buttonLabel, supportedRegionPicker.buttonLabel);
    }

    public final String getAvailabilityAlert() {
        return this.availabilityAlert;
    }

    public final String getAvailabilityIcon() {
        return this.availabilityIcon;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getRegions() {
        return this.regions;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonLabel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.title), 31, this.regions), 31, this.availabilityAlert), 31, this.availabilityIcon);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.title;
        List<String> list = this.regions;
        String str3 = this.availabilityAlert;
        String str4 = this.availabilityIcon;
        String str5 = this.buttonLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SupportedRegionPicker(label=", str, ", title=", str2, ", regions=");
        AbstractC17176i.m48511m(", availabilityAlert=", str3, ", availabilityIcon=", sbM32001t, list);
        return AbstractC11266d.m30464r(sbM32001t, str4, ", buttonLabel=", str5, ")");
    }

    public SupportedRegionPicker(String label, String title, List<String> regions, String availabilityAlert, String availabilityIcon, String buttonLabel) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(regions, "regions");
        AbstractC22676k.m65750j(availabilityAlert, "availabilityAlert");
        AbstractC22676k.m65750j(availabilityIcon, "availabilityIcon");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        this.label = label;
        this.title = title;
        this.regions = regions;
        this.availabilityAlert = availabilityAlert;
        this.availabilityIcon = availabilityIcon;
        this.buttonLabel = buttonLabel;
    }
}
