package com.whoop.firmwareUpdateService.workmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import c93.InterfaceC4339a;
import ci2.InterfaceC4733b;
import com.whoop.metrics.worker.BaseReportingWorker;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gt0.InterfaceC16186h;
import ig1.AbstractC18470a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18370m;
import p218ic.C18380r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg1.InterfaceC31386b;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import y42.C39228j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-¨\u00061"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroid/app/Notification;", "l", "()Landroid/app/Notification;", "", "q", "()Z", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "j", "Lic/m;", "getForegroundInfo", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lrg1/b;", "z", "Ll83/h;", "m", "()Lrg1/b;", "firmwareUpdateManager", "Lc12/c;", "E", "n", "()Lc12/c;", "notificationInitializer", "Lci2/b;", "F", "p", "()Lci2/b;", "whoopStrapProvider", "Ly42/j;", "G", "o", "()Ly42/j;", "puffinManager", "H", "a", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FirmwareUpdateWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: I */
    private static final C3853d f26024I;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h notificationInitializer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapProvider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h puffinManager;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h firmwareUpdateManager;

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lc12/d;", "NOTIFICATION_SETTINGS", "Lc12/d;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m21442a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            FirmwareUpdateWorker.f26024I.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker", m100430f = "FirmwareUpdateWorker.kt", m100431l = {41, 42}, m100432m = "doWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8748b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f26030w;

        /* JADX INFO: renamed from: y */
        int f26032y;

        public C8748b(InterfaceC30057d<? super C8748b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26030w = obj;
            this.f26032y |= Integer.MIN_VALUE;
            return FirmwareUpdateWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8749c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26033w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26034x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26035y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8749c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26033w = interfaceC27903a;
            this.f26034x = interfaceC35951a;
            this.f26035y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rg1.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31386b invoke() {
            InterfaceC27903a interfaceC27903a = this.f26033w;
            InterfaceC35951a interfaceC35951a = this.f26034x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26035y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31386b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8750d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26036w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26037x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26038y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8750d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26036w = interfaceC27903a;
            this.f26037x = interfaceC35951a;
            this.f26038y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [c12.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC3852c invoke() {
            InterfaceC27903a interfaceC27903a = this.f26036w;
            InterfaceC35951a interfaceC35951a = this.f26037x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26038y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC3852c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8751e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26039w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26040x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26041y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8751e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26039w = interfaceC27903a;
            this.f26040x = interfaceC35951a;
            this.f26041y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ci2.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC4733b invoke() {
            InterfaceC27903a interfaceC27903a = this.f26039w;
            InterfaceC35951a interfaceC35951a = this.f26040x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26041y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8752f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f26042w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26043x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26044y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8752f(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26042w = interfaceC27903a;
            this.f26043x = interfaceC35951a;
            this.f26044y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y42.j] */
        @Override // c93.InterfaceC4339a
        public final C39228j invoke() {
            InterfaceC27903a interfaceC27903a = this.f26042w;
            InterfaceC35951a interfaceC35951a = this.f26043x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f26044y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39228j.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8753g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f26045w;

        /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f26046w;

            /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$work$$inlined$filter$1$2", m100430f = "FirmwareUpdateWorker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41387a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f26048F;

                /* JADX INFO: renamed from: G */
                Object f26049G;

                /* JADX INFO: renamed from: H */
                int f26050H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f26051w;

                /* JADX INFO: renamed from: x */
                int f26052x;

                /* JADX INFO: renamed from: y */
                Object f26053y;

                /* JADX INFO: renamed from: z */
                Object f26054z;

                public C41387a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f26051w = obj;
                    this.f26052x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f26046w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41387a c41387a;
                if (interfaceC30057d instanceof C41387a) {
                    c41387a = (C41387a) interfaceC30057d;
                    int i13 = c41387a.f26052x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41387a.f26052x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41387a = new C41387a(interfaceC30057d);
                    }
                } else {
                    c41387a = new C41387a(interfaceC30057d);
                }
                Object obj2 = c41387a.f26051w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41387a.f26052x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f26046w;
                    InterfaceC16186h interfaceC16186h = (InterfaceC16186h) obj;
                    if ((interfaceC16186h instanceof InterfaceC16186h.b) || (interfaceC16186h instanceof InterfaceC16186h.e) || (interfaceC16186h instanceof InterfaceC16186h.d) || (interfaceC16186h instanceof InterfaceC16186h.c)) {
                        c41387a.f26053y = null;
                        c41387a.f26054z = null;
                        c41387a.f26048F = null;
                        c41387a.f26049G = null;
                        c41387a.f26050H = 0;
                        c41387a.f26052x = 1;
                        if (interfaceC13062m.emit(obj, c41387a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public C8753g(InterfaceC13058l interfaceC13058l) {
            this.f26045w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f26045w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8754h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f26055w;

        /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f26056w;

            /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$work$$inlined$map$1$2", m100430f = "FirmwareUpdateWorker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41388a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f26057E;

                /* JADX INFO: renamed from: F */
                Object f26058F;

                /* JADX INFO: renamed from: G */
                Object f26059G;

                /* JADX INFO: renamed from: H */
                int f26060H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f26061w;

                /* JADX INFO: renamed from: x */
                int f26062x;

                /* JADX INFO: renamed from: y */
                Object f26063y;

                public C41388a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f26061w = obj;
                    this.f26062x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f26056w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41388a c41388a;
                if (interfaceC30057d instanceof C41388a) {
                    c41388a = (C41388a) interfaceC30057d;
                    int i13 = c41388a.f26062x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41388a.f26062x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41388a = new C41388a(interfaceC30057d);
                    }
                } else {
                    c41388a = new C41388a(interfaceC30057d);
                }
                Object obj2 = c41388a.f26061w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41388a.f26062x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f26056w;
                    InterfaceC16186h interfaceC16186h = (InterfaceC16186h) obj;
                    Object objM52885b = ((interfaceC16186h instanceof InterfaceC16186h.e) || (interfaceC16186h instanceof InterfaceC16186h.d)) ? AbstractC18386u.m52885b() : new C18380r();
                    c41388a.f26063y = null;
                    c41388a.f26057E = null;
                    c41388a.f26058F = null;
                    c41388a.f26059G = null;
                    c41388a.f26060H = 0;
                    c41388a.f26062x = 1;
                    if (interfaceC13062m.emit(objM52885b, c41388a) == enumC31071a) {
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

        public C8754h(InterfaceC13058l interfaceC13058l) {
            this.f26055w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f26055w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker", m100430f = "FirmwareUpdateWorker.kt", m100431l = {66, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8755i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f26066F;

        /* JADX INFO: renamed from: w */
        Object f26067w;

        /* JADX INFO: renamed from: x */
        Object f26068x;

        /* JADX INFO: renamed from: y */
        boolean f26069y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f26070z;

        public C8755i(InterfaceC30057d<? super C8755i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26070z = obj;
            this.f26066F |= Integer.MIN_VALUE;
            return FirmwareUpdateWorker.this.mo18568j(this);
        }
    }

    static {
        C3853d c3853dM11813l = new C3853d(EnumC3851b.MEDIUM, "00200_Alerts", AbstractC18470a.f71920a).m11811j(true).m11813l(true);
        AbstractC22676k.m65749i(c3853dM11813l, "setVibrationEnabled(...)");
        f26024I = c3853dM11813l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareUpdateWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "FirmwareUpdateWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.firmwareUpdateManager = AbstractC30060g.m92087G(enumC23463i, new C8749c(this, null, null));
        this.notificationInitializer = AbstractC30060g.m92087G(enumC23463i, new C8750d(this, null, null));
        this.whoopStrapProvider = AbstractC30060g.m92087G(enumC23463i, new C8751e(this, null, null));
        this.puffinManager = AbstractC30060g.m92087G(enumC23463i, new C8752f(this, null, null));
    }

    /* JADX INFO: renamed from: l */
    private final Notification m21436l() {
        InterfaceC3852c interfaceC3852cM21438n = m21438n();
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        NotificationCompat.Builder ongoing = interfaceC3852cM21438n.mo11800a(applicationContext).setContentTitle(getApplicationContext().getString(AbstractC18470a.f71920a)).setContentText(getApplicationContext().getString(AbstractC18470a.f71921b)).setCategory(NotificationCompat.CATEGORY_STATUS).setOngoing(true);
        f26024I.m11805a(ongoing);
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC31386b m21437m() {
        return (InterfaceC31386b) this.firmwareUpdateManager.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC3852c m21438n() {
        return (InterfaceC3852c) this.notificationInitializer.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final C39228j m21439o() {
        return (C39228j) this.puffinManager.getValue();
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC4733b m21440p() {
        return (InterfaceC4733b) this.whoopStrapProvider.getValue();
    }

    /* JADX INFO: renamed from: q */
    private final boolean m21441q() {
        return m21440p().mo14817a().getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker, androidx.work.CoroutineWorker
    public Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C8748b c8748b;
        if (interfaceC30057d instanceof C8748b) {
            c8748b = (C8748b) interfaceC30057d;
            int i13 = c8748b.f26032y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c8748b.f26032y = i13 - Integer.MIN_VALUE;
            } else {
                c8748b = new C8748b(interfaceC30057d);
            }
        } else {
            c8748b = new C8748b(interfaceC30057d);
        }
        Object obj = c8748b.f26030w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c8748b.f26032y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c8748b.f26032y = 1;
            if (m22896g(c8748b) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        c8748b.f26032y = 2;
        Object objDoWork = super.doWork(c8748b);
        return objDoWork == obj2 ? obj2 : objDoWork;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(InterfaceC30057d<? super C18370m> interfaceC30057d) {
        return new C18370m(111, m21436l());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        if (r10 == r1) goto L46;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker.mo18568j(q83.d):java.lang.Object");
    }
}
