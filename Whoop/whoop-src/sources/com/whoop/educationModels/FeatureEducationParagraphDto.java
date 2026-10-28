package com.whoop.educationModels;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
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
import ve.C35916a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bw\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010\u001dR \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u001dR \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010\u001dR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010!R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010N\u0012\u0004\bP\u0010;\u001a\u0004\bO\u0010&¨\u0006S"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "", "", "paragraphId", "", "Lcom/whoop/educationModels/SentenceDto;", "sentences", "", "createdAt", "updatedAt", "alignment", "Lcom/whoop/educationModels/InsetDto;", "inset", "screenId", "Lcom/whoop/educationModels/ImageDto;", "image", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "video", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/InsetDto;ILcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/InsetDto;ILcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/whoop/educationModels/InsetDto;", "component7", "component8", "()Lcom/whoop/educationModels/ImageDto;", "component9", "()Lcom/whoop/educationModels/FeatureEducationVideoDto;", "copy", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/InsetDto;ILcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;)Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationParagraphDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getParagraphId", "getParagraphId$annotations", "()V", "Ljava/util/List;", "getSentences", "getSentences$annotations", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getAlignment", "getAlignment$annotations", "Lcom/whoop/educationModels/InsetDto;", "getInset", "getInset$annotations", "getScreenId", "getScreenId$annotations", "Lcom/whoop/educationModels/ImageDto;", "getImage", "getImage$annotations", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "getVideo", "getVideo$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationParagraphDto {

    @SerializedName("alignment")
    private final String alignment;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("image")
    private final ImageDto image;

    @SerializedName("inset")
    private final InsetDto inset;

    @SerializedName("id")
    private final int paragraphId;

    @SerializedName("screen_id")
    private final int screenId;

    @SerializedName("sentences")
    private final List<SentenceDto> sentences;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("video")
    private final FeatureEducationVideoDto video;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35916a(6)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationParagraphDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationParagraphDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeatureEducationParagraphDto(int i13, int i14, List list, String str, String str2, String str3, InsetDto insetDto, int i15, ImageDto imageDto, FeatureEducationVideoDto featureEducationVideoDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, FeatureEducationParagraphDto$$serializer.INSTANCE.getDescriptor());
        }
        this.paragraphId = i14;
        this.sentences = list;
        this.createdAt = str;
        this.updatedAt = str2;
        this.alignment = str3;
        this.inset = insetDto;
        this.screenId = i15;
        this.image = imageDto;
        this.video = featureEducationVideoDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SentenceDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureEducationParagraphDto copy$default(FeatureEducationParagraphDto featureEducationParagraphDto, int i13, List list, String str, String str2, String str3, InsetDto insetDto, int i14, ImageDto imageDto, FeatureEducationVideoDto featureEducationVideoDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = featureEducationParagraphDto.paragraphId;
        }
        if ((i15 & 2) != 0) {
            list = featureEducationParagraphDto.sentences;
        }
        if ((i15 & 4) != 0) {
            str = featureEducationParagraphDto.createdAt;
        }
        if ((i15 & 8) != 0) {
            str2 = featureEducationParagraphDto.updatedAt;
        }
        if ((i15 & 16) != 0) {
            str3 = featureEducationParagraphDto.alignment;
        }
        if ((i15 & 32) != 0) {
            insetDto = featureEducationParagraphDto.inset;
        }
        if ((i15 & 64) != 0) {
            i14 = featureEducationParagraphDto.screenId;
        }
        if ((i15 & 128) != 0) {
            imageDto = featureEducationParagraphDto.image;
        }
        if ((i15 & 256) != 0) {
            featureEducationVideoDto = featureEducationParagraphDto.video;
        }
        ImageDto imageDto2 = imageDto;
        FeatureEducationVideoDto featureEducationVideoDto2 = featureEducationVideoDto;
        InsetDto insetDto2 = insetDto;
        int i16 = i14;
        String str4 = str3;
        String str5 = str;
        return featureEducationParagraphDto.copy(i13, list, str5, str2, str4, insetDto2, i16, imageDto2, featureEducationVideoDto2);
    }

    @InterfaceC37143h("alignment")
    public static /* synthetic */ void getAlignment$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @InterfaceC37143h("inset")
    public static /* synthetic */ void getInset$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getParagraphId$annotations() {
    }

    @InterfaceC37143h("screen_id")
    public static /* synthetic */ void getScreenId$annotations() {
    }

    @InterfaceC37143h("sentences")
    public static /* synthetic */ void getSentences$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h("video")
    public static /* synthetic */ void getVideo$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationParagraphDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.paragraphId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sentences);
        output.encodeStringElement(serialDesc, 2, self.createdAt);
        output.encodeStringElement(serialDesc, 3, self.updatedAt);
        output.encodeStringElement(serialDesc, 4, self.alignment);
        output.encodeSerializableElement(serialDesc, 5, InsetDto$$serializer.INSTANCE, self.inset);
        output.encodeIntElement(serialDesc, 6, self.screenId);
        output.encodeNullableSerializableElement(serialDesc, 7, ImageDto$$serializer.INSTANCE, self.image);
        output.encodeNullableSerializableElement(serialDesc, 8, FeatureEducationVideoDto$$serializer.INSTANCE, self.video);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getParagraphId() {
        return this.paragraphId;
    }

    public final List<SentenceDto> component2() {
        return this.sentences;
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
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InsetDto getInset() {
        return this.inset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FeatureEducationVideoDto getVideo() {
        return this.video;
    }

    public final FeatureEducationParagraphDto copy(int paragraphId, List<SentenceDto> sentences, String createdAt, String updatedAt, String alignment, InsetDto inset, int screenId, ImageDto image, FeatureEducationVideoDto video) {
        AbstractC22676k.m65750j(sentences, "sentences");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(inset, "inset");
        return new FeatureEducationParagraphDto(paragraphId, sentences, createdAt, updatedAt, alignment, inset, screenId, image, video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationParagraphDto)) {
            return false;
        }
        FeatureEducationParagraphDto featureEducationParagraphDto = (FeatureEducationParagraphDto) other;
        return this.paragraphId == featureEducationParagraphDto.paragraphId && AbstractC22676k.m65745e(this.sentences, featureEducationParagraphDto.sentences) && AbstractC22676k.m65745e(this.createdAt, featureEducationParagraphDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationParagraphDto.updatedAt) && AbstractC22676k.m65745e(this.alignment, featureEducationParagraphDto.alignment) && AbstractC22676k.m65745e(this.inset, featureEducationParagraphDto.inset) && this.screenId == featureEducationParagraphDto.screenId && AbstractC22676k.m65745e(this.image, featureEducationParagraphDto.image) && AbstractC22676k.m65745e(this.video, featureEducationParagraphDto.video);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final InsetDto getInset() {
        return this.inset;
    }

    public final int getParagraphId() {
        return this.paragraphId;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final List<SentenceDto> getSentences() {
        return this.sentences;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final FeatureEducationVideoDto getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.screenId, (this.inset.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(Integer.hashCode(this.paragraphId) * 31, 31, this.sentences), 31, this.createdAt), 31, this.updatedAt), 31, this.alignment)) * 31, 31);
        ImageDto imageDto = this.image;
        int iHashCode = (iM30448b + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
        FeatureEducationVideoDto featureEducationVideoDto = this.video;
        return iHashCode + (featureEducationVideoDto != null ? featureEducationVideoDto.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.paragraphId;
        List<SentenceDto> list = this.sentences;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.alignment;
        InsetDto insetDto = this.inset;
        int i14 = this.screenId;
        ImageDto imageDto = this.image;
        FeatureEducationVideoDto featureEducationVideoDto = this.video;
        StringBuilder sb4 = new StringBuilder("FeatureEducationParagraphDto(paragraphId=");
        sb4.append(i13);
        sb4.append(", sentences=");
        sb4.append(list);
        sb4.append(", createdAt=");
        AbstractC11266d.m30444B(sb4, str, ", updatedAt=", str2, ", alignment=");
        sb4.append(str3);
        sb4.append(", inset=");
        sb4.append(insetDto);
        sb4.append(", screenId=");
        sb4.append(i14);
        sb4.append(", image=");
        sb4.append(imageDto);
        sb4.append(", video=");
        sb4.append(featureEducationVideoDto);
        sb4.append(")");
        return sb4.toString();
    }

    public FeatureEducationParagraphDto(int i13, List<SentenceDto> sentences, String createdAt, String updatedAt, String alignment, InsetDto inset, int i14, ImageDto imageDto, FeatureEducationVideoDto featureEducationVideoDto) {
        AbstractC22676k.m65750j(sentences, "sentences");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(inset, "inset");
        this.paragraphId = i13;
        this.sentences = sentences;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.alignment = alignment;
        this.inset = inset;
        this.screenId = i14;
        this.image = imageDto;
        this.video = featureEducationVideoDto;
    }
}
