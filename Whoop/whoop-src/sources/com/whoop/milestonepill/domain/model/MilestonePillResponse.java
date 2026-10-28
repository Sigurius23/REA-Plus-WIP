package com.whoop.milestonepill.domain.model;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.celebration.DynamicLottieModel$$serializer;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-Jr\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010-¨\u0006F"}, m65681d2 = {"Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "", "", "contentUrl", "contentType", "Lcom/whoop/design/models/celebration/DynamicLottieModel;", "dynamicLottieProperties", "", "showLoadingShimmer", "count", "style", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "textStyle", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$milestone_pill_arch_mini_release", "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/celebration/DynamicLottieModel;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "component8", "component9", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentUrl", "getContentType", "Lcom/whoop/design/models/celebration/DynamicLottieModel;", "getDynamicLottieProperties", "Ljava/lang/Boolean;", "getShowLoadingShimmer", "getCount", "getStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "getTextStyle", "Lcom/whoop/navigation/e;", "getNavigation", "Companion", "$serializer", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MilestonePillResponse {
    private final ColorThemeModel colors;
    private final String contentType;
    private final String contentUrl;
    private final String count;
    private final DynamicLottieModel dynamicLottieProperties;
    private final C9598e navigation;
    private final Boolean showLoadingShimmer;
    private final String style;
    private final String textStyle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (C9598e.f28134d | ColorThemeModel.$stable) | DynamicLottieModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(12))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "serializer", "()Lwc3/c;", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MilestonePillResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MilestonePillResponse(int i13, String str, String str2, DynamicLottieModel dynamicLottieModel, Boolean bool, String str3, String str4, ColorThemeModel colorThemeModel, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (435 != (i13 & 435)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 435, MilestonePillResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.contentUrl = str;
        this.contentType = str2;
        if ((i13 & 4) == 0) {
            this.dynamicLottieProperties = null;
        } else {
            this.dynamicLottieProperties = dynamicLottieModel;
        }
        if ((i13 & 8) == 0) {
            this.showLoadingShimmer = null;
        } else {
            this.showLoadingShimmer = bool;
        }
        this.count = str3;
        this.style = str4;
        if ((i13 & 64) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
        this.textStyle = str5;
        this.navigation = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MilestonePillResponse copy$default(MilestonePillResponse milestonePillResponse, String str, String str2, DynamicLottieModel dynamicLottieModel, Boolean bool, String str3, String str4, ColorThemeModel colorThemeModel, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = milestonePillResponse.contentUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = milestonePillResponse.contentType;
        }
        if ((i13 & 4) != 0) {
            dynamicLottieModel = milestonePillResponse.dynamicLottieProperties;
        }
        if ((i13 & 8) != 0) {
            bool = milestonePillResponse.showLoadingShimmer;
        }
        if ((i13 & 16) != 0) {
            str3 = milestonePillResponse.count;
        }
        if ((i13 & 32) != 0) {
            str4 = milestonePillResponse.style;
        }
        if ((i13 & 64) != 0) {
            colorThemeModel = milestonePillResponse.colors;
        }
        if ((i13 & 128) != 0) {
            str5 = milestonePillResponse.textStyle;
        }
        if ((i13 & 256) != 0) {
            c9598e = milestonePillResponse.navigation;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        String str7 = str4;
        ColorThemeModel colorThemeModel2 = colorThemeModel;
        String str8 = str3;
        DynamicLottieModel dynamicLottieModel2 = dynamicLottieModel;
        return milestonePillResponse.copy(str, str2, dynamicLottieModel2, bool, str8, str7, colorThemeModel2, str6, c9598e2);
    }

    public static final /* synthetic */ void write$Self$milestone_pill_arch_mini_release(MilestonePillResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.contentUrl);
        output.encodeStringElement(serialDesc, 1, self.contentType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.dynamicLottieProperties != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DynamicLottieModel$$serializer.INSTANCE, self.dynamicLottieProperties);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.showLoadingShimmer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.showLoadingShimmer);
        }
        output.encodeStringElement(serialDesc, 4, self.count);
        output.encodeStringElement(serialDesc, 5, self.style);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.colors != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ColorThemeModel$$serializer.INSTANCE, self.colors);
        }
        output.encodeStringElement(serialDesc, 7, self.textStyle);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.navigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DynamicLottieModel getDynamicLottieProperties() {
        return this.dynamicLottieProperties;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowLoadingShimmer() {
        return this.showLoadingShimmer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final MilestonePillResponse copy(String contentUrl, String contentType, DynamicLottieModel dynamicLottieProperties, Boolean showLoadingShimmer, String count, String style, ColorThemeModel colors, String textStyle, C9598e navigation) {
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(count, "count");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        return new MilestonePillResponse(contentUrl, contentType, dynamicLottieProperties, showLoadingShimmer, count, style, colors, textStyle, navigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestonePillResponse)) {
            return false;
        }
        MilestonePillResponse milestonePillResponse = (MilestonePillResponse) other;
        return AbstractC22676k.m65745e(this.contentUrl, milestonePillResponse.contentUrl) && AbstractC22676k.m65745e(this.contentType, milestonePillResponse.contentType) && AbstractC22676k.m65745e(this.dynamicLottieProperties, milestonePillResponse.dynamicLottieProperties) && AbstractC22676k.m65745e(this.showLoadingShimmer, milestonePillResponse.showLoadingShimmer) && AbstractC22676k.m65745e(this.count, milestonePillResponse.count) && AbstractC22676k.m65745e(this.style, milestonePillResponse.style) && AbstractC22676k.m65745e(this.colors, milestonePillResponse.colors) && AbstractC22676k.m65745e(this.textStyle, milestonePillResponse.textStyle) && AbstractC22676k.m65745e(this.navigation, milestonePillResponse.navigation);
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final String getCount() {
        return this.count;
    }

    public final DynamicLottieModel getDynamicLottieProperties() {
        return this.dynamicLottieProperties;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final Boolean getShowLoadingShimmer() {
        return this.showLoadingShimmer;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.contentUrl.hashCode() * 31, 31, this.contentType);
        DynamicLottieModel dynamicLottieModel = this.dynamicLottieProperties;
        int iHashCode = (iM30450d + (dynamicLottieModel == null ? 0 : dynamicLottieModel.hashCode())) * 31;
        Boolean bool = this.showLoadingShimmer;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.count), 31, this.style);
        ColorThemeModel colorThemeModel = this.colors;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (colorThemeModel == null ? 0 : colorThemeModel.hashCode())) * 31, 31, this.textStyle);
        C9598e c9598e = this.navigation;
        return iM30450d3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.contentUrl;
        String str2 = this.contentType;
        DynamicLottieModel dynamicLottieModel = this.dynamicLottieProperties;
        Boolean bool = this.showLoadingShimmer;
        String str3 = this.count;
        String str4 = this.style;
        ColorThemeModel colorThemeModel = this.colors;
        String str5 = this.textStyle;
        C9598e c9598e = this.navigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MilestonePillResponse(contentUrl=", str, ", contentType=", str2, ", dynamicLottieProperties=");
        sbM32001t.append(dynamicLottieModel);
        sbM32001t.append(", showLoadingShimmer=");
        sbM32001t.append(bool);
        sbM32001t.append(", count=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", style=", str4, ", colors=");
        sbM32001t.append(colorThemeModel);
        sbM32001t.append(", textStyle=");
        sbM32001t.append(str5);
        sbM32001t.append(", navigation=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public MilestonePillResponse(String contentUrl, String contentType, DynamicLottieModel dynamicLottieModel, Boolean bool, String count, String style, ColorThemeModel colorThemeModel, String textStyle, C9598e c9598e) {
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(count, "count");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        this.contentUrl = contentUrl;
        this.contentType = contentType;
        this.dynamicLottieProperties = dynamicLottieModel;
        this.showLoadingShimmer = bool;
        this.count = count;
        this.style = style;
        this.colors = colorThemeModel;
        this.textStyle = textStyle;
        this.navigation = c9598e;
    }

    public /* synthetic */ MilestonePillResponse(String str, String str2, DynamicLottieModel dynamicLottieModel, Boolean bool, String str3, String str4, ColorThemeModel colorThemeModel, String str5, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : dynamicLottieModel, (i13 & 8) != 0 ? null : bool, str3, str4, (i13 & 64) != 0 ? null : colorThemeModel, str5, c9598e);
    }
}
