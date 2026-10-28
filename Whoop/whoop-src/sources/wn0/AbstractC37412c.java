package wn0;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: wn0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lwn0/c;", "", "<init>", "()V", "b", "c", "a", "Lwn0/c$a;", "Lwn0/c$b;", "Lwn0/c$c;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37412c {

    /* JADX INFO: renamed from: wn0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwn0/c$a;", "Lwn0/c;", "<init>", "()V", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC37412c {

        /* JADX INFO: renamed from: a */
        public static final a f160133a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wn0.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwn0/c$b;", "Lwn0/c;", "", "message", "", "isRetryable", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Z", "()Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37412c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isRetryable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.isRetryable = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.message, bVar.message) && this.isRetryable == bVar.isRetryable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRetryable) + (this.message.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("NetworkError(message=", this.message, ", isRetryable=", ")", this.isRetryable);
        }
    }

    /* JADX INFO: renamed from: wn0.c$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lwn0/c$c;", "Lwn0/c;", "", "httpCode", "", "serverMessage", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHttpCode", "b", "Ljava/lang/String;", "getServerMessage", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37412c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int httpCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String serverMessage;

        public c(int i13, String str) {
            super(null);
            this.httpCode = i13;
            this.serverMessage = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.httpCode == cVar.httpCode && AbstractC22676k.m65745e(this.serverMessage, cVar.serverMessage);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.httpCode) * 31;
            String str = this.serverMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.httpCode, "ServerError(httpCode=", ", serverMessage=", this.serverMessage, ")");
        }
    }

    public /* synthetic */ AbstractC37412c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37412c() {
    }
}
