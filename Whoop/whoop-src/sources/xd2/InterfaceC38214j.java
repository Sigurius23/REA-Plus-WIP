package xd2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd2.AbstractC22415a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xd2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lxd2/j;", "", "a", "b", "Lxd2/j$a;", "Lxd2/j$b;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38214j {

    /* JADX INFO: renamed from: xd2.j$b */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b \u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b,\u00101R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b2\u0010+¨\u00063"}, m65681d2 = {"Lxd2/j$b;", "Lxd2/j;", "", "icon", "Lcom/whoop/design/util/TextResource;", "pageTitle", "body", "Lxd2/a;", "pageHeader", "Lm91/u;", "settingsCta", "", "detectionOn", "Lxd2/g;", "shepherdHistoryViewState", "Lxd2/b;", "shepherdClearHistoryDialogViewState", "isLoadingMoreHistory", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/a;Lm91/u;ZLxd2/g;Lxd2/b;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Lxd2/a;", "()Lxd2/a;", "Lm91/u;", "f", "()Lm91/u;", "Z", "()Z", "g", "Lxd2/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lxd2/g;", "Lxd2/b;", "()Lxd2/b;", "i", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC38214j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource pageTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C38205a pageHeader;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25312u settingsCta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean detectionOn;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C38211g shepherdHistoryViewState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C38206b shepherdClearHistoryDialogViewState;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isLoadingMoreHistory;

        public b(int i13, TextResource pageTitle, TextResource body, C38205a pageHeader, InterfaceC25312u settingsCta, boolean z4, C38211g shepherdHistoryViewState, C38206b c38206b, boolean z13) {
            AbstractC22676k.m65750j(pageTitle, "pageTitle");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(pageHeader, "pageHeader");
            AbstractC22676k.m65750j(settingsCta, "settingsCta");
            AbstractC22676k.m65750j(shepherdHistoryViewState, "shepherdHistoryViewState");
            this.icon = i13;
            this.pageTitle = pageTitle;
            this.body = body;
            this.pageHeader = pageHeader;
            this.settingsCta = settingsCta;
            this.detectionOn = z4;
            this.shepherdHistoryViewState = shepherdHistoryViewState;
            this.shepherdClearHistoryDialogViewState = c38206b;
            this.isLoadingMoreHistory = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDetectionOn() {
            return this.detectionOn;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C38205a getPageHeader() {
            return this.pageHeader;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getPageTitle() {
            return this.pageTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.icon == bVar.icon && AbstractC22676k.m65745e(this.pageTitle, bVar.pageTitle) && AbstractC22676k.m65745e(this.body, bVar.body) && AbstractC22676k.m65745e(this.pageHeader, bVar.pageHeader) && AbstractC22676k.m65745e(this.settingsCta, bVar.settingsCta) && this.detectionOn == bVar.detectionOn && AbstractC22676k.m65745e(this.shepherdHistoryViewState, bVar.shepherdHistoryViewState) && AbstractC22676k.m65745e(this.shepherdClearHistoryDialogViewState, bVar.shepherdClearHistoryDialogViewState) && this.isLoadingMoreHistory == bVar.isLoadingMoreHistory;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC25312u getSettingsCta() {
            return this.settingsCta;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C38206b getShepherdClearHistoryDialogViewState() {
            return this.shepherdClearHistoryDialogViewState;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C38211g getShepherdHistoryViewState() {
            return this.shepherdHistoryViewState;
        }

        public int hashCode() {
            int iHashCode = (this.shepherdHistoryViewState.hashCode() + AbstractC2875y.m8289b(AbstractC11478a.m30851c(this.settingsCta, (this.pageHeader.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.pageTitle, 31), this.body, 31)) * 31, 31), 31, this.detectionOn)) * 31;
            C38206b c38206b = this.shepherdClearHistoryDialogViewState;
            return Boolean.hashCode(this.isLoadingMoreHistory) + ((iHashCode + (c38206b == null ? 0 : c38206b.hashCode())) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsLoadingMoreHistory() {
            return this.isLoadingMoreHistory;
        }

        public String toString() {
            int i13 = this.icon;
            TextResource textResource = this.pageTitle;
            TextResource textResource2 = this.body;
            C38205a c38205a = this.pageHeader;
            InterfaceC25312u interfaceC25312u = this.settingsCta;
            boolean z4 = this.detectionOn;
            C38211g c38211g = this.shepherdHistoryViewState;
            C38206b c38206b = this.shepherdClearHistoryDialogViewState;
            boolean z13 = this.isLoadingMoreHistory;
            StringBuilder sbM91844n = AbstractC30007c.m91844n("Loaded(icon=", i13, ", pageTitle=", textResource, ", body=");
            sbM91844n.append(textResource2);
            sbM91844n.append(", pageHeader=");
            sbM91844n.append(c38205a);
            sbM91844n.append(", settingsCta=");
            sbM91844n.append(interfaceC25312u);
            sbM91844n.append(", detectionOn=");
            sbM91844n.append(z4);
            sbM91844n.append(", shepherdHistoryViewState=");
            sbM91844n.append(c38211g);
            sbM91844n.append(", shepherdClearHistoryDialogViewState=");
            sbM91844n.append(c38206b);
            sbM91844n.append(", isLoadingMoreHistory=");
            return AbstractC18489d0.m53372m(sbM91844n, z13, ")");
        }
    }

    /* JADX INFO: renamed from: xd2.j$a */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u001bBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b,\u0010(¨\u0006-"}, m65681d2 = {"Lxd2/j$a;", "Lxd2/j;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lxd2/h;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "followUpEvent", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;)V", "e", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/h;Lcom/whoop/design/util/TextResource;Lxd2/h;Lxd2/h;)Lxd2/j$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "m", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "i", "d", "Lxd2/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lxd2/h;", "k", "f", "j", "g", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC38214j {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i */
        public static final int f163765i = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: j */
        private static final a f163766j;

        /* JADX INFO: renamed from: k */
        private static final a f163767k;

        /* JADX INFO: renamed from: l */
        private static final a f163768l;

        /* JADX INFO: renamed from: m */
        private static final a f163769m;

        /* JADX INFO: renamed from: n */
        private static final a f163770n;

        /* JADX INFO: renamed from: o */
        private static final a f163771o;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC38212h primaryButtonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC38212h secondaryButtonClickEvent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC38212h followUpEvent;

        /* JADX INFO: renamed from: xd2.j$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lxd2/j$a$a;", "", "<init>", "()V", "Lxd2/j$a;", "loading", "Lxd2/j$a;", "d", "()Lxd2/j$a;", "deleting", "a", "loadScreenError", "c", "failedToClearHistory", "b", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m122459a() {
                return a.f163767k;
            }

            /* JADX INFO: renamed from: b */
            public final a m122460b() {
                return a.f163771o;
            }

            /* JADX INFO: renamed from: c */
            public final a m122461c() {
                return a.f163769m;
            }

            /* JADX INFO: renamed from: d */
            public final a m122462d() {
                return a.f163766j;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            TextResource textResource = null;
            f163766j = new a(AbstractC33208p0.c.f138471e, null, textResource, null, null, null, null, 126, null);
            InterfaceC38212h interfaceC38212h = null;
            f163767k = new a(AbstractC33208p0.a.f138465e, textResource, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC38212h, 126, null);
            Object[] objArr = 0 == true ? 1 : 0;
            f163768l = new a(new AbstractC33208p0.e(objArr, AbstractC16272a.f61976O4, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC38212h, null, 126, null);
            InterfaceC38212h interfaceC38212h2 = null;
            f163769m = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87693j), false, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0), null, new TextResource.C8688b(AbstractC22415a.f87691h, null, 2, null), InterfaceC38212h.m.f163740a, AbstractC8693b.m21277k(AbstractC22415a.f87692i), InterfaceC38212h.d.f163731a, interfaceC38212h2, 66, null);
            int i13 = 6;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = false;
            AbstractC22403o abstractC22403o = null;
            InterfaceC38212h interfaceC38212h3 = null;
            f163770n = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87689f), z4, abstractC22403o, i13, defaultConstructorMarker), AbstractC8693b.m21277k(AbstractC22415a.f87690g), AbstractC8693b.m21277k(AbstractC22415a.f87691h), null, AbstractC8693b.m21277k(AbstractC22415a.f87692i), interfaceC38212h2, interfaceC38212h3, 104, null);
            f163771o = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC22415a.f87686c), z4, abstractC22403o, i13, defaultConstructorMarker), AbstractC8693b.m21277k(AbstractC22415a.f87690g), AbstractC8693b.m21277k(AbstractC22415a.f87691h), null, AbstractC8693b.m21277k(AbstractC22415a.f87692i), interfaceC38212h3, null, 104, null);
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC38212h interfaceC38212h, TextResource secondaryButtonText, InterfaceC38212h interfaceC38212h2, InterfaceC38212h interfaceC38212h3) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.primaryButtonClickEvent = interfaceC38212h;
            this.secondaryButtonText = secondaryButtonText;
            this.secondaryButtonClickEvent = interfaceC38212h2;
            this.followUpEvent = interfaceC38212h3;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ a m122450f(a aVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC38212h interfaceC38212h, TextResource textResource3, InterfaceC38212h interfaceC38212h2, InterfaceC38212h interfaceC38212h3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = aVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = aVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = aVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC38212h = aVar.primaryButtonClickEvent;
            }
            if ((i13 & 16) != 0) {
                textResource3 = aVar.secondaryButtonText;
            }
            if ((i13 & 32) != 0) {
                interfaceC38212h2 = aVar.secondaryButtonClickEvent;
            }
            if ((i13 & 64) != 0) {
                interfaceC38212h3 = aVar.followUpEvent;
            }
            InterfaceC38212h interfaceC38212h4 = interfaceC38212h2;
            InterfaceC38212h interfaceC38212h5 = interfaceC38212h3;
            TextResource textResource4 = textResource3;
            TextResource textResource5 = textResource2;
            return aVar.m122451e(abstractC33208p0, textResource, textResource5, interfaceC38212h, textResource4, interfaceC38212h4, interfaceC38212h5);
        }

        /* JADX INFO: renamed from: e */
        public final a m122451e(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC38212h primaryButtonClickEvent, TextResource secondaryButtonText, InterfaceC38212h secondaryButtonClickEvent, InterfaceC38212h followUpEvent) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
            return new a(type, supportText, primaryButtonText, primaryButtonClickEvent, secondaryButtonText, secondaryButtonClickEvent, followUpEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, aVar.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, aVar.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, aVar.secondaryButtonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, aVar.followUpEvent);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC38212h getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC38212h getPrimaryButtonClickEvent() {
            return this.primaryButtonClickEvent;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC38212h interfaceC38212h = this.primaryButtonClickEvent;
            int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC38212h == null ? 0 : interfaceC38212h.hashCode())) * 31, this.secondaryButtonText, 31);
            InterfaceC38212h interfaceC38212h2 = this.secondaryButtonClickEvent;
            int iHashCode = (iM95625a2 + (interfaceC38212h2 == null ? 0 : interfaceC38212h2.hashCode())) * 31;
            InterfaceC38212h interfaceC38212h3 = this.followUpEvent;
            return iHashCode + (interfaceC38212h3 != null ? interfaceC38212h3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC38212h getSecondaryButtonClickEvent() {
            return this.secondaryButtonClickEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC38212h interfaceC38212h = this.primaryButtonClickEvent;
            TextResource textResource3 = this.secondaryButtonText;
            InterfaceC38212h interfaceC38212h2 = this.secondaryButtonClickEvent;
            InterfaceC38212h interfaceC38212h3 = this.followUpEvent;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", primaryButtonClickEvent=");
            sbM30862n.append(interfaceC38212h);
            sbM30862n.append(", secondaryButtonText=");
            sbM30862n.append(textResource3);
            sbM30862n.append(", secondaryButtonClickEvent=");
            sbM30862n.append(interfaceC38212h2);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC38212h3);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC38212h interfaceC38212h, TextResource textResource3, InterfaceC38212h interfaceC38212h2, InterfaceC38212h interfaceC38212h3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC38212h, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? null : interfaceC38212h2, (i13 & 64) != 0 ? null : interfaceC38212h3);
        }
    }
}
