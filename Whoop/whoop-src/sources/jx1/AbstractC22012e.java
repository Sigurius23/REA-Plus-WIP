package jx1;

import com.whoop.payments.domain.models.Card;
import java.util.Map;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jx1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ljx1/e;", "", "<init>", "()V", "b", "c", "a", "Ljx1/e$a;", "Ljx1/e$b;", "Ljx1/e$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22012e {

    /* JADX INFO: renamed from: jx1.e$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljx1/e$a;", "Ljx1/e;", "", "path", "", "payload", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22012e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Card card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String path, Map<String, String> map, Card card) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
            this.payload = map;
            this.card = card;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: c */
        public final Map<String, String> m62912c() {
            return this.payload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.payload, aVar.payload) && AbstractC22676k.m65745e(this.card, aVar.card);
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            Map<String, String> map = this.payload;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Card card = this.card;
            return iHashCode2 + (card != null ? card.hashCode() : 0);
        }

        public String toString() {
            String str = this.path;
            Map<String, String> map = this.payload;
            Card card = this.card;
            StringBuilder sbM114686n = AbstractC36095b.m114686n("Error(path=", str, ", payload=", ", card=", map);
            sbM114686n.append(card);
            sbM114686n.append(")");
            return sbM114686n.toString();
        }
    }

    /* JADX INFO: renamed from: jx1.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/e$b;", "Ljx1/e;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22012e {

        /* JADX INFO: renamed from: a */
        public static final b f85352a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jx1.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/e$c;", "Ljx1/e;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22012e {

        /* JADX INFO: renamed from: a */
        public static final c f85353a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC22012e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22012e() {
    }
}
