package com.whoop.design.models.celebration;

import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-Jj\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b>\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-¨\u0006G"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/ContentType;", "contentType", "", "contentUrl", "size", "Lcom/whoop/design/util/TextResource;", "textOverlay", "textOverlaySuffix", "Lcom/whoop/design/models/celebration/TextOverlayStyle;", "textOverlayStyle", "Lcom/whoop/design/models/celebration/DynamicLottieModel;", "dynamicLottieProperties", "", "showLoadingShimmer", "<init>", "(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/ContentType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/design/util/TextResource;", "component5", "component6", "()Lcom/whoop/design/models/celebration/TextOverlayStyle;", "component7", "()Lcom/whoop/design/models/celebration/DynamicLottieModel;", "component8", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/ContentType;", "getContentType", "Ljava/lang/String;", "getContentUrl", "getSize", "Lcom/whoop/design/util/TextResource;", "getTextOverlay", "getTextOverlaySuffix", "Lcom/whoop/design/models/celebration/TextOverlayStyle;", "getTextOverlayStyle", "Lcom/whoop/design/models/celebration/DynamicLottieModel;", "getDynamicLottieProperties", "Ljava/lang/Boolean;", "getShowLoadingShimmer", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CelebrationMediaModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ContentType contentType;
    private final String contentUrl;
    private final DynamicLottieModel dynamicLottieProperties;
    private final Boolean showLoadingShimmer;
    private final String size;
    private final TextResource textOverlay;
    private final TextOverlayStyle textOverlayStyle;
    private final TextResource textOverlaySuffix;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CelebrationMediaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C34260e(15)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C34260e(16)), null, null};
    }

    public /* synthetic */ CelebrationMediaModel(int i13, ContentType contentType, String str, String str2, TextResource textResource, TextResource textResource2, TextOverlayStyle textOverlayStyle, DynamicLottieModel dynamicLottieModel, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, CelebrationMediaModel$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = (i13 & 1) == 0 ? ContentType.UNKNOWN : contentType;
        this.contentUrl = str;
        this.size = str2;
        if ((i13 & 8) == 0) {
            this.textOverlay = null;
        } else {
            this.textOverlay = textResource;
        }
        if ((i13 & 16) == 0) {
            this.textOverlaySuffix = null;
        } else {
            this.textOverlaySuffix = textResource2;
        }
        if ((i13 & 32) == 0) {
            this.textOverlayStyle = null;
        } else {
            this.textOverlayStyle = textOverlayStyle;
        }
        if ((i13 & 64) == 0) {
            this.dynamicLottieProperties = null;
        } else {
            this.dynamicLottieProperties = dynamicLottieModel;
        }
        if ((i13 & 128) == 0) {
            this.showLoadingShimmer = null;
        } else {
            this.showLoadingShimmer = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ContentType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return TextOverlayStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ CelebrationMediaModel copy$default(CelebrationMediaModel celebrationMediaModel, ContentType contentType, String str, String str2, TextResource textResource, TextResource textResource2, TextOverlayStyle textOverlayStyle, DynamicLottieModel dynamicLottieModel, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            contentType = celebrationMediaModel.contentType;
        }
        if ((i13 & 2) != 0) {
            str = celebrationMediaModel.contentUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = celebrationMediaModel.size;
        }
        if ((i13 & 8) != 0) {
            textResource = celebrationMediaModel.textOverlay;
        }
        if ((i13 & 16) != 0) {
            textResource2 = celebrationMediaModel.textOverlaySuffix;
        }
        if ((i13 & 32) != 0) {
            textOverlayStyle = celebrationMediaModel.textOverlayStyle;
        }
        if ((i13 & 64) != 0) {
            dynamicLottieModel = celebrationMediaModel.dynamicLottieProperties;
        }
        if ((i13 & 128) != 0) {
            bool = celebrationMediaModel.showLoadingShimmer;
        }
        DynamicLottieModel dynamicLottieModel2 = dynamicLottieModel;
        Boolean bool2 = bool;
        TextResource textResource3 = textResource2;
        TextOverlayStyle textOverlayStyle2 = textOverlayStyle;
        return celebrationMediaModel.copy(contentType, str, str2, textResource, textResource3, textOverlayStyle2, dynamicLottieModel2, bool2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CelebrationMediaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.contentType != ContentType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.contentType);
        }
        output.encodeStringElement(serialDesc, 1, self.contentUrl);
        output.encodeStringElement(serialDesc, 2, self.size);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.textOverlay != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C25452a.f99689a, self.textOverlay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.textOverlaySuffix != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.textOverlaySuffix);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.textOverlayStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.textOverlayStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.dynamicLottieProperties != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DynamicLottieModel$$serializer.INSTANCE, self.dynamicLottieProperties);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.showLoadingShimmer == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.showLoadingShimmer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getTextOverlay() {
        return this.textOverlay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getTextOverlaySuffix() {
        return this.textOverlaySuffix;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextOverlayStyle getTextOverlayStyle() {
        return this.textOverlayStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DynamicLottieModel getDynamicLottieProperties() {
        return this.dynamicLottieProperties;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShowLoadingShimmer() {
        return this.showLoadingShimmer;
    }

    public final CelebrationMediaModel copy(ContentType contentType, String contentUrl, String size, TextResource textOverlay, TextResource textOverlaySuffix, TextOverlayStyle textOverlayStyle, DynamicLottieModel dynamicLottieProperties, Boolean showLoadingShimmer) {
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(size, "size");
        return new CelebrationMediaModel(contentType, contentUrl, size, textOverlay, textOverlaySuffix, textOverlayStyle, dynamicLottieProperties, showLoadingShimmer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CelebrationMediaModel)) {
            return false;
        }
        CelebrationMediaModel celebrationMediaModel = (CelebrationMediaModel) other;
        return this.contentType == celebrationMediaModel.contentType && AbstractC22676k.m65745e(this.contentUrl, celebrationMediaModel.contentUrl) && AbstractC22676k.m65745e(this.size, celebrationMediaModel.size) && AbstractC22676k.m65745e(this.textOverlay, celebrationMediaModel.textOverlay) && AbstractC22676k.m65745e(this.textOverlaySuffix, celebrationMediaModel.textOverlaySuffix) && this.textOverlayStyle == celebrationMediaModel.textOverlayStyle && AbstractC22676k.m65745e(this.dynamicLottieProperties, celebrationMediaModel.dynamicLottieProperties) && AbstractC22676k.m65745e(this.showLoadingShimmer, celebrationMediaModel.showLoadingShimmer);
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final DynamicLottieModel getDynamicLottieProperties() {
        return this.dynamicLottieProperties;
    }

    public final Boolean getShowLoadingShimmer() {
        return this.showLoadingShimmer;
    }

    public final String getSize() {
        return this.size;
    }

    public final TextResource getTextOverlay() {
        return this.textOverlay;
    }

    public final TextOverlayStyle getTextOverlayStyle() {
        return this.textOverlayStyle;
    }

    public final TextResource getTextOverlaySuffix() {
        return this.textOverlaySuffix;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.contentType.hashCode() * 31, 31, this.contentUrl), 31, this.size);
        TextResource textResource = this.textOverlay;
        int iHashCode = (iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.textOverlaySuffix;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextOverlayStyle textOverlayStyle = this.textOverlayStyle;
        int iHashCode3 = (iHashCode2 + (textOverlayStyle == null ? 0 : textOverlayStyle.hashCode())) * 31;
        DynamicLottieModel dynamicLottieModel = this.dynamicLottieProperties;
        int iHashCode4 = (iHashCode3 + (dynamicLottieModel == null ? 0 : dynamicLottieModel.hashCode())) * 31;
        Boolean bool = this.showLoadingShimmer;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        ContentType contentType = this.contentType;
        String str = this.contentUrl;
        String str2 = this.size;
        TextResource textResource = this.textOverlay;
        TextResource textResource2 = this.textOverlaySuffix;
        TextOverlayStyle textOverlayStyle = this.textOverlayStyle;
        DynamicLottieModel dynamicLottieModel = this.dynamicLottieProperties;
        Boolean bool = this.showLoadingShimmer;
        StringBuilder sb4 = new StringBuilder("CelebrationMediaModel(contentType=");
        sb4.append(contentType);
        sb4.append(", contentUrl=");
        sb4.append(str);
        sb4.append(", size=");
        AbstractC30007c.m91826A(sb4, str2, ", textOverlay=", textResource, ", textOverlaySuffix=");
        sb4.append(textResource2);
        sb4.append(", textOverlayStyle=");
        sb4.append(textOverlayStyle);
        sb4.append(", dynamicLottieProperties=");
        sb4.append(dynamicLottieModel);
        sb4.append(", showLoadingShimmer=");
        sb4.append(bool);
        sb4.append(")");
        return sb4.toString();
    }

    public CelebrationMediaModel(ContentType contentType, String contentUrl, String size, TextResource textResource, TextResource textResource2, TextOverlayStyle textOverlayStyle, DynamicLottieModel dynamicLottieModel, Boolean bool) {
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(size, "size");
        this.contentType = contentType;
        this.contentUrl = contentUrl;
        this.size = size;
        this.textOverlay = textResource;
        this.textOverlaySuffix = textResource2;
        this.textOverlayStyle = textOverlayStyle;
        this.dynamicLottieProperties = dynamicLottieModel;
        this.showLoadingShimmer = bool;
    }

    public /* synthetic */ CelebrationMediaModel(ContentType contentType, String str, String str2, TextResource textResource, TextResource textResource2, TextOverlayStyle textOverlayStyle, DynamicLottieModel dynamicLottieModel, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ContentType.UNKNOWN : contentType, str, str2, (i13 & 8) != 0 ? null : textResource, (i13 & 16) != 0 ? null : textResource2, (i13 & 32) != 0 ? null : textOverlayStyle, (i13 & 64) != 0 ? null : dynamicLottieModel, (i13 & 128) != 0 ? null : bool);
    }
}
