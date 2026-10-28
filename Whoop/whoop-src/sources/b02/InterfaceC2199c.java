package b02;

import androidx.core.app.NotificationCompat;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: b02.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lb02/c;", "", "m", "g", "j", "k", "l", "i", "b", "a", "d", "e", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lb02/c$i;", "Lb02/c$m;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC2199c {

    /* JADX INFO: renamed from: b02.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lb02/c$a;", "Lb02/c$i;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "intent", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CartAddIntent intent;

        public a(CartAddIntent intent) {
            AbstractC22676k.m65750j(intent, "intent");
            this.intent = intent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CartAddIntent getIntent() {
            return this.intent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.intent, ((a) other).intent);
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        public String toString() {
            return "AddToCart(intent=" + this.intent + ")";
        }
    }

    /* JADX INFO: renamed from: b02.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lb02/c$b;", "Lb02/c$i;", "<init>", "()V", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements i {

        /* JADX INFO: renamed from: a */
        public static final b f8745a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: b02.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lb02/c$c;", "Lb02/c$i;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements i {

        /* JADX INFO: renamed from: b */
        public static final int f8746b = C9598e.f28134d;

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

    /* JADX INFO: renamed from: b02.c$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lb02/c$d;", "Lb02/c$i;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "intent", "", "storeDomain", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "b", "Ljava/lang/String;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CartAddIntent intent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String storeDomain;

        public d(CartAddIntent intent, String str) {
            AbstractC22676k.m65750j(intent, "intent");
            this.intent = intent;
            this.storeDomain = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CartAddIntent getIntent() {
            return this.intent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStoreDomain() {
            return this.storeDomain;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.intent, dVar.intent) && AbstractC22676k.m65745e(this.storeDomain, dVar.storeDomain);
        }

        public int hashCode() {
            int iHashCode = this.intent.hashCode() * 31;
            String str = this.storeDomain;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BuyNow(intent=" + this.intent + ", storeDomain=" + this.storeDomain + ")";
        }
    }

    /* JADX INFO: renamed from: b02.c$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lb02/c$e;", "Lb02/c$i;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements i {

        /* JADX INFO: renamed from: b */
        public static final int f8750b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public e(C9598e navAction) {
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
            return (other instanceof e) && AbstractC22676k.m65745e(this.navAction, ((e) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("CartClicked(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: b02.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lb02/c$f;", "", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", "<init>", "(Lcom/whoop/navigation/e;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC2199c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CartAddIntent addIntent;

        public f(C9598e destination, CartAddIntent cartAddIntent) {
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
            this.addIntent = cartAddIntent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CartAddIntent getAddIntent() {
            return this.addIntent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.destination, fVar.destination) && AbstractC22676k.m65745e(this.addIntent, fVar.addIntent);
        }

        public int hashCode() {
            int iHashCode = this.destination.hashCode() * 31;
            CartAddIntent cartAddIntent = this.addIntent;
            return iHashCode + (cartAddIntent == null ? 0 : cartAddIntent.hashCode());
        }

        public String toString() {
            return "CheckoutFooterClicked(destination=" + this.destination + ", addIntent=" + this.addIntent + ")";
        }
    }

    /* JADX INFO: renamed from: b02.c$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lb02/c$g;", "Lb02/c$m;", "", "slug", "sku", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String slug;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public g(String slug, String str, String str2) {
            AbstractC22676k.m65750j(slug, "slug");
            this.slug = slug;
            this.sku = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.slug, gVar.slug) && AbstractC22676k.m65745e(this.sku, gVar.sku) && AbstractC22676k.m65745e(this.source, gVar.source);
        }

        public int hashCode() {
            int iHashCode = this.slug.hashCode() * 31;
            String str = this.sku;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC11895b.m32001t("FetchPdp(slug=", this.slug, ", sku=", this.sku, ", source="));
        }
    }

    /* JADX INFO: renamed from: b02.c$h */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lb02/c$h;", "", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lm91/u;", "getElement", "()Lm91/u;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC2199c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        public h(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.event, hVar.event) && AbstractC22676k.m65745e(this.element, hVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    /* JADX INFO: renamed from: b02.c$i */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lb02/c$i;", "Lb02/c;", "Lb02/c$a;", "Lb02/c$b;", "Lb02/c$c;", "Lb02/c$d;", "Lb02/c$e;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface i extends InterfaceC2199c {
    }

    /* JADX INFO: renamed from: b02.c$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lb02/c$j;", "Lb02/c$m;", "", "slug", "sku", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String slug;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public j(String slug, String str, String str2) {
            AbstractC22676k.m65750j(slug, "slug");
            this.slug = slug;
            this.sku = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.slug, jVar.slug) && AbstractC22676k.m65745e(this.sku, jVar.sku) && AbstractC22676k.m65745e(this.source, jVar.source);
        }

        public int hashCode() {
            int iHashCode = this.slug.hashCode() * 31;
            String str = this.sku;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC11895b.m32001t("Retry(slug=", this.slug, ", sku=", this.sku, ", source="));
        }
    }

    /* JADX INFO: renamed from: b02.c$k */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lb02/c$k;", "Lb02/c$m;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "", "optionKey", "", "variantIndex", "packItemId", "packItemProductKey", "<init>", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "b", "Ljava/lang/String;", "c", "I", "e", "d", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SelectorLevel level;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String optionKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int variantIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String packItemId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String packItemProductKey;

        public k(SelectorLevel level, String optionKey, int i13, String str, String str2) {
            AbstractC22676k.m65750j(level, "level");
            AbstractC22676k.m65750j(optionKey, "optionKey");
            this.level = level;
            this.optionKey = optionKey;
            this.variantIndex = i13;
            this.packItemId = str;
            this.packItemProductKey = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SelectorLevel getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOptionKey() {
            return this.optionKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPackItemId() {
            return this.packItemId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPackItemProductKey() {
            return this.packItemProductKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getVariantIndex() {
            return this.variantIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return this.level == kVar.level && AbstractC22676k.m65745e(this.optionKey, kVar.optionKey) && this.variantIndex == kVar.variantIndex && AbstractC22676k.m65745e(this.packItemId, kVar.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, kVar.packItemProductKey);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.variantIndex, AbstractC11266d.m30450d(this.level.hashCode() * 31, 31, this.optionKey), 31);
            String str = this.packItemId;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packItemProductKey;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            SelectorLevel selectorLevel = this.level;
            String str = this.optionKey;
            int i13 = this.variantIndex;
            String str2 = this.packItemId;
            String str3 = this.packItemProductKey;
            StringBuilder sb4 = new StringBuilder("SelectVariant(level=");
            sb4.append(selectorLevel);
            sb4.append(", optionKey=");
            sb4.append(str);
            sb4.append(", variantIndex=");
            AbstractC11895b.m31979B(i13, ", packItemId=", str2, ", packItemProductKey=", sb4);
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: b02.c$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lb02/c$l;", "Lb02/c$m;", "", "tagId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String tagId;

        public l(String tagId) {
            AbstractC22676k.m65750j(tagId, "tagId");
            this.tagId = tagId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.tagId, ((l) other).tagId);
        }

        public int hashCode() {
            return this.tagId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectWywTag(tagId=", this.tagId, ")");
        }
    }

    /* JADX INFO: renamed from: b02.c$m */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lb02/c$m;", "Lb02/c;", "Lb02/c$g;", "Lb02/c$j;", "Lb02/c$k;", "Lb02/c$l;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface m extends InterfaceC2199c {
    }
}
