package pm1;

import om1.C28037k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qm1.C30480b;

/* JADX INFO: renamed from: pm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lpm1/d;", "", "<init>", "()V", "Lom1/k;", "Lqm1/b;", "b", "(Lom1/k;)Lqm1/b;", "domainState", "a", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29359d {
    /* JADX INFO: renamed from: b */
    private final C30480b m89470b(C28037k c28037k) {
        return new C30480b(c28037k.m84531c(), c28037k.getEnterTransition(), c28037k.getExitTransition(), c28037k.getTriggerConfetti(), c28037k.getKeyToAnimate());
    }

    /* JADX INFO: renamed from: a */
    public final C30480b m89471a(C28037k domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return m89470b(domainState);
    }
}
