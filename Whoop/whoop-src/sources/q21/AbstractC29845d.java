package q21;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q21.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lq21/d;", "", "<init>", "()V", "a", "g", "f", "b", "e", "c", "d", "Lq21/d$a;", "Lq21/d$b;", "Lq21/d$c;", "Lq21/d$d;", "Lq21/d$e;", "Lq21/d$f;", "Lq21/d$g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29845d {

    /* JADX INFO: renamed from: q21.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lq21/d$a;", "Lq21/d;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29845d {

        /* JADX INFO: renamed from: a */
        public static final a f121968a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: q21.d$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lq21/d$b;", "Lq21/d;", "Lcom/whoop/design/util/TextResource;", "content", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.content, ((b) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Header(content=", this.content, ")");
        }
    }

    /* JADX INFO: renamed from: q21.d$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lq21/d$c;", "Lq21/d;", "Lgz0/m0;", "icon", "Lq21/e;", "style", "<init>", "(Lgz0/m0;Lq21/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Lq21/e;", "()Lq21/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C29846e style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC16313m0 icon, C29846e style) {
            super(null);
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(style, "style");
            this.icon = icon;
            this.style = style;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C29846e getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.icon == cVar.icon && AbstractC22676k.m65745e(this.style, cVar.style);
        }

        public int hashCode() {
            return this.style.hashCode() + (this.icon.hashCode() * 31);
        }

        public String toString() {
            return "Icon(icon=" + this.icon + ", style=" + this.style + ")";
        }
    }

    /* JADX INFO: renamed from: q21.d$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lq21/d$d;", "Lq21/d;", "Lkd1/o;", "image", "<init>", "(Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC22403o image) {
            super(null);
            AbstractC22676k.m65750j(image, "image");
            this.image = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.image, ((d) other).image);
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        public String toString() {
            return "Image(image=" + this.image + ")";
        }
    }

    /* JADX INFO: renamed from: q21.d$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lq21/d$e;", "Lq21/d;", "", "content", "Lq21/e;", "style", "<init>", "(Ljava/lang/String;Lq21/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lq21/e;", "()Lq21/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C29846e style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String content, C29846e c29846e) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
            this.style = c29846e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C29846e getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.content, eVar.content) && AbstractC22676k.m65745e(this.style, eVar.style);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            C29846e c29846e = this.style;
            return iHashCode + (c29846e == null ? 0 : c29846e.hashCode());
        }

        public String toString() {
            return "NumberText(content=" + this.content + ", style=" + this.style + ")";
        }
    }

    /* JADX INFO: renamed from: q21.d$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lq21/d$f;", "Lq21/d;", "", "content", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.content, ((f) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Text(content=", this.content, ")");
        }
    }

    /* JADX INFO: renamed from: q21.d$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lq21/d$g;", "Lq21/d;", "", "content", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC29845d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.content, ((g) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Title(content=", this.content, ")");
        }
    }

    public /* synthetic */ AbstractC29845d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29845d() {
    }
}
