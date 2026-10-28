package g22;

import c13.AbstractC3855a;
import java.util.Map;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g22.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lg22/c;", "", "b", "a", "Lg22/c$a;", "Lg22/c$b;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC15283c {

    /* JADX INFO: renamed from: g22.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lg22/c$a;", "Lg22/c;", "", "path", "", "payload", "strapSerial", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC15283c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> payload;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String strapSerial;

        public a(String path, Map<String, String> payload, String strapSerial) {
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(strapSerial, "strapSerial");
            this.path = path;
            this.payload = payload;
            this.strapSerial = strapSerial;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m43390b() {
            return this.payload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStrapSerial() {
            return this.strapSerial;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.payload, aVar.payload) && AbstractC22676k.m65745e(this.strapSerial, aVar.strapSerial);
        }

        public int hashCode() {
            return this.strapSerial.hashCode() + AbstractC3855a.m11821e(this.payload, this.path.hashCode() * 31, 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.strapSerial, ")", AbstractC36095b.m114686n("AdjustMembership(path=", this.path, ", payload=", ", strapSerial=", this.payload));
        }
    }

    /* JADX INFO: renamed from: g22.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lg22/c$b;", "Lg22/c;", "", "strapSerial", "strapSignature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC15283c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String strapSerial;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String strapSignature;

        public b(String strapSerial, String strapSignature) {
            AbstractC22676k.m65750j(strapSerial, "strapSerial");
            AbstractC22676k.m65750j(strapSignature, "strapSignature");
            this.strapSerial = strapSerial;
            this.strapSignature = strapSignature;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStrapSerial() {
            return this.strapSerial;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStrapSignature() {
            return this.strapSignature;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.strapSerial, bVar.strapSerial) && AbstractC22676k.m65745e(this.strapSignature, bVar.strapSignature);
        }

        public int hashCode() {
            return this.strapSignature.hashCode() + (this.strapSerial.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("FetchMembershipAdjustmentScreen(strapSerial=", this.strapSerial, ", strapSignature=", this.strapSignature, ")");
        }
    }
}
