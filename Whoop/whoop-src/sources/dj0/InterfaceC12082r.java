package dj0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Ldj0/r;", "", "b", "a", "c", "Ldj0/r$a;", "Ldj0/r$b;", "Ldj0/r$c;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12082r extends InterfaceC12084t {

    /* JADX INFO: renamed from: dj0.r$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, m65681d2 = {"Ldj0/r$a;", "Ldj0/r;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "getMetricValue", "metricValue", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12082r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String metricValue;

        public a(Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            this.exception = exception;
            this.metricValue = "ExpiredCodeException";
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Exception getException() {
            return this.exception;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.exception, ((a) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "ExpiredCode(exception=" + this.exception + ")";
        }
    }

    /* JADX INFO: renamed from: dj0.r$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, m65681d2 = {"Ldj0/r$b;", "Ldj0/r;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "getMetricValue", "metricValue", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12082r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String metricValue;

        public b(Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            this.exception = exception;
            this.metricValue = "CodeMismatchException";
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Exception getException() {
            return this.exception;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.exception, ((b) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "IncorrectCode(exception=" + this.exception + ")";
        }
    }

    /* JADX INFO: renamed from: dj0.r$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Ldj0/r$c;", "Ldj0/r;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "metricValue", "", "statusCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "c", "I", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12082r {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String metricValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int statusCode;

        public c(Exception exception, String metricValue, int i13) {
            AbstractC22676k.m65750j(exception, "exception");
            AbstractC22676k.m65750j(metricValue, "metricValue");
            this.exception = exception;
            this.metricValue = metricValue;
            this.statusCode = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Exception getException() {
            return this.exception;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getMetricValue() {
            return this.metricValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.exception, cVar.exception) && AbstractC22676k.m65745e(this.metricValue, cVar.metricValue) && this.statusCode == cVar.statusCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.statusCode) + AbstractC11266d.m30450d(this.exception.hashCode() * 31, 31, this.metricValue);
        }

        public String toString() {
            Exception exc = this.exception;
            String str = this.metricValue;
            int i13 = this.statusCode;
            StringBuilder sb4 = new StringBuilder("Other(exception=");
            sb4.append(exc);
            sb4.append(", metricValue=");
            sb4.append(str);
            sb4.append(", statusCode=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }
    }
}
