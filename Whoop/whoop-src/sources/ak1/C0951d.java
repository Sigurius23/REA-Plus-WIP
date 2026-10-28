package ak1;

import ck1.C4791n;
import com.whoop.metrics.common.ScreenState;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: ak1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%\nB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lak1/d;", "Lfy1/k;", "Lak1/d$b;", "content", "Lak1/d$a;", "fullScreenModal", "Lak1/a;", "analytics", "<init>", "(Lak1/d$b;Lak1/d$a;Lak1/a;)V", "b", "(Lak1/d$b;Lak1/d$a;Lak1/a;)Lak1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lak1/d$b;", "e", "()Lak1/d$b;", "c", "Lak1/d$a;", "f", "()Lak1/d$a;", "d", "Lak1/a;", "()Lak1/a;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0951d implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C0948a analytics;

    /* JADX INFO: renamed from: ak1.d$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, m65681d2 = {"Lak1/d$b;", "", "", "title", "", "Lm91/u;", "items", "footer", "Lck1/n;", "dialog", "Lep0/j;", "screenContextMetadata", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lck1/n;Lep0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lck1/n;", "()Lck1/n;", "Lep0/j;", "()Lep0/j;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String footer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C4791n dialog;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String title, List<? extends InterfaceC25312u> items, String str, C4791n c4791n, C13404j c13404j) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(items, "items");
            this.title = title;
            this.items = items;
            this.footer = str;
            this.dialog = c4791n;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C4791n getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m2408c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.items, bVar.items) && AbstractC22676k.m65745e(this.footer, bVar.footer) && AbstractC22676k.m65745e(this.dialog, bVar.dialog) && AbstractC22676k.m65745e(this.screenContextMetadata, bVar.screenContextMetadata);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items);
            String str = this.footer;
            int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
            C4791n c4791n = this.dialog;
            int iHashCode2 = (iHashCode + (c4791n == null ? 0 : c4791n.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode2 + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            List<InterfaceC25312u> list = this.items;
            String str2 = this.footer;
            C4791n c4791n = this.dialog;
            C13404j c13404j = this.screenContextMetadata;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("ScreenContent(title=", str, ", items=", ", footer=", list);
            sbM94766o.append(str2);
            sbM94766o.append(", dialog=");
            sbM94766o.append(c4791n);
            sbM94766o.append(", screenContextMetadata=");
            sbM94766o.append(c13404j);
            sbM94766o.append(")");
            return sbM94766o.toString();
        }
    }

    public C0951d(b bVar, a aVar, C0948a c0948a) {
        this.content = bVar;
        this.fullScreenModal = aVar;
        this.analytics = c0948a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0951d m2398c(C0951d c0951d, b bVar, a aVar, C0948a c0948a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bVar = c0951d.content;
        }
        if ((i13 & 2) != 0) {
            aVar = c0951d.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            c0948a = c0951d.analytics;
        }
        return c0951d.m2399b(bVar, aVar, c0948a);
    }

    /* JADX INFO: renamed from: b */
    public final C0951d m2399b(b content, a fullScreenModal, C0948a analytics) {
        return new C0951d(content, fullScreenModal, analytics);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0948a getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0951d)) {
            return false;
        }
        C0951d c0951d = (C0951d) other;
        return AbstractC22676k.m65745e(this.content, c0951d.content) && AbstractC22676k.m65745e(this.fullScreenModal, c0951d.fullScreenModal) && AbstractC22676k.m65745e(this.analytics, c0951d.analytics);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this.content != null) {
            return ScreenState.SUCCESS;
        }
        a aVar = this.fullScreenModal;
        if (aVar == null) {
            return ScreenState.ERROR;
        }
        AbstractC33208p0 type = aVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        b bVar = this.content;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        a aVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C0948a c0948a = this.analytics;
        return iHashCode2 + (c0948a != null ? c0948a.hashCode() : 0);
    }

    public String toString() {
        return "ComposableHealthMonitorViewState(content=" + this.content + ", fullScreenModal=" + this.fullScreenModal + ", analytics=" + this.analytics + ")";
    }

    /* JADX INFO: renamed from: ak1.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lak1/d$a;", "", "Lsz0/q0;", "state", "Lak1/b;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Lsz0/q0;Lak1/b;Lak1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "c", "()Lsz0/q0;", "b", "Lak1/b;", "()Lak1/b;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f3524d = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC0949b primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC0949b secondaryClickEvent;

        public a(C33211q0 state, AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = abstractC0949b;
            this.secondaryClickEvent = abstractC0949b2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC0949b getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC0949b getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            AbstractC0949b abstractC0949b = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (abstractC0949b == null ? 0 : abstractC0949b.hashCode())) * 31;
            AbstractC0949b abstractC0949b2 = this.secondaryClickEvent;
            return iHashCode2 + (abstractC0949b2 != null ? abstractC0949b2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : abstractC0949b, (i13 & 4) != 0 ? null : abstractC0949b2);
        }
    }

    public /* synthetic */ C0951d(b bVar, a aVar, C0948a c0948a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bVar, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? null : c0948a);
    }
}
