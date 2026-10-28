package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import ch3.C4716w0;
import com.whoop.data.onboarding.C6529c;
import com.whoop.service.network.ActivityServiceApi;
import com.whoop.service.network.model.Sport;
import fh3.C14493a;
import java.util.List;
import od1.C27858u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import xg3.C38280g;
import xg3.C38289p;
import xg3.InterfaceC38290q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/data/repositories/SportsRepository;", "", "Lcom/whoop/service/network/ActivityServiceApi;", "activityServiceApi", "Ltr2/n;", "log", "Lod1/u;", "userContext", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/service/network/ActivityServiceApi;Ltr2/n;Lod1/u;Lbc3/c0;)V", "Lxg3/g;", "", "Lcom/whoop/service/network/model/Sport;", "getSports", "()Lxg3/g;", "Lcom/whoop/service/network/ActivityServiceApi;", "getActivityServiceApi", "()Lcom/whoop/service/network/ActivityServiceApi;", "Ltr2/n;", "Lod1/u;", "Lbc3/c0;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SportsRepository {
    private final ActivityServiceApi activityServiceApi;
    private final InterfaceC2994c0 coroutineScope;
    private final InterfaceC34116n log;
    private final C27858u userContext;

    public SportsRepository(ActivityServiceApi activityServiceApi, InterfaceC34116n log, C27858u userContext, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(activityServiceApi, "activityServiceApi");
        AbstractC22676k.m65750j(log, "log");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.activityServiceApi = activityServiceApi;
        this.log = log;
        this.userContext = userContext;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSports$lambda$0(SportsRepository sportsRepository, InterfaceC38290q interfaceC38290q) {
        C6657d c6657d = new C6657d(AbstractC3006f0.m8732z(sportsRepository.coroutineScope, null, null, new SportsRepository$getSports$1$job$1(sportsRepository, interfaceC38290q, null), 3), 0);
        C4716w0 c4716w0 = (C4716w0) interfaceC38290q;
        c4716w0.getClass();
        c4716w0.f19294x.m41405c(new C14493a(c6657d));
    }

    public final ActivityServiceApi getActivityServiceApi() {
        return this.activityServiceApi;
    }

    public final C38280g<List<Sport>> getSports() {
        C38280g<List<Sport>> c38280gM122683a = C38289p.m122683a(C38289p.m122684b(new C6529c(this, 6)));
        AbstractC22676k.m65749i(c38280gM122683a, "toObservable(...)");
        return c38280gM122683a;
    }
}
