package com.whoop.weightlifting.workmanagers;

import android.content.Context;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto;
import ew2.AbstractC13723a;
import fi0.InterfaceC14515a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24755e;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import of3.InterfaceC27903a;
import p000.AbstractC11266d;
import p024b0.C2178b;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p218ic.InterfaceC18355e0;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.InterfaceC34385a;
import u92.C34660d;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wm0.C37378a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001FB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010C¨\u0006G"}, m65681d2 = {"Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "serializedWorkoutKey", "", "o", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "failureReason", "", "workoutId", "isLocalSaveDiscarded", "Ll83/a0;", "y", "(Ljava/lang/String;Ljava/lang/Long;Z)V", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "workoutDto", "Lu02/a;", "v", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;", "action", "", "", "otherProperties", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/util/Map;Z)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lwm0/a;", "z", "Ll83/h;", "s", "()Lwm0/a;", "scopeCoordinator", "Llu2/e;", "E", "u", "()Llu2/e;", "weightliftingSerializer", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "F", "t", "()Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Lfi0/a;", "G", "p", "()Lfi0/a;", "baseAnalytics", "Lu92/d;", "H", "r", "()Lu92/d;", "mainPrefs", "Lin2/d;", "I", "q", "()Lin2/d;", "dispatcherFactory", "J", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SavingWorkoutInBackgroundWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static final int f32994K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h weightliftingSerializer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h weightliftingApi;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h baseAnalytics;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h mainPrefs;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h dispatcherFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h scopeCoordinator;

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;", "", "<init>", "()V", "", "workoutKey", "workoutName", "Lic/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lic/a0;", "workoutStartTimeInMillis", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lic/p0;", "workManager", "workRequest", "Lic/e0;", "c", "(Lic/p0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/a0;)Lic/e0;", "WORK_NAME_PREFIX", "Ljava/lang/String;", "KEY_SERIALIZED_WORKOUT", "WORKOUT_NAME_PREFIX", "TAG", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final String m28371a(String workoutStartTimeInMillis) {
            return AbstractC11266d.m30461o("strength-trainer-saving-workout-", workoutStartTimeInMillis);
        }

        /* JADX INFO: renamed from: b */
        private final C18347a0 m28372b(String workoutKey, String workoutName) {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet()));
            C18392z c18392z = new C18392z(SavingWorkoutInBackgroundWorker.class);
            C23465k[] c23465kArr = {new C23465k("serializedWorkout", workoutKey)};
            C2178b c2178b = new C2178b(1);
            C23465k c23465k = c23465kArr[0];
            c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) ((C18392z) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52877a("SavingWorkoutInBackgroundWorker")).m52877a("workoutName=" + workoutName)).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC18355e0 m28373d(Companion companion, AbstractC18377p0 abstractC18377p0, String str, String str2, String str3, C18347a0 c18347a0, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                c18347a0 = companion.m28372b(str2, str);
            }
            return companion.m28374c(abstractC18377p0, str, str2, str3, c18347a0);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC18355e0 m28374c(AbstractC18377p0 workManager, String workoutName, String workoutKey, String workoutStartTimeInMillis, C18347a0 workRequest) {
            AbstractC22676k.m65750j(workManager, "workManager");
            AbstractC22676k.m65750j(workoutName, "workoutName");
            AbstractC22676k.m65750j(workoutKey, "workoutKey");
            AbstractC22676k.m65750j(workoutStartTimeInMillis, "workoutStartTimeInMillis");
            AbstractC22676k.m65750j(workRequest, "workRequest");
            return workManager.m52876e(m28371a(workoutStartTimeInMillis), EnumC18368l.f71504x, workRequest);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$clearWorkoutFromPreferences$2", m100430f = "SavingWorkoutInBackgroundWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10782b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33002w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33004y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10782b(String str, InterfaceC30057d<? super C10782b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33004y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SavingWorkoutInBackgroundWorker.this.new C10782b(this.f33004y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C10782b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33002w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SavingWorkoutInBackgroundWorker.this.m28362r().m109537p(this.f33004y);
            return Boolean.valueOf(!SavingWorkoutInBackgroundWorker.this.m28362r().m109526c(this.f33004y));
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$saveWorkoutInBackground$2", m100430f = "SavingWorkoutInBackgroundWorker.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10783c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f33005w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WeightliftingWorkoutDto f33007y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10783c(WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super C10783c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f33007y = weightliftingWorkoutDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return SavingWorkoutInBackgroundWorker.this.new C10783c(this.f33007y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33005w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApiM28364t = SavingWorkoutInBackgroundWorker.this.m28364t();
            WeightliftingWorkoutDto weightliftingWorkoutDto = this.f33007y;
            this.f33005w = 1;
            Object objSaveWeightliftingWorkout = weightliftingApiM28364t.saveWeightliftingWorkout(weightliftingWorkoutDto, this);
            return objSaveWeightliftingWorkout == enumC31071a ? enumC31071a : objSaveWeightliftingWorkout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C10783c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10784d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33008w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33009x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33010y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10784d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33008w = interfaceC27903a;
            this.f33009x = interfaceC35951a;
            this.f33010y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wm0.a] */
        @Override // c93.InterfaceC4339a
        public final C37378a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33008w;
            InterfaceC35951a interfaceC35951a = this.f33009x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33010y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37378a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10785e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33011w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33012x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33013y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10785e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33011w = interfaceC27903a;
            this.f33012x = interfaceC35951a;
            this.f33013y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lu2.e] */
        @Override // c93.InterfaceC4339a
        public final C24755e invoke() {
            InterfaceC27903a interfaceC27903a = this.f33011w;
            InterfaceC35951a interfaceC35951a = this.f33012x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33013y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24755e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10786f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33014w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33015x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33016y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10786f(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33014w = interfaceC27903a;
            this.f33015x = interfaceC35951a;
            this.f33016y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.weightlifting.data.WeightliftingApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final WeightliftingApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f33014w;
            InterfaceC35951a interfaceC35951a = this.f33015x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33016y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WeightliftingApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10787g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33017w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33018x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10787g(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33017w = interfaceC27903a;
            this.f33018x = interfaceC35951a;
            this.f33019y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33017w;
            InterfaceC35951a interfaceC35951a = this.f33018x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33019y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10788h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33021x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33022y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10788h(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33020w = interfaceC27903a;
            this.f33021x = interfaceC35951a;
            this.f33022y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            InterfaceC27903a interfaceC27903a = this.f33020w;
            InterfaceC35951a interfaceC35951a = this.f33021x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33022y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10789i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33023w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33024x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33025y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10789i(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33023w = interfaceC27903a;
            this.f33024x = interfaceC35951a;
            this.f33025y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [in2.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC18732d invoke() {
            InterfaceC27903a interfaceC27903a = this.f33023w;
            InterfaceC35951a interfaceC35951a = this.f33024x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33025y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18732d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$j */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker", m100430f = "SavingWorkoutInBackgroundWorker.kt", m100431l = {68, 73, 77, 81, 85}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10790j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f33026E;

        /* JADX INFO: renamed from: G */
        int f33028G;

        /* JADX INFO: renamed from: w */
        Object f33029w;

        /* JADX INFO: renamed from: x */
        Object f33030x;

        /* JADX INFO: renamed from: y */
        Object f33031y;

        /* JADX INFO: renamed from: z */
        Object f33032z;

        public C10790j(InterfaceC30057d<? super C10790j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33026E = obj;
            this.f33028G |= Integer.MIN_VALUE;
            return SavingWorkoutInBackgroundWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$k */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker$work$2", m100430f = "SavingWorkoutInBackgroundWorker.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10791k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC34385a<?> f33034F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ WeightliftingWorkoutDto f33035G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f33036H;

        /* JADX INFO: renamed from: w */
        Object f33037w;

        /* JADX INFO: renamed from: x */
        Object f33038x;

        /* JADX INFO: renamed from: y */
        Object f33039y;

        /* JADX INFO: renamed from: z */
        int f33040z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10791k(InterfaceC34385a<?> interfaceC34385a, WeightliftingWorkoutDto weightliftingWorkoutDto, String str, InterfaceC30057d<? super C10791k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f33034F = interfaceC34385a;
            this.f33035G = weightliftingWorkoutDto;
            this.f33036H = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return SavingWorkoutInBackgroundWorker.this.new C10791k(this.f33034F, this.f33035G, this.f33036H, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM38897a;
            SavingWorkoutInBackgroundWorker savingWorkoutInBackgroundWorker;
            Long l7;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33040z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SavingWorkoutInBackgroundWorker savingWorkoutInBackgroundWorker2 = SavingWorkoutInBackgroundWorker.this;
                strM38897a = AbstractC13723a.m38897a((InterfaceC34385a.b) this.f33034F);
                Long workout_template_id = this.f33035G.getWorkout_template_id();
                SavingWorkoutInBackgroundWorker savingWorkoutInBackgroundWorker3 = SavingWorkoutInBackgroundWorker.this;
                String str = this.f33036H;
                this.f33037w = savingWorkoutInBackgroundWorker2;
                this.f33038x = strM38897a;
                this.f33039y = workout_template_id;
                this.f33040z = 1;
                Object objM28359o = savingWorkoutInBackgroundWorker3.m28359o(str, this);
                if (objM28359o == enumC31071a) {
                    return enumC31071a;
                }
                savingWorkoutInBackgroundWorker = savingWorkoutInBackgroundWorker2;
                obj = objM28359o;
                l7 = workout_template_id;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l7 = (Long) this.f33039y;
                strM38897a = (String) this.f33038x;
                savingWorkoutInBackgroundWorker = (SavingWorkoutInBackgroundWorker) this.f33037w;
                AbstractC34132o.m107864I(obj);
            }
            savingWorkoutInBackgroundWorker.m28369y(strM38897a, l7, ((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10791k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingWorkoutInBackgroundWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "SavingWorkoutInBackgroundWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.scopeCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10784d(this, null, null));
        this.weightliftingSerializer = AbstractC30060g.m92087G(enumC23463i, new C10785e(this, null, null));
        this.weightliftingApi = AbstractC30060g.m92087G(enumC23463i, new C10786f(this, null, null));
        this.baseAnalytics = AbstractC30060g.m92087G(enumC23463i, new C10787g(this, null, null));
        this.mainPrefs = AbstractC30060g.m92087G(enumC23463i, new C10788h(this, new C35953c("mainPrefs"), null));
        this.dispatcherFactory = AbstractC30060g.m92087G(enumC23463i, new C10789i(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m28359o(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(m28361q().getIO(), new C10782b(str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC14515a m28360p() {
        return (InterfaceC14515a) this.baseAnalytics.getValue();
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC18732d m28361q() {
        return (InterfaceC18732d) this.dispatcherFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C34660d m28362r() {
        return (C34660d) this.mainPrefs.getValue();
    }

    /* JADX INFO: renamed from: s */
    private final C37378a m28363s() {
        return (C37378a) this.scopeCoordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final WeightliftingApi m28364t() {
        return (WeightliftingApi) this.weightliftingApi.getValue();
    }

    /* JADX INFO: renamed from: u */
    private final C24755e m28365u() {
        return (C24755e) this.weightliftingSerializer.getValue();
    }

    /* JADX INFO: renamed from: v */
    private final Object m28366v(WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, m22895c(), null, "failed to upload weightlifting workout in background", new C10783c(weightliftingWorkoutDto, null), interfaceC30057d, 2, null);
    }

    /* JADX INFO: renamed from: w */
    private final void m28367w(String action, Map<String, ? extends Object> otherProperties, boolean isLocalSaveDiscarded) {
        InterfaceC14515a.m41418i(m28360p(), "Save Workout", action, null, "Workout Builder", null, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(getRunAttemptCount())), new C23465k("background", Boolean.TRUE), new C23465k("localSaveDiscarded", Boolean.valueOf(isLocalSaveDiscarded))), otherProperties), 20, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m28368x(SavingWorkoutInBackgroundWorker savingWorkoutInBackgroundWorker, String str, Map map, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        savingWorkoutInBackgroundWorker.m28367w(str, map, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m28369y(String failureReason, Long workoutId, boolean isLocalSaveDiscarded) {
        m28368x(this, "Async Save Failure", AbstractC25247g0.m73990Y(new C23465k("failureReason", failureReason), new C23465k("workoutId", workoutId), new C23465k("localSaveDiscarded", Boolean.valueOf(isLocalSaveDiscarded))), false, 4, null);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m28370z(SavingWorkoutInBackgroundWorker savingWorkoutInBackgroundWorker, String str, Long l7, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        savingWorkoutInBackgroundWorker.m28369y(str, l7, z4);
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[PHI: r1 r2
      0x0114: PHI (r1v15 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x0111, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r2v15 com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto) = 
      (r2v13 com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto)
      (r2v26 com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto)
     binds: [B:47:0x0111, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0147, code lost:
    
        if (wm0.C37378a.m119655c(r1, null, r6, 1, null) == r7) goto L58;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r16) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker.mo18568j(q83.d):java.lang.Object");
    }
}
