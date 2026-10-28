package il1;

import a11.EnumC0124b;
import b11.C2281h;
import c13.AbstractC3855a;
import c41.EnumC4022f2;
import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import com.whoop.util.TrendKey;
import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import fm1.C14600d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import kd1.EnumC22400l;
import o01.EnumC27349e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import s21.C32079b;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: il1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:!\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001!%&'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, m65681d2 = {"Lil1/s;", "", "<init>", "()V", "d", "a", "z", "c", "b", "f", "e", "u", "j", "l", "n", "p", "o", "y", "a0", "b0", "c0", "e0", "q", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f0", "d0", "g0", "g", "i", "m", "v", "x", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "r", "s", "t", "Lil1/s$a;", "Lil1/s$b;", "Lil1/s$c;", "Lil1/s$d;", "Lil1/s$e;", "Lil1/s$f;", "Lil1/s$g;", "Lil1/s$h;", "Lil1/s$i;", "Lil1/s$j;", "Lil1/s$k;", "Lil1/s$l;", "Lil1/s$m;", "Lil1/s$n;", "Lil1/s$o;", "Lil1/s$p;", "Lil1/s$q;", "Lil1/s$r;", "Lil1/s$s;", "Lil1/s$t;", "Lil1/s$u;", "Lil1/s$v;", "Lil1/s$w;", "Lil1/s$x;", "Lil1/s$y;", "Lil1/s$z;", "Lil1/s$a0;", "Lil1/s$b0;", "Lil1/s$c0;", "Lil1/s$d0;", "Lil1/s$e0;", "Lil1/s$f0;", "Lil1/s$g0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18642s {

    /* JADX INFO: renamed from: il1.s$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u000f¨\u0006&"}, m65681d2 = {"Lil1/s$a;", "Lil1/s;", "", "activityIdV1", "activityIdV2", "Lcom/whoop/navigation/ActivityDetailType;", "activityType", "localDate", "whoopActivity", "activityInternalName", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/whoop/navigation/ActivityDetailType;", "()Lcom/whoop/navigation/ActivityDetailType;", "d", "e", "f", "getActivityInternalName", "g", "getStartDate", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getEndDate", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityIdV1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityIdV2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ActivityDetailType activityType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String localDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String whoopActivity;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String startDate;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String endDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String activityIdV1, String activityIdV2, ActivityDetailType activityType, String str, String str2, String str3, String str4, String str5) {
            super(null);
            AbstractC22676k.m65750j(activityIdV1, "activityIdV1");
            AbstractC22676k.m65750j(activityIdV2, "activityIdV2");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityIdV1 = activityIdV1;
            this.activityIdV2 = activityIdV2;
            this.activityType = activityType;
            this.localDate = str;
            this.whoopActivity = str2;
            this.activityInternalName = str3;
            this.startDate = str4;
            this.endDate = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityIdV1() {
            return this.activityIdV1;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityIdV2() {
            return this.activityIdV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ActivityDetailType getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLocalDate() {
            return this.localDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getWhoopActivity() {
            return this.whoopActivity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.activityIdV1, aVar.activityIdV1) && AbstractC22676k.m65745e(this.activityIdV2, aVar.activityIdV2) && this.activityType == aVar.activityType && AbstractC22676k.m65745e(this.localDate, aVar.localDate) && AbstractC22676k.m65745e(this.whoopActivity, aVar.whoopActivity) && AbstractC22676k.m65745e(this.activityInternalName, aVar.activityInternalName) && AbstractC22676k.m65745e(this.startDate, aVar.startDate) && AbstractC22676k.m65745e(this.endDate, aVar.endDate);
        }

        public int hashCode() {
            int iHashCode = (this.activityType.hashCode() + AbstractC11266d.m30450d(this.activityIdV1.hashCode() * 31, 31, this.activityIdV2)) * 31;
            String str = this.localDate;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.whoopActivity;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.activityInternalName;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.startDate;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.endDate;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.activityIdV1;
            String str2 = this.activityIdV2;
            ActivityDetailType activityDetailType = this.activityType;
            String str3 = this.localDate;
            String str4 = this.whoopActivity;
            String str5 = this.activityInternalName;
            String str6 = this.startDate;
            String str7 = this.endDate;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityDetailNavigation(activityIdV1=", str, ", activityIdV2=", str2, ", activityType=");
            sbM32001t.append(activityDetailType);
            sbM32001t.append(", localDate=");
            sbM32001t.append(str3);
            sbM32001t.append(", whoopActivity=");
            AbstractC11266d.m30444B(sbM32001t, str4, ", activityInternalName=", str5, ", startDate=");
            return AbstractC11266d.m30464r(sbM32001t, str6, ", endDate=", str7, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$a0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$a0;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final a0 f73092a = new a0();

        private a0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lil1/s$b;", "Lil1/s;", "", "isGdcFlow", "", "activityInternalName", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isGdcFlow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityInternalName;

        public b(boolean z4, String str) {
            super(null);
            this.isGdcFlow = z4;
            this.activityInternalName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsGdcFlow() {
            return this.isGdcFlow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.isGdcFlow == bVar.isGdcFlow && AbstractC22676k.m65745e(this.activityInternalName, bVar.activityInternalName);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isGdcFlow) * 31;
            String str = this.activityInternalName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC3855a.m11825i("ActivityTileAddSleepNavigation(isGdcFlow=", ", activityInternalName=", this.activityInternalName, ")", this.isGdcFlow);
        }
    }

    /* JADX INFO: renamed from: il1.s$b0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$b0;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final b0 f73095a = new b0();

        private b0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lil1/s$c;", "Lil1/s;", "", "gpsEnabled", "", "startAt", "", "sportId", "<init>", "(ZLjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "I", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean gpsEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String startAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int sportId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, String startAt, int i13) {
            super(null);
            AbstractC22676k.m65750j(startAt, "startAt");
            this.gpsEnabled = z4;
            this.startAt = startAt;
            this.sportId = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getGpsEnabled() {
            return this.gpsEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSportId() {
            return this.sportId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStartAt() {
            return this.startAt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.gpsEnabled == cVar.gpsEnabled && AbstractC22676k.m65745e(this.startAt, cVar.startAt) && this.sportId == cVar.sportId;
        }

        public int hashCode() {
            return Integer.hashCode(this.sportId) + AbstractC11266d.m30450d(Boolean.hashCode(this.gpsEnabled) * 31, 31, this.startAt);
        }

        public String toString() {
            boolean z4 = this.gpsEnabled;
            String str = this.startAt;
            return AbstractC18489d0.m53371l(AbstractC13673n.m38567n("ActivityTileProcessNow(gpsEnabled=", ", startAt=", str, ", sportId=", z4), this.sportId, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b$\u0010\u0010¨\u0006&"}, m65681d2 = {"Lil1/s$d;", "Lil1/s;", "Lo01/e;", "suggestionCategory", "", "hint", "contextualMessage", "", "cycleId", "educationType", "conversationSeedId", "sourceType", "sourceId", "<init>", "(Lo01/e;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo01/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lo01/e;", "b", "Ljava/lang/String;", "e", "c", "d", "J", "()J", "f", "g", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC27349e suggestionCategory;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String hint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String contextualMessage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String educationType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String conversationSeedId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC27349e suggestionCategory, String hint, String contextualMessage, long j7, String str, String str2, String str3, String str4) {
            super(null);
            AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
            AbstractC22676k.m65750j(hint, "hint");
            AbstractC22676k.m65750j(contextualMessage, "contextualMessage");
            this.suggestionCategory = suggestionCategory;
            this.hint = hint;
            this.contextualMessage = contextualMessage;
            this.cycleId = j7;
            this.educationType = str;
            this.conversationSeedId = str2;
            this.sourceType = str3;
            this.sourceId = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContextualMessage() {
            return this.contextualMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConversationSeedId() {
            return this.conversationSeedId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEducationType() {
            return this.educationType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.suggestionCategory == dVar.suggestionCategory && AbstractC22676k.m65745e(this.hint, dVar.hint) && AbstractC22676k.m65745e(this.contextualMessage, dVar.contextualMessage) && this.cycleId == dVar.cycleId && AbstractC22676k.m65745e(this.educationType, dVar.educationType) && AbstractC22676k.m65745e(this.conversationSeedId, dVar.conversationSeedId) && AbstractC22676k.m65745e(this.sourceType, dVar.sourceType) && AbstractC22676k.m65745e(this.sourceId, dVar.sourceId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final EnumC27349e getSuggestionCategory() {
            return this.suggestionCategory;
        }

        public int hashCode() {
            int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.suggestionCategory.hashCode() * 31, 31, this.hint), 31, this.contextualMessage), this.cycleId, 31);
            String str = this.educationType;
            int iHashCode = (iM30451e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.conversationSeedId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sourceType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sourceId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            EnumC27349e enumC27349e = this.suggestionCategory;
            String str = this.hint;
            String str2 = this.contextualMessage;
            long j7 = this.cycleId;
            String str3 = this.educationType;
            String str4 = this.conversationSeedId;
            String str5 = this.sourceType;
            String str6 = this.sourceId;
            StringBuilder sb4 = new StringBuilder("AiChatNavigation(suggestionCategory=");
            sb4.append(enumC27349e);
            sb4.append(", hint=");
            sb4.append(str);
            sb4.append(", contextualMessage=");
            sb4.append(str2);
            sb4.append(", cycleId=");
            sb4.append(j7);
            AbstractC11266d.m30444B(sb4, ", educationType=", str3, ", conversationSeedId=", str4);
            AbstractC11266d.m30444B(sb4, ", sourceType=", str5, ", sourceId=", str6);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: il1.s$d0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lil1/s$d0;", "Lil1/s;", "", "notificationTileId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String notificationTileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String notificationTileId) {
            super(null);
            AbstractC22676k.m65750j(notificationTileId, "notificationTileId");
            this.notificationTileId = notificationTileId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNotificationTileId() {
            return this.notificationTileId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d0) && AbstractC22676k.m65745e(this.notificationTileId, ((d0) other).notificationTileId);
        }

        public int hashCode() {
            return this.notificationTileId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TurnoffAlarmWarningNavigation(notificationTileId=", this.notificationTileId, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lil1/s$e;", "Lil1/s;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.id, ((e) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AlertDismiss(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$e0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$e0;", "Lil1/s;", "Lkd1/l;", "ctaNavType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l ctaNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(EnumC22400l ctaNavType) {
            super(null);
            AbstractC22676k.m65750j(ctaNavType, "ctaNavType");
            this.ctaNavType = ctaNavType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC22400l getCtaNavType() {
            return this.ctaNavType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e0) && this.ctaNavType == ((e0) other).ctaNavType;
        }

        public int hashCode() {
            return this.ctaNavType.hashCode();
        }

        public String toString() {
            return "VowNavigation(ctaNavType=" + this.ctaNavType + ")";
        }
    }

    /* JADX INFO: renamed from: il1.s$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$f;", "Lil1/s;", "Lkd1/l;", "navType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l navType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC22400l navType) {
            super(null);
            AbstractC22676k.m65750j(navType, "navType");
            this.navType = navType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC22400l getNavType() {
            return this.navType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.navType == ((f) other).navType;
        }

        public int hashCode() {
            return this.navType.hashCode();
        }

        public String toString() {
            return "AlertNavigation(navType=" + this.navType + ")";
        }
    }

    /* JADX INFO: renamed from: il1.s$f0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$f0;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final f0 f73115a = new f0();

        private f0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$g0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$g0;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final g0 f73119a = new g0();

        private g0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lil1/s$h;", "Lil1/s;", "", "dismiss", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean dismiss;

        public h(boolean z4) {
            super(null);
            this.dismiss = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDismiss() {
            return this.dismiss;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.dismiss == ((h) other).dismiss;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dismiss);
        }

        public String toString() {
            return AbstractC3855a.m11827k("BehaviorImpactNavigation(dismiss=", ")", this.dismiss);
        }
    }

    /* JADX INFO: renamed from: il1.s$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$i;", "Lil1/s;", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC18642s {

        /* JADX INFO: renamed from: b */
        public static final int f73121b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C9598e navigationAction) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            this.navigationAction = navigationAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.navigationAction, ((i) other).navigationAction);
        }

        public int hashCode() {
            return this.navigationAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("CoachTileSeen(navigationAction=", this.navigationAction, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$k;", "Lil1/s;", "", "cycleId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long cycleId;

        public k(long j7) {
            super(null);
            this.cycleId = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.cycleId == ((k) other).cycleId;
        }

        public int hashCode() {
            return Long.hashCode(this.cycleId);
        }

        public String toString() {
            return AbstractC31061c.m95636l(this.cycleId, "DismissAddActivityCtaTile(cycleId=", ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$l */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lil1/s$l;", "Lil1/s;", "", QueryParams.URL, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lil1/j;", "destination", "Lil1/j;", "a", "()Lil1/j;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC18642s {
        /* JADX INFO: renamed from: a */
        public abstract EnumC18633j m54035a();

        /* JADX INFO: renamed from: b */
        public abstract String m54036b();
    }

    /* JADX INFO: renamed from: il1.s$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$m;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final m f73127a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lil1/s$n;", "Lil1/s;", "Lc41/f2;", "type", "<init>", "(Lc41/f2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc41/f2;", "getType", "()Lc41/f2;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4022f2 type;

        public n(EnumC4022f2 enumC4022f2) {
            super(null);
            this.type = enumC4022f2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.type == ((n) other).type;
        }

        public int hashCode() {
            EnumC4022f2 enumC4022f2 = this.type;
            if (enumC4022f2 == null) {
                return 0;
            }
            return enumC4022f2.hashCode();
        }

        public String toString() {
            return "HealthMonitorNavigation(type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: il1.s$q */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$q;", "Lil1/s;", "Lfm1/d;", "homeMetaData", "<init>", "(Lfm1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/d;", "()Lfm1/d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14600d homeMetaData;

        public q(C14600d c14600d) {
            super(null);
            this.homeMetaData = c14600d;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14600d getHomeMetaData() {
            return this.homeMetaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && AbstractC22676k.m65745e(this.homeMetaData, ((q) other).homeMetaData);
        }

        public int hashCode() {
            C14600d c14600d = this.homeMetaData;
            if (c14600d == null) {
                return 0;
            }
            return c14600d.hashCode();
        }

        public String toString() {
            return "JournalNavigation(homeMetaData=" + this.homeMetaData + ")";
        }
    }

    /* JADX INFO: renamed from: il1.s$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$r;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final r f73137a = new r();

        private r() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$s;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final s f73138a = new s();

        private s() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$t */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lil1/s$t;", "Lil1/s;", "Lcom/whoop/navigation/e;", "navigationAction", "Ls21/b;", "analytics", "<init>", "(Lcom/whoop/navigation/e;Ls21/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ls21/b;", "()Ls21/b;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC18642s {

        /* JADX INFO: renamed from: c */
        public static final int f73139c = C32079b.f133035e | C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C32079b analytics;

        public t(C9598e c9598e, C32079b c32079b) {
            super(null);
            this.navigationAction = c9598e;
            this.analytics = c32079b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32079b getAnalytics() {
            return this.analytics;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.navigationAction, tVar.navigationAction) && AbstractC22676k.m65745e(this.analytics, tVar.analytics);
        }

        public int hashCode() {
            C9598e c9598e = this.navigationAction;
            int iHashCode = (c9598e == null ? 0 : c9598e.hashCode()) * 31;
            C32079b c32079b = this.analytics;
            return iHashCode + (c32079b != null ? c32079b.hashCode() : 0);
        }

        public String toString() {
            return "MilestoneCardClickEvent(navigationAction=" + this.navigationAction + ", analytics=" + this.analytics + ")";
        }
    }

    /* JADX INFO: renamed from: il1.s$u */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/s$u;", "Lil1/s;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u) && AbstractC22676k.m65745e(this.action, ((u) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("PerformAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$v */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$v;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final v f73143a = new v();

        private v() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$w */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$w;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final w f73144a = new w();

        private w() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$x */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/s$x;", "Lil1/s;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC18642s {

        /* JADX INFO: renamed from: a */
        public static final x f73145a = new x();

        private x() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.s$y */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lil1/s$y;", "Lil1/s;", "", "gaugeType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String gaugeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String gaugeType) {
            super(null);
            AbstractC22676k.m65750j(gaugeType, "gaugeType");
            this.gaugeType = gaugeType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGaugeType() {
            return this.gaugeType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y) && AbstractC22676k.m65745e(this.gaugeType, ((y) other).gaugeType);
        }

        public int hashCode() {
            return this.gaugeType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ShareNavigation(gaugeType=", this.gaugeType, ")");
        }
    }

    /* JADX INFO: renamed from: il1.s$z */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lil1/s$z;", "Lil1/s;", "", "cycleId", "", "source", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(long j7, String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.cycleId = j7;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z)) {
                return false;
            }
            z zVar = (z) other;
            return this.cycleId == zVar.cycleId && AbstractC22676k.m65745e(this.source, zVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (Long.hashCode(this.cycleId) * 31);
        }

        public String toString() {
            StringBuilder sbM114685m = AbstractC36095b.m114685m("SleepProcessNow(cycleId=", ", source=", this.cycleId, this.source);
            sbM114685m.append(")");
            return sbM114685m.toString();
        }
    }

    public /* synthetic */ AbstractC18642s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18642s() {
    }

    /* JADX INFO: renamed from: il1.s$j */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lil1/s$j;", "Lil1/s;", "La11/b;", "connectivityNavType", "Lb11/h;", "connectivityIndicatorState", "<init>", "(La11/b;Lb11/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La11/b;", "()La11/b;", "b", "Lb11/h;", "getConnectivityIndicatorState", "()Lb11/h;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC18642s {

        /* JADX INFO: renamed from: c */
        public static final int f73123c = C2281h.f9046e;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC0124b connectivityNavType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C2281h connectivityIndicatorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EnumC0124b connectivityNavType, C2281h c2281h) {
            super(null);
            AbstractC22676k.m65750j(connectivityNavType, "connectivityNavType");
            this.connectivityNavType = connectivityNavType;
            this.connectivityIndicatorState = c2281h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC0124b getConnectivityNavType() {
            return this.connectivityNavType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return this.connectivityNavType == jVar.connectivityNavType && AbstractC22676k.m65745e(this.connectivityIndicatorState, jVar.connectivityIndicatorState);
        }

        public int hashCode() {
            int iHashCode = this.connectivityNavType.hashCode() * 31;
            C2281h c2281h = this.connectivityIndicatorState;
            return iHashCode + (c2281h == null ? 0 : c2281h.hashCode());
        }

        public String toString() {
            return "ConnectivityNavigation(connectivityNavType=" + this.connectivityNavType + ", connectivityIndicatorState=" + this.connectivityIndicatorState + ")";
        }

        public /* synthetic */ j(EnumC0124b enumC0124b, C2281h c2281h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC0124b, (i13 & 2) != 0 ? null : c2281h);
        }
    }

    /* JADX INFO: renamed from: il1.s$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lil1/s$g;", "Lil1/s;", "Lcom/whoop/navigation/e;", "navigationAction", "", "actionArgument", "", "fromMyDay", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "c", "()Lcom/whoop/navigation/e;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object actionArgument;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C9598e navigationAction, Object obj, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            this.navigationAction = navigationAction;
            this.actionArgument = obj;
            this.fromMyDay = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getActionArgument() {
            return this.actionArgument;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.navigationAction, gVar.navigationAction) && AbstractC22676k.m65745e(this.actionArgument, gVar.actionArgument) && this.fromMyDay == gVar.fromMyDay;
        }

        public int hashCode() {
            int iHashCode = this.navigationAction.hashCode() * 31;
            Object obj = this.actionArgument;
            return Boolean.hashCode(this.fromMyDay) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
        }

        public String toString() {
            C9598e c9598e = this.navigationAction;
            Object obj = this.actionArgument;
            boolean z4 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("BackendDrivenNavigation(navigationAction=");
            sb4.append(c9598e);
            sb4.append(", actionArgument=");
            sb4.append(obj);
            sb4.append(", fromMyDay=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        public /* synthetic */ g(C9598e c9598e, Object obj, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c9598e, (i13 & 2) != 0 ? null : obj, (i13 & 4) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: il1.s$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lil1/s$o;", "Lil1/s;", "", "helpType", "", "fromTile", "source", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "getSource", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String helpType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean fromTile;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String helpType, boolean z4, String source) {
            super(null);
            AbstractC22676k.m65750j(helpType, "helpType");
            AbstractC22676k.m65750j(source, "source");
            this.helpType = helpType;
            this.fromTile = z4;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromTile() {
            return this.fromTile;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHelpType() {
            return this.helpType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return AbstractC22676k.m65745e(this.helpType, oVar.helpType) && this.fromTile == oVar.fromTile && AbstractC22676k.m65745e(this.source, oVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC2875y.m8289b(this.helpType.hashCode() * 31, 31, this.fromTile);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC25012a.m73379l("HelpNavigation(helpType=", this.helpType, ", fromTile=", ", source=", this.fromTile));
        }

        public /* synthetic */ o(String str, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: il1.s$c0 */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, m65681d2 = {"Lil1/s$c0;", "Lil1/s;", "Lcom/whoop/util/TrendKey;", "trendKey", "Ljava/time/LocalDate;", HttpHeaders.DATE, "Lil1/a0;", "source", "", "sendTileProperties", "<init>", "(Lcom/whoop/util/TrendKey;Ljava/time/LocalDate;Lil1/a0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/util/TrendKey;", "d", "()Lcom/whoop/util/TrendKey;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "Lil1/a0;", "()Lil1/a0;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TrendKey trendKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC18623a0 source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean sendTileProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(TrendKey trendKey, LocalDate localDate, EnumC18623a0 source, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(trendKey, "trendKey");
            AbstractC22676k.m65750j(source, "source");
            this.trendKey = trendKey;
            this.date = localDate;
            this.source = source;
            this.sendTileProperties = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSendTileProperties() {
            return this.sendTileProperties;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC18623a0 getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TrendKey getTrendKey() {
            return this.trendKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) other;
            return this.trendKey == c0Var.trendKey && AbstractC22676k.m65745e(this.date, c0Var.date) && this.source == c0Var.source && this.sendTileProperties == c0Var.sendTileProperties;
        }

        public int hashCode() {
            int iHashCode = this.trendKey.hashCode() * 31;
            LocalDate localDate = this.date;
            return Boolean.hashCode(this.sendTileProperties) + ((this.source.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31);
        }

        public String toString() {
            return "TrendsNavigation(trendKey=" + this.trendKey + ", date=" + this.date + ", source=" + this.source + ", sendTileProperties=" + this.sendTileProperties + ")";
        }

        public /* synthetic */ c0(TrendKey trendKey, LocalDate localDate, EnumC18623a0 enumC18623a0, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(trendKey, (i13 & 2) != 0 ? LocalDate.now() : localDate, enumC18623a0, (i13 & 8) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: il1.s$p */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lil1/s$p;", "Lil1/s;", "Lkd1/l;", "homeCtaType", "", "isOnboardingState", "fromMyDay", "Lfm1/d;", "homeMetaData", "<init>", "(Lkd1/l;ZZLfm1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "b", "()Lkd1/l;", "Z", "d", "()Z", "c", "Lfm1/d;", "()Lfm1/d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC18642s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l homeCtaType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isOnboardingState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C14600d homeMetaData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC22400l homeCtaType, boolean z4, boolean z13, C14600d c14600d) {
            super(null);
            AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
            this.homeCtaType = homeCtaType;
            this.isOnboardingState = z4;
            this.fromMyDay = z13;
            this.homeMetaData = c14600d;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC22400l getHomeCtaType() {
            return this.homeCtaType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C14600d getHomeMetaData() {
            return this.homeMetaData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsOnboardingState() {
            return this.isOnboardingState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return this.homeCtaType == pVar.homeCtaType && this.isOnboardingState == pVar.isOnboardingState && this.fromMyDay == pVar.fromMyDay && AbstractC22676k.m65745e(this.homeMetaData, pVar.homeMetaData);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.homeCtaType.hashCode() * 31, 31, this.isOnboardingState), 31, this.fromMyDay);
            C14600d c14600d = this.homeMetaData;
            return iM8289b + (c14600d == null ? 0 : c14600d.hashCode());
        }

        public String toString() {
            return "HomeSectionHeaderNavigation(homeCtaType=" + this.homeCtaType + ", isOnboardingState=" + this.isOnboardingState + ", fromMyDay=" + this.fromMyDay + ", homeMetaData=" + this.homeMetaData + ")";
        }

        public /* synthetic */ p(EnumC22400l enumC22400l, boolean z4, boolean z13, C14600d c14600d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC22400l, z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : c14600d);
        }
    }
}
