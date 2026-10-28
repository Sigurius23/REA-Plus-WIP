package qw1;

import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qw1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lqw1/e;", "", "<init>", "()V", "a", "c", "e", "f", "d", "g", "b", "Lqw1/e$a;", "Lqw1/e$b;", "Lqw1/e$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC30691e {

    /* JADX INFO: renamed from: qw1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw1/e$a;", "Lqw1/e;", "Lqw1/c;", "domainResult", "<init>", "(Lqw1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqw1/c;", "()Lqw1/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30691e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C30689c domainResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30689c domainResult) {
            super(null);
            AbstractC22676k.m65750j(domainResult, "domainResult");
            this.domainResult = domainResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C30689c getDomainResult() {
            return this.domainResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.domainResult, ((a) other).domainResult);
        }

        public int hashCode() {
            return this.domainResult.hashCode();
        }

        public String toString() {
            return "DataLoaded(domainResult=" + this.domainResult + ")";
        }
    }

    /* JADX INFO: renamed from: qw1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw1/e$b;", "Lqw1/e;", "Lqw1/b;", "domainAction", "<init>", "(Lqw1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqw1/b;", "()Lqw1/b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30691e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC30688b domainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30688b domainAction) {
            super(null);
            AbstractC22676k.m65750j(domainAction, "domainAction");
            this.domainAction = domainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC30688b getDomainAction() {
            return this.domainAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.domainAction, ((b) other).domainAction);
        }

        public int hashCode() {
            return this.domainAction.hashCode();
        }

        public String toString() {
            return "HandleDomainAction(domainAction=" + this.domainAction + ")";
        }
    }

    /* JADX INFO: renamed from: qw1.e$c */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lqw1/e$c;", "Lqw1/e;", "<init>", "()V", "Lqw1/e$d;", "Lqw1/e$e;", "Lqw1/e$f;", "Lqw1/e$g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class c extends AbstractC30691e {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: qw1.e$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw1/e$d;", "Lqw1/e$c;", "Lcom/whoop/design/util/TextResource;", "errorMessage", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: b */
        public static final int f126311b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource errorMessage) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorMessage() {
            return this.errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.errorMessage, ((d) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("InviteError(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: qw1.e$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqw1/e$e;", "Lqw1/e$c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends c {

        /* JADX INFO: renamed from: a */
        public static final e f126313a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: qw1.e$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw1/e$f;", "Lqw1/e$c;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "progressContent", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent progressContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ProgressContent progressContent) {
            super(null);
            AbstractC22676k.m65750j(progressContent, "progressContent");
            this.progressContent = progressContent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProgressContent getProgressContent() {
            return this.progressContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.progressContent, ((f) other).progressContent);
        }

        public int hashCode() {
            return this.progressContent.hashCode();
        }

        public String toString() {
            return "InviteSuccess(progressContent=" + this.progressContent + ")";
        }
    }

    /* JADX INFO: renamed from: qw1.e$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqw1/e$g;", "Lqw1/e$c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends c {

        /* JADX INFO: renamed from: a */
        public static final g f126315a = new g();

        private g() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC30691e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC30691e() {
    }
}
