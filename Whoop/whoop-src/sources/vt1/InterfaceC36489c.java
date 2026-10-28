package vt1;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: vt1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lvt1/c;", "", "b", "a", "Lvt1/c$a;", "Lvt1/c$b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36489c {

    /* JADX INFO: renamed from: vt1.c$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Lvt1/c$a;", "Lvt1/c;", "", "icon", "Lcom/whoop/design/util/TextResource;", "pageTitle", "headerTitle", "description", "", "Lvt1/e;", "regulatoryInfo", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "e", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC36489c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource pageTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource headerTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C36491e> regulatoryInfo;

        public a(int i13, TextResource pageTitle, TextResource headerTitle, TextResource description, List<C36491e> regulatoryInfo) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(headerTitle, "headerTitle");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(regulatoryInfo, "regulatoryInfo");
            this.icon = i13;
            this.pageTitle = pageTitle;
            this.headerTitle = headerTitle;
            this.description = description;
            this.regulatoryInfo = regulatoryInfo;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getHeaderTitle() {
            return this.headerTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getPageTitle() {
            return this.pageTitle;
        }

        /* JADX INFO: renamed from: e */
        public final List<C36491e> m116935e() {
            return this.regulatoryInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.icon == aVar.icon && AbstractC22676k.m65745e(this.pageTitle, aVar.pageTitle) && AbstractC22676k.m65745e(this.headerTitle, aVar.headerTitle) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.regulatoryInfo, aVar.regulatoryInfo);
        }

        public int hashCode() {
            return this.regulatoryInfo.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.pageTitle, 31), this.headerTitle, 31), this.description, 31);
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.pageTitle;
            TextResource textResource2 = this.headerTitle;
            TextResource textResource3 = this.description;
            List<C36491e> list = this.regulatoryInfo;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(icon=", i13, ", pageTitle=", textResource, ", headerTitle=");
            AbstractC30007c.m91855y(sbM91844n, textResource2, ", description=", textResource3, ", regulatoryInfo=");
            return AbstractC3855a.m11829m(sbM91844n, list, ")");
        }
    }

    /* JADX INFO: renamed from: vt1.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lvt1/c$b;", "Lvt1/c;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "secondaryButtonText", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "f", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC36489c {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f */
        public static final int f155885f = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: g */
        private static final b f155886g = new b(AbstractC33208p0.c.f138471e, null, null, null, 14, null);

        /* JADX INFO: renamed from: h */
        private static final b f155887h = new b(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC31794f.f131693y), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC31794f.f131665k), AbstractC8693b.m21277k(AbstractC31794f.f131651d), 2, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: vt1.c$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lvt1/c$b$a;", "", "<init>", "()V", "Lvt1/c$b;", "loading", "Lvt1/c$b;", "b", "()Lvt1/c$b;", "error", "a", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m116942a() {
                return b.f155887h;
            }

            /* JADX INFO: renamed from: b */
            public final b m116943b() {
                return b.f155886g;
            }

            private Companion() {
            }
        }

        public b(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, TextResource secondaryButtonText) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.secondaryButtonText = secondaryButtonText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.type, bVar.type) && AbstractC22676k.m65745e(this.supportText, bVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, bVar.primaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonText, bVar.secondaryButtonText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public int hashCode() {
            return this.secondaryButtonText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            return AbstractC33745d.m106655n(AbstractC11478a.m30862n("LoadingAndError(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
        }

        public /* synthetic */ b(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3);
        }
    }
}
