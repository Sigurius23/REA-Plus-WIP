package qw1;

import c13.AbstractC3855a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lqw1/b;", "", "c", "b", "d", "a", "Lqw1/b$a;", "Lqw1/b$b;", "Lqw1/b$c;", "Lqw1/b$d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC30688b {

    /* JADX INFO: renamed from: qw1.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqw1/b$a;", "Lqw1/b;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC30688b {

        /* JADX INFO: renamed from: a */
        public static final a f126256a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: qw1.b$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lqw1/b$b;", "Lqw1/b;", "", "emailText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC30688b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String emailText;

        public b(String emailText) {
            AbstractC22676k.m65750j(emailText, "emailText");
            this.emailText = emailText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmailText() {
            return this.emailText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.emailText, ((b) other).emailText);
        }

        public int hashCode() {
            return this.emailText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("EnterEmailText(emailText=", this.emailText, ")");
        }
    }

    /* JADX INFO: renamed from: qw1.b$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lqw1/b$c;", "Lqw1/b;", "", "isNewMember", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC30688b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isNewMember;

        public c(boolean z4) {
            this.isNewMember = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsNewMember() {
            return this.isNewMember;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.isNewMember == ((c) other).isNewMember;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNewMember);
        }

        public String toString() {
            return AbstractC3855a.m11827k("FetchFamilyInviteScreen(isNewMember=", ")", this.isNewMember);
        }
    }

    /* JADX INFO: renamed from: qw1.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lqw1/b$d;", "Lqw1/b;", "", "emailText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC30688b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String emailText;

        public d(String emailText) {
            AbstractC22676k.m65750j(emailText, "emailText");
            this.emailText = emailText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmailText() {
            return this.emailText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.emailText, ((d) other).emailText);
        }

        public int hashCode() {
            return this.emailText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SubmitEmailText(emailText=", this.emailText, ")");
        }
    }
}
