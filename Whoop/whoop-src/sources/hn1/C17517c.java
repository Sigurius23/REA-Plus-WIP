package hn1;

import bn1.C3498a;
import dn1.EnumC12223g;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hn1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhn1/c;", "", "Lj02/o0;", "navigator", "Lbn1/a;", "analyticHelper", "<init>", "(Lj02/o0;Lbn1/a;)V", "Lhn1/a;", "navAction", "Ll83/a0;", "a", "(Lhn1/a;)V", "Lj02/o0;", "getNavigator", "()Lj02/o0;", "b", "Lbn1/a;", "getAnalyticHelper", "()Lbn1/a;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17517c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3498a analyticHelper;

    public C17517c(InterfaceC21159o0 navigator, C3498a c3498a) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
        this.analyticHelper = c3498a;
    }

    /* JADX INFO: renamed from: a */
    public final void m49761a(InterfaceC17515a navAction) {
        AbstractC22676k.m65750j(navAction, "navAction");
        if (!navAction.equals(InterfaceC17515a.a.f67749a)) {
            throw new NoWhenBranchMatchedException();
        }
        C3498a c3498a = this.analyticHelper;
        if (c3498a != null) {
            c3498a.m10324a(EnumC12223g.HTTP);
        }
        this.navigator.mo59393b(new AbstractC21155m0.g1("https://status.whoop.com/"));
    }
}
