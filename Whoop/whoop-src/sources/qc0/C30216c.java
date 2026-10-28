package qc0;

import c31.C3927k;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import m83.C25271y;
import m83.C25272z;
import oc0.EnumC27816a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p41.C28839j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: qc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0017\"B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lqc0/c;", "Lfy1/k;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lqc0/c$b;", "fullScreenModal", "Lqc0/c$c;", "screenContent", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/models/modal/AnyModal;", "c", "()Lcom/whoop/design/models/modal/AnyModal;", "Lqc0/c$b;", "()Lqc0/c$b;", "d", "Lqc0/c$c;", "()Lqc0/c$c;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30216c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c screenContent;

    /* JADX INFO: renamed from: qc0.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqc0/c$a;", "", "", "Lm91/u;", "itemViewState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m92457a() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.itemViewState, ((a) other).itemViewState);
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ComponentItem(itemViewState=", ")", this.itemViewState);
        }
    }

    public C30216c(AnyModal anyModal, b bVar, c cVar) {
        this.modal = anyModal;
        this.fullScreenModal = bVar;
        this.screenContent = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30216c)) {
            return false;
        }
        C30216c c30216c = (C30216c) other;
        return AbstractC22676k.m65745e(this.modal, c30216c.modal) && AbstractC22676k.m65745e(this.fullScreenModal, c30216c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c30216c.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        b bVar = this.fullScreenModal;
        if (bVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = bVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        AnyModal anyModal = this.modal;
        int iHashCode = (anyModal == null ? 0 : anyModal.hashCode()) * 31;
        b bVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.screenContent;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "MarketingConsentViewState(modal=" + this.modal + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: qc0.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lqc0/c$b;", "", "Lsz0/q0;", "state", "Lqc0/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lqc0/a;", "()Lqc0/a;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f123733e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC30214a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC30214a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC30214a backClickEvent;

        public b(C33211q0 state, InterfaceC30214a interfaceC30214a, InterfaceC30214a interfaceC30214a2, InterfaceC30214a interfaceC30214a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC30214a;
            this.secondaryClickEvent = interfaceC30214a2;
            this.backClickEvent = interfaceC30214a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC30214a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC30214a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC30214a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC30214a interfaceC30214a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC30214a == null ? 0 : interfaceC30214a.hashCode())) * 31;
            InterfaceC30214a interfaceC30214a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC30214a2 == null ? 0 : interfaceC30214a2.hashCode())) * 31;
            InterfaceC30214a interfaceC30214a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC30214a3 != null ? interfaceC30214a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC30214a interfaceC30214a, InterfaceC30214a interfaceC30214a2, InterfaceC30214a interfaceC30214a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC30214a, (i13 & 4) != 0 ? null : interfaceC30214a2, (i13 & 8) != 0 ? null : interfaceC30214a3);
        }
    }

    public /* synthetic */ C30216c(AnyModal anyModal, b bVar, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : anyModal, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: qc0.c$c */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b'\u00100R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b\u001d\u00102¨\u00063"}, m65681d2 = {"Lqc0/c$c;", "", "Lkd1/o;", "headerImage", "", "Lqc0/c$a;", "items", "itemsBelowToggle", "Lp41/j;", "toggleState", "Lc31/k;", "ctaButton", "Loc0/a;", "ctaClickAction", "", "displayRefreshingAnimation", "", "", "analyticsProperties", "<init>", "(Lkd1/o;Ljava/util/List;Ljava/util/List;Lp41/j;Lc31/k;Loc0/a;ZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "e", "()Lkd1/o;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "g", "d", "Lp41/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lp41/j;", "Lc31/k;", "()Lc31/k;", "Loc0/a;", "()Loc0/a;", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22403o headerImage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<a> itemsBelowToggle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C28839j toggleState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C3927k ctaButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC27816a ctaClickAction;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, String> analyticsProperties;

        public c(AbstractC22403o headerImage, List<a> items, List<a> itemsBelowToggle, C28839j c28839j, C3927k c3927k, EnumC27816a ctaClickAction, boolean z4, Map<String, String> analyticsProperties) {
            AbstractC22676k.m65750j(headerImage, "headerImage");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(itemsBelowToggle, "itemsBelowToggle");
            AbstractC22676k.m65750j(ctaClickAction, "ctaClickAction");
            AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
            this.headerImage = headerImage;
            this.items = items;
            this.itemsBelowToggle = itemsBelowToggle;
            this.toggleState = c28839j;
            this.ctaButton = c3927k;
            this.ctaClickAction = ctaClickAction;
            this.displayRefreshingAnimation = z4;
            this.analyticsProperties = analyticsProperties;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m92462a() {
            return this.analyticsProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C3927k getCtaButton() {
            return this.ctaButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC27816a getCtaClickAction() {
            return this.ctaClickAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC22403o getHeaderImage() {
            return this.headerImage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.headerImage, cVar.headerImage) && AbstractC22676k.m65745e(this.items, cVar.items) && AbstractC22676k.m65745e(this.itemsBelowToggle, cVar.itemsBelowToggle) && AbstractC22676k.m65745e(this.toggleState, cVar.toggleState) && AbstractC22676k.m65745e(this.ctaButton, cVar.ctaButton) && this.ctaClickAction == cVar.ctaClickAction && this.displayRefreshingAnimation == cVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.analyticsProperties, cVar.analyticsProperties);
        }

        /* JADX INFO: renamed from: f */
        public final List<a> m92467f() {
            return this.items;
        }

        /* JADX INFO: renamed from: g */
        public final List<a> m92468g() {
            return this.itemsBelowToggle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C28839j getToggleState() {
            return this.toggleState;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.headerImage.hashCode() * 31, 31, this.items), 31, this.itemsBelowToggle);
            C28839j c28839j = this.toggleState;
            int iHashCode = (iM31983b + (c28839j == null ? 0 : c28839j.hashCode())) * 31;
            C3927k c3927k = this.ctaButton;
            return this.analyticsProperties.hashCode() + AbstractC2875y.m8289b((this.ctaClickAction.hashCode() + ((iHashCode + (c3927k != null ? c3927k.hashCode() : 0)) * 31)) * 31, 31, this.displayRefreshingAnimation);
        }

        public String toString() {
            return "ScreenContent(headerImage=" + this.headerImage + ", items=" + this.items + ", itemsBelowToggle=" + this.itemsBelowToggle + ", toggleState=" + this.toggleState + ", ctaButton=" + this.ctaButton + ", ctaClickAction=" + this.ctaClickAction + ", displayRefreshingAnimation=" + this.displayRefreshingAnimation + ", analyticsProperties=" + this.analyticsProperties + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(AbstractC22403o abstractC22403o, List list, List list2, C28839j c28839j, C3927k c3927k, EnumC27816a enumC27816a, boolean z4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            abstractC22403o = (i13 & 1) != 0 ? AbstractC22403o.b.f87641b : abstractC22403o;
            int i14 = i13 & 2;
            C25271y c25271y = C25271y.f99162w;
            this(abstractC22403o, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? null : c28839j, (i13 & 16) != 0 ? null : c3927k, (i13 & 32) != 0 ? EnumC27816a.UNKNOWN : enumC27816a, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? C25272z.f99163w : map);
        }
    }
}
