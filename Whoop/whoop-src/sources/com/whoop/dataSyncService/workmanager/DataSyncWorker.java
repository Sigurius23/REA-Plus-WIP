package com.whoop.dataSyncService.workmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.worker.BaseReportingWorker;
import dt0.AbstractC12358a;
import dt0.C12360c;
import dx0.AbstractC12426e;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.time.Clock;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import jx0.C21998a;
import jx0.C22003f;
import kotlinx.coroutines.TimeoutCancellationException;
import kx0.InterfaceC22876c;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mx0.C25991a;
import mx0.C25993c;
import mx0.C25994d;
import of3.InterfaceC27903a;
import org.joda.time.DateTimeConstants;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p218ic.AbstractC18386u;
import p218ic.C18370m;
import p218ic.C18380r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import xf3.C38266c;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002CDB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b\u0019\u0010$R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b\u0013\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u00107R!\u0010>\u001a\b\u0012\u0004\u0012\u00020:098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00105¨\u0006E"}, m65681d2 = {"Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroid/app/Notification;", "s", "()Landroid/app/Notification;", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "j", "Lic/m;", "getForegroundInfo", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lmx0/a;", "z", "Ll83/h;", "u", "()Lmx0/a;", "dataFlowController", "Ljava/time/Clock;", "E", "Ljava/time/Clock;", "clock", "Lc12/c;", "F", "()Lc12/c;", "notificationInitializer", "Lmx0/c;", "G", "()Lmx0/c;", "highWatermarkHelper", "Ljx0/f;", "H", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ljx0/f;", "dataSyncWorkDatabaseManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "I", "x", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljs0/c;", "J", "t", "()Ljs0/c;", "configRepo", "La6/g;", "Lf6/f;", "K", "v", "()La6/g;", "dataStorePreferences", "Lkotlin/time/Duration;", "L", "workerTimeout", "M", "b", "a", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DataSyncWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    private static final C14132d f25473N = AbstractC15751g.m44429I("DATA_SYNC_WORKER_LAST_WORK_TIME");

    /* JADX INFO: renamed from: O */
    private static final C3853d f25474O;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h notificationInitializer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h highWatermarkHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h dataSyncWorkDatabaseManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h configRepo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h dataStorePreferences;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long workerTimeout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h dataFlowController;

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "b", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lf6/d;", "", "KEY_LAST_WORK_TIME", "Lf6/d;", "a", "()Lf6/d;", "", "WORKER_CLOCK", "Ljava/lang/String;", "PROCESS_NOW_JOB_TAG", "INTERVAL_JOB_TAG", "UPLOAD_JOB_TAG", "Lc12/d;", "NOTIFICATION_SETTINGS", "Lc12/d;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14132d m20015a() {
            return DataSyncWorker.f25473N;
        }

        /* JADX INFO: renamed from: b */
        public final void m20016b(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            DataSyncWorker.f25474O.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$b;", "Ljs0/a;", "", "<init>", "()V", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6668b extends AbstractC21907a<Long> {

        /* JADX INFO: renamed from: a */
        public static final C6668b f25485a = new C6668b();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C6668b() {
            super("DSW_TIMEOUT", Long.valueOf(Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(10, DurationUnit.MINUTES))));
            Duration.Companion companion = Duration.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker", m100430f = "DataSyncWorker.kt", m100431l = {70, 71}, m100432m = "doWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6669c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f25486w;

        /* JADX INFO: renamed from: y */
        int f25488y;

        public C6669c(InterfaceC30057d<? super C6669c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f25486w = obj;
            this.f25488y |= Integer.MIN_VALUE;
            return DataSyncWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6670d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25489w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25490x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25491y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6670d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25489w = interfaceC27903a;
            this.f25490x = interfaceC35951a;
            this.f25491y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mx0.a] */
        @Override // c93.InterfaceC4339a
        public final C25991a invoke() {
            InterfaceC27903a interfaceC27903a = this.f25489w;
            InterfaceC35951a interfaceC35951a = this.f25490x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25491y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25991a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6671e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25492w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25493x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25494y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6671e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25492w = interfaceC27903a;
            this.f25493x = interfaceC35951a;
            this.f25494y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [c12.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC3852c invoke() {
            InterfaceC27903a interfaceC27903a = this.f25492w;
            InterfaceC35951a interfaceC35951a = this.f25493x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25494y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC3852c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6672f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25495w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25496x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25497y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6672f(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25495w = interfaceC27903a;
            this.f25496x = interfaceC35951a;
            this.f25497y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mx0.c] */
        @Override // c93.InterfaceC4339a
        public final C25993c invoke() {
            InterfaceC27903a interfaceC27903a = this.f25495w;
            InterfaceC35951a interfaceC35951a = this.f25496x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25497y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25993c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6673g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25498w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25499x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25500y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6673g(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25498w = interfaceC27903a;
            this.f25499x = interfaceC35951a;
            this.f25500y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jx0.f] */
        @Override // c93.InterfaceC4339a
        public final C22003f invoke() {
            InterfaceC27903a interfaceC27903a = this.f25498w;
            InterfaceC35951a interfaceC35951a = this.f25499x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25500y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22003f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6674h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25501w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25502x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25503y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6674h(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25501w = interfaceC27903a;
            this.f25502x = interfaceC35951a;
            this.f25503y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f25501w;
            InterfaceC35951a interfaceC35951a = this.f25502x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25503y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6675i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25504w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25505x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25506y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6675i(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25504w = interfaceC27903a;
            this.f25505x = interfaceC35951a;
            this.f25506y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            InterfaceC27903a interfaceC27903a = this.f25504w;
            InterfaceC35951a interfaceC35951a = this.f25505x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25506y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6676j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f25507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6676j(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25507w = interfaceC27903a;
            this.f25508x = interfaceC35951a;
            this.f25509y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [a6.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC0422g invoke() {
            InterfaceC27903a interfaceC27903a = this.f25507w;
            InterfaceC35951a interfaceC35951a = this.f25508x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f25509y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$k */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6677k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f25510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ DataSyncWorker f25511x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21998a f25512y;

        /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f25513w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ DataSyncWorker f25514x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21998a f25515y;

            /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$$inlined$map$1$2", m100430f = "DataSyncWorker.kt", m100431l = {58, 59, 64, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41383a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f25516E;

                /* JADX INFO: renamed from: F */
                Object f25517F;

                /* JADX INFO: renamed from: G */
                Object f25518G;

                /* JADX INFO: renamed from: H */
                Object f25519H;

                /* JADX INFO: renamed from: I */
                Object f25520I;

                /* JADX INFO: renamed from: J */
                Object f25521J;

                /* JADX INFO: renamed from: K */
                int f25522K;

                /* JADX INFO: renamed from: L */
                int f25523L;

                /* JADX INFO: renamed from: M */
                long f25524M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f25525w;

                /* JADX INFO: renamed from: x */
                int f25526x;

                /* JADX INFO: renamed from: y */
                Object f25527y;

                public C41383a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f25525w = obj;
                    this.f25526x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, DataSyncWorker dataSyncWorker, C21998a c21998a) {
                this.f25513w = interfaceC13062m;
                this.f25514x = dataSyncWorker;
                this.f25515y = c21998a;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x01a5  */
            /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:61:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x020b, code lost:
            
                if (r0.emit(r5, r2) == r3) goto L58;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r28, q83.InterfaceC30057d r29) {
                /*
                    Method dump skipped, instruction units count: 529
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.dataSyncService.workmanager.DataSyncWorker.C6677k.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public C6677k(InterfaceC13058l interfaceC13058l, DataSyncWorker dataSyncWorker, C21998a c21998a) {
            this.f25510w = interfaceC13058l;
            this.f25511x = dataSyncWorker;
            this.f25512y = c21998a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f25510w.collect(new a(interfaceC13062m, this.f25511x, this.f25512y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$l */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker", m100430f = "DataSyncWorker.kt", m100431l = {76, 84, 88, 95, 155}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6678l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f25529E;

        /* JADX INFO: renamed from: F */
        Object f25530F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f25531G;

        /* JADX INFO: renamed from: I */
        int f25533I;

        /* JADX INFO: renamed from: w */
        long f25534w;

        /* JADX INFO: renamed from: x */
        long f25535x;

        /* JADX INFO: renamed from: y */
        long f25536y;

        /* JADX INFO: renamed from: z */
        Object f25537z;

        public C6678l(InterfaceC30057d<? super C6678l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f25531G = obj;
            this.f25533I |= Integer.MIN_VALUE;
            return DataSyncWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$m */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$2", m100430f = "DataSyncWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6679m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25538w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f25539x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f25540y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6679m(long j7, InterfaceC30057d<? super C6679m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25540y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C6679m c6679m = new C6679m(this.f25540y, interfaceC30057d);
            c6679m.f25539x = obj;
            return c6679m;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6679m) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f25539x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f25538w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(DataSyncWorker.INSTANCE.m20015a(), new Long(this.f25540y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$n */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$3", m100430f = "DataSyncWorker.kt", m100431l = {109}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lmx0/d;", "state", "Ll83/a0;", "<anonymous>", "(Lmx0/d;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6680n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25541w;

        /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$n$a */
        /* JADX INFO: loaded from: classes8.dex */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$3$1", m100430f = "DataSyncWorker.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f25543w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f25544x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ DataSyncWorker f25545y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DataSyncWorker dataSyncWorker, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f25545y = dataSyncWorker;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f25545y, interfaceC30057d);
                aVar.f25544x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f25544x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f25543w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40230g(AbstractC12358a.m34614a(), new Long(this.f25545y.clock.millis()));
                return C23454a0.f92919a;
            }
        }

        public C6680n(InterfaceC30057d<? super C6680n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DataSyncWorker.this.new C6680n(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C25994d c25994d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6680n) create(c25994d, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25541w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (DataSyncWorker.this.m20012x().isFeatureEnabled(ConnectivityFeatureFlagsKt.STRAP_SYNC_RATE_LIMITING)) {
                    InterfaceC0422g interfaceC0422gM20010v = DataSyncWorker.this.m20010v();
                    a aVar = new a(DataSyncWorker.this, null);
                    this.f25541w = 1;
                    if (AbstractC17269i.m48861G(interfaceC0422gM20010v, aVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.dataSyncService.workmanager.DataSyncWorker$o */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$5", m100430f = "DataSyncWorker.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lec3/m;", "Lic/u;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "exception", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6681o extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f25546w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f25547x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f25548y;

        public C6681o(InterfaceC30057d<? super C6681o> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C6681o c6681o = DataSyncWorker.this.new C6681o(interfaceC30057d);
            c6681o.f25547x = interfaceC13062m;
            c6681o.f25548y = th3;
            return c6681o.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f25547x;
            Throwable th3 = (Throwable) this.f25548y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25546w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof TimeoutCancellationException)) {
                    DataSyncWorker.this.m22895c().mo85230v("Error occurred while syncing", th3, new AbstractC30556a.a[0]);
                    throw th3;
                }
                DataSyncWorker.this.m22895c().mo85230v("Timing out as job is not finishing", th3, new AbstractC30556a.a[0]);
                C18380r c18380r = new C18380r();
                this.f25547x = null;
                this.f25548y = null;
                this.f25546w = 1;
                if (interfaceC13062m.emit(c18380r, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    static {
        C3853d c3853dM11813l = new C3853d(EnumC3851b.MEDIUM, "00200_Alerts", AbstractC12426e.f42327a).m11811j(true).m11813l(true);
        AbstractC22676k.m65749i(c3853dM11813l, "setVibrationEnabled(...)");
        f25474O = c3853dM11813l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "DataSyncWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        Object objM125868N0 = null;
        this.dataFlowController = AbstractC30060g.m92087G(enumC23463i, new C6670d(this, null, null));
        C35953c c35953c = new C35953c("WORKER_CLOCK");
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.clock = (Clock) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Clock.class), c35953c);
        this.notificationInitializer = AbstractC30060g.m92087G(enumC23463i, new C6671e(this, null, null));
        this.highWatermarkHelper = AbstractC30060g.m92087G(enumC23463i, new C6672f(this, null, null));
        this.dataSyncWorkDatabaseManager = AbstractC30060g.m92087G(enumC23463i, new C6673g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C6674h(this, null, null));
        this.configRepo = AbstractC30060g.m92087G(enumC23463i, new C6675i(this, null, null));
        this.dataStorePreferences = AbstractC30060g.m92087G(enumC23463i, new C6676j(this, null, null));
        AbstractC21909c abstractC21909cM20008t = m20008t();
        C6668b c6668b = C6668b.f25485a;
        C21908b configurations = abstractC21909cM20008t.getConfigurations();
        String name = c6668b.getName();
        Object defaultValue = c6668b.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        defaultValue = objM125868N0 != null ? objM125868N0 : defaultValue;
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        this.workerTimeout = DurationKt.toDuration(((Long) defaultValue).longValue(), DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: s */
    private final Notification m20007s() {
        InterfaceC3852c interfaceC3852cM20014z = m20014z();
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        NotificationCompat.Builder ongoing = interfaceC3852cM20014z.mo11800a(applicationContext).setContentTitle(getApplicationContext().getString(AbstractC12426e.f42327a)).setContentText(getApplicationContext().getString(AbstractC12426e.f42328b)).setCategory(NotificationCompat.CATEGORY_STATUS).setOngoing(true);
        f25474O.m11805a(ongoing);
        Notification notificationBuild = ongoing.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: t */
    private final AbstractC21909c m20008t() {
        return (AbstractC21909c) this.configRepo.getValue();
    }

    /* JADX INFO: renamed from: u */
    private final C25991a m20009u() {
        return (C25991a) this.dataFlowController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC0422g m20010v() {
        return (InterfaceC0422g) this.dataStorePreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final C22003f m20011w() {
        return (C22003f) this.dataSyncWorkDatabaseManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final FeatureFlagChecker m20012x() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final C25993c m20013y() {
        return (C25993c) this.highWatermarkHelper.getValue();
    }

    /* JADX INFO: renamed from: z */
    private final InterfaceC3852c m20014z() {
        return (InterfaceC3852c) this.notificationInitializer.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker, androidx.work.CoroutineWorker
    public Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C6669c c6669c;
        if (interfaceC30057d instanceof C6669c) {
            c6669c = (C6669c) interfaceC30057d;
            int i13 = c6669c.f25488y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6669c.f25488y = i13 - Integer.MIN_VALUE;
            } else {
                c6669c = new C6669c(interfaceC30057d);
            }
        } else {
            c6669c = new C6669c(interfaceC30057d);
        }
        Object obj = c6669c.f25486w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c6669c.f25488y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c6669c.f25488y = 1;
            if (m22896g(c6669c) != obj2) {
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
        c6669c.f25488y = 2;
        Object objDoWork = super.doWork(c6669c);
        return objDoWork == obj2 ? obj2 : objDoWork;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(InterfaceC30057d<? super C18370m> interfaceC30057d) {
        return new C18370m(110, m20007s());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C6678l c6678l;
        long jMillis;
        long j7;
        long j13;
        long j14;
        C21998a c21998a;
        long jMillis2;
        long j15;
        String triggerSource;
        InterfaceC13072o1 strapSyncEventFlow;
        InterfaceC22876c.a aVar;
        long j16;
        Object objM36575A;
        if (interfaceC30057d instanceof C6678l) {
            c6678l = (C6678l) interfaceC30057d;
            int i13 = c6678l.f25533I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c6678l.f25533I = i13 - Integer.MIN_VALUE;
            } else {
                c6678l = new C6678l(interfaceC30057d);
            }
        } else {
            c6678l = new C6678l(interfaceC30057d);
        }
        Object objM36575A2 = c6678l.f25531G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c6678l.f25533I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A2);
            jMillis = this.clock.millis();
            InterfaceC13058l data = m20010v().getData();
            c6678l.f25534w = jMillis;
            c6678l.f25533I = 1;
            objM36575A2 = AbstractC13091v.m36575A(data, c6678l);
            if (objM36575A2 != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            jMillis = c6678l.f25534w;
            AbstractC34132o.m107864I(objM36575A2);
        } else {
            if (i14 == 2) {
                j7 = c6678l.f25535x;
                jMillis = c6678l.f25534w;
                AbstractC34132o.m107864I(objM36575A2);
                C22003f c22003fM20011w = m20011w();
                String string = getId().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                c6678l.f25537z = null;
                c6678l.f25534w = jMillis;
                c6678l.f25535x = j7;
                c6678l.f25533I = 3;
                objM36575A2 = c22003fM20011w.m62881c(string, c6678l);
                if (objM36575A2 != enumC31071a) {
                    j13 = j7;
                    j14 = jMillis;
                    c21998a = (C21998a) objM36575A2;
                    if (c21998a != null) {
                        jMillis2 = c21998a.getTriggerTimestamp();
                    } else {
                        jMillis2 = this.clock.millis();
                    }
                    j15 = jMillis2;
                    DeviceTriggerSource.Companion companion = DeviceTriggerSource.INSTANCE;
                    if (c21998a != null) {
                        triggerSource = c21998a.getTriggerSource();
                    } else {
                        triggerSource = null;
                    }
                    DeviceTriggerSource deviceTriggerSourceValueOfOrDefault = companion.valueOfOrDefault(triggerSource);
                    m22895c().mo85228t("Sending WM job - sync event to strap", new AbstractC30556a.a[0]);
                    strapSyncEventFlow = m20009u().getStrapSyncEventFlow();
                    aVar = new InterfaceC22876c.a(new C12360c(deviceTriggerSourceValueOfOrDefault, j15, 0L, 0L, 0, 0L, 60, null));
                    c6678l.f25537z = null;
                    c6678l.f25529E = c21998a;
                    c6678l.f25530F = null;
                    c6678l.f25534w = j14;
                    c6678l.f25535x = j13;
                    c6678l.f25536y = j15;
                    c6678l.f25533I = 4;
                    if (strapSyncEventFlow.emit(aVar, c6678l) != enumC31071a) {
                        j16 = j15;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                long j17 = c6678l.f25535x;
                jMillis = c6678l.f25534w;
                AbstractC34132o.m107864I(objM36575A2);
                j13 = j17;
                j14 = jMillis;
                c21998a = (C21998a) objM36575A2;
                if (c21998a != null) {
                    jMillis2 = c21998a.getTriggerTimestamp();
                } else {
                    jMillis2 = this.clock.millis();
                }
                j15 = jMillis2;
                DeviceTriggerSource.Companion companion2 = DeviceTriggerSource.INSTANCE;
                if (c21998a != null) {
                    triggerSource = c21998a.getTriggerSource();
                } else {
                    triggerSource = null;
                }
                DeviceTriggerSource deviceTriggerSourceValueOfOrDefault2 = companion2.valueOfOrDefault(triggerSource);
                m22895c().mo85228t("Sending WM job - sync event to strap", new AbstractC30556a.a[0]);
                strapSyncEventFlow = m20009u().getStrapSyncEventFlow();
                aVar = new InterfaceC22876c.a(new C12360c(deviceTriggerSourceValueOfOrDefault2, j15, 0L, 0L, 0, 0L, 60, null));
                c6678l.f25537z = null;
                c6678l.f25529E = c21998a;
                c6678l.f25530F = null;
                c6678l.f25534w = j14;
                c6678l.f25535x = j13;
                c6678l.f25536y = j15;
                c6678l.f25533I = 4;
                if (strapSyncEventFlow.emit(aVar, c6678l) != enumC31071a) {
                    j16 = j15;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A2);
                return objM36575A2;
            }
            j16 = c6678l.f25536y;
            j13 = c6678l.f25535x;
            j14 = c6678l.f25534w;
            c21998a = (C21998a) c6678l.f25529E;
            AbstractC34132o.m107864I(objM36575A2);
        }
        C13015a0 c13015a0 = new C13015a0(AbstractC13091v.m36589O(new C6677k(new C13052j1(m20009u().getSyncState(), new C6680n(null), 0), this, c21998a), this.workerTimeout), new C6681o(null));
        c6678l.f25537z = null;
        c6678l.f25529E = null;
        c6678l.f25530F = null;
        c6678l.f25534w = j14;
        c6678l.f25535x = j13;
        c6678l.f25536y = j16;
        c6678l.f25533I = 5;
        objM36575A = AbstractC13091v.m36575A(c13015a0, c6678l);
        if (objM36575A != enumC31071a) {
            return enumC31071a;
        }
        return objM36575A;
        Long l7 = (Long) ((AbstractC14134f) objM36575A2).mo40227b(f25473N);
        long jLongValue = l7 != null ? l7.longValue() : 0L;
        if (jLongValue > 0) {
            m22895c().mo85216g(AbstractC31061c.m95636l((jMillis - jLongValue) / ((long) DateTimeConstants.MILLIS_PER_MINUTE), "Time elapsed since last work call: ", " minutes"), new AbstractC30556a.a[0]);
        }
        InterfaceC0422g interfaceC0422gM20010v = m20010v();
        C6679m c6679m = new C6679m(jMillis, null);
        c6678l.f25537z = null;
        c6678l.f25534w = jMillis;
        c6678l.f25535x = jLongValue;
        c6678l.f25533I = 2;
        if (AbstractC17269i.m48861G(interfaceC0422gM20010v, c6679m, c6678l) != enumC31071a) {
            j7 = jLongValue;
            C22003f c22003fM20011w2 = m20011w();
            String string2 = getId().toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            c6678l.f25537z = null;
            c6678l.f25534w = jMillis;
            c6678l.f25535x = j7;
            c6678l.f25533I = 3;
            objM36575A2 = c22003fM20011w2.m62881c(string2, c6678l);
            if (objM36575A2 != enumC31071a) {
                j13 = j7;
                j14 = jMillis;
                c21998a = (C21998a) objM36575A2;
                if (c21998a != null) {
                    jMillis2 = c21998a.getTriggerTimestamp();
                } else {
                    jMillis2 = this.clock.millis();
                }
                j15 = jMillis2;
                DeviceTriggerSource.Companion companion3 = DeviceTriggerSource.INSTANCE;
                if (c21998a != null) {
                    triggerSource = c21998a.getTriggerSource();
                } else {
                    triggerSource = null;
                }
                DeviceTriggerSource deviceTriggerSourceValueOfOrDefault3 = companion3.valueOfOrDefault(triggerSource);
                m22895c().mo85228t("Sending WM job - sync event to strap", new AbstractC30556a.a[0]);
                strapSyncEventFlow = m20009u().getStrapSyncEventFlow();
                aVar = new InterfaceC22876c.a(new C12360c(deviceTriggerSourceValueOfOrDefault3, j15, 0L, 0L, 0, 0L, 60, null));
                c6678l.f25537z = null;
                c6678l.f25529E = c21998a;
                c6678l.f25530F = null;
                c6678l.f25534w = j14;
                c6678l.f25535x = j13;
                c6678l.f25536y = j15;
                c6678l.f25533I = 4;
                if (strapSyncEventFlow.emit(aVar, c6678l) != enumC31071a) {
                    j16 = j15;
                    C13015a0 c13015a1 = new C13015a0(AbstractC13091v.m36589O(new C6677k(new C13052j1(m20009u().getSyncState(), new C6680n(null), 0), this, c21998a), this.workerTimeout), new C6681o(null));
                    c6678l.f25537z = null;
                    c6678l.f25529E = null;
                    c6678l.f25530F = null;
                    c6678l.f25534w = j14;
                    c6678l.f25535x = j13;
                    c6678l.f25536y = j16;
                    c6678l.f25533I = 5;
                    objM36575A = AbstractC13091v.m36575A(c13015a1, c6678l);
                    if (objM36575A != enumC31071a) {
                        return objM36575A;
                    }
                }
            }
        }
        return enumC31071a;
    }
}
