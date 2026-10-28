package iw1;

import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.payments.domain.models.Card;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iw1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0012\u0003\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Liw1/f;", "Liw1/i;", "", "a", "()Ljava/lang/String;", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "d", "()Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "c", "()Ljava/util/List;", "orderOptions", "getPath", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "Liw1/f$a;", "Liw1/f$b;", "Liw1/f$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21000f extends InterfaceC21003i {

    /* JADX INFO: renamed from: iw1.f$b */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,¨\u0006-"}, m65681d2 = {"Liw1/f$b;", "Liw1/f;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "", "payload", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "b", "Ljava/lang/String;", "getPayload", "c", "d", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "f", "getPath", "g", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21000f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        public b(ProgressContent progressContent, String payload, String str, Card card, List<OrderOption> orderOptions, String str2, CheckoutPayload checkoutPayload) {
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            this.content = progressContent;
            this.payload = payload;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: c */
        public List<OrderOption> mo58533c() {
            return this.orderOptions;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: d, reason: from getter */
        public Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProgressContent getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.content, bVar.content) && AbstractC22676k.m65745e(this.payload, bVar.payload) && AbstractC22676k.m65745e(this.promoCode, bVar.promoCode) && AbstractC22676k.m65745e(this.card, bVar.card) && AbstractC22676k.m65745e(this.orderOptions, bVar.orderOptions) && AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.payloadV2, bVar.payloadV2);
        }

        @Override // iw1.InterfaceC21000f
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            ProgressContent progressContent = this.content;
            int iM30450d = AbstractC11266d.m30450d((progressContent == null ? 0 : progressContent.hashCode()) * 31, 31, this.payload);
            String str = this.promoCode;
            int iM31983b = AbstractC11895b.m31983b((this.card.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
            String str2 = this.path;
            int iHashCode = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            return iHashCode + (checkoutPayload != null ? checkoutPayload.hashCode() : 0);
        }

        public String toString() {
            ProgressContent progressContent = this.content;
            String str = this.payload;
            String str2 = this.promoCode;
            Card card = this.card;
            List<OrderOption> list = this.orderOptions;
            String str3 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            StringBuilder sb4 = new StringBuilder("OrderLoading(content=");
            sb4.append(progressContent);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            sb4.append(str2);
            sb4.append(", card=");
            sb4.append(card);
            sb4.append(", orderOptions=");
            AbstractC17176i.m48511m(", path=", str3, ", payloadV2=", sb4, list);
            sb4.append(checkoutPayload);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: iw1.f$c */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,¨\u0006-"}, m65681d2 = {"Liw1/f$c;", "Liw1/f;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "", "payload", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "b", "Ljava/lang/String;", "getPayload", "c", "d", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "f", "getPath", "g", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC21000f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        public c(ProgressContent progressContent, String payload, String str, Card card, List<OrderOption> orderOptions, String str2, CheckoutPayload checkoutPayload) {
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            this.content = progressContent;
            this.payload = payload;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: c */
        public List<OrderOption> mo58533c() {
            return this.orderOptions;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: d, reason: from getter */
        public Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProgressContent getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.content, cVar.content) && AbstractC22676k.m65745e(this.payload, cVar.payload) && AbstractC22676k.m65745e(this.promoCode, cVar.promoCode) && AbstractC22676k.m65745e(this.card, cVar.card) && AbstractC22676k.m65745e(this.orderOptions, cVar.orderOptions) && AbstractC22676k.m65745e(this.path, cVar.path) && AbstractC22676k.m65745e(this.payloadV2, cVar.payloadV2);
        }

        @Override // iw1.InterfaceC21000f
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            ProgressContent progressContent = this.content;
            int iM30450d = AbstractC11266d.m30450d((progressContent == null ? 0 : progressContent.hashCode()) * 31, 31, this.payload);
            String str = this.promoCode;
            int iM31983b = AbstractC11895b.m31983b((this.card.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
            String str2 = this.path;
            int iHashCode = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            return iHashCode + (checkoutPayload != null ? checkoutPayload.hashCode() : 0);
        }

        public String toString() {
            ProgressContent progressContent = this.content;
            String str = this.payload;
            String str2 = this.promoCode;
            Card card = this.card;
            List<OrderOption> list = this.orderOptions;
            String str3 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            StringBuilder sb4 = new StringBuilder("OrderSuccess(content=");
            sb4.append(progressContent);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            sb4.append(str2);
            sb4.append(", card=");
            sb4.append(card);
            sb4.append(", orderOptions=");
            AbstractC17176i.m48511m(", path=", str3, ", payloadV2=", sb4, list);
            sb4.append(checkoutPayload);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    String getPromoCode();

    /* JADX INFO: renamed from: b */
    CheckoutPayload getPayloadV2();

    /* JADX INFO: renamed from: c */
    List<OrderOption> mo58533c();

    /* JADX INFO: renamed from: d */
    Card getCard();

    String getPath();

    /* JADX INFO: renamed from: iw1.f$a */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b#\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b \u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Liw1/f$a;", "Liw1/f;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "", "payload", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "wasCheckoutShown", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/util/List;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "b", "Ljava/lang/String;", "getPayload", "c", "d", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "f", "getPath", "g", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "getWasCheckoutShown", "()Z", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21000f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Card card;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean wasCheckoutShown;

        public a(ProgressContent progressContent, String payload, String str, Card card, List<OrderOption> orderOptions, String str2, CheckoutPayload checkoutPayload, boolean z4) {
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(card, "card");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            this.content = progressContent;
            this.payload = payload;
            this.promoCode = str;
            this.card = card;
            this.orderOptions = orderOptions;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
            this.wasCheckoutShown = z4;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: c */
        public List<OrderOption> mo58533c() {
            return this.orderOptions;
        }

        @Override // iw1.InterfaceC21000f
        /* JADX INFO: renamed from: d, reason: from getter */
        public Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProgressContent getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.content, aVar.content) && AbstractC22676k.m65745e(this.payload, aVar.payload) && AbstractC22676k.m65745e(this.promoCode, aVar.promoCode) && AbstractC22676k.m65745e(this.card, aVar.card) && AbstractC22676k.m65745e(this.orderOptions, aVar.orderOptions) && AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.payloadV2, aVar.payloadV2) && this.wasCheckoutShown == aVar.wasCheckoutShown;
        }

        @Override // iw1.InterfaceC21000f
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            ProgressContent progressContent = this.content;
            int iM30450d = AbstractC11266d.m30450d((progressContent == null ? 0 : progressContent.hashCode()) * 31, 31, this.payload);
            String str = this.promoCode;
            int iM31983b = AbstractC11895b.m31983b((this.card.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.orderOptions);
            String str2 = this.path;
            int iHashCode = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            return Boolean.hashCode(this.wasCheckoutShown) + ((iHashCode + (checkoutPayload != null ? checkoutPayload.hashCode() : 0)) * 31);
        }

        public String toString() {
            ProgressContent progressContent = this.content;
            String str = this.payload;
            String str2 = this.promoCode;
            Card card = this.card;
            List<OrderOption> list = this.orderOptions;
            String str3 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            boolean z4 = this.wasCheckoutShown;
            StringBuilder sb4 = new StringBuilder("OrderError(content=");
            sb4.append(progressContent);
            sb4.append(", payload=");
            sb4.append(str);
            sb4.append(", promoCode=");
            sb4.append(str2);
            sb4.append(", card=");
            sb4.append(card);
            sb4.append(", orderOptions=");
            AbstractC17176i.m48511m(", path=", str3, ", payloadV2=", sb4, list);
            sb4.append(checkoutPayload);
            sb4.append(", wasCheckoutShown=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ a(ProgressContent progressContent, String str, String str2, Card card, List list, String str3, CheckoutPayload checkoutPayload, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : progressContent, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card, (i13 & 16) != 0 ? C25271y.f99162w : list, str3, checkoutPayload, (i13 & 128) != 0 ? true : z4);
        }
    }
}
