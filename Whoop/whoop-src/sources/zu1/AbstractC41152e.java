package zu1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zu1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lzu1/e;", "", "<init>", "()V", "a", "b", "Lzu1/e$a;", "Lzu1/e$b;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41152e {

    /* JADX INFO: renamed from: zu1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzu1/e$a;", "Lzu1/e;", "Lzu1/c;", "domainState", "<init>", "(Lzu1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzu1/c;", "()Lzu1/c;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC41152e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C41150c domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C41150c domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C41150c getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.domainState, ((a) other).domainState);
        }

        public int hashCode() {
            return this.domainState.hashCode();
        }

        public String toString() {
            return "DataLoaded(domainState=" + this.domainState + ")";
        }
    }

    /* JADX INFO: renamed from: zu1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzu1/e$b;", "Lzu1/e;", "Lzu1/b;", "domainAction", "<init>", "(Lzu1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzu1/b;", "()Lzu1/b;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC41152e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC41149b domainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC41149b domainAction) {
            super(null);
            AbstractC22676k.m65750j(domainAction, "domainAction");
            this.domainAction = domainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC41149b getDomainAction() {
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

    public /* synthetic */ AbstractC41152e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC41152e() {
    }
}
