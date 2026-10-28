package o52;

import android.content.Context;
import androidx.lifecycle.C1630u0;
import bc3.InterfaceC2994c0;
import bl2.C3374c;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.service.network.model.UserSessionDto;
import dq1.C12288a;
import eq1.C13562a;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Iterator;
import java.util.List;
import l73.AbstractC23410a;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.C23465k;
import m73.AbstractC25214b;
import m73.C25217e;
import mm.C25680d;
import n73.C26442a;
import or2.C28150c;
import or2.C28180m;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24947b;
import p92.C29019h;
import q30.C29934u0;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import rd1.C31245d;
import rd1.EnumC31243b;
import sk.AbstractC32570a;
import t73.C33589b;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import us0.InterfaceC35211g;
import w73.C36918d;
import w73.C36920f;
import w73.C36930p;
import wb3.AbstractC37056f;
import yu0.C39787d;
import yu0.EnumC39788e;
import zg3.C40634a;

/* JADX INFO: renamed from: o52.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0016H\u0014¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R+\u0010G\u001a\u00020:2\u0006\u0010@\u001a\u00020:8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020H098\u0006¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010>R+\u0010Q\u001a\u00020H2\u0006\u0010@\u001a\u00020H8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010-R\"\u0010]\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00105\u001a\u0004\bZ\u00107\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010i\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010k\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bj\u0010h¨\u0006l"}, m65681d2 = {"Lo52/n;", "Lhj0/o;", "Landroid/content/Context;", "context", "Ltd1/b;", "whoopStrapProxy", "Lor2/c;", "appDiagnostics", "Lrd1/d;", "realTimeStateMachine", "Leq1/a;", "hrZonesRepository", "Lus0/g;", "liveHrZeroAnalytics", "Lyu0/d;", "gen5ConnectivityAnalyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Landroid/content/Context;Ltd1/b;Lor2/c;Lrd1/d;Leq1/a;Lus0/g;Lyu0/d;Lbc3/c0;)V", "Lp92/h;", "strainController", "Ll83/a0;", "H0", "(Lp92/h;)V", "u0", "S0", "()V", "l0", "r0", "o0", "c0", "onCleared", "", "heartRate", "X0", "(I)V", "E", "Landroid/content/Context;", "F", "Ltd1/b;", "G", "Lor2/c;", "H", "Lrd1/d;", "I", "Leq1/a;", "J", "Lus0/g;", "K", "Lyu0/d;", "", "L", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/u0;", "Lo52/p;", "M", "Landroidx/lifecycle/u0;", "i0", "()Landroidx/lifecycle/u0;", "viewStateHeartRateLiveData", "<set-?>", "N", "Lf93/d;", "h0", "()Lo52/p;", "W0", "(Lo52/p;)V", "viewStateHeartRate", "Lo52/f;", "O", "f0", "viewStateActivityLiveData", "P", "g0", "()Lo52/f;", "V0", "(Lo52/f;)V", "viewStateActivityStrain", "Q", "Lp92/h;", "strainControllerForHeartRate", "R", "strainControllerForActivityStrain", "S", "lastHeartRate", "T", "d0", "T0", "(Ljava/lang/String;)V", "lastCalorieCount", "", "U", "D", "e0", "()D", "U0", "(D)V", "lastRealTimeStrain", "", "k0", "()Z", "isBluetoothSupportedAndEnabled", "j0", "whoopStrapProxyStatusIsReady", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27567n extends AbstractC17356o {

    /* JADX INFO: renamed from: V */
    static final /* synthetic */ InterfaceC21493z[] f110976V;

    /* JADX INFO: renamed from: W */
    public static final int f110977W;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C31245d realTimeStateMachine;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C13562a hrZonesRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC35211g liveHrZeroAnalytics;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C39787d gen5ConnectivityAnalyticsHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C1630u0 viewStateHeartRateLiveData;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC14292d viewStateHeartRate;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C1630u0 viewStateActivityLiveData;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC14292d viewStateActivityStrain;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private C29019h strainControllerForHeartRate;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private C29019h strainControllerForActivityStrain;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int lastHeartRate;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private String lastCalorieCount;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private double lastRealTimeStrain;

    /* JADX INFO: renamed from: o52.n$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"o52/n$a", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C27571p value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27567n f110996x;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, C27567n c27567n) {
            this.f110996x = c27567n;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C27571p getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C27571p value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f110996x.getViewStateHeartRateLiveData().postValue(value);
        }
    }

    /* JADX INFO: renamed from: o52.n$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"o52/n$b", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C27551f value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27567n f110998x;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, C27567n c27567n) {
            this.f110998x = c27567n;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C27551f getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C27551f value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f110998x.getViewStateActivityLiveData().postValue(value);
        }
    }

    static {
        C22686q c22686q = new C22686q(C27567n.class, "viewStateHeartRate", "getViewStateHeartRate()Lcom/whoop/realtime/presentation/RealTimeHeartRateViewState;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f110976V = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C27567n.class, "viewStateActivityStrain", "getViewStateActivityStrain()Lcom/whoop/realtime/presentation/RealTimeActivityStrainViewState;", 0, c22673i0)};
        f110977W = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27567n(Context context, InterfaceC33704b whoopStrapProxy, C28150c appDiagnostics, C31245d realTimeStateMachine, C13562a hrZonesRepository, InterfaceC35211g liveHrZeroAnalytics, C39787d gen5ConnectivityAnalyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(realTimeStateMachine, "realTimeStateMachine");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(liveHrZeroAnalytics, "liveHrZeroAnalytics");
        AbstractC22676k.m65750j(gen5ConnectivityAnalyticsHelper, "gen5ConnectivityAnalyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.context = context;
        this.whoopStrapProxy = whoopStrapProxy;
        this.appDiagnostics = appDiagnostics;
        this.realTimeStateMachine = realTimeStateMachine;
        this.hrZonesRepository = hrZonesRepository;
        this.liveHrZeroAnalytics = liveHrZeroAnalytics;
        this.gen5ConnectivityAnalyticsHelper = gen5ConnectivityAnalyticsHelper;
        this.logTag = "RealTimeHeartRateViewModel";
        this.viewStateHeartRateLiveData = new C1630u0();
        this.viewStateHeartRate = new a(new C27571p(0, 0.0d, 0, null, 0, null, null, 127, null), this);
        this.viewStateActivityLiveData = new C1630u0();
        Object[] objArr = 0 == true ? 1 : 0;
        this.viewStateActivityStrain = new b(new C27551f(objArr, 0, 0.0d, 0, null, 0, false, false, 255, null), this);
        this.lastCalorieCount = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m83184A0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m83186B0(C27567n c27567n, Integer num) {
        C27551f c27551fM83228g0 = c27567n.m83228g0();
        AbstractC22676k.m65747g(num);
        c27567n.m83220V0(C27551f.m83153b(c27551fM83228g0, false, 0, 0.0d, num.intValue(), null, 0, false, false, 247, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m83188C0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m83190D0(C27567n c27567n, C23465k c23465k) {
        C27551f c27551fM83228g0 = c27567n.m83228g0();
        AbstractC22676k.m65747g(c23465k);
        c27567n.m83220V0(C27551f.m83153b(c27551fM83228g0, false, 0, 0.0d, 0, c23465k, 0, false, false, 239, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m83192E0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m83194F0(C27567n c27567n, Integer num) {
        C27551f c27551fM83228g0 = c27567n.m83228g0();
        AbstractC22676k.m65747g(num);
        c27567n.m83220V0(C27551f.m83153b(c27551fM83228g0, false, 0, 0.0d, 0, null, num.intValue(), false, false, 223, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m83196G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m83199I0(C27567n c27567n, C23465k c23465k) {
        c27567n.m83222W0(C27571p.m83261b(c27567n.m83229h0(), ((Number) c23465k.f92938x).intValue(), 0.0d, 0, null, 0, null, null, 126, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m83200J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m83202K0(C27567n c27567n, Double d3) {
        C27571p c27571pM83229h0 = c27567n.m83229h0();
        AbstractC22676k.m65747g(d3);
        c27567n.m83222W0(C27571p.m83261b(c27571pM83229h0, 0, d3.doubleValue(), 0, null, 0, null, null, 125, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m83204L0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m83206M0(C27567n c27567n, Integer num) {
        C27571p c27571pM83229h0 = c27567n.m83229h0();
        AbstractC22676k.m65747g(num);
        c27567n.m83222W0(C27571p.m83261b(c27571pM83229h0, 0, 0.0d, num.intValue(), null, 0, null, null, 123, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m83208N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23465k m83210O0(Integer hr3, List zones) {
        Object next;
        AbstractC22676k.m65750j(hr3, "hr");
        AbstractC22676k.m65750j(zones, "zones");
        Iterator it = zones.iterator();
        while (it.hasNext()) {
            next = it.next();
            C12288a c12288a = (C12288a) next;
            int iM34203b = c12288a.getMin();
            int iM34202a = c12288a.getMax();
            int iIntValue = hr3.intValue();
            if (iM34203b <= iIntValue && iIntValue <= iM34202a) {
                return new C23465k(hr3, (C12288a) next);
            }
        }
        next = null;
        return new C23465k(hr3, (C12288a) next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23465k m83212P0(InterfaceC4351m interfaceC4351m, Object p13, Object p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        return (C23465k) interfaceC4351m.invoke(p13, p14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m83214Q0(C27567n c27567n, C23465k c23465k) {
        Object obj = c23465k.f92937w;
        AbstractC22676k.m65749i(obj, "<get-first>(...)");
        c27567n.m83224X0(((Number) obj).intValue());
        C27571p c27571pM83229h0 = c27567n.m83229h0();
        Object obj2 = c23465k.f92937w;
        AbstractC22676k.m65749i(obj2, "<get-first>(...)");
        c27567n.m83222W0(C27571p.m83261b(c27571pM83229h0, 0, 0.0d, 0, null, ((Number) obj2).intValue(), null, AbstractC27569o.m83260b((C12288a) c23465k.f92938x), 47, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m83216R0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m83220V0(C27551f c27551f) {
        this.viewStateActivityStrain.setValue(this, f110976V[1], c27551f);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m83222W0(C27571p c27571p) {
        this.viewStateHeartRate.setValue(this, f110976V[0], c27571p);
    }

    /* JADX INFO: renamed from: X0 */
    private final void m83224X0(int heartRate) {
        this.liveHrZeroAnalytics.mo71194a(heartRate, "strain_coach");
    }

    /* JADX INFO: renamed from: g0 */
    private final C27551f m83228g0() {
        return (C27551f) this.viewStateActivityStrain.getValue(this, f110976V[1]);
    }

    /* JADX INFO: renamed from: h0 */
    private final C27571p m83229h0() {
        return (C27571p) this.viewStateHeartRate.getValue(this, f110976V[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m83230m0(C27567n c27567n, Integer num) {
        c27567n.m83220V0(C27551f.m83153b(c27567n.m83228g0(), true, 0, 0.0d, 0, null, 0, false, false, 254, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m83231n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m83232p0(C27567n c27567n, EnumC31243b enumC31243b) {
        c27567n.m83220V0(C27551f.m83153b(c27567n.m83228g0(), true, 0, 0.0d, 0, null, 0, false, false, 254, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m83233q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m83234s0(C27567n c27567n, EnumC33707e enumC33707e) {
        c27567n.m83220V0(C27551f.m83153b(c27567n.m83228g0(), true, 0, 0.0d, 0, null, 0, false, false, 254, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m83235t0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m83236v0(C27567n c27567n, Integer num) {
        AbstractC22676k.m65747g(num);
        c27567n.lastHeartRate = num.intValue();
        c27567n.m83224X0(num.intValue());
        c27567n.m83220V0(C27551f.m83153b(c27567n.m83228g0(), false, num.intValue(), 0.0d, 0, null, 0, false, false, 253, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m83238w0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m83239x0(C27567n c27567n, Boolean bool) {
        c27567n.m83220V0(C27551f.m83153b(c27567n.m83228g0(), false, 0, 0.0d, 0, null, 0, false, true, 127, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83241y0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m83243z0(C27567n c27567n, Double d3) {
        C27551f c27551fM83228g0 = c27567n.m83228g0();
        AbstractC22676k.m65747g(d3);
        c27567n.m83220V0(C27551f.m83153b(c27551fM83228g0, false, 0, d3.doubleValue(), 0, null, 0, false, false, 251, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m83244H0(C29019h strainController) {
        AbstractC22676k.m65750j(strainController, "strainController");
        m83222W0(C27571p.m83261b(m83229h0(), 0, 0.0d, 0, null, 0, null, null, 126, null));
        this.strainControllerForHeartRate = strainController;
        m83222W0(C27571p.m83261b(m83229h0(), 0, 0.0d, 0, null, 0, strainController, null, 95, null));
        getSubscriptions().m75179c(strainController.m88240R().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 5), 14)));
        getSubscriptions().m75179c(strainController.m88243V().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 6), 16)));
        int i13 = 7;
        getSubscriptions().m75179c(strainController.m88234K().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, i13), 17)));
        C26442a c26442aM49135l = getDisposables();
        AbstractC23412c abstractC23412cM88238P = strainController.m88238P();
        C36920f c36920fM118982g = AbstractC37056f.m118982g(this.hrZonesRepository.m38283l());
        C25680d c25680d = new C25680d(new C24947b(23), i13);
        AbstractC31056a.m95616a(abstractC23412cM88238P, "source1 is null");
        C29934u0 c29934u0 = new C29934u0(c25680d, i13);
        int i14 = AbstractC23410a.f92767w;
        AbstractC31056a.m95617b(i14, "bufferSize");
        C36918d c36918d = new C36918d(new AbstractC23412c[]{abstractC23412cM88238P, c36920fM118982g}, c29934u0, i14 << 1);
        C25217e c25217e = AbstractC25214b.f99025a;
        if (c25217e == null) {
            throw new NullPointerException("scheduler == null");
        }
        C36930p c36930pM67904a = c36918d.m67904a(c25217e);
        int i15 = 8;
        C33589b c33589b = new C33589b(new C25680d(new C27565m(this, i15), i15), AbstractC31056a.f128065d);
        c36930pM67904a.m67905c(c33589b);
        c26442aM49135l.mo78293a(c33589b);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m83245S0() {
        this.gen5ConnectivityAnalyticsHelper.m127501d(ConnectivityFeatureFlagsKt.SC_GEN5_CONNECTIVITY_ANALYTICS, "Strain Coach");
    }

    /* JADX INFO: renamed from: T0 */
    public final void m83246T0(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.lastCalorieCount = str;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m83247U0(double d3) {
        this.lastRealTimeStrain = d3;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m83248c0() {
        m83220V0(C27551f.m83153b(m83228g0(), false, 0, 0.0d, 0, null, 0, false, false, 127, null));
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final String getLastCalorieCount() {
        return this.lastCalorieCount;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final double getLastRealTimeStrain() {
        return this.lastRealTimeStrain;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final C1630u0 getViewStateActivityLiveData() {
        return this.viewStateActivityLiveData;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final C1630u0 getViewStateHeartRateLiveData() {
        return this.viewStateHeartRateLiveData;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m83253j0() {
        return this.whoopStrapProxy.mo106484A().isReady();
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m83254k0() {
        return this.appDiagnostics.m85181d();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m83255l0() {
        getSubscriptions().m75179c(AbstractC32570a.m101620a(this.context).m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 0), 15)));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m83256o0() {
        getSubscriptions().m75179c(this.realTimeStateMachine.m96242Q().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 9), 18)));
    }

    @Override // hj0.AbstractC17356o, androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        this.liveHrZeroAnalytics.mo71195b("strain_coach");
        super.onCleared();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m83257r0() {
        getSubscriptions().m75179c(this.whoopStrapProxy.mo106496i().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 10), 19)));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m83258u0(C29019h strainController) {
        AbstractC22676k.m65750j(strainController, "strainController");
        m49136n().mo85216g("RealTimeStrainFragment received strainController!  Subscribing for live updates", new AbstractC30556a.a[0]);
        this.gen5ConnectivityAnalyticsHelper.m127500c(ConnectivityFeatureFlagsKt.SC_GEN5_CONNECTIVITY_ANALYTICS, EnumC39788e.REALTIME_HEART_RATE);
        this.strainControllerForActivityStrain = strainController;
        getSubscriptions().m75179c(strainController.m88237O().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 11), 21)));
        getSubscriptions().m75179c(strainController.m88243V().m122657G().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 1), 10)));
        getSubscriptions().m75179c(strainController.m88239Q().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 2), 11)));
        getSubscriptions().m75179c(strainController.m88240R().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 3), 12)));
        getSubscriptions().m75179c(strainController.m88234K().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 4), 13)));
        if (strainController.m88233J()) {
            m49136n().mo85216g("strainFragment setting goal reached already on startup", new AbstractC30556a.a[0]);
            m83220V0(C27551f.m83153b(m83228g0(), false, 0, 0.0d, 0, null, 0, true, false, 191, null));
        } else {
            getSubscriptions().m75179c(strainController.m88236M().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27565m(this, 12), 20)));
        }
        strainController.m88245c0();
    }

    public /* synthetic */ C27567n(Context context, InterfaceC33704b interfaceC33704b, C28150c c28150c, C31245d c31245d, C13562a c13562a, InterfaceC35211g interfaceC35211g, C39787d c39787d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC33704b, c28150c, c31245d, c13562a, interfaceC35211g, c39787d, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
