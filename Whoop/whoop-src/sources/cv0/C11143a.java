package cv0;

import bc3.InterfaceC2994c0;
import ci2.InterfaceC4733b;
import dv0.C12384b;
import fy1.InterfaceC14871g;
import jt0.EnumC21935b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import yu0.EnumC39789f;

/* JADX INFO: renamed from: cv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcv0/a;", "", "Lci2/b;", "whoopStrapProvider", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "coroutineScope", "Lfy1/g;", "nanoClock", "<init>", "(Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V", "Lyu0/f;", "realTimePacketType", "Ldv0/b;", "b", "(Lyu0/f;)Ldv0/b;", "Ljt0/b;", "packetType", "a", "(Ljt0/b;)Ldv0/b;", "Lci2/b;", "Lrr2/c;", "c", "Lbc3/c0;", "d", "Lfy1/g;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11143a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: cv0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35600a;

        static {
            int[] iArr = new int[EnumC21935b.values().length];
            try {
                iArr[EnumC21935b.REALTIME_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21935b.REALTIME_OPTICAL_R20_MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21935b.REALTIME_IMU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21935b.REALTIME_R10.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21935b.REALTIME_R11.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC21935b.REALTIME_FILTERED_ECG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f35600a = iArr;
        }
    }

    public C11143a(InterfaceC4733b whoopStrapProvider, InterfaceC31766c crashReporter, InterfaceC2994c0 coroutineScope, InterfaceC14871g nanoClock) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        this.whoopStrapProvider = whoopStrapProvider;
        this.crashReporter = crashReporter;
        this.coroutineScope = coroutineScope;
        this.nanoClock = nanoClock;
    }

    /* JADX INFO: renamed from: b */
    private final C12384b m30108b(EnumC39789f realTimePacketType) {
        return new C12384b(InterfaceC34116n.INSTANCE.m107848a("RealtimeGapDetector"), realTimePacketType, this.whoopStrapProvider, this.crashReporter, this.coroutineScope, this.nanoClock);
    }

    /* JADX INFO: renamed from: a */
    public final C12384b m30109a(EnumC21935b packetType) {
        AbstractC22676k.m65750j(packetType, "packetType");
        switch (a.f35600a[packetType.ordinal()]) {
            case 1:
                return m30108b(EnumC39789f.HR);
            case 2:
                return m30108b(EnumC39789f.R20);
            case 3:
                return m30108b(EnumC39789f.IMU);
            case 4:
                return m30108b(EnumC39789f.R10);
            case 5:
                return m30108b(EnumC39789f.R11);
            case 6:
                return m30108b(EnumC39789f.FILTERED_ECG);
            default:
                throw new IllegalArgumentException("Wrong function called to generate Realtime Gap Detector");
        }
    }
}
