package o52;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dq1.C12288a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import eq1.C13562a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pv2.C29580a;
import pv2.C29581b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: o52.f0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lo52/f0;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "scope", "Leq1/a;", "hrZonesRepository", "Lpv2/b;", "hrZoneReducer", "<init>", "(Lbc3/c0;Leq1/a;Lpv2/b;)V", "", "newPercent", "Ll83/a0;", "l", "(I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lpv2/b;", "Lec3/p1;", "y", "Lec3/p1;", "strainPercentFlow", "Lec3/t1;", "", "Ldq1/a;", "z", "Lec3/t1;", "domainState", "Lec3/l;", "Lpv2/a;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27552f0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29581b hrZoneReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13075p1 strainPercentFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: o52.f0$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeStrainRangeViewModel$domainState$1", m100430f = "RealTimeStrainRangeViewModel.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Ldq1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f110923w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f110924x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f110924x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f110924x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f110923w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f110924x = null;
                this.f110923w = 1;
                if (interfaceC13062m.emit(C25271y.f99162w, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: o52.f0$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeStrainRangeViewModel$updateStrainPercent$1", m100430f = "RealTimeStrainRangeViewModel.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f110925w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f110927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f110927y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27552f0.this.new b(this.f110927y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f110925w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C27552f0.this.strainPercentFlow;
                Integer num = new Integer(this.f110927y);
                this.f110925w = 1;
                ((C13045h2) interfaceC13075p1).emit(num, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: o52.f0$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeStrainRangeViewModel$viewState$1", m100430f = "RealTimeStrainRangeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"", "Ldq1/a;", "hrZones", "", "currentHeartRate", "Lpv2/a;", "<anonymous>", "(Ljava/util/List;I)Lpv2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f110928w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f110929x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ int f110930y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m83165f(List<C12288a> list, int i13, InterfaceC30057d<? super C29580a> interfaceC30057d) {
            c cVar = C27552f0.this.new c(interfaceC30057d);
            cVar.f110929x = list;
            cVar.f110930y = i13;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m83165f((List) obj, ((Number) obj2).intValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List<C12288a> list = (List) this.f110929x;
            int i13 = this.f110930y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f110928w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C27552f0.this.hrZoneReducer.m90692d(list, new Integer(i13));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27552f0(InterfaceC2994c0 scope, C13562a hrZonesRepository, C29581b hrZoneReducer) {
        super(scope);
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(hrZoneReducer, "hrZoneReducer");
        this.scope = scope;
        this.hrZoneReducer = hrZoneReducer;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(0);
        this.strainPercentFlow = c13045h2M36593c;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(new C13015a0(new a(null), hrZonesRepository.m38283l()), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new C13060l1(c13078q1M36586L, c13045h2M36593c, new c(null), 1);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m83164l(int newPercent) {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(newPercent, null), 3);
    }

    public /* synthetic */ C27552f0(InterfaceC2994c0 interfaceC2994c0, C13562a c13562a, C29581b c29581b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c13562a, c29581b);
    }
}
