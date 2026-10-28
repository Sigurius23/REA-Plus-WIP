package zk1;

import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p161g.AbstractActivityC14909l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s01.EnumC32045a;

/* JADX INFO: renamed from: zk1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzk1/c;", "", "Leb/u0;", "navController", "Lor2/y;", "externalLinkNavigator", "Lg/l;", "activity", "Lj02/o0;", "navigator", "<init>", "(Leb/u0;Lor2/y;Lg/l;Lj02/o0;)V", "Lzk1/b;", "navEvent", "", "a", "(Lzk1/b;)Z", "Leb/u0;", "b", "Lor2/y;", "c", "Lg/l;", "d", "Lj02/o0;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40839c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12991u0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractActivityC14909l activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C40839c(C12991u0 navController, C28216y externalLinkNavigator, AbstractActivityC14909l activity, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m132350a(AbstractC40838b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent instanceof AbstractC40838b.b) {
            AbstractC12939a0.m36374y(this.navController, ((AbstractC40838b.b) navEvent).getRoute(), null, 6);
            return true;
        }
        if (navEvent instanceof AbstractC40838b.c) {
            C28216y.m85414y(this.externalLinkNavigator, this.activity, ((AbstractC40838b.c) navEvent).getLink(), false, 4, null);
            return true;
        }
        if (navEvent instanceof AbstractC40838b.a) {
            this.activity.getOnBackPressedDispatcher().m43018d();
            return true;
        }
        if (!navEvent.equals(AbstractC40838b.d.f176050a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.navigator.mo59393b(new AbstractC21155m0.z(null, null, null, null, "Help Center", EnumC32045a.HELP_CENTER.toString(), null, null, false, null, null, null, 4047, null));
        return true;
    }
}
