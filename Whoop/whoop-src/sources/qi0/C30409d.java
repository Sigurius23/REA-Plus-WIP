package qi0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AbstractC9597d;
import j02.C21166s;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import ri0.InterfaceC31443b;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qi0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lqi0/d;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Ltr2/n;)V", "Lj02/s;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lj02/s;)V", "Lm91/u;", "a", "(Lm91/u;)V", "Lri0/b$n;", "c", "(Lri0/b$n;)V", "Lj02/o0;", "Leb/a0;", "Ltr2/n;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30409d {

    /* JADX INFO: renamed from: d */
    public static final int f124801d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C30409d(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final void m92934a(InterfaceC25312u interfaceC25312u) {
        this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: b */
    private final void m92935b(C21166s event) {
        if (event.getPopUpTo() == null) {
            AbstractC9597d.m23114f(this.navController, event.getType(), null, 2, null);
        } else {
            AbstractC9597d.m23112d(this.navController, event.getPopUpTo(), event.getPopBackCount(), this.logger);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m92936c(InterfaceC31443b.n event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC31443b.c) {
            InterfaceC31443b.c cVar = (InterfaceC31443b.c) event;
            if (cVar.getReplacesCurrentScreen()) {
                this.navigator.mo59394d(cVar.getNavAction());
                return;
            } else {
                this.navigator.mo59392a(cVar.getNavAction());
                return;
            }
        }
        if (event instanceof InterfaceC31443b.b) {
            m92934a(((InterfaceC31443b.b) event).getItemViewState());
        } else if (event instanceof InterfaceC31443b.h) {
            AbstractC9597d.m23114f(this.navController, ((InterfaceC31443b.h) event).getDismissAction().getType(), null, 2, null);
        } else {
            if (!(event instanceof InterfaceC31443b.q)) {
                throw new NoWhenBranchMatchedException();
            }
            m92935b(((InterfaceC31443b.q) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
    }

    public /* synthetic */ C30409d(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GenericNavigationRouter") : interfaceC34116n);
    }
}
