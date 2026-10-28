package zu1;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zu1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lzu1/a;", "", "a", "b", "c", "d", "Lzu1/a$a;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC41148a {

    /* JADX INFO: renamed from: zu1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lzu1/a$a;", "Lzu1/a;", "Lzu1/a$b;", "Lzu1/a$c;", "Lzu1/a$d;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC41148a {
    }

    /* JADX INFO: renamed from: zu1.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzu1/a$b;", "Lzu1/a$a;", "<init>", "()V", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public static final b f177446a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: zu1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzu1/a$c;", "Lzu1/a$a;", "", "offerId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String offerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public c(String offerId, String source) {
            AbstractC22676k.m65750j(offerId, "offerId");
            AbstractC22676k.m65750j(source, "source");
            this.offerId = offerId;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.offerId, cVar.offerId) && AbstractC22676k.m65745e(this.source, cVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.offerId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("NetworkError(offerId=", this.offerId, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: zu1.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lzu1/a$d;", "Lzu1/a$a;", "", "offerId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String offerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public d(String offerId, String source) {
            AbstractC22676k.m65750j(offerId, "offerId");
            AbstractC22676k.m65750j(source, "source");
            this.offerId = offerId;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.offerId, dVar.offerId) && AbstractC22676k.m65745e(this.source, dVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.offerId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("RequestFailed(offerId=", this.offerId, ", source=", this.source, ")");
        }
    }
}
