package com.whoop.shepherd.feature.terms.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MNB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J|\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b?\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b@\u0010\u0019R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bC\u0010>\u001a\u0004\bB\u0010\u001fR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010#R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bI\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010&¨\u0006O"}, m65681d2 = {"Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "", "", "icon", "pageTitle", "backgroundImage", "title", "body", "", "conditions", "Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;", "regionPicker", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;", "acknowledgeAllToggle", "buttonLabel", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;", "component8", "()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;", "component9", "component10", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIcon", "getPageTitle", "getBackgroundImage", "getBackgroundImage$annotations", "()V", "getTitle", "getBody", "Ljava/util/List;", "getConditions", "getConditions$annotations", "Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;", "getRegionPicker", "getRegionPicker$annotations", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;", "getAcknowledgeAllToggle", "getButtonLabel", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdTermsOfUseResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("acknowledge_all_toggle")
    private final ShepherdTermsToggleItem acknowledgeAllToggle;

    @SerializedName("image_url")
    private final String backgroundImage;

    @SerializedName("body")
    private final String body;

    @SerializedName("button_label")
    private final String buttonLabel;

    @SerializedName("suitability_conditions")
    private final List<String> conditions;

    @SerializedName("destination")
    private final C9598e destination;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("supported_region_picker")
    private final SupportedRegionPicker regionPicker;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdTermsOfUseResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13005a(14)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13005a(15))};
    }

    public /* synthetic */ ShepherdTermsOfUseResponse(int i13, String str, String str2, String str3, String str4, String str5, List list, SupportedRegionPicker supportedRegionPicker, ShepherdTermsToggleItem shepherdTermsToggleItem, String str6, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, ShepherdTermsOfUseResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.pageTitle = str2;
        this.backgroundImage = str3;
        this.title = str4;
        this.body = str5;
        this.conditions = list;
        this.regionPicker = supportedRegionPicker;
        this.acknowledgeAllToggle = shepherdTermsToggleItem;
        this.buttonLabel = str6;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShepherdTermsOfUseResponse copy$default(ShepherdTermsOfUseResponse shepherdTermsOfUseResponse, String str, String str2, String str3, String str4, String str5, List list, SupportedRegionPicker supportedRegionPicker, ShepherdTermsToggleItem shepherdTermsToggleItem, String str6, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdTermsOfUseResponse.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdTermsOfUseResponse.pageTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdTermsOfUseResponse.backgroundImage;
        }
        if ((i13 & 8) != 0) {
            str4 = shepherdTermsOfUseResponse.title;
        }
        if ((i13 & 16) != 0) {
            str5 = shepherdTermsOfUseResponse.body;
        }
        if ((i13 & 32) != 0) {
            list = shepherdTermsOfUseResponse.conditions;
        }
        if ((i13 & 64) != 0) {
            supportedRegionPicker = shepherdTermsOfUseResponse.regionPicker;
        }
        if ((i13 & 128) != 0) {
            shepherdTermsToggleItem = shepherdTermsOfUseResponse.acknowledgeAllToggle;
        }
        if ((i13 & 256) != 0) {
            str6 = shepherdTermsOfUseResponse.buttonLabel;
        }
        if ((i13 & 512) != 0) {
            c9598e = shepherdTermsOfUseResponse.destination;
        }
        String str7 = str6;
        C9598e c9598e2 = c9598e;
        SupportedRegionPicker supportedRegionPicker2 = supportedRegionPicker;
        ShepherdTermsToggleItem shepherdTermsToggleItem2 = shepherdTermsToggleItem;
        String str8 = str5;
        List list2 = list;
        return shepherdTermsOfUseResponse.copy(str, str2, str3, str4, str8, list2, supportedRegionPicker2, shepherdTermsToggleItem2, str7, c9598e2);
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @InterfaceC37143h("suitability_conditions")
    public static /* synthetic */ void getConditions$annotations() {
    }

    @InterfaceC37143h("supported_region_picker")
    public static /* synthetic */ void getRegionPicker$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdTermsOfUseResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.pageTitle);
        output.encodeStringElement(serialDesc, 2, self.backgroundImage);
        output.encodeStringElement(serialDesc, 3, self.title);
        output.encodeStringElement(serialDesc, 4, self.body);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.conditions);
        output.encodeSerializableElement(serialDesc, 6, SupportedRegionPicker$$serializer.INSTANCE, self.regionPicker);
        output.encodeSerializableElement(serialDesc, 7, ShepherdTermsToggleItem$$serializer.INSTANCE, self.acknowledgeAllToggle);
        output.encodeStringElement(serialDesc, 8, self.buttonLabel);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final List<String> component6() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SupportedRegionPicker getRegionPicker() {
        return this.regionPicker;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShepherdTermsToggleItem getAcknowledgeAllToggle() {
        return this.acknowledgeAllToggle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final ShepherdTermsOfUseResponse copy(String icon, String pageTitle, String backgroundImage, String title, String body, List<String> conditions, SupportedRegionPicker regionPicker, ShepherdTermsToggleItem acknowledgeAllToggle, String buttonLabel, C9598e destination) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(conditions, "conditions");
        AbstractC22676k.m65750j(regionPicker, "regionPicker");
        AbstractC22676k.m65750j(acknowledgeAllToggle, "acknowledgeAllToggle");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        return new ShepherdTermsOfUseResponse(icon, pageTitle, backgroundImage, title, body, conditions, regionPicker, acknowledgeAllToggle, buttonLabel, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdTermsOfUseResponse)) {
            return false;
        }
        ShepherdTermsOfUseResponse shepherdTermsOfUseResponse = (ShepherdTermsOfUseResponse) other;
        return AbstractC22676k.m65745e(this.icon, shepherdTermsOfUseResponse.icon) && AbstractC22676k.m65745e(this.pageTitle, shepherdTermsOfUseResponse.pageTitle) && AbstractC22676k.m65745e(this.backgroundImage, shepherdTermsOfUseResponse.backgroundImage) && AbstractC22676k.m65745e(this.title, shepherdTermsOfUseResponse.title) && AbstractC22676k.m65745e(this.body, shepherdTermsOfUseResponse.body) && AbstractC22676k.m65745e(this.conditions, shepherdTermsOfUseResponse.conditions) && AbstractC22676k.m65745e(this.regionPicker, shepherdTermsOfUseResponse.regionPicker) && AbstractC22676k.m65745e(this.acknowledgeAllToggle, shepherdTermsOfUseResponse.acknowledgeAllToggle) && AbstractC22676k.m65745e(this.buttonLabel, shepherdTermsOfUseResponse.buttonLabel) && AbstractC22676k.m65745e(this.destination, shepherdTermsOfUseResponse.destination);
    }

    public final ShepherdTermsToggleItem getAcknowledgeAllToggle() {
        return this.acknowledgeAllToggle;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final List<String> getConditions() {
        return this.conditions;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final SupportedRegionPicker getRegionPicker() {
        return this.regionPicker;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.acknowledgeAllToggle.hashCode() + ((this.regionPicker.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.pageTitle), 31, this.backgroundImage), 31, this.title), 31, this.body), 31, this.conditions)) * 31)) * 31, 31, this.buttonLabel);
        C9598e c9598e = this.destination;
        return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.pageTitle;
        String str3 = this.backgroundImage;
        String str4 = this.title;
        String str5 = this.body;
        List<String> list = this.conditions;
        SupportedRegionPicker supportedRegionPicker = this.regionPicker;
        ShepherdTermsToggleItem shepherdTermsToggleItem = this.acknowledgeAllToggle;
        String str6 = this.buttonLabel;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdTermsOfUseResponse(icon=", str, ", pageTitle=", str2, ", backgroundImage=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", body=");
        AbstractC36095b.m114694v(str5, ", conditions=", ", regionPicker=", sbM32001t, list);
        sbM32001t.append(supportedRegionPicker);
        sbM32001t.append(", acknowledgeAllToggle=");
        sbM32001t.append(shepherdTermsToggleItem);
        sbM32001t.append(", buttonLabel=");
        return AbstractC13673n.m38563j(sbM32001t, str6, ", destination=", c9598e, ")");
    }

    public ShepherdTermsOfUseResponse(String icon, String pageTitle, String backgroundImage, String title, String body, List<String> conditions, SupportedRegionPicker regionPicker, ShepherdTermsToggleItem acknowledgeAllToggle, String buttonLabel, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(conditions, "conditions");
        AbstractC22676k.m65750j(regionPicker, "regionPicker");
        AbstractC22676k.m65750j(acknowledgeAllToggle, "acknowledgeAllToggle");
        AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
        this.icon = icon;
        this.pageTitle = pageTitle;
        this.backgroundImage = backgroundImage;
        this.title = title;
        this.body = body;
        this.conditions = conditions;
        this.regionPicker = regionPicker;
        this.acknowledgeAllToggle = acknowledgeAllToggle;
        this.buttonLabel = buttonLabel;
        this.destination = c9598e;
    }
}
