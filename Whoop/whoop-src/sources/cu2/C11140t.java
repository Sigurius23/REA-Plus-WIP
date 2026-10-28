package cu2;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import c93.InterfaceC4351m;
import com.whoop.weightlifting.data.domain.WorkoutSessionState;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.C20938b;
import l83.C23454a0;
import lf1.C23996f;
import n92.InterfaceC26483e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cu2.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcu2/t;", "Landroidx/lifecycle/w1;", "Ln92/e;", "iterableInAppMessagingClient", "Liu2/b;", "weightliftingRepository", "Llf1/f;", "experimentHelper", "<init>", "(Ln92/e;Liu2/b;Llf1/f;)V", "", "l", "()Z", "p", "(Lq83/d;)Ljava/lang/Object;", "j", "Ll83/a0;", "o", "()V", "onCleared", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ln92/e;", "x", "Liu2/b;", "y", "Llf1/f;", "Lec3/f2;", "z", "Lec3/f2;", "n", "()Lec3/f2;", "isExerciseDetailsV2ExperimentEnabled", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11140t extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC26483e iterableInAppMessagingClient;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C20938b weightliftingRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C23996f experimentHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13037f2 isExerciseDetailsV2ExperimentEnabled;

    /* JADX INFO: renamed from: cu2.t$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.StrengthTrainerViewModel$isExerciseDetailsV2ExperimentEnabled$1", m100430f = "StrengthTrainerViewModel.kt", m100431l = {20, 20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f35590w;

        /* JADX INFO: renamed from: x */
        int f35591x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f35592y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C11140t.this.new a(interfaceC30057d);
            aVar.f35592y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
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
                java.lang.Object r0 = r6.f35592y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f35591x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L48
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f35590w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                cu2.t r7 = cu2.C11140t.this
                lf1.f r7 = cu2.C11140t.m30102g(r7)
                r6.f35592y = r5
                r6.f35590w = r0
                r6.f35591x = r4
                java.lang.Object r7 = r7.m70811a(r6)
                if (r7 != r1) goto L3b
                goto L47
            L3b:
                r6.f35592y = r5
                r6.f35590w = r5
                r6.f35591x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cu2.C11140t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C11140t(InterfaceC26483e iterableInAppMessagingClient, C20938b weightliftingRepository, C23996f experimentHelper) {
        AbstractC22676k.m65750j(iterableInAppMessagingClient, "iterableInAppMessagingClient");
        AbstractC22676k.m65750j(weightliftingRepository, "weightliftingRepository");
        AbstractC22676k.m65750j(experimentHelper, "experimentHelper");
        this.iterableInAppMessagingClient = iterableInAppMessagingClient;
        this.weightliftingRepository = weightliftingRepository;
        this.experimentHelper = experimentHelper;
        this.isExerciseDetailsV2ExperimentEnabled = AbstractC13091v.m36587M(new C13084s1(new a(null)), AbstractC1640x1.m5043b(this), C13105z1.f45288a, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j */
    public final Object m30103j(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return m30104l() ? Boolean.TRUE : m30107p(interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30104l() {
        WorkoutSessionState workoutSessionStateM58194t = this.weightliftingRepository.m58194t();
        return (workoutSessionStateM58194t != null ? workoutSessionStateM58194t.getLastSavedActiveWorkout() : null) != null;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13037f2 getIsExerciseDetailsV2ExperimentEnabled() {
        return this.isExerciseDetailsV2ExperimentEnabled;
    }

    /* JADX INFO: renamed from: o */
    public final void m30106o() {
        this.iterableInAppMessagingClient.mo78531e();
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        super.onCleared();
        this.iterableInAppMessagingClient.mo78529c();
    }

    /* JADX INFO: renamed from: p */
    public final Object m30107p(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.weightliftingRepository.m58197x(interfaceC30057d);
    }
}
