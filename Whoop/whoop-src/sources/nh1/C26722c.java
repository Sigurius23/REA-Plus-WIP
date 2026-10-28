package nh1;

import com.whoop.design.util.TextResource;
import com.whoop.gifting.feature.gifting.domain.models.GiftingSectionSpacingType;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import r51.C30938f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nh1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0015\u0017\u001b\"#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m65681d2 = {"Lnh1/c;", "Lfy1/k;", "Lnh1/c$c;", "popUpDialog", "Lnh1/c$b;", "fullScreenModal", "Lnh1/c$d;", "screenContent", "<init>", "(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lnh1/c$c;", "c", "()Lnh1/c$c;", "Lnh1/c$b;", "()Lnh1/c$b;", "d", "Lnh1/c$d;", "()Lnh1/c$d;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "e", "a", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26722c implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c popUpDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final b fullScreenModal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: nh1.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lnh1/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;", "sectionType", "<init>", "(Ljava/util/List;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;", "()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GiftingSectionSpacingType sectionType;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, GiftingSectionSpacingType sectionType) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(sectionType, "sectionType");
            this.itemViewState = itemViewState;
            this.sectionType = sectionType;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m79474a() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GiftingSectionSpacingType getSectionType() {
            return this.sectionType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.sectionType == aVar.sectionType;
        }

        public int hashCode() {
            return this.sectionType.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "ComponentItem(itemViewState=" + this.itemViewState + ", sectionType=" + this.sectionType + ")";
        }
    }

    /* JADX INFO: renamed from: nh1.c$c */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lnh1/c$c;", "", "", "hashCode", "()I", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {
        public abstract int hashCode();
    }

    /* JADX INFO: renamed from: nh1.c$d */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b \u0010/R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00118\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b\u001c\u00101¨\u00062"}, m65681d2 = {"Lnh1/c$d;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "Lnh1/c$a;", "items", "", "displayRefreshingAnimation", "Lnh1/c$e;", "sticky", "", "selectedSegmentId", "", "selectedQuantity", "Lr51/f;", "countrySelector", "", "analyticsProperties", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLnh1/c$e;Ljava/lang/String;ILr51/f;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "()Z", "Lnh1/c$e;", "g", "()Lnh1/c$e;", "e", "Ljava/lang/String;", "f", "I", "Lr51/f;", "()Lr51/f;", "Ljava/util/Map;", "()Ljava/util/Map;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean displayRefreshingAnimation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final e sticky;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final int selectedQuantity;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C30938f countrySelector;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, String> analyticsProperties;

        public d(TextResource toolbarTitle, List<a> items, boolean z4, e eVar, String selectedSegmentId, int i13, C30938f c30938f, Map<String, String> analyticsProperties) {
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
            this.toolbarTitle = toolbarTitle;
            this.items = items;
            this.displayRefreshingAnimation = z4;
            this.sticky = eVar;
            this.selectedSegmentId = selectedSegmentId;
            this.selectedQuantity = i13;
            this.countrySelector = c30938f;
            this.analyticsProperties = analyticsProperties;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m79480a() {
            return this.analyticsProperties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C30938f getCountrySelector() {
            return this.countrySelector;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getDisplayRefreshingAnimation() {
            return this.displayRefreshingAnimation;
        }

        /* JADX INFO: renamed from: d */
        public final List<a> m79483d() {
            return this.items;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getSelectedQuantity() {
            return this.selectedQuantity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.toolbarTitle, dVar.toolbarTitle) && AbstractC22676k.m65745e(this.items, dVar.items) && this.displayRefreshingAnimation == dVar.displayRefreshingAnimation && AbstractC22676k.m65745e(this.sticky, dVar.sticky) && AbstractC22676k.m65745e(this.selectedSegmentId, dVar.selectedSegmentId) && this.selectedQuantity == dVar.selectedQuantity && AbstractC22676k.m65745e(this.countrySelector, dVar.countrySelector) && AbstractC22676k.m65745e(this.analyticsProperties, dVar.analyticsProperties);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final e getSticky() {
            return this.sticky;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.toolbarTitle.hashCode() * 31, 31, this.items), 31, this.displayRefreshingAnimation);
            e eVar = this.sticky;
            int iM30448b = AbstractC11266d.m30448b(this.selectedQuantity, AbstractC11266d.m30450d((iM8289b + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.selectedSegmentId), 31);
            C30938f c30938f = this.countrySelector;
            return this.analyticsProperties.hashCode() + ((iM30448b + (c30938f != null ? c30938f.hashCode() : 0)) * 31);
        }

        public String toString() {
            TextResource textResource = this.toolbarTitle;
            List<a> list = this.items;
            boolean z4 = this.displayRefreshingAnimation;
            e eVar = this.sticky;
            String str = this.selectedSegmentId;
            int i13 = this.selectedQuantity;
            C30938f c30938f = this.countrySelector;
            Map<String, String> map = this.analyticsProperties;
            StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ScreenContent(toolbarTitle=", ", items=", ", displayRefreshingAnimation=", list);
            sbM106657p.append(z4);
            sbM106657p.append(", sticky=");
            sbM106657p.append(eVar);
            sbM106657p.append(", selectedSegmentId=");
            AbstractC11266d.m30470x(i13, str, ", selectedQuantity=", ", countrySelector=", sbM106657p);
            sbM106657p.append(c30938f);
            sbM106657p.append(", analyticsProperties=");
            sbM106657p.append(map);
            sbM106657p.append(")");
            return sbM106657p.toString();
        }
    }

    /* JADX INFO: renamed from: nh1.c$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lnh1/c$e;", "", "", "text", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends InterfaceC25312u> items) {
            AbstractC22676k.m65750j(items, "items");
            this.text = str;
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC25312u> m79488a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.text, eVar.text) && AbstractC22676k.m65745e(this.items, eVar.items);
        }

        public int hashCode() {
            String str = this.text;
            return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("StickyArea(text=", this.text, ", items=", ")", this.items);
        }
    }

    public C26722c(c cVar, b bVar, d dVar) {
        this.popUpDialog = cVar;
        this.fullScreenModal = bVar;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getPopUpDialog() {
        return this.popUpDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26722c)) {
            return false;
        }
        C26722c c26722c = (C26722c) other;
        return AbstractC22676k.m65745e(this.popUpDialog, c26722c.popUpDialog) && AbstractC22676k.m65745e(this.fullScreenModal, c26722c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c26722c.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        b bVar = this.fullScreenModal;
        if (bVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = bVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        int i13 = 0 * 31;
        b bVar = this.fullScreenModal;
        int iHashCode = (i13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "GiftingViewState(popUpDialog=" + this.popUpDialog + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: nh1.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lnh1/c$b;", "", "Lsz0/q0;", "state", "Lnh1/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lnh1/a;", "()Lnh1/a;", "c", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: e */
        public static final int f106300e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC26720a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC26720a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC26720a backClickEvent;

        public b(C33211q0 state, InterfaceC26720a interfaceC26720a, InterfaceC26720a interfaceC26720a2, InterfaceC26720a interfaceC26720a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC26720a;
            this.secondaryClickEvent = interfaceC26720a2;
            this.backClickEvent = interfaceC26720a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26720a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC26720a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC26720a getSecondaryClickEvent() {
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
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.state, bVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, bVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, bVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, bVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC26720a interfaceC26720a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC26720a == null ? 0 : interfaceC26720a.hashCode())) * 31;
            InterfaceC26720a interfaceC26720a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC26720a2 == null ? 0 : interfaceC26720a2.hashCode())) * 31;
            InterfaceC26720a interfaceC26720a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC26720a3 != null ? interfaceC26720a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ b(C33211q0 c33211q0, InterfaceC26720a interfaceC26720a, InterfaceC26720a interfaceC26720a2, InterfaceC26720a interfaceC26720a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC26720a, (i13 & 4) != 0 ? null : interfaceC26720a2, (i13 & 8) != 0 ? null : interfaceC26720a3);
        }
    }

    public /* synthetic */ C26722c(c cVar, b bVar, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cVar, (i13 & 2) != 0 ? null : bVar, (i13 & 4) != 0 ? null : dVar);
    }
}
