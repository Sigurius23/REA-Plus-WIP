package nu2;

import c93.InterfaceC4339a;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;

/* JADX INFO: renamed from: nu2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnu2/b;", "", "<init>", "()V", "Lec3/l;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "activeWorkoutFlow", "", "currentSetTimeInSecondsFlow", "heartRateFlow", "Ltd1/e;", "strapStatusFlow", "", "workoutCompletedFlow", "", "Ldq1/a;", "hrZonesFlow", "Lnu2/c;", "a", "(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27145b {

    /* JADX INFO: renamed from: nu2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l[] f108603w;

        /* JADX INFO: renamed from: nu2.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42094a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f108604w;

            public C42094a(InterfaceC13058l[] interfaceC13058lArr) {
                this.f108604w = interfaceC13058lArr;
            }

            @Override // c93.InterfaceC4339a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f108604w.length];
            }
        }

        /* JADX INFO: renamed from: nu2.b$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutDomainCombiner$combine$$inlined$combine$1$3", m100430f = "ActiveWorkoutDomainCombiner.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f108605w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f108606x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f108607y;

            public b(InterfaceC30057d interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d);
                bVar.f108606x = interfaceC13062m;
                bVar.f108607y = objArr;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f108605w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108606x;
                    Object[] objArr = (Object[]) this.f108607y;
                    ActiveWorkout activeWorkout = (ActiveWorkout) objArr[0];
                    Integer num = (Integer) objArr[1];
                    Object obj2 = objArr[2];
                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj2).intValue();
                    Object obj3 = objArr[3];
                    AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type com.whoop.domain.strap.WhoopStrapStatus");
                    Object obj4 = objArr[4];
                    AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                    Object obj5 = objArr[5];
                    AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type kotlin.collections.List<com.whoop.hrZones.db.HrZoneDto>");
                    List list = (List) obj5;
                    Integer num2 = new Integer(iIntValue);
                    C27146c c27146c = new C27146c(activeWorkout, num, (!((EnumC33707e) obj3).isReady() || num2.intValue() <= -1) ? null : num2, zBooleanValue, list);
                    this.f108606x = null;
                    this.f108607y = null;
                    this.f108605w = 1;
                    if (interfaceC13062m.emit(c27146c, this) == enumC31071a) {
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

        public a(InterfaceC13058l[] interfaceC13058lArr) {
            this.f108603w = interfaceC13058lArr;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            InterfaceC13058l[] interfaceC13058lArr = this.f108603w;
            Object objM41038a = AbstractC14371b.m41038a(new C42094a(interfaceC13058lArr), interfaceC13062m, new b(null), interfaceC30057d, interfaceC13058lArr);
            return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m81630a(InterfaceC13058l activeWorkoutFlow, InterfaceC13058l currentSetTimeInSecondsFlow, InterfaceC13058l heartRateFlow, InterfaceC13058l strapStatusFlow, InterfaceC13058l workoutCompletedFlow, InterfaceC13058l hrZonesFlow) {
        AbstractC22676k.m65750j(activeWorkoutFlow, "activeWorkoutFlow");
        AbstractC22676k.m65750j(currentSetTimeInSecondsFlow, "currentSetTimeInSecondsFlow");
        AbstractC22676k.m65750j(heartRateFlow, "heartRateFlow");
        AbstractC22676k.m65750j(strapStatusFlow, "strapStatusFlow");
        AbstractC22676k.m65750j(workoutCompletedFlow, "workoutCompletedFlow");
        AbstractC22676k.m65750j(hrZonesFlow, "hrZonesFlow");
        return new a(new InterfaceC13058l[]{activeWorkoutFlow, currentSetTimeInSecondsFlow, heartRateFlow, strapStatusFlow, workoutCompletedFlow, hrZonesFlow});
    }
}
