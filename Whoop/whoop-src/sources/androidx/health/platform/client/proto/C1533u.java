package androidx.health.platform.client.proto;

import androidx.profileinstaller.ProfileVerifier;
import java.util.Collections;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C1533u extends AbstractC1534u0 {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final C1533u DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    private C1493m avg_;
    private int bitField0_;
    private String clientId_;
    private long clientVersion_;
    private C1503o dataOrigin_;
    private C1543w dataType_;
    private C1552y device_;
    private long endTimeMillis_;
    private int endZoneOffsetSeconds_;
    private long instantTimeMillis_;
    private C1493m max_;
    private C1493m min_;
    private String originSampleUid_;
    private String originSeriesUid_;
    private int recordingMethod_;
    private InterfaceC1544w0 seriesValues_;
    private long startTimeMillis_;
    private int startZoneOffsetSeconds_;
    private C1480j1 subTypeDataLists_;
    private String uid_;
    private long updateTimeMillis_;
    private C1480j1 values_;
    private int zoneOffsetSeconds_;

    static {
        C1533u c1533u = new C1533u();
        DEFAULT_INSTANCE = c1533u;
        AbstractC1534u0.m4869n(C1533u.class, c1533u);
    }

    public C1533u() {
        C1480j1 c1480j1 = C1480j1.f6054x;
        this.values_ = c1480j1;
        this.subTypeDataLists_ = c1480j1;
        this.uid_ = "";
        this.originSeriesUid_ = "";
        this.clientId_ = "";
        this.originSampleUid_ = "";
        this.seriesValues_ = C1558z1.f6168z;
    }

    /* JADX INFO: renamed from: A */
    public static void m4822A(C1533u c1533u, long j7) {
        c1533u.bitField0_ |= 128;
        c1533u.startTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: B */
    public static void m4823B(C1533u c1533u, long j7) {
        c1533u.bitField0_ |= 256;
        c1533u.endTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: C */
    public static void m4824C(C1533u c1533u, String str) {
        c1533u.getClass();
        str.getClass();
        c1533u.bitField0_ |= 512;
        c1533u.clientId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m4825D(C1533u c1533u, long j7) {
        c1533u.bitField0_ |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        c1533u.clientVersion_ = j7;
    }

    /* JADX INFO: renamed from: E */
    public static void m4826E(C1533u c1533u, C1552y c1552y) {
        c1533u.getClass();
        c1533u.device_ = c1552y;
        c1533u.bitField0_ |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
    }

    /* JADX INFO: renamed from: F */
    public static void m4827F(C1533u c1533u, C1439b0 c1439b0) {
        c1533u.getClass();
        c1439b0.getClass();
        InterfaceC1544w0 interfaceC1544w0 = c1533u.seriesValues_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1533u.seriesValues_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        c1533u.seriesValues_.add(c1439b0);
    }

    /* JADX INFO: renamed from: K */
    public static C1533u m4828K() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static C1508p m4829e0() {
        return (C1508p) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: p */
    public static void m4830p(C1533u c1533u, int i13) {
        c1533u.bitField0_ |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        c1533u.startZoneOffsetSeconds_ = i13;
    }

    /* JADX INFO: renamed from: q */
    public static void m4831q(C1533u c1533u, int i13) {
        c1533u.bitField0_ |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        c1533u.endZoneOffsetSeconds_ = i13;
    }

    /* JADX INFO: renamed from: r */
    public static C1480j1 m4832r(C1533u c1533u) {
        C1480j1 c1480j1 = c1533u.subTypeDataLists_;
        if (!c1480j1.f6055w) {
            c1533u.subTypeDataLists_ = c1480j1.m4652c();
        }
        return c1533u.subTypeDataLists_;
    }

    /* JADX INFO: renamed from: s */
    public static void m4833s(C1533u c1533u, int i13) {
        c1533u.bitField0_ |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        c1533u.recordingMethod_ = i13;
    }

    /* JADX INFO: renamed from: t */
    public static void m4834t(C1533u c1533u, C1543w c1543w) {
        c1533u.getClass();
        c1533u.dataType_ = c1543w;
        c1533u.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: u */
    public static C1480j1 m4835u(C1533u c1533u) {
        C1480j1 c1480j1 = c1533u.values_;
        if (!c1480j1.f6055w) {
            c1533u.values_ = c1480j1.m4652c();
        }
        return c1533u.values_;
    }

    /* JADX INFO: renamed from: v */
    public static void m4836v(C1533u c1533u, String str) {
        c1533u.getClass();
        str.getClass();
        c1533u.bitField0_ |= 2;
        c1533u.uid_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m4837w(C1533u c1533u, C1503o c1503o) {
        c1533u.getClass();
        c1533u.dataOrigin_ = c1503o;
        c1533u.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: x */
    public static void m4838x(C1533u c1533u, int i13) {
        c1533u.bitField0_ |= 16;
        c1533u.zoneOffsetSeconds_ = i13;
    }

    /* JADX INFO: renamed from: y */
    public static void m4839y(C1533u c1533u, long j7) {
        c1533u.bitField0_ |= 32;
        c1533u.updateTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: z */
    public static void m4840z(C1533u c1533u, long j7) {
        c1533u.bitField0_ |= 64;
        c1533u.instantTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: G */
    public final String m4841G() {
        return this.clientId_;
    }

    /* JADX INFO: renamed from: H */
    public final long m4842H() {
        return this.clientVersion_;
    }

    /* JADX INFO: renamed from: I */
    public final C1503o m4843I() {
        C1503o c1503o = this.dataOrigin_;
        return c1503o == null ? C1503o.m4735r() : c1503o;
    }

    /* JADX INFO: renamed from: J */
    public final C1543w m4844J() {
        C1543w c1543w = this.dataType_;
        return c1543w == null ? C1543w.m4920q() : c1543w;
    }

    /* JADX INFO: renamed from: L */
    public final C1552y m4845L() {
        C1552y c1552y = this.device_;
        return c1552y == null ? C1552y.m4939s() : c1552y;
    }

    /* JADX INFO: renamed from: M */
    public final long m4846M() {
        return this.endTimeMillis_;
    }

    /* JADX INFO: renamed from: N */
    public final int m4847N() {
        return this.endZoneOffsetSeconds_;
    }

    /* JADX INFO: renamed from: O */
    public final long m4848O() {
        return this.instantTimeMillis_;
    }

    /* JADX INFO: renamed from: P */
    public final int m4849P() {
        return this.recordingMethod_;
    }

    /* JADX INFO: renamed from: Q */
    public final InterfaceC1544w0 m4850Q() {
        return this.seriesValues_;
    }

    /* JADX INFO: renamed from: R */
    public final long m4851R() {
        return this.startTimeMillis_;
    }

    /* JADX INFO: renamed from: S */
    public final int m4852S() {
        return this.startZoneOffsetSeconds_;
    }

    /* JADX INFO: renamed from: T */
    public final Map m4853T() {
        return Collections.unmodifiableMap(this.subTypeDataLists_);
    }

    /* JADX INFO: renamed from: U */
    public final String m4854U() {
        return this.uid_;
    }

    /* JADX INFO: renamed from: V */
    public final long m4855V() {
        return this.updateTimeMillis_;
    }

    /* JADX INFO: renamed from: W */
    public final Map m4856W() {
        return Collections.unmodifiableMap(this.values_);
    }

    /* JADX INFO: renamed from: X */
    public final int m4857X() {
        return this.zoneOffsetSeconds_;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m4858Y() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m4859Z() {
        return (this.bitField0_ & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m4860a0() {
        return (this.bitField0_ & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m4861b0() {
        return (this.bitField0_ & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m4862c0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m4863d0() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1534u0
    /* JADX INFO: renamed from: e */
    public final Object mo4573e(int i13) {
        InterfaceC1525s1 c1529t0;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001ဉ\u0000\u00022\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bဈ\t\fဂ\n\rဉ\u000b\u000eဈ\f\u000f\u001b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014င\u0011\u00162\u0017င\u0012", new Object[]{"bitField0_", "dataType_", "values_", AbstractC1528t.f6115a, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", C1439b0.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", AbstractC1523s.f6112a, "recordingMethod_"});
            case 3:
                return new C1533u();
            case 4:
                return new C1508p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1533u.class) {
                    try {
                        c1529t0 = PARSER;
                        if (c1529t0 == null) {
                            c1529t0 = new C1529t0();
                            PARSER = c1529t0;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1529t0;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
