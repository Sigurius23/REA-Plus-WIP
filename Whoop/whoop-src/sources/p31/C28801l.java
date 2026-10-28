package p31;

import androidx.core.app.NotificationCompat;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: p31.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lp31/l;", "Lm91/u;", "Lp31/p;", "state", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lp31/p;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp31/p;", "()Lp31/p;", "b", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28801l implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f116582c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC28805p state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object event;

    public C28801l(AbstractC28805p state, Object event) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(event, "event");
        this.state = state;
        this.event = event;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC28805p getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28801l)) {
            return false;
        }
        C28801l c28801l = (C28801l) other;
        return AbstractC22676k.m65745e(this.state, c28801l.state) && AbstractC22676k.m65745e(this.event, c28801l.event);
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode() + (this.state.hashCode() * 31);
    }

    public String toString() {
        return "HomeSectionHeaderItemState(state=" + this.state + ", event=" + this.event + ")";
    }

    public /* synthetic */ C28801l(AbstractC28805p abstractC28805p, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC28805p, (i13 & 2) != 0 ? C23454a0.f92919a : obj);
    }
}
