package j80;

import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C28997e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lj80/c;", "Lj80/b;", "a", "c", "b", "d", "Lj80/c$a;", "Lj80/c$b;", "Lj80/c$c;", "Lj80/c$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21415c extends InterfaceC21414b {

    /* JADX INFO: renamed from: j80.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, m65681d2 = {"Lj80/c$b;", "Lj80/c;", "Lp90/e;", "card", "", "payload", "promoCode", "", "orderDetailsReplaced", "isSavedPaymentMethod", "userCountryCode", "<init>", "(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/e;", "()Lp90/e;", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "e", "f", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21415c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28997e card;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean orderDetailsReplaced;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isSavedPaymentMethod;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String userCountryCode;

        public b(C28997e card, String payload, String str, boolean z4, boolean z13, String str2) {
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(payload, "payload");
            this.card = card;
            this.payload = payload;
            this.promoCode = str;
            this.orderDetailsReplaced = z4;
            this.isSavedPaymentMethod = z13;
            this.userCountryCode = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C28997e getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getOrderDetailsReplaced() {
            return this.orderDetailsReplaced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.card, bVar.card) && AbstractC22676k.m65745e(this.payload, bVar.payload) && AbstractC22676k.m65745e(this.promoCode, bVar.promoCode) && this.orderDetailsReplaced == bVar.orderDetailsReplaced && this.isSavedPaymentMethod == bVar.isSavedPaymentMethod && AbstractC22676k.m65745e(this.userCountryCode, bVar.userCountryCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSavedPaymentMethod() {
            return this.isSavedPaymentMethod;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.card.hashCode() * 31, 31, this.payload);
            String str = this.promoCode;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderDetailsReplaced), 31, this.isSavedPaymentMethod);
            String str2 = this.userCountryCode;
            return iM8289b + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            C28997e c28997e = this.card;
            String str = this.payload;
            String str2 = this.promoCode;
            boolean z4 = this.orderDetailsReplaced;
            boolean z13 = this.isSavedPaymentMethod;
            String str3 = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("OnTrialPaymentInfoSubmitted(card=");
            sb4.append(c28997e);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            AbstractC38963t7.m124390t(sb4, str2, ", orderDetailsReplaced=", z4, ", isSavedPaymentMethod=");
            return AbstractC21702c.m61139j(sb4, z13, ", userCountryCode=", str3, ")");
        }
    }

    /* JADX INFO: renamed from: j80.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, m65681d2 = {"Lj80/c$c;", "Lj80/c;", "Lp90/e;", "card", "", "payload", "promoCode", "", "orderDetailsReplaced", "isSavedPaymentMethod", "userCountryCode", "<init>", "(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/e;", "()Lp90/e;", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "e", "f", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC21415c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28997e card;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean orderDetailsReplaced;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isSavedPaymentMethod;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String userCountryCode;

        public c(C28997e card, String payload, String str, boolean z4, boolean z13, String str2) {
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(payload, "payload");
            this.card = card;
            this.payload = payload;
            this.promoCode = str;
            this.orderDetailsReplaced = z4;
            this.isSavedPaymentMethod = z13;
            this.userCountryCode = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C28997e getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getOrderDetailsReplaced() {
            return this.orderDetailsReplaced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.card, cVar.card) && AbstractC22676k.m65745e(this.payload, cVar.payload) && AbstractC22676k.m65745e(this.promoCode, cVar.promoCode) && this.orderDetailsReplaced == cVar.orderDetailsReplaced && this.isSavedPaymentMethod == cVar.isSavedPaymentMethod && AbstractC22676k.m65745e(this.userCountryCode, cVar.userCountryCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSavedPaymentMethod() {
            return this.isSavedPaymentMethod;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.card.hashCode() * 31, 31, this.payload);
            String str = this.promoCode;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderDetailsReplaced), 31, this.isSavedPaymentMethod);
            String str2 = this.userCountryCode;
            return iM8289b + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            C28997e c28997e = this.card;
            String str = this.payload;
            String str2 = this.promoCode;
            boolean z4 = this.orderDetailsReplaced;
            boolean z13 = this.isSavedPaymentMethod;
            String str3 = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("OnUpcyclePaymentInfoSubmitted(card=");
            sb4.append(c28997e);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            AbstractC38963t7.m124390t(sb4, str2, ", orderDetailsReplaced=", z4, ", isSavedPaymentMethod=");
            return AbstractC21702c.m61139j(sb4, z13, ", userCountryCode=", str3, ")");
        }
    }

    /* JADX INFO: renamed from: j80.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj80/c$d;", "Lj80/c;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC21415c {

        /* JADX INFO: renamed from: a */
        public static final d f82168a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: j80.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lj80/c$a;", "Lj80/c;", "Lp90/e;", "card", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "upcycleVariant", "", "userCountryCode", "<init>", "(Lp90/e;Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/e;", "()Lp90/e;", "b", "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "()Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;", "c", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21415c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C28997e card;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UpcycleCreditCardVariant upcycleVariant;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String userCountryCode;

        public a(C28997e card, UpcycleCreditCardVariant upcycleCreditCardVariant, String str) {
            AbstractC22676k.m65750j(card, "card");
            this.card = card;
            this.upcycleVariant = upcycleCreditCardVariant;
            this.userCountryCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C28997e getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UpcycleCreditCardVariant getUpcycleVariant() {
            return this.upcycleVariant;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUserCountryCode() {
            return this.userCountryCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.card, aVar.card) && this.upcycleVariant == aVar.upcycleVariant && AbstractC22676k.m65745e(this.userCountryCode, aVar.userCountryCode);
        }

        public int hashCode() {
            int iHashCode = this.card.hashCode() * 31;
            UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleVariant;
            int iHashCode2 = (iHashCode + (upcycleCreditCardVariant == null ? 0 : upcycleCreditCardVariant.hashCode())) * 31;
            String str = this.userCountryCode;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            C28997e c28997e = this.card;
            UpcycleCreditCardVariant upcycleCreditCardVariant = this.upcycleVariant;
            String str = this.userCountryCode;
            StringBuilder sb4 = new StringBuilder("OnPaymentInfoSubmitted(card=");
            sb4.append(c28997e);
            sb4.append(", upcycleVariant=");
            sb4.append(upcycleCreditCardVariant);
            sb4.append(", userCountryCode=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ a(C28997e c28997e, UpcycleCreditCardVariant upcycleCreditCardVariant, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c28997e, (i13 & 2) != 0 ? null : upcycleCreditCardVariant, str);
        }
    }
}
