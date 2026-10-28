package qs2;

import jb1.C21535a;
import ns2.AbstractC27106b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ps2.AbstractC29507c;

/* JADX INFO: renamed from: qs2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, m65681d2 = {"Lqs2/b;", "", "<init>", "()V", "Lns2/b;", "domainResult", "Lps2/c;", "a", "(Lns2/b;)Lps2/c;", "Ljb1/a;", "Ljb1/a;", "designItemReducer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30577b {

    /* JADX INFO: renamed from: b */
    public static final int f125818b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer = AbstractC30576a.m93801o();

    /* JADX INFO: renamed from: a */
    public final AbstractC29507c m93809a(AbstractC27106b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC27106b.a) {
            return AbstractC29507c.a.f120031a;
        }
        if (domainResult.equals(AbstractC27106b.b.f108329a)) {
            return AbstractC29507c.b.f120032a;
        }
        if (domainResult instanceof AbstractC27106b.c) {
            return new AbstractC29507c.c(this.designItemReducer.m60540g(((AbstractC27106b.c) domainResult).getResult().getCarouselItems()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
