package y52;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y52.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Ly52/b;", "", "<init>", "()V", "a", "Ly52/b$a;", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39237b {

    /* JADX INFO: renamed from: y52.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ly52/b$a;", "Ly52/b;", "Ly52/e;", "domainState", "", "showLoading", "<init>", "(Ly52/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly52/e;", "()Ly52/e;", "b", "Z", "()Z", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC39237b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39240e domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean showLoading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C39240e domainState, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
            this.showLoading = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39240e getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShowLoading() {
            return this.showLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.domainState, aVar.domainState) && this.showLoading == aVar.showLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showLoading) + (this.domainState.hashCode() * 31);
        }

        public String toString() {
            return "LoadData(domainState=" + this.domainState + ", showLoading=" + this.showLoading + ")";
        }
    }

    public /* synthetic */ AbstractC39237b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC39237b() {
    }
}
