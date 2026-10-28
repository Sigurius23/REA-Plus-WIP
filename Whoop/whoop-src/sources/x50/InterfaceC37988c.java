package x50;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: x50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lx50/c;", "Lfy1/k;", "e", "d", "c", "b", "a", "Lx50/c$a;", "Lx50/c$b;", "Lx50/c$c;", "Lx50/c$d;", "Lx50/c$e;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37988c extends InterfaceC14875k {

    /* JADX INFO: renamed from: x50.c$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lx50/c$a;", "Lx50/c;", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/metrics/common/ScreenState;", "c", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC37988c {

        /* JADX INFO: renamed from: d */
        public static final int f162687d = C9598e.f28134d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e navigation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ScreenState state = ScreenState.OTHER;

        public a(C9598e c9598e) {
            this.navigation = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavigation() {
            return this.navigation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.navigation, ((a) other).navigation);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return this.state;
        }

        public int hashCode() {
            C9598e c9598e = this.navigation;
            if (c9598e == null) {
                return 0;
            }
            return c9598e.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("Connected(navigation=", this.navigation, ")");
        }
    }

    /* JADX INFO: renamed from: x50.c$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lx50/c$b;", "Lx50/c;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "c", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC37988c {

        /* JADX INFO: renamed from: b */
        public static final b f162690b = new b();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final ScreenState state = ScreenState.OTHER;

        private b() {
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return state;
        }
    }

    /* JADX INFO: renamed from: x50.c$c */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001f\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001b\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lx50/c$c;", "Lx50/c;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lcom/whoop/design/models/items/FeatureListModel;", "featuresList", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "", "omronUrl", "Lcom/whoop/navigation/e;", "navigateOnSuccess", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkd1/o;", "d", "()Lkd1/o;", "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "f", "e", "Lcom/whoop/design/models/items/FeatureListModel;", "()Lcom/whoop/design/models/items/FeatureListModel;", "Lcom/whoop/design/models/items/CardButtonModel;", "()Lcom/whoop/design/models/items/CardButtonModel;", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/e;", "getNavigateOnSuccess", "()Lcom/whoop/navigation/e;", "Lcom/whoop/metrics/common/ScreenState;", "i", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC37988c {

        /* JADX INFO: renamed from: j */
        public static final int f162692j;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final FeatureListModel featuresList;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final CardButtonModel button;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String omronUrl;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C9598e navigateOnSuccess;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final ScreenState state;

        static {
            int i13 = C9598e.f28134d | CardButtonModel.$stable | FeatureListModel.$stable;
            int i14 = TextResource.$stable;
            f162692j = i13 | i14 | i14 | AbstractC22403o.f87638a;
        }

        public c(AbstractC22403o image, TextResource title, TextResource subtitle, FeatureListModel featuresList, CardButtonModel button, String omronUrl, C9598e c9598e) {
            AbstractC22676k.m65750j(image, "image");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(featuresList, "featuresList");
            AbstractC22676k.m65750j(button, "button");
            AbstractC22676k.m65750j(omronUrl, "omronUrl");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.featuresList = featuresList;
            this.button = button;
            this.omronUrl = omronUrl;
            this.navigateOnSuccess = c9598e;
            this.state = ScreenState.SUCCESS;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardButtonModel getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FeatureListModel getFeaturesList() {
            return this.featuresList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getOmronUrl() {
            return this.omronUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.image, cVar.image) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.featuresList, cVar.featuresList) && AbstractC22676k.m65745e(this.button, cVar.button) && AbstractC22676k.m65745e(this.omronUrl, cVar.omronUrl) && AbstractC22676k.m65745e(this.navigateOnSuccess, cVar.navigateOnSuccess);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return this.state;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d((this.button.hashCode() + ((this.featuresList.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31), this.subtitle, 31)) * 31)) * 31, 31, this.omronUrl);
            C9598e c9598e = this.navigateOnSuccess;
            return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.image;
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            FeatureListModel featureListModel = this.featuresList;
            CardButtonModel cardButtonModel = this.button;
            String str = this.omronUrl;
            C9598e c9598e = this.navigateOnSuccess;
            StringBuilder sbM114683k = AbstractC36095b.m114683k("Content(image=", textResource, abstractC22403o, ", title=", ", subtitle=");
            sbM114683k.append(textResource2);
            sbM114683k.append(", featuresList=");
            sbM114683k.append(featureListModel);
            sbM114683k.append(", button=");
            sbM114683k.append(cardButtonModel);
            sbM114683k.append(", omronUrl=");
            sbM114683k.append(str);
            sbM114683k.append(", navigateOnSuccess=");
            return AbstractC33745d.m106656o(sbM114683k, c9598e, ")");
        }
    }

    /* JADX INFO: renamed from: x50.c$d */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lx50/c$d;", "Lx50/c;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "c", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC37988c {

        /* JADX INFO: renamed from: b */
        public static final d f162701b = new d();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final ScreenState state = ScreenState.ERROR;

        private d() {
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return state;
        }
    }

    /* JADX INFO: renamed from: x50.c$e */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lx50/c$e;", "Lx50/c;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "c", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC37988c {

        /* JADX INFO: renamed from: b */
        public static final e f162703b = new e();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final ScreenState state = ScreenState.LOADING;

        private e() {
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return state;
        }
    }
}
