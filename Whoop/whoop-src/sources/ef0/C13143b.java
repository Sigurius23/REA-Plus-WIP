package ef0;

import df0.AbstractC11998b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ef0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lef0/b;", "", "<init>", "()V", "Ldf0/b;", "domainResult", "Lef0/a;", "a", "(Ldf0/b;)Lef0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13143b {
    /* JADX INFO: renamed from: a */
    public final AbstractC13142a m36773a(AbstractC11998b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if ((domainResult instanceof AbstractC11998b.b) || (domainResult instanceof AbstractC11998b.c) || (domainResult instanceof AbstractC11998b.a) || (domainResult instanceof AbstractC11998b.g)) {
            return null;
        }
        if (domainResult instanceof AbstractC11998b.f) {
            return AbstractC13142a.a.f45451a;
        }
        if (domainResult instanceof AbstractC11998b.e) {
            return new AbstractC13142a.d(((AbstractC11998b.e) domainResult).getTestType());
        }
        if (!(domainResult instanceof AbstractC11998b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC11998b.d dVar = (AbstractC11998b.d) domainResult;
        return new AbstractC13142a.c(dVar.getConsentAction(), dVar.getTestType());
    }
}
