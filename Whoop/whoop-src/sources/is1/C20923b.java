package is1;

import fs1.AbstractC14746c;
import hs1.AbstractC17606c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: is1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lis1/b;", "", "<init>", "()V", "Lfs1/c;", "domainResult", "Lhs1/c;", "a", "(Lfs1/c;)Lhs1/c;", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20923b {
    /* JADX INFO: renamed from: a */
    public final AbstractC17606c m58046a(AbstractC14746c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC14746c.a) {
            return AbstractC17606c.a.f68213b;
        }
        if (domainResult.equals(AbstractC14746c.b.f54587a)) {
            return AbstractC17606c.b.f68214b;
        }
        if (domainResult instanceof AbstractC14746c.c) {
            return new AbstractC17606c.c(AbstractC20922a.m58040d().m60541h(((AbstractC14746c.c) domainResult).getResult().getTile()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
