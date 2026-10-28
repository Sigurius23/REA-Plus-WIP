package wt2;

import au2.C2079d;
import com.whoop.design.util.TextResource;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.C12476e0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: wt2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lwt2/k;", "", "<init>", "()V", "b", "a", "c", "Lwt2/k$a;", "Lwt2/k$b;", "Lwt2/k$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37630k {

    /* JADX INFO: renamed from: wt2.k$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwt2/k$a;", "Lwt2/k;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37630k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String planId) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.planId, ((a) other).planId);
        }

        public int hashCode() {
            return this.planId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: wt2.k$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/k$b;", "Lwt2/k;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37630k {

        /* JADX INFO: renamed from: a */
        public static final b f161052a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wt2.k$c */
    @Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b/\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b\"\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b,\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b$\u0010;\u001a\u0004\b4\u0010<¨\u0006="}, m65681d2 = {"Lwt2/k$c;", "Lwt2/k;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lwt2/h;", "header", "description", "Lau2/d;", "newSummary", "Lwt2/a;", "primaryButton", "secondaryButton", "Le0;", "percentageGauge", "Lwt2/c;", "challengeProgressBar", "Lkd1/o;", "overrideImage", "Lep0/j;", "screenContextMetadata", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lwt2/h;Lcom/whoop/design/util/TextResource;Lau2/d;Lwt2/a;Lwt2/a;Le0;Lwt2/c;Lkd1/o;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "b", "j", "c", "Lwt2/h;", "()Lwt2/h;", "d", "e", "Lau2/d;", "()Lau2/d;", "f", "Lwt2/a;", "g", "()Lwt2/a;", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Le0;", "()Le0;", "Lwt2/c;", "()Lwt2/c;", "Lkd1/o;", "()Lkd1/o;", "Lep0/j;", "()Lep0/j;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37630k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C37627h header;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C2079d newSummary;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C37620a primaryButton;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C37620a secondaryButton;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C12476e0 percentageGauge;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C37622c challengeProgressBar;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final AbstractC22403o overrideImage;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource title, TextResource subtitle, C37627h header, TextResource description, C2079d c2079d, C37620a c37620a, C37620a c37620a2, C12476e0 c12476e0, C37622c c37622c, AbstractC22403o abstractC22403o, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(description, "description");
            this.title = title;
            this.subtitle = subtitle;
            this.header = header;
            this.description = description;
            this.newSummary = c2079d;
            this.primaryButton = c37620a;
            this.secondaryButton = c37620a2;
            this.percentageGauge = c12476e0;
            this.challengeProgressBar = c37622c;
            this.overrideImage = abstractC22403o;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C37622c getChallengeProgressBar() {
            return this.challengeProgressBar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C37627h getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C2079d getNewSummary() {
            return this.newSummary;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC22403o getOverrideImage() {
            return this.overrideImage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.header, cVar.header) && AbstractC22676k.m65745e(this.description, cVar.description) && AbstractC22676k.m65745e(this.newSummary, cVar.newSummary) && AbstractC22676k.m65745e(this.primaryButton, cVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, cVar.secondaryButton) && AbstractC22676k.m65745e(this.percentageGauge, cVar.percentageGauge) && AbstractC22676k.m65745e(this.challengeProgressBar, cVar.challengeProgressBar) && AbstractC22676k.m65745e(this.overrideImage, cVar.overrideImage) && AbstractC22676k.m65745e(this.screenContextMetadata, cVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C12476e0 getPercentageGauge() {
            return this.percentageGauge;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C37620a getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a((this.header.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31, this.description, 31);
            C2079d c2079d = this.newSummary;
            int iHashCode = (iM95625a + (c2079d == null ? 0 : c2079d.hashCode())) * 31;
            C37620a c37620a = this.primaryButton;
            int iHashCode2 = (iHashCode + (c37620a == null ? 0 : c37620a.hashCode())) * 31;
            C37620a c37620a2 = this.secondaryButton;
            int iHashCode3 = (iHashCode2 + (c37620a2 == null ? 0 : c37620a2.hashCode())) * 31;
            C12476e0 c12476e0 = this.percentageGauge;
            int iHashCode4 = (iHashCode3 + (c12476e0 == null ? 0 : c12476e0.hashCode())) * 31;
            C37622c c37622c = this.challengeProgressBar;
            int iHashCode5 = (iHashCode4 + (c37622c == null ? 0 : c37622c.hashCode())) * 31;
            AbstractC22403o abstractC22403o = this.overrideImage;
            int iHashCode6 = (iHashCode5 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode6 + (c13404j != null ? c13404j.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C37620a getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            C37627h c37627h = this.header;
            TextResource textResource3 = this.description;
            C2079d c2079d = this.newSummary;
            C37620a c37620a = this.primaryButton;
            C37620a c37620a2 = this.secondaryButton;
            C12476e0 c12476e0 = this.percentageGauge;
            C37622c c37622c = this.challengeProgressBar;
            AbstractC22403o abstractC22403o = this.overrideImage;
            C13404j c13404j = this.screenContextMetadata;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("Success(title=", textResource, ", subtitle=", textResource2, ", header=");
            sbM106658q.append(c37627h);
            sbM106658q.append(", description=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", newSummary=");
            sbM106658q.append(c2079d);
            sbM106658q.append(", primaryButton=");
            sbM106658q.append(c37620a);
            sbM106658q.append(", secondaryButton=");
            sbM106658q.append(c37620a2);
            sbM106658q.append(", percentageGauge=");
            sbM106658q.append(c12476e0);
            sbM106658q.append(", challengeProgressBar=");
            sbM106658q.append(c37622c);
            sbM106658q.append(", overrideImage=");
            sbM106658q.append(abstractC22403o);
            sbM106658q.append(", screenContextMetadata=");
            sbM106658q.append(c13404j);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    public /* synthetic */ AbstractC37630k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37630k() {
    }
}
