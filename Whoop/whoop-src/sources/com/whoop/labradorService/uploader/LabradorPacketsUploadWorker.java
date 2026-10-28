package com.whoop.labradorService.uploader;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FdaFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.worker.BaseReportingWorker;
import eu1.C13643b;
import eu1.EnumC13642a;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ku1.C22836a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18380r;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p218ic.InterfaceC18355e0;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "Ll83/h;", "k", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "E", "a", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabradorPacketsUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.labradorService.uploader.LabradorPacketsUploadWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;", "", "<init>", "()V", "Lic/e;", "b", "()Lic/e;", "Lic/k0;", "c", "()Lic/k0;", "Lic/p0;", "workManager", "Lic/e0;", "a", "(Lic/p0;)Lic/e0;", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final C18354e m22539b() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        }

        /* JADX INFO: renamed from: c */
        private final C18367k0 m22540c() {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(LabradorPacketsUploadWorker.class, 900000L, timeUnit).m52880f(m22539b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC18355e0 m22541a(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.mo52875d("PERIODIC_ECG_PACKETS_UPLOADER", EnumC18366k.f71499w, m22540c());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.labradorService.uploader.LabradorPacketsUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9049b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f27096w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27097x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27098y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9049b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27096w = interfaceC27903a;
            this.f27097x = interfaceC35951a;
            this.f27098y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f27096w;
            InterfaceC35951a interfaceC35951a = this.f27097x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f27098y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labradorService.uploader.LabradorPacketsUploadWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.uploader.LabradorPacketsUploadWorker", m100430f = "LabradorPacketsUploadWorker.kt", m100431l = {54}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9050c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f27099E;

        /* JADX INFO: renamed from: w */
        Object f27100w;

        /* JADX INFO: renamed from: x */
        Object f27101x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f27102y;

        public C9050c(InterfaceC30057d<? super C9050c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f27102y = obj;
            this.f27099E |= Integer.MIN_VALUE;
            return LabradorPacketsUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabradorPacketsUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PERIODIC_ECG_PACKETS_UPLOADER";
        this.featureFlagChecker = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9049b(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final FeatureFlagChecker m22538k() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
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
        C9050c c9050c;
        C13643b c13643b;
        if (interfaceC30057d instanceof C9050c) {
            c9050c = (C9050c) interfaceC30057d;
            int i13 = c9050c.f27099E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9050c.f27099E = i13 - Integer.MIN_VALUE;
            } else {
                c9050c = new C9050c(interfaceC30057d);
            }
        } else {
            c9050c = new C9050c(interfaceC30057d);
        }
        Object objM66222d = c9050c.f27102y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9050c.f27099E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM66222d);
            if (!m22538k().isFeatureEnabled(FdaFeatureFlagsKt.LABRADOR_FEATURE_ANDROID)) {
                return AbstractC18386u.m52885b();
            }
            C38266c c38266c = getKoin().f106046a.f159364d;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            C22836a c22836a = (C22836a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C22836a.class), null);
            C13643b c13643b2 = (C13643b) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C13643b.class), null);
            c13643b2.m38440a(EnumC13642a.ACTION_BACKGROUND_UPLOAD_TRIGGERED);
            c9050c.f27100w = null;
            c9050c.f27101x = c13643b2;
            c9050c.f27099E = 1;
            objM66222d = c22836a.m66222d(c9050c);
            if (objM66222d == enumC31071a) {
                return enumC31071a;
            }
            c13643b = c13643b2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13643b = (C13643b) c9050c.f27101x;
            AbstractC34132o.m107864I(objM66222d);
        }
        if (((Boolean) objM66222d).booleanValue()) {
            c13643b.m38440a(EnumC13642a.ACTION_BACKGROUND_UPLOAD_COMPLETE);
            return AbstractC18386u.m52885b();
        }
        c13643b.m38440a(EnumC13642a.ACTION_BACKGROUND_UPLOAD_FAILURE);
        return new C18380r();
    }
}
