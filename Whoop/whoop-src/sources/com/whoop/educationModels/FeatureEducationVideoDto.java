package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ve.C35916a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJf\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\u0019R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\u0019R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010\u001f¨\u0006H"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationVideoDto;", "", "", "id", "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "thumbnail", "", "createdAt", "updatedAt", "title", "playtime", QueryParams.URL, "Lcom/whoop/educationModels/EducationVideoTypeDto;", "type", "<init>", "(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/educationModels/EducationVideoTypeDto;", "copy", "(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)Lcom/whoop/educationModels/FeatureEducationVideoDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationVideoDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "getId$annotations", "()V", "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;", "getThumbnail", "getThumbnail$annotations", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getTitle", "getTitle$annotations", "getPlaytime", "getPlaytime$annotations", "getUrl", "getUrl$annotations", "Lcom/whoop/educationModels/EducationVideoTypeDto;", "getType", "getType$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationVideoDto {
    public static final int $stable = 0;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("id")
    private final int id;

    @SerializedName("playtime")
    private final String playtime;

    @SerializedName("thumbnail")
    private final FeatureEducationThumbnailDto thumbnail;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final EducationVideoTypeDto type;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName(QueryParams.URL)
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35916a(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationVideoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeatureEducationVideoDto(int i13, int i14, FeatureEducationThumbnailDto featureEducationThumbnailDto, String str, String str2, String str3, String str4, String str5, EducationVideoTypeDto educationVideoTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, FeatureEducationVideoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.thumbnail = featureEducationThumbnailDto;
        this.createdAt = str;
        this.updatedAt = str2;
        this.title = str3;
        this.playtime = str4;
        this.url = str5;
        this.type = educationVideoTypeDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EducationVideoTypeDto.INSTANCE.serializer();
    }

    public static /* synthetic */ FeatureEducationVideoDto copy$default(FeatureEducationVideoDto featureEducationVideoDto, int i13, FeatureEducationThumbnailDto featureEducationThumbnailDto, String str, String str2, String str3, String str4, String str5, EducationVideoTypeDto educationVideoTypeDto, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationVideoDto.id;
        }
        if ((i14 & 2) != 0) {
            featureEducationThumbnailDto = featureEducationVideoDto.thumbnail;
        }
        if ((i14 & 4) != 0) {
            str = featureEducationVideoDto.createdAt;
        }
        if ((i14 & 8) != 0) {
            str2 = featureEducationVideoDto.updatedAt;
        }
        if ((i14 & 16) != 0) {
            str3 = featureEducationVideoDto.title;
        }
        if ((i14 & 32) != 0) {
            str4 = featureEducationVideoDto.playtime;
        }
        if ((i14 & 64) != 0) {
            str5 = featureEducationVideoDto.url;
        }
        if ((i14 & 128) != 0) {
            educationVideoTypeDto = featureEducationVideoDto.type;
        }
        String str6 = str5;
        EducationVideoTypeDto educationVideoTypeDto2 = educationVideoTypeDto;
        String str7 = str3;
        String str8 = str4;
        return featureEducationVideoDto.copy(i13, featureEducationThumbnailDto, str, str2, str7, str8, str6, educationVideoTypeDto2);
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("playtime")
    public static /* synthetic */ void getPlaytime$annotations() {
    }

    @InterfaceC37143h("thumbnail")
    public static /* synthetic */ void getThumbnail$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h(QueryParams.URL)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationVideoDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, FeatureEducationThumbnailDto$$serializer.INSTANCE, self.thumbnail);
        output.encodeStringElement(serialDesc, 2, self.createdAt);
        output.encodeStringElement(serialDesc, 3, self.updatedAt);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.playtime);
        output.encodeStringElement(serialDesc, 6, self.url);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeatureEducationThumbnailDto getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlaytime() {
        return this.playtime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EducationVideoTypeDto getType() {
        return this.type;
    }

    public final FeatureEducationVideoDto copy(int id4, FeatureEducationThumbnailDto thumbnail, String createdAt, String updatedAt, String title, String playtime, String url, EducationVideoTypeDto type) {
        AbstractC22676k.m65750j(thumbnail, "thumbnail");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        return new FeatureEducationVideoDto(id4, thumbnail, createdAt, updatedAt, title, playtime, url, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationVideoDto)) {
            return false;
        }
        FeatureEducationVideoDto featureEducationVideoDto = (FeatureEducationVideoDto) other;
        return this.id == featureEducationVideoDto.id && AbstractC22676k.m65745e(this.thumbnail, featureEducationVideoDto.thumbnail) && AbstractC22676k.m65745e(this.createdAt, featureEducationVideoDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationVideoDto.updatedAt) && AbstractC22676k.m65745e(this.title, featureEducationVideoDto.title) && AbstractC22676k.m65745e(this.playtime, featureEducationVideoDto.playtime) && AbstractC22676k.m65745e(this.url, featureEducationVideoDto.url) && this.type == featureEducationVideoDto.type;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPlaytime() {
        return this.playtime;
    }

    public final FeatureEducationThumbnailDto getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EducationVideoTypeDto getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.thumbnail.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.createdAt), 31, this.updatedAt);
        String str = this.title;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.playtime;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.url);
        EducationVideoTypeDto educationVideoTypeDto = this.type;
        return iM30450d2 + (educationVideoTypeDto != null ? educationVideoTypeDto.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        FeatureEducationThumbnailDto featureEducationThumbnailDto = this.thumbnail;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.title;
        String str4 = this.playtime;
        String str5 = this.url;
        EducationVideoTypeDto educationVideoTypeDto = this.type;
        StringBuilder sb4 = new StringBuilder("FeatureEducationVideoDto(id=");
        sb4.append(i13);
        sb4.append(", thumbnail=");
        sb4.append(featureEducationThumbnailDto);
        sb4.append(", createdAt=");
        AbstractC11266d.m30444B(sb4, str, ", updatedAt=", str2, ", title=");
        AbstractC11266d.m30444B(sb4, str3, ", playtime=", str4, ", url=");
        sb4.append(str5);
        sb4.append(", type=");
        sb4.append(educationVideoTypeDto);
        sb4.append(")");
        return sb4.toString();
    }

    public FeatureEducationVideoDto(int i13, FeatureEducationThumbnailDto thumbnail, String createdAt, String updatedAt, String str, String str2, String url, EducationVideoTypeDto educationVideoTypeDto) {
        AbstractC22676k.m65750j(thumbnail, "thumbnail");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        this.id = i13;
        this.thumbnail = thumbnail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = str;
        this.playtime = str2;
        this.url = url;
        this.type = educationVideoTypeDto;
    }
}
