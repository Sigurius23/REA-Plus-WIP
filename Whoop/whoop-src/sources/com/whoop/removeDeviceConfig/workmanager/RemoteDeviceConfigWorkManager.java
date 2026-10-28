package com.whoop.removeDeviceConfig.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.whoop.metrics.worker.BaseReportingWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18380r;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import u62.C34558b;
import u62.EnumC34557a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lu62/b;", "y", "Lu62/b;", "remoteDeviceConfigInteractor", "", "z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "E", "a", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RemoteDeviceConfigWorkManager extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C34558b remoteDeviceConfigInteractor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.removeDeviceConfig.workmanager.RemoteDeviceConfigWorkManager$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;", "", "<init>", "()V", "Lic/e;", "a", "()Lic/e;", "Lic/k0;", "b", "()Lic/k0;", "Lic/p0;", "workManager", "Ll83/a0;", "c", "(Lic/p0;)V", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final C18354e m24382a() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        }

        /* JADX INFO: renamed from: b */
        private final C18367k0 m24383b() {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(RemoteDeviceConfigWorkManager.class, 900000L, timeUnit).m52880f(m24382a())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
        }

        /* JADX INFO: renamed from: c */
        public final void m24384c(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            workManager.mo52875d("PERIODIC_USER_PROPERTIES_VALUES_WORK", EnumC18366k.f71499w, m24383b());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.removeDeviceConfig.workmanager.RemoteDeviceConfigWorkManager$b */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.workmanager.RemoteDeviceConfigWorkManager", m100430f = "RemoteDeviceConfigWorkManager.kt", m100431l = {46}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9926b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f29370w;

        /* JADX INFO: renamed from: y */
        int f29372y;

        public C9926b(InterfaceC30057d<? super C9926b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29370w = obj;
            this.f29372y |= Integer.MIN_VALUE;
            return RemoteDeviceConfigWorkManager.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteDeviceConfigWorkManager(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.remoteDeviceConfigInteractor = (C34558b) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34558b.class), null);
        this.uniqueWorkName = "RemoteDeviceConfigWorkManager";
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) throws Throwable {
        C9926b c9926b;
        if (interfaceC30057d instanceof C9926b) {
            c9926b = (C9926b) interfaceC30057d;
            int i13 = c9926b.f29372y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9926b.f29372y = i13 - Integer.MIN_VALUE;
            } else {
                c9926b = new C9926b(interfaceC30057d);
            }
        } else {
            c9926b = new C9926b(interfaceC30057d);
        }
        Object objM109270w = c9926b.f29370w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9926b.f29372y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM109270w);
            C34558b c34558b = this.remoteDeviceConfigInteractor;
            c9926b.f29372y = 1;
            objM109270w = c34558b.m109270w(c9926b);
            if (objM109270w == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM109270w);
        }
        return ((EnumC34557a) objM109270w) == EnumC34557a.SUCCESS ? AbstractC18386u.m52885b() : new C18380r();
    }
}
