package bl2;

import al2.AbstractC0985a;
import al2.AbstractC0988d;
import androidx.lifecycle.C1630u0;
import as1.C1945f;
import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.service.network.model.UserPreferences;
import e50.C12724c;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import od1.C27861x;
import or2.C28180m;
import p003a1.C0103b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: bl2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0014\u0010#R+\u0010+\u001a\u00020 2\u0006\u0010%\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b&\u0010*R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\n0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lbl2/d;", "Lhj0/o;", "Lod1/x;", "userManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lod1/x;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Lbl2/b;", "B", "()Lbl2/b;", "Ll83/a0;", "F", "()V", "", "switch", "K", "(Z)V", "E", "Lod1/x;", "getUserManager", "()Lod1/x;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "G", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Le50/c;", "Lbl2/e;", "H", "Le50/c;", "()Le50/c;", "viewStateLiveData", "<set-?>", "I", "Lf93/d;", "D", "()Lbl2/e;", "(Lbl2/e;)V", "viewState", "Landroidx/lifecycle/u0;", "J", "Landroidx/lifecycle/u0;", "C", "()Landroidx/lifecycle/u0;", "screenContentStateLiveData", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3375d extends AbstractC17356o {

    /* JADX INFO: renamed from: K */
    static final /* synthetic */ InterfaceC21493z[] f13172K = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C3375d.class, "viewState", "getViewState()Lcom/whoop/training/activitydetection/ActivityDetectionViewState;", 0))};

    /* JADX INFO: renamed from: L */
    public static final int f13173L = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C27861x userManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C12724c<C3376e> viewStateLiveData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C1630u0 screenContentStateLiveData;

    /* JADX INFO: renamed from: bl2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"bl2/d$a", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C3376e value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3375d f13181x;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, C3375d c3375d) {
            this.f13181x = c3375d;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C3376e getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C3376e value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f13181x.m9753E().postValue(value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3375d(C27861x userManager, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(userManager, "userManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.userManager = userManager;
        this.featureFlagChecker = featureFlagChecker;
        this.logTag = "ActivityDetectionViewModel";
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new a(new C3376e(false, false, false, false, 15, null), this);
        C1630u0 c1630u0 = new C1630u0();
        c1630u0.postValue(m9742B());
        this.screenContentStateLiveData = c1630u0;
    }

    /* JADX INFO: renamed from: B */
    private final C3373b m9742B() {
        return this.featureFlagChecker.isFeatureEnabled("activity_detection_graph_10") ? new C3373b(AbstractC0988d.f3682f, AbstractC0985a.f3637b) : new C3373b(AbstractC0988d.f3680e, AbstractC0985a.f3636a);
    }

    /* JADX INFO: renamed from: D */
    private final C3376e m9743D() {
        return (C3376e) this.viewState.getValue(this, f13172K[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m9744G(C3375d c3375d, C29218v0 c29218v0) {
        C3376e c3376eM9756b;
        if (c29218v0.f118269a.f146788Q) {
            C3376e c3376eM9743D = c3375d.m9743D();
            Object obj = c29218v0.f118270b;
            AbstractC22676k.m65747g(obj);
            c3376eM9756b = C3376e.m9756b(c3376eM9743D, false, ((UserPreferences) obj).getAutoDetectWorkout(), false, false, 13, null);
        } else {
            c3376eM9756b = C3376e.m9756b(c3375d.m9743D(), false, false, true, false, 11, null);
        }
        c3375d.m9746I(c3376eM9756b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m9745H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    private final void m9746I(C3376e c3376e) {
        this.viewState.setValue(this, f13172K[0], c3376e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m9747L(C3375d c3375d, boolean z4, C29218v0 c29218v0) {
        C3376e c3376eM9756b;
        if (c29218v0.f118269a.f146788Q) {
            c3376eM9756b = C3376e.m9756b(c3375d.m9743D(), false, z4, false, true, 4, null);
        } else {
            InterfaceC34116n interfaceC34116nM49136n = c3375d.m49136n();
            String str = c29218v0.f118269a.f146791y;
            AbstractC22676k.m65749i(str, "message(...)");
            interfaceC34116nM49136n.mo85228t(str, new AbstractC30556a.a[0]);
            c3376eM9756b = C3376e.m9756b(c3375d.m9743D(), false, false, true, false, 11, null);
        }
        c3375d.m9746I(c3376eM9756b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m9748M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final C1630u0 getScreenContentStateLiveData() {
        return this.screenContentStateLiveData;
    }

    /* JADX INFO: renamed from: E */
    public final C12724c<C3376e> m9753E() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: F */
    public final void m9754F() {
        getSubscriptions().m75179c(this.userManager.m84092j().m122661K(new C3374c(new C0103b(this, 22), 0)));
    }

    /* JADX INFO: renamed from: K */
    public final void m9755K(boolean z4) {
        m9746I(C3376e.m9756b(m9743D(), true, false, false, false, 14, null));
        getSubscriptions().m75179c(this.userManager.m84095w(z4).m122661K(new C3374c(new C1945f(this, z4, 2), 1)));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C3375d(C27861x c27861x, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27861x, featureFlagChecker, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
