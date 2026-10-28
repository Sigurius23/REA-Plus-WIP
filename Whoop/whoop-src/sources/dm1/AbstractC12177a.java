package dm1;

import a11.EnumC0124b;
import b11.C2281h;
import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import com.whoop.util.TrendKey;
import fm1.EnumC14603g;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import il1.EnumC18623a0;
import il1.EnumC18633j;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import jh3.AbstractC21702c;
import kd1.EnumC22400l;
import no.nordicsemi.android.dfu.DfuBaseService;
import o01.EnumC27349e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dm1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:#\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001#'()*+,-./0123456789:;<=>?@ABCDEFGHI¨\u0006J"}, m65681d2 = {"Ldm1/a;", "", "<init>", "()V", "c", "a", "b", "d", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "j", "m", "o", "p", "q", "u", "r", "t", "v", "x", "y", "a0", "h0", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "n", "e0", "b0", "c0", "f", "f0", "i0", "k", "g0", "s", "e", "d0", "Ldm1/a$a;", "Ldm1/a$b;", "Ldm1/a$c;", "Ldm1/a$d;", "Ldm1/a$e;", "Ldm1/a$f;", "Ldm1/a$g;", "Ldm1/a$h;", "Ldm1/a$i;", "Ldm1/a$j;", "Ldm1/a$k;", "Ldm1/a$l;", "Ldm1/a$m;", "Ldm1/a$n;", "Ldm1/a$o;", "Ldm1/a$p;", "Ldm1/a$q;", "Ldm1/a$r;", "Ldm1/a$s;", "Ldm1/a$t;", "Ldm1/a$u;", "Ldm1/a$v;", "Ldm1/a$w;", "Ldm1/a$x;", "Ldm1/a$y;", "Ldm1/a$z;", "Ldm1/a$a0;", "Ldm1/a$b0;", "Ldm1/a$c0;", "Ldm1/a$d0;", "Ldm1/a$e0;", "Ldm1/a$f0;", "Ldm1/a$g0;", "Ldm1/a$h0;", "Ldm1/a$i0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12177a {

    /* JADX INFO: renamed from: dm1.a$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, m65681d2 = {"Ldm1/a$a;", "Ldm1/a;", "", "activityIdV1", "activityIdV2", "Lcom/whoop/navigation/ActivityDetailType;", "activityType", "localDate", "whoopActivity", "Lfm1/g;", "sourcePillar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Ljava/lang/String;Ljava/lang/String;Lfm1/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getActivityIdV1", "b", "c", "Lcom/whoop/navigation/ActivityDetailType;", "()Lcom/whoop/navigation/ActivityDetailType;", "d", "e", "f", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC12177a {

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
        private final EnumC14603g sourcePillar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String activityIdV1, String activityIdV2, ActivityDetailType activityType, String str, String str2, EnumC14603g enumC14603g) {
            super(null);
            AbstractC22676k.m65750j(activityIdV1, "activityIdV1");
            AbstractC22676k.m65750j(activityIdV2, "activityIdV2");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityIdV1 = activityIdV1;
            this.activityIdV2 = activityIdV2;
            this.activityType = activityType;
            this.localDate = str;
            this.whoopActivity = str2;
            this.sourcePillar = enumC14603g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityIdV2() {
            return this.activityIdV2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ActivityDetailType getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLocalDate() {
            return this.localDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
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
            return AbstractC22676k.m65745e(this.activityIdV1, aVar.activityIdV1) && AbstractC22676k.m65745e(this.activityIdV2, aVar.activityIdV2) && this.activityType == aVar.activityType && AbstractC22676k.m65745e(this.localDate, aVar.localDate) && AbstractC22676k.m65745e(this.whoopActivity, aVar.whoopActivity) && this.sourcePillar == aVar.sourcePillar;
        }

        public int hashCode() {
            int iHashCode = (this.activityType.hashCode() + AbstractC11266d.m30450d(this.activityIdV1.hashCode() * 31, 31, this.activityIdV2)) * 31;
            String str = this.localDate;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.whoopActivity;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return iHashCode3 + (enumC14603g != null ? enumC14603g.hashCode() : 0);
        }

        public String toString() {
            String str = this.activityIdV1;
            String str2 = this.activityIdV2;
            ActivityDetailType activityDetailType = this.activityType;
            String str3 = this.localDate;
            String str4 = this.whoopActivity;
            EnumC14603g enumC14603g = this.sourcePillar;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityDetailsEvent(activityIdV1=", str, ", activityIdV2=", str2, ", activityType=");
            sbM32001t.append(activityDetailType);
            sbM32001t.append(", localDate=");
            sbM32001t.append(str3);
            sbM32001t.append(", whoopActivity=");
            sbM32001t.append(str4);
            sbM32001t.append(", sourcePillar=");
            sbM32001t.append(enumC14603g);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: dm1.a$a0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldm1/a$a0;", "Ldm1/a;", "Ljava/time/LocalDate;", HttpHeaders.DATE, "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        public a0(LocalDate localDate) {
            super(null);
            this.date = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && AbstractC22676k.m65745e(this.date, ((a0) other).date);
        }

        public int hashCode() {
            LocalDate localDate = this.date;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }

        public String toString() {
            return "StressEvent(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$b0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ldm1/a$b0;", "Ldm1/a;", "", "cycleDate", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cycleDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public b0(String str, String str2) {
            super(null);
            this.cycleDate = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCycleDate() {
            return this.cycleDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) other;
            return AbstractC22676k.m65745e(this.cycleDate, b0Var.cycleDate) && AbstractC22676k.m65745e(this.source, b0Var.source);
        }

        public int hashCode() {
            String str = this.cycleDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TiltGraph(cycleDate=", this.cycleDate, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b#\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b*\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b)\u0010\u0012¨\u0006+"}, m65681d2 = {"Ldm1/a$c;", "Ldm1/a;", "Lo01/e;", "suggestionCategory", "", "hint", "contextualMessage", "", "cycleId", "Lfm1/g;", "sourcePillar", "educationType", "conversationSeedId", "sourceType", "sourceId", "<init>", "(Lo01/e;Ljava/lang/String;Ljava/lang/String;JLfm1/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo01/e;", "i", "()Lo01/e;", "b", "Ljava/lang/String;", "e", "c", "d", "J", "()J", "Lfm1/g;", "g", "()Lfm1/g;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC27349e suggestionCategory;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String hint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String contextualMessage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String educationType;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String conversationSeedId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC27349e suggestionCategory, String hint, String contextualMessage, long j7, EnumC14603g enumC14603g, String str, String str2, String str3, String str4) {
            super(null);
            AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
            AbstractC22676k.m65750j(hint, "hint");
            AbstractC22676k.m65750j(contextualMessage, "contextualMessage");
            this.suggestionCategory = suggestionCategory;
            this.hint = hint;
            this.contextualMessage = contextualMessage;
            this.cycleId = j7;
            this.sourcePillar = enumC14603g;
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
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.suggestionCategory == cVar.suggestionCategory && AbstractC22676k.m65745e(this.hint, cVar.hint) && AbstractC22676k.m65745e(this.contextualMessage, cVar.contextualMessage) && this.cycleId == cVar.cycleId && this.sourcePillar == cVar.sourcePillar && AbstractC22676k.m65745e(this.educationType, cVar.educationType) && AbstractC22676k.m65745e(this.conversationSeedId, cVar.conversationSeedId) && AbstractC22676k.m65745e(this.sourceType, cVar.sourceType) && AbstractC22676k.m65745e(this.sourceId, cVar.sourceId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        public int hashCode() {
            int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.suggestionCategory.hashCode() * 31, 31, this.hint), 31, this.contextualMessage), this.cycleId, 31);
            EnumC14603g enumC14603g = this.sourcePillar;
            int iHashCode = (iM30451e + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31;
            String str = this.educationType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.conversationSeedId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sourceType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sourceId;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC27349e getSuggestionCategory() {
            return this.suggestionCategory;
        }

        public String toString() {
            EnumC27349e enumC27349e = this.suggestionCategory;
            String str = this.hint;
            String str2 = this.contextualMessage;
            long j7 = this.cycleId;
            EnumC14603g enumC14603g = this.sourcePillar;
            String str3 = this.educationType;
            String str4 = this.conversationSeedId;
            String str5 = this.sourceType;
            String str6 = this.sourceId;
            StringBuilder sb4 = new StringBuilder("AiChatEntryEvent(suggestionCategory=");
            sb4.append(enumC27349e);
            sb4.append(", hint=");
            sb4.append(str);
            sb4.append(", contextualMessage=");
            sb4.append(str2);
            sb4.append(", cycleId=");
            sb4.append(j7);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", educationType=");
            sb4.append(str3);
            AbstractC11266d.m30444B(sb4, ", conversationSeedId=", str4, ", sourceType=", str5);
            return AbstractC2875y.m8304q(sb4, ", sourceId=", str6, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$c0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldm1/a$c0;", "Ldm1/a;", "", "notificationTileId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String notificationTileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String notificationTileId) {
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
            return (other instanceof c0) && AbstractC22676k.m65745e(this.notificationTileId, ((c0) other).notificationTileId);
        }

        public int hashCode() {
            return this.notificationTileId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TurnoffAlarmWarningNavigation(notificationTileId=", this.notificationTileId, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldm1/a$d;", "Ldm1/a;", "Lkd1/l;", "navType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l navType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC22400l navType) {
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
            return (other instanceof d) && this.navType == ((d) other).navType;
        }

        public int hashCode() {
            return this.navType.hashCode();
        }

        public String toString() {
            return "AlertEvent(navType=" + this.navType + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$d0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$d0;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final d0 f40512a = new d0();

        private d0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldm1/a$e;", "Ldm1/a;", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC12177a {

        /* JADX INFO: renamed from: b */
        public static final int f40513b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9598e navigationAction) {
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
            return (other instanceof e) && AbstractC22676k.m65745e(this.navigationAction, ((e) other).navigationAction);
        }

        public int hashCode() {
            return this.navigationAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("AutoPopEvent(navigationAction=", this.navigationAction, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$e0 */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ldm1/a$e0;", "Ldm1/a;", "Lkd1/l;", "ctaNavType", "Lfm1/g;", "sourcePillar", "<init>", "(Lkd1/l;Lfm1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "b", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l ctaNavType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(EnumC22400l ctaNavType, EnumC14603g enumC14603g) {
            super(null);
            AbstractC22676k.m65750j(ctaNavType, "ctaNavType");
            this.ctaNavType = ctaNavType;
            this.sourcePillar = enumC14603g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC22400l getCtaNavType() {
            return this.ctaNavType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) other;
            return this.ctaNavType == e0Var.ctaNavType && this.sourcePillar == e0Var.sourcePillar;
        }

        public int hashCode() {
            int iHashCode = this.ctaNavType.hashCode() * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode());
        }

        public String toString() {
            return "VowEvent(ctaNavType=" + this.ctaNavType + ", sourcePillar=" + this.sourcePillar + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$f;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final f f40517a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$f0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$f0;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final f0 f40518a = new f0();

        private f0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$g0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$g0;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final g0 f40523a = new g0();

        private g0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldm1/a$h;", "Ldm1/a;", "", "isOnboardingState", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isOnboardingState;

        public h(boolean z4) {
            super(null);
            this.isOnboardingState = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsOnboardingState() {
            return this.isOnboardingState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.isOnboardingState == ((h) other).isOnboardingState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnboardingState);
        }

        public String toString() {
            return AbstractC3855a.m11827k("CustomizeOverviewScreenEvent(isOnboardingState=", ")", this.isOnboardingState);
        }
    }

    /* JADX INFO: renamed from: dm1.a$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ldm1/a$i;", "Ldm1/a;", "", "isOnboardingState", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isOnboardingState;

        public i(boolean z4) {
            super(null);
            this.isOnboardingState = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsOnboardingState() {
            return this.isOnboardingState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.isOnboardingState == ((i) other).isOnboardingState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOnboardingState);
        }

        public String toString() {
            return AbstractC3855a.m11827k("CustomizeOverviewStatsEvent(isOnboardingState=", ")", this.isOnboardingState);
        }
    }

    /* JADX INFO: renamed from: dm1.a$i0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$i0;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final i0 f40537a = new i0();

        private i0() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Ldm1/a$j;", "Ldm1/a;", "Lcom/whoop/navigation/e;", "navigationAction", "", "source", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "b", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC12177a {

        /* JADX INFO: renamed from: c */
        public static final int f40538c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C9598e navigationAction, String source) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            AbstractC22676k.m65750j(source, "source");
            this.navigationAction = navigationAction;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.navigationAction, jVar.navigationAction) && AbstractC22676k.m65745e(this.source, jVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.navigationAction.hashCode() * 31);
        }

        public String toString() {
            return "DeepDiveNavigationEvent(navigationAction=" + this.navigationAction + ", source=" + this.source + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$k;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final k f40541a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$l */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ldm1/a$l;", "Ldm1/a;", "", QueryParams.URL, "Lil1/j;", "destination", "<init>", "(Ljava/lang/String;Lil1/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lil1/j;", "()Lil1/j;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC18633j destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String url, EnumC18633j destination) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(destination, "destination");
            this.url = url;
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC18633j getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.url, lVar.url) && this.destination == lVar.destination;
        }

        public int hashCode() {
            return this.destination.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            return "ExternalUrlEvent(url=" + this.url + ", destination=" + this.destination + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$m;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final m f40544a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$n;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final n f40545a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ldm1/a$o;", "Ldm1/a;", "Lfm1/g;", "sourcePillar", "<init>", "(Lfm1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/g;", "getSourcePillar", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        public o(EnumC14603g enumC14603g) {
            super(null);
            this.sourcePillar = enumC14603g;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.sourcePillar == ((o) other).sourcePillar;
        }

        public int hashCode() {
            EnumC14603g enumC14603g = this.sourcePillar;
            if (enumC14603g == null) {
                return 0;
            }
            return enumC14603g.hashCode();
        }

        public String toString() {
            return "HealthMonitorEvent(sourcePillar=" + this.sourcePillar + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$q */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, m65681d2 = {"Ldm1/a$q;", "Ldm1/a;", "Lcom/whoop/util/TrendKey;", "trendKey", "Ljava/time/LocalDate;", HttpHeaders.DATE, "Lil1/a0;", "sourceComponent", "Lfm1/g;", "sourcePillar", "", "sendTileProperties", "<init>", "(Lcom/whoop/util/TrendKey;Ljava/time/LocalDate;Lil1/a0;Lfm1/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/util/TrendKey;", "e", "()Lcom/whoop/util/TrendKey;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "Lil1/a0;", "()Lil1/a0;", "d", "Lfm1/g;", "()Lfm1/g;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TrendKey trendKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC18623a0 sourceComponent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean sendTileProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TrendKey trendKey, LocalDate localDate, EnumC18623a0 sourceComponent, EnumC14603g enumC14603g, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(trendKey, "trendKey");
            AbstractC22676k.m65750j(sourceComponent, "sourceComponent");
            this.trendKey = trendKey;
            this.date = localDate;
            this.sourceComponent = sourceComponent;
            this.sourcePillar = enumC14603g;
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
        public final EnumC18623a0 getSourceComponent() {
            return this.sourceComponent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TrendKey getTrendKey() {
            return this.trendKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return this.trendKey == qVar.trendKey && AbstractC22676k.m65745e(this.date, qVar.date) && this.sourceComponent == qVar.sourceComponent && this.sourcePillar == qVar.sourcePillar && this.sendTileProperties == qVar.sendTileProperties;
        }

        public int hashCode() {
            int iHashCode = this.trendKey.hashCode() * 31;
            LocalDate localDate = this.date;
            int iHashCode2 = (this.sourceComponent.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return Boolean.hashCode(this.sendTileProperties) + ((iHashCode2 + (enumC14603g != null ? enumC14603g.hashCode() : 0)) * 31);
        }

        public String toString() {
            TrendKey trendKey = this.trendKey;
            LocalDate localDate = this.date;
            EnumC18623a0 enumC18623a0 = this.sourceComponent;
            EnumC14603g enumC14603g = this.sourcePillar;
            boolean z4 = this.sendTileProperties;
            StringBuilder sb4 = new StringBuilder("HistoricalTrendsEvent(trendKey=");
            sb4.append(trendKey);
            sb4.append(", date=");
            sb4.append(localDate);
            sb4.append(", sourceComponent=");
            sb4.append(enumC18623a0);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", sendTileProperties=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$r */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b)\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b!\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b\u001d\u00102R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b.\u0010\u0015¨\u00064"}, m65681d2 = {"Ldm1/a$r;", "Ldm1/a;", "", "fromFab", "Lfm1/g;", "sourcePillar", "", "source", "isFromAutoPop", "shouldShowJournalTutorial", "", "cycleId", "previousCycleStartTime", "previousCycleEndTime", "Ljava/time/LocalDate;", "currentCycleStartDay", "currentCycleEndDay", "requestDate", "<init>", "(ZLfm1/g;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lfm1/g;", "getSourcePillar", "()Lfm1/g;", "c", "Ljava/lang/String;", "i", "j", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "J", "()J", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "k", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isFromAutoPop;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean shouldShowJournalTutorial;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final Long previousCycleStartTime;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Long previousCycleEndTime;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final LocalDate currentCycleStartDay;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final LocalDate currentCycleEndDay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z4, EnumC14603g enumC14603g, String source, boolean z13, boolean z14, long j7, Long l7, Long l12, LocalDate currentCycleStartDay, LocalDate localDate, String requestDate) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(currentCycleStartDay, "currentCycleStartDay");
            AbstractC22676k.m65750j(requestDate, "requestDate");
            this.fromFab = z4;
            this.sourcePillar = enumC14603g;
            this.source = source;
            this.isFromAutoPop = z13;
            this.shouldShowJournalTutorial = z14;
            this.cycleId = j7;
            this.previousCycleStartTime = l7;
            this.previousCycleEndTime = l12;
            this.currentCycleStartDay = currentCycleStartDay;
            this.currentCycleEndDay = localDate;
            this.requestDate = requestDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getCurrentCycleEndDay() {
            return this.currentCycleEndDay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getCurrentCycleStartDay() {
            return this.currentCycleStartDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getPreviousCycleEndTime() {
            return this.previousCycleEndTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return this.fromFab == rVar.fromFab && this.sourcePillar == rVar.sourcePillar && AbstractC22676k.m65745e(this.source, rVar.source) && this.isFromAutoPop == rVar.isFromAutoPop && this.shouldShowJournalTutorial == rVar.shouldShowJournalTutorial && this.cycleId == rVar.cycleId && AbstractC22676k.m65745e(this.previousCycleStartTime, rVar.previousCycleStartTime) && AbstractC22676k.m65745e(this.previousCycleEndTime, rVar.previousCycleEndTime) && AbstractC22676k.m65745e(this.currentCycleStartDay, rVar.currentCycleStartDay) && AbstractC22676k.m65745e(this.currentCycleEndDay, rVar.currentCycleEndDay) && AbstractC22676k.m65745e(this.requestDate, rVar.requestDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getPreviousCycleStartTime() {
            return this.previousCycleStartTime;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShouldShowJournalTutorial() {
            return this.shouldShowJournalTutorial;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromFab) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            int iM30451e = AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31, 31, this.source), 31, this.isFromAutoPop), 31, this.shouldShowJournalTutorial), this.cycleId, 31);
            Long l7 = this.previousCycleStartTime;
            int iHashCode2 = (iM30451e + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.previousCycleEndTime;
            int iM38558e = AbstractC13673n.m38558e(this.currentCycleStartDay, (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
            LocalDate localDate = this.currentCycleEndDay;
            return this.requestDate.hashCode() + ((iM38558e + (localDate != null ? localDate.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsFromAutoPop() {
            return this.isFromAutoPop;
        }

        public String toString() {
            boolean z4 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            String str = this.source;
            boolean z13 = this.isFromAutoPop;
            boolean z14 = this.shouldShowJournalTutorial;
            long j7 = this.cycleId;
            Long l7 = this.previousCycleStartTime;
            Long l12 = this.previousCycleEndTime;
            LocalDate localDate = this.currentCycleStartDay;
            LocalDate localDate2 = this.currentCycleEndDay;
            String str2 = this.requestDate;
            StringBuilder sb4 = new StringBuilder("JournalEvent(fromFab=");
            sb4.append(z4);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", source=");
            AbstractC38963t7.m124390t(sb4, str, ", isFromAutoPop=", z13, ", shouldShowJournalTutorial=");
            sb4.append(z14);
            sb4.append(", cycleId=");
            sb4.append(j7);
            sb4.append(", previousCycleStartTime=");
            sb4.append(l7);
            sb4.append(", previousCycleEndTime=");
            sb4.append(l12);
            sb4.append(", currentCycleStartDay=");
            sb4.append(localDate);
            sb4.append(", currentCycleEndDay=");
            sb4.append(localDate2);
            return AbstractC2875y.m8304q(sb4, ", requestDate=", str2, ")");
        }
    }

    /* JADX INFO: renamed from: dm1.a$t */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ldm1/a$t;", "Ldm1/a;", "Lfm1/g;", "source", "<init>", "(Lfm1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/g;", "getSource", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC14603g source;

        public t(EnumC14603g enumC14603g) {
            super(null);
            this.source = enumC14603g;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof t) && this.source == ((t) other).source;
        }

        public int hashCode() {
            EnumC14603g enumC14603g = this.source;
            if (enumC14603g == null) {
                return 0;
            }
            return enumC14603g.hashCode();
        }

        public String toString() {
            return "ProfileEvent(source=" + this.source + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$u */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$u;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final u f40570a = new u();

        private u() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dm1.a$v */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ldm1/a$v;", "Ldm1/a;", "", "gaugeType", "Ljava/time/LocalDate;", "selectedDate", "Lfm1/g;", "sourcePillar", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Lfm1/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String gaugeType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate selectedDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String gaugeType, LocalDate selectedDate, EnumC14603g enumC14603g) {
            super(null);
            AbstractC22676k.m65750j(gaugeType, "gaugeType");
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            this.gaugeType = gaugeType;
            this.selectedDate = selectedDate;
            this.sourcePillar = enumC14603g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGaugeType() {
            return this.gaugeType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getSelectedDate() {
            return this.selectedDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v)) {
                return false;
            }
            v vVar = (v) other;
            return AbstractC22676k.m65745e(this.gaugeType, vVar.gaugeType) && AbstractC22676k.m65745e(this.selectedDate, vVar.selectedDate) && this.sourcePillar == vVar.sourcePillar;
        }

        public int hashCode() {
            int iM38558e = AbstractC13673n.m38558e(this.selectedDate, this.gaugeType.hashCode() * 31, 31);
            EnumC14603g enumC14603g = this.sourcePillar;
            return iM38558e + (enumC14603g == null ? 0 : enumC14603g.hashCode());
        }

        public String toString() {
            return "ShareEvent(gaugeType=" + this.gaugeType + ", selectedDate=" + this.selectedDate + ", sourcePillar=" + this.sourcePillar + ")";
        }
    }

    /* JADX INFO: renamed from: dm1.a$w */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldm1/a$w;", "Ldm1/a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC12177a {

        /* JADX INFO: renamed from: a */
        public static final w f40574a = new w();

        private w() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC12177a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12177a() {
    }

    /* JADX INFO: renamed from: dm1.a$g */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ldm1/a$g;", "Ldm1/a;", "La11/b;", "connectivityNavType", "Lfm1/g;", "sourcePillar", "Lb11/h;", "connectivityIndicatorState", "<init>", "(La11/b;Lfm1/g;Lb11/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La11/b;", "b", "()La11/b;", "Lfm1/g;", "c", "()Lfm1/g;", "Lb11/h;", "()Lb11/h;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC12177a {

        /* JADX INFO: renamed from: d */
        public static final int f40519d = C2281h.f9046e;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC0124b connectivityNavType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C2281h connectivityIndicatorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC0124b connectivityNavType, EnumC14603g enumC14603g, C2281h c2281h) {
            super(null);
            AbstractC22676k.m65750j(connectivityNavType, "connectivityNavType");
            this.connectivityNavType = connectivityNavType;
            this.sourcePillar = enumC14603g;
            this.connectivityIndicatorState = c2281h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C2281h getConnectivityIndicatorState() {
            return this.connectivityIndicatorState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC0124b getConnectivityNavType() {
            return this.connectivityNavType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.connectivityNavType == gVar.connectivityNavType && this.sourcePillar == gVar.sourcePillar && AbstractC22676k.m65745e(this.connectivityIndicatorState, gVar.connectivityIndicatorState);
        }

        public int hashCode() {
            int iHashCode = this.connectivityNavType.hashCode() * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            int iHashCode2 = (iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31;
            C2281h c2281h = this.connectivityIndicatorState;
            return iHashCode2 + (c2281h != null ? c2281h.hashCode() : 0);
        }

        public String toString() {
            return "ConnectivityEvent(connectivityNavType=" + this.connectivityNavType + ", sourcePillar=" + this.sourcePillar + ", connectivityIndicatorState=" + this.connectivityIndicatorState + ")";
        }

        public /* synthetic */ g(EnumC0124b enumC0124b, EnumC14603g enumC14603g, C2281h c2281h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC0124b, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? null : c2281h);
        }
    }

    /* JADX INFO: renamed from: dm1.a$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, m65681d2 = {"Ldm1/a$p;", "Ldm1/a;", "", "helpType", "", "fromTile", "source", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String helpType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean fromTile;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String helpType, boolean z4, String source) {
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

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return AbstractC22676k.m65745e(this.helpType, pVar.helpType) && this.fromTile == pVar.fromTile && AbstractC22676k.m65745e(this.source, pVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC2875y.m8289b(this.helpType.hashCode() * 31, 31, this.fromTile);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC25012a.m73379l("HelpEvent(helpType=", this.helpType, ", fromTile=", ", source=", this.fromTile));
        }

        public /* synthetic */ p(String str, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: dm1.a$s */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ldm1/a$s;", "Ldm1/a;", "Lcom/whoop/navigation/e;", "navigationAction", "", "actionArgument", "", "fromMyDay", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "c", "()Lcom/whoop/navigation/e;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object actionArgument;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(C9598e navigationAction, Object obj, boolean z4) {
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
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.navigationAction, sVar.navigationAction) && AbstractC22676k.m65745e(this.actionArgument, sVar.actionArgument) && this.fromMyDay == sVar.fromMyDay;
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
            StringBuilder sb4 = new StringBuilder("NavigationActionEvent(navigationAction=");
            sb4.append(c9598e);
            sb4.append(", actionArgument=");
            sb4.append(obj);
            sb4.append(", fromMyDay=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        public /* synthetic */ s(C9598e c9598e, Object obj, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c9598e, (i13 & 2) != 0 ? null : obj, (i13 & 4) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: dm1.a$x */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, m65681d2 = {"Ldm1/a$x;", "Ldm1/a;", "", "fromFab", "Lfm1/g;", "sourcePillar", "fromMyDay", "<init>", "(ZLfm1/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lfm1/g;", "c", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        public x(boolean z4, EnumC14603g enumC14603g, boolean z13) {
            super(null);
            this.fromFab = z4;
            this.sourcePillar = enumC14603g;
            this.fromMyDay = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return this.fromFab == xVar.fromFab && this.sourcePillar == xVar.sourcePillar && this.fromMyDay == xVar.fromMyDay;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromFab) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return Boolean.hashCode(this.fromMyDay) + ((iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31);
        }

        public String toString() {
            boolean z4 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            boolean z13 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("StartActivityEvent(fromFab=");
            sb4.append(z4);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", fromMyDay=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ x(boolean z4, EnumC14603g enumC14603g, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: dm1.a$y */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, m65681d2 = {"Ldm1/a$y;", "Ldm1/a;", "", "fromFab", "Lfm1/g;", "sourcePillar", "fromMyDay", "<init>", "(ZLfm1/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lfm1/g;", "c", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        public y(boolean z4, EnumC14603g enumC14603g, boolean z13) {
            super(null);
            this.fromFab = z4;
            this.sourcePillar = enumC14603g;
            this.fromMyDay = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof y)) {
                return false;
            }
            y yVar = (y) other;
            return this.fromFab == yVar.fromFab && this.sourcePillar == yVar.sourcePillar && this.fromMyDay == yVar.fromMyDay;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromFab) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return Boolean.hashCode(this.fromMyDay) + ((iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31);
        }

        public String toString() {
            boolean z4 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            boolean z13 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("StartActivityRevampEvent(fromFab=");
            sb4.append(z4);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", fromMyDay=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ y(boolean z4, EnumC14603g enumC14603g, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: dm1.a$z */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, m65681d2 = {"Ldm1/a$z;", "Ldm1/a;", "", "fromFab", "Lfm1/g;", "sourcePillar", "fromMyDay", "<init>", "(ZLfm1/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lfm1/g;", "c", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromMyDay;

        public z(boolean z4, EnumC14603g enumC14603g, boolean z13) {
            super(null);
            this.fromFab = z4;
            this.sourcePillar = enumC14603g;
            this.fromMyDay = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z)) {
                return false;
            }
            z zVar = (z) other;
            return this.fromFab == zVar.fromFab && this.sourcePillar == zVar.sourcePillar && this.fromMyDay == zVar.fromMyDay;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromFab) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return Boolean.hashCode(this.fromMyDay) + ((iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31);
        }

        public String toString() {
            boolean z4 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            boolean z13 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("StrengthTrainer(fromFab=");
            sb4.append(z4);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", fromMyDay=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ z(boolean z4, EnumC14603g enumC14603g, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: dm1.a$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\n\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006*"}, m65681d2 = {"Ldm1/a$b;", "Ldm1/a;", "Ljava/time/LocalDate;", "activityDate", "", "isSleepActivity", "fromFab", "Lfm1/g;", "sourcePillar", "isGdcFlow", "isMultiDayCycle", "", "activityInternalName", "fromMyDay", "<init>", "(Ljava/time/LocalDate;ZZLfm1/g;ZLjava/lang/Boolean;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Z", "g", "()Z", "c", "d", "Lfm1/g;", "e", "()Lfm1/g;", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate activityDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isSleepActivity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isGdcFlow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Boolean isMultiDayCycle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean fromMyDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocalDate activityDate, boolean z4, boolean z13, EnumC14603g enumC14603g, boolean z14, Boolean bool, String str, boolean z15) {
            super(null);
            AbstractC22676k.m65750j(activityDate, "activityDate");
            this.activityDate = activityDate;
            this.isSleepActivity = z4;
            this.fromFab = z13;
            this.sourcePillar = enumC14603g;
            this.isGdcFlow = z14;
            this.isMultiDayCycle = bool;
            this.activityInternalName = str;
            this.fromMyDay = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getActivityDate() {
            return this.activityDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.activityDate, bVar.activityDate) && this.isSleepActivity == bVar.isSleepActivity && this.fromFab == bVar.fromFab && this.sourcePillar == bVar.sourcePillar && this.isGdcFlow == bVar.isGdcFlow && AbstractC22676k.m65745e(this.isMultiDayCycle, bVar.isMultiDayCycle) && AbstractC22676k.m65745e(this.activityInternalName, bVar.activityInternalName) && this.fromMyDay == bVar.fromMyDay;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsGdcFlow() {
            return this.isGdcFlow;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsSleepActivity() {
            return this.isSleepActivity;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.activityDate.hashCode() * 31, 31, this.isSleepActivity), 31, this.fromFab);
            EnumC14603g enumC14603g = this.sourcePillar;
            int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31, 31, this.isGdcFlow);
            Boolean bool = this.isMultiDayCycle;
            int iHashCode = (iM8289b2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.activityInternalName;
            return Boolean.hashCode(this.fromMyDay) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            LocalDate localDate = this.activityDate;
            boolean z4 = this.isSleepActivity;
            boolean z13 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            boolean z14 = this.isGdcFlow;
            Boolean bool = this.isMultiDayCycle;
            String str = this.activityInternalName;
            boolean z15 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("AddActivityEvent(activityDate=");
            sb4.append(localDate);
            sb4.append(", isSleepActivity=");
            sb4.append(z4);
            sb4.append(", fromFab=");
            sb4.append(z13);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", isGdcFlow=");
            sb4.append(z14);
            sb4.append(", isMultiDayCycle=");
            sb4.append(bool);
            sb4.append(", activityInternalName=");
            return AbstractC21702c.m61137h(sb4, str, ", fromMyDay=", z15, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(LocalDate localDate, boolean z4, boolean z13, EnumC14603g enumC14603g, boolean z14, Boolean bool, String str, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i13 & 1) != 0) {
                localDate = LocalDate.now();
                AbstractC22676k.m65749i(localDate, "now(...)");
            }
            this(localDate, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : enumC14603g, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? Boolean.FALSE : bool, (i13 & 64) != 0 ? "" : str, (i13 & 128) != 0 ? false : z15);
        }
    }

    /* JADX INFO: renamed from: dm1.a$h0 */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b%\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b.\u0010'R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b1\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b*\u0010 ¨\u00062"}, m65681d2 = {"Ldm1/a$h0;", "Ldm1/a;", "", "fromFab", "Lfm1/g;", "sourcePillar", "", "cycleId", "", "lowerBound", "upperBound", "", "dayStrainValue", "", "recoveryScoreValue", "millisOfSleep", "calories", "isComplete", "fromMyDay", "<init>", "(ZLfm1/g;JLjava/lang/String;Ljava/lang/String;DIJIZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lfm1/g;", "i", "()Lfm1/g;", "c", "J", "()J", "Ljava/lang/String;", "f", "e", "j", "D", "()D", "g", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h0 extends AbstractC12177a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean fromFab;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g sourcePillar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String lowerBound;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String upperBound;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final double dayStrainValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int recoveryScoreValue;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final long millisOfSleep;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final int calories;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isComplete;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean fromMyDay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(boolean z4, EnumC14603g enumC14603g, long j7, String lowerBound, String upperBound, double d3, int i13, long j13, int i14, boolean z13, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(lowerBound, "lowerBound");
            AbstractC22676k.m65750j(upperBound, "upperBound");
            this.fromFab = z4;
            this.sourcePillar = enumC14603g;
            this.cycleId = j7;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.dayStrainValue = d3;
            this.recoveryScoreValue = i13;
            this.millisOfSleep = j13;
            this.calories = i14;
            this.isComplete = z13;
            this.fromMyDay = z14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCalories() {
            return this.calories;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getDayStrainValue() {
            return this.dayStrainValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFromFab() {
            return this.fromFab;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getFromMyDay() {
            return this.fromMyDay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) other;
            return this.fromFab == h0Var.fromFab && this.sourcePillar == h0Var.sourcePillar && this.cycleId == h0Var.cycleId && AbstractC22676k.m65745e(this.lowerBound, h0Var.lowerBound) && AbstractC22676k.m65745e(this.upperBound, h0Var.upperBound) && Double.compare(this.dayStrainValue, h0Var.dayStrainValue) == 0 && this.recoveryScoreValue == h0Var.recoveryScoreValue && this.millisOfSleep == h0Var.millisOfSleep && this.calories == h0Var.calories && this.isComplete == h0Var.isComplete && this.fromMyDay == h0Var.fromMyDay;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLowerBound() {
            return this.lowerBound;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getMillisOfSleep() {
            return this.millisOfSleep;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getRecoveryScoreValue() {
            return this.recoveryScoreValue;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.fromFab) * 31;
            EnumC14603g enumC14603g = this.sourcePillar;
            return Boolean.hashCode(this.fromMyDay) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.calories, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.recoveryScoreValue, AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30451e((iHashCode + (enumC14603g == null ? 0 : enumC14603g.hashCode())) * 31, this.cycleId, 31), 31, this.lowerBound), 31, this.upperBound), 31, this.dayStrainValue), 31), this.millisOfSleep, 31), 31), 31, this.isComplete);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC14603g getSourcePillar() {
            return this.sourcePillar;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getUpperBound() {
            return this.upperBound;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public String toString() {
            boolean z4 = this.fromFab;
            EnumC14603g enumC14603g = this.sourcePillar;
            long j7 = this.cycleId;
            String str = this.lowerBound;
            String str2 = this.upperBound;
            double d3 = this.dayStrainValue;
            int i13 = this.recoveryScoreValue;
            long j13 = this.millisOfSleep;
            int i14 = this.calories;
            boolean z13 = this.isComplete;
            boolean z14 = this.fromMyDay;
            StringBuilder sb4 = new StringBuilder("WhoopLiveEvent(fromFab=");
            sb4.append(z4);
            sb4.append(", sourcePillar=");
            sb4.append(enumC14603g);
            sb4.append(", cycleId=");
            sb4.append(j7);
            sb4.append(", lowerBound=");
            sb4.append(str);
            sb4.append(", upperBound=");
            sb4.append(str2);
            sb4.append(", dayStrainValue=");
            sb4.append(d3);
            sb4.append(", recoveryScoreValue=");
            sb4.append(i13);
            AbstractC2875y.m8285A(sb4, ", millisOfSleep=", j13, ", calories=");
            AbstractC13673n.m38573t(i14, ", isComplete=", ", fromMyDay=", sb4, z13);
            return AbstractC18489d0.m53372m(sb4, z14, ")");
        }

        public /* synthetic */ h0(boolean z4, EnumC14603g enumC14603g, long j7, String str, String str2, double d3, int i13, long j13, int i14, boolean z13, boolean z14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? false : z4, (i15 & 2) != 0 ? null : enumC14603g, j7, (i15 & 8) != 0 ? "" : str, (i15 & 16) != 0 ? "" : str2, (i15 & 32) != 0 ? 0.0d : d3, (i15 & 64) != 0 ? -1 : i13, (i15 & 128) != 0 ? -1L : j13, (i15 & 256) != 0 ? -1 : i14, (i15 & 512) != 0 ? false : z13, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14);
        }
    }
}
