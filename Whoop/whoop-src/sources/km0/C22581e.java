package km0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: km0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J¶\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00062\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b/\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00068\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b)\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b0\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010\u001cR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0006¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b:\u0010.R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b3\u0010<¨\u0006="}, m65681d2 = {"Lkm0/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "searchQuery", "searchTitle", "", "categories", "currentCategory", "Lkm0/g;", "groupedToggles", "pagedGroupedToggles", "buttonTitle", "Ly81/e;", "activeColor", "Lkm0/f;", "confirmationModal", "", "performFuzzySearch", "Lkm0/d;", "removedWeeklyPlanBehaviors", "Lm91/u;", "customBehaviorsWidget", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;)Lkm0/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "b", "m", "c", "n", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "g", "f", "i", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ly81/e;", "()Ly81/e;", "Lkm0/f;", "()Lkm0/f;", "k", "Ljava/lang/String;", "l", "Lm91/u;", "()Lm91/u;", "bottomsheet-item-selector_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22581e {

    /* JADX INFO: renamed from: n */
    public static final int f88865n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource searchQuery;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource searchTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<TextResource> categories;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource currentCategory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C22583g> groupedToggles;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<List<C22583g>> pagedGroupedToggles;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC39332e activeColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C22582f confirmationModal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String performFuzzySearch;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C22580d> removedWeeklyPlanBehaviors;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC25312u customBehaviorsWidget;

    /* JADX INFO: renamed from: km0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f88879w = new a();

        /* JADX INFO: renamed from: a */
        public final long m65431a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m65431a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22581e(TextResource title, TextResource searchQuery, TextResource searchTitle, List<? extends TextResource> categories, TextResource currentCategory, List<C22583g> groupedToggles, List<? extends List<C22583g>> pagedGroupedToggles, TextResource buttonTitle, InterfaceC39332e activeColor, C22582f c22582f, String str, List<C22580d> removedWeeklyPlanBehaviors, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(groupedToggles, "groupedToggles");
        AbstractC22676k.m65750j(pagedGroupedToggles, "pagedGroupedToggles");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(activeColor, "activeColor");
        AbstractC22676k.m65750j(removedWeeklyPlanBehaviors, "removedWeeklyPlanBehaviors");
        this.title = title;
        this.searchQuery = searchQuery;
        this.searchTitle = searchTitle;
        this.categories = categories;
        this.currentCategory = currentCategory;
        this.groupedToggles = groupedToggles;
        this.pagedGroupedToggles = pagedGroupedToggles;
        this.buttonTitle = buttonTitle;
        this.activeColor = activeColor;
        this.confirmationModal = c22582f;
        this.performFuzzySearch = str;
        this.removedWeeklyPlanBehaviors = removedWeeklyPlanBehaviors;
        this.customBehaviorsWidget = interfaceC25312u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22581e m65416b(C22581e c22581e, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, TextResource textResource4, List list2, List list3, TextResource textResource5, InterfaceC39332e interfaceC39332e, C22582f c22582f, String str, List list4, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c22581e.title;
        }
        return c22581e.m65417a(textResource, (i13 & 2) != 0 ? c22581e.searchQuery : textResource2, (i13 & 4) != 0 ? c22581e.searchTitle : textResource3, (i13 & 8) != 0 ? c22581e.categories : list, (i13 & 16) != 0 ? c22581e.currentCategory : textResource4, (i13 & 32) != 0 ? c22581e.groupedToggles : list2, (i13 & 64) != 0 ? c22581e.pagedGroupedToggles : list3, (i13 & 128) != 0 ? c22581e.buttonTitle : textResource5, (i13 & 256) != 0 ? c22581e.activeColor : interfaceC39332e, (i13 & 512) != 0 ? c22581e.confirmationModal : c22582f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22581e.performFuzzySearch : str, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22581e.removedWeeklyPlanBehaviors : list4, (i13 & 4096) != 0 ? c22581e.customBehaviorsWidget : interfaceC25312u);
    }

    /* JADX INFO: renamed from: a */
    public final C22581e m65417a(TextResource title, TextResource searchQuery, TextResource searchTitle, List<? extends TextResource> categories, TextResource currentCategory, List<C22583g> groupedToggles, List<? extends List<C22583g>> pagedGroupedToggles, TextResource buttonTitle, InterfaceC39332e activeColor, C22582f confirmationModal, String performFuzzySearch, List<C22580d> removedWeeklyPlanBehaviors, InterfaceC25312u customBehaviorsWidget) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(groupedToggles, "groupedToggles");
        AbstractC22676k.m65750j(pagedGroupedToggles, "pagedGroupedToggles");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(activeColor, "activeColor");
        AbstractC22676k.m65750j(removedWeeklyPlanBehaviors, "removedWeeklyPlanBehaviors");
        return new C22581e(title, searchQuery, searchTitle, categories, currentCategory, groupedToggles, pagedGroupedToggles, buttonTitle, activeColor, confirmationModal, performFuzzySearch, removedWeeklyPlanBehaviors, customBehaviorsWidget);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<TextResource> m65420e() {
        return this.categories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22581e)) {
            return false;
        }
        C22581e c22581e = (C22581e) other;
        return AbstractC22676k.m65745e(this.title, c22581e.title) && AbstractC22676k.m65745e(this.searchQuery, c22581e.searchQuery) && AbstractC22676k.m65745e(this.searchTitle, c22581e.searchTitle) && AbstractC22676k.m65745e(this.categories, c22581e.categories) && AbstractC22676k.m65745e(this.currentCategory, c22581e.currentCategory) && AbstractC22676k.m65745e(this.groupedToggles, c22581e.groupedToggles) && AbstractC22676k.m65745e(this.pagedGroupedToggles, c22581e.pagedGroupedToggles) && AbstractC22676k.m65745e(this.buttonTitle, c22581e.buttonTitle) && AbstractC22676k.m65745e(this.activeColor, c22581e.activeColor) && AbstractC22676k.m65745e(this.confirmationModal, c22581e.confirmationModal) && AbstractC22676k.m65745e(this.performFuzzySearch, c22581e.performFuzzySearch) && AbstractC22676k.m65745e(this.removedWeeklyPlanBehaviors, c22581e.removedWeeklyPlanBehaviors) && AbstractC22676k.m65745e(this.customBehaviorsWidget, c22581e.customBehaviorsWidget);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C22582f getConfirmationModal() {
        return this.confirmationModal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getCurrentCategory() {
        return this.currentCategory;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getCustomBehaviorsWidget() {
        return this.customBehaviorsWidget;
    }

    public int hashCode() {
        int iM106648g = AbstractC33745d.m106648g(this.activeColor, AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.searchQuery, 31), this.searchTitle, 31), 31, this.categories), this.currentCategory, 31), 31, this.groupedToggles), 31, this.pagedGroupedToggles), this.buttonTitle, 31), 31);
        C22582f c22582f = this.confirmationModal;
        int iHashCode = (iM106648g + (c22582f == null ? 0 : c22582f.hashCode())) * 31;
        String str = this.performFuzzySearch;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.removedWeeklyPlanBehaviors);
        InterfaceC25312u interfaceC25312u = this.customBehaviorsWidget;
        return iM31983b + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<C22583g> m65424i() {
        return this.groupedToggles;
    }

    /* JADX INFO: renamed from: j */
    public final List<List<C22583g>> m65425j() {
        return this.pagedGroupedToggles;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPerformFuzzySearch() {
        return this.performFuzzySearch;
    }

    /* JADX INFO: renamed from: l */
    public final List<C22580d> m65427l() {
        return this.removedWeeklyPlanBehaviors;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getSearchTitle() {
        return this.searchTitle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.searchQuery;
        TextResource textResource3 = this.searchTitle;
        List<TextResource> list = this.categories;
        TextResource textResource4 = this.currentCategory;
        List<C22583g> list2 = this.groupedToggles;
        List<List<C22583g>> list3 = this.pagedGroupedToggles;
        TextResource textResource5 = this.buttonTitle;
        InterfaceC39332e interfaceC39332e = this.activeColor;
        C22582f c22582f = this.confirmationModal;
        String str = this.performFuzzySearch;
        List<C22580d> list4 = this.removedWeeklyPlanBehaviors;
        InterfaceC25312u interfaceC25312u = this.customBehaviorsWidget;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BottomSheetSelectorViewState(title=", textResource, ", searchQuery=", textResource2, ", searchTitle=");
        AbstractC21702c.m61143n(textResource3, ", categories=", ", currentCategory=", sbM106658q, list);
        AbstractC21702c.m61143n(textResource4, ", groupedToggles=", ", pagedGroupedToggles=", sbM106658q, list2);
        AbstractC30007c.m91852v(textResource5, ", buttonTitle=", ", activeColor=", sbM106658q, list3);
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", confirmationModal=");
        sbM106658q.append(c22582f);
        sbM106658q.append(", performFuzzySearch=");
        AbstractC36095b.m114694v(str, ", removedWeeklyPlanBehaviors=", ", customBehaviorsWidget=", sbM106658q, list4);
        sbM106658q.append(interfaceC25312u);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C22581e(TextResource textResource, TextResource textResource2, TextResource textResource3, List list, TextResource textResource4, List list2, List list3, TextResource textResource5, InterfaceC39332e interfaceC39332e, C22582f c22582f, String str, List list4, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 64;
        C25271y c25271y = C25271y.f99162w;
        this(textResource, textResource2, textResource3, list, textResource4, list2, i14 != 0 ? c25271y : list3, textResource5, (i13 & 256) != 0 ? p745y81.Function1.m125323a(a.f88879w) : interfaceC39332e, (i13 & 512) != 0 ? null : c22582f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c25271y : list4, (i13 & 4096) != 0 ? null : interfaceC25312u);
    }
}
