package com.whoop.referafriend.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/Promotion;", "", "", "complete", "Lcom/whoop/referafriend/domain/models/PromotionCard;", "card", "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "reward", "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "terms", "<init>", "(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/Promotion;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/whoop/referafriend/domain/models/PromotionCard;", "component3", "()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "component4", "()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "copy", "(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)Lcom/whoop/referafriend/domain/models/Promotion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getComplete", "Lcom/whoop/referafriend/domain/models/PromotionCard;", "getCard", "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "getReward", "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "getTerms", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Promotion {
    private final PromotionCard card;
    private final boolean complete;
    private final PromotionRewardModalContentModel reward;
    private final PromotionTermsModalContentModel terms;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/Promotion$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/Promotion;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Promotion$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Promotion(int i13, boolean z4, PromotionCard promotionCard, PromotionRewardModalContentModel promotionRewardModalContentModel, PromotionTermsModalContentModel promotionTermsModalContentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, Promotion$$serializer.INSTANCE.getDescriptor());
        }
        this.complete = z4;
        this.card = promotionCard;
        this.reward = promotionRewardModalContentModel;
        this.terms = promotionTermsModalContentModel;
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, boolean z4, PromotionCard promotionCard, PromotionRewardModalContentModel promotionRewardModalContentModel, PromotionTermsModalContentModel promotionTermsModalContentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = promotion.complete;
        }
        if ((i13 & 2) != 0) {
            promotionCard = promotion.card;
        }
        if ((i13 & 4) != 0) {
            promotionRewardModalContentModel = promotion.reward;
        }
        if ((i13 & 8) != 0) {
            promotionTermsModalContentModel = promotion.terms;
        }
        return promotion.copy(z4, promotionCard, promotionRewardModalContentModel, promotionTermsModalContentModel);
    }

    public static final /* synthetic */ void write$Self$refer_a_friend_release(Promotion self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.complete);
        output.encodeSerializableElement(serialDesc, 1, PromotionCard$$serializer.INSTANCE, self.card);
        output.encodeNullableSerializableElement(serialDesc, 2, PromotionRewardModalContentModel$$serializer.INSTANCE, self.reward);
        output.encodeNullableSerializableElement(serialDesc, 3, PromotionTermsModalContentModel$$serializer.INSTANCE, self.terms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PromotionCard getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PromotionRewardModalContentModel getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PromotionTermsModalContentModel getTerms() {
        return this.terms;
    }

    public final Promotion copy(boolean complete, PromotionCard card, PromotionRewardModalContentModel reward, PromotionTermsModalContentModel terms) {
        AbstractC22676k.m65750j(card, "card");
        return new Promotion(complete, card, reward, terms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return this.complete == promotion.complete && AbstractC22676k.m65745e(this.card, promotion.card) && AbstractC22676k.m65745e(this.reward, promotion.reward) && AbstractC22676k.m65745e(this.terms, promotion.terms);
    }

    public final PromotionCard getCard() {
        return this.card;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final PromotionRewardModalContentModel getReward() {
        return this.reward;
    }

    public final PromotionTermsModalContentModel getTerms() {
        return this.terms;
    }

    public int hashCode() {
        int iHashCode = (this.card.hashCode() + (Boolean.hashCode(this.complete) * 31)) * 31;
        PromotionRewardModalContentModel promotionRewardModalContentModel = this.reward;
        int iHashCode2 = (iHashCode + (promotionRewardModalContentModel == null ? 0 : promotionRewardModalContentModel.hashCode())) * 31;
        PromotionTermsModalContentModel promotionTermsModalContentModel = this.terms;
        return iHashCode2 + (promotionTermsModalContentModel != null ? promotionTermsModalContentModel.hashCode() : 0);
    }

    public String toString() {
        return "Promotion(complete=" + this.complete + ", card=" + this.card + ", reward=" + this.reward + ", terms=" + this.terms + ")";
    }

    public Promotion(boolean z4, PromotionCard card, PromotionRewardModalContentModel promotionRewardModalContentModel, PromotionTermsModalContentModel promotionTermsModalContentModel) {
        AbstractC22676k.m65750j(card, "card");
        this.complete = z4;
        this.card = card;
        this.reward = promotionRewardModalContentModel;
        this.terms = promotionTermsModalContentModel;
    }
}
