package vn0;

import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vn0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lvn0/b;", "", "<init>", "()V", "c", "f", "e", "d", "a", "b", "Lvn0/b$a;", "Lvn0/b$b;", "Lvn0/b$c;", "Lvn0/b$d;", "Lvn0/b$e;", "Lvn0/b$f;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36192b {

    /* JADX INFO: renamed from: vn0.b$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvn0/b$a;", "Lvn0/b;", "", "isVisible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36192b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isVisible;

        public a(boolean z4) {
            super(null);
            this.isVisible = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isVisible == ((a) other).isVisible;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVisible);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ChangePasswordVisibility(isVisible=", ")", this.isVisible);
        }
    }

    /* JADX INFO: renamed from: vn0.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvn0/b$b;", "Lvn0/b;", "<init>", "()V", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36192b {

        /* JADX INFO: renamed from: a */
        public static final b f154930a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vn0.b$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lvn0/b$c;", "Lvn0/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36192b {

        /* JADX INFO: renamed from: a */
        public static final c f154931a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -148013660;
        }

        public String toString() {
            return "FetchRequirements";
        }
    }

    /* JADX INFO: renamed from: vn0.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lvn0/b$d;", "Lvn0/b;", "", "oldPassword", "newPassword", "confirmPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36192b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String oldPassword;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String newPassword;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String confirmPassword;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String oldPassword, String newPassword, String confirmPassword) {
            super(null);
            AbstractC22676k.m65750j(oldPassword, "oldPassword");
            AbstractC22676k.m65750j(newPassword, "newPassword");
            AbstractC22676k.m65750j(confirmPassword, "confirmPassword");
            this.oldPassword = oldPassword;
            this.newPassword = newPassword;
            this.confirmPassword = confirmPassword;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConfirmPassword() {
            return this.confirmPassword;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNewPassword() {
            return this.newPassword;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOldPassword() {
            return this.oldPassword;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.oldPassword, dVar.oldPassword) && AbstractC22676k.m65745e(this.newPassword, dVar.newPassword) && AbstractC22676k.m65745e(this.confirmPassword, dVar.confirmPassword);
        }

        public int hashCode() {
            return this.confirmPassword.hashCode() + AbstractC11266d.m30450d(this.oldPassword.hashCode() * 31, 31, this.newPassword);
        }

        public String toString() {
            return "SubmitChangePassword(oldPassword=REDACTED, newPassword=REDACTED, confirmPassword=REDACTED)";
        }
    }

    /* JADX INFO: renamed from: vn0.b$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvn0/b$e;", "Lvn0/b;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC36192b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String password;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String password) {
            super(null);
            AbstractC22676k.m65750j(password, "password");
            this.password = password;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.password, ((e) other).password);
        }

        public int hashCode() {
            return this.password.hashCode();
        }

        public String toString() {
            return "UpdateConfirmPassword(password=REDACTED)";
        }
    }

    /* JADX INFO: renamed from: vn0.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvn0/b$f;", "Lvn0/b;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC36192b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String password;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String password) {
            super(null);
            AbstractC22676k.m65750j(password, "password");
            this.password = password;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.password, ((f) other).password);
        }

        public int hashCode() {
            return this.password.hashCode();
        }

        public String toString() {
            return "UpdateNewPassword(password=REDACTED)";
        }
    }

    public /* synthetic */ AbstractC36192b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36192b() {
    }
}
