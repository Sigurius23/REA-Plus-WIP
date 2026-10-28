package gv1;

import io.getstream.chat.android.client.api.QueryParams;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gv1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lgv1/o;", "", "<init>", "()V", "d", "c", "b", "a", "Lgv1/o$a;", "Lgv1/o$b;", "Lgv1/o$c;", "Lgv1/o$d;", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16241o {

    /* JADX INFO: renamed from: a */
    public static final int f61698a = 0;

    /* JADX INFO: renamed from: gv1.o$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgv1/o$a;", "Lgv1/o;", "", "uri", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC16241o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String uri) {
            super(null);
            AbstractC22676k.m65750j(uri, "uri");
            this.uri = uri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.uri, ((a) other).uri);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ImageFile(uri=", this.uri, ")");
        }
    }

    /* JADX INFO: renamed from: gv1.o$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgv1/o$b;", "Lgv1/o;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC16241o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
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
            return AbstractC11895b.m31996o("ImageUrl(url=", this.url, ")");
        }
    }

    /* JADX INFO: renamed from: gv1.o$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgv1/o$c;", "Lgv1/o;", "", "json", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC16241o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String json) {
            super(null);
            AbstractC22676k.m65750j(json, "json");
            this.json = json;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getJson() {
            return this.json;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.json, ((c) other).json);
        }

        public int hashCode() {
            return this.json.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("JsonString(json=", this.json, ")");
        }
    }

    /* JADX INFO: renamed from: gv1.o$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgv1/o$d;", "Lgv1/o;", "", QueryParams.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC16241o {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String url) {
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
            return (other instanceof d) && AbstractC22676k.m65745e(this.url, ((d) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Url(url=", this.url, ")");
        }
    }

    public /* synthetic */ AbstractC16241o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC16241o() {
    }
}
