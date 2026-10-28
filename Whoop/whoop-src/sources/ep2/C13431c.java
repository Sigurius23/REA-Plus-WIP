package ep2;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptSectionSpacingType;
import fy1.InterfaceC14875k;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ep2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0017\u001b\u0019'B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001b\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m65681d2 = {"Lep2/c;", "Lfy1/k;", "Lep2/c$c;", "popUpDialog", "Lep2/c$b;", "fullScreenModal", "Lep2/c$d;", "screenContent", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lep2/c$c;Lep2/c$b;Lep2/c$d;Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lep2/c$c;", "d", "()Lep2/c$c;", "c", "Lep2/c$b;", "()Lep2/c$b;", "Lep2/c$d;", "e", "()Lep2/c$d;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13431c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: ep2.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lep2/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;", "insetBottom", "<init>", "(Ljava/util/List;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;", "()Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ReceiptSectionSpacingType insetBottom;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, ReceiptSectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.itemViewState = itemViewState;
            this.insetBottom = insetBottom;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReceiptSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m38159b() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.insetBottom == aVar.insetBottom;
        }

        public int hashCode() {
            return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
        }
    }

    /* JADX INFO: renamed from: ep2.c$c */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lep2/c$c;", "", "", "hashCode", "()I", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {
        public abstract int hashCode();
    }

    /* JADX INFO: renamed from: ep2.c$d */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, m65681d2 = {"Lep2/c$d;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "Lep2/c$a;", "items", "Lm91/u;", "stickyArea", "Lcom/whoop/navigation/models/GenericInteraction;", "closeInteraction", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> stickyArea;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final GenericInteraction closeInteraction;

        /* JADX WARN: Multi-variable type inference failed */
        public d(TextResource title, List<a> items, List<? extends InterfaceC25312u> stickyArea, GenericInteraction genericInteraction) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            this.title = title;
            this.items = items;
            this.stickyArea = stickyArea;
            this.closeInteraction = genericInteraction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInteraction getCloseInteraction() {
            return this.closeInteraction;
        }

        /* JADX INFO: renamed from: b */
        public final List<a> m38165b() {
            return this.items;
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m38166c() {
            return this.stickyArea;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.items, dVar.items) && AbstractC22676k.m65745e(this.stickyArea, dVar.stickyArea) && AbstractC22676k.m65745e(this.closeInteraction, dVar.closeInteraction);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items), 31, this.stickyArea);
            GenericInteraction genericInteraction = this.closeInteraction;
            return iM31983b + (genericInteraction == null ? 0 : genericInteraction.hashCode());
        }

        public String toString() {
            TextResource textResource = this.title;
            List<a> list = this.items;
            List<InterfaceC25312u> list2 = this.stickyArea;
            GenericInteraction genericInteraction = this.closeInteraction;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(title=", ", items=", ", stickyArea=", list);
            sbM106657p.append(list2);
            sbM106657p.append(", closeInteraction=");
            sbM106657p.append(genericInteraction);
            sbM106657p.append(")");
            return sbM106657p.toString();
        }
    }

    public C13431c(c cVar, b bVar, d dVar, AnyModal anyModal) {
        this.popUpDialog = cVar;
        this.fullScreenModal = bVar;
        this.screenContent = dVar;
        this.modal = anyModal;
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
    public final c getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13431c)) {
            return false;
        }
        C13431c c13431c = (C13431c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c13431c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c13431c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c13431c.screenContent) && AbstractC22676k.m65745e(this.modal, c13431c.modal);
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
        int i13 = 0 * 31;
        b bVar = this.fullScreenModal;
        int iHashCode = (i13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.screenContent;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ", modal=" + this.modal + ")";
    }

    /* JADX INFO: renamed from: ep2.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lep2/c$b;", "", "Lsz0/q0;", "state", "Lep2/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lep2/a;Lep2/a;Lep2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lep2/a;", "()Lep2/a;", "c", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f47084e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC13429a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC13429a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC13429a backClickEvent;

        public b(C33211q0 state, InterfaceC13429a interfaceC13429a, InterfaceC13429a interfaceC13429a2, InterfaceC13429a interfaceC13429a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC13429a;
            this.secondaryClickEvent = interfaceC13429a2;
            this.backClickEvent = interfaceC13429a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC13429a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC13429a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC13429a getSecondaryClickEvent() {
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
            InterfaceC13429a interfaceC13429a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC13429a == null ? 0 : interfaceC13429a.hashCode())) * 31;
            InterfaceC13429a interfaceC13429a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC13429a2 == null ? 0 : interfaceC13429a2.hashCode())) * 31;
            InterfaceC13429a interfaceC13429a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC13429a3 != null ? interfaceC13429a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC13429a interfaceC13429a, InterfaceC13429a interfaceC13429a2, InterfaceC13429a interfaceC13429a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC13429a, (i13 & 4) != 0 ? null : interfaceC13429a2, (i13 & 8) != 0 ? null : interfaceC13429a3);
        }
    }

    public /* synthetic */ C13431c(c cVar, b bVar, d dVar, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : dVar, (i13 & 8) != 0 ? null : anyModal);
    }
}
