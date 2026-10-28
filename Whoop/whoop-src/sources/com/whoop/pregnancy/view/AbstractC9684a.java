package com.whoop.pregnancy.view;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.pregnancy.view.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a;", "", "<init>", "()V", "g", "d", "a", "f", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "c", "Lcom/whoop/pregnancy/view/a$a;", "Lcom/whoop/pregnancy/view/a$b;", "Lcom/whoop/pregnancy/view/a$c;", "Lcom/whoop/pregnancy/view/a$d;", "Lcom/whoop/pregnancy/view/a$e;", "Lcom/whoop/pregnancy/view/a$f;", "Lcom/whoop/pregnancy/view/a$g;", "Lcom/whoop/pregnancy/view/a$h;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9684a {

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$a;", "Lcom/whoop/pregnancy/view/a;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC9684a {

        /* JADX INFO: renamed from: a */
        public static final a f28310a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$b;", "Lcom/whoop/pregnancy/view/a;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC9684a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String url) {
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
            return (other instanceof b) && AbstractC22676k.m65745e(this.url, ((b) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LearnMore(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$c;", "Lcom/whoop/pregnancy/view/a;", "", "destination", "", "shouldPopUpHome", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC9684a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean shouldPopUpHome;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String destination, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
            this.shouldPopUpHome = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldPopUpHome() {
            return this.shouldPopUpHome;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.destination, cVar.destination) && this.shouldPopUpHome == cVar.shouldPopUpHome;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldPopUpHome) + (this.destination.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("NavigateToScreen(destination=", this.destination, ", shouldPopUpHome=", ")", this.shouldPopUpHome);
        }

        public /* synthetic */ c(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$d;", "Lcom/whoop/pregnancy/view/a;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC9684a {

        /* JADX INFO: renamed from: a */
        public static final d f28314a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$e;", "Lcom/whoop/pregnancy/view/a;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC9684a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String deeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String deeplink) {
            super(null);
            AbstractC22676k.m65750j(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.deeplink, ((e) other).deeplink);
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnboardingStory(deeplink=", this.deeplink, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$f;", "Lcom/whoop/pregnancy/view/a;", "", "isPregInsightsEnabled", "", "source", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC9684a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isPregInsightsEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.isPregInsightsEnabled = z4;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsPregInsightsEnabled() {
            return this.isPregInsightsEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.isPregInsightsEnabled == fVar.isPregInsightsEnabled && AbstractC22676k.m65745e(this.source, fVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (Boolean.hashCode(this.isPregInsightsEnabled) * 31);
        }

        public String toString() {
            return AbstractC3855a.m11825i("SettingsBack(isPregInsightsEnabled=", ", source=", this.source, ")", this.isPregInsightsEnabled);
        }

        public /* synthetic */ f(boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$g;", "Lcom/whoop/pregnancy/view/a;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC9684a {

        /* JADX INFO: renamed from: a */
        public static final g f28318a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/pregnancy/view/a$h;", "Lcom/whoop/pregnancy/view/a;", "", "ctaUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC9684a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String ctaUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String ctaUrl) {
            super(null);
            AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
            this.ctaUrl = ctaUrl;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCtaUrl() {
            return this.ctaUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.ctaUrl, ((h) other).ctaUrl);
        }

        public int hashCode() {
            return this.ctaUrl.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ShareExperience(ctaUrl=", this.ctaUrl, ")");
        }
    }

    public /* synthetic */ AbstractC9684a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC9684a() {
    }
}
