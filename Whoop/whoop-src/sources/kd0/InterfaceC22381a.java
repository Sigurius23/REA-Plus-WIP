package kd0;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import jh3.AbstractC21702c;
import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import vw2.InterfaceC36546a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: kd0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:<\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=\u0082\u0001\u0004>?@A¨\u0006BÀ\u0006\u0003"}, m65681d2 = {"Lkd0/a;", "", "f1", "k0", "o0", "p0", "j0", "r", "a0", "t", "i0", "y", "d", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "h1", "z", "x", "i", "c", "q", "p", "o", "w0", "x0", "v0", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "b", "c1", "b1", "e", "f", "a", "u", "v", "g", "m", "n", "k", "d1", "l0", "m0", "e1", "g1", "r0", "b0", "f0", "d0", "e0", "h0", "g0", "c0", "z0", "y0", "s", "q0", "s0", "t0", "n0", "u0", "a1", "Lkd0/a$c;", "Lkd0/a$i;", "Lkd0/a$a0;", "Lkd0/a$f1;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22381a {

    /* JADX INFO: renamed from: kd0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$a;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public static final a f87385a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$a0 */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lkd0/a$a0;", "Lkd0/a;", "Lkd0/a$d;", "Lkd0/a$h;", "Lkd0/a$j;", "Lkd0/a$t;", "Lkd0/a$y;", "Lkd0/a$z;", "Lkd0/a$i0;", "Lkd0/a$h1;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a0 extends InterfaceC22381a {
    }

    /* JADX INFO: renamed from: kd0.a$a1 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$a1;", "Lkd0/a$c;", "", "biomarkerId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a1 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        public a1(String str) {
            this.biomarkerId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a1) && AbstractC22676k.m65745e(this.biomarkerId, ((a1) other).biomarkerId);
        }

        public int hashCode() {
            String str = this.biomarkerId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TrendScrub(biomarkerId=", this.biomarkerId, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$b;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public static final b f87387a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$b0 */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkd0/a$b0;", "Lkd0/a$c;", "", "source", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public b0(String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.source = str;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
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
            return AbstractC22676k.m65745e(this.source, b0Var.source) && AbstractC22676k.m65745e(this.analyticsData, b0Var.analyticsData);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            return iHashCode + (advancedLabsAnalyticsDomainModel != null ? advancedLabsAnalyticsDomainModel.hashCode() : 0);
        }

        public String toString() {
            return "OpenALH(source=" + this.source + ", analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$b1 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$b1;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b1 implements c {

        /* JADX INFO: renamed from: a */
        public static final b1 f87390a = new b1();

        private b1() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$c */
    @Metadata(m65680d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001,\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006.À\u0006\u0003"}, m65681d2 = {"Lkd0/a$c;", "Lkd0/a;", "Lkd0/a$a;", "Lkd0/a$b;", "Lkd0/a$e;", "Lkd0/a$f;", "Lkd0/a$g;", "Lkd0/a$k;", "Lkd0/a$l;", "Lkd0/a$m;", "Lkd0/a$n;", "Lkd0/a$o;", "Lkd0/a$p;", "Lkd0/a$q;", "Lkd0/a$s;", "Lkd0/a$u;", "Lkd0/a$v;", "Lkd0/a$w;", "Lkd0/a$x;", "Lkd0/a$b0;", "Lkd0/a$c0;", "Lkd0/a$d0;", "Lkd0/a$e0;", "Lkd0/a$f0;", "Lkd0/a$g0;", "Lkd0/a$h0;", "Lkd0/a$l0;", "Lkd0/a$m0;", "Lkd0/a$n0;", "Lkd0/a$o0;", "Lkd0/a$q0;", "Lkd0/a$r0;", "Lkd0/a$s0;", "Lkd0/a$t0;", "Lkd0/a$u0;", "Lkd0/a$v0;", "Lkd0/a$w0;", "Lkd0/a$x0;", "Lkd0/a$y0;", "Lkd0/a$z0;", "Lkd0/a$a1;", "Lkd0/a$b1;", "Lkd0/a$c1;", "Lkd0/a$d1;", "Lkd0/a$e1;", "Lkd0/a$g1;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c extends InterfaceC22381a {
    }

    /* JADX INFO: renamed from: kd0.a$c0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$c0;", "Lkd0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public c0(AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c0) && AbstractC22676k.m65745e(this.analyticsData, ((c0) other).analyticsData);
        }

        public int hashCode() {
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            if (advancedLabsAnalyticsDomainModel == null) {
                return 0;
            }
            return advancedLabsAnalyticsDomainModel.hashCode();
        }

        public String toString() {
            return "OpenActionPlan(analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$c1 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$c1;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c1 implements c {

        /* JADX INFO: renamed from: a */
        public static final c1 f87392a = new c1();

        private c1() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$d;", "Lkd0/a$a0;", "Lm91/u;", "itemViewState", "<init>", "(Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements a0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25312u itemViewState;

        public d(InterfaceC25312u itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.itemViewState, ((d) other).itemViewState);
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC38963t7.m124379i(this.itemViewState, "AppDrivenNavigation(itemViewState=", ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$d0 */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lkd0/a$d0;", "Lkd0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "", "source", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "b", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public d0(AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str) {
            this.analyticsData = advancedLabsAnalyticsDomainModel;
            this.source = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) other;
            return AbstractC22676k.m65745e(this.analyticsData, d0Var.analyticsData) && AbstractC22676k.m65745e(this.source, d0Var.source);
        }

        public int hashCode() {
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            int iHashCode = (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "OpenBiomarkerDetail(analyticsData=" + this.analyticsData + ", source=" + this.source + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$d1 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$d1;", "Lkd0/a$c;", "", "biomarkersEditedCount", "biomarkersEditedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d1 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkersEditedCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkersEditedNames;

        public d1(String str, String str2) {
            this.biomarkersEditedCount = str;
            this.biomarkersEditedNames = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkersEditedCount() {
            return this.biomarkersEditedCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkersEditedNames() {
            return this.biomarkersEditedNames;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d1)) {
                return false;
            }
            d1 d1Var = (d1) other;
            return AbstractC22676k.m65745e(this.biomarkersEditedCount, d1Var.biomarkersEditedCount) && AbstractC22676k.m65745e(this.biomarkersEditedNames, d1Var.biomarkersEditedNames);
        }

        public int hashCode() {
            String str = this.biomarkersEditedCount;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.biomarkersEditedNames;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ValidationComplete(biomarkersEditedCount=", this.biomarkersEditedCount, ", biomarkersEditedNames=", this.biomarkersEditedNames, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$e;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements c {

        /* JADX INFO: renamed from: a */
        public static final e f87398a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$e0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$e0;", "Lkd0/a$c;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public e0(int i13) {
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
            return (other instanceof e0) && this.index == ((e0) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "OpenBiomarkerDetailFAQ(index=", ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$e1 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$e1;", "Lkd0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e1 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public e1(AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e1) && AbstractC22676k.m65745e(this.analyticsData, ((e1) other).analyticsData);
        }

        public int hashCode() {
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            if (advancedLabsAnalyticsDomainModel == null) {
                return 0;
            }
            return advancedLabsAnalyticsDomainModel.hashCode();
        }

        public String toString() {
            return "ViewAllTests(analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$f;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements c {

        /* JADX INFO: renamed from: a */
        public static final f f87401a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$f0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$f0;", "Lkd0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public f0(AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f0) && AbstractC22676k.m65745e(this.analyticsData, ((f0) other).analyticsData);
        }

        public int hashCode() {
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            if (advancedLabsAnalyticsDomainModel == null) {
                return 0;
            }
            return advancedLabsAnalyticsDomainModel.hashCode();
        }

        public String toString() {
            return "OpenBiomarkerSummary(analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$f1 */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lkd0/a$f1;", "Lkd0/a;", "Lkd0/a$r;", "Lkd0/a$j0;", "Lkd0/a$k0;", "Lkd0/a$o0;", "Lkd0/a$p0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface f1 extends InterfaceC22381a {
    }

    /* JADX INFO: renamed from: kd0.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$g;", "Lkd0/a$c;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public g(String source) {
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.source, ((g) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AppointmentRescheduleStart(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$g0 */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkd0/a$g0;", "Lkd0/a$c;", "", "source", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public g0(String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.source = str;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) other;
            return AbstractC22676k.m65745e(this.source, g0Var.source) && AbstractC22676k.m65745e(this.analyticsData, g0Var.analyticsData);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            return iHashCode + (advancedLabsAnalyticsDomainModel != null ? advancedLabsAnalyticsDomainModel.hashCode() : 0);
        }

        public String toString() {
            return "OpenInsightDetail(source=" + this.source + ", analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$g1 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$g1;", "Lkd0/a$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g1 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public g1(AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g1) && AbstractC22676k.m65745e(this.analyticsData, ((g1) other).analyticsData);
        }

        public int hashCode() {
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            if (advancedLabsAnalyticsDomainModel == null) {
                return 0;
            }
            return advancedLabsAnalyticsDomainModel.hashCode();
        }

        public String toString() {
            return "ViewSingleTest(analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$h;", "Lkd0/a$a0;", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", QueryParams.URL, "<init>", "(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements a0 {

        /* JADX INFO: renamed from: b */
        public static final int f87407b = ArticleTileModelEvent.Url.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ArticleTileModelEvent.Url url;

        public h(ArticleTileModelEvent.Url url) {
            AbstractC22676k.m65750j(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ArticleTileModelEvent.Url getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.url, ((h) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "ArticleTileClicked(url=" + this.url + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$h0 */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkd0/a$h0;", "Lkd0/a$c;", "", "source", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analyticsData", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AdvancedLabsAnalyticsDomainModel analyticsData;

        public h0(String str, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
            this.source = str;
            this.analyticsData = advancedLabsAnalyticsDomainModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvancedLabsAnalyticsDomainModel getAnalyticsData() {
            return this.analyticsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) other;
            return AbstractC22676k.m65745e(this.source, h0Var.source) && AbstractC22676k.m65745e(this.analyticsData, h0Var.analyticsData);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analyticsData;
            return iHashCode + (advancedLabsAnalyticsDomainModel != null ? advancedLabsAnalyticsDomainModel.hashCode() : 0);
        }

        public String toString() {
            return "OpenInsights(source=" + this.source + ", analyticsData=" + this.analyticsData + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$h1 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$h1;", "Lkd0/a$a0;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h1 implements a0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        public h1(String message) {
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
            return (other instanceof h1) && AbstractC22676k.m65745e(this.message, ((h1) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("WhoopCoachClicked(message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$i;", "Lkd0/a;", "Lvw2/a;", "actionViewEvent", "<init>", "(Lvw2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvw2/a;", "()Lvw2/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC22381a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC36546a actionViewEvent;

        public i(InterfaceC36546a actionViewEvent) {
            AbstractC22676k.m65750j(actionViewEvent, "actionViewEvent");
            this.actionViewEvent = actionViewEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC36546a getActionViewEvent() {
            return this.actionViewEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.actionViewEvent, ((i) other).actionViewEvent);
        }

        public int hashCode() {
            return this.actionViewEvent.hashCode();
        }

        public String toString() {
            return "BackendDrivenAction(actionViewEvent=" + this.actionViewEvent + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$i0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$i0;", "Lkd0/a$a0;", "Lj02/s;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lj02/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/s;", "()Lj02/s;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i0 implements a0 {

        /* JADX INFO: renamed from: b */
        public static final int f87413b = C21166s.f80697d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21166s event;

        public i0(C21166s event) {
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21166s getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i0) && AbstractC22676k.m65745e(this.event, ((i0) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "PerformDismissEvent(event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$j;", "Lkd0/a$a0;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements a0 {

        /* JADX INFO: renamed from: b */
        public static final int f87415b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public j(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.navAction, ((j) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$j0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$j0;", "Lkd0/a$f1;", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j0 implements f1 {

        /* JADX INFO: renamed from: b */
        public static final int f87417b = AnyModal.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AnyModal modal;

        public j0(AnyModal modal) {
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j0) && AbstractC22676k.m65745e(this.modal, ((j0) other).modal);
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("PresentModal(modal=", ")", this.modal);
        }
    }

    /* JADX INFO: renamed from: kd0.a$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$k;", "Lkd0/a$c;", "", "biomarkersAddedCount", "biomarkersAddedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkersAddedCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkersAddedNames;

        public k(String biomarkersAddedCount, String biomarkersAddedNames) {
            AbstractC22676k.m65750j(biomarkersAddedCount, "biomarkersAddedCount");
            AbstractC22676k.m65750j(biomarkersAddedNames, "biomarkersAddedNames");
            this.biomarkersAddedCount = biomarkersAddedCount;
            this.biomarkersAddedNames = biomarkersAddedNames;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkersAddedCount() {
            return this.biomarkersAddedCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkersAddedNames() {
            return this.biomarkersAddedNames;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.biomarkersAddedCount, kVar.biomarkersAddedCount) && AbstractC22676k.m65745e(this.biomarkersAddedNames, kVar.biomarkersAddedNames);
        }

        public int hashCode() {
            return this.biomarkersAddedNames.hashCode() + (this.biomarkersAddedCount.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("BiomarkerAddSaved(biomarkersAddedCount=", this.biomarkersAddedCount, ", biomarkersAddedNames=", this.biomarkersAddedNames, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$k0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$k0;", "Lkd0/a$f1;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements f1 {

        /* JADX INFO: renamed from: a */
        public static final k0 f87421a = new k0();

        private k0() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$l;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements c {

        /* JADX INFO: renamed from: a */
        public static final l f87422a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$l0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lkd0/a$l0;", "Lkd0/a$c;", "", "cityCode", "", "hasUpchargeWarning", "testType", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cityCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasUpchargeWarning;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String testType;

        public l0(String cityCode, boolean z4, String str) {
            AbstractC22676k.m65750j(cityCode, "cityCode");
            this.cityCode = cityCode;
            this.hasUpchargeWarning = z4;
            this.testType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCityCode() {
            return this.cityCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasUpchargeWarning() {
            return this.hasUpchargeWarning;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) other;
            return AbstractC22676k.m65745e(this.cityCode, l0Var.cityCode) && this.hasUpchargeWarning == l0Var.hasUpchargeWarning && AbstractC22676k.m65745e(this.testType, l0Var.testType);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.cityCode.hashCode() * 31, 31, this.hasUpchargeWarning);
            String str = this.testType;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.testType, ")", AbstractC25012a.m73379l("SchedulingZipEntered(cityCode=", this.cityCode, ", hasUpchargeWarning=", ", testType=", this.hasUpchargeWarning));
        }
    }

    /* JADX INFO: renamed from: kd0.a$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$m;", "Lkd0/a$c;", "", "biomarkersEditedCount", "biomarkersEditedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkersEditedCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkersEditedNames;

        public m(String biomarkersEditedCount, String biomarkersEditedNames) {
            AbstractC22676k.m65750j(biomarkersEditedCount, "biomarkersEditedCount");
            AbstractC22676k.m65750j(biomarkersEditedNames, "biomarkersEditedNames");
            this.biomarkersEditedCount = biomarkersEditedCount;
            this.biomarkersEditedNames = biomarkersEditedNames;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkersEditedCount() {
            return this.biomarkersEditedCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkersEditedNames() {
            return this.biomarkersEditedNames;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.biomarkersEditedCount, mVar.biomarkersEditedCount) && AbstractC22676k.m65745e(this.biomarkersEditedNames, mVar.biomarkersEditedNames);
        }

        public int hashCode() {
            return this.biomarkersEditedNames.hashCode() + (this.biomarkersEditedCount.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("BiomarkerEditSaved(biomarkersEditedCount=", this.biomarkersEditedCount, ", biomarkersEditedNames=", this.biomarkersEditedNames, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$m0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$m0;", "Lkd0/a$c;", "", "cityCode", "testType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cityCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testType;

        public m0(String cityCode, String str) {
            AbstractC22676k.m65750j(cityCode, "cityCode");
            this.cityCode = cityCode;
            this.testType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCityCode() {
            return this.cityCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m0)) {
                return false;
            }
            m0 m0Var = (m0) other;
            return AbstractC22676k.m65745e(this.cityCode, m0Var.cityCode) && AbstractC22676k.m65745e(this.testType, m0Var.testType);
        }

        public int hashCode() {
            int iHashCode = this.cityCode.hashCode() * 31;
            String str = this.testType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("SchedulingZipError(cityCode=", this.cityCode, ", testType=", this.testType, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$n;", "Lkd0/a$c;", "", "biomarkersRemovedCount", "biomarkersRemovedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkersRemovedCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String biomarkersRemovedNames;

        public n(String biomarkersRemovedCount, String biomarkersRemovedNames) {
            AbstractC22676k.m65750j(biomarkersRemovedCount, "biomarkersRemovedCount");
            AbstractC22676k.m65750j(biomarkersRemovedNames, "biomarkersRemovedNames");
            this.biomarkersRemovedCount = biomarkersRemovedCount;
            this.biomarkersRemovedNames = biomarkersRemovedNames;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkersRemovedCount() {
            return this.biomarkersRemovedCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiomarkersRemovedNames() {
            return this.biomarkersRemovedNames;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return AbstractC22676k.m65745e(this.biomarkersRemovedCount, nVar.biomarkersRemovedCount) && AbstractC22676k.m65745e(this.biomarkersRemovedNames, nVar.biomarkersRemovedNames);
        }

        public int hashCode() {
            return this.biomarkersRemovedNames.hashCode() + (this.biomarkersRemovedCount.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("BiomarkerRemoveSaved(biomarkersRemovedCount=", this.biomarkersRemovedCount, ", biomarkersRemovedNames=", this.biomarkersRemovedNames, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$n0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$n0;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 implements c {

        /* JADX INFO: renamed from: a */
        public static final n0 f87432a = new n0();

        private n0() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$o;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements c {

        /* JADX INFO: renamed from: a */
        public static final o f87433a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$o0 */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lkd0/a$o0;", "Lkd0/a$f1;", "Lkd0/a$c;", "", "selectedSegmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o0 implements f1, c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSegmentId;

        public o0(String selectedSegmentId) {
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.selectedSegmentId = selectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o0) && AbstractC22676k.m65745e(this.selectedSegmentId, ((o0) other).selectedSegmentId);
        }

        public int hashCode() {
            return this.selectedSegmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SegmentSelected(selectedSegmentId=", this.selectedSegmentId, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$p;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements c {

        /* JADX INFO: renamed from: a */
        public static final p f87435a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$p0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$p0;", "Lkd0/a$f1;", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "bottomSheet", "<init>", "(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p0 implements f1 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AppointmentSummaryBottomSheet bottomSheet;

        public p0(AppointmentSummaryBottomSheet bottomSheet) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            this.bottomSheet = bottomSheet;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AppointmentSummaryBottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p0) && AbstractC22676k.m65745e(this.bottomSheet, ((p0) other).bottomSheet);
        }

        public int hashCode() {
            return this.bottomSheet.hashCode();
        }

        public String toString() {
            return "ShowAppointmentSummaryBottomSheet(bottomSheet=" + this.bottomSheet + ")";
        }
    }

    /* JADX INFO: renamed from: kd0.a$q */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$q;", "Lkd0/a$c;", "", "index", "articleTile", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String articleTile;

        public q(String str, String articleTile) {
            AbstractC22676k.m65750j(articleTile, "articleTile");
            this.index = str;
            this.articleTile = articleTile;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getArticleTile() {
            return this.articleTile;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return AbstractC22676k.m65745e(this.index, qVar.index) && AbstractC22676k.m65745e(this.articleTile, qVar.articleTile);
        }

        public int hashCode() {
            String str = this.index;
            return this.articleTile.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ClickHomeLearnMore(index=", this.index, ", articleTile=", this.articleTile, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$q0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$q0;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 implements c {

        /* JADX INFO: renamed from: a */
        public static final q0 f87439a = new q0();

        private q0() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$r;", "Lkd0/a$f1;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements f1 {

        /* JADX INFO: renamed from: a */
        public static final r f87440a = new r();

        private r() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$r0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$r0;", "Lkd0/a$c;", "", "source", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        public r0(String str, String str2) {
            this.source = str;
            this.label = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r0)) {
                return false;
            }
            r0 r0Var = (r0) other;
            return AbstractC22676k.m65745e(this.source, r0Var.source) && AbstractC22676k.m65745e(this.label, r0Var.label);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("StartWorkflow(source=", this.source, ", label=", this.label, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$s;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements c {

        /* JADX INFO: renamed from: a */
        public static final s f87443a = new s();

        private s() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$s0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$s0;", "Lkd0/a$c;", "", "selectedSegmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSegmentId;

        public s0(String selectedSegmentId) {
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.selectedSegmentId = selectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s0) && AbstractC22676k.m65745e(this.selectedSegmentId, ((s0) other).selectedSegmentId);
        }

        public int hashCode() {
            return this.selectedSegmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("StickyButtonClicked(selectedSegmentId=", this.selectedSegmentId, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$t */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$t;", "Lkd0/a$a0;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements a0 {

        /* JADX INFO: renamed from: a */
        public static final t f87445a = new t();

        private t() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$t0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkd0/a$t0;", "Lkd0/a$c;", "", "testimonialId", HMSTrackSource.SCREEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testimonialId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screen;

        public t0(String testimonialId, String screen) {
            AbstractC22676k.m65750j(testimonialId, "testimonialId");
            AbstractC22676k.m65750j(screen, "screen");
            this.testimonialId = testimonialId;
            this.screen = screen;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestimonialId() {
            return this.testimonialId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t0)) {
                return false;
            }
            t0 t0Var = (t0) other;
            return AbstractC22676k.m65745e(this.testimonialId, t0Var.testimonialId) && AbstractC22676k.m65745e(this.screen, t0Var.screen);
        }

        public int hashCode() {
            return this.screen.hashCode() + (this.testimonialId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SwipeTestimonial(testimonialId=", this.testimonialId, ", screen=", this.screen, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$u */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$u;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements c {

        /* JADX INFO: renamed from: a */
        public static final u f87448a = new u();

        private u() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$u0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$u0;", "Lkd0/a$c;", "", "editType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String editType;

        public u0(String editType) {
            AbstractC22676k.m65750j(editType, "editType");
            this.editType = editType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEditType() {
            return this.editType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof u0) && AbstractC22676k.m65745e(this.editType, ((u0) other).editType);
        }

        public int hashCode() {
            return this.editType.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TestContextEdit(editType=", this.editType, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$v */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$v;", "Lkd0/a$c;", "", "label", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class v implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        public v(String label) {
            AbstractC22676k.m65750j(label, "label");
            this.label = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof v) && AbstractC22676k.m65745e(this.label, ((v) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("HealthspanImpactToggleCard(label=", this.label, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$v0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$v0;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v0 implements c {

        /* JADX INFO: renamed from: a */
        public static final v0 f87451a = new v0();

        private v0() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$w */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$w;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements c {

        /* JADX INFO: renamed from: a */
        public static final w f87452a = new w();

        private w() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$w0 */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$w0;", "Lkd0/a$c;", "", "testType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class w0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testType;

        public w0(String str) {
            this.testType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof w0) && AbstractC22676k.m65745e(this.testType, ((w0) other).testType);
        }

        public int hashCode() {
            String str = this.testType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TestDownload(testType=", this.testType, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$x */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkd0/a$x;", "", "Lkd0/a$c;", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "a", "(Ljava/lang/Object;Lm91/u;)Lkd0/a$x;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lm91/u;", "c", "()Lm91/u;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x implements InterfaceC22381a, c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        public x(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ x m64343b(x xVar, Object obj, InterfaceC25312u interfaceC25312u, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                obj = xVar.event;
            }
            if ((i13 & 2) != 0) {
                interfaceC25312u = xVar.element;
            }
            return xVar.m64344a(obj, interfaceC25312u);
        }

        /* JADX INFO: renamed from: a */
        public final x m64344a(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            return new x(event, element);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC25312u getElement() {
            return this.element;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return AbstractC22676k.m65745e(this.event, xVar.event) && AbstractC22676k.m65745e(this.element, xVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$x0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$x0;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x0 implements c {

        /* JADX INFO: renamed from: a */
        public static final x0 f87456a = new x0();

        private x0() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$y */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$y;", "Lkd0/a$a0;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements a0 {

        /* JADX INFO: renamed from: a */
        public static final y f87457a = new y();

        private y() {
        }
    }

    /* JADX INFO: renamed from: kd0.a$y0 */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lkd0/a$y0;", "Lkd0/a$c;", "", "isExpanded", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class y0 implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isExpanded;

        public y0(boolean z4) {
            this.isExpanded = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof y0) && this.isExpanded == ((y0) other).isExpanded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isExpanded);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleUpdated(isExpanded=", ")", this.isExpanded);
        }
    }

    /* JADX INFO: renamed from: kd0.a$z */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkd0/a$z;", "Lkd0/a$a0;", "", "trendId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z implements a0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String trendId;

        public z(String trendId) {
            AbstractC22676k.m65750j(trendId, "trendId");
            this.trendId = trendId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTrendId() {
            return this.trendId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z) && AbstractC22676k.m65745e(this.trendId, ((z) other).trendId);
        }

        public int hashCode() {
            return this.trendId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToTrend(trendId=", this.trendId, ")");
        }
    }

    /* JADX INFO: renamed from: kd0.a$z0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd0/a$z0;", "Lkd0/a$c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z0 implements c {

        /* JADX INFO: renamed from: a */
        public static final z0 f87460a = new z0();

        private z0() {
        }
    }
}
