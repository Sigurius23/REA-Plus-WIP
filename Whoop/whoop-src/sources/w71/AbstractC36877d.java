package w71;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: w71.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lw71/d;", "", "<init>", "()V", "a", "b", "c", "d", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "j", "e", "g", "f", "Lw71/d$a;", "Lw71/d$b;", "Lw71/d$c;", "Lw71/d$d;", "Lw71/d$e;", "Lw71/d$f;", "Lw71/d$g;", "Lw71/d$h;", "Lw71/d$i;", "Lw71/d$j;", "Lw71/d$k;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36877d {

    /* JADX INFO: renamed from: a */
    public static final int f157722a = 0;

    /* JADX INFO: renamed from: w71.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw71/d$a;", "Lw71/d;", "", "questionId", "number", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer number;

        public a(int i13, Integer num) {
            super(null);
            this.questionId = i13;
            this.number = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.questionId == aVar.questionId && AbstractC22676k.m65745e(this.number, aVar.number);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Integer num = this.number;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ShowNumberPicker(questionId=" + this.questionId + ", number=" + this.number + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lw71/d$b;", "Lw71/d;", "", "questionId", "", "number", "<init>", "(ILjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Double;", "a", "()Ljava/lang/Double;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Double number;

        public b(int i13, Double d3) {
            super(null);
            this.questionId = i13;
            this.number = d3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.questionId == bVar.questionId && AbstractC22676k.m65745e(this.number, bVar.number);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Double d3 = this.number;
            return iHashCode + (d3 == null ? 0 : d3.hashCode());
        }

        public String toString() {
            return "ShowNumericAnswerForm(questionId=" + this.questionId + ", number=" + this.number + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw71/d$c;", "Lw71/d;", "", "questionId", "number", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer number;

        public c(int i13, Integer num) {
            super(null);
            this.questionId = i13;
            this.number = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.questionId == cVar.questionId && AbstractC22676k.m65745e(this.number, cVar.number);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Integer num = this.number;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ShowNumericScale(questionId=" + this.questionId + ", number=" + this.number + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lw71/d$d;", "Lw71/d;", "", "questionId", "", "time", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String time;

        public d(int i13, String str) {
            super(null);
            this.questionId = i13;
            this.time = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.questionId == dVar.questionId && AbstractC22676k.m65745e(this.time, dVar.time);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            String str = this.time;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.questionId, "ShowTimePicker(questionId=", ", time=", this.time, ")");
        }
    }

    /* JADX INFO: renamed from: w71.d$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw71/d$e;", "Lw71/d;", "", "questionId", "", "isChecked", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isChecked;

        public e(int i13, boolean z4) {
            super(null);
            this.questionId = i13;
            this.isChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.questionId == eVar.questionId && this.isChecked == eVar.isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked) + (Integer.hashCode(this.questionId) * 31);
        }

        public String toString() {
            return "UpdateCheckboxAnswer(questionId=" + this.questionId + ", isChecked=" + this.isChecked + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lw71/d$f;", "Lw71/d;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        public f(String str) {
            super(null);
            this.text = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.text, ((f) other).text);
        }

        public int hashCode() {
            String str = this.text;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateNotes(text=", this.text, ")");
        }
    }

    /* JADX INFO: renamed from: w71.d$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lw71/d$g;", "Lw71/d;", "", "questionId", "", "number", "<init>", "(ILjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Double;", "a", "()Ljava/lang/Double;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Double number;

        public g(int i13, Double d3) {
            super(null);
            this.questionId = i13;
            this.number = d3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.questionId == gVar.questionId && AbstractC22676k.m65745e(this.number, gVar.number);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Double d3 = this.number;
            return iHashCode + (d3 == null ? 0 : d3.hashCode());
        }

        public String toString() {
            return "UpdateNumericAnswer(questionId=" + this.questionId + ", number=" + this.number + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$h */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lw71/d$h;", "Lw71/d;", "", "questionId", "", "time", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String time;

        public h(int i13, String str) {
            super(null);
            this.questionId = i13;
            this.time = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTime() {
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
            return this.questionId == hVar.questionId && AbstractC22676k.m65745e(this.time, hVar.time);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            String str = this.time;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.questionId, "UpdateTimeAnswer(questionId=", ", time=", this.time, ")");
        }
    }

    /* JADX INFO: renamed from: w71.d$i */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lw71/d$i;", "Lw71/d;", "", "questionId", "", "time", "<init>", "(ILjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long time;

        public i(int i13, Long l7) {
            super(null);
            this.questionId = i13;
            this.time = l7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return this.questionId == iVar.questionId && AbstractC22676k.m65745e(this.time, iVar.time);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Long l7 = this.time;
            return iHashCode + (l7 == null ? 0 : l7.hashCode());
        }

        public String toString() {
            return "UpdateTimeSlider(questionId=" + this.questionId + ", time=" + this.time + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw71/d$j;", "Lw71/d;", "", "questionId", "", "boolean", "<init>", "(ILjava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Boolean boolean;

        public j(int i13, Boolean bool) {
            super(null);
            this.questionId = i13;
            this.boolean = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getBoolean() {
            return this.boolean;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return this.questionId == jVar.questionId && AbstractC22676k.m65745e(this.boolean, jVar.boolean);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Boolean bool = this.boolean;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "UpdateToggleAnswer(questionId=" + this.questionId + ", boolean=" + this.boolean + ")";
        }
    }

    /* JADX INFO: renamed from: w71.d$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw71/d$k;", "Lw71/d;", "", "questionId", "", "boolean", "<init>", "(ILjava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC36877d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Boolean boolean;

        public k(int i13, Boolean bool) {
            super(null);
            this.questionId = i13;
            this.boolean = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getBoolean() {
            return this.boolean;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return this.questionId == kVar.questionId && AbstractC22676k.m65745e(this.boolean, kVar.boolean);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.questionId) * 31;
            Boolean bool = this.boolean;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "UpdateYesNoAnswer(questionId=" + this.questionId + ", boolean=" + this.boolean + ")";
        }
    }

    public /* synthetic */ AbstractC36877d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36877d() {
    }
}
