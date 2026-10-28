package n82;

import com.mapbox.common.MapboxServices;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n82.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ln82/b;", "", "a", "b", "Ln82/b$a;", "Ln82/b$b;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26456b {

    /* JADX INFO: renamed from: n82.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ln82/b$a;", "Ln82/b;", "Ln82/a;", "initialScreenType", "<init>", "(Ln82/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "()Ln82/a;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC26456b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a initialScreenType;

        public a(EnumC26455a initialScreenType) {
            AbstractC22676k.m65750j(initialScreenType, "initialScreenType");
            this.initialScreenType = initialScreenType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getInitialScreenType() {
            return this.initialScreenType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.initialScreenType == ((a) other).initialScreenType;
        }

        public int hashCode() {
            return this.initialScreenType.hashCode();
        }

        public String toString() {
            return "FetchActivities(initialScreenType=" + this.initialScreenType + ")";
        }
    }

    /* JADX INFO: renamed from: n82.b$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ln82/b$b;", "Ln82/b;", "", MapboxServices.SEARCH, "Ln82/a;", "screenType", "<init>", "(Ljava/lang/String;Ln82/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ln82/a;", "()Ln82/a;", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC26456b {

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
            return "Search(search=" + this.search + ", screenType=" + this.screenType + ")";
        }
    }
}
