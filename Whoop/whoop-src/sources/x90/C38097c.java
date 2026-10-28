package x90;

import com.whoop.activitysession.PauseSegment;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0012BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b!\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b)\u0010\u0015R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b%\u0010+¨\u0006,"}, m65681d2 = {"Lx90/c;", "", "", "id", "", "activitySessionId", "state", "selectedActivityInternalName", "", "gpsTrackingEnabled", "", "startTimeMs", "resumeNavigationJson", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/util/List;)V", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/util/List;)Lx90/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "Ljava/lang/String;", "c", "j", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "f", "J", "i", "()J", "g", "Ljava/util/List;", "()Ljava/util/List;", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38097c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String activitySessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedActivityInternalName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean gpsTrackingEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long startTimeMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String resumeNavigationJson;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<PauseSegment> pauseSegments;

    public C38097c(int i13, String activitySessionId, String state, String selectedActivityInternalName, boolean z4, long j7, String str, List<PauseSegment> pauseSegments) {
        AbstractC22676k.m65750j(activitySessionId, "activitySessionId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        this.id = i13;
        this.activitySessionId = activitySessionId;
        this.state = state;
        this.selectedActivityInternalName = selectedActivityInternalName;
        this.gpsTrackingEnabled = z4;
        this.startTimeMs = j7;
        this.resumeNavigationJson = str;
        this.pauseSegments = pauseSegments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38097c m122055b(C38097c c38097c, int i13, String str, String str2, String str3, boolean z4, long j7, String str4, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c38097c.id;
        }
        if ((i14 & 2) != 0) {
            str = c38097c.activitySessionId;
        }
        if ((i14 & 4) != 0) {
            str2 = c38097c.state;
        }
        if ((i14 & 8) != 0) {
            str3 = c38097c.selectedActivityInternalName;
        }
        if ((i14 & 16) != 0) {
            z4 = c38097c.gpsTrackingEnabled;
        }
        if ((i14 & 32) != 0) {
            j7 = c38097c.startTimeMs;
        }
        if ((i14 & 64) != 0) {
            str4 = c38097c.resumeNavigationJson;
        }
        if ((i14 & 128) != 0) {
            list = c38097c.pauseSegments;
        }
        long j13 = j7;
        String str5 = str3;
        boolean z13 = z4;
        String str6 = str2;
        return c38097c.m122056a(i13, str, str6, str5, z13, j13, str4, list);
    }

    /* JADX INFO: renamed from: a */
    public final C38097c m122056a(int id4, String activitySessionId, String state, String selectedActivityInternalName, boolean gpsTrackingEnabled, long startTimeMs, String resumeNavigationJson, List<PauseSegment> pauseSegments) {
        AbstractC22676k.m65750j(activitySessionId, "activitySessionId");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        return new C38097c(id4, activitySessionId, state, selectedActivityInternalName, gpsTrackingEnabled, startTimeMs, resumeNavigationJson, pauseSegments);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivitySessionId() {
        return this.activitySessionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38097c)) {
            return false;
        }
        C38097c c38097c = (C38097c) other;
        return this.id == c38097c.id && AbstractC22676k.m65745e(this.activitySessionId, c38097c.activitySessionId) && AbstractC22676k.m65745e(this.state, c38097c.state) && AbstractC22676k.m65745e(this.selectedActivityInternalName, c38097c.selectedActivityInternalName) && this.gpsTrackingEnabled == c38097c.gpsTrackingEnabled && this.startTimeMs == c38097c.startTimeMs && AbstractC22676k.m65745e(this.resumeNavigationJson, c38097c.resumeNavigationJson) && AbstractC22676k.m65745e(this.pauseSegments, c38097c.pauseSegments);
    }

    /* JADX INFO: renamed from: f */
    public final List<PauseSegment> m122060f() {
        return this.pauseSegments;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getResumeNavigationJson() {
        return this.resumeNavigationJson;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.activitySessionId), 31, this.state), 31, this.selectedActivityInternalName), 31, this.gpsTrackingEnabled), this.startTimeMs, 31);
        String str = this.resumeNavigationJson;
        return this.pauseSegments.hashCode() + ((iM30451e + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.activitySessionId;
        String str2 = this.state;
        String str3 = this.selectedActivityInternalName;
        boolean z4 = this.gpsTrackingEnabled;
        long j7 = this.startTimeMs;
        String str4 = this.resumeNavigationJson;
        List<PauseSegment> list = this.pauseSegments;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ActiveActivitySessionEntity(id=", ", activitySessionId=", str, ", state=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", selectedActivityInternalName=", str3, ", gpsTrackingEnabled=");
        sbM53373n.append(z4);
        sbM53373n.append(", startTimeMs=");
        sbM53373n.append(j7);
        sbM53373n.append(", resumeNavigationJson=");
        sbM53373n.append(str4);
        sbM53373n.append(", pauseSegments=");
        sbM53373n.append(list);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ C38097c(int i13, String str, String str2, String str3, boolean z4, long j7, String str4, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, str, str2, str3, z4, j7, str4, (i14 & 128) != 0 ? C25271y.f99162w : list);
    }
}
