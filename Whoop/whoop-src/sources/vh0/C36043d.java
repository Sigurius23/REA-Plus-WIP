package vh0;

import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ph0.C29234b;
import sh0.AbstractC32500b;
import wh0.C37298a;

/* JADX INFO: renamed from: vh0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lvh0/d;", "", "Lwh0/a;", "mapper", "Lph0/b;", "screenArgs", "<init>", "(Lwh0/a;Lph0/b;)V", "Lsh0/b;", "domainResult", "Lvh0/c;", "a", "(Lsh0/b;)Lvh0/c;", "Lwh0/a;", "b", "Lph0/b;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36043d {

    /* JADX INFO: renamed from: c */
    public static final int f153786c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37298a mapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29234b screenArgs;

    public C36043d(C37298a mapper, C29234b screenArgs) {
        AbstractC22676k.m65750j(mapper, "mapper");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        this.mapper = mapper;
        this.screenArgs = screenArgs;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC36042c m114417a(AbstractC32500b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC32500b.e) {
            return AbstractC36042c.e.f153776a;
        }
        if (domainResult instanceof AbstractC32500b.d) {
            return new AbstractC36042c.d(((AbstractC32500b.d) domainResult).getErrorMessage());
        }
        if (domainResult instanceof AbstractC32500b.f) {
            return this.mapper.m119442c(((AbstractC32500b.f) domainResult).getData(), this.screenArgs);
        }
        if (domainResult instanceof AbstractC32500b.a) {
            return new AbstractC36042c.a(((AbstractC32500b.a) domainResult).getErrorMessage());
        }
        if (domainResult.equals(AbstractC32500b.b.f134555a)) {
            return AbstractC36042c.b.f153773a;
        }
        if (domainResult.equals(AbstractC32500b.c.f134556a)) {
            return AbstractC36042c.c.f153774a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
