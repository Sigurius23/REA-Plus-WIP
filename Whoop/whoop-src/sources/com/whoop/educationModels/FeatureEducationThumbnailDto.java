package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001eR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u001eR \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010\u001eR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010$¨\u0006@"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "", "", "id", "", "createdAt", "updatedAt", QueryParams.URL, "scrim", "alignment", "", "backgroundImage", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationThumbnailDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getId$annotations", "()V", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getUrl", "getUrl$annotations", "getScrim", "getScrim$annotations", "getAlignment", "getAlignment$annotations", "Z", "getBackgroundImage", "getBackgroundImage$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationThumbnailDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("alignment")
    private final String alignment;

    @SerializedName("background_image")
    private final boolean backgroundImage;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("id")
    private final int id;

    @SerializedName("scrim")
    private final String scrim;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName(QueryParams.URL)
    private final String url;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationThumbnailDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeatureEducationThumbnailDto(int i13, int i14, String str, String str2, String str3, String str4, String str5, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, FeatureEducationThumbnailDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.createdAt = str;
        this.updatedAt = str2;
        this.url = str3;
        this.scrim = str4;
        this.alignment = str5;
        this.backgroundImage = z4;
    }

    public static /* synthetic */ FeatureEducationThumbnailDto copy$default(FeatureEducationThumbnailDto featureEducationThumbnailDto, int i13, String str, String str2, String str3, String str4, String str5, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationThumbnailDto.id;
        }
        if ((i14 & 2) != 0) {
            str = featureEducationThumbnailDto.createdAt;
        }
        if ((i14 & 4) != 0) {
            str2 = featureEducationThumbnailDto.updatedAt;
        }
        if ((i14 & 8) != 0) {
            str3 = featureEducationThumbnailDto.url;
        }
        if ((i14 & 16) != 0) {
            str4 = featureEducationThumbnailDto.scrim;
        }
        if ((i14 & 32) != 0) {
            str5 = featureEducationThumbnailDto.alignment;
        }
        if ((i14 & 64) != 0) {
            z4 = featureEducationThumbnailDto.backgroundImage;
        }
        String str6 = str5;
        boolean z13 = z4;
        String str7 = str4;
        String str8 = str2;
        return featureEducationThumbnailDto.copy(i13, str, str8, str3, str7, str6, z13);
    }

    @InterfaceC37143h("alignment")
    public static /* synthetic */ void getAlignment$annotations() {
    }

    @InterfaceC37143h("background_image")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("scrim")
    public static /* synthetic */ void getScrim$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h(QueryParams.URL)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationThumbnailDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.updatedAt);
        output.encodeStringElement(serialDesc, 3, self.url);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.scrim);
        output.encodeStringElement(serialDesc, 5, self.alignment);
        output.encodeBooleanElement(serialDesc, 6, self.backgroundImage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScrim() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBackgroundImage() {
        return this.backgroundImage;
    }

    public final FeatureEducationThumbnailDto copy(int id4, String createdAt, String updatedAt, String url, String scrim, String alignment, boolean backgroundImage) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new FeatureEducationThumbnailDto(id4, createdAt, updatedAt, url, scrim, alignment, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationThumbnailDto)) {
            return false;
        }
        FeatureEducationThumbnailDto featureEducationThumbnailDto = (FeatureEducationThumbnailDto) other;
        return this.id == featureEducationThumbnailDto.id && AbstractC22676k.m65745e(this.createdAt, featureEducationThumbnailDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationThumbnailDto.updatedAt) && AbstractC22676k.m65745e(this.url, featureEducationThumbnailDto.url) && AbstractC22676k.m65745e(this.scrim, featureEducationThumbnailDto.scrim) && AbstractC22676k.m65745e(this.alignment, featureEducationThumbnailDto.alignment) && this.backgroundImage == featureEducationThumbnailDto.backgroundImage;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final boolean getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final String getScrim() {
        return this.scrim;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.url);
        String str = this.scrim;
        return Boolean.hashCode(this.backgroundImage) + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.alignment);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.url;
        String str4 = this.scrim;
        String str5 = this.alignment;
        boolean z4 = this.backgroundImage;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "FeatureEducationThumbnailDto(id=", ", createdAt=", str, ", updatedAt=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", url=", str3, ", scrim=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", alignment=", str5, ", backgroundImage=");
        return AbstractC18489d0.m53372m(sbM53373n, z4, ")");
    }

    public FeatureEducationThumbnailDto(int i13, String createdAt, String updatedAt, String url, String str, String alignment, boolean z4) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.id = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.url = url;
        this.scrim = str;
        this.alignment = alignment;
        this.backgroundImage = z4;
    }
}
