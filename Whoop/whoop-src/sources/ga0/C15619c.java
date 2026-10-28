package ga0;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bh3.InterfaceC3255b;
import bh3.InterfaceC3259f;
import c93.InterfaceC4351m;
import ch3.C4716w0;
import com.whoop.addactivity.network.CreateActivityRequest;
import com.whoop.addactivity.network.CreateActivityResponse;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.service.network.model.cycles.Period;
import com.whoop.service.network.model.cycles.Workout;
import fh3.C14493a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34850x0;
import xg3.C38280g;
import xg3.C38289p;
import xg3.InterfaceC38290q;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ga0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lga0/c;", "", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lbc3/c0;", "scope", "Lin2/d;", "dispatcherFactory", "<init>", "(Lcom/whoop/service/network/ActivitiesApi;Lbc3/c0;Lin2/d;)V", "Lpg3/v0;", "Lcom/whoop/addactivity/network/CreateActivityResponse;", "response", "", "sportId", "", "isGpsEnabled", "Lcom/whoop/service/network/model/cycles/Workout;", "e", "(Lpg3/v0;IZ)Lpg3/v0;", "activityCreated", "g", "(Lcom/whoop/addactivity/network/CreateActivityResponse;IZ)Lcom/whoop/service/network/model/cycles/Workout;", "", "during", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "Lorg/joda/time/DateTime;", "startTime", "endTime", "Lxg3/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;", "a", "Lcom/whoop/service/network/ActivitiesApi;", "b", "Lbc3/c0;", "c", "Lin2/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15619c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: ga0.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.AddActivityRepository$postWorkoutV2$single$1$job$1", m100430f = "AddActivityRepository.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f58640E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f58641F;

        /* JADX INFO: renamed from: w */
        int f58642w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CreateActivityRequest f58644y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC38290q f58645z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CreateActivityRequest createActivityRequest, InterfaceC38290q interfaceC38290q, int i13, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58644y = createActivityRequest;
            this.f58645z = interfaceC38290q;
            this.f58640E = i13;
            this.f58641F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15619c.this.new a(this.f58644y, this.f58645z, this.f58640E, this.f58641F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58642w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ActivitiesApi activitiesApi = C15619c.this.activitiesApi;
                    CreateActivityRequest createActivityRequest = this.f58644y;
                    this.f58642w = 1;
                    obj = activitiesApi.postWorkoutV2(createActivityRequest, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                InterfaceC38290q interfaceC38290q = this.f58645z;
                C4716w0 c4716w0 = (C4716w0) interfaceC38290q;
                c4716w0.m14775d(C15619c.this.m43939e((C29218v0) obj, this.f58640E, this.f58641F));
            } catch (Exception e5) {
                ((C4716w0) this.f58645z).m14774c(e5);
            }
            return C23454a0.f92919a;
        }
    }

    public C15619c(ActivitiesApi activitiesApi, InterfaceC2994c0 scope, InterfaceC18732d dispatcherFactory) {
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        this.activitiesApi = activitiesApi;
        this.scope = scope;
        this.dispatcherFactory = dispatcherFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final C29218v0<Workout> m43939e(C29218v0<CreateActivityResponse> response, int sportId, boolean isGpsEnabled) {
        C34850x0 c34850x0 = response.f118269a;
        if (!c34850x0.f146788Q) {
            return C29218v0.m88723a(c34850x0.f146792z, response.f118271c);
        }
        CreateActivityResponse createActivityResponse = (CreateActivityResponse) response.f118270b;
        if (createActivityResponse != null) {
            return C29218v0.m88726d(m43941g(createActivityResponse, sportId, isGpsEnabled), response.f118269a);
        }
        throw new IllegalStateException("Activity creation body shouldn't be null on successful creation ");
    }

    /* JADX INFO: renamed from: f */
    private final List<String> m43940f(String during) {
        return AbstractC39414r.m125906y0(during, new String[]{","}, 6);
    }

    /* JADX INFO: renamed from: g */
    private final Workout m43941g(CreateActivityResponse activityCreated, int sportId, boolean isGpsEnabled) {
        List<String> listM43940f = m43940f(activityCreated.getDuring());
        return new Workout(activityCreated.getState(), new Period(listM43940f.get(0), listM43940f.get(1)), activityCreated.getTimeZoneOffset(), sportId, isGpsEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m43942i(C15619c c15619c, CreateActivityRequest createActivityRequest, int i13, boolean z4, InterfaceC38290q interfaceC38290q) {
        final C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(c15619c.scope, c15619c.dispatcherFactory.mo54465b(), null, c15619c.new a(createActivityRequest, interfaceC38290q, i13, z4, null), 2);
        InterfaceC3259f interfaceC3259f = new InterfaceC3259f() { // from class: ga0.b
            @Override // bh3.InterfaceC3259f
            public final void cancel() {
                C15619c.m43943j(c2996c2M8732z);
            }
        };
        C4716w0 c4716w0 = (C4716w0) interfaceC38290q;
        c4716w0.getClass();
        c4716w0.f19294x.m41405c(new C14493a(interfaceC3259f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m43943j(InterfaceC3027k1 interfaceC3027k1) {
        interfaceC3027k1.cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: h */
    public final C38280g<C29218v0<Workout>> m43944h(final int sportId, DateTime startTime, DateTime endTime, final boolean isGpsEnabled) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        DateTimeRange.Companion companion = DateTimeRange.INSTANCE;
        String string = startTime.toString(companion.getDateTimeFormatter().withZoneUTC());
        AbstractC22676k.m65749i(string, "toString(...)");
        String string2 = endTime.toString(companion.getDateTimeFormatter().withZoneUTC());
        AbstractC22676k.m65749i(string2, "toString(...)");
        final CreateActivityRequest createActivityRequest = new CreateActivityRequest(sportId, 0, string, string2, isGpsEnabled);
        C38280g<C29218v0<Workout>> c38280gM122683a = C38289p.m122683a(C38289p.m122684b(new InterfaceC3255b() { // from class: ga0.a
            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                C15619c.m43942i(this.f58632w, createActivityRequest, sportId, isGpsEnabled, (InterfaceC38290q) obj);
            }
        }));
        AbstractC22676k.m65747g(c38280gM122683a);
        return c38280gM122683a;
    }
}
