package px2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jh3.AbstractC21702c;
import mx2.InterfaceC26015b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: px2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lpx2/b;", "", "<init>", "()V", "c", "a", "b", "Lpx2/b$a;", "Lpx2/b$b;", "Lpx2/b$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29599b {

    /* JADX INFO: renamed from: px2.b$a */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\"\u0010'R\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0010¨\u0006*"}, m65681d2 = {"Lpx2/b$a;", "Lpx2/b;", "Lmx2/b;", "action", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lpx2/h;", "options", "bottomText", "ctaText", "<init>", "(Lmx2/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "()Z", "hasSelection", "selectedOption", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC29599b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C29605h> options;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource bottomText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource ctaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC26015b action, TextResource title, TextResource subtitle, List<C29605h> options, TextResource bottomText, TextResource ctaText) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(options, "options");
            AbstractC22676k.m65750j(bottomText, "bottomText");
            AbstractC22676k.m65750j(ctaText, "ctaText");
            this.action = action;
            this.title = title;
            this.subtitle = subtitle;
            this.options = options;
            this.bottomText = bottomText;
            this.ctaText = ctaText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26015b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getBottomText() {
            return this.bottomText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m90786d() {
            List<C29605h> list = this.options;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C29605h) it.next()).getIsSelected()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final List<C29605h> m90787e() {
            return this.options;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.options, aVar.options) && AbstractC22676k.m65745e(this.bottomText, aVar.bottomText) && AbstractC22676k.m65745e(this.ctaText, aVar.ctaText);
        }

        /* JADX INFO: renamed from: f */
        public final String m90788f() {
            for (C29605h c29605h : this.options) {
                if (c29605h.getIsSelected()) {
                    return c29605h.getKey();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.ctaText.hashCode() + AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.action.hashCode() * 31, this.title, 31), this.subtitle, 31), 31, this.options), this.bottomText, 31);
        }

        public String toString() {
            InterfaceC26015b interfaceC26015b = this.action;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            List<C29605h> list = this.options;
            TextResource textResource3 = this.bottomText;
            TextResource textResource4 = this.ctaText;
            StringBuilder sb4 = new StringBuilder("FeedbackOptionsScreen(action=");
            sb4.append(interfaceC26015b);
            sb4.append(", title=");
            sb4.append(textResource);
            sb4.append(", subtitle=");
            AbstractC21702c.m61143n(textResource2, ", options=", ", bottomText=", sb4, list);
            return AbstractC33745d.m106655n(sb4, textResource3, ", ctaText=", textResource4, ")");
        }
    }

    /* JADX INFO: renamed from: px2.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lpx2/b$b;", "Lpx2/b;", "Lmx2/b;", "action", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "label", "", "key", "additionalText", "bottomText", "ctaText", "<init>", "(Lmx2/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "f", "e", "Ljava/lang/String;", "i", "()Z", "isCtaEnabled", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29599b {

        /* JADX INFO: renamed from: i */
        public static final int f120859i = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String additionalText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource bottomText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource ctaText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC26015b action, TextResource title, TextResource subtitle, TextResource label, String key, String additionalText, TextResource bottomText, TextResource ctaText) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(additionalText, "additionalText");
            AbstractC22676k.m65750j(bottomText, "bottomText");
            AbstractC22676k.m65750j(ctaText, "ctaText");
            this.action = action;
            this.title = title;
            this.subtitle = subtitle;
            this.label = label;
            this.key = key;
            this.additionalText = additionalText;
            this.bottomText = bottomText;
            this.ctaText = ctaText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26015b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAdditionalText() {
            return this.additionalText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getBottomText() {
            return this.bottomText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.subtitle, bVar.subtitle) && AbstractC22676k.m65745e(this.label, bVar.label) && AbstractC22676k.m65745e(this.key, bVar.key) && AbstractC22676k.m65745e(this.additionalText, bVar.additionalText) && AbstractC22676k.m65745e(this.bottomText, bVar.bottomText) && AbstractC22676k.m65745e(this.ctaText, bVar.ctaText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.ctaText.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.action.hashCode() * 31, this.title, 31), this.subtitle, 31), this.label, 31), 31, this.key), 31, this.additionalText), this.bottomText, 31);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m90799i() {
            return !AbstractC39414r.m125890i0(this.additionalText);
        }

        public String toString() {
            InterfaceC26015b interfaceC26015b = this.action;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            TextResource textResource3 = this.label;
            String str = this.key;
            String str2 = this.additionalText;
            TextResource textResource4 = this.bottomText;
            TextResource textResource5 = this.ctaText;
            StringBuilder sb4 = new StringBuilder("FeedbackWithTextScreen(action=");
            sb4.append(interfaceC26015b);
            sb4.append(", title=");
            sb4.append(textResource);
            sb4.append(", subtitle=");
            AbstractC30007c.m91855y(sb4, textResource2, ", label=", textResource3, ", key=");
            AbstractC11266d.m30444B(sb4, str, ", additionalText=", str2, ", bottomText=");
            return AbstractC33745d.m106655n(sb4, textResource4, ", ctaText=", textResource5, ")");
        }
    }

    /* JADX INFO: renamed from: px2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpx2/b$c;", "Lpx2/b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC29599b {

        /* JADX INFO: renamed from: a */
        public static final c f120868a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC29599b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29599b() {
    }
}
