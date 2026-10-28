package ne1;

import com.whoop.design.model.CtaNavigationDestination;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.api.QueryParams;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ne1.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lne1/a;", "", "<init>", "()V", "a", "g", "c", "e", "f", "b", "d", "Lne1/a$a;", "Lne1/a$b;", "Lne1/a$c;", "Lne1/a$d;", "Lne1/a$e;", "Lne1/a$f;", "Lne1/a$g;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26598a {

    /* JADX INFO: renamed from: ne1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lne1/a$a;", "Lne1/a;", "<init>", "()V", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC26598a {

        /* JADX INFO: renamed from: a */
        public static final a f105800a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ne1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lne1/a$b;", "Lne1/a;", "Lcom/whoop/design/model/CtaNavigationDestination;", "destination", "<init>", "(Lcom/whoop/design/model/CtaNavigationDestination;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/model/CtaNavigationDestination;", "()Lcom/whoop/design/model/CtaNavigationDestination;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC26598a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CtaNavigationDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CtaNavigationDestination destination) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CtaNavigationDestination getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.destination == ((b) other).destination;
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "OnCtaClick(destination=" + this.destination + ")";
        }
    }

    /* JADX INFO: renamed from: ne1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lne1/a$c;", "Lne1/a;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC26598a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String url) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.url, ((c) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnLinkClick(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: ne1.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lne1/a$d;", "Lne1/a;", "Lcom/whoop/navigation/e;", "navigationAction", "", "analyticsLabel", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC26598a {

        /* JADX INFO: renamed from: c */
        public static final int f105803c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String analyticsLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9598e navigationAction, String analyticsLabel) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
            this.navigationAction = navigationAction;
            this.analyticsLabel = analyticsLabel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsLabel() {
            return this.analyticsLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.navigationAction, dVar.navigationAction) && AbstractC22676k.m65745e(this.analyticsLabel, dVar.analyticsLabel);
        }

        public int hashCode() {
            return this.analyticsLabel.hashCode() + (this.navigationAction.hashCode() * 31);
        }

        public String toString() {
            return "OnNavigationAction(navigationAction=" + this.navigationAction + ", analyticsLabel=" + this.analyticsLabel + ")";
        }
    }

    /* JADX INFO: renamed from: ne1.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lne1/a$e;", "Lne1/a;", "", "name", "deepLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC26598a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String deepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String name, String deepLink) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(deepLink, "deepLink");
            this.name = name;
            this.deepLink = deepLink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.name, eVar.name) && AbstractC22676k.m65745e(this.deepLink, eVar.deepLink);
        }

        public int hashCode() {
            return this.deepLink.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnPodcastPlayerSelected(name=", this.name, ", deepLink=", this.deepLink, ")");
        }
    }

    /* JADX INFO: renamed from: ne1.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lne1/a$f;", "Lne1/a;", "", QueryParams.URL, "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC26598a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String url, String title) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(title, "title");
            this.url = url;
            this.title = title;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.url, fVar.url) && AbstractC22676k.m65745e(this.title, fVar.title);
        }

        public int hashCode() {
            return this.title.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnShareClick(url=", this.url, ", title=", this.title, ")");
        }
    }

    /* JADX INFO: renamed from: ne1.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lne1/a$g;", "Lne1/a;", "", "videoUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC26598a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String videoUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String videoUrl) {
            super(null);
            AbstractC22676k.m65750j(videoUrl, "videoUrl");
            this.videoUrl = videoUrl;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.videoUrl, ((g) other).videoUrl);
        }

        public int hashCode() {
            return this.videoUrl.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnVideoClick(videoUrl=", this.videoUrl, ")");
        }
    }

    public /* synthetic */ AbstractC26598a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26598a() {
    }
}
