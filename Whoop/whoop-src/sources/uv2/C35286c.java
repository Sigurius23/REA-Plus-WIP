package uv2;

import c41.C3985a0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import ep0.C13404j;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39282o;

/* JADX INFO: renamed from: uv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\b\u0017B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Luv2/c;", "", "Luv2/c$a;", "fullScreenModal", "Luv2/c$b;", "content", "<init>", "(Luv2/c$a;Luv2/c$b;)V", "a", "(Luv2/c$a;Luv2/c$b;)Luv2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Luv2/c$a;", "d", "()Luv2/c$a;", "b", "Luv2/c$b;", "c", "()Luv2/c$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35286c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b content;

    public C35286c(a aVar, b bVar) {
        this.fullScreenModal = aVar;
        this.content = bVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35286c m111944b(C35286c c35286c, a aVar, b bVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aVar = c35286c.fullScreenModal;
        }
        if ((i13 & 2) != 0) {
            bVar = c35286c.content;
        }
        return c35286c.m111945a(aVar, bVar);
    }

    /* JADX INFO: renamed from: a */
    public final C35286c m111945a(a fullScreenModal, b content) {
        return new C35286c(fullScreenModal, content);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35286c)) {
            return false;
        }
        C35286c c35286c = (C35286c) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c35286c.fullScreenModal) && AbstractC22676k.m65745e(this.content, c35286c.content);
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.content;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "LinkWorkoutViewState(fullScreenModal=" + this.fullScreenModal + ", content=" + this.content + ")";
    }

    public /* synthetic */ C35286c(a aVar, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: uv2.c$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, m65681d2 = {"Luv2/c$a;", "", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Luv2/a;", "primaryClickEvent", "secondaryButtonText", "secondaryClickEvent", "", "showSecondaryButton", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luv2/a;Lcom/whoop/design/util/TextResource;Luv2/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "g", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Luv2/a;", "()Luv2/a;", "e", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: h */
        public static final int f150255h = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC35284a primaryClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC35284a secondaryClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean showSecondaryButton;

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC35284a interfaceC35284a, TextResource secondaryButtonText, InterfaceC35284a interfaceC35284a2, boolean z4) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryClickEvent = interfaceC35284a;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryClickEvent = interfaceC35284a2;
            this.showSecondaryButton = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC35284a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC35284a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowSecondaryButton() {
            return this.showSecondaryButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, aVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent) && this.showSecondaryButton == aVar.showSecondaryButton;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC35284a interfaceC35284a = this.primaryClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC35284a == null ? 0 : interfaceC35284a.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC35284a interfaceC35284a2 = this.secondaryClickEvent;
            return Boolean.hashCode(this.showSecondaryButton) + ((iM95625a2 + (interfaceC35284a2 != null ? interfaceC35284a2.hashCode() : 0)) * 31);
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC35284a interfaceC35284a = this.primaryClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC35284a interfaceC35284a2 = this.secondaryClickEvent;
            boolean z4 = this.showSecondaryButton;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryClickEvent=");
            sbM30862n.append(interfaceC35284a);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryClickEvent=");
            sbM30862n.append(interfaceC35284a2);
            sbM30862n.append(", showSecondaryButton=");
            return AbstractC18489d0.m53372m(sbM30862n, z4, ")");
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC35284a interfaceC35284a, TextResource textResource3, InterfaceC35284a interfaceC35284a2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC35284a, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) == 0 ? interfaceC35284a2 : null, (i13 & 64) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: uv2.c$b */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0084\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b%\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b.\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Luv2/c$b;", "", "Lcom/whoop/design/util/TextResource;", "title", "headline", "subtext", "Lep0/j;", "screenContextMetadata", "Lm91/u;", "aiChatCallout", "Lc41/a0;", "addTile", "builderCta", "divider", "", "Ly71/o;", "templates", "", "useGradientBackground", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lep0/j;Lm91/u;Lc41/a0;Lm91/u;Lm91/u;Ljava/util/List;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lep0/j;Lm91/u;Lc41/a0;Lm91/u;Lm91/u;Ljava/util/List;Z)Luv2/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "i", "d", "Lep0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lep0/j;", "e", "Lm91/u;", "()Lm91/u;", "f", "Lc41/a0;", "()Lc41/a0;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Z", "l", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource headline;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25312u aiChatCallout;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C3985a0 addTile;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC25312u builderCta;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC25312u divider;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<C39282o> templates;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean useGradientBackground;

        public b(TextResource title, TextResource headline, TextResource subtext, C13404j c13404j, InterfaceC25312u interfaceC25312u, C3985a0 c3985a0, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, List<C39282o> templates, boolean z4) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(headline, "headline");
            AbstractC22676k.m65750j(subtext, "subtext");
            AbstractC22676k.m65750j(templates, "templates");
            this.title = title;
            this.headline = headline;
            this.subtext = subtext;
            this.screenContextMetadata = c13404j;
            this.aiChatCallout = interfaceC25312u;
            this.addTile = c3985a0;
            this.builderCta = interfaceC25312u2;
            this.divider = interfaceC25312u3;
            this.templates = templates;
            this.useGradientBackground = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m111955b(b bVar, TextResource textResource, TextResource textResource2, TextResource textResource3, C13404j c13404j, InterfaceC25312u interfaceC25312u, C3985a0 c3985a0, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, List list, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = bVar.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = bVar.headline;
            }
            if ((i13 & 4) != 0) {
                textResource3 = bVar.subtext;
            }
            if ((i13 & 8) != 0) {
                c13404j = bVar.screenContextMetadata;
            }
            if ((i13 & 16) != 0) {
                interfaceC25312u = bVar.aiChatCallout;
            }
            if ((i13 & 32) != 0) {
                c3985a0 = bVar.addTile;
            }
            if ((i13 & 64) != 0) {
                interfaceC25312u2 = bVar.builderCta;
            }
            if ((i13 & 128) != 0) {
                interfaceC25312u3 = bVar.divider;
            }
            if ((i13 & 256) != 0) {
                list = bVar.templates;
            }
            if ((i13 & 512) != 0) {
                z4 = bVar.useGradientBackground;
            }
            List list2 = list;
            boolean z13 = z4;
            InterfaceC25312u interfaceC25312u4 = interfaceC25312u2;
            InterfaceC25312u interfaceC25312u5 = interfaceC25312u3;
            InterfaceC25312u interfaceC25312u6 = interfaceC25312u;
            C3985a0 c3985a1 = c3985a0;
            return bVar.m111956a(textResource, textResource2, textResource3, c13404j, interfaceC25312u6, c3985a1, interfaceC25312u4, interfaceC25312u5, list2, z13);
        }

        /* JADX INFO: renamed from: a */
        public final b m111956a(TextResource title, TextResource headline, TextResource subtext, C13404j screenContextMetadata, InterfaceC25312u aiChatCallout, C3985a0 addTile, InterfaceC25312u builderCta, InterfaceC25312u divider, List<C39282o> templates, boolean useGradientBackground) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(headline, "headline");
            AbstractC22676k.m65750j(subtext, "subtext");
            AbstractC22676k.m65750j(templates, "templates");
            return new b(title, headline, subtext, screenContextMetadata, aiChatCallout, addTile, builderCta, divider, templates, useGradientBackground);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C3985a0 getAddTile() {
            return this.addTile;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC25312u getAiChatCallout() {
            return this.aiChatCallout;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC25312u getBuilderCta() {
            return this.builderCta;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.headline, bVar.headline) && AbstractC22676k.m65745e(this.subtext, bVar.subtext) && AbstractC22676k.m65745e(this.screenContextMetadata, bVar.screenContextMetadata) && AbstractC22676k.m65745e(this.aiChatCallout, bVar.aiChatCallout) && AbstractC22676k.m65745e(this.addTile, bVar.addTile) && AbstractC22676k.m65745e(this.builderCta, bVar.builderCta) && AbstractC22676k.m65745e(this.divider, bVar.divider) && AbstractC22676k.m65745e(this.templates, bVar.templates) && this.useGradientBackground == bVar.useGradientBackground;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC25312u getDivider() {
            return this.divider;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.headline, 31), this.subtext, 31);
            C13404j c13404j = this.screenContextMetadata;
            int iHashCode = (iM95625a + (c13404j == null ? 0 : c13404j.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u = this.aiChatCallout;
            int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
            C3985a0 c3985a0 = this.addTile;
            int iHashCode3 = (iHashCode2 + (c3985a0 == null ? 0 : c3985a0.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u2 = this.builderCta;
            int iHashCode4 = (iHashCode3 + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u3 = this.divider;
            return Boolean.hashCode(this.useGradientBackground) + AbstractC11895b.m31983b((iHashCode4 + (interfaceC25312u3 != null ? interfaceC25312u3.hashCode() : 0)) * 31, 31, this.templates);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getSubtext() {
            return this.subtext;
        }

        /* JADX INFO: renamed from: j */
        public final List<C39282o> m111964j() {
            return this.templates;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getUseGradientBackground() {
            return this.useGradientBackground;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.headline;
            TextResource textResource3 = this.subtext;
            C13404j c13404j = this.screenContextMetadata;
            InterfaceC25312u interfaceC25312u = this.aiChatCallout;
            C3985a0 c3985a0 = this.addTile;
            InterfaceC25312u interfaceC25312u2 = this.builderCta;
            InterfaceC25312u interfaceC25312u3 = this.divider;
            List<C39282o> list = this.templates;
            boolean z4 = this.useGradientBackground;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ScreenContent(title=", textResource, ", headline=", textResource2, ", subtext=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", screenContextMetadata=");
            sbM106658q.append(c13404j);
            sbM106658q.append(", aiChatCallout=");
            sbM106658q.append(interfaceC25312u);
            sbM106658q.append(", addTile=");
            sbM106658q.append(c3985a0);
            sbM106658q.append(", builderCta=");
            sbM106658q.append(interfaceC25312u2);
            sbM106658q.append(", divider=");
            sbM106658q.append(interfaceC25312u3);
            sbM106658q.append(", templates=");
            sbM106658q.append(list);
            sbM106658q.append(", useGradientBackground=");
            sbM106658q.append(z4);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ b(TextResource textResource, TextResource textResource2, TextResource textResource3, C13404j c13404j, InterfaceC25312u interfaceC25312u, C3985a0 c3985a0, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, textResource3, (i13 & 8) != 0 ? null : c13404j, (i13 & 16) != 0 ? null : interfaceC25312u, (i13 & 32) != 0 ? null : c3985a0, (i13 & 64) != 0 ? null : interfaceC25312u2, (i13 & 128) != 0 ? null : interfaceC25312u3, (i13 & 256) != 0 ? C25271y.f99162w : list, (i13 & 512) != 0 ? false : z4);
        }
    }
}
