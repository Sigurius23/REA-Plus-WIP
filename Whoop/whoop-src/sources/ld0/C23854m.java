package ld0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ld0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lld0/m;", "Lm91/u;", "Lld0/t;", "header", "", "Lld0/o;", "steps", "<init>", "(Lld0/t;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld0/t;", "()Lld0/t;", "b", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23854m implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23861t header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23856o> steps;

    public C23854m(C23861t c23861t, List<C23856o> steps) {
        AbstractC22676k.m65750j(steps, "steps");
        this.header = c23861t;
        this.steps = steps;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23861t getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23856o> m70087b() {
        return this.steps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23854m)) {
            return false;
        }
        C23854m c23854m = (C23854m) other;
        return AbstractC22676k.m65745e(this.header, c23854m.header) && AbstractC22676k.m65745e(this.steps, c23854m.steps);
    }

    public int hashCode() {
        C23861t c23861t = this.header;
        return this.steps.hashCode() + ((c23861t == null ? 0 : c23861t.hashCode()) * 31);
    }

    public String toString() {
        return "ChecklistCardViewState(header=" + this.header + ", steps=" + this.steps + ")";
    }
}
