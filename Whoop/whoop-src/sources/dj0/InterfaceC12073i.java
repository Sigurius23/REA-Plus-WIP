package dj0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ldj0/i;", "", "a", "b", "Ldj0/i$a;", "Ldj0/i$b;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12073i extends InterfaceC12075k {

    /* JADX INFO: renamed from: dj0.i$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, m65681d2 = {"Ldj0/i$a;", "Ldj0/i;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "getMetricValue", "metricValue", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12073i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String metricValue;

        public a(Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            this.exception = exception;
            this.metricValue = "InvalidParameterException";
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
            return "InvalidPhone(exception=" + this.exception + ")";
        }
    }

    /* JADX INFO: renamed from: dj0.i$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, m65681d2 = {"Ldj0/i$b;", "Ldj0/i;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "metricValue", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "getMetricValue", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12073i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Exception exception;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String metricValue;

        public b(Exception exception, String metricValue) {
            AbstractC22676k.m65750j(exception, "exception");
            AbstractC22676k.m65750j(metricValue, "metricValue");
            this.exception = exception;
            this.metricValue = metricValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.exception, bVar.exception) && AbstractC22676k.m65745e(this.metricValue, bVar.metricValue);
        }

        public int hashCode() {
            return this.metricValue.hashCode() + (this.exception.hashCode() * 31);
        }

        public String toString() {
            return "Other(exception=" + this.exception + ", metricValue=" + this.metricValue + ")";
        }
    }
}
