package ko1;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import lo1.InterfaceC24616a;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ko1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lko1/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Ltr2/n;)V", "Llo1/a$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Llo1/a$f;)V", "Lj02/o0;", "b", "Leb/a0;", "c", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22650c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C22650c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final void m65606a(InterfaceC24616a.f event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24616a.c) {
            this.navigator.mo59392a(((InterfaceC24616a.c) event).m71906a());
        } else {
            if (!(event instanceof InterfaceC24616a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    public /* synthetic */ C22650c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LogSymptomsNavigationRouter") : interfaceC34116n);
    }
}
