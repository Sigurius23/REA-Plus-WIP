package gr0;

import com.whoop.whoopaction.domain.models.Action;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gr0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lgr0/g;", "", "<init>", "()V", "c", "b", "a", "Lgr0/g$a;", "Lgr0/g$b;", "Lgr0/g$c;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16092g {

    /* JADX INFO: renamed from: gr0.g$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lgr0/g$a;", "Lgr0/g;", "", "message", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC16092g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, Action action) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(action, "action");
            this.message = message;
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.message, aVar.message) && AbstractC22676k.m65745e(this.action, aVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            return "ActionError(message=" + this.message + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: gr0.g$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgr0/g$b;", "Lgr0/g;", "", "inFlightFollowerRequestId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC16092g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String inFlightFollowerRequestId;

        public b(String str) {
            super(null);
            this.inFlightFollowerRequestId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInFlightFollowerRequestId() {
            return this.inFlightFollowerRequestId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.inFlightFollowerRequestId, ((b) other).inFlightFollowerRequestId);
        }

        public int hashCode() {
            String str = this.inFlightFollowerRequestId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ActionLoading(inFlightFollowerRequestId=", this.inFlightFollowerRequestId, ")");
        }
    }

    /* JADX INFO: renamed from: gr0.g$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgr0/g$c;", "Lgr0/g;", "<init>", "()V", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC16092g {

        /* JADX INFO: renamed from: a */
        public static final c f60990a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC16092g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC16092g() {
    }
}
