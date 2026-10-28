package com.whoop.design.models.tiles;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u008c\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b@\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\bA\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bB\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bC\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010#R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010J\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010'¨\u0006O"}, m65681d2 = {"Lcom/whoop/design/models/tiles/OfferBannerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "offerId", "Lcom/whoop/design/util/TextResource;", "title", "markdownTitle", "borderStyle", "subtitle", "leadingIcon", "", "showChevron", "showHighlight", "", "timerMetadata", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "()Ljava/lang/Boolean;", "component9", "()Ljava/util/List;", "component10", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/tiles/OfferBannerModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/tiles/OfferBannerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getOfferId", "getOfferId$annotations", "()V", "Lcom/whoop/design/util/TextResource;", "getTitle", "getMarkdownTitle", "getBorderStyle", "getSubtitle", "getLeadingIcon", "Z", "getShowChevron", "Ljava/lang/Boolean;", "getShowHighlight", "Ljava/util/List;", "getTimerMetadata", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigation$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OfferBannerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String borderStyle;
    private final String leadingIcon;
    private final String markdownTitle;
    private final C9598e navigation;

    @SerializedName("id")
    private final String offerId;
    private final boolean showChevron;
    private final Boolean showHighlight;
    private final TextResource subtitle;
    private final List<DesignSystemModel> timerMetadata;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/tiles/OfferBannerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OfferBannerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(5)), AbstractC30060g.m92087G(enumC23463i, new C13998z1(6))};
    }

    public /* synthetic */ OfferBannerModel(int i13, String str, TextResource textResource, String str2, String str3, TextResource textResource2, String str4, boolean z4, Boolean bool, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i13 & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 64, OfferBannerModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.offerId = null;
        } else {
            this.offerId = str;
        }
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.markdownTitle = null;
        } else {
            this.markdownTitle = str2;
        }
        if ((i13 & 8) == 0) {
            this.borderStyle = null;
        } else {
            this.borderStyle = str3;
        }
        if ((i13 & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = textResource2;
        }
        if ((i13 & 32) == 0) {
            this.leadingIcon = null;
        } else {
            this.leadingIcon = str4;
        }
        this.showChevron = z4;
        if ((i13 & 128) == 0) {
            this.showHighlight = null;
        } else {
            this.showHighlight = bool;
        }
        if ((i13 & 256) == 0) {
            this.timerMetadata = null;
        } else {
            this.timerMetadata = list;
        }
        if ((i13 & 512) == 0) {
            this.navigation = null;
        } else {
            this.navigation = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferBannerModel copy$default(OfferBannerModel offerBannerModel, String str, TextResource textResource, String str2, String str3, TextResource textResource2, String str4, boolean z4, Boolean bool, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = offerBannerModel.offerId;
        }
        if ((i13 & 2) != 0) {
            textResource = offerBannerModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = offerBannerModel.markdownTitle;
        }
        if ((i13 & 8) != 0) {
            str3 = offerBannerModel.borderStyle;
        }
        if ((i13 & 16) != 0) {
            textResource2 = offerBannerModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            str4 = offerBannerModel.leadingIcon;
        }
        if ((i13 & 64) != 0) {
            z4 = offerBannerModel.showChevron;
        }
        if ((i13 & 128) != 0) {
            bool = offerBannerModel.showHighlight;
        }
        if ((i13 & 256) != 0) {
            list = offerBannerModel.timerMetadata;
        }
        if ((i13 & 512) != 0) {
            c9598e = offerBannerModel.navigation;
        }
        List list2 = list;
        C9598e c9598e2 = c9598e;
        boolean z13 = z4;
        Boolean bool2 = bool;
        TextResource textResource3 = textResource2;
        String str5 = str4;
        return offerBannerModel.copy(str, textResource, str2, str3, textResource3, str5, z13, bool2, list2, c9598e2);
    }

    public static /* synthetic */ void getNavigation$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getOfferId$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(OfferBannerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.offerId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.offerId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.markdownTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.markdownTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.borderStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.borderStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.leadingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.leadingIcon);
        }
        output.encodeBooleanElement(serialDesc, 6, self.showChevron);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.showHighlight != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.showHighlight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.timerMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.timerMetadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.navigation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.navigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarkdownTitle() {
        return this.markdownTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBorderStyle() {
        return this.borderStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowChevron() {
        return this.showChevron;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShowHighlight() {
        return this.showHighlight;
    }

    public final List<DesignSystemModel> component9() {
        return this.timerMetadata;
    }

    public final OfferBannerModel copy(String offerId, TextResource title, String markdownTitle, String borderStyle, TextResource subtitle, String leadingIcon, boolean showChevron, Boolean showHighlight, List<? extends DesignSystemModel> timerMetadata, C9598e navigation) {
        return new OfferBannerModel(offerId, title, markdownTitle, borderStyle, subtitle, leadingIcon, showChevron, showHighlight, timerMetadata, navigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferBannerModel)) {
            return false;
        }
        OfferBannerModel offerBannerModel = (OfferBannerModel) other;
        return AbstractC22676k.m65745e(this.offerId, offerBannerModel.offerId) && AbstractC22676k.m65745e(this.title, offerBannerModel.title) && AbstractC22676k.m65745e(this.markdownTitle, offerBannerModel.markdownTitle) && AbstractC22676k.m65745e(this.borderStyle, offerBannerModel.borderStyle) && AbstractC22676k.m65745e(this.subtitle, offerBannerModel.subtitle) && AbstractC22676k.m65745e(this.leadingIcon, offerBannerModel.leadingIcon) && this.showChevron == offerBannerModel.showChevron && AbstractC22676k.m65745e(this.showHighlight, offerBannerModel.showHighlight) && AbstractC22676k.m65745e(this.timerMetadata, offerBannerModel.timerMetadata) && AbstractC22676k.m65745e(this.navigation, offerBannerModel.navigation);
    }

    public final String getBorderStyle() {
        return this.borderStyle;
    }

    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    public final String getMarkdownTitle() {
        return this.markdownTitle;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final boolean getShowChevron() {
        return this.showChevron;
    }

    public final Boolean getShowHighlight() {
        return this.showHighlight;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> getTimerMetadata() {
        return this.timerMetadata;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.offerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str2 = this.markdownTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.borderStyle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode5 = (iHashCode4 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        String str4 = this.leadingIcon;
        int iM8289b = AbstractC2875y.m8289b((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.showChevron);
        Boolean bool = this.showHighlight;
        int iHashCode6 = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DesignSystemModel> list = this.timerMetadata;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        return iHashCode7 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.offerId;
        TextResource textResource = this.title;
        String str2 = this.markdownTitle;
        String str3 = this.borderStyle;
        TextResource textResource2 = this.subtitle;
        String str4 = this.leadingIcon;
        boolean z4 = this.showChevron;
        Boolean bool = this.showHighlight;
        List<DesignSystemModel> list = this.timerMetadata;
        C9598e c9598e = this.navigation;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("OfferBannerModel(offerId=", str, ", title=", textResource, ", markdownTitle=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", borderStyle=", str3, ", subtitle=");
        AbstractC30007c.m91856z(sbM91847q, textResource2, ", leadingIcon=", str4, ", showChevron=");
        sbM91847q.append(z4);
        sbM91847q.append(", showHighlight=");
        sbM91847q.append(bool);
        sbM91847q.append(", timerMetadata=");
        sbM91847q.append(list);
        sbM91847q.append(", navigation=");
        sbM91847q.append(c9598e);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferBannerModel(String str, TextResource textResource, String str2, String str3, TextResource textResource2, String str4, boolean z4, Boolean bool, List<? extends DesignSystemModel> list, C9598e c9598e) {
        this.offerId = str;
        this.title = textResource;
        this.markdownTitle = str2;
        this.borderStyle = str3;
        this.subtitle = textResource2;
        this.leadingIcon = str4;
        this.showChevron = z4;
        this.showHighlight = bool;
        this.timerMetadata = list;
        this.navigation = c9598e;
    }

    public /* synthetic */ OfferBannerModel(String str, TextResource textResource, String str2, String str3, TextResource textResource2, String str4, boolean z4, Boolean bool, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : textResource, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : textResource2, (i13 & 32) != 0 ? null : str4, z4, (i13 & 128) != 0 ? null : bool, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : c9598e);
    }
}
