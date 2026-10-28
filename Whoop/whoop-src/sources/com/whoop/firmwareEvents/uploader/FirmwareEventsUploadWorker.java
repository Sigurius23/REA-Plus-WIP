package com.whoop.firmwareEvents.uploader;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.metrics.worker.BaseReportingWorker;
import fg1.C14456b;
import fi0.InterfaceC14515a;
import hg1.InterfaceC17256a;
import hg1.InterfaceC17258c;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
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
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.C35953c;
import xf3.C38266c;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "success", "Landroid/content/SharedPreferences;", "sharedPrefs", "", "noOfEvents", "Ll83/a0;", "l", "(ZLandroid/content/SharedPreferences;I)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "z", "a", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FirmwareEventsUploadWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;", "", "<init>", "()V", "Lic/e;", "b", "()Lic/e;", "Lic/k0;", "c", "()Lic/k0;", "Lic/p0;", "workManager", "Lic/e0;", "a", "(Lic/p0;)Lic/e0;", "", "FwEventsSharedPreferencesName", "Ljava/lang/String;", "FwEventsSharedPrefsKoinScopeName", "FwEventsLastAttemptMillis", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final C18354e m21427b() {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        }

        /* JADX INFO: renamed from: c */
        private final C18367k0 m21428c() {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(FirmwareEventsUploadWorker.class, 900000L, timeUnit).m52880f(m21427b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC18355e0 m21429a(AbstractC18377p0 workManager) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.mo52875d("PERIODIC_STRAP_FW_EVENTS_UPLOADER", EnumC18366k.f71499w, m21428c());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker", m100430f = "FirmwareEventsUploadWorker.kt", m100431l = {36}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8738b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f26010w;

        /* JADX INFO: renamed from: y */
        int f26012y;

        public C8738b(InterfaceC30057d<? super C8738b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26010w = obj;
            this.f26012y |= Integer.MIN_VALUE;
            return FirmwareEventsUploadWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker$c */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.FirmwareEventsUploadWorker$work$2", m100430f = "FirmwareEventsUploadWorker.kt", m100431l = {39, 41, 47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lic/u;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lbc3/c0;)Lic/u;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8739c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f26013E;

        /* JADX INFO: renamed from: w */
        Object f26015w;

        /* JADX INFO: renamed from: x */
        Object f26016x;

        /* JADX INFO: renamed from: y */
        Object f26017y;

        /* JADX INFO: renamed from: z */
        boolean f26018z;

        public C8739c(InterfaceC30057d<? super C8739c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return FirmwareEventsUploadWorker.this.new C8739c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
            return ((C8739c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x008e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC17258c interfaceC17258c;
            SharedPreferences sharedPreferences;
            InterfaceC17258c interfaceC17258c2;
            C14456b c14456b;
            boolean zBooleanValue;
            C8739c c8739c;
            boolean z4;
            Object c18382s;
            long oldestTimestamp;
            long newestTimestamp;
            SharedPreferences sharedPreferences2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26013E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                FirmwareEventsUploadWorker firmwareEventsUploadWorker = FirmwareEventsUploadWorker.this;
                C35953c c35953c = new C35953c("fw-events-shared-prefs-koin");
                C38266c c38266c = firmwareEventsUploadWorker.getKoin().f106046a.f159364d;
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                SharedPreferences sharedPreferences3 = (SharedPreferences) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(SharedPreferences.class), c35953c);
                interfaceC17258c = (InterfaceC17258c) FirmwareEventsUploadWorker.this.getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17258c.class), null);
                this.f26015w = sharedPreferences3;
                this.f26016x = interfaceC17258c;
                this.f26013E = 1;
                Object objMo48838b = interfaceC17258c.mo48838b(this);
                if (objMo48838b != enumC31071a) {
                    sharedPreferences = sharedPreferences3;
                    obj = objMo48838b;
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                interfaceC17258c = (InterfaceC17258c) this.f26016x;
                sharedPreferences = (SharedPreferences) this.f26015w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 == 2) {
                    c14456b = (C14456b) this.f26017y;
                    InterfaceC17258c interfaceC17258c3 = (InterfaceC17258c) this.f26016x;
                    sharedPreferences = (SharedPreferences) this.f26015w;
                    AbstractC34132o.m107864I(obj);
                    interfaceC17258c2 = interfaceC17258c3;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    c14456b.getFileToBeUploaded().delete();
                    if (zBooleanValue) {
                        oldestTimestamp = c14456b.getOldestTimestamp();
                        newestTimestamp = c14456b.getNewestTimestamp();
                        this.f26015w = sharedPreferences;
                        this.f26016x = null;
                        this.f26017y = c14456b;
                        this.f26018z = zBooleanValue;
                        this.f26013E = 3;
                        c8739c = this;
                        if (interfaceC17258c2.mo48837a(oldestTimestamp, newestTimestamp, c8739c) != enumC31071a) {
                            z4 = zBooleanValue;
                            sharedPreferences2 = sharedPreferences;
                        }
                        return enumC31071a;
                    }
                    c8739c = this;
                    z4 = zBooleanValue;
                    c18382s = new C18382s();
                    FirmwareEventsUploadWorker.this.m21426l(z4, sharedPreferences, c14456b.getNoOfEvents());
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("fw-events-last-attempt-upload-millis", DateTime.now(DateTimeZone.UTC).getMillis());
                    editorEdit.apply();
                    return c18382s;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f26018z;
                c14456b = (C14456b) this.f26017y;
                sharedPreferences2 = (SharedPreferences) this.f26015w;
                AbstractC34132o.m107864I(obj);
                c8739c = this;
            }
            c18382s = AbstractC18386u.m52885b();
            sharedPreferences = sharedPreferences2;
            FirmwareEventsUploadWorker.this.m21426l(z4, sharedPreferences, c14456b.getNoOfEvents());
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putLong("fw-events-last-attempt-upload-millis", DateTime.now(DateTimeZone.UTC).getMillis());
            editorEdit2.apply();
            return c18382s;
            C14456b c14456b2 = (C14456b) obj;
            if (c14456b2 == null) {
                return AbstractC18386u.m52885b();
            }
            InterfaceC17256a interfaceC17256a = (InterfaceC17256a) FirmwareEventsUploadWorker.this.getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17256a.class), null);
            this.f26015w = sharedPreferences;
            this.f26016x = interfaceC17258c;
            this.f26017y = c14456b2;
            this.f26013E = 2;
            Object objMo48833a = interfaceC17256a.mo48833a(c14456b2, this);
            if (objMo48833a != enumC31071a) {
                interfaceC17258c2 = interfaceC17258c;
                c14456b = c14456b2;
                obj = objMo48833a;
                zBooleanValue = ((Boolean) obj).booleanValue();
                c14456b.getFileToBeUploaded().delete();
                if (zBooleanValue) {
                    oldestTimestamp = c14456b.getOldestTimestamp();
                    newestTimestamp = c14456b.getNewestTimestamp();
                    this.f26015w = sharedPreferences;
                    this.f26016x = null;
                    this.f26017y = c14456b;
                    this.f26018z = zBooleanValue;
                    this.f26013E = 3;
                    c8739c = this;
                    if (interfaceC17258c2.mo48837a(oldestTimestamp, newestTimestamp, c8739c) != enumC31071a) {
                        z4 = zBooleanValue;
                        sharedPreferences2 = sharedPreferences;
                        c18382s = AbstractC18386u.m52885b();
                        sharedPreferences = sharedPreferences2;
                    }
                } else {
                    c8739c = this;
                    z4 = zBooleanValue;
                    c18382s = new C18382s();
                }
                FirmwareEventsUploadWorker.this.m21426l(z4, sharedPreferences, c14456b.getNoOfEvents());
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                editorEdit3.putLong("fw-events-last-attempt-upload-millis", DateTime.now(DateTimeZone.UTC).getMillis());
                editorEdit3.apply();
                return c18382s;
            }
            return enumC31071a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareEventsUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PERIODIC_STRAP_FW_EVENTS_UPLOADER";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m21426l(boolean success, SharedPreferences sharedPrefs, int noOfEvents) {
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        long j7 = sharedPrefs.getLong("fw-events-last-attempt-upload-millis", 0L);
        interfaceC14515a.mo41428k("Connectivity", success ? EnumC39339b.RESULT_SUCCESS : "Fail", null, "Upload FW Events to API", AbstractC25247g0.m73990Y(new C23465k("Frequency", Long.valueOf(j7 != 0 ? (DateTime.now(DateTimeZone.UTC).getMillis() - j7) / ((long) DateTimeConstants.MILLIS_PER_MINUTE) : 0L)), new C23465k("Events Count", Integer.valueOf(noOfEvents))));
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
        C8738b c8738b;
        if (interfaceC30057d instanceof C8738b) {
            c8738b = (C8738b) interfaceC30057d;
            int i13 = c8738b.f26012y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c8738b.f26012y = i13 - Integer.MIN_VALUE;
            } else {
                c8738b = new C8738b(interfaceC30057d);
            }
        } else {
            c8738b = new C8738b(interfaceC30057d);
        }
        Object objM8705K = c8738b.f26010w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c8738b.f26012y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063jMo54465b = ((InterfaceC18732d) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18732d.class), null)).mo54465b();
            C8739c c8739c = new C8739c(null);
            c8738b.f26012y = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, c8739c, c8738b);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        AbstractC22676k.m65749i(objM8705K, "withContext(...)");
        return objM8705K;
    }
}
