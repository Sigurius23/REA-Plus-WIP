package dt1;

import com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dt1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, m65681d2 = {"Ldt1/g;", "", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "j", "k", "c", "a", "b", "i", "f", "e", "Ldt1/g$a;", "Ldt1/g$b;", "Ldt1/g$c;", "Ldt1/g$d;", "Ldt1/g$e;", "Ldt1/g$f;", "Ldt1/g$g;", "Ldt1/g$h;", "Ldt1/g$i;", "Ldt1/g$j;", "Ldt1/g$k;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12369g {

    /* JADX INFO: renamed from: dt1.g$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/g$a;", "Ldt1/g;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12369g {

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

    /* JADX INFO: renamed from: dt1.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$b;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final b f41604a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/g$c;", "Ldt1/g;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Instant;", "()Ljava/time/Instant;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12369g {

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

    /* JADX INFO: renamed from: dt1.g$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldt1/g$d;", "Ldt1/g;", "Ldt1/a;", "dialogState", "<init>", "(Ldt1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldt1/a;", "()Ldt1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC12369g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12363a dialogState;

        public d(C12363a c12363a) {
            this.dialogState = c12363a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C12363a getDialogState() {
            return this.dialogState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.dialogState, ((d) other).dialogState);
        }

        public int hashCode() {
            C12363a c12363a = this.dialogState;
            if (c12363a == null) {
                return 0;
            }
            return c12363a.hashCode();
        }

        public String toString() {
            return "Error(dialogState=" + this.dialogState + ")";
        }

        public /* synthetic */ d(C12363a c12363a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : c12363a);
        }
    }

    /* JADX INFO: renamed from: dt1.g$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$e;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final e f41607a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$f;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final f f41608a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$h;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final h f41613a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$i;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final i f41614a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldt1/g$j;", "Ldt1/g;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC12369g {

        /* JADX INFO: renamed from: a */
        public static final j f41615a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: dt1.g$k */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, m65681d2 = {"Ldt1/g$k;", "Ldt1/g;", "", "id", "Ljava/time/Instant;", "timestamp", "", "symptoms", "notes", "<init>", "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "c", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC12369g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Instant timestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> symptoms;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String notes;

        public k(String id4, Instant timestamp, List<String> symptoms, String notes) {
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
        public final List<String> m34665c() {
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
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.id, kVar.id) && AbstractC22676k.m65745e(this.timestamp, kVar.timestamp) && AbstractC22676k.m65745e(this.symptoms, kVar.symptoms) && AbstractC22676k.m65745e(this.notes, kVar.notes);
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

    /* JADX INFO: renamed from: dt1.g$g */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Ldt1/g$g;", "Ldt1/g;", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "domain", "Ldt1/a;", "dialogState", "", "pdfPath", "", "sharingPdf", "<init>", "(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;Z)V", "a", "(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;Z)Ldt1/g$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "d", "()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "b", "Ldt1/a;", "c", "()Ldt1/a;", "Ljava/lang/String;", "e", "Z", "f", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC12369g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LabradorDetailsDomainHolder domain;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C12363a dialogState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String pdfPath;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean sharingPdf;

        public g(LabradorDetailsDomainHolder domain, C12363a c12363a, String str, boolean z4) {
            AbstractC22676k.m65750j(domain, "domain");
            this.domain = domain;
            this.dialogState = c12363a;
            this.pdfPath = str;
            this.sharingPdf = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ g m34657b(g gVar, LabradorDetailsDomainHolder labradorDetailsDomainHolder, C12363a c12363a, String str, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                labradorDetailsDomainHolder = gVar.domain;
            }
            if ((i13 & 2) != 0) {
                c12363a = gVar.dialogState;
            }
            if ((i13 & 4) != 0) {
                str = gVar.pdfPath;
            }
            if ((i13 & 8) != 0) {
                z4 = gVar.sharingPdf;
            }
            return gVar.m34658a(labradorDetailsDomainHolder, c12363a, str, z4);
        }

        /* JADX INFO: renamed from: a */
        public final g m34658a(LabradorDetailsDomainHolder domain, C12363a dialogState, String pdfPath, boolean sharingPdf) {
            AbstractC22676k.m65750j(domain, "domain");
            return new g(domain, dialogState, pdfPath, sharingPdf);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C12363a getDialogState() {
            return this.dialogState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LabradorDetailsDomainHolder getDomain() {
            return this.domain;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPdfPath() {
            return this.pdfPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.domain, gVar.domain) && AbstractC22676k.m65745e(this.dialogState, gVar.dialogState) && AbstractC22676k.m65745e(this.pdfPath, gVar.pdfPath) && this.sharingPdf == gVar.sharingPdf;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getSharingPdf() {
            return this.sharingPdf;
        }

        public int hashCode() {
            int iHashCode = this.domain.hashCode() * 31;
            C12363a c12363a = this.dialogState;
            int iHashCode2 = (iHashCode + (c12363a == null ? 0 : c12363a.hashCode())) * 31;
            String str = this.pdfPath;
            return Boolean.hashCode(this.sharingPdf) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            LabradorDetailsDomainHolder labradorDetailsDomainHolder = this.domain;
            C12363a c12363a = this.dialogState;
            String str = this.pdfPath;
            boolean z4 = this.sharingPdf;
            StringBuilder sb4 = new StringBuilder("Loaded(domain=");
            sb4.append(labradorDetailsDomainHolder);
            sb4.append(", dialogState=");
            sb4.append(c12363a);
            sb4.append(", pdfPath=");
            return AbstractC21702c.m61137h(sb4, str, ", sharingPdf=", z4, ")");
        }

        public /* synthetic */ g(LabradorDetailsDomainHolder labradorDetailsDomainHolder, C12363a c12363a, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(labradorDetailsDomainHolder, (i13 & 2) != 0 ? null : c12363a, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? false : z4);
        }
    }
}
