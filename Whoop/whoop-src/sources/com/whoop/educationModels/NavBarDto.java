package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00060"}, m65681d2 = {"Lcom/whoop/educationModels/NavBarDto;", "", "", "title", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "leftButton", "rightButton", "<init>", "(Ljava/lang/String;Lcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/FeatureEducationButtonDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/FeatureEducationButtonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/NavBarDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/educationModels/FeatureEducationButtonDto;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/FeatureEducationButtonDto;)Lcom/whoop/educationModels/NavBarDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "getLeftButton", "getLeftButton$annotations", "getRightButton", "getRightButton$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavBarDto {

    @SerializedName("leftButton")
    private final FeatureEducationButtonDto leftButton;

    @SerializedName("rightButton")
    private final FeatureEducationButtonDto rightButton;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/NavBarDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/NavBarDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavBarDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavBarDto(int i13, String str, FeatureEducationButtonDto featureEducationButtonDto, FeatureEducationButtonDto featureEducationButtonDto2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, NavBarDto$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.leftButton = featureEducationButtonDto;
        this.rightButton = featureEducationButtonDto2;
    }

    public static /* synthetic */ NavBarDto copy$default(NavBarDto navBarDto, String str, FeatureEducationButtonDto featureEducationButtonDto, FeatureEducationButtonDto featureEducationButtonDto2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = navBarDto.title;
        }
        if ((i13 & 2) != 0) {
            featureEducationButtonDto = navBarDto.leftButton;
        }
        if ((i13 & 4) != 0) {
            featureEducationButtonDto2 = navBarDto.rightButton;
        }
        return navBarDto.copy(str, featureEducationButtonDto, featureEducationButtonDto2);
    }

    @InterfaceC37143h("left_button")
    public static /* synthetic */ void getLeftButton$annotations() {
    }

    @InterfaceC37143h("right_button")
    public static /* synthetic */ void getRightButton$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(NavBarDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        FeatureEducationButtonDto$$serializer featureEducationButtonDto$$serializer = FeatureEducationButtonDto$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, featureEducationButtonDto$$serializer, self.leftButton);
        output.encodeNullableSerializableElement(serialDesc, 2, featureEducationButtonDto$$serializer, self.rightButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeatureEducationButtonDto getLeftButton() {
        return this.leftButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FeatureEducationButtonDto getRightButton() {
        return this.rightButton;
    }

    public final NavBarDto copy(String title, FeatureEducationButtonDto leftButton, FeatureEducationButtonDto rightButton) {
        return new NavBarDto(title, leftButton, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarDto)) {
            return false;
        }
        NavBarDto navBarDto = (NavBarDto) other;
        return AbstractC22676k.m65745e(this.title, navBarDto.title) && AbstractC22676k.m65745e(this.leftButton, navBarDto.leftButton) && AbstractC22676k.m65745e(this.rightButton, navBarDto.rightButton);
    }

    public final FeatureEducationButtonDto getLeftButton() {
        return this.leftButton;
    }

    public final FeatureEducationButtonDto getRightButton() {
        return this.rightButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FeatureEducationButtonDto featureEducationButtonDto = this.leftButton;
        int iHashCode2 = (iHashCode + (featureEducationButtonDto == null ? 0 : featureEducationButtonDto.hashCode())) * 31;
        FeatureEducationButtonDto featureEducationButtonDto2 = this.rightButton;
        return iHashCode2 + (featureEducationButtonDto2 != null ? featureEducationButtonDto2.hashCode() : 0);
    }

    public String toString() {
        return "NavBarDto(title=" + this.title + ", leftButton=" + this.leftButton + ", rightButton=" + this.rightButton + ")";
    }

    public NavBarDto(String str, FeatureEducationButtonDto featureEducationButtonDto, FeatureEducationButtonDto featureEducationButtonDto2) {
        this.title = str;
        this.leftButton = featureEducationButtonDto;
        this.rightButton = featureEducationButtonDto2;
    }
}
