package oo1;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualCycleInsightsResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.navigation.C9598e;
import h91.C17027b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: oo1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/f;", "", "<init>", "()V", "b", "f", "d", "e", "c", "a", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Loo1/f$a;", "Loo1/f$b;", "Loo1/f$c;", "Loo1/f$d;", "Loo1/f$e;", "Loo1/f$f;", "Loo1/f$g;", "Loo1/f$h;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28060f {

    /* JADX INFO: renamed from: oo1.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, m65681d2 = {"Loo1/f$a;", "Loo1/f;", "", "error", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "b", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28060f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error, String date) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(date, "date");
            this.error = error;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.error, aVar.error) && AbstractC22676k.m65745e(this.date, aVar.date);
        }

        public int hashCode() {
            return this.date.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Error(error=", this.error, ", date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: oo1.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/f$b;", "Loo1/f;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28060f {

        /* JADX INFO: renamed from: a */
        public static final b f113295a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.f$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/f$c;", "Loo1/f;", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28060f {

        /* JADX INFO: renamed from: b */
        public static final int f113296b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9598e destination) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.destination, ((c) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("Navigate(destination=", this.destination, ")");
        }
    }

    /* JADX INFO: renamed from: oo1.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/f$d;", "Loo1/f;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC28060f {

        /* JADX INFO: renamed from: a */
        public static final d f113298a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.f$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Loo1/f$e;", "Loo1/f;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC28060f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.date, ((e) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SaveSuccess(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: oo1.f$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/f$f;", "Loo1/f;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC28060f {

        /* JADX INFO: renamed from: a */
        public static final f f113300a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oo1.f$h */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Loo1/f$h;", "Loo1/f;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "response", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", HttpHeaders.DATE, "", "index", "", "isPollingActive", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "d", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "b", "Lh91/b;", "()Lh91/b;", "c", "Ljava/lang/String;", "I", "e", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC28060f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MenstrualCycleInsightsResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17027b<CalendarDateModel> calendarDomainState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isPollingActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MenstrualCycleInsightsResponse response, C17027b<CalendarDateModel> calendarDomainState, String date, int i13, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
            AbstractC22676k.m65750j(date, "date");
            this.response = response;
            this.calendarDomainState = calendarDomainState;
            this.date = date;
            this.index = i13;
            this.isPollingActive = z4;
        }

        /* JADX INFO: renamed from: a */
        public final C17027b<CalendarDateModel> m84769a() {
            return this.calendarDomainState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final MenstrualCycleInsightsResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsPollingActive() {
            return this.isPollingActive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.response, hVar.response) && AbstractC22676k.m65745e(this.calendarDomainState, hVar.calendarDomainState) && AbstractC22676k.m65745e(this.date, hVar.date) && this.index == hVar.index && this.isPollingActive == hVar.isPollingActive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPollingActive) + AbstractC11266d.m30448b(this.index, AbstractC11266d.m30450d((this.calendarDomainState.hashCode() + (this.response.hashCode() * 31)) * 31, 31, this.date), 31);
        }

        public String toString() {
            MenstrualCycleInsightsResponse menstrualCycleInsightsResponse = this.response;
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            String str = this.date;
            int i13 = this.index;
            boolean z4 = this.isPollingActive;
            StringBuilder sb4 = new StringBuilder("Updating(response=");
            sb4.append(menstrualCycleInsightsResponse);
            sb4.append(", calendarDomainState=");
            sb4.append(c17027b);
            sb4.append(", date=");
            AbstractC11266d.m30470x(i13, str, ", index=", ", isPollingActive=", sb4);
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    public /* synthetic */ AbstractC28060f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28060f() {
    }

    /* JADX INFO: renamed from: oo1.f$g */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR!\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Loo1/f$g;", "Loo1/f;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "response", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", HttpHeaders.DATE, "", "index", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "symptomsScreenResponse", "", "isPollingActive", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Z)V", "a", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;Z)Loo1/f$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "f", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "b", "Lh91/b;", "c", "()Lh91/b;", "Ljava/lang/String;", "d", "I", "e", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "g", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC28060f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MenstrualCycleInsightsResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17027b<CalendarDateModel> calendarDomainState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final SymptomsScreenResponse symptomsScreenResponse;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isPollingActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MenstrualCycleInsightsResponse response, C17027b<CalendarDateModel> calendarDomainState, String date, int i13, SymptomsScreenResponse symptomsScreenResponse, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
            AbstractC22676k.m65750j(date, "date");
            this.response = response;
            this.calendarDomainState = calendarDomainState;
            this.date = date;
            this.index = i13;
            this.symptomsScreenResponse = symptomsScreenResponse;
            this.isPollingActive = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ g m84761b(g gVar, MenstrualCycleInsightsResponse menstrualCycleInsightsResponse, C17027b c17027b, String str, int i13, SymptomsScreenResponse symptomsScreenResponse, boolean z4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                menstrualCycleInsightsResponse = gVar.response;
            }
            if ((i14 & 2) != 0) {
                c17027b = gVar.calendarDomainState;
            }
            if ((i14 & 4) != 0) {
                str = gVar.date;
            }
            if ((i14 & 8) != 0) {
                i13 = gVar.index;
            }
            if ((i14 & 16) != 0) {
                symptomsScreenResponse = gVar.symptomsScreenResponse;
            }
            if ((i14 & 32) != 0) {
                z4 = gVar.isPollingActive;
            }
            SymptomsScreenResponse symptomsScreenResponse2 = symptomsScreenResponse;
            boolean z13 = z4;
            return gVar.m84762a(menstrualCycleInsightsResponse, c17027b, str, i13, symptomsScreenResponse2, z13);
        }

        /* JADX INFO: renamed from: a */
        public final g m84762a(MenstrualCycleInsightsResponse response, C17027b<CalendarDateModel> calendarDomainState, String date, int index, SymptomsScreenResponse symptomsScreenResponse, boolean isPollingActive) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
            AbstractC22676k.m65750j(date, "date");
            return new g(response, calendarDomainState, date, index, symptomsScreenResponse, isPollingActive);
        }

        /* JADX INFO: renamed from: c */
        public final C17027b<CalendarDateModel> m84763c() {
            return this.calendarDomainState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.response, gVar.response) && AbstractC22676k.m65745e(this.calendarDomainState, gVar.calendarDomainState) && AbstractC22676k.m65745e(this.date, gVar.date) && this.index == gVar.index && AbstractC22676k.m65745e(this.symptomsScreenResponse, gVar.symptomsScreenResponse) && this.isPollingActive == gVar.isPollingActive;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final MenstrualCycleInsightsResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final SymptomsScreenResponse getSymptomsScreenResponse() {
            return this.symptomsScreenResponse;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsPollingActive() {
            return this.isPollingActive;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.index, AbstractC11266d.m30450d((this.calendarDomainState.hashCode() + (this.response.hashCode() * 31)) * 31, 31, this.date), 31);
            SymptomsScreenResponse symptomsScreenResponse = this.symptomsScreenResponse;
            return Boolean.hashCode(this.isPollingActive) + ((iM30448b + (symptomsScreenResponse == null ? 0 : symptomsScreenResponse.hashCode())) * 31);
        }

        public String toString() {
            MenstrualCycleInsightsResponse menstrualCycleInsightsResponse = this.response;
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            String str = this.date;
            int i13 = this.index;
            SymptomsScreenResponse symptomsScreenResponse = this.symptomsScreenResponse;
            boolean z4 = this.isPollingActive;
            StringBuilder sb4 = new StringBuilder("Success(response=");
            sb4.append(menstrualCycleInsightsResponse);
            sb4.append(", calendarDomainState=");
            sb4.append(c17027b);
            sb4.append(", date=");
            AbstractC11266d.m30470x(i13, str, ", index=", ", symptomsScreenResponse=", sb4);
            sb4.append(symptomsScreenResponse);
            sb4.append(", isPollingActive=");
            sb4.append(z4);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ g(MenstrualCycleInsightsResponse menstrualCycleInsightsResponse, C17027b c17027b, String str, int i13, SymptomsScreenResponse symptomsScreenResponse, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(menstrualCycleInsightsResponse, c17027b, str, i13, (i14 & 16) != 0 ? null : symptomsScreenResponse, (i14 & 32) != 0 ? false : z4);
        }
    }
}
