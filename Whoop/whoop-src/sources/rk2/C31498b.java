package rk2;

import com.whoop.addactivity.network.CreateActivityPauseSegment;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, m65681d2 = {"Lrk2/b;", "", "", "id", "", "activityInternalName", "", "garmentId", "startTime", "endTime", "", "gpsEnabled", "", "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;", "pauseSegments", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "c", "I", "d", "g", "f", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31498b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String activityInternalName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int garmentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String endTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean gpsEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<CreateActivityPauseSegment> pauseSegments;

    public C31498b(long j7, String activityInternalName, int i13, String startTime, String endTime, boolean z4, List<CreateActivityPauseSegment> list) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.id = j7;
        this.activityInternalName = activityInternalName;
        this.garmentId = i13;
        this.startTime = startTime;
        this.endTime = endTime;
        this.gpsEnabled = z4;
        this.pauseSegments = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getGarmentId() {
        return this.garmentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31498b)) {
            return false;
        }
        C31498b c31498b = (C31498b) other;
        return this.id == c31498b.id && AbstractC22676k.m65745e(this.activityInternalName, c31498b.activityInternalName) && this.garmentId == c31498b.garmentId && AbstractC22676k.m65745e(this.startTime, c31498b.startTime) && AbstractC22676k.m65745e(this.endTime, c31498b.endTime) && this.gpsEnabled == c31498b.gpsEnabled && AbstractC22676k.m65745e(this.pauseSegments, c31498b.pauseSegments);
    }

    /* JADX INFO: renamed from: f */
    public final List<CreateActivityPauseSegment> m97045f() {
        return this.pauseSegments;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.garmentId, AbstractC11266d.m30450d(Long.hashCode(this.id) * 31, 31, this.activityInternalName), 31), 31, this.startTime), 31, this.endTime), 31, this.gpsEnabled);
        List<CreateActivityPauseSegment> list = this.pauseSegments;
        return iM8289b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        long j7 = this.id;
        String str = this.activityInternalName;
        int i13 = this.garmentId;
        String str2 = this.startTime;
        String str3 = this.endTime;
        boolean z4 = this.gpsEnabled;
        List<CreateActivityPauseSegment> list = this.pauseSegments;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("PendingActivitySave(id=", ", activityInternalName=", j7, str);
        sbM114685m.append(", garmentId=");
        sbM114685m.append(i13);
        sbM114685m.append(", startTime=");
        sbM114685m.append(str2);
        sbM114685m.append(", endTime=");
        sbM114685m.append(str3);
        sbM114685m.append(", gpsEnabled=");
        sbM114685m.append(z4);
        sbM114685m.append(", pauseSegments=");
        sbM114685m.append(list);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
