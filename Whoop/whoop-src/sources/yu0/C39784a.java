package yu0;

import com.whoop.data.repositories.FeatureFlagChecker;
import cv0.C11143a;
import dv0.AbstractC12385c;
import dv0.InterfaceC12383a;
import ev0.C13680b;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jt0.EnumC21935b;
import jt0.InterfaceC21934a;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.AbstractC28209v1;
import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: yu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001d\u001a\u00020\u00122\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00122\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u00107¨\u00069"}, m65681d2 = {"Lyu0/a;", "Ljt0/a;", "Ltr2/n;", "logger", "Lfi0/a;", "baseAnalytics", "Lev0/b;", "strapDisconnectMonitor", "Lzr2/a;", "dateAndTimeProvider", "Lcv0/a;", "gapDetectorFactory", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltr2/n;Lfi0/a;Lev0/b;Lzr2/a;Lcv0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "featureName", "Ll83/a0;", "c", "(Ljava/lang/String;)V", "", "f", "()Ljava/util/Map;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "Ljt0/b;", "packetTypes", "d", "([Ljt0/b;)V", "b", "a", "Ltr2/n;", "Lfi0/a;", "Lev0/b;", "Lzr2/a;", "e", "Lcv0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "Lyu0/f;", "Ldv0/a;", "", "Ljava/util/Map;", "realTimeGapDetectors", "", "J", "startTimeMillis", "i", "endTimeMillis", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSessionActive", "()D", "durationInMins", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39784a implements InterfaceC21934a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13680b strapDisconnectMonitor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C11143a gapDetectorFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<EnumC39789f, InterfaceC12383a<Double>> realTimeGapDetectors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long startTimeMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long endTimeMillis;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AtomicBoolean isSessionActive;

    /* JADX INFO: renamed from: yu0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171391a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f171392b;

        static {
            int[] iArr = new int[EnumC39789f.values().length];
            try {
                iArr[EnumC39789f.HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39789f.R20.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39789f.IMU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39789f.R10.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC39789f.R11.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC39789f.FILTERED_ECG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f171391a = iArr;
            int[] iArr2 = new int[EnumC21935b.values().length];
            try {
                iArr2[EnumC21935b.HISTORICAL_R10.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_R11.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_R12.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_RAW_ECG.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_OPTICAL_R20_MAVERICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_IMU.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC21935b.HISTORICAL_METRICS_R24_HARVARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_HR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_OPTICAL_R20_MAVERICK.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_IMU.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_R10.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_R11.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC21935b.REALTIME_FILTERED_ECG.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            f171392b = iArr2;
        }
    }

    public C39784a(InterfaceC34116n logger, InterfaceC14515a baseAnalytics, C13680b strapDisconnectMonitor, InterfaceC41070a dateAndTimeProvider, C11143a gapDetectorFactory, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(strapDisconnectMonitor, "strapDisconnectMonitor");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(gapDetectorFactory, "gapDetectorFactory");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.logger = logger;
        this.baseAnalytics = baseAnalytics;
        this.strapDisconnectMonitor = strapDisconnectMonitor;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.gapDetectorFactory = gapDetectorFactory;
        this.featureFlagChecker = featureFlagChecker;
        this.realTimeGapDetectors = new LinkedHashMap();
        this.startTimeMillis = dateAndTimeProvider.mo133363b();
        this.endTimeMillis = dateAndTimeProvider.mo133363b();
        this.isSessionActive = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: c */
    private final void m127488c(String featureName) {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", null, null, "Connectivity Feature Performance", null, AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Feature", featureName), m127492g()), m127493h()), m127491f()), 22, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m127489d(EnumC21935b... packetTypes) {
        for (EnumC21935b enumC21935b : packetTypes) {
            switch (a.f171392b[enumC21935b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                    this.realTimeGapDetectors.put(EnumC39789f.HR, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                case 9:
                    this.realTimeGapDetectors.put(EnumC39789f.R20, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                case 10:
                    this.realTimeGapDetectors.put(EnumC39789f.IMU, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                case 11:
                    this.realTimeGapDetectors.put(EnumC39789f.R10, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                case 12:
                    this.realTimeGapDetectors.put(EnumC39789f.R11, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                case 13:
                    this.realTimeGapDetectors.put(EnumC39789f.FILTERED_ECG, this.gapDetectorFactory.m30109a(enumC21935b));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final double m127490e() {
        return AbstractC12385c.m34760a((this.endTimeMillis - this.startTimeMillis) / ((double) DateTimeConstants.MILLIS_PER_MINUTE));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:9:0x0032
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    private final java.util.Map<java.lang.String, java.lang.String> m127491f() {
        /*
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map<yu0.f, dv0.a<java.lang.Double>> r1 = r6.realTimeGapDetectors
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            yu0.f r3 = (yu0.EnumC39789f) r3
            int[] r4 = yu0.C39784a.a.f171391a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L32;
                case 4: goto L32;
                case 5: goto L32;
                case 6: goto L32;
                default: goto L2c;
            }
        L2c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L32:
            java.lang.Object r3 = r2.getKey()
            yu0.f r3 = (yu0.EnumC39789f) r3
            java.lang.String r3 = r3.getLabel()
            java.lang.String r4 = " Packet Published"
            java.lang.String r3 = p031b9.AbstractC2875y.m8299l(r3, r4)
            java.lang.Object r4 = r2.getValue()
            dv0.a r4 = (dv0.InterfaceC12383a) r4
            int r4 = r4.mo34750e()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r3, r4)
            java.lang.Object r3 = r2.getKey()
            yu0.f r3 = (yu0.EnumC39789f) r3
            java.lang.String r3 = r3.getLabel()
            java.lang.String r4 = " Packet Total Lost Time (seconds)"
            java.lang.String r3 = p031b9.AbstractC2875y.m8299l(r3, r4)
            java.lang.Object r4 = r2.getValue()
            dv0.a r4 = (dv0.InterfaceC12383a) r4
            java.lang.Object r4 = r4.mo34746a()
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r3, r4)
            java.lang.Object r3 = r2.getValue()
            dv0.a r3 = (dv0.InterfaceC12383a) r3
            java.lang.Double r3 = r3.mo34748c()
            if (r3 == 0) goto Lf
            double r3 = r3.doubleValue()
            java.lang.Object r2 = r2.getKey()
            yu0.f r2 = (yu0.EnumC39789f) r2
            java.lang.String r2 = r2.getLabel()
            java.lang.String r5 = " Time To First Packet (seconds)"
            java.lang.String r2 = p031b9.AbstractC2875y.m8299l(r2, r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            goto Lf
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yu0.C39784a.m127491f():java.util.Map");
    }

    /* JADX INFO: renamed from: g */
    private final Map<String, String> m127492g() {
        return AbstractC25247g0.m73990Y(new C23465k("Start Timestamp", AbstractC28209v1.m85388b(this.startTimeMillis)), new C23465k("End Timestamp", AbstractC28209v1.m85388b(this.endTimeMillis)), new C23465k("Duration (mins)", String.valueOf(m127490e())));
    }

    /* JADX INFO: renamed from: h */
    private final Map<String, String> m127493h() {
        return AbstractC25247g0.m73990Y(new C23465k("Device Disconnected Count", String.valueOf(this.strapDisconnectMonitor.m38594f())), new C23465k("Duration Device Disconnected (seconds)", String.valueOf(AbstractC12385c.m34760a(this.strapDisconnectMonitor.m38593e() / ((double) 1000)))));
    }

    @Override // jt0.InterfaceC21934a
    /* JADX INFO: renamed from: a */
    public void mo62487a(String featureName) {
        AbstractC22676k.m65750j(featureName, "featureName");
        if (this.isSessionActive.getAndSet(false)) {
            this.strapDisconnectMonitor.m38592d();
            Iterator<Map.Entry<EnumC39789f, InterfaceC12383a<Double>>> it = this.realTimeGapDetectors.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().mo34747b();
            }
            this.endTimeMillis = this.dateAndTimeProvider.mo133363b();
            m127488c(featureName);
        }
    }

    @Override // jt0.InterfaceC21934a
    /* JADX INFO: renamed from: b */
    public void mo62488b(EnumC21935b... packetTypes) {
        AbstractC22676k.m65750j(packetTypes, "packetTypes");
        if (this.featureFlagChecker.isFeatureEnabled("droid-conn-feature-performance")) {
            if (packetTypes.length == 0) {
                throw new IllegalArgumentException("At least one packet type is required!");
            }
            if (this.isSessionActive.getAndSet(true)) {
                return;
            }
            this.strapDisconnectMonitor.m38595h();
            m127489d((EnumC21935b[]) Arrays.copyOf(packetTypes, packetTypes.length));
            Iterator<Map.Entry<EnumC39789f, InterfaceC12383a<Double>>> it = this.realTimeGapDetectors.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().mo34749d();
            }
            this.startTimeMillis = this.dateAndTimeProvider.mo133363b();
        }
    }
}
