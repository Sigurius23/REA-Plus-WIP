package od1;

import com.mapbox.common.MapboxServices;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import n82.EnumC26455a;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: od1.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ^\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, m65681d2 = {"Lod1/m;", "", "", MapboxServices.SEARCH, "", "Lod1/a;", "allActivitiesSearchList", "allActivitiesListModel", "mostRecentListModel", "Ln82/a;", "pageType", "selectedScreenType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)Lod1/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "e", "Ln82/a;", "f", "()Ln82/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27850m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String search;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27836a> allActivitiesSearchList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C27836a> allActivitiesListModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C27836a> mostRecentListModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC26455a pageType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC26455a selectedScreenType;

    public C27850m(String search, List<C27836a> allActivitiesSearchList, List<C27836a> allActivitiesListModel, List<C27836a> mostRecentListModel, EnumC26455a pageType, EnumC26455a selectedScreenType) {
        AbstractC22676k.m65750j(search, "search");
        AbstractC22676k.m65750j(allActivitiesSearchList, "allActivitiesSearchList");
        AbstractC22676k.m65750j(allActivitiesListModel, "allActivitiesListModel");
        AbstractC22676k.m65750j(mostRecentListModel, "mostRecentListModel");
        AbstractC22676k.m65750j(pageType, "pageType");
        AbstractC22676k.m65750j(selectedScreenType, "selectedScreenType");
        this.search = search;
        this.allActivitiesSearchList = allActivitiesSearchList;
        this.allActivitiesListModel = allActivitiesListModel;
        this.mostRecentListModel = mostRecentListModel;
        this.pageType = pageType;
        this.selectedScreenType = selectedScreenType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27850m m83967b(C27850m c27850m, String str, List list, List list2, List list3, EnumC26455a enumC26455a, EnumC26455a enumC26455a2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c27850m.search;
        }
        if ((i13 & 2) != 0) {
            list = c27850m.allActivitiesSearchList;
        }
        if ((i13 & 4) != 0) {
            list2 = c27850m.allActivitiesListModel;
        }
        if ((i13 & 8) != 0) {
            list3 = c27850m.mostRecentListModel;
        }
        if ((i13 & 16) != 0) {
            enumC26455a = c27850m.pageType;
        }
        if ((i13 & 32) != 0) {
            enumC26455a2 = c27850m.selectedScreenType;
        }
        EnumC26455a enumC26455a3 = enumC26455a;
        EnumC26455a enumC26455a4 = enumC26455a2;
        return c27850m.m83968a(str, list, list2, list3, enumC26455a3, enumC26455a4);
    }

    /* JADX INFO: renamed from: a */
    public final C27850m m83968a(String search, List<C27836a> allActivitiesSearchList, List<C27836a> allActivitiesListModel, List<C27836a> mostRecentListModel, EnumC26455a pageType, EnumC26455a selectedScreenType) {
        AbstractC22676k.m65750j(search, "search");
        AbstractC22676k.m65750j(allActivitiesSearchList, "allActivitiesSearchList");
        AbstractC22676k.m65750j(allActivitiesListModel, "allActivitiesListModel");
        AbstractC22676k.m65750j(mostRecentListModel, "mostRecentListModel");
        AbstractC22676k.m65750j(pageType, "pageType");
        AbstractC22676k.m65750j(selectedScreenType, "selectedScreenType");
        return new C27850m(search, allActivitiesSearchList, allActivitiesListModel, mostRecentListModel, pageType, selectedScreenType);
    }

    /* JADX INFO: renamed from: c */
    public final List<C27836a> m83969c() {
        return this.allActivitiesListModel;
    }

    /* JADX INFO: renamed from: d */
    public final List<C27836a> m83970d() {
        return this.allActivitiesSearchList;
    }

    /* JADX INFO: renamed from: e */
    public final List<C27836a> m83971e() {
        return this.mostRecentListModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27850m)) {
            return false;
        }
        C27850m c27850m = (C27850m) other;
        return AbstractC22676k.m65745e(this.search, c27850m.search) && AbstractC22676k.m65745e(this.allActivitiesSearchList, c27850m.allActivitiesSearchList) && AbstractC22676k.m65745e(this.allActivitiesListModel, c27850m.allActivitiesListModel) && AbstractC22676k.m65745e(this.mostRecentListModel, c27850m.mostRecentListModel) && this.pageType == c27850m.pageType && this.selectedScreenType == c27850m.selectedScreenType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC26455a getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSearch() {
        return this.search;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC26455a getSelectedScreenType() {
        return this.selectedScreenType;
    }

    public int hashCode() {
        return this.selectedScreenType.hashCode() + ((this.pageType.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.search.hashCode() * 31, 31, this.allActivitiesSearchList), 31, this.allActivitiesListModel), 31, this.mostRecentListModel)) * 31);
    }

    public String toString() {
        String str = this.search;
        List<C27836a> list = this.allActivitiesSearchList;
        List<C27836a> list2 = this.allActivitiesListModel;
        List<C27836a> list3 = this.mostRecentListModel;
        EnumC26455a enumC26455a = this.pageType;
        EnumC26455a enumC26455a2 = this.selectedScreenType;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SelectActivityTypeDomainState(search=", str, ", allActivitiesSearchList=", ", allActivitiesListModel=", list);
        AbstractC21702c.m61148s(sbM94766o, list2, ", mostRecentListModel=", list3, ", pageType=");
        sbM94766o.append(enumC26455a);
        sbM94766o.append(", selectedScreenType=");
        sbM94766o.append(enumC26455a2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C27850m(String str, List list, List list2, List list3, EnumC26455a enumC26455a, EnumC26455a enumC26455a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? c25271y : list3, (i13 & 16) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 32) != 0 ? EnumC26455a.ALL : enumC26455a2);
    }
}
