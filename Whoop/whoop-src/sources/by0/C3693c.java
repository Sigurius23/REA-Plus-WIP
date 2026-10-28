package by0;

import androidx.core.app.NotificationCompat;
import c41.C4042i1;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.FeatureEducationModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.TrendsScreenModel;
import cy0.InterfaceC11182a;
import j02.InterfaceC21159o0;
import j81.C21425i;
import km2.C22596g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import s01.C32048d;
import tr2.InterfaceC34116n;
import xx0.AbstractC38690b;

/* JADX INFO: renamed from: by0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lby0/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "navAction", "", "source", "Lm91/u;", "itemViewState", "Ll83/a0;", "b", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V", "a", "(Lm91/u;)Lcom/whoop/navigation/e;", "Lcom/whoop/navigation/NavigationScreenModel;", "d", "(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;Lm91/u;)Lcom/whoop/navigation/NavigationScreenModel;", "Lcy0/a$g;", NotificationCompat.CATEGORY_EVENT, "c", "(Lcy0/a$g;)V", "Lj02/o0;", "Leb/a0;", "Ltr2/n;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3693c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C3693c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final C9598e m11488a(InterfaceC25312u interfaceC25312u) {
        if (!(interfaceC25312u instanceof C32048d)) {
            return null;
        }
        C9598e destination = ((C32048d) interfaceC25312u).getDestination();
        if (destination == null) {
            this.logger.mo85226q("WhoopCoachVow tapped without a destination", new AbstractC30556a.a[0]);
        }
        return destination;
    }

    /* JADX INFO: renamed from: b */
    private final void m11489b(C9598e navAction, String source, InterfaceC25312u itemViewState) {
        if (navAction == null) {
            return;
        }
        this.navigator.mo59392a(C9598e.m23127b(navAction, null, m11490d(navAction.getParameters(), source, itemViewState), null, 5, null));
    }

    /* JADX INFO: renamed from: d */
    private final NavigationScreenModel m11490d(NavigationScreenModel navigationScreenModel, String str, InterfaceC25312u interfaceC25312u) {
        if (navigationScreenModel instanceof CoachScreenModel) {
            CoachScreenModel coachScreenModel = (CoachScreenModel) navigationScreenModel;
            return coachScreenModel.copy((16359 & 1) != 0 ? coachScreenModel.sourceType : AbstractC38690b.m124093e(str), (16359 & 2) != 0 ? coachScreenModel.entryText : null, (16359 & 4) != 0 ? coachScreenModel.conversationSeedId : null, (16359 & 8) != 0 ? coachScreenModel.cardVariant : null, (16359 & 16) != 0 ? coachScreenModel.label : null, (16359 & 32) != 0 ? coachScreenModel.presetQuestion : null, (16359 & 64) != 0 ? coachScreenModel.includeInitialMessage : false, (16359 & 128) != 0 ? coachScreenModel.sourceId : null, (16359 & 256) != 0 ? coachScreenModel.args : null, (16359 & 512) != 0 ? coachScreenModel.source : null, (16359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? coachScreenModel.educationType : null, (16359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? coachScreenModel.deeplinkConversationId : null, (16359 & 4096) != 0 ? coachScreenModel.deeplinkSourceId : null, (16359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? coachScreenModel.shouldOpenFullSize : false);
        }
        if (navigationScreenModel instanceof AiCoachChatScreenModel) {
            AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) navigationScreenModel;
            return aiCoachChatScreenModel.copy((32763 & 1) != 0 ? aiCoachChatScreenModel.fingerprint : null, (32763 & 2) != 0 ? aiCoachChatScreenModel.sourceId : null, (32763 & 4) != 0 ? aiCoachChatScreenModel.sourceType : AbstractC38690b.m124093e(str), (32763 & 8) != 0 ? aiCoachChatScreenModel.staticInitialMessage : null, (32763 & 16) != 0 ? aiCoachChatScreenModel.userMessage : null, (32763 & 32) != 0 ? aiCoachChatScreenModel.onboardingAnalyticSource : null, (32763 & 64) != 0 ? aiCoachChatScreenModel.educationType : null, (32763 & 128) != 0 ? aiCoachChatScreenModel.presetQuestionKey : null, (32763 & 256) != 0 ? aiCoachChatScreenModel.args : null, (32763 & 512) != 0 ? aiCoachChatScreenModel.shouldOpenFullSize : false, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aiCoachChatScreenModel.coachEverywhereMainContent : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aiCoachChatScreenModel.isCoachEverywhereDetailScreen : false, (32763 & 4096) != 0 ? aiCoachChatScreenModel.isPrefetchEnabled : false, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aiCoachChatScreenModel.isPushNavigationEnabled : false, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aiCoachChatScreenModel.isWhoopCoachEverywhere : false);
        }
        if (navigationScreenModel instanceof FeatureEducationModel) {
            return FeatureEducationModel.copy$default((FeatureEducationModel) navigationScreenModel, null, AbstractC38690b.m124092d(str), AbstractC38690b.m124091c(str), 1, null);
        }
        if (!(navigationScreenModel instanceof TrendsScreenModel)) {
            return navigationScreenModel;
        }
        if (interfaceC25312u instanceof C22596g) {
            return TrendsScreenModel.copy$default((TrendsScreenModel) navigationScreenModel, null, 0, null, AbstractC38690b.m124094f(str), null, null, 55, null);
        }
        return ((interfaceC25312u instanceof C4042i1) || (interfaceC25312u instanceof C21425i)) ? TrendsScreenModel.copy$default((TrendsScreenModel) navigationScreenModel, null, 0, null, AbstractC38690b.m124095g(str), null, null, 55, null) : (TrendsScreenModel) navigationScreenModel;
    }

    /* JADX INFO: renamed from: c */
    public final void m11491c(InterfaceC11182a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC11182a.c) {
            InterfaceC11182a.c cVar = (InterfaceC11182a.c) event;
            m11489b(cVar.getNavAction(), cVar.getSource(), cVar.getItemViewState());
        } else if (event instanceof InterfaceC11182a.b) {
            InterfaceC11182a.b bVar = (InterfaceC11182a.b) event;
            m11489b(m11488a(bVar.getItemViewState()), bVar.getSource(), bVar.getItemViewState());
        } else {
            if (!(event instanceof InterfaceC11182a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    public /* synthetic */ C3693c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DeepDiveNavigationRouter") : interfaceC34116n);
    }
}
