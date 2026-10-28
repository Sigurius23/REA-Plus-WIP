package ux2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import px2.C29608k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y71.C39282o;

/* JADX INFO: renamed from: ux2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lux2/b;", "", "c", "a", "b", "Lux2/b$a;", "Lux2/b$b;", "Lux2/b$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC35372b {

    /* JADX INFO: renamed from: ux2.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lux2/b$a;", "Lux2/b;", "", "campaignId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC35372b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        public a(int i13) {
            this.campaignId = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.campaignId == ((a) other).campaignId;
        }

        public int hashCode() {
            return Integer.hashCode(this.campaignId);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.campaignId, "ErrorLoading(campaignId=", ")");
        }
    }

    /* JADX INFO: renamed from: ux2.b$b */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010\u0016R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010$R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u001e\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b*\u0010\u0016¨\u00060"}, m65681d2 = {"Lux2/b$b;", "Lux2/b;", "", "campaignId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "", "headerSubtitle", "headerIcon", "", "Lpx2/k;", "contentBlocks", "description", "Ly71/o;", "documents", "alertDisplayTitle", "alertDisplay", "documentDisplay", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCampaignId", "b", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "c", "i", "d", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "g", "f", "Ljava/util/List;", "()Ljava/util/List;", "k", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC35372b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String headerSubtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int headerIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C29608k> contentBlocks;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C39282o> documents;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TextResource alertDisplayTitle;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final TextResource alertDisplay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String documentDisplay;

        public b(int i13, TextResource toolbarTitle, TextResource title, String headerSubtitle, int i14, List<C29608k> contentBlocks, String description, List<C39282o> list, TextResource alertDisplayTitle, TextResource alertDisplay, String str) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(headerSubtitle, "headerSubtitle");
            AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(alertDisplayTitle, "alertDisplayTitle");
            AbstractC22676k.m65750j(alertDisplay, "alertDisplay");
            this.campaignId = i13;
            this.toolbarTitle = toolbarTitle;
            this.title = title;
            this.headerSubtitle = headerSubtitle;
            this.headerIcon = i14;
            this.contentBlocks = contentBlocks;
            this.description = description;
            this.documents = list;
            this.alertDisplayTitle = alertDisplayTitle;
            this.alertDisplay = alertDisplay;
            this.documentDisplay = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getAlertDisplay() {
            return this.alertDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getAlertDisplayTitle() {
            return this.alertDisplayTitle;
        }

        /* JADX INFO: renamed from: c */
        public final List<C29608k> m112253c() {
            return this.contentBlocks;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDocumentDisplay() {
            return this.documentDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.campaignId == bVar.campaignId && AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.headerSubtitle, bVar.headerSubtitle) && this.headerIcon == bVar.headerIcon && AbstractC22676k.m65745e(this.contentBlocks, bVar.contentBlocks) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.documents, bVar.documents) && AbstractC22676k.m65745e(this.alertDisplayTitle, bVar.alertDisplayTitle) && AbstractC22676k.m65745e(this.alertDisplay, bVar.alertDisplay) && AbstractC22676k.m65745e(this.documentDisplay, bVar.documentDisplay);
        }

        /* JADX INFO: renamed from: f */
        public final List<C39282o> m112256f() {
            return this.documents;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getHeaderIcon() {
            return this.headerIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getHeaderSubtitle() {
            return this.headerSubtitle;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.headerIcon, AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.campaignId) * 31, this.toolbarTitle, 31), this.title, 31), 31, this.headerSubtitle), 31), 31, this.contentBlocks), 31, this.description);
            List<C39282o> list = this.documents;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM30450d + (list == null ? 0 : list.hashCode())) * 31, this.alertDisplayTitle, 31), this.alertDisplay, 31);
            String str = this.documentDisplay;
            return iM95625a + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public String toString() {
            int i13 = this.campaignId;
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.title;
            String str = this.headerSubtitle;
            int i14 = this.headerIcon;
            List<C29608k> list = this.contentBlocks;
            String str2 = this.description;
            List<C39282o> list2 = this.documents;
            TextResource textResource3 = this.alertDisplayTitle;
            TextResource textResource4 = this.alertDisplay;
            String str3 = this.documentDisplay;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(campaignId=", i13, ", toolbarTitle=", textResource, ", title=");
            AbstractC30007c.m91856z(sbM91844n, textResource2, ", headerSubtitle=", str, ", headerIcon=");
            sbM91844n.append(i14);
            sbM91844n.append(", contentBlocks=");
            sbM91844n.append(list);
            sbM91844n.append(", description=");
            AbstractC36095b.m114694v(str2, ", documents=", ", alertDisplayTitle=", sbM91844n, list2);
            AbstractC30007c.m91855y(sbM91844n, textResource3, ", alertDisplay=", textResource4, ", documentDisplay=");
            return AbstractC25012a.m73376i(str3, ")", sbM91844n);
        }
    }

    /* JADX INFO: renamed from: ux2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lux2/b$c;", "Lux2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC35372b {

        /* JADX INFO: renamed from: a */
        public static final c f150672a = new c();

        private c() {
        }
    }
}
