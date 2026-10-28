package qw2;

import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qw2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw2/f;", "Lqw2/a;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30698f implements InterfaceC30693a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Action action;

    public C30698f(Action action) {
        AbstractC22676k.m65750j(action, "action");
        this.action = action;
    }

    @Override // qw2.InterfaceC30693a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Action getAction() {
        return this.action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C30698f) && AbstractC22676k.m65745e(this.action, ((C30698f) other).action);
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return AbstractC11478a.m30856h("BasicActionDomainAction(action=", this.action, ")");
    }
}
