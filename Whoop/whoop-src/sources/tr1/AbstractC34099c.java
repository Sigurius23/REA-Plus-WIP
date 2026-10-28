package tr1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: tr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Ltr1/c;", "", "<init>", "()V", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "a", "e", "c", "b", "Ltr1/c$a;", "Ltr1/c$b;", "Ltr1/c$c;", "Ltr1/c$d;", "Ltr1/c$e;", "Ltr1/c$f;", "Ltr1/c$g;", "Ltr1/c$h;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34099c {

    /* JADX INFO: renamed from: tr1.c$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Ltr1/c$a;", "Ltr1/c;", "Ltr1/f;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        public a(int i13) {
            super(null);
            this.id = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.id == ((a) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "DeselectAnswer(id=", ")");
        }
    }

    /* JADX INFO: renamed from: tr1.c$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ltr1/c$b;", "Ltr1/c;", "Ltr1/e;", "", "id", "", "magnitude", "<init>", "(ID)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "getMagnitude", "()D", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34099c implements InterfaceC34101e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double magnitude;

        public b(int i13, double d3) {
            super(null);
            this.id = i13;
            this.magnitude = d3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.id == bVar.id && Double.compare(this.magnitude, bVar.magnitude) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.magnitude) + (Integer.hashCode(this.id) * 31);
        }

        public String toString() {
            return "ShowNumericAnswerForm(id=" + this.id + ", magnitude=" + this.magnitude + ")";
        }
    }

    /* JADX INFO: renamed from: tr1.c$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m65681d2 = {"Ltr1/c$c;", "Ltr1/c;", "Ltr1/e;", "", "id", "", "time", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getTime", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC34099c implements InterfaceC34101e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, String time) {
            super(null);
            AbstractC22676k.m65750j(time, "time");
            this.id = i13;
            this.time = time;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.id == cVar.id && AbstractC22676k.m65745e(this.time, cVar.time);
        }

        public int hashCode() {
            return this.time.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.id, "ShowTimePicker(id=", ", time=", this.time, ")");
        }
    }

    /* JADX INFO: renamed from: tr1.c$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ltr1/c$d;", "Ltr1/c;", "Ltr1/f;", "", "id", "", "answer", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean answer;

        public d(int i13, boolean z4) {
            super(null);
            this.id = i13;
            this.answer = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAnswer() {
            return this.answer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.id == dVar.id && this.answer == dVar.answer;
        }

        public int hashCode() {
            return Boolean.hashCode(this.answer) + (Integer.hashCode(this.id) * 31);
        }

        public String toString() {
            return "UpdateBooleanAnswer(id=" + this.id + ", answer=" + this.answer + ")";
        }
    }

    /* JADX INFO: renamed from: tr1.c$e */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltr1/c$e;", "Ltr1/c;", "Ltr1/f;", "", "id", "", "magnitude", "<init>", "(ILjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Double magnitude;

        public e(int i13, Double d3) {
            super(null);
            this.id = i13;
            this.magnitude = d3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getMagnitude() {
            return this.magnitude;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.id == eVar.id && AbstractC22676k.m65745e(this.magnitude, eVar.magnitude);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            Double d3 = this.magnitude;
            return iHashCode + (d3 == null ? 0 : d3.hashCode());
        }

        public String toString() {
            return "UpdateMagnitudeAnswer(id=" + this.id + ", magnitude=" + this.magnitude + ")";
        }
    }

    /* JADX INFO: renamed from: tr1.c$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Ltr1/c$f;", "Ltr1/c;", "Ltr1/f;", "", "notes", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String notes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String notes) {
            super(null);
            AbstractC22676k.m65750j(notes, "notes");
            this.notes = notes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.notes, ((f) other).notes);
        }

        public int hashCode() {
            return this.notes.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateNotes(notes=", this.notes, ")");
        }
    }

    /* JADX INFO: renamed from: tr1.c$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, m65681d2 = {"Ltr1/c$g;", "Ltr1/c;", "Ltr1/f;", "", "id", "", "time", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i13, String time) {
            super(null);
            AbstractC22676k.m65750j(time, "time");
            this.id = i13;
            this.time = time;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.id == gVar.id && AbstractC22676k.m65745e(this.time, gVar.time);
        }

        public int hashCode() {
            return this.time.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.id, "UpdateTimeAnswer(id=", ", time=", this.time, ")");
        }
    }

    /* JADX INFO: renamed from: tr1.c$h */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltr1/c$h;", "Ltr1/c;", "Ltr1/f;", "", "id", "", "time", "<init>", "(IJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "J", "()J", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC34099c implements InterfaceC34102f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long time;

        public h(int i13, long j7) {
            super(null);
            this.id = i13;
            this.time = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return this.id == hVar.id && this.time == hVar.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time) + (Integer.hashCode(this.id) * 31);
        }

        public String toString() {
            return "UpdateTimeSliderAnswer(id=" + this.id + ", time=" + this.time + ")";
        }
    }

    public /* synthetic */ AbstractC34099c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34099c() {
    }
}
