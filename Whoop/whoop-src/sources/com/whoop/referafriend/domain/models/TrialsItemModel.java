package com.whoop.referafriend.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u0019¨\u00064"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/TrialsItemModel;", "", "", "code", "shareCtaText", "sharedText", "shareMessage", "bottomCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/TrialsItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/TrialsItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getShareCtaText", "getShareCtaText$annotations", "()V", "getSharedText", "getSharedText$annotations", "getShareMessage", "getShareMessage$annotations", "getBottomCtaText", "getBottomCtaText$annotations", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrialsItemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("bottom_cta_text")
    private final String bottomCtaText;
    private final String code;

    @SerializedName("share_cta_text")
    private final String shareCtaText;

    @SerializedName("share_message")
    private final String shareMessage;

    @SerializedName("shared_text")
    private final String sharedText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/TrialsItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/TrialsItemModel;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrialsItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrialsItemModel(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, TrialsItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.shareCtaText = str2;
        this.sharedText = str3;
        this.shareMessage = str4;
        this.bottomCtaText = str5;
    }

    public static /* synthetic */ TrialsItemModel copy$default(TrialsItemModel trialsItemModel, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = trialsItemModel.code;
        }
        if ((i13 & 2) != 0) {
            str2 = trialsItemModel.shareCtaText;
        }
        if ((i13 & 4) != 0) {
            str3 = trialsItemModel.sharedText;
        }
        if ((i13 & 8) != 0) {
            str4 = trialsItemModel.shareMessage;
        }
        if ((i13 & 16) != 0) {
            str5 = trialsItemModel.bottomCtaText;
        }
        String str6 = str5;
        String str7 = str3;
        return trialsItemModel.copy(str, str2, str7, str4, str6);
    }

    @InterfaceC37143h("bottom_cta_text")
    public static /* synthetic */ void getBottomCtaText$annotations() {
    }

    @InterfaceC37143h("share_cta_text")
    public static /* synthetic */ void getShareCtaText$annotations() {
    }

    @InterfaceC37143h("share_message")
    public static /* synthetic */ void getShareMessage$annotations() {
    }

    @InterfaceC37143h("shared_text")
    public static /* synthetic */ void getSharedText$annotations() {
    }

    public static final /* synthetic */ void write$Self$refer_a_friend_release(TrialsItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.code);
        output.encodeStringElement(serialDesc, 1, self.shareCtaText);
        output.encodeStringElement(serialDesc, 2, self.sharedText);
        output.encodeStringElement(serialDesc, 3, self.shareMessage);
        output.encodeStringElement(serialDesc, 4, self.bottomCtaText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareCtaText() {
        return this.shareCtaText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSharedText() {
        return this.sharedText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBottomCtaText() {
        return this.bottomCtaText;
    }

    public final TrialsItemModel copy(String code, String shareCtaText, String sharedText, String shareMessage, String bottomCtaText) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(shareCtaText, "shareCtaText");
        AbstractC22676k.m65750j(sharedText, "sharedText");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(bottomCtaText, "bottomCtaText");
        return new TrialsItemModel(code, shareCtaText, sharedText, shareMessage, bottomCtaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialsItemModel)) {
            return false;
        }
        TrialsItemModel trialsItemModel = (TrialsItemModel) other;
        return AbstractC22676k.m65745e(this.code, trialsItemModel.code) && AbstractC22676k.m65745e(this.shareCtaText, trialsItemModel.shareCtaText) && AbstractC22676k.m65745e(this.sharedText, trialsItemModel.sharedText) && AbstractC22676k.m65745e(this.shareMessage, trialsItemModel.shareMessage) && AbstractC22676k.m65745e(this.bottomCtaText, trialsItemModel.bottomCtaText);
    }

    public final String getBottomCtaText() {
        return this.bottomCtaText;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getShareCtaText() {
        return this.shareCtaText;
    }

    public final String getShareMessage() {
        return this.shareMessage;
    }

    public final String getSharedText() {
        return this.sharedText;
    }

    public int hashCode() {
        return this.bottomCtaText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.shareCtaText), 31, this.sharedText), 31, this.shareMessage);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.shareCtaText;
        String str3 = this.sharedText;
        String str4 = this.shareMessage;
        String str5 = this.bottomCtaText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrialsItemModel(code=", str, ", shareCtaText=", str2, ", sharedText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", shareMessage=", str4, ", bottomCtaText=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public TrialsItemModel(String code, String shareCtaText, String sharedText, String shareMessage, String bottomCtaText) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(shareCtaText, "shareCtaText");
        AbstractC22676k.m65750j(sharedText, "sharedText");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(bottomCtaText, "bottomCtaText");
        this.code = code;
        this.shareCtaText = shareCtaText;
        this.sharedText = sharedText;
        this.shareMessage = shareMessage;
        this.bottomCtaText = bottomCtaText;
    }
}
