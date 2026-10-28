package eo2;

import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: eo2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Leo2/c;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "b", "a", "g", "f", "d", "c", "Leo2/c$d;", "Leo2/c$h;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC13383c {

    /* JADX INFO: renamed from: eo2.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Leo2/c$a;", "Leo2/c$h;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "intent", "", "cartId", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "b", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CartAddIntent intent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        public a(CartAddIntent intent, String str) {
            AbstractC22676k.m65750j(intent, "intent");
            this.intent = intent;
            this.cartId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CartAddIntent getIntent() {
            return this.intent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.intent, aVar.intent) && AbstractC22676k.m65745e(this.cartId, aVar.cartId);
        }

        public int hashCode() {
            int iHashCode = this.intent.hashCode() * 31;
            String str = this.cartId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AddIntent(intent=" + this.intent + ", cartId=" + this.cartId + ")";
        }
    }

    /* JADX INFO: renamed from: eo2.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Leo2/c$b;", "Leo2/c$h;", "", "sku", "cartId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        public b(String sku, String str) {
            AbstractC22676k.m65750j(sku, "sku");
            this.sku = sku;
            this.cartId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.sku, bVar.sku) && AbstractC22676k.m65745e(this.cartId, bVar.cartId);
        }

        public int hashCode() {
            int iHashCode = this.sku.hashCode() * 31;
            String str = this.cartId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("AddItem(sku=", this.sku, ", cartId=", this.cartId, ")");
        }
    }

    /* JADX INFO: renamed from: eo2.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Leo2/c$c;", "Leo2/c$d;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements d {

        /* JADX INFO: renamed from: b */
        public static final int f46844b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public c(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.navAction, ((c) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: eo2.c$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Leo2/c$d;", "Leo2/c;", "Leo2/c$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface d extends InterfaceC13383c {
    }

    /* JADX INFO: renamed from: eo2.c$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Leo2/c$e;", "Leo2/c$h;", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        public e(String str) {
            this.cartId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.cartId, ((e) other).cartId);
        }

        public int hashCode() {
            String str = this.cartId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Refresh(cartId=", this.cartId, ")");
        }

        public /* synthetic */ e(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: eo2.c$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Leo2/c$f;", "Leo2/c$h;", "", "lineItemId", "productLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String lineItemId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String productLabel;

        public f(String lineItemId, String productLabel) {
            AbstractC22676k.m65750j(lineItemId, "lineItemId");
            AbstractC22676k.m65750j(productLabel, "productLabel");
            this.lineItemId = lineItemId;
            this.productLabel = productLabel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLineItemId() {
            return this.lineItemId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProductLabel() {
            return this.productLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.lineItemId, fVar.lineItemId) && AbstractC22676k.m65745e(this.productLabel, fVar.productLabel);
        }

        public int hashCode() {
            return this.productLabel.hashCode() + (this.lineItemId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("RemoveItem(lineItemId=", this.lineItemId, ", productLabel=", this.productLabel, ")");
        }
    }

    /* JADX INFO: renamed from: eo2.c$g */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\f¨\u0006\u001c"}, m65681d2 = {"Leo2/c$g;", "Leo2/c$h;", "", "lineItemId", "", "quantity", "Leo2/i;", "direction", "productLabel", "<init>", "(Ljava/lang/String;ILeo2/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "d", "c", "Leo2/i;", "()Leo2/i;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String lineItemId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int quantity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC13389i direction;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String productLabel;

        public g(String lineItemId, int i13, EnumC13389i direction, String productLabel) {
            AbstractC22676k.m65750j(lineItemId, "lineItemId");
            AbstractC22676k.m65750j(direction, "direction");
            AbstractC22676k.m65750j(productLabel, "productLabel");
            this.lineItemId = lineItemId;
            this.quantity = i13;
            this.direction = direction;
            this.productLabel = productLabel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC13389i getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLineItemId() {
            return this.lineItemId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProductLabel() {
            return this.productLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.lineItemId, gVar.lineItemId) && this.quantity == gVar.quantity && this.direction == gVar.direction && AbstractC22676k.m65745e(this.productLabel, gVar.productLabel);
        }

        public int hashCode() {
            return this.productLabel.hashCode() + ((this.direction.hashCode() + AbstractC11266d.m30448b(this.quantity, this.lineItemId.hashCode() * 31, 31)) * 31);
        }

        public String toString() {
            String str = this.lineItemId;
            int i13 = this.quantity;
            EnumC13389i enumC13389i = this.direction;
            String str2 = this.productLabel;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "UpdateQuantity(lineItemId=", str, ", quantity=", ", direction=");
            sbM30467u.append(enumC13389i);
            sbM30467u.append(", productLabel=");
            sbM30467u.append(str2);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }
    }

    /* JADX INFO: renamed from: eo2.c$h */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Leo2/c$h;", "Leo2/c;", "Leo2/c$a;", "Leo2/c$b;", "Leo2/c$e;", "Leo2/c$f;", "Leo2/c$g;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface h extends InterfaceC13383c {
    }
}
