package com.whoop.workmanager.consolepacketworkmanager;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.WorkerParameters;
import at0.InterfaceC1984b;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import l83.C23468n;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18386u;
import p218ic.C18382s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r03.InterfaceC30845b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lr03/b;", "y", "Ll83/h;", "l", "()Lr03/b;", "consolePacketUploader", "Lat0/b;", "z", "k", "()Lat0/b;", "consolePacketService", "", "E", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConsolePacketUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h consolePacketUploader;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h consolePacketService;

    /* JADX INFO: renamed from: com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploadWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10928a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33804w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33805x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33806y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10928a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33804w = interfaceC27903a;
            this.f33805x = interfaceC35951a;
            this.f33806y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, r03.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC30845b invoke() {
            InterfaceC27903a interfaceC27903a = this.f33804w;
            InterfaceC35951a interfaceC35951a = this.f33805x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33806y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC30845b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10929b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33807w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33808x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10929b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33807w = interfaceC27903a;
            this.f33808x = interfaceC35951a;
            this.f33809y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [at0.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC1984b invoke() {
            InterfaceC27903a interfaceC27903a = this.f33807w;
            InterfaceC35951a interfaceC35951a = this.f33808x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33809y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC1984b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploadWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploadWorker", m100430f = "ConsolePacketUploadWorker.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, 24}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10930c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f33810w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33811x;

        /* JADX INFO: renamed from: z */
        int f33813z;

        public C10930c(InterfaceC30057d<? super C10930c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33811x = obj;
            this.f33813z |= Integer.MIN_VALUE;
            return ConsolePacketUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsolePacketUploadWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.consolePacketUploader = AbstractC30060g.m92087G(enumC23463i, new C10928a(this, null, null));
        this.consolePacketService = AbstractC30060g.m92087G(enumC23463i, new C10929b(this, null, null));
        this.uniqueWorkName = "PERIODIC_CONSOLE_PACKET_UPLOAD";
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC1984b m28982k() {
        return (InterfaceC1984b) this.consolePacketService.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC30845b m28983l() {
        return (InterfaceC30845b) this.consolePacketUploader.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002b, B:29:0x0071, B:31:0x0077, B:33:0x0083, B:35:0x008d, B:37:0x0097, B:39:0x009c, B:32:0x007e, B:19:0x003e, B:25:0x0052, B:22:0x0045), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002b, B:29:0x0071, B:31:0x0077, B:33:0x0083, B:35:0x008d, B:37:0x0097, B:39:0x009c, B:32:0x007e, B:19:0x003e, B:25:0x0052, B:22:0x0045), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C10930c c10930c;
        AbstractC18386u abstractC18386u;
        Object obj;
        Object c18382s;
        if (interfaceC30057d instanceof C10930c) {
            c10930c = (C10930c) interfaceC30057d;
            int i13 = c10930c.f33813z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10930c.f33813z = i13 - Integer.MIN_VALUE;
            } else {
                c10930c = new C10930c(interfaceC30057d);
            }
        } else {
            c10930c = new C10930c(interfaceC30057d);
        }
        Object objMo94869a = c10930c.f33811x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10930c.f33813z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo94869a);
                InterfaceC30845b interfaceC30845bM28983l = m28983l();
                c10930c.f33813z = 1;
                objMo94869a = interfaceC30845bM28983l.mo94869a(c10930c);
                if (objMo94869a == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objMo94869a);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC18386u = (AbstractC18386u) c10930c.f33810w;
                AbstractC34132o.m107864I(objMo94869a);
                obj = ((C23468n) objMo94869a).f92940w;
            }
            if (C23468n.m68037a(obj) == null) {
                c18382s = AbstractC18386u.m52885b();
            } else {
                c18382s = new C18382s();
            }
            return (c18382s.equals(AbstractC18386u.m52885b()) || !AbstractC22676k.m65745e(abstractC18386u, AbstractC18386u.m52885b())) ? new C18382s() : AbstractC18386u.m52885b();
            AbstractC18386u abstractC18386u2 = (AbstractC18386u) objMo94869a;
            m22895c().mo85228t("Uploading Maverick Console packets", new AbstractC30556a.a[0]);
            InterfaceC1984b interfaceC1984bM28982k = m28982k();
            c10930c.f33810w = abstractC18386u2;
            c10930c.f33813z = 2;
            Object objMo6046b = interfaceC1984bM28982k.mo6046b(c10930c);
            if (objMo6046b != enumC31071a) {
                abstractC18386u = abstractC18386u2;
                obj = objMo6046b;
                if (C23468n.m68037a(obj) == null) {
                    c18382s = AbstractC18386u.m52885b();
                } else {
                    c18382s = new C18382s();
                }
                if (c18382s.equals(AbstractC18386u.m52885b())) {
                }
            }
            return enumC31071a;
        } catch (Exception e5) {
            m22895c().mo85222m(AbstractC2875y.m8297j(e5, "Error uploading console logs: "), new AbstractC30556a.a[0]);
            return new C18382s();
        }
    }
}
