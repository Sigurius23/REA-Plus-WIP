package io2;

import com.whoop.navigation.C9598e;
import p31.AbstractC28805p;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y71.C39282o;

/* JADX INFO: renamed from: io2.d0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, m65681d2 = {"Lio2/d0;", "Lm91/u;", "Lp31/p;", "header", "Ly71/o;", "body", "Lcom/whoop/navigation/e;", "destination", "", "cartId", "<init>", "(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "a", "(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;)Lio2/d0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp31/p;", "f", "()Lp31/p;", "b", "Ly71/o;", "c", "()Ly71/o;", "Lcom/whoop/navigation/e;", "e", "()Lcom/whoop/navigation/e;", "d", "Ljava/lang/String;", "getCartId", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20755d0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f77961e = (C9598e.f28134d | C39282o.f168987q) | AbstractC28805p.f116590a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC28805p header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cartId;

    public C20755d0(AbstractC28805p abstractC28805p, C39282o c39282o, C9598e destination, String str) {
        AbstractC22676k.m65750j(destination, "destination");
        this.header = abstractC28805p;
        this.body = c39282o;
        this.destination = destination;
        this.cartId = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20755d0 m57142b(C20755d0 c20755d0, AbstractC28805p abstractC28805p, C39282o c39282o, C9598e c9598e, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC28805p = c20755d0.header;
        }
        if ((i13 & 2) != 0) {
            c39282o = c20755d0.body;
        }
        if ((i13 & 4) != 0) {
            c9598e = c20755d0.destination;
        }
        if ((i13 & 8) != 0) {
            str = c20755d0.cartId;
        }
        return c20755d0.m57143a(abstractC28805p, c39282o, c9598e, str);
    }

    /* JADX INFO: renamed from: a */
    public final C20755d0 m57143a(AbstractC28805p header, C39282o body, C9598e destination, String cartId) {
        AbstractC22676k.m65750j(destination, "destination");
        return new C20755d0(header, body, destination, cartId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39282o getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20755d0)) {
            return false;
        }
        C20755d0 c20755d0 = (C20755d0) other;
        return AbstractC22676k.m65745e(this.header, c20755d0.header) && AbstractC22676k.m65745e(this.body, c20755d0.body) && AbstractC22676k.m65745e(this.destination, c20755d0.destination) && AbstractC22676k.m65745e(this.cartId, c20755d0.cartId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC28805p getHeader() {
        return this.header;
    }

    public int hashCode() {
        AbstractC28805p abstractC28805p = this.header;
        int iHashCode = (abstractC28805p == null ? 0 : abstractC28805p.hashCode()) * 31;
        C39282o c39282o = this.body;
        int iM114673a = AbstractC36095b.m114673a(this.destination, (iHashCode + (c39282o == null ? 0 : c39282o.hashCode())) * 31, 31);
        String str = this.cartId;
        return iM114673a + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PreviewTileState(header=" + this.header + ", body=" + this.body + ", destination=" + this.destination + ", cartId=" + this.cartId + ")";
    }

    public /* synthetic */ C20755d0(AbstractC28805p abstractC28805p, C39282o c39282o, C9598e c9598e, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC28805p, c39282o, c9598e, (i13 & 8) != 0 ? null : str);
    }
}
