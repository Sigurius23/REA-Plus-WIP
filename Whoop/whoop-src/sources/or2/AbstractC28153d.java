package or2;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: or2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lor2/d;", "", "<init>", "()V", "g", "b", "a", "e", "d", "c", "f", "Lor2/d$a;", "Lor2/d$b;", "Lor2/d$c;", "Lor2/d$d;", "Lor2/d$e;", "Lor2/d$f;", "Lor2/d$g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28153d {

    /* JADX INFO: renamed from: or2.d$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lor2/d$a;", "Lor2/d;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28153d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        public a(boolean z4) {
            super(null);
            this.success = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.success == ((a) other).success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ChangePassword(success=", ")", this.success);
        }
    }

    /* JADX INFO: renamed from: or2.d$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lor2/d$b;", "Lor2/d;", "", "isValid", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC28153d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isValid;

        public b(boolean z4) {
            super(null);
            this.isValid = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isValid == ((b) other).isValid;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isValid);
        }

        public String toString() {
            return AbstractC3855a.m11827k("EnterConfirmPassword(isValid=", ")", this.isValid);
        }
    }

    /* JADX INFO: renamed from: or2.d$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lor2/d$c;", "Lor2/d;", "", "success", "", "reason", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28153d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, String reason) {
            super(null);
            AbstractC22676k.m65750j(reason, "reason");
            this.success = z4;
            this.reason = reason;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.success == cVar.success && AbstractC22676k.m65745e(this.reason, cVar.reason);
        }

        public int hashCode() {
            return this.reason.hashCode() + (Boolean.hashCode(this.success) * 31);
        }

        public String toString() {
            return AbstractC3855a.m11825i("RefreshToken(success=", ", reason=", this.reason, ")", this.success);
        }
    }

    /* JADX INFO: renamed from: or2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lor2/d$d;", "Lor2/d;", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC28153d {

        /* JADX INFO: renamed from: a */
        public static final d f113834a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: or2.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lor2/d$e;", "Lor2/d;", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC28153d {

        /* JADX INFO: renamed from: a */
        public static final e f113835a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: or2.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lor2/d$f;", "Lor2/d;", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC28153d {

        /* JADX INFO: renamed from: a */
        public static final f f113836a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: or2.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lor2/d$g;", "Lor2/d;", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC28153d {

        /* JADX INFO: renamed from: a */
        public static final g f113837a = new g();

        private g() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC28153d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28153d() {
    }
}
