package vp2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import hc3.AbstractC17176i;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0015\u001b\u0017\"B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lvp2/c;", "Lfy1/k;", "Lvp2/c$d;", "popUpDialog", "Lvp2/c$b;", "fullScreenModal", "Lvp2/c$c;", "screenContent", "<init>", "(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lvp2/c$d;", "c", "()Lvp2/c$d;", "Lvp2/c$b;", "()Lvp2/c$b;", "d", "Lvp2/c$c;", "()Lvp2/c$c;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36276c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final d popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c screenContent;

    /* JADX INFO: renamed from: vp2.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvp2/c$a;", "", "", "Lm91/u;", "itemViewState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m115953a() {
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

    /* JADX INFO: renamed from: vp2.c$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u000b\u0010%R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001b\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b#\u0010!¨\u0006'"}, m65681d2 = {"Lvp2/c$c;", "", "", "cartId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lvp2/c$a;", "items", "selectedShippingMethodId", "", "isSubmitting", "displayRefreshingAnimation", "Lm91/u;", "stickyArea", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "Z", "()Z", "g", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String selectedShippingMethodId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isSubmitting;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<InterfaceC25312u> stickyArea;

        /* JADX WARN: Multi-variable type inference failed */
        public c(String cartId, TextResource toolbarTitle, List<a> items, String str, boolean z4, boolean z13, List<? extends InterfaceC25312u> stickyArea) {
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            this.cartId = cartId;
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.selectedShippingMethodId = str;
            this.isSubmitting = z4;
            this.displayRefreshingAnimation = z13;
            this.stickyArea = stickyArea;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: c */
        public final List<a> m115960c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedShippingMethodId() {
            return this.selectedShippingMethodId;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m115962e() {
            return this.stickyArea;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.cartId, cVar.cartId) && AbstractC22676k.m65745e(this.toolbarTitle, cVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, cVar.items) && AbstractC22676k.m65745e(this.selectedShippingMethodId, cVar.selectedShippingMethodId) && this.isSubmitting == cVar.isSubmitting && this.displayRefreshingAnimation == cVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.stickyArea, cVar.stickyArea);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.cartId.hashCode() * 31, this.toolbarTitle, 31), 31, this.items);
            String str = this.selectedShippingMethodId;
            return this.stickyArea.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSubmitting), 31, this.displayRefreshingAnimation);
        }

        public String toString() {
            String str = this.cartId;
            TextResource textResource = this.toolbarTitle;
            List<a> list = this.items;
            String str2 = this.selectedShippingMethodId;
            boolean z4 = this.isSubmitting;
            boolean z13 = this.displayRefreshingAnimation;
            List<InterfaceC25312u> list2 = this.stickyArea;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("ScreenContent(cartId=", str, ", toolbarTitle=", textResource, ", items=");
            AbstractC17176i.m48511m(", selectedShippingMethodId=", str2, ", isSubmitting=", sbM91847q, list);
            AbstractC38963t7.m124392v(sbM91847q, z4, ", displayRefreshingAnimation=", z13, ", stickyArea=");
            return AbstractC3855a.m11829m(sbM91847q, list2, ")");
        }
    }

    /* JADX INFO: renamed from: vp2.c$d */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lvp2/c$d;", "", "", "hashCode", "()I", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {
        public abstract int hashCode();
    }

    public C36276c(d dVar, b bVar, c cVar) {
        this.popUpDialog = dVar;
        this.fullScreenModal = bVar;
        this.screenContent = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36276c)) {
            return false;
        }
        C36276c c36276c = (C36276c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c36276c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c36276c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c36276c.screenContent);
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
        c cVar = this.screenContent;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "ShippingMethodViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: vp2.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lvp2/c$b;", "", "Lsz0/q0;", "state", "Lvp2/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lvp2/a;", "()Lvp2/a;", "c", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f155485e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC36274a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC36274a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC36274a backClickEvent;

        public b(C33211q0 state, InterfaceC36274a interfaceC36274a, InterfaceC36274a interfaceC36274a2, InterfaceC36274a interfaceC36274a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC36274a;
            this.secondaryClickEvent = interfaceC36274a2;
            this.backClickEvent = interfaceC36274a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC36274a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC36274a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC36274a getSecondaryClickEvent() {
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
            InterfaceC36274a interfaceC36274a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC36274a == null ? 0 : interfaceC36274a.hashCode())) * 31;
            InterfaceC36274a interfaceC36274a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC36274a2 == null ? 0 : interfaceC36274a2.hashCode())) * 31;
            InterfaceC36274a interfaceC36274a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC36274a3 != null ? interfaceC36274a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC36274a interfaceC36274a, InterfaceC36274a interfaceC36274a2, InterfaceC36274a interfaceC36274a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC36274a, (i13 & 4) != 0 ? null : interfaceC36274a2, (i13 & 8) != 0 ? null : interfaceC36274a3);
        }
    }

    public /* synthetic */ C36276c(d dVar, b bVar, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : dVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : cVar);
    }
}
