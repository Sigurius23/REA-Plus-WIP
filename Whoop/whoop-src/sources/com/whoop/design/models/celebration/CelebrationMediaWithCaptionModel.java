package com.whoop.design.models.celebration;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\"Jb\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b=\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\"¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "media", "Lcom/whoop/design/util/TextResource;", "captionText", "", "captionTypography", "Lcom/whoop/navigation/e;", "destination", "subCaptionText", "subCaptionLeadingImage", "subCaptionTypography", "<init>", "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/navigation/e;", "component5", "component6", "component7", "copy", "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "getMedia", "Lcom/whoop/design/util/TextResource;", "getCaptionText", "Ljava/lang/String;", "getCaptionTypography", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getSubCaptionText", "getSubCaptionLeadingImage", "getSubCaptionTypography", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CelebrationMediaWithCaptionModel implements DesignSystemModel {
    private final TextResource captionText;
    private final String captionTypography;
    private final C9598e destination;
    private final CelebrationMediaModel media;
    private final String subCaptionLeadingImage;
    private final TextResource subCaptionText;
    private final String subCaptionTypography;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(17)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CelebrationMediaWithCaptionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CelebrationMediaWithCaptionModel(int i13, CelebrationMediaModel celebrationMediaModel, TextResource textResource, String str, C9598e c9598e, TextResource textResource2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CelebrationMediaWithCaptionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.media = celebrationMediaModel;
        if ((i13 & 2) == 0) {
            this.captionText = null;
        } else {
            this.captionText = textResource;
        }
        if ((i13 & 4) == 0) {
            this.captionTypography = null;
        } else {
            this.captionTypography = str;
        }
        if ((i13 & 8) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 16) == 0) {
            this.subCaptionText = null;
        } else {
            this.subCaptionText = textResource2;
        }
        if ((i13 & 32) == 0) {
            this.subCaptionLeadingImage = null;
        } else {
            this.subCaptionLeadingImage = str2;
        }
        if ((i13 & 64) == 0) {
            this.subCaptionTypography = null;
        } else {
            this.subCaptionTypography = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CelebrationMediaWithCaptionModel copy$default(CelebrationMediaWithCaptionModel celebrationMediaWithCaptionModel, CelebrationMediaModel celebrationMediaModel, TextResource textResource, String str, C9598e c9598e, TextResource textResource2, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            celebrationMediaModel = celebrationMediaWithCaptionModel.media;
        }
        if ((i13 & 2) != 0) {
            textResource = celebrationMediaWithCaptionModel.captionText;
        }
        if ((i13 & 4) != 0) {
            str = celebrationMediaWithCaptionModel.captionTypography;
        }
        if ((i13 & 8) != 0) {
            c9598e = celebrationMediaWithCaptionModel.destination;
        }
        if ((i13 & 16) != 0) {
            textResource2 = celebrationMediaWithCaptionModel.subCaptionText;
        }
        if ((i13 & 32) != 0) {
            str2 = celebrationMediaWithCaptionModel.subCaptionLeadingImage;
        }
        if ((i13 & 64) != 0) {
            str3 = celebrationMediaWithCaptionModel.subCaptionTypography;
        }
        String str4 = str2;
        String str5 = str3;
        TextResource textResource3 = textResource2;
        String str6 = str;
        return celebrationMediaWithCaptionModel.copy(celebrationMediaModel, textResource, str6, c9598e, textResource3, str4, str5);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CelebrationMediaWithCaptionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, CelebrationMediaModel$$serializer.INSTANCE, self.media);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.captionText != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C25452a.f99689a, self.captionText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.captionTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.captionTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.subCaptionText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.subCaptionText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subCaptionLeadingImage != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.subCaptionLeadingImage);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.subCaptionTypography == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.subCaptionTypography);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getCaptionText() {
        return this.captionText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCaptionTypography() {
        return this.captionTypography;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getSubCaptionText() {
        return this.subCaptionText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubCaptionLeadingImage() {
        return this.subCaptionLeadingImage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubCaptionTypography() {
        return this.subCaptionTypography;
    }

    public final CelebrationMediaWithCaptionModel copy(CelebrationMediaModel media, TextResource captionText, String captionTypography, C9598e destination, TextResource subCaptionText, String subCaptionLeadingImage, String subCaptionTypography) {
        AbstractC22676k.m65750j(media, "media");
        return new CelebrationMediaWithCaptionModel(media, captionText, captionTypography, destination, subCaptionText, subCaptionLeadingImage, subCaptionTypography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CelebrationMediaWithCaptionModel)) {
            return false;
        }
        CelebrationMediaWithCaptionModel celebrationMediaWithCaptionModel = (CelebrationMediaWithCaptionModel) other;
        return AbstractC22676k.m65745e(this.media, celebrationMediaWithCaptionModel.media) && AbstractC22676k.m65745e(this.captionText, celebrationMediaWithCaptionModel.captionText) && AbstractC22676k.m65745e(this.captionTypography, celebrationMediaWithCaptionModel.captionTypography) && AbstractC22676k.m65745e(this.destination, celebrationMediaWithCaptionModel.destination) && AbstractC22676k.m65745e(this.subCaptionText, celebrationMediaWithCaptionModel.subCaptionText) && AbstractC22676k.m65745e(this.subCaptionLeadingImage, celebrationMediaWithCaptionModel.subCaptionLeadingImage) && AbstractC22676k.m65745e(this.subCaptionTypography, celebrationMediaWithCaptionModel.subCaptionTypography);
    }

    public final TextResource getCaptionText() {
        return this.captionText;
    }

    public final String getCaptionTypography() {
        return this.captionTypography;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    public final String getSubCaptionLeadingImage() {
        return this.subCaptionLeadingImage;
    }

    public final TextResource getSubCaptionText() {
        return this.subCaptionText;
    }

    public final String getSubCaptionTypography() {
        return this.subCaptionTypography;
    }

    public int hashCode() {
        int iHashCode = this.media.hashCode() * 31;
        TextResource textResource = this.captionText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str = this.captionTypography;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TextResource textResource2 = this.subCaptionText;
        int iHashCode5 = (iHashCode4 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        String str2 = this.subCaptionLeadingImage;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subCaptionTypography;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        CelebrationMediaModel celebrationMediaModel = this.media;
        TextResource textResource = this.captionText;
        String str = this.captionTypography;
        C9598e c9598e = this.destination;
        TextResource textResource2 = this.subCaptionText;
        String str2 = this.subCaptionLeadingImage;
        String str3 = this.subCaptionTypography;
        StringBuilder sb4 = new StringBuilder("CelebrationMediaWithCaptionModel(media=");
        sb4.append(celebrationMediaModel);
        sb4.append(", captionText=");
        sb4.append(textResource);
        sb4.append(", captionTypography=");
        AbstractC30007c.m91827B(sb4, str, ", destination=", c9598e, ", subCaptionText=");
        AbstractC30007c.m91856z(sb4, textResource2, ", subCaptionLeadingImage=", str2, ", subCaptionTypography=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }

    public CelebrationMediaWithCaptionModel(CelebrationMediaModel media, TextResource textResource, String str, C9598e c9598e, TextResource textResource2, String str2, String str3) {
        AbstractC22676k.m65750j(media, "media");
        this.media = media;
        this.captionText = textResource;
        this.captionTypography = str;
        this.destination = c9598e;
        this.subCaptionText = textResource2;
        this.subCaptionLeadingImage = str2;
        this.subCaptionTypography = str3;
    }

    public /* synthetic */ CelebrationMediaWithCaptionModel(CelebrationMediaModel celebrationMediaModel, TextResource textResource, String str, C9598e c9598e, TextResource textResource2, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(celebrationMediaModel, (i13 & 2) != 0 ? null : textResource, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : textResource2, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : str3);
    }
}
