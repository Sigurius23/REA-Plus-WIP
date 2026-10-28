package com.whoop.weightlifting.workmanagers;

import android.content.Context;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.domain.WorkoutTemplateKt;
import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010?¨\u0006C"}, m65681d2 = {"Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "serializedUpdateTemplateKey", "", "o", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "failureReason", "", "workoutId", "isLocalSaveDiscarded", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/Long;Z)V", "action", "", "", "otherProperties", "u", "(Ljava/lang/String;Ljava/util/Map;Z)V", "workoutTemplateId", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "Lu02/a;", "y", "(JLcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Llu2/e;", "z", "Ll83/h;", "t", "()Llu2/e;", "weightliftingSerializer", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "E", "s", "()Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Lfi0/a;", "F", "p", "()Lfi0/a;", "baseAnalytics", "Lu92/d;", "G", "r", "()Lu92/d;", "mainPrefs", "Lin2/d;", "H", "q", "()Lin2/d;", "dispatcherFactory", "I", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UpdatingTemplateInBackgroundWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J */
    public static final int f33042J = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h weightliftingApi;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h baseAnalytics;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h mainPrefs;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h dispatcherFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h weightliftingSerializer;

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;", "", "<init>", "()V", "", "serializedUpdateTemplateKey", "Lic/a0;", "b", "(Ljava/lang/String;)Lic/a0;", "workoutStartTimeInMillis", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lic/p0;", "workManager", "workRequest", "Lic/e0;", "c", "(Lic/p0;Ljava/lang/String;Ljava/lang/String;Lic/a0;)Lic/e0;", "WORK_NAME_PREFIX", "Ljava/lang/String;", "KEY_WORKOUT_TEMPLATE", "TAG", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final String m28390a(String workoutStartTimeInMillis) {
            return AbstractC11266d.m30461o("strength-trainer-updating-template-", workoutStartTimeInMillis);
        }

        /* JADX INFO: renamed from: b */
        private final C18347a0 m28391b(String serializedUpdateTemplateKey) {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
            C18392z c18392z = new C18392z(UpdatingTemplateInBackgroundWorker.class);
            C23465k[] c23465kArr = {new C23465k("workoutTemplate", serializedUpdateTemplateKey)};
            C2178b c2178b = new C2178b(1);
            C23465k c23465k = c23465kArr[0];
            c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52877a("UpdatingTemplateInBackgroundWorker")).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC18355e0 m28392d(Companion companion, AbstractC18377p0 abstractC18377p0, String str, String str2, C18347a0 c18347a0, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                c18347a0 = companion.m28391b(str);
            }
            return companion.m28393c(abstractC18377p0, str, str2, c18347a0);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC18355e0 m28393c(AbstractC18377p0 workManager, String serializedUpdateTemplateKey, String workoutStartTimeInMillis, C18347a0 workRequest) {
            AbstractC22676k.m65750j(workManager, "workManager");
            AbstractC22676k.m65750j(serializedUpdateTemplateKey, "serializedUpdateTemplateKey");
            AbstractC22676k.m65750j(workoutStartTimeInMillis, "workoutStartTimeInMillis");
            AbstractC22676k.m65750j(workRequest, "workRequest");
            return workManager.m52876e(m28390a(workoutStartTimeInMillis), EnumC18368l.f71504x, workRequest);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$clearUpdateTemplateFromPreferences$2", m100430f = "UpdatingTemplateInBackgroundWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10793b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33049w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33051y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10793b(String str, InterfaceC30057d<? super C10793b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33051y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UpdatingTemplateInBackgroundWorker.this.new C10793b(this.f33051y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C10793b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33049w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            UpdatingTemplateInBackgroundWorker.this.m28382r().m109537p(this.f33051y);
            return Boolean.valueOf(!UpdatingTemplateInBackgroundWorker.this.m28382r().m109526c(this.f33051y));
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10794c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33052w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33053x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10794c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33052w = interfaceC27903a;
            this.f33053x = interfaceC35951a;
            this.f33054y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lu2.e] */
        @Override // c93.InterfaceC4339a
        public final C24755e invoke() {
            InterfaceC27903a interfaceC27903a = this.f33052w;
            InterfaceC35951a interfaceC35951a = this.f33053x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33054y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24755e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10795d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33055w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33056x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33057y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10795d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33055w = interfaceC27903a;
            this.f33056x = interfaceC35951a;
            this.f33057y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.weightlifting.data.WeightliftingApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final WeightliftingApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f33055w;
            InterfaceC35951a interfaceC35951a = this.f33056x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33057y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WeightliftingApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10796e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33058w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33059x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33060y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10796e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33058w = interfaceC27903a;
            this.f33059x = interfaceC35951a;
            this.f33060y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33058w;
            InterfaceC35951a interfaceC35951a = this.f33059x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33060y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10797f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10797f(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33061w = interfaceC27903a;
            this.f33062x = interfaceC35951a;
            this.f33063y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            InterfaceC27903a interfaceC27903a = this.f33061w;
            InterfaceC35951a interfaceC35951a = this.f33062x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33063y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10798g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33064w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33065x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33066y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10798g(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33064w = interfaceC27903a;
            this.f33065x = interfaceC35951a;
            this.f33066y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [in2.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC18732d invoke() {
            InterfaceC27903a interfaceC27903a = this.f33064w;
            InterfaceC35951a interfaceC35951a = this.f33065x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33066y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18732d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$h */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$updateWorkoutTemplateInBackground$2", m100430f = "UpdatingTemplateInBackgroundWorker.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10799h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f33067w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f33069y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WorkoutTemplate f33070z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10799h(long j7, WorkoutTemplate workoutTemplate, InterfaceC30057d<? super C10799h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f33069y = j7;
            this.f33070z = workoutTemplate;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return UpdatingTemplateInBackgroundWorker.this.new C10799h(this.f33069y, this.f33070z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33067w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApiM28383s = UpdatingTemplateInBackgroundWorker.this.m28383s();
            long j7 = this.f33069y;
            WorkoutTemplateDto dto = WorkoutTemplateKt.toDto(this.f33070z);
            this.f33067w = 1;
            Object objUpdateWorkoutTemplate = weightliftingApiM28383s.updateWorkoutTemplate(j7, dto, this);
            return objUpdateWorkoutTemplate == enumC31071a ? enumC31071a : objUpdateWorkoutTemplate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C10799h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$i */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker", m100430f = "UpdatingTemplateInBackgroundWorker.kt", m100431l = {64, 73, 78, 82, 88}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10800i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33071E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f33072F;

        /* JADX INFO: renamed from: H */
        int f33074H;

        /* JADX INFO: renamed from: w */
        Object f33075w;

        /* JADX INFO: renamed from: x */
        Object f33076x;

        /* JADX INFO: renamed from: y */
        Object f33077y;

        /* JADX INFO: renamed from: z */
        Object f33078z;

        public C10800i(InterfaceC30057d<? super C10800i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33072F = obj;
            this.f33074H |= Integer.MIN_VALUE;
            return UpdatingTemplateInBackgroundWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$j */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$work$2", m100430f = "UpdatingTemplateInBackgroundWorker.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10801j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC34385a<?> f33080F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Long f33081G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f33082H;

        /* JADX INFO: renamed from: w */
        Object f33083w;

        /* JADX INFO: renamed from: x */
        Object f33084x;

        /* JADX INFO: renamed from: y */
        Object f33085y;

        /* JADX INFO: renamed from: z */
        int f33086z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10801j(InterfaceC34385a<?> interfaceC34385a, Long l7, String str, InterfaceC30057d<? super C10801j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f33080F = interfaceC34385a;
            this.f33081G = l7;
            this.f33082H = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return UpdatingTemplateInBackgroundWorker.this.new C10801j(this.f33080F, this.f33081G, this.f33082H, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM38897a;
            UpdatingTemplateInBackgroundWorker updatingTemplateInBackgroundWorker;
            Long l7;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33086z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                UpdatingTemplateInBackgroundWorker updatingTemplateInBackgroundWorker2 = UpdatingTemplateInBackgroundWorker.this;
                strM38897a = AbstractC13723a.m38897a((InterfaceC34385a.b) this.f33080F);
                Long l12 = this.f33081G;
                UpdatingTemplateInBackgroundWorker updatingTemplateInBackgroundWorker3 = UpdatingTemplateInBackgroundWorker.this;
                String str = this.f33082H;
                this.f33083w = updatingTemplateInBackgroundWorker2;
                this.f33084x = strM38897a;
                this.f33085y = l12;
                this.f33086z = 1;
                Object objM28379o = updatingTemplateInBackgroundWorker3.m28379o(str, this);
                if (objM28379o == enumC31071a) {
                    return enumC31071a;
                }
                updatingTemplateInBackgroundWorker = updatingTemplateInBackgroundWorker2;
                obj = objM28379o;
                l7 = l12;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l7 = (Long) this.f33085y;
                strM38897a = (String) this.f33084x;
                updatingTemplateInBackgroundWorker = (UpdatingTemplateInBackgroundWorker) this.f33083w;
                AbstractC34132o.m107864I(obj);
            }
            updatingTemplateInBackgroundWorker.m28387w(strM38897a, l7, ((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10801j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatingTemplateInBackgroundWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "UpdatingTemplateInBackgroundWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.weightliftingSerializer = AbstractC30060g.m92087G(enumC23463i, new C10794c(this, null, null));
        this.weightliftingApi = AbstractC30060g.m92087G(enumC23463i, new C10795d(this, null, null));
        this.baseAnalytics = AbstractC30060g.m92087G(enumC23463i, new C10796e(this, null, null));
        this.mainPrefs = AbstractC30060g.m92087G(enumC23463i, new C10797f(this, new C35953c("mainPrefs"), null));
        this.dispatcherFactory = AbstractC30060g.m92087G(enumC23463i, new C10798g(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m28379o(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(m28381q().getIO(), new C10793b(str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC14515a m28380p() {
        return (InterfaceC14515a) this.baseAnalytics.getValue();
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC18732d m28381q() {
        return (InterfaceC18732d) this.dispatcherFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C34660d m28382r() {
        return (C34660d) this.mainPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final WeightliftingApi m28383s() {
        return (WeightliftingApi) this.weightliftingApi.getValue();
    }

    /* JADX INFO: renamed from: t */
    private final C24755e m28384t() {
        return (C24755e) this.weightliftingSerializer.getValue();
    }

    /* JADX INFO: renamed from: u */
    private final void m28385u(String action, Map<String, ? extends Object> otherProperties, boolean isLocalSaveDiscarded) {
        InterfaceC14515a.m41418i(m28380p(), "Update Template", action, null, "Workout Builder", null, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(getRunAttemptCount())), new C23465k("localSaveDiscarded", Boolean.valueOf(isLocalSaveDiscarded))), otherProperties), 20, null);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m28386v(UpdatingTemplateInBackgroundWorker updatingTemplateInBackgroundWorker, String str, Map map, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        updatingTemplateInBackgroundWorker.m28385u(str, map, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m28387w(String failureReason, Long workoutId, boolean isLocalSaveDiscarded) {
        m28386v(this, "Async Update Template Failure", AbstractC25247g0.m73990Y(new C23465k("failureReason", failureReason), new C23465k("workoutId", workoutId), new C23465k("localSaveDiscarded", Boolean.valueOf(isLocalSaveDiscarded))), false, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m28388x(UpdatingTemplateInBackgroundWorker updatingTemplateInBackgroundWorker, String str, Long l7, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        updatingTemplateInBackgroundWorker.m28387w(str, l7, z4);
    }

    /* JADX INFO: renamed from: y */
    private final Object m28389y(long j7, WorkoutTemplate workoutTemplate, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, m22895c(), null, "failed to update workout template edited during background session", new C10799h(j7, workoutTemplate, null), interfaceC30057d, 2, null);
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015d, code lost:
    
        if (r1 == r7) goto L64;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r15) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker.mo18568j(q83.d):java.lang.Object");
    }
}
