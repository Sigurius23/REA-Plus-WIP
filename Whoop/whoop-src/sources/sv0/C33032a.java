package sv0;

import androidx.core.app.NotificationCompat;
import c41.C4161z2;
import com.whoop.design.util.AbstractC8693b;
import hy0.AbstractC17801x0;
import lv0.AbstractC24758a;
import lv0.C24759b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pv0.C29576c;
import pv0.InterfaceC29574a;
import pv0.InterfaceC29575b;

/* JADX INFO: renamed from: sv0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lsv0/a;", "", "Lpv0/c;", "viewModel", "Lsv0/c;", "navRouter", "Llv0/b;", "analyticsHelper", "<init>", "(Lpv0/c;Lsv0/c;Llv0/b;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Lpv0/c;", "b", "Lsv0/c;", "c", "Llv0/b;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33032a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29576c viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33034c navRouter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24759b analyticsHelper;

    public C33032a(C29576c viewModel, C33034c navRouter, C24759b analyticsHelper) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.viewModel = viewModel;
        this.navRouter = navRouter;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m104299a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29574a) {
            this.navRouter.m104310a(event);
            return;
        }
        if (event instanceof C4161z2) {
            C4161z2 c4161z2 = (C4161z2) event;
            this.analyticsHelper.m72499a(new AbstractC24758a.b(c4161z2.getType().name(), null, null, c4161z2.getName(), "", 6, null));
            this.navRouter.m104310a(event);
            return;
        }
        if (event instanceof InterfaceC29575b) {
            InterfaceC29575b interfaceC29575b = (InterfaceC29575b) event;
            this.viewModel.m90671p(interfaceC29575b);
            this.analyticsHelper.m72500b(interfaceC29575b);
        } else if (event instanceof AbstractC17801x0.b) {
            this.viewModel.m90671p(new InterfaceC29575b.b(AbstractC8693b.m21268b(((AbstractC17801x0.b) event).getSearchQuery())));
            this.navRouter.m104310a(InterfaceC29574a.b.f120678a);
        } else if (event instanceof AbstractC17801x0.c) {
            this.viewModel.m90671p(new InterfaceC29575b.e(((AbstractC17801x0.c) event).getNewText()));
        } else if (event instanceof AbstractC17801x0.a) {
            this.viewModel.m90671p(InterfaceC29575b.a.f120680a);
        } else if (event instanceof AbstractC24758a) {
            this.analyticsHelper.m72499a((AbstractC24758a) event);
        }
    }
}
