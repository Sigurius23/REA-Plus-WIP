package fw1;

import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.payments.domain.models.Card;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import jx1.C22032v;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: fw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lfw1/b;", "", "<init>", "()V", "c", "e", "j", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "a", "b", "k", "i", "g", "Lfw1/b$a;", "Lfw1/b$b;", "Lfw1/b$c;", "Lfw1/b$d;", "Lfw1/b$e;", "Lfw1/b$f;", "Lfw1/b$g;", "Lfw1/b$h;", "Lfw1/b$i;", "Lfw1/b$j;", "Lfw1/b$k;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14835b {

    /* JADX INFO: renamed from: fw1.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfw1/b$c;", "Lfw1/b;", "", "promoCode", "", "isOnTrial", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Boolean isOnTrial;

        public c(String str, Boolean bool) {
            super(null);
            this.promoCode = str;
            this.isOnTrial = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.promoCode, cVar.promoCode) && AbstractC22676k.m65745e(this.isOnTrial, cVar.isOnTrial);
        }

        public int hashCode() {
            String str = this.promoCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isOnTrial;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LoadExtensionsV2LandingData(promoCode=" + this.promoCode + ", isOnTrial=" + this.isOnTrial + ")";
        }
    }

    /* JADX INFO: renamed from: fw1.b$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lfw1/b$e;", "Lfw1/b;", "", "promoCode", "", "isOnTrial", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Boolean isOnTrial;

        public e(String str, Boolean bool) {
            super(null);
            this.promoCode = str;
            this.isOnTrial = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.promoCode, eVar.promoCode) && AbstractC22676k.m65745e(this.isOnTrial, eVar.isOnTrial);
        }

        public int hashCode() {
            String str = this.promoCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isOnTrial;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LoadReactivationUpsellLandingData(promoCode=" + this.promoCode + ", isOnTrial=" + this.isOnTrial + ")";
        }
    }

    /* JADX INFO: renamed from: fw1.b$g */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u000f¨\u0006$"}, m65681d2 = {"Lfw1/b$g;", "Lfw1/b;", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "path", "<init>", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "d", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "Ljava/lang/String;", "e", "c", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CheckoutPayload payloadV2, String str, Card card, List<OrderOption> orderOptions, String path) {
            super(null);
            AbstractC22676k.m65750j(payloadV2, "payloadV2");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            AbstractC22676k.m65750j(path, "path");
            this.payloadV2 = payloadV2;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.path = path;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b */
        public final List<OrderOption> m42659b() {
            return this.orderOptions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.payloadV2, gVar.payloadV2) && AbstractC22676k.m65745e(this.promoCode, gVar.promoCode) && AbstractC22676k.m65745e(this.card, gVar.card) && AbstractC22676k.m65745e(this.orderOptions, gVar.orderOptions) && AbstractC22676k.m65745e(this.path, gVar.path);
        }

        public int hashCode() {
            int iHashCode = this.payloadV2.hashCode() * 31;
            String str = this.promoCode;
            return this.path.hashCode() + AbstractC11895b.m31983b((this.card.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
        }

        public String toString() {
            CheckoutPayload checkoutPayload = this.payloadV2;
            String str = this.promoCode;
            Card card = this.card;
            List<OrderOption> list = this.orderOptions;
            String str2 = this.path;
            StringBuilder sb4 = new StringBuilder("PlaceOrderV2(payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(", promoCode=");
            sb4.append(str);
            sb4.append(", card=");
            sb4.append(card);
            sb4.append(", orderOptions=");
            sb4.append(list);
            sb4.append(", path=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: fw1.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfw1/b$h;", "Lfw1/b;", "Ljx1/v;", "optionState", "<init>", "(Ljx1/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljx1/v;", "()Ljx1/v;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C22032v optionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C22032v optionState) {
            super(null);
            AbstractC22676k.m65750j(optionState, "optionState");
            this.optionState = optionState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C22032v getOptionState() {
            return this.optionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.optionState, ((h) other).optionState);
        }

        public int hashCode() {
            return this.optionState.hashCode();
        }

        public String toString() {
            return "SelectedSubscriptionOption(optionState=" + this.optionState + ")";
        }
    }

    /* JADX INFO: renamed from: fw1.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfw1/b$i;", "Lfw1/b;", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Lcom/whoop/payments/domain/models/Card;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC14835b {

        /* JADX INFO: renamed from: b */
        public static final int f55141b = Card.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Card card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Card card) {
            super(null);
            AbstractC22676k.m65750j(card, "card");
            this.card = card;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.card, ((i) other).card);
        }

        public int hashCode() {
            return this.card.hashCode();
        }

        public String toString() {
            return "UpdateCard(card=" + this.card + ")";
        }
    }

    /* JADX INFO: renamed from: fw1.b$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lfw1/b$j;", "Lfw1/b;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public j(int i13) {
            super(null);
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.index == ((j) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "UpdateOptionSelection(index=", ")");
        }
    }

    /* JADX INFO: renamed from: fw1.b$k */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfw1/b$k;", "Lfw1/b;", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "options", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<OrderOption> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<OrderOption> options) {
            super(null);
            AbstractC22676k.m65750j(options, "options");
            this.options = options;
        }

        /* JADX INFO: renamed from: a */
        public final List<OrderOption> m42666a() {
            return this.options;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.options, ((k) other).options);
        }

        public int hashCode() {
            return this.options.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UpdateOrderOptions(options=", ")", this.options);
        }
    }

    public /* synthetic */ AbstractC14835b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14835b() {
    }

    /* JADX INFO: renamed from: fw1.b$f */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfw1/b$f;", "Lfw1/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lfw1/h;", "landingType", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Lfw1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "b", "Lfw1/h;", "()Lfw1/h;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14841h landingType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Action action, EnumC14841h landingType) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(landingType, "landingType");
            this.action = action;
            this.landingType = landingType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC14841h getLandingType() {
            return this.landingType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.action, fVar.action) && this.landingType == fVar.landingType;
        }

        public int hashCode() {
            return this.landingType.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return "PerformOptionAction(action=" + this.action + ", landingType=" + this.landingType + ")";
        }

        public /* synthetic */ f(Action action, EnumC14841h enumC14841h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, (i13 & 2) != 0 ? EnumC14841h.EXTENSIONS : enumC14841h);
        }
    }

    /* JADX INFO: renamed from: fw1.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lfw1/b$b;", "Lfw1/b;", "", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "c", "d", "Lcom/whoop/payments/domain/models/Card;", "getCard", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC14835b {

        /* JADX INFO: renamed from: e */
        public static final int f55118e = Card.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String path, CheckoutPayload payloadV2, String str, Card card) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(payloadV2, "payloadV2");
            AbstractC22676k.m65750j(card, "card");
            this.path = path;
            this.payloadV2 = payloadV2;
            this.promoCode = str;
            this.card = card;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.payloadV2, bVar.payloadV2) && AbstractC22676k.m65745e(this.promoCode, bVar.promoCode) && AbstractC22676k.m65745e(this.card, bVar.card);
        }

        public int hashCode() {
            int iHashCode = (this.payloadV2.hashCode() + (this.path.hashCode() * 31)) * 31;
            String str = this.promoCode;
            return this.card.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return "LoadExtensionsV2CheckoutForFreeData(path=" + this.path + ", payloadV2=" + this.payloadV2 + ", promoCode=" + this.promoCode + ", card=" + this.card + ")";
        }

        public /* synthetic */ b(String str, CheckoutPayload checkoutPayload, String str2, Card card, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, checkoutPayload, str2, (i13 & 8) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card);
        }
    }

    /* JADX INFO: renamed from: fw1.b$a */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)¨\u0006*"}, m65681d2 = {"Lfw1/b$a;", "Lfw1/b;", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "path", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "stepPrefetchContent", "<init>", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "d", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "Ljava/lang/String;", "c", "getPromoCode", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final StepPrefetchContent stepPrefetchContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CheckoutPayload payloadV2, String path, String str, Card card, List<OrderOption> orderOptions, StepPrefetchContent stepPrefetchContent) {
            super(null);
            AbstractC22676k.m65750j(payloadV2, "payloadV2");
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            this.payloadV2 = payloadV2;
            this.path = path;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.stepPrefetchContent = stepPrefetchContent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b */
        public final List<OrderOption> m42641b() {
            return this.orderOptions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StepPrefetchContent getStepPrefetchContent() {
            return this.stepPrefetchContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.payloadV2, aVar.payloadV2) && AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.promoCode, aVar.promoCode) && AbstractC22676k.m65745e(this.card, aVar.card) && AbstractC22676k.m65745e(this.orderOptions, aVar.orderOptions) && AbstractC22676k.m65745e(this.stepPrefetchContent, aVar.stepPrefetchContent);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.payloadV2.hashCode() * 31, 31, this.path);
            String str = this.promoCode;
            int iM31983b = AbstractC11895b.m31983b((this.card.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
            StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
            return iM31983b + (stepPrefetchContent != null ? stepPrefetchContent.hashCode() : 0);
        }

        public String toString() {
            return "LoadExtensionsV2CheckoutData(payloadV2=" + this.payloadV2 + ", path=" + this.path + ", promoCode=" + this.promoCode + ", card=" + this.card + ", orderOptions=" + this.orderOptions + ", stepPrefetchContent=" + this.stepPrefetchContent + ")";
        }

        public /* synthetic */ a(CheckoutPayload checkoutPayload, String str, String str2, Card card, List list, StepPrefetchContent stepPrefetchContent, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(checkoutPayload, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : stepPrefetchContent);
        }
    }

    /* JADX INFO: renamed from: fw1.b$d */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001e\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lfw1/b$d;", "Lfw1/b;", "", "", "payload", "path", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "stepPrefetchContent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "e", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC14835b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> payload;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final StepPrefetchContent stepPrefetchContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> payload, String path, String str, Card card, List<OrderOption> orderOptions, StepPrefetchContent stepPrefetchContent) {
            super(null);
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            this.payload = payload;
            this.path = path;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.stepPrefetchContent = stepPrefetchContent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b */
        public final List<OrderOption> m42650b() {
            return this.orderOptions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, String> m42652d() {
            return this.payload;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.payload, dVar.payload) && AbstractC22676k.m65745e(this.path, dVar.path) && AbstractC22676k.m65745e(this.promoCode, dVar.promoCode) && AbstractC22676k.m65745e(this.card, dVar.card) && AbstractC22676k.m65745e(this.orderOptions, dVar.orderOptions) && AbstractC22676k.m65745e(this.stepPrefetchContent, dVar.stepPrefetchContent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final StepPrefetchContent getStepPrefetchContent() {
            return this.stepPrefetchContent;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.payload.hashCode() * 31, 31, this.path);
            String str = this.promoCode;
            int iM31983b = AbstractC11895b.m31983b((this.card.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
            StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
            return iM31983b + (stepPrefetchContent != null ? stepPrefetchContent.hashCode() : 0);
        }

        public String toString() {
            return "LoadReactivationUpsellCheckoutData(payload=" + this.payload + ", path=" + this.path + ", promoCode=" + this.promoCode + ", card=" + this.card + ", orderOptions=" + this.orderOptions + ", stepPrefetchContent=" + this.stepPrefetchContent + ")";
        }

        public /* synthetic */ d(Map map, String str, String str2, Card card, List list, StepPrefetchContent stepPrefetchContent, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : stepPrefetchContent);
        }
    }
}
