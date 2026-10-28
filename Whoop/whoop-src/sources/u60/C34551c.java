package u60;

import com.whoop.achievements.domain.models.AchievementsSectionSpacingType;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import gv1.C16234h;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m51.InterfaceC25079a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001c*\u001a\fB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m65681d2 = {"Lu60/c;", "Lfy1/k;", "Lu60/c$a;", "popUpDialog", "Lu60/c$c;", "fullScreenModal", "Lu60/c$d;", "screenContent", "Lgv1/h;", "lottieTesterConfig", "<init>", "(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;)V", "b", "(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;)Lu60/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu60/c$c;", "d", "()Lu60/c$c;", "c", "Lu60/c$d;", "g", "()Lu60/c$d;", "Lgv1/h;", "e", "()Lgv1/h;", "Lu60/c$a;", "f", "()Lu60/c$a;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34551c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C16234h lottieTesterConfig;

    /* JADX INFO: renamed from: u60.c$a */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lu60/c$a;", "", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {
    }

    /* JADX INFO: renamed from: u60.c$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lu60/c$b;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;", "sectionType", "<init>", "(Ljava/util/List;Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;", "()Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AchievementsSectionSpacingType sectionType;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends InterfaceC25312u> itemViewState, AchievementsSectionSpacingType sectionType) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(sectionType, "sectionType");
            this.itemViewState = itemViewState;
            this.sectionType = sectionType;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m109217a() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AchievementsSectionSpacingType getSectionType() {
            return this.sectionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.itemViewState, bVar.itemViewState) && this.sectionType == bVar.sectionType;
        }

        public int hashCode() {
            return this.sectionType.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", sectionType=" + this.sectionType + ")";
        }
    }

    /* JADX INFO: renamed from: u60.c$d */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b\"\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b\u001e\u00105¨\u00066"}, m65681d2 = {"Lu60/c$d;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lu60/c$b;", "items", "", "displayRefreshingAnimation", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "backgroundStyle", "Lm51/a;", "background", "Lgz0/m0;", "navigationIcon", "Lcom/whoop/navigation/e;", "navigationDestination", "", "", "analyticsProperties", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Lgz0/m0;Lcom/whoop/navigation/e;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Z", "d", "()Z", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "()Lcom/whoop/design/models/AchievementsBackgroundStyle;", "Lm51/a;", "()Lm51/a;", "f", "Lgz0/m0;", "g", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/util/Map;", "()Ljava/util/Map;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<b> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AchievementsBackgroundStyle backgroundStyle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25079a background;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC16313m0 navigationIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C9598e navigationDestination;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, String> analyticsProperties;

        public d(TextResource toolbarTitle, List<b> items, boolean z4, AchievementsBackgroundStyle backgroundStyle, InterfaceC25079a interfaceC25079a, EnumC16313m0 enumC16313m0, C9598e c9598e, Map<String, String> analyticsProperties) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
            AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.backgroundStyle = backgroundStyle;
            this.background = interfaceC25079a;
            this.navigationIcon = enumC16313m0;
            this.navigationDestination = c9598e;
            this.analyticsProperties = analyticsProperties;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m109223a() {
            return this.analyticsProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25079a getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AchievementsBackgroundStyle getBackgroundStyle() {
            return this.backgroundStyle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: e */
        public final List<b> m109227e() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && this.backgroundStyle == dVar.backgroundStyle && AbstractC22676k.m65745e(this.background, dVar.background) && this.navigationIcon == dVar.navigationIcon && AbstractC22676k.m65745e(this.navigationDestination, dVar.navigationDestination) && AbstractC22676k.m65745e(this.analyticsProperties, dVar.analyticsProperties);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C9598e getNavigationDestination() {
            return this.navigationDestination;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final EnumC16313m0 getNavigationIcon() {
            return this.navigationIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            int iHashCode = (this.backgroundStyle.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation)) * 31;
            InterfaceC25079a interfaceC25079a = this.background;
            int iHashCode2 = (iHashCode + (interfaceC25079a == null ? 0 : interfaceC25079a.hashCode())) * 31;
            EnumC16313m0 enumC16313m0 = this.navigationIcon;
            int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
            C9598e c9598e = this.navigationDestination;
            return this.analyticsProperties.hashCode() + ((iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<b> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            AchievementsBackgroundStyle achievementsBackgroundStyle = this.backgroundStyle;
            InterfaceC25079a interfaceC25079a = this.background;
            EnumC16313m0 enumC16313m0 = this.navigationIcon;
            C9598e c9598e = this.navigationDestination;
            Map<String, String> map = this.analyticsProperties;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", backgroundStyle=");
            sbM106657p.append(achievementsBackgroundStyle);
            sbM106657p.append(", background=");
            sbM106657p.append(interfaceC25079a);
            sbM106657p.append(", navigationIcon=");
            sbM106657p.append(enumC16313m0);
            sbM106657p.append(", navigationDestination=");
            sbM106657p.append(c9598e);
            sbM106657p.append(", analyticsProperties=");
            sbM106657p.append(map);
            sbM106657p.append(")");
            return sbM106657p.toString();
        }
    }

    public C34551c(a aVar, c cVar, d dVar, C16234h lottieTesterConfig) {
        AbstractC22676k.m65750j(lottieTesterConfig, "lottieTesterConfig");
        this.fullScreenModal = cVar;
        this.screenContent = dVar;
        this.lottieTesterConfig = lottieTesterConfig;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C34551c m109211c(C34551c c34551c, a aVar, c cVar, d dVar, C16234h c16234h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c34551c.getClass();
            aVar = null;
        }
        if ((i13 & 2) != 0) {
            cVar = c34551c.fullScreenModal;
        }
        if ((i13 & 4) != 0) {
            dVar = c34551c.screenContent;
        }
        if ((i13 & 8) != 0) {
            c16234h = c34551c.lottieTesterConfig;
        }
        return c34551c.m109212b(aVar, cVar, dVar, c16234h);
    }

    /* JADX INFO: renamed from: b */
    public final C34551c m109212b(a popUpDialog, c fullScreenModal, d screenContent, C16234h lottieTesterConfig) {
        AbstractC22676k.m65750j(lottieTesterConfig, "lottieTesterConfig");
        return new C34551c(popUpDialog, fullScreenModal, screenContent, lottieTesterConfig);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C16234h getLottieTesterConfig() {
        return this.lottieTesterConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34551c)) {
            return false;
        }
        C34551c c34551c = (C34551c) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c34551c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c34551c.screenContent) && AbstractC22676k.m65745e(this.lottieTesterConfig, c34551c.lottieTesterConfig);
    }

    /* JADX INFO: renamed from: f */
    public final a m109215f() {
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        c cVar = this.fullScreenModal;
        if (cVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = cVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        c cVar = this.fullScreenModal;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        d dVar = this.screenContent;
        return this.lottieTesterConfig.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "AchievementsViewState(popUpDialog=null, fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ", lottieTesterConfig=" + this.lottieTesterConfig + ")";
    }

    /* JADX INFO: renamed from: u60.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lu60/c$c;", "", "Lsz0/q0;", "state", "Lu60/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lu60/a;Lu60/a;Lu60/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lu60/a;", "()Lu60/a;", "c", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: e */
        public static final int f145397e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC34549a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC34549a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC34549a backClickEvent;

        public c(C33211q0 state, InterfaceC34549a interfaceC34549a, InterfaceC34549a interfaceC34549a2, InterfaceC34549a interfaceC34549a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC34549a;
            this.secondaryClickEvent = interfaceC34549a2;
            this.backClickEvent = interfaceC34549a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC34549a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC34549a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC34549a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.state, cVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, cVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC34549a interfaceC34549a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC34549a == null ? 0 : interfaceC34549a.hashCode())) * 31;
            InterfaceC34549a interfaceC34549a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC34549a2 == null ? 0 : interfaceC34549a2.hashCode())) * 31;
            InterfaceC34549a interfaceC34549a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC34549a3 != null ? interfaceC34549a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC34549a interfaceC34549a, InterfaceC34549a interfaceC34549a2, InterfaceC34549a interfaceC34549a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC34549a, (i13 & 4) != 0 ? null : interfaceC34549a2, (i13 & 8) != 0 ? null : interfaceC34549a3);
        }
    }

    public /* synthetic */ C34551c(a aVar, c cVar, d dVar, C16234h c16234h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : dVar, (i13 & 8) != 0 ? new C16234h(false, null, false, 7, null) : c16234h);
    }
}
