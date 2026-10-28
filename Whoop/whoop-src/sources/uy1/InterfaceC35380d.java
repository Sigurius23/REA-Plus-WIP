package uy1;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uy1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Luy1/d;", "", "d", "a", "c", "b", "Luy1/d$a;", "Luy1/d$b;", "Luy1/d$c;", "Luy1/d$d;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC35380d {

    /* JADX INFO: renamed from: uy1.d$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Luy1/d$a;", "Luy1/d;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC35380d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        public a(boolean z4) {
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
            return AbstractC3855a.m11827k("DisableFinished(success=", ")", this.success);
        }
    }

    /* JADX INFO: renamed from: uy1.d$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Luy1/d$b;", "Luy1/d;", "Luy1/g;", "methodType", "", "method", "<init>", "(Luy1/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luy1/g;", "b", "()Luy1/g;", "Ljava/lang/String;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC35380d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC35383g methodType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String method;

        public b(EnumC35383g enumC35383g, String method) {
            AbstractC22676k.m65750j(method, "method");
            this.methodType = enumC35383g;
            this.method = method;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC35383g getMethodType() {
            return this.methodType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.methodType == bVar.methodType && AbstractC22676k.m65745e(this.method, bVar.method);
        }

        public int hashCode() {
            EnumC35383g enumC35383g = this.methodType;
            return this.method.hashCode() + ((enumC35383g == null ? 0 : enumC35383g.hashCode()) * 31);
        }

        public String toString() {
            return "InitWithMfaMethod(methodType=" + this.methodType + ", method=" + this.method + ")";
        }
    }

    /* JADX INFO: renamed from: uy1.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Luy1/d$c;", "Luy1/d;", "", "mfaEnabled", "Luy1/h;", "requirementReason", "<init>", "(ZLuy1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Luy1/h;", "()Luy1/h;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC35380d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean mfaEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC35384h requirementReason;

        public c(boolean z4, EnumC35384h requirementReason) {
            AbstractC22676k.m65750j(requirementReason, "requirementReason");
            this.mfaEnabled = z4;
            this.requirementReason = requirementReason;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC35384h getRequirementReason() {
            return this.requirementReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.mfaEnabled == cVar.mfaEnabled && this.requirementReason == cVar.requirementReason;
        }

        public int hashCode() {
            return this.requirementReason.hashCode() + (Boolean.hashCode(this.mfaEnabled) * 31);
        }

        public String toString() {
            return "InitWithMfaState(mfaEnabled=" + this.mfaEnabled + ", requirementReason=" + this.requirementReason + ")";
        }
    }

    /* JADX INFO: renamed from: uy1.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Luy1/d$d;", "Luy1/d;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC35380d {

        /* JADX INFO: renamed from: a */
        public static final d f150745a = new d();

        private d() {
        }
    }
}
