package iw1;

import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.payments.domain.models.Card;
import java.util.List;
import lw1.C24774j;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Liw1/a;", "Liw1/g;", "<init>", "()V", "c", "b", "e", "g", "f", "a", "d", "Liw1/a$a;", "Liw1/a$b;", "Liw1/a$c;", "Liw1/a$d;", "Liw1/a$e;", "Liw1/a$f;", "Liw1/a$g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20995a implements InterfaceC21001g {

    /* JADX INFO: renamed from: iw1.a$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Liw1/a$a;", "Liw1/a;", "Liw1/b;", "viewState", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "action", "<init>", "(Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw1/b;", "b", "()Liw1/b;", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "()Lcom/whoop/membership/extensions/domain/models/CtaAction;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20995a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC20996b viewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CtaAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC20996b viewState, CtaAction action) {
            super(null);
            AbstractC22676k.m65750j(viewState, "viewState");
            AbstractC22676k.m65750j(action, "action");
            this.viewState = viewState;
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CtaAction getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC20996b getViewState() {
            return this.viewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.viewState, aVar.viewState) && this.action == aVar.action;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.viewState.hashCode() * 31);
        }

        public String toString() {
            return "CtaClickedV2(viewState=" + this.viewState + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liw1/a$b;", "Liw1/a;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC20995a {

        /* JADX INFO: renamed from: a */
        public static final b f79358a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: iw1.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liw1/a$c;", "Liw1/a;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC20995a {

        /* JADX INFO: renamed from: a */
        public static final c f79359a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: iw1.a$d */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, m65681d2 = {"Liw1/a$d;", "Liw1/a;", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "Llw1/j;", "paymentOption", "", "promoCode", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "stepPrefetchContent", "<init>", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Llw1/j;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "Llw1/j;", "c", "()Llw1/j;", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC20995a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C24774j paymentOption;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final StepPrefetchContent stepPrefetchContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CheckoutPayload payloadV2, C24774j paymentOption, String str, List<OrderOption> orderOptions, StepPrefetchContent stepPrefetchContent) {
            super(null);
            AbstractC22676k.m65750j(payloadV2, "payloadV2");
            AbstractC22676k.m65750j(paymentOption, "paymentOption");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            AbstractC22676k.m65750j(stepPrefetchContent, "stepPrefetchContent");
            this.payloadV2 = payloadV2;
            this.paymentOption = paymentOption;
            this.promoCode = str;
            this.orderOptions = orderOptions;
            this.stepPrefetchContent = stepPrefetchContent;
        }

        /* JADX INFO: renamed from: a */
        public final List<OrderOption> m58497a() {
            return this.orderOptions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C24774j getPaymentOption() {
            return this.paymentOption;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPromoCode() {
            return this.promoCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StepPrefetchContent getStepPrefetchContent() {
            return this.stepPrefetchContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.payloadV2, dVar.payloadV2) && AbstractC22676k.m65745e(this.paymentOption, dVar.paymentOption) && AbstractC22676k.m65745e(this.promoCode, dVar.promoCode) && AbstractC22676k.m65745e(this.orderOptions, dVar.orderOptions) && AbstractC22676k.m65745e(this.stepPrefetchContent, dVar.stepPrefetchContent);
        }

        public int hashCode() {
            int iHashCode = (this.paymentOption.hashCode() + (this.payloadV2.hashCode() * 31)) * 31;
            String str = this.promoCode;
            return this.stepPrefetchContent.hashCode() + AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderOptions);
        }

        public String toString() {
            CheckoutPayload checkoutPayload = this.payloadV2;
            C24774j c24774j = this.paymentOption;
            String str = this.promoCode;
            List<OrderOption> list = this.orderOptions;
            StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
            StringBuilder sb4 = new StringBuilder("PlaceOrderV2(payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(", paymentOption=");
            sb4.append(c24774j);
            sb4.append(", promoCode=");
            AbstractC36095b.m114694v(str, ", orderOptions=", ", stepPrefetchContent=", sb4, list);
            sb4.append(stepPrefetchContent);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: iw1.a$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Liw1/a$e;", "Liw1/a;", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "path", "promoCode", "<init>", "(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "Ljava/lang/String;", "c", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC20995a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CheckoutPayload payloadV2, String path, String str) {
            super(null);
            AbstractC22676k.m65750j(payloadV2, "payloadV2");
            AbstractC22676k.m65750j(path, "path");
            this.payloadV2 = payloadV2;
            this.path = path;
            this.promoCode = str;
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
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.payloadV2, eVar.payloadV2) && AbstractC22676k.m65745e(this.path, eVar.path) && AbstractC22676k.m65745e(this.promoCode, eVar.promoCode);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.payloadV2.hashCode() * 31, 31, this.path);
            String str = this.promoCode;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            CheckoutPayload checkoutPayload = this.payloadV2;
            String str = this.path;
            String str2 = this.promoCode;
            StringBuilder sb4 = new StringBuilder("ReloadV2(payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(", path=");
            sb4.append(str);
            sb4.append(", promoCode=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: iw1.a$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw1/a$f;", "Liw1/a;", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Lcom/whoop/payments/domain/models/Card;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC20995a {

        /* JADX INFO: renamed from: b */
        public static final int f79368b = Card.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Card card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Card card) {
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
            return (other instanceof f) && AbstractC22676k.m65745e(this.card, ((f) other).card);
        }

        public int hashCode() {
            return this.card.hashCode();
        }

        public String toString() {
            return "UpdateCard(card=" + this.card + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.a$g */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Liw1/a$g;", "Liw1/a;", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "options", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC20995a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<OrderOption> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<OrderOption> options) {
            super(null);
            AbstractC22676k.m65750j(options, "options");
            this.options = options;
        }

        /* JADX INFO: renamed from: a */
        public final List<OrderOption> m58506a() {
            return this.options;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.options, ((g) other).options);
        }

        public int hashCode() {
            return this.options.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("UpdateOrderOption(options=", ")", this.options);
        }
    }

    public /* synthetic */ AbstractC20995a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20995a() {
    }
}
