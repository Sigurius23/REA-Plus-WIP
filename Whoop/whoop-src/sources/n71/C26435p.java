package n71;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n71.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Ln71/p;", "", "<init>", "()V", "", "", "b", "Ljava/util/List;", "dataPoints", "Ln71/q;", "c", "Ln71/q;", "fakeHrZone0", "d", "fakeHrZone1", "e", "fakeHrZone2", "f", "fakeHrZone3", "g", "fakeHrZone4", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "fakeHrZone5", "i", "disconnected", "j", "getCalibrating", "()Ln71/q;", "calibrating", "k", "deviceOffBody", "l", "fwUpdateInProgress", "m", "a", "()Ljava/util/List;", "liveHrMonitorSamples", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26435p {

    /* JADX INFO: renamed from: a */
    public static final C26435p f104999a = new C26435p();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<Integer> dataPoints;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C26436q fakeHrZone0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C26436q fakeHrZone1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C26436q fakeHrZone2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C26436q fakeHrZone3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C26436q fakeHrZone4;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C26436q fakeHrZone5;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C26436q disconnected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C26436q calibrating;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C26436q deviceOffBody;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C26436q fwUpdateInProgress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final List<C26436q> liveHrMonitorSamples;

    /* JADX INFO: renamed from: n */
    public static final int f105012n;

    static {
        List<Integer> listM118959K = AbstractC37056f.m118959K(20, 30, 40, 50, 80, 90, 100, 120, 70, 100);
        dataPoints = listM118959K;
        C26436q c26436q = new C26436q(listM118959K, EnumC26437r.ZONE_0, 0, 4, null);
        fakeHrZone0 = c26436q;
        C26436q c26436q2 = new C26436q(listM118959K, EnumC26437r.ZONE_1, 0, 4, null);
        fakeHrZone1 = c26436q2;
        C26436q c26436q3 = new C26436q(listM118959K, EnumC26437r.ZONE_2, 0, 4, null);
        fakeHrZone2 = c26436q3;
        C26436q c26436q4 = new C26436q(listM118959K, EnumC26437r.ZONE_3, 0, 4, null);
        fakeHrZone3 = c26436q4;
        C26436q c26436q5 = new C26436q(listM118959K, EnumC26437r.ZONE_4, 0, 4, null);
        fakeHrZone4 = c26436q5;
        C26436q c26436q6 = new C26436q(listM118959K, EnumC26437r.ZONE_5, 0, 4, null);
        fakeHrZone5 = c26436q6;
        C26436q c26436q7 = new C26436q(null, EnumC26437r.DISCONNECTED, 0, 4, null);
        disconnected = c26436q7;
        C26436q c26436q8 = new C26436q(null, EnumC26437r.CALIBRATING, 0, 4, null);
        calibrating = c26436q8;
        C26436q c26436q9 = new C26436q(null, EnumC26437r.DEVICE_OFF_BODY, 0, 4, null);
        deviceOffBody = c26436q9;
        C26436q c26436q10 = new C26436q(null, EnumC26437r.FW_UPDATE_IN_PROGRESS, 0, 4, null);
        fwUpdateInProgress = c26436q10;
        liveHrMonitorSamples = AbstractC37056f.m118959K(c26436q, c26436q2, c26436q3, c26436q4, c26436q5, c26436q6, c26436q7, c26436q8, c26436q9, c26436q10);
        f105012n = 8;
    }

    private C26435p() {
    }

    /* JADX INFO: renamed from: a */
    public final List<C26436q> m78254a() {
        return liveHrMonitorSamples;
    }
}
