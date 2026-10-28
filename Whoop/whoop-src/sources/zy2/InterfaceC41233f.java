package zy2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: zy2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lzy2/f;", "", "c", "a", "b", "Lzy2/f$a;", "Lzy2/f$b;", "Lzy2/f$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC41233f {

    /* JADX INFO: renamed from: zy2.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzy2/f$a;", "Lzy2/f;", "", "campaignFilter", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC41233f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String campaignFilter;

        public a(String campaignFilter) {
            AbstractC22676k.m65750j(campaignFilter, "campaignFilter");
            this.campaignFilter = campaignFilter;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCampaignFilter() {
            return this.campaignFilter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.campaignFilter, ((a) other).campaignFilter);
        }

        public int hashCode() {
            return this.campaignFilter.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ErrorLoading(campaignFilter=", this.campaignFilter, ")");
        }
    }

    /* JADX INFO: renamed from: zy2.f$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lzy2/f$b;", "Lzy2/f;", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "", "body", "", "Lzy2/e;", "campaignSection", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC41233f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C41232e> campaignSection;

        public b(TextResource toolbarTitle, TextResource title, String str, List<C41232e> campaignSection) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(campaignSection, "campaignSection");
            this.toolbarTitle = toolbarTitle;
            this.title = title;
            this.body = str;
            this.campaignSection = campaignSection;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b */
        public final List<C41232e> m133949b() {
            return this.campaignSection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.body, bVar.body) && AbstractC22676k.m65745e(this.campaignSection, bVar.campaignSection);
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(this.toolbarTitle.hashCode() * 31, this.title, 31);
            String str = this.body;
            return this.campaignSection.hashCode() + ((iM95625a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.title;
            return AbstractC30007c.m91840j(this.body, ", campaignSection=", ")", AbstractC33745d.m106658q("Loaded(toolbarTitle=", textResource, ", title=", textResource2, ", body="), this.campaignSection);
        }
    }

    /* JADX INFO: renamed from: zy2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzy2/f$c;", "Lzy2/f;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC41233f {

        /* JADX INFO: renamed from: a */
        public static final c f177930a = new c();

        private c() {
        }
    }
}
