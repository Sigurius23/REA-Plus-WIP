package k22;

import c13.AbstractC3855a;
import m32.EnumC25009e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k22.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lk22/e;", "", "g", "c", "f", "d", "b", "a", "e", "Lk22/e$a;", "Lk22/e$b;", "Lk22/e$c;", "Lk22/e$d;", "Lk22/e$e;", "Lk22/e$f;", "Lk22/e$g;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22165e {

    /* JADX INFO: renamed from: k22.e$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lk22/e$a;", "Lk22/e;", "", "triggerRescan", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC22165e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean triggerRescan;

        public a(boolean z4) {
            this.triggerRescan = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getTriggerRescan() {
            return this.triggerRescan;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.triggerRescan == ((a) other).triggerRescan;
        }

        public int hashCode() {
            return Boolean.hashCode(this.triggerRescan);
        }

        public String toString() {
            return AbstractC3855a.m11827k("CloseTroubleConnecting(triggerRescan=", ")", this.triggerRescan);
        }
    }

    /* JADX INFO: renamed from: k22.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk22/e$b;", "Lk22/e;", "<init>", "()V", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC22165e {

        /* JADX INFO: renamed from: a */
        public static final b f85937a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: k22.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk22/e$c;", "Lk22/e;", "<init>", "()V", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC22165e {

        /* JADX INFO: renamed from: a */
        public static final c f85938a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: k22.e$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk22/e$d;", "Lk22/e;", "<init>", "()V", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC22165e {

        /* JADX INFO: renamed from: a */
        public static final d f85939a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: k22.e$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lk22/e$e;", "Lk22/e;", "Lm32/e;", "result", "<init>", "(Lm32/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm32/e;", "()Lm32/e;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC22165e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC25009e result;

        public e(EnumC25009e result) {
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC25009e getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.result == ((e) other).result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "RuntimePermissionResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: k22.e$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk22/e$f;", "Lk22/e;", "<init>", "()V", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC22165e {

        /* JADX INFO: renamed from: a */
        public static final f f85941a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: k22.e$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk22/e$g;", "Lk22/e;", "<init>", "()V", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC22165e {

        /* JADX INFO: renamed from: a */
        public static final g f85942a = new g();

        private g() {
        }
    }
}
