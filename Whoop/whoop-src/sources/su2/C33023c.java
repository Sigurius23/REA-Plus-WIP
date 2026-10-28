package su2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.C20938b;
import l83.C23454a0;
import or2.C28180m;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ru2.InterfaceC31820a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: su2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\r0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, m65681d2 = {"Lsu2/c;", "Landroidx/lifecycle/w1;", "Liu2/b;", "weightliftingRepository", "Lbc3/c0;", "coroutineScope", "La6/g;", "Lf6/f;", "dataStore", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Liu2/b;Lbc3/c0;La6/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lsu2/d;", "currentState", "Lsu2/b;", "viewEvent", "p", "(Lsu2/d;Lsu2/b;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "r", "(Lsu2/d;Lq83/d;)Ljava/lang/Object;", "n", "(Lsu2/d;)Lsu2/d;", NotificationCompat.CATEGORY_EVENT, "q", "(Lsu2/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Liu2/b;", "getWeightliftingRepository", "()Liu2/b;", "x", "Lbc3/c0;", "getCoroutineScope", "()Lbc3/c0;", "y", "La6/g;", "z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/t1;", "F", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "G", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33023c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: H */
    public static final int f137529H = 8;

    /* JADX INFO: renamed from: I */
    private static final C14132d f137530I = AbstractC15751g.m44441U("bodyLocation");

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C20938b weightliftingRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: su2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.presentation.DeviceLocationViewModel", m100430f = "DeviceLocationViewModel.kt", m100431l = {58, 71, 92}, m100432m = "reduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f137537E;

        /* JADX INFO: renamed from: G */
        int f137539G;

        /* JADX INFO: renamed from: w */
        Object f137540w;

        /* JADX INFO: renamed from: x */
        Object f137541x;

        /* JADX INFO: renamed from: y */
        Object f137542y;

        /* JADX INFO: renamed from: z */
        int f137543z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f137537E = obj;
            this.f137539G |= Integer.MIN_VALUE;
            return C33023c.this.m104278p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: su2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.presentation.DeviceLocationViewModel$sendEvent$1", m100430f = "DeviceLocationViewModel.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137544w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC33022b f137546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC33022b interfaceC33022b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137546y = interfaceC33022b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33023c.this.new c(this.f137546y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33023c.this.eventFlow;
                InterfaceC33022b interfaceC33022b = this.f137546y;
                this.f137544w = 1;
                if (interfaceC13072o1.emit(interfaceC33022b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: su2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.presentation.DeviceLocationViewModel$storeDeviceLocationToDataStore$2", m100430f = "DeviceLocationViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137547w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f137548x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33024d f137549y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C33024d c33024d, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137549y = c33024d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f137549y, interfaceC30057d);
            dVar.f137548x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f137548x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137547w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C33023c.f137530I, this.f137549y.getSelectedStrapLaterality().getSerializedValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: su2.c$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e extends C22672i implements Function3 {
        public e(Object obj) {
            super(3, 0, C33023c.class, obj, "reduce", "reduce(Lcom/whoop/weightlifting/feature/active/devicelocation/presentation/DeviceLocationViewState;Lcom/whoop/weightlifting/feature/active/devicelocation/presentation/DeviceLocationViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33024d c33024d, InterfaceC33022b interfaceC33022b, InterfaceC30057d<? super C33024d> interfaceC30057d) {
            return ((C33023c) this.receiver).m104278p(c33024d, interfaceC33022b, interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33023c(C20938b weightliftingRepository, InterfaceC2994c0 coroutineScope, InterfaceC0422g dataStore, FeatureFlagChecker featureFlagChecker) {
        super(coroutineScope);
        AbstractC22676k.m65750j(weightliftingRepository, "weightliftingRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.weightliftingRepository = weightliftingRepository;
        this.coroutineScope = coroutineScope;
        this.dataStore = dataStore;
        this.featureFlagChecker = featureFlagChecker;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(C33024d.INSTANCE.m104292a(), c13096w1M36592b, new e(this)), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: n */
    private final C33024d m104277n(C33024d currentState) {
        this.weightliftingRepository.m58193q();
        return C33024d.m104286e(currentState, null, null, null, InterfaceC31820a.a.f131833a, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r3 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        if (m104279r(r1, r4) == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r2.m58192G(r4) == r5) goto L71;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m104278p(su2.C33024d r19, su2.InterfaceC33022b r20, q83.InterfaceC30057d<? super su2.C33024d> r21) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su2.C33023c.m104278p(su2.d, su2.b, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: r */
    private final Object m104279r(C33024d c33024d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G;
        return (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.STRENGTH_TRAINER_REMEMBER_DEVICE_LOCATION) && (objM48861G = AbstractC17269i.m48861G(this.dataStore, new d(c33024d, null), interfaceC30057d)) == EnumC31071a.f128113w) ? objM48861G : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: q */
    public final void m104281q(InterfaceC33022b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(event, null), 3);
    }

    public /* synthetic */ C33023c(C20938b c20938b, InterfaceC2994c0 interfaceC2994c0, InterfaceC0422g interfaceC0422g, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20938b, (i13 & 2) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC0422g, featureFlagChecker);
    }
}
