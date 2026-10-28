package jx1;

import com.whoop.metrics.common.ScreenState;
import com.whoop.payments.domain.models.Card;
import fy1.InterfaceC14875k;
import java.util.List;
import java.util.Map;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jx1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ljx1/o;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "d", "c", "a", "e", "b", "Ljx1/o$a;", "Ljx1/o$b;", "Ljx1/o$c;", "Ljx1/o$d;", "Ljx1/o$e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22025o implements InterfaceC14875k {

    /* JADX INFO: renamed from: jx1.o$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljx1/o$a;", "Ljx1/o;", "", "", "payload", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22025o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> payload;

        public a(Map<String, String> map) {
            super(null);
            this.payload = map;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m62956b() {
            return this.payload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.payload, ((a) other).payload);
        }

        public int hashCode() {
            Map<String, String> map = this.payload;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public String toString() {
            return AbstractC26725a.m79504h("Error(payload=", ")", this.payload);
        }
    }

    /* JADX INFO: renamed from: jx1.o$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ljx1/o$b;", "Ljx1/o;", "", "", "fetchPayload", "path", "checkoutPayload", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "e", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22025o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> fetchPayload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Map<String, String> checkoutPayload;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Card card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> fetchPayload, String path, Map<String, String> map, Card card) {
            super(null);
            AbstractC22676k.m65750j(fetchPayload, "fetchPayload");
            AbstractC22676k.m65750j(path, "path");
            this.fetchPayload = fetchPayload;
            this.path = path;
            this.checkoutPayload = map;
            this.card = card;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: c */
        public final Map<String, String> m62958c() {
            return this.checkoutPayload;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, String> m62959d() {
            return this.fetchPayload;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.fetchPayload, bVar.fetchPayload) && AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.checkoutPayload, bVar.checkoutPayload) && AbstractC22676k.m65745e(this.card, bVar.card);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.fetchPayload.hashCode() * 31, 31, this.path);
            Map<String, String> map = this.checkoutPayload;
            int iHashCode = (iM30450d + (map == null ? 0 : map.hashCode())) * 31;
            Card card = this.card;
            return iHashCode + (card != null ? card.hashCode() : 0);
        }

        public String toString() {
            return "FailedCheckout(fetchPayload=" + this.fetchPayload + ", path=" + this.path + ", checkoutPayload=" + this.checkoutPayload + ", card=" + this.card + ")";
        }
    }

    /* JADX INFO: renamed from: jx1.o$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ljx1/o$c;", "Ljx1/o;", "", "navigationBarTitle", "", "Ljx1/f0;", "sections", "Ljx1/n;", "style", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljx1/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljx1/n;", "()Ljx1/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22025o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String navigationBarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C22015f0> sections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC22024n style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String navigationBarTitle, List<C22015f0> sections, EnumC22024n style) {
            super(null);
            AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(style, "style");
            this.navigationBarTitle = navigationBarTitle;
            this.sections = sections;
            this.style = style;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNavigationBarTitle() {
            return this.navigationBarTitle;
        }

        /* JADX INFO: renamed from: c */
        public final List<C22015f0> m62962c() {
            return this.sections;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC22024n getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationBarTitle, cVar.navigationBarTitle) && AbstractC22676k.m65745e(this.sections, cVar.sections) && this.style == cVar.style;
        }

        public int hashCode() {
            return this.style.hashCode() + AbstractC11895b.m31983b(this.navigationBarTitle.hashCode() * 31, 31, this.sections);
        }

        public String toString() {
            String str = this.navigationBarTitle;
            List<C22015f0> list = this.sections;
            EnumC22024n enumC22024n = this.style;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("Loaded(navigationBarTitle=", str, ", sections=", ", style=", list);
            sbM94766o.append(enumC22024n);
            sbM94766o.append(")");
            return sbM94766o.toString();
        }
    }

    /* JADX INFO: renamed from: jx1.o$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/o$d;", "Ljx1/o;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22025o {

        /* JADX INFO: renamed from: b */
        public static final d f85414b = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jx1.o$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/o$e;", "Ljx1/o;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC22025o {

        /* JADX INFO: renamed from: b */
        public static final e f85415b = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC22025o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof d) {
            return ScreenState.LOADING;
        }
        if ((this instanceof a) || (this instanceof b)) {
            return ScreenState.ERROR;
        }
        if ((this instanceof c) || (this instanceof e)) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC22025o() {
    }
}
