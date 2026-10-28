package hb1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hb1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lhb1/e;", "", "<init>", "()V", "a", "b", "Lhb1/e$a;", "Lhb1/e$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17082e {

    /* JADX INFO: renamed from: hb1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhb1/e$a;", "Lhb1/e;", "Lhb1/n;", "itemState", "<init>", "(Lhb1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb1/n;", "()Lhb1/n;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC17082e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17091n itemState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17091n itemState) {
            super(null);
            AbstractC22676k.m65750j(itemState, "itemState");
            this.itemState = itemState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17091n getItemState() {
            return this.itemState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.itemState, ((a) other).itemState);
        }

        public int hashCode() {
            return this.itemState.hashCode();
        }

        public String toString() {
            return "Load(itemState=" + this.itemState + ")";
        }
    }

    /* JADX INFO: renamed from: hb1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhb1/e$b;", "Lhb1/e;", "Lhb1/n;", "itemState", "<init>", "(Lhb1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb1/n;", "()Lhb1/n;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC17082e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C17091n itemState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C17091n itemState) {
            super(null);
            AbstractC22676k.m65750j(itemState, "itemState");
            this.itemState = itemState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C17091n getItemState() {
            return this.itemState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.itemState, ((b) other).itemState);
        }

        public int hashCode() {
            return this.itemState.hashCode();
        }

        public String toString() {
            return "Retry(itemState=" + this.itemState + ")";
        }
    }

    public /* synthetic */ AbstractC17082e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17082e() {
    }
}
