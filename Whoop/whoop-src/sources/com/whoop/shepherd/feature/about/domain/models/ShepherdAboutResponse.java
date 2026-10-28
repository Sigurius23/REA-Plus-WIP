package com.whoop.shepherd.feature.about.domain.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nx1.C27219a;
import od2.C27864a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eBm\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"Jb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b9\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b:\u0010\u001eR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b;\u0010\"¨\u0006?"}, m65681d2 = {"Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "", "", "title", "aboutTitle", "aboutImageUrl", "", "Lcom/whoop/shepherd/feature/about/domain/models/InformationItem;", "informationItems", "manufacturerLabel", "manufacturerAddress", "Lcom/whoop/shepherd/feature/about/domain/models/TileItem;", "tileItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getAboutTitle", "getAboutTitle$annotations", "getAboutImageUrl", "getAboutImageUrl$annotations", "Ljava/util/List;", "getInformationItems", "getManufacturerLabel", "getManufacturerAddress", "getTileItems", "Companion", "$serializer", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdAboutResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("about_anf_image_url")
    private final String aboutImageUrl;

    @SerializedName("about_anf_title")
    private final String aboutTitle;

    @SerializedName("information_items")
    private final List<InformationItem> informationItems;

    @SerializedName("manufacturer_address")
    private final String manufacturerAddress;

    @SerializedName("manufacturer_label")
    private final String manufacturerLabel;

    @SerializedName("tile_items")
    private final List<TileItem> tileItems;

    @SerializedName("page_title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdAboutResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C27219a(29)), null, null, AbstractC30060g.m92087G(enumC23463i, new C27864a(0))};
    }

    public /* synthetic */ ShepherdAboutResponse(int i13, String str, String str2, String str3, List list, String str4, String str5, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ShepherdAboutResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.aboutTitle = str2;
        this.aboutImageUrl = str3;
        this.informationItems = list;
        this.manufacturerLabel = str4;
        this.manufacturerAddress = str5;
        this.tileItems = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(InformationItem$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(TileItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShepherdAboutResponse copy$default(ShepherdAboutResponse shepherdAboutResponse, String str, String str2, String str3, List list, String str4, String str5, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdAboutResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdAboutResponse.aboutTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdAboutResponse.aboutImageUrl;
        }
        if ((i13 & 8) != 0) {
            list = shepherdAboutResponse.informationItems;
        }
        if ((i13 & 16) != 0) {
            str4 = shepherdAboutResponse.manufacturerLabel;
        }
        if ((i13 & 32) != 0) {
            str5 = shepherdAboutResponse.manufacturerAddress;
        }
        if ((i13 & 64) != 0) {
            list2 = shepherdAboutResponse.tileItems;
        }
        String str6 = str5;
        List list3 = list2;
        String str7 = str4;
        String str8 = str3;
        return shepherdAboutResponse.copy(str, str2, str8, list, str7, str6, list3);
    }

    @InterfaceC37143h("about_anf_image_url")
    public static /* synthetic */ void getAboutImageUrl$annotations() {
    }

    @InterfaceC37143h("about_anf_title")
    public static /* synthetic */ void getAboutTitle$annotations() {
    }

    @InterfaceC37143h("page_title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdAboutResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.aboutTitle);
        output.encodeStringElement(serialDesc, 2, self.aboutImageUrl);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.informationItems);
        output.encodeStringElement(serialDesc, 4, self.manufacturerLabel);
        output.encodeStringElement(serialDesc, 5, self.manufacturerAddress);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.tileItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAboutTitle() {
        return this.aboutTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAboutImageUrl() {
        return this.aboutImageUrl;
    }

    public final List<InformationItem> component4() {
        return this.informationItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getManufacturerLabel() {
        return this.manufacturerLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getManufacturerAddress() {
        return this.manufacturerAddress;
    }

    public final List<TileItem> component7() {
        return this.tileItems;
    }

    public final ShepherdAboutResponse copy(String title, String aboutTitle, String aboutImageUrl, List<InformationItem> informationItems, String manufacturerLabel, String manufacturerAddress, List<TileItem> tileItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(aboutTitle, "aboutTitle");
        AbstractC22676k.m65750j(aboutImageUrl, "aboutImageUrl");
        AbstractC22676k.m65750j(informationItems, "informationItems");
        AbstractC22676k.m65750j(manufacturerLabel, "manufacturerLabel");
        AbstractC22676k.m65750j(manufacturerAddress, "manufacturerAddress");
        AbstractC22676k.m65750j(tileItems, "tileItems");
        return new ShepherdAboutResponse(title, aboutTitle, aboutImageUrl, informationItems, manufacturerLabel, manufacturerAddress, tileItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdAboutResponse)) {
            return false;
        }
        ShepherdAboutResponse shepherdAboutResponse = (ShepherdAboutResponse) other;
        return AbstractC22676k.m65745e(this.title, shepherdAboutResponse.title) && AbstractC22676k.m65745e(this.aboutTitle, shepherdAboutResponse.aboutTitle) && AbstractC22676k.m65745e(this.aboutImageUrl, shepherdAboutResponse.aboutImageUrl) && AbstractC22676k.m65745e(this.informationItems, shepherdAboutResponse.informationItems) && AbstractC22676k.m65745e(this.manufacturerLabel, shepherdAboutResponse.manufacturerLabel) && AbstractC22676k.m65745e(this.manufacturerAddress, shepherdAboutResponse.manufacturerAddress) && AbstractC22676k.m65745e(this.tileItems, shepherdAboutResponse.tileItems);
    }

    public final String getAboutImageUrl() {
        return this.aboutImageUrl;
    }

    public final String getAboutTitle() {
        return this.aboutTitle;
    }

    public final List<InformationItem> getInformationItems() {
        return this.informationItems;
    }

    public final String getManufacturerAddress() {
        return this.manufacturerAddress;
    }

    public final String getManufacturerLabel() {
        return this.manufacturerLabel;
    }

    public final List<TileItem> getTileItems() {
        return this.tileItems;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tileItems.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.aboutTitle), 31, this.aboutImageUrl), 31, this.informationItems), 31, this.manufacturerLabel), 31, this.manufacturerAddress);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.aboutTitle;
        String str3 = this.aboutImageUrl;
        List<InformationItem> list = this.informationItems;
        String str4 = this.manufacturerLabel;
        String str5 = this.manufacturerAddress;
        List<TileItem> list2 = this.tileItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdAboutResponse(title=", str, ", aboutTitle=", str2, ", aboutImageUrl=");
        AbstractC36095b.m114694v(str3, ", informationItems=", ", manufacturerLabel=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", manufacturerAddress=", str5, ", tileItems=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }

    public ShepherdAboutResponse(String title, String aboutTitle, String aboutImageUrl, List<InformationItem> informationItems, String manufacturerLabel, String manufacturerAddress, List<TileItem> tileItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(aboutTitle, "aboutTitle");
        AbstractC22676k.m65750j(aboutImageUrl, "aboutImageUrl");
        AbstractC22676k.m65750j(informationItems, "informationItems");
        AbstractC22676k.m65750j(manufacturerLabel, "manufacturerLabel");
        AbstractC22676k.m65750j(manufacturerAddress, "manufacturerAddress");
        AbstractC22676k.m65750j(tileItems, "tileItems");
        this.title = title;
        this.aboutTitle = aboutTitle;
        this.aboutImageUrl = aboutImageUrl;
        this.informationItems = informationItems;
        this.manufacturerLabel = manufacturerLabel;
        this.manufacturerAddress = manufacturerAddress;
        this.tileItems = tileItems;
    }
}
