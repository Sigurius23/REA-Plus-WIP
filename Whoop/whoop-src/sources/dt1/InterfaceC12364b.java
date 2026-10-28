package dt1;

import com.whoop.labrador.feature.details.domain.model.LabradorDetailsResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!À\u0006\u0003"}, m65681d2 = {"Ldt1/b;", "", "j", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "o", "d", "m", "p", "b", "c", "l", "n", "e", "g", "f", "k", "a", "Ldt1/b$a;", "Ldt1/b$c;", "Ldt1/b$d;", "Ldt1/b$e;", "Ldt1/b$f;", "Ldt1/b$g;", "Ldt1/b$h;", "Ldt1/b$i;", "Ldt1/b$j;", "Ldt1/b$k;", "Ldt1/b$l;", "Ldt1/b$m;", "Ldt1/b$n;", "Ldt1/b$o;", "Ldt1/b$p;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
interface InterfaceC12364b {

    /* JADX INFO: renamed from: dt1.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$a;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final a f41551a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/b$b;", "Ldt1/b$j;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Instant timestamp;

        public b(Instant timestamp) {
            AbstractC22676k.m65750j(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.timestamp, ((b) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Delete(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: dt1.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/b$c;", "Ldt1/b;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12364b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Instant timestamp;

        public c(Instant timestamp) {
            AbstractC22676k.m65750j(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.timestamp, ((c) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "DeleteError(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: dt1.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$d;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final d f41554a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$e;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final e f41555a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$f;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final f f41556a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$g;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final g f41557a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$h;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final h f41558a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$i;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final i f41559a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Ldt1/b$j;", "Ldt1/b;", "Ldt1/b$b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface j extends InterfaceC12364b {
    }

    /* JADX INFO: renamed from: dt1.b$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$k;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final k f41560a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$l;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final l f41561a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$m;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final m f41562a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/b$n;", "Ldt1/b;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC12364b {

        /* JADX INFO: renamed from: a */
        public static final n f41563a = new n();

        private n() {
        }
    }

    /* JADX INFO: renamed from: dt1.b$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/b$o;", "Ldt1/b;", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;", "response", "<init>", "(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;", "()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements InterfaceC12364b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LabradorDetailsResponse response;

        public o(LabradorDetailsResponse response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LabradorDetailsResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.response, ((o) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: dt1.b$p */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, m65681d2 = {"Ldt1/b$p;", "Ldt1/b;", "", "id", "Ljava/time/Instant;", "timestamp", "", "symptoms", "notes", "<init>", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "c", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements InterfaceC12364b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Instant timestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> symptoms;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String notes;

        public p(String id4, Instant timestamp, List<String> symptoms, String notes) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(timestamp, "timestamp");
            AbstractC22676k.m65750j(symptoms, "symptoms");
            AbstractC22676k.m65750j(notes, "notes");
            this.id = id4;
            this.timestamp = timestamp;
            this.symptoms = symptoms;
            this.notes = notes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* JADX INFO: renamed from: c */
        public final List<String> m34634c() {
            return this.symptoms;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.id, pVar.id) && AbstractC22676k.m65745e(this.timestamp, pVar.timestamp) && AbstractC22676k.m65745e(this.symptoms, pVar.symptoms) && AbstractC22676k.m65745e(this.notes, pVar.notes);
        }

        public int hashCode() {
            return this.notes.hashCode() + AbstractC11895b.m31983b(AbstractC21702c.m61131b(this.timestamp, this.id.hashCode() * 31, 31), 31, this.symptoms);
        }

        public String toString() {
            String str = this.id;
            Instant instant = this.timestamp;
            List<String> list = this.symptoms;
            String str2 = this.notes;
            StringBuilder sb4 = new StringBuilder("UpdateError(id=");
            sb4.append(str);
            sb4.append(", timestamp=");
            sb4.append(instant);
            sb4.append(", symptoms=");
            return AbstractC38963t7.m124377g(", notes=", str2, ")", sb4, list);
        }
    }
}
