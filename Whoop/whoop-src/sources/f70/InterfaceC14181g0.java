package f70;

import com.whoop.activation.domain.models.EmailDialogInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f70.g0 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lf70/g0;", "", "d", "c", "b", "a", "Lf70/g0$a;", "Lf70/g0$b;", "Lf70/g0$c;", "Lf70/g0$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14181g0 {

    /* JADX INFO: renamed from: f70.g0$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/g0$a;", "Lf70/g0;", "Lf70/q0;", "memberInfo", "<init>", "(Lf70/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf70/q0;", "getMemberInfo", "()Lf70/q0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14181g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14201q0 memberInfo;

        public a(C14201q0 memberInfo) {
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            this.memberInfo = memberInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.memberInfo, ((a) other).memberInfo);
        }

        public int hashCode() {
            return this.memberInfo.hashCode();
        }

        public String toString() {
            return "Error(memberInfo=" + this.memberInfo + ")";
        }
    }

    /* JADX INFO: renamed from: f70.g0$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/g0$b;", "Lf70/g0;", "Lf70/q0;", "memberInfo", "<init>", "(Lf70/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf70/q0;", "()Lf70/q0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14181g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14201q0 memberInfo;

        public b(C14201q0 memberInfo) {
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            this.memberInfo = memberInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14201q0 getMemberInfo() {
            return this.memberInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.memberInfo, ((b) other).memberInfo);
        }

        public int hashCode() {
            return this.memberInfo.hashCode();
        }

        public String toString() {
            return "ExistingUser(memberInfo=" + this.memberInfo + ")";
        }
    }

    /* JADX INFO: renamed from: f70.g0$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/g0$c;", "Lf70/g0;", "Lf70/q0;", "memberInfo", "<init>", "(Lf70/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf70/q0;", "()Lf70/q0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC14181g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14201q0 memberInfo;

        public c(C14201q0 memberInfo) {
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            this.memberInfo = memberInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14201q0 getMemberInfo() {
            return this.memberInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.memberInfo, ((c) other).memberInfo);
        }

        public int hashCode() {
            return this.memberInfo.hashCode();
        }

        public String toString() {
            return "Proceed(memberInfo=" + this.memberInfo + ")";
        }
    }

    /* JADX INFO: renamed from: f70.g0$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lf70/g0$d;", "Lf70/g0;", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "dialogInfo", "Lf70/q0;", "memberInfo", "<init>", "(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lf70/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "()Lcom/whoop/activation/domain/models/EmailDialogInfo;", "b", "Lf70/q0;", "getMemberInfo", "()Lf70/q0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC14181g0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EmailDialogInfo dialogInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14201q0 memberInfo;

        public d(EmailDialogInfo dialogInfo, C14201q0 memberInfo) {
            AbstractC22676k.m65750j(dialogInfo, "dialogInfo");
            AbstractC22676k.m65750j(memberInfo, "memberInfo");
            this.dialogInfo = dialogInfo;
            this.memberInfo = memberInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EmailDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.dialogInfo, dVar.dialogInfo) && AbstractC22676k.m65745e(this.memberInfo, dVar.memberInfo);
        }

        public int hashCode() {
            return this.memberInfo.hashCode() + (this.dialogInfo.hashCode() * 31);
        }

        public String toString() {
            return "ShowDialog(dialogInfo=" + this.dialogInfo + ", memberInfo=" + this.memberInfo + ")";
        }
    }
}
