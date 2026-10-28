package com.whoop.service.timezone;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/service/timezone/a;", "z", "Ll83/h;", "k", "()Lcom/whoop/service/timezone/a;", "timezoneUpdateUploader", "E", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TimezoneUpdateRetryWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h timezoneUpdateUploader;

    /* JADX INFO: renamed from: com.whoop.service.timezone.TimezoneUpdateRetryWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;", "", "<init>", "()V", "Lic/a0;", "a", "()Lic/a0;", "", "WORK_NAME", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C18347a0 m24797a() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("start_time", Long.valueOf(System.currentTimeMillis()));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) new C18392z(TimezoneUpdateRetryWorker.class).m52880f(c18354e)).m52882h(c18358g)).m52879e(EnumC18346a.f71444x, 10L, TimeUnit.MINUTES)).m52878b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.timezone.TimezoneUpdateRetryWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10021b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f30045w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30046x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10021b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30045w = interfaceC27903a;
            this.f30046x = interfaceC35951a;
            this.f30047y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.service.timezone.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10023a invoke() {
            InterfaceC27903a interfaceC27903a = this.f30045w;
            InterfaceC35951a interfaceC35951a = this.f30046x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f30047y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10023a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.timezone.TimezoneUpdateRetryWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateRetryWorker", m100430f = "TimezoneUpdateRetryWorker.kt", m100431l = {43, 47}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10022c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30048E;

        /* JADX INFO: renamed from: w */
        long f30049w;

        /* JADX INFO: renamed from: x */
        long f30050x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30051y;

        public C10022c(InterfaceC30057d<? super C10022c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30051y = obj;
            this.f30048E |= Integer.MIN_VALUE;
            return TimezoneUpdateRetryWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimezoneUpdateRetryWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "timezone_update_retry";
        this.timezoneUpdateUploader = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10021b(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final C10023a m24796k() {
        return (C10023a) this.timezoneUpdateUploader.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        if (r15.m31777a(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (r15 == r1) goto L27;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.timezone.TimezoneUpdateRetryWorker.mo18568j(q83.d):java.lang.Object");
    }
}
