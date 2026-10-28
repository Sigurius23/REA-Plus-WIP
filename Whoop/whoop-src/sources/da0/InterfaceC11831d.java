package da0;

import c41.C4092p2;
import com.mapbox.common.MapboxServices;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import n82.C26457c;
import n82.EnumC26455a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p294l3.C23254g;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import sp0.C32864d;
import sp0.C32870j;
import sp0.EnumC32862b;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import y71.AbstractC39279l;
import y71.C39282o;
import z90.AbstractC40203a;

/* JADX INFO: renamed from: da0.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lda0/d;", "", "a", "e", "d", "b", "c", "Lda0/d$a;", "Lda0/d$b;", "Lda0/d$c;", "Lda0/d$d;", "Lda0/d$e;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11831d {

    /* JADX INFO: renamed from: da0.d$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lda0/d$b;", "Lda0/d;", "Lcom/whoop/design/util/TextResource;", "dialogTitle", "Ll3/g;", "description", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Ll3/g;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ll3/g;", "()Ll3/g;", "c", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC11831d {

        /* JADX INFO: renamed from: d */
        public static final int f38522d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource dialogTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C23254g description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        public b(TextResource dialogTitle, C23254g description, TextResource primaryButtonText) {
            AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.dialogTitle = dialogTitle;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C23254g getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDialogTitle() {
            return this.dialogTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.dialogTitle, bVar.dialogTitle) && AbstractC22676k.m65745e(this.description, bVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText);
        }

        public int hashCode() {
            return this.primaryButtonText.hashCode() + ((this.description.hashCode() + (this.dialogTitle.hashCode() * 31)) * 31);
        }

        public String toString() {
            TextResource textResource = this.dialogTitle;
            C23254g c23254g = this.description;
            TextResource textResource2 = this.primaryButtonText;
            StringBuilder sb4 = new StringBuilder("DialogView(dialogTitle=");
            sb4.append(textResource);
            sb4.append(", description=");
            sb4.append((Object) c23254g);
            sb4.append(", primaryButtonText=");
            return AbstractC30007c.m91841k(sb4, textResource2, ")");
        }
    }

    /* JADX INFO: renamed from: da0.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lda0/d$c;", "Lda0/d;", "Lcom/whoop/design/util/TextResource;", "dialogTitle", "description", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC11831d {

        /* JADX INFO: renamed from: d */
        public static final int f38526d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource dialogTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        public c(TextResource dialogTitle, TextResource description, TextResource primaryButtonText) {
            AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.dialogTitle = dialogTitle;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDialogTitle() {
            return this.dialogTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.dialogTitle, cVar.dialogTitle) && AbstractC22676k.m65745e(this.description, cVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText);
        }

        public int hashCode() {
            return this.primaryButtonText.hashCode() + AbstractC31061c.m95625a(this.dialogTitle.hashCode() * 31, this.description, 31);
        }

        public String toString() {
            TextResource textResource = this.dialogTitle;
            TextResource textResource2 = this.description;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("ErrorDialogView(dialogTitle=", textResource, ", description=", textResource2, ", primaryButtonText="), this.primaryButtonText, ")");
        }
    }

    /* JADX INFO: renamed from: da0.d$d */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001\u001bBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(¨\u0006."}, m65681d2 = {"Lda0/d$d;", "Lda0/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lda0/b;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lda0/b;Lcom/whoop/design/util/TextResource;Lda0/b;Lda0/b;)V", "f", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lda0/b;Lcom/whoop/design/util/TextResource;Lda0/b;Lda0/b;)Lda0/d$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "n", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "c", "j", "d", "Lda0/b;", "i", "()Lda0/b;", "e", "l", "k", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC11831d {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i */
        public static final int f38531i = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: j */
        private static final d f38532j;

        /* JADX INFO: renamed from: k */
        private static final d f38533k;

        /* JADX INFO: renamed from: l */
        private static final d f38534l = new d(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC40203a.f173565v), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC40203a.f173546c), null, AbstractC8693b.m21277k(AbstractC40203a.f173544a), 0 == true ? 1 : 0, null, 106, null);

        /* JADX INFO: renamed from: m */
        private static final d f38535m = new d(AbstractC33208p0.f.f138478e, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null);

        /* JADX INFO: renamed from: n */
        private static final d f38536n = new d(new AbstractC33208p0.h(null, 0, null, 7, null), 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, null, null, 126, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC11829b primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC11829b secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC11829b followUpEvent;

        /* JADX INFO: renamed from: da0.d$d$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m65681d2 = {"Lda0/d$d$a;", "", "<init>", "()V", "Lda0/d$d;", "loading", "Lda0/d$d;", "b", "()Lda0/d$d;", "networkError", "c", "httpError", "a", "saving", "e", "saved", "d", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final d m31770a() {
                return d.f38534l;
            }

            /* JADX INFO: renamed from: b */
            public final d m31771b() {
                return d.f38532j;
            }

            /* JADX INFO: renamed from: c */
            public final d m31772c() {
                return d.f38533k;
            }

            /* JADX INFO: renamed from: d */
            public final d m31773d() {
                return d.f38536n;
            }

            /* JADX INFO: renamed from: e */
            public final d m31774e() {
                return d.f38535m;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            InterfaceC11829b interfaceC11829b = null;
            f38532j = new d(AbstractC33208p0.c.f138471e, null, null, null, null, null, interfaceC11829b, 126, null);
            f38533k = new d(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC40203a.f173569z), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC40203a.f173546c), 0 == true ? 1 : 0, AbstractC8693b.m21277k(AbstractC40203a.f173544a), interfaceC11829b, null, 106, null);
        }

        public d(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC11829b interfaceC11829b, TextResource secondaryButtonText, InterfaceC11829b interfaceC11829b2, InterfaceC11829b interfaceC11829b3) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC11829b;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC11829b2;
            this.followUpEvent = interfaceC11829b3;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ d m31761g(d dVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC11829b interfaceC11829b, TextResource textResource3, InterfaceC11829b interfaceC11829b2, InterfaceC11829b interfaceC11829b3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = dVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = dVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = dVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC11829b = dVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = dVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC11829b2 = dVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC11829b3 = dVar.followUpEvent;
            }
            InterfaceC11829b interfaceC11829b4 = interfaceC11829b2;
            InterfaceC11829b interfaceC11829b5 = interfaceC11829b3;
            TextResource textResource4 = textResource3;
            TextResource textResource5 = textResource2;
            return dVar.m31762f(abstractC33208p0, textResource, textResource5, interfaceC11829b, textResource4, interfaceC11829b4, interfaceC11829b5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.type, dVar.type) && AbstractC22676k.m65745e(this.supportText, dVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, dVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, dVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, dVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, dVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, dVar.followUpEvent);
        }

        /* JADX INFO: renamed from: f */
        public final d m31762f(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC11829b primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC11829b secondaryButtonClickEvent, InterfaceC11829b followUpEvent) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new d(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC11829b getFollowUpEvent() {
            return this.followUpEvent;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC11829b interfaceC11829b = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC11829b == null ? 0 : interfaceC11829b.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC11829b interfaceC11829b2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC11829b2 == null ? 0 : interfaceC11829b2.hashCode())) * 31;
            InterfaceC11829b interfaceC11829b3 = this.followUpEvent;
            return iHashCode + (interfaceC11829b3 != null ? interfaceC11829b3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final InterfaceC11829b getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final InterfaceC11829b getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC11829b interfaceC11829b = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC11829b interfaceC11829b2 = this.secondaryButtonClickEvent;
            InterfaceC11829b interfaceC11829b3 = this.followUpEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC11829b);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC11829b2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC11829b3);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ d(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC11829b interfaceC11829b, TextResource textResource3, InterfaceC11829b interfaceC11829b2, InterfaceC11829b interfaceC11829b3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC11829b, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC11829b2, (i13 & 64) != 0 ? null : interfaceC11829b3);
        }
    }

    /* JADX INFO: renamed from: da0.d$e */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, m65681d2 = {"Lda0/d$e;", "Lda0/d;", "Lcom/whoop/design/util/TextResource;", "selectActivityTitleDisplay", "Lsp0/b;", "bottomSheetStateValue", "", MapboxServices.SEARCH, "", "Ly71/o;", "mostRecentList", "allList", "Ln82/a;", "activityScreenTypes", "pageType", "", "prefetch", "imagesList", "crossScoreTypeSearchEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lsp0/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ljava/lang/Boolean;Ljava/util/List;Z)V", "Ln82/c;", "b", "()Ln82/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Lsp0/b;", "getBottomSheetStateValue", "()Lsp0/b;", "c", "Ljava/lang/String;", "getSearch", "d", "Ljava/util/List;", "getMostRecentList", "()Ljava/util/List;", "e", "getAllList", "f", "getActivityScreenTypes", "g", "Ln82/a;", "getPageType", "()Ln82/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Boolean;", "getPrefetch", "()Ljava/lang/Boolean;", "i", "getImagesList", "j", "Z", "getCrossScoreTypeSearchEnabled", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC11831d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource selectActivityTitleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32862b bottomSheetStateValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String search;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C39282o> mostRecentList;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C39282o> allList;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<EnumC26455a> activityScreenTypes;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Boolean prefetch;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<C39282o> imagesList;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean crossScoreTypeSearchEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public e(TextResource selectActivityTitleDisplay, EnumC32862b bottomSheetStateValue, String search, List<C39282o> mostRecentList, List<C39282o> allList, List<? extends EnumC26455a> activityScreenTypes, EnumC26455a pageType, Boolean bool, List<C39282o> list, boolean z4) {
            AbstractC22676k.m65750j(selectActivityTitleDisplay, "selectActivityTitleDisplay");
            AbstractC22676k.m65750j(bottomSheetStateValue, "bottomSheetStateValue");
            AbstractC22676k.m65750j(search, "search");
            AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
            AbstractC22676k.m65750j(allList, "allList");
            AbstractC22676k.m65750j(activityScreenTypes, "activityScreenTypes");
            AbstractC22676k.m65750j(pageType, "pageType");
            this.selectActivityTitleDisplay = selectActivityTitleDisplay;
            this.bottomSheetStateValue = bottomSheetStateValue;
            this.search = search;
            this.mostRecentList = mostRecentList;
            this.allList = allList;
            this.activityScreenTypes = activityScreenTypes;
            this.pageType = pageType;
            this.prefetch = bool;
            this.imagesList = list;
            this.crossScoreTypeSearchEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getSelectActivityTitleDisplay() {
            return this.selectActivityTitleDisplay;
        }

        /* JADX INFO: renamed from: b */
        public final C26457c m31776b() {
            return new C26457c(this.selectActivityTitleDisplay, this.search, this.mostRecentList, this.allList, this.imagesList, this.activityScreenTypes, this.pageType, null, this.prefetch, this.crossScoreTypeSearchEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.selectActivityTitleDisplay, eVar.selectActivityTitleDisplay) && this.bottomSheetStateValue == eVar.bottomSheetStateValue && AbstractC22676k.m65745e(this.search, eVar.search) && AbstractC22676k.m65745e(this.mostRecentList, eVar.mostRecentList) && AbstractC22676k.m65745e(this.allList, eVar.allList) && AbstractC22676k.m65745e(this.activityScreenTypes, eVar.activityScreenTypes) && this.pageType == eVar.pageType && AbstractC22676k.m65745e(this.prefetch, eVar.prefetch) && AbstractC22676k.m65745e(this.imagesList, eVar.imagesList) && this.crossScoreTypeSearchEnabled == eVar.crossScoreTypeSearchEnabled;
        }

        public int hashCode() {
            int iHashCode = (this.pageType.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((this.bottomSheetStateValue.hashCode() + (this.selectActivityTitleDisplay.hashCode() * 31)) * 31, 31, this.search), 31, this.mostRecentList), 31, this.allList), 31, this.activityScreenTypes)) * 31;
            Boolean bool = this.prefetch;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            List<C39282o> list = this.imagesList;
            return Boolean.hashCode(this.crossScoreTypeSearchEnabled) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public String toString() {
            TextResource textResource = this.selectActivityTitleDisplay;
            EnumC32862b enumC32862b = this.bottomSheetStateValue;
            String str = this.search;
            List<C39282o> list = this.mostRecentList;
            List<C39282o> list2 = this.allList;
            List<EnumC26455a> list3 = this.activityScreenTypes;
            EnumC26455a enumC26455a = this.pageType;
            Boolean bool = this.prefetch;
            List<C39282o> list4 = this.imagesList;
            boolean z4 = this.crossScoreTypeSearchEnabled;
            StringBuilder sb4 = new StringBuilder("SelectActivity(selectActivityTitleDisplay=");
            sb4.append(textResource);
            sb4.append(", bottomSheetStateValue=");
            sb4.append(enumC32862b);
            sb4.append(", search=");
            AbstractC36095b.m114694v(str, ", mostRecentList=", ", allList=", sb4, list);
            AbstractC21702c.m61148s(sb4, list2, ", activityScreenTypes=", list3, ", pageType=");
            sb4.append(enumC26455a);
            sb4.append(", prefetch=");
            sb4.append(bool);
            sb4.append(", imagesList=");
            sb4.append(list4);
            sb4.append(", crossScoreTypeSearchEnabled=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ e(TextResource textResource, EnumC32862b enumC32862b, String str, List list, List list2, List list3, EnumC26455a enumC26455a, Boolean bool, List list4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            textResource = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
            enumC32862b = (i13 & 2) != 0 ? EnumC32862b.COLLAPSED : enumC32862b;
            str = (i13 & 4) != 0 ? "" : str;
            int i14 = i13 & 8;
            C25271y c25271y = C25271y.f99162w;
            this(textResource, enumC32862b, str, i14 != 0 ? c25271y : list, (i13 & 16) != 0 ? c25271y : list2, (i13 & 32) != 0 ? AbstractC37056f.m118959K(EnumC26455a.ALL, EnumC26455a.STRAIN, EnumC26455a.RECOVERY, EnumC26455a.SLEEP) : list3, (i13 & 64) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 128) != 0 ? Boolean.TRUE : bool, (i13 & 256) != 0 ? c25271y : list4, (i13 & 512) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: da0.d$a */
    @Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b.\u00104R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b)\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b0\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010B\u001a\u0004\b:\u0010CR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b;\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b2\u0010I¨\u0006J"}, m65681d2 = {"Lda0/d$a;", "Lda0/d;", "Lcom/whoop/design/util/TextResource;", "addActivityTitleDisplay", "callToActionDisplay", "Ly71/o;", "selectedActivityMenuItemState", "locationDividerTitleDisplay", "locationPromptDisplay", "Lsp0/j;", "currentStrapLocation", "", "allowedStrapLocations", "Lsp0/d;", "startTimePickerState", "endTimePickerState", "Lsp0/b;", "bottomSheetStateValue", "Lda0/d$e;", "selectActivityScreenState", "Ln82/a;", "pageType", "", "primaryButtonEnabled", "Lc41/p2;", "infoCalloutState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsp0/j;Ljava/util/List;Lsp0/d;Lsp0/d;Lsp0/b;Lda0/d$e;Ln82/a;ZLc41/p2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ly71/o;", "k", "()Ly71/o;", "d", "g", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lsp0/j;", "()Lsp0/j;", "Ljava/util/List;", "()Ljava/util/List;", "Lsp0/d;", "l", "()Lsp0/d;", "i", "j", "Lsp0/b;", "getBottomSheetStateValue", "()Lsp0/b;", "Lda0/d$e;", "getSelectActivityScreenState", "()Lda0/d$e;", "Ln82/a;", "()Ln82/a;", "m", "Z", "()Z", "n", "Lc41/p2;", "()Lc41/p2;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11831d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource addActivityTitleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource callToActionDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39282o selectedActivityMenuItemState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource locationDividerTitleDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource locationPromptDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C32870j currentStrapLocation;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<C32870j> allowedStrapLocations;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C32864d startTimePickerState;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C32864d endTimePickerState;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final EnumC32862b bottomSheetStateValue;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final e selectActivityScreenState;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean primaryButtonEnabled;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final C4092p2 infoCalloutState;

        public a(TextResource addActivityTitleDisplay, TextResource callToActionDisplay, C39282o selectedActivityMenuItemState, TextResource locationDividerTitleDisplay, TextResource locationPromptDisplay, C32870j c32870j, List<C32870j> allowedStrapLocations, C32864d startTimePickerState, C32864d endTimePickerState, EnumC32862b bottomSheetStateValue, e eVar, EnumC26455a pageType, boolean z4, C4092p2 c4092p2) {
            AbstractC22676k.m65750j(addActivityTitleDisplay, "addActivityTitleDisplay");
            AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
            AbstractC22676k.m65750j(selectedActivityMenuItemState, "selectedActivityMenuItemState");
            AbstractC22676k.m65750j(locationDividerTitleDisplay, "locationDividerTitleDisplay");
            AbstractC22676k.m65750j(locationPromptDisplay, "locationPromptDisplay");
            AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
            AbstractC22676k.m65750j(startTimePickerState, "startTimePickerState");
            AbstractC22676k.m65750j(endTimePickerState, "endTimePickerState");
            AbstractC22676k.m65750j(bottomSheetStateValue, "bottomSheetStateValue");
            AbstractC22676k.m65750j(pageType, "pageType");
            this.addActivityTitleDisplay = addActivityTitleDisplay;
            this.callToActionDisplay = callToActionDisplay;
            this.selectedActivityMenuItemState = selectedActivityMenuItemState;
            this.locationDividerTitleDisplay = locationDividerTitleDisplay;
            this.locationPromptDisplay = locationPromptDisplay;
            this.currentStrapLocation = c32870j;
            this.allowedStrapLocations = allowedStrapLocations;
            this.startTimePickerState = startTimePickerState;
            this.endTimePickerState = endTimePickerState;
            this.bottomSheetStateValue = bottomSheetStateValue;
            this.selectActivityScreenState = eVar;
            this.pageType = pageType;
            this.primaryButtonEnabled = z4;
            this.infoCalloutState = c4092p2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getAddActivityTitleDisplay() {
            return this.addActivityTitleDisplay;
        }

        /* JADX INFO: renamed from: b */
        public final List<C32870j> m31739b() {
            return this.allowedStrapLocations;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getCallToActionDisplay() {
            return this.callToActionDisplay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C32870j getCurrentStrapLocation() {
            return this.currentStrapLocation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C32864d getEndTimePickerState() {
            return this.endTimePickerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.addActivityTitleDisplay, aVar.addActivityTitleDisplay) && AbstractC22676k.m65745e(this.callToActionDisplay, aVar.callToActionDisplay) && AbstractC22676k.m65745e(this.selectedActivityMenuItemState, aVar.selectedActivityMenuItemState) && AbstractC22676k.m65745e(this.locationDividerTitleDisplay, aVar.locationDividerTitleDisplay) && AbstractC22676k.m65745e(this.locationPromptDisplay, aVar.locationPromptDisplay) && AbstractC22676k.m65745e(this.currentStrapLocation, aVar.currentStrapLocation) && AbstractC22676k.m65745e(this.allowedStrapLocations, aVar.allowedStrapLocations) && AbstractC22676k.m65745e(this.startTimePickerState, aVar.startTimePickerState) && AbstractC22676k.m65745e(this.endTimePickerState, aVar.endTimePickerState) && this.bottomSheetStateValue == aVar.bottomSheetStateValue && AbstractC22676k.m65745e(this.selectActivityScreenState, aVar.selectActivityScreenState) && this.pageType == aVar.pageType && this.primaryButtonEnabled == aVar.primaryButtonEnabled && AbstractC22676k.m65745e(this.infoCalloutState, aVar.infoCalloutState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C4092p2 getInfoCalloutState() {
            return this.infoCalloutState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getLocationDividerTitleDisplay() {
            return this.locationDividerTitleDisplay;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getLocationPromptDisplay() {
            return this.locationPromptDisplay;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.selectedActivityMenuItemState.hashCode() + AbstractC31061c.m95625a(this.addActivityTitleDisplay.hashCode() * 31, this.callToActionDisplay, 31)) * 31, this.locationDividerTitleDisplay, 31), this.locationPromptDisplay, 31);
            C32870j c32870j = this.currentStrapLocation;
            int iHashCode = (this.bottomSheetStateValue.hashCode() + ((this.endTimePickerState.hashCode() + ((this.startTimePickerState.hashCode() + AbstractC11895b.m31983b((iM95625a + (c32870j == null ? 0 : c32870j.hashCode())) * 31, 31, this.allowedStrapLocations)) * 31)) * 31)) * 31;
            e eVar = this.selectActivityScreenState;
            int iM8289b = AbstractC2875y.m8289b((this.pageType.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31, 31, this.primaryButtonEnabled);
            C4092p2 c4092p2 = this.infoCalloutState;
            return iM8289b + (c4092p2 != null ? c4092p2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC26455a getPageType() {
            return this.pageType;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C39282o getSelectedActivityMenuItemState() {
            return this.selectedActivityMenuItemState;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C32864d getStartTimePickerState() {
            return this.startTimePickerState;
        }

        public String toString() {
            TextResource textResource = this.addActivityTitleDisplay;
            TextResource textResource2 = this.callToActionDisplay;
            C39282o c39282o = this.selectedActivityMenuItemState;
            TextResource textResource3 = this.locationDividerTitleDisplay;
            TextResource textResource4 = this.locationPromptDisplay;
            C32870j c32870j = this.currentStrapLocation;
            List<C32870j> list = this.allowedStrapLocations;
            C32864d c32864d = this.startTimePickerState;
            C32864d c32864d2 = this.endTimePickerState;
            EnumC32862b enumC32862b = this.bottomSheetStateValue;
            e eVar = this.selectActivityScreenState;
            EnumC26455a enumC26455a = this.pageType;
            boolean z4 = this.primaryButtonEnabled;
            C4092p2 c4092p2 = this.infoCalloutState;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("AddActivity(addActivityTitleDisplay=", textResource, ", callToActionDisplay=", textResource2, ", selectedActivityMenuItemState=");
            sbM106658q.append(c39282o);
            sbM106658q.append(", locationDividerTitleDisplay=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", locationPromptDisplay=");
            sbM106658q.append(textResource4);
            sbM106658q.append(", currentStrapLocation=");
            sbM106658q.append(c32870j);
            sbM106658q.append(", allowedStrapLocations=");
            sbM106658q.append(list);
            sbM106658q.append(", startTimePickerState=");
            sbM106658q.append(c32864d);
            sbM106658q.append(", endTimePickerState=");
            sbM106658q.append(c32864d2);
            sbM106658q.append(", bottomSheetStateValue=");
            sbM106658q.append(enumC32862b);
            sbM106658q.append(", selectActivityScreenState=");
            sbM106658q.append(eVar);
            sbM106658q.append(", pageType=");
            sbM106658q.append(enumC26455a);
            sbM106658q.append(", primaryButtonEnabled=");
            sbM106658q.append(z4);
            sbM106658q.append(", infoCalloutState=");
            sbM106658q.append(c4092p2);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, C39282o c39282o, TextResource textResource3, TextResource textResource4, C32870j c32870j, List list, C32864d c32864d, C32864d c32864d2, EnumC32862b enumC32862b, e eVar, EnumC26455a enumC26455a, boolean z4, C4092p2 c4092p2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? new C39282o(null, AbstractC8693b.m21267a(), null, false, false, new AbstractC39279l.b(null, null, null, null, null, null, null, null, null, null, null, false, 4095, null), false, null, null, null, false, null, null, null, null, 32733, null) : c39282o, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 32) != 0 ? null : c32870j, (i13 & 64) != 0 ? C25271y.f99162w : list, (i13 & 128) != 0 ? new C32864d(null, null, null, null, null, 31, null) : c32864d, (i13 & 256) != 0 ? new C32864d(null, null, null, null, null, 31, null) : c32864d2, (i13 & 512) != 0 ? EnumC32862b.COLLAPSED : enumC32862b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : eVar, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 4096) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c4092p2);
        }
    }
}
