package od1;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import n82.EnumC26455a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: od1.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lod1/i;", "", "a", "b", "Lod1/i$a;", "Lod1/i$b;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27846i {

    /* JADX INFO: renamed from: od1.i$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lod1/i$b;", "Lod1/i;", "", "searchQuery", "Ln82/a;", "screenType", "", "Lod1/a;", "mostRecentList", "<init>", "(Ljava/lang/String;Ln82/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ln82/a;", "()Ln82/a;", "c", "Ljava/util/List;", "getMostRecentList", "()Ljava/util/List;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27846i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC26455a screenType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C27836a> mostRecentList;

        public b(String searchQuery, EnumC26455a enumC26455a, List<C27836a> mostRecentList) {
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
            this.searchQuery = searchQuery;
            this.screenType = enumC26455a;
            this.mostRecentList = mostRecentList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getScreenType() {
            return this.screenType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.searchQuery, bVar.searchQuery) && this.screenType == bVar.screenType && AbstractC22676k.m65745e(this.mostRecentList, bVar.mostRecentList);
        }

        public int hashCode() {
            int iHashCode = this.searchQuery.hashCode() * 31;
            EnumC26455a enumC26455a = this.screenType;
            return this.mostRecentList.hashCode() + ((iHashCode + (enumC26455a == null ? 0 : enumC26455a.hashCode())) * 31);
        }

        public String toString() {
            String str = this.searchQuery;
            EnumC26455a enumC26455a = this.screenType;
            List<C27836a> list = this.mostRecentList;
            StringBuilder sb4 = new StringBuilder("Search(searchQuery=");
            sb4.append(str);
            sb4.append(", screenType=");
            sb4.append(enumC26455a);
            sb4.append(", mostRecentList=");
            return AbstractC3855a.m11829m(sb4, list, ")");
        }

        public /* synthetic */ b(String str, EnumC26455a enumC26455a, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 4) != 0 ? C25271y.f99162w : list);
        }
    }

    /* JADX INFO: renamed from: od1.i$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lod1/i$a;", "Lod1/i;", "", "Lod1/a;", "allList", "mostRecentList", "Ln82/a;", "pageType", "selectedScreenType", "<init>", "(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Ln82/a;", "()Ln82/a;", "d", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC27846i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C27836a> allList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C27836a> mostRecentList;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC26455a selectedScreenType;

        public a(List<C27836a> allList, List<C27836a> mostRecentList, EnumC26455a enumC26455a, EnumC26455a enumC26455a2) {
            AbstractC22676k.m65750j(allList, "allList");
            AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
            this.allList = allList;
            this.mostRecentList = mostRecentList;
            this.pageType = enumC26455a;
            this.selectedScreenType = enumC26455a2;
        }

        /* JADX INFO: renamed from: a */
        public final List<C27836a> m83946a() {
            return this.allList;
        }

        /* JADX INFO: renamed from: b */
        public final List<C27836a> m83947b() {
            return this.mostRecentList;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC26455a getPageType() {
            return this.pageType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC26455a getSelectedScreenType() {
            return this.selectedScreenType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.allList, aVar.allList) && AbstractC22676k.m65745e(this.mostRecentList, aVar.mostRecentList) && this.pageType == aVar.pageType && this.selectedScreenType == aVar.selectedScreenType;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.allList.hashCode() * 31, 31, this.mostRecentList);
            EnumC26455a enumC26455a = this.pageType;
            int iHashCode = (iM31983b + (enumC26455a == null ? 0 : enumC26455a.hashCode())) * 31;
            EnumC26455a enumC26455a2 = this.selectedScreenType;
            return iHashCode + (enumC26455a2 != null ? enumC26455a2.hashCode() : 0);
        }

        public String toString() {
            List<C27836a> list = this.allList;
            List<C27836a> list2 = this.mostRecentList;
            EnumC26455a enumC26455a = this.pageType;
            EnumC26455a enumC26455a2 = this.selectedScreenType;
            StringBuilder sbM124380j = AbstractC38963t7.m124380j("InitialFetch(allList=", ", mostRecentList=", list, ", pageType=", list2);
            sbM124380j.append(enumC26455a);
            sbM124380j.append(", selectedScreenType=");
            sbM124380j.append(enumC26455a2);
            sbM124380j.append(")");
            return sbM124380j.toString();
        }

        public /* synthetic */ a(List list, List list2, EnumC26455a enumC26455a, EnumC26455a enumC26455a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, (i13 & 4) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 8) != 0 ? EnumC26455a.ALL : enumC26455a2);
        }
    }
}
