package f60;

import c31.C3927k;
import c41.C4092p2;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import java.util.List;
import k11.C22123f;
import ns1.AbstractC27104b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\"\u0018\u0015B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lf60/c;", "Lfy1/k;", "Lf60/c$a;", "fullScreenModal", "Lf60/c$c;", "screenContent", "Lf60/c$b;", "previewContent", "<init>", "(Lf60/c$a;Lf60/c$c;Lf60/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lf60/c$a;", "()Lf60/c$a;", "c", "Lf60/c$c;", "d", "()Lf60/c$c;", "Lf60/c$b;", "()Lf60/c$b;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14138c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c screenContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b previewContent;

    /* JADX INFO: renamed from: f60.c$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lf60/c$b;", "", "", "title", "", "Lns1/b;", "processedFiles", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC27104b> processedFiles;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String title, List<? extends AbstractC27104b> processedFiles) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(processedFiles, "processedFiles");
            this.title = title;
            this.processedFiles = processedFiles;
        }

        /* JADX INFO: renamed from: a */
        public final List<AbstractC27104b> m40250a() {
            return this.processedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.processedFiles, bVar.processedFiles);
        }

        public int hashCode() {
            return this.processedFiles.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("PreviewContent(title=", this.title, ", processedFiles=", ")", this.processedFiles);
        }
    }

    /* JADX INFO: renamed from: f60.c$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001d\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u0019\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lf60/c$c;", "", "", "imageUrl", "title", "subtitle", "Lk11/f;", "tile", "Lc31/k;", "progressButton", "Lc41/p2;", "callout", "Lcom/whoop/navigation/e;", "successNavigation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk11/f;Lc31/k;Lc41/p2;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "d", "Lk11/f;", "e", "()Lk11/f;", "Lc31/k;", "()Lc31/k;", "Lc41/p2;", "()Lc41/p2;", "g", "Lcom/whoop/navigation/e;", "getSuccessNavigation", "()Lcom/whoop/navigation/e;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: h */
        public static final int f50890h = ((C9598e.f28134d | C4092p2.f16593v) | C3927k.f16020r) | C22123f.f85827n;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String imageUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C22123f tile;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C3927k progressButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C4092p2 callout;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C9598e successNavigation;

        public c(String str, String title, String subtitle, C22123f tile, C3927k progressButton, C4092p2 c4092p2, C9598e c9598e) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(tile, "tile");
            AbstractC22676k.m65750j(progressButton, "progressButton");
            this.imageUrl = str;
            this.title = title;
            this.subtitle = subtitle;
            this.tile = tile;
            this.progressButton = progressButton;
            this.callout = c4092p2;
            this.successNavigation = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C4092p2 getCallout() {
            return this.callout;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3927k getProgressButton() {
            return this.progressButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C22123f getTile() {
            return this.tile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.imageUrl, cVar.imageUrl) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.tile, cVar.tile) && AbstractC22676k.m65745e(this.progressButton, cVar.progressButton) && AbstractC22676k.m65745e(this.callout, cVar.callout) && AbstractC22676k.m65745e(this.successNavigation, cVar.successNavigation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.imageUrl;
            int iHashCode = (this.progressButton.hashCode() + ((this.tile.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.subtitle)) * 31)) * 31;
            C4092p2 c4092p2 = this.callout;
            int iHashCode2 = (iHashCode + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31;
            C9598e c9598e = this.successNavigation;
            return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        public String toString() {
            String str = this.imageUrl;
            String str2 = this.title;
            String str3 = this.subtitle;
            C22123f c22123f = this.tile;
            C3927k c3927k = this.progressButton;
            C4092p2 c4092p2 = this.callout;
            C9598e c9598e = this.successNavigation;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ScreenContent(imageUrl=", str, ", title=", str2, ", subtitle=");
            sbM32001t.append(str3);
            sbM32001t.append(", tile=");
            sbM32001t.append(c22123f);
            sbM32001t.append(", progressButton=");
            sbM32001t.append(c3927k);
            sbM32001t.append(", callout=");
            sbM32001t.append(c4092p2);
            sbM32001t.append(", successNavigation=");
            return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
        }
    }

    public C14138c(a aVar, c cVar, b bVar) {
        this.fullScreenModal = aVar;
        this.screenContent = cVar;
        this.previewContent = bVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getPreviewContent() {
        return this.previewContent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14138c)) {
            return false;
        }
        C14138c c14138c = (C14138c) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c14138c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c14138c.screenContent) && AbstractC22676k.m65745e(this.previewContent, c14138c.previewContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        b bVar;
        List<AbstractC27104b> listM40250a;
        a aVar = this.fullScreenModal;
        if (aVar == null) {
            return (this.screenContent == null && ((bVar = this.previewContent) == null || (listM40250a = bVar.m40250a()) == null || !(listM40250a.isEmpty() ^ true))) ? ScreenState.UNKNOWN : ScreenState.SUCCESS;
        }
        AbstractC33208p0 type = aVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        c cVar = this.screenContent;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.previewContent;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ReconfirmLabsViewState(fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ", previewContent=" + this.previewContent + ")";
    }

    /* JADX INFO: renamed from: f60.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lf60/c$a;", "", "Lsz0/q0;", "state", "Lf60/a;", "primaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lf60/a;Lf60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "c", "()Lsz0/q0;", "b", "Lf60/a;", "()Lf60/a;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f50884d = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC14136a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC14136a backClickEvent;

        public a(C33211q0 state, InterfaceC14136a interfaceC14136a, InterfaceC14136a interfaceC14136a2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC14136a;
            this.backClickEvent = interfaceC14136a2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC14136a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC14136a getPrimaryClickEvent() {
            return this.primaryClickEvent;
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
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, aVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC14136a interfaceC14136a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC14136a == null ? 0 : interfaceC14136a.hashCode())) * 31;
            InterfaceC14136a interfaceC14136a2 = this.backClickEvent;
            return iHashCode2 + (interfaceC14136a2 != null ? interfaceC14136a2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC14136a interfaceC14136a, InterfaceC14136a interfaceC14136a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC14136a, (i13 & 4) != 0 ? null : interfaceC14136a2);
        }
    }

    public /* synthetic */ C14138c(a aVar, c cVar, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : bVar);
    }
}
