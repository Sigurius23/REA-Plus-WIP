package dw0;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import hw0.EnumC17696a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mc1.EnumC25417b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: dw0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%À\u0006\u0003"}, m65681d2 = {"Ldw0/b;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "s", "p", "j", "k", "r", "d", "m", "a", "f", "g", "q", "c", "n", "b", "e", "o", "l", "i", "Ldw0/b$a;", "Ldw0/b$b;", "Ldw0/b$c;", "Ldw0/b$d;", "Ldw0/b$e;", "Ldw0/b$f;", "Ldw0/b$g;", "Ldw0/b$h;", "Ldw0/b$j;", "Ldw0/b$k;", "Ldw0/b$m;", "Ldw0/b$n;", "Ldw0/b$p;", "Ldw0/b$q;", "Ldw0/b$r;", "Ldw0/b$s;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12403b {

    /* JADX INFO: renamed from: dw0.b$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldw0/b$a;", "Ldw0/b;", "", "isDropDownSelected", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDropDownSelected;

        public a(boolean z4) {
            this.isDropDownSelected = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDropDownSelected() {
            return this.isDropDownSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isDropDownSelected == ((a) other).isDropDownSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDropDownSelected);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ActivityMoreSelected(isDropDownSelected=", ")", this.isDropDownSelected);
        }
    }

    /* JADX INFO: renamed from: dw0.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$b;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final b f42003a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$c */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Ldw0/b$c;", "Ldw0/b;", "Ldw0/b$l;", "Ldw0/b$o;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c extends InterfaceC12403b {
    }

    /* JADX INFO: renamed from: dw0.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$d;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final d f42004a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$e;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final e f42005a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Ldw0/b$f;", "Ldw0/b;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public f(int i13) {
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.index == ((f) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "ExerciseCardSwiped(index=", ")");
        }
    }

    /* JADX INFO: renamed from: dw0.b$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldw0/b$g;", "Ldw0/b;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean show;

        public g(boolean z4) {
            this.show = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShow() {
            return this.show;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && this.show == ((g) other).show;
        }

        public int hashCode() {
            return Boolean.hashCode(this.show);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ExerciseSummary(show=", ")", this.show);
        }
    }

    /* JADX INFO: renamed from: dw0.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ldw0/b$h;", "Ldw0/b;", "", "activityId", "entryPoint", "Lhw0/a;", "activityType", "", "newHome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhw0/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lhw0/a;", "()Lhw0/a;", "d", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC17696a activityType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean newHome;

        public h(String activityId, String entryPoint, EnumC17696a activityType, boolean z4) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityId = activityId;
            this.entryPoint = entryPoint;
            this.activityType = activityType;
            this.newHome = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC17696a getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getNewHome() {
            return this.newHome;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.activityId, hVar.activityId) && AbstractC22676k.m65745e(this.entryPoint, hVar.entryPoint) && this.activityType == hVar.activityType && this.newHome == hVar.newHome;
        }

        public int hashCode() {
            return Boolean.hashCode(this.newHome) + ((this.activityType.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.entryPoint)) * 31);
        }

        public String toString() {
            String str = this.activityId;
            String str2 = this.entryPoint;
            EnumC17696a enumC17696a = this.activityType;
            boolean z4 = this.newHome;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FetchCoreDetailsData(activityId=", str, ", entryPoint=", str2, ", activityType=");
            sbM32001t.append(enumC17696a);
            sbM32001t.append(", newHome=");
            sbM32001t.append(z4);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: dw0.b$i */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ldw0/b$i;", "", "", "forceShowCoreDetails", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean forceShowCoreDetails;

        public i(boolean z4) {
            this.forceShowCoreDetails = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForceShowCoreDetails() {
            return this.forceShowCoreDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.forceShowCoreDetails == ((i) other).forceShowCoreDetails;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceShowCoreDetails);
        }

        public String toString() {
            return AbstractC3855a.m11827k("GoBack(forceShowCoreDetails=", ")", this.forceShowCoreDetails);
        }
    }

    /* JADX INFO: renamed from: dw0.b$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Ldw0/b$j;", "Ldw0/b;", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC12403b {

        /* JADX INFO: renamed from: d */
        public static final int f42013d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource valueDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource unitDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource timeDisplay;

        public j(TextResource textResource, TextResource textResource2, TextResource textResource3) {
            this.valueDisplay = textResource;
            this.unitDisplay = textResource2;
            this.timeDisplay = textResource3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getTimeDisplay() {
            return this.timeDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getUnitDisplay() {
            return this.unitDisplay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getValueDisplay() {
            return this.valueDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.valueDisplay, jVar.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, jVar.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, jVar.timeDisplay);
        }

        public int hashCode() {
            TextResource textResource = this.valueDisplay;
            int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            TextResource textResource2 = this.unitDisplay;
            int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.timeDisplay;
            return iHashCode2 + (textResource3 != null ? textResource3.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.valueDisplay;
            TextResource textResource2 = this.unitDisplay;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("HRGraphScrubbed(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay="), this.timeDisplay, ")");
        }
    }

    /* JADX INFO: renamed from: dw0.b$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldw0/b$k;", "Ldw0/b;", "Lmc1/b;", "heartZoneType", "<init>", "(Lmc1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmc1/b;", "()Lmc1/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC25417b heartZoneType;

        public k(EnumC25417b heartZoneType) {
            AbstractC22676k.m65750j(heartZoneType, "heartZoneType");
            this.heartZoneType = heartZoneType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC25417b getHeartZoneType() {
            return this.heartZoneType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.heartZoneType == ((k) other).heartZoneType;
        }

        public int hashCode() {
            return this.heartZoneType.hashCode();
        }

        public String toString() {
            return "HeartZoneBarSelected(heartZoneType=" + this.heartZoneType + ")";
        }
    }

    /* JADX INFO: renamed from: dw0.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$l;", "Ldw0/b$c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements c {

        /* JADX INFO: renamed from: a */
        public static final l f42018a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldw0/b$m;", "Ldw0/b;", "Ldw0/h;", "errorCloseEvent", "<init>", "(Ldw0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldw0/h;", "()Ldw0/h;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC12409h errorCloseEvent;

        public m(EnumC12409h errorCloseEvent) {
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC12409h getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.errorCloseEvent == ((m) other).errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode();
        }

        public String toString() {
            return "HideFullScreenModal(errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: dw0.b$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldw0/b$n;", "Ldw0/b;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements InterfaceC12403b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        public n(String exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.exerciseId, ((n) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToExerciseDetails(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: dw0.b$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$o;", "Ldw0/b$c;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements c {

        /* JADX INFO: renamed from: a */
        public static final o f42021a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$p;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final p f42022a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$q;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final q f42023a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$r;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final r f42024a = new r();

        private r() {
        }
    }

    /* JADX INFO: renamed from: dw0.b$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldw0/b$s;", "Ldw0/b;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements InterfaceC12403b {

        /* JADX INFO: renamed from: a */
        public static final s f42025a = new s();

        private s() {
        }
    }
}
