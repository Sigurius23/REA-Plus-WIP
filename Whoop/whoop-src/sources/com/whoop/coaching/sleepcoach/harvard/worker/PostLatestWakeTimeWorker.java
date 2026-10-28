package com.whoop.coaching.sleepcoach.harvard.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import com.whoop.smart.alarm.data.network.model.StrapLatestWakeTimeDto;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import org.joda.time.Instant;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18380r;
import p218ic.C18382s;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p218ic.InterfaceC18355e0;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "y", "Ll83/h;", "l", "()Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lrr2/c;", "z", "k", "()Lrr2/c;", "crashReporter", "", "E", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "F", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PostLatestWakeTimeWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G */
    public static final int f24503G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h smartAlarmApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;", "", "<init>", "()V", "Lorg/joda/time/Instant;", "newLwt", "Lic/a0;", "a", "(Lorg/joda/time/Instant;)Lic/a0;", "Lic/p0;", "workManager", "Lic/e0;", "b", "(Lic/p0;Lorg/joda/time/Instant;)Lic/e0;", "", "REPORT_LWT_WORK_NAME", "Ljava/lang/String;", "KEY_LWT", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final C18347a0 m18569a(Instant newLwt) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("newLwt", Long.valueOf(newLwt.getMillis()));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) new C18392z(PostLatestWakeTimeWorker.class).m52882h(c18358g)).m52880f(new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet)))).m52879e(EnumC18346a.f71443w, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18355e0 m18570b(AbstractC18377p0 workManager, Instant newLwt) {
            AbstractC22676k.m65750j(workManager, "workManager");
            AbstractC22676k.m65750j(newLwt, "newLwt");
            return workManager.m52876e("ReportLwtWorkerName", EnumC18368l.f71503w, m18569a(newLwt));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6225b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f24507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6225b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24507w = interfaceC27903a;
            this.f24508x = interfaceC35951a;
            this.f24509y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.smart.alarm.data.network.api.SmartAlarmApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final SmartAlarmApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f24507w;
            InterfaceC35951a interfaceC35951a = this.f24508x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f24509y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(SmartAlarmApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6226c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f24510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24511x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24512y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6226c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24510w = interfaceC27903a;
            this.f24511x = interfaceC35951a;
            this.f24512y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            InterfaceC27903a interfaceC27903a = this.f24510w;
            InterfaceC35951a interfaceC35951a = this.f24511x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f24512y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker", m100430f = "PostLatestWakeTimeWorker.kt", m100431l = {42}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6227d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f24514F;

        /* JADX INFO: renamed from: w */
        long f24515w;

        /* JADX INFO: renamed from: x */
        Object f24516x;

        /* JADX INFO: renamed from: y */
        Object f24517y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f24518z;

        public C6227d(InterfaceC30057d<? super C6227d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24518z = obj;
            this.f24514F |= Integer.MIN_VALUE;
            return PostLatestWakeTimeWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLatestWakeTimeWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.smartAlarmApi = AbstractC30060g.m92087G(enumC23463i, new C6225b(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C6226c(this, null, null));
        this.uniqueWorkName = "PostLatestWakeTimeWorker";
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC31766c m18565k() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final SmartAlarmApi m18566l() {
        return (SmartAlarmApi) this.smartAlarmApi.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C6227d c6227d;
        if (interfaceC30057d instanceof C6227d) {
            c6227d = (C6227d) interfaceC30057d;
            int i13 = c6227d.f24514F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6227d.f24514F = i13 - Integer.MIN_VALUE;
            } else {
                c6227d = new C6227d(interfaceC30057d);
            }
        } else {
            c6227d = new C6227d(interfaceC30057d);
        }
        Object obj = c6227d.f24518z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c6227d.f24514F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                long jM52859b = getInputData().m52859b("newLwt", 0L);
                if (jM52859b == 0) {
                    return new C18380r();
                }
                Instant instant = new Instant(jM52859b);
                if (instant.isBeforeNow()) {
                    return new C18380r();
                }
                StrapLatestWakeTimeDto strapLatestWakeTimeDtoM25960a = StrapLatestWakeTimeDto.INSTANCE.m25960a(instant);
                SmartAlarmApi smartAlarmApiM18566l = m18566l();
                c6227d.f24516x = null;
                c6227d.f24517y = null;
                c6227d.f24515w = jM52859b;
                c6227d.f24514F = 1;
                if (smartAlarmApiM18566l.putNewStrapLatestWakeTime(strapLatestWakeTimeDtoM25960a, c6227d) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return AbstractC18386u.m52885b();
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Failed to post new strap LWT", m22895c(), m18565k());
            return new C18382s();
        }
    }
}
