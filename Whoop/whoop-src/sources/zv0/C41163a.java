package zv0;

import com.whoop.core.details.activitytargets.domain.AbstractC6449b;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import yv0.AbstractC39801d;

/* JADX INFO: renamed from: zv0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lzv0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/core/details/activitytargets/domain/b;", "state", "Lyv0/d;", "a", "(Lcom/whoop/core/details/activitytargets/domain/b;)Lyv0/d;", "Ljb1/a;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41163a {

    /* JADX INFO: renamed from: b */
    public static final int f177577b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C41163a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC39801d m133713a(AbstractC6449b state) {
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof AbstractC6449b.c) {
            return AbstractC39801d.c.f171525a;
        }
        if (state instanceof AbstractC6449b.b) {
            C25306o c25306oM60542i = this.designItemReducer.m60542i(((AbstractC6449b.b) state).getModel());
            return c25306oM60542i != null ? new AbstractC39801d.b(c25306oM60542i) : AbstractC39801d.a.f171522a;
        }
        if (state instanceof AbstractC6449b.a) {
            return AbstractC39801d.a.f171522a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
