package pd2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import kd2.AbstractC22415a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: pd2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lpd2/d;", "", "b", "a", "Lpd2/d$a;", "Lpd2/d$b;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29108d {

    /* JADX INFO: renamed from: pd2.d$a */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b)\u0010\"R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b&\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b*\u0010(¨\u0006+"}, m65681d2 = {"Lpd2/d$a;", "Lpd2/d;", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "aboutTitle", "Lkd1/o;", "aboutImage", "", "Lpd2/a;", "informationItems", "manufacturerLabel", "manufacturerAddress", "Lpd2/f;", "tileItems", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "d", "Lkd1/o;", "()Lkd1/o;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC29108d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource aboutTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AbstractC22403o aboutImage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C29105a> informationItems;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource manufacturerLabel;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource manufacturerAddress;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C29110f> tileItems;

        public a(int i13, TextResource title, TextResource aboutTitle, AbstractC22403o aboutImage, List<C29105a> informationItems, TextResource manufacturerLabel, TextResource manufacturerAddress, List<C29110f> tileItems) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(aboutTitle, "aboutTitle");
            AbstractC22676k.m65750j(aboutImage, "aboutImage");
            AbstractC22676k.m65750j(informationItems, "informationItems");
            AbstractC22676k.m65750j(manufacturerLabel, "manufacturerLabel");
            AbstractC22676k.m65750j(manufacturerAddress, "manufacturerAddress");
            AbstractC22676k.m65750j(tileItems, "tileItems");
            this.icon = i13;
            this.title = title;
            this.aboutTitle = aboutTitle;
            this.aboutImage = aboutImage;
            this.informationItems = informationItems;
            this.manufacturerLabel = manufacturerLabel;
            this.manufacturerAddress = manufacturerAddress;
            this.tileItems = tileItems;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getAboutImage() {
            return this.aboutImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getAboutTitle() {
            return this.aboutTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d */
        public final List<C29105a> m88451d() {
            return this.informationItems;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getManufacturerAddress() {
            return this.manufacturerAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.icon == aVar.icon && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.aboutTitle, aVar.aboutTitle) && AbstractC22676k.m65745e(this.aboutImage, aVar.aboutImage) && AbstractC22676k.m65745e(this.informationItems, aVar.informationItems) && AbstractC22676k.m65745e(this.manufacturerLabel, aVar.manufacturerLabel) && AbstractC22676k.m65745e(this.manufacturerAddress, aVar.manufacturerAddress) && AbstractC22676k.m65745e(this.tileItems, aVar.tileItems);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getManufacturerLabel() {
            return this.manufacturerLabel;
        }

        /* JADX INFO: renamed from: g */
        public final List<C29110f> m88454g() {
            return this.tileItems;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.tileItems.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC30007c.m91833c(this.aboutImage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31), this.aboutTitle, 31), 31), 31, this.informationItems), this.manufacturerLabel, 31), this.manufacturerAddress, 31);
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.title;
            TextResource textResource2 = this.aboutTitle;
            AbstractC22403o abstractC22403o = this.aboutImage;
            List<C29105a> list = this.informationItems;
            TextResource textResource3 = this.manufacturerLabel;
            TextResource textResource4 = this.manufacturerAddress;
            List<C29110f> list2 = this.tileItems;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(icon=", i13, ", title=", textResource, ", aboutTitle=");
            sbM91844n.append(textResource2);
            sbM91844n.append(", aboutImage=");
            sbM91844n.append(abstractC22403o);
            sbM91844n.append(", informationItems=");
            AbstractC30007c.m91852v(textResource3, ", manufacturerLabel=", ", manufacturerAddress=", sbM91844n, list);
            sbM91844n.append(textResource4);
            sbM91844n.append(", tileItems=");
            sbM91844n.append(list2);
            sbM91844n.append(")");
            return sbM91844n.toString();
        }
    }

    /* JADX INFO: renamed from: pd2.d$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lpd2/d$b;", "Lpd2/d;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "secondaryButtonText", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "f", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC29108d {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f */
        public static final int f117809f = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: g */
        private static final b f117810g = new b(AbstractC33208p0.c.f138471e, null, null, null, 14, null);

        /* JADX INFO: renamed from: h */
        private static final b f117811h = new b(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87693j), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC22415a.f87691h), AbstractC8693b.m21277k(AbstractC22415a.f87692i), 2, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: pd2.d$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lpd2/d$b$a;", "", "<init>", "()V", "Lpd2/d$b;", "loading", "Lpd2/d$b;", "b", "()Lpd2/d$b;", "error", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m88462a() {
                return b.f117811h;
            }

            /* JADX INFO: renamed from: b */
            public final b m88463b() {
                return b.f117810g;
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
