package ge1;

import c41.C4103r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ge1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lge1/d;", "", "f", "e", "d", "b", "c", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "Lge1/d$a;", "Lge1/d$b;", "Lge1/d$c;", "Lge1/d$d;", "Lge1/d$e;", "Lge1/d$f;", "Lge1/d$g;", "Lge1/d$h;", "Lge1/d$i;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC15735d {

    /* JADX INFO: renamed from: ge1.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lge1/d$a;", "Lge1/d;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC15735d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtitle;

        public a(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("DeleteError(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    /* JADX INFO: renamed from: ge1.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$b;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final b f59314a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: ge1.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$c;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final c f59315a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: ge1.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$d;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final d f59316a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: ge1.d$e */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lge1/d$e;", "Lge1/d;", "", "Lc41/r;", "activities", "Lm91/u;", "footerState", "gpsInfoCalloutState", "maxDurationInfoCalloutState", "maxSelectionInfoCalloutState", "", "showDeleteConfirmation", "<init>", "(Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lm91/u;", "()Lm91/u;", "c", "d", "e", "f", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC15735d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C4103r> activities;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u footerState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25312u gpsInfoCalloutState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC25312u maxDurationInfoCalloutState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC25312u maxSelectionInfoCalloutState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean showDeleteConfirmation;

        public e(List<C4103r> activities, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, InterfaceC25312u interfaceC25312u4, boolean z4) {
            AbstractC22676k.m65750j(activities, "activities");
            this.activities = activities;
            this.footerState = interfaceC25312u;
            this.gpsInfoCalloutState = interfaceC25312u2;
            this.maxDurationInfoCalloutState = interfaceC25312u3;
            this.maxSelectionInfoCalloutState = interfaceC25312u4;
            this.showDeleteConfirmation = z4;
        }

        /* JADX INFO: renamed from: a */
        public final List<C4103r> m44361a() {
            return this.activities;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25312u getFooterState() {
            return this.footerState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC25312u getGpsInfoCalloutState() {
            return this.gpsInfoCalloutState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC25312u getMaxDurationInfoCalloutState() {
            return this.maxDurationInfoCalloutState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC25312u getMaxSelectionInfoCalloutState() {
            return this.maxSelectionInfoCalloutState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.activities, eVar.activities) && AbstractC22676k.m65745e(this.footerState, eVar.footerState) && AbstractC22676k.m65745e(this.gpsInfoCalloutState, eVar.gpsInfoCalloutState) && AbstractC22676k.m65745e(this.maxDurationInfoCalloutState, eVar.maxDurationInfoCalloutState) && AbstractC22676k.m65745e(this.maxSelectionInfoCalloutState, eVar.maxSelectionInfoCalloutState) && this.showDeleteConfirmation == eVar.showDeleteConfirmation;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowDeleteConfirmation() {
            return this.showDeleteConfirmation;
        }

        public int hashCode() {
            int iHashCode = this.activities.hashCode() * 31;
            InterfaceC25312u interfaceC25312u = this.footerState;
            int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u2 = this.gpsInfoCalloutState;
            int iHashCode3 = (iHashCode2 + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u3 = this.maxDurationInfoCalloutState;
            int iHashCode4 = (iHashCode3 + (interfaceC25312u3 == null ? 0 : interfaceC25312u3.hashCode())) * 31;
            InterfaceC25312u interfaceC25312u4 = this.maxSelectionInfoCalloutState;
            return Boolean.hashCode(this.showDeleteConfirmation) + ((iHashCode4 + (interfaceC25312u4 != null ? interfaceC25312u4.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Loaded(activities=" + this.activities + ", footerState=" + this.footerState + ", gpsInfoCalloutState=" + this.gpsInfoCalloutState + ", maxDurationInfoCalloutState=" + this.maxDurationInfoCalloutState + ", maxSelectionInfoCalloutState=" + this.maxSelectionInfoCalloutState + ", showDeleteConfirmation=" + this.showDeleteConfirmation + ")";
        }
    }

    /* JADX INFO: renamed from: ge1.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$f;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final f f59323a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: ge1.d$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lge1/d$g;", "Lge1/d;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC15735d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtitle;

        public g(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.title, gVar.title) && AbstractC22676k.m65745e(this.subtitle, gVar.subtitle);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("MergeError(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    /* JADX INFO: renamed from: ge1.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$h;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final h f59326a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: ge1.d$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lge1/d$i;", "Lge1/d;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC15735d {

        /* JADX INFO: renamed from: a */
        public static final i f59327a = new i();

        private i() {
        }
    }
}
