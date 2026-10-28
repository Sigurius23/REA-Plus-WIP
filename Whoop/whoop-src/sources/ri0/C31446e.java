package ri0;

import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.archv2.feature.domain.C6011q;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.ModalLifecycleInteraction;
import com.whoop.metrics.common.ScreenState;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import com.whoop.whoopaction.domain.models.ReloadAction;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import pi0.EnumC29250b;
import ti0.C33836a;
import ti0.C33840e;

/* JADX INFO: renamed from: ri0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001dQB«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ´\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b0\u00105R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\b6\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bB\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bC\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\bG\u0010LR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\b\u001a\u00103R\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, m65681d2 = {"Lri0/e;", "Lfy1/k;", "Lri0/e$b;", "fullScreenModal", "Lti0/a;", "templateContentState", "", "disableBackNavigation", "Lri0/b$a;", "analyticEvent", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "onStartLifecycleInteraction", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "modalLifecycleInteraction", "Lti0/e;", "fullScreenContentState", "nestedModal", "nestedModalLifecycleInteraction", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "pendingReloadAction", "Lcom/whoop/archv2/feature/domain/q;", "pendingPermissionRequest", "Lcom/whoop/archv2/feature/domain/p;", "pendingMediaPick", "isStaleFromCache", "<init>", "(Lri0/e$b;Lti0/a;ZLri0/b$a;Lcom/whoop/design/models/modal/DecodedGenericInteraction;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalLifecycleInteraction;Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalLifecycleInteraction;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Z)V", "b", "(Lri0/e$b;Lti0/a;ZLri0/b$a;Lcom/whoop/design/models/modal/DecodedGenericInteraction;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalLifecycleInteraction;Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalLifecycleInteraction;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Z)Lri0/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lri0/e$b;", "g", "()Lri0/e$b;", "c", "Lti0/a;", "p", "()Lti0/a;", "d", "Z", "e", "()Z", "Lri0/b$a;", "()Lri0/b$a;", "f", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "l", "()Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "Lcom/whoop/design/models/modal/AnyModal;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "i", "()Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "Lti0/e;", "()Lti0/e;", "j", "k", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "o", "()Lcom/whoop/whoopaction/domain/models/ReloadAction;", "m", "Lcom/whoop/archv2/feature/domain/q;", "n", "()Lcom/whoop/archv2/feature/domain/q;", "Lcom/whoop/archv2/feature/domain/p;", "()Lcom/whoop/archv2/feature/domain/p;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31446e implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33836a templateContentState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean disableBackNavigation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31443b.a analyticEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final DecodedGenericInteraction onStartLifecycleInteraction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ModalLifecycleInteraction modalLifecycleInteraction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C33840e fullScreenContentState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AnyModal nestedModal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ModalLifecycleInteraction nestedModalLifecycleInteraction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final ReloadAction pendingReloadAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C6011q pendingPermissionRequest;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C6010p pendingMediaPick;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isStaleFromCache;

    /* JADX INFO: renamed from: ri0.e$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lri0/e$a;", "", "", "Lm91/o;", "itemViewState", "Lpi0/b;", "sectionType", "<init>", "(Ljava/util/List;Lpi0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lpi0/b;", "()Lpi0/b;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C25306o> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC29250b sectionType;

        public a(List<C25306o> itemViewState, EnumC29250b sectionType) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(sectionType, "sectionType");
            this.itemViewState = itemViewState;
            this.sectionType = sectionType;
        }

        /* JADX INFO: renamed from: a */
        public final List<C25306o> m96825a() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC29250b getSectionType() {
            return this.sectionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.sectionType == aVar.sectionType;
        }

        public int hashCode() {
            return this.sectionType.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", sectionType=" + this.sectionType + ")";
        }
    }

    public C31446e(b bVar, C33836a c33836a, boolean z4, InterfaceC31443b.a aVar, DecodedGenericInteraction decodedGenericInteraction, AnyModal anyModal, ModalLifecycleInteraction modalLifecycleInteraction, C33840e c33840e, AnyModal anyModal2, ModalLifecycleInteraction modalLifecycleInteraction2, ReloadAction reloadAction, C6011q c6011q, C6010p c6010p, boolean z13) {
        this.fullScreenModal = bVar;
        this.templateContentState = c33836a;
        this.disableBackNavigation = z4;
        this.analyticEvent = aVar;
        this.onStartLifecycleInteraction = decodedGenericInteraction;
        this.modal = anyModal;
        this.modalLifecycleInteraction = modalLifecycleInteraction;
        this.fullScreenContentState = c33840e;
        this.nestedModal = anyModal2;
        this.nestedModalLifecycleInteraction = modalLifecycleInteraction2;
        this.pendingReloadAction = reloadAction;
        this.pendingPermissionRequest = c6011q;
        this.pendingMediaPick = c6010p;
        this.isStaleFromCache = z13;
    }

    /* JADX INFO: renamed from: b */
    public final C31446e m96811b(b fullScreenModal, C33836a templateContentState, boolean disableBackNavigation, InterfaceC31443b.a analyticEvent, DecodedGenericInteraction onStartLifecycleInteraction, AnyModal modal, ModalLifecycleInteraction modalLifecycleInteraction, C33840e fullScreenContentState, AnyModal nestedModal, ModalLifecycleInteraction nestedModalLifecycleInteraction, ReloadAction pendingReloadAction, C6011q pendingPermissionRequest, C6010p pendingMediaPick, boolean isStaleFromCache) {
        return new C31446e(fullScreenModal, templateContentState, disableBackNavigation, analyticEvent, onStartLifecycleInteraction, modal, modalLifecycleInteraction, fullScreenContentState, nestedModal, nestedModalLifecycleInteraction, pendingReloadAction, pendingPermissionRequest, pendingMediaPick, isStaleFromCache);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC31443b.a getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisableBackNavigation() {
        return this.disableBackNavigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31446e)) {
            return false;
        }
        C31446e c31446e = (C31446e) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c31446e.fullScreenModal) && AbstractC22676k.m65745e(this.templateContentState, c31446e.templateContentState) && this.disableBackNavigation == c31446e.disableBackNavigation && AbstractC22676k.m65745e(this.analyticEvent, c31446e.analyticEvent) && AbstractC22676k.m65745e(this.onStartLifecycleInteraction, c31446e.onStartLifecycleInteraction) && AbstractC22676k.m65745e(this.modal, c31446e.modal) && AbstractC22676k.m65745e(this.modalLifecycleInteraction, c31446e.modalLifecycleInteraction) && AbstractC22676k.m65745e(this.fullScreenContentState, c31446e.fullScreenContentState) && AbstractC22676k.m65745e(this.nestedModal, c31446e.nestedModal) && AbstractC22676k.m65745e(this.nestedModalLifecycleInteraction, c31446e.nestedModalLifecycleInteraction) && AbstractC22676k.m65745e(this.pendingReloadAction, c31446e.pendingReloadAction) && AbstractC22676k.m65745e(this.pendingPermissionRequest, c31446e.pendingPermissionRequest) && AbstractC22676k.m65745e(this.pendingMediaPick, c31446e.pendingMediaPick) && this.isStaleFromCache == c31446e.isStaleFromCache;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C33840e getFullScreenContentState() {
        return this.fullScreenContentState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        b bVar = this.fullScreenModal;
        if (bVar != null) {
            AbstractC33208p0 type = bVar.getState().getType();
            if (type instanceof AbstractC33208p0.c) {
                return ScreenState.LOADING;
            }
            return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
        }
        C33836a c33836a = this.templateContentState;
        if (c33836a == null || !this.isStaleFromCache) {
            return c33836a != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        return ScreenState.CACHE_HIT;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public int hashCode() {
        b bVar = this.fullScreenModal;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C33836a c33836a = this.templateContentState;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (c33836a == null ? 0 : c33836a.hashCode())) * 31, 31, this.disableBackNavigation);
        InterfaceC31443b.a aVar = this.analyticEvent;
        int iHashCode2 = (iM8289b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        DecodedGenericInteraction decodedGenericInteraction = this.onStartLifecycleInteraction;
        int iHashCode3 = (iHashCode2 + (decodedGenericInteraction == null ? 0 : decodedGenericInteraction.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        int iHashCode4 = (iHashCode3 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        ModalLifecycleInteraction modalLifecycleInteraction = this.modalLifecycleInteraction;
        int iHashCode5 = (iHashCode4 + (modalLifecycleInteraction == null ? 0 : modalLifecycleInteraction.hashCode())) * 31;
        C33840e c33840e = this.fullScreenContentState;
        int iHashCode6 = (iHashCode5 + (c33840e == null ? 0 : c33840e.hashCode())) * 31;
        AnyModal anyModal2 = this.nestedModal;
        int iHashCode7 = (iHashCode6 + (anyModal2 == null ? 0 : anyModal2.hashCode())) * 31;
        ModalLifecycleInteraction modalLifecycleInteraction2 = this.nestedModalLifecycleInteraction;
        int iHashCode8 = (iHashCode7 + (modalLifecycleInteraction2 == null ? 0 : modalLifecycleInteraction2.hashCode())) * 31;
        ReloadAction reloadAction = this.pendingReloadAction;
        int iHashCode9 = (iHashCode8 + (reloadAction == null ? 0 : reloadAction.hashCode())) * 31;
        C6011q c6011q = this.pendingPermissionRequest;
        int iHashCode10 = (iHashCode9 + (c6011q == null ? 0 : c6011q.hashCode())) * 31;
        C6010p c6010p = this.pendingMediaPick;
        return Boolean.hashCode(this.isStaleFromCache) + ((iHashCode10 + (c6010p != null ? c6010p.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ModalLifecycleInteraction getModalLifecycleInteraction() {
        return this.modalLifecycleInteraction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AnyModal getNestedModal() {
        return this.nestedModal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ModalLifecycleInteraction getNestedModalLifecycleInteraction() {
        return this.nestedModalLifecycleInteraction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final DecodedGenericInteraction getOnStartLifecycleInteraction() {
        return this.onStartLifecycleInteraction;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C6010p getPendingMediaPick() {
        return this.pendingMediaPick;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C6011q getPendingPermissionRequest() {
        return this.pendingPermissionRequest;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ReloadAction getPendingReloadAction() {
        return this.pendingReloadAction;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C33836a getTemplateContentState() {
        return this.templateContentState;
    }

    public String toString() {
        return "GenericViewState(fullScreenModal=" + this.fullScreenModal + ", templateContentState=" + this.templateContentState + ", disableBackNavigation=" + this.disableBackNavigation + ", analyticEvent=" + this.analyticEvent + ", onStartLifecycleInteraction=" + this.onStartLifecycleInteraction + ", modal=" + this.modal + ", modalLifecycleInteraction=" + this.modalLifecycleInteraction + ", fullScreenContentState=" + this.fullScreenContentState + ", nestedModal=" + this.nestedModal + ", nestedModalLifecycleInteraction=" + this.nestedModalLifecycleInteraction + ", pendingReloadAction=" + this.pendingReloadAction + ", pendingPermissionRequest=" + this.pendingPermissionRequest + ", pendingMediaPick=" + this.pendingMediaPick + ", isStaleFromCache=" + this.isStaleFromCache + ")";
    }

    /* JADX INFO: renamed from: ri0.e$b */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001d\u0010#R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, m65681d2 = {"Lri0/e$b;", "", "Lsz0/q0;", "state", "Lri0/b;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "pollingTreatment", "", "Lm91/o;", "topItems", "<init>", "(Lsz0/q0;Lri0/b;Lri0/b;Lri0/b;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "e", "()Lsz0/q0;", "b", "Lri0/b;", "c", "()Lri0/b;", "d", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "f", "Ljava/util/List;", "()Ljava/util/List;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC31443b primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC31443b secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC31443b backClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final LoadingTreatment pollingTreatment;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C25306o> topItems;

        public b(C33211q0 state, InterfaceC31443b interfaceC31443b, InterfaceC31443b interfaceC31443b2, InterfaceC31443b interfaceC31443b3, LoadingTreatment loadingTreatment, List<C25306o> list) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC31443b;
            this.secondaryClickEvent = interfaceC31443b2;
            this.backClickEvent = interfaceC31443b3;
            this.pollingTreatment = loadingTreatment;
            this.topItems = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC31443b getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LoadingTreatment getPollingTreatment() {
            return this.pollingTreatment;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC31443b getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC31443b getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent) && AbstractC22676k.m65745e(this.pollingTreatment, bVar.pollingTreatment) && AbstractC22676k.m65745e(this.topItems, bVar.topItems);
        }

        /* JADX INFO: renamed from: f */
        public final List<C25306o> m96832f() {
            return this.topItems;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC31443b interfaceC31443b = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC31443b == null ? 0 : interfaceC31443b.hashCode())) * 31;
            InterfaceC31443b interfaceC31443b2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC31443b2 == null ? 0 : interfaceC31443b2.hashCode())) * 31;
            InterfaceC31443b interfaceC31443b3 = this.backClickEvent;
            int iHashCode4 = (iHashCode3 + (interfaceC31443b3 == null ? 0 : interfaceC31443b3.hashCode())) * 31;
            LoadingTreatment loadingTreatment = this.pollingTreatment;
            int iHashCode5 = (iHashCode4 + (loadingTreatment == null ? 0 : loadingTreatment.hashCode())) * 31;
            List<C25306o> list = this.topItems;
            return iHashCode5 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ", pollingTreatment=" + this.pollingTreatment + ", topItems=" + this.topItems + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC31443b interfaceC31443b, InterfaceC31443b interfaceC31443b2, InterfaceC31443b interfaceC31443b3, LoadingTreatment loadingTreatment, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC31443b, (i13 & 4) != 0 ? null : interfaceC31443b2, (i13 & 8) != 0 ? null : interfaceC31443b3, (i13 & 16) != 0 ? null : loadingTreatment, (i13 & 32) != 0 ? null : list);
        }
    }

    public /* synthetic */ C31446e(b bVar, C33836a c33836a, boolean z4, InterfaceC31443b.a aVar, DecodedGenericInteraction decodedGenericInteraction, AnyModal anyModal, ModalLifecycleInteraction modalLifecycleInteraction, C33840e c33840e, AnyModal anyModal2, ModalLifecycleInteraction modalLifecycleInteraction2, ReloadAction reloadAction, C6011q c6011q, C6010p c6010p, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bVar, (i13 & 2) != 0 ? null : c33836a, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : aVar, (i13 & 16) != 0 ? null : decodedGenericInteraction, (i13 & 32) != 0 ? null : anyModal, (i13 & 64) != 0 ? null : modalLifecycleInteraction, (i13 & 128) != 0 ? null : c33840e, (i13 & 256) != 0 ? null : anyModal2, (i13 & 512) != 0 ? null : modalLifecycleInteraction2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : reloadAction, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c6011q, (i13 & 4096) == 0 ? c6010p : null, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13);
    }
}
