package wn2;

import com.whoop.navigation.C9598e;
import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wn2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lwn2/i;", "", "d", "a", "b", "f", "e", "c", "Lwn2/i$a;", "Lwn2/i$b;", "Lwn2/i$c;", "Lwn2/i$d;", "Lwn2/i$e;", "Lwn2/i$f;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37431i {

    /* JADX INFO: renamed from: wn2.i$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lwn2/i$a;", "Lwn2/i;", "Lcom/whoop/navigation/e;", "checkoutDestination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC37431i {

        /* JADX INFO: renamed from: b */
        public static final int f160226b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e checkoutDestination;

        public a(C9598e checkoutDestination) {
            AbstractC22676k.m65750j(checkoutDestination, "checkoutDestination");
            this.checkoutDestination = checkoutDestination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getCheckoutDestination() {
            return this.checkoutDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.checkoutDestination, ((a) other).checkoutDestination);
        }

        public int hashCode() {
            return this.checkoutDestination.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("DirectCheckout(checkoutDestination=", this.checkoutDestination, ")");
        }
    }

    /* JADX INFO: renamed from: wn2.i$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b \u0010\u0010¨\u0006%"}, m65681d2 = {"Lwn2/i$c;", "Lwn2/i;", "", "title", "", "Lwn2/g;", "sections", "Lm91/u;", "checkoutFooter", "analyticsSubtotalValue", "Lcom/whoop/navigation/e;", "checkoutDestination", "paymentMethodId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lcom/whoop/navigation/e;", "getCheckoutDestination", "()Lcom/whoop/navigation/e;", "f", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC37431i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C37429g> sections;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> checkoutFooter;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String analyticsSubtotalValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C9598e checkoutDestination;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String paymentMethodId;

        /* JADX WARN: Multi-variable type inference failed */
        public c(String title, List<C37429g> sections, List<? extends InterfaceC25312u> checkoutFooter, String analyticsSubtotalValue, C9598e checkoutDestination, String paymentMethodId) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(checkoutFooter, "checkoutFooter");
            AbstractC22676k.m65750j(analyticsSubtotalValue, "analyticsSubtotalValue");
            AbstractC22676k.m65750j(checkoutDestination, "checkoutDestination");
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            this.title = title;
            this.sections = sections;
            this.checkoutFooter = checkoutFooter;
            this.analyticsSubtotalValue = analyticsSubtotalValue;
            this.checkoutDestination = checkoutDestination;
            this.paymentMethodId = paymentMethodId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsSubtotalValue() {
            return this.analyticsSubtotalValue;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m119833b() {
            return this.checkoutFooter;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        /* JADX INFO: renamed from: d */
        public final List<C37429g> m119835d() {
            return this.sections;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.checkoutFooter, cVar.checkoutFooter) && AbstractC22676k.m65745e(this.analyticsSubtotalValue, cVar.analyticsSubtotalValue) && AbstractC22676k.m65745e(this.checkoutDestination, cVar.checkoutDestination) && AbstractC22676k.m65745e(this.paymentMethodId, cVar.paymentMethodId);
        }

        public int hashCode() {
            return this.paymentMethodId.hashCode() + AbstractC36095b.m114673a(this.checkoutDestination, AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections), 31, this.checkoutFooter), 31, this.analyticsSubtotalValue), 31);
        }

        public String toString() {
            String str = this.title;
            List<C37429g> list = this.sections;
            List<InterfaceC25312u> list2 = this.checkoutFooter;
            String str2 = this.analyticsSubtotalValue;
            C9598e c9598e = this.checkoutDestination;
            String str3 = this.paymentMethodId;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("Loaded(title=", str, ", sections=", ", checkoutFooter=", list);
            AbstractC17176i.m48511m(", analyticsSubtotalValue=", str2, ", checkoutDestination=", sbM94766o, list2);
            sbM94766o.append(c9598e);
            sbM94766o.append(", paymentMethodId=");
            sbM94766o.append(str3);
            sbM94766o.append(")");
            return sbM94766o.toString();
        }
    }

    /* JADX INFO: renamed from: wn2.i$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwn2/i$d;", "Lwn2/i;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC37431i {

        /* JADX INFO: renamed from: a */
        public static final d f160237a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: wn2.i$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwn2/i$e;", "Lwn2/i;", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC37431i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        public e(String cartId) {
            AbstractC22676k.m65750j(cartId, "cartId");
            this.cartId = cartId;
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
            return this.cartId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OrderPlaced(cartId=", this.cartId, ")");
        }
    }

    /* JADX INFO: renamed from: wn2.i$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwn2/i$f;", "Lwn2/i;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC37431i {

        /* JADX INFO: renamed from: a */
        public static final f f160239a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: wn2.i$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwn2/i$b;", "Lwn2/i;", "", "title", "message", "Lwn2/e$i;", "retry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lwn2/e$i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lwn2/e$i;", "()Lwn2/e$i;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC37431i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC37427e.i retry;

        public b(String str, String str2, InterfaceC37427e.i retry) {
            AbstractC22676k.m65750j(retry, "retry");
            this.title = str;
            this.message = str2;
            this.retry = retry;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC37427e.i getRetry() {
            return this.retry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.message, bVar.message) && AbstractC22676k.m65745e(this.retry, bVar.retry);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            return this.retry.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.message;
            InterfaceC37427e.i iVar = this.retry;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Error(title=", str, ", message=", str2, ", retry=");
            sbM32001t.append(iVar);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ b(String str, String str2, InterfaceC37427e.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? InterfaceC37427e.g.f160185a : iVar);
        }
    }
}
