package cm2;

import am2.InterfaceC1038q;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import dc3.C11923h;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import hv1.AbstractC17674d;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23467m;
import lf1.C23996f;
import m83.C25258m;
import org.joda.time.format.ISODateTimeFormat;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p337n8.C26444a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tl2.C33920a;
import tr2.InterfaceC34116n;
import vl2.AbstractC36122o;
import vl2.AbstractC36126s;
import vl2.AbstractC36127t;
import vl2.AbstractC36130w;
import vl2.AbstractC36131x;
import vl2.C36107a0;
import vl2.C36119l;
import vl2.C36123p;
import vl2.C36128u;
import vl2.C36129v;
import vl2.EnumC36106a;

/* JADX INFO: renamed from: cm2.z */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001gBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014*\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014*\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J!\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00104\u001a\u0002032\u0006\u00102\u001a\u000201¢\u0006\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010>R!\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010@8\u0006¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\b6\u0010BR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020D0@8\u0006¢\u0006\f\n\u0004\b'\u0010A\u001a\u0004\bE\u0010BR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00150G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020S0\u00148\u0006¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001a0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010HR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010KR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010HR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010KR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020c0\u00148\u0006¢\u0006\f\n\u0004\bd\u0010K\u001a\u0004\be\u0010Y¨\u0006h"}, m65681d2 = {"Lcm2/z;", "Landroidx/lifecycle/w1;", "Lvl2/u;", "apiInteractor", "Lvl2/l;", "stateInteractor", "Lvl2/p;", "trendMenuSheetStateInteractor", "Lvl2/v;", "trendsDomainReducer", "Lcm2/v;", "reducer", "Ltr2/n;", "logger", "Ltl2/a;", "analyticsHelper", "Llf1/f;", "experimentHelper", "<init>", "(Lvl2/u;Lvl2/l;Lvl2/p;Lvl2/v;Lcm2/v;Ltr2/n;Ltl2/a;Llf1/f;)V", "Lec3/l;", "Lvl2/s;", "interactor", "Lvl2/t;", "A", "(Lec3/l;Lvl2/u;)Lec3/l;", "Lvl2/x;", "Lvl2/y;", "y", "(Lec3/l;Lvl2/l;)Lec3/l;", "Lvl2/o;", "Lvl2/n;", "z", "(Lec3/l;Lvl2/p;)Lec3/l;", "Lvl2/t$c;", "result", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "E", "(Lvl2/t$c;Lvl2/a;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "", "raw", "C", "(Ljava/lang/String;)Ljava/lang/String;", "Lhv1/d;", "Lvl2/a0;", "F", "(Lhv1/d;)Lvl2/a0;", "Lcm2/y;", "viewEvent", "Lbc3/k1;", "D", "(Lcm2/y;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Ltl2/a;", "v", "()Ltl2/a;", "Lec3/p1;", "Lcom/whoop/util/TrendKey;", "Lec3/p1;", "_selectedTrend", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "selectedTrend", "", "B", "isExerciseDetailsV2ExperimentEnabled", "Lec3/o1;", "Lec3/o1;", "apiEventFlow", "G", "Lec3/l;", "apiDomainState", "Lm83/m;", "Lcm2/z$b;", "H", "Lm83/m;", "pendingNavQueue", "Ldc3/l;", "Lcm2/w;", "I", "Ldc3/l;", "analyticsEventsChannel", "J", "u", "()Lec3/l;", "analyticsEvents", "K", "localStateEventFlow", "L", "stateDomainState", "M", "menuSheetEventFlow", "N", "menuSheetDomainState", "Lcm2/a0;", "O", "getViewState", "viewState", "b", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4838z extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 isExerciseDetailsV2ExperimentEnabled;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 apiEventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l apiDomainState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C25258m pendingNavQueue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC11927l analyticsEventsChannel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l analyticsEvents;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13072o1 localStateEventFlow;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13058l stateDomainState;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13072o1 menuSheetEventFlow;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l menuSheetDomainState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C33920a analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13075p1 _selectedTrend;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13037f2 selectedTrend;

    /* JADX INFO: renamed from: cm2.z$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$1", m100430f = "TrendsViewModel.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20009w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f20010x;

        /* JADX INFO: renamed from: cm2.z$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41363a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C4838z f20012w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC2994c0 f20013x;

            public C41363a(C4838z c4838z, InterfaceC2994c0 interfaceC2994c0) {
                this.f20012w = c4838z;
                this.f20013x = interfaceC2994c0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC36127t abstractC36127t, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                String prevDateTime;
                Object objM107888l;
                boolean z4 = abstractC36127t instanceof AbstractC36127t.a;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (z4) {
                    this.f20012w.pendingNavQueue.m74024q();
                    return c23454a0;
                }
                if (abstractC36127t instanceof AbstractC36127t.c) {
                    b bVar = (b) this.f20012w.pendingNavQueue.m74024q();
                    if (bVar != null) {
                        EnumC4816d direction = bVar.getDirection();
                        EnumC36106a duration = bVar.getDuration();
                        String endDateRaw = bVar.getEndDateRaw();
                        if (direction != EnumC4816d.NONE) {
                            AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t;
                            TimeSegmentDtoV3 timeSegmentDtoV3M15393E = this.f20012w.m15393E(cVar, duration);
                            if (timeSegmentDtoV3M15393E != null && (prevDateTime = timeSegmentDtoV3M15393E.getDatePicker().getPrevDateTime()) != null) {
                                try {
                                    objM107888l = ISODateTimeFormat.dateTimeParser().withZoneUTC().parseDateTime(prevDateTime).plusDays(1).toString("yyyy-MM-dd");
                                } catch (Throwable th3) {
                                    objM107888l = AbstractC34132o.m107888l(th3);
                                }
                                if (objM107888l instanceof C23467m) {
                                    objM107888l = null;
                                }
                                String str = (String) objM107888l;
                                if (str != null) {
                                    this.f20012w.analyticsEventsChannel.mo32218s(new AbstractC4835w.a(direction, str, this.f20012w.m15392C(endDateRaw), cVar.getGraphKey().getTrendName()));
                                    return c23454a0;
                                }
                            }
                        }
                    }
                } else if (!AbstractC22676k.m65745e(abstractC36127t, AbstractC36127t.b.f154435a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return c23454a0;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C4838z.this.new a(interfaceC30057d);
            aVar.f20010x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f20010x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20009w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C4838z.this.apiDomainState;
                C41363a c41363a = new C41363a(C4838z.this, interfaceC2994c0);
                this.f20010x = null;
                this.f20009w = 1;
                if (interfaceC13058l.collect(c41363a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$a0 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f20014w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4834v f20015x;

        /* JADX INFO: renamed from: cm2.z$a0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f20016w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4834v f20017x;

            /* JADX INFO: renamed from: cm2.z$a0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$special$$inlined$map$1$2", m100430f = "TrendsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41364a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f20018E;

                /* JADX INFO: renamed from: F */
                Object f20019F;

                /* JADX INFO: renamed from: G */
                Object f20020G;

                /* JADX INFO: renamed from: H */
                int f20021H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f20022w;

                /* JADX INFO: renamed from: x */
                int f20023x;

                /* JADX INFO: renamed from: y */
                Object f20024y;

                public C41364a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f20022w = obj;
                    this.f20023x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4834v c4834v) {
                this.f20016w = interfaceC13062m;
                this.f20017x = c4834v;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41364a c41364a;
                if (interfaceC30057d instanceof C41364a) {
                    c41364a = (C41364a) interfaceC30057d;
                    int i13 = c41364a.f20023x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41364a.f20023x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41364a = new C41364a(interfaceC30057d);
                    }
                } else {
                    c41364a = new C41364a(interfaceC30057d);
                }
                Object obj2 = c41364a.f20022w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41364a.f20023x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f20016w;
                    AbstractC4813a0 abstractC4813a0M15295o = this.f20017x.m15295o((AbstractC36130w) obj);
                    c41364a.f20024y = null;
                    c41364a.f20018E = null;
                    c41364a.f20019F = null;
                    c41364a.f20020G = null;
                    c41364a.f20021H = 0;
                    c41364a.f20023x = 1;
                    if (interfaceC13062m.emit(abstractC4813a0M15295o, c41364a) == enumC31071a) {
                        return enumC31071a;
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

        public a0(InterfaceC13058l interfaceC13058l, C4834v c4834v) {
            this.f20014w = interfaceC13058l;
            this.f20015x = c4834v;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f20014w.collect(new a(interfaceC13062m, this.f20015x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cm2.z$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcm2/z$b;", "", "Lcm2/d;", "direction", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", "endDateRaw", "<init>", "(Lcm2/d;Lvl2/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcm2/d;", "()Lcm2/d;", "b", "Lvl2/a;", "()Lvl2/a;", "c", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC4816d direction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String endDateRaw;

        public b(EnumC4816d direction, EnumC36106a duration, String endDateRaw) {
            AbstractC22676k.m65750j(direction, "direction");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(endDateRaw, "endDateRaw");
            this.direction = direction;
            this.duration = duration;
            this.endDateRaw = endDateRaw;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4816d getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEndDateRaw() {
            return this.endDateRaw;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.direction == bVar.direction && this.duration == bVar.duration && AbstractC22676k.m65745e(this.endDateRaw, bVar.endDateRaw);
        }

        public int hashCode() {
            return this.endDateRaw.hashCode() + ((this.duration.hashCode() + (this.direction.hashCode() * 31)) * 31);
        }

        public String toString() {
            EnumC4816d enumC4816d = this.direction;
            EnumC36106a enumC36106a = this.duration;
            String str = this.endDateRaw;
            StringBuilder sb4 = new StringBuilder("PendingNavState(direction=");
            sb4.append(enumC4816d);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", endDateRaw=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cm2.z$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20029a;

        static {
            int[] iArr = new int[EnumC36106a.values().length];
            try {
                iArr[EnumC36106a.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36106a.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36106a.SIX_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36106a.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36106a.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20029a = iArr;
        }
    }

    /* JADX INFO: renamed from: cm2.z$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$isExerciseDetailsV2ExperimentEnabled$1", m100430f = "TrendsViewModel.kt", m100431l = {52, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f20030w;

        /* JADX INFO: renamed from: x */
        int f20031x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f20032y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C23996f f20033z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C23996f c23996f, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20033z = c23996f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f20033z, interfaceC30057d);
            dVar.f20032y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f20032y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f20031x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f20030w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                lf1.f r7 = r6.f20033z
                r6.f20032y = r5
                r6.f20030w = r0
                r6.f20031x = r4
                java.lang.Object r7 = r7.m70811a(r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f20032y = r5
                r6.f20030w = r5
                r6.f20031x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$10", m100430f = "TrendsViewModel.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20034w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20036y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC4837y abstractC4837y, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20036y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new e(this.f20036y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20034w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4838z.this.getAnalyticsHelper().m107325y(((AbstractC4837y.a) this.f20036y).getBody());
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.a aVar = new AbstractC36126s.a(((AbstractC4837y.a) this.f20036y).getBody());
                this.f20034w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$11", m100430f = "TrendsViewModel.kt", m100431l = {217}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20037w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20039y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC4837y abstractC4837y, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20039y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new f(this.f20039y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20037w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4838z.this.getAnalyticsHelper().m107325y(((AbstractC4837y.b) this.f20039y).getBody());
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.b bVar = new AbstractC36126s.b(((AbstractC4837y.b) this.f20039y).getBody());
                this.f20037w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$12", m100430f = "TrendsViewModel.kt", m100431l = {224}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20040w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20042y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC4837y abstractC4837y, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20042y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new g(this.f20042y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20040w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4838z.this.getAnalyticsHelper().m107324x(((AbstractC4837y.p) this.f20042y).getBody());
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.p pVar = new AbstractC36126s.p(((AbstractC4837y.p) this.f20042y).getId(), ((AbstractC4837y.p) this.f20042y).getBody());
                this.f20040w = 1;
                if (interfaceC13072o1.emit(pVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$13", m100430f = "TrendsViewModel.kt", m100431l = {231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20043w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC4837y abstractC4837y, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20045y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new h(this.f20045y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20043w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4838z.this.getAnalyticsHelper().m107323w(((AbstractC4837y.d) this.f20045y).getSource());
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.d dVar = new AbstractC36126s.d(((AbstractC4837y.d) this.f20045y).getId());
                this.f20043w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$14", m100430f = "TrendsViewModel.kt", m100431l = {237, 238}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20046w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20048y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC4837y abstractC4837y, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20048y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new i(this.f20048y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f20046w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L54
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                cm2.z r6 = cm2.C4838z.this
                ec3.o1 r6 = cm2.C4838z.m15397l(r6)
                vl2.s$f r1 = vl2.AbstractC36126s.f.f154418a
                r5.f20046w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L30
                goto L53
            L30:
                cm2.z r6 = cm2.C4838z.this
                ec3.o1 r6 = cm2.C4838z.m15397l(r6)
                vl2.s$e r1 = new vl2.s$e
                cm2.y r3 = r5.f20048y
                cm2.y$c r3 = (cm2.AbstractC4837y.c) r3
                cm2.i r3 = r3.getMeasurementId()
                cm2.y r4 = r5.f20048y
                cm2.y$c r4 = (cm2.AbstractC4837y.c) r4
                java.lang.String r4 = r4.getId()
                r1.<init>(r3, r4)
                r5.f20046w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$15", m100430f = "TrendsViewModel.kt", m100431l = {244}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20049w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20051y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC4837y abstractC4837y, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20051y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new j(this.f20051y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20049w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.g gVar = new AbstractC36126s.g(((AbstractC4837y.e) this.f20051y).getComponentId());
                this.f20049w = 1;
                if (interfaceC13072o1.emit(gVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$16", m100430f = "TrendsViewModel.kt", m100431l = {252}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20052w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC4837y abstractC4837y, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20054y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new k(this.f20054y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20052w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.menuSheetEventFlow;
                AbstractC36122o.b bVar = new AbstractC36122o.b(((InterfaceC1038q.a) ((AbstractC4837y.k) this.f20054y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getNewDate());
                this.f20052w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$17", m100430f = "TrendsViewModel.kt", m100431l = {257}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20055w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20057y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC4837y abstractC4837y, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20057y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new l(this.f20057y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20055w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.menuSheetEventFlow;
                AbstractC36122o.d dVar = new AbstractC36122o.d(((InterfaceC1038q.g) ((AbstractC4837y.k) this.f20057y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getNewValue());
                this.f20055w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$18", m100430f = "TrendsViewModel.kt", m100431l = {262}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20058w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20060y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AbstractC4837y abstractC4837y, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20060y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new m(this.f20060y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.menuSheetEventFlow;
                AbstractC36122o.c cVar = new AbstractC36122o.c(((InterfaceC1038q.f) ((AbstractC4837y.k) this.f20060y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getNewSource().toString());
                this.f20058w = 1;
                if (interfaceC13072o1.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$19", m100430f = "TrendsViewModel.kt", m100431l = {267, 268}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20061w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC4837y abstractC4837y, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20063y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new n(this.f20063y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f20061w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L60
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                cm2.z r6 = cm2.C4838z.this
                ec3.o1 r6 = cm2.C4838z.m15397l(r6)
                vl2.s$f r1 = vl2.AbstractC36126s.f.f154418a
                r5.f20061w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L30
                goto L5f
            L30:
                cm2.z r6 = cm2.C4838z.this
                ec3.o1 r6 = cm2.C4838z.m15397l(r6)
                vl2.s$e r1 = new vl2.s$e
                cm2.y r3 = r5.f20063y
                cm2.y$k r3 = (cm2.AbstractC4837y.k) r3
                am2.q r3 = r3.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()
                am2.q$b r3 = (am2.InterfaceC1038q.b) r3
                cm2.i r3 = r3.getMeasurementId()
                cm2.y r4 = r5.f20063y
                cm2.y$k r4 = (cm2.AbstractC4837y.k) r4
                am2.q r4 = r4.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()
                am2.q$b r4 = (am2.InterfaceC1038q.b) r4
                java.lang.String r4 = r4.getId()
                r1.<init>(r3, r4)
                r5.f20061w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$1", m100430f = "TrendsViewModel.kt", m100431l = {152, 153}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20064w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20066y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AbstractC4837y abstractC4837y, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20066y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new o(this.f20066y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L15;
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
                int r1 = r7.f20064w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r8)
                goto L77
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4b
            L1c:
                p505ts.AbstractC34132o.m107864I(r8)
                cm2.z r8 = cm2.C4838z.this
                ec3.o1 r8 = cm2.C4838z.m15397l(r8)
                vl2.s$i r1 = new vl2.s$i
                cm2.y r4 = r7.f20066y
                cm2.y$n r4 = (cm2.AbstractC4837y.n) r4
                or2.h0 r4 = r4.getGraphKey()
                cm2.y r5 = r7.f20066y
                cm2.y$n r5 = (cm2.AbstractC4837y.n) r5
                java.lang.String r5 = r5.getDateString()
                cm2.y r6 = r7.f20066y
                cm2.y$n r6 = (cm2.AbstractC4837y.n) r6
                boolean r6 = r6.getSendTileProperties()
                r1.<init>(r4, r5, r6)
                r7.f20064w = r3
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L4b
                goto L76
            L4b:
                cm2.z r8 = cm2.C4838z.this
                ec3.o1 r8 = cm2.C4838z.m15398n(r8)
                vl2.x$a r1 = new vl2.x$a
                cm2.y r3 = r7.f20066y
                cm2.y$n r3 = (cm2.AbstractC4837y.n) r3
                vl2.a r3 = r3.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String()
                cm2.y r4 = r7.f20066y
                cm2.y$n r4 = (cm2.AbstractC4837y.n) r4
                or2.h0 r4 = r4.getGraphKey()
                cm2.y r5 = r7.f20066y
                cm2.y$n r5 = (cm2.AbstractC4837y.n) r5
                java.lang.String r5 = r5.getDateString()
                r1.<init>(r3, r4, r5)
                r7.f20064w = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L77
            L76:
                return r0
            L77:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$p */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$20", m100430f = "TrendsViewModel.kt", m100431l = {272}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20067w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC4837y abstractC4837y, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20069y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new p(this.f20069y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20067w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.c cVar = new AbstractC36126s.c(((InterfaceC1038q.e) ((AbstractC4837y.k) this.f20069y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getMeasurementId(), C4838z.this.m15394F(((InterfaceC1038q.e) ((AbstractC4837y.k) this.f20069y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getMeasurement()));
                this.f20067w = 1;
                if (interfaceC13072o1.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$q */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$21", m100430f = "TrendsViewModel.kt", m100431l = {276}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20070w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20072y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(AbstractC4837y abstractC4837y, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20072y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new q(this.f20072y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20070w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.h hVar = new AbstractC36126s.h(((InterfaceC1038q.c) ((AbstractC4837y.k) this.f20072y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getMeasurementId(), C4838z.this.m15394F(((InterfaceC1038q.c) ((AbstractC4837y.k) this.f20072y).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getMeasurement()));
                this.f20070w = 1;
                if (interfaceC13072o1.emit(hVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$r */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$22", m100430f = "TrendsViewModel.kt", m100431l = {280}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20073w;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new r(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20073w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.menuSheetEventFlow;
                AbstractC36122o.a aVar = AbstractC36122o.a.f154402a;
                this.f20073w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$s */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$2", m100430f = "TrendsViewModel.kt", m100431l = {159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20075w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20077y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(AbstractC4837y abstractC4837y, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20077y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new s(this.f20077y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20075w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.localStateEventFlow;
                AbstractC36131x.a aVar = new AbstractC36131x.a(((AbstractC4837y.f) this.f20077y).getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), ((AbstractC4837y.f) this.f20077y).getGraphKey(), ((AbstractC4837y.f) this.f20077y).getDateString());
                this.f20075w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$t */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$3", m100430f = "TrendsViewModel.kt", m100431l = {165}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20078w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20080y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AbstractC4837y abstractC4837y, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20080y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new t(this.f20080y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20078w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.localStateEventFlow;
                AbstractC36131x.b bVar = new AbstractC36131x.b(((AbstractC4837y.l) this.f20080y).m15379d(), ((AbstractC4837y.l) this.f20080y).getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), ((AbstractC4837y.l) this.f20080y).getGraphKey(), ((AbstractC4837y.l) this.f20080y).getDateString());
                this.f20078w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$u */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$4", m100430f = "TrendsViewModel.kt", m100431l = {171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20081w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20083y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(AbstractC4837y abstractC4837y, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20083y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new u(this.f20083y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20081w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.l lVar = new AbstractC36126s.l(((AbstractC4837y.h) this.f20083y).getGraphKey());
                this.f20081w = 1;
                if (interfaceC13072o1.emit(lVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$v */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$5", m100430f = "TrendsViewModel.kt", m100431l = {177}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20084w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20086y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(AbstractC4837y abstractC4837y, InterfaceC30057d<? super v> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20086y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new v(this.f20086y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20084w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.j jVar = new AbstractC36126s.j(((AbstractC4837y.i) this.f20086y).getMeasurementId());
                this.f20084w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$w */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$6", m100430f = "TrendsViewModel.kt", m100431l = {183, 184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20087w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20089y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(AbstractC4837y abstractC4837y, InterfaceC30057d<? super w> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20089y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new w(this.f20089y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f20087w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L4c
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                cm2.z r5 = cm2.C4838z.this
                ec3.o1 r5 = cm2.C4838z.m15397l(r5)
                vl2.s$o r1 = vl2.AbstractC36126s.o.f154431a
                r4.f20087w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L30
                goto L4b
            L30:
                cm2.z r5 = cm2.C4838z.this
                ec3.o1 r5 = cm2.C4838z.m15397l(r5)
                vl2.s$j r1 = new vl2.s$j
                cm2.y r3 = r4.f20089y
                cm2.y$m r3 = (cm2.AbstractC4837y.m) r3
                cm2.i r3 = r3.getMeasurementId()
                r1.<init>(r3)
                r4.f20087w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$x */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$7", m100430f = "TrendsViewModel.kt", m100431l = {190, 191}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20090w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20092y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(AbstractC4837y abstractC4837y, InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20092y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new x(this.f20092y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f20090w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L4c
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                cm2.z r5 = cm2.C4838z.this
                ec3.o1 r5 = cm2.C4838z.m15397l(r5)
                vl2.s$n r1 = vl2.AbstractC36126s.n.f154430a
                r4.f20090w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L30
                goto L4b
            L30:
                cm2.z r5 = cm2.C4838z.this
                ec3.o1 r5 = cm2.C4838z.m15397l(r5)
                vl2.s$j r1 = new vl2.s$j
                cm2.y r3 = r4.f20092y
                cm2.y$o r3 = (cm2.AbstractC4837y.o) r3
                cm2.i r3 = r3.getMeasurementId()
                r1.<init>(r3)
                r4.f20090w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: cm2.C4838z.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cm2.z$y */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$8", m100430f = "TrendsViewModel.kt", m100431l = {197}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20093w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4837y f20095y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(AbstractC4837y abstractC4837y, InterfaceC30057d<? super y> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f20095y = abstractC4837y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new y(this.f20095y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((y) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20093w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.k kVar = new AbstractC36126s.k(((AbstractC4837y.g) this.f20095y).getGraphKey(), ((AbstractC4837y.g) this.f20095y).getNextToken());
                this.f20093w = 1;
                if (interfaceC13072o1.emit(kVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cm2.z$z */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$9", m100430f = "TrendsViewModel.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f20096w;

        public z(InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4838z.this.new z(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f20096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4838z.this.apiEventFlow;
                AbstractC36126s.m mVar = AbstractC36126s.m.f154429a;
                this.f20096w = 1;
                if (interfaceC13072o1.emit(mVar, this) == enumC31071a) {
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

    public C4838z(C36128u apiInteractor, C36119l stateInteractor, C36123p trendMenuSheetStateInteractor, C36129v trendsDomainReducer, C4834v reducer, InterfaceC34116n logger, C33920a analyticsHelper, C23996f experimentHelper) {
        AbstractC22676k.m65750j(apiInteractor, "apiInteractor");
        AbstractC22676k.m65750j(stateInteractor, "stateInteractor");
        AbstractC22676k.m65750j(trendMenuSheetStateInteractor, "trendMenuSheetStateInteractor");
        AbstractC22676k.m65750j(trendsDomainReducer, "trendsDomainReducer");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(experimentHelper, "experimentHelper");
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this._selectedTrend = c13045h2M36593c;
        this.selectedTrend = c13045h2M36593c;
        C13084s1 c13084s1 = new C13084s1(new d(experimentHelper, null));
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        Boolean bool = Boolean.FALSE;
        C13021b2 c13021b2 = C13105z1.f45288a;
        this.isExerciseDetailsV2ExperimentEnabled = AbstractC13091v.m36587M(c13084s1, c26444aM5043b, c13021b2, bool);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.apiEventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m15391A(c13096w1M36592b, apiInteractor), AbstractC1640x1.m5043b(this), c13021b2, 1);
        this.apiDomainState = c13078q1M36586L;
        this.pendingNavQueue = new C25258m();
        C11923h c11923hM92111d = AbstractC30060g.m92111d(-2, 6, null);
        this.analyticsEventsChannel = c11923hM92111d;
        this.analyticsEvents = AbstractC13091v.m36585K(c11923hM92111d);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.localStateEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM15404y = m15404y(c13096w1M36592b2, stateInteractor);
        this.stateDomainState = interfaceC13058lM15404y;
        C13096w1 c13096w1M36592b3 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.menuSheetEventFlow = c13096w1M36592b3;
        InterfaceC13058l interfaceC13058lM15405z = m15405z(c13096w1M36592b3, trendMenuSheetStateInteractor);
        this.menuSheetDomainState = interfaceC13058lM15405z;
        this.viewState = new a0(AbstractC13091v.m36586L(trendsDomainReducer.m114903d(c13078q1M36586L, interfaceC13058lM15404y, interfaceC13058lM15405z), AbstractC1640x1.m5043b(this), c13021b2, 0), reducer);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC13058l m15391A(InterfaceC13058l interfaceC13058l, C36128u c36128u) {
        return c36128u.m114893H(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final String m15392C(String raw) {
        try {
            String string = ISODateTimeFormat.dateTimeParser().withZoneUTC().parseDateTime(raw).toString("yyyy-MM-dd");
            AbstractC22676k.m65747g(string);
            return string;
        } catch (IllegalArgumentException e5) {
            this.logger.mo85213c(AbstractC11266d.m30461o("Failed to parse trend date as datetime: ", raw), e5, new AbstractC30556a.a[0]);
            try {
                raw = ISODateTimeFormat.date().parseLocalDate(raw).toString();
            } catch (IllegalArgumentException e13) {
                this.logger.mo85213c(AbstractC11266d.m30461o("Failed to parse trend date as date-only, using raw value: ", raw), e13, new AbstractC30556a.a[0]);
            }
            AbstractC22676k.m65747g(raw);
            return raw;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final TimeSegmentDtoV3 m15393E(AbstractC36127t.c result, EnumC36106a duration) {
        int i13 = c.f20029a[duration.ordinal()];
        if (i13 == 1) {
            return result.getWeekTimeSegment();
        }
        if (i13 == 2) {
            return result.getMonthTimeSegment();
        }
        if (i13 == 3) {
            return result.getSixMonthTimeSegment();
        }
        if (i13 == 4) {
            return result.getAllTimeSegment();
        }
        if (i13 == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C36107a0 m15394F(AbstractC17674d abstractC17674d) {
        if (!(abstractC17674d instanceof AbstractC17674d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17674d.a aVar = (AbstractC17674d.a) abstractC17674d;
        return new C36107a0(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), aVar.getVo2MaxValue(), aVar.getSource().toString(), aVar.getId());
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC13058l m15404y(InterfaceC13058l interfaceC13058l, C36119l c36119l) {
        return c36119l.m114786a(interfaceC13058l);
    }

    /* JADX INFO: renamed from: z */
    private final InterfaceC13058l m15405z(InterfaceC13058l interfaceC13058l, C36123p c36123p) {
        return c36123p.m114798c(interfaceC13058l);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final InterfaceC13037f2 getIsExerciseDetailsV2ExperimentEnabled() {
        return this.isExerciseDetailsV2ExperimentEnabled;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC3027k1 m15407D(AbstractC4837y viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC4837y.n) {
            AbstractC4837y.n nVar = (AbstractC4837y.n) viewEvent;
            ((C13045h2) this._selectedTrend).m36570j(nVar.getGraphKey().toTrendKey());
            if (nVar.getDirection() == EnumC4816d.PREVIOUS || nVar.getDirection() == EnumC4816d.NEXT) {
                this.pendingNavQueue.addLast(new b(nVar.getDirection(), nVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), nVar.getDateString()));
            } else {
                this.pendingNavQueue.clear();
            }
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new o(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.f) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new s(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.l) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new t(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.h) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new u(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.i) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new v(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.m) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new w(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.o) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new x(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.g) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new y(viewEvent, null), 3);
        }
        if (viewEvent.equals(AbstractC4837y.j.f19977a)) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new z(null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.a) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.b) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.p) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.d) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new h(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.c) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(viewEvent, null), 3);
        }
        if (viewEvent instanceof AbstractC4837y.e) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new j(viewEvent, null), 3);
        }
        if (!(viewEvent instanceof AbstractC4837y.k)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC1038q interfaceC1038q = ((AbstractC4837y.k) viewEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (interfaceC1038q instanceof InterfaceC1038q.a) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new k(viewEvent, null), 3);
        }
        if (interfaceC1038q instanceof InterfaceC1038q.g) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new l(viewEvent, null), 3);
        }
        if (interfaceC1038q instanceof InterfaceC1038q.f) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new m(viewEvent, null), 3);
        }
        if (interfaceC1038q instanceof InterfaceC1038q.b) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new n(viewEvent, null), 3);
        }
        if (interfaceC1038q instanceof InterfaceC1038q.e) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new p(viewEvent, null), 3);
        }
        if (interfaceC1038q instanceof InterfaceC1038q.c) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new q(viewEvent, null), 3);
        }
        if (AbstractC22676k.m65745e(interfaceC1038q, InterfaceC1038q.d.f4000a)) {
            return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new r(null), 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC13058l getAnalyticsEvents() {
        return this.analyticsEvents;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C33920a getAnalyticsHelper() {
        return this.analyticsHelper;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final InterfaceC13037f2 getSelectedTrend() {
        return this.selectedTrend;
    }
}
