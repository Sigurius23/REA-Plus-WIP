package e32;

import b32.C2675a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Le32/b;", "", "d", "b", "a", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "e", "Le32/b$a;", "Le32/b$b;", "Le32/b$c;", "Le32/b$d;", "Le32/b$e;", "Le32/b$f;", "Le32/b$g;", "Le32/b$h;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12615b {

    /* JADX INFO: renamed from: e32.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Le32/b$a;", "Le32/b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC12615b {

        /* JADX INFO: renamed from: a */
        public static final a f43068a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: e32.b$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Le32/b$b;", "Le32/b;", "Lb32/a;", "paymentMethodInfo", "", "screenName", "<init>", "(Lb32/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb32/a;", "()Lb32/a;", "b", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12615b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C2675a paymentMethodInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screenName;

        public b(C2675a c2675a, String screenName) {
            AbstractC22676k.m65750j(screenName, "screenName");
            this.paymentMethodInfo = c2675a;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C2675a getPaymentMethodInfo() {
            return this.paymentMethodInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.paymentMethodInfo, bVar.paymentMethodInfo) && AbstractC22676k.m65745e(this.screenName, bVar.screenName);
        }

        public int hashCode() {
            C2675a c2675a = this.paymentMethodInfo;
            return this.screenName.hashCode() + ((c2675a == null ? 0 : c2675a.hashCode()) * 31);
        }

        public String toString() {
            return "Completed(paymentMethodInfo=" + this.paymentMethodInfo + ", screenName=" + this.screenName + ")";
        }
    }

    /* JADX INFO: renamed from: e32.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Le32/b$c;", "Le32/b;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12615b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Throwable error;

        public c(Throwable error) {
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.error, ((c) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114681i("Failed(error=", ")", this.error);
        }
    }

    /* JADX INFO: renamed from: e32.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Le32/b$d;", "Le32/b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC12615b {

        /* JADX INFO: renamed from: a */
        public static final d f43072a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: e32.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Le32/b$e;", "Le32/b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC12615b {

        /* JADX INFO: renamed from: a */
        public static final e f43073a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: e32.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Le32/b$f;", "Le32/b;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC12615b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Throwable error;

        public f(Throwable error) {
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.error, ((f) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114681i("UpdateDefaultPaymentMethodFailed(error=", ")", this.error);
        }
    }

    /* JADX INFO: renamed from: e32.b$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Le32/b$g;", "Le32/b;", "", "paymentMethodId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC12615b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String paymentMethodId;

        public g(String paymentMethodId) {
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            this.paymentMethodId = paymentMethodId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.paymentMethodId, ((g) other).paymentMethodId);
        }

        public int hashCode() {
            return this.paymentMethodId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateDefaultPaymentMethodSucceeded(paymentMethodId=", this.paymentMethodId, ")");
        }
    }

    /* JADX INFO: renamed from: e32.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Le32/b$h;", "Le32/b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC12615b {

        /* JADX INFO: renamed from: a */
        public static final h f43076a = new h();

        private h() {
        }
    }
}
