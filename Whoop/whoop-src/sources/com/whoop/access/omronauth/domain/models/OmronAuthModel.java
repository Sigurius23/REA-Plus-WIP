package com.whoop.access.omronauth.domain.models;

import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.TitleSubTitleModel$$serializer;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeatureListModel$$serializer;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import v40.C35652d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HIBE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Ba\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\\\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010-¨\u0006J"}, m65681d2 = {"Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "", "Lcom/whoop/design/models/items/NavigationBarModel;", "navBar", "Lcom/whoop/design/models/items/ImageUrlModel;", "image", "Lcom/whoop/design/models/TitleSubTitleModel;", "content", "Lcom/whoop/design/models/items/FeatureListModel;", "featuresList", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "", "omronUrl", "Lcom/whoop/navigation/e;", "navigateOnSuccess", "<init>", "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$access_release", "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component2", "()Lcom/whoop/design/models/items/ImageUrlModel;", "component3", "()Lcom/whoop/design/models/TitleSubTitleModel;", "component4", "()Lcom/whoop/design/models/items/FeatureListModel;", "component5", "()Lcom/whoop/design/models/items/CardButtonModel;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavBar", "Lcom/whoop/design/models/items/ImageUrlModel;", "getImage", "Lcom/whoop/design/models/TitleSubTitleModel;", "getContent", "Lcom/whoop/design/models/items/FeatureListModel;", "getFeaturesList", "Lcom/whoop/design/models/items/CardButtonModel;", "getButton", "Ljava/lang/String;", "getOmronUrl", "Lcom/whoop/navigation/e;", "getNavigateOnSuccess", "getNavigateOnSuccess$annotations", "()V", "Companion", "$serializer", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OmronAuthModel {
    private final CardButtonModel button;
    private final TitleSubTitleModel content;
    private final FeatureListModel featuresList;
    private final ImageUrlModel image;
    private final NavigationBarModel navBar;
    private final C9598e navigateOnSuccess;
    private final String omronUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ((((C9598e.f28134d | CardButtonModel.$stable) | FeatureListModel.$stable) | TitleSubTitleModel.$stable) | ImageUrlModel.$stable) | NavigationBarModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35652d(10))};

    /* JADX INFO: renamed from: com.whoop.access.omronauth.domain.models.OmronAuthModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "serializer", "()Lwc3/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OmronAuthModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OmronAuthModel(int i13, NavigationBarModel navigationBarModel, ImageUrlModel imageUrlModel, TitleSubTitleModel titleSubTitleModel, FeatureListModel featureListModel, CardButtonModel cardButtonModel, String str, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, OmronAuthModel$$serializer.INSTANCE.getDescriptor());
        }
        this.navBar = navigationBarModel;
        this.image = imageUrlModel;
        this.content = titleSubTitleModel;
        this.featuresList = featureListModel;
        this.button = cardButtonModel;
        this.omronUrl = str;
        this.navigateOnSuccess = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ OmronAuthModel copy$default(OmronAuthModel omronAuthModel, NavigationBarModel navigationBarModel, ImageUrlModel imageUrlModel, TitleSubTitleModel titleSubTitleModel, FeatureListModel featureListModel, CardButtonModel cardButtonModel, String str, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = omronAuthModel.navBar;
        }
        if ((i13 & 2) != 0) {
            imageUrlModel = omronAuthModel.image;
        }
        if ((i13 & 4) != 0) {
            titleSubTitleModel = omronAuthModel.content;
        }
        if ((i13 & 8) != 0) {
            featureListModel = omronAuthModel.featuresList;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = omronAuthModel.button;
        }
        if ((i13 & 32) != 0) {
            str = omronAuthModel.omronUrl;
        }
        if ((i13 & 64) != 0) {
            c9598e = omronAuthModel.navigateOnSuccess;
        }
        String str2 = str;
        C9598e c9598e2 = c9598e;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        TitleSubTitleModel titleSubTitleModel2 = titleSubTitleModel;
        return omronAuthModel.copy(navigationBarModel, imageUrlModel, titleSubTitleModel2, featureListModel, cardButtonModel2, str2, c9598e2);
    }

    public static /* synthetic */ void getNavigateOnSuccess$annotations() {
    }

    public static final /* synthetic */ void write$Self$access_release(OmronAuthModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navBar);
        output.encodeNullableSerializableElement(serialDesc, 1, ImageUrlModel$$serializer.INSTANCE, self.image);
        output.encodeSerializableElement(serialDesc, 2, TitleSubTitleModel$$serializer.INSTANCE, self.content);
        output.encodeSerializableElement(serialDesc, 3, FeatureListModel$$serializer.INSTANCE, self.featuresList);
        output.encodeSerializableElement(serialDesc, 4, CardButtonModel$$serializer.INSTANCE, self.button);
        output.encodeStringElement(serialDesc, 5, self.omronUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.navigateOnSuccess);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavBar() {
        return this.navBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageUrlModel getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TitleSubTitleModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FeatureListModel getFeaturesList() {
        return this.featuresList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOmronUrl() {
        return this.omronUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getNavigateOnSuccess() {
        return this.navigateOnSuccess;
    }

    public final OmronAuthModel copy(NavigationBarModel navBar, ImageUrlModel image, TitleSubTitleModel content, FeatureListModel featuresList, CardButtonModel button, String omronUrl, C9598e navigateOnSuccess) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(featuresList, "featuresList");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(omronUrl, "omronUrl");
        return new OmronAuthModel(navBar, image, content, featuresList, button, omronUrl, navigateOnSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmronAuthModel)) {
            return false;
        }
        OmronAuthModel omronAuthModel = (OmronAuthModel) other;
        return AbstractC22676k.m65745e(this.navBar, omronAuthModel.navBar) && AbstractC22676k.m65745e(this.image, omronAuthModel.image) && AbstractC22676k.m65745e(this.content, omronAuthModel.content) && AbstractC22676k.m65745e(this.featuresList, omronAuthModel.featuresList) && AbstractC22676k.m65745e(this.button, omronAuthModel.button) && AbstractC22676k.m65745e(this.omronUrl, omronAuthModel.omronUrl) && AbstractC22676k.m65745e(this.navigateOnSuccess, omronAuthModel.navigateOnSuccess);
    }

    public final CardButtonModel getButton() {
        return this.button;
    }

    public final TitleSubTitleModel getContent() {
        return this.content;
    }

    public final FeatureListModel getFeaturesList() {
        return this.featuresList;
    }

    public final ImageUrlModel getImage() {
        return this.image;
    }

    public final NavigationBarModel getNavBar() {
        return this.navBar;
    }

    public final C9598e getNavigateOnSuccess() {
        return this.navigateOnSuccess;
    }

    public final String getOmronUrl() {
        return this.omronUrl;
    }

    public int hashCode() {
        NavigationBarModel navigationBarModel = this.navBar;
        int iHashCode = (navigationBarModel == null ? 0 : navigationBarModel.hashCode()) * 31;
        ImageUrlModel imageUrlModel = this.image;
        int iM30450d = AbstractC11266d.m30450d((this.button.hashCode() + ((this.featuresList.hashCode() + ((this.content.hashCode() + ((iHashCode + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.omronUrl);
        C9598e c9598e = this.navigateOnSuccess;
        return iM30450d + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navBar;
        ImageUrlModel imageUrlModel = this.image;
        TitleSubTitleModel titleSubTitleModel = this.content;
        FeatureListModel featureListModel = this.featuresList;
        CardButtonModel cardButtonModel = this.button;
        String str = this.omronUrl;
        C9598e c9598e = this.navigateOnSuccess;
        StringBuilder sb4 = new StringBuilder("OmronAuthModel(navBar=");
        sb4.append(navigationBarModel);
        sb4.append(", image=");
        sb4.append(imageUrlModel);
        sb4.append(", content=");
        sb4.append(titleSubTitleModel);
        sb4.append(", featuresList=");
        sb4.append(featureListModel);
        sb4.append(", button=");
        sb4.append(cardButtonModel);
        sb4.append(", omronUrl=");
        sb4.append(str);
        sb4.append(", navigateOnSuccess=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public OmronAuthModel(NavigationBarModel navigationBarModel, ImageUrlModel imageUrlModel, TitleSubTitleModel content, FeatureListModel featuresList, CardButtonModel button, String omronUrl, C9598e c9598e) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(featuresList, "featuresList");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(omronUrl, "omronUrl");
        this.navBar = navigationBarModel;
        this.image = imageUrlModel;
        this.content = content;
        this.featuresList = featuresList;
        this.button = button;
        this.omronUrl = omronUrl;
        this.navigateOnSuccess = c9598e;
    }
}
