package mw0;

import jw0.AbstractC21985c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mw0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lmw0/e;", "", "<init>", "()V", "Ljw0/c;", "domainState", "Lmw0/d;", "a", "(Ljw0/c;)Lmw0/d;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25977e {
    /* JADX INFO: renamed from: a */
    public final AbstractC25976d m77013a(AbstractC21985c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof AbstractC21985c.a) {
            AbstractC21985c.a aVar = (AbstractC21985c.a) domainState;
            return new AbstractC25976d.b(aVar.getErrorTitle(), aVar.getMessage());
        }
        if (domainState.equals(AbstractC21985c.b.f85131a)) {
            return AbstractC25976d.g.f102583a;
        }
        if (domainState.equals(AbstractC21985c.d.f85133a)) {
            return AbstractC25976d.i.f102585a;
        }
        if (domainState.equals(AbstractC21985c.e.f85134a)) {
            return AbstractC25976d.j.f102586a;
        }
        if (domainState instanceof AbstractC21985c.f) {
            AbstractC21985c.f fVar = (AbstractC21985c.f) domainState;
            return new AbstractC25976d.c(fVar.getErrorTitle(), fVar.getMessage());
        }
        if (domainState.equals(AbstractC21985c.g.f85138a)) {
            return AbstractC25976d.h.f102584a;
        }
        if (domainState.equals(AbstractC21985c.c.f85132a)) {
            return AbstractC25976d.f.f102582a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
