package a03;

import com.whoop.whoopstatus.domain.model.WhoopStatusResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a03.d */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"La03/d;", "", "b", "a", "c", "La03/d$a;", "La03/d$b;", "La03/d$c;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC0101d {

    /* JADX INFO: renamed from: a03.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"La03/d$a;", "La03/d;", "<init>", "()V", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public static final a f324a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a03.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"La03/d$b;", "La03/d;", "<init>", "()V", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC0101d {

        /* JADX INFO: renamed from: a */
        public static final b f325a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: a03.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"La03/d$c;", "La03/d;", "Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;", "whoopStatusResponse", "<init>", "(Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;", "()Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC0101d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WhoopStatusResponse whoopStatusResponse;

        public c(WhoopStatusResponse whoopStatusResponse) {
            AbstractC22676k.m65750j(whoopStatusResponse, "whoopStatusResponse");
            this.whoopStatusResponse = whoopStatusResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WhoopStatusResponse getWhoopStatusResponse() {
            return this.whoopStatusResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.whoopStatusResponse, ((c) other).whoopStatusResponse);
        }

        public int hashCode() {
            return this.whoopStatusResponse.hashCode();
        }

        public String toString() {
            return "Result(whoopStatusResponse=" + this.whoopStatusResponse + ")";
        }
    }
}
