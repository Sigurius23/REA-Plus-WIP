package com.whoop.universalcheckout.features.cart.domain;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/a;", "", "<init>", "()V", "a", "c", "b", "Lcom/whoop/universalcheckout/features/cart/domain/a$a;", "Lcom/whoop/universalcheckout/features/cart/domain/a$b;", "Lcom/whoop/universalcheckout/features/cart/domain/a$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10658a {

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/a$b;", "Lcom/whoop/universalcheckout/features/cart/domain/a;", "", "lineItemId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10658a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String lineItemId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String lineItemId) {
            super(null);
            AbstractC22676k.m65750j(lineItemId, "lineItemId");
            this.lineItemId = lineItemId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLineItemId() {
            return this.lineItemId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.lineItemId, ((b) other).lineItemId);
        }

        public int hashCode() {
            return this.lineItemId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RemoveItem(lineItemId=", this.lineItemId, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.a$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/a$c;", "Lcom/whoop/universalcheckout/features/cart/domain/a;", "", "lineItemId", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC10658a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String lineItemId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int quantity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String lineItemId, int i13) {
            super(null);
            AbstractC22676k.m65750j(lineItemId, "lineItemId");
            this.lineItemId = lineItemId;
            this.quantity = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLineItemId() {
            return this.lineItemId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.lineItemId, cVar.lineItemId) && this.quantity == cVar.quantity;
        }

        public int hashCode() {
            return Integer.hashCode(this.quantity) + (this.lineItemId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.quantity, "UpdateQuantity(lineItemId=", this.lineItemId, ", quantity=", ")");
        }
    }

    public /* synthetic */ AbstractC10658a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10658a() {
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/a$a;", "Lcom/whoop/universalcheckout/features/cart/domain/a;", "", "cartId", "sku", "storeDomain", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10658a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String storeDomain;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final CartAddIntent addIntent;

        public a(String str, String str2, String str3, CartAddIntent cartAddIntent) {
            super(null);
            this.cartId = str;
            this.sku = str2;
            this.storeDomain = str3;
            this.addIntent = cartAddIntent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CartAddIntent getAddIntent() {
            return this.addIntent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStoreDomain() {
            return this.storeDomain;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.cartId, aVar.cartId) && AbstractC22676k.m65745e(this.sku, aVar.sku) && AbstractC22676k.m65745e(this.storeDomain, aVar.storeDomain) && AbstractC22676k.m65745e(this.addIntent, aVar.addIntent);
        }

        public int hashCode() {
            String str = this.cartId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sku;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storeDomain;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CartAddIntent cartAddIntent = this.addIntent;
            return iHashCode3 + (cartAddIntent != null ? cartAddIntent.hashCode() : 0);
        }

        public String toString() {
            String str = this.cartId;
            String str2 = this.sku;
            String str3 = this.storeDomain;
            CartAddIntent cartAddIntent = this.addIntent;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Load(cartId=", str, ", sku=", str2, ", storeDomain=");
            sbM32001t.append(str3);
            sbM32001t.append(", addIntent=");
            sbM32001t.append(cartAddIntent);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ a(String str, String str2, String str3, CartAddIntent cartAddIntent, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : cartAddIntent);
        }
    }
}
