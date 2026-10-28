package com.whoop.pulseinformationpacket.network;

import android.content.Context;
import android.database.sqlite.SQLiteOutOfMemoryException;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import j52.InterfaceC21341b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lj52/b;", "y", "Ll83/h;", "m", "()Lj52/b;", "pipUploader", "Lrr2/c;", "z", "l", "()Lrr2/c;", "crashReporter", "", "E", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "pulseInformationPacket_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PipUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h pipUploader;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: com.whoop.pulseinformationpacket.network.PipUploadWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9830a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28722w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28723x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28724y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9830a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28722w = interfaceC27903a;
            this.f28723x = interfaceC35951a;
            this.f28724y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [j52.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21341b invoke() {
            InterfaceC27903a interfaceC27903a = this.f28722w;
            InterfaceC35951a interfaceC35951a = this.f28723x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28724y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21341b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pulseinformationpacket.network.PipUploadWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9831b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28725w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28726x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28727y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9831b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28725w = interfaceC27903a;
            this.f28726x = interfaceC35951a;
            this.f28727y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            InterfaceC27903a interfaceC27903a = this.f28725w;
            InterfaceC35951a interfaceC35951a = this.f28726x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28727y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pulseinformationpacket.network.PipUploadWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.network.PipUploadWorker", m100430f = "PipUploadWorker.kt", m100431l = {25}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9832c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f28728w;

        /* JADX INFO: renamed from: y */
        int f28730y;

        public C9832c(InterfaceC30057d<? super C9832c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28728w = obj;
            this.f28730y |= Integer.MIN_VALUE;
            return PipUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pulseinformationpacket.network.PipUploadWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.network.PipUploadWorker$work$2", m100430f = "PipUploadWorker.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lic/u;", "<anonymous>", "(Lbc3/c0;)Lic/u;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9833d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28731w;

        public C9833d(InterfaceC30057d<? super C9833d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PipUploadWorker.this.new C9833d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
            return ((C9833d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28731w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC21341b interfaceC21341bM23707m = PipUploadWorker.this.m23707m();
            this.f28731w = 1;
            Object objMo59944a = interfaceC21341bM23707m.mo59944a(this);
            return objMo59944a == enumC31071a ? enumC31071a : objMo59944a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipUploadWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.pipUploader = AbstractC30060g.m92087G(enumC23463i, new C9830a(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C9831b(this, null, null));
        this.uniqueWorkName = "PERIODIC_PIP_UPLOAD";
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC31766c m23706l() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC21341b m23707m() {
        return (InterfaceC21341b) this.pipUploader.getValue();
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
        C9832c c9832c;
        if (interfaceC30057d instanceof C9832c) {
            c9832c = (C9832c) interfaceC30057d;
            int i13 = c9832c.f28730y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9832c.f28730y = i13 - Integer.MIN_VALUE;
            } else {
                c9832c = new C9832c(interfaceC30057d);
            }
        } else {
            c9832c = new C9832c(interfaceC30057d);
        }
        Object objM8705K = c9832c.f28728w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c9832c.f28730y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                C3075y1 c3075y1 = C3075y1.f12109w;
                C9833d c9833d = new C9833d(null);
                c9832c.f28730y = 1;
                objM8705K = AbstractC3006f0.m8705K(c3075y1, c9833d, c9832c);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            return (AbstractC18386u) objM8705K;
        } catch (SQLiteOutOfMemoryException e5) {
            m22895c().mo85230v("Error uploading pulse info packets", e5, new AbstractC30556a.a[0]);
            return new C18380r();
        } catch (Exception e13) {
            m23706l().mo98631p(e13);
            m22895c().mo85230v("Error uploading pulse info packets", e13, new AbstractC30556a.a[0]);
            return new C18380r();
        }
    }
}
