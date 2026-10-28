package lg0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llg0/e;", "", "<init>", "()V", "a", "b", "Llg0/e$a;", "Llg0/e$b;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24032e {

    /* JADX INFO: renamed from: lg0.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llg0/e$a;", "Llg0/e;", "Llg0/c;", "domainState", "<init>", "(Llg0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llg0/c;", "()Llg0/c;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24032e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C24030c domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24030c domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C24030c getDomainState() {
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

    /* JADX INFO: renamed from: lg0.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llg0/e$b;", "Llg0/e;", "Llg0/b;", "domainAction", "<init>", "(Llg0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llg0/b;", "()Llg0/b;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24032e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC24029b domainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC24029b domainAction) {
            super(null);
            AbstractC22676k.m65750j(domainAction, "domainAction");
            this.domainAction = domainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC24029b getDomainAction() {
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

    public /* synthetic */ AbstractC24032e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24032e() {
    }
}
