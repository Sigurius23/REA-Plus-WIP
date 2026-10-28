package ua0;

import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ua0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lua0/b;", "", "Leb/a0;", "navController", "<init>", "(Leb/a0;)V", "Lua0/a;", "navigationEvent", "Ll83/a0;", "a", "(Lua0/a;)V", "Leb/a0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34719b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C34719b(AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navController, "navController");
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    public final void m109643a(AbstractC34718a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (!(navigationEvent instanceof AbstractC34718a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.navController.m36410z();
    }
}
