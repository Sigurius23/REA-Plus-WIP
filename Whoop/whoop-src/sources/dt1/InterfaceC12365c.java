package dt1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qk1.C30443a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dt1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Ldt1/c;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "k", "j", "l", "i", "c", "a", "b", "e", "d", "Ldt1/c$b;", "Ldt1/c$c;", "Ldt1/c$d;", "Ldt1/c$e;", "Ldt1/c$f;", "Ldt1/c$g;", "Ldt1/c$h;", "Ldt1/c$i;", "Ldt1/c$j;", "Ldt1/c$k;", "Ldt1/c$l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
interface InterfaceC12365c {

    /* JADX INFO: renamed from: dt1.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/c$a;", "Ldt1/c$h;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Instant timestamp;

        public a(Instant timestamp) {
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
            return (other instanceof a) && AbstractC22676k.m65745e(this.timestamp, ((a) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "DeleteError(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: dt1.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$b;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final b f41570a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/c$c;", "Ldt1/c;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12365c {

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
            return "Deleting(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: dt1.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$d;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final d f41572a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$e;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final e f41573a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$f;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final f f41574a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$g;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final g f41575a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Ldt1/c$h;", "Ldt1/c;", "Ldt1/c$a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface h extends InterfaceC12365c {
    }

    /* JADX INFO: renamed from: dt1.c$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$i;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final i f41576a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/c$j;", "Ldt1/c;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC12365c {

        /* JADX INFO: renamed from: a */
        public static final j f41577a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: dt1.c$k */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ldt1/c$k;", "Ldt1/c;", "Lqk1/a;", "response", "Ldt1/a;", "dialogState", "<init>", "(Lqk1/a;Ldt1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqk1/a;", "b", "()Lqk1/a;", "Ldt1/a;", "()Ldt1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC12365c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C30443a response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C12363a dialogState;

        public k(C30443a response, C12363a c12363a) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
            this.dialogState = c12363a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C12363a getDialogState() {
            return this.dialogState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C30443a getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.response, kVar.response) && AbstractC22676k.m65745e(this.dialogState, kVar.dialogState);
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            C12363a c12363a = this.dialogState;
            return iHashCode + (c12363a == null ? 0 : c12363a.hashCode());
        }

        public String toString() {
            return "Success(response=" + this.response + ", dialogState=" + this.dialogState + ")";
        }

        public /* synthetic */ k(C30443a c30443a, C12363a c12363a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c30443a, (i13 & 2) != 0 ? null : c12363a);
        }
    }

    /* JADX INFO: renamed from: dt1.c$l */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, m65681d2 = {"Ldt1/c$l;", "Ldt1/c;", "", "id", "Ljava/time/Instant;", "timestamp", "", "symptoms", "notes", "<init>", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "c", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC12365c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Instant timestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> symptoms;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String notes;

        public l(String id4, Instant timestamp, List<String> symptoms, String notes) {
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
        public final List<String> m34642c() {
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
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.id, lVar.id) && AbstractC22676k.m65745e(this.timestamp, lVar.timestamp) && AbstractC22676k.m65745e(this.symptoms, lVar.symptoms) && AbstractC22676k.m65745e(this.notes, lVar.notes);
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
