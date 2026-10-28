package lj2;

import com.mapbox.maps.MapboxMap;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.util.TrendKey;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lj2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Llj2/a;", "", "<init>", "()V", "b", "c", "d", "e", "g", "i", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "f", "Llj2/a$a;", "Llj2/a$b;", "Llj2/a$c;", "Llj2/a$d;", "Llj2/a$e;", "Llj2/a$f;", "Llj2/a$g;", "Llj2/a$h;", "Llj2/a$i;", "Llj2/a$j;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24475a {

    /* JADX INFO: renamed from: lj2.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llj2/a$a;", "Llj2/a;", "", "activityIdV2", "Lcom/whoop/navigation/ActivityDetailType;", "activityType", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/navigation/ActivityDetailType;", "()Lcom/whoop/navigation/ActivityDetailType;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24475a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityIdV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ActivityDetailType activityType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String activityIdV2, ActivityDetailType activityType) {
            super(null);
            AbstractC22676k.m65750j(activityIdV2, "activityIdV2");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityIdV2 = activityIdV2;
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityIdV2() {
            return this.activityIdV2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ActivityDetailType getActivityType() {
            return this.activityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.activityIdV2, aVar.activityIdV2) && this.activityType == aVar.activityType;
        }

        public int hashCode() {
            return this.activityType.hashCode() + (this.activityIdV2.hashCode() * 31);
        }

        public String toString() {
            return "ActivityDetailNavigation(activityIdV2=" + this.activityIdV2 + ", activityType=" + this.activityType + ")";
        }
    }

    /* JADX INFO: renamed from: lj2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/a$b;", "Llj2/a;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC24475a {

        /* JADX INFO: renamed from: a */
        public static final b f95463a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Llj2/a$c;", "Llj2/a;", "", MapboxMap.QFE_OFFSET, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24475a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int offset;

        public c(int i13) {
            super(null);
            this.offset = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.offset == ((c) other).offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.offset, "CalendarPaged(offset=", ")");
        }
    }

    /* JADX INFO: renamed from: lj2.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llj2/a$d;", "Llj2/a;", "", "dateSelected", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC24475a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String dateSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String dateSelected) {
            super(null);
            AbstractC22676k.m65750j(dateSelected, "dateSelected");
            this.dateSelected = dateSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateSelected() {
            return this.dateSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.dateSelected, ((d) other).dateSelected);
        }

        public int hashCode() {
            return this.dateSelected.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DateSelected(dateSelected=", this.dateSelected, ")");
        }
    }

    /* JADX INFO: renamed from: lj2.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/a$e;", "Llj2/a;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC24475a {

        /* JADX INFO: renamed from: a */
        public static final e f95466a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llj2/a$f;", "Llj2/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC24475a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.message, ((f) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToWhoopCoach(message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: lj2.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/a$g;", "Llj2/a;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC24475a {

        /* JADX INFO: renamed from: a */
        public static final g f95468a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.a$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llj2/a$h;", "Llj2/a;", "Lcom/whoop/util/TrendKey;", "trendKey", "", "dateSelected", "<init>", "(Lcom/whoop/util/TrendKey;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/util/TrendKey;", "b", "()Lcom/whoop/util/TrendKey;", "Ljava/lang/String;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC24475a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TrendKey trendKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String dateSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TrendKey trendKey, String dateSelected) {
            super(null);
            AbstractC22676k.m65750j(trendKey, "trendKey");
            AbstractC22676k.m65750j(dateSelected, "dateSelected");
            this.trendKey = trendKey;
            this.dateSelected = dateSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDateSelected() {
            return this.dateSelected;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TrendKey getTrendKey() {
            return this.trendKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return this.trendKey == hVar.trendKey && AbstractC22676k.m65745e(this.dateSelected, hVar.dateSelected);
        }

        public int hashCode() {
            return this.dateSelected.hashCode() + (this.trendKey.hashCode() * 31);
        }

        public String toString() {
            return "SeeTrendsClicked(trendKey=" + this.trendKey + ", dateSelected=" + this.dateSelected + ")";
        }
    }

    /* JADX INFO: renamed from: lj2.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/a$i;", "Llj2/a;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC24475a {

        /* JADX INFO: renamed from: a */
        public static final i f95471a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.a$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/a$j;", "Llj2/a;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC24475a {

        /* JADX INFO: renamed from: a */
        public static final j f95472a = new j();

        private j() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC24475a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24475a() {
    }
}
