package iu2;

import android.content.Context;
import android.content.Intent;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.request.UserState;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.WorkoutSessionState;
import com.whoop.weightlifting.feature.active.activeworkout.StrengthBuilderWorkoutService;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import lu2.C24754d;
import od1.C27858u;
import or2.AbstractC28181m0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: iu2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 H\u0086@¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020$H\u0086@¢\u0006\u0004\b-\u0010(J\u000f\u0010.\u001a\u00020 H\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u0010/\u001a\u00020 H\u0002¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020 H\u0002¢\u0006\u0004\b0\u0010\"J\u000f\u00101\u001a\u00020 H\u0002¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020 H\u0082@¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020 H\u0082@¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020 H\u0082@¢\u0006\u0004\b4\u0010(J#\u00108\u001a\u00020 2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020 2\u0006\u0010:\u001a\u000206H\u0082@¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010[R\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010[R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010[R\u0013\u0010d\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, m65681d2 = {"Liu2/b;", "", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "logger", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lrr2/c;", "crashReporter", "Lod1/u;", "userContext", "Lu92/d;", "prefsStore", "Liu2/a;", "strengthTrainerPacketManager", "Lbc3/c0;", "coroutineScope", "Llu2/d;", "jsonFormat", "Lfi0/a;", "baseAnalytics", "Landroid/content/Context;", "applicationContext", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lz92/a;", "userInfoAccessor", "<init>", "(Lin2/d;Ltr2/n;Lcom/whoop/weightlifting/data/WeightliftingApi;Lcom/whoop/service/network/ActivitiesApi;Lrr2/c;Lod1/u;Lu92/d;Liu2/a;Lbc3/c0;Llu2/d;Lfi0/a;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;)V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()V", "q", "", "v", "()Z", "G", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "activeWorkout", "D", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V", "x", "u", "s", "B", "C", "A", "z", "r", "Lkotlin/Function1;", "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "update", "F", "(Lkotlin/jvm/functions/Function1;)V", "updatedState", "y", "(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lq83/d;)Ljava/lang/Object;", "a", "Lin2/d;", "b", "Ltr2/n;", "c", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "d", "Lcom/whoop/service/network/ActivitiesApi;", "e", "Lrr2/c;", "f", "Lod1/u;", "g", "Lu92/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Liu2/a;", "i", "Lbc3/c0;", "j", "Llu2/d;", "k", "Lfi0/a;", "l", "Landroid/content/Context;", "m", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "n", "Lz92/a;", "Lec3/p1;", "o", "Lec3/p1;", "workoutSessionStateFlow", "Lbc3/k1;", "p", "prepareWorkoutJob", "cleanupWorkoutJob", "saveWorkoutStateJob", "t", "()Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "workoutSessionState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20938b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WeightliftingApi weightliftingApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C20937a strengthTrainerPacketManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C24754d jsonFormat;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13075p1 workoutSessionStateFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC13075p1 prepareWorkoutJob;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13075p1 cleanupWorkoutJob;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final InterfaceC13075p1 saveWorkoutStateJob;

    /* JADX INFO: renamed from: iu2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$cleanupWorkout$1", m100430f = "WeightliftingRepository.kt", m100431l = {104, 107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79083w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79084x;

        /* JADX INFO: renamed from: iu2.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$cleanupWorkout$1$1", m100430f = "WeightliftingRepository.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41799a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f79086w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20938b f79087x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41799a(C20938b c20938b, InterfaceC30057d<? super C41799a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f79087x = c20938b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41799a(this.f79087x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41799a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79086w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C20937a c20937a = this.f79087x.strengthTrainerPacketManager;
                    this.f79086w = 1;
                    if (c20937a.m58163y(this) == enumC31071a) {
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

        /* JADX INFO: renamed from: iu2.b$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$cleanupWorkout$1$2", m100430f = "WeightliftingRepository.kt", m100431l = {109}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f79088w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20938b f79089x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C20938b c20938b, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f79089x = c20938b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f79089x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79088w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C20938b c20938b = this.f79089x;
                    this.f79088w = 1;
                    if (c20938b.m58190z(this) == enumC31071a) {
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

        /* JADX INFO: renamed from: iu2.b$a$c */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$cleanupWorkout$1$3", m100430f = "WeightliftingRepository.kt", m100431l = {110}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f79090w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20938b f79091x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C20938b c20938b, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f79091x = c20938b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new c(this.f79091x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79090w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C20938b c20938b = this.f79091x;
                    this.f79090w = 1;
                    if (c20938b.m58186r(this) == enumC31071a) {
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

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C20938b.this.new a(interfaceC30057d);
            aVar.f79084x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (bc3.AbstractC3006f0.m8713g(r5, r9) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f79084x
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f79083w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r10)
                goto L92
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L3f
            L21:
                p505ts.AbstractC34132o.m107864I(r10)
                iu2.b r10 = iu2.C20938b.this
                ec3.p1 r10 = iu2.C20938b.m58178i(r10)
                ec3.h2 r10 = (ec3.C13045h2) r10
                java.lang.Object r10 = r10.getValue()
                bc3.k1 r10 = (bc3.InterfaceC3027k1) r10
                if (r10 == 0) goto L3f
                r9.f79084x = r0
                r9.f79083w = r4
                java.lang.Object r10 = r10.join(r9)
                if (r10 != r1) goto L3f
                goto L91
            L3f:
                iu2.b r10 = iu2.C20938b.this
                iu2.a r10 = iu2.C20938b.m58180k(r10)
                ec3.p1 r10 = r10.getRetryRawDataStreamingJob()
                ec3.h2 r10 = (ec3.C13045h2) r10
                java.lang.Object r10 = r10.getValue()
                bc3.k1 r10 = (bc3.InterfaceC3027k1) r10
                r2 = 0
                if (r10 == 0) goto L57
                r10.cancel(r2)
            L57:
                iu2.b r10 = iu2.C20938b.this
                iu2.C20938b.m58185p(r10)
                iu2.b$a$a r10 = new iu2.b$a$a
                iu2.b r5 = iu2.C20938b.this
                r10.<init>(r5, r2)
                r5 = 3
                bc3.j0 r10 = bc3.AbstractC3006f0.m8711e(r0, r2, r10, r5)
                iu2.b$a$b r6 = new iu2.b$a$b
                iu2.b r7 = iu2.C20938b.this
                r6.<init>(r7, r2)
                bc3.j0 r6 = bc3.AbstractC3006f0.m8711e(r0, r2, r6, r5)
                iu2.b$a$c r7 = new iu2.b$a$c
                iu2.b r8 = iu2.C20938b.this
                r7.<init>(r8, r2)
                bc3.j0 r0 = bc3.AbstractC3006f0.m8711e(r0, r2, r7, r5)
                bc3.i0[] r5 = new bc3.InterfaceC3018i0[r5]
                r7 = 0
                r5[r7] = r10
                r5[r4] = r6
                r5[r3] = r0
                r9.f79084x = r2
                r9.f79083w = r3
                java.lang.Object r10 = bc3.AbstractC3006f0.m8713g(r5, r9)
                if (r10 != r1) goto L92
            L91:
                return r1
            L92:
                iu2.b r10 = iu2.C20938b.this
                iu2.C20938b.m58172c(r10)
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: iu2.C20938b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iu2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$clearLocalSavedStateForWorkout$2", m100430f = "WeightliftingRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79092w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79092w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C13045h2) C20938b.this.saveWorkoutStateJob).getValue();
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            C20938b.this.prefsStore.m109537p(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$prepareWorkout$1", m100430f = "WeightliftingRepository.kt", m100431l = {87, 89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79094w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79095x;

        /* JADX INFO: renamed from: iu2.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$prepareWorkout$1$1", m100430f = "WeightliftingRepository.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f79097w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20938b f79098x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20938b c20938b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f79098x = c20938b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f79098x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79097w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C20937a c20937a = this.f79098x.strengthTrainerPacketManager;
                this.f79097w = 1;
                Object objM58161v = c20937a.m58161v(this);
                return objM58161v == enumC31071a ? enumC31071a : objM58161v;
            }
        }

        /* JADX INFO: renamed from: iu2.b$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$prepareWorkout$1$2", m100430f = "WeightliftingRepository.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f79099w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20938b f79100x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C20938b c20938b, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f79100x = c20938b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f79100x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79099w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C20938b c20938b = this.f79100x;
                    this.f79099w = 1;
                    if (c20938b.m58165A(this) == enumC31071a) {
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

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C20938b.this.new c(interfaceC30057d);
            cVar.f79095x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        
            if (bc3.AbstractC3006f0.m8713g(r2, r8) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f79095x
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f79094w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6d
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L3e
            L20:
                p505ts.AbstractC34132o.m107864I(r9)
                iu2.b r9 = iu2.C20938b.this
                ec3.p1 r9 = iu2.C20938b.m58174e(r9)
                ec3.h2 r9 = (ec3.C13045h2) r9
                java.lang.Object r9 = r9.getValue()
                bc3.k1 r9 = (bc3.InterfaceC3027k1) r9
                if (r9 == 0) goto L3e
                r8.f79095x = r0
                r8.f79094w = r4
                java.lang.Object r9 = r9.join(r8)
                if (r9 != r1) goto L3e
                goto L6c
            L3e:
                iu2.b r9 = iu2.C20938b.this
                iu2.C20938b.m58181l(r9)
                iu2.b$c$a r9 = new iu2.b$c$a
                iu2.b r2 = iu2.C20938b.this
                r5 = 0
                r9.<init>(r2, r5)
                r2 = 3
                bc3.j0 r9 = bc3.AbstractC3006f0.m8711e(r0, r5, r9, r2)
                iu2.b$c$b r6 = new iu2.b$c$b
                iu2.b r7 = iu2.C20938b.this
                r6.<init>(r7, r5)
                bc3.j0 r0 = bc3.AbstractC3006f0.m8711e(r0, r5, r6, r2)
                bc3.i0[] r2 = new bc3.InterfaceC3018i0[r3]
                r6 = 0
                r2[r6] = r9
                r2[r4] = r0
                r8.f79095x = r5
                r8.f79094w = r3
                java.lang.Object r9 = bc3.AbstractC3006f0.m8713g(r2, r8)
                if (r9 != r1) goto L6d
            L6c:
                return r1
            L6d:
                iu2.b r9 = iu2.C20938b.this
                iu2.a r9 = iu2.C20938b.m58180k(r9)
                r9.m58159q()
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: iu2.C20938b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iu2.b$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository", m100430f = "WeightliftingRepository.kt", m100431l = {198}, m100432m = "restoreWorkoutIfSavedStateExists", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f79101w;

        /* JADX INFO: renamed from: y */
        int f79103y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79101w = obj;
            this.f79103y |= Integer.MIN_VALUE;
            return C20938b.this.m58197x(this);
        }
    }

    /* JADX INFO: renamed from: iu2.b$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$restoreWorkoutIfSavedStateExists$2", m100430f = "WeightliftingRepository.kt", m100431l = {207}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79104w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79104w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20938b c20938b = C20938b.this;
                this.f79104w = 1;
                if (c20938b.m58165A(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: iu2.b$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$restoreWorkoutIfSavedStateExists$savedState$1", m100430f = "WeightliftingRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79106w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79106w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C20938b.this.prefsStore.m109533j(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE);
        }
    }

    /* JADX INFO: renamed from: iu2.b$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$serializeWorkoutState$2", m100430f = "WeightliftingRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79108w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WorkoutSessionState f79110y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(WorkoutSessionState workoutSessionState, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79110y = workoutSessionState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new g(this.f79110y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79108w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C20938b.this.prefsStore.m109543v(SharedPreferenceConstants.STRENGTH_BUILDER_SAVED_STATE, this.f79110y.serialize(C20938b.this.jsonFormat));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.b$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$setUserStateToIdle$2", m100430f = "WeightliftingRepository.kt", m100431l = {142}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79111w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new h(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79111w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivitiesApi activitiesApi = C20938b.this.activitiesApi;
            UserStateRequestBody userStateRequestBody = new UserStateRequestBody(UserState.Idle);
            this.f79111w = 1;
            Object userState = activitiesApi.setUserState(userStateRequestBody, this);
            return userState == enumC31071a ? enumC31071a : userState;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: iu2.b$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$setUserStateToWorkout$2", m100430f = "WeightliftingRepository.kt", m100431l = {136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79113w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new i(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79113w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivitiesApi activitiesApi = C20938b.this.activitiesApi;
            UserStateRequestBody userStateRequestBody = new UserStateRequestBody(UserState.Workout);
            this.f79113w = 1;
            Object userState = activitiesApi.setUserState(userStateRequestBody, this);
            return userState == enumC31071a ? enumC31071a : userState;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: iu2.b$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.WeightliftingRepository$updateWorkoutSessionState$1$1", m100430f = "WeightliftingRepository.kt", m100431l = {222}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79115w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WorkoutSessionState f79117y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(WorkoutSessionState workoutSessionState, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79117y = workoutSessionState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20938b.this.new j(this.f79117y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79115w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C20938b c20938b = C20938b.this;
                    WorkoutSessionState workoutSessionState = this.f79117y;
                    this.f79115w = 1;
                    if (c20938b.m58189y(workoutSessionState, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (IllegalArgumentException e5) {
                C20938b.this.logger.mo85230v("Failed to serialize updated workout session state " + C20938b.this.m58194t(), e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C20938b(InterfaceC18732d dispatcherFactory, InterfaceC34116n logger, WeightliftingApi weightliftingApi, ActivitiesApi activitiesApi, InterfaceC31766c crashReporter, C27858u userContext, C34660d prefsStore, C20937a strengthTrainerPacketManager, InterfaceC2994c0 coroutineScope, C24754d jsonFormat, InterfaceC14515a baseAnalytics, Context applicationContext, FeatureFlagChecker featureFlagChecker, InterfaceC40205a userInfoAccessor) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(weightliftingApi, "weightliftingApi");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(strengthTrainerPacketManager, "strengthTrainerPacketManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(jsonFormat, "jsonFormat");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.weightliftingApi = weightliftingApi;
        this.activitiesApi = activitiesApi;
        this.crashReporter = crashReporter;
        this.userContext = userContext;
        this.prefsStore = prefsStore;
        this.strengthTrainerPacketManager = strengthTrainerPacketManager;
        this.coroutineScope = coroutineScope;
        this.jsonFormat = jsonFormat;
        this.baseAnalytics = baseAnalytics;
        this.applicationContext = applicationContext;
        this.featureFlagChecker = featureFlagChecker;
        this.userInfoAccessor = userInfoAccessor;
        this.workoutSessionStateFlow = AbstractC13091v.m36593c(null);
        this.prepareWorkoutJob = AbstractC13091v.m36593c(null);
        this.cleanupWorkoutJob = AbstractC13091v.m36593c(null);
        this.saveWorkoutStateJob = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final Object m58165A(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "failed to set user state to WORKOUT", new i(null), interfaceC30057d, 2, null);
        return objM108729b == EnumC31071a.f128113w ? objM108729b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private final void m58166B() {
        this.applicationContext.startForegroundService(new Intent(this.applicationContext, (Class<?>) StrengthBuilderWorkoutService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m58167C() {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) StrengthBuilderWorkoutService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final WorkoutSessionState m58168E(ActiveWorkout activeWorkout, WorkoutSessionState updateWorkoutSessionState) {
        AbstractC22676k.m65750j(updateWorkoutSessionState, "$this$updateWorkoutSessionState");
        return updateWorkoutSessionState.copy(activeWorkout);
    }

    /* JADX INFO: renamed from: F */
    private final void m58169F(Function1 update) {
        WorkoutSessionState workoutSessionState;
        InterfaceC13075p1 interfaceC13075p1 = this.workoutSessionStateFlow;
        WorkoutSessionState workoutSessionStateM58194t = m58194t();
        WorkoutSessionState workoutSessionState2 = null;
        if (workoutSessionStateM58194t != null && (workoutSessionState = (WorkoutSessionState) update.invoke(workoutSessionStateM58194t)) != null) {
            if (workoutSessionState.getLastSavedActiveWorkout() != null) {
                AbstractC28181m0.m85298b(this.coroutineScope, this.saveWorkoutStateJob, null, new j(workoutSessionState, null), 2, null);
            }
            workoutSessionState2 = workoutSessionState;
        }
        ((C13045h2) interfaceC13075p1).m36570j(workoutSessionState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m58186r(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new b(null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m58187s() {
        ((C13045h2) this.workoutSessionStateFlow).m36570j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m58188u() {
        InterfaceC13075p1 interfaceC13075p1 = this.workoutSessionStateFlow;
        WorkoutSessionState workoutSessionState = new WorkoutSessionState(null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, workoutSessionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final Object m58189y(WorkoutSessionState workoutSessionState, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new g(workoutSessionState, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final Object m58190z(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "failed to set user state to IDLE", new h(null), interfaceC30057d, 2, null);
        return objM108729b == EnumC31071a.f128113w ? objM108729b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public final void m58191D(ActiveWorkout activeWorkout) {
        AbstractC22676k.m65750j(activeWorkout, "activeWorkout");
        WorkoutSessionState workoutSessionStateM58194t = m58194t();
        if (workoutSessionStateM58194t != null && workoutSessionStateM58194t.getLastSavedActiveWorkout() == null) {
            m58166B();
        }
        m58169F(new C19962a(activeWorkout, 1));
    }

    /* JADX INFO: renamed from: G */
    public final Object m58192G(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objJoin;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C13045h2) this.prepareWorkoutJob).getValue();
        return (interfaceC3027k1 == null || (objJoin = interfaceC3027k1.join(interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objJoin;
    }

    /* JADX INFO: renamed from: q */
    public final void m58193q() {
        AbstractC28181m0.m85298b(this.coroutineScope, this.cleanupWorkoutJob, null, new a(null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final WorkoutSessionState m58194t() {
        return (WorkoutSessionState) ((C13045h2) this.workoutSessionStateFlow).getValue();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m58195v() {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C13045h2) this.prepareWorkoutJob).getValue();
        return interfaceC3027k1 != null && interfaceC3027k1.isActive();
    }

    /* JADX INFO: renamed from: w */
    public final void m58196w() {
        AbstractC28181m0.m85298b(this.coroutineScope, this.prepareWorkoutJob, null, new c(null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m58197x(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f79103y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f79103y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM8705K = dVar.f79101w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f79103y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
            f fVar = new f(null);
            dVar.f79103y = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, fVar, dVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        String str = (String) objM8705K;
        if (str == null) {
            return Boolean.FALSE;
        }
        WorkoutSessionState workoutSessionStateDeserialize = WorkoutSessionState.INSTANCE.deserialize(str, this.jsonFormat, this.logger, this.crashReporter);
        boolean z4 = (workoutSessionStateDeserialize != null ? workoutSessionStateDeserialize.getLastSavedActiveWorkout() : null) != null;
        if (z4) {
            ((C13045h2) this.workoutSessionStateFlow).m36570j(workoutSessionStateDeserialize);
            this.strengthTrainerPacketManager.m58159q();
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new e(null), 3);
            InterfaceC14515a.m41418i(this.baseAnalytics, null, "Restored State From Cache", null, "Workout Builder", null, null, 53, null);
        } else {
            this.logger.mo85222m("Failed to restore workout session. Discarding bad session state: ".concat(str), new AbstractC30556a.a[0]);
            m58193q();
        }
        return Boolean.valueOf(z4);
    }
}
