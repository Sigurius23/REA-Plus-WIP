package j62;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j62.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lj62/b;", "", "Lj62/c;", "state", "<init>", "(Lj62/c;)V", "a", "(Lj62/c;)Lj62/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj62/c;", "b", "()Lj62/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21377b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21378c state;

    public C21377b(AbstractC21378c state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }

    /* JADX INFO: renamed from: a */
    public final C21377b m60000a(AbstractC21378c state) {
        AbstractC22676k.m65750j(state, "state");
        return new C21377b(state);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC21378c getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C21377b) && AbstractC22676k.m65745e(this.state, ((C21377b) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "ReferAFriendDomainResultState(state=" + this.state + ")";
    }

    public /* synthetic */ C21377b(AbstractC21378c abstractC21378c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21378c.c.f81771a : abstractC21378c);
    }
}
