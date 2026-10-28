package sn2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sn2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lsn2/f;", "", "a", "c", "b", "Lsn2/f$a;", "Lsn2/f$b;", "Lsn2/f$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32780f {

    /* JADX INFO: renamed from: sn2.f$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lsn2/f$a;", "Lsn2/f;", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "cartId", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC32780f {

        /* JADX INFO: renamed from: c */
        public static final int f136440c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cartId;

        public a(C9598e navigation, String cartId) {
            AbstractC22676k.m65750j(navigation, "navigation");
            AbstractC22676k.m65750j(cartId, "cartId");
            this.navigation = navigation;
            this.cartId = cartId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavigation() {
            return this.navigation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.navigation, aVar.navigation) && AbstractC22676k.m65745e(this.cartId, aVar.cartId);
        }

        public int hashCode() {
            return this.cartId.hashCode() + (this.navigation.hashCode() * 31);
        }

        public String toString() {
            return "DirectCheckout(navigation=" + this.navigation + ", cartId=" + this.cartId + ")";
        }
    }

    /* JADX INFO: renamed from: sn2.f$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lsn2/f$b;", "Lsn2/f;", "", "reason", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC32780f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String reason;

        public b(String reason) {
            AbstractC22676k.m65750j(reason, "reason");
            this.reason = reason;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.reason, ((b) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Invalid(reason=", this.reason, ")");
        }
    }

    /* JADX INFO: renamed from: sn2.f$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsn2/f$c;", "Lsn2/f;", "Lsn2/i;", "content", "<init>", "(Lsn2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsn2/i;", "()Lsn2/i;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC32780f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32783i content;

        public c(C32783i content) {
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32783i getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.content, ((c) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Sheet(content=" + this.content + ")";
        }
    }
}
