package com.whoop.researchPacket.data;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23467m;
import l83.C23468n;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18382s;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import w62.C36865a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/researchPacket/data/ResearchPacketsUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lw62/a;", "y", "Ll83/h;", "k", "()Lw62/a;", "researchPacketsUploader", "", "z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "E", "a", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ResearchPacketsUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h researchPacketsUploader;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.researchPacket.data.ResearchPacketsUploadWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/researchPacket/data/ResearchPacketsUploadWorker$a;", "", "<init>", "()V", "Lic/e;", "b", "()Lic/e;", "Lic/k0;", "c", "()Lic/k0;", "Lic/p0;", "workManager", "Lic/e0;", "a", "(Lic/p0;)Lic/e0;", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final C18354e m24386b() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        }

        /* JADX INFO: renamed from: c */
        private final C18367k0 m24387c() {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(ResearchPacketsUploadWorker.class, 900000L, timeUnit).m52880f(m24386b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC18355e0 m24388a(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.mo52875d("PERIODIC_RESEARCH_PACKETS_UPLOADER", EnumC18366k.f71499w, m24387c());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.researchPacket.data.ResearchPacketsUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9928b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29376w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29377x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29378y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9928b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29376w = interfaceC27903a;
            this.f29377x = interfaceC35951a;
            this.f29378y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w62.a] */
        @Override // c93.InterfaceC4339a
        public final C36865a invoke() {
            InterfaceC27903a interfaceC27903a = this.f29376w;
            InterfaceC35951a interfaceC35951a = this.f29377x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29378y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36865a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.researchPacket.data.ResearchPacketsUploadWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.data.ResearchPacketsUploadWorker", m100430f = "ResearchPacketsUploadWorker.kt", m100431l = {40}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9929c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f29379w;

        /* JADX INFO: renamed from: y */
        int f29381y;

        public C9929c(InterfaceC30057d<? super C9929c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29379w = obj;
            this.f29381y |= Integer.MIN_VALUE;
            return ResearchPacketsUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResearchPacketsUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.researchPacketsUploader = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9928b(this, null, null));
        this.uniqueWorkName = "ResearchPacketsUploadWorker";
    }

    /* JADX INFO: renamed from: k */
    private final C36865a m24385k() {
        return (C36865a) this.researchPacketsUploader.getValue();
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
        C9929c c9929c;
        Object objM118243d;
        if (interfaceC30057d instanceof C9929c) {
            c9929c = (C9929c) interfaceC30057d;
            int i13 = c9929c.f29381y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9929c.f29381y = i13 - Integer.MIN_VALUE;
            } else {
                c9929c = new C9929c(interfaceC30057d);
            }
        } else {
            c9929c = new C9929c(interfaceC30057d);
        }
        Object obj = c9929c.f29379w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9929c.f29381y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C36865a c36865aM24385k = m24385k();
            c9929c.f29381y = 1;
            objM118243d = c36865aM24385k.m118243d(c9929c);
            if (objM118243d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM118243d = ((C23468n) obj).f92940w;
        }
        return !(objM118243d instanceof C23467m) ? AbstractC18386u.m52885b() : new C18382s();
    }
}
