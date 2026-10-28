package xg2;

import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import vg2.AbstractC36030b;
import wg2.AbstractC37269e;

/* JADX INFO: renamed from: xg2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxg2/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lvg2/b;", "state", "Lwg2/e;", "a", "(Lvg2/b;)Lwg2/e;", "Ljb1/a;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38273a {

    /* JADX INFO: renamed from: b */
    public static final int f164077b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C38273a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC37269e m122632a(AbstractC36030b state) {
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof AbstractC36030b.b) {
            return AbstractC37269e.c.f159450a;
        }
        if (state instanceof AbstractC36030b.c) {
            C25306o c25306oM60542i = this.designItemReducer.m60542i(((AbstractC36030b.c) state).getModel());
            return c25306oM60542i != null ? new AbstractC37269e.d(c25306oM60542i) : new AbstractC37269e.a(false);
        }
        if (state instanceof AbstractC36030b.a) {
            return new AbstractC37269e.a(((AbstractC36030b.a) state).getIsRetryable());
        }
        throw new NoWhenBranchMatchedException();
    }
}
