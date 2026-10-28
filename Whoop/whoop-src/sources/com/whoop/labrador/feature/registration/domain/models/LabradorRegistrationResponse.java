package com.whoop.labrador.feature.registration.domain.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.C35180a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b/\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b0\u0010\u001bR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010 ¨\u00067"}, m65681d2 = {"Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;", "", "", "pageTitle", "icon", "headerTitle", "description", "", "Lcom/whoop/labrador/feature/registration/domain/models/RegulatoryInformationResponse;", "regulatoryInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$labrador_release", "(Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageTitle", "getIcon", "getIcon$annotations", "()V", "getHeaderTitle", "getDescription", "Ljava/util/List;", "getRegulatoryInfo", "getRegulatoryInfo$annotations", "Companion", "$serializer", "a", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorRegistrationResponse {

    @SerializedName("description")
    private final String description;

    @SerializedName("header_title")
    private final String headerTitle;

    @SerializedName("nav_icon")
    private final String icon;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("regulatory_detail_info")
    private final List<RegulatoryInformationResponse> regulatoryInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35180a(15))};

    /* JADX INFO: renamed from: com.whoop.labrador.feature.registration.domain.models.LabradorRegistrationResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;", "serializer", "()Lwc3/c;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorRegistrationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabradorRegistrationResponse(int i13, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, LabradorRegistrationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pageTitle = str;
        this.icon = str2;
        this.headerTitle = str3;
        this.description = str4;
        this.regulatoryInfo = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RegulatoryInformationResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorRegistrationResponse copy$default(LabradorRegistrationResponse labradorRegistrationResponse, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labradorRegistrationResponse.pageTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = labradorRegistrationResponse.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = labradorRegistrationResponse.headerTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = labradorRegistrationResponse.description;
        }
        if ((i13 & 16) != 0) {
            list = labradorRegistrationResponse.regulatoryInfo;
        }
        List list2 = list;
        String str5 = str3;
        return labradorRegistrationResponse.copy(str, str2, str5, str4, list2);
    }

    @InterfaceC37143h("nav_icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("regulatory_detail_info")
    public static /* synthetic */ void getRegulatoryInfo$annotations() {
    }

    public static final /* synthetic */ void write$Self$labrador_release(LabradorRegistrationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.pageTitle);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.headerTitle);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.regulatoryInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<RegulatoryInformationResponse> component5() {
        return this.regulatoryInfo;
    }

    public final LabradorRegistrationResponse copy(String pageTitle, String icon, String headerTitle, String description, List<RegulatoryInformationResponse> regulatoryInfo) {
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(regulatoryInfo, "regulatoryInfo");
        return new LabradorRegistrationResponse(pageTitle, icon, headerTitle, description, regulatoryInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorRegistrationResponse)) {
            return false;
        }
        LabradorRegistrationResponse labradorRegistrationResponse = (LabradorRegistrationResponse) other;
        return AbstractC22676k.m65745e(this.pageTitle, labradorRegistrationResponse.pageTitle) && AbstractC22676k.m65745e(this.icon, labradorRegistrationResponse.icon) && AbstractC22676k.m65745e(this.headerTitle, labradorRegistrationResponse.headerTitle) && AbstractC22676k.m65745e(this.description, labradorRegistrationResponse.description) && AbstractC22676k.m65745e(this.regulatoryInfo, labradorRegistrationResponse.regulatoryInfo);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final List<RegulatoryInformationResponse> getRegulatoryInfo() {
        return this.regulatoryInfo;
    }

    public int hashCode() {
        return this.regulatoryInfo.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.pageTitle.hashCode() * 31, 31, this.icon), 31, this.headerTitle), 31, this.description);
    }

    public String toString() {
        String str = this.pageTitle;
        String str2 = this.icon;
        String str3 = this.headerTitle;
        String str4 = this.description;
        List<RegulatoryInformationResponse> list = this.regulatoryInfo;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabradorRegistrationResponse(pageTitle=", str, ", icon=", str2, ", headerTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", regulatoryInfo=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public LabradorRegistrationResponse(String pageTitle, String icon, String headerTitle, String description, List<RegulatoryInformationResponse> regulatoryInfo) {
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(regulatoryInfo, "regulatoryInfo");
        this.pageTitle = pageTitle;
        this.icon = icon;
        this.headerTitle = headerTitle;
        this.description = description;
        this.regulatoryInfo = regulatoryInfo;
    }
}
