package si0;

import ad3.AbstractC0757c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.domain.C5993a;
import com.whoop.archv2.feature.domain.C5998f;
import com.whoop.archv2.feature.domain.InterfaceC5994b;
import com.whoop.archv2.model.template.ListPagination;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.MetaData;
import com.whoop.archv2.model.template.PullToRefreshBehavior;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import com.whoop.archv2.model.template.TemplatePadding;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.ModalLifecycleInteraction;
import com.whoop.design.models.modal.ModalLifecycleInteractions;
import com.whoop.navigation.models.GenericInteraction;
import java.util.List;
import java.util.Map;
import jb1.C21535a;
import l83.C23465k;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import ri0.C31446e;
import ri0.InterfaceC31443b;
import ti0.C33836a;
import ti0.C33840e;

/* JADX INFO: renamed from: si0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u001c*\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lsi0/g;", "", "Lsi0/e;", "genericContentStateReducer", "Lsi0/h;", "listContentStateReducer", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "screenAnalytics", "Lad3/c;", "json", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljb1/a;", "designItemReducer", "<init>", "(Lsi0/e;Lsi0/h;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lad3/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V", "Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/b$a;", "type", "Lri0/e;", "b", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b$a;)Lri0/e;", "d", "(Lcom/whoop/archv2/feature/domain/f;)Lri0/e;", "Lcom/whoop/design/models/modal/FullScreenContentModal;", "", "", "accumulatedState", "Lti0/e;", "c", "(Lcom/whoop/design/models/modal/FullScreenContentModal;Ljava/util/Map;)Lti0/e;", "e", "(Ljava/util/Map;)Ljava/util/Map;", "domainResult", "a", "Lsi0/e;", "Lsi0/h;", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "Lad3/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Ljb1/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32541g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32539e genericContentStateReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32542h listContentStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScreenAnalyticEventModel screenAnalytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C32541g(C32539e genericContentStateReducer, C32542h listContentStateReducer, ScreenAnalyticEventModel screenAnalytics, AbstractC0757c json, FeatureFlagChecker featureFlagChecker, C21535a designItemReducer) {
        AbstractC22676k.m65750j(genericContentStateReducer, "genericContentStateReducer");
        AbstractC22676k.m65750j(listContentStateReducer, "listContentStateReducer");
        AbstractC22676k.m65750j(screenAnalytics, "screenAnalytics");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.genericContentStateReducer = genericContentStateReducer;
        this.listContentStateReducer = listContentStateReducer;
        this.screenAnalytics = screenAnalytics;
        this.json = json;
        this.featureFlagChecker = featureFlagChecker;
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C31446e m101564b(C5998f c5998f, InterfaceC5994b.a aVar) {
        AnalyticEventModel screenFailed;
        List<DesignSystemModel> listM17878a;
        List<DesignSystemModel> listM17879b;
        C5993a topItems = c5998f.getTopItems();
        List listM60536k = (topItems == null || (listM17879b = topItems.m17879b()) == null) ? null : C21535a.m60536k(this.designItemReducer, listM17879b, null, 2, null);
        C5993a topItems2 = c5998f.getTopItems();
        List listM60536k2 = (topItems2 == null || (listM17878a = topItems2.m17878a()) == null) ? null : C21535a.m60536k(this.designItemReducer, listM17878a, null, 2, null);
        ScreenTemplate screenTemplate = c5998f.getScreenTemplate();
        if (screenTemplate == null || (screenFailed = screenTemplate.failureAnalyticEvent(this.screenAnalytics)) == null) {
            screenFailed = this.screenAnalytics.getScreenFailed();
        }
        if (aVar instanceof InterfaceC5994b.b) {
            return new C31446e(new C31446e.b(C33205o0.f138451a.m105288b(), null, null, null, ((InterfaceC5994b.b) aVar).getTreatment(), listM60536k, 14, null), null, false, null, null, null, null, null, null, null, null, null, null, false, 16374, null);
        }
        if (aVar instanceof InterfaceC5994b.c) {
            return new C31446e(new C31446e.b(C33205o0.f138451a.m105289c(), new InterfaceC31443b.u(false, null, null, 7, null), null, new InterfaceC31443b.h(null, 1, null), null, listM60536k2, 20, null), null, false, screenFailed != null ? new InterfaceC31443b.g(screenFailed) : null, null, null, null, null, null, null, null, null, null, false, 16374, null);
        }
        if (aVar instanceof InterfaceC5994b.d) {
            return new C31446e(((InterfaceC5994b.d) aVar).getStatusCode() == 404 ? new C31446e.b(C33205o0.f138451a.m105290d(), new InterfaceC31443b.h(null, 1, null), null, new InterfaceC31443b.h(null, 1, null), null, listM60536k2, 20, null) : new C31446e.b(C33205o0.f138451a.m105291e(), new InterfaceC31443b.u(false, null, null, 7, null), null, new InterfaceC31443b.h(null, 1, null), null, listM60536k2, 20, null), null, false, screenFailed != null ? new InterfaceC31443b.g(screenFailed) : null, null, null, null, null, null, null, null, null, null, false, 16374, null);
        }
        if (aVar instanceof InterfaceC5994b.e) {
            return new C31446e(new C31446e.b(C33205o0.f138451a.m105293g(), null, null, null, null, null, 62, null), null, false, null, null, null, null, null, null, null, null, null, null, false, 16374, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C33840e m101565c(FullScreenContentModal fullScreenContentModal, Map<String, ? extends Object> map) {
        C32542h c32542h = this.listContentStateReducer;
        NavigationBarModel navigationBar = fullScreenContentModal.getNavigationBar();
        List<DesignSystemModel> items = fullScreenContentModal.getItems();
        if (items.isEmpty()) {
            items = null;
        }
        return C32542h.m101569b(c32542h, new ListTemplate((MetaData) null, navigationBar, items, fullScreenContentModal.getFooter(), (TemplateBackgroundTheme) null, fullScreenContentModal.getBackgroundImageUrl(), (LifecycleInteractions) null, (ListPagination) null, (PullToRefreshBehavior) null, (TemplatePadding) null, 912, (DefaultConstructorMarker) null), false, false, map, null, null, null, 118, null);
    }

    /* JADX INFO: renamed from: d */
    private final C31446e m101566d(C5998f c5998f) {
        ModalLifecycleInteractions modalLifecycleInteractions;
        List<DesignSystemModel> listM17878a;
        ModalLifecycleInteractions modalLifecycleInteractions2;
        ModalLifecycleInteractions modalLifecycleInteractions3;
        Map<String, ? extends Object> mapM101567e = m101567e(c5998f.m17899c());
        C33836a c33836aM101559b = this.genericContentStateReducer.m101559b(c5998f.getScreenTemplate(), c5998f.getManualRefresh(), c5998f.getDisplayRefreshingSpinner(), mapM101567e, c5998f.getNextPageRequest(), c5998f.getPaginationStatus(), c5998f.getPaginationErrorState());
        AnyModal modal = c5998f.getModal();
        ModalLifecycleInteraction modalLifecycleInteraction = null;
        AnyModal anyModalBind = modal != null ? modal.bind(mapM101567e) : null;
        AnyModal nestedModal = c5998f.getNestedModal();
        AnyModal anyModalBind2 = nestedModal != null ? nestedModal.bind(mapM101567e) : null;
        if (c33836aM101559b != null) {
            boolean systemBackDisabled = c5998f.getSystemBackDisabled();
            AnalyticEventModel screenEntered = this.screenAnalytics.getScreenEntered();
            InterfaceC31443b.v vVar = screenEntered != null ? new InterfaceC31443b.v(screenEntered) : null;
            GenericInteraction onStartInteraction = c5998f.getOnStartInteraction();
            DecodedGenericInteraction decodedGenericInteraction = onStartInteraction != null ? GenericInteractionDecoderKt.toDecodedGenericInteraction(onStartInteraction, this.json) : null;
            ModalLifecycleInteraction modalLifecycleInteraction2 = (anyModalBind == null || (modalLifecycleInteractions3 = anyModalBind.getModalLifecycleInteractions()) == null) ? null : GenericInteractionDecoderKt.toModalLifecycleInteraction(modalLifecycleInteractions3, this.json);
            Modal modal2 = anyModalBind != null ? anyModalBind.getModal() : null;
            FullScreenContentModal fullScreenContentModal = modal2 instanceof FullScreenContentModal ? (FullScreenContentModal) modal2 : null;
            C33840e c33840eM101565c = fullScreenContentModal != null ? m101565c(fullScreenContentModal, mapM101567e) : null;
            if (anyModalBind2 != null && (modalLifecycleInteractions2 = anyModalBind2.getModalLifecycleInteractions()) != null) {
                modalLifecycleInteraction = GenericInteractionDecoderKt.toModalLifecycleInteraction(modalLifecycleInteractions2, this.json);
            }
            return new C31446e(null, c33836aM101559b, systemBackDisabled, vVar, decodedGenericInteraction, anyModalBind, modalLifecycleInteraction2, c33840eM101565c, anyModalBind2, modalLifecycleInteraction, c5998f.getPendingReloadAction(), c5998f.getPendingPermissionRequest(), null, c5998f.getIsStaleFromCache(), DfuBaseService.ERROR_FILE_NOT_FOUND, null);
        }
        C33211q0 c33211q0M105291e = C33205o0.f138451a.m105291e();
        InterfaceC31443b.u uVar = new InterfaceC31443b.u(false, null, null, 7, null);
        InterfaceC31443b.h hVar = new InterfaceC31443b.h(null, 1, null);
        C5993a topItems = c5998f.getTopItems();
        C31446e.b bVar = new C31446e.b(c33211q0M105291e, uVar, null, hVar, null, (topItems == null || (listM17878a = topItems.m17878a()) == null) ? null : C21535a.m60536k(this.designItemReducer, listM17878a, null, 2, null), 20, null);
        AnalyticEventModel screenFailed = this.screenAnalytics.getScreenFailed();
        InterfaceC31443b.g gVar = screenFailed != null ? new InterfaceC31443b.g(screenFailed) : null;
        GenericInteraction onStartInteraction2 = c5998f.getOnStartInteraction();
        DecodedGenericInteraction decodedGenericInteraction2 = onStartInteraction2 != null ? GenericInteractionDecoderKt.toDecodedGenericInteraction(onStartInteraction2, this.json) : null;
        if (anyModalBind != null && (modalLifecycleInteractions = anyModalBind.getModalLifecycleInteractions()) != null) {
            modalLifecycleInteraction = GenericInteractionDecoderKt.toModalLifecycleInteraction(modalLifecycleInteractions, this.json);
        }
        return new C31446e(bVar, null, false, gVar, decodedGenericInteraction2, anyModalBind, modalLifecycleInteraction, null, null, null, null, null, null, false, 16262, null);
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, Object> m101567e(Map<String, ? extends Object> map) {
        return (map.isEmpty() || !this.featureFlagChecker.isFeatureEnabled("arch-v2-blank-binding-clears-field")) ? map : AbstractC25247g0.m73996e0(map, new C23465k(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: a */
    public final C31446e m101568a(C5998f domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        C31446e c31446eM101564b = domainResult.getCurrentDialogType() instanceof InterfaceC5994b.a ? m101564b(domainResult, (InterfaceC5994b.a) domainResult.getCurrentDialogType()) : m101566d(domainResult);
        return c31446eM101564b.m96811b((12287 & 1) != 0 ? c31446eM101564b.fullScreenModal : null, (12287 & 2) != 0 ? c31446eM101564b.templateContentState : null, (12287 & 4) != 0 ? c31446eM101564b.disableBackNavigation : false, (12287 & 8) != 0 ? c31446eM101564b.analyticEvent : null, (12287 & 16) != 0 ? c31446eM101564b.onStartLifecycleInteraction : null, (12287 & 32) != 0 ? c31446eM101564b.modal : null, (12287 & 64) != 0 ? c31446eM101564b.modalLifecycleInteraction : null, (12287 & 128) != 0 ? c31446eM101564b.fullScreenContentState : null, (12287 & 256) != 0 ? c31446eM101564b.nestedModal : null, (12287 & 512) != 0 ? c31446eM101564b.nestedModalLifecycleInteraction : null, (12287 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31446eM101564b.pendingReloadAction : null, (12287 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31446eM101564b.pendingPermissionRequest : null, (12287 & 4096) != 0 ? c31446eM101564b.pendingMediaPick : domainResult.getPendingMediaPick(), (12287 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31446eM101564b.isStaleFromCache : false);
    }
}
