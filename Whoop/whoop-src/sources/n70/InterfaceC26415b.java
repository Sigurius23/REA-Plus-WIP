package n70;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n70.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ln70/b;", "", "b", "a", "Ln70/b$a;", "Ln70/b$b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26415b {

    /* JADX INFO: renamed from: n70.b$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ln70/b$b;", "Ln70/b;", "", "amount", "Ln70/f;", "screenSpecificNavigationAction", "<init>", "(ILn70/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ln70/f;", "()Ln70/f;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC26415b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int amount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26419f screenSpecificNavigationAction;

        public b(int i13, C26419f c26419f) {
            this.amount = i13;
            this.screenSpecificNavigationAction = c26419f;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C26419f getScreenSpecificNavigationAction() {
            return this.screenSpecificNavigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.amount == bVar.amount && AbstractC22676k.m65745e(this.screenSpecificNavigationAction, bVar.screenSpecificNavigationAction);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.amount) * 31;
            C26419f c26419f = this.screenSpecificNavigationAction;
            return iHashCode + (c26419f == null ? 0 : c26419f.hashCode());
        }

        public String toString() {
            return "Forward(amount=" + this.amount + ", screenSpecificNavigationAction=" + this.screenSpecificNavigationAction + ")";
        }
    }

    /* JADX INFO: renamed from: n70.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ln70/b$a;", "Ln70/b;", "", "amount", "Ln70/f;", "screenSpecificNavigationAction", "<init>", "(ILn70/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ln70/f;", "()Ln70/f;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC26415b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int amount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26419f screenSpecificNavigationAction;

        public a(int i13, C26419f c26419f) {
            this.amount = i13;
            this.screenSpecificNavigationAction = c26419f;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C26419f getScreenSpecificNavigationAction() {
            return this.screenSpecificNavigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.amount == aVar.amount && AbstractC22676k.m65745e(this.screenSpecificNavigationAction, aVar.screenSpecificNavigationAction);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.amount) * 31;
            C26419f c26419f = this.screenSpecificNavigationAction;
            return iHashCode + (c26419f == null ? 0 : c26419f.hashCode());
        }

        public String toString() {
            return "Backward(amount=" + this.amount + ", screenSpecificNavigationAction=" + this.screenSpecificNavigationAction + ")";
        }

        public /* synthetic */ a(int i13, C26419f c26419f, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? -1 : i13, (i14 & 2) != 0 ? null : c26419f);
        }
    }
}
