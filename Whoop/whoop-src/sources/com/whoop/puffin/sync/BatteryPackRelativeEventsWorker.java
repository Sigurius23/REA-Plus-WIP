package com.whoop.puffin.sync;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.whoop.metrics.worker.BaseReportingWorker;
import io.getstream.chat.android.client.ChatClient;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "z", "a", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BatteryPackRelativeEventsWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.puffin.sync.BatteryPackRelativeEventsWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;", "", "<init>", "()V", "Lic/e;", "c", "()Lic/e;", "", "isConsole", "Lic/k0;", "e", "(Z)Lic/k0;", "Lic/a0;", "d", "(Z)Lic/a0;", "Lic/p0;", "workManager", "Ll83/a0;", "b", "(Lic/p0;)V", "a", "", "DATA_KEY_IS_CONSOLE", "Ljava/lang/String;", "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_CONSOLE", "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_FIRMWARE", "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_CONSOLE", "PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_FIRMWARE", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private final C18354e m23641c() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        }

        /* JADX INFO: renamed from: d */
        private final C18347a0 m23642d(boolean isConsole) {
            C18392z c18392z = (C18392z) new C18392z(BatteryPackRelativeEventsWorker.class).m52880f(m23641c());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isConsole", Boolean.valueOf(isConsole));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            C18392z c18392z2 = (C18392z) c18392z.m52882h(c18358g);
            EnumC18346a enumC18346a = EnumC18346a.f71443w;
            Duration durationOfSeconds = Duration.ofSeconds(10L);
            AbstractC22676k.m65749i(durationOfSeconds, "ofSeconds(...)");
            EnumC18346a enumC18346a2 = EnumC18346a.f71444x;
            c18392z2.f71542a = true;
            C30207q c30207q = c18392z2.f71544c;
            c30207q.f123645l = enumC18346a2;
            c30207q.m92427d(durationOfSeconds.toMillis());
            return (C18347a0) c18392z2.m52878b();
        }

        /* JADX INFO: renamed from: e */
        private final C18367k0 m23643e(boolean isConsole) {
            Duration durationOfHours = Duration.ofHours(2L);
            AbstractC22676k.m65749i(durationOfHours, "ofHours(...)");
            C18365j0 c18365j0 = (C18365j0) new C18365j0(BatteryPackRelativeEventsWorker.class, durationOfHours).m52880f(m23641c());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isConsole", Boolean.valueOf(isConsole));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            return (C18367k0) ((C18365j0) ((C18365j0) c18365j0.m52882h(c18358g)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: a */
        public final void m23644a(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            EnumC18368l enumC18368l = EnumC18368l.f71504x;
            workManager.m52876e("PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_CONSOLE", enumC18368l, m23642d(true));
            workManager.m52876e("PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_ONE_TIME_FIRMWARE", enumC18368l, m23642d(false));
        }

        /* JADX INFO: renamed from: b */
        public final void m23645b(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            EnumC18366k enumC18366k = EnumC18366k.f71499w;
            workManager.mo52875d("PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_CONSOLE", enumC18366k, m23643e(true));
            workManager.mo52875d("PERIODIC_BATTERY_PACK_RELATIVE_EVENTS_UPLOADER_FIRMWARE", enumC18366k, m23643e(false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.BatteryPackRelativeEventsWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsWorker", m100430f = "BatteryPackRelativeEventsWorker.kt", m100431l = {31, 33}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9817b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28576E;

        /* JADX INFO: renamed from: w */
        boolean f28577w;

        /* JADX INFO: renamed from: x */
        Object f28578x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28579y;

        public C9817b(InterfaceC30057d<? super C9817b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28579y = obj;
            this.f28576E |= Integer.MIN_VALUE;
            return BatteryPackRelativeEventsWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryPackRelativeEventsWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "BatteryPackRelativeEventsWorker";
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r8 == r1) goto L24;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.whoop.puffin.sync.BatteryPackRelativeEventsWorker.C9817b
            if (r0 == 0) goto L13
            r0 = r8
            com.whoop.puffin.sync.BatteryPackRelativeEventsWorker$b r0 = (com.whoop.puffin.sync.BatteryPackRelativeEventsWorker.C9817b) r0
            int r1 = r0.f28576E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28576E = r1
            goto L18
        L13:
            com.whoop.puffin.sync.BatteryPackRelativeEventsWorker$b r0 = new com.whoop.puffin.sync.BatteryPackRelativeEventsWorker$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28579y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f28576E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f28578x
            f52.d r0 = (f52.C14106d) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L86
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r0 = r0.f28578x
            f52.d r0 = (f52.C14106d) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L72
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)
            ic.g r8 = r7.getInputData()
            java.lang.String r2 = "isConsole"
            r5 = 0
            boolean r8 = r8.m52858a(r2, r5)
            nf3.a r2 = r7.getKoin()
            wf3.a r2 = r2.f106046a
            xf3.c r2 = r2.f159364d
            java.lang.Class<f52.d> r5 = f52.C14106d.class
            kotlin.jvm.internal.i0 r6 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
            j93.d r5 = r6.getOrCreateKotlinClass(r5)
            r6 = 0
            java.lang.Object r2 = r2.m122602a(r6, r5, r6)
            f52.d r2 = (f52.C14106d) r2
            if (r8 == 0) goto L79
            r0.f28578x = r6
            r0.f28577w = r8
            r0.f28576E = r4
            java.lang.Object r8 = r2.m40195d(r0)
            if (r8 != r1) goto L72
            goto L85
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L8c
        L79:
            r0.f28578x = r6
            r0.f28577w = r8
            r0.f28576E = r3
            java.lang.Object r8 = r2.m40196e(r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
        L8c:
            if (r8 == 0) goto L93
            ic.t r8 = p218ic.AbstractC18386u.m52885b()
            return r8
        L93:
            ic.r r8 = new ic.r
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.sync.BatteryPackRelativeEventsWorker.mo18568j(q83.d):java.lang.Object");
    }
}
