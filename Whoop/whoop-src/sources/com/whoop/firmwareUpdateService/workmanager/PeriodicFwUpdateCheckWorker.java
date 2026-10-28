package com.whoop.firmwareUpdateService.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import ci2.AbstractC4732a;
import ci2.InterfaceC4733b;
import com.whoop.metrics.worker.BaseReportingWorker;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18384t;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lci2/b;", "z", "Ll83/h;", "l", "()Lci2/b;", "whoopStrapProvider", "Lgt0/e;", "E", "k", "()Lgt0/e;", "fwUpdateApi", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PeriodicFwUpdateCheckWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h fwUpdateApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapProvider;

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8756a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26074w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26075x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26076y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8756a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26074w = interfaceC27903a;
            this.f26075x = interfaceC35951a;
            this.f26076y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ci2.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC4733b invoke() {
            InterfaceC27903a interfaceC27903a = this.f26074w;
            InterfaceC35951a interfaceC35951a = this.f26075x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26076y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8757b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26077w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26078x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26079y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8757b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26077w = interfaceC27903a;
            this.f26078x = interfaceC35951a;
            this.f26079y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [gt0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC16183e invoke() {
            InterfaceC27903a interfaceC27903a = this.f26077w;
            InterfaceC35951a interfaceC35951a = this.f26078x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26079y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC16183e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8758c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f26080w;

        /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f26081w;

            /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.workmanager.PeriodicFwUpdateCheckWorker$work$$inlined$map$1$2", m100430f = "PeriodicFwUpdateCheckWorker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41389a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f26082E;

                /* JADX INFO: renamed from: F */
                Object f26083F;

                /* JADX INFO: renamed from: G */
                Object f26084G;

                /* JADX INFO: renamed from: H */
                int f26085H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f26086w;

                /* JADX INFO: renamed from: x */
                int f26087x;

                /* JADX INFO: renamed from: y */
                Object f26088y;

                public C41389a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f26086w = obj;
                    this.f26087x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f26081w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41389a c41389a;
                if (interfaceC30057d instanceof C41389a) {
                    c41389a = (C41389a) interfaceC30057d;
                    int i13 = c41389a.f26087x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41389a.f26087x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41389a = new C41389a(interfaceC30057d);
                    }
                } else {
                    c41389a = new C41389a(interfaceC30057d);
                }
                Object obj2 = c41389a.f26086w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41389a.f26087x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f26081w;
                    C18384t c18384tM52885b = AbstractC18386u.m52885b();
                    c41389a.f26088y = null;
                    c41389a.f26082E = null;
                    c41389a.f26083F = null;
                    c41389a.f26084G = null;
                    c41389a.f26085H = 0;
                    c41389a.f26087x = 1;
                    if (interfaceC13062m.emit(c18384tM52885b, c41389a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public C8758c(InterfaceC13058l interfaceC13058l) {
            this.f26080w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f26080w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicFwUpdateCheckWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PeriodicFwUpdateCheckWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.whoopStrapProvider = AbstractC30060g.m92087G(enumC23463i, new C8756a(this, null, null));
        this.fwUpdateApi = AbstractC30060g.m92087G(enumC23463i, new C8757b(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC16183e m21443k() {
        return (InterfaceC16183e) this.fwUpdateApi.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC4733b m21444l() {
        return (InterfaceC4733b) this.whoopStrapProvider.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) m21444l().mo14817a().getValue();
        if (interfaceC21750d == null) {
            m22895c().mo85216g("No strap available, skipping firmware update check", new AbstractC30556a.a[0]);
            return AbstractC18386u.m52885b();
        }
        m22895c().mo85216g("Sending Fw update check for strap", new AbstractC30556a.a[0]);
        return AbstractC13091v.m36575A(new C8758c(m21443k().mo45721b(new AbstractC16185g.a(AbstractC4732a.m14816b(interfaceC21750d)))), interfaceC30057d);
    }
}
