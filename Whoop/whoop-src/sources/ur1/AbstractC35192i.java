package ur1;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr1.AbstractC34099c;

/* JADX INFO: renamed from: ur1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lur1/i;", "Lur1/g;", "<init>", "()V", "a", "b", "Lur1/i$a;", "Lur1/i$b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35192i implements InterfaceC35190g {

    /* JADX INFO: renamed from: ur1.i$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/i$a;", "Lur1/i;", "Ltr1/c;", "actionType", "<init>", "(Ltr1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltr1/c;", "()Ltr1/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35192i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC34099c actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34099c actionType) {
            super(null);
            AbstractC22676k.m65750j(actionType, "actionType");
            this.actionType = actionType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC34099c getActionType() {
            return this.actionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.actionType, ((a) other).actionType);
        }

        public int hashCode() {
            return this.actionType.hashCode();
        }

        public String toString() {
            return "UpdateAnswer(actionType=" + this.actionType + ")";
        }
    }

    /* JADX INFO: renamed from: ur1.i$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lur1/i$b;", "Lur1/i;", "", "toggleValue", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35192i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean toggleValue;

        public b(boolean z4) {
            super(null);
            this.toggleValue = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getToggleValue() {
            return this.toggleValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.toggleValue == ((b) other).toggleValue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.toggleValue);
        }

        public String toString() {
            return AbstractC3855a.m11827k("UpdateDefaults(toggleValue=", ")", this.toggleValue);
        }
    }

    public /* synthetic */ AbstractC35192i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35192i() {
    }
}
