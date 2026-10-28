package com.whoop.whooplabs.feature.navigation;

import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import jp2.C21875f;
import l83.C23454a0;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/b;", "", "Leb/u0;", "composeNavController", "Leb/a0;", "fragmentNavController", "Lo02/d;", "baseNavReducer", "Lj02/o0;", "navigator", "<init>", "(Leb/u0;Leb/a0;Lo02/d;Lj02/o0;)V", "Lcom/whoop/whooplabs/feature/navigation/c;", "navEvent", "Ll83/a0;", "c", "(Lcom/whoop/whooplabs/feature/navigation/c;)V", "a", "Leb/u0;", "b", "Leb/a0;", "Lj02/o0;", "d", "Lo02/d;", "navigationReducer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10839b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12991u0 composeNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C10839b(C12991u0 composeNavController, AbstractC12939a0 fragmentNavController, InterfaceC27353d baseNavReducer, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.composeNavController = composeNavController;
        this.fragmentNavController = fragmentNavController;
        this.navigator = navigator;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C21875f(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m28563b(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final void m28564c(AbstractC10840c navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(AbstractC10840c.a.f33256a)) {
            if (this.composeNavController.m36410z()) {
                return;
            }
            this.fragmentNavController.m36410z();
            return;
        }
        if (navEvent.equals(AbstractC10840c.b.f33257a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (navEvent.equals(AbstractC10840c.g.f33264a)) {
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10836g.f33245a.getBaseRoute(), null, 6);
            return;
        }
        if (navEvent instanceof AbstractC10840c.c) {
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10831b.f33235a.m28555a(((AbstractC10840c.c) navEvent).getCampaignId()), null, 6);
            return;
        }
        if (navEvent instanceof AbstractC10840c.e) {
            AbstractC10840c.e eVar = (AbstractC10840c.e) navEvent;
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10833d.f33239a.m28557a(eVar.getCampaignId(), eVar.getSessionId()), null, 6);
            return;
        }
        if (navEvent instanceof AbstractC10840c.f) {
            AbstractC10840c.f fVar = (AbstractC10840c.f) navEvent;
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10834e.f33241a.m28558a(fVar.getCampaignId(), fVar.getSessionId()), null, 6);
            return;
        }
        if (!(navEvent instanceof AbstractC10840c.i)) {
            if (navEvent instanceof AbstractC10840c.d) {
                AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10832c.f33237a.m28556a(((AbstractC10840c.d) navEvent).getCampaignId()), null, 6);
                return;
            } else {
                if (!(navEvent instanceof AbstractC10840c.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.navigator.mo59393b(new AbstractC21155m0.g1(((AbstractC10840c.h) navEvent).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()));
                return;
            }
        }
        AbstractC12939a0.m36371B(this.composeNavController, WhoopLabsNavHostDestination.C10836g.f33245a.getBaseRoute(), false);
        AbstractC10840c.i iVar = (AbstractC10840c.i) navEvent;
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(iVar.getAction().getParameters());
        if (!(interfaceC21134cMo67681a instanceof AbstractC21155m0.x5)) {
            if (interfaceC21134cMo67681a instanceof AbstractC21155m0) {
                this.navigator.mo59392a(iVar.getAction());
                return;
            }
            return;
        }
        AbstractC21155m0.x5 x5Var = (AbstractC21155m0.x5) interfaceC21134cMo67681a;
        Integer campaignId = x5Var.getCampaignId();
        Integer sessionId = x5Var.getSessionId();
        String campaignFilter = x5Var.getCampaignFilter();
        if (campaignId != null && sessionId != null) {
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10833d.f33239a.m28557a(campaignId.intValue(), sessionId), null, 6);
        } else if (campaignId != null) {
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10830a.f33233a.m28554a(campaignId.intValue()), null, 6);
        } else if (campaignFilter != null) {
            AbstractC12939a0.m36374y(this.composeNavController, WhoopLabsNavHostDestination.C10835f.f33243a.m28559a(campaignFilter), null, 6);
        }
    }
}
