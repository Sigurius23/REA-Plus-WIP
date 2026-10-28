package px2;

import c41.C4092p2;
import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39282o;

/* JADX INFO: renamed from: px2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lpx2/f;", "", "b", "a", "Lpx2/f$a;", "Lpx2/f$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29603f {

    /* JADX INFO: renamed from: px2.f$a */
    @Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u0010@\u001a\u0004\bA\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b>\u0010HR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bF\u0010MR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bB\u0010PR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010V\u001a\u0004\bY\u0010XR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bZ\u0010ER\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u0010@\u001a\u0004\b[\u0010/R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\\\u0010@\u001a\u0004\b]\u0010/R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r8\u0006¢\u0006\f\n\u0004\b^\u0010L\u001a\u0004\b\\\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b_\u0010@\u001a\u0004\bN\u0010/R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bQ\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\b`\u0010/R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\b:\u0010=R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010;\u001a\u0004\b7\u0010=R\u0019\u0010!\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\ba\u0010/R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\bI\u0010/R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b[\u0010b\u001a\u0004\b^\u0010cR\u0019\u0010%\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b`\u0010@\u001a\u0004\bS\u0010/R\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\bU\u0010MR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b<\u0010d\u001a\u0004\b_\u0010eR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bK\u0010h¨\u0006i"}, m65681d2 = {"Lpx2/f$a;", "Lpx2/f;", "", "campaignId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "", "headerSubtitle", "headerIcon", "Lpx2/a;", "badge", "headerImage", "", "Lpx2/k;", "contentBlocks", "Lpx2/j;", "connectionStatus", "scheduleText", "scheduleCta", "Ly81/e;", "statusBadgeColor", "statusBadgeBackgroundColor", "statusBadgeIcon", "statusTitle", "statusBody", "Lpx2/n;", "nextTasks", "description", "descriptionCta", "subDescription", "alertDisplayTitle", "alertDisplay", "fullDescription", "cta", "Lpx2/m;", "optionsConfig", "documentDisplay", "Ly71/o;", "documents", "Lpx2/g;", "overlay", "Lc41/p2;", "dataSubmittedCallout", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/Integer;Lpx2/a;Ljava/lang/String;Ljava/util/List;Lpx2/j;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lpx2/m;Ljava/lang/String;Ljava/util/List;Lpx2/g;Lc41/p2;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lcom/whoop/design/util/TextResource;", "B", "()Lcom/whoop/design/util/TextResource;", "c", "A", "Ljava/lang/String;", "o", "e", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "f", "Lpx2/a;", "()Lpx2/a;", "g", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "i", "Lpx2/j;", "()Lpx2/j;", "j", "t", "k", "s", "l", "Ly81/e;", "v", "()Ly81/e;", "u", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "y", "p", "x", "q", "r", "z", "getFullDescription", "Lpx2/m;", "()Lpx2/m;", "Lpx2/g;", "()Lpx2/g;", "C", "Lc41/p2;", "()Lc41/p2;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC29603f {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final List<C39282o> documents;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final InterfaceC29604g overlay;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final C4092p2 dataSubmittedCallout;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String headerSubtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Integer headerIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AbstractC29598a badge;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String headerImage;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C29608k> contentBlocks;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final AbstractC29607j connectionStatus;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String scheduleText;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource scheduleCta;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final InterfaceC39332e statusBadgeColor;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final InterfaceC39332e statusBadgeBackgroundColor;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final Integer statusBadgeIcon;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String statusTitle;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String statusBody;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final List<C29611n> nextTasks;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final TextResource descriptionCta;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final String subDescription;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final TextResource alertDisplayTitle;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final TextResource alertDisplay;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String fullDescription;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final String cta;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final C29610m optionsConfig;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final String documentDisplay;

        public a(int i13, TextResource toolbarTitle, TextResource title, String str, Integer num, AbstractC29598a abstractC29598a, String str2, List<C29608k> contentBlocks, AbstractC29607j abstractC29607j, String str3, TextResource textResource, InterfaceC39332e statusBadgeColor, InterfaceC39332e statusBadgeBackgroundColor, Integer num2, String statusTitle, String statusBody, List<C29611n> nextTasks, String str4, TextResource descriptionCta, String str5, TextResource alertDisplayTitle, TextResource alertDisplay, String str6, String str7, C29610m c29610m, String str8, List<C39282o> list, InterfaceC29604g overlay, C4092p2 c4092p2) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
            AbstractC22676k.m65750j(statusBadgeColor, "statusBadgeColor");
            AbstractC22676k.m65750j(statusBadgeBackgroundColor, "statusBadgeBackgroundColor");
            AbstractC22676k.m65750j(statusTitle, "statusTitle");
            AbstractC22676k.m65750j(statusBody, "statusBody");
            AbstractC22676k.m65750j(nextTasks, "nextTasks");
            AbstractC22676k.m65750j(descriptionCta, "descriptionCta");
            AbstractC22676k.m65750j(alertDisplayTitle, "alertDisplayTitle");
            AbstractC22676k.m65750j(alertDisplay, "alertDisplay");
            AbstractC22676k.m65750j(overlay, "overlay");
            this.campaignId = i13;
            this.toolbarTitle = toolbarTitle;
            this.title = title;
            this.headerSubtitle = str;
            this.headerIcon = num;
            this.badge = abstractC29598a;
            this.headerImage = str2;
            this.contentBlocks = contentBlocks;
            this.connectionStatus = abstractC29607j;
            this.scheduleText = str3;
            this.scheduleCta = textResource;
            this.statusBadgeColor = statusBadgeColor;
            this.statusBadgeBackgroundColor = statusBadgeBackgroundColor;
            this.statusBadgeIcon = num2;
            this.statusTitle = statusTitle;
            this.statusBody = statusBody;
            this.nextTasks = nextTasks;
            this.description = str4;
            this.descriptionCta = descriptionCta;
            this.subDescription = str5;
            this.alertDisplayTitle = alertDisplayTitle;
            this.alertDisplay = alertDisplay;
            this.fullDescription = str6;
            this.cta = str7;
            this.optionsConfig = c29610m;
            this.documentDisplay = str8;
            this.documents = list;
            this.overlay = overlay;
            this.dataSubmittedCallout = c4092p2;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getAlertDisplay() {
            return this.alertDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getAlertDisplayTitle() {
            return this.alertDisplayTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC29598a getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC29607j getConnectionStatus() {
            return this.connectionStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.campaignId == aVar.campaignId && AbstractC22676k.m65745e(this.toolbarTitle, aVar.toolbarTitle) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.headerSubtitle, aVar.headerSubtitle) && AbstractC22676k.m65745e(this.headerIcon, aVar.headerIcon) && AbstractC22676k.m65745e(this.badge, aVar.badge) && AbstractC22676k.m65745e(this.headerImage, aVar.headerImage) && AbstractC22676k.m65745e(this.contentBlocks, aVar.contentBlocks) && AbstractC22676k.m65745e(this.connectionStatus, aVar.connectionStatus) && AbstractC22676k.m65745e(this.scheduleText, aVar.scheduleText) && AbstractC22676k.m65745e(this.scheduleCta, aVar.scheduleCta) && AbstractC22676k.m65745e(this.statusBadgeColor, aVar.statusBadgeColor) && AbstractC22676k.m65745e(this.statusBadgeBackgroundColor, aVar.statusBadgeBackgroundColor) && AbstractC22676k.m65745e(this.statusBadgeIcon, aVar.statusBadgeIcon) && AbstractC22676k.m65745e(this.statusTitle, aVar.statusTitle) && AbstractC22676k.m65745e(this.statusBody, aVar.statusBody) && AbstractC22676k.m65745e(this.nextTasks, aVar.nextTasks) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.descriptionCta, aVar.descriptionCta) && AbstractC22676k.m65745e(this.subDescription, aVar.subDescription) && AbstractC22676k.m65745e(this.alertDisplayTitle, aVar.alertDisplayTitle) && AbstractC22676k.m65745e(this.alertDisplay, aVar.alertDisplay) && AbstractC22676k.m65745e(this.fullDescription, aVar.fullDescription) && AbstractC22676k.m65745e(this.cta, aVar.cta) && AbstractC22676k.m65745e(this.optionsConfig, aVar.optionsConfig) && AbstractC22676k.m65745e(this.documentDisplay, aVar.documentDisplay) && AbstractC22676k.m65745e(this.documents, aVar.documents) && AbstractC22676k.m65745e(this.overlay, aVar.overlay) && AbstractC22676k.m65745e(this.dataSubmittedCallout, aVar.dataSubmittedCallout);
        }

        /* JADX INFO: renamed from: f */
        public final List<C29608k> m90822f() {
            return this.contentBlocks;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C4092p2 getDataSubmittedCallout() {
            return this.dataSubmittedCallout;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.campaignId) * 31, this.toolbarTitle, 31), this.title, 31);
            String str = this.headerSubtitle;
            int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.headerIcon;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            AbstractC29598a abstractC29598a = this.badge;
            int iHashCode3 = (iHashCode2 + (abstractC29598a == null ? 0 : abstractC29598a.hashCode())) * 31;
            String str2 = this.headerImage;
            int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.contentBlocks);
            AbstractC29607j abstractC29607j = this.connectionStatus;
            int iHashCode4 = (iM31983b + (abstractC29607j == null ? 0 : abstractC29607j.hashCode())) * 31;
            String str3 = this.scheduleText;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TextResource textResource = this.scheduleCta;
            int iM106648g = AbstractC33745d.m106648g(this.statusBadgeBackgroundColor, AbstractC33745d.m106648g(this.statusBadgeColor, (iHashCode5 + (textResource == null ? 0 : textResource.hashCode())) * 31, 31), 31);
            Integer num2 = this.statusBadgeIcon;
            int iM31983b2 = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM106648g + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.statusTitle), 31, this.statusBody), 31, this.nextTasks);
            String str4 = this.description;
            int iM95625a2 = AbstractC31061c.m95625a((iM31983b2 + (str4 == null ? 0 : str4.hashCode())) * 31, this.descriptionCta, 31);
            String str5 = this.subDescription;
            int iM95625a3 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a2 + (str5 == null ? 0 : str5.hashCode())) * 31, this.alertDisplayTitle, 31), this.alertDisplay, 31);
            String str6 = this.fullDescription;
            int iHashCode6 = (iM95625a3 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cta;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            C29610m c29610m = this.optionsConfig;
            int iHashCode8 = (iHashCode7 + (c29610m == null ? 0 : c29610m.hashCode())) * 31;
            String str8 = this.documentDisplay;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            List<C39282o> list = this.documents;
            int iHashCode10 = (this.overlay.hashCode() + ((iHashCode9 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            C4092p2 c4092p2 = this.dataSubmittedCallout;
            return iHashCode10 + (c4092p2 != null ? c4092p2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getDescriptionCta() {
            return this.descriptionCta;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDocumentDisplay() {
            return this.documentDisplay;
        }

        /* JADX INFO: renamed from: l */
        public final List<C39282o> m90828l() {
            return this.documents;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Integer getHeaderIcon() {
            return this.headerIcon;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getHeaderImage() {
            return this.headerImage;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getHeaderSubtitle() {
            return this.headerSubtitle;
        }

        /* JADX INFO: renamed from: p */
        public final List<C29611n> m90832p() {
            return this.nextTasks;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final C29610m getOptionsConfig() {
            return this.optionsConfig;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final InterfaceC29604g getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final TextResource getScheduleCta() {
            return this.scheduleCta;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getScheduleText() {
            return this.scheduleText;
        }

        public String toString() {
            int i13 = this.campaignId;
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.title;
            String str = this.headerSubtitle;
            Integer num = this.headerIcon;
            AbstractC29598a abstractC29598a = this.badge;
            String str2 = this.headerImage;
            List<C29608k> list = this.contentBlocks;
            AbstractC29607j abstractC29607j = this.connectionStatus;
            String str3 = this.scheduleText;
            TextResource textResource3 = this.scheduleCta;
            InterfaceC39332e interfaceC39332e = this.statusBadgeColor;
            InterfaceC39332e interfaceC39332e2 = this.statusBadgeBackgroundColor;
            Integer num2 = this.statusBadgeIcon;
            String str4 = this.statusTitle;
            String str5 = this.statusBody;
            List<C29611n> list2 = this.nextTasks;
            String str6 = this.description;
            TextResource textResource4 = this.descriptionCta;
            String str7 = this.subDescription;
            TextResource textResource5 = this.alertDisplayTitle;
            TextResource textResource6 = this.alertDisplay;
            String str8 = this.fullDescription;
            String str9 = this.cta;
            C29610m c29610m = this.optionsConfig;
            String str10 = this.documentDisplay;
            List<C39282o> list3 = this.documents;
            InterfaceC29604g interfaceC29604g = this.overlay;
            C4092p2 c4092p2 = this.dataSubmittedCallout;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(campaignId=", i13, ", toolbarTitle=", textResource, ", title=");
            AbstractC30007c.m91856z(sbM91844n, textResource2, ", headerSubtitle=", str, ", headerIcon=");
            sbM91844n.append(num);
            sbM91844n.append(", badge=");
            sbM91844n.append(abstractC29598a);
            sbM91844n.append(", headerImage=");
            AbstractC36095b.m114694v(str2, ", contentBlocks=", ", connectionStatus=", sbM91844n, list);
            sbM91844n.append(abstractC29607j);
            sbM91844n.append(", scheduleText=");
            sbM91844n.append(str3);
            sbM91844n.append(", scheduleCta=");
            sbM91844n.append(textResource3);
            sbM91844n.append(", statusBadgeColor=");
            sbM91844n.append(interfaceC39332e);
            sbM91844n.append(", statusBadgeBackgroundColor=");
            sbM91844n.append(interfaceC39332e2);
            sbM91844n.append(", statusBadgeIcon=");
            sbM91844n.append(num2);
            sbM91844n.append(", statusTitle=");
            AbstractC11266d.m30444B(sbM91844n, str4, ", statusBody=", str5, ", nextTasks=");
            AbstractC17176i.m48511m(", description=", str6, ", descriptionCta=", sbM91844n, list2);
            AbstractC30007c.m91856z(sbM91844n, textResource4, ", subDescription=", str7, ", alertDisplayTitle=");
            AbstractC30007c.m91855y(sbM91844n, textResource5, ", alertDisplay=", textResource6, ", fullDescription=");
            AbstractC11266d.m30444B(sbM91844n, str8, ", cta=", str9, ", optionsConfig=");
            sbM91844n.append(c29610m);
            sbM91844n.append(", documentDisplay=");
            sbM91844n.append(str10);
            sbM91844n.append(", documents=");
            sbM91844n.append(list3);
            sbM91844n.append(", overlay=");
            sbM91844n.append(interfaceC29604g);
            sbM91844n.append(", dataSubmittedCallout=");
            sbM91844n.append(c4092p2);
            sbM91844n.append(")");
            return sbM91844n.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final InterfaceC39332e getStatusBadgeBackgroundColor() {
            return this.statusBadgeBackgroundColor;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final InterfaceC39332e getStatusBadgeColor() {
            return this.statusBadgeColor;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final Integer getStatusBadgeIcon() {
            return this.statusBadgeIcon;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getStatusBody() {
            return this.statusBody;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getStatusTitle() {
            return this.statusTitle;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getSubDescription() {
            return this.subDescription;
        }
    }

    /* JADX INFO: renamed from: px2.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpx2/f$b;", "Lpx2/f;", "Lpx2/e;", "modal", "<init>", "(Lpx2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpx2/e;", "()Lpx2/e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC29603f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC29602e modal;

        public b(InterfaceC29602e modal) {
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC29602e getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.modal, ((b) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return "ShowingModal(modal=" + this.modal + ")";
        }
    }
}
