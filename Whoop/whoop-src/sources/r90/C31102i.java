package r90;

import o70.AbstractC27628b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r90.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lr90/i;", "", "Lo70/b;", "state", "", "body", "<init>", "(Lo70/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo70/b;", "b", "()Lo70/b;", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31102i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC27628b state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String body;

    public C31102i(AbstractC27628b state, String body) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(body, "body");
        this.state = state;
        this.body = body;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC27628b getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31102i)) {
            return false;
        }
        C31102i c31102i = (C31102i) other;
        return AbstractC22676k.m65745e(this.state, c31102i.state) && AbstractC22676k.m65745e(this.body, c31102i.body);
    }

    public int hashCode() {
        return this.body.hashCode() + (this.state.hashCode() * 31);
    }

    public String toString() {
        return "TermDetailsState(state=" + this.state + ", body=" + this.body + ")";
    }

    public /* synthetic */ C31102i(AbstractC27628b abstractC27628b, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC27628b.c.f111181a : abstractC27628b, (i13 & 2) != 0 ? "" : str);
    }
}
