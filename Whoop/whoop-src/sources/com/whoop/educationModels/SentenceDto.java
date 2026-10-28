package com.whoop.educationModels;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u001bR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010\u001bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010\u001bR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\bI\u00108\u001a\u0004\bH\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010J\u0012\u0004\bL\u00108\u001a\u0004\bK\u0010#¨\u0006O"}, m65681d2 = {"Lcom/whoop/educationModels/SentenceDto;", "", "", "sentenceId", "Lcom/whoop/educationModels/ScreenTextStyleDto;", "style", "", "createdAt", "updatedAt", "text", "paragraphId", "Lcom/whoop/educationModels/Divider;", "divider", "clickableTextUrl", "Lcom/whoop/educationModels/InlineIcon;", "inlineIcon", "<init>", "(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Lcom/whoop/educationModels/ScreenTextStyleDto;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/whoop/educationModels/Divider;", "component8", "component9", "()Lcom/whoop/educationModels/InlineIcon;", "copy", "(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/educationModels/SentenceDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/SentenceDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getSentenceId", "getSentenceId$annotations", "()V", "Lcom/whoop/educationModels/ScreenTextStyleDto;", "getStyle", "getStyle$annotations", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getText", "getText$annotations", "getParagraphId", "getParagraphId$annotations", "Lcom/whoop/educationModels/Divider;", "getDivider", "getDivider$annotations", "getClickableTextUrl", "getClickableTextUrl$annotations", "Lcom/whoop/educationModels/InlineIcon;", "getInlineIcon", "getInlineIcon$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SentenceDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("clickable_text_url")
    private final String clickableTextUrl;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("divider")
    private final Divider divider;

    @SerializedName("inline_icon")
    private final InlineIcon inlineIcon;

    @SerializedName("paragraph_id")
    private final int paragraphId;

    @SerializedName("id")
    private final int sentenceId;

    @SerializedName("text_style")
    private final ScreenTextStyleDto style;

    @SerializedName("text")
    private final String text;

    @SerializedName("updated_at")
    private final String updatedAt;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/SentenceDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/SentenceDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SentenceDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SentenceDto(int i13, int i14, ScreenTextStyleDto screenTextStyleDto, String str, String str2, String str3, int i15, Divider divider, String str4, InlineIcon inlineIcon, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, SentenceDto$$serializer.INSTANCE.getDescriptor());
        }
        this.sentenceId = i14;
        this.style = screenTextStyleDto;
        this.createdAt = str;
        this.updatedAt = str2;
        this.text = str3;
        this.paragraphId = i15;
        this.divider = divider;
        this.clickableTextUrl = str4;
        this.inlineIcon = inlineIcon;
    }

    public static /* synthetic */ SentenceDto copy$default(SentenceDto sentenceDto, int i13, ScreenTextStyleDto screenTextStyleDto, String str, String str2, String str3, int i14, Divider divider, String str4, InlineIcon inlineIcon, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = sentenceDto.sentenceId;
        }
        if ((i15 & 2) != 0) {
            screenTextStyleDto = sentenceDto.style;
        }
        if ((i15 & 4) != 0) {
            str = sentenceDto.createdAt;
        }
        if ((i15 & 8) != 0) {
            str2 = sentenceDto.updatedAt;
        }
        if ((i15 & 16) != 0) {
            str3 = sentenceDto.text;
        }
        if ((i15 & 32) != 0) {
            i14 = sentenceDto.paragraphId;
        }
        if ((i15 & 64) != 0) {
            divider = sentenceDto.divider;
        }
        if ((i15 & 128) != 0) {
            str4 = sentenceDto.clickableTextUrl;
        }
        if ((i15 & 256) != 0) {
            inlineIcon = sentenceDto.inlineIcon;
        }
        String str5 = str4;
        InlineIcon inlineIcon2 = inlineIcon;
        int i16 = i14;
        Divider divider2 = divider;
        String str6 = str3;
        String str7 = str;
        return sentenceDto.copy(i13, screenTextStyleDto, str7, str2, str6, i16, divider2, str5, inlineIcon2);
    }

    @InterfaceC37143h("clickable_text_url")
    public static /* synthetic */ void getClickableTextUrl$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("divider")
    public static /* synthetic */ void getDivider$annotations() {
    }

    @InterfaceC37143h("inline_icon")
    public static /* synthetic */ void getInlineIcon$annotations() {
    }

    @InterfaceC37143h("paragraph_id")
    public static /* synthetic */ void getParagraphId$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getSentenceId$annotations() {
    }

    @InterfaceC37143h("text_style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @InterfaceC37143h("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(SentenceDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.sentenceId);
        output.encodeSerializableElement(serialDesc, 1, ScreenTextStyleDto$$serializer.INSTANCE, self.style);
        output.encodeStringElement(serialDesc, 2, self.createdAt);
        output.encodeStringElement(serialDesc, 3, self.updatedAt);
        output.encodeStringElement(serialDesc, 4, self.text);
        output.encodeIntElement(serialDesc, 5, self.paragraphId);
        output.encodeNullableSerializableElement(serialDesc, 6, Divider$$serializer.INSTANCE, self.divider);
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.clickableTextUrl);
        output.encodeNullableSerializableElement(serialDesc, 8, InlineIcon$$serializer.INSTANCE, self.inlineIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSentenceId() {
        return this.sentenceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScreenTextStyleDto getStyle() {
        return this.style;
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
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getParagraphId() {
        return this.paragraphId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Divider getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getClickableTextUrl() {
        return this.clickableTextUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final InlineIcon getInlineIcon() {
        return this.inlineIcon;
    }

    public final SentenceDto copy(int sentenceId, ScreenTextStyleDto style, String createdAt, String updatedAt, String text, int paragraphId, Divider divider, String clickableTextUrl, InlineIcon inlineIcon) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(text, "text");
        return new SentenceDto(sentenceId, style, createdAt, updatedAt, text, paragraphId, divider, clickableTextUrl, inlineIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentenceDto)) {
            return false;
        }
        SentenceDto sentenceDto = (SentenceDto) other;
        return this.sentenceId == sentenceDto.sentenceId && AbstractC22676k.m65745e(this.style, sentenceDto.style) && AbstractC22676k.m65745e(this.createdAt, sentenceDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, sentenceDto.updatedAt) && AbstractC22676k.m65745e(this.text, sentenceDto.text) && this.paragraphId == sentenceDto.paragraphId && AbstractC22676k.m65745e(this.divider, sentenceDto.divider) && AbstractC22676k.m65745e(this.clickableTextUrl, sentenceDto.clickableTextUrl) && AbstractC22676k.m65745e(this.inlineIcon, sentenceDto.inlineIcon);
    }

    public final String getClickableTextUrl() {
        return this.clickableTextUrl;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Divider getDivider() {
        return this.divider;
    }

    public final InlineIcon getInlineIcon() {
        return this.inlineIcon;
    }

    public final int getParagraphId() {
        return this.paragraphId;
    }

    public final int getSentenceId() {
        return this.sentenceId;
    }

    public final ScreenTextStyleDto getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.paragraphId, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.style.hashCode() + (Integer.hashCode(this.sentenceId) * 31)) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.text), 31);
        Divider divider = this.divider;
        int iHashCode = (iM30448b + (divider == null ? 0 : divider.hashCode())) * 31;
        String str = this.clickableTextUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InlineIcon inlineIcon = this.inlineIcon;
        return iHashCode2 + (inlineIcon != null ? inlineIcon.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.sentenceId;
        ScreenTextStyleDto screenTextStyleDto = this.style;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.text;
        int i14 = this.paragraphId;
        Divider divider = this.divider;
        String str4 = this.clickableTextUrl;
        InlineIcon inlineIcon = this.inlineIcon;
        StringBuilder sb4 = new StringBuilder("SentenceDto(sentenceId=");
        sb4.append(i13);
        sb4.append(", style=");
        sb4.append(screenTextStyleDto);
        sb4.append(", createdAt=");
        AbstractC11266d.m30444B(sb4, str, ", updatedAt=", str2, ", text=");
        AbstractC11266d.m30470x(i14, str3, ", paragraphId=", ", divider=", sb4);
        sb4.append(divider);
        sb4.append(", clickableTextUrl=");
        sb4.append(str4);
        sb4.append(", inlineIcon=");
        sb4.append(inlineIcon);
        sb4.append(")");
        return sb4.toString();
    }

    public SentenceDto(int i13, ScreenTextStyleDto style, String createdAt, String updatedAt, String text, int i14, Divider divider, String str, InlineIcon inlineIcon) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(text, "text");
        this.sentenceId = i13;
        this.style = style;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.text = text;
        this.paragraphId = i14;
        this.divider = divider;
        this.clickableTextUrl = str;
        this.inlineIcon = inlineIcon;
    }
}
