package tv2;

import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.dto.LinkWorkoutModel;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fu2.C14794i;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: tv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ltv2/d;", "Lod1/g;", "Ltv2/b;", "Ltv2/c;", "Lfu2/i;", "strengthTrainerInteractor", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ltv2/c;)Ltv2/c;", "", "activityId", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "currentState", "i", "(Ltv2/c;Ljava/lang/String;)Ltv2/c;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lfu2/i;", "b", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "c", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34211d implements InterfaceC27844g<InterfaceC34209b, C34210c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tv2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.domain.LinkWorkoutInteractor", m100430f = "LinkWorkoutInteractor.kt", m100431l = {37}, m100432m = "fetchBffData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f143507w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143508x;

        /* JADX INFO: renamed from: z */
        int f143510z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143508x = obj;
            this.f143510z |= Integer.MIN_VALUE;
            return C34211d.this.m108132g(null, this);
        }
    }

    /* JADX INFO: renamed from: tv2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.domain.LinkWorkoutInteractor$fetchBffData$linkWorkoutResponse$1", m100430f = "LinkWorkoutInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f143511w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f143513y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f143513y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34211d.this.new b(this.f143513y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143511w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C34211d.this.api;
            String str = this.f143513y;
            this.f143511w = 1;
            Object linkWorkoutBFFData = weightliftingApi.getLinkWorkoutBFFData(str, this);
            return linkWorkoutBFFData == enumC31071a ? enumC31071a : linkWorkoutBFFData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super LinkWorkoutModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: tv2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.domain.LinkWorkoutInteractor$interact$1", m100430f = "LinkWorkoutInteractor.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ltv2/c;", "currentState", "Ltv2/b;", "currentAction", "<anonymous>", "(Ltv2/c;Ltv2/b;)Ltv2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143514w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143515x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143516y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C34210c c34210c, InterfaceC34209b interfaceC34209b, InterfaceC30057d<? super C34210c> interfaceC30057d) {
            c cVar = C34211d.this.new c(interfaceC30057d);
            cVar.f143515x = c34210c;
            cVar.f143516y = interfaceC34209b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34210c c34210c = (C34210c) this.f143515x;
            InterfaceC34209b interfaceC34209b = (InterfaceC34209b) this.f143516y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143514w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(interfaceC34209b, InterfaceC34209b.b.f143500a)) {
                    return C34211d.this.m108133h(c34210c);
                }
                if (!(interfaceC34209b instanceof InterfaceC34209b.a)) {
                    if (interfaceC34209b instanceof InterfaceC34209b.c) {
                        return C34211d.this.m108134i(c34210c, ((InterfaceC34209b.c) interfaceC34209b).getLinkActivityId());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C34211d c34211d = C34211d.this;
                String activityId = ((InterfaceC34209b.a) interfaceC34209b).getActivityId();
                this.f143515x = null;
                this.f143516y = null;
                this.f143514w = 1;
                obj = c34211d.m108132g(activityId, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C34210c) obj;
        }
    }

    public C34211d(C14794i strengthTrainerInteractor, WeightliftingApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m108132g(String str, InterfaceC30057d<? super C34210c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f143510z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f143510z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f143508x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f143510z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f143507w = null;
            aVar2.f143510z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch LinkWorkout BFF", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C34210c(null, (LinkWorkoutModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return new C34210c(InterfaceC34208a.c.f143497a, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return new C34210c(InterfaceC34208a.d.f143498a, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C34210c m108133h(C34210c c34210c) {
        this.strengthTrainerInteractor.m42546j(InterfaceC14792g.e.f54905a);
        return c34210c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C34210c m108134i(C34210c currentState, String activityId) {
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.f(activityId));
        return currentState;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C34210c(InterfaceC34208a.b.f143496a, null), upstream, new c(null));
    }
}
