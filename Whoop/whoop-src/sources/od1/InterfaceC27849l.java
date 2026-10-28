package od1;

import com.mapbox.common.MapboxServices;
import n82.EnumC26455a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: od1.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lod1/l;", "", "a", "b", "Lod1/l$a;", "Lod1/l$b;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27849l {

    /* JADX INFO: renamed from: od1.l$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lod1/l$b;", "Lod1/l;", "", MapboxServices.SEARCH, "Ln82/a;", "screenType", "<init>", "(Ljava/lang/String;Ln82/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ln82/a;", "()Ln82/a;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27849l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String search;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC26455a screenType;

        public b(String search, EnumC26455a screenType) {
            AbstractC22676k.m65750j(search, "search");
            AbstractC22676k.m65750j(screenType, "screenType");
            this.search = search;
            this.screenType = screenType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getScreenType() {
            return this.screenType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSearch() {
            return this.search;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.search, bVar.search) && this.screenType == bVar.screenType;
        }

        public int hashCode() {
            return this.screenType.hashCode() + (this.search.hashCode() * 31);
        }

        public String toString() {
            return "PerformSearch(search=" + this.search + ", screenType=" + this.screenType + ")";
        }
    }

    /* JADX INFO: renamed from: od1.l$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lod1/l$a;", "Lod1/l;", "Ln82/a;", "pageType", "", "isStartActivityRevamp", "<init>", "(Ln82/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "()Ln82/a;", "b", "Z", "()Z", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC27849l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isStartActivityRevamp;

        public a(EnumC26455a pageType, boolean z4) {
            AbstractC22676k.m65750j(pageType, "pageType");
            this.pageType = pageType;
            this.isStartActivityRevamp = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getPageType() {
            return this.pageType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsStartActivityRevamp() {
            return this.isStartActivityRevamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.pageType == aVar.pageType && this.isStartActivityRevamp == aVar.isStartActivityRevamp;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStartActivityRevamp) + (this.pageType.hashCode() * 31);
        }

        public String toString() {
            return "FetchActivities(pageType=" + this.pageType + ", isStartActivityRevamp=" + this.isStartActivityRevamp + ")";
        }

        public /* synthetic */ a(EnumC26455a enumC26455a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC26455a, (i13 & 2) != 0 ? false : z4);
        }
    }
}
