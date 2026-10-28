package hz2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hz2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lhz2/d;", "", "c", "a", "b", "Lhz2/d$a;", "Lhz2/d$b;", "Lhz2/d$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17819d {

    /* JADX INFO: renamed from: hz2.d$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lhz2/d$a;", "Lhz2/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC17819d {

        /* JADX INFO: renamed from: a */
        public static final a f69294a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1500955595;
        }

        public String toString() {
            return "ErrorLoading";
        }
    }

    /* JADX INFO: renamed from: hz2.d$b */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b\u001d\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b!\u0010.¨\u0006/"}, m65681d2 = {"Lhz2/d$b;", "Lhz2/d;", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "headerTitle", "headerBody", "Lkd1/o;", "pageBackgroundImage", "", "Lhz2/b;", "campaignSections", "Lhz2/c;", "impactSection", "footerText", "Lm91/u;", "footer", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lhz2/c;Lcom/whoop/design/util/TextResource;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Lkd1/o;", "g", "()Lkd1/o;", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lhz2/c;", "()Lhz2/c;", "Lm91/u;", "()Lm91/u;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC17819d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource headerTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource headerBody;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC22403o pageBackgroundImage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C17817b> campaignSections;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C17818c impactSection;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource footerText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC25312u footer;

        public b(TextResource toolbarTitle, TextResource headerTitle, TextResource headerBody, AbstractC22403o pageBackgroundImage, List<C17817b> campaignSections, C17818c c17818c, TextResource textResource, InterfaceC25312u interfaceC25312u) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(headerTitle, "headerTitle");
            AbstractC22676k.m65750j(headerBody, "headerBody");
            AbstractC22676k.m65750j(pageBackgroundImage, "pageBackgroundImage");
            AbstractC22676k.m65750j(campaignSections, "campaignSections");
            this.toolbarTitle = toolbarTitle;
            this.headerTitle = headerTitle;
            this.headerBody = headerBody;
            this.pageBackgroundImage = pageBackgroundImage;
            this.campaignSections = campaignSections;
            this.impactSection = c17818c;
            this.footerText = textResource;
            this.footer = interfaceC25312u;
        }

        /* JADX INFO: renamed from: a */
        public final List<C17817b> m51253a() {
            return this.campaignSections;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25312u getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getFooterText() {
            return this.footerText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getHeaderBody() {
            return this.headerBody;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getHeaderTitle() {
            return this.headerTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.headerTitle, bVar.headerTitle) && AbstractC22676k.m65745e(this.headerBody, bVar.headerBody) && AbstractC22676k.m65745e(this.pageBackgroundImage, bVar.pageBackgroundImage) && AbstractC22676k.m65745e(this.campaignSections, bVar.campaignSections) && AbstractC22676k.m65745e(this.impactSection, bVar.impactSection) && AbstractC22676k.m65745e(this.footerText, bVar.footerText) && AbstractC22676k.m65745e(this.footer, bVar.footer);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C17818c getImpactSection() {
            return this.impactSection;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC22403o getPageBackgroundImage() {
            return this.pageBackgroundImage;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC30007c.m91833c(this.pageBackgroundImage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.toolbarTitle.hashCode() * 31, this.headerTitle, 31), this.headerBody, 31), 31), 31, this.campaignSections);
            C17818c c17818c = this.impactSection;
            int iHashCode = (iM31983b + (c17818c == null ? 0 : c17818c.hashCode())) * 31;
            TextResource textResource = this.footerText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u = this.footer;
            return iHashCode2 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.headerTitle;
            TextResource textResource3 = this.headerBody;
            AbstractC22403o abstractC22403o = this.pageBackgroundImage;
            List<C17817b> list = this.campaignSections;
            C17818c c17818c = this.impactSection;
            TextResource textResource4 = this.footerText;
            InterfaceC25312u interfaceC25312u = this.footer;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("Loaded(toolbarTitle=", textResource, ", headerTitle=", textResource2, ", headerBody=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", pageBackgroundImage=");
            sbM106658q.append(abstractC22403o);
            sbM106658q.append(", campaignSections=");
            sbM106658q.append(list);
            sbM106658q.append(", impactSection=");
            sbM106658q.append(c17818c);
            sbM106658q.append(", footerText=");
            sbM106658q.append(textResource4);
            sbM106658q.append(", footer=");
            sbM106658q.append(interfaceC25312u);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    /* JADX INFO: renamed from: hz2.d$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lhz2/d$c;", "Lhz2/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC17819d {

        /* JADX INFO: renamed from: a */
        public static final c f69303a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1940190501;
        }

        public String toString() {
            return "Loading";
        }
    }
}
