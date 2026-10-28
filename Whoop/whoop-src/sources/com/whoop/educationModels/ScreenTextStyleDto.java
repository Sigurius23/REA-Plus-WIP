package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001bR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/educationModels/ScreenTextStyleDto;", "", "", "styleId", "", "createdAt", "updatedAt", "styleName", "color", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/ScreenTextStyleDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/educationModels/ScreenTextStyleDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStyleId", "getStyleId$annotations", "()V", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getStyleName", "getStyleName$annotations", "getColor", "getColor$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScreenTextStyleDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("color")
    private final String color;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("id")
    private final int styleId;

    @SerializedName("name")
    private final String styleName;

    @SerializedName("updated_at")
    private final String updatedAt;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/ScreenTextStyleDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/ScreenTextStyleDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScreenTextStyleDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreenTextStyleDto(int i13, int i14, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ScreenTextStyleDto$$serializer.INSTANCE.getDescriptor());
        }
        this.styleId = i14;
        this.createdAt = str;
        this.updatedAt = str2;
        this.styleName = str3;
        this.color = str4;
    }

    public static /* synthetic */ ScreenTextStyleDto copy$default(ScreenTextStyleDto screenTextStyleDto, int i13, String str, String str2, String str3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = screenTextStyleDto.styleId;
        }
        if ((i14 & 2) != 0) {
            str = screenTextStyleDto.createdAt;
        }
        if ((i14 & 4) != 0) {
            str2 = screenTextStyleDto.updatedAt;
        }
        if ((i14 & 8) != 0) {
            str3 = screenTextStyleDto.styleName;
        }
        if ((i14 & 16) != 0) {
            str4 = screenTextStyleDto.color;
        }
        String str5 = str4;
        String str6 = str2;
        return screenTextStyleDto.copy(i13, str, str6, str3, str5);
    }

    @InterfaceC37143h("color")
    public static /* synthetic */ void getColor$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getStyleId$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getStyleName$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(ScreenTextStyleDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.styleId);
        output.encodeStringElement(serialDesc, 1, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.updatedAt);
        output.encodeStringElement(serialDesc, 3, self.styleName);
        output.encodeStringElement(serialDesc, 4, self.color);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStyleId() {
        return this.styleId;
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
    public final String getStyleName() {
        return this.styleName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final ScreenTextStyleDto copy(int styleId, String createdAt, String updatedAt, String styleName, String color) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(styleName, "styleName");
        AbstractC22676k.m65750j(color, "color");
        return new ScreenTextStyleDto(styleId, createdAt, updatedAt, styleName, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenTextStyleDto)) {
            return false;
        }
        ScreenTextStyleDto screenTextStyleDto = (ScreenTextStyleDto) other;
        return this.styleId == screenTextStyleDto.styleId && AbstractC22676k.m65745e(this.createdAt, screenTextStyleDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, screenTextStyleDto.updatedAt) && AbstractC22676k.m65745e(this.styleName, screenTextStyleDto.styleName) && AbstractC22676k.m65745e(this.color, screenTextStyleDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.styleId) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.styleName);
    }

    public String toString() {
        int i13 = this.styleId;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.styleName;
        String str4 = this.color;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ScreenTextStyleDto(styleId=", ", createdAt=", str, ", updatedAt=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", styleName=", str3, ", color=");
        return AbstractC25012a.m73376i(str4, ")", sbM53373n);
    }

    public ScreenTextStyleDto(int i13, String createdAt, String updatedAt, String styleName, String color) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(styleName, "styleName");
        AbstractC22676k.m65750j(color, "color");
        this.styleId = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.styleName = styleName;
        this.color = color;
    }
}
