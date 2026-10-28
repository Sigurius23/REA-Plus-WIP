package y70;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y70.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\n\u001a\u001c%B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Ly70/c;", "Lfy1/k;", "Ly70/c$c;", "popUpDialog", "Ly70/c$b;", "fullScreenModal", "Ly70/c$d;", "screenContent", "<init>", "(Ly70/c$c;Ly70/c$b;Ly70/c$d;)V", "b", "(Ly70/c$c;Ly70/c$b;Ly70/c$d;)Ly70/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly70/c$c;", "e", "()Ly70/c$c;", "c", "Ly70/c$b;", "d", "()Ly70/c$b;", "Ly70/c$d;", "f", "()Ly70/c$d;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39267c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: y70.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ly70/c$a;", "", "", "Lm91/u;", "itemViewState", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m125085a() {
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

    /* JADX INFO: renamed from: y70.c$d */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Ly70/c$d;", "", "", "Ly70/c$a;", "items", "", "displayRefreshingAnimation", "Lm91/u;", "stickyArea", "<init>", "(Ljava/util/List;ZLjava/util/List;)V", "a", "(Ljava/util/List;ZLjava/util/List;)Ly70/c$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Z", "c", "()Z", "e", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> stickyArea;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<a> items, boolean z4, List<? extends InterfaceC25312u> stickyArea) {
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.stickyArea = stickyArea;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m125100b(d dVar, List list, boolean z4, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = dVar.items;
            }
            if ((i13 & 2) != 0) {
                z4 = dVar.displayRefreshingAnimation;
            }
            if ((i13 & 4) != 0) {
                list2 = dVar.stickyArea;
            }
            return dVar.m125101a(list, z4, list2);
        }

        /* JADX INFO: renamed from: a */
        public final d m125101a(List<a> items, boolean displayRefreshingAnimation, List<? extends InterfaceC25312u> stickyArea) {
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(stickyArea, "stickyArea");
            return new d(items, displayRefreshingAnimation, stickyArea);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: d */
        public final List<a> m125103d() {
            return this.items;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m125104e() {
            return this.stickyArea;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.stickyArea, dVar.stickyArea);
        }

        public int hashCode() {
            return this.stickyArea.hashCode() + AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.displayRefreshingAnimation);
        }

        public String toString() {
            List<a> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            List<InterfaceC25312u> list2 = this.stickyArea;
            StringBuilder sb4 = new StringBuilder("ScreenContent(items=");
            sb4.append(list);
            sb4.append(", displayRefreshingAnimation=");
            sb4.append(z4);
            sb4.append(", stickyArea=");
            return AbstractC3855a.m11829m(sb4, list2, ")");
        }
    }

    public C39267c(c cVar, b bVar, d dVar) {
        this.popUpDialog = cVar;
        this.fullScreenModal = bVar;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C39267c m125080c(C39267c c39267c, c cVar, b bVar, d dVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cVar = c39267c.popUpDialog;
        }
        if ((i13 & 2) != 0) {
            bVar = c39267c.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            dVar = c39267c.screenContent;
        }
        return c39267c.m125081b(cVar, bVar, dVar);
    }

    /* JADX INFO: renamed from: b */
    public final C39267c m125081b(c popUpDialog, b fullScreenModal, d screenContent) {
        return new C39267c(popUpDialog, fullScreenModal, screenContent);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getPopUpDialog() {
        return this.popUpDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39267c)) {
            return false;
        }
        C39267c c39267c = (C39267c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c39267c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c39267c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c39267c.screenContent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
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
        c cVar = this.popUpDialog;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "OrderConfirmationViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: y70.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Ly70/c$b;", "", "Lsz0/q0;", "state", "Ly70/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Ly70/a;Ly70/a;Ly70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Ly70/a;", "()Ly70/a;", "c", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f168899e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC39265a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC39265a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC39265a backClickEvent;

        public b(C33211q0 state, InterfaceC39265a interfaceC39265a, InterfaceC39265a interfaceC39265a2, InterfaceC39265a interfaceC39265a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC39265a;
            this.secondaryClickEvent = interfaceC39265a2;
            this.backClickEvent = interfaceC39265a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC39265a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC39265a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC39265a getSecondaryClickEvent() {
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
            InterfaceC39265a interfaceC39265a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC39265a == null ? 0 : interfaceC39265a.hashCode())) * 31;
            InterfaceC39265a interfaceC39265a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC39265a2 == null ? 0 : interfaceC39265a2.hashCode())) * 31;
            InterfaceC39265a interfaceC39265a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC39265a3 != null ? interfaceC39265a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC39265a interfaceC39265a, InterfaceC39265a interfaceC39265a2, InterfaceC39265a interfaceC39265a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC39265a, (i13 & 4) != 0 ? null : interfaceC39265a2, (i13 & 8) != 0 ? null : interfaceC39265a3);
        }
    }

    public /* synthetic */ C39267c(c cVar, b bVar, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : dVar);
    }

    /* JADX INFO: renamed from: y70.c$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b\u001c\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b\"\u0010/¨\u00060"}, m65681d2 = {"Ly70/c$c;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "", "showCloseIcon", "useSolidButtons", "Lj11/p;", "topDialogStyle", "Ly70/a;", "approveEvent", "dismissEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Ly70/a;Ly70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "Ly81/e;", "d", "()Ly81/e;", "f", "Z", "g", "()Z", "j", "Lj11/p;", "i", "()Lj11/p;", "Ly70/a;", "()Ly70/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource primaryActionText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC39332e primaryActionColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryActionText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showCloseIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean useSolidButtons;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final EnumC21213p topDialogStyle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final InterfaceC39265a approveEvent;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC39265a dismissEvent;

        public c(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, TextResource description, boolean z4, boolean z13, EnumC21213p topDialogStyle, InterfaceC39265a interfaceC39265a, InterfaceC39265a interfaceC39265a2) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
            this.title = title;
            this.primaryActionText = textResource;
            this.primaryActionColor = interfaceC39332e;
            this.secondaryActionText = textResource2;
            this.description = description;
            this.showCloseIcon = z4;
            this.useSolidButtons = z13;
            this.topDialogStyle = topDialogStyle;
            this.approveEvent = interfaceC39265a;
            this.dismissEvent = interfaceC39265a2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC39265a getApproveEvent() {
            return this.approveEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC39265a getDismissEvent() {
            return this.dismissEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC39332e getPrimaryActionColor() {
            return this.primaryActionColor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.primaryActionText, cVar.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, cVar.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, cVar.secondaryActionText) && AbstractC22676k.m65745e(this.description, cVar.description) && this.showCloseIcon == cVar.showCloseIcon && this.useSolidButtons == cVar.useSolidButtons && this.topDialogStyle == cVar.topDialogStyle && AbstractC22676k.m65745e(this.approveEvent, cVar.approveEvent) && AbstractC22676k.m65745e(this.dismissEvent, cVar.dismissEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getSecondaryActionText() {
            return this.secondaryActionText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            TextResource textResource = this.primaryActionText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
            TextResource textResource2 = this.secondaryActionText;
            int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.description, 31), 31, this.showCloseIcon), 31, this.useSolidButtons), 31);
            InterfaceC39265a interfaceC39265a = this.approveEvent;
            int iHashCode4 = (iM106647f + (interfaceC39265a == null ? 0 : interfaceC39265a.hashCode())) * 31;
            InterfaceC39265a interfaceC39265a2 = this.dismissEvent;
            return iHashCode4 + (interfaceC39265a2 != null ? interfaceC39265a2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC21213p getTopDialogStyle() {
            return this.topDialogStyle;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getUseSolidButtons() {
            return this.useSolidButtons;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.primaryActionText;
            InterfaceC39332e interfaceC39332e = this.primaryActionColor;
            TextResource textResource3 = this.secondaryActionText;
            TextResource textResource4 = this.description;
            boolean z4 = this.showCloseIcon;
            boolean z13 = this.useSolidButtons;
            EnumC21213p enumC21213p = this.topDialogStyle;
            InterfaceC39265a interfaceC39265a = this.approveEvent;
            InterfaceC39265a interfaceC39265a2 = this.dismissEvent;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("OrderConfirmationDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
            AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
            AbstractC33745d.m106664w(textResource4, ", showCloseIcon=", ", useSolidButtons=", sbM106658q, z4);
            AbstractC33745d.m106666y(sbM106658q, z13, ", topDialogStyle=", enumC21213p, ", approveEvent=");
            sbM106658q.append(interfaceC39265a);
            sbM106658q.append(", dismissEvent=");
            sbM106658q.append(interfaceC39265a2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ c(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, TextResource textResource4, boolean z4, boolean z13, EnumC21213p enumC21213p, InterfaceC39265a interfaceC39265a, InterfaceC39265a interfaceC39265a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? null : textResource3, textResource4, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 256) != 0 ? null : interfaceC39265a, (i13 & 512) != 0 ? null : interfaceC39265a2);
        }
    }
}
