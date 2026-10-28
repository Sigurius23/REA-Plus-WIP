package com.whoop.archv2.feature.domain;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.archv2.model.template.PaginationErrorState;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.cache.api.prefetch.PrefetchList;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ri0.InterfaceC31443b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&Jò\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bI\u0010;R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00128\u0006¢\u0006\f\n\u0004\bF\u0010J\u001a\u0004\b8\u0010KR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bH\u0010RR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bP\u0010UR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bL\u0010XR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bN\u0010\\\u001a\u0004\bV\u0010]R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b6\u0010^\u001a\u0004\bS\u0010_R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bI\u0010`\u001a\u0004\ba\u0010b¨\u0006c"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/f;", "", "Lcom/whoop/archv2/feature/domain/b;", "currentDialogType", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "screenTemplate", "", "manualRefresh", "displayRefreshingSpinner", "isStaleFromCache", "Lri0/b;", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/models/modal/AnyModal;", "modal", "nestedModal", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "systemBackDisabled", "", "", "accumulatedState", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "prefetchList", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lcom/whoop/archv2/feature/domain/o;", "paginationStatus", "Lcom/whoop/archv2/model/template/PaginationErrorState;", "paginationErrorState", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "pendingReloadAction", "Lcom/whoop/archv2/feature/domain/q;", "pendingPermissionRequest", "Lcom/whoop/archv2/feature/domain/p;", "pendingMediaPick", "Lcom/whoop/archv2/feature/domain/a;", "topItems", "<init>", "(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)V", "a", "(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/archv2/feature/domain/b;", "d", "()Lcom/whoop/archv2/feature/domain/b;", "b", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "r", "()Lcom/whoop/archv2/model/template/ScreenTemplate;", "c", "Z", "g", "()Z", "e", "u", "f", "Lri0/b;", "()Lri0/b;", "Lcom/whoop/design/models/modal/AnyModal;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/models/modal/AnyModal;", "i", "Lcom/whoop/navigation/models/GenericInteraction;", "k", "()Lcom/whoop/navigation/models/GenericInteraction;", "j", "s", "Ljava/util/Map;", "()Ljava/util/Map;", "l", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "q", "()Lcom/whoop/cache/api/prefetch/PrefetchList;", "m", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "n", "Lcom/whoop/archv2/feature/domain/o;", "()Lcom/whoop/archv2/feature/domain/o;", "o", "Lcom/whoop/archv2/model/template/PaginationErrorState;", "()Lcom/whoop/archv2/model/template/PaginationErrorState;", "p", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "()Lcom/whoop/whoopaction/domain/models/ReloadAction;", "Lcom/whoop/archv2/feature/domain/q;", "()Lcom/whoop/archv2/feature/domain/q;", "Lcom/whoop/archv2/feature/domain/p;", "()Lcom/whoop/archv2/feature/domain/p;", "Lcom/whoop/archv2/feature/domain/a;", "t", "()Lcom/whoop/archv2/feature/domain/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C5998f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC5994b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ScreenTemplate screenTemplate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isStaleFromCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC31443b event;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AnyModal nestedModal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final GenericInteraction onStartInteraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean systemBackDisabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, Object> accumulatedState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final PrefetchList prefetchList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final ApiRequest nextPageRequest;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC6009o paginationStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final PaginationErrorState paginationErrorState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final ReloadAction pendingReloadAction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C6011q pendingPermissionRequest;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C6010p pendingMediaPick;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C5993a topItems;

    public C5998f(InterfaceC5994b interfaceC5994b, ScreenTemplate screenTemplate, boolean z4, boolean z13, boolean z14, InterfaceC31443b interfaceC31443b, AnyModal anyModal, AnyModal anyModal2, GenericInteraction genericInteraction, boolean z15, Map<String, ? extends Object> accumulatedState, PrefetchList prefetchList, ApiRequest apiRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState, ReloadAction reloadAction, C6011q c6011q, C6010p c6010p, C5993a c5993a) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(prefetchList, "prefetchList");
        AbstractC22676k.m65750j(paginationStatus, "paginationStatus");
        this.currentDialogType = interfaceC5994b;
        this.screenTemplate = screenTemplate;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.isStaleFromCache = z14;
        this.event = interfaceC31443b;
        this.modal = anyModal;
        this.nestedModal = anyModal2;
        this.onStartInteraction = genericInteraction;
        this.systemBackDisabled = z15;
        this.accumulatedState = accumulatedState;
        this.prefetchList = prefetchList;
        this.nextPageRequest = apiRequest;
        this.paginationStatus = paginationStatus;
        this.paginationErrorState = paginationErrorState;
        this.pendingReloadAction = reloadAction;
        this.pendingPermissionRequest = c6011q;
        this.pendingMediaPick = c6010p;
        this.topItems = c5993a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5998f m17897b(C5998f c5998f, InterfaceC5994b interfaceC5994b, ScreenTemplate screenTemplate, boolean z4, boolean z13, boolean z14, InterfaceC31443b interfaceC31443b, AnyModal anyModal, AnyModal anyModal2, GenericInteraction genericInteraction, boolean z15, Map map, PrefetchList prefetchList, ApiRequest apiRequest, EnumC6009o enumC6009o, PaginationErrorState paginationErrorState, ReloadAction reloadAction, C6011q c6011q, C6010p c6010p, C5993a c5993a, int i13, Object obj) {
        C5993a c5993a2;
        C6010p c6010p2;
        InterfaceC5994b interfaceC5994b2 = (i13 & 1) != 0 ? c5998f.currentDialogType : interfaceC5994b;
        ScreenTemplate screenTemplate2 = (i13 & 2) != 0 ? c5998f.screenTemplate : screenTemplate;
        boolean z16 = (i13 & 4) != 0 ? c5998f.manualRefresh : z4;
        boolean z17 = (i13 & 8) != 0 ? c5998f.displayRefreshingSpinner : z13;
        boolean z18 = (i13 & 16) != 0 ? c5998f.isStaleFromCache : z14;
        InterfaceC31443b interfaceC31443b2 = (i13 & 32) != 0 ? c5998f.event : interfaceC31443b;
        AnyModal anyModal3 = (i13 & 64) != 0 ? c5998f.modal : anyModal;
        AnyModal anyModal4 = (i13 & 128) != 0 ? c5998f.nestedModal : anyModal2;
        GenericInteraction genericInteraction2 = (i13 & 256) != 0 ? c5998f.onStartInteraction : genericInteraction;
        boolean z19 = (i13 & 512) != 0 ? c5998f.systemBackDisabled : z15;
        Map map2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c5998f.accumulatedState : map;
        PrefetchList prefetchList2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c5998f.prefetchList : prefetchList;
        ApiRequest apiRequest2 = (i13 & 4096) != 0 ? c5998f.nextPageRequest : apiRequest;
        EnumC6009o enumC6009o2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c5998f.paginationStatus : enumC6009o;
        InterfaceC5994b interfaceC5994b3 = interfaceC5994b2;
        PaginationErrorState paginationErrorState2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c5998f.paginationErrorState : paginationErrorState;
        ReloadAction reloadAction2 = (i13 & 32768) != 0 ? c5998f.pendingReloadAction : reloadAction;
        C6011q c6011q2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c5998f.pendingPermissionRequest : c6011q;
        C6010p c6010p3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c5998f.pendingMediaPick : c6010p;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            c6010p2 = c6010p3;
            c5993a2 = c5998f.topItems;
        } else {
            c5993a2 = c5993a;
            c6010p2 = c6010p3;
        }
        return c5998f.m17898a(interfaceC5994b3, screenTemplate2, z16, z17, z18, interfaceC31443b2, anyModal3, anyModal4, genericInteraction2, z19, map2, prefetchList2, apiRequest2, enumC6009o2, paginationErrorState2, reloadAction2, c6011q2, c6010p2, c5993a2);
    }

    /* JADX INFO: renamed from: a */
    public final C5998f m17898a(InterfaceC5994b currentDialogType, ScreenTemplate screenTemplate, boolean manualRefresh, boolean displayRefreshingSpinner, boolean isStaleFromCache, InterfaceC31443b event, AnyModal modal, AnyModal nestedModal, GenericInteraction onStartInteraction, boolean systemBackDisabled, Map<String, ? extends Object> accumulatedState, PrefetchList prefetchList, ApiRequest nextPageRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState, ReloadAction pendingReloadAction, C6011q pendingPermissionRequest, C6010p pendingMediaPick, C5993a topItems) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(prefetchList, "prefetchList");
        AbstractC22676k.m65750j(paginationStatus, "paginationStatus");
        return new C5998f(currentDialogType, screenTemplate, manualRefresh, displayRefreshingSpinner, isStaleFromCache, event, modal, nestedModal, onStartInteraction, systemBackDisabled, accumulatedState, prefetchList, nextPageRequest, paginationStatus, paginationErrorState, pendingReloadAction, pendingPermissionRequest, pendingMediaPick, topItems);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m17899c() {
        return this.accumulatedState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC5994b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5998f)) {
            return false;
        }
        C5998f c5998f = (C5998f) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c5998f.currentDialogType) && AbstractC22676k.m65745e(this.screenTemplate, c5998f.screenTemplate) && this.manualRefresh == c5998f.manualRefresh && this.displayRefreshingSpinner == c5998f.displayRefreshingSpinner && this.isStaleFromCache == c5998f.isStaleFromCache && AbstractC22676k.m65745e(this.event, c5998f.event) && AbstractC22676k.m65745e(this.modal, c5998f.modal) && AbstractC22676k.m65745e(this.nestedModal, c5998f.nestedModal) && AbstractC22676k.m65745e(this.onStartInteraction, c5998f.onStartInteraction) && this.systemBackDisabled == c5998f.systemBackDisabled && AbstractC22676k.m65745e(this.accumulatedState, c5998f.accumulatedState) && AbstractC22676k.m65745e(this.prefetchList, c5998f.prefetchList) && AbstractC22676k.m65745e(this.nextPageRequest, c5998f.nextPageRequest) && this.paginationStatus == c5998f.paginationStatus && AbstractC22676k.m65745e(this.paginationErrorState, c5998f.paginationErrorState) && AbstractC22676k.m65745e(this.pendingReloadAction, c5998f.pendingReloadAction) && AbstractC22676k.m65745e(this.pendingPermissionRequest, c5998f.pendingPermissionRequest) && AbstractC22676k.m65745e(this.pendingMediaPick, c5998f.pendingMediaPick) && AbstractC22676k.m65745e(this.topItems, c5998f.topItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC31443b getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public int hashCode() {
        InterfaceC5994b interfaceC5994b = this.currentDialogType;
        int iHashCode = (interfaceC5994b == null ? 0 : interfaceC5994b.hashCode()) * 31;
        ScreenTemplate screenTemplate = this.screenTemplate;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (screenTemplate == null ? 0 : screenTemplate.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner), 31, this.isStaleFromCache);
        InterfaceC31443b interfaceC31443b = this.event;
        int iHashCode2 = (iM8289b + (interfaceC31443b == null ? 0 : interfaceC31443b.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        int iHashCode3 = (iHashCode2 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        AnyModal anyModal2 = this.nestedModal;
        int iHashCode4 = (iHashCode3 + (anyModal2 == null ? 0 : anyModal2.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onStartInteraction;
        int iHashCode5 = (this.prefetchList.hashCode() + AbstractC3855a.m11821e(this.accumulatedState, AbstractC2875y.m8289b((iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31, this.systemBackDisabled), 31)) * 31;
        ApiRequest apiRequest = this.nextPageRequest;
        int iHashCode6 = (this.paginationStatus.hashCode() + ((iHashCode5 + (apiRequest == null ? 0 : apiRequest.hashCode())) * 31)) * 31;
        PaginationErrorState paginationErrorState = this.paginationErrorState;
        int iHashCode7 = (iHashCode6 + (paginationErrorState == null ? 0 : paginationErrorState.hashCode())) * 31;
        ReloadAction reloadAction = this.pendingReloadAction;
        int iHashCode8 = (iHashCode7 + (reloadAction == null ? 0 : reloadAction.hashCode())) * 31;
        C6011q c6011q = this.pendingPermissionRequest;
        int iHashCode9 = (iHashCode8 + (c6011q == null ? 0 : c6011q.hashCode())) * 31;
        C6010p c6010p = this.pendingMediaPick;
        int iHashCode10 = (iHashCode9 + (c6010p == null ? 0 : c6010p.hashCode())) * 31;
        C5993a c5993a = this.topItems;
        return iHashCode10 + (c5993a != null ? c5993a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AnyModal getNestedModal() {
        return this.nestedModal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ApiRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final GenericInteraction getOnStartInteraction() {
        return this.onStartInteraction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final PaginationErrorState getPaginationErrorState() {
        return this.paginationErrorState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC6009o getPaginationStatus() {
        return this.paginationStatus;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C6010p getPendingMediaPick() {
        return this.pendingMediaPick;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C6011q getPendingPermissionRequest() {
        return this.pendingPermissionRequest;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final ReloadAction getPendingReloadAction() {
        return this.pendingReloadAction;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public PrefetchList getPrefetchList() {
        return this.prefetchList;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ScreenTemplate getScreenTemplate() {
        return this.screenTemplate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getSystemBackDisabled() {
        return this.systemBackDisabled;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C5993a getTopItems() {
        return this.topItems;
    }

    public String toString() {
        InterfaceC5994b interfaceC5994b = this.currentDialogType;
        ScreenTemplate screenTemplate = this.screenTemplate;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        boolean z14 = this.isStaleFromCache;
        InterfaceC31443b interfaceC31443b = this.event;
        AnyModal anyModal = this.modal;
        AnyModal anyModal2 = this.nestedModal;
        GenericInteraction genericInteraction = this.onStartInteraction;
        boolean z15 = this.systemBackDisabled;
        Map<String, Object> map = this.accumulatedState;
        PrefetchList prefetchList = this.prefetchList;
        ApiRequest apiRequest = this.nextPageRequest;
        EnumC6009o enumC6009o = this.paginationStatus;
        PaginationErrorState paginationErrorState = this.paginationErrorState;
        ReloadAction reloadAction = this.pendingReloadAction;
        C6011q c6011q = this.pendingPermissionRequest;
        C6010p c6010p = this.pendingMediaPick;
        C5993a c5993a = this.topItems;
        StringBuilder sb4 = new StringBuilder("GenericDomainState(currentDialogType=");
        sb4.append(interfaceC5994b);
        sb4.append(", screenTemplate=");
        sb4.append(screenTemplate);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", isStaleFromCache=");
        sb4.append(z14);
        sb4.append(", event=");
        sb4.append(interfaceC31443b);
        sb4.append(", modal=");
        sb4.append(anyModal);
        sb4.append(", nestedModal=");
        sb4.append(anyModal2);
        sb4.append(", onStartInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", systemBackDisabled=");
        sb4.append(z15);
        sb4.append(", accumulatedState=");
        sb4.append(map);
        sb4.append(", prefetchList=");
        sb4.append(prefetchList);
        sb4.append(", nextPageRequest=");
        sb4.append(apiRequest);
        sb4.append(", paginationStatus=");
        sb4.append(enumC6009o);
        sb4.append(", paginationErrorState=");
        sb4.append(paginationErrorState);
        sb4.append(", pendingReloadAction=");
        sb4.append(reloadAction);
        sb4.append(", pendingPermissionRequest=");
        sb4.append(c6011q);
        sb4.append(", pendingMediaPick=");
        sb4.append(c6010p);
        sb4.append(", topItems=");
        sb4.append(c5993a);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsStaleFromCache() {
        return this.isStaleFromCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5998f(InterfaceC5994b interfaceC5994b, ScreenTemplate screenTemplate, boolean z4, boolean z13, boolean z14, InterfaceC31443b interfaceC31443b, AnyModal anyModal, AnyModal anyModal2, GenericInteraction genericInteraction, boolean z15, Map map, PrefetchList prefetchList, ApiRequest apiRequest, EnumC6009o enumC6009o, PaginationErrorState paginationErrorState, ReloadAction reloadAction, C6011q c6011q, C6010p c6010p, C5993a c5993a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        PrefetchList prefetchList2;
        List list = null;
        Object[] objArr = 0;
        InterfaceC5994b interfaceC5994b2 = (i13 & 1) != 0 ? null : interfaceC5994b;
        ScreenTemplate screenTemplate2 = (i13 & 2) != 0 ? null : screenTemplate;
        boolean z16 = (i13 & 4) != 0 ? false : z4;
        boolean z17 = (i13 & 8) != 0 ? false : z13;
        boolean z18 = (i13 & 16) != 0 ? false : z14;
        InterfaceC31443b interfaceC31443b2 = (i13 & 32) != 0 ? null : interfaceC31443b;
        AnyModal anyModal3 = (i13 & 64) != 0 ? null : anyModal;
        AnyModal anyModal4 = (i13 & 128) != 0 ? null : anyModal2;
        GenericInteraction genericInteraction2 = (i13 & 256) != 0 ? null : genericInteraction;
        boolean z19 = (i13 & 512) == 0 ? z15 : false;
        Map map2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            prefetchList2 = new PrefetchList(list, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            prefetchList2 = prefetchList;
        }
        this(interfaceC5994b2, screenTemplate2, z16, z17, z18, interfaceC31443b2, anyModal3, anyModal4, genericInteraction2, z19, map2, prefetchList2, (i13 & 4096) != 0 ? null : apiRequest, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC6009o.IDLE : enumC6009o, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : paginationErrorState, (i13 & 32768) != 0 ? null : reloadAction, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : c6011q, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : c6010p, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : c5993a);
    }
}
