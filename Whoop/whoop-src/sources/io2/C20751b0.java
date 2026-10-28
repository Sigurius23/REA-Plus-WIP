package io2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p31.AbstractC28805p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: io2.b0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Jl\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b,\u0010\u0015R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b)\u0010.¨\u0006/"}, m65681d2 = {"Lio2/b0;", "Lm91/u;", "Lp31/p;", "header", "Ly71/o;", "paymentMethodTile", "truemedPaymentMenuItem", "", "Lkd1/o;", "acceptedPaymentMethods", "", "cartId", "source", "", "", "analyticsProperties", "<init>", "(Lp31/p;Ly71/o;Ly71/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Lp31/p;Ly71/o;Ly71/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio2/b0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp31/p;", "g", "()Lp31/p;", "b", "Ly71/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly71/o;", "c", "j", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/lang/String;", "f", "i", "Ljava/util/Map;", "()Ljava/util/Map;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20751b0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC28805p header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o paymentMethodTile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39282o truemedPaymentMenuItem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<AbstractC22403o> acceptedPaymentMethods;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<String, Object> analyticsProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public C20751b0(AbstractC28805p header, C39282o paymentMethodTile, C39282o c39282o, List<? extends AbstractC22403o> acceptedPaymentMethods, String cartId, String source, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(source, "source");
        this.header = header;
        this.paymentMethodTile = paymentMethodTile;
        this.truemedPaymentMenuItem = c39282o;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.cartId = cartId;
        this.source = source;
        this.analyticsProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20751b0 m57124b(C20751b0 c20751b0, AbstractC28805p abstractC28805p, C39282o c39282o, C39282o c39282o2, List list, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC28805p = c20751b0.header;
        }
        if ((i13 & 2) != 0) {
            c39282o = c20751b0.paymentMethodTile;
        }
        if ((i13 & 4) != 0) {
            c39282o2 = c20751b0.truemedPaymentMenuItem;
        }
        if ((i13 & 8) != 0) {
            list = c20751b0.acceptedPaymentMethods;
        }
        if ((i13 & 16) != 0) {
            str = c20751b0.cartId;
        }
        if ((i13 & 32) != 0) {
            str2 = c20751b0.source;
        }
        if ((i13 & 64) != 0) {
            map = c20751b0.analyticsProperties;
        }
        String str3 = str2;
        Map map2 = map;
        String str4 = str;
        C39282o c39282o3 = c39282o2;
        return c20751b0.m57125a(abstractC28805p, c39282o, c39282o3, list, str4, str3, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C20751b0 m57125a(AbstractC28805p header, C39282o paymentMethodTile, C39282o truemedPaymentMenuItem, List<? extends AbstractC22403o> acceptedPaymentMethods, String cartId, String source, Map<String, ? extends Object> analyticsProperties) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(source, "source");
        return new C20751b0(header, paymentMethodTile, truemedPaymentMenuItem, acceptedPaymentMethods, cartId, source, analyticsProperties);
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC22403o> m57126c() {
        return this.acceptedPaymentMethods;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m57127e() {
        return this.analyticsProperties;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20751b0)) {
            return false;
        }
        C20751b0 c20751b0 = (C20751b0) other;
        return AbstractC22676k.m65745e(this.header, c20751b0.header) && AbstractC22676k.m65745e(this.paymentMethodTile, c20751b0.paymentMethodTile) && AbstractC22676k.m65745e(this.truemedPaymentMenuItem, c20751b0.truemedPaymentMenuItem) && AbstractC22676k.m65745e(this.acceptedPaymentMethods, c20751b0.acceptedPaymentMethods) && AbstractC22676k.m65745e(this.cartId, c20751b0.cartId) && AbstractC22676k.m65745e(this.source, c20751b0.source) && AbstractC22676k.m65745e(this.analyticsProperties, c20751b0.analyticsProperties);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC28805p getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C39282o getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public int hashCode() {
        int iHashCode = (this.paymentMethodTile.hashCode() + (this.header.hashCode() * 31)) * 31;
        C39282o c39282o = this.truemedPaymentMenuItem;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (c39282o == null ? 0 : c39282o.hashCode())) * 31, 31, this.acceptedPaymentMethods), 31, this.cartId), 31, this.source);
        Map<String, Object> map = this.analyticsProperties;
        return iM30450d + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C39282o getTruemedPaymentMenuItem() {
        return this.truemedPaymentMenuItem;
    }

    public String toString() {
        AbstractC28805p abstractC28805p = this.header;
        C39282o c39282o = this.paymentMethodTile;
        C39282o c39282o2 = this.truemedPaymentMenuItem;
        List<AbstractC22403o> list = this.acceptedPaymentMethods;
        String str = this.cartId;
        String str2 = this.source;
        Map<String, Object> map = this.analyticsProperties;
        StringBuilder sb4 = new StringBuilder("PaymentMethodTileViewState(header=");
        sb4.append(abstractC28805p);
        sb4.append(", paymentMethodTile=");
        sb4.append(c39282o);
        sb4.append(", truemedPaymentMenuItem=");
        sb4.append(c39282o2);
        sb4.append(", acceptedPaymentMethods=");
        sb4.append(list);
        sb4.append(", cartId=");
        AbstractC11266d.m30444B(sb4, str, ", source=", str2, ", analyticsProperties=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }
}
