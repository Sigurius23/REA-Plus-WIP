package com.whoop.calendararchmini.domain;

import a12.AbstractC0142b;
import a12.C0141a;
import ad3.AbstractC0757c;
import an0.C1056a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.archmini.CalendarContentModel;
import com.whoop.design.models.calendar.archmini.CalendarDayModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import h91.C17027b;
import i63.C18181t;
import ib1.C18334a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25235a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.C34387c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001OB=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)JW\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00172\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030/H\u0002¢\u0006\u0004\b1\u00102J=\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010+\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b8\u00109J#\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J7\u0010A\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020>2\u0006\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\bA\u0010BJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020D0C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CH\u0002¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\u00020\"2\u0006\u0010H\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010I\u001a\u00020\"H\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010M\u001a\u0004\u0018\u00010>2\u0006\u0010L\u001a\u00020\u001eH\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, m65681d2 = {"Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;", "Lod1/g;", "Lcom/whoop/calendararchmini/domain/a;", "Lan0/a;", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Lad3/c;", "json", "Ljava/time/Clock;", "clock", "Ljava/util/Locale;", "locale", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lu02/c;Lad3/c;Ljava/time/Clock;Ljava/util/Locale;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "state", "", "v", "(Lcom/whoop/calendararchmini/domain/a;Lan0/a;)Z", "Lib1/a;", "wrapperViewState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lib1/a;)Lec3/l;", "", HttpHeaders.DATE, "y", "(Ljava/lang/String;Lan0/a;)Lec3/l;", "", "monthIndex", "x", "(ILan0/a;)Lec3/l;", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "content", "D", "(Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;", "Lpm0/a;", "presentedPageDate", "isOnScreen", "Lkotlin/Function1;", "onData", "Lkotlin/Function0;", "onNoData", "C", "(Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "selectedDate", "t", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lcom/whoop/network/request/GetApiRequest;", "apiRequest", "u", "(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;", "Ljava/time/LocalDate;", "today", "pageIndex", "z", "(Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;", "", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "daysOfMonth", "s", "(Ljava/util/List;)Ljava/util/List;", "selected", "futureMonthsShown", "A", "(Ljava/time/LocalDate;Ljava/time/LocalDate;I)I", "value", "B", "(Ljava/lang/String;)Ljava/time/LocalDate;", "a", "Lnm0/e;", "b", "Lu02/c;", "c", "Lad3/c;", "d", "Ljava/time/Clock;", "e", "Ljava/util/Locale;", "f", "Ltr2/n;", "g", "Lan0/a;", "latestState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ArchMiniCalendarInteractor implements InterfaceC27844g<AbstractC6112a, C1056a> {

    /* JADX INFO: renamed from: i */
    public static final int f24216i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C1056a latestState;

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6103b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((CalendarDayModel) t14).getDate(), ((CalendarDayModel) t15).getDate());
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$c */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetch$$inlined$cacheAPI$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6104c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f24224w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f24225x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f24226y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f24227z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6104c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f24227z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C6104c c6104c = new C6104c(interfaceC30057d, this.f24227z);
            c6104c.f24225x = interfaceC13062m;
            c6104c.f24226y = c26832c;
            return c6104c.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24224w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f24225x;
                C26832c c26832c = (C26832c) this.f24226y;
                InterfaceC26834e interfaceC26834e = this.f24227z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CalendarContentModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CalendarContentModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f24225x = null;
                this.f24226y = null;
                this.f24224w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$d */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetchUncached$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {245, 249}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "Lpm0/a;", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6105d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ GetApiRequest f24228E;

        /* JADX INFO: renamed from: w */
        Object f24229w;

        /* JADX INFO: renamed from: x */
        int f24230x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f24231y;

        /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetchUncached$1$result$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {246, 318}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ GetApiRequest f24233E;

            /* JADX INFO: renamed from: w */
            Object f24234w;

            /* JADX INFO: renamed from: x */
            int f24235x;

            /* JADX INFO: renamed from: y */
            int f24236y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ ArchMiniCalendarInteractor f24237z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArchMiniCalendarInteractor archMiniCalendarInteractor, GetApiRequest getApiRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f24237z = archMiniCalendarInteractor;
                this.f24233E = getApiRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f24237z, this.f24233E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
            
                if (r9 == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r8.f24236y
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r0 = r8.f24234w
                    f63.c r0 = (f63.AbstractC14155c) r0
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L71
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L48
                L20:
                    p505ts.AbstractC34132o.m107864I(r9)
                    com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor r9 = r8.f24237z
                    u02.c r9 = com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.m18347d(r9)
                    com.whoop.network.request.GetApiRequest r1 = r8.f24233E
                    java.lang.Class<l83.a0> r4 = l83.C23454a0.class
                    j93.a0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.m65689b(r4)
                    java.lang.reflect.Type r6 = j93.AbstractC21478l0.m60396B(r5)
                    kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                    j93.d r4 = r7.getOrCreateKotlinClass(r4)
                    s63.a r4 = ge3.AbstractC15751g.m44445Y(r4, r5, r6)
                    r8.f24236y = r3
                    java.lang.Object r9 = r9.m108748d(r1, r4, r8)
                    if (r9 != r0) goto L48
                    goto L70
                L48:
                    f63.c r9 = (f63.AbstractC14155c) r9
                    w53.b r9 = r9.mo13321a()
                    java.lang.Class<byte[]> r1 = byte[].class
                    j93.a0 r3 = p715kotlin.jvm.internal.AbstractC22671h0.m65691d(r1)
                    java.lang.reflect.Type r4 = j93.AbstractC21478l0.m60396B(r3)
                    kotlin.jvm.internal.i0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                    j93.d r1 = r5.getOrCreateKotlinClass(r1)
                    s63.a r1 = ge3.AbstractC15751g.m44445Y(r1, r3, r4)
                    r3 = 0
                    r8.f24234w = r3
                    r3 = 0
                    r8.f24235x = r3
                    r8.f24236y = r2
                    java.lang.Object r9 = r9.m118137a(r1, r8)
                    if (r9 != r0) goto L71
                L70:
                    return r0
                L71:
                    if (r9 == 0) goto L8c
                    byte[] r9 = (byte[]) r9
                    com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor r0 = r8.f24237z
                    ad3.c r0 = com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.m18349f(r0)
                    com.whoop.design.models.calendar.archmini.CalendarContentModel$Companion r1 = com.whoop.design.models.calendar.archmini.CalendarContentModel.INSTANCE
                    wc3.c r1 = r1.serializer()
                    wc3.b r1 = (wc3.InterfaceC37137b) r1
                    java.lang.String r9 = yb3.AbstractC39421y.m125916A(r9)
                    java.lang.Object r9 = r0.m1831b(r1, r9)
                    return r9
                L8c:
                    java.lang.NullPointerException r9 = new java.lang.NullPointerException
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.ByteArray"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.C6105d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CalendarContentModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6105d(GetApiRequest getApiRequest, InterfaceC30057d<? super C6105d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24228E = getApiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6105d c6105d = ArchMiniCalendarInteractor.this.new C6105d(this.f24228E, interfaceC30057d);
            c6105d.f24231y = obj;
            return c6105d;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6105d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r0.emit(r2, r14) == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f24231y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f24230x
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L27
                if (r2 == r3) goto L22
                if (r2 != r4) goto L1a
                java.lang.Object r0 = r14.f24229w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L7b
            L1a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L22:
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L4c
            L27:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor r15 = com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.this
                tr2.n r7 = com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.m18351h(r15)
                com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$d$a r10 = new com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$d$a
                com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor r15 = com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.this
                com.whoop.network.request.GetApiRequest r2 = r14.f24228E
                r10.<init>(r15, r2, r5)
                r14.f24231y = r0
                r14.f24230x = r3
                r8 = 0
                java.lang.String r9 = "Failed to fetch arch mini calendar"
                r12 = 2
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L4c
                goto L7a
            L4c:
                u02.a r15 = (u02.InterfaceC34385a) r15
                boolean r2 = r15 instanceof u02.InterfaceC34385a.c
                if (r2 == 0) goto L5e
                pm0.a$a$a r2 = new pm0.a$a$a
                u02.a$c r15 = (u02.InterfaceC34385a.c) r15
                java.lang.Object r15 = r15.m108735a()
                r2.<init>(r15)
                goto L6e
            L5e:
                boolean r2 = r15 instanceof u02.InterfaceC34385a.b
                if (r2 == 0) goto L7e
                pm0.a$c r2 = new pm0.a$c
                u02.a$b r15 = (u02.InterfaceC34385a.b) r15
                java.lang.String r15 = r15.getErrorMessage()
                r3 = 0
                r2.<init>(r15, r3, r4, r5)
            L6e:
                r11.f24231y = r5
                r11.f24229w = r5
                r11.f24230x = r4
                java.lang.Object r15 = r0.emit(r2, r14)
                if (r15 != r1) goto L7b
            L7a:
                return r1
            L7b:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            L7e:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.C6105d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6106e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f24238w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ ArchMiniCalendarInteractor f24239x;

        /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f24240w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ ArchMiniCalendarInteractor f24241x;

            /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$interact$$inlined$filter$1$2", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41380a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f24243F;

                /* JADX INFO: renamed from: G */
                Object f24244G;

                /* JADX INFO: renamed from: H */
                int f24245H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f24246w;

                /* JADX INFO: renamed from: x */
                int f24247x;

                /* JADX INFO: renamed from: y */
                Object f24248y;

                /* JADX INFO: renamed from: z */
                Object f24249z;

                public C41380a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f24246w = obj;
                    this.f24247x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, ArchMiniCalendarInteractor archMiniCalendarInteractor) {
                this.f24240w = interfaceC13062m;
                this.f24241x = archMiniCalendarInteractor;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41380a c41380a;
                if (interfaceC30057d instanceof C41380a) {
                    c41380a = (C41380a) interfaceC30057d;
                    int i13 = c41380a.f24247x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41380a.f24247x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41380a = new C41380a(interfaceC30057d);
                    }
                } else {
                    c41380a = new C41380a(interfaceC30057d);
                }
                Object obj2 = c41380a.f24246w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41380a.f24247x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f24240w;
                    ArchMiniCalendarInteractor archMiniCalendarInteractor = this.f24241x;
                    if (!archMiniCalendarInteractor.m18365v((AbstractC6112a) obj, archMiniCalendarInteractor.latestState)) {
                        c41380a.f24248y = null;
                        c41380a.f24249z = null;
                        c41380a.f24243F = null;
                        c41380a.f24244G = null;
                        c41380a.f24245H = 0;
                        c41380a.f24247x = 1;
                        if (interfaceC13062m.emit(obj, c41380a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public C6106e(InterfaceC13058l interfaceC13058l, ArchMiniCalendarInteractor archMiniCalendarInteractor) {
            this.f24238w = interfaceC13058l;
            this.f24239x = archMiniCalendarInteractor;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f24238w.collect(new a(interfaceC13062m, this.f24239x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$f */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6107f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f24250w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f24251x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f24252y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ArchMiniCalendarInteractor f24253z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6107f(InterfaceC30057d interfaceC30057d, ArchMiniCalendarInteractor archMiniCalendarInteractor) {
            super(3, interfaceC30057d);
            this.f24253z = archMiniCalendarInteractor;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC6112a abstractC6112a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C6107f c6107f = new C6107f(interfaceC30057d, this.f24253z);
            c6107f.f24251x = interfaceC13062m;
            c6107f.f24252y = abstractC6112a;
            return c6107f.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM18367x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24250w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f24251x;
                AbstractC6112a abstractC6112a = (AbstractC6112a) this.f24252y;
                if (abstractC6112a instanceof AbstractC6112a.a) {
                    interfaceC13058lM18367x = this.f24253z.m18366w(((AbstractC6112a.a) abstractC6112a).getWrapperViewState());
                } else if (abstractC6112a instanceof AbstractC6112a.c) {
                    interfaceC13058lM18367x = this.f24253z.m18367x(((AbstractC6112a.c) abstractC6112a).getMonthIndex(), this.f24253z.latestState);
                } else if (abstractC6112a instanceof AbstractC6112a.b) {
                    interfaceC13058lM18367x = this.f24253z.m18368y(((AbstractC6112a.b) abstractC6112a).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), this.f24253z.latestState);
                } else {
                    if (!(abstractC6112a instanceof AbstractC6112a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM18367x = this.f24253z.m18367x(((AbstractC6112a.d) abstractC6112a).getMonthIndex(), this.f24253z.latestState);
                }
                this.f24251x = null;
                this.f24252y = null;
                this.f24250w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM18367x, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC6112a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$g */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$interact$3", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lan0/a;", "it", "Ll83/a0;", "<anonymous>", "(Lan0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6108g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24254w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f24255x;

        public C6108g(InterfaceC30057d<? super C6108g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6108g c6108g = ArchMiniCalendarInteractor.this.new C6108g(interfaceC30057d);
            c6108g.f24255x = obj;
            return c6108g;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1056a c1056a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6108g) create(c1056a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1056a c1056a = (C1056a) this.f24255x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f24254w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ArchMiniCalendarInteractor.this.latestState = c1056a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$h */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$load$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {96, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lan0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6109h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f24257E;

        /* JADX INFO: renamed from: F */
        int f24258F;

        /* JADX INFO: renamed from: G */
        int f24259G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f24260H;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C18334a f24262J;

        /* JADX INFO: renamed from: w */
        Object f24263w;

        /* JADX INFO: renamed from: x */
        Object f24264x;

        /* JADX INFO: renamed from: y */
        Object f24265y;

        /* JADX INFO: renamed from: z */
        Object f24266z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6109h(C18334a c18334a, InterfaceC30057d<? super C6109h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24262J = c18334a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C1056a m18373i(ArchMiniCalendarInteractor archMiniCalendarInteractor, C18334a c18334a, LocalDate localDate, LocalDate localDate2, int i13, CalendarContentModel calendarContentModel) {
            AbstractC22676k.m65747g(localDate);
            AbstractC22676k.m65747g(localDate2);
            return archMiniCalendarInteractor.m18369z(c18334a, calendarContentModel, localDate, localDate2, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C1056a m18374j(int i13) {
            return new C1056a(false, true, i13, null, null, null, null, null, null, null, null, null, 4088, null);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6109h c6109h = ArchMiniCalendarInteractor.this.new C6109h(this.f24262J, interfaceC30057d);
            c6109h.f24260H = obj;
            return c6109h;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6109h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0122 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0123 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            LocalDate localDateNow;
            final LocalDate localDate;
            final int i13;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f24260H;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f24259G;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                localDateNow = LocalDate.now(ArchMiniCalendarInteractor.this.clock);
                LocalDate localDateM18343B = ArchMiniCalendarInteractor.this.m18343B(this.f24262J.getSelectedDate());
                if (localDateM18343B == null) {
                    localDateM18343B = localDateNow;
                }
                ArchMiniCalendarInteractor archMiniCalendarInteractor = ArchMiniCalendarInteractor.this;
                AbstractC22676k.m65747g(localDateM18343B);
                AbstractC22676k.m65747g(localDateNow);
                int iM18342A = archMiniCalendarInteractor.m18342A(localDateM18343B, localDateNow, this.f24262J.getFutureMonthsShown());
                C1056a c1056a = new C1056a(true, false, iM18342A, null, null, null, null, null, null, null, null, null, 4090, null);
                this.f24260H = interfaceC13062m;
                this.f24263w = localDateNow;
                this.f24264x = localDateM18343B;
                this.f24258F = iM18342A;
                this.f24259G = 1;
                if (interfaceC13062m.emit(c1056a, this) != enumC31071a) {
                    localDate = localDateM18343B;
                    i13 = iM18342A;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            int i15 = this.f24258F;
            LocalDate localDate2 = (LocalDate) this.f24264x;
            localDateNow = (LocalDate) this.f24263w;
            AbstractC34132o.m107864I(obj);
            i13 = i15;
            localDate = localDate2;
            final LocalDate localDate3 = localDateNow;
            CalendarContentModel content = this.f24262J.getContent();
            if (content != null) {
                ArchMiniCalendarInteractor archMiniCalendarInteractor2 = ArchMiniCalendarInteractor.this;
                C18334a c18334a = this.f24262J;
                AbstractC22676k.m65747g(localDate3);
                AbstractC22676k.m65747g(localDate);
                C1056a c1056aM18369z = archMiniCalendarInteractor2.m18369z(c18334a, content, localDate3, localDate, i13);
                this.f24260H = null;
                this.f24263w = null;
                this.f24264x = null;
                this.f24265y = null;
                this.f24258F = i13;
                this.f24259G = 2;
                if (interfaceC13062m.emit(c1056aM18369z, this) == enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            final int i16 = i13;
            String selectedDate = this.f24262J.getSelectedDate();
            InterfaceC13058l interfaceC13058lM18363t = ArchMiniCalendarInteractor.this.m18363t(this.f24262J.getRequest(), this.f24262J.getCachePolicy(), selectedDate, selectedDate);
            final ArchMiniCalendarInteractor archMiniCalendarInteractor3 = ArchMiniCalendarInteractor.this;
            final C18334a c18334a2 = this.f24262J;
            InterfaceC13058l interfaceC13058lM18344C = archMiniCalendarInteractor3.m18344C(interfaceC13058lM18363t, selectedDate, false, new Function1() { // from class: com.whoop.calendararchmini.domain.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ArchMiniCalendarInteractor.C6109h.m18373i(archMiniCalendarInteractor3, c18334a2, localDate3, localDate, i13, (CalendarContentModel) obj2);
                }
            }, new InterfaceC4339a() { // from class: com.whoop.calendararchmini.domain.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return ArchMiniCalendarInteractor.C6109h.m18374j(i16);
                }
            });
            this.f24260H = null;
            this.f24263w = null;
            this.f24264x = null;
            this.f24265y = null;
            this.f24266z = null;
            this.f24257E = null;
            this.f24258F = i16;
            this.f24259G = 3;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM18344C, this) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$i */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$loadPage$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {144, 154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lan0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6110i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f24267E;

        /* JADX INFO: renamed from: F */
        boolean f24268F;

        /* JADX INFO: renamed from: G */
        int f24269G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f24270H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C1056a f24271I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ int f24272J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ ArchMiniCalendarInteractor f24273K;

        /* JADX INFO: renamed from: w */
        Object f24274w;

        /* JADX INFO: renamed from: x */
        Object f24275x;

        /* JADX INFO: renamed from: y */
        Object f24276y;

        /* JADX INFO: renamed from: z */
        Object f24277z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6110i(C1056a c1056a, int i13, ArchMiniCalendarInteractor archMiniCalendarInteractor, InterfaceC30057d<? super C6110i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24271I = c1056a;
            this.f24272J = i13;
            this.f24273K = archMiniCalendarInteractor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C1056a m18377i(ArchMiniCalendarInteractor archMiniCalendarInteractor, C1056a c1056a, int i13, CalendarContentModel calendarContentModel) {
            return archMiniCalendarInteractor.m18345D(c1056a, i13, calendarContentModel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C1056a m18378j(C1056a c1056a, int i13) {
            return C1056a.m3117b(c1056a, false, false, 0, null, Integer.valueOf(i13), null, null, null, null, null, null, null, 4079, null);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6110i c6110i = new C6110i(this.f24271I, this.f24272J, this.f24273K, interfaceC30057d);
            c6110i.f24270H = obj;
            return c6110i;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6110i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x011d, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r3, r38) == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor.C6110i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$j */
    @InterfaceC32271e(m100429c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$toDomainStates$1", m100430f = "ArchMiniCalendarInteractor.kt", m100431l = {191}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lan0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6111j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13058l f24278E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f24279F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ ArchMiniCalendarInteractor f24280G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f24281H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC4339a f24282I;

        /* JADX INFO: renamed from: w */
        Object f24283w;

        /* JADX INFO: renamed from: x */
        int f24284x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f24285y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f24286z;

        /* JADX INFO: renamed from: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f24287E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC4339a f24288F;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22659b0 f24289w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f24290x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Function1 f24291y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ ArchMiniCalendarInteractor f24292z;

            public a(C22659b0 c22659b0, InterfaceC13062m interfaceC13062m, Function1 function1, ArchMiniCalendarInteractor archMiniCalendarInteractor, String str, InterfaceC4339a interfaceC4339a) {
                this.f24289w = c22659b0;
                this.f24290x = interfaceC13062m;
                this.f24291y = function1;
                this.f24292z = archMiniCalendarInteractor;
                this.f24287E = str;
                this.f24288F = interfaceC4339a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC29354a<CalendarContentModel> interfaceC29354a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                boolean z4 = interfaceC29354a instanceof InterfaceC29354a.e;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (!z4) {
                    if (interfaceC29354a instanceof InterfaceC29354a.a) {
                        this.f24289w.f89329w = true;
                        Object objEmit = this.f24290x.emit(this.f24291y.invoke(((InterfaceC29354a.a) interfaceC29354a).getData()), interfaceC30057d);
                        return objEmit == EnumC31071a.f128113w ? objEmit : c23454a0;
                    }
                    if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        this.f24292z.logger.mo85226q(AbstractC31061c.m95640p("Failed to fetch arch mini calendar month ", this.f24287E, ", showing the cached month: ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        this.f24289w.f89329w = true;
                        Object objEmit2 = this.f24290x.emit(this.f24291y.invoke(dVar.getData()), interfaceC30057d);
                        return objEmit2 == EnumC31071a.f128113w ? objEmit2 : c23454a0;
                    }
                    if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!this.f24289w.f89329w) {
                        this.f24292z.logger.mo85222m(AbstractC31061c.m95640p("Failed to fetch arch mini calendar month ", this.f24287E, ": ", ((InterfaceC29354a.c) interfaceC29354a).getErrorMessage()), new AbstractC30556a.a[0]);
                        Object objEmit3 = this.f24290x.emit(this.f24288F.invoke(), interfaceC30057d);
                        return objEmit3 == EnumC31071a.f128113w ? objEmit3 : c23454a0;
                    }
                    this.f24292z.logger.mo85226q(AbstractC31061c.m95640p("Failed to refresh arch mini calendar month ", this.f24287E, ", keeping the month on screen: ", ((InterfaceC29354a.c) interfaceC29354a).getErrorMessage()), new AbstractC30556a.a[0]);
                }
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6111j(boolean z4, InterfaceC13058l interfaceC13058l, Function1 function1, ArchMiniCalendarInteractor archMiniCalendarInteractor, String str, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C6111j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24286z = z4;
            this.f24278E = interfaceC13058l;
            this.f24279F = function1;
            this.f24280G = archMiniCalendarInteractor;
            this.f24281H = str;
            this.f24282I = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6111j c6111j = new C6111j(this.f24286z, this.f24278E, this.f24279F, this.f24280G, this.f24281H, this.f24282I, interfaceC30057d);
            c6111j.f24285y = obj;
            return c6111j;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6111j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f24285y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24284x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22659b0 c22659b0 = new C22659b0();
                c22659b0.f89329w = this.f24286z;
                InterfaceC13058l interfaceC13058l = this.f24278E;
                a aVar = new a(c22659b0, interfaceC13062m, this.f24279F, this.f24280G, this.f24281H, this.f24282I);
                this.f24285y = null;
                this.f24283w = null;
                this.f24284x = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public ArchMiniCalendarInteractor(InterfaceC26834e cachedApiSource, C34387c apiClient, AbstractC0757c json, Clock clock, Locale locale, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.json = json;
        this.clock = clock;
        this.locale = locale;
        this.logger = logger;
        this.latestState = new C1056a(false, false, 0, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final int m18342A(LocalDate selected, LocalDate today, int futureMonthsShown) {
        return futureMonthsShown + ((int) ChronoUnit.MONTHS.between(selected.withDayOfMonth(1), today.withDayOfMonth(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final LocalDate m18343B(String value) {
        try {
            return LocalDate.parse(AbstractC39414r.m125866L0(10, AbstractC39414r.m125862H0(AbstractC39414r.m125862H0(value, 'T'), ' ')));
        } catch (DateTimeParseException e5) {
            this.logger.mo85230v(AbstractC11266d.m30461o("Unparseable date on the arch mini calendar: ", value), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC13058l m18344C(InterfaceC13058l interfaceC13058l, String str, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a) {
        return new C13084s1(new C6111j(z4, interfaceC13058l, function1, this, str, interfaceC4339a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final C1056a m18345D(C1056a c1056a, int i13, CalendarContentModel calendarContentModel) {
        C17027b<CalendarDayModel> c17027bM3120d = c1056a.m3120d();
        if (c17027bM3120d == null) {
            throw new IllegalStateException("A month cannot be merged before the calendar has loaded");
        }
        return C1056a.m3117b(c1056a, false, false, 0, null, null, calendarContentModel.getHeader(), null, null, C17027b.m48073b(c17027bM3120d, null, null, null, null, AbstractC25247g0.m73996e0(c17027bM3120d.m48077e(), new C23465k(Integer.valueOf(i13), m18362s(calendarContentModel.getCalendar().getDaysOfMonth()))), 0, false, null, 0, 495, null), calendarContentModel.getCalendar().getCalendarKey(), AbstractC25247g0.m73996e0(c1056a.m3122f(), new C23465k(Integer.valueOf(i13), calendarContentModel.getCalendar().getCalendarKey())), AbstractC25247g0.m73996e0(c1056a.m3125i(), new C23465k(Integer.valueOf(i13), calendarContentModel.getHeader())), 223, null);
    }

    /* JADX INFO: renamed from: s */
    private final List<CalendarDayModel> m18362s(List<? extends CalendarDayModel> daysOfMonth) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : daysOfMonth) {
            CalendarDayModel calendarDayModel = (CalendarDayModel) obj;
            if (!calendarDayModel.getHidden() && calendarDayModel.getDate() != null) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74152u1(arrayList, new C6103b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m18363t(ApiRequest request, CachePolicyModel cachePolicy, final String presentedPageDate, final String selectedDate) {
        final C0141a c0141aM360e = AbstractC0142b.m360e(request.getPath());
        GetApiRequest getApiRequest = new GetApiRequest(c0141aM360e, presentedPageDate, selectedDate) { // from class: com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetch$apiRequest$1
            private final Map<String, String> parameters;
            private final String path;
            private final String tag = "arch_mini_calendar";

            {
                this.path = c0141aM360e.getBasePath();
                this.parameters = AbstractC25247g0.m73995d0(c0141aM360e.m354b(), AbstractC25247g0.m73990Y(new C23465k("presentedPageDate", presentedPageDate), new C23465k("selectedDate", selectedDate)));
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ boolean getHasBody() {
                return super.getHasBody();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ Map<String, String> getHeaders() {
                return super.getHeaders();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
                return super.getHttpTimeoutConfig();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C18181t getMethod() {
                return super.getMethod();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public Map<String, String> getParameters() {
                return this.parameters;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public String getPath() {
                return this.path;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public String getTag() {
                return this.tag;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ String url(AbstractC32943y abstractC32943y) {
                return super.url(abstractC32943y);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C23454a0 getBody() {
                return super.getBody();
            }
        };
        if (cachePolicy != null && !cachePolicy.getEnabled()) {
            return m18364u(getApiRequest);
        }
        C0456u c0456u = new C0456u(getApiRequest, 1);
        Set<String> scopes = cachePolicy != null ? cachePolicy.getScopes() : null;
        if (scopes == null) {
            scopes = C25235a0.f99113w;
        }
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(c0456u, scopes, null, 2, null), new C6104c(null, this.cachedApiSource));
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC13058l m18364u(GetApiRequest apiRequest) {
        return new C13084s1(new C6105d(apiRequest, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final boolean m18365v(AbstractC6112a abstractC6112a, C1056a c1056a) {
        C17027b<CalendarDayModel> c17027bM3120d = c1056a.m3120d();
        if (c17027bM3120d == null || c1056a.getRequest() == null) {
            return !(abstractC6112a instanceof AbstractC6112a.a);
        }
        if ((abstractC6112a instanceof AbstractC6112a.a) || (abstractC6112a instanceof AbstractC6112a.d)) {
            return false;
        }
        if (abstractC6112a instanceof AbstractC6112a.c) {
            AbstractC6112a.c cVar = (AbstractC6112a.c) abstractC6112a;
            return cVar.getMonthIndex() == c1056a.getPageIndex() && c17027bM3120d.m48077e().containsKey(Integer.valueOf(cVar.getMonthIndex()));
        }
        if (abstractC6112a instanceof AbstractC6112a.b) {
            return m18343B(((AbstractC6112a.b) abstractC6112a).getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l m18366w(C18334a wrapperViewState) {
        return new C13084s1(new C6109h(wrapperViewState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m18367x(int monthIndex, C1056a state) {
        return new C13084s1(new C6110i(state, monthIndex, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m18368y(String date, C1056a state) {
        C17027b<CalendarDayModel> c17027bM3120d = state.m3120d();
        if (c17027bM3120d == null) {
            throw new IllegalStateException("An arrow tap arrived before the calendar loaded");
        }
        LocalDate localDateM18343B = m18343B(date);
        if (localDateM18343B == null) {
            throw new IllegalStateException(AbstractC11266d.m30461o("An unparseable arrow date reached the page loader: ", date).toString());
        }
        int futureOffset = c17027bM3120d.getFutureOffset() + ((int) ChronoUnit.MONTHS.between(localDateM18343B.withDayOfMonth(1), c17027bM3120d.getLatestMonthDate().withDayOfMonth(1)));
        if (futureOffset < 0) {
            futureOffset = 0;
        }
        return m18367x(futureOffset, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final C1056a m18369z(C18334a wrapperViewState, CalendarContentModel content, LocalDate today, LocalDate selectedDate, int pageIndex) {
        return new C1056a(false, false, pageIndex, null, null, content.getHeader(), wrapperViewState.getRequest(), wrapperViewState.getCachePolicy(), C17027b.Companion.m48086b(C17027b.INSTANCE, this.locale, today, selectedDate, today, AbstractC25247g0.m73989X(new C23465k(Integer.valueOf(pageIndex), m18362s(content.getCalendar().getDaysOfMonth()))), false, null, wrapperViewState.getFutureMonthsShown(), 96, null), content.getCalendar().getCalendarKey(), AbstractC25247g0.m73989X(new C23465k(Integer.valueOf(pageIndex), content.getCalendar().getCalendarKey())), AbstractC25247g0.m73989X(new C23465k(Integer.valueOf(pageIndex), content.getHeader())), 24, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13052j1(AbstractC13091v.m36590P(new C6106e(upstream, this), new C6107f(null, this)), new C6108g(null), 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ArchMiniCalendarInteractor(InterfaceC26834e interfaceC26834e, C34387c c34387c, AbstractC0757c abstractC0757c, Clock clock, Locale locale, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        Clock clock2 = clock;
        if ((i13 & 16) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        this(interfaceC26834e, c34387c, abstractC0757c, clock2, locale, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ArchMiniCalendarInteractor") : interfaceC34116n);
    }
}
