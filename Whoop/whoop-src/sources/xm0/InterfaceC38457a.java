package xm0;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lxm0/a;", "T", "", "b", "a", "c", "Lxm0/a$a;", "Lxm0/a$b;", "Lxm0/a$c;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38457a<T> {

    /* JADX INFO: renamed from: xm0.a$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0003\t\n\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lxm0/a$a;", "T", "Lxm0/a;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "errorMessage", "c", "b", "Lxm0/a$a$a;", "Lxm0/a$a$b;", "Lxm0/a$a$c;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a<T> implements InterfaceC38457a<T> {

        /* JADX INFO: renamed from: xm0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lxm0/a$a$a;", "T", "Lxm0/a$a;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42658a<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String errorMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42658a(String errorMessage) {
                super(null);
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            @Override // xm0.InterfaceC38457a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getErrorMessage() {
                return this.errorMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42658a) && AbstractC22676k.m65745e(this.errorMessage, ((C42658a) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("Deserialization(errorMessage=", this.errorMessage, ")");
            }
        }

        /* JADX INFO: renamed from: xm0.a$a$b */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lxm0/a$a$b;", "T", "Lxm0/a$a;", "", "errorMessage", "", "httpStatusCode", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String errorMessage;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int httpStatusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String errorMessage, int i13) {
                super(null);
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
                this.httpStatusCode = i13;
            }

            @Override // xm0.InterfaceC38457a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getHttpStatusCode() {
                return this.httpStatusCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.errorMessage, bVar.errorMessage) && this.httpStatusCode == bVar.httpStatusCode;
            }

            public int hashCode() {
                return Integer.hashCode(this.httpStatusCode) + (this.errorMessage.hashCode() * 31);
            }

            public String toString() {
                return AbstractC11895b.m31993l(this.httpStatusCode, "HttpException(errorMessage=", this.errorMessage, ", httpStatusCode=", ")");
            }
        }

        /* JADX INFO: renamed from: xm0.a$a$c */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lxm0/a$a$c;", "T", "Lxm0/a$a;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c<T> extends a<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String errorMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String errorMessage) {
                super(null);
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            @Override // xm0.InterfaceC38457a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getErrorMessage() {
                return this.errorMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.errorMessage, ((c) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("IOException(errorMessage=", this.errorMessage, ")");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getErrorMessage();

        private a() {
        }
    }

    /* JADX INFO: renamed from: xm0.a$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lxm0/a$b;", "T", "Lxm0/a;", "", "loading", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLoading", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b<T> implements InterfaceC38457a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int loading;

        public b(int i13) {
            this.loading = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.loading == ((b) other).loading;
        }

        public int hashCode() {
            return Integer.hashCode(this.loading);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.loading, "Loading(loading=", ")");
        }

        public /* synthetic */ b(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13);
        }
    }

    /* JADX INFO: renamed from: xm0.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxm0/a$c;", "T", "Lxm0/a;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c<T> implements InterfaceC38457a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final T data;

        public c(T t14) {
            this.data = t14;
        }

        /* JADX INFO: renamed from: a */
        public final T m123246a() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.data, ((c) other).data);
        }

        public int hashCode() {
            T t14 = this.data;
            if (t14 == null) {
                return 0;
            }
            return t14.hashCode();
        }

        public String toString() {
            return AbstractC18489d0.m53369j(this.data, "SuccessfulResponse(data=", ")");
        }
    }
}
