package p710im1;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import dm1.AbstractC12177a;
import dm1.C12178b;
import em1.AbstractC13333g;
import em1.AbstractC13337k;
import em1.C13348v;
import em1.InterfaceC13346t;
import fm1.C14599c;
import fm1.C14600d;
import fm1.EnumC14603g;
import gt0.InterfaceC16183e;
import il1.AbstractC18642s;
import kd1.EnumC22400l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: im1.c0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lim1/c0;", "", "Ltr2/n;", "logger", "Lim1/n;", "homeEventBuilder", "Lgt0/e;", "firmwareUpdateApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltr2/n;Lim1/n;Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ldm1/a;", "navigationEvent", "Lkotlin/Function1;", "Lem1/t;", "Ll83/a0;", "sendViewEvent", "Ldm1/b;", "homeScreenNavigationRouter", "c", "(Ldm1/a;Lkotlin/jvm/functions/Function1;Ldm1/b;)V", "Lil1/s;", NotificationCompat.CATEGORY_EVENT, "Lem1/v;", "viewState", "Lfm1/g;", "currentPillarType", "b", "(Lil1/s;Lem1/v;Lfm1/g;Lkotlin/jvm/functions/Function1;Ldm1/b;)Lem1/t;", "Lkd1/l;", "fabItem", "a", "(Lkd1/l;Lfm1/g;Lem1/v;Lkotlin/jvm/functions/Function1;Ldm1/b;)V", "Ltr2/n;", "Lim1/n;", "Lgt0/e;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18662c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18684n homeEventBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C18662c0(InterfaceC34116n logger, C18684n homeEventBuilder, InterfaceC16183e firmwareUpdateApi, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(homeEventBuilder, "homeEventBuilder");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.logger = logger;
        this.homeEventBuilder = homeEventBuilder;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: c */
    private final void m54143c(AbstractC12177a navigationEvent, Function1 sendViewEvent, C12178b homeScreenNavigationRouter) {
        if (!this.firmwareUpdateApi.mo45720a()) {
            homeScreenNavigationRouter.m33776j(navigationEvent);
            return;
        }
        if (!(navigationEvent instanceof AbstractC12177a.s)) {
            if ((navigationEvent instanceof AbstractC12177a.o) || (navigationEvent instanceof AbstractC12177a.x) || (navigationEvent instanceof AbstractC12177a.z)) {
                sendViewEvent.invoke(AbstractC13337k.d.f46208a);
                return;
            } else {
                homeScreenNavigationRouter.m33776j(navigationEvent);
                return;
            }
        }
        AppScreen appScreen = ((AbstractC12177a.s) navigationEvent).getNavigationAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9378o2.f27821w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9405r5.f27899w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9413s5.f27923w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9437v5.f27996w)) {
            sendViewEvent.invoke(AbstractC13337k.d.f46208a);
        } else {
            homeScreenNavigationRouter.m33776j(navigationEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m54144a(EnumC22400l fabItem, EnumC14603g currentPillarType, C13348v viewState, Function1 sendViewEvent, C12178b homeScreenNavigationRouter) {
        AbstractC22676k.m65750j(fabItem, "fabItem");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(sendViewEvent, "sendViewEvent");
        AbstractC22676k.m65750j(homeScreenNavigationRouter, "homeScreenNavigationRouter");
        C14599c homeFeed = viewState.getHomeFeed();
        if (homeFeed != null) {
            m54143c(this.homeEventBuilder.m54255a(fabItem, homeFeed, currentPillarType), sendViewEvent, homeScreenNavigationRouter);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13346t m54145b(AbstractC18642s event, C13348v viewState, EnumC14603g currentPillarType, Function1 sendViewEvent, C12178b homeScreenNavigationRouter) {
        C14600d homeMetaData;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(currentPillarType, "currentPillarType");
        AbstractC22676k.m65750j(sendViewEvent, "sendViewEvent");
        AbstractC22676k.m65750j(homeScreenNavigationRouter, "homeScreenNavigationRouter");
        InterfaceC13346t interfaceC13346tM54258d = this.homeEventBuilder.m54258d(event);
        if (interfaceC13346tM54258d != null) {
            if (interfaceC13346tM54258d instanceof AbstractC13333g.b) {
                return interfaceC13346tM54258d;
            }
            sendViewEvent.invoke(interfaceC13346tM54258d);
            return null;
        }
        C18684n c18684n = this.homeEventBuilder;
        C14599c homeFeed = viewState.getHomeFeed();
        AbstractC12177a abstractC12177aM54257c = c18684n.m54257c(event, (homeFeed == null || (homeMetaData = homeFeed.getHomeMetaData()) == null) ? null : homeMetaData.getCurrentDay(), currentPillarType);
        if (abstractC12177aM54257c != null) {
            m54143c(abstractC12177aM54257c, sendViewEvent, homeScreenNavigationRouter);
            return null;
        }
        throw new IllegalArgumentException(event + " wasn't mapped to any home view or navigation event");
    }
}
