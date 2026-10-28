package dj0;

import fj0.C14527a;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ldj0/m;", "", "b", "a", "Ldj0/m$a;", "Ldj0/m$b;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12077m {

    /* JADX INFO: renamed from: dj0.m$a */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ldj0/m$a;", "Ldj0/m;", "b", "a", "Ldj0/m$a$a;", "Ldj0/m$a$b;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC12077m {

        /* JADX INFO: renamed from: dj0.m$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001f"}, m65681d2 = {"Ldj0/m$a$a;", "Ldj0/m$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "statusCode", "", "signOutUser", "", "metricValue", "<init>", "(Ljava/lang/Exception;IZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "I", "d", "c", "Z", "()Z", "Ljava/lang/String;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41475a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Exception exception;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int statusCode;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean signOutUser;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String metricValue;

            public C41475a(Exception exception, int i13, boolean z4, String metricValue) {
                AbstractC22676k.m65750j(exception, "exception");
                AbstractC22676k.m65750j(metricValue, "metricValue");
                this.exception = exception;
                this.statusCode = i13;
                this.signOutUser = z4;
                this.metricValue = metricValue;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getMetricValue() {
                return this.metricValue;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getSignOutUser() {
                return this.signOutUser;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final int getStatusCode() {
                return this.statusCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41475a)) {
                    return false;
                }
                C41475a c41475a = (C41475a) other;
                return AbstractC22676k.m65745e(this.exception, c41475a.exception) && this.statusCode == c41475a.statusCode && this.signOutUser == c41475a.signOutUser && AbstractC22676k.m65745e(this.metricValue, c41475a.metricValue);
            }

            public int hashCode() {
                return this.metricValue.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.statusCode, this.exception.hashCode() * 31, 31), 31, this.signOutUser);
            }

            public String toString() {
                Exception exc = this.exception;
                int i13 = this.statusCode;
                boolean z4 = this.signOutUser;
                String str = this.metricValue;
                StringBuilder sb4 = new StringBuilder("Http(exception=");
                sb4.append(exc);
                sb4.append(", statusCode=");
                sb4.append(i13);
                sb4.append(", signOutUser=");
                return AbstractC21702c.m61139j(sb4, z4, ", metricValue=", str, ")");
            }
        }

        /* JADX INFO: renamed from: dj0.m$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldj0/m$a$b;", "Ldj0/m$a;", "<init>", "()V", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f40219a = new b();

            private b() {
            }
        }
    }

    /* JADX INFO: renamed from: dj0.m$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldj0/m$b;", "Ldj0/m;", "Lfj0/a;", "material", "<init>", "(Lfj0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj0/a;", "()Lfj0/a;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12077m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14527a material;

        public b(C14527a material) {
            AbstractC22676k.m65750j(material, "material");
            this.material = material;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14527a getMaterial() {
            return this.material;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.material, ((b) other).material);
        }

        public int hashCode() {
            return this.material.hashCode();
        }

        public String toString() {
            return "Success(material=" + this.material + ")";
        }
    }
}
