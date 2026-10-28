package com.whoop.referafriend.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001dR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u001a¨\u00068"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/PromotionCard;", "", "", "title", "body", "", "referralsCompleted", "referralsNeeded", "referralProgressText", "daysLeftText", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/PromotionCard;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/PromotionCard;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBody", "I", "getReferralsCompleted", "getReferralsCompleted$annotations", "()V", "getReferralsNeeded", "getReferralsNeeded$annotations", "getReferralProgressText", "getReferralProgressText$annotations", "getDaysLeftText", "getDaysLeftText$annotations", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PromotionCard {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;

    @SerializedName("days_left_text")
    private final String daysLeftText;

    @SerializedName("referral_progress_text")
    private final String referralProgressText;

    @SerializedName("referrals_completed")
    private final int referralsCompleted;

    @SerializedName("referrals_needed")
    private final int referralsNeeded;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/PromotionCard;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PromotionCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PromotionCard(int i13, String str, String str2, int i14, int i15, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PromotionCard$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.referralsCompleted = i14;
        this.referralsNeeded = i15;
        this.referralProgressText = str3;
        this.daysLeftText = str4;
    }

    public static /* synthetic */ PromotionCard copy$default(PromotionCard promotionCard, String str, String str2, int i13, int i14, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = promotionCard.title;
        }
        if ((i15 & 2) != 0) {
            str2 = promotionCard.body;
        }
        if ((i15 & 4) != 0) {
            i13 = promotionCard.referralsCompleted;
        }
        if ((i15 & 8) != 0) {
            i14 = promotionCard.referralsNeeded;
        }
        if ((i15 & 16) != 0) {
            str3 = promotionCard.referralProgressText;
        }
        if ((i15 & 32) != 0) {
            str4 = promotionCard.daysLeftText;
        }
        String str5 = str3;
        String str6 = str4;
        return promotionCard.copy(str, str2, i13, i14, str5, str6);
    }

    @InterfaceC37143h("days_left_text")
    public static /* synthetic */ void getDaysLeftText$annotations() {
    }

    @InterfaceC37143h("referral_progress_text")
    public static /* synthetic */ void getReferralProgressText$annotations() {
    }

    @InterfaceC37143h("referrals_completed")
    public static /* synthetic */ void getReferralsCompleted$annotations() {
    }

    @InterfaceC37143h("referrals_needed")
    public static /* synthetic */ void getReferralsNeeded$annotations() {
    }

    public static final /* synthetic */ void write$Self$refer_a_friend_release(PromotionCard self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.body);
        output.encodeIntElement(serialDesc, 2, self.referralsCompleted);
        output.encodeIntElement(serialDesc, 3, self.referralsNeeded);
        output.encodeStringElement(serialDesc, 4, self.referralProgressText);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.daysLeftText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getReferralsCompleted() {
        return this.referralsCompleted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getReferralsNeeded() {
        return this.referralsNeeded;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReferralProgressText() {
        return this.referralProgressText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDaysLeftText() {
        return this.daysLeftText;
    }

    public final PromotionCard copy(String title, String body, int referralsCompleted, int referralsNeeded, String referralProgressText, String daysLeftText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(referralProgressText, "referralProgressText");
        return new PromotionCard(title, body, referralsCompleted, referralsNeeded, referralProgressText, daysLeftText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionCard)) {
            return false;
        }
        PromotionCard promotionCard = (PromotionCard) other;
        return AbstractC22676k.m65745e(this.title, promotionCard.title) && AbstractC22676k.m65745e(this.body, promotionCard.body) && this.referralsCompleted == promotionCard.referralsCompleted && this.referralsNeeded == promotionCard.referralsNeeded && AbstractC22676k.m65745e(this.referralProgressText, promotionCard.referralProgressText) && AbstractC22676k.m65745e(this.daysLeftText, promotionCard.daysLeftText);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getDaysLeftText() {
        return this.daysLeftText;
    }

    public final String getReferralProgressText() {
        return this.referralProgressText;
    }

    public final int getReferralsCompleted() {
        return this.referralsCompleted;
    }

    public final int getReferralsNeeded() {
        return this.referralsNeeded;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.referralsNeeded, AbstractC11266d.m30448b(this.referralsCompleted, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31), 31), 31, this.referralProgressText);
        String str = this.daysLeftText;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        int i13 = this.referralsCompleted;
        int i14 = this.referralsNeeded;
        String str3 = this.referralProgressText;
        String str4 = this.daysLeftText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PromotionCard(title=", str, ", body=", str2, ", referralsCompleted=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", referralsNeeded=", i14, ", referralProgressText=");
        return AbstractC11266d.m30464r(sbM32001t, str3, ", daysLeftText=", str4, ")");
    }

    public PromotionCard(String title, String body, int i13, int i14, String referralProgressText, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(referralProgressText, "referralProgressText");
        this.title = title;
        this.body = body;
        this.referralsCompleted = i13;
        this.referralsNeeded = i14;
        this.referralProgressText = referralProgressText;
        this.daysLeftText = str;
    }
}
