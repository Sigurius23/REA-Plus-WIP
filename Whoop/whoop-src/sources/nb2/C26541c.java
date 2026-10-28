package nb2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nb2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lnb2/c;", "", "Lnb2/b;", "state", "<init>", "(Lnb2/b;)V", "a", "(Lnb2/b;)Lnb2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnb2/b;", "b", "()Lnb2/b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26541c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC26540b state;

    public C26541c(AbstractC26540b state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }

    /* JADX INFO: renamed from: a */
    public final C26541c m78642a(AbstractC26540b state) {
        AbstractC22676k.m65750j(state, "state");
        return new C26541c(state);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC26540b getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C26541c) && AbstractC22676k.m65745e(this.state, ((C26541c) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "GiftHubDomainResultState(state=" + this.state + ")";
    }

    public /* synthetic */ C26541c(AbstractC26540b abstractC26540b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC26540b.c.f105487a : abstractC26540b);
    }
}
