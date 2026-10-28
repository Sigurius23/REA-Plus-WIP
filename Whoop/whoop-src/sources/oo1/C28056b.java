package oo1;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarErrorType;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodRequest;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import ih0.AbstractC18489d0;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import nh3.AbstractC26725a;
import od1.InterfaceC27844g;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: oo1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003!%#B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u001b\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Loo1/b;", "Lod1/g;", "Loo1/a;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lzr2/a;Ltr2/n;Ljava/util/Locale;)V", "", HttpHeaders.DATE, "source", "Lec3/l;", "Loo1/b$c;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Loo1/b$b;", "prev", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "response", "k", "(Loo1/b$b;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;)Loo1/b$b;", "state", "j", "(Loo1/b$b;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Lzr2/a;", "c", "Ltr2/n;", "d", "Ljava/util/Locale;", "e", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28056b implements InterfaceC27844g<AbstractC28055a, LogCalendarDomainState> {

    /* JADX INFO: renamed from: f */
    public static final int f113210f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: oo1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Loo1/b$c;", "", "<init>", "()V", "c", "d", "b", "a", "Loo1/b$c$a;", "Loo1/b$c$b;", "Loo1/b$c$c;", "Loo1/b$c$d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: oo1.b$c$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/b$c$a;", "Loo1/b$c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a */
            public static final a f113220a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: oo1.b$c$b */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Loo1/b$c$b;", "Loo1/b$c;", "", HttpHeaders.DATE, "", "selected", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String date;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean selected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String date, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(date, "date");
                this.date = date;
                this.selected = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDate() {
                return this.date;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.date, bVar.date) && this.selected == bVar.selected;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selected) + (this.date.hashCode() * 31);
            }

            public String toString() {
                return AbstractC26725a.m79503g("SelectDate(date=", this.date, ", selected=", ")", this.selected);
            }
        }

        /* JADX INFO: renamed from: oo1.b$c$c, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/b$c$c;", "Loo1/b$c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "networkState", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42127c extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final LogCalendarNetworkState networkState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42127c(LogCalendarNetworkState networkState) {
                super(null);
                AbstractC22676k.m65750j(networkState, "networkState");
                this.networkState = networkState;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LogCalendarNetworkState getNetworkState() {
                return this.networkState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42127c) && AbstractC22676k.m65745e(this.networkState, ((C42127c) other).networkState);
            }

            public int hashCode() {
                return this.networkState.hashCode();
            }

            public String toString() {
                return "UpdateDomainState(networkState=" + this.networkState + ")";
            }
        }

        /* JADX INFO: renamed from: oo1.b$c$d */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Loo1/b$c$d;", "Loo1/b$c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "response", "", "selectedDate", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "b", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final LogCalendarResponse response;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String selectedDate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LogCalendarResponse response, String selectedDate) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                AbstractC22676k.m65750j(selectedDate, "selectedDate");
                this.response = response;
                this.selectedDate = selectedDate;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LogCalendarResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSelectedDate() {
                return this.selectedDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return AbstractC22676k.m65745e(this.response, dVar.response) && AbstractC22676k.m65745e(this.selectedDate, dVar.selectedDate);
            }

            public int hashCode() {
                return this.selectedDate.hashCode() + (this.response.hashCode() * 31);
            }

            public String toString() {
                return "UpdateSuccess(response=" + this.response + ", selectedDate=" + this.selectedDate + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: oo1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LogCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113226w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113227x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113228y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28056b f113229z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C28056b c28056b) {
            super(3, interfaceC30057d);
            this.f113229z = c28056b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC28055a abstractC28055a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f113229z);
            dVar.f113227x = interfaceC13062m;
            dVar.f113228y = abstractC28055a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113226w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113227x;
                AbstractC28055a abstractC28055a = (AbstractC28055a) this.f113228y;
                if (abstractC28055a instanceof AbstractC28055a.a) {
                    C28056b c28056b = this.f113229z;
                    AbstractC28055a.a aVar = (AbstractC28055a.a) abstractC28055a;
                    String string = aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (string == null) {
                        string = this.f113229z.dateAndTimeProvider.mo133365d().toString("yyyy-MM-dd");
                    }
                    AbstractC22676k.m65747g(string);
                    String source = aVar.getSource();
                    if (source == null) {
                        source = "CYCLE_CALENDAR";
                    }
                    c13084s1 = c28056b.m84726i(string, source);
                } else if (abstractC28055a instanceof AbstractC28055a.c) {
                    c13084s1 = new C13084s1(new f(abstractC28055a, null));
                } else {
                    if (!AbstractC22676k.m65745e(abstractC28055a, AbstractC28055a.b.f113206a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(new g(null));
                }
                this.f113227x = null;
                this.f113228y = null;
                this.f113226w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC28055a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: oo1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$$inlined$flatMapLatest$2", m100430f = "LogCalendarInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f113230E;

        /* JADX INFO: renamed from: F */
        Object f113231F;

        /* JADX INFO: renamed from: G */
        Object f113232G;

        /* JADX INFO: renamed from: H */
        int f113233H;

        /* JADX INFO: renamed from: w */
        int f113234w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113235x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113236y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28056b f113237z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C28056b c28056b) {
            super(3, interfaceC30057d);
            this.f113237z = c28056b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f113237z);
            eVar.f113235x = interfaceC13062m;
            eVar.f113236y = bVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r8, r7) == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f113234w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.f113235x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L7a
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f113232G
                oo1.b$b r1 = (oo1.C28056b.b) r1
                java.lang.Object r1 = r7.f113231F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r7.f113230E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r7.f113235x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r8)
                goto L65
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.f113235x
                r1 = r8
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r8 = r7.f113236y
                oo1.b$b r8 = (oo1.C28056b.b) r8
                boolean r5 = r8.getShouldSave()
                if (r5 == 0) goto L5b
                oo1.b r5 = r7.f113237z
                r7.f113235x = r4
                r7.f113236y = r4
                r7.f113230E = r1
                r7.f113231F = r4
                r7.f113232G = r4
                r6 = 0
                r7.f113233H = r6
                r7.f113234w = r3
                java.lang.Object r8 = oo1.C28056b.m84724g(r5, r8, r7)
                if (r8 != r0) goto L65
                goto L79
            L5b:
                oo1.b$i r3 = new oo1.b$i
                r3.<init>(r8, r4)
                ec3.s1 r8 = new ec3.s1
                r8.<init>(r3)
            L65:
                ec3.l r8 = (ec3.InterfaceC13058l) r8
                r7.f113235x = r4
                r7.f113236y = r4
                r7.f113230E = r4
                r7.f113231F = r4
                r7.f113232G = r4
                r7.f113234w = r2
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r1, r8, r7)
                if (r8 != r0) goto L7a
            L79:
                return r0
            L7a:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28056b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: oo1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$1$1", m100430f = "LogCalendarInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/b$c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113238w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113239x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC28055a f113240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC28055a abstractC28055a, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113240y = abstractC28055a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f113240y, interfaceC30057d);
            fVar.f113239x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113239x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113238w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c.b bVar = new c.b(((AbstractC28055a.c) this.f113240y).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), ((AbstractC28055a.c) this.f113240y).getSelected());
                this.f113239x = null;
                this.f113238w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$1$2", m100430f = "LogCalendarInteractor.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/b$c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113241w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113242x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f113242x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113242x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113241w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c.a aVar = c.a.f113220a;
                this.f113242x = null;
                this.f113241w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$2", m100430f = "LogCalendarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Loo1/b$b;", "prev", "Loo1/b$c;", "action", "<anonymous>", "(Loo1/b$b;Loo1/b$c;)Loo1/b$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113243w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113244x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113245y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, c cVar, InterfaceC30057d<? super b> interfaceC30057d) {
            h hVar = C28056b.this.new h(interfaceC30057d);
            hVar.f113244x = bVar;
            hVar.f113245y = cVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f113244x;
            c cVar = (c) this.f113245y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113243w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (cVar instanceof c.C42127c) {
                return b.m84729b(bVar, ((c.C42127c) cVar).getNetworkState(), null, null, 0, false, 30, null);
            }
            if (cVar instanceof c.d) {
                c.d dVar = (c.d) cVar;
                return C28056b.this.m84728k(bVar, dVar.getSelectedDate(), dVar.getResponse());
            }
            if (!(cVar instanceof c.b)) {
                if (cVar instanceof c.a) {
                    return b.m84729b(bVar, LogCalendarNetworkState.Saving.INSTANCE, null, null, 0, true, 14, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            c.b bVar2 = (c.b) cVar;
            boolean zM65745e = AbstractC22676k.m65745e(bVar.m84733e().get(bVar2.getDate()), Boolean.TRUE);
            String string = C28056b.this.dateAndTimeProvider.mo133365d().toString("yyyy-MM-dd");
            LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(bVar.m84733e());
            if (zM65745e) {
                linkedHashMapM74003l0.remove(bVar2.getDate());
            } else {
                Map<String, Boolean> mapM84733e = bVar.m84733e();
                int i13 = 0;
                if (!mapM84733e.isEmpty()) {
                    Iterator<Map.Entry<String, Boolean>> it = mapM84733e.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().booleanValue()) {
                            i13++;
                        }
                    }
                }
                if (i13 >= 30) {
                    AbstractC22676k.m65747g(string);
                    return b.m84729b(bVar, new LogCalendarNetworkState.Error("You can only select up to 30 days.", string, LogCalendarErrorType.SELECTION_LIMIT), null, null, 0, false, 30, null);
                }
                linkedHashMapM74003l0.put(bVar2.getDate(), Boolean.valueOf(bVar2.getSelected()));
            }
            return b.m84729b(bVar, null, null, linkedHashMapM74003l0, 0, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: oo1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$interact$3$1", m100430f = "LogCalendarInteractor.kt", m100431l = {104, 112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113247w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113248x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ b f113249y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b bVar, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113249y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f113249y, interfaceC30057d);
            iVar.f113248x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f113248x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f113247w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r8)
                goto L6e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L46
            L20:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState r8 = new com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState
                oo1.b$b r2 = r7.f113249y
                java.util.Map r2 = r2.m84733e()
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState$Loading r5 = com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState.Loading.INSTANCE
                oo1.b$b r6 = r7.f113249y
                java.util.Map r6 = r6.m84733e()
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r4
                r8.<init>(r2, r5, r6)
                r7.f113248x = r0
                r7.f113247w = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L46
                goto L6d
            L46:
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState r8 = new com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainState
                oo1.b$b r2 = r7.f113249y
                java.util.Map r2 = r2.m84733e()
                oo1.b$b r5 = r7.f113249y
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState r5 = r5.getNetworkState()
                oo1.b$b r6 = r7.f113249y
                java.util.Map r6 = r6.m84733e()
                boolean r6 = r6.isEmpty()
                r4 = r4 ^ r6
                r8.<init>(r2, r5, r4)
                r2 = 0
                r7.f113248x = r2
                r7.f113247w = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L6e
            L6d:
                return r1
            L6e:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28056b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oo1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$loadCalendar$1", m100430f = "LogCalendarInteractor.kt", m100431l = {124, 128, 129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/b$c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f113250E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f113251F;

        /* JADX INFO: renamed from: w */
        Object f113252w;

        /* JADX INFO: renamed from: x */
        int f113253x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f113254y;

        /* JADX INFO: renamed from: oo1.b$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$loadCalendar$1$response$1", m100430f = "LogCalendarInteractor.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f113256w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28056b f113257x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f113258y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f113259z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28056b c28056b, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f113257x = c28056b;
                this.f113258y = str;
                this.f113259z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f113257x, this.f113258y, this.f113259z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113256w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HormonalInsightsApi hormonalInsightsApi = this.f113257x.api;
                String str = this.f113258y;
                String str2 = this.f113259z;
                this.f113256w = 1;
                Object logPeriodCalendar = hormonalInsightsApi.getLogPeriodCalendar(str, str2, this);
                return logPeriodCalendar == enumC31071a ? enumC31071a : logPeriodCalendar;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super LogCalendarResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113250E = str;
            this.f113251F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C28056b.this.new j(this.f113250E, this.f113251F, interfaceC30057d);
            jVar.f113254y = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        
            if (r8.emit(r1, r19) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        
            if (r8.emit(r0, r19) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r5 = r19
                java.lang.Object r0 = r5.f113254y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r5.f113253x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2f
                if (r0 == r1) goto L29
                if (r0 == r11) goto L20
                if (r0 != r10) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r5.f113252w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r20)
                goto L9c
            L29:
                p505ts.AbstractC34132o.m107864I(r20)
                r0 = r20
                goto L55
            L2f:
                p505ts.AbstractC34132o.m107864I(r20)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                oo1.b r2 = oo1.C28056b.this
                tr2.n r2 = oo1.C28056b.m84722e(r2)
                oo1.b$j$a r4 = new oo1.b$j$a
                oo1.b r3 = oo1.C28056b.this
                java.lang.String r6 = r5.f113250E
                java.lang.String r7 = r5.f113251F
                r4.<init>(r3, r6, r7, r12)
                r5.f113254y = r8
                r5.f113253x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L55
                goto L9b
            L55:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L77
                oo1.b$c$d r1 = new oo1.b$c$d
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse r0 = (com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse) r0
                java.lang.String r2 = r5.f113250E
                r1.<init>(r0, r2)
                r5.f113254y = r12
                r5.f113252w = r12
                r5.f113253x = r11
                java.lang.Object r0 = r8.emit(r1, r5)
                if (r0 != r9) goto L9c
                goto L9b
            L77:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L9f
                oo1.b$c$c r0 = new oo1.b$c$c
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState$Error r13 = new com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarNetworkState$Error
                java.lang.String r15 = r5.f113250E
                r17 = 4
                r18 = 0
                java.lang.String r14 = "Fetching log period calendar failed with unknown error"
                r16 = 0
                r13.<init>(r14, r15, r16, r17, r18)
                r0.<init>(r13)
                r5.f113254y = r12
                r5.f113252w = r12
                r5.f113253x = r10
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto L9c
            L9b:
                return r9
            L9c:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L9f:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28056b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oo1.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$logPeriod$2", m100430f = "LogCalendarInteractor.kt", m100431l = {165, 188, 194, 203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f113260E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ b f113261F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C28056b f113262G;

        /* JADX INFO: renamed from: w */
        Object f113263w;

        /* JADX INFO: renamed from: x */
        Object f113264x;

        /* JADX INFO: renamed from: y */
        Object f113265y;

        /* JADX INFO: renamed from: z */
        int f113266z;

        /* JADX INFO: renamed from: oo1.b$k$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.LogCalendarInteractor$logPeriod$2$response$1", m100430f = "LogCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f113267w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28056b f113268x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ LogPeriodRequest f113269y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28056b c28056b, LogPeriodRequest logPeriodRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f113268x = c28056b;
                this.f113269y = logPeriodRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f113268x, this.f113269y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113267w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HormonalInsightsApi hormonalInsightsApi = this.f113268x.api;
                LogPeriodRequest logPeriodRequest = this.f113269y;
                this.f113267w = 1;
                Object objLogPeriod = hormonalInsightsApi.logPeriod(logPeriodRequest, this);
                return objLogPeriod == enumC31071a ? enumC31071a : objLogPeriod;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b bVar, C28056b c28056b, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113261F = bVar;
            this.f113262G = c28056b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(this.f113261F, this.f113262G, interfaceC30057d);
            kVar.f113260E = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:29:0x010c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0110  */
        /* JADX WARN: Code duplicated, block: B:36:0x013c  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
        
            if (r8.emit(r0, r15) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0136, code lost:
        
            if (r8.emit(r0, r15) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28056b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C28056b(HormonalInsightsApi api, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, Locale locale) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(locale, "locale");
        this.api = api;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.locale = locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m84726i(String date, String source) {
        return new C13084s1(new j(date, source, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m84727j(b bVar, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new k(bVar, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final b m84728k(b prev, String date, LogCalendarResponse response) {
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        LocalDate localDate = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDate(date);
        java.time.LocalDate localDateOf2 = java.time.LocalDate.of(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
        int iBetween = (int) ChronoUnit.MONTHS.between(localDateOf2.withDayOfMonth(1), localDateOf.withDayOfMonth(1));
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(prev.m84731c());
        linkedHashMapM74003l0.put(Integer.valueOf(iBetween), response.getCalendar().getDaysOfMonth());
        return b.m84729b(prev, new LogCalendarNetworkState.Success(new LogCalendarDomainModel(response, C17027b.Companion.m48086b(C17027b.INSTANCE, this.locale, localDateOf, localDateOf2, localDateOf, linkedHashMapM74003l0, false, null, 0, 224, null), iBetween)), linkedHashMapM74003l0, null, 0, false, 28, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13060l1(new b(null, null, null, 0, false, 31, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new h(null)), new e(null, this));
    }

    /* JADX INFO: renamed from: oo1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b%\b\u0082\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J`\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010*R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Loo1/b$b;", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "networkState", "", "", "", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "calendarStates", "", "", "", "periodStates", "currentPage", "shouldSave", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZ)V", "a", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Ljava/util/Map;Ljava/util/Map;IZ)Loo1/b$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "d", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "setNetworkState", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;)V", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "setCalendarStates", "(Ljava/util/Map;)V", "e", "setPeriodStates", "I", "getCurrentPage", "setCurrentPage", "(I)V", "Z", "f", "()Z", "setShouldSave", "(Z)V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private LogCalendarNetworkState networkState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Map<Integer, ? extends List<CalendarDateModel>> calendarStates;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Map<String, Boolean> periodStates;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int currentPage;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean shouldSave;

        public b(LogCalendarNetworkState networkState, Map<Integer, ? extends List<CalendarDateModel>> calendarStates, Map<String, Boolean> periodStates, int i13, boolean z4) {
            AbstractC22676k.m65750j(networkState, "networkState");
            AbstractC22676k.m65750j(calendarStates, "calendarStates");
            AbstractC22676k.m65750j(periodStates, "periodStates");
            this.networkState = networkState;
            this.calendarStates = calendarStates;
            this.periodStates = periodStates;
            this.currentPage = i13;
            this.shouldSave = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m84729b(b bVar, LogCalendarNetworkState logCalendarNetworkState, Map map, Map map2, int i13, boolean z4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                logCalendarNetworkState = bVar.networkState;
            }
            if ((i14 & 2) != 0) {
                map = bVar.calendarStates;
            }
            if ((i14 & 4) != 0) {
                map2 = bVar.periodStates;
            }
            if ((i14 & 8) != 0) {
                i13 = bVar.currentPage;
            }
            if ((i14 & 16) != 0) {
                z4 = bVar.shouldSave;
            }
            boolean z13 = z4;
            Map map3 = map2;
            return bVar.m84730a(logCalendarNetworkState, map, map3, i13, z13);
        }

        /* JADX INFO: renamed from: a */
        public final b m84730a(LogCalendarNetworkState networkState, Map<Integer, ? extends List<CalendarDateModel>> calendarStates, Map<String, Boolean> periodStates, int currentPage, boolean shouldSave) {
            AbstractC22676k.m65750j(networkState, "networkState");
            AbstractC22676k.m65750j(calendarStates, "calendarStates");
            AbstractC22676k.m65750j(periodStates, "periodStates");
            return new b(networkState, calendarStates, periodStates, currentPage, shouldSave);
        }

        /* JADX INFO: renamed from: c */
        public final Map<Integer, List<CalendarDateModel>> m84731c() {
            return this.calendarStates;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LogCalendarNetworkState getNetworkState() {
            return this.networkState;
        }

        /* JADX INFO: renamed from: e */
        public final Map<String, Boolean> m84733e() {
            return this.periodStates;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.networkState, bVar.networkState) && AbstractC22676k.m65745e(this.calendarStates, bVar.calendarStates) && AbstractC22676k.m65745e(this.periodStates, bVar.periodStates) && this.currentPage == bVar.currentPage && this.shouldSave == bVar.shouldSave;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldSave) + AbstractC11266d.m30448b(this.currentPage, AbstractC3855a.m11821e(this.periodStates, AbstractC3855a.m11821e(this.calendarStates, this.networkState.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            LogCalendarNetworkState logCalendarNetworkState = this.networkState;
            Map<Integer, ? extends List<CalendarDateModel>> map = this.calendarStates;
            Map<String, Boolean> map2 = this.periodStates;
            int i13 = this.currentPage;
            boolean z4 = this.shouldSave;
            StringBuilder sb4 = new StringBuilder("DomainDataAccumulator(networkState=");
            sb4.append(logCalendarNetworkState);
            sb4.append(", calendarStates=");
            sb4.append(map);
            sb4.append(", periodStates=");
            sb4.append(map2);
            sb4.append(", currentPage=");
            sb4.append(i13);
            sb4.append(", shouldSave=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        public /* synthetic */ b(LogCalendarNetworkState logCalendarNetworkState, Map map, Map map2, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? LogCalendarNetworkState.Loading.INSTANCE : logCalendarNetworkState, (i14 & 2) != 0 ? C25272z.f99163w : map, (i14 & 4) != 0 ? new LinkedHashMap() : map2, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? false : z4);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C28056b(HormonalInsightsApi hormonalInsightsApi, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, Locale locale, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC34116n = (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LogCalendarInteractor") : interfaceC34116n;
        if ((i13 & 8) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(hormonalInsightsApi, interfaceC41070a, interfaceC34116n, locale);
    }
}
