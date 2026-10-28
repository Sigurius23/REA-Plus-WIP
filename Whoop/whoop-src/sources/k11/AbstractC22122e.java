package k11;

import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k11.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m65681d2 = {"Lk11/e;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "buttonId", "b", "Lk11/e$a;", "Lk11/e$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22122e {

    /* JADX INFO: renamed from: k11.e$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lk11/e$a;", "Lk11/e;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "buttonId", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "b", "()Lcom/whoop/whoopaction/domain/models/Action;", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22122e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String buttonId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Action action, String str) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.buttonId = str;
        }

        @Override // k11.AbstractC22122e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getButtonId() {
            return this.buttonId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.buttonId, aVar.buttonId);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.buttonId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BackendDrivenAction(action=" + this.action + ", buttonId=" + this.buttonId + ")";
        }
    }

    /* JADX INFO: renamed from: k11.e$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lk11/e$b;", "Lk11/e;", "Lcom/whoop/navigation/e;", "destination", "", "buttonId", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22122e {

        /* JADX INFO: renamed from: c */
        public static final int f85824c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String buttonId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9598e destination, String str) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
            this.buttonId = str;
        }

        @Override // k11.AbstractC22122e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getButtonId() {
            return this.buttonId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.destination, bVar.destination) && AbstractC22676k.m65745e(this.buttonId, bVar.buttonId);
        }

        public int hashCode() {
            int iHashCode = this.destination.hashCode() * 31;
            String str = this.buttonId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Navigation(destination=" + this.destination + ", buttonId=" + this.buttonId + ")";
        }
    }

    public /* synthetic */ AbstractC22122e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getButtonId();

    private AbstractC22122e() {
    }
}
