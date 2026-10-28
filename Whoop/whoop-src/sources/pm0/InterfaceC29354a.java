package pm0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lpm0/a;", "T", "", "e", "b", "d", "c", "a", "Lpm0/a$a;", "Lpm0/a$b;", "Lpm0/a$e;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29354a<T> {

    /* JADX INFO: renamed from: pm0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lpm0/a$a;", "T", "Lpm0/a;", "getData", "()Ljava/lang/Object;", "data", "b", "a", "Lpm0/a$a$a;", "Lpm0/a$a$b;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a<T> extends InterfaceC29354a<T> {

        /* JADX INFO: renamed from: pm0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lpm0/a$a$a;", "T", "Lpm0/a$a;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42173a<T> implements a<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final T data;

            public C42173a(T t14) {
                this.data = t14;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42173a) && AbstractC22676k.m65745e(this.data, ((C42173a) other).data);
            }

            @Override // pm0.InterfaceC29354a.a
            public T getData() {
                return this.data;
            }

            public int hashCode() {
                T t14 = this.data;
                if (t14 == null) {
                    return 0;
                }
                return t14.hashCode();
            }

            public String toString() {
                return AbstractC18489d0.m53369j(this.data, "Success(data=", ")");
            }
        }

        /* JADX INFO: renamed from: pm0.a$a$b */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lpm0/a$a$b;", "T", "Lpm0/a$a;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b<T> implements a<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final T data;

            public b(T t14) {
                this.data = t14;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.data, ((b) other).data);
            }

            @Override // pm0.InterfaceC29354a.a
            public T getData() {
                return this.data;
            }

            public int hashCode() {
                T t14 = this.data;
                if (t14 == null) {
                    return 0;
                }
                return t14.hashCode();
            }

            public String toString() {
                return AbstractC18489d0.m53369j(this.data, "Updating(data=", ")");
            }
        }

        T getData();
    }

    /* JADX INFO: renamed from: pm0.a$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lpm0/a$b;", "T", "Lpm0/a;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "errorMessage", "", "b", "()I", "httpStatusCode", "Lpm0/a$c;", "Lpm0/a$d;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b<T> implements InterfaceC29354a<T> {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getErrorMessage();

        /* JADX INFO: renamed from: b */
        public abstract int getHttpStatusCode();

        private b() {
        }
    }

    /* JADX INFO: renamed from: pm0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lpm0/a$c;", "T", "Lpm0/a$b;", "", "errorMessage", "", "httpStatusCode", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c<T> extends b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int httpStatusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String errorMessage, int i13) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.httpStatusCode = i13;
        }

        @Override // pm0.InterfaceC29354a.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // pm0.InterfaceC29354a.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.errorMessage, cVar.errorMessage) && this.httpStatusCode == cVar.httpStatusCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.httpStatusCode) + (this.errorMessage.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.httpStatusCode, "ErrorNoData(errorMessage=", this.errorMessage, ", httpStatusCode=", ")");
        }

        public /* synthetic */ c(String str, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i14 & 2) != 0 ? 0 : i13);
        }
    }

    /* JADX INFO: renamed from: pm0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lpm0/a$d;", "T", "Lpm0/a$b;", "", "errorMessage", "", "httpStatusCode", "data", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d<T> extends b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int httpStatusCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final T data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String errorMessage, int i13, T t14) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.httpStatusCode = i13;
            this.data = t14;
        }

        @Override // pm0.InterfaceC29354a.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // pm0.InterfaceC29354a.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.errorMessage, dVar.errorMessage) && this.httpStatusCode == dVar.httpStatusCode && AbstractC22676k.m65745e(this.data, dVar.data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.httpStatusCode, this.errorMessage.hashCode() * 31, 31);
            T t14 = this.data;
            return iM30448b + (t14 == null ? 0 : t14.hashCode());
        }

        public String toString() {
            String str = this.errorMessage;
            int i13 = this.httpStatusCode;
            return AbstractC2875y.m8303p(AbstractC11266d.m30467u(i13, "ErrorWithData(errorMessage=", str, ", httpStatusCode=", ", data="), ")", this.data);
        }
    }

    /* JADX INFO: renamed from: pm0.a$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lpm0/a$e;", "T", "Lpm0/a;", "", "loading", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLoading", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e<T> implements InterfaceC29354a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int loading;

        public e(int i13) {
            this.loading = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.loading == ((e) other).loading;
        }

        public int hashCode() {
            return Integer.hashCode(this.loading);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.loading, "Loading(loading=", ")");
        }
    }
}
