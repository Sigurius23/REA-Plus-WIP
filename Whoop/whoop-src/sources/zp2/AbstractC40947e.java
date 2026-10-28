package zp2;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: zp2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lzp2/e;", "", "<init>", "()V", "d", "b", "a", "c", "e", "Lzp2/e$a;", "Lzp2/e$b;", "Lzp2/e$c;", "Lzp2/e$d;", "Lzp2/e$e;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40947e {

    /* JADX INFO: renamed from: zp2.e$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lzp2/e$a;", "Lzp2/e;", "", "year", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40947e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int year;

        public a(int i13) {
            super(null);
            this.year = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.year == ((a) other).year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.year, "Backward(year=", ")");
        }
    }

    /* JADX INFO: renamed from: zp2.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lzp2/e$b;", "Lzp2/e;", "", "year", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40947e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int year;

        public b(int i13) {
            super(null);
            this.year = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.year == ((b) other).year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.year, "Forward(year=", ")");
        }
    }

    /* JADX INFO: renamed from: zp2.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzp2/e$c;", "Lzp2/e;", "<init>", "()V", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC40947e {

        /* JADX INFO: renamed from: a */
        public static final c f176687a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: zp2.e$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lzp2/e$d;", "Lzp2/e;", "", "year", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40947e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int year;

        public d(int i13) {
            super(null);
            this.year = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.year == ((d) other).year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.year, "Refresh(year=", ")");
        }
    }

    /* JADX INFO: renamed from: zp2.e$e */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lzp2/e$e;", "Lzp2/e;", "", "year", "", "text", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC40947e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int year;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13, String text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.year = i13;
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.year == eVar.year && AbstractC22676k.m65745e(this.text, eVar.text);
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.year) * 31);
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.year, "TimeCapsuleSubmit(year=", ", text=", this.text, ")");
        }
    }

    public /* synthetic */ AbstractC40947e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40947e() {
    }
}
