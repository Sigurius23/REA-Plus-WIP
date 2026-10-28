package sw0;

import com.whoop.design.models.DesignSystemModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sw0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J¦\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b$\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b/\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b)\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b-\u00103¨\u00064"}, m65681d2 = {"Lsw0/g;", "", "", "title", "searchQuery", "searchTitle", "", "categories", "currentCategory", "Lsw0/i;", "groupedToggles", "buttonTitle", "lastSelectedToggleIds", "", "fuzzySearchResult", "Lsw0/b;", "confirmationModal", "Lcom/whoop/design/models/DesignSystemModel;", "customBehaviorsEmptyState", "customBehaviorsWidget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lsw0/g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "n", "b", "l", "c", "m", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "f", "j", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "i", "Lsw0/b;", "()Lsw0/b;", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33050g {

    /* JADX INFO: renamed from: m */
    public static final int f137810m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String searchQuery;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String searchTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> categories;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String currentCategory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C33052i> groupedToggles;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String buttonTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<String> lastSelectedToggleIds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<Integer> fuzzySearchResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C33045b confirmationModal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final DesignSystemModel customBehaviorsEmptyState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final DesignSystemModel customBehaviorsWidget;

    public C33050g(String title, String searchQuery, String searchTitle, List<String> categories, String currentCategory, List<C33052i> groupedToggles, String buttonTitle, List<String> lastSelectedToggleIds, List<Integer> fuzzySearchResult, C33045b c33045b, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(groupedToggles, "groupedToggles");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(lastSelectedToggleIds, "lastSelectedToggleIds");
        AbstractC22676k.m65750j(fuzzySearchResult, "fuzzySearchResult");
        this.title = title;
        this.searchQuery = searchQuery;
        this.searchTitle = searchTitle;
        this.categories = categories;
        this.currentCategory = currentCategory;
        this.groupedToggles = groupedToggles;
        this.buttonTitle = buttonTitle;
        this.lastSelectedToggleIds = lastSelectedToggleIds;
        this.fuzzySearchResult = fuzzySearchResult;
        this.confirmationModal = c33045b;
        this.customBehaviorsEmptyState = designSystemModel;
        this.customBehaviorsWidget = designSystemModel2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33050g m104626b(C33050g c33050g, String str, String str2, String str3, List list, String str4, List list2, String str5, List list3, List list4, C33045b c33045b, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c33050g.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c33050g.searchQuery;
        }
        if ((i13 & 4) != 0) {
            str3 = c33050g.searchTitle;
        }
        if ((i13 & 8) != 0) {
            list = c33050g.categories;
        }
        if ((i13 & 16) != 0) {
            str4 = c33050g.currentCategory;
        }
        if ((i13 & 32) != 0) {
            list2 = c33050g.groupedToggles;
        }
        if ((i13 & 64) != 0) {
            str5 = c33050g.buttonTitle;
        }
        if ((i13 & 128) != 0) {
            list3 = c33050g.lastSelectedToggleIds;
        }
        if ((i13 & 256) != 0) {
            list4 = c33050g.fuzzySearchResult;
        }
        if ((i13 & 512) != 0) {
            c33045b = c33050g.confirmationModal;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            designSystemModel = c33050g.customBehaviorsEmptyState;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            designSystemModel2 = c33050g.customBehaviorsWidget;
        }
        DesignSystemModel designSystemModel3 = designSystemModel;
        DesignSystemModel designSystemModel4 = designSystemModel2;
        List list5 = list4;
        C33045b c33045b2 = c33045b;
        String str6 = str5;
        List list6 = list3;
        String str7 = str4;
        List list7 = list2;
        return c33050g.m104627a(str, str2, str3, list, str7, list7, str6, list6, list5, c33045b2, designSystemModel3, designSystemModel4);
    }

    /* JADX INFO: renamed from: a */
    public final C33050g m104627a(String title, String searchQuery, String searchTitle, List<String> categories, String currentCategory, List<C33052i> groupedToggles, String buttonTitle, List<String> lastSelectedToggleIds, List<Integer> fuzzySearchResult, C33045b confirmationModal, DesignSystemModel customBehaviorsEmptyState, DesignSystemModel customBehaviorsWidget) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(searchTitle, "searchTitle");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(currentCategory, "currentCategory");
        AbstractC22676k.m65750j(groupedToggles, "groupedToggles");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(lastSelectedToggleIds, "lastSelectedToggleIds");
        AbstractC22676k.m65750j(fuzzySearchResult, "fuzzySearchResult");
        return new C33050g(title, searchQuery, searchTitle, categories, currentCategory, groupedToggles, buttonTitle, lastSelectedToggleIds, fuzzySearchResult, confirmationModal, customBehaviorsEmptyState, customBehaviorsWidget);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m104629d() {
        return this.categories;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C33045b getConfirmationModal() {
        return this.confirmationModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33050g)) {
            return false;
        }
        C33050g c33050g = (C33050g) other;
        return AbstractC22676k.m65745e(this.title, c33050g.title) && AbstractC22676k.m65745e(this.searchQuery, c33050g.searchQuery) && AbstractC22676k.m65745e(this.searchTitle, c33050g.searchTitle) && AbstractC22676k.m65745e(this.categories, c33050g.categories) && AbstractC22676k.m65745e(this.currentCategory, c33050g.currentCategory) && AbstractC22676k.m65745e(this.groupedToggles, c33050g.groupedToggles) && AbstractC22676k.m65745e(this.buttonTitle, c33050g.buttonTitle) && AbstractC22676k.m65745e(this.lastSelectedToggleIds, c33050g.lastSelectedToggleIds) && AbstractC22676k.m65745e(this.fuzzySearchResult, c33050g.fuzzySearchResult) && AbstractC22676k.m65745e(this.confirmationModal, c33050g.confirmationModal) && AbstractC22676k.m65745e(this.customBehaviorsEmptyState, c33050g.customBehaviorsEmptyState) && AbstractC22676k.m65745e(this.customBehaviorsWidget, c33050g.customBehaviorsWidget);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrentCategory() {
        return this.currentCategory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DesignSystemModel getCustomBehaviorsEmptyState() {
        return this.customBehaviorsEmptyState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DesignSystemModel getCustomBehaviorsWidget() {
        return this.customBehaviorsWidget;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.searchQuery), 31, this.searchTitle), 31, this.categories), 31, this.currentCategory), 31, this.groupedToggles), 31, this.buttonTitle), 31, this.lastSelectedToggleIds), 31, this.fuzzySearchResult);
        C33045b c33045b = this.confirmationModal;
        int iHashCode = (iM31983b + (c33045b == null ? 0 : c33045b.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.customBehaviorsEmptyState;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.customBehaviorsWidget;
        return iHashCode2 + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<Integer> m104634i() {
        return this.fuzzySearchResult;
    }

    /* JADX INFO: renamed from: j */
    public final List<C33052i> m104635j() {
        return this.groupedToggles;
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m104636k() {
        return this.lastSelectedToggleIds;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSearchTitle() {
        return this.searchTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.searchQuery;
        String str3 = this.searchTitle;
        List<String> list = this.categories;
        String str4 = this.currentCategory;
        List<C33052i> list2 = this.groupedToggles;
        String str5 = this.buttonTitle;
        List<String> list3 = this.lastSelectedToggleIds;
        List<Integer> list4 = this.fuzzySearchResult;
        C33045b c33045b = this.confirmationModal;
        DesignSystemModel designSystemModel = this.customBehaviorsEmptyState;
        DesignSystemModel designSystemModel2 = this.customBehaviorsWidget;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomizeBottomSheetDomainState(title=", str, ", searchQuery=", str2, ", searchTitle=");
        AbstractC36095b.m114694v(str3, ", categories=", ", currentCategory=", sbM32001t, list);
        AbstractC36095b.m114694v(str4, ", groupedToggles=", ", buttonTitle=", sbM32001t, list2);
        AbstractC36095b.m114694v(str5, ", lastSelectedToggleIds=", ", fuzzySearchResult=", sbM32001t, list3);
        sbM32001t.append(list4);
        sbM32001t.append(", confirmationModal=");
        sbM32001t.append(c33045b);
        sbM32001t.append(", customBehaviorsEmptyState=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", customBehaviorsWidget=");
        sbM32001t.append(designSystemModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C33050g(String str, String str2, String str3, List list, String str4, List list2, String str5, List list3, List list4, C33045b c33045b, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        str2 = (i13 & 2) != 0 ? "" : str2;
        String str6 = (i13 & 4) != 0 ? "" : str3;
        int i14 = i13 & 8;
        List list5 = C25271y.f99162w;
        this(str, str2, str6, i14 != 0 ? list5 : list, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? list5 : list2, (i13 & 64) == 0 ? str5 : "", (i13 & 128) != 0 ? list5 : list3, (i13 & 256) == 0 ? list4 : list5, (i13 & 512) != 0 ? null : c33045b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : designSystemModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : designSystemModel2);
    }
}
