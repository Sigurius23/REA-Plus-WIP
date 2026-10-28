package x90;

import com.whoop.activitysession.PauseSegment;
import com.whoop.navigation.C9598e;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x90.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006*"}, m65681d2 = {"Lx90/d;", "", "", "selectedActivityInternalName", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "resumeSessionDestination", "Lx90/g;", "state", "", "startTimeMs", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "<init>", "(Ljava/lang/String;ZLcom/whoop/navigation/e;Lx90/g;JLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "()Z", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lx90/g;", "f", "()Lx90/g;", "e", "J", "()J", "Ljava/util/List;", "()Ljava/util/List;", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38098d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedActivityInternalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean gpsTrackingEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e resumeSessionDestination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38101g state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long startTimeMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<PauseSegment> pauseSegments;

    public C38098d(String selectedActivityInternalName, boolean z4, C9598e c9598e, EnumC38101g state, long j7, List<PauseSegment> pauseSegments) {
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        this.selectedActivityInternalName = selectedActivityInternalName;
        this.gpsTrackingEnabled = z4;
        this.resumeSessionDestination = c9598e;
        this.state = state;
        this.startTimeMs = j7;
        this.pauseSegments = pauseSegments;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: b */
    public final List<PauseSegment> m122066b() {
        return this.pauseSegments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getResumeSessionDestination() {
        return this.resumeSessionDestination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38098d)) {
            return false;
        }
        C38098d c38098d = (C38098d) other;
        return AbstractC22676k.m65745e(this.selectedActivityInternalName, c38098d.selectedActivityInternalName) && this.gpsTrackingEnabled == c38098d.gpsTrackingEnabled && AbstractC22676k.m65745e(this.resumeSessionDestination, c38098d.resumeSessionDestination) && this.state == c38098d.state && this.startTimeMs == c38098d.startTimeMs && AbstractC22676k.m65745e(this.pauseSegments, c38098d.pauseSegments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC38101g getState() {
        return this.state;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.selectedActivityInternalName.hashCode() * 31, 31, this.gpsTrackingEnabled);
        C9598e c9598e = this.resumeSessionDestination;
        return this.pauseSegments.hashCode() + AbstractC11266d.m30451e((this.state.hashCode() + ((iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31)) * 31, this.startTimeMs, 31);
    }

    public String toString() {
        String str = this.selectedActivityInternalName;
        boolean z4 = this.gpsTrackingEnabled;
        C9598e c9598e = this.resumeSessionDestination;
        EnumC38101g enumC38101g = this.state;
        long j7 = this.startTimeMs;
        List<PauseSegment> list = this.pauseSegments;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ActiveSession(selectedActivityInternalName=", str, ", gpsTrackingEnabled=", ", resumeSessionDestination=", z4);
        sbM73379l.append(c9598e);
        sbM73379l.append(", state=");
        sbM73379l.append(enumC38101g);
        sbM73379l.append(", startTimeMs=");
        sbM73379l.append(j7);
        sbM73379l.append(", pauseSegments=");
        sbM73379l.append(list);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
