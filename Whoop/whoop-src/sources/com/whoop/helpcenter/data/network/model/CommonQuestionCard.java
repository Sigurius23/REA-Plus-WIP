package com.whoop.helpcenter.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ^\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;", "", "", "title", "subTitle", "questionType", "leftIconType", "rightIconType", "articleUrl", "previewText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$help_center_release", "(Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubTitle", "getQuestionType", "getLeftIconType", "getRightIconType", "getArticleUrl", "getPreviewText", "Companion", "$serializer", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommonQuestionCard {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("article_url")
    private final String articleUrl;

    @SerializedName("left_icon_type")
    private final String leftIconType;

    @SerializedName("preview_text")
    private final String previewText;

    @SerializedName("question_type")
    private final String questionType;

    @SerializedName("right_icon_type")
    private final String rightIconType;

    @SerializedName("sub_title")
    private final String subTitle;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;", "serializer", "()Lwc3/c;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommonQuestionCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommonQuestionCard(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CommonQuestionCard$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subTitle = str2;
        this.questionType = str3;
        this.leftIconType = str4;
        this.rightIconType = str5;
        this.articleUrl = str6;
        this.previewText = str7;
    }

    public static /* synthetic */ CommonQuestionCard copy$default(CommonQuestionCard commonQuestionCard, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commonQuestionCard.title;
        }
        if ((i13 & 2) != 0) {
            str2 = commonQuestionCard.subTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = commonQuestionCard.questionType;
        }
        if ((i13 & 8) != 0) {
            str4 = commonQuestionCard.leftIconType;
        }
        if ((i13 & 16) != 0) {
            str5 = commonQuestionCard.rightIconType;
        }
        if ((i13 & 32) != 0) {
            str6 = commonQuestionCard.articleUrl;
        }
        if ((i13 & 64) != 0) {
            str7 = commonQuestionCard.previewText;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return commonQuestionCard.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$help_center_release(CommonQuestionCard self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subTitle);
        output.encodeStringElement(serialDesc, 2, self.questionType);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.leftIconType);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.rightIconType);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.articleUrl);
        output.encodeStringElement(serialDesc, 6, self.previewText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeftIconType() {
        return this.leftIconType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRightIconType() {
        return this.rightIconType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getArticleUrl() {
        return this.articleUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    public final CommonQuestionCard copy(String title, String subTitle, String questionType, String leftIconType, String rightIconType, String articleUrl, String previewText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(questionType, "questionType");
        AbstractC22676k.m65750j(previewText, "previewText");
        return new CommonQuestionCard(title, subTitle, questionType, leftIconType, rightIconType, articleUrl, previewText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonQuestionCard)) {
            return false;
        }
        CommonQuestionCard commonQuestionCard = (CommonQuestionCard) other;
        return AbstractC22676k.m65745e(this.title, commonQuestionCard.title) && AbstractC22676k.m65745e(this.subTitle, commonQuestionCard.subTitle) && AbstractC22676k.m65745e(this.questionType, commonQuestionCard.questionType) && AbstractC22676k.m65745e(this.leftIconType, commonQuestionCard.leftIconType) && AbstractC22676k.m65745e(this.rightIconType, commonQuestionCard.rightIconType) && AbstractC22676k.m65745e(this.articleUrl, commonQuestionCard.articleUrl) && AbstractC22676k.m65745e(this.previewText, commonQuestionCard.previewText);
    }

    public final String getArticleUrl() {
        return this.articleUrl;
    }

    public final String getLeftIconType() {
        return this.leftIconType;
    }

    public final String getPreviewText() {
        return this.previewText;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    public final String getRightIconType() {
        return this.rightIconType;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.questionType);
        String str2 = this.leftIconType;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightIconType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.articleUrl;
        return this.previewText.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        String str3 = this.questionType;
        String str4 = this.leftIconType;
        String str5 = this.rightIconType;
        String str6 = this.articleUrl;
        String str7 = this.previewText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CommonQuestionCard(title=", str, ", subTitle=", str2, ", questionType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", leftIconType=", str4, ", rightIconType=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", articleUrl=", str6, ", previewText=");
        return AbstractC25012a.m73376i(str7, ")", sbM32001t);
    }

    public CommonQuestionCard(String title, String str, String questionType, String str2, String str3, String str4, String previewText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(questionType, "questionType");
        AbstractC22676k.m65750j(previewText, "previewText");
        this.title = title;
        this.subTitle = str;
        this.questionType = questionType;
        this.leftIconType = str2;
        this.rightIconType = str3;
        this.articleUrl = str4;
        this.previewText = previewText;
    }
}
