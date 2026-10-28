package com.whoop.workmanager.batteryworkmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import m92.C25323f;
import o92.C27705h;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
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
import su0.C33011a;
import su0.C33013c;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lsu0/a;", "z", "Ll83/h;", "k", "()Lsu0/a;", "deadBatteryAnalyticsHelper", "Lo92/h;", "E", "m", "()Lo92/h;", "deadBatteryPushNotification", "Lsu0/c;", "F", "l", "()Lsu0/c;", "deadBatteryNotificationStateManager", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DeadBatteryWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h deadBatteryPushNotification;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h deadBatteryNotificationStateManager;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h deadBatteryAnalyticsHelper;

    /* JADX INFO: renamed from: com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10924a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33788w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33789x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33790y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10924a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33788w = interfaceC27903a;
            this.f33789x = interfaceC35951a;
            this.f33790y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, su0.a] */
        @Override // c93.InterfaceC4339a
        public final C33011a invoke() {
            InterfaceC27903a interfaceC27903a = this.f33788w;
            InterfaceC35951a interfaceC35951a = this.f33789x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33790y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33011a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10925b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33791w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33792x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33793y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10925b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33791w = interfaceC27903a;
            this.f33792x = interfaceC35951a;
            this.f33793y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o92.h] */
        @Override // c93.InterfaceC4339a
        public final C27705h invoke() {
            InterfaceC27903a interfaceC27903a = this.f33791w;
            InterfaceC35951a interfaceC35951a = this.f33792x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33793y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27705h.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10926c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f33794w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33795x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33796y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10926c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33794w = interfaceC27903a;
            this.f33795x = interfaceC35951a;
            this.f33796y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, su0.c] */
        @Override // c93.InterfaceC4339a
        public final C33013c invoke() {
            InterfaceC27903a interfaceC27903a = this.f33794w;
            InterfaceC35951a interfaceC35951a = this.f33795x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f33796y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33013c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker", m100430f = "DeadBatteryWorker.kt", m100431l = {28}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10927d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f33797w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33798x;

        /* JADX INFO: renamed from: z */
        int f33800z;

        public C10927d(InterfaceC30057d<? super C10927d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33798x = obj;
            this.f33800z |= Integer.MIN_VALUE;
            return DeadBatteryWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeadBatteryWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(workerParams, "workerParams");
        this.uniqueWorkName = "DeadBatteryConfirmationWork";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.deadBatteryAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10924a(this, null, null));
        this.deadBatteryPushNotification = AbstractC30060g.m92087G(enumC23463i, new C10925b(this, null, null));
        this.deadBatteryNotificationStateManager = AbstractC30060g.m92087G(enumC23463i, new C10926c(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final C33011a m28979k() {
        return (C33011a) this.deadBatteryAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final C33013c m28980l() {
        return (C33013c) this.deadBatteryNotificationStateManager.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final C27705h m28981m() {
        return (C27705h) this.deadBatteryPushNotification.getValue();
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
        C10927d c10927d;
        if (interfaceC30057d instanceof C10927d) {
            c10927d = (C10927d) interfaceC30057d;
            int i13 = c10927d.f33800z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10927d.f33800z = i13 - Integer.MIN_VALUE;
            } else {
                c10927d = new C10927d(interfaceC30057d);
            }
        } else {
            c10927d = new C10927d(interfaceC30057d);
        }
        Object obj = c10927d.f33798x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10927d.f33800z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object obj2 = getInputData().f71480a.get("batteryLevel");
            int iIntValue = ((Number) (obj2 instanceof Integer ? obj2 : -1)).intValue();
            m22895c().mo85220k("DeadBatteryWorker", "Battery silence timeout reached. Sending dead battery notification.", new AbstractC30556a.a[0]);
            m28979k().m104223a(iIntValue);
            C27705h c27705hM28981m = m28981m();
            C25323f c25323f = new C25323f(C25272z.f99163w);
            Context applicationContext = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            c27705hM28981m.mo24524a(c25323f, applicationContext);
            C33013c c33013cM28980l = m28980l();
            c10927d.f33797w = iIntValue;
            c10927d.f33800z = 1;
            if (c33013cM28980l.m104231b(c10927d) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC18386u.m52885b();
    }
}
