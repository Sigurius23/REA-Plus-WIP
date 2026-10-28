package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "", "", "color", "gradient", "Lcom/whoop/educationModels/ImageDto;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/ImageDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/ImageDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationBackgroundDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/educationModels/ImageDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/ImageDto;)Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getColor$annotations", "()V", "getGradient", "getGradient$annotations", "Lcom/whoop/educationModels/ImageDto;", "getImage", "getImage$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationBackgroundDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("color")
    private final String color;

    @SerializedName("gradient")
    private final String gradient;

    @SerializedName("image")
    private final ImageDto image;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationBackgroundDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationBackgroundDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeatureEducationBackgroundDto(int i13, String str, String str2, ImageDto imageDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FeatureEducationBackgroundDto$$serializer.INSTANCE.getDescriptor());
        }
        this.color = str;
        this.gradient = str2;
        this.image = imageDto;
    }

    public static /* synthetic */ FeatureEducationBackgroundDto copy$default(FeatureEducationBackgroundDto featureEducationBackgroundDto, String str, String str2, ImageDto imageDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = featureEducationBackgroundDto.color;
        }
        if ((i13 & 2) != 0) {
            str2 = featureEducationBackgroundDto.gradient;
        }
        if ((i13 & 4) != 0) {
            imageDto = featureEducationBackgroundDto.image;
        }
        return featureEducationBackgroundDto.copy(str, str2, imageDto);
    }

    @InterfaceC37143h("color")
    public static /* synthetic */ void getColor$annotations() {
    }

    @InterfaceC37143h("gradient")
    public static /* synthetic */ void getGradient$annotations() {
    }

    @InterfaceC37143h("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationBackgroundDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.color);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.gradient);
        output.encodeNullableSerializableElement(serialDesc, 2, ImageDto$$serializer.INSTANCE, self.image);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGradient() {
        return this.gradient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    public final FeatureEducationBackgroundDto copy(String color, String gradient, ImageDto image) {
        return new FeatureEducationBackgroundDto(color, gradient, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationBackgroundDto)) {
            return false;
        }
        FeatureEducationBackgroundDto featureEducationBackgroundDto = (FeatureEducationBackgroundDto) other;
        return AbstractC22676k.m65745e(this.color, featureEducationBackgroundDto.color) && AbstractC22676k.m65745e(this.gradient, featureEducationBackgroundDto.gradient) && AbstractC22676k.m65745e(this.image, featureEducationBackgroundDto.image);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getGradient() {
        return this.gradient;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gradient;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageDto imageDto = this.image;
        return iHashCode2 + (imageDto != null ? imageDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.color;
        String str2 = this.gradient;
        ImageDto imageDto = this.image;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FeatureEducationBackgroundDto(color=", str, ", gradient=", str2, ", image=");
        sbM32001t.append(imageDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public FeatureEducationBackgroundDto(String str, String str2, ImageDto imageDto) {
        this.color = str;
        this.gradient = str2;
        this.image = imageDto;
    }
}
