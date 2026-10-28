package com.whoop.payments.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018¨\u00060"}, m65681d2 = {"Lcom/whoop/payments/domain/models/Card;", "", "", "cardNumber", "cardExpiration", "cardCvv", "cardZip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/domain/models/Card;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "", "isEmpty", "()Z", "isNotEmpty", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/payments/domain/models/Card;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardNumber", "getCardExpiration", "getCardCvv", "getCardZip", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Card {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cardCvv;
    private final String cardExpiration;
    private final String cardNumber;
    private final String cardZip;

    /* JADX INFO: renamed from: com.whoop.payments.domain.models.Card$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/domain/models/Card$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/domain/models/Card;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Card$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Card() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Card copy$default(Card card, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = card.cardNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = card.cardExpiration;
        }
        if ((i13 & 4) != 0) {
            str3 = card.cardCvv;
        }
        if ((i13 & 8) != 0) {
            str4 = card.cardZip;
        }
        return card.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$payments_release(Card self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.cardNumber, "")) {
            output.encodeStringElement(serialDesc, 0, self.cardNumber);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.cardExpiration, "")) {
            output.encodeStringElement(serialDesc, 1, self.cardExpiration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.cardCvv, "")) {
            output.encodeStringElement(serialDesc, 2, self.cardCvv);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.cardZip, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.cardZip);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardExpiration() {
        return this.cardExpiration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardCvv() {
        return this.cardCvv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardZip() {
        return this.cardZip;
    }

    public final Card copy(String cardNumber, String cardExpiration, String cardCvv, String cardZip) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        AbstractC22676k.m65750j(cardExpiration, "cardExpiration");
        AbstractC22676k.m65750j(cardCvv, "cardCvv");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        return new Card(cardNumber, cardExpiration, cardCvv, cardZip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return AbstractC22676k.m65745e(this.cardNumber, card.cardNumber) && AbstractC22676k.m65745e(this.cardExpiration, card.cardExpiration) && AbstractC22676k.m65745e(this.cardCvv, card.cardCvv) && AbstractC22676k.m65745e(this.cardZip, card.cardZip);
    }

    public final String getCardCvv() {
        return this.cardCvv;
    }

    public final String getCardExpiration() {
        return this.cardExpiration;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCardZip() {
        return this.cardZip;
    }

    public int hashCode() {
        return this.cardZip.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cardNumber.hashCode() * 31, 31, this.cardExpiration), 31, this.cardCvv);
    }

    public final boolean isEmpty() {
        return this.cardNumber.length() == 0 && this.cardExpiration.length() == 0 && this.cardCvv.length() == 0 && this.cardZip.length() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public String toString() {
        return AbstractC2875y.m8300m("Card(cardNumber=****, cardExpiration=", this.cardExpiration, ", cardCvv=****, cardZip=", this.cardZip, ")");
    }

    public /* synthetic */ Card(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.cardNumber = "";
        } else {
            this.cardNumber = str;
        }
        if ((i13 & 2) == 0) {
            this.cardExpiration = "";
        } else {
            this.cardExpiration = str2;
        }
        if ((i13 & 4) == 0) {
            this.cardCvv = "";
        } else {
            this.cardCvv = str3;
        }
        if ((i13 & 8) == 0) {
            this.cardZip = "";
        } else {
            this.cardZip = str4;
        }
    }

    public Card(String cardNumber, String cardExpiration, String cardCvv, String cardZip) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        AbstractC22676k.m65750j(cardExpiration, "cardExpiration");
        AbstractC22676k.m65750j(cardCvv, "cardCvv");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        this.cardNumber = cardNumber;
        this.cardExpiration = cardExpiration;
        this.cardCvv = cardCvv;
        this.cardZip = cardZip;
    }

    public /* synthetic */ Card(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4);
    }
}
