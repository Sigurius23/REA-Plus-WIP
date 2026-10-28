package ie0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.PopUpToModel;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ie0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lie0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Ltr2/n;", "logger", "<init>", "(Leb/a0;Lj02/o0;Ltr2/n;)V", "Lie0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lie0/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Ltr2/n;", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18442b {

    /* JADX INFO: renamed from: e */
    public static final int f71804e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C18442b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(logger, "logger");
        this.navController = navController;
        this.navigator = navigator;
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m53138a(AbstractC18441a event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC18441a.a) && !(event instanceof AbstractC18441a.b)) {
            if (!(event instanceof AbstractC18441a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((AbstractC18441a.c) event).getAction());
            return;
        }
        AiAction aiAction = null;
        Object[] objArr = 0;
        if (AbstractC9597d.m23112d(this.navController, new PopUpToModel(false, new C9598e(AppScreen.C9264a0.f27464w, null, null, 6, null)), null, this.logger)) {
            return;
        }
        if (!AbstractC9597d.m23115g(this.navController, new C9598e(AppScreen.C9394q2.f27867w, null, null, 6, null), false)) {
            AbstractC9597d.m23115g(this.navController, new C9598e(AppScreen.C9426u2.f27963w, null, null, 6, null), false);
        }
        this.navigator.mo59393b(new AbstractC21155m0.p("scheduling_step", aiAction, 2, objArr == true ? 1 : 0));
    }

    public /* synthetic */ C18442b(AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, interfaceC21159o0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SchedulingStepNavigationRouter") : interfaceC34116n);
    }
}
