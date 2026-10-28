package r82;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import com.mapbox.common.logger.LogPriority;
import com.whoop.metrics.domain.models.MetricPostType;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.io.File;
import jy1.C22047a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32975s;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: r82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0002!#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*¨\u0006+"}, m65681d2 = {"Lr82/a;", "", "Ltr2/n;", "logger", "Liy1/c;", "metricWriter", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lbc3/c0;", "coroutineScope", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "<init>", "(Ltr2/n;Liy1/c;Landroid/net/ConnectivityManager;Lbc3/c0;Lca2/h;Lst0/r;)V", "", "throughputBytesPerSecond", "", "networkType", "Ll83/a0;", "g", "(ILjava/lang/String;)V", "f", "()Ljava/lang/String;", "Ljava/io/File;", "exportedFile", "Lr82/a$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/io/File;)Lr82/a$b;", "session", "e", "(Lr82/a$b;)V", "a", "Ltr2/n;", "b", "Liy1/c;", "c", "Landroid/net/ConnectivityManager;", "d", "Lbc3/c0;", "Lca2/h;", "Lst0/r;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31070a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: r82.a$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lr82/a$b;", "", "", "startTime", "fileSize", "", "networkType", "<init>", "(JJLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long fileSize;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String networkType;

        public b(long j7, long j13, String networkType) {
            AbstractC22676k.m65750j(networkType, "networkType");
            this.startTime = j7;
            this.fileSize = j13;
            this.networkType = networkType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getFileSize() {
            return this.fileSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNetworkType() {
            return this.networkType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.startTime == bVar.startTime && this.fileSize == bVar.fileSize && AbstractC22676k.m65745e(this.networkType, bVar.networkType);
        }

        public int hashCode() {
            return this.networkType.hashCode() + AbstractC11266d.m30451e(Long.hashCode(this.startTime) * 31, this.fileSize, 31);
        }

        public String toString() {
            long j7 = this.startTime;
            long j13 = this.fileSize;
            String str = this.networkType;
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "UploadSession(startTime=", ", fileSize=");
            sbM125596b.append(j13);
            sbM125596b.append(", networkType=");
            sbM125596b.append(str);
            sbM125596b.append(")");
            return sbM125596b.toString();
        }
    }

    /* JADX INFO: renamed from: r82.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.throughput.SensorDataUploadThroughputTracker$sendThroughputMetric$1", m100430f = "SensorDataUploadThroughputTracker.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f128107F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f128108G;

        /* JADX INFO: renamed from: w */
        boolean f128109w;

        /* JADX INFO: renamed from: x */
        Object f128110x;

        /* JADX INFO: renamed from: y */
        Object f128111y;

        /* JADX INFO: renamed from: z */
        int f128112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128107F = str;
            this.f128108G = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31070a.this.new c(this.f128107F, this.f128108G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128112z;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    boolean zMo13761c = C31070a.this.rawDataTrackingService.mo13761c();
                    C22047a c22047a = new C22047a(0, "mobile.cloud.data_upload.throughput", new Double(this.f128108G), AbstractC37056f.m118959K(AbstractC11266d.m30461o("network_type:", this.f128107F), AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", zMo13761c), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(C31070a.this.strapLockStateTracker))), MetricPostType.DISTRIBUTION, 1, null);
                    InterfaceC21030c interfaceC21030c = C31070a.this.metricWriter;
                    this.f128110x = null;
                    this.f128111y = null;
                    this.f128109w = zMo13761c;
                    this.f128112z = 1;
                    if (interfaceC21030c.mo58700a(c22047a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C31070a.this.logger.mo85228t("Sent throughput metric: " + this.f128108G + " bytes/sec, network: " + this.f128107F, new AbstractC30556a.a[0]);
            } catch (Exception e5) {
                C31070a.this.logger.mo85230v("Failed to send throughput metric", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C31070a(InterfaceC34116n logger, InterfaceC21030c metricWriter, ConnectivityManager connectivityManager, InterfaceC2994c0 coroutineScope, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(connectivityManager, "connectivityManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        this.logger = logger;
        this.metricWriter = metricWriter;
        this.connectivityManager = connectivityManager;
        this.coroutineScope = coroutineScope;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    private final String m95715f() {
        try {
            NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "unknown";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to determine network type", e5, new AbstractC30556a.a[0]);
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m95716g(int throughputBytesPerSecond, String networkType) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(networkType, throughputBytesPerSecond, null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m95717e(b session) {
        AbstractC22676k.m65750j(session, "session");
        double dCurrentTimeMillis = (System.currentTimeMillis() - session.getStartTime()) / 1000.0d;
        if (dCurrentTimeMillis <= 0.0d) {
            this.logger.mo85226q("Upload duration was 0 or negative, skipping throughput calculation", new AbstractC30556a.a[0]);
            return;
        }
        double fileSize = session.getFileSize() / dCurrentTimeMillis;
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(session.getFileSize(), "Upload completed - Size: ", " bytes, Duration: ");
        sbM125596b.append(dCurrentTimeMillis);
        sbM125596b.append("s, Throughput: ");
        sbM125596b.append(fileSize);
        sbM125596b.append(" bytes/sec");
        interfaceC34116n.mo85216g(sbM125596b.toString(), new AbstractC30556a.a[0]);
        m95716g(AbstractC12889b.m36257W(fileSize), session.getNetworkType());
    }

    /* JADX INFO: renamed from: h */
    public final b m95718h(File exportedFile) {
        AbstractC22676k.m65750j(exportedFile, "exportedFile");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long length = exportedFile.length();
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("Starting upload tracking for file: ", exportedFile.getName(), length, ", size: ");
        sbM32000s.append(" bytes");
        interfaceC34116n.mo85228t(sbM32000s.toString(), new AbstractC30556a.a[0]);
        return new b(jCurrentTimeMillis, length, m95715f());
    }
}
