package m70;

import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import d70.C11752f;
import d70.C11753g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: m70.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lm70/a;", "", "a", "d", "c", "b", "Lm70/a$a;", "Lm70/a$b;", "Lm70/a$c;", "Lm70/a$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25187a {

    /* JADX INFO: renamed from: m70.a$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010\u0010¨\u0006("}, m65681d2 = {"Lm70/a$a;", "Lm70/a;", "Ld70/g;", "cardNumber", "Ld70/f;", "cardExpirationMonth", "cardExpirationYear", "cardCvv", "cardZip", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "upcycleVariant", "", "userCountryCode", "<init>", "(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/g;", "d", "()Ld70/g;", "b", "Ld70/f;", "()Ld70/f;", "c", "e", "f", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "getUpcycleVariant", "()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "g", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC25187a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11753g cardNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C11752f cardExpirationMonth;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C11752f cardExpirationYear;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C11753g cardCvv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C11753g cardZip;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final UpcycleCreditCardVariant upcycleVariant;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String userCountryCode;

        public a(C11753g cardNumber, C11752f cardExpirationMonth, C11752f cardExpirationYear, C11753g cardCvv, C11753g cardZip, UpcycleCreditCardVariant upcycleCreditCardVariant, String str) {
            AbstractC22676k.m65750j(cardNumber, "cardNumber");
            AbstractC22676k.m65750j(cardExpirationMonth, "cardExpirationMonth");
            AbstractC22676k.m65750j(cardExpirationYear, "cardExpirationYear");
            AbstractC22676k.m65750j(cardCvv, "cardCvv");
            AbstractC22676k.m65750j(cardZip, "cardZip");
            this.cardNumber = cardNumber;
            this.cardExpirationMonth = cardExpirationMonth;
            this.cardExpirationYear = cardExpirationYear;
            this.cardCvv = cardCvv;
            this.cardZip = cardZip;
            this.upcycleVariant = upcycleCreditCardVariant;
            this.userCountryCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11753g getCardCvv() {
            return this.cardCvv;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C11752f getCardExpirationMonth() {
            return this.cardExpirationMonth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C11752f getCardExpirationYear() {
            return this.cardExpirationYear;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C11753g getCardNumber() {
            return this.cardNumber;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C11753g getCardZip() {
            return this.cardZip;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.cardNumber, aVar.cardNumber) && AbstractC22676k.m65745e(this.cardExpirationMonth, aVar.cardExpirationMonth) && AbstractC22676k.m65745e(this.cardExpirationYear, aVar.cardExpirationYear) && AbstractC22676k.m65745e(this.cardCvv, aVar.cardCvv) && AbstractC22676k.m65745e(this.cardZip, aVar.cardZip) && this.upcycleVariant == aVar.upcycleVariant && AbstractC22676k.m65745e(this.userCountryCode, aVar.userCountryCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        public int hashCode() {
            int iHashCode = (this.cardZip.hashCode() + ((this.cardCvv.hashCode() + ((this.cardExpirationYear.hashCode() + ((this.cardExpirationMonth.hashCode() + (this.cardNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleVariant;
            int iHashCode2 = (iHashCode + (upcycleCreditCardVariant == null ? 0 : upcycleCreditCardVariant.hashCode())) * 31;
            String str = this.userCountryCode;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            C11753g c11753g = this.cardNumber;
            C11752f c11752f = this.cardExpirationMonth;
            C11752f c11752f2 = this.cardExpirationYear;
            C11753g c11753g2 = this.cardCvv;
            C11753g c11753g3 = this.cardZip;
            UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleVariant;
            String str = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("CreateStripeToken(cardNumber=");
            sb4.append(c11753g);
            sb4.append(", cardExpirationMonth=");
            sb4.append(c11752f);
            sb4.append(", cardExpirationYear=");
            sb4.append(c11752f2);
            sb4.append(", cardCvv=");
            sb4.append(c11753g2);
            sb4.append(", cardZip=");
            sb4.append(c11753g3);
            sb4.append(", upcycleVariant=");
            sb4.append(upcycleCreditCardVariant);
            sb4.append(", userCountryCode=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: m70.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lm70/a$b;", "Lm70/a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC25187a {

        /* JADX INFO: renamed from: a */
        public static final b f98836a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: m70.a$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b*\u0010\u0013¨\u0006,"}, m65681d2 = {"Lm70/a$c;", "Lm70/a;", "Ld70/g;", "cardNumber", "Ld70/f;", "cardExpirationMonth", "cardExpirationYear", "cardCvv", "cardZip", "", "payload", "promoCode", "", "orderDetailsReplaced", "isSavedPaymentMethod", "userCountryCode", "<init>", "(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/g;", "d", "()Ld70/g;", "b", "Ld70/f;", "()Ld70/f;", "c", "e", "f", "Ljava/lang/String;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "i", "j", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC25187a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11753g cardNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C11752f cardExpirationMonth;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C11752f cardExpirationYear;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C11753g cardCvv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C11753g cardZip;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean orderDetailsReplaced;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isSavedPaymentMethod;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String userCountryCode;

        public c(C11753g cardNumber, C11752f cardExpirationMonth, C11752f cardExpirationYear, C11753g cardCvv, C11753g cardZip, String payload, String str, boolean z4, boolean z13, String str2) {
            AbstractC22676k.m65750j(cardNumber, "cardNumber");
            AbstractC22676k.m65750j(cardExpirationMonth, "cardExpirationMonth");
            AbstractC22676k.m65750j(cardExpirationYear, "cardExpirationYear");
            AbstractC22676k.m65750j(cardCvv, "cardCvv");
            AbstractC22676k.m65750j(cardZip, "cardZip");
            AbstractC22676k.m65750j(payload, "payload");
            this.cardNumber = cardNumber;
            this.cardExpirationMonth = cardExpirationMonth;
            this.cardExpirationYear = cardExpirationYear;
            this.cardCvv = cardCvv;
            this.cardZip = cardZip;
            this.payload = payload;
            this.promoCode = str;
            this.orderDetailsReplaced = z4;
            this.isSavedPaymentMethod = z13;
            this.userCountryCode = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11753g getCardCvv() {
            return this.cardCvv;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C11752f getCardExpirationMonth() {
            return this.cardExpirationMonth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C11752f getCardExpirationYear() {
            return this.cardExpirationYear;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C11753g getCardNumber() {
            return this.cardNumber;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C11753g getCardZip() {
            return this.cardZip;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.cardNumber, cVar.cardNumber) && AbstractC22676k.m65745e(this.cardExpirationMonth, cVar.cardExpirationMonth) && AbstractC22676k.m65745e(this.cardExpirationYear, cVar.cardExpirationYear) && AbstractC22676k.m65745e(this.cardCvv, cVar.cardCvv) && AbstractC22676k.m65745e(this.cardZip, cVar.cardZip) && AbstractC22676k.m65745e(this.payload, cVar.payload) && AbstractC22676k.m65745e(this.promoCode, cVar.promoCode) && this.orderDetailsReplaced == cVar.orderDetailsReplaced && this.isSavedPaymentMethod == cVar.isSavedPaymentMethod && AbstractC22676k.m65745e(this.userCountryCode, cVar.userCountryCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getOrderDetailsReplaced() {
            return this.orderDetailsReplaced;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d((this.cardZip.hashCode() + ((this.cardCvv.hashCode() + ((this.cardExpirationYear.hashCode() + ((this.cardExpirationMonth.hashCode() + (this.cardNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.payload);
            String str = this.promoCode;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderDetailsReplaced), 31, this.isSavedPaymentMethod);
            String str2 = this.userCountryCode;
            return iM8289b + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsSavedPaymentMethod() {
            return this.isSavedPaymentMethod;
        }

        public String toString() {
            C11753g c11753g = this.cardNumber;
            C11752f c11752f = this.cardExpirationMonth;
            C11752f c11752f2 = this.cardExpirationYear;
            C11753g c11753g2 = this.cardCvv;
            C11753g c11753g3 = this.cardZip;
            String str = this.payload;
            String str2 = this.promoCode;
            boolean z4 = this.orderDetailsReplaced;
            boolean z13 = this.isSavedPaymentMethod;
            String str3 = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("TrialOfferTokenCheckout(cardNumber=");
            sb4.append(c11753g);
            sb4.append(", cardExpirationMonth=");
            sb4.append(c11752f);
            sb4.append(", cardExpirationYear=");
            sb4.append(c11752f2);
            sb4.append(", cardCvv=");
            sb4.append(c11753g2);
            sb4.append(", cardZip=");
            sb4.append(c11753g3);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            AbstractC38963t7.m124390t(sb4, str2, ", orderDetailsReplaced=", z4, ", isSavedPaymentMethod=");
            return AbstractC21702c.m61139j(sb4, z13, ", userCountryCode=", str3, ")");
        }
    }

    /* JADX INFO: renamed from: m70.a$d */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b*\u0010\u0013¨\u0006,"}, m65681d2 = {"Lm70/a$d;", "Lm70/a;", "Ld70/g;", "cardNumber", "Ld70/f;", "cardExpirationMonth", "cardExpirationYear", "cardCvv", "cardZip", "", "payload", "promoCode", "", "orderDetailsReplaced", "isSavedPaymentMethod", "userCountryCode", "<init>", "(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/g;", "d", "()Ld70/g;", "b", "Ld70/f;", "()Ld70/f;", "c", "e", "f", "Ljava/lang/String;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "i", "j", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC25187a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11753g cardNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C11752f cardExpirationMonth;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C11752f cardExpirationYear;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C11753g cardCvv;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C11753g cardZip;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean orderDetailsReplaced;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isSavedPaymentMethod;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String userCountryCode;

        public d(C11753g cardNumber, C11752f cardExpirationMonth, C11752f cardExpirationYear, C11753g cardCvv, C11753g cardZip, String payload, String str, boolean z4, boolean z13, String str2) {
            AbstractC22676k.m65750j(cardNumber, "cardNumber");
            AbstractC22676k.m65750j(cardExpirationMonth, "cardExpirationMonth");
            AbstractC22676k.m65750j(cardExpirationYear, "cardExpirationYear");
            AbstractC22676k.m65750j(cardCvv, "cardCvv");
            AbstractC22676k.m65750j(cardZip, "cardZip");
            AbstractC22676k.m65750j(payload, "payload");
            this.cardNumber = cardNumber;
            this.cardExpirationMonth = cardExpirationMonth;
            this.cardExpirationYear = cardExpirationYear;
            this.cardCvv = cardCvv;
            this.cardZip = cardZip;
            this.payload = payload;
            this.promoCode = str;
            this.orderDetailsReplaced = z4;
            this.isSavedPaymentMethod = z13;
            this.userCountryCode = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11753g getCardCvv() {
            return this.cardCvv;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C11752f getCardExpirationMonth() {
            return this.cardExpirationMonth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C11752f getCardExpirationYear() {
            return this.cardExpirationYear;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C11753g getCardNumber() {
            return this.cardNumber;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C11753g getCardZip() {
            return this.cardZip;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.cardNumber, dVar.cardNumber) && AbstractC22676k.m65745e(this.cardExpirationMonth, dVar.cardExpirationMonth) && AbstractC22676k.m65745e(this.cardExpirationYear, dVar.cardExpirationYear) && AbstractC22676k.m65745e(this.cardCvv, dVar.cardCvv) && AbstractC22676k.m65745e(this.cardZip, dVar.cardZip) && AbstractC22676k.m65745e(this.payload, dVar.payload) && AbstractC22676k.m65745e(this.promoCode, dVar.promoCode) && this.orderDetailsReplaced == dVar.orderDetailsReplaced && this.isSavedPaymentMethod == dVar.isSavedPaymentMethod && AbstractC22676k.m65745e(this.userCountryCode, dVar.userCountryCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getOrderDetailsReplaced() {
            return this.orderDetailsReplaced;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d((this.cardZip.hashCode() + ((this.cardCvv.hashCode() + ((this.cardExpirationYear.hashCode() + ((this.cardExpirationMonth.hashCode() + (this.cardNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.payload);
            String str = this.promoCode;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderDetailsReplaced), 31, this.isSavedPaymentMethod);
            String str2 = this.userCountryCode;
            return iM8289b + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsSavedPaymentMethod() {
            return this.isSavedPaymentMethod;
        }

        public String toString() {
            C11753g c11753g = this.cardNumber;
            C11752f c11752f = this.cardExpirationMonth;
            C11752f c11752f2 = this.cardExpirationYear;
            C11753g c11753g2 = this.cardCvv;
            C11753g c11753g3 = this.cardZip;
            String str = this.payload;
            String str2 = this.promoCode;
            boolean z4 = this.orderDetailsReplaced;
            boolean z13 = this.isSavedPaymentMethod;
            String str3 = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("UpcycleTokenCheckout(cardNumber=");
            sb4.append(c11753g);
            sb4.append(", cardExpirationMonth=");
            sb4.append(c11752f);
            sb4.append(", cardExpirationYear=");
            sb4.append(c11752f2);
            sb4.append(", cardCvv=");
            sb4.append(c11753g2);
            sb4.append(", cardZip=");
            sb4.append(c11753g3);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            AbstractC38963t7.m124390t(sb4, str2, ", orderDetailsReplaced=", z4, ", isSavedPaymentMethod=");
            return AbstractC21702c.m61139j(sb4, z13, ", userCountryCode=", str3, ")");
        }
    }
}
